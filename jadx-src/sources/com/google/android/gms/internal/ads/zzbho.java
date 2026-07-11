package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzbho extends zzbhp {
    zzbho() {
    }

    @Nullable
    private static final String zzb(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i3 < str.length() && str.charAt(i3) == ',') {
            i3++;
        }
        while (length > 0) {
            int i5 = length - 1;
            if (str.charAt(i5) != ',') {
                break;
            }
            length = i5;
        }
        if (length < i3) {
            return null;
        }
        if (i3 == 0) {
            if (length == str.length()) {
                return str;
            }
        } else {
            i2 = i3;
        }
        return str.substring(i2, length);
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final String zza(@Nullable String str, String str2) {
        String strZzb = zzb(str);
        String strZzb2 = zzb(str2);
        if (TextUtils.isEmpty(strZzb)) {
            return strZzb2;
        }
        if (TextUtils.isEmpty(strZzb2)) {
            return strZzb;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(strZzb).length() + 1 + String.valueOf(strZzb2).length());
        sb.append(strZzb);
        sb.append(",");
        sb.append(strZzb2);
        return sb.toString();
    }
}
