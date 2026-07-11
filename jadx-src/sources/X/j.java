package X;

import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.serializer.SceneSerializerKt;
import kotlin.jvm.internal.Intrinsics;
import r53.o;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class j implements o {
    @Override // r53.o
    public String n(Scene scene, String str) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        return SceneSerializerKt.serializeScene$default(scene, false, null, false, false, str, 30, null);
    }

    @Override // r53.o
    public Scene rl(String xmlString) {
        Intrinsics.checkNotNullParameter(xmlString, "xmlString");
        return SceneSerializerKt.unserializeScene$default(xmlString, false, false, false, 14, null);
    }
}
