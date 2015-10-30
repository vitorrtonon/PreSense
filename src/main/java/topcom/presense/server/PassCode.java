package topcom.presense.server;

import java.util.Random;
import java.security.MessageDigest;

public final class PassCode {

  private final char[] symbols;

  static {
    StringBuilder sym = new StringBuilder();
    for (char c = '0'; c <= '9'; c++) sym.append(c);
    for (char c = 'a'; c <= 'z'; c++) sym.append(c);
    sym.append('@');
    sym.append('!');
    sym.append('#');
    sym.append('$');
    sym.append('%');
    sym.append('&');

    symbols = sym.toString().toCharArray();
  }
  
  private static PassCode();

  public static String generatePass(int maxSize, int minSize) {
    int len = random.nextInt(maxSize - minSize) + minSize;

    buffer = new char[len];

    for (int k = 0; k < len; k++) {
      buffer[k] = symbols[random.nextInt(symbols.length)];
    }
      
    return new String(buf);
  }

  public static String encrypticPass(String passcode) {
    /* TO-DO */ 
  }
}