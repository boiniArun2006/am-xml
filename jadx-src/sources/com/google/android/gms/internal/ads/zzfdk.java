package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfdk implements zzikg {
    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }

    public static zzfba zza(Context context, zzcdj zzcdjVar, zzcdk zzcdkVar, Object obj, zzfcc zzfccVar, zzfcw zzfcwVar, zzika zzikaVar, zzika zzikaVar2, zzika zzikaVar3, zzika zzikaVar4, zzika zzikaVar5, zzika zzikaVar6, zzika zzikaVar7, Executor executor, zzfoo zzfooVar, zzdxz zzdxzVar) {
        HashSet hashSet = new HashSet();
        hashSet.add((zzfcp) obj);
        hashSet.add(zzfccVar);
        hashSet.add(zzfcwVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgL)).booleanValue()) {
            hashSet.add((zzfax) zzikaVar.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgM)).booleanValue()) {
            hashSet.add((zzfax) zzikaVar2.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgO)).booleanValue()) {
            hashSet.add((zzfax) zzikaVar4.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgP)).booleanValue()) {
            hashSet.add((zzfax) zzikaVar5.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdQ)).booleanValue()) {
            hashSet.add((zzfax) zzikaVar7.zzb());
        }
        return new zzfba(context, executor, hashSet, zzfooVar, zzdxzVar);
    }
}
