package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzez extends zzdi {
    private final String zza;
    private final String zzb;

    @Override // com.google.android.gms.ads.internal.client.zzdj
    public final String zze() throws RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdj
    public final String zzf() throws RemoteException {
        return this.zzb;
    }

    public zzez(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }
}
