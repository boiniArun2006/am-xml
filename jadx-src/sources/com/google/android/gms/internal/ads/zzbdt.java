package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzbdt extends com.google.android.gms.ads.internal.client.zzcn {
    private final AppEventListener zza;

    public final AppEventListener zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzb(String str, String str2) {
        this.zza.onAppEvent(str, str2);
    }

    public zzbdt(AppEventListener appEventListener) {
        this.zza = appEventListener;
    }
}
