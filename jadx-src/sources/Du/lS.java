package Du;

import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class lS implements EJn.Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f2024n;
    private final EJn.I28 rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lS)) {
            return false;
        }
        lS lSVar = (lS) obj;
        return Intrinsics.areEqual(KN(), lSVar.KN()) && Intrinsics.areEqual(getKind(), lSVar.getKind());
    }

    @Override // EJn.Wre
    public int nr() {
        return 0;
    }

    public lS(String serialName, EJn.I28 kind) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.f2024n = serialName;
        this.rl = kind;
    }

    private final Void n() {
        throw new IllegalStateException("Primitive descriptor " + KN() + " does not have elements");
    }

    @Override // EJn.Wre
    public String KN() {
        return this.f2024n;
    }

    @Override // EJn.Wre
    /* JADX INFO: renamed from: mUb, reason: merged with bridge method [inline-methods] */
    public EJn.I28 getKind() {
        return this.rl;
    }

    @Override // EJn.Wre
    public int t(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        n();
        throw new KotlinNothingValueException();
    }

    public String toString() {
        return "PrimitiveDescriptor(" + KN() + ')';
    }

    @Override // EJn.Wre
    public List J2(int i2) {
        n();
        throw new KotlinNothingValueException();
    }

    @Override // EJn.Wre
    public String O(int i2) {
        n();
        throw new KotlinNothingValueException();
    }

    @Override // EJn.Wre
    public EJn.Wre Uo(int i2) {
        n();
        throw new KotlinNothingValueException();
    }

    public int hashCode() {
        return KN().hashCode() + (getKind().hashCode() * 31);
    }

    @Override // EJn.Wre
    public boolean xMQ(int i2) {
        n();
        throw new KotlinNothingValueException();
    }
}
