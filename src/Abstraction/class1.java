package Abstraction;

public class class1 {

			public static void main(String[] args) {
				int n=12045678;
			
				String str= ""+n;
				String s="";
				for(int i=0;i<str.length();i++)	{
					
					if(str.charAt(i)-'0' ==0) {
						s+=str.substring(i);
						break;
					}
					
					if(((str.charAt(i)-'0')%2 == 0) ){
						 s+=str.charAt(i)-'0'+3;
						 continue;
					}
					else if(str.charAt(i)%2 !=0){
						 s+=str.charAt(i)-'0';
					}
					else{
						continue;
					}
					
					
				}
				
				
				System.out.println(s);
		
	}

}
