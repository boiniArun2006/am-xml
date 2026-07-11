package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzbsn implements zzbre, zzbsm {
    private final zzbsm zza;
    private final HashSet zzb = new HashSet();

    @Override // com.google.android.gms.internal.ads.zzbre, com.google.android.gms.internal.ads.zzbrp
    public final void zza(String str) {
        this.zza.zza(str);
    }

    public final void zzf() {
        HashSet<AbstractMap.SimpleEntry> hashSet = this.zzb;
        for (AbstractMap.SimpleEntry simpleEntry : hashSet) {
            com.google.android.gms.ads.internal.util.zze.zza("Unregistering eventhandler: ".concat(String.valueOf(((zzboh) simpleEntry.getValue()).toString())));
            this.zza.zzn((String) simpleEntry.getKey(), (zzboh) simpleEntry.getValue());
        }
        hashSet.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public final void zzm(String str, zzboh zzbohVar) {
        this.zza.zzm(str, zzbohVar);
        this.zzb.add(new AbstractMap.SimpleEntry(str, zzbohVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public final void zzn(String str, zzboh zzbohVar) {
        this.zza.zzn(str, zzbohVar);
        this.zzb.remove(new AbstractMap.SimpleEntry(str, zzbohVar));
    }

    public zzbsn(zzbsm zzbsmVar) {
        this.zza = zzbsmVar;
    }
}
