package com.google.android.gms.internal.ads;

import com.safedk.android.analytics.brandsafety.FileUploadManager;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzbnt implements zzboh {
    zzbnt() {
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcjl zzcjlVar = (zzcjl) obj;
        String str = (String) map.get(FileUploadManager.f61572j);
        if ("pause".equals(str)) {
            zzcjlVar.zzdk();
        } else if ("resume".equals(str)) {
            zzcjlVar.zzdl();
        }
    }
}
