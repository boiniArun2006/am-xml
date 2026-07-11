package gAe;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import uBO.Ln;
import uBO.Z;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final byte[] f67135n = new byte[0];

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f67136n;

        static {
            int[] iArr = new int[Ln.values().length];
            f67136n = iArr;
            try {
                iArr[Ln.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67136n[Ln.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f67136n[Ln.TINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f67136n[Ln.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static byte[] n(Z.w6 w6Var) throws GeneralSecurityException {
        int i2 = j.f67136n[w6Var.eF().ordinal()];
        if (i2 == 1 || i2 == 2) {
            return ByteBuffer.allocate(5).put((byte) 0).putInt(w6Var.p5()).array();
        }
        if (i2 == 3) {
            return ByteBuffer.allocate(5).put((byte) 1).putInt(w6Var.p5()).array();
        }
        if (i2 == 4) {
            return f67135n;
        }
        throw new GeneralSecurityException("unknown output prefix type");
    }
}
