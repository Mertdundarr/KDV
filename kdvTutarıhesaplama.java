import java.util.Scanner;
public class kdvTutarıhesaplama {
    public static void main(String[] args) {
        double tutar, kdvOran=0.18, kdvTutar, kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.println("Ücret Tutarını Giriniz : ");
        tutar = input.nextDouble();

        kdvTutar =  tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar : "+ tutar);
        System.out.println("KDV Oran :" + kdvOran);
        System.out.println("KDV Tutarı : " + kdvTutar);
        System.out.println("KDV'li Tutar : " + kdvliTutar);
    }
}
