package startdate;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Customer {
	private String name;
	String address;
	 String contactNumber;
	 String email;
	 String proofType;
	 String proofID;
	 String ac;
	 String cot;
	 String cable;
	 String wifi;
	 String laundry;
	 int date,total;
	 int[] arr = new int[25];
	 String[] arr1 = new String[25];
	 int regNo=0;
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 
	 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	 public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	 public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProofType() {
		return proofType;
	}
	public void setProofType(String proofType) {
		this.proofType = proofType;
	}
	public String getProofID() {
		return proofID;
	}
	public void setProofID(String proofID) {
		this.proofID = proofID;
	}
	void details()
	{ 
		regNo++;
		System.out.println("Thank you for registering. Your id is "+regNo);
	}
	void book(String ac,String cot,String cable,String wifi,String laundry,int date )
	{
		this.ac=ac;
		this.cot=cot;
		this.cable=cable;
		this.wifi=wifi;
		this.laundry=laundry;
		this.date=date;
		if(this.ac.equals("AC"))
			total=total+1000;
		
		else if(this.ac.equals("nAC"))
			total=total+750;
		 if(this.cot.equals("Double"))
			total=total+350;
		else if(this.cot.equals("Single"))
			total=total+0;
		 if(this.cable.equals("C"))
			total=total+50;
		else if(getCable().equals("nC"))
			total=total+0;
		 if(getWifi().equals("W"))
			total=total+200;
		else if(getWifi().equals("nW"))
			total=total+0;
		if(getLaundry().equals("L"))
			total=total+100;
		else if(getLaundry().equals("nL"))
			total=total+0;
		 System.out.println("The total charge is Rs."+total);
		 System.out.println("The services chosen are");
		// System.out.println(getAc()+"\n"+getCot()+" cot"+"\n"+getCable()+"\n"+getWifi()+"\n"+getLaundry());
		if(getAc().equals("AC") && getCot().equals("Double") ) 
			System.out.println("Double cot AC room");
		else if(getAc().equals("AC") && getCot().equals("Single") )
			System.out.println("Single cot AC room");
		else if(getAc().equals("nAC") && getCot().equals("Double") ) 
			System.out.println("Double cot nAC room");
		else if(getAc().equals("nAC") && getCot().equals("Single") )
			System.out.println("Single cot nAC room");
		 if(getCable().equals("C"))
			System.out.println("Cable connection enabled");
		else if(getCable().equals("nC"))
			System.out.println("Cable connection not enabled");
		 if(getWifi().equals("W"))
			System.out.println("Wi-Fi enabled");
		 else if(getWifi().equals("nW"))
			System.out.println("Wi-Fi not enabled");
		 if(getLaundry().equals("L"))
			System.out.println("with laundry service");
		else if(getLaundry().equals("nL"))
			System.out.println("without laundry service");
		
		
		
		
	}
		/*System.out.println(getName());
		
		System.out.println(getAddress());
		System.out.println(getContactNumber());
		System.out.println(getEmail());
		System.out.println(getProofType());
		System.out.println(getProofID());
		*/
		
}
