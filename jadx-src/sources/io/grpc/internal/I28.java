package io.grpc.internal;

import JP.InterfaceC1378z;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.grpc.internal.Wre;
import io.grpc.internal.tI;
import io.grpc.internal.xZD;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class I28 implements ci {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final xZD f68272O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final xZD.n f68273n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final io.grpc.internal.Wre f68274t;

    private class CN3 implements tI.j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Runnable f68276n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f68277t;

        /* synthetic */ CN3(I28 i28, Runnable runnable, j jVar) {
            this(runnable);
        }

        private CN3(Runnable runnable) {
            this.f68277t = false;
            this.f68276n = runnable;
        }

        private void n() {
            if (this.f68277t) {
                return;
            }
            this.f68276n.run();
            this.f68277t = true;
        }

        @Override // io.grpc.internal.tI.j
        public InputStream next() {
            n();
            return I28.this.f68274t.J2();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.I28$I28, reason: collision with other inner class name */
    class RunnableC0972I28 implements Runnable {
        RunnableC0972I28() {
        }

        @Override // java.lang.Runnable
        public void run() {
            I28.this.f68272O.close();
        }
    }

    class Ml implements Runnable {
        Ml() {
        }

        @Override // java.lang.Runnable
        public void run() {
            I28.this.f68272O.T();
        }
    }

    private class Wre extends CN3 implements Closeable {
        private final Closeable J2;

        public Wre(Runnable runnable, Closeable closeable) {
            super(I28.this, runnable, null);
            this.J2 = closeable;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.J2.close();
        }
    }

    interface fuX extends Wre.Ml {
    }

    class j implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f68281n;

        j(int i2) {
            this.f68281n = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (I28.this.f68272O.isClosed()) {
                return;
            }
            try {
                I28.this.f68272O.rl(this.f68281n);
            } catch (Throwable th) {
                I28.this.f68274t.nr(th);
                I28.this.f68272O.close();
            }
        }
    }

    class n implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ RGN f68283n;

        n(RGN rgn) {
            this.f68283n = rgn;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                I28.this.f68272O.Z(this.f68283n);
            } catch (Throwable th) {
                I28.this.f68274t.nr(th);
                I28.this.f68272O.close();
            }
        }
    }

    class w6 implements Closeable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ RGN f68285n;

        w6(RGN rgn) {
            this.f68285n = rgn;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f68285n.close();
        }
    }

    @Override // io.grpc.internal.ci
    public void T() {
        this.f68273n.n(new CN3(this, new Ml(), null));
    }

    @Override // io.grpc.internal.ci
    public void Uo(int i2) {
        this.f68272O.Uo(i2);
    }

    @Override // io.grpc.internal.ci
    public void Z(RGN rgn) {
        this.f68273n.n(new Wre(new n(rgn), new w6(rgn)));
    }

    @Override // io.grpc.internal.ci
    public void close() {
        this.f68272O.fcU();
        this.f68273n.n(new CN3(this, new RunnableC0972I28(), null));
    }

    @Override // io.grpc.internal.ci
    public void jB(InterfaceC1378z interfaceC1378z) {
        this.f68272O.jB(interfaceC1378z);
    }

    @Override // io.grpc.internal.ci
    public void rl(int i2) {
        this.f68273n.n(new CN3(this, new j(i2), null));
    }

    I28(xZD.n nVar, fuX fux, xZD xzd) {
        U4 u4 = new U4((xZD.n) t1.Xo.ck(nVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER));
        this.f68273n = u4;
        io.grpc.internal.Wre wre = new io.grpc.internal.Wre(u4, fux);
        this.f68274t = wre;
        xzd.Mx(wre);
        this.f68272O = xzd;
    }
}
