package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.CheckResult;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.android.gms.ads.identifier.Ov.YmsTEL;
import com.google.android.gms.internal.play_billing.LFHI.HrvQKfmFZJudBc;
import com.google.common.collect.nKK;
import ep.oxM.esLNYym;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import t1.AbstractC2372w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class MediaCodecUtil {
    private static final String CODEC_ID_AV01 = "av01";
    private static final String CODEC_ID_AVC1 = "avc1";
    private static final String CODEC_ID_AVC2 = "avc2";
    private static final String CODEC_ID_HEV1 = "hev1";
    private static final String CODEC_ID_HVC1 = "hvc1";
    private static final String CODEC_ID_MP4A = "mp4a";
    private static final String CODEC_ID_VP09 = "vp09";
    private static final String TAG = "MediaCodecUtil";
    private static final Pattern PROFILE_PATTERN = Pattern.compile("^\\D?(\\d+)$");

    @GuardedBy
    private static final HashMap<n, List<MediaCodecInfo>> decoderInfosCache = new HashMap<>();
    private static int maxH264DecodableFrameSize = -1;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static class DecoderQueryException extends Exception {
        private DecoderQueryException(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    private static final class I28 implements w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f57956n;
        private android.media.MediaCodecInfo[] rl;

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.w6
        public boolean secureDecodersExplicit() {
            return true;
        }

        private void n() {
            if (this.rl == null) {
                this.rl = new MediaCodecList(this.f57956n).getCodecInfos();
            }
        }

        public I28(boolean z2, boolean z3) {
            int i2;
            if (!z2 && !z3) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            this.f57956n = i2;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.w6
        public int getCodecCount() {
            n();
            return this.rl.length;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.w6
        public android.media.MediaCodecInfo getCodecInfoAt(int i2) {
            n();
            return this.rl[i2];
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.w6
        public boolean isFeatureRequired(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.w6
        public boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    private static final class Ml implements w6 {
        private Ml() {
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.w6
        public boolean isFeatureRequired(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.w6
        public boolean secureDecodersExplicit() {
            return false;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.w6
        public boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.w6
        public int getCodecCount() {
            return MediaCodecList.getCodecCount();
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.w6
        public android.media.MediaCodecInfo getCodecInfoAt(int i2) {
            return MediaCodecList.getCodecInfoAt(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    interface Wre {
        int getScore(Object obj);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    private static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final String f57957n;
        public final boolean rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final boolean f57958t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == n.class) {
                n nVar = (n) obj;
                if (TextUtils.equals(this.f57957n, nVar.f57957n) && this.rl == nVar.rl && this.f57958t == nVar.f57958t) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((this.f57957n.hashCode() + 31) * 31) + (this.rl ? 1231 : 1237)) * 31) + (this.f57958t ? 1231 : 1237);
        }

        public n(String str, boolean z2, boolean z3) {
            this.f57957n = str;
            this.rl = z2;
            this.f57958t = z3;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    private interface w6 {
        int getCodecCount();

        android.media.MediaCodecInfo getCodecInfoAt(int i2);

        boolean isFeatureRequired(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean secureDecodersExplicit();
    }

    private static int av1LevelNumberToConst(int i2) {
        switch (i2) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return 1048576;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    private static int avcLevelNumberToConst(int i2) {
        switch (i2) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i2) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i2) {
                            case 30:
                                return 256;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i2) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i2) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    private static int avcLevelToMaxFrameSize(int i2) {
        if (i2 == 1 || i2 == 2) {
            return 25344;
        }
        switch (i2) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            case 131072:
            case 262144:
            case 524288:
                return 35651584;
            default:
                return -1;
        }
    }

    private static int avcProfileNumberToConst(int i2) {
        if (i2 == 66) {
            return 1;
        }
        if (i2 == 77) {
            return 2;
        }
        if (i2 == 88) {
            return 4;
        }
        if (i2 == 100) {
            return 8;
        }
        if (i2 == 110) {
            return 16;
        }
        if (i2 != 122) {
            return i2 != 244 ? -1 : 64;
        }
        return 32;
    }

    @Nullable
    private static Pair<Integer, Integer> getAacCodecProfileAndLevel(String str, String[] strArr) {
        int iMp4aAudioObjectTypeToProfile;
        if (strArr.length != 3) {
            Log.w(TAG, "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(MimeTypes.getMimeTypeFromMp4ObjectType(Integer.parseInt(strArr[1], 16))) && (iMp4aAudioObjectTypeToProfile = mp4aAudioObjectTypeToProfile(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair<>(Integer.valueOf(iMp4aAudioObjectTypeToProfile), 0);
            }
        } catch (NumberFormatException unused) {
            Log.w(TAG, "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    @Nullable
    private static Pair<Integer, Integer> getAv1ProfileAndLevel(String str, String[] strArr, @Nullable ColorInfo colorInfo) {
        int i2;
        int length = strArr.length;
        String str2 = HrvQKfmFZJudBc.ndrmvYAsRABokxz;
        if (length < 4) {
            Log.w(str2, "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
        try {
            int i3 = Integer.parseInt(strArr[1]);
            int i5 = Integer.parseInt(strArr[2].substring(0, 2));
            int i7 = Integer.parseInt(strArr[3]);
            if (i3 != 0) {
                Log.w(str2, "Unknown AV1 profile: " + i3);
                return null;
            }
            if (i7 != 8 && i7 != 10) {
                Log.w(str2, "Unknown AV1 bit depth: " + i7);
                return null;
            }
            int i8 = i7 != 8 ? (colorInfo == null || !(colorInfo.hdrStaticInfo != null || (i2 = colorInfo.colorTransfer) == 7 || i2 == 6)) ? 2 : 4096 : 1;
            int iAv1LevelNumberToConst = av1LevelNumberToConst(i5);
            if (iAv1LevelNumberToConst != -1) {
                return new Pair<>(Integer.valueOf(i8), Integer.valueOf(iAv1LevelNumberToConst));
            }
            Log.w(str2, "Unknown AV1 level: " + i5);
            return null;
        } catch (NumberFormatException unused) {
            Log.w(str2, "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
    }

    @Nullable
    private static Pair<Integer, Integer> getAvcProfileAndLevel(String str, String[] strArr) {
        int i2;
        int i3;
        if (strArr.length < 2) {
            Log.w(TAG, "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i3 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i2 = Integer.parseInt(strArr[1].substring(4), 16);
            } else {
                if (strArr.length < 3) {
                    Log.w(TAG, "Ignoring malformed AVC codec string: " + str);
                    return null;
                }
                int i5 = Integer.parseInt(strArr[1]);
                i2 = Integer.parseInt(strArr[2]);
                i3 = i5;
            }
            int iAvcProfileNumberToConst = avcProfileNumberToConst(i3);
            if (iAvcProfileNumberToConst == -1) {
                Log.w(TAG, "Unknown AVC profile: " + i3);
                return null;
            }
            int iAvcLevelNumberToConst = avcLevelNumberToConst(i2);
            if (iAvcLevelNumberToConst != -1) {
                return new Pair<>(Integer.valueOf(iAvcProfileNumberToConst), Integer.valueOf(iAvcLevelNumberToConst));
            }
            Log.w(TAG, "Unknown AVC level: " + i2);
            return null;
        } catch (NumberFormatException unused) {
            Log.w(TAG, "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    @Nullable
    public static Pair<Integer, Integer> getCodecProfileAndLevel(Format format) {
        String str = format.codecs;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        if ("video/dolby-vision".equals(format.sampleMimeType)) {
            return getDolbyVisionProfileAndLevel(format.codecs, strArrSplit);
        }
        String str2 = strArrSplit[0];
        str2.getClass();
        switch (str2) {
            case "av01":
                return getAv1ProfileAndLevel(format.codecs, strArrSplit, format.colorInfo);
            case "avc1":
            case "avc2":
                return getAvcProfileAndLevel(format.codecs, strArrSplit);
            case "hev1":
            case "hvc1":
                return getHevcProfileAndLevel(format.codecs, strArrSplit);
            case "mp4a":
                return getAacCodecProfileAndLevel(format.codecs, strArrSplit);
            case "vp09":
                return getVp9ProfileAndLevel(format.codecs, strArrSplit);
            default:
                return null;
        }
    }

    @Nullable
    private static Pair<Integer, Integer> getDolbyVisionProfileAndLevel(String str, String[] strArr) {
        if (strArr.length < 3) {
            Log.w(TAG, "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        Matcher matcher = PROFILE_PATTERN.matcher(strArr[1]);
        if (!matcher.matches()) {
            Log.w(TAG, "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        Integer numDolbyVisionStringToProfile = dolbyVisionStringToProfile(strGroup);
        if (numDolbyVisionStringToProfile == null) {
            Log.w(TAG, "Unknown Dolby Vision profile string: " + strGroup);
            return null;
        }
        String str2 = strArr[2];
        Integer numDolbyVisionStringToLevel = dolbyVisionStringToLevel(str2);
        if (numDolbyVisionStringToLevel != null) {
            return new Pair<>(numDolbyVisionStringToProfile, numDolbyVisionStringToLevel);
        }
        Log.w(TAG, "Unknown Dolby Vision level string: " + str2);
        return null;
    }

    @Nullable
    private static Pair<Integer, Integer> getHevcProfileAndLevel(String str, String[] strArr) {
        if (strArr.length < 4) {
            Log.w(TAG, "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        int i2 = 1;
        Matcher matcher = PROFILE_PATTERN.matcher(strArr[1]);
        if (!matcher.matches()) {
            Log.w(TAG, "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        if (!"1".equals(strGroup)) {
            if (!"2".equals(strGroup)) {
                Log.w(TAG, "Unknown HEVC profile string: " + strGroup);
                return null;
            }
            i2 = 2;
        }
        String str2 = strArr[3];
        Integer numHevcCodecStringToProfileLevel = hevcCodecStringToProfileLevel(str2);
        if (numHevcCodecStringToProfileLevel != null) {
            return new Pair<>(Integer.valueOf(i2), numHevcCodecStringToProfileLevel);
        }
        Log.w(TAG, "Unknown HEVC level string: " + str2);
        return null;
    }

    @Nullable
    private static Pair<Integer, Integer> getVp9ProfileAndLevel(String str, String[] strArr) {
        if (strArr.length < 3) {
            Log.w(TAG, "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
        try {
            int i2 = Integer.parseInt(strArr[1]);
            int i3 = Integer.parseInt(strArr[2]);
            int iVp9ProfileNumberToConst = vp9ProfileNumberToConst(i2);
            if (iVp9ProfileNumberToConst == -1) {
                Log.w(TAG, "Unknown VP9 profile: " + i2);
                return null;
            }
            int iVp9LevelNumberToConst = vp9LevelNumberToConst(i3);
            if (iVp9LevelNumberToConst != -1) {
                return new Pair<>(Integer.valueOf(iVp9ProfileNumberToConst), Integer.valueOf(iVp9LevelNumberToConst));
            }
            Log.w(TAG, "Unknown VP9 level: " + i3);
            return null;
        } catch (NumberFormatException unused) {
            Log.w(TAG, "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
    }

    private static int mp4aAudioObjectTypeToProfile(int i2) {
        int i3 = 17;
        if (i2 != 17) {
            i3 = 20;
            if (i2 != 20) {
                i3 = 23;
                if (i2 != 23) {
                    i3 = 29;
                    if (i2 != 29) {
                        i3 = 39;
                        if (i2 != 39) {
                            i3 = 42;
                            if (i2 != 42) {
                                switch (i2) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i3;
    }

    private static int vp9LevelNumberToConst(int i2) {
        if (i2 == 10) {
            return 1;
        }
        if (i2 == 11) {
            return 2;
        }
        if (i2 == 20) {
            return 4;
        }
        if (i2 == 21) {
            return 8;
        }
        if (i2 == 30) {
            return 16;
        }
        if (i2 == 31) {
            return 32;
        }
        if (i2 == 40) {
            return 64;
        }
        if (i2 == 41) {
            return 128;
        }
        if (i2 == 50) {
            return 256;
        }
        if (i2 == 51) {
            return 512;
        }
        switch (i2) {
            case 60:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    private static int vp9ProfileNumberToConst(int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 2;
        }
        if (i2 != 2) {
            return i2 != 3 ? -1 : 8;
        }
        return 4;
    }

    private static void applyWorkarounds(String str, List<MediaCodecInfo> list) {
        if ("audio/raw".equals(str)) {
            if (Util.SDK_INT < 26 && Util.DEVICE.equals("R9") && list.size() == 1 && list.get(0).name.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(MediaCodecInfo.newInstance("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            sortByScore(list, new Wre() { // from class: com.google.android.exoplayer2.mediacodec.o
                @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.Wre
                public final int getScore(Object obj) {
                    return MediaCodecUtil.rl((MediaCodecInfo) obj);
                }
            });
        }
        int i2 = Util.SDK_INT;
        if (i2 < 21 && list.size() > 1) {
            String str2 = list.get(0).name;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                sortByScore(list, new Wre() { // from class: com.google.android.exoplayer2.mediacodec.qz
                    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.Wre
                    public final int getScore(Object obj) {
                        return MediaCodecUtil.t((MediaCodecInfo) obj);
                    }
                });
            }
        }
        if (i2 >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(list.get(0).name)) {
            return;
        }
        list.add(list.remove(0));
    }

    @VisibleForTesting
    public static synchronized void clearDecoderInfoCache() {
        decoderInfosCache.clear();
    }

    @Nullable
    private static Integer dolbyVisionStringToLevel(@Nullable String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    @Nullable
    private static Integer dolbyVisionStringToProfile(@Nullable String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    @Nullable
    public static String getAlternativeCodecMimeType(Format format) {
        Pair<Integer, Integer> codecProfileAndLevel;
        if ("audio/eac3-joc".equals(format.sampleMimeType)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(format.sampleMimeType) || (codecProfileAndLevel = getCodecProfileAndLevel(format)) == null) {
            return null;
        }
        int iIntValue = ((Integer) codecProfileAndLevel.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
            return "video/avc";
        }
        return null;
    }

    public static synchronized List<MediaCodecInfo> getDecoderInfos(String str, boolean z2, boolean z3) throws DecoderQueryException {
        try {
            n nVar = new n(str, z2, z3);
            HashMap<n, List<MediaCodecInfo>> map = decoderInfosCache;
            List<MediaCodecInfo> list = map.get(nVar);
            if (list != null) {
                return list;
            }
            int i2 = Util.SDK_INT;
            ArrayList<MediaCodecInfo> decoderInfosInternal = getDecoderInfosInternal(nVar, i2 >= 21 ? new I28(z2, z3) : new Ml());
            if (z2 && decoderInfosInternal.isEmpty() && 21 <= i2 && i2 <= 23) {
                decoderInfosInternal = getDecoderInfosInternal(nVar, new Ml());
                if (!decoderInfosInternal.isEmpty()) {
                    Log.w(TAG, "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + decoderInfosInternal.get(0).name);
                }
            }
            applyWorkarounds(str, decoderInfosInternal);
            nKK nkkTy = nKK.ty(decoderInfosInternal);
            map.put(nVar, nkkTy);
            return nkkTy;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b A[PHI: r16
      0x008b: PHI (r16v9 boolean) = (r16v5 boolean), (r16v11 boolean) binds: [B:41:0x009b, B:33:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fa A[Catch: Exception -> 0x0144, TRY_ENTER, TryCatch #4 {Exception -> 0x0144, blocks: (B:3:0x0008, B:5:0x001b, B:68:0x0119, B:8:0x002b, B:11:0x0036, B:62:0x00f2, B:65:0x00fa, B:67:0x0100, B:69:0x0121, B:70:0x0142), top: B:83:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0121 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ArrayList<MediaCodecInfo> getDecoderInfosInternal(n nVar, w6 w6Var) throws DecoderQueryException {
        String str;
        int i2;
        boolean z2;
        boolean z3;
        n nVar2 = nVar;
        try {
            ArrayList<MediaCodecInfo> arrayList = new ArrayList<>();
            String str2 = nVar2.f57957n;
            int codecCount = w6Var.getCodecCount();
            boolean zSecureDecodersExplicit = w6Var.secureDecodersExplicit();
            int i3 = 0;
            while (i3 < codecCount) {
                android.media.MediaCodecInfo codecInfoAt = w6Var.getCodecInfoAt(i3);
                if (isAlias(codecInfoAt)) {
                    z2 = zSecureDecodersExplicit;
                    i2 = i3;
                } else {
                    String name = codecInfoAt.getName();
                    if (isCodecUsableDecoder(codecInfoAt, name, zSecureDecodersExplicit, str2)) {
                        int i5 = i3;
                        String codecMimeType = getCodecMimeType(codecInfoAt, name, str2);
                        if (codecMimeType == null) {
                            z2 = zSecureDecodersExplicit;
                            i2 = i5;
                        } else {
                            boolean z4 = zSecureDecodersExplicit;
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt.getCapabilitiesForType(codecMimeType);
                                boolean zIsFeatureSupported = w6Var.isFeatureSupported("tunneled-playback", codecMimeType, capabilitiesForType);
                                boolean zIsFeatureRequired = w6Var.isFeatureRequired("tunneled-playback", codecMimeType, capabilitiesForType);
                                boolean z5 = nVar2.f57958t;
                                if ((z5 || !zIsFeatureRequired) && (!z5 || zIsFeatureSupported)) {
                                    boolean zIsFeatureSupported2 = w6Var.isFeatureSupported("secure-playback", codecMimeType, capabilitiesForType);
                                    boolean zIsFeatureRequired2 = w6Var.isFeatureRequired("secure-playback", codecMimeType, capabilitiesForType);
                                    boolean z6 = nVar2.rl;
                                    if ((z6 || !zIsFeatureRequired2) && (!z6 || zIsFeatureSupported2)) {
                                        try {
                                            boolean zIsHardwareAccelerated = isHardwareAccelerated(codecInfoAt, str2);
                                            try {
                                                boolean zIsSoftwareOnly = isSoftwareOnly(codecInfoAt, str2);
                                                boolean zIsVendor = isVendor(codecInfoAt);
                                                if (z4) {
                                                    z3 = zIsVendor;
                                                    if (nVar2.rl == zIsFeatureSupported2) {
                                                        z2 = z4;
                                                        boolean z7 = z3;
                                                        i2 = i5;
                                                        try {
                                                            arrayList.add(MediaCodecInfo.newInstance(name, str2, codecMimeType, capabilitiesForType, zIsHardwareAccelerated, zIsSoftwareOnly, z7, false, false));
                                                        } catch (Exception e2) {
                                                            e = e2;
                                                            str = name;
                                                            if (Util.SDK_INT > 23) {
                                                            }
                                                            Log.e(TAG, "Failed to query codec " + str + " (" + codecMimeType + ")");
                                                            throw e;
                                                        }
                                                    }
                                                } else {
                                                    z3 = zIsVendor;
                                                }
                                                if (!z4) {
                                                    try {
                                                        if (!nVar2.rl) {
                                                        }
                                                    } catch (Exception e3) {
                                                        e = e3;
                                                        i2 = i5;
                                                        z2 = z4;
                                                        str = name;
                                                        if (Util.SDK_INT > 23 || arrayList.isEmpty()) {
                                                            Log.e(TAG, "Failed to query codec " + str + " (" + codecMimeType + ")");
                                                            throw e;
                                                        }
                                                        Log.e(TAG, "Skipping codec " + str + " (failed to query capabilities)");
                                                        i3 = i2 + 1;
                                                        nVar2 = nVar;
                                                        zSecureDecodersExplicit = z2;
                                                    }
                                                }
                                                z2 = z4;
                                                boolean z9 = z3;
                                                i2 = i5;
                                                if (!z2 && zIsFeatureSupported2) {
                                                    str = name;
                                                    try {
                                                        arrayList.add(MediaCodecInfo.newInstance(name + ".secure", str2, codecMimeType, capabilitiesForType, zIsHardwareAccelerated, zIsSoftwareOnly, z9, false, true));
                                                        break;
                                                    } catch (Exception e4) {
                                                        e = e4;
                                                        if (Util.SDK_INT > 23) {
                                                        }
                                                        Log.e(TAG, "Failed to query codec " + str + " (" + codecMimeType + ")");
                                                        throw e;
                                                    }
                                                }
                                            } catch (Exception e5) {
                                                e = e5;
                                                str = name;
                                                i2 = i5;
                                                z2 = z4;
                                            }
                                        } catch (Exception e6) {
                                            e = e6;
                                            str = name;
                                            z2 = z4;
                                            i2 = i5;
                                        }
                                    } else {
                                        i2 = i5;
                                        z2 = z4;
                                    }
                                }
                            } catch (Exception e7) {
                                e = e7;
                                str = name;
                                i2 = i5;
                                z2 = z4;
                            }
                        }
                    } else {
                        z2 = zSecureDecodersExplicit;
                        i2 = i3;
                    }
                }
                i3 = i2 + 1;
                nVar2 = nVar;
                zSecureDecodersExplicit = z2;
            }
            return arrayList;
        } catch (Exception e8) {
            throw new DecoderQueryException(e8);
        }
    }

    @CheckResult
    public static List<MediaCodecInfo> getDecoderInfosSortedByFormatSupport(List<MediaCodecInfo> list, final Format format) {
        ArrayList arrayList = new ArrayList(list);
        sortByScore(arrayList, new Wre() { // from class: com.google.android.exoplayer2.mediacodec.Pl
            @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.Wre
            public final int getScore(Object obj) {
                return MediaCodecUtil.nr(format, (MediaCodecInfo) obj);
            }
        });
        return arrayList;
    }

    @Nullable
    public static MediaCodecInfo getDecryptOnlyDecoderInfo() throws DecoderQueryException {
        return getDecoderInfo("audio/raw", false, false);
    }

    @Nullable
    private static Integer hevcCodecStringToProfileLevel(@Nullable String str) {
        if (str == null) {
            return null;
        }
        byte b2 = -1;
        switch (str.hashCode()) {
            case 70821:
                if (str.equals("H30")) {
                    b2 = 0;
                }
                break;
            case 70914:
                if (str.equals("H60")) {
                    b2 = 1;
                }
                break;
            case 70917:
                if (str.equals("H63")) {
                    b2 = 2;
                }
                break;
            case 71007:
                if (str.equals("H90")) {
                    b2 = 3;
                }
                break;
            case 71010:
                if (str.equals("H93")) {
                    b2 = 4;
                }
                break;
            case 74665:
                if (str.equals("L30")) {
                    b2 = 5;
                }
                break;
            case 74758:
                if (str.equals("L60")) {
                    b2 = 6;
                }
                break;
            case 74761:
                if (str.equals("L63")) {
                    b2 = 7;
                }
                break;
            case 74851:
                if (str.equals("L90")) {
                    b2 = 8;
                }
                break;
            case 74854:
                if (str.equals(esLNYym.HrdVOBVNZOar)) {
                    b2 = 9;
                }
                break;
            case 2193639:
                if (str.equals("H120")) {
                    b2 = 10;
                }
                break;
            case 2193642:
                if (str.equals("H123")) {
                    b2 = 11;
                }
                break;
            case 2193732:
                if (str.equals("H150")) {
                    b2 = 12;
                }
                break;
            case 2193735:
                if (str.equals("H153")) {
                    b2 = 13;
                }
                break;
            case 2193738:
                if (str.equals("H156")) {
                    b2 = 14;
                }
                break;
            case 2193825:
                if (str.equals("H180")) {
                    b2 = 15;
                }
                break;
            case 2193828:
                if (str.equals("H183")) {
                    b2 = 16;
                }
                break;
            case 2193831:
                if (str.equals("H186")) {
                    b2 = 17;
                }
                break;
            case 2312803:
                if (str.equals("L120")) {
                    b2 = 18;
                }
                break;
            case 2312806:
                if (str.equals("L123")) {
                    b2 = 19;
                }
                break;
            case 2312896:
                if (str.equals("L150")) {
                    b2 = 20;
                }
                break;
            case 2312899:
                if (str.equals("L153")) {
                    b2 = 21;
                }
                break;
            case 2312902:
                if (str.equals("L156")) {
                    b2 = 22;
                }
                break;
            case 2312989:
                if (str.equals("L180")) {
                    b2 = 23;
                }
                break;
            case 2312992:
                if (str.equals("L183")) {
                    b2 = 24;
                }
                break;
            case 2312995:
                if (str.equals("L186")) {
                    b2 = 25;
                }
                break;
        }
        switch (b2) {
        }
        return null;
    }

    private static boolean isAlias(android.media.MediaCodecInfo mediaCodecInfo) {
        return Util.SDK_INT >= 29 && isAliasV29(mediaCodecInfo);
    }

    private static boolean isHardwareAccelerated(android.media.MediaCodecInfo mediaCodecInfo, String str) {
        return Util.SDK_INT >= 29 ? isHardwareAcceleratedV29(mediaCodecInfo) : !isSoftwareOnly(mediaCodecInfo, str);
    }

    private static boolean isSoftwareOnly(android.media.MediaCodecInfo mediaCodecInfo, String str) {
        if (Util.SDK_INT >= 29) {
            return isSoftwareOnlyV29(mediaCodecInfo);
        }
        if (MimeTypes.isAudio(str)) {
            return true;
        }
        String strO = AbstractC2372w6.O(mediaCodecInfo.getName());
        if (strO.startsWith("arc.")) {
            return false;
        }
        return strO.startsWith("omx.google.") || strO.startsWith("omx.ffmpeg.") || (strO.startsWith("omx.sec.") && strO.contains(".sw.")) || strO.equals("omx.qcom.video.decoder.hevcswvdec") || strO.startsWith("c2.android.") || strO.startsWith("c2.google.") || !(strO.startsWith("omx.") || strO.startsWith("c2."));
    }

    private static boolean isVendor(android.media.MediaCodecInfo mediaCodecInfo) {
        if (Util.SDK_INT >= 29) {
            return isVendorV29(mediaCodecInfo);
        }
        String strO = AbstractC2372w6.O(mediaCodecInfo.getName());
        return (strO.startsWith("omx.google.") || strO.startsWith("c2.android.") || strO.startsWith("c2.google.")) ? false : true;
    }

    public static int maxH264DecodableFrameSize() throws DecoderQueryException {
        if (maxH264DecodableFrameSize == -1) {
            int iMax = 0;
            MediaCodecInfo decoderInfo = getDecoderInfo("video/avc", false, false);
            if (decoderInfo != null) {
                MediaCodecInfo.CodecProfileLevel[] profileLevels = decoderInfo.getProfileLevels();
                int length = profileLevels.length;
                int iMax2 = 0;
                while (iMax < length) {
                    iMax2 = Math.max(avcLevelToMaxFrameSize(profileLevels[iMax].level), iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, Util.SDK_INT >= 21 ? 345600 : 172800);
            }
            maxH264DecodableFrameSize = iMax;
        }
        return maxH264DecodableFrameSize;
    }

    public static /* synthetic */ int rl(MediaCodecInfo mediaCodecInfo) {
        String str = mediaCodecInfo.name;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Util.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    private static <T> void sortByScore(List<T> list, final Wre wre) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.exoplayer2.mediacodec.C
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return MediaCodecUtil.n(wre, obj, obj2);
            }
        });
    }

    public static /* synthetic */ int t(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.name.startsWith("OMX.google") ? 1 : 0;
    }

    private MediaCodecUtil() {
    }

    @Nullable
    private static String getCodecMimeType(android.media.MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && YmsTEL.DoOnNhQa.equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    @Nullable
    public static MediaCodecInfo getDecoderInfo(String str, boolean z2, boolean z3) throws DecoderQueryException {
        List<MediaCodecInfo> decoderInfos = getDecoderInfos(str, z2, z3);
        if (decoderInfos.isEmpty()) {
            return null;
        }
        return decoderInfos.get(0);
    }

    @RequiresApi
    private static boolean isAliasV29(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    private static boolean isCodecUsableDecoder(android.media.MediaCodecInfo mediaCodecInfo, String str, boolean z2, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z2 && str.endsWith(".secure"))) {
            return false;
        }
        int i2 = Util.SDK_INT;
        if (i2 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i2 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = Util.DEVICE;
            if ("a70".equals(str3) || ("Xiaomi".equals(Util.MANUFACTURER) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i2 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = Util.DEVICE;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i2 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = Util.DEVICE;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i2 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(Util.MANUFACTURER))) {
            String str6 = Util.DEVICE;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i2 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(Util.MANUFACTURER)) {
            String str7 = Util.DEVICE;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i2 <= 19 && Util.DEVICE.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        if (i2 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) {
            return false;
        }
        return true;
    }

    @RequiresApi
    private static boolean isHardwareAcceleratedV29(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    @RequiresApi
    private static boolean isSoftwareOnlyV29(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    @RequiresApi
    private static boolean isVendorV29(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    public static /* synthetic */ int n(Wre wre, Object obj, Object obj2) {
        return wre.getScore(obj2) - wre.getScore(obj);
    }

    public static /* synthetic */ int nr(Format format, MediaCodecInfo mediaCodecInfo) {
        try {
            return mediaCodecInfo.isFormatSupported(format) ? 1 : 0;
        } catch (DecoderQueryException unused) {
            return -1;
        }
    }

    public static void warmDecoderInfoCache(String str, boolean z2, boolean z3) {
        try {
            getDecoderInfos(str, z2, z3);
        } catch (DecoderQueryException e2) {
            Log.e(TAG, "Codec warming failed", e2);
        }
    }
}
