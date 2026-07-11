package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.SparseIntArray;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f55810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f55811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SparseIntArray f55812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final SparseIntArray f55813d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f55814e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f55815f;

    public static a a(boolean z2, String str) {
        List listUnmodifiableList;
        synchronized (j.class) {
            try {
                e eVar = new e(z2, str);
                listUnmodifiableList = (List) f55811b.get(eVar);
                if (listUnmodifiableList == null) {
                    int i2 = z.f56234a;
                    ArrayList arrayListA = a(eVar, i2 >= 21 ? new i(z2) : new h());
                    if (z2 && arrayListA.isEmpty() && 21 <= i2 && i2 <= 23) {
                        arrayListA = a(eVar, new h());
                        if (!arrayListA.isEmpty()) {
                            Log.w("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((a) arrayListA.get(0)).f55766a);
                        }
                    }
                    if (i2 < 26) {
                        int i3 = 1;
                        if (arrayListA.size() > 1 && "OMX.MTK.AUDIO.DECODER.RAW".equals(((a) arrayListA.get(0)).f55766a)) {
                            while (true) {
                                if (i3 >= arrayListA.size()) {
                                    break;
                                }
                                a aVar = (a) arrayListA.get(i3);
                                if ("OMX.google.raw.decoder".equals(aVar.f55766a)) {
                                    arrayListA.remove(i3);
                                    arrayListA.add(0, aVar);
                                    break;
                                }
                                i3++;
                            }
                        }
                    }
                    listUnmodifiableList = Collections.unmodifiableList(arrayListA);
                    f55811b.put(eVar, listUnmodifiableList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            return null;
        }
        return (a) listUnmodifiableList.get(0);
    }

    static {
        new a("OMX.google.raw.decoder", null, null, false);
        f55810a = Pattern.compile("^\\D?(\\d+)$");
        f55811b = new HashMap();
        f55815f = -1;
        SparseIntArray sparseIntArray = new SparseIntArray();
        f55812c = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f55813d = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, 512);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, 2048);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, 65536);
        HashMap map = new HashMap();
        f55814e = map;
        map.put("L30", 1);
        map.put("L60", 4);
        map.put("L63", 16);
        map.put("L90", 64);
        map.put("L93", 256);
        map.put("L120", 1024);
        map.put("L123", 4096);
        map.put("L150", 16384);
        map.put("L153", 65536);
        map.put("L156", 262144);
        map.put("L180", 1048576);
        map.put("L183", 4194304);
        map.put("L186", 16777216);
        map.put("H30", 2);
        map.put("H60", 8);
        map.put("H63", 32);
        map.put("H90", 128);
        map.put("H93", 512);
        map.put("H120", 2048);
        map.put("H123", 8192);
        map.put("H150", 32768);
        map.put("H153", 131072);
        map.put("H156", 524288);
        map.put("H180", 2097152);
        map.put("H183", 8388608);
        map.put("H186", 33554432);
    }

    public static int a() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i2;
        if (f55815f == -1) {
            int iMax = 0;
            a aVarA = a(false, "video/avc");
            if (aVarA != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = aVarA.f55770e;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int iMax2 = 0;
                while (iMax < length) {
                    int i3 = codecProfileLevelArr[iMax].level;
                    if (i3 != 1 && i3 != 2) {
                        switch (i3) {
                            case 8:
                            case 16:
                            case 32:
                                i2 = 101376;
                                break;
                            case 64:
                                i2 = 202752;
                                break;
                            case 128:
                            case 256:
                                i2 = 414720;
                                break;
                            case 512:
                                i2 = 921600;
                                break;
                            case 1024:
                                i2 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i2 = 2097152;
                                break;
                            case 8192:
                                i2 = 2228224;
                                break;
                            case 16384:
                                i2 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i2 = 9437184;
                                break;
                            default:
                                i2 = -1;
                                break;
                        }
                    } else {
                        i2 = 25344;
                    }
                    iMax2 = Math.max(i2, iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, z.f56234a >= 21 ? 345600 : 172800);
            }
            f55815f = iMax;
        }
        return f55815f;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0081 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e7 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList a(e eVar, g gVar) throws f {
        g gVar2 = gVar;
        try {
            ArrayList arrayList = new ArrayList();
            String str = eVar.f55806a;
            int iA = gVar2.a();
            boolean zB = gVar2.b();
            int i2 = 0;
            loop0: while (i2 < iA) {
                MediaCodecInfo mediaCodecInfoA = gVar2.a(i2);
                String name = mediaCodecInfoA.getName();
                if (a(mediaCodecInfoA, name, zB)) {
                    String[] supportedTypes = mediaCodecInfoA.getSupportedTypes();
                    int length = supportedTypes.length;
                    int i3 = 0;
                    while (i3 < length) {
                        String str2 = supportedTypes[i3];
                        if (str2.equalsIgnoreCase(str)) {
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoA.getCapabilitiesForType(str2);
                                boolean zA = gVar2.a(str, capabilitiesForType);
                                if (z.f56234a <= 22) {
                                    String str3 = z.f56237d;
                                    if (!str3.equals("ODROID-XU3")) {
                                        if (str3.equals("Nexus 10")) {
                                        }
                                    }
                                    boolean z2 = "OMX.Exynos.AVC.Decoder".equals(name) || "OMX.Exynos.AVC.Decoder.secure".equals(name);
                                    if ((!zB && eVar.f55807b == zA) || (!zB && !eVar.f55807b)) {
                                        arrayList.add(new a(name, str, capabilitiesForType, z2));
                                    } else if (zB && zA) {
                                        arrayList.add(new a(name + ".secure", str, capabilitiesForType, z2));
                                        break loop0;
                                    }
                                }
                                if (!zB) {
                                    if (zB) {
                                        continue;
                                    }
                                } else if (zB) {
                                }
                            } catch (Exception e2) {
                                if (z.f56234a <= 23 && !arrayList.isEmpty()) {
                                    Log.e("MediaCodecUtil", "Skipping codec " + name + " (failed to query capabilities)");
                                } else {
                                    Log.e("MediaCodecUtil", "Failed to query codec " + name + " (" + str2 + ")");
                                    throw e2;
                                }
                            }
                        }
                        i3++;
                        gVar2 = gVar;
                    }
                }
                i2++;
                gVar2 = gVar;
            }
            return arrayList;
        } catch (Exception e3) {
            throw new f(e3);
        }
    }

    public static boolean a(MediaCodecInfo mediaCodecInfo, String str, boolean z2) {
        if (mediaCodecInfo.isEncoder() || (!z2 && str.endsWith(".secure"))) {
            return false;
        }
        int i2 = z.f56234a;
        if (i2 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i2 < 18 && "OMX.SEC.MP3.Decoder".equals(str)) {
            return false;
        }
        if (i2 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str) && "a70".equals(z.f56235b)) {
            return false;
        }
        if (i2 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str2 = z.f56235b;
            if ("dlxu".equals(str2) || "protou".equals(str2) || "ville".equals(str2) || "villeplus".equals(str2) || "villec2".equals(str2) || str2.startsWith("gee") || "C6602".equals(str2) || "C6603".equals(str2) || "C6606".equals(str2) || "C6616".equals(str2) || "L36h".equals(str2) || "SO-02E".equals(str2)) {
                return false;
            }
        }
        if (i2 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str3 = z.f56235b;
            if ("C1504".equals(str3) || "C1505".equals(str3) || "C1604".equals(str3) || "C1605".equals(str3)) {
                return false;
            }
        }
        if (i2 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(z.f56236c)) {
            String str4 = z.f56235b;
            if (str4.startsWith("d2") || str4.startsWith("serrano") || str4.startsWith("jflte") || str4.startsWith("santos") || str4.startsWith("t0")) {
                return false;
            }
        }
        return (i2 <= 19 && z.f56235b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) ? false : true;
    }
}
