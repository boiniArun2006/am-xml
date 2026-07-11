package Gw;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pq.Ml;

/* JADX INFO: renamed from: Gw.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class C1369j {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final C0129j f3786O = new C0129j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f3787n;
    private final Double nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Boolean f3788t;

    /* JADX INFO: renamed from: Gw.j$j, reason: collision with other inner class name */
    public static final class C0129j {
        public /* synthetic */ C0129j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0129j() {
        }

        public final C1369j n(String sessionStartEventId, double d2) {
            Intrinsics.checkNotNullParameter(sessionStartEventId, "sessionStartEventId");
            return new C1369j("session_end", sessionStartEventId, Boolean.TRUE, Double.valueOf(d2));
        }

        public final C1369j rl(String sessionStartEventId, double d2) {
            Intrinsics.checkNotNullParameter(sessionStartEventId, "sessionStartEventId");
            return new C1369j("session_end", sessionStartEventId, Boolean.FALSE, Double.valueOf(d2));
        }

        public final C1369j t() {
            return new C1369j("session_start", null, null, null, 14, null);
        }
    }

    public C1369j(String sessionSubtype, String str, Boolean bool, Double d2) {
        Intrinsics.checkNotNullParameter(sessionSubtype, "sessionSubtype");
        this.f3787n = sessionSubtype;
        this.rl = str;
        this.f3788t = bool;
        this.nr = d2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1369j)) {
            return false;
        }
        C1369j c1369j = (C1369j) obj;
        return Intrinsics.areEqual(this.f3787n, c1369j.f3787n) && Intrinsics.areEqual(this.rl, c1369j.rl) && Intrinsics.areEqual(this.f3788t, c1369j.f3788t) && Intrinsics.areEqual((Object) this.nr, (Object) c1369j.nr);
    }

    public int hashCode() {
        int iHashCode = this.f3787n.hashCode() * 31;
        String str = this.rl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f3788t;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Double d2 = this.nr;
        return iHashCode3 + (d2 != null ? d2.hashCode() : 0);
    }

    public final Ml n() {
        Ml ml = new Ml();
        ml.O("subtype", this.f3787n);
        String str = this.rl;
        if (str != null) {
            ml.O("session_start_id", str);
        }
        Boolean bool = this.f3788t;
        if (bool != null) {
            ml.KN("crashed", bool.booleanValue());
        }
        Double d2 = this.nr;
        if (d2 != null) {
            ml.nr("duration", Double.valueOf(d2.doubleValue()));
        }
        return ml;
    }

    public String toString() {
        return "PicoSessionData(sessionSubtype=" + this.f3787n + ", sessionStartEventId=" + this.rl + ", crashed=" + this.f3788t + ", durationInSeconds=" + this.nr + ")";
    }

    public /* synthetic */ C1369j(String str, String str2, Boolean bool, Double d2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : bool, (i2 & 8) != 0 ? null : d2);
    }
}
