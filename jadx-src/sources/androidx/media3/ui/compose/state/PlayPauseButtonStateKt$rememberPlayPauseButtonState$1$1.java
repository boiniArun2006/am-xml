package androidx.media3.ui.compose.state;

import GJW.vd;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "androidx.media3.ui.compose.state.PlayPauseButtonStateKt$rememberPlayPauseButtonState$1$1", f = "PlayPauseButtonState.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
final class PlayPauseButtonStateKt$rememberPlayPauseButtonState$1$1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ PlayPauseButtonState $playPauseButtonState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlayPauseButtonStateKt$rememberPlayPauseButtonState$1$1(PlayPauseButtonState playPauseButtonState, Continuation<? super PlayPauseButtonStateKt$rememberPlayPauseButtonState$1$1> continuation) {
        super(2, continuation);
        this.$playPauseButtonState = playPauseButtonState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlayPauseButtonStateKt$rememberPlayPauseButtonState$1$1(this.$playPauseButtonState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return ((PlayPauseButtonStateKt$rememberPlayPauseButtonState$1$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            PlayPauseButtonState playPauseButtonState = this.$playPauseButtonState;
            this.label = 1;
            if (playPauseButtonState.observe(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        throw new KotlinNothingValueException();
    }
}
