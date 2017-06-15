public class gradebook{
	public static void main(String[] args){
		grade gb = new grade();
		int i = 0;
		while(i<5){
		System.out.println(gb.getName(i)+ " Avg Grades:"+ gb.getAvg(i)+" Letter Grade: "+gb.getLetterGrade(gb.getAvg(i)));
		i++;
		}
	
	}
}