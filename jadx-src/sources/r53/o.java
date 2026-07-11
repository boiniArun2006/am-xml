package r53;

import com.alightcreative.app.motion.scene.Scene;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface o {

    public static final class j {
        public static /* synthetic */ String n(o oVar, Scene scene, String str, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: serialize");
            }
            if ((i2 & 2) != 0) {
                str = null;
            }
            return oVar.n(scene, str);
        }
    }

    String n(Scene scene, String str);

    Scene rl(String str);
}
