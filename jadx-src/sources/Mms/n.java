package Mms;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class n {
    public static final String t(byte b2) {
        return b2 == 1 ? "quotation mark '\"'" : b2 == 2 ? "string escape sequence '\\'" : b2 == 4 ? "comma ','" : b2 == 5 ? "colon ':'" : b2 == 6 ? "start of the object '{'" : b2 == 7 ? "end of the object '}'" : b2 == 8 ? "start of the array '['" : b2 == 9 ? "end of the array ']'" : b2 == 10 ? "end of the input" : b2 == 127 ? "invalid token" : "valid token";
    }

    public static final byte n(char c2) {
        if (c2 < '~') {
            return qz.f6735t[c2];
        }
        return (byte) 0;
    }

    public static final char rl(int i2) {
        if (i2 < 117) {
            return qz.rl[i2];
        }
        return (char) 0;
    }
}
