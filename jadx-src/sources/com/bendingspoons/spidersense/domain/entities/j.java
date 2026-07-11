package com.bendingspoons.spidersense.domain.entities;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class j {
    private final boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final boolean f51569O;
    private final List Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f51570n;
    private final Map nr;
    private final double rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final C0739j f51571t;

    /* JADX INFO: renamed from: com.bendingspoons.spidersense.domain.entities.j$j, reason: collision with other inner class name */
    public static final class C0739j {
        private final String J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final String f51572O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f51573n;
        private final String nr;
        private final long rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final String f51574t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0739j)) {
                return false;
            }
            C0739j c0739j = (C0739j) obj;
            return Intrinsics.areEqual(this.f51573n, c0739j.f51573n) && this.rl == c0739j.rl && Intrinsics.areEqual(this.f51574t, c0739j.f51574t) && Intrinsics.areEqual(this.nr, c0739j.nr) && Intrinsics.areEqual(this.f51572O, c0739j.f51572O) && Intrinsics.areEqual(this.J2, c0739j.J2);
        }

        public int hashCode() {
            return (((((((((this.f51573n.hashCode() * 31) + Long.hashCode(this.rl)) * 31) + this.f51574t.hashCode()) * 31) + this.nr.hashCode()) * 31) + this.f51572O.hashCode()) * 31) + this.J2.hashCode();
        }

        public String toString() {
            return "DeviceInfo(appVersion=" + this.f51573n + ", appBuildNumber=" + this.rl + ", deviceModel=" + this.f51574t + ", osVersion=" + this.nr + ", locale=" + this.f51572O + ", region=" + this.J2 + ")";
        }

        public C0739j(String appVersion, long j2, String deviceModel, String osVersion, String locale, String region) {
            Intrinsics.checkNotNullParameter(appVersion, "appVersion");
            Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
            Intrinsics.checkNotNullParameter(osVersion, "osVersion");
            Intrinsics.checkNotNullParameter(locale, "locale");
            Intrinsics.checkNotNullParameter(region, "region");
            this.f51573n = appVersion;
            this.rl = j2;
            this.f51574t = deviceModel;
            this.nr = osVersion;
            this.f51572O = locale;
            this.J2 = region;
        }

        public final String J2() {
            return this.J2;
        }

        public final String O() {
            return this.nr;
        }

        public final long n() {
            return this.rl;
        }

        public final String nr() {
            return this.f51572O;
        }

        public final String rl() {
            return this.f51573n;
        }

        public final String t() {
            return this.f51574t;
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
        return Intrinsics.areEqual(this.f51570n, jVar.f51570n) && Double.compare(this.rl, jVar.rl) == 0 && Intrinsics.areEqual(this.f51571t, jVar.f51571t) && Intrinsics.areEqual(this.nr, jVar.nr) && this.f51569O == jVar.f51569O && this.J2 == jVar.J2 && Intrinsics.areEqual(this.Uo, jVar.Uo);
    }

    public int hashCode() {
        return (((((((((((this.f51570n.hashCode() * 31) + Double.hashCode(this.rl)) * 31) + this.f51571t.hashCode()) * 31) + this.nr.hashCode()) * 31) + Boolean.hashCode(this.f51569O)) * 31) + Boolean.hashCode(this.J2)) * 31) + this.Uo.hashCode();
    }

    public String toString() {
        return "DebugEventMetadata(id=" + this.f51570n + ", createdAt=" + this.rl + ", deviceInfo=" + this.f51571t + ", additionalInfo=" + this.nr + ", isSpoonerEvent=" + this.f51569O + ", isPremiumUserEvent=" + this.J2 + ", userExperiments=" + this.Uo + ")";
    }

    public j(String id, double d2, C0739j deviceInfo, Map additionalInfo, boolean z2, boolean z3, List userExperiments) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        Intrinsics.checkNotNullParameter(userExperiments, "userExperiments");
        this.f51570n = id;
        this.rl = d2;
        this.f51571t = deviceInfo;
        this.nr = additionalInfo;
        this.f51569O = z2;
        this.J2 = z3;
        this.Uo = userExperiments;
    }

    public final boolean J2() {
        return this.J2;
    }

    public final List O() {
        return this.Uo;
    }

    public final boolean Uo() {
        return this.f51569O;
    }

    public final Map n() {
        return this.nr;
    }

    public final String nr() {
        return this.f51570n;
    }

    public final double rl() {
        return this.rl;
    }

    public final C0739j t() {
        return this.f51571t;
    }
}
