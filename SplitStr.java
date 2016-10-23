package neteasetraining;
import java.util.Scanner;
public class SplitStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] splitedStr1=new String[1];
		String[] splitedStr2=new String[100];
		Scanner in=new Scanner(System.in);
		splitedStr1=in.nextLine().split("\\.");
		in.close();
		splitedStr2=splitedStr1[0].split("\\s+");
		for(int i=0;i<splitedStr2.length-1;i++){
			System.out.print(splitedStr2[i].length()+" ");
		}
		System.out.print(splitedStr2[splitedStr2.length-1].length());
	}

}
