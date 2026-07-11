package IvA;

import com.alightcreative.app.motion.AlightMotionApplication;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static AlightMotionApplication f4321n;

    public static final AlightMotionApplication rl() {
        AlightMotionApplication alightMotionApplication = f4321n;
        if (alightMotionApplication != null) {
            return alightMotionApplication;
        }
        Intrinsics.throwUninitializedPropertyAccessException("APP");
        return null;
    }
}
