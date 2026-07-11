package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class zzanh {
    @Nullable
    public static zzani zza(@Nullable zzani zzaniVar, @Nullable String[] strArr, Map map) {
        int length;
        int i2 = 0;
        if (zzaniVar == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (zzani) map.get(strArr[0]);
            }
            if (length2 > 1) {
                zzani zzaniVar2 = new zzani();
                while (i2 < length2) {
                    zzaniVar2.zzr((zzani) map.get(strArr[i2]));
                    i2++;
                }
                return zzaniVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                zzaniVar.zzr((zzani) map.get(strArr[0]));
                return zzaniVar;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i2 < length) {
                    zzaniVar.zzr((zzani) map.get(strArr[i2]));
                    i2++;
                }
            }
        }
        return zzaniVar;
    }
}
