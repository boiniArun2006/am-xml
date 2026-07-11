package io.grpc.internal;

import androidx.core.net.Toe.GDEJgAYrPQHfw;
import com.caoccao.javet.exceptions.JavetError;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.grpc.internal.l3D;
import io.grpc.internal.tI;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
class Z implements QJ {
    private Xo J2;
    private long KN;
    private long Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile boolean f68410n;
    private io.grpc.SPz nr;
    private l3D rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private QJ f68411t;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private List f68409O = new ArrayList();
    private List xMQ = new ArrayList();

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    class C implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ InputStream f68412n;

        C(InputStream inputStream) {
            this.f68412n = inputStream;
        }

        @Override // java.lang.Runnable
        public void run() {
            Z.this.f68411t.nr(this.f68412n);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    class CN3 implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f68414n;

        CN3(int i2) {
            this.f68414n = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Z.this.f68411t.KN(this.f68414n);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    class Dsr implements Runnable {
        Dsr() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Z.this.o();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    class I28 implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ JP.QJ f68417n;

        I28(JP.QJ qj) {
            this.f68417n = qj;
        }

        @Override // java.lang.Runnable
        public void run() {
            Z.this.f68411t.gh(this.f68417n);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    class Ml implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f68419n;

        Ml(boolean z2) {
            this.f68419n = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Z.this.f68411t.qie(this.f68419n);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    class Pl implements Runnable {
        Pl() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Z.this.f68411t.HI();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    class Wre implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f68422n;

        Wre(int i2) {
            this.f68422n = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Z.this.f68411t.Uo(this.f68422n);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    private static class Xo implements l3D {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final l3D f68424n;
        private volatile boolean rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private List f68425t = new ArrayList();

        class Ml implements Runnable {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ io.grpc.QJ f68426O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ io.grpc.SPz f68427n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ l3D.j f68428t;

            Ml(io.grpc.SPz sPz, l3D.j jVar, io.grpc.QJ qj) {
                this.f68427n = sPz;
                this.f68428t = jVar;
                this.f68426O = qj;
            }

            @Override // java.lang.Runnable
            public void run() {
                Xo.this.f68424n.nr(this.f68427n, this.f68428t, this.f68426O);
            }
        }

        class j implements Runnable {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ tI.j f68429n;

            j(tI.j jVar) {
                this.f68429n = jVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                Xo.this.f68424n.n(this.f68429n);
            }
        }

        class n implements Runnable {
            n() {
            }

            @Override // java.lang.Runnable
            public void run() {
                Xo.this.f68424n.t();
            }
        }

        class w6 implements Runnable {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ io.grpc.QJ f68432n;

            w6(io.grpc.QJ qj) {
                this.f68432n = qj;
            }

            @Override // java.lang.Runnable
            public void run() {
                Xo.this.f68424n.rl(this.f68432n);
            }
        }

        private void J2(Runnable runnable) {
            synchronized (this) {
                try {
                    if (this.rl) {
                        runnable.run();
                    } else {
                        this.f68425t.add(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void Uo() {
            List list;
            List arrayList = new ArrayList();
            while (true) {
                synchronized (this) {
                    try {
                        if (this.f68425t.isEmpty()) {
                            this.f68425t = null;
                            this.rl = true;
                            return;
                        } else {
                            list = this.f68425t;
                            this.f68425t = arrayList;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                list.clear();
                arrayList = list;
            }
        }

        @Override // io.grpc.internal.tI
        public void n(tI.j jVar) {
            if (this.rl) {
                this.f68424n.n(jVar);
            } else {
                J2(new j(jVar));
            }
        }

        @Override // io.grpc.internal.l3D
        public void nr(io.grpc.SPz sPz, l3D.j jVar, io.grpc.QJ qj) {
            J2(new Ml(sPz, jVar, qj));
        }

        @Override // io.grpc.internal.l3D
        public void rl(io.grpc.QJ qj) {
            J2(new w6(qj));
        }

        @Override // io.grpc.internal.tI
        public void t() {
            if (this.rl) {
                this.f68424n.t();
            } else {
                J2(new n());
            }
        }

        public Xo(l3D l3d) {
            this.f68424n = l3d;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    class aC implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f68434n;

        aC(String str) {
            this.f68434n = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Z.this.f68411t.az(this.f68434n);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    class fuX implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ JP.eO f68436n;

        fuX(JP.eO eOVar) {
            this.f68436n = eOVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Z.this.f68411t.mUb(this.f68436n);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    class j implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f68438n;

        j(int i2) {
            this.f68438n = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Z.this.f68411t.rl(this.f68438n);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Z.this.f68411t.O();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Z.this.f68411t.flush();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    class qz implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ io.grpc.SPz f68442n;

        qz(io.grpc.SPz sPz) {
            this.f68442n = sPz;
        }

        @Override // java.lang.Runnable
        public void run() {
            Z.this.f68411t.t(this.f68442n);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    class w6 implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ JP.C f68444n;

        w6(JP.C c2) {
            this.f68444n = c2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Z.this.f68411t.n(this.f68444n);
        }
    }

    final Runnable WPU(QJ qj) {
        synchronized (this) {
            try {
                if (this.f68411t != null) {
                    return null;
                }
                S((QJ) t1.Xo.ck(qj, "stream"));
                l3D l3d = this.rl;
                if (l3d == null) {
                    this.f68409O = null;
                    this.f68410n = true;
                }
                if (l3d == null) {
                    return null;
                }
                Z(l3d);
                return new Dsr();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected void XQ(io.grpc.SPz sPz) {
    }

    @Override // io.grpc.internal.QJ
    public void ty(yg ygVar) {
        synchronized (this) {
            try {
                if (this.rl == null) {
                    return;
                }
                if (this.f68411t != null) {
                    ygVar.rl("buffered_nanos", Long.valueOf(this.KN - this.Uo));
                    this.f68411t.ty(ygVar);
                } else {
                    ygVar.rl("buffered_nanos", Long.valueOf(System.nanoTime() - this.Uo));
                    ygVar.n("waiting_for_connection");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void S(QJ qj) {
        QJ qj2 = this.f68411t;
        t1.Xo.aYN(qj2 == null, "realStream already set to %s", qj2);
        this.f68411t = qj;
        this.KN = System.nanoTime();
    }

    private void Z(l3D l3d) {
        Iterator it = this.xMQ.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.xMQ = null;
        this.f68411t.ck(l3d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void o() {
        Xo xo;
        List list;
        List arrayList = new ArrayList();
        while (true) {
            synchronized (this) {
                if (this.f68409O.isEmpty()) {
                    break;
                }
                list = this.f68409O;
                this.f68409O = arrayList;
            }
            if (xo == null) {
                xo.Uo();
                return;
            }
            return;
            list.clear();
            arrayList = list;
        }
        this.f68409O = null;
        this.f68410n = true;
        xo = this.J2;
        if (xo == null) {
        }
    }

    private void r(Runnable runnable) {
        t1.Xo.S(this.rl != null, "May only be called after start");
        synchronized (this) {
            try {
                if (this.f68410n) {
                    runnable.run();
                } else {
                    this.f68409O.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.grpc.internal.QJ
    public void HI() {
        t1.Xo.S(this.rl != null, "May only be called after start");
        r(new Pl());
    }

    @Override // io.grpc.internal.QJ
    public void KN(int i2) {
        t1.Xo.S(this.rl == null, "May only be called before start");
        this.xMQ.add(new CN3(i2));
    }

    @Override // io.grpc.internal.lS
    public void O() {
        t1.Xo.S(this.rl == null, "May only be called before start");
        this.xMQ.add(new n());
    }

    @Override // io.grpc.internal.QJ
    public void Uo(int i2) {
        t1.Xo.S(this.rl == null, "May only be called before start");
        this.xMQ.add(new Wre(i2));
    }

    @Override // io.grpc.internal.QJ
    public void az(String str) {
        t1.Xo.S(this.rl == null, "May only be called before start");
        t1.Xo.ck(str, "authority");
        this.xMQ.add(new aC(str));
    }

    @Override // io.grpc.internal.QJ
    public void ck(l3D l3d) {
        io.grpc.SPz sPz;
        boolean z2;
        t1.Xo.ck(l3d, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        t1.Xo.S(this.rl == null, "already started");
        synchronized (this) {
            try {
                sPz = this.nr;
                z2 = this.f68410n;
                if (!z2) {
                    Xo xo = new Xo(l3d);
                    this.J2 = xo;
                    l3d = xo;
                }
                this.rl = l3d;
                this.Uo = System.nanoTime();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (sPz != null) {
            l3d.nr(sPz, l3D.j.PROCESSED, new io.grpc.QJ());
        } else if (z2) {
            Z(l3d);
        }
    }

    @Override // io.grpc.internal.lS
    public void flush() {
        t1.Xo.S(this.rl != null, "May only be called after start");
        if (this.f68410n) {
            this.f68411t.flush();
        } else {
            r(new o());
        }
    }

    @Override // io.grpc.internal.QJ
    public void gh(JP.QJ qj) {
        t1.Xo.S(this.rl == null, "May only be called before start");
        t1.Xo.ck(qj, GDEJgAYrPQHfw.Zzsl);
        this.xMQ.add(new I28(qj));
    }

    @Override // io.grpc.internal.lS
    public boolean isReady() {
        if (this.f68410n) {
            return this.f68411t.isReady();
        }
        return false;
    }

    @Override // io.grpc.internal.QJ
    public void mUb(JP.eO eOVar) {
        t1.Xo.S(this.rl == null, "May only be called before start");
        this.xMQ.add(new fuX(eOVar));
    }

    @Override // io.grpc.internal.lS
    public void n(JP.C c2) {
        t1.Xo.S(this.rl == null, "May only be called before start");
        t1.Xo.ck(c2, "compressor");
        this.xMQ.add(new w6(c2));
    }

    @Override // io.grpc.internal.lS
    public void nr(InputStream inputStream) {
        t1.Xo.S(this.rl != null, "May only be called after start");
        t1.Xo.ck(inputStream, "message");
        if (this.f68410n) {
            this.f68411t.nr(inputStream);
        } else {
            r(new C(inputStream));
        }
    }

    @Override // io.grpc.internal.QJ
    public void qie(boolean z2) {
        t1.Xo.S(this.rl == null, "May only be called before start");
        this.xMQ.add(new Ml(z2));
    }

    @Override // io.grpc.internal.lS
    public void rl(int i2) {
        t1.Xo.S(this.rl != null, "May only be called after start");
        if (this.f68410n) {
            this.f68411t.rl(i2);
        } else {
            r(new j(i2));
        }
    }

    @Override // io.grpc.internal.QJ
    public void t(io.grpc.SPz sPz) {
        boolean z2 = false;
        t1.Xo.S(this.rl != null, "May only be called after start");
        t1.Xo.ck(sPz, JavetError.PARAMETER_REASON);
        synchronized (this) {
            try {
                if (this.f68411t == null) {
                    S(QaP.f68363n);
                    this.nr = sPz;
                } else {
                    z2 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            r(new qz(sPz));
            return;
        }
        o();
        XQ(sPz);
        this.rl.nr(sPz, l3D.j.PROCESSED, new io.grpc.QJ());
    }

    Z() {
    }
}
