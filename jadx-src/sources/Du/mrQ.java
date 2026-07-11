package Du;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class mrQ implements EJn.Wre, Pl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final EJn.Wre f2026n;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Set f2027t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mrQ) && Intrinsics.areEqual(this.f2026n, ((mrQ) obj).f2026n);
    }

    @Override // EJn.Wre
    public boolean rl() {
        return true;
    }

    public mrQ(EJn.Wre original) {
        Intrinsics.checkNotNullParameter(original, "original");
        this.f2026n = original;
        this.rl = original.KN() + '?';
        this.f2027t = cA.n(original);
    }

    @Override // EJn.Wre
    public List J2(int i2) {
        return this.f2026n.J2(i2);
    }

    @Override // EJn.Wre
    public String KN() {
        return this.rl;
    }

    @Override // EJn.Wre
    public String O(int i2) {
        return this.f2026n.O(i2);
    }

    @Override // EJn.Wre
    public EJn.Wre Uo(int i2) {
        return this.f2026n.Uo(i2);
    }

    @Override // EJn.Wre
    public List getAnnotations() {
        return this.f2026n.getAnnotations();
    }

    @Override // EJn.Wre
    public EJn.Pl getKind() {
        return this.f2026n.getKind();
    }

    public int hashCode() {
        return this.f2026n.hashCode() * 31;
    }

    @Override // EJn.Wre
    public boolean isInline() {
        return this.f2026n.isInline();
    }

    public final EJn.Wre mUb() {
        return this.f2026n;
    }

    @Override // Du.Pl
    public Set n() {
        return this.f2027t;
    }

    @Override // EJn.Wre
    public int nr() {
        return this.f2026n.nr();
    }

    @Override // EJn.Wre
    public int t(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f2026n.t(name);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2026n);
        sb.append('?');
        return sb.toString();
    }

    @Override // EJn.Wre
    public boolean xMQ(int i2) {
        return this.f2026n.xMQ(i2);
    }
}
