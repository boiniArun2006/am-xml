package androidx.compose.material3.internal;

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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2", f = "AnchoredDraggable.kt", i = {}, l = {715}, m = "invokeSuspend", n = {}, s = {})
final class AnchoredDraggableKt$restartable$2 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2 J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ Function0 f29020O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f29021n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f29022t;

    /* JADX INFO: renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "latestInputs", "", "rl", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1<T> implements CN3 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function2 f29023O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f29024n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ vd f29025t;

        /* JADX INFO: renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$2", f = "AnchoredDraggable.kt", i = {}, l = {722}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
            final /* synthetic */ vd J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Object f29026O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f29027n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Function2 f29028t;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass2(this.f29028t, this.f29026O, this.J2, continuation);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(vd vdVar, Continuation continuation) {
                return ((AnonymousClass2) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Function2 function2, Object obj, vd vdVar, Continuation continuation) {
                super(2, continuation);
                this.f29028t = function2;
                this.f29026O = obj;
                this.J2 = vdVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                return invoke2(vdVar, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f29027n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Function2 function2 = this.f29028t;
                    Object obj2 = this.f29026O;
                    this.f29027n = 1;
                    if (function2.invoke(obj2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                Lu.nr(this.J2, new AnchoredDragFinishedSignal());
                return Unit.INSTANCE;
            }
        }

        AnonymousClass1(Ref.ObjectRef objectRef, vd vdVar, Function2 function2) {
            this.f29024n = objectRef;
            this.f29025t = vdVar;
            this.f29023O = function2;
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
                int i2 = anchoredDraggableKt$restartable$2$1$emit$1.f29031o;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    anchoredDraggableKt$restartable$2$1$emit$1.f29031o = i2 - Integer.MIN_VALUE;
                } else {
                    anchoredDraggableKt$restartable$2$1$emit$1 = new AnchoredDraggableKt$restartable$2$1$emit$1(this, continuation);
                }
            }
            Object obj2 = anchoredDraggableKt$restartable$2$1$emit$1.J2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = anchoredDraggableKt$restartable$2$1$emit$1.f29031o;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj2);
                xuv xuvVar = (xuv) this.f29024n.element;
                if (xuvVar != null) {
                    xuvVar.cancel((CancellationException) new AnchoredDragFinishedSignal());
                    anchoredDraggableKt$restartable$2$1$emit$1.f29030n = this;
                    anchoredDraggableKt$restartable$2$1$emit$1.f29033t = obj;
                    anchoredDraggableKt$restartable$2$1$emit$1.f29029O = xuvVar;
                    anchoredDraggableKt$restartable$2$1$emit$1.f29031o = 1;
                    if (xuvVar.join(anchoredDraggableKt$restartable$2$1$emit$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                anonymousClass1 = this;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = anchoredDraggableKt$restartable$2$1$emit$1.f29033t;
                anonymousClass1 = (AnonymousClass1) anchoredDraggableKt$restartable$2$1$emit$1.f29030n;
                ResultKt.throwOnFailure(obj2);
            }
            Ref.ObjectRef objectRef = anonymousClass1.f29024n;
            vd vdVar = anonymousClass1.f29025t;
            objectRef.element = (T) C.nr(vdVar, null, h.J2, new AnonymousClass2(anonymousClass1.f29023O, obj, vdVar, null), 1, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnchoredDraggableKt$restartable$2(Function0 function0, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f29020O = function0;
        this.J2 = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AnchoredDraggableKt$restartable$2 anchoredDraggableKt$restartable$2 = new AnchoredDraggableKt$restartable$2(this.f29020O, this.J2, continuation);
        anchoredDraggableKt$restartable$2.f29022t = obj;
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
        int i2 = this.f29021n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            vd vdVar = (vd) this.f29022t;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Wre wreIk = SnapshotStateKt.Ik(this.f29020O);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(objectRef, vdVar, this.J2);
            this.f29021n = 1;
            if (wreIk.n(anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
