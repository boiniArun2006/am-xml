package ey;

import GJW.xuv;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final d2n.Wre f63915n;
    private final xuv rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private LQ.j f63916t;

    public I28(d2n.Wre range, xuv job) {
        Intrinsics.checkNotNullParameter(range, "range");
        Intrinsics.checkNotNullParameter(job, "job");
        this.f63915n = range;
        this.rl = job;
    }

    public final void n(LQ.j result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f63916t = result;
    }

    public final boolean nr() {
        return this.rl.isActive() && this.f63916t == null;
    }

    public final d2n.Wre rl() {
        return this.f63915n;
    }

    public final LQ.j t() {
        if (!nr()) {
            LQ.j jVar = this.f63916t;
            if (jVar != null) {
                return jVar;
            }
            throw new IllegalStateException("Unexpected null result.");
        }
        throw new IllegalStateException("Attempt to read result of decoding request while request is active.");
    }
}
