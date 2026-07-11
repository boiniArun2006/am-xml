package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzbms {
    private final com.google.android.gms.ads.formats.zze zza;

    @Nullable
    private final com.google.android.gms.ads.formats.zzd zzb;

    @Nullable
    @GuardedBy
    private zzbln zzc;

    public zzbms(com.google.android.gms.ads.formats.zze zzeVar, @Nullable com.google.android.gms.ads.formats.zzd zzdVar) {
        this.zza = zzeVar;
        this.zzb = zzdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final synchronized zzbln zze(zzblm zzblmVar) {
        zzbln zzblnVar = this.zzc;
        if (zzblnVar != null) {
            return zzblnVar;
        }
        zzbln zzblnVar2 = new zzbln(zzblmVar);
        this.zzc = zzblnVar2;
        return zzblnVar2;
    }

    final /* synthetic */ com.google.android.gms.ads.formats.zze zzc() {
        return this.zza;
    }

    final /* synthetic */ com.google.android.gms.ads.formats.zzd zzd() {
        return this.zzb;
    }

    public final zzblz zza() {
        return new zzbmr(this, null);
    }

    @Nullable
    public final zzblw zzb() {
        if (this.zzb == null) {
            return null;
        }
        return new zzbmq(this, null);
    }
}
