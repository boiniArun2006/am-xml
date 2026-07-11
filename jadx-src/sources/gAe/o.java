package gAe;

import uBO.Ln;
import uBO.g9s;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final g9s f67158n;

    public enum n {
        TINK,
        LEGACY,
        RAW,
        CRUNCHY
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f67159n;
        static final /* synthetic */ int[] rl;

        static {
            int[] iArr = new int[n.values().length];
            rl = iArr;
            try {
                iArr[n.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                rl[n.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                rl[n.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                rl[n.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Ln.values().length];
            f67159n = iArr2;
            try {
                iArr2[Ln.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f67159n[Ln.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f67159n[Ln.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f67159n[Ln.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static o n(String str, byte[] bArr, n nVar) {
        return new o((g9s) g9s.E().ty(str).HI(com.google.crypto.tink.shaded.protobuf.fuX.J2(bArr)).az(t(nVar)).t());
    }

    static Ln t(n nVar) {
        int i2 = j.rl[nVar.ordinal()];
        if (i2 == 1) {
            return Ln.TINK;
        }
        if (i2 == 2) {
            return Ln.LEGACY;
        }
        if (i2 == 3) {
            return Ln.RAW;
        }
        if (i2 == 4) {
            return Ln.CRUNCHY;
        }
        throw new IllegalArgumentException("Unknown output prefix type");
    }

    g9s rl() {
        return this.f67158n;
    }

    private o(g9s g9sVar) {
        this.f67158n = g9sVar;
    }
}
