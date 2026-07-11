package jc;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import jc.UGc;

/* JADX INFO: renamed from: jc.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class C2196c extends jc.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final UGc f69488n;
    private final Integer nr;
    private final nri.n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final nri.j f69489t;

    /* JADX INFO: renamed from: jc.c$n */
    public static class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private UGc f69490n;
        private nri.n rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Integer f69491t;

        private n() {
            this.f69490n = null;
            this.rl = null;
            this.f69491t = null;
        }

        private nri.j rl() {
            if (this.f69490n.t() == UGc.w6.nr) {
                return nri.j.n(new byte[0]);
            }
            if (this.f69490n.t() == UGc.w6.f69478t) {
                return nri.j.n(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f69491t.intValue()).array());
            }
            if (this.f69490n.t() == UGc.w6.rl) {
                return nri.j.n(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f69491t.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + this.f69490n.t());
        }

        public n O(UGc uGc) {
            this.f69490n = uGc;
            return this;
        }

        public C2196c n() throws GeneralSecurityException {
            UGc uGc = this.f69490n;
            if (uGc == null || this.rl == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (uGc.rl() != this.rl.rl()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f69490n.nr() && this.f69491t == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f69490n.nr() && this.f69491t != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new C2196c(this.f69490n, this.rl, rl(), this.f69491t);
        }

        public n nr(nri.n nVar) {
            this.rl = nVar;
            return this;
        }

        public n t(Integer num) {
            this.f69491t = num;
            return this;
        }
    }

    private C2196c(UGc uGc, nri.n nVar, nri.j jVar, Integer num) {
        this.f69488n = uGc;
        this.rl = nVar;
        this.f69489t = jVar;
        this.nr = num;
    }

    public static n n() {
        return new n();
    }
}
