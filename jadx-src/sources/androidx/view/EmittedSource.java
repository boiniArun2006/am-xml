package androidx.view;

import GJW.C;
import GJW.Dsr;
import GJW.Lu;
import GJW.O;
import GJW.OU;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\nR\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/lifecycle/EmittedSource;", "LGJW/O;", "Landroidx/lifecycle/LiveData;", "source", "Landroidx/lifecycle/MediatorLiveData;", "mediator", "<init>", "(Landroidx/lifecycle/LiveData;Landroidx/lifecycle/MediatorLiveData;)V", "", "O", "()V", "nr", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", c.f62177j, "Landroidx/lifecycle/LiveData;", "t", "Landroidx/lifecycle/MediatorLiveData;", "", "Z", "disposed", "lifecycle-livedata_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EmittedSource implements O {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private boolean disposed;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final LiveData source;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final MediatorLiveData mediator;

    public EmittedSource(LiveData source, MediatorLiveData mediator) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(mediator, "mediator");
        this.source = source;
        this.mediator = mediator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O() {
        if (this.disposed) {
            return;
        }
        this.mediator.r(this.source);
        this.disposed = true;
    }

    @Override // GJW.O
    public void n() {
        C.nr(Lu.n(OU.t().p0N()), null, null, new EmittedSource$dispose$1(this, null), 3, null);
    }

    public final Object nr(Continuation continuation) {
        Object objUo = Dsr.Uo(OU.t().p0N(), new EmittedSource$disposeNow$2(this, null), continuation);
        if (objUo == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objUo;
        }
        return Unit.INSTANCE;
    }
}
