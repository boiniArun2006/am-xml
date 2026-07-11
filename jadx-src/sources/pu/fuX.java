package pu;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class fuX {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Long f72089O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Boolean f72090n;
    private final Integer nr;
    private final Double rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Integer f72091t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fuX)) {
            return false;
        }
        fuX fux = (fuX) obj;
        return Intrinsics.areEqual(this.f72090n, fux.f72090n) && Intrinsics.areEqual((Object) this.rl, (Object) fux.rl) && Intrinsics.areEqual(this.f72091t, fux.f72091t) && Intrinsics.areEqual(this.nr, fux.nr) && Intrinsics.areEqual(this.f72089O, fux.f72089O);
    }

    public final Double O() {
        return this.rl;
    }

    public int hashCode() {
        Boolean bool = this.f72090n;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d2 = this.rl;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num = this.f72091t;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.nr;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l2 = this.f72089O;
        return iHashCode4 + (l2 != null ? l2.hashCode() : 0);
    }

    public final Integer n() {
        return this.nr;
    }

    public final Integer nr() {
        return this.f72091t;
    }

    public final Long rl() {
        return this.f72089O;
    }

    public final Boolean t() {
        return this.f72090n;
    }

    public String toString() {
        return "SessionConfigs(sessionEnabled=" + this.f72090n + ", sessionSamplingRate=" + this.rl + ", sessionRestartTimeout=" + this.f72091t + ", cacheDuration=" + this.nr + ", cacheUpdatedTime=" + this.f72089O + ')';
    }

    public fuX(Boolean bool, Double d2, Integer num, Integer num2, Long l2) {
        this.f72090n = bool;
        this.rl = d2;
        this.f72091t = num;
        this.nr = num2;
        this.f72089O = l2;
    }
}
