package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzhi implements zzha {

    @Nullable
    private zzhz zzb;

    @Nullable
    private String zzc;
    private boolean zzf;
    private final zzht zza = new zzht();
    private int zzd = 8000;
    private int zze = 8000;

    public final zzhi zzb(@Nullable String str) {
        this.zzc = str;
        return this;
    }

    public final zzhi zzc(int i2) {
        this.zzd = i2;
        return this;
    }

    public final zzhi zzd(int i2) {
        this.zze = i2;
        return this;
    }

    public final zzhi zze(boolean z2) {
        this.zzf = true;
        return this;
    }

    public final zzhi zzf(@Nullable zzhz zzhzVar) {
        this.zzb = zzhzVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzha
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzhm zza() {
        zzhm zzhmVar = new zzhm(this.zzc, this.zzd, this.zze, this.zzf, false, this.zza, null, false, null);
        zzhz zzhzVar = this.zzb;
        if (zzhzVar != null) {
            zzhmVar.zze(zzhzVar);
        }
        return zzhmVar;
    }
}
