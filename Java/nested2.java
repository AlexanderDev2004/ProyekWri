import java.util.Scanner;
public class nested2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kategori;
        int penghasilan;
        double pajak = 0;
        int gajibersih;

        System.out.println("Masukan Kategori : ");
        kategori = sc.nextLine();
        System.out.println("Masukan penghasilan : ");
        penghasilan = sc.nextLine();

        if (kategori.equalsIgnoreCase("Pekerja")) {
              if (penghasilan <= 2000000 )
              pajak = 0.1;  
            } else if (penghasilan <= 3000000 ){
                pajak = 0.15;
            }
            else {
                pajak = 0.15;
                gajibersih = (int) (penghasilan -(pajak *penghasilan));
                System.out.println("Penghasil bersih : " + gajibersih);
            } else if (kategori.equalsIgnoreCase("Pebisnis")){
                if (penghasilan < 25000000);
                pajak = 0.15;
            else if (penghasilan < 35000000);
                pajak = 0.2;
            
            else {
                pajak = 0.25;
                gajibersih = (int) (penghasilan-(pajak * penghasilan));
                System.out.println("pengahsil bersih : " + gajibersih);
            } else {
                System.out.println("kategori salah");
            }

            
            

        }
    }
}