package Vst;

import com.google.protobuf.C;
import pUk.eO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CN3 f11343n = new CN3();
    private final j rl = new j();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final n f11344t = new n();

    class j extends Vst.n {
        j() {
        }

        @Override // Vst.n
        public void O(String str) {
            Ml.this.f11343n.S(str);
        }

        @Override // Vst.n
        public void n(C c2) {
            Ml.this.f11343n.KN(c2);
        }

        @Override // Vst.n
        public void nr(long j2) {
            Ml.this.f11343n.r(j2);
        }

        @Override // Vst.n
        public void rl(double d2) {
            Ml.this.f11343n.mUb(d2);
        }

        @Override // Vst.n
        public void t() {
            Ml.this.f11343n.ty();
        }
    }

    class n extends Vst.n {
        n() {
        }

        @Override // Vst.n
        public void O(String str) {
            Ml.this.f11343n.WPU(str);
        }

        @Override // Vst.n
        public void n(C c2) {
            Ml.this.f11343n.xMQ(c2);
        }

        @Override // Vst.n
        public void nr(long j2) {
            Ml.this.f11343n.o(j2);
        }

        @Override // Vst.n
        public void rl(double d2) {
            Ml.this.f11343n.gh(d2);
        }

        @Override // Vst.n
        public void t() {
            Ml.this.f11343n.HI();
        }
    }

    public void nr(byte[] bArr) {
        this.f11343n.t(bArr);
    }

    public Vst.n rl(eO.w6.j jVar) {
        return jVar.equals(eO.w6.j.DESCENDING) ? this.f11344t : this.rl;
    }

    public byte[] t() {
        return this.f11343n.n();
    }
}
