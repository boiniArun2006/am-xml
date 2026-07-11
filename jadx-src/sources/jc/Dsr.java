package jc;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Dsr extends jc.w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f69458n;
    private final w6 nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f69459t;

    public static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Integer f69460n;
        private w6 nr;
        private Integer rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Integer f69461t;

        private n() {
            this.f69460n = null;
            this.rl = null;
            this.f69461t = null;
            this.nr = w6.nr;
        }

        public n O(w6 w6Var) {
            this.nr = w6Var;
            return this;
        }

        public Dsr n() throws GeneralSecurityException {
            Integer num = this.f69460n;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.rl == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.nr == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.f69461t != null) {
                return new Dsr(num.intValue(), this.rl.intValue(), this.f69461t.intValue(), this.nr);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        public n nr(int i2) throws GeneralSecurityException {
            if (i2 < 0 || i2 > 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be at most 16 bytes", Integer.valueOf(i2)));
            }
            this.f69461t = Integer.valueOf(i2);
            return this;
        }

        public n rl(int i2) throws GeneralSecurityException {
            if (i2 != 12 && i2 != 16) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i2)));
            }
            this.rl = Integer.valueOf(i2);
            return this;
        }

        public n t(int i2) throws InvalidAlgorithmParameterException {
            if (i2 != 16 && i2 != 24 && i2 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i2)));
            }
            this.f69460n = Integer.valueOf(i2);
            return this;
        }
    }

    public static final class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f69463n;
        public static final w6 rl = new w6("TINK");

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final w6 f69462t = new w6("CRUNCHY");
        public static final w6 nr = new w6("NO_PREFIX");

        public String toString() {
            return this.f69463n;
        }

        private w6(String str) {
            this.f69463n = str;
        }
    }

    private Dsr(int i2, int i3, int i5, w6 w6Var) {
        this.f69458n = i2;
        this.rl = i3;
        this.f69459t = i5;
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
        if (!(obj instanceof Dsr)) {
            return false;
        }
        Dsr dsr = (Dsr) obj;
        return dsr.t() == t() && dsr.rl() == rl() && dsr.nr() == nr() && dsr.O() == O();
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f69458n), Integer.valueOf(this.rl), Integer.valueOf(this.f69459t), this.nr);
    }

    public int nr() {
        return this.f69459t;
    }

    public int rl() {
        return this.rl;
    }

    public int t() {
        return this.f69458n;
    }

    public String toString() {
        return "AesEax Parameters (variant: " + this.nr + ", " + this.rl + "-byte IV, " + this.f69459t + "-byte tag, and " + this.f69458n + "-byte key)";
    }
}
