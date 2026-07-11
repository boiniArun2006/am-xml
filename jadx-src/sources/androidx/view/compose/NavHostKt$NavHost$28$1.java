package androidx.view.compose;

import GJW.vd;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.State;
import androidx.view.NavBackStackEntry;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.navigation.compose.NavHostKt$NavHost$28$1", f = "NavHost.kt", i = {}, l = {621}, m = "invokeSuspend", n = {}, s = {})
final class NavHostKt$NavHost$28$1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableFloatState J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ State f40319O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f40320n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ SeekableTransitionState f40321t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavHostKt$NavHost$28$1(SeekableTransitionState seekableTransitionState, State state, MutableFloatState mutableFloatState, Continuation continuation) {
        super(2, continuation);
        this.f40321t = seekableTransitionState;
        this.f40319O = state;
        this.J2 = mutableFloatState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NavHostKt$NavHost$28$1(this.f40321t, this.f40319O, this.J2, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((NavHostKt$NavHost$28$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f40320n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) NavHostKt.az(this.f40319O).get(NavHostKt.az(this.f40319O).size() - 2);
            SeekableTransitionState seekableTransitionState = this.f40321t;
            float fTy = NavHostKt.ty(this.J2);
            this.f40320n = 1;
            if (seekableTransitionState.Xw(fTy, navBackStackEntry, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
