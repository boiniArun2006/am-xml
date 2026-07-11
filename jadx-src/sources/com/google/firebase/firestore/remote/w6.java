package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.remote.w6;
import io.grpc.QJ;
import io.grpc.SPz;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import wqP.I28;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
abstract class w6 {
    private static final long HI;
    private static final long Ik;
    private static final long ck;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f60461r;
    private static final long ty;
    private final wqP.I28 J2;
    private final I28.Ml KN;
    private final I28.Ml Uo;
    final Pe.eO az;
    private JP.I28 gh;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private I28.n f60463n;
    private final JP.DAz nr;
    final wqP.Xo qie;
    private I28.n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final QJ f60464t;
    private Pe.Xo xMQ = Pe.Xo.Initial;
    private long mUb = 0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final n f60462O = new n();

    class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final long f60465n;

        j(long j2) {
            this.f60465n = j2;
        }

        void n(Runnable runnable) {
            w6.this.J2.ty();
            if (w6.this.mUb == this.f60465n) {
                runnable.run();
            } else {
                wqP.QJ.n(w6.this.getClass().getSimpleName(), "stream callback skipped by CloseGuardedRunner.", new Object[0]);
            }
        }
    }

    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w6.this.mUb();
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.firestore.remote.w6$w6, reason: collision with other inner class name */
    class C0804w6 implements InterfaceC1911c {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final j f60467n;
        private int rl = 0;

        C0804w6(j jVar) {
            this.f60467n = jVar;
        }

        public static /* synthetic */ void KN(C0804w6 c0804w6) {
            wqP.QJ.n(w6.this.getClass().getSimpleName(), "(%x) Stream is open", Integer.valueOf(System.identityHashCode(w6.this)));
            w6.this.r();
        }

        @Override // com.google.firebase.firestore.remote.InterfaceC1911c
        public void n(final io.grpc.SPz sPz) {
            this.f60467n.n(new Runnable() { // from class: com.google.firebase.firestore.remote.CN3
                @Override // java.lang.Runnable
                public final void run() {
                    w6.C0804w6.O(this.f60372n, sPz);
                }
            });
        }

        @Override // com.google.firebase.firestore.remote.InterfaceC1911c
        public void nr(final Object obj) {
            final int i2 = this.rl + 1;
            this.f60467n.n(new Runnable() { // from class: com.google.firebase.firestore.remote.I28
                @Override // java.lang.Runnable
                public final void run() {
                    w6.C0804w6.Uo(this.f60387n, i2, obj);
                }
            });
            this.rl = i2;
        }

        @Override // com.google.firebase.firestore.remote.InterfaceC1911c
        public void rl() {
            this.f60467n.n(new Runnable() { // from class: com.google.firebase.firestore.remote.Ml
                @Override // java.lang.Runnable
                public final void run() {
                    w6.C0804w6.KN(this.f60389n);
                }
            });
        }

        @Override // com.google.firebase.firestore.remote.InterfaceC1911c
        public void t(final io.grpc.QJ qj) {
            this.f60467n.n(new Runnable() { // from class: com.google.firebase.firestore.remote.Wre
                @Override // java.lang.Runnable
                public final void run() {
                    w6.C0804w6.J2(this.f60407n, qj);
                }
            });
        }

        public static /* synthetic */ void J2(C0804w6 c0804w6, io.grpc.QJ qj) {
            c0804w6.getClass();
            if (wqP.QJ.t()) {
                HashMap map = new HashMap();
                for (String str : qj.mUb()) {
                    if (Pl.nr.contains(str.toLowerCase(Locale.ENGLISH))) {
                        map.put(str, (String) qj.Uo(QJ.CN3.O(str, io.grpc.QJ.f68177O)));
                    }
                }
                if (!map.isEmpty()) {
                    wqP.QJ.n(w6.this.getClass().getSimpleName(), "(%x) Stream received headers: %s", Integer.valueOf(System.identityHashCode(w6.this)), map);
                }
            }
        }

        public static /* synthetic */ void O(C0804w6 c0804w6, io.grpc.SPz sPz) {
            c0804w6.getClass();
            if (sPz.HI()) {
                wqP.QJ.n(w6.this.getClass().getSimpleName(), "(%x) Stream closed.", Integer.valueOf(System.identityHashCode(w6.this)));
            } else {
                wqP.QJ.nr(w6.this.getClass().getSimpleName(), "(%x) Stream closed with status: %s.", Integer.valueOf(System.identityHashCode(w6.this)), sPz);
            }
            w6.this.gh(sPz);
        }

        public static /* synthetic */ void Uo(C0804w6 c0804w6, int i2, Object obj) {
            c0804w6.getClass();
            if (wqP.QJ.t()) {
                wqP.QJ.n(w6.this.getClass().getSimpleName(), "(%x) Stream received (%s): %s", Integer.valueOf(System.identityHashCode(w6.this)), Integer.valueOf(i2), obj);
            }
            if (i2 == 1) {
                w6.this.ck(obj);
            } else {
                w6.this.Ik(obj);
            }
        }
    }

    public abstract void Ik(Object obj);

    protected void S() {
    }

    public abstract void ck(Object obj);

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ty = timeUnit.toMillis(1L);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        HI = timeUnit2.toMillis(1L);
        ck = timeUnit2.toMillis(1L);
        Ik = timeUnit.toMillis(10L);
        f60461r = timeUnit.toMillis(10L);
    }

    private void KN() {
        I28.n nVar = this.rl;
        if (nVar != null) {
            nVar.t();
            this.rl = null;
        }
    }

    private void Uo() {
        I28.n nVar = this.f60463n;
        if (nVar != null) {
            nVar.t();
            this.f60463n = null;
        }
    }

    public static /* synthetic */ void n(w6 w6Var) {
        Pe.Xo xo = w6Var.xMQ;
        wqP.n.t(xo == Pe.Xo.Backoff, "State should still be backoff but was %s", xo);
        w6Var.xMQ = Pe.Xo.Initial;
        w6Var.Z();
        wqP.n.t(w6Var.ty(), "Stream should have started", new Object[0]);
    }

    private void o() {
        wqP.n.t(this.xMQ == Pe.Xo.Error, "Should only perform backoff in an error state", new Object[0]);
        this.xMQ = Pe.Xo.Backoff;
        this.qie.rl(new Runnable() { // from class: com.google.firebase.firestore.remote.j
            @Override // java.lang.Runnable
            public final void run() {
                w6.n(this.f60443n);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        this.xMQ = Pe.Xo.Open;
        this.az.rl();
        if (this.f60463n == null) {
            this.f60463n = this.J2.KN(this.KN, Ik, new Runnable() { // from class: com.google.firebase.firestore.remote.n
                @Override // java.lang.Runnable
                public final void run() {
                    w6.rl(this.f60447n);
                }
            });
        }
    }

    protected void WPU(Object obj) {
        this.J2.ty();
        wqP.QJ.n(getClass().getSimpleName(), "(%x) Stream sending: %s", Integer.valueOf(System.identityHashCode(this)), obj);
        KN();
        this.gh.nr(obj);
    }

    public void Z() {
        this.J2.ty();
        wqP.n.t(this.gh == null, "Last call still set", new Object[0]);
        wqP.n.t(this.rl == null, "Idle timer still set", new Object[0]);
        Pe.Xo xo = this.xMQ;
        if (xo == Pe.Xo.Error) {
            o();
            return;
        }
        wqP.n.t(xo == Pe.Xo.Initial, "Already started", new Object[0]);
        this.gh = this.f60464t.J2(this.nr, new C0804w6(new j(this.mUb)));
        this.xMQ = Pe.Xo.Starting;
    }

    public boolean az() {
        this.J2.ty();
        Pe.Xo xo = this.xMQ;
        return xo == Pe.Xo.Open || xo == Pe.Xo.Healthy;
    }

    public boolean ty() {
        this.J2.ty();
        Pe.Xo xo = this.xMQ;
        return xo == Pe.Xo.Starting || xo == Pe.Xo.Backoff || az();
    }

    w6(QJ qj, JP.DAz dAz, wqP.I28 i28, I28.Ml ml, I28.Ml ml2, I28.Ml ml3, Pe.eO eOVar) {
        this.f60464t = qj;
        this.nr = dAz;
        this.J2 = i28;
        this.Uo = ml2;
        this.KN = ml3;
        this.az = eOVar;
        this.qie = new wqP.Xo(i28, ml, ty, 1.5d, HI);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mUb() {
        if (az()) {
            xMQ(Pe.Xo.Initial, io.grpc.SPz.f68184O);
        }
    }

    public static /* synthetic */ void rl(w6 w6Var) {
        if (w6Var.az()) {
            w6Var.xMQ = Pe.Xo.Healthy;
        }
    }

    private void xMQ(Pe.Xo xo, io.grpc.SPz sPz) {
        boolean z2;
        wqP.n.t(ty(), "Only started streams should be closed.", new Object[0]);
        Pe.Xo xo2 = Pe.Xo.Error;
        if (xo != xo2 && !sPz.HI()) {
            z2 = false;
        } else {
            z2 = true;
        }
        wqP.n.t(z2, "Can't provide an error when not in an error state.", new Object[0]);
        this.J2.ty();
        if (Pl.t(sPz)) {
            wqP.Z.ck(new IllegalStateException("The Cloud Firestore client failed to establish a secure connection. This is likely a problem with your app, rather than with Cloud Firestore itself. See https://bit.ly/2XFpdma for instructions on how to enable TLS on Android 4.x devices.", sPz.qie()));
        }
        KN();
        Uo();
        this.qie.t();
        this.mUb++;
        SPz.n nVarAz = sPz.az();
        if (nVarAz == SPz.n.OK) {
            this.qie.O();
        } else if (nVarAz == SPz.n.RESOURCE_EXHAUSTED) {
            wqP.QJ.n(getClass().getSimpleName(), "(%x) Using maximum backoff delay to prevent overloading the backend.", Integer.valueOf(System.identityHashCode(this)));
            this.qie.J2();
        } else if (nVarAz == SPz.n.UNAUTHENTICATED && this.xMQ != Pe.Xo.Healthy) {
            this.f60464t.nr();
        } else if (nVarAz == SPz.n.UNAVAILABLE && ((sPz.qie() instanceof UnknownHostException) || (sPz.qie() instanceof ConnectException))) {
            this.qie.Uo(f60461r);
        }
        if (xo != xo2) {
            wqP.QJ.n(getClass().getSimpleName(), "(%x) Performing stream teardown", Integer.valueOf(System.identityHashCode(this)));
            S();
        }
        if (this.gh != null) {
            if (sPz.HI()) {
                wqP.QJ.n(getClass().getSimpleName(), "(%x) Closing stream client-side", Integer.valueOf(System.identityHashCode(this)));
                this.gh.rl();
            }
            this.gh = null;
        }
        this.xMQ = xo;
        this.az.n(sPz);
    }

    void HI() {
        if (az() && this.rl == null) {
            this.rl = this.J2.KN(this.Uo, ck, this.f60462O);
        }
    }

    public void XQ() {
        if (ty()) {
            xMQ(Pe.Xo.Initial, io.grpc.SPz.f68184O);
        }
    }

    void gh(io.grpc.SPz sPz) {
        wqP.n.t(ty(), "Can't handle server close on non-started stream!", new Object[0]);
        xMQ(Pe.Xo.Error, sPz);
    }

    public void qie() {
        wqP.n.t(!ty(), "Can only inhibit backoff after in a stopped state", new Object[0]);
        this.J2.ty();
        this.xMQ = Pe.Xo.Initial;
        this.qie.O();
    }
}
