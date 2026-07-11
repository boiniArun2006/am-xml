package jc;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import jc.C2197z;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Xo extends jc.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C2197z f69480n;
    private final Integer nr;
    private final nri.n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final nri.j f69481t;

    public static class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private C2197z f69482n;
        private nri.n rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Integer f69483t;

        private n() {
            this.f69482n = null;
            this.rl = null;
            this.f69483t = null;
        }

        private nri.j rl() {
            if (this.f69482n.O() == C2197z.w6.nr) {
                return nri.j.n(new byte[0]);
            }
            if (this.f69482n.O() == C2197z.w6.f69518t) {
                return nri.j.n(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f69483t.intValue()).array());
            }
            if (this.f69482n.O() == C2197z.w6.rl) {
                return nri.j.n(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f69483t.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + this.f69482n.O());
        }

        public n O(C2197z c2197z) {
            this.f69482n = c2197z;
            return this;
        }

        public Xo n() throws GeneralSecurityException {
            C2197z c2197z = this.f69482n;
            if (c2197z == null || this.rl == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (c2197z.t() != this.rl.rl()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f69482n.J2() && this.f69483t == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f69482n.J2() && this.f69483t != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new Xo(this.f69482n, this.rl, rl(), this.f69483t);
        }

        public n nr(nri.n nVar) {
            this.rl = nVar;
            return this;
        }

        public n t(Integer num) {
            this.f69483t = num;
            return this;
        }
    }

    private Xo(C2197z c2197z, nri.n nVar, nri.j jVar, Integer num) {
        this.f69480n = c2197z;
        this.rl = nVar;
        this.f69481t = jVar;
        this.nr = num;
    }

    public static n n() {
        return new n();
    }
}
