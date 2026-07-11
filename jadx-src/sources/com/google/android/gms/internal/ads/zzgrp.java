package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
abstract class zzgrp extends zzgqk {
    final CharSequence zzb;
    int zzc = 0;
    int zzd = Integer.MAX_VALUE;

    abstract int zzc(int i2);

    abstract int zzd(int i2);

    @Override // com.google.android.gms.internal.ads.zzgqk
    protected final /* bridge */ /* synthetic */ Object zza() {
        int iZzd;
        int i2 = this.zzc;
        while (true) {
            int i3 = this.zzc;
            if (i3 == -1) {
                zzb();
                return null;
            }
            int iZzc = zzc(i3);
            if (iZzc == -1) {
                iZzc = this.zzb.length();
                this.zzc = -1;
                iZzd = -1;
            } else {
                iZzd = zzd(iZzc);
                this.zzc = iZzd;
            }
            if (iZzd != i2) {
                if (i2 < iZzc) {
                    this.zzb.charAt(i2);
                }
                if (i2 < iZzc) {
                    this.zzb.charAt(iZzc - 1);
                }
                int i5 = this.zzd;
                if (i5 == 1) {
                    CharSequence charSequence = this.zzb;
                    int length = charSequence.length();
                    this.zzc = -1;
                    if (length > i2) {
                        charSequence.charAt(length - 1);
                    }
                    iZzc = length;
                } else {
                    this.zzd = i5 - 1;
                }
                return this.zzb.subSequence(i2, iZzc).toString();
            }
            int i7 = iZzd + 1;
            this.zzc = i7;
            if (i7 > this.zzb.length()) {
                this.zzc = -1;
            }
        }
    }

    zzgrp(zzgrr zzgrrVar, CharSequence charSequence) {
        this.zzb = charSequence;
    }
}
