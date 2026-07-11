package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class zzamy {
    public final String zza;
    public final int zzb;

    @Nullable
    @ColorInt
    public final Integer zzc;

    @Nullable
    @ColorInt
    public final Integer zzd;
    public final float zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final int zzj;

    private zzamy(String str, int i2, @Nullable @ColorInt Integer num, @Nullable @ColorInt Integer num2, float f3, boolean z2, boolean z3, boolean z4, boolean z5, int i3) {
        this.zza = str;
        this.zzb = i2;
        this.zzc = num;
        this.zzd = num2;
        this.zze = f3;
        this.zzf = z2;
        this.zzg = z3;
        this.zzh = z4;
        this.zzi = z5;
        this.zzj = i3;
    }

    private static boolean zze(String str) {
        try {
            int i2 = Integer.parseInt(str);
            return i2 == 1 || i2 == -1;
        } catch (NumberFormatException e2) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33);
            sb.append("Failed to parse boolean value: '");
            sb.append(str);
            sb.append("'");
            zzee.zzd("SsaStyle", sb.toString(), e2);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0115 A[Catch: RuntimeException -> 0x00b8, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x00b8, blocks: (B:33:0x00be, B:35:0x00c4, B:39:0x00d4, B:41:0x00d8, B:45:0x00e7, B:47:0x00eb, B:51:0x00fc, B:53:0x0100, B:57:0x0111, B:59:0x0115, B:60:0x011d, B:68:0x013b, B:66:0x012e, B:28:0x009f, B:23:0x008b), top: B:73:0x0081, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0139  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzamy zza(String str, zzamw zzamwVar) {
        zzamy zzamyVar;
        float f3;
        int i2;
        boolean z2;
        int i3;
        int i5;
        zzgrc.zza(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i7 = zzamwVar.zzk;
        if (length != i7) {
            Object[] objArr = {Integer.valueOf(i7), Integer.valueOf(length), str};
            String str2 = zzfj.zza;
            zzee.zzc("SsaStyle", String.format(Locale.US, "Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", objArr));
            return null;
        }
        try {
            String strTrim = strArrSplit[zzamwVar.zza].trim();
            int i8 = zzamwVar.zzb;
            int iZzd = i8 != -1 ? zzd(strArrSplit[i8].trim()) : -1;
            int i9 = zzamwVar.zzc;
            Integer numZzb = i9 != -1 ? zzb(strArrSplit[i9].trim()) : null;
            int i10 = zzamwVar.zzd;
            Integer numZzb2 = i10 != -1 ? zzb(strArrSplit[i10].trim()) : null;
            int i11 = zzamwVar.zze;
            try {
                if (i11 != -1) {
                    String strTrim2 = strArrSplit[i11].trim();
                    try {
                        f3 = Float.parseFloat(strTrim2);
                        zzamyVar = null;
                    } catch (NumberFormatException e2) {
                        zzamyVar = null;
                        StringBuilder sb = new StringBuilder(String.valueOf(strTrim2).length() + 29);
                        sb.append("Failed to parse font size: '");
                        sb.append(strTrim2);
                        sb.append("'");
                        zzee.zzd("SsaStyle", sb.toString(), e2);
                        f3 = -3.4028235E38f;
                    }
                    i2 = zzamwVar.zzf;
                    boolean z3 = false;
                    if (i2 == -1 && zze(strArrSplit[i2].trim())) {
                        z2 = false;
                        z3 = true;
                    } else {
                        z2 = false;
                    }
                    int i12 = zzamwVar.zzg;
                    boolean z4 = (i12 == -1 && zze(strArrSplit[i12].trim())) ? true : z2;
                    int i13 = zzamwVar.zzh;
                    boolean z5 = i13 == -1 && zze(strArrSplit[i13].trim());
                    int i14 = zzamwVar.zzi;
                    boolean z6 = i14 == -1 && zze(strArrSplit[i14].trim());
                    i3 = zzamwVar.zzj;
                    if (i3 == -1) {
                        String strTrim3 = strArrSplit[i3].trim();
                        try {
                            int i15 = Integer.parseInt(strTrim3.trim());
                            if (i15 == 1 || i15 == 3) {
                                i5 = i15;
                            }
                        } catch (NumberFormatException unused) {
                        }
                        zzee.zzc("SsaStyle", "Ignoring unknown BorderStyle: ".concat(String.valueOf(strTrim3)));
                        i5 = -1;
                    } else {
                        i5 = -1;
                    }
                    return new zzamy(strTrim, iZzd, numZzb, numZzb2, f3, z3, z4, z5, z6, i5);
                }
                zzamyVar = null;
                f3 = -3.4028235E38f;
                i2 = zzamwVar.zzf;
                boolean z32 = false;
                if (i2 == -1) {
                    z2 = false;
                }
                int i122 = zzamwVar.zzg;
                if (i122 == -1) {
                }
                int i132 = zzamwVar.zzh;
                if (i132 == -1) {
                }
                int i142 = zzamwVar.zzi;
                if (i142 == -1) {
                }
                i3 = zzamwVar.zzj;
                if (i3 == -1) {
                }
                return new zzamy(strTrim, iZzd, numZzb, numZzb2, f3, z32, z4, z5, z6, i5);
            } catch (RuntimeException e3) {
                e = e3;
                StringBuilder sb2 = new StringBuilder(str.length() + 36);
                sb2.append("Skipping malformed 'Style:' line: '");
                sb2.append(str);
                sb2.append("'");
                zzee.zzd("SsaStyle", sb2.toString(), e);
                return zzamyVar;
            }
        } catch (RuntimeException e4) {
            e = e4;
            zzamyVar = null;
        }
    }

    @Nullable
    @ColorInt
    public static Integer zzb(String str) {
        try {
            long j2 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            zzgrc.zza(j2 <= 4294967295L);
            return Integer.valueOf(Color.argb(zzgxz.zza(((j2 >> 24) & 255) ^ 255), zzgxz.zza(j2 & 255), zzgxz.zza((j2 >> 8) & 255), zzgxz.zza((j2 >> 16) & 255)));
        } catch (IllegalArgumentException e2) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36);
            sb.append("Failed to parse color expression: '");
            sb.append(str);
            sb.append("'");
            zzee.zzd("SsaStyle", sb.toString(), e2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzd(String str) {
        int i2;
        try {
            i2 = Integer.parseInt(str.trim());
        } catch (NumberFormatException unused) {
        }
        switch (i2) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return i2;
            default:
                zzee.zzc("SsaStyle", "Ignoring unknown alignment: ".concat(String.valueOf(str)));
                return -1;
        }
    }
}
