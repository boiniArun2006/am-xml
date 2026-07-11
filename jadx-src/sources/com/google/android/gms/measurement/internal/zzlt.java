package com.google.android.gms.measurement.internal;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzlt {

    @Nullable
    public final String zza;

    @Nullable
    public final String zzb;
    public final long zzc;
    boolean zzd;
    public final boolean zze;
    public final long zzf;

    public zzlt(@Nullable String str, @Nullable String str2, long j2, boolean z2, long j3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j2;
        this.zzd = false;
        this.zze = z2;
        this.zzf = j3;
    }

    public zzlt(@Nullable String str, @Nullable String str2, long j2) {
        this(str, str2, j2, false, 0L);
    }
}
