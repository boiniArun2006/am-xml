package yd;

import WN.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;
import zD.j;

/* JADX INFO: renamed from: yd.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class AbstractC2464j {

    /* JADX INFO: renamed from: yd.j$j, reason: collision with other inner class name */
    public /* synthetic */ class C1287j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[j.w6.values().length];
            try {
                iArr[j.w6.f76398t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.w6.f76395O.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.w6.J2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[j.n.values().length];
            try {
                iArr2[j.n.f76388O.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[j.n.f76391o.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[j.n.J2.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[j.n.f76392r.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[j.n.f76393t.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final n n(n nVar) {
        j.w6 w6Var;
        j.n nVar2;
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        if (nVar instanceof n.w6) {
            return nVar;
        }
        if (!(nVar instanceof n.C1266n)) {
            throw new NoWhenBranchMatchedException();
        }
        n.C1266n c1266n = (n.C1266n) nVar;
        int i2 = C1287j.$EnumSwitchMapping$0[((zD.j) c1266n.n()).t().ordinal()];
        if (i2 == 1) {
            w6Var = j.w6.f11485t;
        } else if (i2 == 2) {
            w6Var = j.w6.f11482O;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            w6Var = j.w6.J2;
        }
        j.w6 w6Var2 = w6Var;
        int i3 = C1287j.$EnumSwitchMapping$1[((zD.j) c1266n.n()).n().ordinal()];
        if (i3 == 1 || i3 == 2) {
            nVar2 = j.n.f11476O;
        } else {
            if (i3 != 3 && i3 != 4 && i3 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            nVar2 = j.n.f11480t;
        }
        return new n.C1266n(new WN.j(w6Var2, j.EnumC0415j.f11471g, nVar2, ((zD.j) c1266n.n()).rl(), ((zD.j) c1266n.n()).nr()));
    }
}
