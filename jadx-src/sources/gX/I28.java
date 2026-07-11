package gX;

import java.security.GeneralSecurityException;
import uBO.Ln;
import uBO.SPz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class I28 extends gAe.CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Xo f67576n;

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f67577n;
        static final /* synthetic */ int[] rl;

        static {
            int[] iArr = new int[SPz.w6.values().length];
            rl = iArr;
            try {
                iArr[SPz.w6.SYMMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                rl[SPz.w6.ASYMMETRIC_PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Ln.values().length];
            f67577n = iArr2;
            try {
                iArr2[Ln.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f67577n[Ln.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f67577n[Ln.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f67577n[Ln.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private static void n(Xo xo, gAe.SPz sPz) throws GeneralSecurityException {
        int i2 = j.rl[xo.nr().ordinal()];
        if (i2 == 1 || i2 == 2) {
            gAe.SPz.rl(sPz);
        }
    }

    public I28(Xo xo, gAe.SPz sPz) throws GeneralSecurityException {
        n(xo, sPz);
        this.f67576n = xo;
    }
}
