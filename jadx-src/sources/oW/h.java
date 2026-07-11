package oW;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.internal.p002firebaseauthapi.zzahn;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile int f71498n;
    private final C rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile boolean f71499t;

    public h(com.google.firebase.Wre wre) {
        this(wre.qie(), new C(wre));
    }

    private h(Context context, C c2) {
        this.f71499t = false;
        this.f71498n = 0;
        this.rl = c2;
        BackgroundDetector.initialize((Application) context.getApplicationContext());
        BackgroundDetector.getInstance().addListener(new psW(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean J2() {
        return this.f71498n > 0 && !this.f71499t;
    }

    public final void nr(zzahn zzahnVar) {
        if (zzahnVar == null) {
            return;
        }
        long jZza = zzahnVar.zza();
        if (jZza <= 0) {
            jZza = 3600;
        }
        long jZzb = zzahnVar.zzb() + (jZza * 1000);
        C c2 = this.rl;
        c2.rl = jZzb;
        c2.f71452t = -1L;
        if (J2()) {
            this.rl.t();
        }
    }

    public final void rl() {
        this.rl.rl();
    }

    public final void t(int i2) {
        if (i2 > 0 && this.f71498n == 0) {
            this.f71498n = i2;
            if (J2()) {
                this.rl.t();
            }
        } else if (i2 == 0 && this.f71498n != 0) {
            this.rl.rl();
        }
        this.f71498n = i2;
    }
}
