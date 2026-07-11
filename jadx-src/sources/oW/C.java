package oW;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.p002firebaseauthapi.zze;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class C {
    private static Logger KN = new Logger("TokenRefresher", "FirebaseAuth:");
    private Handler J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private HandlerThread f71450O;
    private Runnable Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.google.firebase.Wre f71451n;
    private long nr;
    volatile long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    volatile long f71452t;

    final void nr() {
        int i2 = (int) this.f71452t;
        this.f71452t = (i2 == 30 || i2 == 60 || i2 == 120 || i2 == 240 || i2 == 480) ? 2 * this.f71452t : i2 != 960 ? 30L : 960L;
        this.rl = DefaultClock.getInstance().currentTimeMillis() + (this.f71452t * 1000);
        KN.v("Scheduling refresh for " + this.rl, new Object[0]);
        this.J2.postDelayed(this.Uo, this.f71452t * 1000);
    }

    public final void rl() {
        this.J2.removeCallbacks(this.Uo);
    }

    public final void t() {
        KN.v("Scheduling refresh for " + (this.rl - this.nr), new Object[0]);
        rl();
        this.f71452t = Math.max((this.rl - DefaultClock.getInstance().currentTimeMillis()) - this.nr, 0L) / 1000;
        this.J2.postDelayed(this.Uo, this.f71452t * 1000);
    }

    public C(com.google.firebase.Wre wre) {
        KN.v("Initializing TokenRefresher", new Object[0]);
        com.google.firebase.Wre wre2 = (com.google.firebase.Wre) Preconditions.checkNotNull(wre);
        this.f71451n = wre2;
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        this.f71450O = handlerThread;
        handlerThread.start();
        this.J2 = new zze(this.f71450O.getLooper());
        this.Uo = new Pl(this, wre2.HI());
        this.nr = 300000L;
    }
}
