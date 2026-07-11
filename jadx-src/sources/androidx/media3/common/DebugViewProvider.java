package androidx.media3.common;

import android.view.SurfaceView;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@UnstableApi
public interface DebugViewProvider {
    public static final DebugViewProvider NONE = new DebugViewProvider() { // from class: androidx.media3.common.Ml
        @Override // androidx.media3.common.DebugViewProvider
        public final SurfaceView getDebugPreviewSurfaceView(int i2, int i3) {
            return DebugViewProvider.n(i2, i3);
        }
    };

    static /* synthetic */ SurfaceView n(int i2, int i3) {
        return null;
    }

    @Nullable
    SurfaceView getDebugPreviewSurfaceView(int i2, int i3);
}
