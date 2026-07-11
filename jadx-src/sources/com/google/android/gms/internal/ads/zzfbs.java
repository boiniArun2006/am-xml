package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfbs implements zzfav {

    @VisibleForTesting
    final String zza;
    final int zzb;

    /* synthetic */ zzfbs(String str, int i2, byte[] bArr) {
        this.zza = str;
        this.zzb = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzdah zzdahVar = (zzdah) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlR)).booleanValue()) {
            String str = this.zza;
            if (!TextUtils.isEmpty(str)) {
                zzdahVar.zza.putString("topics", str);
            }
            int i2 = this.zzb;
            if (i2 != -1) {
                zzdahVar.zza.putInt("atps", i2);
            }
        }
    }
}
