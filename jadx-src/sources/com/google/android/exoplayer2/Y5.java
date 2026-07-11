package com.google.android.exoplayer2;

import android.content.Context;
import android.os.PowerManager;
import com.google.android.exoplayer2.util.Log;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class Y5 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final PowerManager f57513n;
    private boolean nr;
    private PowerManager.WakeLock rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f57514t;

    private void t() {
        PowerManager.WakeLock wakeLock = this.rl;
        if (wakeLock == null) {
            return;
        }
        if (this.f57514t && this.nr) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }

    public void n(boolean z2) {
        if (z2 && this.rl == null) {
            PowerManager powerManager = this.f57513n;
            if (powerManager == null) {
                Log.w("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            } else {
                PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                this.rl = wakeLockNewWakeLock;
                wakeLockNewWakeLock.setReferenceCounted(false);
            }
        }
        this.f57514t = z2;
        t();
    }

    public void rl(boolean z2) {
        this.nr = z2;
        t();
    }

    public Y5(Context context) {
        this.f57513n = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
