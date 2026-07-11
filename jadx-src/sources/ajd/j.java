package ajd;

import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pq.Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class j {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Ml f13098O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f13099n;
    private final String nr;
    private final EnumC0481j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f13100t;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: ajd.j$j, reason: collision with other inner class name */
    public static final class EnumC0481j {

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f13102Z;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final /* synthetic */ EnumC0481j[] f13103o;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f13106n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final EnumC0481j f13105t = new EnumC0481j("INFO", 0, 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final EnumC0481j f13101O = new EnumC0481j("WARNING", 1, 2);
        public static final EnumC0481j J2 = new EnumC0481j("ERROR", 2, 3);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final EnumC0481j f13104r = new EnumC0481j("CRITICAL", 3, 4);

        static {
            EnumC0481j[] enumC0481jArrN = n();
            f13103o = enumC0481jArrN;
            f13102Z = EnumEntriesKt.enumEntries(enumC0481jArrN);
        }

        private static final /* synthetic */ EnumC0481j[] n() {
            return new EnumC0481j[]{f13105t, f13101O, J2, f13104r};
        }

        public static EnumC0481j valueOf(String str) {
            return (EnumC0481j) Enum.valueOf(EnumC0481j.class, str);
        }

        public static EnumC0481j[] values() {
            return (EnumC0481j[]) f13103o.clone();
        }

        public final int rl() {
            return this.f13106n;
        }

        private EnumC0481j(String str, int i2, int i3) {
            this.f13106n = i3;
        }
    }

    public j(List category, EnumC0481j severity, String str, String str2, Ml info) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(info, "info");
        this.f13099n = category;
        this.rl = severity;
        this.f13100t = str;
        this.nr = str2;
        this.f13098O = info;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f13099n, jVar.f13099n) && this.rl == jVar.rl && Intrinsics.areEqual(this.f13100t, jVar.f13100t) && Intrinsics.areEqual(this.nr, jVar.nr) && Intrinsics.areEqual(this.f13098O, jVar.f13098O);
    }

    public static /* synthetic */ j rl(j jVar, List list, EnumC0481j enumC0481j, String str, String str2, Ml ml, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = jVar.f13099n;
        }
        if ((i2 & 2) != 0) {
            enumC0481j = jVar.rl;
        }
        if ((i2 & 4) != 0) {
            str = jVar.f13100t;
        }
        if ((i2 & 8) != 0) {
            str2 = jVar.nr;
        }
        if ((i2 & 16) != 0) {
            ml = jVar.f13098O;
        }
        Ml ml2 = ml;
        String str3 = str;
        return jVar.n(list, enumC0481j, str3, str2, ml2);
    }

    public final Ml J2() {
        return this.f13098O;
    }

    public final String O() {
        return this.nr;
    }

    public final EnumC0481j Uo() {
        return this.rl;
    }

    public int hashCode() {
        int iHashCode = ((this.f13099n.hashCode() * 31) + this.rl.hashCode()) * 31;
        String str = this.f13100t;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nr;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f13098O.hashCode();
    }

    public final j n(List category, EnumC0481j severity, String str, String str2, Ml info) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(info, "info");
        return new j(category, severity, str, str2, info);
    }

    public final String nr() {
        return this.f13100t;
    }

    public final List t() {
        return this.f13099n;
    }

    public String toString() {
        return "DebugEvent(category=" + this.f13099n + ", severity=" + this.rl + ", description=" + this.f13100t + ", errorCode=" + this.nr + ", info=" + this.f13098O + ")";
    }

    public /* synthetic */ j(List list, EnumC0481j enumC0481j, String str, String str2, Ml ml, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i2 & 2) != 0 ? EnumC0481j.f13105t : enumC0481j, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? new Ml() : ml);
    }
}
