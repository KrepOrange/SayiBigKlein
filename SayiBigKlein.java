import java.util.Scanner;

public class SayiBigKlein {
    public static void main(String[] args) {
        //variable
        double num1, num2, num3;
        int sira;
        Scanner input = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz: ");
        num1 = input.nextDouble();
        System.out.print("2. sayıyı giriniz: ");
        num2 = input.nextDouble();
        System.out.print("3. sayıyı giriniz: ");
        num3 = input.nextDouble();

        System.out.print("Girdiğiniz sayıların büyükten küçüğe sıralanması için '1' küçükten büyüğe sıralanması için '2' giriniz: ");
        sira = input.nextInt();

        switch (sira){
            case 1:
                if (num1 >= num2){ // *1 > 2 || 1 == 2
                    if (num2 >= num3) // *2 > 3 || 2 == 3
                        System.out.println(num1 + "/" + num2 + "/" + num3);
                    else if(num1 == num2) // *3 > 2 && 1 == 2
                        System.out.println(num3 + "/" + num1 + "/" + num2);
                    else if(num1 > num3) // *(1 > 2 && 3 > 2) && (1 > 3)
                        System.out.println(num1 + "/" + num3 + "/" + num2);
                    else // *(1 > 2 && 3 > 2) && (3 > 1)
                        System.out.println(num3 + "/" + num1 + "/" + num2);
                }
                else{ // *2 > 1
                    if(num2 == num3) // *2 == 3
                        System.out.println(num2 + "/" + num3 + "/" + num1);
                    else if(num2 > num3 && num1 >= num3) // *(2 > 1 && 2 > 3) && (1 >= 3)
                        System.out.println(num2 + "/" + num1 + "/" + num3);
                    else if(num2 > num3) // *(2 > 1 && 2 > 3) && (3 > 1)
                        System.out.println(num2 + "/" + num3 + "/" + num1);
                    else // *(2 > 1 && 3 > 2)
                        System.out.println(num3 + "/" + num2 + "/" + num1);
                }
                break;
            case 2:
                if (num1 >= num2){ // *1 > 2 || 1 == 2
                    if (num2 >= num3) // *2 > 3 || 2 == 3
                        System.out.println(num3 + "/" + num2 + "/" + num1);
                    else if(num1 == num2) // *3 > 2 && 1 == 2
                        System.out.println(num2 + "/" + num1 + "/" + num3);
                    else if(num1 > num3) // *(1 > 2 && 3 > 2) && (1 > 3)
                        System.out.println(num2 + "/" + num3 + "/" + num1);
                    else // *(1 > 2 && 3 > 2) && (3 > 1)
                        System.out.println(num2 + "/" + num1 + "/" + num3);
                }
                else{ // *2 > 1
                    if(num2 == num3) // *2 == 3
                        System.out.println(num1 + "/" + num3 + "/" + num2);
                    else if(num2 > num3 && num1 >= num3) // *(2 > 1 && 2 > 3) && (1 >= 3)
                        System.out.println(num3 + "/" + num1 + "/" + num2);
                    else if(num2 > num3) // *(2 > 1 && 2 > 3) && (3 > 1)
                        System.out.println(num1 + "/" + num3 + "/" + num2);
                    else // *(2 > 1 && 3 > 2)
                        System.out.println(num1 + "/" + num2 + "/" + num3);
                }
                break;
            default:
                System.out.println("Hatalı giriş yaptınız, tekrar deneyiniz!");
        }
    }
}
