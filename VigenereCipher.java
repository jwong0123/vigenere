public class VigenereCipher {
    static boolean code(String encode){
        boolean a;
        if (encode.equals("decode")){
        a = false;
        }
        else a = true;
        return a;
    }
    static String vigenere(String text, String key, Boolean encode){
        String fix = "";
        text = text.toUpperCase();
        for (int i = 0, j = 0; i < text.length(); i++) {
            char x = text.charAt(i);
            if (x < 'A' || x > 'Z') continue;
            if (encode == true){
            fix += (char)((x + key.charAt(j) - 2 * 'A') % 26 + 'A');
            j = ++j % key.length();
            }
            else{
            fix += (char)((x - key.charAt(j) + 26) % 26 + 'A');
            j = ++j % key.length();
            }
        }
        return fix;
    }
    public static void main(String[] args) {
        String encode = (args[0]);
        String text = (args[1]);
        String key = (args[2]);
        System.out.println(vigenere(text, key, code(encode)));
    }

}