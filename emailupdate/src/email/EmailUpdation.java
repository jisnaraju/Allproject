package email;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class EmailUpdation {

	public static void main(String[] args) throws IOException {
		 String name;
		 String address;
		 String contactNumber;
		 String email;
		 String proofType;
		 String proofID;
		 String a,b;
		 String newmail;
		 int[] arr = new int[25];
		 String[] arr1 = new String[25];
		 int k=0,l=0,regNo=0;
		 do {
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 Customer obj=new Customer();
		 System.out.println("Registration");
		 System.out.println();
		 System.out.println("Enter your name");
		 name=br.readLine();
		 obj.setName(name);
		 arr1[l]=obj.getName();
		 l++;
		 regNo++;
			arr[k]=regNo;
			k++;
		 System.out.println("Enter your address");
	     address=br.readLine();
	     obj.setAddress(address);
	     System.out.println("Enter your contactNumber");
		 contactNumber=br.readLine();
		 obj.setContactNumber(contactNumber);
		 System.out.println("Enter your email");
		 email=br.readLine();
		 obj.setEmail(email);
		 System.out.println("Enter your proofTyp");
		 proofType=br.readLine();
		 obj.setProofType(proofType);
		 System.out.println("Enter your proofID");
		 proofID=br.readLine();
		 obj.setProofID(proofID);
		 obj.details();
		 System.out.println("Do you want to update your email?(y/n)?");
		 a=br.readLine();
		 if(a.equals("y"))
			{
				System.out.println("Update Email:");
				System.out.println("Enter new Email id");
				newmail=br.readLine();
			    String s=obj.getEmail();
				s=newmail;
				System.out.println("Email updated");
				System.out.println("Your details are as follows");
				System.out.println("Name: "+obj.getName());
				System.out.println("Address:"+obj.getAddress());
				System.out.println("Contact Number: "+obj.getContactNumber());
				System.out.println("E-Mail ID:"+s);
				System.out.println("Proof type: "+obj.getProofType());
				System.out.println("Proof id: "+obj.getProofID());
			}
		 System.out.println("Do you want to continue registration (y/n)?");
		 b=br.readLine();
		 if(b.equals("n"))
		 {
			 System.out.println("Customers list");
			 System.out.println("The registered customers are");
			 System.out.println("Customer ID   Customer name");
			 for(int i=0;i<regNo;i++)
			 {
				 
		     System.out.println(arr[i]+"          "+arr1[i]);
			 }
			 System.out.println("Thank You");
		 }
		 
	}while(b.equals("y"));
	}
}


