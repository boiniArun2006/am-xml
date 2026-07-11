package ga6;

import com.safedk.android.analytics.events.a;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class j {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f67608O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Throwable f67609n;
    private final n nr;
    private final w6 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final EnumC0949j f67610t;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: ga6.j$j, reason: collision with other inner class name */
    public static final class EnumC0949j {

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f67613X;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumC0949j[] f67615e;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f67620n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final EnumC0949j f67619t = new EnumC0949j("UNKNOWN", 0, "unknown");

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final EnumC0949j f67611O = new EnumC0949j("APP_SETUP", 1, "app_setup");
        public static final EnumC0949j J2 = new EnumC0949j("IMPORT", 2, "import");

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final EnumC0949j f67618r = new EnumC0949j("SCENE", 3, "scene");

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final EnumC0949j f67617o = new EnumC0949j("PRESET", 4, "preset");

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public static final EnumC0949j f67614Z = new EnumC0949j("CONTENT_CREATOR", 5, "content_creator");

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public static final EnumC0949j f67612S = new EnumC0949j("CREATOR_RANKING", 6, "creator_ranking");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final EnumC0949j f67616g = new EnumC0949j("PREMADE_CONTENT", 7, "premade_content");
        public static final EnumC0949j E2 = new EnumC0949j("HOME_FEED", 8, "home_feed");

        static {
            EnumC0949j[] enumC0949jArrN = n();
            f67615e = enumC0949jArrN;
            f67613X = EnumEntriesKt.enumEntries(enumC0949jArrN);
        }

        private static final /* synthetic */ EnumC0949j[] n() {
            return new EnumC0949j[]{f67619t, f67611O, J2, f67618r, f67617o, f67614Z, f67612S, f67616g, E2};
        }

        public static EnumC0949j valueOf(String str) {
            return (EnumC0949j) Enum.valueOf(EnumC0949j.class, str);
        }

        public static EnumC0949j[] values() {
            return (EnumC0949j[]) f67615e.clone();
        }

        public final String rl() {
            return this.f67620n;
        }

        private EnumC0949j(String str, int i2, String str2) {
            this.f67620n = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class n {

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f67622S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private static final /* synthetic */ n[] f67623Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f67627n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final n f67626t = new n("UNKNOWN", 0, "unknown");

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final n f67621O = new n("IO", 1, "io");
        public static final n J2 = new n("NETWORK", 2, a.f62814d);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final n f67625r = new n("ILLEGAL_STATE", 3, "illegal_state");

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final n f67624o = new n("RANKING", 4, "ranking");

        static {
            n[] nVarArrN = n();
            f67623Z = nVarArrN;
            f67622S = EnumEntriesKt.enumEntries(nVarArrN);
        }

        private static final /* synthetic */ n[] n() {
            return new n[]{f67626t, f67621O, J2, f67625r, f67624o};
        }

        public static n valueOf(String str) {
            return (n) Enum.valueOf(n.class, str);
        }

        public static n[] values() {
            return (n[]) f67623Z.clone();
        }

        public final String rl() {
            return this.f67627n;
        }

        private n(String str, int i2, String str2) {
            this.f67627n = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class w6 {

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f67629Z;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final /* synthetic */ w6[] f67630o;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f67633n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final w6 f67632t = new w6("INFO", 0, "INFO");

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final w6 f67628O = new w6("WARNING", 1, "WARNING");
        public static final w6 J2 = new w6("ERROR", 2, "ERROR");

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final w6 f67631r = new w6("CRITICAL", 3, "CRITICAL");

        static {
            w6[] w6VarArrN = n();
            f67630o = w6VarArrN;
            f67629Z = EnumEntriesKt.enumEntries(w6VarArrN);
        }

        private static final /* synthetic */ w6[] n() {
            return new w6[]{f67632t, f67628O, J2, f67631r};
        }

        public static w6 valueOf(String str) {
            return (w6) Enum.valueOf(w6.class, str);
        }

        public static w6[] values() {
            return (w6[]) f67630o.clone();
        }

        public final String rl() {
            return this.f67633n;
        }

        private w6(String str, int i2, String str2) {
            this.f67633n = str2;
        }
    }

    public j(Throwable throwable, w6 severity, EnumC0949j category, n domain, String str) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(domain, "domain");
        this.f67609n = throwable;
        this.rl = severity;
        this.f67610t = category;
        this.nr = domain;
        this.f67608O = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f67609n, jVar.f67609n) && this.rl == jVar.rl && this.f67610t == jVar.f67610t && this.nr == jVar.nr && Intrinsics.areEqual(this.f67608O, jVar.f67608O);
    }

    public final Throwable O() {
        return this.f67609n;
    }

    public int hashCode() {
        int iHashCode = ((((((this.f67609n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f67610t.hashCode()) * 31) + this.nr.hashCode()) * 31;
        String str = this.f67608O;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final EnumC0949j n() {
        return this.f67610t;
    }

    public final w6 nr() {
        return this.rl;
    }

    public final String rl() {
        return this.f67608O;
    }

    public final n t() {
        return this.nr;
    }

    public String toString() {
        return "AlightError(throwable=" + this.f67609n + ", severity=" + this.rl + ", category=" + this.f67610t + ", domain=" + this.nr + ", description=" + this.f67608O + ")";
    }

    public /* synthetic */ j(Throwable th, w6 w6Var, EnumC0949j enumC0949j, n nVar, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, w6Var, enumC0949j, (i2 & 8) != 0 ? M3.n.O(th) : nVar, (i2 & 16) != 0 ? null : str);
    }
}
