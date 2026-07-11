package androidx.compose.foundation;

import GJW.vd;
import GJW.yg;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1$delayJob$1", f = "Clickable.kt", i = {1}, l = {1257, 1260}, m = "invokeSuspend", n = {"press"}, s = {"L$0"})
final class AbstractClickableNode$handlePressInteraction$2$1$delayJob$1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ long J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ AbstractClickableNode f15805O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f15806n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ MutableInteractionSource f15807r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f15808t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbstractClickableNode$handlePressInteraction$2$1$delayJob$1(AbstractClickableNode abstractClickableNode, long j2, MutableInteractionSource mutableInteractionSource, Continuation continuation) {
        super(2, continuation);
        this.f15805O = abstractClickableNode;
        this.J2 = j2;
        this.f15807r = mutableInteractionSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AbstractClickableNode$handlePressInteraction$2$1$delayJob$1(this.f15805O, this.J2, this.f15807r, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((AbstractClickableNode$handlePressInteraction$2$1$delayJob$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PressInteraction.Press press;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f15808t;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    press = (PressInteraction.Press) this.f15806n;
                    ResultKt.throwOnFailure(obj);
                    this.f15805O.pressInteraction = press;
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            if (this.f15805O.eOa()) {
                long jN = Clickable_androidKt.n();
                this.f15808t = 1;
                if (yg.rl(jN, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
        }
        PressInteraction.Press press2 = new PressInteraction.Press(this.J2, null);
        MutableInteractionSource mutableInteractionSource = this.f15807r;
        this.f15806n = press2;
        this.f15808t = 2;
        if (mutableInteractionSource.n(press2, this) != coroutine_suspended) {
            press = press2;
            this.f15805O.pressInteraction = press;
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }
}
