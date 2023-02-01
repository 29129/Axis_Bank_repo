package bankApp;

public class Account
{
	
	
	String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	public String getAdhar() {
		return Adhar;
	}
	public void setAdhar(String adhar) {
		Adhar = adhar;
	}
	public String getMinimumBalance() {
		return MinimumBalance;
	}
	public void setMinimumBalance(String minimumBalance) {
		MinimumBalance = minimumBalance;
	}
	public String getAccountNo() {
		return AccountNo;
	}
	public void setAccountNo(String accountNo) {
		AccountNo = accountNo;
	}
    private String Fname;
    private String Lname;
    private String Mobile;
    private String Adhar;
    private String AccountBalance;
    public String getAccountBalance() {
		return AccountBalance;
	}
	public void setAccountBalance(String accountBalance) {
		AccountBalance = accountBalance;
	}
	private String MinimumBalance;
    private String AccountNo;
	
}
