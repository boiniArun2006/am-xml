package com.google.android.exoplayer2;

import android.content.Context;
import android.net.wifi.WifiManager;
import com.google.android.exoplayer2.util.Log;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class nSC {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final WifiManager f57988n;
    private boolean nr;
    private WifiManager.WifiLock rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f57989t;

    private void t() {
        WifiManager.WifiLock wifiLock = this.rl;
        if (wifiLock == null) {
            return;
        }
        if (this.f57989t && this.nr) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }

    public void n(boolean z2) {
        if (z2 && this.rl == null) {
            WifiManager wifiManager = this.f57988n;
            if (wifiManager == null) {
                Log.w("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.rl = wifiLockCreateWifiLock;
                wifiLockCreateWifiLock.setReferenceCounted(false);
            }
        }
        this.f57989t = z2;
        t();
    }

    public void rl(boolean z2) {
        this.nr = z2;
        t();
    }

    public nSC(Context context) {
        this.f57988n = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }
}
