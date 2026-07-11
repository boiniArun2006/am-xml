package com.google.android.gms.internal.ads;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzamz implements zzamf {
    private static final Pattern zza = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    private static final Pattern zzb = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder zzc = new StringBuilder();
    private final ArrayList zzd = new ArrayList();
    private final zzer zze = new zzer();

    @VisibleForTesting
    public static float zzb(int i2) {
        if (i2 == 0) {
            return 0.08f;
        }
        if (i2 == 1) {
            return 0.5f;
        }
        if (i2 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    private static long zzc(Matcher matcher, int i2) {
        String strGroup = matcher.group(i2 + 1);
        long j2 = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i2 + 2);
        strGroup2.getClass();
        long j3 = j2 + (Long.parseLong(strGroup2) * 60000);
        String strGroup3 = matcher.group(i2 + 3);
        strGroup3.getClass();
        long j4 = j3 + (Long.parseLong(strGroup3) * 1000);
        String strGroup4 = matcher.group(i2 + 4);
        if (strGroup4 != null) {
            j4 += Long.parseLong(strGroup4);
        }
        return j4 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018e  */
    @Override // com.google.android.gms.internal.ads.zzamf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(byte[] bArr, int i2, int i3, zzame zzameVar, zzdr zzdrVar) {
        zzer zzerVar;
        String str;
        byte b2;
        byte b4;
        int i5;
        zzcx zzcxVarZzr;
        zzamz zzamzVar = this;
        zzer zzerVar2 = zzamzVar.zze;
        zzerVar2.zzb(bArr, i2 + i3);
        zzerVar2.zzh(i2);
        Charset charsetZzR = zzerVar2.zzR();
        if (charsetZzR == null) {
            charsetZzR = StandardCharsets.UTF_8;
        }
        while (true) {
            String strZzN = zzerVar2.zzN(charsetZzR);
            if (strZzN == null) {
                return;
            }
            if (strZzN.isEmpty()) {
                zzerVar = zzerVar2;
            } else {
                try {
                    Integer.parseInt(strZzN);
                    zzer zzerVar3 = zzamzVar.zze;
                    String strZzN2 = zzerVar3.zzN(charsetZzR);
                    if (strZzN2 == null) {
                        zzee.zzc("SubripParser", "Unexpected end");
                        return;
                    }
                    Matcher matcher = zza.matcher(strZzN2);
                    if (matcher.matches()) {
                        long jZzc = zzc(matcher, 1);
                        long jZzc2 = zzc(matcher, 6);
                        StringBuilder sb = zzamzVar.zzc;
                        int i7 = 0;
                        sb.setLength(0);
                        ArrayList arrayList = zzamzVar.zzd;
                        arrayList.clear();
                        String strZzN3 = zzerVar3.zzN(charsetZzR);
                        while (!TextUtils.isEmpty(strZzN3)) {
                            if (sb.length() > 0) {
                                sb.append("<br>");
                            }
                            String strTrim = strZzN3.trim();
                            StringBuilder sb2 = new StringBuilder(strTrim);
                            Matcher matcher2 = zzb.matcher(strTrim);
                            int i8 = i7;
                            while (matcher2.find()) {
                                String strGroup = matcher2.group();
                                arrayList.add(strGroup);
                                int iStart = matcher2.start() - i8;
                                int length = strGroup.length();
                                sb2.replace(iStart, iStart + length, "");
                                i8 += length;
                                zzerVar2 = zzerVar2;
                            }
                            sb.append(sb2.toString());
                            strZzN3 = zzerVar3.zzN(charsetZzR);
                            i7 = 0;
                        }
                        zzerVar = zzerVar2;
                        Spanned spannedFromHtml = Html.fromHtml(sb.toString());
                        int i9 = 0;
                        while (true) {
                            if (i9 < arrayList.size()) {
                                str = (String) arrayList.get(i9);
                                if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                    i9++;
                                }
                            } else {
                                str = null;
                            }
                        }
                        zzcw zzcwVar = new zzcw();
                        zzcwVar.zza(spannedFromHtml);
                        if (str == null) {
                            zzcxVarZzr = zzcwVar.zzr();
                        } else {
                            switch (str.hashCode()) {
                                case -685620710:
                                    b2 = !str.equals("{\\an1}") ? (byte) -1 : (byte) 0;
                                    break;
                                case -685620648:
                                    if (str.equals("{\\an3}")) {
                                        b2 = 3;
                                        break;
                                    }
                                    break;
                                case -685620617:
                                    if (str.equals("{\\an4}")) {
                                        b2 = 1;
                                        break;
                                    }
                                    break;
                                case -685620555:
                                    if (str.equals("{\\an6}")) {
                                        b2 = 4;
                                        break;
                                    }
                                    break;
                                case -685620524:
                                    if (str.equals("{\\an7}")) {
                                        b2 = 2;
                                        break;
                                    }
                                    break;
                                case -685620462:
                                    if (str.equals("{\\an9}")) {
                                        b2 = 5;
                                        break;
                                    }
                                    break;
                            }
                            if (b2 == 0 || b2 == 1 || b2 == 2) {
                                zzcwVar.zzj(0);
                            } else if (b2 == 3 || b2 == 4 || b2 == 5) {
                                zzcwVar.zzj(2);
                            } else {
                                zzcwVar.zzj(1);
                            }
                            switch (str.hashCode()) {
                                case -685620710:
                                    b4 = !str.equals("{\\an1}") ? (byte) -1 : (byte) 0;
                                    break;
                                case -685620679:
                                    if (str.equals("{\\an2}")) {
                                        b4 = 1;
                                        break;
                                    }
                                    break;
                                case -685620648:
                                    if (str.equals("{\\an3}")) {
                                        b4 = 2;
                                        break;
                                    }
                                    break;
                                case -685620524:
                                    if (str.equals("{\\an7}")) {
                                        b4 = 3;
                                        break;
                                    }
                                    break;
                                case -685620493:
                                    if (str.equals("{\\an8}")) {
                                        b4 = 4;
                                        break;
                                    }
                                    break;
                                case -685620462:
                                    if (str.equals("{\\an9}")) {
                                        b4 = 5;
                                        break;
                                    }
                                    break;
                            }
                            if (b4 == 0 || b4 == 1) {
                                i5 = 2;
                            } else if (b4 != 2) {
                                if (b4 == 3 || b4 == 4 || b4 == 5) {
                                    zzcwVar.zzg(0);
                                } else {
                                    zzcwVar.zzg(1);
                                }
                                zzcwVar.zzi(zzb(zzcwVar.zzk()));
                                zzcwVar.zzf(zzb(zzcwVar.zzh()), 0);
                                zzcxVarZzr = zzcwVar.zzr();
                            } else {
                                i5 = 2;
                            }
                            zzcwVar.zzg(i5);
                            zzcwVar.zzi(zzb(zzcwVar.zzk()));
                            zzcwVar.zzf(zzb(zzcwVar.zzh()), 0);
                            zzcxVarZzr = zzcwVar.zzr();
                        }
                        zzdrVar.zza(new zzalx(zzguf.zzj(zzcxVarZzr), jZzc, jZzc2 - jZzc));
                    } else {
                        zzerVar = zzerVar2;
                        zzee.zzc("SubripParser", "Skipping invalid timing: ".concat(strZzN2));
                    }
                } catch (NumberFormatException unused) {
                    zzerVar = zzerVar2;
                    zzee.zzc("SubripParser", "Skipping invalid index: ".concat(strZzN));
                }
            }
            zzamzVar = this;
            zzerVar2 = zzerVar;
        }
    }
}
