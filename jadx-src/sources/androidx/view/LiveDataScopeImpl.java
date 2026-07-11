package androidx.view;

import GJW.Dsr;
import GJW.OU;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0097@¢\u0006\u0004\b\u000b\u0010\fR(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/lifecycle/LiveDataScopeImpl;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/lifecycle/LiveDataScope;", "Landroidx/lifecycle/CoroutineLiveData;", "target", "Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "(Landroidx/lifecycle/CoroutineLiveData;Lkotlin/coroutines/CoroutineContext;)V", "value", "", "rl", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", c.f62177j, "Landroidx/lifecycle/CoroutineLiveData;", "()Landroidx/lifecycle/CoroutineLiveData;", "setTarget$lifecycle_livedata_release", "(Landroidx/lifecycle/CoroutineLiveData;)V", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "lifecycle-livedata_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LiveDataScopeImpl<T> implements LiveDataScope<T> {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private CoroutineLiveData target;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final CoroutineContext coroutineContext;

    public LiveDataScopeImpl(CoroutineLiveData target, CoroutineContext context) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(context, "context");
        this.target = target;
        this.coroutineContext = context.plus(OU.t().p0N());
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final CoroutineLiveData getTarget() {
        return this.target;
    }

    @Override // androidx.view.LiveDataScope
    public Object rl(Object obj, Continuation continuation) {
        Object objUo = Dsr.Uo(this.coroutineContext, new LiveDataScopeImpl$emit$2(this, obj, null), continuation);
        return objUo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUo : Unit.INSTANCE;
    }
}
