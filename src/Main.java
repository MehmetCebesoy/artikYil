import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil=0;
        System.out.println("Bir yıl giriniz");
        yil = input.nextInt();
        boolean a = false;
        while (a == false) {
            if (yil % 4 == 0) {
                a = true;
                System.out.println("Artık yıl girdiniz");}
               else{ System.out.println("Artık olmaya yıl girdiniz,Bir yıl giriniz");
                yil = input.nextInt();}
            }


        }
    }
