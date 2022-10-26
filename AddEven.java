package pop;

import java.util.ArrayList;
import java.util.List;

public class AddEven {
public static void main(String[] args) {
	int l=101,h=151,sum=0;
	int r;
	//List<Integer> li=new ArrayList<>();
	while(l<h) {
	 if(l!=0) {
		 r=l%10;
		sum=sum+r;
		l=l/10;
	 }
	 l++;
	 
	//if(sum%2==0)
		//li.add(i);
	 }
	System.out.println(sum);
  }
}
