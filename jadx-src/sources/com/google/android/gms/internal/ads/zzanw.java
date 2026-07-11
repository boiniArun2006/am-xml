package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.fido.common.bH.gUxOLwRQBPPLC;
import com.google.android.gms.internal.ads_identifier.VR.wDgKoYAES;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.Typography;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzanw {
    public static final Pattern zza = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");
    private static final Pattern zzb = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map zzc;
    private static final Map zzd;

    /* JADX WARN: Removed duplicated region for block: B:43:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzf(@Nullable String str, zzant zzantVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        byte b2;
        int i2 = zzantVar.zzb;
        int length = spannableStringBuilder.length();
        String str2 = zzantVar.zza;
        int iHashCode = str2.hashCode();
        int i3 = -1;
        if (iHashCode != 0) {
            if (iHashCode != 105) {
                if (iHashCode != 3314158) {
                    if (iHashCode != 3511770) {
                        if (iHashCode != 98) {
                            if (iHashCode != 99) {
                                if (iHashCode != 117) {
                                    b2 = (iHashCode == 118 && str2.equals("v")) ? (byte) 5 : (byte) -1;
                                } else if (str2.equals("u")) {
                                    b2 = 3;
                                }
                            } else if (str2.equals("c")) {
                                b2 = 4;
                            }
                        } else if (str2.equals("b")) {
                            b2 = 0;
                        }
                    } else if (str2.equals(TtmlNode.ATTR_TTS_RUBY)) {
                        b2 = 2;
                    }
                } else if (str2.equals(wDgKoYAES.NNFe)) {
                    b2 = 6;
                }
            } else if (str2.equals(CmcdData.OBJECT_TYPE_INIT_SEGMENT)) {
                b2 = 1;
            }
        } else if (str2.equals("")) {
            b2 = 7;
        }
        switch (b2) {
            case 0:
                spannableStringBuilder.setSpan(new StyleSpan(1), i2, length, 33);
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(2), i2, length, 33);
                break;
            case 2:
                int iZzg = zzg(list2, str, zzantVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, zzans.zza);
                int i5 = i2;
                int i7 = 0;
                int length2 = 0;
                while (i7 < arrayList.size()) {
                    if ("rt".equals(((zzans) arrayList.get(i7)).zzc().zza)) {
                        zzans zzansVar = (zzans) arrayList.get(i7);
                        int iZzg2 = zzg(list2, str, zzansVar.zzc());
                        if (iZzg2 == i3) {
                            iZzg2 = iZzg != i3 ? iZzg : 1;
                        }
                        int i8 = zzansVar.zzc().zzb - length2;
                        int iZzd = zzansVar.zzd() - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i8, iZzd);
                        spannableStringBuilder.delete(i8, iZzd);
                        spannableStringBuilder.setSpan(new zzdc(charSequenceSubSequence.toString(), iZzg2), i5, i8, 33);
                        length2 += charSequenceSubSequence.length();
                        i5 = i8;
                    }
                    i7++;
                    i3 = -1;
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i2, length, 33);
                break;
            case 4:
                for (String str3 : zzantVar.zzd) {
                    Map map = zzc;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i2, length, 33);
                    } else {
                        Map map2 = zzd;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i2, length, 33);
                        }
                    }
                }
                break;
            case 5:
                spannableStringBuilder.setSpan(new zzdf(zzantVar.zzc), i2, length, 33);
                break;
            case 6:
            case 7:
                break;
            default:
                return;
        }
        List listZzh = zzh(list2, str, zzantVar);
        for (int i9 = 0; i9 < listZzh.size(); i9++) {
            zzanp zzanpVar = ((zzanu) listZzh.get(i9)).zzb;
            if (zzanpVar != null) {
                if (zzanpVar.zzf() != -1) {
                    zzdd.zza(spannableStringBuilder, new StyleSpan(zzanpVar.zzf()), i2, length, 33);
                }
                if (zzanpVar.zzg()) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i2, length, 33);
                }
                if (zzanpVar.zzo()) {
                    zzdd.zza(spannableStringBuilder, new ForegroundColorSpan(zzanpVar.zzm()), i2, length, 33);
                }
                if (zzanpVar.zzr()) {
                    zzdd.zza(spannableStringBuilder, new BackgroundColorSpan(zzanpVar.zzp()), i2, length, 33);
                }
                if (zzanpVar.zzk() != null) {
                    zzdd.zza(spannableStringBuilder, new TypefaceSpan(zzanpVar.zzk()), i2, length, 33);
                }
                int iZzu = zzanpVar.zzu();
                if (iZzu == 1) {
                    zzdd.zza(spannableStringBuilder, new AbsoluteSizeSpan((int) zzanpVar.zzv(), true), i2, length, 33);
                } else if (iZzu == 2) {
                    zzdd.zza(spannableStringBuilder, new RelativeSizeSpan(zzanpVar.zzv()), i2, length, 33);
                } else if (iZzu == 3) {
                    zzdd.zza(spannableStringBuilder, new RelativeSizeSpan(zzanpVar.zzv() / 100.0f), i2, length, 33);
                }
                if (zzanpVar.zzz()) {
                    spannableStringBuilder.setSpan(new zzdb(), i2, length, 33);
                }
            }
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        zzc = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        zzd = Collections.unmodifiableMap(map2);
    }

    @Nullable
    public static zzanq zza(zzer zzerVar, List list) {
        Charset charset = StandardCharsets.UTF_8;
        String strZzN = zzerVar.zzN(charset);
        if (strZzN != null) {
            Pattern pattern = zza;
            Matcher matcher = pattern.matcher(strZzN);
            if (matcher.matches()) {
                return zzd(null, matcher, zzerVar, list);
            }
            String strZzN2 = zzerVar.zzN(charset);
            if (strZzN2 != null) {
                Matcher matcher2 = pattern.matcher(strZzN2);
                if (matcher2.matches()) {
                    return zzd(strZzN.trim(), matcher2, zzerVar, list);
                }
            }
        }
        return null;
    }

    static zzcw zzb(String str) {
        zzanv zzanvVar = new zzanv();
        zze(str, zzanvVar);
        return zzanvVar.zza();
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static SpannedString zzc(@Nullable String str, String str2, List list) {
        byte b2;
        int i2;
        int i3 = -1;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        while (i5 < str2.length()) {
            int i7 = i5 + 1;
            char cCharAt = str2.charAt(i5);
            if (cCharAt == '&') {
                int iIndexOf = str2.indexOf(59, i7);
                int iIndexOf2 = str2.indexOf(32, i7);
                if (iIndexOf == i3) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != i3) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != i3) {
                    String strSubstring = str2.substring(i7, iIndexOf);
                    int iHashCode = strSubstring.hashCode();
                    if (iHashCode == 3309) {
                        if (strSubstring.equals("gt")) {
                            b2 = 1;
                        }
                        if (b2 != 0) {
                        }
                        if (iIndexOf == iIndexOf2) {
                        }
                        i5 = iIndexOf + 1;
                        i3 = -1;
                    } else if (iHashCode == 3464) {
                        if (strSubstring.equals("lt")) {
                            b2 = 0;
                        }
                        if (b2 != 0) {
                        }
                        if (iIndexOf == iIndexOf2) {
                        }
                        i5 = iIndexOf + 1;
                        i3 = -1;
                    } else if (iHashCode != 96708) {
                        b2 = (iHashCode == 3374865 && strSubstring.equals("nbsp")) ? (byte) 2 : (byte) -1;
                        if (b2 != 0) {
                            spannableStringBuilder.append(Typography.less);
                        } else if (b2 == 1) {
                            spannableStringBuilder.append(Typography.greater);
                        } else if (b2 == 2) {
                            spannableStringBuilder.append(' ');
                        } else if (b2 != 3) {
                            StringBuilder sb = new StringBuilder(strSubstring.length() + 33);
                            sb.append("ignoring unsupported entity: '&");
                            sb.append(strSubstring);
                            sb.append(";'");
                            zzee.zzc("WebvttCueParser", sb.toString());
                        } else {
                            spannableStringBuilder.append(Typography.amp);
                        }
                        if (iIndexOf == iIndexOf2) {
                            spannableStringBuilder.append((CharSequence) " ");
                        }
                        i5 = iIndexOf + 1;
                        i3 = -1;
                    } else {
                        if (strSubstring.equals("amp")) {
                            b2 = 3;
                        }
                        if (b2 != 0) {
                        }
                        if (iIndexOf == iIndexOf2) {
                        }
                        i5 = iIndexOf + 1;
                        i3 = -1;
                    }
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
            } else if (i7 < str2.length()) {
                char cCharAt2 = str2.charAt(i7);
                int iIndexOf3 = str2.indexOf(62, i7);
                int length = iIndexOf3 == i3 ? str2.length() : iIndexOf3 + 1;
                int i8 = length - 2;
                boolean z2 = str2.charAt(i8) == '/';
                int i9 = i5 + (cCharAt2 == '/' ? 2 : 1);
                if (!z2) {
                    i8 = length - 1;
                }
                String strSubstring2 = str2.substring(i9, i8);
                if (!strSubstring2.trim().isEmpty()) {
                    String strTrim = strSubstring2.trim();
                    zzgrc.zza(!strTrim.isEmpty());
                    String str3 = zzfj.zza;
                    String str4 = strTrim.split("[ \\.]", 2)[0];
                    int iHashCode2 = str4.hashCode();
                    if (iHashCode2 == 98) {
                        if (str4.equals("b")) {
                            i2 = 0;
                        }
                        switch (i2) {
                        }
                    } else if (iHashCode2 == 99) {
                        if (str4.equals("c")) {
                            i2 = 1;
                        }
                        switch (i2) {
                        }
                    } else if (iHashCode2 == 105) {
                        if (str4.equals(CmcdData.OBJECT_TYPE_INIT_SEGMENT)) {
                            i2 = 2;
                        }
                        switch (i2) {
                        }
                    } else if (iHashCode2 == 3650) {
                        if (str4.equals("rt")) {
                            i2 = 5;
                        }
                        switch (i2) {
                        }
                    } else if (iHashCode2 == 3314158) {
                        if (str4.equals("lang")) {
                            i2 = 3;
                        }
                        switch (i2) {
                        }
                    } else if (iHashCode2 == 3511770) {
                        if (str4.equals(TtmlNode.ATTR_TTS_RUBY)) {
                            i2 = 4;
                        }
                        switch (i2) {
                        }
                    } else if (iHashCode2 != 117) {
                        i2 = (iHashCode2 == 118 && str4.equals("v")) ? 7 : i3;
                        switch (i2) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                if (cCharAt2 == '/') {
                                    while (!arrayDeque.isEmpty()) {
                                        zzant zzantVar = (zzant) arrayDeque.pop();
                                        zzf(str, zzantVar, arrayList, spannableStringBuilder, list);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            arrayList.add(new zzans(zzantVar, spannableStringBuilder.length(), null));
                                        }
                                        if (zzantVar.zza.equals(str4)) {
                                            break;
                                        }
                                    }
                                } else if (!z2) {
                                    arrayDeque.push(zzant.zza(strSubstring2, spannableStringBuilder.length()));
                                }
                                break;
                        }
                    } else {
                        if (str4.equals("u")) {
                            i2 = 6;
                        }
                        switch (i2) {
                        }
                    }
                }
                i5 = length;
            }
            i5 = i7;
            i3 = -1;
        }
        while (!arrayDeque.isEmpty()) {
            zzf(str, (zzant) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        zzf(str, zzant.zzb(), Collections.EMPTY_LIST, spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    @Nullable
    private static zzanq zzd(@Nullable String str, Matcher matcher, zzer zzerVar, List list) {
        zzanv zzanvVar = new zzanv();
        try {
            String strGroup = matcher.group(1);
            if (strGroup == null) {
                throw null;
            }
            zzanvVar.zza = zzany.zza(strGroup);
            String strGroup2 = matcher.group(2);
            if (strGroup2 == null) {
                throw null;
            }
            zzanvVar.zzb = zzany.zza(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            zze(strGroup3, zzanvVar);
            StringBuilder sb = new StringBuilder();
            String strZzN = zzerVar.zzN(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strZzN)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strZzN.trim());
                strZzN = zzerVar.zzN(StandardCharsets.UTF_8);
            }
            zzanvVar.zzc = zzc(str, sb.toString(), list);
            return new zzanq(zzanvVar.zza().zzr(), zzanvVar.zza, zzanvVar.zzb);
        } catch (IllegalArgumentException unused) {
            zzee.zzc("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zze(String str, zzanv zzanvVar) {
        byte b2;
        byte b4;
        byte b5;
        Matcher matcher = zzb.matcher(str);
        while (matcher.find()) {
            int i2 = 1;
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i3 = 2;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    int iIndexOf = strGroup2.indexOf(44);
                    byte b6 = -1;
                    if (iIndexOf != -1) {
                        String strSubstring = strGroup2.substring(iIndexOf + 1);
                        switch (strSubstring.hashCode()) {
                            case -1364013995:
                                if (strSubstring.equals(TtmlNode.CENTER)) {
                                    b6 = 1;
                                }
                                break;
                            case -1074341483:
                                if (strSubstring.equals("middle")) {
                                    b6 = 2;
                                }
                                break;
                            case 100571:
                                if (strSubstring.equals(TtmlNode.END)) {
                                    b6 = 3;
                                }
                                break;
                            case 109757538:
                                if (strSubstring.equals(TtmlNode.START)) {
                                    b6 = 0;
                                }
                                break;
                        }
                        if (b6 == 0) {
                            i3 = 0;
                        } else if (b6 == 1 || b6 == 2) {
                            i3 = 1;
                        } else if (b6 != 3) {
                            zzee.zzc("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                            i3 = Integer.MIN_VALUE;
                        }
                        zzanvVar.zzg = i3;
                        strGroup2 = strGroup2.substring(0, iIndexOf);
                    }
                    if (strGroup2.endsWith("%")) {
                        zzanvVar.zze = zzany.zzb(strGroup2);
                        zzanvVar.zzf = 0;
                    } else {
                        zzanvVar.zze = Integer.parseInt(strGroup2);
                        zzanvVar.zzf = 1;
                    }
                } else if ("align".equals(strGroup)) {
                    String str2 = gUxOLwRQBPPLC.LSjlY;
                    switch (strGroup2.hashCode()) {
                        case -1364013995:
                            b2 = !strGroup2.equals(TtmlNode.CENTER) ? (byte) -1 : (byte) 2;
                            break;
                        case -1074341483:
                            if (strGroup2.equals("middle")) {
                                b2 = 3;
                                break;
                            }
                            break;
                        case 100571:
                            if (strGroup2.equals(TtmlNode.END)) {
                                b2 = 4;
                                break;
                            }
                            break;
                        case 3317767:
                            if (strGroup2.equals(TtmlNode.LEFT)) {
                                b2 = 1;
                                break;
                            }
                            break;
                        case 108511772:
                            if (strGroup2.equals(TtmlNode.RIGHT)) {
                                b2 = 5;
                                break;
                            }
                            break;
                        case 109757538:
                            if (strGroup2.equals(TtmlNode.START)) {
                                b2 = 0;
                                break;
                            }
                            break;
                    }
                    if (b2 != 0) {
                        if (b2 == 1) {
                            i2 = 4;
                        } else if (b2 == 2 || b2 == 3) {
                            i2 = 2;
                        } else if (b2 == 4) {
                            i2 = 3;
                        } else if (b2 != 5) {
                            zzee.zzc("WebvttCueParser", str2.concat(strGroup2));
                            i2 = 2;
                        } else {
                            i2 = 5;
                        }
                    }
                    zzanvVar.zzd = i2;
                } else if ("position".equals(strGroup)) {
                    int iIndexOf2 = strGroup2.indexOf(44);
                    if (iIndexOf2 != -1) {
                        String strSubstring2 = strGroup2.substring(iIndexOf2 + 1);
                        switch (strSubstring2.hashCode()) {
                            case -1842484672:
                                b5 = !strSubstring2.equals("line-left") ? (byte) -1 : (byte) 0;
                                break;
                            case -1364013995:
                                if (strSubstring2.equals(TtmlNode.CENTER)) {
                                    b5 = 2;
                                    break;
                                }
                                break;
                            case -1276788989:
                                if (strSubstring2.equals("line-right")) {
                                    b5 = 4;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (strSubstring2.equals("middle")) {
                                    b5 = 3;
                                    break;
                                }
                                break;
                            case 100571:
                                if (strSubstring2.equals(TtmlNode.END)) {
                                    b5 = 5;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (strSubstring2.equals(TtmlNode.START)) {
                                    b5 = 1;
                                    break;
                                }
                                break;
                        }
                        if (b5 == 0 || b5 == 1) {
                            i2 = 0;
                        } else if (b5 != 2 && b5 != 3) {
                            if (b5 == 4 || b5 == 5) {
                                i2 = 2;
                            } else {
                                zzee.zzc("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring2));
                                i2 = Integer.MIN_VALUE;
                            }
                        }
                        zzanvVar.zzi = i2;
                        strGroup2 = strGroup2.substring(0, iIndexOf2);
                    }
                    zzanvVar.zzh = zzany.zzb(strGroup2);
                } else if ("size".equals(strGroup)) {
                    zzanvVar.zzj = zzany.zzb(strGroup2);
                } else if ("vertical".equals(strGroup)) {
                    int iHashCode = strGroup2.hashCode();
                    if (iHashCode != 3462) {
                        b4 = (iHashCode == 3642 && strGroup2.equals("rl")) ? (byte) 0 : (byte) -1;
                        if (b4 != 0) {
                            if (b4 != 1) {
                                zzee.zzc("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                                i2 = Integer.MIN_VALUE;
                            } else {
                                i2 = 2;
                            }
                        }
                        zzanvVar.zzk = i2;
                    } else {
                        if (strGroup2.equals("lr")) {
                            b4 = 1;
                        }
                        if (b4 != 0) {
                        }
                        zzanvVar.zzk = i2;
                    }
                } else {
                    StringBuilder sb = new StringBuilder(strGroup.length() + 21 + strGroup2.length());
                    sb.append("Unknown cue setting ");
                    sb.append(strGroup);
                    sb.append(":");
                    sb.append(strGroup2);
                    zzee.zzc("WebvttCueParser", sb.toString());
                }
            } catch (NumberFormatException unused) {
                zzee.zzc("WebvttCueParser", "Skipping bad cue setting: ".concat(String.valueOf(matcher.group())));
            }
        }
    }

    private static List zzh(List list, @Nullable String str, zzant zzantVar) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzanp zzanpVar = (zzanp) list.get(i2);
            int iZze = zzanpVar.zze(str, zzantVar.zza, zzantVar.zzd, zzantVar.zzc);
            if (iZze > 0) {
                arrayList.add(new zzanu(iZze, zzanpVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static int zzg(List list, @Nullable String str, zzant zzantVar) {
        List listZzh = zzh(list, str, zzantVar);
        for (int i2 = 0; i2 < listZzh.size(); i2++) {
            zzanp zzanpVar = ((zzanu) listZzh.get(i2)).zzb;
            if (zzanpVar.zzx() != -1) {
                return zzanpVar.zzx();
            }
        }
        return -1;
    }
}
