package androidx.compose.foundation.gestures;

import GJW.C;
import GJW.Lu;
import GJW.h;
import GJW.vd;
import GJW.xuv;
import TFv.CN3;
import TFv.Wre;
import androidx.compose.runtime.SnapshotStateKt;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2", f = "AnchoredDraggable.kt", i = {}, l = {1545}, m = "invokeSuspend", n = {}, s = {})
final class AnchoredDraggableKt$restartable$2 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2 J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ Function0 f16489O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f16490n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f16491t;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "latestInputs", "", "rl", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    static final class AnonymousClass1<T> implements CN3 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function2 f16492O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f16493n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ vd f16494t;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2", f = "AnchoredDraggable.kt", i = {}, l = {1552}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
            final /* synthetic */ vd J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Object f16495O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f16496n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Function2 f16497t;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass2(this.f16497t, this.f16495O, this.J2, continuation);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(vd vdVar, Continuation continuation) {
                return ((AnonymousClass2) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Function2 function2, Object obj, vd vdVar, Continuation continuation) {
                super(2, continuation);
                this.f16497t = function2;
                this.f16495O = obj;
                this.J2 = vdVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                return invoke2(vdVar, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f16496n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Function2 function2 = this.f16497t;
                    Object obj2 = this.f16495O;
                    this.f16496n = 1;
                    if (function2.invoke(obj2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                Lu.nr(this.J2, new AnchoredDragFinishedSignal());
                return Unit.INSTANCE;
            }
        }

        AnonymousClass1(Ref.ObjectRef objectRef, vd vdVar, Function2 function2) {
            this.f16493n = objectRef;
            this.f16494t = vdVar;
            this.f16492O = function2;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // TFv.CN3
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object rl(Object obj, Continuation continuation) {
            AnchoredDraggableKt$restartable$2$1$emit$1 anchoredDraggableKt$restartable$2$1$emit$1;
            AnonymousClass1<T> anonymousClass1;
            if (continuation instanceof AnchoredDraggableKt$restartable$2$1$emit$1) {
                anchoredDraggableKt$restartable$2$1$emit$1 = (AnchoredDraggableKt$restartable$2$1$emit$1) continuation;
                int i2 = anchoredDraggableKt$restartable$2$1$emit$1.f16500o;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    anchoredDraggableKt$restartable$2$1$emit$1.f16500o = i2 - Integer.MIN_VALUE;
                } else {
                    anchoredDraggableKt$restartable$2$1$emit$1 = new AnchoredDraggableKt$restartable$2$1$emit$1(this, continuation);
                }
            }
            Object obj2 = anchoredDraggableKt$restartable$2$1$emit$1.J2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = anchoredDraggableKt$restartable$2$1$emit$1.f16500o;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj2);
                xuv xuvVar = (xuv) this.f16493n.element;
                if (xuvVar != null) {
                    xuvVar.cancel((CancellationException) new AnchoredDragFinishedSignal());
                    anchoredDraggableKt$restartable$2$1$emit$1.f16499n = this;
                    anchoredDraggableKt$restartable$2$1$emit$1.f16502t = obj;
                    anchoredDraggableKt$restartable$2$1$emit$1.f16498O = xuvVar;
                    anchoredDraggableKt$restartable$2$1$emit$1.f16500o = 1;
                    if (xuvVar.join(anchoredDraggableKt$restartable$2$1$emit$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                anonymousClass1 = this;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = anchoredDraggableKt$restartable$2$1$emit$1.f16502t;
                anonymousClass1 = (AnonymousClass1) anchoredDraggableKt$restartable$2$1$emit$1.f16499n;
                ResultKt.throwOnFailure(obj2);
            }
            Ref.ObjectRef objectRef = anonymousClass1.f16493n;
            vd vdVar = anonymousClass1.f16494t;
            objectRef.element = (T) C.nr(vdVar, null, h.J2, new AnonymousClass2(anonymousClass1.f16492O, obj, vdVar, null), 1, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnchoredDraggableKt$restartable$2(Function0 function0, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f16489O = function0;
        this.J2 = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AnchoredDraggableKt$restartable$2 anchoredDraggableKt$restartable$2 = new AnchoredDraggableKt$restartable$2(this.f16489O, this.J2, continuation);
        anchoredDraggableKt$restartable$2.f16491t = obj;
        return anchoredDraggableKt$restartable$2;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((AnchoredDraggableKt$restartable$2) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f16490n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            vd vdVar = (vd) this.f16491t;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Wre wreIk = SnapshotStateKt.Ik(this.f16489O);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(objectRef, vdVar, this.J2);
            this.f16490n = 1;
            if (wreIk.n(anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
