package startdate;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Startdate {

	public static void main(String[] args) throws IOException {
		 String name;
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
		 int date;
		 String a,b,room;
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
		 System.out.println("Do you want to book a room (y/n)?");
		 room=br.readLine();
		 if(room.equals("y"))
		 {
			 System.out.println("Booking");
			 System.out.println("AC/non-AC(AC/nAC)");
			 ac=br.readLine();
			 System.out.println("Cot(Single/Double)");
			 cot=br.readLine();
			 System.out.println("With cable connection/without cable connection(C/nC)");
			 cable=br.readLine();
			 System.out.println("Wi-Fi needed or not(W/nW)");
			 wifi=br.readLine();
			 System.out.println("Laundry service needed or not(L/nL)");
			 laundry=br.readLine();
			 System.out.println("Enter the date of booking");
			 date=Integer.parseInt(br.readLine());
			 book(ac,cot,cable,wifi,laundry,date);
			 
			 
			 
		 }
			 
		
		 

}
	}
}
