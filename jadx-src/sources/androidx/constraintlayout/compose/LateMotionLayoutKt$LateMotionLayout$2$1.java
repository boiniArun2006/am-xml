package androidx.constraintlayout.compose;

import GJW.vd;
import ILs.C;
import ILs.CN3;
import ILs.Dsr;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.node.Ref;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.constraintlayout.compose.LateMotionLayoutKt$LateMotionLayout$2$1", f = "LateMotionLayout.kt", i = {}, l = {87, 100}, m = "invokeSuspend", n = {}, s = {})
final class LateMotionLayoutKt$LateMotionLayout$2$1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0 E2;
    final /* synthetic */ MutableIntState J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ CN3 f34572O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    final /* synthetic */ Animatable f34573S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ Ref f34574Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ AnimationSpec f34575g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f34576n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ MutableState f34577o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ MutableState f34578r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f34579t;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LateMotionLayoutKt$LateMotionLayout$2$1(this.f34572O, this.J2, this.f34578r, this.f34577o, this.f34574Z, this.f34573S, this.f34575g, this.E2, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((LateMotionLayoutKt$LateMotionLayout$2$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LateMotionLayoutKt$LateMotionLayout$2$1(CN3 cn3, MutableIntState mutableIntState, MutableState mutableState, MutableState mutableState2, Ref ref, Animatable animatable, AnimationSpec animationSpec, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.f34572O = cn3;
        this.J2 = mutableIntState;
        this.f34578r = mutableState;
        this.f34577o = mutableState2;
        this.f34574Z = ref;
        this.f34573S = animatable;
        this.f34575g = animationSpec;
        this.E2 = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b1, code lost:
    
        if (androidx.compose.animation.core.Animatable.J2(r5, r6, r7, null, null, r10, 12, null) == r0) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cf  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00b1 -> B:7:0x0016). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00cb -> B:12:0x0032). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Dsr it;
        Dsr dsr;
        MutableState mutableState;
        Object objRl;
        int i2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f34579t;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    dsr = (Dsr) this.f34576n;
                    ResultKt.throwOnFailure(obj);
                    LateMotionLayoutKt$LateMotionLayout$2$1 lateMotionLayoutKt$LateMotionLayout$2$1 = this;
                    it = dsr;
                    MutableIntState mutableIntState = lateMotionLayoutKt$LateMotionLayout$2$1.J2;
                    if (mutableIntState.J2() == 1) {
                        i2 = 0;
                    } else {
                        i2 = 1;
                    }
                    mutableIntState.KN(i2);
                    Function0 function0 = lateMotionLayoutKt$LateMotionLayout$2$1.E2;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    this.f34576n = it;
                    this.f34579t = 1;
                    objRl = it.rl(this);
                    if (objRl != coroutine_suspended) {
                        dsr = it;
                        obj = objRl;
                        if (!((Boolean) obj).booleanValue()) {
                            ConstraintSet constraintSet = (ConstraintSet) dsr.next();
                            ConstraintSet constraintSet2 = (ConstraintSet) C.J2(this.f34572O.O());
                            if (constraintSet2 != null) {
                                constraintSet = constraintSet2;
                            }
                            if (this.J2.J2() == 1) {
                                mutableState = this.f34578r;
                            } else {
                                mutableState = this.f34577o;
                            }
                            if (!Intrinsics.areEqual(constraintSet, (ConstraintSet) mutableState.getValue())) {
                                if (this.J2.J2() == 1) {
                                    this.f34577o.setValue(constraintSet);
                                } else {
                                    this.f34578r.setValue(constraintSet);
                                }
                                this.f34574Z.rl(CompositionSource.Content);
                                Animatable animatable = this.f34573S;
                                Float fBoxFloat = Boxing.boxFloat(this.J2.J2());
                                AnimationSpec animationSpec = this.f34575g;
                                this.f34576n = dsr;
                                this.f34579t = 2;
                                lateMotionLayoutKt$LateMotionLayout$2$1 = this;
                            } else {
                                it = dsr;
                                this.f34576n = it;
                                this.f34579t = 1;
                                objRl = it.rl(this);
                                if (objRl != coroutine_suspended) {
                                }
                            }
                        } else {
                            return Unit.INSTANCE;
                        }
                    } else {
                        return coroutine_suspended;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dsr = (Dsr) this.f34576n;
                ResultKt.throwOnFailure(obj);
                if (!((Boolean) obj).booleanValue()) {
                }
            }
        } else {
            ResultKt.throwOnFailure(obj);
            it = this.f34572O.iterator();
            this.f34576n = it;
            this.f34579t = 1;
            objRl = it.rl(this);
            if (objRl != coroutine_suspended) {
            }
        }
    }
}
