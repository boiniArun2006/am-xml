package androidx.view;

import GJW.C;
import GJW.OU;
import GJW.vd;
import GJW.xuv;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0005R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tRE\u0010\u0012\u001a3\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\r\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000bj\b\u0012\u0004\u0012\u00028\u0000`\u000e¢\u0006\u0002\b\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010!¨\u0006$"}, d2 = {"Landroidx/lifecycle/BlockRunner;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "", "KN", "()V", "Uo", "Landroidx/lifecycle/CoroutineLiveData;", c.f62177j, "Landroidx/lifecycle/CoroutineLiveData;", "liveData", "Lkotlin/Function2;", "Landroidx/lifecycle/LiveDataScope;", "Lkotlin/coroutines/Continuation;", "Landroidx/lifecycle/Block;", "Lkotlin/ExtensionFunctionType;", "rl", "Lkotlin/jvm/functions/Function2;", "block", "", "t", "J", "timeoutInMs", "LGJW/vd;", "nr", "LGJW/vd;", "scope", "Lkotlin/Function0;", "O", "Lkotlin/jvm/functions/Function0;", "onDone", "LGJW/xuv;", "J2", "LGJW/xuv;", "runningJob", "cancellationJob", "lifecycle-livedata_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BlockRunner<T> {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private xuv runningJob;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final Function0 onDone;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private xuv cancellationJob;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final CoroutineLiveData liveData;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final vd scope;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Function2 block;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final long timeoutInMs;

    public final void KN() {
        xuv xuvVar = this.cancellationJob;
        if (xuvVar != null) {
            xuv.j.rl(xuvVar, null, 1, null);
        }
        this.cancellationJob = null;
        if (this.runningJob != null) {
            return;
        }
        this.runningJob = C.nr(this.scope, null, null, new BlockRunner$maybeRun$1(this, null), 3, null);
    }

    public final void Uo() {
        if (this.cancellationJob != null) {
            throw new IllegalStateException("Cancel call cannot happen without a maybeRun");
        }
        this.cancellationJob = C.nr(this.scope, OU.t().p0N(), null, new BlockRunner$cancel$1(this, null), 2, null);
    }
}
