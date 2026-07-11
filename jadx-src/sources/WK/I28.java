package WK;

import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class I28 {
    public final void n(Ml feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        if (jVar.getUsedNewFeatures().contains(feature.rl())) {
            return;
        }
        jVar.setUsedNewFeatures(SetsKt.plus(jVar.getUsedNewFeatures(), feature.rl()));
    }

    public final boolean rl(Ml feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        return !com.alightcreative.app.motion.persist.j.INSTANCE.getUsedNewFeatures().contains(feature.rl());
    }
}
