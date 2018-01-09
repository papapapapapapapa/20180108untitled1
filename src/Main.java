import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scn=new Scanner(System.in);
        double v1=scn.nextDouble();
        double n=scn.nextInt();
        System.out.println(Math.round(v1*Math.pow(10,n))/Math.pow(10f,n));
    }
}
