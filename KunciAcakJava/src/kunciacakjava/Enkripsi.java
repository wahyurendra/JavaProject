package KunciAcakJava;

public class Enkripsi {
    private static final String Abjad ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String kunci=" ";
    String terang;
    String cipher;
    
    public Enkripsi(){
        terang = " ";
        cipher = " "; 
    }
    public String doEnkripsi(String terang, String kunci){
    int output;
    StringBuilder sb = new StringBuilder();
    for(int i=0;i<terang.length();i++){
    output = (Abjad.indexOf(terang.charAt(i))+Abjad.indexOf(kunci.charAt(i%kunci.length()))+1)%26;
        sb.append(Abjad.charAt(output));
    }
    return sb.toString();
    }
    
    
//    
//    public String doDekripsi(String hasil, String kunci){
//    int output;
//    StringBuilder sb1 = new StringBuilder();
//    for(int i=0;i<hasil.length();i++){
//    output = (Abjad.indexOf(hasil.charAt(i))-Abjad.indexOf(kunci.charAt(i%kunci.length()))-1)%26;
//        sb1.append(Abjad.charAt(output));
//    }
//    return sb1.toString();
//    }
   
    
   
}
