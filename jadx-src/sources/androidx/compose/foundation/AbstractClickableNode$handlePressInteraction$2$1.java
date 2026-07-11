package androidx.compose.foundation;

import GJW.AbstractC1363t;
import GJW.C;
import GJW.vd;
import GJW.xuv;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.Interaction;
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
@DebugMetadata(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1", f = "Clickable.kt", i = {0, 1, 2}, l = {1263, 1265, 1272, 1273, 1283}, m = "invokeSuspend", n = {"delayJob", "success", "release"}, s = {"L$0", "Z$0", "L$0"})
final class AbstractClickableNode$handlePressInteraction$2$1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ PressGestureScope J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private /* synthetic */ Object f15799O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ AbstractClickableNode f15800Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f15801n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ MutableInteractionSource f15802o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ long f15803r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f15804t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbstractClickableNode$handlePressInteraction$2$1(PressGestureScope pressGestureScope, long j2, MutableInteractionSource mutableInteractionSource, AbstractClickableNode abstractClickableNode, Continuation continuation) {
        super(2, continuation);
        this.J2 = pressGestureScope;
        this.f15803r = j2;
        this.f15802o = mutableInteractionSource;
        this.f15800Z = abstractClickableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AbstractClickableNode$handlePressInteraction$2$1 abstractClickableNode$handlePressInteraction$2$1 = new AbstractClickableNode$handlePressInteraction$2$1(this.J2, this.f15803r, this.f15802o, this.f15800Z, continuation);
        abstractClickableNode$handlePressInteraction$2$1.f15799O = obj;
        return abstractClickableNode$handlePressInteraction$2$1;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((AbstractClickableNode$handlePressInteraction$2$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ab, code lost:
    
        if (r3.n(r2, r16) != r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cd, code lost:
    
        if (r4.n(r5, r16) == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        xuv xuvVarNr;
        Object objKSg;
        boolean z2;
        PressInteraction.Release release;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f15804t;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            xuvVarNr = C.nr((vd) this.f15799O, null, null, new AbstractClickableNode$handlePressInteraction$2$1$delayJob$1(this.f15800Z, this.f15803r, this.f15802o, null), 3, null);
            PressGestureScope pressGestureScope = this.J2;
            this.f15799O = xuvVarNr;
            this.f15804t = 1;
            objKSg = pressGestureScope.kSg(this);
            if (objKSg != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            xuvVarNr = (xuv) this.f15799O;
            ResultKt.throwOnFailure(obj);
            objKSg = obj;
        } else {
            if (i2 == 2) {
                z2 = this.f15801n;
                ResultKt.throwOnFailure(obj);
                if (z2) {
                    PressInteraction.Press press = new PressInteraction.Press(this.f15803r, null);
                    PressInteraction.Release release2 = new PressInteraction.Release(press);
                    MutableInteractionSource mutableInteractionSource = this.f15802o;
                    this.f15799O = release2;
                    this.f15804t = 3;
                    if (mutableInteractionSource.n(press, this) != coroutine_suspended) {
                        release = release2;
                        MutableInteractionSource mutableInteractionSource2 = this.f15802o;
                        this.f15799O = null;
                        this.f15804t = 4;
                    }
                    return coroutine_suspended;
                }
                this.f15800Z.pressInteraction = null;
                return Unit.INSTANCE;
            }
            if (i2 != 3) {
                if (i2 != 4 && i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.f15800Z.pressInteraction = null;
                return Unit.INSTANCE;
            }
            release = (PressInteraction.Release) this.f15799O;
            ResultKt.throwOnFailure(obj);
            MutableInteractionSource mutableInteractionSource22 = this.f15802o;
            this.f15799O = null;
            this.f15804t = 4;
        }
        boolean zBooleanValue = ((Boolean) objKSg).booleanValue();
        if (!xuvVarNr.isActive()) {
            PressInteraction.Press press2 = this.f15800Z.pressInteraction;
            if (press2 != null) {
                MutableInteractionSource mutableInteractionSource3 = this.f15802o;
                Interaction release3 = zBooleanValue ? new PressInteraction.Release(press2) : new PressInteraction.Cancel(press2);
                this.f15799O = null;
                this.f15804t = 5;
            }
            this.f15800Z.pressInteraction = null;
            return Unit.INSTANCE;
        }
        this.f15799O = null;
        this.f15801n = zBooleanValue;
        this.f15804t = 2;
        if (AbstractC1363t.Uo(xuvVarNr, this) != coroutine_suspended) {
            z2 = zBooleanValue;
            if (z2) {
            }
            this.f15800Z.pressInteraction = null;
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }
}
