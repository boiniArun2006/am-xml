package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzano {
    private static final Pattern zza = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern zzb = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final zzer zzc = new zzer();
    private final StringBuilder zzd = new StringBuilder();

    static void zzb(zzer zzerVar) {
        while (true) {
            for (boolean z2 = true; zzerVar.zzd() > 0 && z2; z2 = false) {
                char c2 = (char) zzerVar.zzi()[zzerVar.zzg()];
                if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
                    zzerVar.zzk(1);
                } else {
                    int iZzg = zzerVar.zzg();
                    int iZze = zzerVar.zze();
                    byte[] bArrZzi = zzerVar.zzi();
                    if (iZzg + 2 <= iZze) {
                        int i2 = iZzg + 1;
                        if (bArrZzi[iZzg] == 47) {
                            int i3 = iZzg + 2;
                            if (bArrZzi[i2] == 42) {
                                while (true) {
                                    int i5 = i3 + 1;
                                    if (i5 >= iZze) {
                                        break;
                                    }
                                    if (((char) bArrZzi[i3]) == '*' && ((char) bArrZzi[i5]) == '/') {
                                        iZze = i3 + 2;
                                        i3 = iZze;
                                    } else {
                                        i3 = i5;
                                    }
                                }
                                zzerVar.zzk(iZze - zzerVar.zzg());
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    private static String zzd(zzer zzerVar, StringBuilder sb) {
        boolean z2;
        char c2;
        sb.setLength(0);
        int iZzg = zzerVar.zzg();
        int iZze = zzerVar.zze();
        loop0: while (true) {
            for (false; iZzg < iZze && !z2; true) {
                c2 = (char) zzerVar.zzi()[iZzg];
                z2 = (c2 < 'A' || c2 > 'Z') && (c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_');
            }
            sb.append(c2);
            iZzg++;
        }
        zzerVar.zzk(iZzg - zzerVar.zzg());
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x030b, code lost:
    
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zza(zzer zzerVar) {
        String strTrim;
        String string;
        byte b2;
        int i2 = -1;
        StringBuilder sb = this.zzd;
        int i3 = 0;
        sb.setLength(0);
        int iZzg = zzerVar.zzg();
        while (!TextUtils.isEmpty(zzerVar.zzN(StandardCharsets.UTF_8))) {
        }
        zzer zzerVar2 = this.zzc;
        zzerVar2.zzb(zzerVar.zzi(), zzerVar.zzg());
        zzerVar2.zzh(iZzg);
        ArrayList arrayList = new ArrayList();
        while (true) {
            zzb(zzerVar2);
            if (zzerVar2.zzd() >= 5 && "::cue".equals(zzerVar2.zzK(5, StandardCharsets.UTF_8))) {
                int iZzg2 = zzerVar2.zzg();
                String strZzc = zzc(zzerVar2, sb);
                if (strZzc != null) {
                    if ("{".equals(strZzc)) {
                        zzerVar2.zzh(iZzg2);
                        strTrim = "";
                    } else {
                        if ("(".equals(strZzc)) {
                            int iZzg3 = zzerVar2.zzg();
                            int iZze = zzerVar2.zze();
                            int i5 = i3;
                            while (iZzg3 < iZze && i5 == 0) {
                                int i7 = iZzg3 + 1;
                                i5 = ((char) zzerVar2.zzi()[iZzg3]) == ')' ? 1 : i3;
                                iZzg3 = i7;
                            }
                            strTrim = zzerVar2.zzK((iZzg3 + i2) - zzerVar2.zzg(), StandardCharsets.UTF_8).trim();
                        } else {
                            strTrim = null;
                        }
                        if (!")".equals(zzc(zzerVar2, sb))) {
                            strTrim = null;
                        }
                    }
                }
            }
            if (strTrim == null || !"{".equals(zzc(zzerVar2, sb))) {
                break;
            }
            zzanp zzanpVar = new zzanp();
            if (!strTrim.isEmpty()) {
                int iIndexOf = strTrim.indexOf(91);
                if (iIndexOf != i2) {
                    Matcher matcher = zza.matcher(strTrim.substring(iIndexOf));
                    if (matcher.matches()) {
                        String strGroup = matcher.group(1);
                        strGroup.getClass();
                        zzanpVar.zzd(strGroup);
                    }
                    strTrim = strTrim.substring(i3, iIndexOf);
                }
                String str = zzfj.zza;
                String[] strArrSplit = strTrim.split("\\.", i2);
                String str2 = strArrSplit[i3];
                int iIndexOf2 = str2.indexOf(35);
                if (iIndexOf2 != i2) {
                    zzanpVar.zzb(str2.substring(i3, iIndexOf2));
                    zzanpVar.zza(str2.substring(iIndexOf2 + 1));
                } else {
                    zzanpVar.zzb(str2);
                }
                int length = strArrSplit.length;
                if (length > 1) {
                    zzanpVar.zzc((String[]) Arrays.copyOfRange(strArrSplit, 1, length));
                }
            }
            int i8 = i3;
            String strZzc2 = null;
            while (i8 == 0) {
                int iZzg4 = zzerVar2.zzg();
                strZzc2 = zzc(zzerVar2, sb);
                int i9 = (strZzc2 == null || "}".equals(strZzc2)) ? 1 : i3;
                if (i9 == 0) {
                    zzerVar2.zzh(iZzg4);
                    zzb(zzerVar2);
                    String strZzd = zzd(zzerVar2, sb);
                    if (!strZzd.isEmpty() && ":".equals(zzc(zzerVar2, sb))) {
                        zzb(zzerVar2);
                        StringBuilder sb2 = new StringBuilder();
                        int i10 = i3;
                        while (true) {
                            if (i10 != 0) {
                                string = sb2.toString();
                                break;
                            }
                            int iZzg5 = zzerVar2.zzg();
                            String strZzc3 = zzc(zzerVar2, sb);
                            if (strZzc3 == null) {
                                string = null;
                                break;
                            }
                            if ("}".equals(strZzc3) || ";".equals(strZzc3)) {
                                zzerVar2.zzh(iZzg5);
                                i10 = 1;
                            } else {
                                sb2.append(strZzc3);
                            }
                        }
                        if (string != null && !string.isEmpty()) {
                            int iZzg6 = zzerVar2.zzg();
                            String strZzc4 = zzc(zzerVar2, sb);
                            if (";".equals(strZzc4)) {
                                if (!TtmlNode.ATTR_TTS_COLOR.equals(strZzd)) {
                                }
                            } else if ("}".equals(strZzc4)) {
                                zzerVar2.zzh(iZzg6);
                                if (!TtmlNode.ATTR_TTS_COLOR.equals(strZzd)) {
                                    zzanpVar.zzn(zzdp.zzb(string));
                                } else if ("background-color".equals(strZzd)) {
                                    zzanpVar.zzq(zzdp.zzb(string));
                                } else if ("ruby-position".equals(strZzd)) {
                                    if ("over".equals(string)) {
                                        zzanpVar.zzw(1);
                                    } else if ("under".equals(string)) {
                                        zzanpVar.zzw(2);
                                    }
                                } else if ("text-combine-upright".equals(strZzd)) {
                                    zzanpVar.zzy("all".equals(string) || string.startsWith("digits"));
                                } else if ("text-decoration".equals(strZzd)) {
                                    if (TtmlNode.UNDERLINE.equals(string)) {
                                        zzanpVar.zzh(true);
                                    }
                                } else if ("font-family".equals(strZzd)) {
                                    zzanpVar.zzl(string);
                                } else if ("font-weight".equals(strZzd)) {
                                    if (TtmlNode.BOLD.equals(string)) {
                                        zzanpVar.zzi(true);
                                    }
                                } else if ("font-style".equals(strZzd)) {
                                    if (TtmlNode.ITALIC.equals(string)) {
                                        zzanpVar.zzj(true);
                                    }
                                } else if ("font-size".equals(strZzd)) {
                                    Matcher matcher2 = zzb.matcher(zzgql.zza(string));
                                    if (matcher2.matches()) {
                                        String strGroup2 = matcher2.group(2);
                                        strGroup2.getClass();
                                        int iHashCode = strGroup2.hashCode();
                                        if (iHashCode == 37) {
                                            if (strGroup2.equals("%")) {
                                                b2 = 2;
                                            }
                                            if (b2 == 0) {
                                            }
                                            String strGroup3 = matcher2.group(1);
                                            strGroup3.getClass();
                                            zzanpVar.zzs(Float.parseFloat(strGroup3));
                                        } else if (iHashCode != 3240) {
                                            b2 = (iHashCode == 3592 && strGroup2.equals("px")) ? (byte) 0 : (byte) -1;
                                            if (b2 == 0) {
                                                zzanpVar.zzt(1);
                                            } else if (b2 == 1) {
                                                zzanpVar.zzt(2);
                                            } else {
                                                if (b2 != 2) {
                                                    throw new IllegalStateException();
                                                }
                                                zzanpVar.zzt(3);
                                            }
                                            String strGroup32 = matcher2.group(1);
                                            strGroup32.getClass();
                                            zzanpVar.zzs(Float.parseFloat(strGroup32));
                                        } else {
                                            if (strGroup2.equals("em")) {
                                                b2 = 1;
                                            }
                                            if (b2 == 0) {
                                            }
                                            String strGroup322 = matcher2.group(1);
                                            strGroup322.getClass();
                                            zzanpVar.zzs(Float.parseFloat(strGroup322));
                                        }
                                    } else {
                                        StringBuilder sb3 = new StringBuilder(string.length() + 22);
                                        sb3.append("Invalid font-size: '");
                                        sb3.append(string);
                                        sb3.append("'.");
                                        zzee.zzc("WebvttCssParser", sb3.toString());
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                i8 = i9;
                i3 = 0;
            }
            if ("}".equals(strZzc2)) {
                arrayList.add(zzanpVar);
            }
            i2 = -1;
            i3 = 0;
        }
    }

    @Nullable
    static String zzc(zzer zzerVar, StringBuilder sb) {
        zzb(zzerVar);
        if (zzerVar.zzd() == 0) {
            return null;
        }
        String strZzd = zzd(zzerVar, sb);
        if (!strZzd.isEmpty()) {
            return strZzd;
        }
        char cZzs = (char) zzerVar.zzs();
        StringBuilder sb2 = new StringBuilder(String.valueOf(cZzs).length());
        sb2.append(cZzs);
        return sb2.toString();
    }
}
