package mc;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class n implements Runnable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ I28 f70889n;

    public n(I28 i28) {
        this.f70889n = i28;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f70889n.f70868X) {
            try {
                Intent intent = new Intent();
                intent.setClassName(this.f70889n.f70866S, "com.digitalturbine.ignite.cl.IgniteRemoteService");
                I28 i28 = this.f70889n;
                Context context = i28.f70874r;
                if (context != null) {
                    context.bindService(intent, i28, 1);
                }
            } catch (Throwable th) {
                Object[] objArr = {th};
                eh.j jVar = eh.n.rl.f63842n;
                if (jVar != null) {
                    jVar.e("Failed to bind IgniteRemoteService", objArr);
                }
                if (th.getMessage() != null && th.getMessage().contains("Too many bind requests")) {
                } else {
                    Msr.n.rl(Msr.Ml.ONE_DT_GENERAL_ERROR, Ci2.j.n(th, Msr.w6.IGNITE_SERVICE_UNAVAILABLE));
                }
            } finally {
            }
        }
    }
}
