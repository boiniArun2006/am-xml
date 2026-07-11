package Si;

import QmE.iF;
import android.content.Context;
import com.alightcreative.app.motion.scene.SceneHolder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class l3D {
    public static final Xo n(String contextTag, Context context, iF eventLogger, SceneHolder sceneHolder, boolean z2) {
        Intrinsics.checkNotNullParameter(contextTag, "contextTag");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(sceneHolder, "sceneHolder");
        return new fuX(contextTag, context, eventLogger, sceneHolder, z2);
    }

    public static /* synthetic */ Xo rl(String str, Context context, iF iFVar, SceneHolder sceneHolder, boolean z2, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            z2 = true;
        }
        return n(str, context, iFVar, sceneHolder, z2);
    }
}
