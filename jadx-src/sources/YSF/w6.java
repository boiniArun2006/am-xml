package YSF;

import android.os.Bundle;
import h1M.CN3;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class w6 implements n, j {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private CountDownLatch f12093O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final I28 f12094n;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final TimeUnit f12095t;
    private final Object nr = new Object();
    private boolean J2 = false;

    @Override // YSF.n
    public void O(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f12093O;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    @Override // YSF.j
    public void n(String str, Bundle bundle) {
        synchronized (this.nr) {
            try {
                CN3.J2().xMQ("Logging event " + str + " to Firebase Analytics with params " + bundle);
                this.f12093O = new CountDownLatch(1);
                this.J2 = false;
                this.f12094n.n(str, bundle);
                CN3.J2().xMQ("Awaiting app exception callback from Analytics...");
                try {
                    if (this.f12093O.await(this.rl, this.f12095t)) {
                        this.J2 = true;
                        CN3.J2().xMQ("App exception callback received from Analytics listener.");
                    } else {
                        CN3.J2().gh("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                    }
                } catch (InterruptedException unused) {
                    CN3.J2().nr("Interrupted while awaiting app exception callback from Analytics listener.");
                }
                this.f12093O = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public w6(I28 i28, int i2, TimeUnit timeUnit) {
        this.f12094n = i28;
        this.rl = i2;
        this.f12095t = timeUnit;
    }
}
