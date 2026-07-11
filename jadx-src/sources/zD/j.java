package zD;

import kotlin.ExceptionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import pq.Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class j {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Throwable f76378O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final w6 f76379n;
    private final String nr;
    private final EnumC1290j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final n f76380t;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: zD.j$j, reason: collision with other inner class name */
    public static final class EnumC1290j {

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f76382S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private static final /* synthetic */ EnumC1290j[] f76383Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f76387n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final EnumC1290j f76386t = new EnumC1290j("UNKNOWN", 0, "unknown");

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final EnumC1290j f76381O = new EnumC1290j("INTERNAL_ID", 1, "internal_id");
        public static final EnumC1290j J2 = new EnumC1290j("EXTERNAL_ID", 2, "external_id");

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final EnumC1290j f76385r = new EnumC1290j("MIGRATION", 3, "migration");

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final EnumC1290j f76384o = new EnumC1290j("CUSTOM_ID", 4, "custom_id");

        static {
            EnumC1290j[] enumC1290jArrN = n();
            f76383Z = enumC1290jArrN;
            f76382S = EnumEntriesKt.enumEntries(enumC1290jArrN);
        }

        private static final /* synthetic */ EnumC1290j[] n() {
            return new EnumC1290j[]{f76386t, f76381O, J2, f76385r, f76384o};
        }

        public static EnumC1290j valueOf(String str) {
            return (EnumC1290j) Enum.valueOf(EnumC1290j.class, str);
        }

        public static EnumC1290j[] values() {
            return (EnumC1290j[]) f76383Z.clone();
        }

        public final String rl() {
            return this.f76387n;
        }

        private EnumC1290j(String str, int i2, String str2) {
            this.f76387n = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class n {

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f76389S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private static final /* synthetic */ n[] f76390Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f76394n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final n f76393t = new n("UNKNOWN", 0, "unknown");

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final n f76388O = new n("IO", 1, "io");
        public static final n J2 = new n("INCONSISTENT_STATE", 2, "inconsistent_state");

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final n f76392r = new n("ID_PROVIDER", 3, "id_provider");

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final n f76391o = new n("ID_REPOSITORY", 4, "id_repository");

        static {
            n[] nVarArrN = n();
            f76390Z = nVarArrN;
            f76389S = EnumEntriesKt.enumEntries(nVarArrN);
        }

        private static final /* synthetic */ n[] n() {
            return new n[]{f76393t, f76388O, J2, f76392r, f76391o};
        }

        public static n valueOf(String str) {
            return (n) Enum.valueOf(n.class, str);
        }

        public static n[] values() {
            return (n[]) f76390Z.clone();
        }

        public final String rl() {
            return this.f76394n;
        }

        private n(String str, int i2, String str2) {
            this.f76394n = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class w6 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f76396o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ w6[] f76397r;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f76399n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final w6 f76398t = new w6("NOTICE", 0, "NOTICE");

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final w6 f76395O = new w6("WARNING", 1, "WARNING");
        public static final w6 J2 = new w6("CRITICAL", 2, "CRITICAL");

        static {
            w6[] w6VarArrN = n();
            f76397r = w6VarArrN;
            f76396o = EnumEntriesKt.enumEntries(w6VarArrN);
        }

        private static final /* synthetic */ w6[] n() {
            return new w6[]{f76398t, f76395O, J2};
        }

        public static w6 valueOf(String str) {
            return (w6) Enum.valueOf(w6.class, str);
        }

        public static w6[] values() {
            return (w6[]) f76397r.clone();
        }

        public final String rl() {
            return this.f76399n;
        }

        private w6(String str, int i2, String str2) {
            this.f76399n = str2;
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
        return this.f76379n == jVar.f76379n && this.rl == jVar.rl && this.f76380t == jVar.f76380t && Intrinsics.areEqual(this.nr, jVar.nr) && Intrinsics.areEqual(this.f76378O, jVar.f76378O);
    }

    public j(w6 severity, EnumC1290j category, n domain, String str, Throwable throwable) {
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(domain, "domain");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f76379n = severity;
        this.rl = category;
        this.f76380t = domain;
        this.nr = str;
        this.f76378O = throwable;
    }

    public final Ml O() {
        Ml ml = new Ml();
        ml.O("severity", this.f76379n.rl());
        ml.O("category", this.rl.rl());
        ml.O("domain", this.f76380t.rl());
        ml.O("throwableStacktrace", ExceptionsKt.stackTraceToString(this.f76378O));
        String str = this.nr;
        if (str != null) {
            ml.O("errorMessage", str);
        }
        return ml;
    }

    public int hashCode() {
        int iHashCode = ((((this.f76379n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f76380t.hashCode()) * 31;
        String str = this.nr;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f76378O.hashCode();
    }

    public final n n() {
        return this.f76380t;
    }

    public final Throwable nr() {
        return this.f76378O;
    }

    public final String rl() {
        return this.nr;
    }

    public final w6 t() {
        return this.f76379n;
    }

    public String toString() {
        return "ConciergeError(severity=" + this.f76379n + ", category=" + this.rl + ", domain=" + this.f76380t + ", message=" + this.nr + ", throwable=" + this.f76378O + ")";
    }
}
