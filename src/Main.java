import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /** Koşullar :

        Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
        Ödev
        Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.
*/
        Scanner input=new Scanner(System.in);
        System.out.print("Sıcaklık değerini giriniz:");
        int sicaklik=input.nextInt();

        if (sicaklik<5){
            System.out.println("Kayak yapabilirsiniz.");
        }
        else if (sicaklik>=5 && sicaklik<10){
            System.out.println("Sinema yapabilirsiniz.");
        }
        else if (sicaklik>=10 && sicaklik<=15){
            System.out.println("Sinema ve Piknik yapabilirsiniz.");
        }
        else if (sicaklik>=15 && sicaklik<=25){
            System.out.println("Piknik yapabilirsiniz.");
        }
        else {
            System.out.println("Yüzmeye gidebilirsiniz");
        }

    }
}