public class AccountTest{
	public static void main(String[] args){
		Account a1 = new Account();
		a1.setId("уехЩ") ;
		a1.setBalance(1314.52);
		a1.setAnnualInterestRate(0.0031);

			String a = a1.getId() ;
			double b = a1.getBalance();
			double c = a1.getAnnualInterestRate();
			a1.withdraw(100);
		a1.withdraw(2000);
		a1.deposit(2000);
	a1.withdraw(2000);

	}

}