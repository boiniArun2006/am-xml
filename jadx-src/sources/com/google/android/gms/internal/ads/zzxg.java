package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzxg extends zzafk {
    private final zzyb zza;
    private final zzaer zzb;
    private final AtomicReference zzc;

    private final zzagh zzh() {
        return this.zzc.get() == zzxf.DISCARDING ? this.zzb : this.zza;
    }

    final boolean zzf() {
        return this.zzc.get() == zzxf.PASS_THROUGH;
    }

    zzxg(zzyb zzybVar) {
        super(zzybVar);
        this.zza = zzybVar;
        this.zzb = new zzaer();
        this.zzc = new AtomicReference(zzxf.PASS_THROUGH);
    }

    @Override // com.google.android.gms.internal.ads.zzafk, com.google.android.gms.internal.ads.zzagh
    public final int zza(zzj zzjVar, int i2, boolean z2) throws IOException {
        return zzh().zza(zzjVar, i2, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzafk, com.google.android.gms.internal.ads.zzagh
    public final int zzb(zzj zzjVar, int i2, boolean z2, int i3) throws IOException {
        return zzh().zzb(zzjVar, i2, z2, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzafk, com.google.android.gms.internal.ads.zzagh
    public final void zzc(zzer zzerVar, int i2) {
        zzh().zzc(zzerVar, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzafk, com.google.android.gms.internal.ads.zzagh
    public final void zzd(zzer zzerVar, int i2, int i3) {
        zzh().zzd(zzerVar, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzafk, com.google.android.gms.internal.ads.zzagh
    public final void zze(long j2, int i2, int i3, int i5, @Nullable zzagg zzaggVar) {
        zzh().zze(j2, i2, i3, i5, zzaggVar);
        AtomicReference atomicReference = this.zzc;
        if (atomicReference.get() == zzxf.DISCARD_AFTER_NEXT_SAMPLE_METADATA) {
            this.zza.zzg(false);
            atomicReference.set(zzxf.DISCARDING);
        }
    }
}
