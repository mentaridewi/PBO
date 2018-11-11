package Program;
import java.util.Scanner;

/**
 *
 * @author MENTARI DEWI
 */
public class Utama {
    
     public static void TampilData() {    
    }
    
    public static void InputData() {
        Program.Mahasiswa mahasiswa;
        mahasiswa = new Program.Mahasiswa();
        Scanner s = new Scanner(System.in);
        int j=1;
        for (int i=0; i<j; i++){
        System.out.println("Data ke-"+j);
        System.out.print("Nim : ");
        String nims = s.nextLine();
        System.out.print("Nama: ");
        String nama = s.nextLine();
        System.out.print("IPK : ");
        String ipk = s.nextLine();
        mahasiswa.isiData(nims, nama, ipk);}
    }
    public static void main(String[] args) {
        Program.Mahasiswa mhs =  new Program.Mahasiswa();
        int pil = 0;
        do {
            Scanner s = new Scanner(System.in);
            System.out.println("");
            System.out.println("Class Object");
            System.out.println("==========================");
            System.out.println("1. Input Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Sorting Data");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            pil = s.nextInt();
            switch (pil) {
                case 1:
                    InputData();
                    break;
                case 2:
                    mhs.tampilData();
                    break;
                case 3:
                    System.out.println("1. Berdasarkan Nim");
                    System.out.println("2. Berdasarkan Nama");
                    System.out.println("3. Berdasarkan IPK");
                    System.out.print("Masukkan Pilihan: ");
                    pil = s.nextInt();
                    if (pil == 1) {
                        mhs.sortNim();
                    } else if (pil == 2) {
                        mhs.sortNama();
                    } else if (pil == 3) {
                        mhs.sortIpk();
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default: 
                System.out.println("Pilihan yang anda masukkan Tidak ada");
            }        
           
        } while (pil != 5);
    }
       
}
