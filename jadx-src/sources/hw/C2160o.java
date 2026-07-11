package hw;

import aT.dE.JLZo;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: renamed from: hw.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class C2160o extends z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f68032n;
    private final w6 nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Ml f68033t;

    /* JADX INFO: renamed from: hw.o$Ml */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f68036n;
        public static final Ml rl = new Ml("TINK");

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final Ml f68035t = new Ml("CRUNCHY");
        public static final Ml nr = new Ml("LEGACY");

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final Ml f68034O = new Ml("NO_PREFIX");

        public String toString() {
            return this.f68036n;
        }

        private Ml(String str) {
            this.f68036n = str;
        }
    }

    /* JADX INFO: renamed from: hw.o$n */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Integer f68037n;
        private Ml nr;
        private Integer rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private w6 f68038t;

        private n() {
            this.f68037n = null;
            this.rl = null;
            this.f68038t = null;
            this.nr = Ml.f68034O;
        }

        private static void J2(int i2, w6 w6Var) throws GeneralSecurityException {
            if (i2 < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i2)));
            }
            if (w6Var == w6.rl) {
                if (i2 > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(i2)));
                }
                return;
            }
            if (w6Var == w6.f68040t) {
                if (i2 > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(i2)));
                }
                return;
            }
            if (w6Var == w6.nr) {
                if (i2 > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(i2)));
                }
            } else if (w6Var == w6.f68039O) {
                if (i2 > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(i2)));
                }
            } else {
                if (w6Var != w6.J2) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                }
                if (i2 > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(i2)));
                }
            }
        }

        public n O(Ml ml) {
            this.nr = ml;
            return this;
        }

        public C2160o n() throws GeneralSecurityException {
            Integer num = this.f68037n;
            if (num == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if (this.rl == null) {
                throw new GeneralSecurityException("tag size is not set");
            }
            if (this.f68038t == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.nr == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (num.intValue() < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.f68037n));
            }
            J2(this.rl.intValue(), this.f68038t);
            return new C2160o(this.f68037n.intValue(), this.rl.intValue(), this.nr, this.f68038t);
        }

        public n rl(w6 w6Var) {
            this.f68038t = w6Var;
            return this;
        }

        public n nr(int i2) {
            this.rl = Integer.valueOf(i2);
            return this;
        }

        public n t(int i2) {
            this.f68037n = Integer.valueOf(i2);
            return this;
        }
    }

    /* JADX INFO: renamed from: hw.o$w6 */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f68041n;
        public static final w6 rl = new w6("SHA1");

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final w6 f68040t = new w6("SHA224");
        public static final w6 nr = new w6("SHA256");

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final w6 f68039O = new w6("SHA384");
        public static final w6 J2 = new w6("SHA512");

        public String toString() {
            return this.f68041n;
        }

        private w6(String str) {
            this.f68041n = str;
        }
    }

    private C2160o(int i2, int i3, Ml ml, w6 w6Var) {
        this.f68032n = i2;
        this.rl = i3;
        this.f68033t = ml;
        this.nr = w6Var;
    }

    public static n n() {
        return new n();
    }

    public Ml J2() {
        return this.f68033t;
    }

    public int O() {
        Ml ml = this.f68033t;
        if (ml == Ml.f68034O) {
            return rl();
        }
        if (ml != Ml.rl && ml != Ml.f68035t && ml != Ml.nr) {
            throw new IllegalStateException("Unknown variant");
        }
        int iRl = rl();
        return iRl + 5;
    }

    public boolean Uo() {
        return this.f68033t != Ml.f68034O;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2160o)) {
            return false;
        }
        C2160o c2160o = (C2160o) obj;
        return c2160o.nr() == nr() && c2160o.O() == O() && c2160o.J2() == J2() && c2160o.t() == t();
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f68032n), Integer.valueOf(this.rl), this.f68033t, this.nr);
    }

    public int nr() {
        return this.f68032n;
    }

    public int rl() {
        return this.rl;
    }

    public w6 t() {
        return this.nr;
    }

    public String toString() {
        return "HMAC Parameters (variant: " + this.f68033t + ", hashType: " + this.nr + JLZo.tjgmcSWoSYtIElv + this.rl + "-byte tags, and " + this.f68032n + "-byte key)";
    }
}
