package SL;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class j implements dI8.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final EnumC0310j f9723n;
    private final String nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f9724t;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: SL.j$j, reason: collision with other inner class name */
    public static final class EnumC0310j {

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private static final /* synthetic */ EnumC0310j[] f9726S;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f9728g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f9731n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final String f9732t;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final EnumC0310j f9725O = new EnumC0310j("UNSPECIFIED", 0, -1, "unspecified");
        public static final EnumC0310j J2 = new EnumC0310j("FULLSCREEN_AD_ALREADY_SHOWING", 1, -23, "fullscreenAdAlreadyShowing");

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final EnumC0310j f9730r = new EnumC0310j("FULLSCREEN_AD_NOT_READY", 2, -24, "fullscreenAdNotReady");

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final EnumC0310j f9729o = new EnumC0310j("DONT_KEEP_ACTIVITIES_ENABLED", 3, -5602, "dontKeepActivitiesEnabled");

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public static final EnumC0310j f9727Z = new EnumC0310j("UNKNOWN", 4, 0, "unknown");

        public static EnumEntries t() {
            return f9728g;
        }

        static {
            EnumC0310j[] enumC0310jArrN = n();
            f9726S = enumC0310jArrN;
            f9728g = EnumEntriesKt.enumEntries(enumC0310jArrN);
        }

        private static final /* synthetic */ EnumC0310j[] n() {
            return new EnumC0310j[]{f9725O, J2, f9730r, f9729o, f9727Z};
        }

        public static EnumC0310j valueOf(String str) {
            return (EnumC0310j) Enum.valueOf(EnumC0310j.class, str);
        }

        public static EnumC0310j[] values() {
            return (EnumC0310j[]) f9726S.clone();
        }

        public final String nr() {
            return this.f9732t;
        }

        public final int rl() {
            return this.f9731n;
        }

        private EnumC0310j(String str, int i2, int i3, String str2) {
            this.f9731n = i3;
            this.f9732t = str2;
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
        return this.f9723n == jVar.f9723n && Intrinsics.areEqual(this.rl, jVar.rl) && this.f9724t == jVar.f9724t && Intrinsics.areEqual(this.nr, jVar.nr);
    }

    public j(EnumC0310j type, String message, int i2, String mediatedNetworkErrorMessage) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(mediatedNetworkErrorMessage, "mediatedNetworkErrorMessage");
        this.f9723n = type;
        this.rl = message;
        this.f9724t = i2;
        this.nr = mediatedNetworkErrorMessage;
    }

    @Override // dI8.j
    public String getMessage() {
        return this.rl;
    }

    @Override // dI8.j
    public String getTitle() {
        return this.f9723n.nr();
    }

    public int hashCode() {
        return (((((this.f9723n.hashCode() * 31) + this.rl.hashCode()) * 31) + Integer.hashCode(this.f9724t)) * 31) + this.nr.hashCode();
    }

    public final int n() {
        return this.f9724t;
    }

    public final String rl() {
        return this.nr;
    }

    public final EnumC0310j t() {
        return this.f9723n;
    }

    public String toString() {
        return "MaxDisplayError(type=" + this.f9723n + ", message=" + this.rl + ", mediatedNetworkErrorCode=" + this.f9724t + ", mediatedNetworkErrorMessage=" + this.nr + ")";
    }
}
