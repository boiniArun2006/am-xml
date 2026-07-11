package Du;

import EJn.Xo;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class O implements EJn.Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final EJn.Wre f1976n;
    private final int rl;

    public /* synthetic */ O(EJn.Wre wre, DefaultConstructorMarker defaultConstructorMarker) {
        this(wre);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o2 = (O) obj;
        return Intrinsics.areEqual(this.f1976n, o2.f1976n) && Intrinsics.areEqual(KN(), o2.KN());
    }

    private O(EJn.Wre wre) {
        this.f1976n = wre;
        this.rl = 1;
    }

    @Override // EJn.Wre
    public List J2(int i2) {
        if (i2 >= 0) {
            return CollectionsKt.emptyList();
        }
        throw new IllegalArgumentException(("Illegal index " + i2 + ", " + KN() + " expects only non-negative indices").toString());
    }

    @Override // EJn.Wre
    public EJn.Wre Uo(int i2) {
        if (i2 >= 0) {
            return this.f1976n;
        }
        throw new IllegalArgumentException(("Illegal index " + i2 + ", " + KN() + " expects only non-negative indices").toString());
    }

    @Override // EJn.Wre
    public EJn.Pl getKind() {
        return Xo.n.f2284n;
    }

    public int hashCode() {
        return (this.f1976n.hashCode() * 31) + KN().hashCode();
    }

    @Override // EJn.Wre
    public int nr() {
        return this.rl;
    }

    @Override // EJn.Wre
    public int t(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer intOrNull = StringsKt.toIntOrNull(name);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        throw new IllegalArgumentException(name + " is not a valid list index");
    }

    public String toString() {
        return KN() + '(' + this.f1976n + ')';
    }

    @Override // EJn.Wre
    public boolean xMQ(int i2) {
        if (i2 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i2 + ", " + KN() + " expects only non-negative indices").toString());
    }

    @Override // EJn.Wre
    public String O(int i2) {
        return String.valueOf(i2);
    }
}
