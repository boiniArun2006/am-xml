package Q4;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class I28 {

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[w6.values().length];
            try {
                iArr[w6.PCM_8BIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w6.PCM_16BIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[w6.PCM_24BIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[w6.PCM_32BIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[w6.PCM_FLOAT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int n(w6 w6Var) {
        Intrinsics.checkNotNullParameter(w6Var, "<this>");
        int i2 = j.$EnumSwitchMapping$0[w6Var.ordinal()];
        if (i2 == 1) {
            return as.j.f43098n.O();
        }
        if (i2 == 2) {
            return as.j.f43098n.rl();
        }
        if (i2 == 3) {
            return as.j.f43098n.t();
        }
        if (i2 == 4) {
            return as.j.f43098n.nr();
        }
        if (i2 == 5) {
            return as.j.f43098n.J2();
        }
        throw new NoWhenBranchMatchedException();
    }
}
