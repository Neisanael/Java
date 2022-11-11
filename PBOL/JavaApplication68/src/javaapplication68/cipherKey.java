/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication68;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/**
 *
 * @author admin
 */
public class cipherKey {
    public static void main(String[] args) {
        String a = "disavowed";
        try{
            KeyGenerator kg = KeyGenerator.getInstance("AES");
            SecretKey myAES = kg.generateKey();
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            byte[] text = a.getBytes();
            cipher.init(Cipher.ENCRYPT_MODE,myAES);
            byte[] textEnc = cipher.doFinal(text);
            cipher.init(Cipher.DECRYPT_MODE, myAES);
            byte[] textDec = cipher.doFinal(textEnc);
            System.out.println(new String(textEnc));
            System.out.println(new String(textDec));
        }catch(Exception e){
            
        }
    }
}
