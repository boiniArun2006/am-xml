package androidx.media3.exoplayer.video;

import android.view.Surface;
import androidx.media3.common.util.Size;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
interface VideoSinkProvider {
    void clearOutputSurfaceInfo();

    VideoSink getSink(int i2);

    void release();

    void setOutputSurfaceInfo(Surface surface, Size size);
}
