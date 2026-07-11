package androidx.compose.foundation.gestures;

import GJW.AbstractC1363t;
import GJW.vd;
import ILs.CN3;
import androidx.compose.foundation.gestures.MouseWheelScrollingLogic;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1", f = "MouseWheelScrollable.kt", i = {0, 1}, l = {107, 110}, m = "invokeSuspend", n = {"$this$launch", "$this$launch"}, s = {"L$0", "L$0"})
@SourceDebugExtension({"SMAP\nMouseWheelScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MouseWheelScrollable.kt\nandroidx/compose/foundation/gestures/MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,363:1\n1#2:364\n*E\n"})
final class MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ MouseWheelScrollingLogic f16954O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f16955n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f16956t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1(MouseWheelScrollingLogic mouseWheelScrollingLogic, Continuation continuation) {
        super(2, continuation);
        this.f16954O = mouseWheelScrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1 mouseWheelScrollingLogic$startReceivingMouseWheelEvents$1 = new MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1(this.f16954O, continuation);
        mouseWheelScrollingLogic$startReceivingMouseWheelEvents$1.f16956t = obj;
        return mouseWheelScrollingLogic$startReceivingMouseWheelEvents$1;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1 mouseWheelScrollingLogic$startReceivingMouseWheelEvents$1;
        vd vdVar;
        vd vdVar2;
        Throwable th2;
        MouseWheelScrollingLogic.MouseWheelScrollDelta mouseWheelScrollDelta;
        float fL;
        float fL2;
        MouseWheelScrollingLogic mouseWheelScrollingLogic;
        ScrollingLogic scrollingLogic;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f16955n;
        try {
            if (i2 != 0) {
                try {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            vd vdVar3 = (vd) this.f16956t;
                            ResultKt.throwOnFailure(obj);
                            vdVar2 = vdVar3;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        vdVar = (vd) this.f16956t;
                        ResultKt.throwOnFailure(obj);
                        try {
                            mouseWheelScrollDelta = (MouseWheelScrollingLogic.MouseWheelScrollDelta) obj;
                            fL = this.f16954O.density.l(MouseWheelScrollableKt.f16911n);
                            fL2 = this.f16954O.density.l(MouseWheelScrollableKt.rl);
                            mouseWheelScrollingLogic = this.f16954O;
                            scrollingLogic = mouseWheelScrollingLogic.scrollingLogic;
                            this.f16956t = vdVar;
                            this.f16955n = 2;
                            if (mouseWheelScrollingLogic.r(scrollingLogic, mouseWheelScrollDelta, fL, fL2, mouseWheelScrollingLogic$startReceivingMouseWheelEvents$1) != coroutine_suspended) {
                                vdVar2 = vdVar;
                            }
                            return coroutine_suspended;
                        } catch (Throwable th3) {
                            th2 = th3;
                            th = th2;
                            mouseWheelScrollingLogic$startReceivingMouseWheelEvents$1.f16954O.receivingMouseWheelEventsJob = null;
                            throw th;
                        }
                        mouseWheelScrollingLogic$startReceivingMouseWheelEvents$1 = this;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    mouseWheelScrollingLogic$startReceivingMouseWheelEvents$1 = this;
                    mouseWheelScrollingLogic$startReceivingMouseWheelEvents$1.f16954O.receivingMouseWheelEventsJob = null;
                    throw th;
                }
            } else {
                ResultKt.throwOnFailure(obj);
                vdVar2 = (vd) this.f16956t;
            }
            if (AbstractC1363t.ck(vdVar2.getCoroutineContext())) {
                CN3 cn3 = this.f16954O.channel;
                this.f16956t = vdVar2;
                this.f16955n = 1;
                Object objKN = cn3.KN(this);
                if (objKN != coroutine_suspended) {
                    vdVar = vdVar2;
                    obj = objKN;
                    mouseWheelScrollDelta = (MouseWheelScrollingLogic.MouseWheelScrollDelta) obj;
                    fL = this.f16954O.density.l(MouseWheelScrollableKt.f16911n);
                    fL2 = this.f16954O.density.l(MouseWheelScrollableKt.rl);
                    mouseWheelScrollingLogic = this.f16954O;
                    scrollingLogic = mouseWheelScrollingLogic.scrollingLogic;
                    this.f16956t = vdVar;
                    this.f16955n = 2;
                    mouseWheelScrollingLogic$startReceivingMouseWheelEvents$1 = this;
                    if (mouseWheelScrollingLogic.r(scrollingLogic, mouseWheelScrollDelta, fL, fL2, mouseWheelScrollingLogic$startReceivingMouseWheelEvents$1) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                return coroutine_suspended;
            }
            this.f16954O.receivingMouseWheelEventsJob = null;
            return Unit.INSTANCE;
        } catch (Throwable th5) {
            th2 = th5;
            mouseWheelScrollingLogic$startReceivingMouseWheelEvents$1 = this;
            th = th2;
            mouseWheelScrollingLogic$startReceivingMouseWheelEvents$1.f16954O.receivingMouseWheelEventsJob = null;
            throw th;
        }
    }
}
