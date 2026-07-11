package Z4;

import Fw3.Dsr;
import Fw3.j;
import Z4.Ml;
import android.content.Context;
import gB.CN3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mF.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class I28 {

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Ml.n.values().length];
            try {
                iArr[Ml.n.MEMORY_SAVING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Ml.n.HIGH_PERFORMANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Ml n(Context context, w6.n resourceProvider, Dsr cacheResourceLimit, VD.j logger, boolean z2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        Intrinsics.checkNotNullParameter(cacheResourceLimit, "cacheResourceLimit");
        Intrinsics.checkNotNullParameter(logger, "logger");
        CN3 cn3N = Fw3.CN3.n(context, resourceProvider.t());
        return new gB.n(cn3N, new Fw3.j(context, resourceProvider, cn3N, cacheResourceLimit, logger, z2 ? j.n.THROW : j.n.PLACEHOLDER_TEXTURE, null, null, null, 448, null), 0L, 4, null);
    }

    public static /* synthetic */ Ml rl(Context context, w6.n nVar, Dsr dsr, VD.j jVar, boolean z2, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            z2 = false;
        }
        return n(context, nVar, dsr, jVar, z2);
    }

    public static final boolean t(Ml.n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        int i2 = j.$EnumSwitchMapping$0[nVar.ordinal()];
        if (i2 == 1) {
            return true;
        }
        if (i2 == 2) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
