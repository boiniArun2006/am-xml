package ktm;

import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class j {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final List f70286O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f70287n;
    private final Boolean nr;
    private final C1041j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final n f70288t;

    /* JADX INFO: renamed from: ktm.j$j, reason: collision with other inner class name */
    public static final class C1041j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f70289n;
        private final String rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1041j)) {
                return false;
            }
            C1041j c1041j = (C1041j) obj;
            return this.f70289n == c1041j.f70289n && Intrinsics.areEqual(this.rl, c1041j.rl);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.f70289n) * 31;
            String str = this.rl;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final int n() {
            return this.f70289n;
        }

        public final String rl() {
            return this.rl;
        }

        public String toString() {
            return "Segment(index=" + this.f70289n + ", name=" + this.rl + ")";
        }

        public C1041j(int i2, String str) {
            this.f70289n = i2;
            this.rl = str;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class n {

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f70291Z;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final /* synthetic */ n[] f70292o;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f70295n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final n f70294t = new n("DRAFT", 0, 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final n f70290O = new n("RUNNING", 1, 2);
        public static final n J2 = new n("OBSERVING", 2, 3);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final n f70293r = new n("COMPLETED", 3, 4);

        static {
            n[] nVarArrN = n();
            f70292o = nVarArrN;
            f70291Z = EnumEntriesKt.enumEntries(nVarArrN);
        }

        private static final /* synthetic */ n[] n() {
            return new n[]{f70294t, f70290O, J2, f70293r};
        }

        public static n valueOf(String str) {
            return (n) Enum.valueOf(n.class, str);
        }

        public static n[] values() {
            return (n[]) f70292o.clone();
        }

        public final int rl() {
            return this.f70295n;
        }

        private n(String str, int i2, int i3) {
            this.f70295n = i3;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f70287n, jVar.f70287n) && Intrinsics.areEqual(this.rl, jVar.rl) && this.f70288t == jVar.f70288t && Intrinsics.areEqual(this.nr, jVar.nr) && Intrinsics.areEqual(this.f70286O, jVar.f70286O);
    }

    public j(String name, C1041j c1041j, n nVar, Boolean bool, List segments) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(segments, "segments");
        this.f70287n = name;
        this.rl = c1041j;
        this.f70288t = nVar;
        this.nr = bool;
        this.f70286O = segments;
    }

    public static /* synthetic */ j rl(j jVar, String str, C1041j c1041j, n nVar, Boolean bool, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = jVar.f70287n;
        }
        if ((i2 & 2) != 0) {
            c1041j = jVar.rl;
        }
        if ((i2 & 4) != 0) {
            nVar = jVar.f70288t;
        }
        if ((i2 & 8) != 0) {
            bool = jVar.nr;
        }
        if ((i2 & 16) != 0) {
            list = jVar.f70286O;
        }
        List list2 = list;
        n nVar2 = nVar;
        return jVar.n(str, c1041j, nVar2, bool, list2);
    }

    public final n J2() {
        return this.f70288t;
    }

    public final List O() {
        return this.f70286O;
    }

    public final Boolean Uo() {
        return this.nr;
    }

    public int hashCode() {
        int iHashCode = this.f70287n.hashCode() * 31;
        C1041j c1041j = this.rl;
        int iHashCode2 = (iHashCode + (c1041j == null ? 0 : c1041j.hashCode())) * 31;
        n nVar = this.f70288t;
        int iHashCode3 = (iHashCode2 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        Boolean bool = this.nr;
        return ((iHashCode3 + (bool != null ? bool.hashCode() : 0)) * 31) + this.f70286O.hashCode();
    }

    public final j n(String name, C1041j c1041j, n nVar, Boolean bool, List segments) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(segments, "segments");
        return new j(name, c1041j, nVar, bool, segments);
    }

    public final C1041j nr() {
        return this.rl;
    }

    public final String t() {
        return this.f70287n;
    }

    public String toString() {
        return "Experiment(name=" + this.f70287n + ", segment=" + this.rl + ", state=" + this.f70288t + ", isCompatible=" + this.nr + ", segments=" + this.f70286O + ")";
    }
}
