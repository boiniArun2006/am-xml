package androidx.view;

import GJW.vd;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "Landroidx/lifecycle/EmittedSource;", "<anonymous>", "(LGJW/vd;)Landroidx/lifecycle/EmittedSource;"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2", f = "CoroutineLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class CoroutineLiveDataKt$addDisposableSource$2 extends SuspendLambda implements Function2<vd, Continuation<? super EmittedSource>, Object> {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ LiveData f38838O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f38839n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ MediatorLiveData f38840t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoroutineLiveDataKt$addDisposableSource$2(MediatorLiveData mediatorLiveData, LiveData liveData, Continuation continuation) {
        super(2, continuation);
        this.f38840t = mediatorLiveData;
        this.f38838O = liveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CoroutineLiveDataKt$addDisposableSource$2(this.f38840t, this.f38838O, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((CoroutineLiveDataKt$addDisposableSource$2) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super EmittedSource> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(MediatorLiveData mediatorLiveData, Object obj) {
        mediatorLiveData.ck(obj);
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f38839n == 0) {
            ResultKt.throwOnFailure(obj);
            final MediatorLiveData mediatorLiveData = this.f38840t;
            mediatorLiveData.Ik(this.f38838O, new CoroutineLiveDataKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: androidx.lifecycle.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return CoroutineLiveDataKt$addDisposableSource$2.O(mediatorLiveData, obj2);
                }
            }));
            return new EmittedSource(this.f38838O, this.f38840t);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
