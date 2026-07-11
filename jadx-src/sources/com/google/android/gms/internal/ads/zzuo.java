package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.os.Build;
import androidx.annotation.RequiresApi;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RequiresApi
final class zzuo {
    private static int zzb(boolean z2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List supportedPerformancePoints;
        try {
            zzt zztVar = new zzt();
            zztVar.zzm("video/avc");
            zzv zzvVarZzM = zztVar.zzM();
            if (zzvVarZzM.zzo != null) {
                List listZzc = zzvg.zzc(zzuw.zzb, zzvVarZzM, z2, false);
                for (int i2 = 0; i2 < listZzc.size(); i2++) {
                    if (((zzun) listZzc.get(i2)).zzd != null && (videoCapabilities = ((zzun) listZzc.get(i2)).zzd.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        androidx.media3.exoplayer.mediacodec.eO.n();
                        return zzc(supportedPerformancePoints, androidx.media3.exoplayer.mediacodec.Xo.n(1280, 720, 60));
                    }
                }
            }
        } catch (zzuy unused) {
        }
        return 0;
    }

    private static int zzc(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (androidx.media3.exoplayer.mediacodec.qz.n(list.get(i2)).covers(performancePoint)) {
                return 2;
            }
        }
        return 1;
    }

    public static int zza(MediaCodecInfo.VideoCapabilities videoCapabilities, int i2, int i3, double d2) {
        int iZzb;
        List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
            return 0;
        }
        int iZzc = zzc(supportedPerformancePoints, androidx.media3.exoplayer.mediacodec.Xo.n(i2, i3, (int) d2));
        boolean z2 = true;
        if (iZzc == 1 && zzup.zza == null) {
            if (Build.VERSION.SDK_INT >= 35) {
                iZzb = 2;
            } else {
                iZzb = zzb(false);
            }
            int iZzb2 = zzb(true);
            if (iZzb != 0 && (iZzb2 != 0 ? !(iZzb != 2 || iZzb2 != 2) : iZzb == 2)) {
                z2 = false;
            }
            zzup.zza = Boolean.valueOf(z2);
            if (zzup.zza.booleanValue()) {
                return 0;
            }
        }
        return iZzc;
    }
}
