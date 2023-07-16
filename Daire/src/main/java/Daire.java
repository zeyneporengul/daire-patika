import java.util.Scanner;
public class Daire {
    public static void main(String[] args) {
        double pi=3.14, yaricap, alan, cevre, aci, dilimAlan;
        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçap değerini giriniz: ");
        yaricap = input.nextDouble();

        alan = pi * yaricap * yaricap;
        System.out.println("Alan: " + alan);
        cevre = 2 * pi * yaricap;
        System.out.println("Çevre: " + cevre);

        System.out.print("Merkez açı ölçüsünü giriniz: ");
        aci = input.nextDouble();
        dilimAlan = (alan*aci)/360;
        System.out.println("Daire diliminin alanı: " + dilimAlan);
    }
}
