package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class zzafk implements zzagh {
    private final zzagh zza;

    public zzafk(zzagh zzaghVar) {
        this.zza = zzaghVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzN(long j2) {
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public int zza(zzj zzjVar, int i2, boolean z2) throws IOException {
        return this.zza.zza(zzjVar, i2, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public int zzb(zzj zzjVar, int i2, boolean z2, int i3) throws IOException {
        return this.zza.zzb(zzjVar, i2, z2, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public void zzc(zzer zzerVar, int i2) {
        this.zza.zzc(zzerVar, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public void zzd(zzer zzerVar, int i2, int i3) {
        this.zza.zzd(zzerVar, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public void zze(long j2, int i2, int i3, int i5, @Nullable zzagg zzaggVar) {
        this.zza.zze(j2, i2, i3, i5, zzaggVar);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzz(zzv zzvVar) {
        this.zza.zzz(zzvVar);
    }
}
