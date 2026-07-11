package androidx.constraintlayout.compose;

import GJW.AbstractC1363t;
import GJW.vd;
import ILs.C;
import ILs.CN3;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
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
@DebugMetadata(c = "androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$1$1", f = "MotionDragHandler.kt", i = {0, 0, 0, 1, 2, 2}, l = {TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER, 80, 85}, m = "invokeSuspend", n = {"$this$effectScope", "dragState", "isTouchUp", "$this$effectScope", "$this$effectScope", "isTouchUp"}, s = {"L$0", "L$1", "I$0", "L$0", "L$0", "I$0"})
final class MotionDragHandlerKt$motionPointerInput$2$1$1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f34680O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f34681n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ CN3 f34682o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ TransitionHandler f34683r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f34684t;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MotionDragHandlerKt$motionPointerInput$2$1$1 motionDragHandlerKt$motionPointerInput$2$1$1 = new MotionDragHandlerKt$motionPointerInput$2$1$1(this.f34683r, this.f34682o, continuation);
        motionDragHandlerKt$motionPointerInput$2$1$1.J2 = obj;
        return motionDragHandlerKt$motionPointerInput$2$1$1;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((MotionDragHandlerKt$motionPointerInput$2$1$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MotionDragHandlerKt$motionPointerInput$2$1$1(TransitionHandler transitionHandler, CN3 cn3, Continuation continuation) {
        super(2, continuation);
        this.f34683r = transitionHandler;
        this.f34682o = cn3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
    
        if (r12 == r0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00aa -> B:34:0x00ab). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ad -> B:36:0x00b6). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vd vdVar;
        int i2;
        MotionDragState motionDragState;
        vd vdVar2;
        boolean isDragging;
        int i3;
        Object objO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = this.f34680O;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 == 3) {
                        int i7 = this.f34684t;
                        vdVar2 = (vd) this.J2;
                        ResultKt.throwOnFailure(obj);
                        i3 = i7;
                        vdVar = vdVar2;
                        i2 = i3;
                        motionDragState = null;
                        objO = this.f34682o.O();
                        if (C.gh(objO)) {
                            motionDragState = (MotionDragState) C.Uo(objO);
                            if (motionDragState.getIsDragging()) {
                                i2 = 0;
                            }
                        }
                        if (AbstractC1363t.ck(vdVar.getCoroutineContext())) {
                            if (i2 != 0 && this.f34683r.J2()) {
                                TransitionHandler transitionHandler = this.f34683r;
                                this.J2 = vdVar;
                                this.f34681n = motionDragState;
                                this.f34684t = i2;
                                this.f34680O = 1;
                                if (transitionHandler.KN(this) != coroutine_suspended) {
                                    i2 = i2;
                                    vdVar = vdVar;
                                    objO = this.f34682o.O();
                                    if (C.gh(objO)) {
                                    }
                                    if (AbstractC1363t.ck(vdVar.getCoroutineContext())) {
                                    }
                                }
                            } else if (motionDragState == null) {
                                CN3 cn3 = this.f34682o;
                                this.J2 = vdVar;
                                this.f34681n = null;
                                this.f34680O = 2;
                                obj = cn3.KN(this);
                            } else {
                                MotionDragState motionDragState2 = motionDragState;
                                vdVar2 = vdVar;
                                AbstractC1363t.qie(vdVar2.getCoroutineContext());
                                isDragging = motionDragState2.getIsDragging();
                                i3 = !isDragging ? 1 : 0;
                                if (isDragging) {
                                    TransitionHandler transitionHandler2 = this.f34683r;
                                    long velocity = motionDragState2.getVelocity();
                                    this.J2 = vdVar2;
                                    this.f34681n = null;
                                    this.f34684t = i3;
                                    this.f34680O = 3;
                                    if (transitionHandler2.O(velocity, this) != coroutine_suspended) {
                                        i7 = i3;
                                        i3 = i7;
                                        vdVar = vdVar2;
                                        i2 = i3;
                                        motionDragState = null;
                                        objO = this.f34682o.O();
                                        if (C.gh(objO)) {
                                        }
                                        if (AbstractC1363t.ck(vdVar.getCoroutineContext())) {
                                        }
                                    }
                                } else {
                                    this.f34683r.Uo(motionDragState2.getDragAmount());
                                    vdVar = vdVar2;
                                    i2 = i3;
                                    motionDragState = null;
                                    objO = this.f34682o.O();
                                    if (C.gh(objO)) {
                                    }
                                    if (AbstractC1363t.ck(vdVar.getCoroutineContext())) {
                                    }
                                }
                            }
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                vdVar = (vd) this.J2;
                ResultKt.throwOnFailure(obj);
                motionDragState = (MotionDragState) obj;
                MotionDragState motionDragState22 = motionDragState;
                vdVar2 = vdVar;
                AbstractC1363t.qie(vdVar2.getCoroutineContext());
                isDragging = motionDragState22.getIsDragging();
                i3 = !isDragging ? 1 : 0;
                if (isDragging) {
                }
            } else {
                int i8 = this.f34684t;
                motionDragState = (MotionDragState) this.f34681n;
                vd vdVar3 = (vd) this.J2;
                ResultKt.throwOnFailure(obj);
                i2 = i8;
                vdVar = vdVar3;
                objO = this.f34682o.O();
                if (C.gh(objO)) {
                }
                if (AbstractC1363t.ck(vdVar.getCoroutineContext())) {
                }
            }
        } else {
            ResultKt.throwOnFailure(obj);
            vdVar = (vd) this.J2;
            i2 = 0;
            motionDragState = null;
            if (AbstractC1363t.ck(vdVar.getCoroutineContext())) {
            }
        }
    }
}
