package Du;

import EJn.Pl;
import EJn.Xo;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Du.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class C1342u extends DC {
    private final EJn.Pl az;
    private final Lazy ty;

    @Override // Du.DC
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof EJn.Wre)) {
            return false;
        }
        EJn.Wre wre = (EJn.Wre) obj;
        return wre.getKind() == Pl.n.f2281n && Intrinsics.areEqual(KN(), wre.KN()) && Intrinsics.areEqual(cA.n(this), cA.n(wre));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1342u(final String name, final int i2) {
        super(name, null, i2, 2, null);
        Intrinsics.checkNotNullParameter(name, "name");
        this.az = Pl.n.f2281n;
        this.ty = LazyKt.lazy(new Function0() { // from class: Du.DAz
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C1342u.g(i2, name, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EJn.Wre[] g(int i2, String str, C1342u c1342u) {
        EJn.Wre[] wreArr = new EJn.Wre[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            wreArr[i3] = EJn.qz.KN(str + '.' + c1342u.O(i3), Xo.Ml.f2282n, new EJn.Wre[0], null, 8, null);
        }
        return wreArr;
    }

    private final EJn.Wre[] te() {
        return (EJn.Wre[]) this.ty.getValue();
    }

    @Override // Du.DC, EJn.Wre
    public EJn.Pl getKind() {
        return this.az;
    }

    @Override // Du.DC, EJn.Wre
    public EJn.Wre Uo(int i2) {
        return te()[i2];
    }

    @Override // Du.DC
    public int hashCode() {
        int iHashCode;
        int iHashCode2 = KN().hashCode();
        int i2 = 1;
        for (String str : EJn.aC.rl(this)) {
            int i3 = i2 * 31;
            if (str != null) {
                iHashCode = str.hashCode();
            } else {
                iHashCode = 0;
            }
            i2 = i3 + iHashCode;
        }
        return (iHashCode2 * 31) + i2;
    }

    @Override // Du.DC
    public String toString() {
        return CollectionsKt.joinToString$default(EJn.aC.rl(this), ", ", KN() + '(', ")", 0, null, null, 56, null);
    }
}
