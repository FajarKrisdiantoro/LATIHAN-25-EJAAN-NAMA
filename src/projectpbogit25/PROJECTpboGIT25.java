/*
NAMA : FAJAR KRISDIANTORO
NIM  : 22205004
PRODI: TI REG SORE
*/
package projectpbogit25;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class PROJECTpboGIT25 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama depan anda untuk di eja: ");
        String nama = input.nextLine();
        System.out.println("Ejaan Untuk " + nama + " adalah:");
        for (int i = 0; i < nama.length(); i++) {
            char huruf = nama.charAt(i);
            int nomorHuruf = i + 1;
            
            System.out.println("Huruf ke " + nomorHuruf + " = " + huruf);
        }
    }
    
}
