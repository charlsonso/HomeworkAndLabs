import java.util.*;
import java.io.*;

public class decode{
	public static void main(String[] args)throws IOException{
		String filename = "secret.txt";
		BufferedReader reader = new BufferedReader( new FileReader(filename));
		String temp="";
		temp=reader.readLine();
		String[] butters = temp.split(" ");
		//how many multiples of 5 in string
		int j= butters.length/5;
		//save first letters here
		StringBuilder k =new StringBuilder("");
		
		for (int i =0; i<j;i++){
		char l = butters[i*5].charAt(0);
		l = Character.toUpperCase(l);
		k.insert(i,l);


		}
		System.out.println(k);
	}
}