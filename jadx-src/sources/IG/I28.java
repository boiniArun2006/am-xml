package IG;

import IG.aC;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class I28 {

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IG.j.values().length];
            try {
                iArr[IG.j.f4134n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IG.j.f4137t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IG.j.f4133O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IG.j.J2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final aC n(Wre wre) {
        Intrinsics.checkNotNullParameter(wre, "<this>");
        IG.j jVarT = wre.t();
        int i2 = jVarT == null ? -1 : j.$EnumSwitchMapping$0[jVarT.ordinal()];
        if (i2 == -1) {
            return new aC.Ml(wre.Uo(), wre.KN());
        }
        if (i2 == 1) {
            return new aC.n(wre.nr(), wre.O());
        }
        if (i2 == 2) {
            return new aC.w6(wre.O());
        }
        if (i2 == 3) {
            return new aC.j(tN.CN3.f73454n);
        }
        if (i2 == 4) {
            return new aC.j(tN.CN3.f73455t);
        }
        throw new NoWhenBranchMatchedException();
    }
}
