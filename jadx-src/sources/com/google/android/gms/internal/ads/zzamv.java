package com.google.android.gms.internal.ads;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzamv implements zzamf {
    private static final Pattern zza = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    private final boolean zzb;

    @Nullable
    private final zzamu zzc;
    private final zzer zzd;
    private Map zze;
    private float zzf;
    private float zzg;

    public zzamv() {
        this(null);
    }

    private static float zzd(int i2) {
        if (i2 == 0) {
            return 0.05f;
        }
        if (i2 != 1) {
            return i2 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x030f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
    @Override // com.google.android.gms.internal.ads.zzamf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(byte[] bArr, int i2, int i3, zzame zzameVar, zzdr zzdrVar) {
        zzamu zzamuVarZza;
        Charset charset;
        zzamu zzamuVar;
        zzer zzerVar;
        int i5;
        long jZzc;
        float f3;
        Layout.Alignment alignment;
        int i7;
        int i8;
        int i9;
        Integer num;
        int i10;
        zzamv zzamvVar = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        zzer zzerVar2 = zzamvVar.zzd;
        zzerVar2.zzb(bArr, i2 + i3);
        zzerVar2.zzh(i2);
        Charset charsetZzR = zzerVar2.zzR();
        if (charsetZzR == null) {
            charsetZzR = StandardCharsets.UTF_8;
        }
        if (zzamvVar.zzb) {
            zzamuVarZza = zzamvVar.zzc;
        } else {
            zzamvVar.zzb(zzerVar2, charsetZzR);
            zzamuVarZza = null;
        }
        while (true) {
            String strZzN = zzerVar2.zzN(charsetZzR);
            if (strZzN == null) {
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    List list = (List) arrayList.get(i11);
                    if (!list.isEmpty()) {
                        if (i11 != arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long jLongValue = ((Long) arrayList2.get(i11)).longValue();
                        zzdrVar.zza(new zzalx(list, jLongValue, ((Long) arrayList2.get(i11 + 1)).longValue() - jLongValue));
                    } else if (i11 == 0) {
                        i11 = 0;
                        if (i11 != arrayList.size() - 1) {
                        }
                    }
                    i11++;
                }
                return;
            }
            if (strZzN.startsWith("Format:")) {
                zzamuVarZza = zzamu.zza(strZzN);
            } else if (strZzN.startsWith("Dialogue:")) {
                if (zzamuVarZza == null) {
                    zzee.zzc("SsaParser", "Skipping dialogue line before complete format: ".concat(strZzN));
                } else {
                    zzgrc.zza(strZzN.startsWith("Dialogue:"));
                    String strSubstring = strZzN.substring(9);
                    int i12 = zzamuVarZza.zzf;
                    String[] strArrSplit = strSubstring.split(",", i12);
                    if (strArrSplit.length != i12) {
                        zzee.zzc("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(strZzN));
                    } else {
                        int i13 = zzamuVarZza.zza;
                        if (i13 != -1) {
                            try {
                                i5 = Integer.parseInt(strArrSplit[i13].trim());
                            } catch (RuntimeException unused) {
                                zzee.zzc("SsaParser", "Fail to parse layer: ".concat(String.valueOf(strArrSplit[zzamuVarZza.zza])));
                                i5 = 0;
                            }
                            jZzc = zzc(strArrSplit[zzamuVarZza.zzb]);
                            if (jZzc != -9223372036854775807L) {
                                zzee.zzc("SsaParser", "Skipping invalid timing: ".concat(strZzN));
                            } else {
                                long jZzc2 = zzc(strArrSplit[zzamuVarZza.zzc]);
                                if (jZzc2 == -9223372036854775807L || jZzc2 <= jZzc) {
                                    charset = charsetZzR;
                                    zzamuVar = zzamuVarZza;
                                    zzerVar = zzerVar2;
                                    zzee.zzc("SsaParser", "Skipping invalid timing: ".concat(strZzN));
                                } else {
                                    Map map = zzamvVar.zze;
                                    zzamy zzamyVar = (map == null || (i10 = zzamuVarZza.zzd) == -1) ? null : (zzamy) map.get(strArrSplit[i10].trim());
                                    String str = strArrSplit[zzamuVarZza.zze];
                                    zzamx zzamxVarZza = zzamx.zza(str);
                                    charset = charsetZzR;
                                    String strReplace = zzamx.zzb(str).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f4 = zzamvVar.zzf;
                                    float f5 = zzamvVar.zzg;
                                    SpannableString spannableString = new SpannableString(strReplace);
                                    zzcw zzcwVar = new zzcw();
                                    zzcwVar.zza(spannableString);
                                    zzcwVar.zzq(i5);
                                    if (zzamyVar != null) {
                                        Integer num2 = zzamyVar.zzc;
                                        zzamuVar = zzamuVarZza;
                                        if (num2 != null) {
                                            zzerVar = zzerVar2;
                                            f3 = f4;
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        } else {
                                            zzerVar = zzerVar2;
                                            f3 = f4;
                                        }
                                        if (zzamyVar.zzj == 3 && (num = zzamyVar.zzd) != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                        }
                                        float f6 = zzamyVar.zze;
                                        if (f6 != -3.4028235E38f && f5 != -3.4028235E38f) {
                                            zzcwVar.zzl(f6 / f5, 1);
                                        }
                                        if (!zzamyVar.zzf) {
                                            i8 = 33;
                                            i9 = 0;
                                            if (zzamyVar.zzg) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        } else if (zzamyVar.zzg) {
                                            i8 = 33;
                                            i9 = 0;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            i8 = 33;
                                            i9 = 0;
                                            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                        }
                                        if (zzamyVar.zzh) {
                                            spannableString.setSpan(new UnderlineSpan(), i9, spannableString.length(), i8);
                                        }
                                        if (zzamyVar.zzi) {
                                            spannableString.setSpan(new StrikethroughSpan(), i9, spannableString.length(), i8);
                                        }
                                    } else {
                                        zzamuVar = zzamuVarZza;
                                        zzerVar = zzerVar2;
                                        f3 = f4;
                                    }
                                    int i14 = zzamxVarZza.zza;
                                    if (i14 == -1) {
                                        i14 = zzamyVar != null ? zzamyVar.zzb : -1;
                                    }
                                    switch (i14) {
                                        case 0:
                                        default:
                                            StringBuilder sb = new StringBuilder(String.valueOf(i14).length() + 19);
                                            sb.append("Unknown alignment: ");
                                            sb.append(i14);
                                            zzee.zzc("SsaParser", sb.toString());
                                        case -1:
                                            alignment = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            break;
                                    }
                                    zzcwVar.zzd(alignment);
                                    int i15 = Integer.MIN_VALUE;
                                    switch (i14) {
                                        case 0:
                                        default:
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(i14).length() + 19);
                                            sb2.append("Unknown alignment: ");
                                            sb2.append(i14);
                                            zzee.zzc("SsaParser", sb2.toString());
                                        case -1:
                                            i7 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i7 = 0;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i7 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i7 = 2;
                                            break;
                                    }
                                    zzcwVar.zzj(i7);
                                    switch (i14) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(i14).length() + 19);
                                            sb3.append("Unknown alignment: ");
                                            sb3.append(i14);
                                            zzee.zzc("SsaParser", sb3.toString());
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i15 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i15 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i15 = 0;
                                            break;
                                    }
                                    zzcwVar.zzg(i15);
                                    PointF pointF = zzamxVarZza.zzb;
                                    if (pointF == null || f5 == -3.4028235E38f || f3 == -3.4028235E38f) {
                                        zzcwVar.zzi(zzd(zzcwVar.zzk()));
                                        zzcwVar.zzf(zzd(zzcwVar.zzh()), 0);
                                    } else {
                                        zzcwVar.zzi(pointF.x / f3);
                                        zzcwVar.zzf(pointF.y / f5, 0);
                                    }
                                    zzcx zzcxVarZzr = zzcwVar.zzr();
                                    int iZze = zze(jZzc2, arrayList2, arrayList);
                                    for (int iZze2 = zze(jZzc, arrayList2, arrayList); iZze2 < iZze; iZze2++) {
                                        ((List) arrayList.get(iZze2)).add(zzcxVarZzr);
                                    }
                                }
                                zzamvVar = this;
                                charsetZzR = charset;
                                zzamuVarZza = zzamuVar;
                                zzerVar2 = zzerVar;
                            }
                        } else {
                            i5 = 0;
                            jZzc = zzc(strArrSplit[zzamuVarZza.zzb]);
                            if (jZzc != -9223372036854775807L) {
                            }
                        }
                    }
                }
                charset = charsetZzR;
                zzamuVar = zzamuVarZza;
                zzerVar = zzerVar2;
                zzamvVar = this;
                charsetZzR = charset;
                zzamuVarZza = zzamuVar;
                zzerVar2 = zzerVar;
            } else {
                charset = charsetZzR;
                zzamuVar = zzamuVarZza;
                zzerVar = zzerVar2;
                zzamvVar = this;
                charsetZzR = charset;
                zzamuVarZza = zzamuVar;
                zzerVar2 = zzerVar;
            }
        }
    }

    public zzamv(@Nullable List list) {
        this.zzf = -3.4028235E38f;
        this.zzg = -3.4028235E38f;
        this.zzd = new zzer();
        if (list == null || list.isEmpty()) {
            this.zzb = false;
            this.zzc = null;
            return;
        }
        this.zzb = true;
        String strZzi = zzfj.zzi((byte[]) list.get(0));
        zzgrc.zza(strZzi.startsWith("Format:"));
        zzamu zzamuVarZza = zzamu.zza(strZzi);
        zzamuVarZza.getClass();
        this.zzc = zzamuVarZza;
        zzb(new zzer((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }

    private static long zzc(String str) {
        Matcher matcher = zza.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        String str2 = zzfj.zza;
        long j2 = Long.parseLong(strGroup) * 3600000000L;
        long j3 = Long.parseLong(matcher.group(2)) * 60000000;
        return j2 + j3 + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzb(zzer zzerVar, Charset charset) {
        while (true) {
            String strZzN = zzerVar.zzN(charset);
            if (strZzN != null) {
                if ("[Script Info]".equalsIgnoreCase(strZzN)) {
                    while (true) {
                        String strZzN2 = zzerVar.zzN(charset);
                        if (strZzN2 == null || (zzerVar.zzd() != 0 && zzerVar.zzp(charset) == 91)) {
                            break;
                        }
                        String[] strArrSplit = strZzN2.split(":");
                        if (strArrSplit.length == 2) {
                            byte b2 = 0;
                            String strZza = zzgql.zza(strArrSplit[0].trim());
                            switch (strZza.hashCode()) {
                                case 1879649548:
                                    if (!strZza.equals("playresx")) {
                                        b2 = -1;
                                    }
                                    break;
                                case 1879649549:
                                    if (strZza.equals("playresy")) {
                                        b2 = 1;
                                        break;
                                    }
                                    break;
                            }
                            if (b2 != 0) {
                                if (b2 == 1) {
                                    try {
                                        this.zzg = Float.parseFloat(strArrSplit[1].trim());
                                    } catch (NumberFormatException unused) {
                                    }
                                }
                            } else {
                                this.zzf = Float.parseFloat(strArrSplit[1].trim());
                            }
                        }
                    }
                } else if ("[V4+ Styles]".equalsIgnoreCase(strZzN)) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    zzamw zzamwVarZza = null;
                    while (true) {
                        String strZzN3 = zzerVar.zzN(charset);
                        if (strZzN3 != null && (zzerVar.zzd() == 0 || zzerVar.zzp(charset) != 91)) {
                            if (strZzN3.startsWith("Format:")) {
                                zzamwVarZza = zzamw.zza(strZzN3);
                            } else if (strZzN3.startsWith("Style:")) {
                                if (zzamwVarZza == null) {
                                    zzee.zzc("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(strZzN3));
                                } else {
                                    zzamy zzamyVarZza = zzamy.zza(strZzN3, zzamwVarZza);
                                    if (zzamyVarZza != null) {
                                        linkedHashMap.put(zzamyVarZza.zza, zzamyVarZza);
                                    }
                                }
                            }
                        }
                    }
                    this.zze = linkedHashMap;
                } else if ("[V4 Styles]".equalsIgnoreCase(strZzN)) {
                    zzee.zzb("SsaParser", "[V4 Styles] are not supported");
                } else if ("[Events]".equalsIgnoreCase(strZzN)) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private static int zze(long j2, List list, List list2) {
        int i2;
        ArrayList arrayList;
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (((Long) list.get(size)).longValue() == j2) {
                    return size;
                }
                if (((Long) list.get(size)).longValue() < j2) {
                    i2 = size + 1;
                    break;
                }
            } else {
                i2 = 0;
                break;
            }
        }
        list.add(i2, Long.valueOf(j2));
        if (i2 == 0) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList((Collection) list2.get(i2 - 1));
        }
        list2.add(i2, arrayList);
        return i2;
    }
}
