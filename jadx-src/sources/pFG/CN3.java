package pFG;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ktm.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class CN3 {
    private final Boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final j.n f71708O;
    private final boolean Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f71709n;
    private final List nr;
    private final j.C1041j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f71710t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CN3)) {
            return false;
        }
        CN3 cn3 = (CN3) obj;
        return Intrinsics.areEqual(this.f71709n, cn3.f71709n) && Intrinsics.areEqual(this.rl, cn3.rl) && Intrinsics.areEqual(this.f71710t, cn3.f71710t) && Intrinsics.areEqual(this.nr, cn3.nr) && this.f71708O == cn3.f71708O && Intrinsics.areEqual(this.J2, cn3.J2) && this.Uo == cn3.Uo;
    }

    public CN3(String name, j.C1041j c1041j, String subtitle, List allSegments, j.n nVar, Boolean bool, boolean z2) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(allSegments, "allSegments");
        this.f71709n = name;
        this.rl = c1041j;
        this.f71710t = subtitle;
        this.nr = allSegments;
        this.f71708O = nVar;
        this.J2 = bool;
        this.Uo = z2;
    }

    public final Boolean J2() {
        return this.J2;
    }

    public final String O() {
        return this.f71710t;
    }

    public final boolean Uo() {
        return this.Uo;
    }

    public int hashCode() {
        int iHashCode = this.f71709n.hashCode() * 31;
        j.C1041j c1041j = this.rl;
        int iHashCode2 = (((((iHashCode + (c1041j == null ? 0 : c1041j.hashCode())) * 31) + this.f71710t.hashCode()) * 31) + this.nr.hashCode()) * 31;
        j.n nVar = this.f71708O;
        int iHashCode3 = (iHashCode2 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        Boolean bool = this.J2;
        return ((iHashCode3 + (bool != null ? bool.hashCode() : 0)) * 31) + Boolean.hashCode(this.Uo);
    }

    public final List n() {
        return this.nr;
    }

    public final j.n nr() {
        return this.f71708O;
    }

    public final String rl() {
        return this.f71709n;
    }

    public final j.C1041j t() {
        return this.rl;
    }

    public String toString() {
        return "ExperimentUIState(name=" + this.f71709n + ", segment=" + this.rl + ", subtitle=" + this.f71710t + ", allSegments=" + this.nr + ", state=" + this.f71708O + ", isCompatible=" + this.J2 + ", isFavourite=" + this.Uo + ")";
    }
}
