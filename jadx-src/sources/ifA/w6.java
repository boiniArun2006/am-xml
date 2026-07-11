package ifA;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.google.android.gms.fido.common.bH.gUxOLwRQBPPLC;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class w6 {
    private final pq.Ml J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Throwable f68141O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f68142n;
    private final String nr;
    private final n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final j f68143t;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    public static final class j {
        private static final /* synthetic */ j[] J2;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f68146r;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f68145n = new j("CRITICAL", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final j f68147t = new j("WARNING", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final j f68144O = new j("NOTICE", 2);

        static {
            j[] jVarArrN = n();
            J2 = jVarArrN;
            f68146r = EnumEntriesKt.enumEntries(jVarArrN);
        }

        private static final /* synthetic */ j[] n() {
            return new j[]{f68145n, f68147t, f68144O};
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) J2.clone();
        }

        private j(String str, int i2) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    public static final class n {
        private static final /* synthetic */ n[] J2;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f68150r;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f68149n = new n("IO", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final n f68151t = new n("NETWORK", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final n f68148O = new n(NativeAdContent.ViewTag.OTHER, 2);

        static {
            n[] nVarArrN = n();
            J2 = nVarArrN;
            f68150r = EnumEntriesKt.enumEntries(nVarArrN);
        }

        private static final /* synthetic */ n[] n() {
            return new n[]{f68149n, f68151t, f68148O};
        }

        public static n valueOf(String str) {
            return (n) Enum.valueOf(n.class, str);
        }

        public static n[] values() {
            return (n[]) J2.clone();
        }

        private n(String str, int i2) {
        }
    }

    public w6(String failingComponent, n nVar, j severity, String description, Throwable th, pq.Ml additionalInfo) {
        Intrinsics.checkNotNullParameter(failingComponent, "failingComponent");
        Intrinsics.checkNotNullParameter(nVar, gUxOLwRQBPPLC.XHHkFkFyBPIb);
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        this.f68142n = failingComponent;
        this.rl = nVar;
        this.f68143t = severity;
        this.nr = description;
        this.f68141O = th;
        this.J2 = additionalInfo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6)) {
            return false;
        }
        w6 w6Var = (w6) obj;
        return Intrinsics.areEqual(this.f68142n, w6Var.f68142n) && this.rl == w6Var.rl && this.f68143t == w6Var.f68143t && Intrinsics.areEqual(this.nr, w6Var.nr) && Intrinsics.areEqual(this.f68141O, w6Var.f68141O) && Intrinsics.areEqual(this.J2, w6Var.J2);
    }

    public static /* synthetic */ w6 rl(w6 w6Var, String str, n nVar, j jVar, String str2, Throwable th, pq.Ml ml, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = w6Var.f68142n;
        }
        if ((i2 & 2) != 0) {
            nVar = w6Var.rl;
        }
        if ((i2 & 4) != 0) {
            jVar = w6Var.f68143t;
        }
        if ((i2 & 8) != 0) {
            str2 = w6Var.nr;
        }
        if ((i2 & 16) != 0) {
            th = w6Var.f68141O;
        }
        if ((i2 & 32) != 0) {
            ml = w6Var.J2;
        }
        Throwable th2 = th;
        pq.Ml ml2 = ml;
        return w6Var.n(str, nVar, jVar, str2, th2, ml2);
    }

    public final j J2() {
        return this.f68143t;
    }

    public final n KN() {
        return this.rl;
    }

    public final String O() {
        return this.f68142n;
    }

    public final Throwable Uo() {
        return this.f68141O;
    }

    public int hashCode() {
        int iHashCode = ((((((this.f68142n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f68143t.hashCode()) * 31) + this.nr.hashCode()) * 31;
        Throwable th = this.f68141O;
        return ((iHashCode + (th == null ? 0 : th.hashCode())) * 31) + this.J2.hashCode();
    }

    public final w6 n(String failingComponent, n type, j severity, String description, Throwable th, pq.Ml additionalInfo) {
        Intrinsics.checkNotNullParameter(failingComponent, "failingComponent");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        return new w6(failingComponent, type, severity, description, th, additionalInfo);
    }

    public final String nr() {
        return this.nr;
    }

    public final pq.Ml t() {
        return this.J2;
    }

    public String toString() {
        return "SpiderSenseError(failingComponent=" + this.f68142n + ", type=" + this.rl + ", severity=" + this.f68143t + ", description=" + this.nr + ", throwable=" + this.f68141O + ", additionalInfo=" + this.J2 + ")";
    }

    public /* synthetic */ w6(String str, n nVar, j jVar, String str2, Throwable th, pq.Ml ml, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, nVar, jVar, str2, th, (i2 & 32) != 0 ? new pq.Ml() : ml);
    }
}
