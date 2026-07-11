package Rc;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Options;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class w6 implements Closeable {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final String[] f8696Z = new String[128];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f8698n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f8699o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    boolean f8700r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int[] f8701t = new int[32];

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    String[] f8697O = new String[32];
    int[] J2 = new int[32];

    public enum n {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    public abstract String M();

    public abstract double M7();

    public abstract int Mx(j jVar);

    public abstract void T();

    public abstract boolean U();

    public abstract void Uo();

    public abstract void Z();

    public abstract n a();

    public abstract String eF();

    public abstract void fcU();

    public abstract boolean jB();

    public abstract void n1();

    public abstract int p5();

    public abstract void rl();

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final String[] f8702n;
        final Options rl;

        public static j n(String... strArr) {
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                Buffer buffer = new Buffer();
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    w6.qm(buffer, strArr[i2]);
                    buffer.readByte();
                    byteStringArr[i2] = buffer.readByteString();
                }
                return new j((String[]) strArr.clone(), Options.of(byteStringArr));
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        private j(String[] strArr, Options options) {
            this.f8702n = strArr;
            this.rl = options;
        }
    }

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            f8696Z[i2] = String.format("\\u%04x", Integer.valueOf(i2));
        }
        String[] strArr = f8696Z;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public static w6 FX(BufferedSource bufferedSource) {
        return new I28(bufferedSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void qm(BufferedSink bufferedSink, String str) throws IOException {
        String str2;
        String[] strArr = f8696Z;
        bufferedSink.writeByte(34);
        int length = str.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i2 < i3) {
                        bufferedSink.writeUtf8(str, i2, i3);
                    }
                    bufferedSink.writeUtf8(str2);
                    i2 = i3 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i2 < i3) {
                }
                bufferedSink.writeUtf8(str2);
                i2 = i3 + 1;
            }
        }
        if (i2 < length) {
            bufferedSink.writeUtf8(str, i2, length);
        }
        bufferedSink.writeByte(34);
    }

    final Rc.n Org(String str) throws Rc.n {
        throw new Rc.n(str + " at path " + getPath());
    }

    public final String getPath() {
        return Ml.n(this.f8698n, this.f8701t, this.f8697O, this.J2);
    }

    final void z(int i2) {
        int i3 = this.f8698n;
        int[] iArr = this.f8701t;
        if (i3 == iArr.length) {
            if (i3 == 256) {
                throw new Rc.j("Nesting too deep at " + getPath());
            }
            this.f8701t = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f8697O;
            this.f8697O = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.J2;
            this.J2 = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f8701t;
        int i5 = this.f8698n;
        this.f8698n = i5 + 1;
        iArr3[i5] = i2;
    }

    w6() {
    }
}
