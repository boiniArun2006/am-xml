package androidx.constraintlayout.compose;

import GJW.vd;
import ILs.C;
import ILs.CN3;
import ILs.Dsr;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$3$1", f = "MotionLayout.kt", i = {}, l = {475, 485}, m = "invokeSuspend", n = {}, s = {})
final class MotionLayoutKt$MotionLayoutCore$3$1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ CN3 f34742O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    final /* synthetic */ MutableState f34743S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ MutableState f34744Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ MutableState f34745g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f34746n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ Function0 f34747o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ AnimationSpec f34748r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f34749t;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MotionLayoutKt$MotionLayoutCore$3$1(this.f34742O, this.J2, this.f34748r, this.f34747o, this.f34744Z, this.f34743S, this.f34745g, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((MotionLayoutKt$MotionLayoutCore$3$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MotionLayoutKt$MotionLayoutCore$3$1(CN3 cn3, Animatable animatable, AnimationSpec animationSpec, Function0 function0, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, Continuation continuation) {
        super(2, continuation);
        this.f34742O = cn3;
        this.J2 = animatable;
        this.f34748r = animationSpec;
        this.f34747o = function0;
        this.f34744Z = mutableState;
        this.f34743S = mutableState2;
        this.f34745g = mutableState3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027 A[PHI: r0 r1
      0x0027: PHI (r0v3 ILs.Dsr) = (r0v14 ILs.Dsr), (r0v17 ILs.Dsr) binds: [B:13:0x003a, B:9:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x0027: PHI (r1v0 java.lang.Object) = (r1v12 java.lang.Object), (r1v15 java.lang.Object) binds: [B:13:0x003a, B:9:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00af -> B:39:0x00b0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00c3 -> B:12:0x0032). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Dsr it;
        Object objRl;
        float f3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f34749t;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    it = (Dsr) this.f34746n;
                    ResultKt.throwOnFailure(obj);
                    MotionLayoutKt.xMQ(this.f34744Z, !MotionLayoutKt.KN(r1));
                    Function0 function0 = this.f34747o;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    this.f34746n = it;
                    this.f34749t = 1;
                    objRl = it.rl(this);
                    if (objRl != coroutine_suspended) {
                        Dsr dsr = it;
                        if (!((Boolean) objRl).booleanValue()) {
                            ConstraintSet constraintSet = (ConstraintSet) dsr.next();
                            ConstraintSet constraintSet2 = (ConstraintSet) C.J2(this.f34742O.O());
                            if (constraintSet2 != null) {
                                constraintSet = constraintSet2;
                            }
                            if (MotionLayoutKt.KN(this.f34744Z)) {
                                f3 = 1.0f;
                            } else {
                                f3 = 0.0f;
                            }
                            if (!Intrinsics.areEqual(constraintSet, MotionLayoutKt.KN(this.f34744Z) ? MotionLayoutKt.nr(this.f34743S) : MotionLayoutKt.J2(this.f34745g))) {
                                if (MotionLayoutKt.KN(this.f34744Z)) {
                                    MotionLayoutKt.Uo(this.f34745g, constraintSet);
                                } else {
                                    MotionLayoutKt.O(this.f34743S, constraintSet);
                                }
                                Animatable animatable = this.J2;
                                Float fBoxFloat = Boxing.boxFloat(f3);
                                AnimationSpec animationSpec = this.f34748r;
                                this.f34746n = dsr;
                                this.f34749t = 2;
                                if (Animatable.J2(animatable, fBoxFloat, animationSpec, null, null, this, 12, null) != coroutine_suspended) {
                                    it = dsr;
                                    MotionLayoutKt.xMQ(this.f34744Z, !MotionLayoutKt.KN(r1));
                                    Function0 function02 = this.f34747o;
                                    if (function02 != null) {
                                    }
                                    this.f34746n = it;
                                    this.f34749t = 1;
                                    objRl = it.rl(this);
                                    if (objRl != coroutine_suspended) {
                                    }
                                }
                            } else {
                                it = dsr;
                                this.f34746n = it;
                                this.f34749t = 1;
                                objRl = it.rl(this);
                                if (objRl != coroutine_suspended) {
                                }
                            }
                        } else {
                            return Unit.INSTANCE;
                        }
                    }
                    return coroutine_suspended;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Dsr) this.f34746n;
            ResultKt.throwOnFailure(obj);
            objRl = obj;
            Dsr dsr2 = it;
            if (!((Boolean) objRl).booleanValue()) {
            }
        } else {
            ResultKt.throwOnFailure(obj);
            it = this.f34742O.iterator();
            this.f34746n = it;
            this.f34749t = 1;
            objRl = it.rl(this);
            if (objRl != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
    }
}
