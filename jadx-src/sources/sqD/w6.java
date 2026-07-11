package sqD;

import ajd.j;
import com.google.android.gms.ads.identifier.Ov.YmsTEL;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CN3 f73322n;
    private final rB.Ml nr;
    private final I28 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Continuation f73323t;

    public w6(CN3 hook, I28 experience, Continuation continuation, rB.Ml ml) {
        Intrinsics.checkNotNullParameter(hook, "hook");
        Intrinsics.checkNotNullParameter(experience, "experience");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        this.f73322n = hook;
        this.rl = experience;
        this.f73323t = continuation;
        this.nr = ml;
    }

    public final I28 n() {
        return this.rl;
    }

    public final CN3 rl() {
        return this.f73322n;
    }

    public final void t(Dsr result) {
        Intrinsics.checkNotNullParameter(result, "result");
        try {
            this.f73323t.resumeWith(Result.m313constructorimpl(result));
        } catch (IllegalStateException e2) {
            rB.Ml ml = this.nr;
            if (ml != null) {
                rB.I28.rl(ml, CollectionsKt.listOf((Object[]) new String[]{YmsTEL.mwSnakrf, FileUploadManager.f61572j, MRAIDPresenter.ERROR}), j.EnumC0481j.J2, "Failed to resume from action onFinish.", null, pq.I28.n(pq.n.O("hook", this.f73322n.getValue()), pq.n.O("experience", this.rl.toString()), pq.n.O("result", result.getValue()), pq.n.O("exception", e2.toString())), 8, null);
            }
        }
    }
}
