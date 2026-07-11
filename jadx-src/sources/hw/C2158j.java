package hw;

import hw.C2154Ml;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: hw.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class C2158j extends eO {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C2154Ml f68028n;
    private final Integer nr;
    private final nri.n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final nri.j f68029t;

    /* JADX INFO: renamed from: hw.j$n */
    public static class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private C2154Ml f68030n;
        private nri.n rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Integer f68031t;

        private n() {
            this.f68030n = null;
            this.rl = null;
            this.f68031t = null;
        }

        private nri.j rl() {
            if (this.f68030n.O() == C2154Ml.w6.f68009O) {
                return nri.j.n(new byte[0]);
            }
            if (this.f68030n.O() == C2154Ml.w6.nr || this.f68030n.O() == C2154Ml.w6.f68010t) {
                return nri.j.n(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f68031t.intValue()).array());
            }
            if (this.f68030n.O() == C2154Ml.w6.rl) {
                return nri.j.n(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f68031t.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + this.f68030n.O());
        }

        public n O(C2154Ml c2154Ml) {
            this.f68030n = c2154Ml;
            return this;
        }

        public C2158j n() throws GeneralSecurityException {
            C2154Ml c2154Ml = this.f68030n;
            if (c2154Ml == null || this.rl == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (c2154Ml.t() != this.rl.rl()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f68030n.J2() && this.f68031t == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f68030n.J2() && this.f68031t != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new C2158j(this.f68030n, this.rl, rl(), this.f68031t);
        }

        public n nr(Integer num) {
            this.f68031t = num;
            return this;
        }

        public n t(nri.n nVar) {
            this.rl = nVar;
            return this;
        }
    }

    private C2158j(C2154Ml c2154Ml, nri.n nVar, nri.j jVar, Integer num) {
        this.f68028n = c2154Ml;
        this.rl = nVar;
        this.f68029t = jVar;
        this.nr = num;
    }

    public static n t() {
        return new n();
    }

    @Override // hw.eO
    public nri.j n() {
        return this.f68029t;
    }

    @Override // hw.eO
    /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
    public C2154Ml rl() {
        return this.f68028n;
    }
}
