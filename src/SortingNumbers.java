import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Kaç Sayıyı Sıralamak İstersiniz?");

            int[] NumberArr = new int[scanner.nextInt()];

            System.out.println("Sıralanacak Sayıları Tuşlayınız:");

            for (int i = 0; i < NumberArr.length; i++) {
                System.out.print("Sayı " + (i + 1) + ": ");
                NumberArr[i] = scanner.nextInt(); // Kullanıcıdan sayı alınarak diziye eklendi
            }
            scanner.close();
            Arrays.sort(NumberArr); //Araştırmalar üzerine en hızlı sıralama algoritaması Javanın default olarak kullanıma sunduğu sort fonksiyonu.
            //Quick Sort algoritmalarından bile daha hızlı olduğundan dolayı bunu tercih ettim.

            System.out.print("Sırasıyla sayılar: \n"+ "[");

            for (int j : NumberArr) {       //sıralanan sayılar ekrana basılıyor.
                System.out.print(j + ", ");
            }
            System.out.print("]");
        }
        catch (Exception e){
            System.out.println("Bir Hata Oluştu, Hata Mesajı: " + "\u001B[33m" + e + "\u001B[0m");
        }
    }
}