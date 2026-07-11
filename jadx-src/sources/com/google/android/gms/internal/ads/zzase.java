package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzase {

    @Nullable
    public final Object zza;

    @Nullable
    public final zzarh zzb;

    @Nullable
    public final zzash zzc;
    public boolean zzd;

    private zzase(zzash zzashVar) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = zzashVar;
    }

    public static zzase zza(@Nullable Object obj, @Nullable zzarh zzarhVar) {
        return new zzase(obj, zzarhVar);
    }

    public static zzase zzb(zzash zzashVar) {
        return new zzase(zzashVar);
    }

    public final boolean zzc() {
        return this.zzc == null;
    }

    private zzase(@Nullable Object obj, @Nullable zzarh zzarhVar) {
        this.zzd = false;
        this.zza = obj;
        this.zzb = zzarhVar;
        this.zzc = null;
    }
}
