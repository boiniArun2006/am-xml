package F6;

import NtE.w6;
import Q6.I28;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class Ml {
    public static final w6 n(Context context, VD.j logger, boolean z2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logger, "logger");
        return new I28(new NtE.w6(context, logger, null, null, z2 ? w6.n.THROW : w6.n.SILENCE, 12, null), null, null, 6, null);
    }

    public static /* synthetic */ w6 rl(Context context, VD.j jVar, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return n(context, jVar, z2);
    }
}
