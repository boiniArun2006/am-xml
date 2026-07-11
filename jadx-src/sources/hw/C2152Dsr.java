package hw;

import hw.C2160o;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: hw.Dsr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class C2152Dsr extends eO {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C2160o f68001n;
    private final Integer nr;
    private final nri.n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final nri.j f68002t;

    /* JADX INFO: renamed from: hw.Dsr$n */
    public static class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private C2160o f68003n;
        private nri.n rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Integer f68004t;

        private n() {
            this.f68003n = null;
            this.rl = null;
            this.f68004t = null;
        }

        private nri.j rl() {
            if (this.f68003n.J2() == C2160o.Ml.f68034O) {
                return nri.j.n(new byte[0]);
            }
            if (this.f68003n.J2() == C2160o.Ml.nr || this.f68003n.J2() == C2160o.Ml.f68035t) {
                return nri.j.n(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f68004t.intValue()).array());
            }
            if (this.f68003n.J2() == C2160o.Ml.rl) {
                return nri.j.n(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f68004t.intValue()).array());
            }
            throw new IllegalStateException("Unknown HmacParameters.Variant: " + this.f68003n.J2());
        }

        public n O(C2160o c2160o) {
            this.f68003n = c2160o;
            return this;
        }

        public C2152Dsr n() throws GeneralSecurityException {
            C2160o c2160o = this.f68003n;
            if (c2160o == null || this.rl == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (c2160o.nr() != this.rl.rl()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f68003n.Uo() && this.f68004t == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f68003n.Uo() && this.f68004t != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new C2152Dsr(this.f68003n, this.rl, rl(), this.f68004t);
        }

        public n nr(nri.n nVar) {
            this.rl = nVar;
            return this;
        }

        public n t(Integer num) {
            this.f68004t = num;
            return this;
        }
    }

    private C2152Dsr(C2160o c2160o, nri.n nVar, nri.j jVar, Integer num) {
        this.f68001n = c2160o;
        this.rl = nVar;
        this.f68002t = jVar;
        this.nr = num;
    }

    public static n t() {
        return new n();
    }

    @Override // hw.eO
    public nri.j n() {
        return this.f68002t;
    }

    @Override // hw.eO
    /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
    public C2160o rl() {
        return this.f68001n;
    }
}
