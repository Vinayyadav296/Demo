package encapsulation;
class Bank{
	private int acc_no;
	private String name,email;
	private float amt;
	public int getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getAmt() {
		return amt;
	}
	public void setAmt(float amt) {
		this.amt = amt;
	}
}
public class TestEncapsulation {

	public static void main(String[] args) {
		Bank b=new Bank();
		b.setAcc_no(140331169);
		b.setName("vinay");
		b.setEmail("gmail");
		b.setAmt(10000000);
   System.out.println(b.getAcc_no()+" "+b.getName()+" "+b.getEmail()+" "+b.getAmt());     
	}

}
