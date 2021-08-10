class BankM{
	double totalAmt;
	BankM(){}
	BankM(double totalAmt){
		this.totalAmt=totalAmt;
	}
	
	double totalAmount() {
		return totalAmt;
	}
}
class Saving extends BankM
{
	double fixedDeposit;
	Saving(double fixedDeposit){
		this.fixedDeposit=fixedDeposit;
	}
	public double totalAmount() 
	{
		return (totalAmt+=fixedDeposit);		
	}
}
class Current extends BankM
{
	double cashCredit;
	Current(double cashCredit){
		this.cashCredit=cashCredit;
	}
	public double totalAmount() 
	{
		return (totalAmt+=cashCredit);		
	}
}
public class bank {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankM b = new BankM();
		Saving s=new Saving(30000);
		b.totalAmt=s.totalAmount();
		Current c=new Current(2000);
		b.totalAmt=b.totalAmt+c.totalAmount();
		
		System.out.println("total amount in the bank is Rs."+b.totalAmt);
	}

}
