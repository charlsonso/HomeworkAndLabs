import java.util.*;

public class SocSecProcessor{
	public static Boolean isValid(String ssn) throws SocSecException {
		
			
			if (ssn.length()!=11){
				throw new SocSecException(", wrong number of characters");
			}
			else if(ssn.charAt(4)=='-'||ssn.charAt(7)=='-'){
				throw new SocSecException(", dashes are in the wrong place");
			}
			else{
				for(int i=0; i<ssn.length();i++){
					if(Character.isLetter(ssn.charAt(i))){
						throw new SocSecException(", non digit");
					}

				}
			}

			

			return true;
			
		

		//dashes at wrong position
		

		//check for character that is not a digit

	}
	public static void main(String[] args)  {
		Boolean con = true;
		Scanner sc = new Scanner(System.in);
		while(con){
			System.out.print("Name? ");
			String name = sc.nextLine();
			System.out.print("SSN? ");
			String ss = sc.nextLine();
			try{	
				Boolean r = isValid(ss);
				if (r==true){
					System.out.println(name+" "+ss+" is valid");
				}


			}
			catch(SocSecException e){
				System.out.println(e.getMessage());
			}

			
			System.out.println("Continue? (y/n)");
			char t = sc.nextLine().charAt(0);
			if(t=='n'){
				con = false;
			}

		}

	}
}