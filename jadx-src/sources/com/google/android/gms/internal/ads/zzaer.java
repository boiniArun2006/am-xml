package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzaer implements zzagh {
    private final byte[] zza = new byte[4096];

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zze(long j2, int i2, int i3, int i5, @Nullable zzagg zzaggVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzz(zzv zzvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final int zzb(zzj zzjVar, int i2, boolean z2, int i3) throws IOException {
        int iZza = zzjVar.zza(this.zza, 0, Math.min(4096, i2));
        if (iZza != -1) {
            return iZza;
        }
        if (z2) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzd(zzer zzerVar, int i2, int i3) {
        zzerVar.zzk(i2);
    }
}
