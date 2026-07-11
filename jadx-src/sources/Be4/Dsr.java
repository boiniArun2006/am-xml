package Be4;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Dsr f521n = new Dsr();

    public static final int n(int i2, int i3, int i5, int i7, Z.CN3 cn3) {
        int iMin;
        int iHighestOneBit = Integer.highestOneBit(i2 / i5);
        int iHighestOneBit2 = Integer.highestOneBit(i3 / i7);
        int i8 = j.$EnumSwitchMapping$0[cn3.ordinal()];
        if (i8 == 1) {
            iMin = Math.min(iHighestOneBit, iHighestOneBit2);
        } else {
            if (i8 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iMin = Math.max(iHighestOneBit, iHighestOneBit2);
        }
        return RangesKt.coerceAtLeast(iMin, 1);
    }

    public static final double rl(double d2, double d4, double d5, double d6, Z.CN3 cn3) {
        double d7 = d5 / d2;
        double d8 = d6 / d4;
        int i2 = j.$EnumSwitchMapping$0[cn3.ordinal()];
        if (i2 == 1) {
            return Math.max(d7, d8);
        }
        if (i2 == 2) {
            return Math.min(d7, d8);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final double t(int i2, int i3, int i5, int i7, Z.CN3 cn3) {
        double d2 = ((double) i5) / ((double) i2);
        double d4 = ((double) i7) / ((double) i3);
        int i8 = j.$EnumSwitchMapping$0[cn3.ordinal()];
        if (i8 == 1) {
            return Math.max(d2, d4);
        }
        if (i8 == 2) {
            return Math.min(d2, d4);
        }
        throw new NoWhenBranchMatchedException();
    }

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Z.CN3.values().length];
            try {
                iArr[Z.CN3.f12263n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Z.CN3.f12264t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private Dsr() {
    }
}
