import java.util.Scanner;

public class LatihanMandiri203 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        byte JenisBuku, JumlahBuku;
        double JumlahDiskon = 0;
        double Harga = 100;

        System.out.println("Jenis Buku 1 = Kamus ");
        System.out.println("Jenis Buku 2 = Novel ");
        System.out.println("Jenis Buku 1 = JenisLain ");

        System.out.println("JenisBuku");
        JenisBuku = input.nextByte();

        System.out.println("JumlahBuku");
        JumlahBuku = input.nextByte();

        
    }
}