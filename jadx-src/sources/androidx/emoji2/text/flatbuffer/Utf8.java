package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class Utf8 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static Utf8 f38388n;

    static class DecodeUtil {
        private static boolean J2(byte b2) {
            return b2 > -65;
        }

        static boolean KN(byte b2) {
            return b2 < -16;
        }

        private static char O(int i2) {
            return (char) ((i2 >>> 10) + 55232);
        }

        static boolean Uo(byte b2) {
            return b2 >= 0;
        }

        private static int gh(byte b2) {
            return b2 & 63;
        }

        private static char mUb(int i2) {
            return (char) ((i2 & 1023) + 56320);
        }

        static void rl(byte b2, char[] cArr, int i2) {
            cArr[i2] = (char) b2;
        }

        static boolean xMQ(byte b2) {
            return b2 < -32;
        }

        static void nr(byte b2, byte b4, char[] cArr, int i2) {
            if (b2 < -62) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
            }
            if (J2(b4)) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
            }
            cArr[i2] = (char) (((b2 & 31) << 6) | gh(b4));
        }

        static void n(byte b2, byte b4, byte b5, byte b6, char[] cArr, int i2) {
            if (!J2(b4) && (((b2 << 28) + (b4 + 112)) >> 30) == 0 && !J2(b5) && !J2(b6)) {
                int iGh = ((b2 & 7) << 18) | (gh(b4) << 12) | (gh(b5) << 6) | gh(b6);
                cArr[i2] = O(iGh);
                cArr[i2 + 1] = mUb(iGh);
                return;
            }
            throw new IllegalArgumentException("Invalid UTF-8");
        }

        static void t(byte b2, byte b4, byte b5, char[] cArr, int i2) {
            if (!J2(b4) && ((b2 != -32 || b4 >= -96) && ((b2 != -19 || b4 < -96) && !J2(b5)))) {
                cArr[i2] = (char) (((b2 & 15) << 12) | (gh(b4) << 6) | gh(b5));
                return;
            }
            throw new IllegalArgumentException("Invalid UTF-8");
        }
    }

    static class UnpairedSurrogateException extends IllegalArgumentException {
    }

    public static Utf8 n() {
        if (f38388n == null) {
            f38388n = new Utf8Safe();
        }
        return f38388n;
    }
}
