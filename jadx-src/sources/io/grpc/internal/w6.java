package io.grpc.internal;

import JP.Dsr;
import JP.InterfaceC1378z;
import io.grpc.internal.I28;
import io.grpc.internal.tI;
import io.grpc.internal.xZD;
import java.io.InputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class w6 implements lS {

    public static abstract class j implements I28.fuX, xZD.n {
        private int J2;
        private boolean KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final xZD f68791O;
        private boolean Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private ci f68792n;
        private final Pp nr;
        private final Object rl = new Object();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final h6y f68793t;

        /* JADX INFO: renamed from: io.grpc.internal.w6$j$j, reason: collision with other inner class name */
        class RunnableC0977j implements Runnable {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ L3.n f68795n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ int f68796t;

            RunnableC0977j(L3.n nVar, int i2) {
                this.f68795n = nVar;
                this.f68796t = i2;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    L3.I28 i28KN = L3.w6.KN("AbstractStream.request");
                    try {
                        L3.w6.O(this.f68795n);
                        j.this.f68792n.rl(this.f68796t);
                        if (i28KN != null) {
                            i28KN.close();
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    j.this.nr(th);
                }
            }
        }

        protected abstract tI HI();

        /* JADX INFO: Access modifiers changed from: private */
        public void Ik(int i2) {
            synchronized (this.rl) {
                this.J2 += i2;
            }
        }

        private void ck() {
            boolean zTy;
            synchronized (this.rl) {
                zTy = ty();
            }
            if (zTy) {
                HI().t();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean ty() {
            boolean z2;
            synchronized (this.rl) {
                try {
                    z2 = this.Uo && this.J2 < 32768 && !this.KN;
                } finally {
                }
            }
            return z2;
        }

        protected final void S(InterfaceC1378z interfaceC1378z) {
            this.f68792n.jB(interfaceC1378z);
        }

        protected void WPU(Md md) {
            this.f68791O.z(md);
            this.f68792n = new I28(this, this, this.f68791O);
        }

        final void Z() {
            this.f68791O.Mx(this);
            this.f68792n = this.f68791O;
        }

        final void aYN(int i2) {
            this.f68792n.Uo(i2);
        }

        protected Pp az() {
            return this.nr;
        }

        protected final void gh(boolean z2) {
            if (z2) {
                this.f68792n.close();
            } else {
                this.f68792n.T();
            }
        }

        protected final void o() {
            synchronized (this.rl) {
                this.KN = true;
            }
        }

        protected final void qie(RGN rgn) {
            try {
                this.f68792n.Z(rgn);
            } catch (Throwable th) {
                nr(th);
            }
        }

        public final void rl(int i2) {
            boolean z2;
            synchronized (this.rl) {
                t1.Xo.S(this.Uo, "onStreamAllocated was not called, but it seems the stream is active");
                int i3 = this.J2;
                z2 = false;
                boolean z3 = i3 < 32768;
                int i5 = i3 - i2;
                this.J2 = i5;
                boolean z4 = i5 < 32768;
                if (!z3 && z4) {
                    z2 = true;
                }
            }
            if (z2) {
                ck();
            }
        }

        protected j(int i2, h6y h6yVar, Pp pp) {
            this.f68793t = (h6y) t1.Xo.ck(h6yVar, "statsTraceCtx");
            this.nr = (Pp) t1.Xo.ck(pp, "transportTracer");
            xZD xzd = new xZD(this, Dsr.n.f4494n, i2, h6yVar, pp);
            this.f68791O = xzd;
            this.f68792n = xzd;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void XQ(int i2) {
            J2(new RunnableC0977j(L3.w6.J2(), i2));
        }

        @Override // io.grpc.internal.xZD.n
        public void n(tI.j jVar) {
            HI().n(jVar);
        }

        protected void r() {
            boolean z2 = false;
            if (HI() != null) {
                z2 = true;
            }
            t1.Xo.XQ(z2);
            synchronized (this.rl) {
                t1.Xo.S(!this.Uo, "Already allocated");
                this.Uo = true;
            }
            ck();
        }
    }

    protected abstract j Z();

    protected abstract h r();

    @Override // io.grpc.internal.lS
    public final void nr(InputStream inputStream) {
        t1.Xo.ck(inputStream, "message");
        try {
            if (!r().isClosed()) {
                r().rl(inputStream);
            }
        } finally {
            psW.O(inputStream);
        }
    }

    protected final void Ik() {
        r().close();
    }

    @Override // io.grpc.internal.lS
    public void O() {
        Z().Z();
    }

    @Override // io.grpc.internal.lS
    public final void flush() {
        if (!r().isClosed()) {
            r().flush();
        }
    }

    @Override // io.grpc.internal.lS
    public boolean isReady() {
        return Z().ty();
    }

    @Override // io.grpc.internal.lS
    public final void n(JP.C c2) {
        r().n((JP.C) t1.Xo.ck(c2, "compressor"));
    }

    protected final void o(int i2) {
        Z().Ik(i2);
    }

    @Override // io.grpc.internal.lS
    public final void rl(int i2) {
        Z().XQ(i2);
    }
}
