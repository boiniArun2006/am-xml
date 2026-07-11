package androidx.compose.material;

import GJW.vd;
import TFv.Wre;
import TFv.fuX;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.material.SwitchKt$Switch$1$1", f = "Switch.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
final class SwitchKt$Switch$1$1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ State J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ State f23300O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f23301n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ MutableState f23302r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ AnchoredDraggableState f23303t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwitchKt$Switch$1$1(AnchoredDraggableState anchoredDraggableState, State state, State state2, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.f23303t = anchoredDraggableState;
        this.f23300O = state;
        this.J2 = state2;
        this.f23302r = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SwitchKt$Switch$1$1(this.f23303t, this.f23300O, this.J2, this.f23302r, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((SwitchKt$Switch$1$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: androidx.compose.material.SwitchKt$Switch$1$1$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "newValue", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.SwitchKt$Switch$1$1$2", f = "Switch.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        final /* synthetic */ State J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ State f23305O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f23306n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ MutableState f23307r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ boolean f23308t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(State state, State state2, MutableState mutableState, Continuation continuation) {
            super(2, continuation);
            this.f23305O = state;
            this.J2 = state2;
            this.f23307r = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f23305O, this.J2, this.f23307r, continuation);
            anonymousClass2.f23308t = ((Boolean) obj).booleanValue();
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return n(bool.booleanValue(), continuation);
        }

        public final Object n(boolean z2, Continuation continuation) {
            return ((AnonymousClass2) create(Boolean.valueOf(z2), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f23306n == 0) {
                ResultKt.throwOnFailure(obj);
                boolean z2 = this.f23308t;
                if (SwitchKt.O(this.f23305O) != z2) {
                    Function1 function1Nr = SwitchKt.nr(this.J2);
                    if (function1Nr != null) {
                        function1Nr.invoke(Boxing.boxBoolean(z2));
                    }
                    SwitchKt.t(this.f23307r, !SwitchKt.rl(r2));
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f23301n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            final AnchoredDraggableState anchoredDraggableState = this.f23303t;
            Wre wreIk = SnapshotStateKt.Ik(new Function0<Boolean>() { // from class: androidx.compose.material.SwitchKt$Switch$1$1.1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    return (Boolean) anchoredDraggableState.o();
                }
            });
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f23300O, this.J2, this.f23302r, null);
            this.f23301n = 1;
            if (fuX.gh(wreIk, anonymousClass2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
