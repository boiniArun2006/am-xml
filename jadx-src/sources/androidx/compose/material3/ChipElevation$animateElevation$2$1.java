package androidx.compose.material3;

import GJW.vd;
import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.ChipElevation$animateElevation$2$1", f = "Chip.kt", i = {}, l = {2241, 2243}, m = "invokeSuspend", n = {}, s = {})
final class ChipElevation$animateElevation$2$1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ float f24775O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f24776n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ MutableState f24777o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ Interaction f24778r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ Animatable f24779t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChipElevation$animateElevation$2$1(Animatable animatable, float f3, boolean z2, Interaction interaction, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.f24779t = animatable;
        this.f24775O = f3;
        this.J2 = z2;
        this.f24778r = interaction;
        this.f24777o = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChipElevation$animateElevation$2$1(this.f24779t, this.f24775O, this.J2, this.f24778r, this.f24777o, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((ChipElevation$animateElevation$2$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        if (r6.XQ(r1, r5) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (androidx.compose.material3.internal.ElevationKt.nr(r1, r3, r6, r4, r5) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f24776n;
        if (i2 != 0) {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            if (!Dp.mUb(((Dp) this.f24779t.qie()).getValue(), this.f24775O)) {
                if (this.J2) {
                    Interaction interactionNr = ChipElevation.nr(this.f24777o);
                    Animatable animatable = this.f24779t;
                    float f3 = this.f24775O;
                    Interaction interaction = this.f24778r;
                    this.f24776n = 2;
                } else {
                    Animatable animatable2 = this.f24779t;
                    Dp dpNr = Dp.nr(this.f24775O);
                    this.f24776n = 1;
                }
            }
            return Unit.INSTANCE;
        }
        ChipElevation.O(this.f24777o, this.f24778r);
        return Unit.INSTANCE;
    }
}
