package androidx.compose.material;

import GJW.vd;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
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
@DebugMetadata(c = "androidx.compose.material.RangeSliderLogic$captureThumb$1", f = "Slider.kt", i = {}, l = {1170}, m = "invokeSuspend", n = {}, s = {})
final class RangeSliderLogic$captureThumb$1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ Interaction J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ boolean f22593O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f22594n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ RangeSliderLogic f22595t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RangeSliderLogic$captureThumb$1(RangeSliderLogic rangeSliderLogic, boolean z2, Interaction interaction, Continuation continuation) {
        super(2, continuation);
        this.f22595t = rangeSliderLogic;
        this.f22593O = z2;
        this.J2 = interaction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RangeSliderLogic$captureThumb$1(this.f22595t, this.f22593O, this.J2, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((RangeSliderLogic$captureThumb$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f22594n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            MutableInteractionSource mutableInteractionSourceN = this.f22595t.n(this.f22593O);
            Interaction interaction = this.J2;
            this.f22594n = 1;
            if (mutableInteractionSourceN.n(interaction, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
