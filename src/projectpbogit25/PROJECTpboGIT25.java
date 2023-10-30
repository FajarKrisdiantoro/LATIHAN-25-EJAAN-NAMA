/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectpbogit25;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class PROJECTpboGIT25 {

    /**
     * @param args the command line arguments
     */
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
