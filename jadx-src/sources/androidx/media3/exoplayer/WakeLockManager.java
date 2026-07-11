package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Looper;
import android.os.PowerManager;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.Log;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class WakeLockManager {
    private static final String TAG = "WakeLockManager";
    private static final String WAKE_LOCK_TAG = "ExoPlayer:WakeLockManager";
    private boolean enabled;
    private boolean stayAwake;
    private final HandlerWrapper wakeLockHandler;
    private final WakeLockManagerInternal wakeLockManagerInternal;

    /* JADX INFO: Access modifiers changed from: private */
    static final class WakeLockManagerInternal {
        private final Context applicationContext;

        @Nullable
        private PowerManager.WakeLock wakeLock;

        public void updateWakeLock(boolean z2, boolean z3) {
            if (z2 && this.wakeLock == null) {
                PowerManager powerManager = (PowerManager) this.applicationContext.getSystemService("power");
                if (powerManager == null) {
                    Log.w(WakeLockManager.TAG, "PowerManager is null, therefore not creating the WakeLock.");
                    return;
                } else {
                    PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, WakeLockManager.WAKE_LOCK_TAG);
                    this.wakeLock = wakeLockNewWakeLock;
                    wakeLockNewWakeLock.setReferenceCounted(false);
                }
            }
            PowerManager.WakeLock wakeLock = this.wakeLock;
            if (wakeLock == null) {
                return;
            }
            if (z2 && z3) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }

        public WakeLockManagerInternal(Context context) {
            this.applicationContext = context;
        }
    }

    public void setEnabled(final boolean z2) {
        if (this.enabled == z2) {
            return;
        }
        this.enabled = z2;
        final boolean z3 = this.stayAwake;
        this.wakeLockHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.Um
            @Override // java.lang.Runnable
            public final void run() {
                this.f39414n.wakeLockManagerInternal.updateWakeLock(z2, z3);
            }
        });
    }

    public void setStayAwake(final boolean z2) {
        if (this.stayAwake == z2) {
            return;
        }
        this.stayAwake = z2;
        if (this.enabled) {
            this.wakeLockHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.m8h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39663n.wakeLockManagerInternal.updateWakeLock(true, z2);
                }
            });
        }
    }

    public WakeLockManager(Context context, Looper looper, Clock clock) {
        this.wakeLockManagerInternal = new WakeLockManagerInternal(context.getApplicationContext());
        this.wakeLockHandler = clock.createHandler(looper, null);
    }
}
