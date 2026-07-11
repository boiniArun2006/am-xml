package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcrh implements zzcql {

    @Nullable
    private final CookieManager zza;

    @Override // com.google.android.gms.internal.ads.zzcql
    public final void zza(Map map) {
        CookieManager cookieManager = this.zza;
        if (cookieManager == null) {
            return;
        }
        if (((String) map.get("clear")) == null) {
            String str = (String) map.get("cookie");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            cookieManager.setCookie((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbu), str);
            return;
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbu);
        String cookie = cookieManager.getCookie(str2);
        if (cookie != null) {
            List listZze = zzgrr.zza(zzgqq.zzc(';')).zze(cookie);
            for (int i2 = 0; i2 < listZze.size(); i2++) {
                Iterator it = zzgrr.zza(zzgqq.zzc('=')).zzd((String) listZze.get(i2)).iterator();
                it.getClass();
                if (!it.hasNext()) {
                    StringBuilder sb = new StringBuilder(String.valueOf(0).length() + 70);
                    sb.append("position (0) must be less than the number of elements that remained (");
                    sb.append(0);
                    sb.append(")");
                    throw new IndexOutOfBoundsException(sb.toString());
                }
                cookieManager.setCookie(str2, String.valueOf((String) it.next()).concat(String.valueOf((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbg))));
            }
        }
    }

    public zzcrh(Context context) {
        this.zza = com.google.android.gms.ads.internal.zzt.zzf().zza(context);
    }
}
