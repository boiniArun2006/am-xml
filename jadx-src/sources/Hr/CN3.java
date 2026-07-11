package Hr;

import Hr.Dsr;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class CN3 {
    public static final boolean J2(MediaCodecInfo.VideoCapabilities videoCapabilities, MediaFormat mediaFormat) {
        Intrinsics.checkNotNullParameter(videoCapabilities, "<this>");
        Intrinsics.checkNotNullParameter(mediaFormat, "mediaFormat");
        return videoCapabilities.areSizeAndRateSupported(aC.ck(mediaFormat), aC.O(mediaFormat), 24.0d) || videoCapabilities.areSizeAndRateSupported(aC.O(mediaFormat), aC.ck(mediaFormat), 24.0d);
    }

    public static final Dsr.n.Ml Uo(Dsr dsr) {
        Object next;
        Intrinsics.checkNotNullParameter(dsr, "<this>");
        List listNHg = dsr.nHg();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listNHg) {
            if (obj instanceof Dsr.n.Ml) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Dsr.n.Ml) next).t() != null) {
                break;
            }
        }
        return (Dsr.n.Ml) next;
    }

    public static final List nr(MediaCodecList mediaCodecList, MediaFormat mediaFormat) {
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        Intrinsics.checkNotNullParameter(mediaCodecList, "<this>");
        Intrinsics.checkNotNullParameter(mediaFormat, "mediaFormat");
        Integer numRl = aC.rl(mediaFormat);
        int iTy = aC.ty(mediaFormat);
        int iT = aC.t(mediaFormat);
        String strXMQ = aC.xMQ(mediaFormat);
        if (strXMQ == null) {
            return CollectionsKt.emptyList();
        }
        MediaCodecInfo[] codecInfos = mediaCodecList.getCodecInfos();
        Intrinsics.checkNotNullExpressionValue(codecInfos, "getCodecInfos(...)");
        ArrayList arrayList = new ArrayList();
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            if (!mediaCodecInfo.isEncoder()) {
                String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                Intrinsics.checkNotNullExpressionValue(supportedTypes, "getSupportedTypes(...)");
                if (ArraysKt.contains(supportedTypes, aC.xMQ(mediaFormat)) && (capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(strXMQ)) != null && (audioCapabilities = capabilitiesForType.getAudioCapabilities()) != null && ((iTy <= 0 || audioCapabilities.isSampleRateSupported(iTy)) && ((numRl == null || audioCapabilities.getBitrateRange().contains(aC.rl(mediaFormat))) && iT <= audioCapabilities.getMaxInputChannelCount()))) {
                    arrayList.add(mediaCodecInfo);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((MediaCodecInfo) it.next()).getName());
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List rl(MediaCodecList mediaCodecList, MediaFormat mediaFormat) {
        boolean z2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Intrinsics.checkNotNullParameter(mediaCodecList, "<this>");
        Intrinsics.checkNotNullParameter(mediaFormat, "mediaFormat");
        MediaCodecInfo[] codecInfos = mediaCodecList.getCodecInfos();
        Intrinsics.checkNotNullExpressionValue(codecInfos, "getCodecInfos(...)");
        ArrayList arrayList = new ArrayList();
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            if (!mediaCodecInfo.isEncoder()) {
                String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                Intrinsics.checkNotNullExpressionValue(supportedTypes, "getSupportedTypes(...)");
                if (ArraysKt.contains(supportedTypes, aC.xMQ(mediaFormat))) {
                    MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(aC.xMQ(mediaFormat));
                    if ((capabilitiesForType == null || (videoCapabilities = capabilitiesForType.getVideoCapabilities()) == null) ? false : J2(videoCapabilities, mediaFormat)) {
                        z2 = true;
                    }
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                arrayList.add(mediaCodecInfo);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((MediaCodecInfo) it.next()).getName());
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052 A[LOOP:0: B:3:0x0016->B:20:0x0052, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056 A[EDGE_INSN: B:27:0x0056->B:22:0x0056 BREAK  A[LOOP:0: B:3:0x0016->B:20:0x0052], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String t(MediaCodecList mediaCodecList, MediaFormat mediaFormat) {
        MediaCodecInfo mediaCodecInfo;
        boolean z2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Intrinsics.checkNotNullParameter(mediaCodecList, "<this>");
        Intrinsics.checkNotNullParameter(mediaFormat, "mediaFormat");
        MediaCodecInfo[] codecInfos = mediaCodecList.getCodecInfos();
        Intrinsics.checkNotNullExpressionValue(codecInfos, "getCodecInfos(...)");
        int length = codecInfos.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                mediaCodecInfo = null;
                break;
            }
            mediaCodecInfo = codecInfos[i2];
            if (!mediaCodecInfo.isEncoder()) {
                String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                Intrinsics.checkNotNullExpressionValue(supportedTypes, "getSupportedTypes(...)");
                if (ArraysKt.contains(supportedTypes, aC.xMQ(mediaFormat))) {
                    MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(aC.xMQ(mediaFormat));
                    if ((capabilitiesForType == null || (videoCapabilities = capabilitiesForType.getVideoCapabilities()) == null) ? false : J2(videoCapabilities, mediaFormat)) {
                        z2 = true;
                    }
                    if (!z2) {
                    }
                } else {
                    z2 = false;
                    if (!z2) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (mediaCodecInfo != null) {
            return mediaCodecInfo.getName();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c7 A[PHI: r4
      0x00c7: PHI (r4v2 java.lang.String) = (r4v1 java.lang.String), (r4v4 java.lang.String), (r4v15 java.lang.String) binds: [B:34:0x00c5, B:26:0x0092, B:17:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List O(MediaExtractor mediaExtractor) {
        String str;
        Dsr.n c0138n;
        int iIntValue;
        List listHI = aC.HI(mediaExtractor);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listHI, 10));
        int i2 = 0;
        for (Object obj : listHI) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            MediaFormat mediaFormat = (MediaFormat) obj;
            String strXMQ = aC.xMQ(mediaFormat);
            if (strXMQ == null) {
                strXMQ = "";
            }
            String strSubstringBefore$default = StringsKt.substringBefore$default(strXMQ, "/", (String) null, 2, (Object) null);
            int iHashCode = strSubstringBefore$default.hashCode();
            if (iHashCode != 3556653) {
                if (iHashCode != 93166550) {
                    if (iHashCode != 112202875 || !strSubstringBefore$default.equals("video")) {
                        str = strXMQ;
                        c0138n = new Dsr.n.w6(i2, str, aC.KN(mediaFormat), mediaFormat);
                    } else {
                        Integer numKN = aC.KN(mediaFormat);
                        String strFindDecoderForFormat = aC.qie().findDecoderForFormat(mediaFormat);
                        if (strFindDecoderForFormat == null) {
                            strFindDecoderForFormat = t(aC.qie(), mediaFormat);
                        }
                        c0138n = new Dsr.n.Ml(i2, strXMQ, numKN, mediaFormat, strFindDecoderForFormat, rl(aC.qie(), mediaFormat), aC.ck(mediaFormat), aC.O(mediaFormat), aC.nr(mediaFormat));
                    }
                } else {
                    str = strXMQ;
                    if (strSubstringBefore$default.equals("audio")) {
                        Integer numKN2 = aC.KN(mediaFormat);
                        String strFindDecoderForFormat2 = aC.qie().findDecoderForFormat(mediaFormat);
                        int iT = aC.t(mediaFormat);
                        Integer numMUb = aC.mUb(mediaFormat);
                        if (numMUb != null) {
                            iIntValue = numMUb.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        c0138n = new Dsr.n.j(i2, str, numKN2, mediaFormat, strFindDecoderForFormat2, aC.ty(mediaFormat), iT, iIntValue);
                    } else {
                        c0138n = new Dsr.n.w6(i2, str, aC.KN(mediaFormat), mediaFormat);
                    }
                }
            } else {
                str = strXMQ;
                if (strSubstringBefore$default.equals("text")) {
                    String str2 = "";
                    Integer numKN3 = aC.KN(mediaFormat);
                    String strJ2 = aC.J2(mediaFormat);
                    if (strJ2 != null) {
                        str2 = strJ2;
                    }
                    c0138n = new Dsr.n.C0138n(i2, str, numKN3, mediaFormat, str2);
                }
            }
            arrayList.add(c0138n);
            i2 = i3;
        }
        return arrayList;
    }
}
