package topcom.presense.server;

 
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class PassCode {

    private char[] symbols;

    public PassCode() {
        StringBuilder sym = new StringBuilder();
        sym.append("!"); //33
        for (char c = 35; c <= 38; c++) sym.append(c);
        for (char c = 40; c <= 126; c++) sym.append(c);
        symbols = sym.toString().toCharArray();
    }

    public String generatePass(int minSize, int maxSize) {
        Random rand = new Random();
        int len = rand.nextInt(maxSize - minSize) + minSize;

        char[] buffer = new char[len];

        for (int k = 0; k < len; k++) {
            buffer[k] = symbols[rand.nextInt(symbols.length)];
        }

        return new String(buffer);
    }

    /* Encryption function credited to http://howtodoinjava.com/ */
    public String encryptPass(String passcode) {
        
        String encPass = null;
        try {
            String salt = this.getSalt();
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            md.update(salt.getBytes());
            byte[] bytes = md.digest(passcode.getBytes());
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < bytes.length ; i++) { 
                sb.append(Integer.toString((bytes[i] & 0xff) 
                                                     + 0x100, 16).substring(1));
            } 
            encPass = sb.toString();
        }
        catch (NoSuchAlgorithmException e) {
            System.err.println("Encryptation error: ");
            e.printStackTrace();
        }
        return encPass;
    }

    private static String getSalt() throws NoSuchAlgorithmException {
        //Always use a SecureRandom generator
        SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
        //Create array for salt
        byte[] salt = new byte[16];
        //Get a random salt
        sr.nextBytes(salt);
        //return salt
        return salt.toString();
    }
}
