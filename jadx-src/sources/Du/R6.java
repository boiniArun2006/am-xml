package Du;

import EJn.Xo;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class R6 implements EJn.Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final R6 f1984n = new R6();
    private static final EJn.Pl rl = Xo.Ml.f2282n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f1985t = "kotlin.Nothing";

    @Override // EJn.Wre
    public int nr() {
        return 0;
    }

    private final Void n() {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // EJn.Wre
    public String KN() {
        return f1985t;
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    @Override // EJn.Wre
    public EJn.Pl getKind() {
        return rl;
    }

    @Override // EJn.Wre
    public int t(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        n();
        throw new KotlinNothingValueException();
    }

    public String toString() {
        return "NothingSerialDescriptor";
    }

    private R6() {
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
