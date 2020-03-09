/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasikriptografi;

import java.util.Scanner;



/**
 *
 * @author lol
 */
public class AplikasiKriptografi {

    /**
     * @param args the command line arguments
     */
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static String kunci;
    private static String message;
    private String enkripsi;
    
     
    public static void main(String[] args) {
     Scanner myObj = new Scanner(System.in);  
     String message2 = myObj.nextLine();
     String kunci2 = myObj.nextLine();
     //kunci = kunci2;
     //message = message2;
     char[] kunci=kunci2.toCharArray();
     char[] message=message2.toCharArray();
     String hasil;
     StringBuilder sb = new StringBuilder();
     for (int i = 0; i < message2.length(); ++i) {
            sb.append(enkrip(kunci2, message2));//ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
        }
     hasil=sb.toString();
     //System.out.println(sb.toString());
     //for (int i = 0; i < message0.length(); ++i){
       //  enkrip(kunci.charAt(i), message.charAt(i));
     //}
     //hasil = enkrip(kunci, message);
     System.out.println(hasil);
     
        // TODO code application logic here
        
    }
    
    //public static String kunci (String kunci2){
       
        //kunci1 = kunci2;
      //  return kunci1;
    //}
    
    //public static String terang (String terang1){
      //  message = terang1;
        //return message;
    //}
    
    public static char enkrip (String kunci2, String message1){
        int output;
        
        char[] kunci3 = kunci2.toCharArray();
        char[] message2= message1.toCharArray();
        
        output = (((ALPHABET.indexOf(kunci3[0])+ALPHABET.indexOf(message2[0]))+1)%26);
        //System.out.println(output);
        //System.out.println(ALPHABET.charAt(output));
        return ALPHABET.charAt(output);
    }
    
    
}
