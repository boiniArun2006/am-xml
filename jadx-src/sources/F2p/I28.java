package F2p;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class I28 {

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Ml.values().length];
            try {
                iArr[Ml.f2486n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Ml.f2488t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Ml.f2485O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int n(Ml ml) {
        Intrinsics.checkNotNullParameter(ml, "<this>");
        int i2 = j.$EnumSwitchMapping$0[ml.ordinal()];
        if (i2 == 1) {
            return 2132017544;
        }
        if (i2 == 2) {
            return 2132017614;
        }
        if (i2 == 3) {
            return 2132017546;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int rl(Ml ml) {
        Intrinsics.checkNotNullParameter(ml, "<this>");
        int i2 = j.$EnumSwitchMapping$0[ml.ordinal()];
        if (i2 == 1 || i2 == 2) {
            return 2132017545;
        }
        if (i2 == 3) {
            return 2132017547;
        }
        throw new NoWhenBranchMatchedException();
    }
}
