package jc;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: renamed from: jc.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class C2197z extends jc.w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f69514n;
    private final w6 nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f69515t;

    /* JADX INFO: renamed from: jc.z$n */
    public static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Integer f69516n;
        private w6 nr;
        private Integer rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Integer f69517t;

        private n() {
            this.f69516n = null;
            this.rl = null;
            this.f69517t = null;
            this.nr = w6.nr;
        }

        public n O(w6 w6Var) {
            this.nr = w6Var;
            return this;
        }

        public C2197z n() throws GeneralSecurityException {
            Integer num = this.f69516n;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.nr == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.rl == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.f69517t != null) {
                return new C2197z(num.intValue(), this.rl.intValue(), this.f69517t.intValue(), this.nr);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        public n nr(int i2) throws GeneralSecurityException {
            if (i2 != 12 && i2 != 13 && i2 != 14 && i2 != 15 && i2 != 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be one of the following: 12, 13, 14, 15 or 16 bytes", Integer.valueOf(i2)));
            }
            this.f69517t = Integer.valueOf(i2);
            return this;
        }

        public n rl(int i2) throws GeneralSecurityException {
            if (i2 <= 0) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be positive", Integer.valueOf(i2)));
            }
            this.rl = Integer.valueOf(i2);
            return this;
        }

        public n t(int i2) throws InvalidAlgorithmParameterException {
            if (i2 != 16 && i2 != 24 && i2 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i2)));
            }
            this.f69516n = Integer.valueOf(i2);
            return this;
        }
    }

    /* JADX INFO: renamed from: jc.z$w6 */
    public static final class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f69519n;
        public static final w6 rl = new w6("TINK");

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final w6 f69518t = new w6("CRUNCHY");
        public static final w6 nr = new w6("NO_PREFIX");

        public String toString() {
            return this.f69519n;
        }

        private w6(String str) {
            this.f69519n = str;
        }
    }

    private C2197z(int i2, int i3, int i5, w6 w6Var) {
        this.f69514n = i2;
        this.rl = i3;
        this.f69515t = i5;
        this.nr = w6Var;
    }

    public static n n() {
        return new n();
    }

    public boolean J2() {
        return this.nr != w6.nr;
    }

    public w6 O() {
        return this.nr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2197z)) {
            return false;
        }
        C2197z c2197z = (C2197z) obj;
        return c2197z.t() == t() && c2197z.rl() == rl() && c2197z.nr() == nr() && c2197z.O() == O();
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f69514n), Integer.valueOf(this.rl), Integer.valueOf(this.f69515t), this.nr);
    }

    public int nr() {
        return this.f69515t;
    }

    public int rl() {
        return this.rl;
    }

    public int t() {
        return this.f69514n;
    }

    public String toString() {
        return "AesGcm Parameters (variant: " + this.nr + ", " + this.rl + "-byte IV, " + this.f69515t + "-byte tag, and " + this.f69514n + "-byte key)";
    }
}
