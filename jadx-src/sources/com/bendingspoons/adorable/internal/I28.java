package com.bendingspoons.adorable.internal;

import ScC.j;
import TFv.Lu;
import TFv.SPz;
import androidx.view.ViewModel;
import com.bendingspoons.adorable.internal.Ml;
import com.bendingspoons.adorable.internal.j;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class I28 extends ViewModel {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private SPz f51189n = Lu.n(new Ml(Ml.j.f51191O));
    private final SPz rl = Lu.n(CollectionsKt.emptyList());

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[j.n.values().length];
            try {
                iArr[j.n.f9797t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.n.f9795n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.n.f9794O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Ml.j.values().length];
            try {
                iArr2[Ml.j.f51192n.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Ml.j.f51194t.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Ml.j.f51191O.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private final void gh(com.bendingspoons.adorable.internal.j jVar) {
        List mutableList = CollectionsKt.toMutableList((Collection) this.rl.getValue());
        mutableList.add(jVar);
        this.rl.setValue(mutableList);
    }

    public final void J2() {
        gh(j.n.f51198n);
    }

    public final void KN() {
        int i2 = j.$EnumSwitchMapping$1[((Ml) this.f51189n.getValue()).rl().ordinal()];
        if (i2 == 1) {
            gh(new j.C0717j(true));
        } else if (i2 == 2) {
            gh(j.w6.f51199n);
        } else if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void O() {
        List mutableList = CollectionsKt.toMutableList((Collection) this.rl.getValue());
        CollectionsKt.removeFirstOrNull(mutableList);
        this.rl.setValue(mutableList);
    }

    public final void Uo() {
        Object value;
        SPz sPz = this.f51189n;
        do {
            value = sPz.getValue();
        } while (!sPz.Uo(value, ((Ml) value).n(Ml.j.f51192n)));
    }

    public final void mUb() {
        Object value;
        SPz sPz = this.f51189n;
        do {
            value = sPz.getValue();
        } while (!sPz.Uo(value, ((Ml) value).n(Ml.j.f51192n)));
    }

    public final void nr(j.n adType) {
        Object value;
        Object value2;
        Intrinsics.checkNotNullParameter(adType, "adType");
        int i2 = j.$EnumSwitchMapping$0[adType.ordinal()];
        if (i2 == 1) {
            SPz sPz = this.f51189n;
            do {
                value = sPz.getValue();
            } while (!sPz.Uo(value, new Ml(Ml.j.f51194t)));
            return;
        }
        if (i2 != 2 && i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        SPz sPz2 = this.f51189n;
        do {
            value2 = sPz2.getValue();
        } while (!sPz2.Uo(value2, new Ml(Ml.j.f51191O)));
    }

    public final SPz rl() {
        return this.rl;
    }

    public final SPz t() {
        return this.f51189n;
    }

    public final void xMQ() {
        gh(new j.C0717j(false));
    }
}
