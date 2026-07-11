package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.dsl.kYF.obbPUqyhtS;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdo {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 1};
    private static final String[] zzc = {"", "A", "B", "C"};
    private static final Pattern zzd = Pattern.compile("^\\D?(\\d+)$");

    public static String zzc(byte[] bArr) {
        int length = bArr.length;
        zzgrc.zzd(length >= 17, "Invalid APV CSD length: %s", length);
        byte b2 = bArr[0];
        zzgrc.zzd(b2 == 1, "Invalid APV CSD version: %s", b2);
        Object[] objArr = {Integer.valueOf(bArr[5]), Integer.valueOf(bArr[6]), Integer.valueOf(bArr[7])};
        String str = zzfj.zza;
        return String.format(Locale.US, "apv1.apvf%d.apvl%d.apvb%d", objArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair zze(String str, String[] strArr, @Nullable zzi zziVar) {
        int i2;
        Integer num;
        if (strArr.length < 4) {
            zzee.zzc("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
        Matcher matcher = zzd.matcher(strArr[1]);
        if (!matcher.matches()) {
            zzee.zzc("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
        String strGroup = matcher.group(1);
        if ("1".equals(strGroup)) {
            i2 = 1;
        } else if ("2".equals(strGroup)) {
            i2 = (zziVar == null || zziVar.zzd != 6) ? 2 : 4096;
        } else {
            if (!"6".equals(strGroup)) {
                zzee.zzc("CodecSpecificDataUtil", "Unknown HEVC profile string: ".concat(String.valueOf(strGroup)));
                return null;
            }
            i2 = 6;
        }
        String str2 = strArr[3];
        if (str2 != null) {
            switch (str2) {
                case "L30":
                    num = 1;
                    break;
                case "L60":
                    num = 4;
                    break;
                case "L63":
                    num = 16;
                    break;
                case "L90":
                    num = 64;
                    break;
                case "L93":
                    num = 256;
                    break;
                case "L120":
                    num = 1024;
                    break;
                case "L123":
                    num = 4096;
                    break;
                case "L150":
                    num = 16384;
                    break;
                case "L153":
                    num = 65536;
                    break;
                case "L156":
                    num = 262144;
                    break;
                case "L180":
                    num = 1048576;
                    break;
                case "L183":
                    num = 4194304;
                    break;
                case "L186":
                    num = 16777216;
                    break;
                case "H30":
                    num = 2;
                    break;
                case "H60":
                    num = 8;
                    break;
                case "H63":
                    num = 32;
                    break;
                case "H90":
                    num = 128;
                    break;
                case "H93":
                    num = 512;
                    break;
                case "H120":
                    num = 2048;
                    break;
                case "H123":
                    num = 8192;
                    break;
                case "H150":
                    num = 32768;
                    break;
                case "H153":
                    num = 131072;
                    break;
                case "H156":
                    num = 524288;
                    break;
                case "H180":
                    num = 2097152;
                    break;
                case "H183":
                    num = 8388608;
                    break;
                case "H186":
                    num = 33554432;
                    break;
            }
        } else {
            num = null;
        }
        if (num != null) {
            return new Pair(Integer.valueOf(i2), num);
        }
        zzee.zzc("CodecSpecificDataUtil", "Unknown HEVC level string: ".concat(String.valueOf(str2)));
        return null;
    }

    public static String zzb(int i2, boolean z2, int i3, int i5, int[] iArr, int i7) {
        int i8;
        Object[] objArr = {zzc[i2], Integer.valueOf(i3), Integer.valueOf(i5), Character.valueOf(true != z2 ? 'L' : 'H'), Integer.valueOf(i7)};
        String str = zzfj.zza;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int i9 = 6;
        while (true) {
            if (i9 <= 0) {
                break;
            }
            int i10 = i9 - 1;
            if (iArr[i10] != 0) {
                break;
            }
            i9 = i10;
        }
        for (i8 = 0; i8 < i9; i8++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i8])));
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x01f0, code lost:
    
        r20 = 256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01f4, code lost:
    
        r20 = 256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0201, code lost:
    
        r20 = 256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x020e, code lost:
    
        r20 = 256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x021b, code lost:
    
        r20 = 256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0228, code lost:
    
        r20 = 256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0234, code lost:
    
        r20 = 256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0240, code lost:
    
        r20 = 256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x024c, code lost:
    
        r20 = 256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0258, code lost:
    
        r20 = 256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0264, code lost:
    
        r20 = 256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0270, code lost:
    
        r20 = 256;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:145:0x027d A[PHI: r20
      0x027d: PHI (r20v13 int) = 
      (r20v1 int)
      (r20v2 int)
      (r20v3 int)
      (r20v4 int)
      (r20v5 int)
      (r20v6 int)
      (r20v7 int)
      (r20v8 int)
      (r20v9 int)
      (r20v10 int)
      (r20v11 int)
      (r20v14 int)
     binds: [B:143:0x0278, B:140:0x026c, B:137:0x0260, B:134:0x0254, B:131:0x0248, B:128:0x023c, B:125:0x0230, B:122:0x0223, B:119:0x0216, B:116:0x0209, B:113:0x01fc, B:111:0x01f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0335  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair zzd(zzv zzvVar) {
        int i2;
        byte b2;
        int i3;
        int i5;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Integer num;
        Integer num2;
        String str = zzvVar.zzk;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        int i13 = 8;
        int i14 = 3;
        int i15 = 2;
        if ("video/dolby-vision".equals(zzvVar.zzo)) {
            if (strArrSplit.length < 3) {
                zzee.zzc("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: ".concat(str));
                return null;
            }
            Matcher matcher = zzd.matcher(strArrSplit[1]);
            if (!matcher.matches()) {
                zzee.zzc("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: ".concat(str));
                return null;
            }
            String strGroup = matcher.group(1);
            if (strGroup == null) {
                num = null;
            } else {
                int iHashCode = strGroup.hashCode();
                if (iHashCode != 1567) {
                    switch (iHashCode) {
                        case 1536:
                            num = !strGroup.equals("00") ? null : 1;
                            break;
                        case 1537:
                            num = !strGroup.equals("01") ? null : 2;
                            break;
                        case 1538:
                            num = !strGroup.equals("02") ? null : 4;
                            break;
                        case 1539:
                            num = !strGroup.equals("03") ? null : 8;
                            break;
                        case 1540:
                            num = !strGroup.equals("04") ? null : 16;
                            break;
                        case 1541:
                            num = !strGroup.equals("05") ? null : 32;
                            break;
                        case 1542:
                            num = !strGroup.equals("06") ? null : 64;
                            break;
                        case 1543:
                            num = !strGroup.equals("07") ? null : 128;
                            break;
                        case 1544:
                            num = !strGroup.equals("08") ? null : 256;
                            break;
                        case 1545:
                            num = !strGroup.equals("09") ? null : 512;
                            break;
                        default:
                            num = null;
                            break;
                    }
                } else {
                    num = strGroup.equals("10") ? 1024 : null;
                }
            }
            if (num == null) {
                zzee.zzc("CodecSpecificDataUtil", "Unknown Dolby Vision profile string: ".concat(String.valueOf(strGroup)));
                return null;
            }
            String str2 = strArrSplit[2];
            if (str2 != null) {
                int iHashCode2 = str2.hashCode();
                switch (iHashCode2) {
                    case 1537:
                        num2 = !str2.equals("01") ? null : 1;
                        break;
                    case 1538:
                        num2 = !str2.equals("02") ? null : 2;
                        break;
                    case 1539:
                        num2 = !str2.equals("03") ? null : 4;
                        break;
                    case 1540:
                        num2 = !str2.equals("04") ? null : 8;
                        break;
                    case 1541:
                        num2 = !str2.equals("05") ? null : 16;
                        break;
                    case 1542:
                        num2 = !str2.equals("06") ? null : 32;
                        break;
                    case 1543:
                        num2 = !str2.equals("07") ? null : 64;
                        break;
                    case 1544:
                        num2 = !str2.equals("08") ? null : 128;
                        break;
                    case 1545:
                        num2 = !str2.equals("09") ? null : 256;
                        break;
                    default:
                        switch (iHashCode2) {
                            case 1567:
                                num2 = !str2.equals("10") ? null : 512;
                                break;
                            case 1568:
                                num2 = !str2.equals("11") ? null : 1024;
                                break;
                            case 1569:
                                num2 = !str2.equals("12") ? null : 2048;
                                break;
                            case 1570:
                                num2 = !str2.equals("13") ? null : 4096;
                                break;
                            default:
                                num2 = null;
                                break;
                        }
                        break;
                }
            } else {
                num2 = null;
            }
            if (num2 != null) {
                return new Pair(num, num2);
            }
            zzee.zzc("CodecSpecificDataUtil", "Unknown Dolby Vision level string: ".concat(String.valueOf(str2)));
            return null;
        }
        i2 = 0;
        b2 = -1;
        switch (strArrSplit[0]) {
            case "s263":
                String str3 = zzvVar.zzk;
                Pair pair = new Pair(1, 1);
                if (strArrSplit.length < 3) {
                    zzee.zzc("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: ".concat(String.valueOf(str3)));
                    return pair;
                }
                try {
                    return new Pair(Integer.valueOf(Integer.parseInt(strArrSplit[1])), Integer.valueOf(Integer.parseInt(strArrSplit[2])));
                } catch (NumberFormatException unused) {
                    zzee.zzc("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: ".concat(String.valueOf(str3)));
                    return pair;
                }
            case "avc1":
            case "avc2":
                String str4 = zzvVar.zzk;
                int length = strArrSplit.length;
                if (length < 2) {
                    zzee.zzc("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: ".concat(String.valueOf(str4)));
                    return null;
                }
                try {
                    if (strArrSplit[1].length() == 6) {
                        i5 = Integer.parseInt(strArrSplit[1].substring(0, 2), 16);
                        i7 = Integer.parseInt(strArrSplit[1].substring(4), 16);
                    } else {
                        if (length < 3) {
                            StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 37);
                            sb.append("Ignoring malformed AVC codec string: ");
                            sb.append(str4);
                            zzee.zzc("CodecSpecificDataUtil", sb.toString());
                            return null;
                        }
                        i5 = Integer.parseInt(strArrSplit[1]);
                        i7 = Integer.parseInt(strArrSplit[2]);
                    }
                    if (i5 == 66) {
                        i15 = 1;
                    } else if (i5 != 77) {
                        i15 = i5 != 88 ? i5 != 100 ? i5 != 110 ? i5 != 122 ? i5 != 244 ? -1 : 64 : 32 : 16 : 8 : 4;
                    }
                    if (i15 == -1) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 21);
                        sb2.append("Unknown AVC profile: ");
                        sb2.append(i5);
                        zzee.zzc("CodecSpecificDataUtil", sb2.toString());
                        return null;
                    }
                    switch (i7) {
                        case 10:
                            i8 = 1;
                            break;
                        case 11:
                            i8 = 4;
                            break;
                        case 12:
                            i8 = 8;
                            break;
                        case 13:
                            i8 = 16;
                            break;
                        default:
                            switch (i7) {
                                case 20:
                                    i8 = 32;
                                    break;
                                case 21:
                                    i8 = 64;
                                    break;
                                case 22:
                                    i8 = 128;
                                    break;
                                default:
                                    switch (i7) {
                                        case 30:
                                            i8 = i3;
                                            break;
                                        case 31:
                                            i8 = 512;
                                            break;
                                        case 32:
                                            i8 = 1024;
                                            break;
                                        default:
                                            switch (i7) {
                                                case 40:
                                                    i8 = 2048;
                                                    break;
                                                case 41:
                                                    i8 = 4096;
                                                    break;
                                                case 42:
                                                    i8 = 8192;
                                                    break;
                                                default:
                                                    switch (i7) {
                                                        case 50:
                                                            i8 = 16384;
                                                            break;
                                                        case 51:
                                                            i8 = 32768;
                                                            break;
                                                        case 52:
                                                            i8 = 65536;
                                                            break;
                                                        default:
                                                            i8 = -1;
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    if (i8 != -1) {
                        return new Pair(Integer.valueOf(i15), Integer.valueOf(i8));
                    }
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i7).length() + 19);
                    sb3.append("Unknown AVC level: ");
                    sb3.append(i7);
                    zzee.zzc("CodecSpecificDataUtil", sb3.toString());
                    return null;
                } catch (NumberFormatException unused2) {
                    zzee.zzc("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: ".concat(String.valueOf(str4)));
                }
                break;
                break;
            case "vp09":
                String str5 = zzvVar.zzk;
                if (strArrSplit.length < 3) {
                    zzee.zzc("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: ".concat(String.valueOf(str5)));
                    return null;
                }
                try {
                    int i16 = Integer.parseInt(strArrSplit[1]);
                    int i17 = Integer.parseInt(strArrSplit[2]);
                    int i18 = i16 != 0 ? i16 != 1 ? i16 != 2 ? i16 != 3 ? -1 : 8 : 4 : 2 : 1;
                    if (i18 == -1) {
                        StringBuilder sb4 = new StringBuilder(String.valueOf(i16).length() + 21);
                        sb4.append("Unknown VP9 profile: ");
                        sb4.append(i16);
                        zzee.zzc("CodecSpecificDataUtil", sb4.toString());
                        return null;
                    }
                    if (i17 == 10) {
                        i15 = 1;
                    } else if (i17 != 11) {
                        if (i17 == 20) {
                            i15 = 4;
                        } else if (i17 == 21) {
                            i15 = 8;
                        } else if (i17 == 30) {
                            i15 = 16;
                        } else if (i17 == 31) {
                            i15 = 32;
                        } else if (i17 == 40) {
                            i15 = 64;
                        } else if (i17 == 41) {
                            i15 = 128;
                        } else if (i17 == 50) {
                            i15 = i3;
                        } else if (i17 != 51) {
                            switch (i17) {
                                case 60:
                                    i15 = 2048;
                                    break;
                                case 61:
                                    i15 = 4096;
                                    break;
                                case 62:
                                    i15 = 8192;
                                    break;
                                default:
                                    i15 = -1;
                                    break;
                            }
                        } else {
                            i15 = 512;
                        }
                    }
                    if (i15 != -1) {
                        return new Pair(Integer.valueOf(i18), Integer.valueOf(i15));
                    }
                    StringBuilder sb5 = new StringBuilder(String.valueOf(i17).length() + 19);
                    sb5.append("Unknown VP9 level: ");
                    sb5.append(i17);
                    zzee.zzc("CodecSpecificDataUtil", sb5.toString());
                    return null;
                } catch (NumberFormatException unused3) {
                    zzee.zzc("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: ".concat(String.valueOf(str5)));
                }
                break;
                break;
            case "hev1":
            case "hvc1":
                return zze(zzvVar.zzk, strArrSplit, zzvVar.zzE);
            case "av01":
                String str6 = zzvVar.zzk;
                zzi zziVar = zzvVar.zzE;
                if (strArrSplit.length < 4) {
                    zzee.zzc("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: ".concat(String.valueOf(str6)));
                    return null;
                }
                try {
                    int i19 = Integer.parseInt(strArrSplit[1]);
                    int i20 = Integer.parseInt(strArrSplit[2].substring(0, 2));
                    int i21 = Integer.parseInt(strArrSplit[3]);
                    if (i19 != 0) {
                        StringBuilder sb6 = new StringBuilder(String.valueOf(i19).length() + 21);
                        sb6.append("Unknown AV1 profile: ");
                        sb6.append(i19);
                        zzee.zzc("CodecSpecificDataUtil", sb6.toString());
                        return null;
                    }
                    if (i21 == 8) {
                        i9 = 1;
                    } else {
                        if (i21 != 10) {
                            StringBuilder sb7 = new StringBuilder(String.valueOf(i21).length() + 23);
                            sb7.append("Unknown AV1 bit depth: ");
                            sb7.append(i21);
                            zzee.zzc("CodecSpecificDataUtil", sb7.toString());
                            return null;
                        }
                        i9 = (zziVar == null || !(zziVar.zze != null || (i10 = zziVar.zzd) == 7 || i10 == 6)) ? 2 : 4096;
                    }
                    switch (i20) {
                        case 0:
                            i15 = 1;
                            break;
                        case 1:
                            break;
                        case 2:
                            i15 = 4;
                            break;
                        case 3:
                            i15 = 8;
                            break;
                        case 4:
                            i15 = 16;
                            break;
                        case 5:
                            i15 = 32;
                            break;
                        case 6:
                            i15 = 64;
                            break;
                        case 7:
                            i15 = 128;
                            break;
                        case 8:
                            i15 = i3;
                            break;
                        case 9:
                            i15 = 512;
                            break;
                        case 10:
                            i15 = 1024;
                            break;
                        case 11:
                            i15 = 2048;
                            break;
                        case 12:
                            i15 = 4096;
                            break;
                        case 13:
                            i15 = 8192;
                            break;
                        case 14:
                            i15 = 16384;
                            break;
                        case 15:
                            i15 = 32768;
                            break;
                        case 16:
                            i15 = 65536;
                            break;
                        case 17:
                            i15 = 131072;
                            break;
                        case 18:
                            i15 = 262144;
                            break;
                        case 19:
                            i15 = 524288;
                            break;
                        case 20:
                            i15 = 1048576;
                            break;
                        case 21:
                            i15 = 2097152;
                            break;
                        case 22:
                            i15 = 4194304;
                            break;
                        case 23:
                            i15 = 8388608;
                            break;
                        default:
                            i15 = -1;
                            break;
                    }
                    if (i15 != -1) {
                        return new Pair(Integer.valueOf(i9), Integer.valueOf(i15));
                    }
                    StringBuilder sb8 = new StringBuilder(String.valueOf(i20).length() + 19);
                    sb8.append("Unknown AV1 level: ");
                    sb8.append(i20);
                    zzee.zzc("CodecSpecificDataUtil", sb8.toString());
                    return null;
                } catch (NumberFormatException unused4) {
                    zzee.zzc("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: ".concat(String.valueOf(str6)));
                }
                break;
                break;
            case "apv1":
                String str7 = zzvVar.zzk;
                if (strArrSplit.length < 4) {
                    zzee.zzc("CodecSpecificDataUtil", "Ignoring malformed APV codec string: ".concat(String.valueOf(str7)));
                    return null;
                }
                try {
                    int i22 = Integer.parseInt(strArrSplit[1].substring(4));
                    int i23 = Integer.parseInt(strArrSplit[2].substring(4));
                    int i24 = Integer.parseInt(strArrSplit[3].substring(4));
                    if (i22 == 33) {
                        i11 = 1;
                    } else {
                        if (i22 != 44) {
                            StringBuilder sb9 = new StringBuilder(String.valueOf(i22).length() + 30);
                            sb9.append("Ignoring invalid APV profile: ");
                            sb9.append(i22);
                            zzee.zzc("CodecSpecificDataUtil", sb9.toString());
                            return null;
                        }
                        i11 = 8192;
                    }
                    int i25 = i23 / 30;
                    int i26 = i25 + i25;
                    if (i23 % 30 == 0) {
                        i26--;
                    }
                    return new Pair(Integer.valueOf(i11), Integer.valueOf((i3 << (i26 - 1)) | (1 << i24)));
                } catch (NumberFormatException e2) {
                    zzee.zzd("CodecSpecificDataUtil", "Ignoring malformed APV codec string: ".concat(String.valueOf(str7)), e2);
                }
                break;
                break;
            case "mp4a":
                String str8 = zzvVar.zzk;
                if (strArrSplit.length != 3) {
                    zzee.zzc("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: ".concat(String.valueOf(str8)));
                    return null;
                }
                try {
                    if ("audio/mp4a-latm".equals(zzas.zze(Integer.parseInt(strArrSplit[1], 16)))) {
                        int i27 = Integer.parseInt(strArrSplit[2]);
                        if (i27 == 17) {
                            i14 = 17;
                        } else if (i27 == 20) {
                            i14 = 20;
                        } else if (i27 == 23) {
                            i14 = 23;
                        } else if (i27 == 29) {
                            i14 = 29;
                        } else if (i27 == 39) {
                            i14 = 39;
                        } else if (i27 != 42) {
                            switch (i27) {
                                case 1:
                                    i14 = 1;
                                    break;
                                case 2:
                                    i14 = 2;
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    i14 = 4;
                                    break;
                                case 5:
                                    i14 = 5;
                                    break;
                                case 6:
                                    i14 = 6;
                                    break;
                                default:
                                    i14 = -1;
                                    break;
                            }
                        } else {
                            i14 = 42;
                        }
                        if (i14 != -1) {
                            return new Pair(Integer.valueOf(i14), 0);
                        }
                    }
                    return null;
                } catch (NumberFormatException unused5) {
                    zzee.zzc("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: ".concat(String.valueOf(str8)));
                }
                break;
                break;
            case "ac-4":
                String str9 = zzvVar.zzk;
                if (strArrSplit.length != 4) {
                    zzee.zzc("CodecSpecificDataUtil", "Ignoring malformed AC-4 codec string: ".concat(String.valueOf(str9)));
                    return null;
                }
                try {
                    int i28 = Integer.parseInt(strArrSplit[1]);
                    int i29 = Integer.parseInt(strArrSplit[2]);
                    int i30 = Integer.parseInt(strArrSplit[3]);
                    if (i28 != 0) {
                        if (i28 != 1) {
                            if (i28 == 2) {
                                if (i29 == 1) {
                                    i12 = 1026;
                                    i2 = 1;
                                } else if (i29 == 2) {
                                    i12 = 1028;
                                    i2 = 2;
                                } else {
                                    i2 = i29;
                                    i12 = -1;
                                }
                            }
                        } else if (i29 == 0) {
                            i12 = 513;
                        } else {
                            if (i29 == 1) {
                                i12 = 514;
                                i2 = 1;
                            }
                            i2 = i29;
                            i12 = -1;
                        }
                    } else if (i29 == 0) {
                        i12 = 257;
                    }
                    if (i12 == -1) {
                        StringBuilder sb10 = new StringBuilder(String.valueOf(i28).length() + 23 + String.valueOf(i2).length());
                        sb10.append("Unknown AC-4 profile: ");
                        sb10.append(i28);
                        sb10.append(".");
                        sb10.append(i2);
                        zzee.zzc("CodecSpecificDataUtil", sb10.toString());
                        return null;
                    }
                    if (i30 == 0) {
                        i13 = 1;
                    } else if (i30 == 1) {
                        i13 = 2;
                    } else if (i30 == 2) {
                        i13 = 4;
                    } else if (i30 != 3) {
                        i13 = i30 != 4 ? -1 : 16;
                    }
                    if (i13 != -1) {
                        return new Pair(Integer.valueOf(i12), Integer.valueOf(i13));
                    }
                    StringBuilder sb11 = new StringBuilder(String.valueOf(i30).length() + 20);
                    sb11.append("Unknown AC-4 level: ");
                    sb11.append(i30);
                    zzee.zzc("CodecSpecificDataUtil", sb11.toString());
                    return null;
                } catch (NumberFormatException unused6) {
                    zzee.zzc("CodecSpecificDataUtil", "Ignoring malformed AC-4 codec string: ".concat(String.valueOf(str9)));
                }
                break;
                break;
            case "iamf":
                if (strArrSplit.length < 4) {
                    zzee.zzc("CodecSpecificDataUtil", "Ignoring malformed IAMF codec string: ".concat(str));
                    return null;
                }
                try {
                    int i31 = 1 << (Integer.parseInt(strArrSplit[1]) + 16);
                    String str10 = strArrSplit[3];
                    switch (str10.hashCode()) {
                        case 2464863:
                            if (str10.equals("Opus")) {
                                b2 = 0;
                            }
                            break;
                        case 3114792:
                            if (str10.equals("fLaC")) {
                                b2 = 2;
                            }
                            break;
                        case 3238865:
                            if (str10.equals("ipcm")) {
                                b2 = 3;
                            }
                            break;
                        case 3356560:
                            if (str10.equals("mp4a")) {
                                b2 = 1;
                            }
                            break;
                    }
                    if (b2 == 0) {
                        i13 = 1;
                    } else if (b2 == 1) {
                        i13 = 2;
                    } else if (b2 == 2) {
                        i13 = 4;
                    } else if (b2 != 3) {
                        zzee.zzc("CodecSpecificDataUtil", "Ignoring unknown codec identifier for IAMF auxiliary profile: ".concat(str10));
                        return null;
                    }
                    return new Pair(Integer.valueOf(i31 | 16777216 | i13), 0);
                } catch (NumberFormatException e3) {
                    zzee.zzd("CodecSpecificDataUtil", "Ignoring malformed primary profile in IAMF codec string: ".concat(String.valueOf(strArrSplit[1])), e3);
                }
                break;
                break;
            default:
                return null;
        }
        return null;
    }

    public static byte[] zzf(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3 + 4];
        System.arraycopy(zzb, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i2, bArr2, 4, i3);
        return bArr2;
    }

    public static String zza(int i2, int i3, int i5) {
        return String.format(obbPUqyhtS.GnNIO, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i5));
    }
}
