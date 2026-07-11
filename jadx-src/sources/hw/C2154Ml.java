package hw;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: renamed from: hw.Ml, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class C2154Ml extends z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f68005n;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final w6 f68006t;

    /* JADX INFO: renamed from: hw.Ml$n */
    public static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Integer f68007n;
        private Integer rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private w6 f68008t;

        private n() {
            this.f68007n = null;
            this.rl = null;
            this.f68008t = w6.f68009O;
        }

        public C2154Ml n() throws GeneralSecurityException {
            Integer num = this.f68007n;
            if (num == null) {
                throw new GeneralSecurityException("key size not set");
            }
            if (this.rl == null) {
                throw new GeneralSecurityException("tag size not set");
            }
            if (this.f68008t != null) {
                return new C2154Ml(num.intValue(), this.rl.intValue(), this.f68008t);
            }
            throw new GeneralSecurityException("variant not set");
        }

        public n nr(w6 w6Var) {
            this.f68008t = w6Var;
            return this;
        }

        public n rl(int i2) throws InvalidAlgorithmParameterException {
            if (i2 != 16 && i2 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i2 * 8)));
            }
            this.f68007n = Integer.valueOf(i2);
            return this;
        }

        public n t(int i2) throws GeneralSecurityException {
            if (i2 >= 10 && 16 >= i2) {
                this.rl = Integer.valueOf(i2);
                return this;
            }
            throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i2);
        }
    }

    /* JADX INFO: renamed from: hw.Ml$w6 */
    public static final class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f68011n;
        public static final w6 rl = new w6("TINK");

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final w6 f68010t = new w6("CRUNCHY");
        public static final w6 nr = new w6("LEGACY");

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final w6 f68009O = new w6("NO_PREFIX");

        public String toString() {
            return this.f68011n;
        }

        private w6(String str) {
            this.f68011n = str;
        }
    }

    private C2154Ml(int i2, int i3, w6 w6Var) {
        this.f68005n = i2;
        this.rl = i3;
        this.f68006t = w6Var;
    }

    public static n n() {
        return new n();
    }

    public boolean J2() {
        return this.f68006t != w6.f68009O;
    }

    public w6 O() {
        return this.f68006t;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2154Ml)) {
            return false;
        }
        C2154Ml c2154Ml = (C2154Ml) obj;
        return c2154Ml.t() == t() && c2154Ml.nr() == nr() && c2154Ml.O() == O();
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f68005n), Integer.valueOf(this.rl), this.f68006t);
    }

    public int nr() {
        w6 w6Var = this.f68006t;
        if (w6Var == w6.f68009O) {
            return rl();
        }
        if (w6Var != w6.rl && w6Var != w6.f68010t && w6Var != w6.nr) {
            throw new IllegalStateException("Unknown variant");
        }
        int iRl = rl();
        return iRl + 5;
    }

    public int rl() {
        return this.rl;
    }

    public int t() {
        return this.f68005n;
    }

    public String toString() {
        return "AES-CMAC Parameters (variant: " + this.f68006t + ", " + this.rl + "-byte tags, and " + this.f68005n + "-byte key)";
    }
}
