package Mgn;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class UGc {

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Mgn.j.values().length];
            try {
                iArr[Mgn.j.f6648n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Mgn.j.f6651t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Mgn.j.f6646O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Mgn.j.J2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Mgn.j.f6650r.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o rl(Mgn.j jVar) {
        int i2 = j.$EnumSwitchMapping$0[jVar.ordinal()];
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return o.f6653S;
        }
        if (i2 == 3) {
            return o.f6656o;
        }
        if (i2 == 4) {
            return o.f6657r;
        }
        if (i2 == 5) {
            return o.J2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
