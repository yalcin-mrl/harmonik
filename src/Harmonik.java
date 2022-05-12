import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args){
        double top =0;
        Scanner sc = new Scanner(System.in);
        System.out.print("n : ");
        int n = sc.nextInt();
        for(int i  =1;i<=n;i++){
            top += 1/(double)i;
        }
        System.out.println("Top : "+ top);
    }
}
