package gY;

import QmE.iF;
import Si.o;
import Si.qz;
import android.content.Context;
import com.alightcreative.app.motion.scene.SceneHolder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class n implements j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f67607n;
    private final iF rl;

    public n(Context context, iF eventLogger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f67607n = context;
        this.rl = eventLogger;
    }

    @Override // gY.j
    public o n(SceneHolder sceneHolder, String contextTag) {
        Intrinsics.checkNotNullParameter(sceneHolder, "sceneHolder");
        Intrinsics.checkNotNullParameter(contextTag, "contextTag");
        return new qz(this.f67607n, sceneHolder, this.rl, contextTag);
    }
}
