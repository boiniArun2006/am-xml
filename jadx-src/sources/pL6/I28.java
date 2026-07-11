package pL6;

import JP.qz;
import io.grpc.Pl;
import io.grpc.SPz;
import t1.Xo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class I28 extends pL6.n {
    static final Pl.aC ck = new w6();
    private boolean HI;
    private final Pl.I28 KN;
    private final Pl Uo;
    private qz az;
    private Pl.w6 gh;
    private Pl mUb;
    private Pl qie;
    private Pl.aC ty;
    private Pl.w6 xMQ;

    class j extends Pl {
        @Override // io.grpc.Pl
        public void J2() {
        }

        j() {
        }

        @Override // io.grpc.Pl
        public void nr(Pl.fuX fux) {
            throw new IllegalStateException("GracefulSwitchLoadBalancer must switch to a load balancing policy before handling ResolvedAddresses");
        }

        @Override // io.grpc.Pl
        public void t(SPz sPz) {
            I28.this.KN.J2(qz.TRANSIENT_FAILURE, new Pl.Ml(Pl.Wre.J2(sPz)));
        }
    }

    class n extends pL6.w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Pl f71847n;

        n() {
        }

        @Override // pL6.w6, io.grpc.Pl.I28
        public void J2(qz qzVar, Pl.aC aCVar) {
            if (this.f71847n == I28.this.qie) {
                Xo.S(I28.this.HI, "there's pending lb while current lb has been out of READY");
                I28.this.az = qzVar;
                I28.this.ty = aCVar;
                if (qzVar == qz.READY) {
                    I28.this.Ik();
                    return;
                }
                return;
            }
            if (this.f71847n == I28.this.mUb) {
                I28.this.HI = qzVar == qz.READY;
                if (I28.this.HI || I28.this.qie == I28.this.Uo) {
                    I28.this.KN.J2(qzVar, aCVar);
                } else {
                    I28.this.Ik();
                }
            }
        }

        @Override // pL6.w6
        protected Pl.I28 Uo() {
            return I28.this.KN;
        }
    }

    class w6 extends Pl.aC {
        public String toString() {
            return "BUFFER_PICKER";
        }

        w6() {
        }

        @Override // io.grpc.Pl.aC
        public Pl.Wre n(Pl.CN3 cn3) {
            return Pl.Wre.Uo();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Ik() {
        this.KN.J2(this.az, this.ty);
        this.mUb.J2();
        this.mUb = this.qie;
        this.xMQ = this.gh;
        this.qie = this.Uo;
        this.gh = null;
    }

    @Override // io.grpc.Pl
    public void J2() {
        this.qie.J2();
        this.mUb.J2();
    }

    @Override // pL6.n
    protected Pl Uo() {
        Pl pl = this.qie;
        return pl == this.Uo ? this.mUb : pl;
    }

    public void r(Pl.w6 w6Var) {
        Xo.ck(w6Var, "newBalancerFactory");
        if (w6Var.equals(this.gh)) {
            return;
        }
        this.qie.J2();
        this.qie = this.Uo;
        this.gh = null;
        this.az = qz.CONNECTING;
        this.ty = ck;
        if (w6Var.equals(this.xMQ)) {
            return;
        }
        n nVar = new n();
        Pl plN = w6Var.n(nVar);
        nVar.f71847n = plN;
        this.qie = plN;
        this.gh = w6Var;
        if (this.HI) {
            return;
        }
        Ik();
    }

    public I28(Pl.I28 i28) {
        j jVar = new j();
        this.Uo = jVar;
        this.mUb = jVar;
        this.qie = jVar;
        this.KN = (Pl.I28) Xo.ck(i28, "helper");
    }
}
