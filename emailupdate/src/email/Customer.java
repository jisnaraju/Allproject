package email;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Customer {
	private String name;
	String address;
	 String contactNumber;
	 String email;
	 String proofType;
	 String proofID;
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
		System.out.println(getName());
		
		System.out.println(getAddress());
		System.out.println(getContactNumber());
		System.out.println(getEmail());
		System.out.println(getProofType());
		System.out.println(getProofID());
		}
		
}
