package qO;

import android.media.MediaCodecInfo;
import com.alightcreative.gl.egl.il.inFlMLxL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public abstract class j {
    public static /* synthetic */ String J2(MediaCodecInfo mediaCodecInfo, String str, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        return O(mediaCodecInfo, str, z2);
    }

    private static final String KN(MediaCodecInfo.VideoCapabilities videoCapabilities, boolean z2, List list) {
        String str = z2 ? "\n" : " ";
        String str2 = z2 ? "  " : "";
        return "VideoCapabilities(" + str + str2 + "bitrateRange: " + videoCapabilities.getBitrateRange() + ',' + str + str2 + "supportedWidths: " + videoCapabilities.getSupportedWidths() + ',' + str + str2 + "widthAlignment: " + videoCapabilities.getWidthAlignment() + ',' + str + str2 + "supportedHeights: " + videoCapabilities.getSupportedHeights() + ',' + str + str2 + "heightAlignment: " + videoCapabilities.getHeightAlignment() + ',' + str + str2 + "supportedFrameRates: " + videoCapabilities.getSupportedFrameRates() + str + str2 + "colorProfiles: " + list + str + ')';
    }

    public static final String O(MediaCodecInfo mediaCodecInfo, String mime, boolean z2) {
        Object objM313constructorimpl;
        Intrinsics.checkNotNullParameter(mediaCodecInfo, "<this>");
        Intrinsics.checkNotNullParameter(mime, "mime");
        try {
            Result.Companion companion = Result.INSTANCE;
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(mime);
            MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
            MediaCodecInfo.AudioCapabilities audioCapabilities = capabilitiesForType.getAudioCapabilities();
            String str = z2 ? "  " : "";
            StringBuilder sb = new StringBuilder();
            sb.append("Capabilities of codec '" + mediaCodecInfo.getName() + "' for mime '" + mime + "':");
            String str2 = "\n";
            if (videoCapabilities != null) {
                sb.append(z2 ? "\n" : " ");
                int[] iArr = capabilitiesForType.colorFormats;
                Intrinsics.checkNotNullExpressionValue(iArr, inFlMLxL.AriTQckrkdjSE);
                sb.append(StringsKt.prependIndent(KN(videoCapabilities, z2, CollectionsKt.sorted(ArraysKt.toList(iArr))), str));
            }
            if (videoCapabilities != null && audioCapabilities != null) {
                if (!z2) {
                    str2 = ", ";
                }
                sb.append(str2);
            }
            if (audioCapabilities != null) {
                sb.append(StringsKt.prependIndent(Uo(audioCapabilities, z2), str));
            }
            if (videoCapabilities == null && audioCapabilities == null) {
                sb.append(" none");
            }
            objM313constructorimpl = Result.m313constructorimpl(sb.toString());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM316exceptionOrNullimpl = Result.m316exceptionOrNullimpl(objM313constructorimpl);
        if (thM316exceptionOrNullimpl != null) {
            objM313constructorimpl = "Failed to retrieve data! Error " + thM316exceptionOrNullimpl;
        }
        return (String) objM313constructorimpl;
    }

    private static final String Uo(MediaCodecInfo.AudioCapabilities audioCapabilities, boolean z2) {
        String str = z2 ? "\n" : " ";
        String str2 = z2 ? "  " : "";
        StringBuilder sb = new StringBuilder();
        sb.append("AudioCapabilities(");
        sb.append(str);
        sb.append(str2);
        sb.append("bitrateRange: ");
        sb.append(audioCapabilities.getBitrateRange());
        sb.append(',');
        sb.append(str);
        sb.append(str2);
        sb.append("supportedSampleRates: ");
        int[] supportedSampleRates = audioCapabilities.getSupportedSampleRates();
        Intrinsics.checkNotNullExpressionValue(supportedSampleRates, "supportedSampleRates");
        sb.append(ArraysKt.toList(supportedSampleRates));
        sb.append(',');
        sb.append(str);
        sb.append(str2);
        sb.append("maxInputChannelCount: ");
        sb.append(audioCapabilities.getMaxInputChannelCount());
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }

    public static final List n(MediaCodecInfo[] mediaCodecInfoArr, String mime) {
        Intrinsics.checkNotNullParameter(mediaCodecInfoArr, "<this>");
        Intrinsics.checkNotNullParameter(mime, "mime");
        ArrayList arrayList = new ArrayList();
        for (MediaCodecInfo mediaCodecInfo : mediaCodecInfoArr) {
            if (mediaCodecInfo.isEncoder() && rl(mediaCodecInfo, mime)) {
                arrayList.add(mediaCodecInfo);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(J2((MediaCodecInfo) it.next(), mime, false, 2, null));
        }
        return arrayList2;
    }

    public static /* synthetic */ String nr(MediaCodecInfo mediaCodecInfo, String str, Oe.w6 w6Var, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        return t(mediaCodecInfo, str, w6Var, z2);
    }

    public static final boolean rl(MediaCodecInfo mediaCodecInfo, String mimeType) {
        Intrinsics.checkNotNullParameter(mediaCodecInfo, "<this>");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
        Intrinsics.checkNotNullExpressionValue(supportedTypes, "supportedTypes");
        for (String str : supportedTypes) {
            if (StringsKt.equals(str, mimeType, true)) {
                return true;
            }
        }
        return false;
    }

    public static final String t(MediaCodecInfo mediaCodecInfo, String mime, Oe.w6 size, boolean z2) {
        Object objM313constructorimpl;
        String str;
        Intrinsics.checkNotNullParameter(mediaCodecInfo, "<this>");
        Intrinsics.checkNotNullParameter(mime, "mime");
        Intrinsics.checkNotNullParameter(size, "size");
        try {
            Result.Companion companion = Result.INSTANCE;
            String strO = O(mediaCodecInfo, mime, z2);
            int iT = size.t();
            int iRl = size.rl();
            MediaCodecInfo.VideoCapabilities videoCapabilities = mediaCodecInfo.getCapabilitiesForType(mime).getVideoCapabilities();
            if (videoCapabilities.isSizeSupported(iT, iRl)) {
                str = strO + "\nSupported FPS for resolution " + iT + 'x' + iRl + ": " + videoCapabilities.getSupportedFrameRatesFor(iT, iRl);
            } else {
                str = strO + "\nSupported FPS for resolution " + iT + 'x' + iRl + ": none";
            }
            objM313constructorimpl = Result.m313constructorimpl(str);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM316exceptionOrNullimpl = Result.m316exceptionOrNullimpl(objM313constructorimpl);
        if (thM316exceptionOrNullimpl != null) {
            objM313constructorimpl = "Failed to retrieve data! Error " + thM316exceptionOrNullimpl;
        }
        return (String) objM313constructorimpl;
    }
}
