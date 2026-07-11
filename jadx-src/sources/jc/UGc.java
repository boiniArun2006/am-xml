package jc;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class UGc extends jc.w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f69476n;
    private final w6 rl;

    public static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Integer f69477n;
        private w6 rl;

        private n() {
            this.f69477n = null;
            this.rl = w6.nr;
        }

        public UGc n() throws GeneralSecurityException {
            Integer num = this.f69477n;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.rl != null) {
                return new UGc(num.intValue(), this.rl);
            }
            throw new GeneralSecurityException("Variant is not set");
        }

        public n rl(int i2) throws InvalidAlgorithmParameterException {
            if (i2 != 16 && i2 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i2)));
            }
            this.f69477n = Integer.valueOf(i2);
            return this;
        }

        public n t(w6 w6Var) {
            this.rl = w6Var;
            return this;
        }
    }

    public static final class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f69479n;
        public static final w6 rl = new w6("TINK");

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final w6 f69478t = new w6("CRUNCHY");
        public static final w6 nr = new w6("NO_PREFIX");

        public String toString() {
            return this.f69479n;
        }

        private w6(String str) {
            this.f69479n = str;
        }
    }

    private UGc(int i2, w6 w6Var) {
        this.f69476n = i2;
        this.rl = w6Var;
    }

    public static n n() {
        return new n();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof UGc)) {
            return false;
        }
        UGc uGc = (UGc) obj;
        return uGc.rl() == rl() && uGc.t() == t();
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f69476n), this.rl);
    }

    public boolean nr() {
        return this.rl != w6.nr;
    }

    public int rl() {
        return this.f69476n;
    }

    public w6 t() {
        return this.rl;
    }

    public String toString() {
        return "AesGcmSiv Parameters (variant: " + this.rl + ", " + this.f69476n + "-byte key)";
    }
}
