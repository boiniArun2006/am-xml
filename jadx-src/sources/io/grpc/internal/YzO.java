package io.grpc.internal;

import JP.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class YzO extends j.AbstractC0157j {
    private final j J2;
    private final Object KN = new Object();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final JP.Xo f68406O = JP.Xo.O();
    private final io.grpc.w6[] Uo;
    Z gh;
    boolean mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC2171c f68407n;
    private final io.grpc.n nr;
    private final JP.DAz rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final io.grpc.QJ f68408t;
    private QJ xMQ;

    public interface j {
        void onComplete();
    }

    private void t(QJ qj) {
        boolean z2;
        t1.Xo.S(!this.mUb, "already finalized");
        this.mUb = true;
        synchronized (this.KN) {
            try {
                if (this.xMQ == null) {
                    this.xMQ = qj;
                    z2 = true;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            this.J2.onComplete();
            return;
        }
        t1.Xo.S(this.gh != null, "delayedStream is null");
        Runnable runnableWPU = this.gh.WPU(qj);
        if (runnableWPU != null) {
            runnableWPU.run();
        }
        this.J2.onComplete();
    }

    @Override // JP.j.AbstractC0157j
    public void n(io.grpc.QJ qj) {
        t1.Xo.S(!this.mUb, "apply() or fail() already called");
        t1.Xo.ck(qj, "headers");
        this.f68408t.az(qj);
        JP.Xo xoRl = this.f68406O.rl();
        try {
            QJ qjT = this.f68407n.t(this.rl, this.f68408t, this.nr, this.Uo);
            this.f68406O.J2(xoRl);
            t(qjT);
        } catch (Throwable th) {
            this.f68406O.J2(xoRl);
            throw th;
        }
    }

    QJ nr() {
        synchronized (this.KN) {
            try {
                QJ qj = this.xMQ;
                if (qj != null) {
                    return qj;
                }
                Z z2 = new Z();
                this.gh = z2;
                this.xMQ = z2;
                return z2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    YzO(InterfaceC2171c interfaceC2171c, JP.DAz dAz, io.grpc.QJ qj, io.grpc.n nVar, j jVar, io.grpc.w6[] w6VarArr) {
        this.f68407n = interfaceC2171c;
        this.rl = dAz;
        this.f68408t = qj;
        this.nr = nVar;
        this.J2 = jVar;
        this.Uo = w6VarArr;
    }

    @Override // JP.j.AbstractC0157j
    public void rl(io.grpc.SPz sPz) {
        t1.Xo.O(!sPz.HI(), "Cannot fail with OK status");
        t1.Xo.S(!this.mUb, "apply() or fail() already called");
        t(new u(psW.HI(sPz), this.Uo));
    }
}
