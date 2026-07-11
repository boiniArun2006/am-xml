package Oe;

import Oe.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class n {

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[j.n.values().length];
            try {
                iArr[j.n.DEGREE_0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.n.DEGREE_180.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.n.DEGREE_90.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[j.n.DEGREE_270.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final w6 rl(Oe.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return t(jVar.n()) ? new w6(jVar.rl().rl(), jVar.rl().t()) : jVar.rl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t(j.n nVar) {
        int i2 = j.$EnumSwitchMapping$0[nVar.ordinal()];
        if (i2 == 1 || i2 == 2) {
            return false;
        }
        if (i2 == 3 || i2 == 4) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }
}
