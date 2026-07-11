package androidx.compose.foundation;

import GJW.vd;
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
@DebugMetadata(c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$2", f = "Clickable.kt", i = {}, l = {1202}, m = "invokeSuspend", n = {}, s = {})
final class AbstractClickableNode$onKeyEvent$2 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ PressInteraction.Press f15815O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f15816n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ AbstractClickableNode f15817t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbstractClickableNode$onKeyEvent$2(AbstractClickableNode abstractClickableNode, PressInteraction.Press press, Continuation continuation) {
        super(2, continuation);
        this.f15817t = abstractClickableNode;
        this.f15815O = press;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AbstractClickableNode$onKeyEvent$2(this.f15817t, this.f15815O, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((AbstractClickableNode$onKeyEvent$2) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f15816n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            MutableInteractionSource mutableInteractionSource = this.f15817t.interactionSource;
            if (mutableInteractionSource != null) {
                PressInteraction.Release release = new PressInteraction.Release(this.f15815O);
                this.f15816n = 1;
                if (mutableInteractionSource.n(release, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
