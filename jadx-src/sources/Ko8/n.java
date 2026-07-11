package Ko8;

import com.alightcreative.app.motion.scene.FillType;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneKt;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class n implements j {
    @Override // Ko8.j
    public int n(Scene scene) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        List<SceneElement> recursiveElements = SceneKt.getRecursiveElements(scene);
        int i2 = 0;
        if (recursiveElements != null && recursiveElements.isEmpty()) {
            return 0;
        }
        for (SceneElement sceneElement : recursiveElements) {
            if (sceneElement.getFillType() == FillType.MEDIA && (sceneElement.getFillImage() != null || sceneElement.getFillVideo() != null)) {
                i2++;
                if (i2 < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i2;
    }
}
