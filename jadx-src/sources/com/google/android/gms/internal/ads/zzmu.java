package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Deprecated
public final class zzmu {
    private final zzjf zza;

    @Deprecated
    public final zzmu zza(final zzaaj zzaajVar) {
        zzjf zzjfVar = this.zza;
        zzgrc.zzi(!zzjfVar.zzw);
        zzaajVar.getClass();
        zzjfVar.zze = new zzgru() { // from class: com.google.android.gms.internal.ads.zzjc
            @Override // com.google.android.gms.internal.ads.zzgru
            public final /* synthetic */ Object zza() {
                return zzaajVar;
            }
        };
        return this;
    }

    @Deprecated
    public final zzmu zzb(final zzlj zzljVar) {
        zzjf zzjfVar = this.zza;
        zzgrc.zzi(!zzjfVar.zzw);
        zzljVar.getClass();
        zzjfVar.zzf = new zzgru() { // from class: com.google.android.gms.internal.ads.zzjd
            @Override // com.google.android.gms.internal.ads.zzgru
            public final /* synthetic */ Object zza() {
                return zzljVar;
            }
        };
        return this;
    }

    @Deprecated
    public final zzmv zzc() {
        zzjf zzjfVar = this.zza;
        zzgrc.zzi(!zzjfVar.zzw);
        zzjfVar.zzw = true;
        return new zzmv(zzjfVar);
    }

    @Deprecated
    public zzmu(Context context, zzmq zzmqVar) {
        this.zza = new zzjf(context, zzmqVar);
    }
}
