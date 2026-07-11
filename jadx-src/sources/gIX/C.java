package gIX;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class C {
    private final aC J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f67194O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f67195n;
    private final long nr;
    private final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f67196t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c2 = (C) obj;
        return Intrinsics.areEqual(this.f67195n, c2.f67195n) && this.rl == c2.rl && this.f67196t == c2.f67196t && this.nr == c2.nr && Intrinsics.areEqual(this.f67194O, c2.f67194O) && Intrinsics.areEqual(this.J2, c2.J2);
    }

    public C(String link, boolean z2, boolean z3, long j2, String projectPackageId, aC aCVar) {
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(projectPackageId, "projectPackageId");
        this.f67195n = link;
        this.rl = z2;
        this.f67196t = z3;
        this.nr = j2;
        this.f67194O = projectPackageId;
        this.J2 = aCVar;
    }

    public final long O() {
        return this.nr;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f67195n.hashCode() * 31) + Boolean.hashCode(this.rl)) * 31) + Boolean.hashCode(this.f67196t)) * 31) + Long.hashCode(this.nr)) * 31) + this.f67194O.hashCode()) * 31;
        aC aCVar = this.J2;
        return iHashCode + (aCVar == null ? 0 : aCVar.hashCode());
    }

    public final aC n() {
        return this.J2;
    }

    public final boolean nr() {
        return this.f67196t;
    }

    public final boolean rl() {
        return this.rl;
    }

    public final String t() {
        return this.f67195n;
    }

    public String toString() {
        return "BuildAndUploadProjectPackageResult(link=" + this.f67195n + ", largePackage=" + this.rl + ", litePackageAvailable=" + this.f67196t + ", uploadSize=" + this.nr + ", projectPackageId=" + this.f67194O + ", bitmaps=" + this.J2 + ")";
    }
}
