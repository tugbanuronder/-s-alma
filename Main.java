import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner input=new Scanner(System.in);
       int sayi,us, i;
       double total=1;

        System.out.print("Üssünü almak istediğiniz sayıyı giriniz:");
        sayi=input.nextInt();
        System.out.print("Üssü giriniz:");
        us=input.nextInt();

        if(us >=0){
            for(i=1 ; i <=us ; i++){
                total *=sayi;
            }
            System.out.println("Üssü : " + total);
        }
        else {
            for(i=1 ; i <= -us ; i++){
                total *=sayi;
            }
            System.out.println("Üssü : " + 1/total);
        }


    }

}