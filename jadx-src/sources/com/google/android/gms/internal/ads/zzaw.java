package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzaw {
    private final zzr zza = new zzr();

    public final zzaw zzc(int... iArr) {
        for (int i2 = 0; i2 < 20; i2++) {
            this.zza.zza(iArr[i2]);
        }
        return this;
    }

    public final zzaw zza(int i2) {
        this.zza.zza(i2);
        return this;
    }

    public final zzaw zzb(int i2, boolean z2) {
        if (z2) {
            this.zza.zza(i2);
        }
        return this;
    }

    public final zzax zze() {
        return new zzax(this.zza.zzb(), null);
    }

    public final zzaw zzd(zzax zzaxVar) {
        zzs zzsVarZza = zzaxVar.zza();
        for (int i2 = 0; i2 < zzsVarZza.zzb(); i2++) {
            this.zza.zza(zzsVarZza.zzc(i2));
        }
        return this;
    }
}
