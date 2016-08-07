package tr.org.lyk2016;

public class Account {
	
	private String name;
	private double balance;
	
//	begin structer account burada obje olarak geçer onun altındaki 3 satır ise metodun içidir
//	
	public Account (String name, double balance){
		this.name = name;
		if (balance > 0.0)
			this.balance = balance;
	}	
	//end structer
	
//	deposite metodu oluşturulur
	
	public void deposit(double depositAmount) {
	        if (depositAmount > 0.0)
	            balance = balance + depositAmount;
	    }
//get ve set metodları oluşturulur istenirse otomatik generate edilebilri
//	bir metodun tipi void olmadığı sürece return edilmesi gerekir
	
	    public double getBalance() {
	        return balance;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getName() {
	        return name;

	    }
	}