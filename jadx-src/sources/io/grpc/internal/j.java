package io.grpc.internal;

import JP.Dsr;
import JP.InterfaceC1378z;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.grpc.QJ;
import io.grpc.internal.M5;
import io.grpc.internal.l3D;
import io.grpc.internal.w6;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class j extends io.grpc.internal.w6 implements QJ, M5.Ml {
    private static final Logger Uo = Logger.getLogger(j.class.getName());
    private volatile boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private io.grpc.QJ f68614O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Pp f68615n;
    private boolean nr;
    private final h rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f68616t;

    /* JADX INFO: renamed from: io.grpc.internal.j$j, reason: collision with other inner class name */
    private class C0973j implements h {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private io.grpc.QJ f68618n;
        private byte[] nr;
        private boolean rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final h6y f68619t;

        @Override // io.grpc.internal.h
        public void KN(int i2) {
        }

        @Override // io.grpc.internal.h
        public void close() {
            this.rl = true;
            t1.Xo.S(this.nr != null, "Lack of request message. GET request is only supported for unary requests");
            j.this.XQ().O(this.f68618n, this.nr);
            this.nr = null;
            this.f68618n = null;
        }

        @Override // io.grpc.internal.h
        public void flush() {
        }

        @Override // io.grpc.internal.h
        public h n(JP.C c2) {
            return this;
        }

        public C0973j(io.grpc.QJ qj, h6y h6yVar) {
            this.f68618n = (io.grpc.QJ) t1.Xo.ck(qj, "headers");
            this.f68619t = (h6y) t1.Xo.ck(h6yVar, "statsTraceCtx");
        }

        @Override // io.grpc.internal.h
        public boolean isClosed() {
            return this.rl;
        }

        @Override // io.grpc.internal.h
        public void rl(InputStream inputStream) {
            t1.Xo.S(this.nr == null, "writePayload should not be called multiple times");
            try {
                this.nr = JMO.j.nr(inputStream);
                this.f68619t.xMQ(0);
                h6y h6yVar = this.f68619t;
                byte[] bArr = this.nr;
                h6yVar.mUb(0, bArr.length, bArr.length);
                this.f68619t.gh(this.nr.length);
                this.f68619t.qie(this.nr.length);
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public interface n {
        void O(io.grpc.QJ qj, byte[] bArr);

        void nr(N n2, boolean z2, boolean z3, int i2);

        void t(io.grpc.SPz sPz);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static abstract class w6 extends w6.j {
        private Runnable HI;
        private boolean Ik;
        private JP.QJ az;
        private volatile boolean ck;
        private l3D gh;
        private boolean mUb;
        private boolean qie;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private boolean f68620r;
        private boolean ty;
        private final h6y xMQ;

        /* JADX INFO: renamed from: io.grpc.internal.j$w6$j, reason: collision with other inner class name */
        class RunnableC0974j implements Runnable {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ io.grpc.QJ f68621O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ io.grpc.SPz f68622n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ l3D.j f68623t;

            RunnableC0974j(io.grpc.SPz sPz, l3D.j jVar, io.grpc.QJ qj) {
                this.f68622n = sPz;
                this.f68623t = jVar;
                this.f68621O = qj;
            }

            @Override // java.lang.Runnable
            public void run() {
                w6.this.iF(this.f68622n, this.f68623t, this.f68621O);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void wTp() {
            this.ck = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void N(JP.QJ qj) {
            t1.Xo.S(this.gh == null, "Already called start");
            this.az = (JP.QJ) t1.Xo.ck(qj, "decompressorRegistry");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void iF(io.grpc.SPz sPz, l3D.j jVar, io.grpc.QJ qj) {
            if (this.mUb) {
                return;
            }
            this.mUb = true;
            this.xMQ.az(sPz);
            if (az() != null) {
                az().J2(sPz.HI());
            }
            HI().nr(sPz, jVar, qj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void nHg(boolean z2) {
            this.qie = z2;
        }

        protected void E2(io.grpc.QJ qj) {
            boolean z2 = true;
            t1.Xo.S(!this.Ik, "Received headers on closed stream");
            this.xMQ.n();
            String str = (String) qj.Uo(psW.Uo);
            if (!this.qie || str == null) {
                z2 = false;
            } else if (str.equalsIgnoreCase("gzip")) {
                WPU(new Md());
            } else {
                if (!str.equalsIgnoreCase("identity")) {
                    nr(io.grpc.SPz.f68187o.Ik(String.format("Can't find full stream decompressor for %s", str)).nr());
                    return;
                }
                z2 = false;
            }
            String str2 = (String) qj.Uo(psW.f68686O);
            if (str2 != null) {
                InterfaceC1378z interfaceC1378zO = this.az.O(str2);
                if (interfaceC1378zO == null) {
                    nr(io.grpc.SPz.f68187o.Ik(String.format("Can't find decompressor for %s", str2)).nr());
                    return;
                } else if (interfaceC1378zO != Dsr.n.f4494n) {
                    if (z2) {
                        nr(io.grpc.SPz.f68187o.Ik("Full stream and gRPC message encoding cannot both be set").nr());
                        return;
                    }
                    S(interfaceC1378zO);
                }
            }
            HI().rl(qj);
        }

        public void O(boolean z2) {
            t1.Xo.S(this.Ik, "status should have been reported on deframer closed");
            this.ty = true;
            if (this.f68620r && z2) {
                rV9(io.grpc.SPz.f68187o.Ik("Encountered end-of-stream mid-frame"), true, new io.grpc.QJ());
            }
            Runnable runnable = this.HI;
            if (runnable != null) {
                runnable.run();
                this.HI = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.internal.w6.j
        /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
        public final l3D HI() {
            return this.gh;
        }

        protected final boolean X() {
            return this.ck;
        }

        protected void e(io.grpc.QJ qj, io.grpc.SPz sPz) {
            t1.Xo.ck(sPz, "status");
            t1.Xo.ck(qj, "trailers");
            if (this.Ik) {
                j.Uo.log(Level.INFO, "Received trailers on closed stream:\n {1}\n {2}", new Object[]{sPz, qj});
            } else {
                this.xMQ.rl(qj);
                rV9(sPz, false, qj);
            }
        }

        protected void fD(RGN rgn) throws Throwable {
            t1.Xo.ck(rgn, "frame");
            boolean z2 = true;
            try {
                if (this.Ik) {
                    j.Uo.log(Level.INFO, "Received data on closed stream");
                    rgn.close();
                    return;
                } else {
                    try {
                        qie(rgn);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        z2 = false;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
            if (z2) {
                rgn.close();
            }
            throw th;
        }

        public final void rV9(io.grpc.SPz sPz, boolean z2, io.grpc.QJ qj) {
            v(sPz, l3D.j.PROCESSED, z2, qj);
        }

        public final void s7N(l3D l3d) {
            t1.Xo.S(this.gh == null, "Already called setListener");
            this.gh = (l3D) t1.Xo.ck(l3d, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        }

        public final void v(io.grpc.SPz sPz, l3D.j jVar, boolean z2, io.grpc.QJ qj) {
            t1.Xo.ck(sPz, "status");
            t1.Xo.ck(qj, "trailers");
            if (!this.Ik || z2) {
                this.Ik = true;
                this.f68620r = sPz.HI();
                o();
                if (this.ty) {
                    this.HI = null;
                    iF(sPz, jVar, qj);
                } else {
                    this.HI = new RunnableC0974j(sPz, jVar, qj);
                    gh(z2);
                }
            }
        }

        protected w6(int i2, h6y h6yVar, Pp pp) {
            super(i2, h6yVar, pp);
            this.az = JP.QJ.t();
            this.ty = false;
            this.xMQ = (h6y) t1.Xo.ck(h6yVar, "statsTraceCtx");
        }
    }

    protected abstract w6 ViF();

    protected abstract n XQ();

    @Override // io.grpc.internal.M5.Ml
    public final void J2(N n2, boolean z2, boolean z3, int i2) {
        t1.Xo.O(n2 != null || z2, "null frame before EOS");
        XQ().nr(n2, z2, z3, i2);
    }

    @Override // io.grpc.internal.QJ
    public void KN(int i2) {
        this.rl.KN(i2);
    }

    protected Pp WPU() {
        return this.f68615n;
    }

    public final boolean aYN() {
        return this.f68616t;
    }

    @Override // io.grpc.internal.QJ
    public void mUb(JP.eO eOVar) {
        io.grpc.QJ qj = this.f68614O;
        QJ.CN3 cn3 = psW.nr;
        qj.O(cn3);
        this.f68614O.ck(cn3, Long.valueOf(Math.max(0L, eOVar.gh(TimeUnit.NANOSECONDS))));
    }

    @Override // io.grpc.internal.w6
    protected final h r() {
        return this.rl;
    }

    protected j(IG ig, h6y h6yVar, Pp pp, io.grpc.QJ qj, io.grpc.n nVar, boolean z2) {
        t1.Xo.ck(qj, "headers");
        this.f68615n = (Pp) t1.Xo.ck(pp, "transportTracer");
        this.f68616t = psW.ck(nVar);
        this.nr = z2;
        if (!z2) {
            this.rl = new M5(this, ig, h6yVar);
            this.f68614O = qj;
        } else {
            this.rl = new C0973j(qj, h6yVar);
        }
    }

    @Override // io.grpc.internal.QJ
    public final void HI() {
        if (!ViF().X()) {
            ViF().wTp();
            Ik();
        }
    }

    @Override // io.grpc.internal.QJ
    public void Uo(int i2) {
        ViF().aYN(i2);
    }

    @Override // io.grpc.internal.QJ
    public final void ck(l3D l3d) {
        ViF().s7N(l3d);
        if (!this.nr) {
            XQ().O(this.f68614O, null);
            this.f68614O = null;
        }
    }

    @Override // io.grpc.internal.QJ
    public final void gh(JP.QJ qj) {
        ViF().N(qj);
    }

    @Override // io.grpc.internal.w6, io.grpc.internal.lS
    public final boolean isReady() {
        if (super.isReady() && !this.J2) {
            return true;
        }
        return false;
    }

    @Override // io.grpc.internal.QJ
    public final void qie(boolean z2) {
        ViF().nHg(z2);
    }

    @Override // io.grpc.internal.QJ
    public final void t(io.grpc.SPz sPz) {
        t1.Xo.O(!sPz.HI(), "Should not cancel with OK status");
        this.J2 = true;
        XQ().t(sPz);
    }

    @Override // io.grpc.internal.QJ
    public final void ty(yg ygVar) {
        ygVar.rl("remote_addr", xMQ().rl(io.grpc.fuX.f68231n));
    }
}
