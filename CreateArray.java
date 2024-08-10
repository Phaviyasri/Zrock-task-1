import java.util.Scanner;

public class CreateArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int s=sc.nextInt();
        int ar[] =new int[s];
        for(int i=0;i<s;i++){
            ar[i]=sc.nextInt();
        }
        for(int i:ar){
            System.out.print(i+" ");
        }
    }
}
