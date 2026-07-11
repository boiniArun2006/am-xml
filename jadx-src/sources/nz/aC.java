package nz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class aC {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f71284n;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Duration f71285t;

    public /* synthetic */ aC(int i2, int i3, Duration duration, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, duration);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aC)) {
            return false;
        }
        aC aCVar = (aC) obj;
        return this.f71284n == aCVar.f71284n && this.rl == aCVar.rl && Intrinsics.areEqual(this.f71285t, aCVar.f71285t);
    }

    private aC(int i2, int i3, Duration duration) {
        this.f71284n = i2;
        this.rl = i3;
        this.f71285t = duration;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.f71284n) * 31) + Integer.hashCode(this.rl)) * 31;
        Duration duration = this.f71285t;
        return iHashCode + (duration == null ? 0 : Duration.m1673hashCodeimpl(duration.getRawValue()));
    }

    public final int n() {
        return this.rl;
    }

    public final Duration rl() {
        return this.f71285t;
    }

    public final int t() {
        return this.f71284n;
    }

    public String toString() {
        return "ProgressStepsConfig(totalSteps=" + this.f71284n + ", currentStep=" + this.rl + ", stepDuration=" + this.f71285t + ")";
    }
}
