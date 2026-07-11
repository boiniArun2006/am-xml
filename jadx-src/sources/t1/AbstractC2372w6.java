package t1;

/* JADX INFO: renamed from: t1.w6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class AbstractC2372w6 {
    public static boolean nr(char c2) {
        return c2 >= 'A' && c2 <= 'Z';
    }

    private static int rl(char c2) {
        return (char) ((c2 | ' ') - 97);
    }

    public static boolean t(char c2) {
        return c2 >= 'a' && c2 <= 'z';
    }

    public static String J2(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            if (t(str.charAt(i2))) {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c2 = charArray[i2];
                    if (t(c2)) {
                        charArray[i2] = (char) (c2 ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    public static String O(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            if (nr(str.charAt(i2))) {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c2 = charArray[i2];
                    if (nr(c2)) {
                        charArray[i2] = (char) (c2 ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    public static boolean n(CharSequence charSequence, CharSequence charSequence2) {
        int iRl;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = charSequence.charAt(i2);
            char cCharAt2 = charSequence2.charAt(i2);
            if (cCharAt != cCharAt2 && ((iRl = rl(cCharAt)) >= 26 || iRl != rl(cCharAt2))) {
                return false;
            }
        }
        return true;
    }
}
