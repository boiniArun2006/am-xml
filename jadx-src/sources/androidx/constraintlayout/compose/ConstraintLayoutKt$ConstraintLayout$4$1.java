package androidx.constraintlayout.compose;

import GJW.vd;
import ILs.C;
import ILs.CN3;
import ILs.Dsr;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$4$1", f = "ConstraintLayout.kt", i = {}, l = {779, 789}, m = "invokeSuspend", n = {}, s = {})
public final class ConstraintLayoutKt$ConstraintLayout$4$1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableIntState J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ CN3 f34464O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    final /* synthetic */ MutableState f34465S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ Function0 f34466Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ MutableState f34467g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f34468n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ AnimationSpec f34469o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ Animatable f34470r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f34471t;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ConstraintLayoutKt$ConstraintLayout$4$1(this.f34464O, this.J2, this.f34470r, this.f34469o, this.f34466Z, this.f34465S, this.f34467g, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((ConstraintLayoutKt$ConstraintLayout$4$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintLayoutKt$ConstraintLayout$4$1(CN3 cn3, MutableIntState mutableIntState, Animatable animatable, AnimationSpec animationSpec, Function0 function0, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.f34464O = cn3;
        this.J2 = mutableIntState;
        this.f34470r = animatable;
        this.f34469o = animationSpec;
        this.f34466Z = function0;
        this.f34465S = mutableState;
        this.f34467g = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ab, code lost:
    
        if (androidx.compose.animation.core.Animatable.J2(r5, r6, r7, null, null, r10, 12, null) == r0) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ab -> B:7:0x0016). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00c5 -> B:12:0x0032). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Dsr it;
        Dsr dsr;
        Object objRl;
        int i2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f34471t;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    dsr = (Dsr) this.f34468n;
                    ResultKt.throwOnFailure(obj);
                    ConstraintLayoutKt$ConstraintLayout$4$1 constraintLayoutKt$ConstraintLayout$4$1 = this;
                    it = dsr;
                    MutableIntState mutableIntState = constraintLayoutKt$ConstraintLayout$4$1.J2;
                    if (mutableIntState.J2() == 1) {
                        i2 = 0;
                    } else {
                        i2 = 1;
                    }
                    mutableIntState.KN(i2);
                    Function0 function0 = constraintLayoutKt$ConstraintLayout$4$1.f34466Z;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    this.f34468n = it;
                    this.f34471t = 1;
                    objRl = it.rl(this);
                    if (objRl != coroutine_suspended) {
                        dsr = it;
                        obj = objRl;
                        if (!((Boolean) obj).booleanValue()) {
                            ConstraintSet constraintSet = (ConstraintSet) dsr.next();
                            ConstraintSet constraintSet2 = (ConstraintSet) C.J2(this.f34464O.O());
                            if (constraintSet2 != null) {
                                constraintSet = constraintSet2;
                            }
                            if (!Intrinsics.areEqual(constraintSet, this.J2.J2() == 1 ? ConstraintLayoutKt.n(this.f34465S) : ConstraintLayoutKt.t(this.f34467g))) {
                                if (this.J2.J2() == 1) {
                                    ConstraintLayoutKt.nr(this.f34467g, constraintSet);
                                } else {
                                    ConstraintLayoutKt.rl(this.f34465S, constraintSet);
                                }
                                Animatable animatable = this.f34470r;
                                Float fBoxFloat = Boxing.boxFloat(this.J2.J2());
                                AnimationSpec animationSpec = this.f34469o;
                                this.f34468n = dsr;
                                this.f34471t = 2;
                                constraintLayoutKt$ConstraintLayout$4$1 = this;
                            } else {
                                it = dsr;
                                this.f34468n = it;
                                this.f34471t = 1;
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
                dsr = (Dsr) this.f34468n;
                ResultKt.throwOnFailure(obj);
                if (!((Boolean) obj).booleanValue()) {
                }
            }
        } else {
            ResultKt.throwOnFailure(obj);
            it = this.f34464O.iterator();
            this.f34468n = it;
            this.f34471t = 1;
            objRl = it.rl(this);
            if (objRl != coroutine_suspended) {
            }
        }
    }
}
