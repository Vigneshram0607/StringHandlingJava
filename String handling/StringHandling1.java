import java.util.Scanner;
public class StringHandling1{
	public static void main(String [] ram){
		String gmail = "@gmail.com";
		String google = "@google.com";
		String yahoo = "@yahoo.com";
		String sastra = "@sastra.ac.in";
		String facebook = "@facebook.com";
		String id;
		Scanner obj = new Scanner(System.in);
		System.out.print("ENTER ID: ");
		id = obj.nextLine();
		if(id.contains(gmail) || id.contains(google) || id.contains(yahoo) || id.contains(sastra) || id.contains(facebook) )
			System.out.println("Given id is VALID one");
		else {
		    System.out.println("INVALID");
            System.out.println("please check whether given id is in correct format");		
		}
	}
}
		
