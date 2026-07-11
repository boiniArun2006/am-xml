package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.StringReader;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhja {
    public static zzhyl zzb(String str) throws IOException {
        try {
            zzhzq zzhzqVar = new zzhzq(new StringReader(str));
            zzhzqVar.zza(zzhyq.LEGACY_STRICT);
            return zzhiy.zzb(zzhzqVar);
        } catch (NumberFormatException e2) {
            throw new IOException(e2);
        }
    }

    public static long zzc(Number number) {
        if (number instanceof zzhiz) {
            return Long.parseLong(number.toString());
        }
        throw new IllegalArgumentException("does not contain a parsed number.");
    }

    public static boolean zza(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 != length) {
            char cCharAt = str.charAt(i2);
            int i3 = i2 + 1;
            if (Character.isSurrogate(cCharAt)) {
                if (Character.isLowSurrogate(cCharAt) || i3 == length || !Character.isLowSurrogate(str.charAt(i3))) {
                    return false;
                }
                i2 += 2;
            } else {
                i2 = i3;
            }
        }
        return true;
    }
}
