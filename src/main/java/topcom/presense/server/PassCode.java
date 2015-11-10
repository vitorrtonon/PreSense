package topcom.presense.server;

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

    public String generatePass(int maxSize, int minSize) {
        Random rand = new Random();
        int len = rand.nextInt(maxSize - minSize) + minSize;

        char[] buffer = new char[len];

        for (int k = 0; k < len; k++) {
            buffer[k] = symbols[rand.nextInt(symbols.length)];
        }

        return new String(buffer);
    }

    public String encryptPass(String passcode) {
        /* TO-DO */
        return passcode;
    }
}