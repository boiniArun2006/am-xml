package io.grpc.internal;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.grpc.internal.tI;
import io.grpc.internal.xZD;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class Wre implements xZD.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Ml f68396n;
    private final xZD.n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Queue f68397t = new ArrayDeque();

    public interface Ml {
        void J2(Runnable runnable);
    }

    class j implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f68398n;

        j(int i2) {
            this.f68398n = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Wre.this.rl.t(this.f68398n);
        }
    }

    class n implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f68400n;

        n(boolean z2) {
            this.f68400n = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Wre.this.rl.O(this.f68400n);
        }
    }

    class w6 implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Throwable f68402n;

        w6(Throwable th) {
            this.f68402n = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            Wre.this.rl.nr(this.f68402n);
        }
    }

    public InputStream J2() {
        return (InputStream) this.f68397t.poll();
    }

    @Override // io.grpc.internal.xZD.n
    public void O(boolean z2) {
        this.f68396n.J2(new n(z2));
    }

    @Override // io.grpc.internal.xZD.n
    public void nr(Throwable th) {
        this.f68396n.J2(new w6(th));
    }

    @Override // io.grpc.internal.xZD.n
    public void t(int i2) {
        this.f68396n.J2(new j(i2));
    }

    public Wre(xZD.n nVar, Ml ml) {
        this.rl = (xZD.n) t1.Xo.ck(nVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f68396n = (Ml) t1.Xo.ck(ml, "transportExecutor");
    }

    @Override // io.grpc.internal.xZD.n
    public void n(tI.j jVar) {
        while (true) {
            InputStream next = jVar.next();
            if (next != null) {
                this.f68397t.add(next);
            } else {
                return;
            }
        }
    }
}
