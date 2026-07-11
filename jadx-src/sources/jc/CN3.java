package jc;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import jc.Dsr;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class CN3 extends jc.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Dsr f69454n;
    private final Integer nr;
    private final nri.n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final nri.j f69455t;

    public static class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Dsr f69456n;
        private nri.n rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Integer f69457t;

        private n() {
            this.f69456n = null;
            this.rl = null;
            this.f69457t = null;
        }

        private nri.j rl() {
            if (this.f69456n.O() == Dsr.w6.nr) {
                return nri.j.n(new byte[0]);
            }
            if (this.f69456n.O() == Dsr.w6.f69462t) {
                return nri.j.n(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f69457t.intValue()).array());
            }
            if (this.f69456n.O() == Dsr.w6.rl) {
                return nri.j.n(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f69457t.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + this.f69456n.O());
        }

        public n O(Dsr dsr) {
            this.f69456n = dsr;
            return this;
        }

        public CN3 n() throws GeneralSecurityException {
            Dsr dsr = this.f69456n;
            if (dsr == null || this.rl == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (dsr.t() != this.rl.rl()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f69456n.J2() && this.f69457t == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f69456n.J2() && this.f69457t != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new CN3(this.f69456n, this.rl, rl(), this.f69457t);
        }

        public n nr(nri.n nVar) {
            this.rl = nVar;
            return this;
        }

        public n t(Integer num) {
            this.f69457t = num;
            return this;
        }
    }

    private CN3(Dsr dsr, nri.n nVar, nri.j jVar, Integer num) {
        this.f69454n = dsr;
        this.rl = nVar;
        this.f69455t = jVar;
        this.nr = num;
    }

    public static n n() {
        return new n();
    }
}
