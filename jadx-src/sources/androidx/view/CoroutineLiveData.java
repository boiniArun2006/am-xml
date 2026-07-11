package androidx.view;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0080@¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0080@¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0014¢\u0006\u0004\b\r\u0010\fR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/lifecycle/CoroutineLiveData;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/lifecycle/MediatorLiveData;", "Landroidx/lifecycle/LiveData;", "source", "LGJW/O;", "Z", "(Landroidx/lifecycle/LiveData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "o", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "qie", "()V", "az", "Landroidx/lifecycle/BlockRunner;", "Landroidx/lifecycle/BlockRunner;", "blockRunner", "Landroidx/lifecycle/EmittedSource;", "ty", "Landroidx/lifecycle/EmittedSource;", "emittedSource", "lifecycle-livedata_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CoroutineLiveData<T> extends MediatorLiveData<T> {

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private BlockRunner blockRunner;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private EmittedSource emittedSource;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Z(LiveData liveData, Continuation continuation) {
        CoroutineLiveData$emitSource$1 coroutineLiveData$emitSource$1;
        if (continuation instanceof CoroutineLiveData$emitSource$1) {
            coroutineLiveData$emitSource$1 = (CoroutineLiveData$emitSource$1) continuation;
            int i2 = coroutineLiveData$emitSource$1.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                coroutineLiveData$emitSource$1.J2 = i2 - Integer.MIN_VALUE;
            } else {
                coroutineLiveData$emitSource$1 = new CoroutineLiveData$emitSource$1(this, continuation);
            }
        }
        Object objN = coroutineLiveData$emitSource$1.f38837t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = coroutineLiveData$emitSource$1.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objN);
            coroutineLiveData$emitSource$1.f38836n = liveData;
            coroutineLiveData$emitSource$1.J2 = 1;
            if (o(coroutineLiveData$emitSource$1) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objN);
            EmittedSource emittedSource = (EmittedSource) objN;
            this.emittedSource = emittedSource;
            return emittedSource;
        }
        liveData = (LiveData) coroutineLiveData$emitSource$1.f38836n;
        ResultKt.throwOnFailure(objN);
        coroutineLiveData$emitSource$1.f38836n = null;
        coroutineLiveData$emitSource$1.J2 = 2;
        objN = CoroutineLiveDataKt.n(this, liveData, coroutineLiveData$emitSource$1);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Continuation continuation) {
        CoroutineLiveData$clearSource$1 coroutineLiveData$clearSource$1;
        if (continuation instanceof CoroutineLiveData$clearSource$1) {
            coroutineLiveData$clearSource$1 = (CoroutineLiveData$clearSource$1) continuation;
            int i2 = coroutineLiveData$clearSource$1.f38832O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                coroutineLiveData$clearSource$1.f38832O = i2 - Integer.MIN_VALUE;
            } else {
                coroutineLiveData$clearSource$1 = new CoroutineLiveData$clearSource$1(this, continuation);
            }
        }
        Object obj = coroutineLiveData$clearSource$1.f38833n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = coroutineLiveData$clearSource$1.f38832O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            EmittedSource emittedSource = this.emittedSource;
            if (emittedSource != null) {
                coroutineLiveData$clearSource$1.f38832O = 1;
                if (emittedSource.nr(coroutineLiveData$clearSource$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.emittedSource = null;
        return Unit.INSTANCE;
    }

    @Override // androidx.view.MediatorLiveData, androidx.view.LiveData
    protected void az() {
        super.az();
        BlockRunner blockRunner = this.blockRunner;
        if (blockRunner != null) {
            blockRunner.Uo();
        }
    }

    @Override // androidx.view.MediatorLiveData, androidx.view.LiveData
    protected void qie() {
        super.qie();
        BlockRunner blockRunner = this.blockRunner;
        if (blockRunner != null) {
            blockRunner.KN();
        }
    }
}
