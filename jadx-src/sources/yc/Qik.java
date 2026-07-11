package yc;

import com.alightcreative.app.motion.scene.SceneElement;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface Qik {

    public static final class j {
        public static /* synthetic */ void n(Qik qik, SceneElement sceneElement, boolean z2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onElementAdded");
            }
            if ((i2 & 2) != 0) {
                z2 = true;
            }
            qik.X(sceneElement, z2);
        }
    }

    void X(SceneElement sceneElement, boolean z2);
}
