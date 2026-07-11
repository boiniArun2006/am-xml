package EJn;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.Typography;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class w6 implements Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Wre f2296n;
    public final KClass rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f2297t;

    public w6(Wre original, KClass kClass) {
        Intrinsics.checkNotNullParameter(original, "original");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        this.f2296n = original;
        this.rl = kClass;
        this.f2297t = original.KN() + Typography.less + kClass.getSimpleName() + Typography.greater;
    }

    @Override // EJn.Wre
    public List J2(int i2) {
        return this.f2296n.J2(i2);
    }

    @Override // EJn.Wre
    public String KN() {
        return this.f2297t;
    }

    @Override // EJn.Wre
    public String O(int i2) {
        return this.f2296n.O(i2);
    }

    @Override // EJn.Wre
    public Wre Uo(int i2) {
        return this.f2296n.Uo(i2);
    }

    public boolean equals(Object obj) {
        w6 w6Var = obj instanceof w6 ? (w6) obj : null;
        return w6Var != null && Intrinsics.areEqual(this.f2296n, w6Var.f2296n) && Intrinsics.areEqual(w6Var.rl, this.rl);
    }

    @Override // EJn.Wre
    public List getAnnotations() {
        return this.f2296n.getAnnotations();
    }

    @Override // EJn.Wre
    public Pl getKind() {
        return this.f2296n.getKind();
    }

    public int hashCode() {
        return (this.rl.hashCode() * 31) + KN().hashCode();
    }

    @Override // EJn.Wre
    public boolean isInline() {
        return this.f2296n.isInline();
    }

    @Override // EJn.Wre
    public int nr() {
        return this.f2296n.nr();
    }

    @Override // EJn.Wre
    public boolean rl() {
        return this.f2296n.rl();
    }

    @Override // EJn.Wre
    public int t(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f2296n.t(name);
    }

    public String toString() {
        return "ContextDescriptor(kClass: " + this.rl + ", original: " + this.f2296n + ')';
    }

    @Override // EJn.Wre
    public boolean xMQ(int i2) {
        return this.f2296n.xMQ(i2);
    }
}
