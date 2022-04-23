package Assignnments;

import java.util.Scanner;

public class Gian {
	static boolean EqualOrNot(int h1, int h2, int v1,int v2){
		if(v2>v1&&(h1-h2)%(v2-v1)==0){
		  return true;
		}
		return false;
		}

	public static void main(String[] args) {
     int H1,H2,V1,V2;
     System.out.println("Enter the values:");
     Scanner sc=new Scanner(System.in) ;
     H1=sc.nextInt();
     H2=sc.nextInt();
     V1=sc.nextInt();
     V2=sc.nextInt();
     System.out.println(EqualOrNot(H1,H2,V1,V2));
    	 
     
	}

}
