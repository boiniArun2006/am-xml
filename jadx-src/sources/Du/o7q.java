package Du;

import EJn.Xo;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class o7q implements EJn.Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f2036n;
    private final int nr;
    private final EJn.Wre rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final EJn.Wre f2037t;

    public /* synthetic */ o7q(String str, EJn.Wre wre, EJn.Wre wre2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, wre, wre2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7q)) {
            return false;
        }
        o7q o7qVar = (o7q) obj;
        return Intrinsics.areEqual(KN(), o7qVar.KN()) && Intrinsics.areEqual(this.rl, o7qVar.rl) && Intrinsics.areEqual(this.f2037t, o7qVar.f2037t);
    }

    private o7q(String str, EJn.Wre wre, EJn.Wre wre2) {
        this.f2036n = str;
        this.rl = wre;
        this.f2037t = wre2;
        this.nr = 2;
    }

    @Override // EJn.Wre
    public List J2(int i2) {
        if (i2 >= 0) {
            return CollectionsKt.emptyList();
        }
        throw new IllegalArgumentException(("Illegal index " + i2 + ", " + KN() + " expects only non-negative indices").toString());
    }

    @Override // EJn.Wre
    public String KN() {
        return this.f2036n;
    }

    @Override // EJn.Wre
    public EJn.Wre Uo(int i2) {
        if (i2 >= 0) {
            int i3 = i2 % 2;
            if (i3 == 0) {
                return this.rl;
            }
            if (i3 == 1) {
                return this.f2037t;
            }
            throw new IllegalStateException("Unreached");
        }
        throw new IllegalArgumentException(("Illegal index " + i2 + ", " + KN() + " expects only non-negative indices").toString());
    }

    @Override // EJn.Wre
    public EJn.Pl getKind() {
        return Xo.w6.f2285n;
    }

    @Override // EJn.Wre
    public int nr() {
        return this.nr;
    }

    @Override // EJn.Wre
    public int t(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer intOrNull = StringsKt.toIntOrNull(name);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        throw new IllegalArgumentException(name + " is not a valid map index");
    }

    public String toString() {
        return KN() + '(' + this.rl + ", " + this.f2037t + ')';
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

    public int hashCode() {
        return (((KN().hashCode() * 31) + this.rl.hashCode()) * 31) + this.f2037t.hashCode();
    }
}
