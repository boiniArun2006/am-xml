package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzikx extends CustomTabsServiceConnection {
    private final WeakReference zza;

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        zzbif zzbifVar = (zzbif) this.zza.get();
        if (zzbifVar != null) {
            zzbifVar.zzf(customTabsClient);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbif zzbifVar = (zzbif) this.zza.get();
        if (zzbifVar != null) {
            zzbifVar.zzg();
        }
    }

    public zzikx(zzbif zzbifVar) {
        this.zza = new WeakReference(zzbifVar);
    }
}
