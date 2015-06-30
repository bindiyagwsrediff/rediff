
public class BankAccount {

	int amt;
	int bal=100;
	
	public void depositCash(int amt){
	System.out.println("Deposited amt is : "+ amt);
	bal=bal+amt;
	System.out.println("Your Account bal after deposit is : "+ bal);
	}
		
	
	public void withdrawCash(int amt){
		
		System.out.println("withdrawal amt is : "+ amt);
		if(amt>bal){
			System.out.println("Your account doesnt have suff bal");	
		}
		else{
			bal=bal-amt;
			System.out.println("Your Account bal after withdrawal is : "+ bal);	
			
		}
		
	}
	
	public int getBalance(){
		System.out.println("Your Account bal is : "+ bal);
		return bal;
	}
	
	
	
}
