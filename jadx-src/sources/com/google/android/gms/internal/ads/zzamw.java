package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class zzamw {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final int zzk;

    private zzamw(int i2, int i3, int i5, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = i5;
        this.zzd = i7;
        this.zze = i8;
        this.zzf = i9;
        this.zzg = i10;
        this.zzh = i11;
        this.zzi = i12;
        this.zzj = i13;
        this.zzk = i14;
    }

    @Nullable
    public static zzamw zza(String str) {
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i2 = 0;
        int i3 = -1;
        int i5 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        while (true) {
            int length = strArrSplit.length;
            if (i2 >= length) {
                if (i3 != -1) {
                    return new zzamw(i3, i5, i7, i8, i9, i10, i11, i12, i13, i14, length);
                }
                return null;
            }
            switch (zzgql.zza(strArrSplit[i2].trim())) {
                case "name":
                    i3 = i2;
                    break;
                case "alignment":
                    i5 = i2;
                    break;
                case "primarycolour":
                    i7 = i2;
                    break;
                case "outlinecolour":
                    i8 = i2;
                    break;
                case "fontsize":
                    i9 = i2;
                    break;
                case "bold":
                    i10 = i2;
                    break;
                case "italic":
                    i11 = i2;
                    break;
                case "underline":
                    i12 = i2;
                    break;
                case "strikeout":
                    i13 = i2;
                    break;
                case "borderstyle":
                    i14 = i2;
                    break;
            }
            i2++;
        }
    }
}
