package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class zzamu {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;

    private zzamu(int i2, int i3, int i5, int i7, int i8, int i9) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = i5;
        this.zzd = i7;
        this.zze = i8;
        this.zzf = i9;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    public static zzamu zza(String str) {
        byte b2;
        zzgrc.zza(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i2 = 0;
        int i3 = -1;
        int i5 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        while (true) {
            int length = strArrSplit.length;
            if (i2 >= length) {
                if (i5 == -1 || i7 == -1 || i9 == -1) {
                    return null;
                }
                return new zzamu(i3, i5, i7, i8, i9, length);
            }
            String strZza = zzgql.zza(strArrSplit[i2].trim());
            switch (strZza.hashCode()) {
                case 100571:
                    b2 = !strZza.equals(TtmlNode.END) ? (byte) -1 : (byte) 2;
                    break;
                case 3556653:
                    b2 = !strZza.equals("text") ? (byte) -1 : (byte) 4;
                    break;
                case 102749521:
                    b2 = !strZza.equals("layer") ? (byte) -1 : (byte) 0;
                    break;
                case 109757538:
                    b2 = !strZza.equals(TtmlNode.START) ? (byte) -1 : (byte) 1;
                    break;
                case 109780401:
                    b2 = !strZza.equals("style") ? (byte) -1 : (byte) 3;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 == 0) {
                i3 = i2;
            } else if (b2 == 1) {
                i5 = i2;
            } else if (b2 == 2) {
                i7 = i2;
            } else if (b2 == 3) {
                i8 = i2;
            } else if (b2 == 4) {
                i9 = i2;
            }
            i2++;
        }
    }
}
