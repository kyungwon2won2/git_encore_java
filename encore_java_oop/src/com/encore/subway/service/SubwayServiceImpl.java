package com.encore.subway.service;

import com.enroe.subway.domain.CardDTO;
import com.enroe.subway.domain.StationDTO;

//abstract 클래스는 객체 생성x, - 명세를 위한 용도로 생성
public class SubwayServiceImpl implements SubwayService{
	
	public static final int BASIC_FEE = 800;
	
	@Override
	public int chargeFree(CardDTO card, StationDTO start, StationDTO end) {
		int fee = 0;
		
		int distance = getDistance(start, end);
		if(distance<=12) {
			fee = BASIC_FEE;
		}else if(12<distance && distance<=42) {
			if((distance-12)%6==0) {
				fee = BASIC_FEE + ((distance-12)/6)*100;
			}else {
				fee = BASIC_FEE + ((distance-12)/6+1)*100;
			}
		}else if(distance>42){
			if((distance-42)%12==0) {
				fee = BASIC_FEE + 500 + ((distance-42)/12)*100;
			}else {
				fee = BASIC_FEE + 500 +((distance-42)/12+1)*100;
			}
		}
		//요금 차감
		if(subtractBalance(card, fee)) {
			return fee;
		}else {
			return -1;
		}
	}

	@Override
	public boolean subtractBalance(CardDTO card, int amount) {
		int currntBalance = card.getBalance()-amount;
		if(currntBalance>=0) {
			card.setBalance(currntBalance);
			return true;
		}else {
			return false;
		}
	}

	@Override
	public int getDistance(StationDTO start, StationDTO end) {
		int distance = end.getLocation() - start.getLocation();
		return Math.abs(distance);
	}
	
	
}
