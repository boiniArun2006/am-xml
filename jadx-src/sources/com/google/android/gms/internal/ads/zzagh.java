package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public interface zzagh {
    default void zzN(long j2) {
    }

    default int zza(zzj zzjVar, int i2, boolean z2) throws IOException {
        return zzb(zzjVar, i2, z2, 0);
    }

    int zzb(zzj zzjVar, int i2, boolean z2, int i3) throws IOException;

    default void zzc(zzer zzerVar, int i2) {
        zzd(zzerVar, i2, 0);
    }

    void zzd(zzer zzerVar, int i2, int i3);

    void zze(long j2, int i2, int i3, int i5, @Nullable zzagg zzaggVar);

    void zzz(zzv zzvVar);
}
