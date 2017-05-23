import java.util.Scanner;

public class mail {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input in >");
		String input = scanner.nextLine();
		String m=find(input);
		System.out.println(m);
	}
	public static String find(String s){
		String b1="',.!?";
		String b2="abcABC";
		String b3="defDEF";
		String b4="ghiGHI";
		String b5="jklJKL";
		String b6="mnoMNO";
		String b7="pqrsPQRS";
		String b8="tuvTUV";
		String b9="wxyzWXYZ";
		String[] list={b1,b2,b3,b4,b5,b6,b7,b8,b9};
		
		int count=0;
		String result1="";
		String result2="";
		for(int i=0;i<s.length()-1;i++){
			String temp=String.valueOf(s.charAt(i));
			int num=Integer.parseInt(temp);
			
			if(s.charAt(i)==s.charAt(i+1)){
					count++;
			}
			else{
			    if(s.charAt(i)=='0'){
				
				for(int a=0;a<count;a++){
				    result1+=" ";
				}
				count=0;
			    }
			   else {
			       	result1 +=String.valueOf(list[num-1].charAt(count));
				count=0;
			    }
			}
		}
		//	if(s.charAt(s.length()-1)!=s.charAt(s.length()-2)){
		if(s.charAt(s.length()-1)!='0'){
		    int x=Character.getNumericValue(s.charAt(s.length()-1));
		    result2+=String.valueOf(list[x-1].charAt(count));
		}
		else{
		    for(int a=0;a<count;a++){
			result2+=" ";
		    }
		}
			    //	}
			    /*	else{
			    int x=Character.getNumericValue(s.charAt(s.length()-1));
			    result2+=String.valueOf(list[x-1].charAt(count));
			   
			    }*/
			
		return result1+result2;
	}
}
