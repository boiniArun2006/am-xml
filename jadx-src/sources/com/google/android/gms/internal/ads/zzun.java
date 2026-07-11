package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.MimeTypes;
import com.alightcreative.time.Kw.znsSxz;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzun {
    public final String zza;
    public final String zzb;
    public final String zzc;

    @Nullable
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    private final boolean zzi;
    private int zzj;
    private int zzk;
    private float zzl;

    public final String toString() {
        return this.zza;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzun zza(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        String str4;
        String str5;
        MediaCodecInfo.CodecCapabilities codecCapabilities2;
        boolean z7;
        boolean z9;
        boolean z10;
        boolean z11;
        String str6;
        boolean z12 = codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback");
        boolean z13 = codecCapabilities != null && codecCapabilities.isFeatureSupported("tunneled-playback");
        boolean z14 = z6 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback"));
        if (Build.VERSION.SDK_INT < 35 || codecCapabilities == null || !codecCapabilities.isFeatureSupported("detached-surface")) {
            str4 = str;
            str5 = str3;
            codecCapabilities2 = codecCapabilities;
            z7 = z2;
            z9 = z3;
            z10 = z4;
            z11 = false;
            str6 = str2;
        } else {
            String str7 = Build.MANUFACTURER;
            if (!str7.equals("Xiaomi") && !str7.equals("OPPO") && !str7.equals("realme") && !str7.equals("motorola") && !str7.equals("LENOVO")) {
                str6 = str2;
                str5 = str3;
                codecCapabilities2 = codecCapabilities;
                z7 = z2;
                z9 = z3;
                z10 = z4;
                z11 = true;
                str4 = str;
            }
        }
        return new zzun(str4, str6, str5, codecCapabilities2, z7, z9, z10, z12, z13, z14, z11);
    }

    private final boolean zzj(zzv zzvVar) {
        String str = this.zzb;
        return str.equals(zzvVar.zzo) || str.equals(zzvg.zzg(zzvVar));
    }

    private final boolean zzl(zzv zzvVar) {
        return (Objects.equals(zzvVar.zzo, "audio/flac") && zzvVar.zzI == 22 && Build.VERSION.SDK_INT < 34 && this.zza.equals("c2.android.flac.decoder")) ? false : true;
    }

    private final void zzm(String str) {
        String str2 = zzfj.zza;
        String str3 = this.zzb;
        int length = String.valueOf(str3).length();
        int length2 = String.valueOf(str2).length();
        int length3 = str.length();
        String str4 = this.zza;
        StringBuilder sb = new StringBuilder(length3 + 14 + str4.length() + 2 + length + 3 + length2 + 1);
        sb.append("NoSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(str4);
        sb.append(", ");
        sb.append(str3);
        sb.append("] [");
        sb.append(str2);
        sb.append("]");
        zzee.zza("MediaCodecInfo", sb.toString());
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzb() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public final boolean zze(zzv zzvVar) {
        if (this.zzi) {
            return this.zze;
        }
        Pair pairZzd = zzdo.zzd(zzvVar);
        return pairZzd != null && ((Integer) pairZzd.first).intValue() == 42;
    }

    public final zzio zzf(zzv zzvVar, zzv zzvVar2) {
        zzv zzvVar3;
        zzv zzvVar4;
        int i2;
        String str = zzvVar.zzo;
        String str2 = zzvVar2.zzo;
        int i3 = true != Objects.equals(str, str2) ? 8 : 0;
        if (this.zzi) {
            if (zzvVar.zzA != zzvVar2.zzA) {
                i3 |= 1024;
            }
            boolean z2 = (zzvVar.zzv == zzvVar2.zzv && zzvVar.zzw == zzvVar2.zzw) ? false : true;
            if (!this.zze && z2) {
                i3 |= 512;
            }
            zzi zziVar = zzvVar.zzE;
            if ((!zzi.zza(zziVar) || !zzi.zza(zzvVar2.zzE)) && !Objects.equals(zziVar, zzvVar2.zzE)) {
                i3 |= 2048;
            }
            String str3 = this.zza;
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str3) && !zzvVar.zzd(zzvVar2)) {
                i3 |= 2;
            }
            int i5 = zzvVar.zzx;
            if (i5 != -1 && (i2 = zzvVar.zzy) != -1 && i5 == zzvVar2.zzx && i2 == zzvVar2.zzy && z2) {
                i3 |= 2;
            }
            if (i3 == 0 && Objects.equals(str2, "video/dolby-vision")) {
                Pair pairZzd = zzdo.zzd(zzvVar);
                Pair pairZzd2 = zzdo.zzd(zzvVar2);
                if (pairZzd == null || pairZzd2 == null || !((Integer) pairZzd.first).equals(pairZzd2.first)) {
                    i3 = 2;
                }
            }
            if (i3 == 0) {
                return new zzio(str3, zzvVar, zzvVar2, true == zzvVar.zzd(zzvVar2) ? 3 : 2, 0);
            }
            zzvVar3 = zzvVar;
            zzvVar4 = zzvVar2;
        } else {
            zzvVar3 = zzvVar;
            zzvVar4 = zzvVar2;
            if (zzvVar3.zzG != zzvVar4.zzG) {
                i3 |= 4096;
            }
            if (zzvVar3.zzH != zzvVar4.zzH) {
                i3 |= 8192;
            }
            if (zzvVar3.zzI != zzvVar4.zzI) {
                i3 |= 16384;
            }
            if (i3 == 0) {
                String str4 = this.zzb;
                if (str4.equals("audio/mp4a-latm") || str4.equals("audio/ac4")) {
                    Pair pairZzd3 = zzdo.zzd(zzvVar3);
                    Pair pairZzd4 = zzdo.zzd(zzvVar4);
                    if (pairZzd3 != null && pairZzd4 != null) {
                        int iIntValue = ((Integer) pairZzd3.first).intValue();
                        int iIntValue2 = ((Integer) pairZzd4.first).intValue();
                        if (iIntValue == 42 && iIntValue2 == 42) {
                            return new zzio(this.zza, zzvVar3, zzvVar4, 3, 0);
                        }
                        if (str4.equals("audio/ac4") && pairZzd3.equals(pairZzd4)) {
                            return new zzio(this.zza, zzvVar3, zzvVar4, 3, 0);
                        }
                    }
                }
            }
            if (i3 == 0) {
                String str5 = this.zzb;
                if (str5.equals("audio/eac3-joc") || str5.equals("audio/eac3")) {
                    return new zzio(this.zza, zzvVar3, zzvVar4, 3, 0);
                }
            }
            if (!zzvVar3.zzd(zzvVar4)) {
                i3 |= 32;
            }
            if ("audio/opus".equals(this.zzb)) {
                i3 |= 2;
            }
            if (i3 == 0) {
                return new zzio(this.zza, zzvVar3, zzvVar4, 1, 0);
            }
        }
        return new zzio(this.zza, zzvVar3, zzvVar4, 0, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzg(int i2, int i3, double d2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null) {
            zzm("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            zzm("sizeAndRate.vCaps");
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int iZza = zzup.zza(videoCapabilities, i2, i3, d2);
            if (iZza != 2) {
                if (iZza == 1) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 20 + String.valueOf(i3).length() + 1 + String.valueOf(d2).length());
                    sb.append(znsSxz.XlMfDQ);
                    sb.append(i2);
                    sb.append("x");
                    sb.append(i3);
                    sb.append("@");
                    sb.append(d2);
                    zzm(sb.toString());
                    return false;
                }
                if (!zzn(videoCapabilities, i2, i3, d2)) {
                }
            }
        } else if (!zzn(videoCapabilities, i2, i3, d2)) {
            if (i2 < i3) {
                String str = this.zza;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && zzn(videoCapabilities, i3, i2, d2)) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length() + 22 + String.valueOf(i3).length() + 1 + String.valueOf(d2).length());
                    sb2.append("sizeAndRate.rotated, ");
                    sb2.append(i2);
                    sb2.append("x");
                    sb2.append(i3);
                    sb2.append("@");
                    sb2.append(d2);
                    String string = sb2.toString();
                    String str2 = this.zzb;
                    int length = str.length();
                    String str3 = zzfj.zza;
                    int length2 = String.valueOf(str2).length();
                    StringBuilder sb3 = new StringBuilder(string.length() + 19 + length + 2 + length2 + 3 + String.valueOf(str3).length() + 1);
                    sb3.append("AssumedSupport [");
                    sb3.append(string);
                    sb3.append("] [");
                    sb3.append(str);
                    sb3.append(", ");
                    sb3.append(str2);
                    sb3.append("] [");
                    sb3.append(str3);
                    sb3.append("]");
                    zzee.zza("MediaCodecInfo", sb3.toString());
                }
            }
            StringBuilder sb4 = new StringBuilder(String.valueOf(i2).length() + 22 + String.valueOf(i3).length() + 1 + String.valueOf(d2).length());
            sb4.append("sizeAndRate.support, ");
            sb4.append(i2);
            sb4.append("x");
            sb4.append(i3);
            sb4.append("@");
            sb4.append(d2);
            zzm(sb4.toString());
            return false;
        }
        return true;
    }

    public final float zzh(int i2, int i3) {
        if (!this.zzi) {
            return -3.4028235E38f;
        }
        float f3 = this.zzl;
        if (f3 != -3.4028235E38f && this.zzj == i2 && this.zzk == i3) {
            return f3;
        }
        float f4 = 1024.0f;
        if (!zzg(i2, i3, 1024.0d)) {
            float f5 = 0.0f;
            while (true) {
                float f6 = f4 - f5;
                if (Math.abs(f6) <= 5.0f) {
                    break;
                }
                float f7 = (f6 / 2.0f) + f5;
                boolean zZzg = zzg(i2, i3, f7);
                if (true == zZzg) {
                    f5 = f7;
                }
                if (true != zZzg) {
                    f4 = f7;
                }
            }
            f4 = f5;
        }
        this.zzl = f4;
        this.zzj = i2;
        this.zzk = i3;
        return f4;
    }

    @Nullable
    public final Point zzi(int i2, int i3) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zzo(videoCapabilities, i2, i3);
    }

    @VisibleForTesting
    zzun(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z9) {
        str.getClass();
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z2;
        this.zze = z5;
        this.zzf = z7;
        this.zzh = z9;
        this.zzi = zzas.zzb(str2);
        this.zzl = -3.4028235E38f;
        this.zzj = -1;
        this.zzk = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzk(zzv zzvVar, boolean z2) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrZzb;
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        Pair pairZzd = zzdo.zzd(zzvVar);
        String str2 = zzvVar.zzo;
        byte b2 = -1;
        if (str2 != null && str2.equals(MimeTypes.VIDEO_MV_HEVC)) {
            String strZzh = zzas.zzh(this.zzc);
            if (!strZzh.equals(MimeTypes.VIDEO_MV_HEVC)) {
                if (strZzh.equals("video/hevc")) {
                    int i2 = zzvg.zza;
                    String strZzk = zzgm.zzk(zzvVar.zzr);
                    if (strZzk == null) {
                        pairZzd = null;
                    } else {
                        String strTrim = strZzk.trim();
                        String str3 = zzfj.zza;
                        pairZzd = zzdo.zze(strZzk, strTrim.split("\\.", -1), zzvVar.zzE);
                    }
                }
                if (pairZzd != null) {
                }
            }
        } else if (pairZzd != null) {
            int iIntValue = ((Integer) pairZzd.first).intValue();
            int iIntValue2 = ((Integer) pairZzd.second).intValue();
            int i3 = 8;
            if ("video/dolby-vision".equals(str2)) {
                String str4 = this.zzb;
                int iHashCode = str4.hashCode();
                if (iHashCode != -1662735862) {
                    if (iHashCode != -1662541442) {
                        if (iHashCode == 1331836730 && str4.equals("video/avc")) {
                            b2 = 0;
                        }
                    } else if (str4.equals("video/hevc")) {
                        b2 = 1;
                    }
                } else if (str4.equals("video/av01")) {
                    b2 = 2;
                }
                if (b2 != 0) {
                    if (b2 == 1 || b2 == 2) {
                        iIntValue = 2;
                    }
                } else {
                    iIntValue = 8;
                }
                iIntValue2 = 0;
            }
            if (!this.zzi && !this.zzb.equals("audio/ac4")) {
                if (iIntValue == 42) {
                    iIntValue = 42;
                    codecProfileLevelArrZzb = zzb();
                    str = this.zzb;
                    if (str.equals("audio/ac4")) {
                        codecCapabilities = this.zzd;
                        if (codecCapabilities != null) {
                            i3 = 16;
                        }
                        codecProfileLevelArrZzb = new MediaCodecInfo.CodecProfileLevel[]{zzvg.zzf(257, i3), zzvg.zzf(513, i3), zzvg.zzf(514, i3), zzvg.zzf(1026, i3), zzvg.zzf(1028, i3)};
                    }
                    while (i < r2) {
                    }
                    String str5 = zzvVar.zzk;
                    String str6 = this.zzc;
                    StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 22 + str6.length());
                    sb.append("codec.profileLevel, ");
                    sb.append(str5);
                    sb.append(", ");
                    sb.append(str6);
                    zzm(sb.toString());
                    return false;
                }
            } else {
                codecProfileLevelArrZzb = zzb();
                str = this.zzb;
                if (str.equals("audio/ac4") && codecProfileLevelArrZzb.length == 0) {
                    codecCapabilities = this.zzd;
                    if (codecCapabilities != null && (audioCapabilities = codecCapabilities.getAudioCapabilities()) != null && audioCapabilities.getMaxInputChannelCount() > 18) {
                        i3 = 16;
                    }
                    codecProfileLevelArrZzb = new MediaCodecInfo.CodecProfileLevel[]{zzvg.zzf(257, i3), zzvg.zzf(513, i3), zzvg.zzf(514, i3), zzvg.zzf(1026, i3), zzvg.zzf(1028, i3)};
                }
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArrZzb) {
                    if (codecProfileLevel.profile == iIntValue && (codecProfileLevel.level >= iIntValue2 || !z2)) {
                        if ("video/hevc".equals(str) && iIntValue == 2) {
                            String str7 = Build.DEVICE;
                            if ("sailfish".equals(str7) || "marlin".equals(str7)) {
                            }
                        }
                    }
                }
                String str52 = zzvVar.zzk;
                String str62 = this.zzc;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str52).length() + 22 + str62.length());
                sb2.append("codec.profileLevel, ");
                sb2.append(str52);
                sb2.append(", ");
                sb2.append(str62);
                zzm(sb2.toString());
                return false;
            }
        }
        return true;
    }

    private static boolean zzn(MediaCodecInfo.VideoCapabilities videoCapabilities, int i2, int i3, double d2) {
        Point pointZzo = zzo(videoCapabilities, i2, i3);
        int i5 = pointZzo.x;
        int i7 = pointZzo.y;
        if (d2 != -1.0d && d2 >= 1.0d) {
            double dFloor = Math.floor(d2);
            if (!videoCapabilities.areSizeAndRateSupported(i5, i7, dFloor)) {
                return false;
            }
            Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i5, i7);
            if (achievableFrameRatesFor != null && dFloor > ((Double) achievableFrameRatesFor.getUpper()).doubleValue()) {
                return false;
            }
            return true;
        }
        return videoCapabilities.isSizeSupported(i5, i7);
    }

    private static Point zzo(MediaCodecInfo.VideoCapabilities videoCapabilities, int i2, int i3) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        String str = zzfj.zza;
        return new Point((((i2 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i3 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final boolean zzc(zzv zzvVar) throws zzuy {
        int i2;
        int i3;
        if (!zzj(zzvVar) || !zzk(zzvVar, true) || !zzl(zzvVar)) {
            return false;
        }
        if (this.zzi) {
            int i5 = zzvVar.zzv;
            if (i5 <= 0 || (i3 = zzvVar.zzw) <= 0) {
                return true;
            }
            return zzg(i5, i3, zzvVar.zzz);
        }
        int i7 = zzvVar.zzH;
        if (i7 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
            if (codecCapabilities == null) {
                zzm("sampleRate.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                zzm("sampleRate.aCaps");
                return false;
            }
            if (!audioCapabilities.isSampleRateSupported(i7)) {
                StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 20);
                sb.append("sampleRate.support, ");
                sb.append(i7);
                zzm(sb.toString());
                return false;
            }
        }
        int i8 = zzvVar.zzG;
        if (i8 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
            if (codecCapabilities2 == null) {
                zzm("channelCount.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
            if (audioCapabilities2 == null) {
                zzm("channelCount.aCaps");
                return false;
            }
            String str = this.zza;
            String str2 = this.zzb;
            int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
            if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                if ("audio/ac3".equals(str2)) {
                    i2 = 6;
                } else if ("audio/eac3".equals(str2)) {
                    i2 = 16;
                } else {
                    i2 = 30;
                }
                StringBuilder sb2 = new StringBuilder(str.length() + 32 + String.valueOf(maxInputChannelCount).length() + 4 + String.valueOf(i2).length() + 1);
                sb2.append("AssumedMaxChannelAdjustment: ");
                sb2.append(str);
                sb2.append(", [");
                sb2.append(maxInputChannelCount);
                sb2.append(" to ");
                sb2.append(i2);
                sb2.append("]");
                zzee.zzc("MediaCodecInfo", sb2.toString());
                maxInputChannelCount = i2;
            }
            if (maxInputChannelCount < i8) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(i8).length() + 22);
                sb3.append("channelCount.support, ");
                sb3.append(i8);
                zzm(sb3.toString());
                return false;
            }
        }
        return true;
    }

    public final boolean zzd(zzv zzvVar) {
        if (!zzj(zzvVar) || !zzk(zzvVar, false) || !zzl(zzvVar)) {
            return false;
        }
        return true;
    }
}
