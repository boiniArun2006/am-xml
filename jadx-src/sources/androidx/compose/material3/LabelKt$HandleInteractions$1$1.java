package androidx.compose.material3;

import GJW.vd;
import TFv.Wre;
import TFv.fuX;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import com.vungle.ads.internal.protos.Sdk;
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
@DebugMetadata(c = "androidx.compose.material3.LabelKt$HandleInteractions$1$1", f = "Label.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
final class LabelKt$HandleInteractions$1$1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ TooltipState f26081O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f26082n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ MutableInteractionSource f26083t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LabelKt$HandleInteractions$1$1(MutableInteractionSource mutableInteractionSource, TooltipState tooltipState, Continuation continuation) {
        super(2, continuation);
        this.f26083t = mutableInteractionSource;
        this.f26081O = tooltipState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LabelKt$HandleInteractions$1$1(this.f26083t, this.f26081O, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((LabelKt$HandleInteractions$1$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: androidx.compose.material3.LabelKt$HandleInteractions$1$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "interaction", "Landroidx/compose/foundation/interaction/Interaction;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.LabelKt$HandleInteractions$1$1$1", f = "Label.kt", i = {}, l = {Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<Interaction, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ TooltipState f26084O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f26085n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f26086t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TooltipState tooltipState, Continuation continuation) {
            super(2, continuation);
            this.f26084O = tooltipState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f26084O, continuation);
            anonymousClass1.f26086t = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Interaction interaction, Continuation continuation) {
            return ((AnonymousClass1) create(interaction, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z2;
            boolean z3;
            boolean z4;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f26085n;
            boolean z5 = true;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Interaction interaction = (Interaction) this.f26086t;
                if (interaction instanceof PressInteraction.Press) {
                    z2 = true;
                } else {
                    z2 = interaction instanceof DragInteraction.Start;
                }
                if (z2) {
                    z3 = true;
                } else {
                    z3 = interaction instanceof HoverInteraction.Enter;
                }
                if (z3) {
                    TooltipState tooltipState = this.f26084O;
                    MutatePriority mutatePriority = MutatePriority.f16229t;
                    this.f26085n = 1;
                    if (tooltipState.t(mutatePriority, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (interaction instanceof PressInteraction.Release) {
                        z4 = true;
                    } else {
                        z4 = interaction instanceof DragInteraction.Stop;
                    }
                    if (!z4) {
                        z5 = interaction instanceof HoverInteraction.Exit;
                    }
                    if (z5) {
                        this.f26084O.dismiss();
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f26082n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            Wre interactions = this.f26083t.getInteractions();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f26081O, null);
            this.f26082n = 1;
            if (fuX.gh(interactions, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
