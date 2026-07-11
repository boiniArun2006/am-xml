package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzeqf {
    private final ConcurrentHashMap zza = new ConcurrentHashMap();
    private final zzdvp zzb;

    public final void zza(String str) {
        try {
            this.zza.put(str, this.zzb.zzb(str));
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Couldn't create RTB adapter : ", e2);
        }
    }

    public final zzbvs zzb(String str) {
        ConcurrentHashMap concurrentHashMap = this.zza;
        if (concurrentHashMap.containsKey(str)) {
            return (zzbvs) concurrentHashMap.get(str);
        }
        return null;
    }

    public zzeqf(zzdvp zzdvpVar) {
        this.zzb = zzdvpVar;
    }
}
