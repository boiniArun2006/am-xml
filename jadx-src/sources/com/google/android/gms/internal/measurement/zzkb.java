package com.google.android.gms.internal.measurement;

import android.util.Log;
import com.google.android.gms.ads.identifier.Ov.YmsTEL;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
final class zzkb extends zzkl {
    zzkb(zzkf zzkfVar, String str, Long l2, boolean z2) {
        super(zzkfVar, str, l2, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzkl
    final /* synthetic */ Object zza(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String str = this.zzb;
        String string = obj.toString();
        StringBuilder sb = new StringBuilder(str.length() + 25 + string.length());
        sb.append(YmsTEL.fPRxv);
        sb.append(str);
        sb.append(": ");
        sb.append(string);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
