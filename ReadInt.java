package neteasetraining;
import java.util.Scanner;
public class ReadInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0,cnt=0;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		String str="";
		in.close();
		if(a<0){
			str="fu ";
			a=-a;
		}
		while(a!=0){
			b=b*10+a%10;
			if(b==0){
				cnt++;
			}
			a=a/10;
		}
		do{
			switch(b%10)
			{
				case 0:str+="ling";break;		
				case 1:str+="yi";break;
				case 2:str+="er";break;
				case 3:str+="san";break;
				case 4:str+="si";break;
				case 5:str+="wu";break;
				case 6:str+="liu";break;
				case 7:str+="qi";break;
				case 8:str+="ba";break;
				case 9:str+="jiu";break;
			}
			b/=10;
			if(b!=0){
				str+=" ";
			}
			
		}while(b!=0);	
		for(int i=1;i<=cnt;i++)
		{
			str=str+" ling";
		}	
		System.out.print(str);

	}

}
