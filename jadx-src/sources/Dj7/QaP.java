package Dj7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class QaP {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f1678n;
    private final P0j.Dsr rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QaP)) {
            return false;
        }
        QaP qaP = (QaP) obj;
        return Intrinsics.areEqual(this.f1678n, qaP.f1678n) && Intrinsics.areEqual(this.rl, qaP.rl);
    }

    public QaP(String tag, P0j.Dsr transformation) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(transformation, "transformation");
        this.f1678n = tag;
        this.rl = transformation;
    }

    public int hashCode() {
        return (this.f1678n.hashCode() * 31) + this.rl.hashCode();
    }

    public final String n() {
        return this.f1678n;
    }

    public final P0j.Dsr rl() {
        return this.rl;
    }

    public String toString() {
        return "StringAnnotation(tag=" + this.f1678n + ", transformation=" + this.rl + ")";
    }
}
