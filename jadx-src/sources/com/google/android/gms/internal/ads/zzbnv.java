package com.google.android.gms.internal.ads;

import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzbnv implements zzboh {
    zzbnv() {
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcjl zzcjlVar = (zzcjl) obj;
        if (map.containsKey(TtmlNode.START)) {
            zzcjlVar.zzas(true);
        }
        if (map.containsKey("stop")) {
            zzcjlVar.zzas(false);
        }
    }
}
