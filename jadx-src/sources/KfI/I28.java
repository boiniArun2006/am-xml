package KfI;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Ml f5645n;
    private final Ml rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final double f5646t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I28)) {
            return false;
        }
        I28 i28 = (I28) obj;
        return this.f5645n == i28.f5645n && this.rl == i28.rl && Double.compare(this.f5646t, i28.f5646t) == 0;
    }

    public I28(Ml performance, Ml crashlytics, double d2) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        Intrinsics.checkNotNullParameter(crashlytics, "crashlytics");
        this.f5645n = performance;
        this.rl = crashlytics;
        this.f5646t = d2;
    }

    public int hashCode() {
        return (((this.f5645n.hashCode() * 31) + this.rl.hashCode()) * 31) + Double.hashCode(this.f5646t);
    }

    public final Ml n() {
        return this.rl;
    }

    public final Ml rl() {
        return this.f5645n;
    }

    public final double t() {
        return this.f5646t;
    }

    public String toString() {
        return "DataCollectionStatus(performance=" + this.f5645n + ", crashlytics=" + this.rl + ", sessionSamplingRate=" + this.f5646t + ')';
    }
}
