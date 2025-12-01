package hafta08;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex_giris {
    //Regular Expressions
    //REGEX

    public static void main(String[] args) {
        String s = "dal sarkar kartal kalkar, kartal kalkar dal sarkar ars sar rsa";


        Pattern p = Pattern.compile("[sar]{3}");  //aranan örüntü/iz
        Matcher m = p.matcher(s);  //aranacak metin ve örüntünün karşılaştırılması
        //     "s" sadece s harfini bulur
        //     "\\s" ise space yan boşluk sayısını bulur
        int sayac = 0;

        while(m.find()) sayac++;

        System.out.println(sayac);

    }


}
