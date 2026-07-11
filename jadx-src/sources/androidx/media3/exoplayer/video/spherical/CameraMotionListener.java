package androidx.media3.exoplayer.video.spherical;

import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@UnstableApi
public interface CameraMotionListener {
    void onCameraMotion(long j2, float[] fArr);

    void onCameraMotionReset();
}
