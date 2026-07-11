package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcrd implements zzcql {
    private final zzfiq zza;

    public zzcrd(zzfiq zzfiqVar) {
        this.zza = zzfiqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcql
    public final void zza(Map map) {
        String str = (String) map.get("render_in_browser");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.zza.zza(Boolean.parseBoolean(str));
        } catch (Exception e2) {
            throw new IllegalStateException("Invalid render_in_browser state", e2);
        }
    }
}
