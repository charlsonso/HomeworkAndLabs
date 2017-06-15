import java.util.*;

public class grade{
	
	private String[] name = new String[5];
	private String[] grade= new String[5];
	private double[] s1 = new double[4];
	private double[] s2 = new double[4];
	private double[] s3 = new double[4];
	private double[] s4 = new double[4];
	private double[] s5 = new double[4];
	grade(){
		Scanner sc = new Scanner(System.in);
		int j = 1;
		while(j<6){
		System.out.println("Enter Name for Sudent" + j);
		name[j-1]=sc.nextLine();
		j++;
		}

		System.out.println("Enter grades for student 1");
		for (int i=0; i<4;i++){
			System.out.println("Test "+(i+1)+":");
			s1[i]=Double.parseDouble(sc.nextLine());
		}
		System.out.println("Enter grades for student 2");
		for (int i=0; i<4;i++){
			System.out.println("Test "+(i+1)+":");
			s2[i]=Double.parseDouble(sc.nextLine());
		}
		System.out.println("Enter grades for student 3");
		for (int i=0; i<4;i++){
			System.out.println("Test "+(i+1)+":");
			s3[i]=Double.parseDouble(sc.nextLine());
		}
		System.out.println("Enter grades for student 4");
		for (int i=0; i<4;i++){
			System.out.println("Test "+(i+1)+":");
			s4[i]=Double.parseDouble(sc.nextLine());
		}
		System.out.println("Enter grades for student 5");
		for (int i=0; i<4;i++){
			System.out.println("Test "+(i+1)+":");
			s5[i]=Double.parseDouble(sc.nextLine());
		}
	}


	public String getName(int a){
		String j=name[a];
		return j;
	}

	public double getAvg(int a){
		double total = 0;
		switch(a){
			case 0: total = s1[0]+s1[1]+s1[2]+s1[3];
					return total/4;
			case 1: total = s2[0]+s2[1]+s2[2]+s2[3];
					return total/4;
			case 2: total = s3[0]+s3[1]+s3[2]+s3[3];
					return total/4;
			case 3: total = s4[0]+s4[1]+s4[2]+s4[3];
					return total/4;
			case 4: total = s5[0]+s5[1]+s5[2]+s5[3];
					return total/4;
					
			default: return total;
				
		}
	}

	public char getLetterGrade(double a){
		if (a>90){
			return 'A';
		}
		else if (a>80){
			return 'B';
		}
		else if (a>70){
			return 'C';
		}
		else if (a>60){
			return 'D';
		}
		else{
			return 'F';
		}
	}


	
}



