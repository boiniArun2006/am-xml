package t1;

/* JADX INFO: renamed from: t1.Ml, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class AbstractC2368Ml implements eO {

    /* JADX INFO: renamed from: t1.Ml$I28 */
    static final class I28 extends w6 {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        static final int f73398t = Integer.numberOfLeadingZeros(31);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        static final AbstractC2368Ml f73397O = new I28();

        I28() {
            super("CharMatcher.whitespace()");
        }

        @Override // t1.AbstractC2368Ml
        public boolean O(char c2) {
            if ("\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c2) >>> f73398t) == c2) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: t1.Ml$Ml, reason: collision with other inner class name */
    private static final class C1176Ml extends w6 {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        static final AbstractC2368Ml f73399t = new C1176Ml();

        @Override // t1.AbstractC2368Ml
        public boolean O(char c2) {
            return false;
        }

        private C1176Ml() {
            super("CharMatcher.none()");
        }

        @Override // t1.AbstractC2368Ml
        public int t(CharSequence charSequence, int i2) {
            Xo.r(i2, charSequence.length());
            return -1;
        }
    }

    /* JADX INFO: renamed from: t1.Ml$j */
    static abstract class j extends AbstractC2368Ml {
        @Override // t1.eO
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return super.rl((Character) obj);
        }

        j() {
        }
    }

    /* JADX INFO: renamed from: t1.Ml$n */
    private static final class n extends j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final char f73400n;

        @Override // t1.AbstractC2368Ml
        public boolean O(char c2) {
            return c2 == this.f73400n;
        }

        public String toString() {
            return "CharMatcher.is('" + AbstractC2368Ml.Uo(this.f73400n) + "')";
        }

        n(char c2) {
            this.f73400n = c2;
        }
    }

    /* JADX INFO: renamed from: t1.Ml$w6 */
    static abstract class w6 extends j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f73401n;

        public final String toString() {
            return this.f73401n;
        }

        w6(String str) {
            this.f73401n = (String) Xo.HI(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String Uo(char c2) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(c2 & 15);
            c2 = (char) (c2 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public abstract boolean O(char c2);

    public static AbstractC2368Ml J2() {
        return C1176Ml.f73399t;
    }

    public static AbstractC2368Ml KN() {
        return I28.f73397O;
    }

    public static AbstractC2368Ml nr(char c2) {
        return new n(c2);
    }

    protected AbstractC2368Ml() {
    }

    public boolean rl(Character ch) {
        return O(ch.charValue());
    }

    public int t(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        Xo.r(i2, length);
        while (i2 < length) {
            if (O(charSequence.charAt(i2))) {
                return i2;
            }
            i2++;
        }
        return -1;
    }
}
