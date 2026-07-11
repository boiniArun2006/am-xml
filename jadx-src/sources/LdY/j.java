package LdY;

import HI0.s4;
import android.content.Context;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.serializer.SceneSerializerKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class j extends Ml {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, String tag, Scene initialDocumentState, boolean z2, Function1 applyNewState) {
        super(context, tag, initialDocumentState, z2, applyNewState);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(initialDocumentState, "initialDocumentState");
        Intrinsics.checkNotNullParameter(applyNewState, "applyNewState");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // LdY.Ml
    /* JADX INFO: renamed from: WPU, reason: merged with bridge method [inline-methods] */
    public byte[] Ik(Scene state) {
        Intrinsics.checkNotNullParameter(state, "state");
        byte[] bytes = SceneSerializerKt.serializeScene$default(state, false, null, false, false, null, 62, null).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return s4.n(bytes);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // LdY.Ml
    /* JADX INFO: renamed from: aYN, reason: merged with bridge method [inline-methods] */
    public Scene XQ(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return SceneSerializerKt.unserializeScene$default(new String(s4.rl(data), Charsets.UTF_8), false, false, false, 14, null);
    }
}
