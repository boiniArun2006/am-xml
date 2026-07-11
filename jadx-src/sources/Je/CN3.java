package Je;

import HI0.afx;
import Ko8.l3D;
import QmE.iF;
import android.content.Context;
import com.alightcreative.app.motion.scene.LayerParentingKt;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementKt;
import com.alightcreative.app.motion.scene.SceneType;
import com.alightcreative.app.motion.scene.SolidColor;
import ga6.j;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import r53.o;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class CN3 implements Ja.w6 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final iF f4608O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f4609n;
    private final l3D nr;
    private final o rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Ko8.o f4610t;

    public CN3(Context context, o sceneSerializer, Ko8.o getSceneByProjectIdUseCase, l3D writeSceneToFileUseCase, iF eventLogger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sceneSerializer, "sceneSerializer");
        Intrinsics.checkNotNullParameter(getSceneByProjectIdUseCase, "getSceneByProjectIdUseCase");
        Intrinsics.checkNotNullParameter(writeSceneToFileUseCase, "writeSceneToFileUseCase");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f4609n = context;
        this.rl = sceneSerializer;
        this.f4610t = getSceneByProjectIdUseCase;
        this.nr = writeSceneToFileUseCase;
        this.f4608O = eventLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String nr(SceneElement sceneElement, Scene scene, int i2, String str, CN3 cn3) {
        Scene scene2;
        SceneElement sceneElementUpdateParent = sceneElement;
        if (sceneElementUpdateParent.getParent() != null) {
            scene2 = scene;
            sceneElementUpdateParent = LayerParentingKt.updateParent(sceneElementUpdateParent, scene2, null, SceneElementKt.fractionalTime(sceneElementUpdateParent, i2));
        } else {
            scene2 = scene;
        }
        Scene scene3 = new Scene(str, 0, scene2.getWidth(), scene2.getHeight(), scene2.getWidth(), scene2.getHeight(), CollectionsKt.listOf(SceneElement.copy$default(sceneElementUpdateParent, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -769, 127, null)), 0, SolidColor.INSTANCE.getTRANSPARENT(), null, SceneType.PRESET, null, null, 0, 0, 0, false, 0L, null, null, 522882, null);
        UUID uuidRandomUUID = UUID.randomUUID();
        Context context = cn3.f4609n;
        Intrinsics.checkNotNull(uuidRandomUUID);
        FilesKt.writeText$default(afx.Z(context, uuidRandomUUID), o.j.n(cn3.rl, scene3, null, 2, null), null, 2, null);
        return uuidRandomUUID.toString();
    }

    @Override // Ja.w6
    public x0X.n n(final SceneElement sceneElement, final Scene scene, final int i2, final String title) {
        Intrinsics.checkNotNullParameter(sceneElement, "sceneElement");
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(title, "title");
        return M3.j.rl(M3.n.rl(x0X.w6.n(new Function0() { // from class: Je.Wre
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CN3.nr(sceneElement, scene, i2, title, this);
            }
        }), j.w6.f67628O, j.EnumC0949j.f67617o, j.n.f67621O, null, 8, null), this.f4608O);
    }

    @Override // Ja.w6
    public x0X.n rl(String presetId, String title) {
        Intrinsics.checkNotNullParameter(presetId, "presetId");
        Intrinsics.checkNotNullParameter(title, "title");
        x0X.n nVarN = this.f4610t.n(presetId);
        if (nVarN instanceof n.C1266n) {
            return nVarN;
        }
        if (!(nVarN instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        return this.nr.n(Scene.copy$default((Scene) ((n.w6) nVarN).n(), title, 0, 0, 0, 0, 0, null, 0, null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048574, null), presetId);
    }
}
