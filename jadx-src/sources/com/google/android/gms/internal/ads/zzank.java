package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzank implements zzamf {
    private final zzer zza = new zzer();
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final float zzf;
    private final int zzg;

    private static void zzb(SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i5, int i7, int i8) {
        if (i2 != i3) {
            int i9 = i8 | 33;
            int i10 = i2 & 1;
            int i11 = i2 & 2;
            boolean z2 = true;
            if (i10 != 0) {
                if (i11 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i5, i7, i9);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i5, i7, i9);
                    z2 = false;
                }
            } else if (i11 != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i5, i7, i9);
            } else {
                z2 = false;
            }
            if ((i2 & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i5, i7, i9);
            } else {
                if (i10 != 0 || z2) {
                    return;
                }
                spannableStringBuilder.setSpan(new StyleSpan(0), i5, i7, i9);
            }
        }
    }

    private static void zzc(SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i5, int i7, int i8) {
        if (i2 != i3) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i2 >>> 8) | ((i2 & 255) << 24)), i5, i7, i8 | 33);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zza(byte[] bArr, int i2, int i3, zzame zzameVar, zzdr zzdrVar) {
        String strZzK;
        int i5;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        zzer zzerVar = this.zza;
        zzerVar.zzb(bArr, i2 + i3);
        zzerVar.zzh(i2);
        int i16 = 1;
        int i17 = 0;
        int i18 = 2;
        zzgrc.zza(zzerVar.zzd() >= 2);
        int iZzt = zzerVar.zzt();
        if (iZzt == 0) {
            strZzK = "";
        } else {
            int iZzg = zzerVar.zzg();
            Charset charsetZzR = zzerVar.zzR();
            int iZzg2 = zzerVar.zzg() - iZzg;
            if (charsetZzR == null) {
                charsetZzR = StandardCharsets.UTF_8;
            }
            strZzK = zzerVar.zzK(iZzt - iZzg2, charsetZzR);
        }
        if (strZzK.isEmpty()) {
            zzdrVar.zza(new zzalx(zzguf.zzi(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strZzK);
        int i19 = this.zzc;
        zzb(spannableStringBuilder, i19, 0, 0, spannableStringBuilder.length(), 16711680);
        int i20 = i19;
        int i21 = this.zzd;
        zzc(spannableStringBuilder, i21, -1, 0, spannableStringBuilder.length(), 16711680);
        int i22 = i21;
        String str = this.zze;
        int length = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fMax = this.zzf;
        while (zzerVar.zzd() >= 8) {
            int iZzg3 = zzerVar.zzg();
            int iZzB = zzerVar.zzB();
            int iZzB2 = zzerVar.zzB();
            if (iZzB2 == 1937013100) {
                zzgrc.zza(zzerVar.zzd() >= i18 ? i16 : i17);
                int iZzt2 = zzerVar.zzt();
                int i23 = i17;
                while (i23 < iZzt2) {
                    zzgrc.zza(zzerVar.zzd() >= 12 ? i16 : i17);
                    int iZzt3 = zzerVar.zzt();
                    int iZzt4 = zzerVar.zzt();
                    zzerVar.zzk(i18);
                    int i24 = iZzt2;
                    int iZzs = zzerVar.zzs();
                    zzerVar.zzk(i16);
                    int iZzB3 = zzerVar.zzB();
                    int i25 = i16;
                    int i26 = i18;
                    if (iZzt4 > spannableStringBuilder.length()) {
                        int length2 = spannableStringBuilder.length();
                        i10 = i20;
                        i11 = i22;
                        StringBuilder sb = new StringBuilder(String.valueOf(iZzt4).length() + 44 + String.valueOf(length2).length() + 2);
                        sb.append("Truncating styl end (");
                        sb.append(iZzt4);
                        sb.append(") to cueText.length() (");
                        sb.append(length2);
                        sb.append(").");
                        zzee.zzc("Tx3gParser", sb.toString());
                        iZzt4 = spannableStringBuilder.length();
                    } else {
                        i10 = i20;
                        i11 = i22;
                    }
                    if (iZzt3 >= iZzt4) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzt3).length() + 36 + String.valueOf(iZzt4).length() + 2);
                        sb2.append("Ignoring styl with start (");
                        sb2.append(iZzt3);
                        sb2.append(") >= end (");
                        sb2.append(iZzt4);
                        sb2.append(").");
                        zzee.zzc("Tx3gParser", sb2.toString());
                        i14 = i10;
                        i13 = i23;
                        i12 = i24;
                        i15 = i11;
                    } else {
                        i12 = i24;
                        i13 = i23;
                        int i27 = i10;
                        zzb(spannableStringBuilder, iZzs, i27, iZzt3, iZzt4, 0);
                        i14 = i27;
                        i15 = i11;
                        zzc(spannableStringBuilder, iZzB3, i15, iZzt3, iZzt4, 0);
                    }
                    i18 = i26;
                    iZzt2 = i12;
                    i20 = i14;
                    i22 = i15;
                    i16 = i25;
                    i23 = i13 + 1;
                    i17 = 0;
                }
                i5 = i16;
                i7 = i22;
                i8 = i20;
                i9 = i18;
            } else {
                i5 = i16;
                int i28 = i18;
                i7 = i22;
                i8 = i20;
                if (iZzB2 == 1952608120 && this.zzb) {
                    i9 = i28;
                    zzgrc.zza(zzerVar.zzd() >= i9 ? i5 : 0);
                    float fZzt = zzerVar.zzt();
                    int i29 = this.zzg;
                    String str2 = zzfj.zza;
                    fMax = Math.max(0.0f, Math.min(fZzt / i29, 0.95f));
                } else {
                    i9 = i28;
                }
            }
            zzerVar.zzh(iZzg3 + iZzB);
            i20 = i8;
            i18 = i9;
            i22 = i7;
            i17 = 0;
            i16 = i5;
        }
        zzcw zzcwVar = new zzcw();
        zzcwVar.zza(spannableStringBuilder);
        zzcwVar.zzf(fMax, 0);
        zzcwVar.zzg(0);
        zzdrVar.zza(new zzalx(zzguf.zzj(zzcwVar.zzr()), -9223372036854775807L, -9223372036854775807L));
    }

    public zzank(List list) {
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.zzc = bArr[24];
            this.zzd = ((bArr[26] & UByte.MAX_VALUE) << 24) | ((bArr[27] & UByte.MAX_VALUE) << 16) | ((bArr[28] & UByte.MAX_VALUE) << 8) | (bArr[29] & UByte.MAX_VALUE);
            this.zze = true == "Serif".equals(zzfj.zzj(bArr, 43, bArr.length + (-43))) ? "serif" : "sans-serif";
            int i2 = bArr[25] * 20;
            this.zzg = i2;
            boolean z2 = (bArr[0] & 32) != 0;
            this.zzb = z2;
            if (z2) {
                this.zzf = Math.max(0.0f, Math.min(((bArr[11] & UByte.MAX_VALUE) | ((bArr[10] & UByte.MAX_VALUE) << 8)) / i2, 0.95f));
                return;
            } else {
                this.zzf = 0.85f;
                return;
            }
        }
        this.zzc = 0;
        this.zzd = -1;
        this.zze = "sans-serif";
        this.zzb = false;
        this.zzf = 0.85f;
        this.zzg = -1;
    }
}
