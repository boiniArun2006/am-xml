package k9w;

import Oe.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oC.Wre;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class Ml {

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Sln.n.values().length];
            try {
                iArr[Sln.n.AVC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Sln.n.H265.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Sln.j.values().length];
            try {
                iArr2[Sln.j.AAC.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final Wre J2(n nVar, boolean z2) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        return new Wre(nr(nVar.rl().nr(), z2), nVar.rl().n(), nVar.rl().rl(), 0, t(nVar.rl().t()), 8, null);
    }

    public static final oC.n n(n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        return new oC.n(nVar.n().n(), nVar.n().t(), rl(nVar.n().rl()));
    }

    private static final Oe.j nr(Oe.w6 w6Var, boolean z2) {
        return z2 ? O(w6Var) : new Oe.j(w6Var, j.n.DEGREE_0);
    }

    private static final oC.j rl(Sln.j jVar) {
        if (j.$EnumSwitchMapping$1[jVar.ordinal()] == 1) {
            return oC.j.AAC;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final oC.I28 t(Sln.n nVar) {
        int i2 = j.$EnumSwitchMapping$0[nVar.ordinal()];
        if (i2 == 1) {
            return oC.I28.AVC;
        }
        if (i2 == 2) {
            return oC.I28.H265;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final Oe.j O(Oe.w6 w6Var) {
        j.n nVar;
        if (w6Var.n() >= 1.0f) {
            nVar = j.n.DEGREE_0;
        } else {
            nVar = j.n.DEGREE_90;
        }
        return new Oe.j(w6Var, nVar);
    }
}
