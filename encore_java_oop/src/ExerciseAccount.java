import com.encore.bank.entity.Account;

public class ExerciseAccount {

	public static void main(String[] args) {
		Account customer = new Account();
		customer.setCustId("CUST01");
		customer.setCustName("소지섭");
		customer.setAccountNumber("1-22-333");
		customer.setBalance(100000);
		
		System.out.println("======================");
		System.out.println("고객번호 : "+customer.getCustId());
		System.out.println("고객명 : "+customer.getCustName());
		System.out.println("계좌번호 : "+customer.getAccountNumber());
		System.out.println("계좌번호 : "+customer.getBalance()+"원");
		System.out.println("======================");
		
		customer.addBalacne(10000);
		customer.subtractBalance(20000);
	}

}
