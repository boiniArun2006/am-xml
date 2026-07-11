package WN;

import com.google.android.gms.internal.ads_identifier.VR.wDgKoYAES;
import com.safedk.android.analytics.events.a;
import kotlin.ExceptionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import pq.Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class j {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Throwable f11464O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final w6 f11465n;
    private final String nr;
    private final EnumC0415j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final n f11466t;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: WN.j$j, reason: collision with other inner class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class EnumC0415j {
        private static final /* synthetic */ EnumC0415j[] E2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f11470e;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f11475n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final EnumC0415j f11474t = new EnumC0415j("UNKNOWN", 0, "unknown");

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final EnumC0415j f11467O = new EnumC0415j("EVENT_REPOSITORY", 1, "event_repository");
        public static final EnumC0415j J2 = new EnumC0415j("SESSION_REPOSITORY", 2, "session_repository");

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final EnumC0415j f11473r = new EnumC0415j("BASE_INFO_PROVIDER", 3, "base_info_provider");

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final EnumC0415j f11472o = new EnumC0415j("MANAGER", 4, "manager");

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public static final EnumC0415j f11469Z = new EnumC0415j("ADDITIONAL_INFO_PROVIDER", 5, "additional_info_provider");

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public static final EnumC0415j f11468S = new EnumC0415j("CRASH_MANAGER", 6, "crash_manager");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final EnumC0415j f11471g = new EnumC0415j("EXTERNAL_DEPENDENCY", 7, "external_dependency");

        static {
            EnumC0415j[] enumC0415jArrN = n();
            E2 = enumC0415jArrN;
            f11470e = EnumEntriesKt.enumEntries(enumC0415jArrN);
        }

        private static final /* synthetic */ EnumC0415j[] n() {
            return new EnumC0415j[]{f11474t, f11467O, J2, f11473r, f11472o, f11469Z, f11468S, f11471g};
        }

        public static EnumC0415j valueOf(String str) {
            return (EnumC0415j) Enum.valueOf(EnumC0415j.class, str);
        }

        public static EnumC0415j[] values() {
            return (EnumC0415j[]) E2.clone();
        }

        public final String rl() {
            return this.f11475n;
        }

        private EnumC0415j(String str, int i2, String str2) {
            this.f11475n = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class n {

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f11477Z;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final /* synthetic */ n[] f11478o;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f11481n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final n f11480t = new n("UNKNOWN", 0, "unknown");

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final n f11476O = new n("IO_FROM_DISK", 1, "io_from_disk");
        public static final n J2 = new n("NETWORK", 2, a.f62814d);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final n f11479r = new n("INTERNAL_COMPUTATION", 3, "internal_computation");

        static {
            n[] nVarArrN = n();
            f11478o = nVarArrN;
            f11477Z = EnumEntriesKt.enumEntries(nVarArrN);
        }

        private static final /* synthetic */ n[] n() {
            return new n[]{f11480t, f11476O, J2, f11479r};
        }

        public static n valueOf(String str) {
            return (n) Enum.valueOf(n.class, str);
        }

        public static n[] values() {
            return (n[]) f11478o.clone();
        }

        public final String rl() {
            return this.f11481n;
        }

        private n(String str, int i2, String str2) {
            this.f11481n = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class w6 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f11483o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ w6[] f11484r;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f11486n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final w6 f11485t = new w6("NOTICE", 0, "NOTICE");

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final w6 f11482O = new w6("WARNING", 1, "WARNING");
        public static final w6 J2 = new w6("CRITICAL", 2, "CRITICAL");

        static {
            w6[] w6VarArrN = n();
            f11484r = w6VarArrN;
            f11483o = EnumEntriesKt.enumEntries(w6VarArrN);
        }

        private static final /* synthetic */ w6[] n() {
            return new w6[]{f11485t, f11482O, J2};
        }

        public static w6 valueOf(String str) {
            return (w6) Enum.valueOf(w6.class, str);
        }

        public static w6[] values() {
            return (w6[]) f11484r.clone();
        }

        public final String rl() {
            return this.f11486n;
        }

        private w6(String str, int i2, String str2) {
            this.f11486n = str2;
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
        return this.f11465n == jVar.f11465n && this.rl == jVar.rl && this.f11466t == jVar.f11466t && Intrinsics.areEqual(this.nr, jVar.nr) && Intrinsics.areEqual(this.f11464O, jVar.f11464O);
    }

    public j(w6 severity, EnumC0415j category, n domain, String str, Throwable throwable) {
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(domain, "domain");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f11465n = severity;
        this.rl = category;
        this.f11466t = domain;
        this.nr = str;
        this.f11464O = throwable;
    }

    public int hashCode() {
        int iHashCode = ((((this.f11465n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f11466t.hashCode()) * 31;
        String str = this.nr;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f11464O.hashCode();
    }

    public final Ml n() {
        Ml ml = new Ml();
        ml.O("severity", this.f11465n.rl());
        ml.O("category", this.rl.rl());
        ml.O("domain", this.f11466t.rl());
        ml.O("throwableStacktrace", ExceptionsKt.stackTraceToString(this.f11464O));
        String str = this.nr;
        if (str != null) {
            ml.O("errorMessage", str);
        }
        return ml;
    }

    public String toString() {
        return "PicoError(severity=" + this.f11465n + ", category=" + this.rl + wDgKoYAES.dKmxHETKGQsxaa + this.f11466t + ", message=" + this.nr + ", throwable=" + this.f11464O + ")";
    }
}
