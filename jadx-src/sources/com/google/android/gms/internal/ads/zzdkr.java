package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class zzdkr {
    private final zzdmc zza;

    @Nullable
    private final zzcjl zzb;

    public zzdkr(zzdmc zzdmcVar, @Nullable zzcjl zzcjlVar) {
        this.zza = zzdmcVar;
        this.zzb = zzcjlVar;
    }

    public final zzdmc zza() {
        return this.zza;
    }

    @Nullable
    public final zzcjl zzb() {
        return this.zzb;
    }

    @Nullable
    public final View zzc() {
        zzcjl zzcjlVar = this.zzb;
        if (zzcjlVar != null) {
            return zzcjlVar.zzD();
        }
        return null;
    }

    @Nullable
    public final View zzd() {
        zzcjl zzcjlVar = this.zzb;
        if (zzcjlVar == null) {
            return null;
        }
        return zzcjlVar.zzD();
    }

    public final zzdje zzg(Executor executor) {
        final zzcjl zzcjlVar = this.zzb;
        return new zzdje(new zzdgc() { // from class: com.google.android.gms.internal.ads.zzdkp
            @Override // com.google.android.gms.internal.ads.zzdgc
            public final /* synthetic */ void zza() {
                com.google.android.gms.ads.internal.overlay.zzm zzmVarZzL;
                zzcjl zzcjlVar2 = zzcjlVar;
                if (zzcjlVar2 == null || (zzmVarZzL = zzcjlVar2.zzL()) == null) {
                    return;
                }
                zzmVarZzL.zzb();
            }
        }, executor);
    }

    public Set zze(zzczw zzczwVar) {
        return Collections.singleton(new zzdje(zzczwVar, zzcei.zzg));
    }

    public Set zzf(zzczw zzczwVar) {
        return Collections.singleton(new zzdje(zzczwVar, zzcei.zzg));
    }
}
