package androidx.transition;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class GhostViewUtils {
    static GhostView n(View view, ViewGroup viewGroup, Matrix matrix) {
        return Build.VERSION.SDK_INT == 28 ? GhostViewPlatform.rl(view, viewGroup, matrix) : GhostViewPort.rl(view, viewGroup, matrix);
    }

    static void rl(View view) {
        if (Build.VERSION.SDK_INT == 28) {
            GhostViewPlatform.J2(view);
        } else {
            GhostViewPort.J2(view);
        }
    }
}
