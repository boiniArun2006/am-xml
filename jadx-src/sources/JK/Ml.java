package JK;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f4446n;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f4447t;

    public Ml(String projectId, String featureId, long j2) {
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        Intrinsics.checkNotNullParameter(featureId, "featureId");
        this.f4446n = projectId;
        this.rl = featureId;
        this.f4447t = j2;
    }

    public final long n() {
        return this.f4447t;
    }

    public final String rl() {
        return this.rl;
    }

    public final String t() {
        return this.f4446n;
    }
}
