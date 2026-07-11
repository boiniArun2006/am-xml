package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.util.SparseArray;
import com.google.common.util.concurrent.fuX;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzjv implements fuX {
    final /* synthetic */ zzog zza;
    final /* synthetic */ zzli zzb;

    zzjv(zzli zzliVar, zzog zzogVar) {
        this.zza = zzogVar;
        Objects.requireNonNull(zzliVar);
        this.zzb = zzliVar;
    }

    private final void zza() {
        zzib zzibVar = this.zzb.zzu;
        SparseArray sparseArrayZzf = zzibVar.zzd().zzf();
        zzog zzogVar = this.zza;
        sparseArrayZzf.put(zzogVar.zzc, Long.valueOf(zzogVar.zzb));
        zzhg zzhgVarZzd = zzibVar.zzd();
        int[] iArr = new int[sparseArrayZzf.size()];
        long[] jArr = new long[sparseArrayZzf.size()];
        for (int i2 = 0; i2 < sparseArrayZzf.size(); i2++) {
            iArr[i2] = sparseArrayZzf.keyAt(i2);
            jArr[i2] = ((Long) sparseArrayZzf.valueAt(i2)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        zzhgVarZzd.zzi.zzb(bundle);
    }

    @Override // com.google.common.util.concurrent.fuX
    public final void onFailure(Throwable th) {
        zzli zzliVar = this.zzb;
        zzliVar.zzg();
        zzliVar.zzal(false);
        zzib zzibVar = zzliVar.zzu;
        int iZzap = (zzibVar.zzc().zzp(null, zzfx.zzaT) ? zzliVar.zzap(th) : 2) - 1;
        if (iZzap == 0) {
            zzibVar.zzaV().zze().zzc("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", zzgt.zzl(zzliVar.zzu.zzv().zzj()), zzgt.zzl(th.toString()));
            zzliVar.zzan(1);
            zzliVar.zzy().add(this.zza);
            return;
        }
        if (iZzap != 1) {
            zzibVar.zzaV().zzb().zzc("registerTriggerAsync failed. Dropping URI. App ID, Throwable", zzgt.zzl(zzliVar.zzu.zzv().zzj()), th);
            zza();
            zzliVar.zzan(1);
            zzliVar.zzz();
            return;
        }
        zzliVar.zzy().add(this.zza);
        if (zzliVar.zzam() > ((Integer) zzfx.zzaw.zzb(null)).intValue()) {
            zzliVar.zzan(1);
            zzibVar.zzaV().zze().zzc("registerTriggerAsync failed. May try later. App ID, throwable", zzgt.zzl(zzliVar.zzu.zzv().zzj()), zzgt.zzl(th.toString()));
        } else {
            zzibVar.zzaV().zze().zzd("registerTriggerAsync failed. App ID, delay in seconds, throwable", zzgt.zzl(zzliVar.zzu.zzv().zzj()), zzgt.zzl(String.valueOf(zzliVar.zzam())), zzgt.zzl(th.toString()));
            zzliVar.zzah(zzliVar.zzam());
            int iZzam = zzliVar.zzam();
            zzliVar.zzan(iZzam + iZzam);
        }
    }

    @Override // com.google.common.util.concurrent.fuX
    public final void onSuccess(Object obj) {
        zzli zzliVar = this.zzb;
        zzliVar.zzg();
        zza();
        zzliVar.zzal(false);
        zzliVar.zzan(1);
        zzliVar.zzu.zzaV().zzj().zzb("Successfully registered trigger URI", this.zza.zza);
        zzliVar.zzz();
    }
}
