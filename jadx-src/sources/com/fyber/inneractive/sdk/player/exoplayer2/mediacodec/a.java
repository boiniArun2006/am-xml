package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import androidx.core.net.Toe.GDEJgAYrPQHfw;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f55767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f55768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f55769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f55770e;

    public final boolean a(String str) {
        String strA;
        String[] strArrSplit;
        Pair pair;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        Integer numValueOf;
        Integer numValueOf2;
        int i2 = 2;
        if (str == null || this.f55769d == null || (strA = com.fyber.inneractive.sdk.player.exoplayer2.util.i.a(str)) == null) {
            return true;
        }
        if (!this.f55769d.equals(strA)) {
            b("codec.mime " + str + ", " + strA);
            return false;
        }
        Pattern pattern = j.f55810a;
        strArrSplit = str.split("\\.");
        String str2 = strArrSplit[0];
        str2.getClass();
        pair = null;
        switch (str2) {
            case "avc1":
            case "avc2":
                if (strArrSplit.length >= 2) {
                    try {
                        if (strArrSplit[1].length() == 6) {
                            numValueOf2 = Integer.valueOf(Integer.parseInt(strArrSplit[1].substring(0, 2), 16));
                            numValueOf = Integer.valueOf(Integer.parseInt(strArrSplit[1].substring(4), 16));
                        } else if (strArrSplit.length < 3) {
                            Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(str));
                        } else {
                            Integer numValueOf3 = Integer.valueOf(Integer.parseInt(strArrSplit[1]));
                            numValueOf = Integer.valueOf(Integer.parseInt(strArrSplit[2]));
                            numValueOf2 = numValueOf3;
                        }
                        pair = new Pair(Integer.valueOf(j.f55812c.get(numValueOf2.intValue())), Integer.valueOf(j.f55813d.get(numValueOf.intValue())));
                    } catch (NumberFormatException unused) {
                        Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(str));
                    }
                    break;
                } else {
                    Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(str));
                    break;
                }
                break;
            case "hev1":
            case "hvc1":
                if (strArrSplit.length >= 4) {
                    Matcher matcher = j.f55810a.matcher(strArrSplit[1]);
                    if (matcher.matches()) {
                        String strGroup = matcher.group(1);
                        if ("1".equals(strGroup)) {
                            i2 = 1;
                        } else if (!"2".equals(strGroup)) {
                            Log.w("MediaCodecUtil", "Unknown HEVC profile string: " + strGroup);
                            break;
                        }
                        Integer num = (Integer) j.f55814e.get(strArrSplit[3]);
                        if (num == null) {
                            Log.w("MediaCodecUtil", "Unknown HEVC level string: " + matcher.group(1));
                        } else {
                            pair = new Pair(Integer.valueOf(i2), num);
                        }
                    } else {
                        Log.w("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(str));
                    }
                    break;
                } else {
                    Log.w("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(str));
                    break;
                }
                break;
        }
        if (pair == null) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f55770e;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
            if (codecProfileLevel.profile == ((Integer) pair.first).intValue() && codecProfileLevel.level >= ((Integer) pair.second).intValue()) {
                return true;
            }
        }
        b("codec.profileLevel, " + str + ", " + strA);
        return false;
    }

    public final boolean b(int i2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f55770e;
        if (codecCapabilities == null) {
            b("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            b("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i2)) {
            return true;
        }
        b("sampleRate.support, " + i2);
        return false;
    }

    public a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z2) {
        boolean z3;
        str.getClass();
        this.f55766a = str;
        this.f55769d = str2;
        this.f55770e = codecCapabilities;
        boolean z4 = false;
        if (!z2 && codecCapabilities != null && z.f56234a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback")) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f55767b = z3;
        if (codecCapabilities != null && z.f56234a >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback")) {
            z4 = true;
        }
        this.f55768c = z4;
    }

    public final void b(String str) {
        Log.d("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f55766a + ", " + this.f55769d + "] [" + z.f56238e + "]");
    }

    public final boolean a(int i2, int i3, double d2) {
        boolean zIsSizeSupported;
        boolean zIsSizeSupported2;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f55770e;
        if (codecCapabilities == null) {
            b("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            b("sizeAndRate.vCaps");
            return false;
        }
        if (d2 != -1.0d && d2 > 0.0d) {
            zIsSizeSupported = videoCapabilities.areSizeAndRateSupported(i2, i3, d2);
        } else {
            zIsSizeSupported = videoCapabilities.isSizeSupported(i2, i3);
        }
        if (zIsSizeSupported) {
            return true;
        }
        if (i2 < i3) {
            if (d2 != -1.0d && d2 > 0.0d) {
                zIsSizeSupported2 = videoCapabilities.areSizeAndRateSupported(i3, i2, d2);
            } else {
                zIsSizeSupported2 = videoCapabilities.isSizeSupported(i3, i2);
            }
            if (zIsSizeSupported2) {
                Log.d("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i2 + "x" + i3 + "x" + d2) + "] [" + this.f55766a + ", " + this.f55769d + "] [" + z.f56238e + "]");
                return true;
            }
        }
        b("sizeAndRate.support, " + i2 + "x" + i3 + "x" + d2);
        return false;
    }

    public final Point a(int i2, int i3) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f55770e;
        if (codecCapabilities == null) {
            b(GDEJgAYrPQHfw.oUvZiunMKYqPb);
            return null;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            b("align.vCaps");
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i5 = z.f56234a;
        return new Point((((i2 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i3 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final boolean a(int i2) {
        int i3;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f55770e;
        if (codecCapabilities == null) {
            b("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            b("channelCount.aCaps");
            return false;
        }
        String str = this.f55766a;
        String str2 = this.f55769d;
        int maxInputChannelCount = audioCapabilities.getMaxInputChannelCount();
        if (maxInputChannelCount <= 1 && ((z.f56234a < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
            if ("audio/ac3".equals(str2)) {
                i3 = 6;
            } else {
                i3 = "audio/eac3".equals(str2) ? 16 : 30;
            }
            Log.w("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i3 + "]");
            maxInputChannelCount = i3;
        }
        if (maxInputChannelCount >= i2) {
            return true;
        }
        b("channelCount.support, " + i2);
        return false;
    }
}
