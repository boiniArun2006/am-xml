package io.grpc.internal;

import JP.Ml;
import io.grpc.AbstractC2170c;
import io.grpc.Pl;
import io.grpc.internal.T;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final io.grpc.eO f68251n;
    private final String rl;

    private static final class I28 extends io.grpc.Pl {
        private I28() {
        }

        @Override // io.grpc.Pl
        public void J2() {
        }

        @Override // io.grpc.Pl
        public void nr(Pl.fuX fux) {
        }

        @Override // io.grpc.Pl
        public void t(io.grpc.SPz sPz) {
        }

        @Override // io.grpc.Pl
        public io.grpc.SPz n(Pl.fuX fux) {
            return io.grpc.SPz.f68184O;
        }
    }

    private static final class Ml extends Pl.aC {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final io.grpc.SPz f68252n;

        @Override // io.grpc.Pl.aC
        public Pl.Wre n(Pl.CN3 cn3) {
            return Pl.Wre.J2(this.f68252n);
        }

        Ml(io.grpc.SPz sPz) {
            this.f68252n = sPz;
        }
    }

    static final class Wre extends Exception {
        private Wre(String str) {
            super(str);
        }
    }

    public final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Pl.I28 f68253n;
        private io.grpc.Pl rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private io.grpc.Xo f68254t;

        n(Pl.I28 i28) {
            this.f68253n = i28;
            io.grpc.Xo xoNr = Dsr.this.f68251n.nr(Dsr.this.rl);
            this.f68254t = xoNr;
            if (xoNr != null) {
                this.rl = xoNr.n(i28);
                return;
            }
            throw new IllegalStateException("Could not find policy '" + Dsr.this.rl + "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files.");
        }

        public io.grpc.Pl n() {
            return this.rl;
        }

        void nr() {
            this.rl.J2();
            this.rl = null;
        }

        io.grpc.SPz O(Pl.fuX fux) {
            T.n nVar = (T.n) fux.t();
            if (nVar == null) {
                try {
                    Dsr dsr = Dsr.this;
                    nVar = new T.n(dsr.nr(dsr.rl, "using default policy"), null);
                } catch (Wre e2) {
                    this.f68253n.J2(JP.qz.TRANSIENT_FAILURE, new Ml(io.grpc.SPz.f68187o.Ik(e2.getMessage())));
                    this.rl.J2();
                    this.f68254t = null;
                    this.rl = new I28();
                    return io.grpc.SPz.f68184O;
                }
            }
            if (this.f68254t == null || !nVar.f68379n.rl().equals(this.f68254t.rl())) {
                this.f68253n.J2(JP.qz.CONNECTING, new w6());
                this.rl.J2();
                io.grpc.Xo xo = nVar.f68379n;
                this.f68254t = xo;
                io.grpc.Pl pl = this.rl;
                this.rl = xo.n(this.f68253n);
                this.f68253n.rl().rl(Ml.j.INFO, "Load balancer changed from {0} to {1}", pl.getClass().getSimpleName(), this.rl.getClass().getSimpleName());
            }
            Object obj = nVar.rl;
            if (obj != null) {
                this.f68253n.rl().rl(Ml.j.DEBUG, "Load-balancing config: {0}", nVar.rl);
            }
            return n().n(Pl.fuX.nr().rl(fux.n()).t(fux.rl()).nr(obj).n());
        }

        void rl(io.grpc.SPz sPz) {
            n().t(sPz);
        }

        void t() {
            n().O();
        }
    }

    private static final class w6 extends Pl.aC {
        private w6() {
        }

        public String toString() {
            return t1.Dsr.rl(w6.class).toString();
        }

        @Override // io.grpc.Pl.aC
        public Pl.Wre n(Pl.CN3 cn3) {
            return Pl.Wre.Uo();
        }
    }

    public Dsr(String str) {
        this(io.grpc.eO.rl(), str);
    }

    AbstractC2170c.n J2(Map map) {
        List listG;
        if (map != null) {
            try {
                listG = T.g(T.Uo(map));
            } catch (RuntimeException e2) {
                return AbstractC2170c.n.rl(io.grpc.SPz.Uo.Ik("can't parse load balancer configuration").ck(e2));
            }
        } else {
            listG = null;
        }
        if (listG == null || listG.isEmpty()) {
            return null;
        }
        return T.ViF(listG, this.f68251n);
    }

    Dsr(io.grpc.eO eOVar, String str) {
        this.f68251n = (io.grpc.eO) t1.Xo.ck(eOVar, "registry");
        this.rl = (String) t1.Xo.ck(str, "defaultPolicy");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public io.grpc.Xo nr(String str, String str2) throws Wre {
        io.grpc.Xo xoNr = this.f68251n.nr(str);
        if (xoNr != null) {
            return xoNr;
        }
        throw new Wre("Trying to load '" + str + "' because " + str2 + ", but it's unavailable");
    }

    public n O(Pl.I28 i28) {
        return new n(i28);
    }
}
