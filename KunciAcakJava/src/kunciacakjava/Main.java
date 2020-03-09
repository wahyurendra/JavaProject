package KunciAcakJava;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        int seed,kunci;
        String terang,chiper,kuncikripto;
        Scanner S = new Scanner(System.in);
        Enkripsi ap = new Enkripsi();
        KunciAcakJava aw = new KunciAcakJava();
        seed = S.nextInt();
        terang = S.next();
        kunci = aw.buatkunci(seed);
        kuncikripto = aw.kuncikriptografi();
        System.out.println(kuncikripto);
        chiper = ap.doEnkripsi(terang,kuncikripto);
        System.out.println(chiper);
    }
    
}
