package com.google.android.gms.internal.ads;

import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzgrk extends zzgrp {
    @Override // com.google.android.gms.internal.ads.zzgrp
    public final int zzd(int i2) {
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgrp
    public final int zzc(int i2) {
        CharSequence charSequence = ((zzgrp) this).zzb;
        int i3 = i2 + Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE;
        if (i3 < charSequence.length()) {
            return i3;
        }
        return -1;
    }

    zzgrk(zzgrr zzgrrVar, CharSequence charSequence, int i2) {
        super(zzgrrVar, charSequence);
    }
}
