package Ko8;

import QmE.iF;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneKt;
import ga6.j;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class C implements Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final iF f5792n;

    public C(iF eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f5792n = eventLogger;
    }

    @Override // Ko8.Dsr
    public x0X.n n(final Scene rootScene, final List editingNestedSceneIds) {
        Intrinsics.checkNotNullParameter(rootScene, "rootScene");
        Intrinsics.checkNotNullParameter(editingNestedSceneIds, "editingNestedSceneIds");
        return M3.j.rl(M3.n.n(x0X.w6.n(new Function0() { // from class: Ko8.aC
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C.t(editingNestedSceneIds, rootScene);
            }
        }), j.w6.f67628O, j.EnumC0949j.f67618r, j.n.f67621O, "Given nested scene ID path doesn't exist in given root scene."), this.f5792n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Scene t(List list, Scene scene) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SceneElement sceneElementElementById = SceneKt.elementById(scene, Long.valueOf(((Number) it.next()).longValue()));
            Intrinsics.checkNotNull(sceneElementElementById);
            scene = sceneElementElementById.getNestedScene();
        }
        return scene;
    }
}
