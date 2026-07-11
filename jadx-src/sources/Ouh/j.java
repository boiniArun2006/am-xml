package Ouh;

import GJW.xuv;
import ILs.r;
import LQ.j;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import uPp.o;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final xuv f7493n;
    private final r rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private o f7494t;

    public j(xuv job, r channel) {
        Intrinsics.checkNotNullParameter(job, "job");
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.f7493n = job;
        this.rl = channel;
    }

    public final void n(o failure) {
        Intrinsics.checkNotNullParameter(failure, "failure");
        this.f7494t = failure;
    }

    public final boolean nr() {
        return this.f7494t == null && this.f7493n.isActive() && !this.rl.gh();
    }

    public final r rl() {
        return this.rl;
    }

    public final LQ.j t() {
        o oVar = this.f7494t;
        return oVar != null ? new j.n(oVar) : new j.w6(Unit.INSTANCE);
    }

    public String toString() {
        return "RendererRequest[isActive=" + nr() + ";channel=" + this.rl + ']';
    }
}
