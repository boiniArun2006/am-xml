package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzeub implements zzfav {
    private final com.google.android.gms.ads.internal.client.zzx zza;
    private final boolean zzb;

    public zzeub(com.google.android.gms.ads.internal.client.zzx zzxVar, boolean z2) {
        this.zza = zzxVar;
        this.zzb = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzdah) obj).zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgt)).booleanValue()) {
            bundle.putBoolean("app_switched", this.zzb);
        }
        com.google.android.gms.ads.internal.client.zzx zzxVar = this.zza;
        if (zzxVar != null) {
            int i2 = zzxVar.zza;
            if (i2 == 1) {
                bundle.putString("avo", TtmlNode.TAG_P);
            } else if (i2 == 2) {
                bundle.putString("avo", CmcdData.STREAM_TYPE_LIVE);
            }
        }
    }
}
