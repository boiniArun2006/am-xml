package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzbzz implements Callable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzcab zzb;

    zzbzz(zzcab zzcabVar, Context context) {
        this.zza = context;
        Objects.requireNonNull(zzcabVar);
        this.zzb = zzcabVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0038  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzbzy zzbzyVarZza;
        zzcab zzcabVar = this.zzb;
        WeakHashMap weakHashMapZzb = zzcabVar.zzb();
        Context context = this.zza;
        zzcaa zzcaaVar = (zzcaa) weakHashMapZzb.get(context);
        if (zzcaaVar != null) {
            zzbzyVarZza = zzcaaVar.zza + ((Long) zzbit.zzd.zze()).longValue() < com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() ? new zzbzx(context).zza() : new zzbzx(context, zzcaaVar.zzb).zza();
        }
        zzcabVar.zzb().put(context, new zzcaa(zzcabVar, zzbzyVarZza));
        return zzbzyVarZza;
    }
}
