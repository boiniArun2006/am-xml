package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzgri extends zzgrp {
    final /* synthetic */ zzgqq zza;

    @Override // com.google.android.gms.internal.ads.zzgrp
    final int zzd(int i2) {
        return i2 + 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgri(zzgrr zzgrrVar, CharSequence charSequence, zzgqq zzgqqVar) {
        super(zzgrrVar, charSequence);
        this.zza = zzgqqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgrp
    final int zzc(int i2) {
        CharSequence charSequence = ((zzgrp) this).zzb;
        int length = charSequence.length();
        zzgrc.zzn(i2, length, "index");
        while (i2 < length) {
            if (this.zza.zzb(charSequence.charAt(i2))) {
                return i2;
            }
            i2++;
        }
        return -1;
    }
}
