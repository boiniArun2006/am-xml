package androidx.media3.exoplayer;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.Log;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class WifiLockManager {
    private static final String TAG = "WifiLockManager";
    private static final String WIFI_LOCK_TAG = "ExoPlayer:WifiLockManager";
    private boolean enabled;
    private boolean stayAwake;
    private final HandlerWrapper wifiLockHandler;
    private final WifiLockManagerInternal wifiLockManagerInternal;

    /* JADX INFO: Access modifiers changed from: private */
    static final class WifiLockManagerInternal {
        private final Context applicationContext;

        @Nullable
        private WifiManager.WifiLock wifiLock;

        public void updateWifiLock(boolean z2, boolean z3) {
            if (z2 && this.wifiLock == null) {
                WifiManager wifiManager = (WifiManager) this.applicationContext.getApplicationContext().getSystemService("wifi");
                if (wifiManager == null) {
                    Log.w(WifiLockManager.TAG, "WifiManager is null, therefore not creating the WifiLock.");
                    return;
                } else {
                    WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, WifiLockManager.WIFI_LOCK_TAG);
                    this.wifiLock = wifiLockCreateWifiLock;
                    wifiLockCreateWifiLock.setReferenceCounted(false);
                }
            }
            WifiManager.WifiLock wifiLock = this.wifiLock;
            if (wifiLock == null) {
                return;
            }
            if (z2 && z3) {
                wifiLock.acquire();
            } else {
                wifiLock.release();
            }
        }

        public WifiLockManagerInternal(Context context) {
            this.applicationContext = context;
        }
    }

    public void setEnabled(final boolean z2) {
        if (this.enabled == z2) {
            return;
        }
        this.enabled = z2;
        final boolean z3 = this.stayAwake;
        this.wifiLockHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f39431n.wifiLockManagerInternal.updateWifiLock(z2, z3);
            }
        });
    }

    public void setStayAwake(final boolean z2) {
        if (this.stayAwake == z2) {
            return;
        }
        this.stayAwake = z2;
        if (this.enabled) {
            this.wifiLockHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.Dt
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39361n.wifiLockManagerInternal.updateWifiLock(true, z2);
                }
            });
        }
    }

    public WifiLockManager(Context context, Looper looper, Clock clock) {
        this.wifiLockManagerInternal = new WifiLockManagerInternal(context.getApplicationContext());
        this.wifiLockHandler = clock.createHandler(looper, null);
    }
}
