package KaW;

import JP.DAz;
import KaW.QJ;
import com.google.common.io.BaseEncoding;
import io.grpc.SPz;
import io.grpc.internal.N;
import io.grpc.internal.P;
import io.grpc.internal.h6y;
import io.grpc.internal.j;
import io.grpc.internal.l3D;
import java.io.EOFException;
import java.util.List;
import okio.Buffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
class fuX extends io.grpc.internal.j {
    private static final Buffer ck = new Buffer();
    private boolean HI;
    private final DAz KN;
    private final j az;
    private String gh;
    private final h6y mUb;
    private final n qie;
    private final io.grpc.j ty;
    private final String xMQ;

    class j implements j.n {
        j() {
        }

        @Override // io.grpc.internal.j.n
        public void O(io.grpc.QJ qj, byte[] bArr) {
            L3.I28 i28KN = L3.w6.KN("OkHttpClientStream$Sink.writeHeaders");
            try {
                String str = "/" + fuX.this.KN.t();
                if (bArr != null) {
                    fuX.this.HI = true;
                    str = str + "?" + BaseEncoding.n().O(bArr);
                }
                synchronized (fuX.this.qie.nY) {
                    fuX.this.qie.Y(qj, str);
                }
                if (i28KN != null) {
                    i28KN.close();
                }
            } catch (Throwable th) {
                if (i28KN != null) {
                    try {
                        i28KN.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @Override // io.grpc.internal.j.n
        public void nr(N n2, boolean z2, boolean z3, int i2) {
            Buffer bufferT;
            L3.I28 i28KN = L3.w6.KN("OkHttpClientStream$Sink.writeFrame");
            try {
                if (n2 == null) {
                    bufferT = fuX.ck;
                } else {
                    bufferT = ((eO) n2).t();
                    int size = (int) bufferT.size();
                    if (size > 0) {
                        fuX.this.o(size);
                    }
                }
                synchronized (fuX.this.qie.nY) {
                    fuX.this.qie.GR(bufferT, z2, z3);
                    fuX.this.WPU().O(i2);
                }
                if (i28KN != null) {
                    i28KN.close();
                }
            } catch (Throwable th) {
                if (i28KN != null) {
                    try {
                        i28KN.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @Override // io.grpc.internal.j.n
        public void t(SPz sPz) {
            L3.I28 i28KN = L3.w6.KN("OkHttpClientStream$Sink.cancel");
            try {
                synchronized (fuX.this.qie.nY) {
                    fuX.this.qie.J(sPz, true, null);
                }
                if (i28KN != null) {
                    i28KN.close();
                }
            } catch (Throwable th) {
                if (i28KN != null) {
                    try {
                        i28KN.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    class n extends P implements QJ.n {
        private boolean E2;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        private final QJ f5572N;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        private final KaW.n f5573T;
        private final int ViF;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        private int f5574X;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f5575e;
        private boolean fD;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private List f5576g;
        private boolean iF;
        private final Dsr nHg;
        private final Object nY;
        private int rV9;
        private boolean s7N;
        private Buffer te;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private QJ.w6 f5577v;
        private final L3.Ml wTp;

        public n(int i2, h6y h6yVar, Object obj, KaW.n nVar, QJ qj, Dsr dsr, int i3, String str) {
            super(i2, h6yVar, fuX.this.WPU());
            this.te = new Buffer();
            this.iF = false;
            this.fD = false;
            this.E2 = false;
            this.s7N = true;
            this.rV9 = -1;
            this.nY = t1.Xo.ck(obj, "lock");
            this.f5573T = nVar;
            this.f5572N = qj;
            this.nHg = dsr;
            this.f5575e = i3;
            this.f5574X = i3;
            this.ViF = i3;
            this.wTp = L3.w6.rl(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void GR(Buffer buffer, boolean z2, boolean z3) {
            if (this.E2) {
                return;
            }
            if (!this.s7N) {
                t1.Xo.S(a() != -1, "streamId should be set");
                this.f5572N.nr(z2, this.f5577v, buffer, z3);
            } else {
                this.te.write(buffer, (int) buffer.size());
                this.iF |= z2;
                this.fD |= z3;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void J(SPz sPz, boolean z2, io.grpc.QJ qj) throws EOFException {
            if (this.E2) {
                return;
            }
            this.E2 = true;
            if (!this.s7N) {
                this.nHg.eF(a(), sPz, l3D.j.PROCESSED, z2, ISg.j.CANCEL, qj);
                return;
            }
            this.nHg.k(fuX.this);
            this.f5576g = null;
            this.te.clear();
            this.s7N = false;
            if (qj == null) {
                qj = new io.grpc.QJ();
            }
            rV9(sPz, true, qj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Y(io.grpc.QJ qj, String str) {
            this.f5576g = Ml.rl(qj, str, fuX.this.gh, fuX.this.xMQ, fuX.this.HI, this.nHg.D());
            this.nHg.xg(fuX.this);
        }

        QJ.w6 D() {
            QJ.w6 w6Var;
            synchronized (this.nY) {
                w6Var = this.f5577v;
            }
            return w6Var;
        }

        @Override // io.grpc.internal.Wre.Ml
        public void J2(Runnable runnable) {
            synchronized (this.nY) {
                runnable.run();
            }
        }

        public void Nxk(int i2) {
            t1.Xo.WPU(this.rV9 == -1, "the stream has been started with id %s", i2);
            this.rV9 = i2;
            this.f5577v = this.f5572N.t(this, i2);
            fuX.this.qie.r();
            if (this.s7N) {
                this.f5573T.W(fuX.this.HI, false, this.rV9, 0, this.f5576g);
                fuX.this.mUb.t();
                this.f5576g = null;
                if (this.te.size() > 0) {
                    this.f5572N.nr(this.iF, this.f5577v, this.te, this.fD);
                }
                this.s7N = false;
            }
        }

        int a() {
            return this.rV9;
        }

        L3.Ml k() {
            return this.wTp;
        }

        @Override // io.grpc.internal.xZD.n
        public void t(int i2) {
            int i3 = this.f5574X - i2;
            this.f5574X = i3;
            float f3 = i3;
            int i5 = this.ViF;
            if (f3 <= i5 * 0.5f) {
                int i7 = i5 - i3;
                this.f5575e += i7;
                this.f5574X = i3 + i7;
                this.f5573T.windowUpdate(a(), i7);
            }
        }

        public void z(List list, boolean z2) {
            if (z2) {
                p5(l3D.t(list));
            } else {
                M7(l3D.n(list));
            }
        }

        private void I() {
            if (!X()) {
                this.nHg.eF(a(), null, l3D.j.PROCESSED, false, ISg.j.CANCEL, null);
            } else {
                this.nHg.eF(a(), null, l3D.j.PROCESSED, false, null, null);
            }
        }

        @Override // io.grpc.internal.P, io.grpc.internal.j.w6, io.grpc.internal.xZD.n
        public void O(boolean z2) {
            I();
            super.O(z2);
        }

        @Override // io.grpc.internal.P
        protected void Xw(SPz sPz, boolean z2, io.grpc.QJ qj) throws EOFException {
            J(sPz, z2, qj);
        }

        public void dR0(Buffer buffer, boolean z2, int i2) throws Throwable {
            int size = this.f5575e - (((int) buffer.size()) + i2);
            this.f5575e = size;
            this.f5574X -= i2;
            if (size < 0) {
                this.f5573T.KN(a(), ISg.j.FLOW_CONTROL_ERROR);
                this.nHg.eF(a(), SPz.f68187o.Ik("Received data size exceeded our receiving window size"), l3D.j.PROCESSED, false, null, null);
            } else {
                super.P5(new o(buffer), z2);
            }
        }

        @Override // io.grpc.internal.xZD.n
        public void nr(Throwable th) throws EOFException {
            Xw(SPz.gh(th), true, new io.grpc.QJ());
        }

        @Override // io.grpc.internal.w6.j
        protected void r() {
            super.r();
            az().t();
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    fuX(JP.DAz r11, io.grpc.QJ r12, KaW.n r13, KaW.Dsr r14, KaW.QJ r15, java.lang.Object r16, int r17, int r18, java.lang.String r19, java.lang.String r20, io.grpc.internal.h6y r21, io.grpc.internal.Pp r22, io.grpc.n r23, boolean r24) {
        /*
            r10 = this;
            KaW.z r1 = new KaW.z
            r1.<init>()
            r7 = 0
            if (r24 == 0) goto L19
            boolean r0 = r11.J2()
            if (r0 == 0) goto L19
            r0 = 1
            r6 = r0
            r4 = r12
            r2 = r21
            r3 = r22
            r5 = r23
            r0 = r10
            goto L22
        L19:
            r6 = r7
            r0 = r10
            r4 = r12
            r2 = r21
            r3 = r22
            r5 = r23
        L22:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            KaW.fuX$j r0 = new KaW.fuX$j
            r0.<init>()
            r10.az = r0
            r10.HI = r7
            java.lang.String r0 = "statsTraceCtx"
            r2 = r21
            java.lang.Object r0 = t1.Xo.ck(r2, r0)
            io.grpc.internal.h6y r0 = (io.grpc.internal.h6y) r0
            r10.mUb = r0
            r10.KN = r11
            r3 = r19
            r10.gh = r3
            r3 = r20
            r10.xMQ = r3
            io.grpc.j r3 = r14.xMQ()
            r10.ty = r3
            KaW.fuX$n r0 = new KaW.fuX$n
            java.lang.String r9 = r11.t()
            r1 = r10
            r5 = r13
            r7 = r14
            r6 = r15
            r4 = r16
            r8 = r18
            r3 = r2
            r2 = r17
            r0.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r10.qie = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: KaW.fuX.<init>(JP.DAz, io.grpc.QJ, KaW.n, KaW.Dsr, KaW.QJ, java.lang.Object, int, int, java.lang.String, java.lang.String, io.grpc.internal.h6y, io.grpc.internal.Pp, io.grpc.n, boolean):void");
    }

    @Override // io.grpc.internal.QJ
    public void az(String str) {
        this.gh = (String) t1.Xo.ck(str, "authority");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.internal.j
    /* JADX INFO: renamed from: nY, reason: merged with bridge method [inline-methods] */
    public j XQ() {
        return this.az;
    }

    boolean rV9() {
        return this.HI;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.internal.w6
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public n Z() {
        return this.qie;
    }

    public DAz.Ml wTp() {
        return this.KN.O();
    }

    @Override // io.grpc.internal.QJ
    public io.grpc.j xMQ() {
        return this.ty;
    }
}
