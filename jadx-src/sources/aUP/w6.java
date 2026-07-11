package aUP;

import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Range;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class w6 {
    static /* synthetic */ boolean J2(MediaCodecInfo mediaCodecInfo, String str, as.qz qzVar, as.eO eOVar, Integer num, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            qzVar = null;
        }
        if ((i2 & 4) != 0) {
            eOVar = null;
        }
        if ((i2 & 8) != 0) {
            num = null;
        }
        return O(mediaCodecInfo, str, qzVar, eOVar, num);
    }

    private static final boolean nr(MediaCodecInfo.AudioCapabilities audioCapabilities, int i2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return audioCapabilities.getMinInputChannelCount() <= i2 && i2 <= audioCapabilities.getMaxInputChannelCount();
        }
        return i2 <= audioCapabilities.getMaxInputChannelCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean O(MediaCodecInfo mediaCodecInfo, String str, as.qz qzVar, as.eO eOVar, Integer num) {
        if (mediaCodecInfo.isEncoder() && qO.j.rl(mediaCodecInfo, str)) {
            MediaCodecInfo.AudioCapabilities audioCap = mediaCodecInfo.getCapabilitiesForType(str).getAudioCapabilities();
            if (eOVar == null || audioCap.isSampleRateSupported(eOVar.mUb())) {
                if (qzVar != null) {
                    Intrinsics.checkNotNullExpressionValue(audioCap, "audioCap");
                    if (!nr(audioCap, qzVar.Uo())) {
                        return false;
                    }
                }
                if (num == null || audioCap.getBitrateRange().contains(num)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Range t(MediaCodecInfo mediaCodecInfo, String str) {
        return mediaCodecInfo.getCapabilitiesForType(str).getAudioCapabilities().getBitrateRange();
    }
}
