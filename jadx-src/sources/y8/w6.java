package y8;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class w6 extends y8.n {
    private final Jv.n J2;
    private boolean KN;
    private final ScheduledExecutorService Uo;
    private final Runnable az;
    private long gh;
    private long mUb;
    private n qie;
    private long xMQ;

    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (w6.this) {
                try {
                    w6.this.KN = false;
                    if (!w6.this.Z()) {
                        w6.this.XQ();
                    } else if (w6.this.qie != null) {
                        w6.this.qie.xMQ();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public interface n {
        void xMQ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void XQ() {
        if (!this.KN) {
            this.KN = true;
            this.Uo.schedule(this.az, this.gh, TimeUnit.MILLISECONDS);
        }
    }

    public static y8.n r(y8.j jVar, Jv.n nVar, ScheduledExecutorService scheduledExecutorService) {
        return o(jVar, (n) jVar, nVar, scheduledExecutorService);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Z() {
        return this.J2.now() - this.xMQ > this.mUb;
    }

    public static y8.n o(y8.j jVar, n nVar, Jv.n nVar2, ScheduledExecutorService scheduledExecutorService) {
        return new w6(jVar, nVar, nVar2, scheduledExecutorService);
    }

    @Override // y8.n, y8.j
    public boolean KN(Drawable drawable, Canvas canvas, int i2) {
        this.xMQ = this.J2.now();
        boolean zKN = super.KN(drawable, canvas, i2);
        XQ();
        return zKN;
    }

    private w6(y8.j jVar, n nVar, Jv.n nVar2, ScheduledExecutorService scheduledExecutorService) {
        super(jVar);
        this.KN = false;
        this.mUb = 2000L;
        this.gh = 1000L;
        this.az = new j();
        this.qie = nVar;
        this.J2 = nVar2;
        this.Uo = scheduledExecutorService;
    }
}
