package Q4;

import as.CN3;
import as.aC;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class n {
    public static final j n(CN3 cn3) {
        Intrinsics.checkNotNullParameter(cn3, "<this>");
        return new j(cn3.rl(), cn3.t(), cn3.n(), false, null);
    }

    public static final int rl(long j2, j audioStreamProperties) {
        Intrinsics.checkNotNullParameter(audioStreamProperties, "audioStreamProperties");
        LRC.j.t(j2, "duration");
        return as.I28.rl(aC.t(j2, audioStreamProperties.t()), audioStreamProperties.rl(), audioStreamProperties.n());
    }
}
