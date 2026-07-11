package r53;

import HI0.afx;
import QmE.iF;
import android.content.Context;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.serializer.SceneSerializerKt;
import ga6.j;
import java.util.UUID;
import kotlin.collections.SetsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class w6 implements j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f72855n;
    private final iF rl;

    public w6(Context context, iF eventLogger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f72855n = context;
        this.rl = eventLogger;
    }

    @Override // r53.j
    public x0X.n n(final Scene scene, final String templateId) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        return M3.j.rl(M3.n.rl(x0X.w6.n(new Function0() { // from class: r53.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return w6.t(scene, templateId, this);
            }
        }), j.w6.f67628O, j.EnumC0949j.J2, j.n.f67621O, null, 8, null), this.rl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String t(Scene scene, String str, w6 w6Var) {
        UUID uuidRandomUUID = UUID.randomUUID();
        String strSerializeScene$default = SceneSerializerKt.serializeScene$default(Scene.copy$default(scene, null, 0, 0, 0, 0, 0, null, 0, null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 524287, null), false, null, false, false, null, 62, null);
        Context context = w6Var.f72855n;
        Intrinsics.checkNotNull(uuidRandomUUID);
        FilesKt.writeText$default(afx.Z(context, uuidRandomUUID), strSerializeScene$default, null, 2, null);
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        if (jVar.getImportedXmlIds().contains(str)) {
            jVar.setImportedXmlIds(SetsKt.plus(jVar.getImportedXmlIds(), uuidRandomUUID.toString()));
        } else {
            jVar.setImportedProjectIds(SetsKt.plus(jVar.getImportedProjectIds(), uuidRandomUUID.toString()));
        }
        return uuidRandomUUID.toString();
    }
}
