package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzfr {
    public final String zza;

    private zzfr(int i2, int i3, String str) {
        this.zza = str;
    }

    @Nullable
    public static zzfr zza(zzer zzerVar) {
        String str;
        zzerVar.zzk(2);
        int iZzs = zzerVar.zzs();
        int i2 = iZzs >> 1;
        int i3 = iZzs & 1;
        int iZzs2 = zzerVar.zzs() >> 3;
        if (i2 == 4 || i2 == 5 || i2 == 7 || i2 == 8) {
            str = "dvhe";
        } else if (i2 == 9) {
            str = "dvav";
        } else {
            if (i2 != 10) {
                return null;
            }
            str = "dav1";
        }
        int i5 = iZzs2 | (i3 << 5);
        String str2 = i2 < 10 ? ".0" : ".";
        int length = str2.length() + 4;
        int length2 = String.valueOf(i2).length();
        int length3 = String.valueOf(i5).length();
        String str3 = i5 < 10 ? ".0" : ".";
        StringBuilder sb = new StringBuilder(length + length2 + str3.length() + length3);
        sb.append(str);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        sb.append(i5);
        return new zzfr(i2, i5, sb.toString());
    }
}
