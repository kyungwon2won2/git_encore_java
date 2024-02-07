package com.encore.subway.view;

import java.util.Scanner;

import com.encore.subway.service.SubwayService;
import com.encore.subway.service.SubwayServiceImpl;
import com.enroe.subway.domain.CardDTO;
import com.enroe.subway.domain.StationDTO;

public class SubwayView {
	
	private SubwayService service;
	private StationDTO[] stations;
	private CardDTO card;
	
	public SubwayView() {
		stations = new StationDTO[] {
				new StationDTO("A1105", "합정", 0),
				new StationDTO("A1106", "홍대입구", 10),
				new StationDTO("A1107", "신촌", 15),
				new StationDTO("A1108", "이대", 20),
				new StationDTO("A1109", "아현", 30),
				new StationDTO("A1110", "충정로", 35),
				new StationDTO("A1111", "시청", 40),
				new StationDTO("A1112", "을지로입구", 50),
				new StationDTO("A1113", "을지로3가", 58),
				new StationDTO("A1114", "을지로4가", 67),
				new StationDTO("A1115", "동대문운동장", 77),
		};
		
		service = new SubwayServiceImpl();
	}
	
	public void menu() {
		System.out.print("[교통카드에 충전할 금액을 입력하세요] : ");
		card = new CardDTO(getUserInput());
		printStationList(stations);
		//
		StationDTO startStation = stations[selectNumber(stations, "승차")];
		if(card.getBalance()<800) {
			printFail();
		}else {
			System.out.println();
			printStationList(stations);
			StationDTO endStation = stations[selectNumber(stations, "하차")];
			
			int chargeFee = service.chargeFree(card, startStation, endStation);
			if(chargeFee>=0){
				printSuccess(card, startStation, endStation, chargeFee);
			}else {
				printFail();
			}
		}
	}
	
	
	
	
	//역 정보 출력
	public void printStationList(StationDTO[] stations) {
		System.out.println("================================");
		for(int i=0; i<stations.length; i++) {
			System.out.println((i+1)+". "+stations[i].getName());
		}
		System.out.println("================================");
	}
	
	/*
	 @ params card 	: 소유카드
	 @ params start : 출발역
	 @ params end 	: 도착역
	 @ params chargedFee : 요금
	 요금정산 성공 메시지를 출력
	 */
	public void printSuccess(CardDTO card, StationDTO start, StationDTO end, int chargeFee) {
		System.out.println("정상 처리되었습니다.");
		System.out.println("승차역은 "+start.getName()+"역이고, 하차역은 "+end.getName()+"역입니다.");
		System.out.println("요금은 "+chargeFee+"원이며, 잔액은 "+card.getBalance()+"원 입니다.");
	}
	
	// 요금정산 실패 메시지 출력
	public void printFail() {
		System.out.println("잔액부족입니다.");
		System.out.println("직원에게 문의하세요.");
	}
	
	/*
	역 선택 메서드
	@ params staions : 역 정보를 담는 배열
	@ params msg	 : 출력 메시지
	*/
	public int selectNumber(StationDTO[] stations, String msg) {
		System.out.print(msg+"역을 선택하세요. 1~"+stations.length+" : ");
		int stationNum = getUserInput();
		return stationNum-1;
	}
	
	/**
	 Scanner 이용해서 입력받은 값을 처리하는 메서드
	 */
	public int getUserInput() {
		Scanner scan = new Scanner(System.in);
		
		return scan.nextInt();
	}
	
}
