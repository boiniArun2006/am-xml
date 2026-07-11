package Tv6;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class j implements dI8.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final EnumC0375j f10583n;
    private final String nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f10584t;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: Tv6.j$j, reason: collision with other inner class name */
    public static final class EnumC0375j {

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private static final /* synthetic */ EnumC0375j[] f10586S;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f10588g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f10591n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final String f10592t;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final EnumC0375j f10585O = new EnumC0375j("INTERNAL", 0, 0, "internalError");
        public static final EnumC0375j J2 = new EnumC0375j("INVALID_REQUEST", 1, 1, "invalidRequest");

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final EnumC0375j f10590r = new EnumC0375j("NETWORK", 2, 2, "networkError");

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final EnumC0375j f10589o = new EnumC0375j("NO_FILL", 3, 3, "noFill");

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public static final EnumC0375j f10587Z = new EnumC0375j("UNKNOWN", 4, -1, "unknown");

        public static EnumEntries t() {
            return f10588g;
        }

        static {
            EnumC0375j[] enumC0375jArrN = n();
            f10586S = enumC0375jArrN;
            f10588g = EnumEntriesKt.enumEntries(enumC0375jArrN);
        }

        private static final /* synthetic */ EnumC0375j[] n() {
            return new EnumC0375j[]{f10585O, J2, f10590r, f10589o, f10587Z};
        }

        public static EnumC0375j valueOf(String str) {
            return (EnumC0375j) Enum.valueOf(EnumC0375j.class, str);
        }

        public static EnumC0375j[] values() {
            return (EnumC0375j[]) f10586S.clone();
        }

        public final String nr() {
            return this.f10592t;
        }

        public final int rl() {
            return this.f10591n;
        }

        private EnumC0375j(String str, int i2, int i3, String str2) {
            this.f10591n = i3;
            this.f10592t = str2;
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
        return this.f10583n == jVar.f10583n && Intrinsics.areEqual(this.rl, jVar.rl) && this.f10584t == jVar.f10584t && Intrinsics.areEqual(this.nr, jVar.nr);
    }

    public j(EnumC0375j type, String message, int i2, String domain) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(domain, "domain");
        this.f10583n = type;
        this.rl = message;
        this.f10584t = i2;
        this.nr = domain;
    }

    @Override // dI8.j
    public String getMessage() {
        return this.rl;
    }

    @Override // dI8.j
    public String getTitle() {
        return this.f10583n.nr();
    }

    public int hashCode() {
        return (((((this.f10583n.hashCode() * 31) + this.rl.hashCode()) * 31) + Integer.hashCode(this.f10584t)) * 31) + this.nr.hashCode();
    }

    public final int n() {
        return this.f10584t;
    }

    public final String rl() {
        return this.nr;
    }

    public final EnumC0375j t() {
        return this.f10583n;
    }

    public String toString() {
        return "AdMobDisplayError(type=" + this.f10583n + ", message=" + this.rl + ", code=" + this.f10584t + ", domain=" + this.nr + ")";
    }
}
