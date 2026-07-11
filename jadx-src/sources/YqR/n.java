package YqR;

import FSZ.qz;
import Gs.CN3;
import aB.AbstractC1501Ml;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import ln.eO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final n f12223n = new n();
    private static boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static j f12224t;

    public static final j n(AbstractC1501Ml abstractC1501Ml, eO eOVar, qz qzVar, boolean z2, boolean z3, int i2, int i3, ExecutorService executorService) {
        if (!rl) {
            try {
                Class cls = Boolean.TYPE;
                Class cls2 = Integer.TYPE;
                Object objNewInstance = AnimatedFactoryV2Impl.class.getConstructor(AbstractC1501Ml.class, eO.class, qz.class, cls, cls, cls2, cls2, CN3.class).newInstance(abstractC1501Ml, eOVar, qzVar, Boolean.valueOf(z2), Boolean.valueOf(z3), Integer.valueOf(i2), Integer.valueOf(i3), executorService);
                Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type com.facebook.imagepipeline.animated.factory.AnimatedFactory");
                f12224t = (j) objNewInstance;
            } catch (Throwable unused) {
            }
            if (f12224t != null) {
                rl = true;
            }
        }
        return f12224t;
    }

    private n() {
    }
}
