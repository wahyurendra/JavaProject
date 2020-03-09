package KunciAcakJava;

import java.util.Scanner;
import java.security.SecureRandom;
public class KunciAcakJava
    {
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static String kuncikriptografis;
    private static final SecureRandom RANDOM = new SecureRandom();
    private static int keylength;
    
    public static void KunciAcakJava()
    {
        keylength = 0;
        kuncikriptografis = null;  
    }

    public int buatkunci(int seed)
    {
        keylength = seed;
        return keylength;
    }

    public String kuncikriptografi()
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < keylength ; ++i) {
            sb.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
        }
        kuncikriptografis = sb.toString();
        return kuncikriptografis;
    }
    
    public void cetak()
    {
        System.out.println(kuncikriptografis);
    }
}


