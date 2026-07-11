package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
abstract class zzac extends zzd<String> {
    final CharSequence zza;
    private final zzf zzb;
    private int zze;
    private int zzd = 0;
    private final boolean zzc = false;

    abstract int zza(int i2);

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzd
    protected final /* synthetic */ String zza() {
        int i2 = this.zzd;
        while (true) {
            int i3 = this.zzd;
            if (i3 == -1) {
                zzb();
                return null;
            }
            int iZzb = zzb(i3);
            if (iZzb == -1) {
                iZzb = this.zza.length();
                this.zzd = -1;
            } else {
                this.zzd = zza(iZzb);
            }
            int i5 = this.zzd;
            if (i5 != i2) {
                while (i2 < iZzb && this.zzb.zza(this.zza.charAt(i2))) {
                    i2++;
                }
                while (iZzb > i2 && this.zzb.zza(this.zza.charAt(iZzb - 1))) {
                    iZzb--;
                }
                int i7 = this.zze;
                if (i7 == 1) {
                    iZzb = this.zza.length();
                    this.zzd = -1;
                    while (iZzb > i2 && this.zzb.zza(this.zza.charAt(iZzb - 1))) {
                        iZzb--;
                    }
                } else {
                    this.zze = i7 - 1;
                }
                return this.zza.subSequence(i2, iZzb).toString();
            }
            int i8 = i5 + 1;
            this.zzd = i8;
            if (i8 > this.zza.length()) {
                this.zzd = -1;
            }
        }
    }

    abstract int zzb(int i2);

    protected zzac(zzv zzvVar, CharSequence charSequence) {
        this.zzb = zzvVar.zza;
        this.zze = zzvVar.zzc;
        this.zza = charSequence;
    }
}
