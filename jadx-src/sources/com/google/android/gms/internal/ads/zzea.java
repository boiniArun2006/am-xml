package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzea {
    public final Object zza;
    private zzr zzb = new zzr();
    private boolean zzc;
    private boolean zzd;

    final /* synthetic */ void zzc(zzdz zzdzVar) {
        this.zzd = true;
        if (zzdzVar == null || !this.zzc) {
            return;
        }
        this.zzc = false;
        zzdzVar.zza(this.zza, this.zzb.zzb());
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzea.class != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzea) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zza(int i2, zzdy zzdyVar) {
        if (this.zzd) {
            return;
        }
        if (i2 != -1) {
            this.zzb.zza(i2);
        }
        this.zzc = true;
        zzdyVar.zza(this.zza);
    }

    public final void zzb(zzdz zzdzVar) {
        if (this.zzd || !this.zzc) {
            return;
        }
        zzs zzsVarZzb = this.zzb.zzb();
        this.zzb = new zzr();
        this.zzc = false;
        zzdzVar.zza(this.zza, zzsVarZzb);
    }

    public zzea(Object obj) {
        this.zza = obj;
    }
}
