package androidx.compose.ui.scrollcapture;

import GJW.C;
import GJW.Lu;
import GJW.V1;
import GJW.vd;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.unit.IntRect;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.protos.Sdk;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@RequiresApi
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u00014B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ \u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ5\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00162\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u001bH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010+R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00065"}, d2 = {"Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback;", "Landroid/view/ScrollCaptureCallback;", "Landroidx/compose/ui/semantics/SemanticsNode;", "node", "Landroidx/compose/ui/unit/IntRect;", "viewportBoundsInWindow", "LGJW/vd;", "coroutineScope", "Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback$ScrollCaptureSessionListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/View;", "composeView", "<init>", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/compose/ui/unit/IntRect;LGJW/vd;Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback$ScrollCaptureSessionListener;Landroid/view/View;)V", "Landroid/view/ScrollCaptureSession;", "session", "captureArea", "O", "(Landroid/view/ScrollCaptureSession;Landroidx/compose/ui/unit/IntRect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/os/CancellationSignal;", "signal", "Ljava/util/function/Consumer;", "Landroid/graphics/Rect;", "onReady", "", "onScrollCaptureSearch", "(Landroid/os/CancellationSignal;Ljava/util/function/Consumer;)V", "Ljava/lang/Runnable;", "onScrollCaptureStart", "(Landroid/view/ScrollCaptureSession;Landroid/os/CancellationSignal;Ljava/lang/Runnable;)V", "onComplete", "onScrollCaptureImageRequest", "(Landroid/view/ScrollCaptureSession;Landroid/os/CancellationSignal;Landroid/graphics/Rect;Ljava/util/function/Consumer;)V", "onScrollCaptureEnd", "(Ljava/lang/Runnable;)V", c.f62177j, "Landroidx/compose/ui/semantics/SemanticsNode;", "rl", "Landroidx/compose/ui/unit/IntRect;", "t", "Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback$ScrollCaptureSessionListener;", "nr", "Landroid/view/View;", "LGJW/vd;", "Landroidx/compose/ui/scrollcapture/RelativeScroller;", "J2", "Landroidx/compose/ui/scrollcapture/RelativeScroller;", "scrollTracker", "", "Uo", "I", "requestCount", "ScrollCaptureSessionListener", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ComposeScrollCaptureCallback implements ScrollCaptureCallback {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final RelativeScroller scrollTracker;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final vd coroutineScope;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private int requestCount;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final SemanticsNode node;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final View composeView;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final IntRect viewportBoundsInWindow;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final ScrollCaptureSessionListener listener;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback$ScrollCaptureSessionListener;", "", "", c.f62177j, "()V", "rl", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface ScrollCaptureSessionListener {
        void n();

        void rl();
    }

    /* JADX INFO: renamed from: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureEnd$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureEnd$1", f = "ComposeScrollCaptureCallback.android.kt", i = {}, l = {186}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Runnable f33196O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f33197n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Runnable runnable, Continuation continuation) {
            super(2, continuation);
            this.f33196O = runnable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ComposeScrollCaptureCallback.this.new AnonymousClass1(this.f33196O, continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(vd vdVar, Continuation continuation) {
            return ((AnonymousClass1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
            return invoke2(vdVar, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f33197n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                RelativeScroller relativeScroller = ComposeScrollCaptureCallback.this.scrollTracker;
                this.f33197n = 1;
                if (relativeScroller.Uo(0.0f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            ComposeScrollCaptureCallback.this.listener.rl();
            this.f33196O.run();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1", f = "ComposeScrollCaptureCallback.android.kt", i = {}, l = {Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class C15341 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
        final /* synthetic */ Rect J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ ScrollCaptureSession f33199O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f33200n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Consumer f33201r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C15341(ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer consumer, Continuation continuation) {
            super(2, continuation);
            this.f33199O = scrollCaptureSession;
            this.J2 = rect;
            this.f33201r = consumer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ComposeScrollCaptureCallback.this.new C15341(this.f33199O, this.J2, this.f33201r, continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(vd vdVar, Continuation continuation) {
            return ((C15341) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
            return invoke2(vdVar, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f33200n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                ComposeScrollCaptureCallback composeScrollCaptureCallback = ComposeScrollCaptureCallback.this;
                ScrollCaptureSession scrollCaptureSession = this.f33199O;
                IntRect intRectNr = RectHelper_androidKt.nr(this.J2);
                this.f33200n = 1;
                obj = composeScrollCaptureCallback.O(scrollCaptureSession, intRectNr, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            this.f33201r.accept(RectHelper_androidKt.rl((IntRect) obj));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback", f = "ComposeScrollCaptureCallback.android.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 135}, m = "onScrollCaptureImageRequest", n = {"this", "session", "captureArea", "targetMin", "targetMax", "this", "session", "captureArea", "targetMin", "targetMax"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
    static final class AnonymousClass2 extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f33203O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        int f33204S;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f33206n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f33207o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f33208r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f33209t;

        AnonymousClass2(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f33207o = obj;
            this.f33204S |= Integer.MIN_VALUE;
            return ComposeScrollCaptureCallback.this.O(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object O(ScrollCaptureSession scrollCaptureSession, IntRect intRect, Continuation continuation) {
        AnonymousClass2 anonymousClass2;
        int top;
        int bottom;
        ComposeScrollCaptureCallback composeScrollCaptureCallback;
        IntRect intRect2;
        int i2;
        ComposeScrollCaptureCallback composeScrollCaptureCallback2;
        ScrollCaptureSession scrollCaptureSession2;
        int i3;
        int iT;
        int iT2;
        if (continuation instanceof AnonymousClass2) {
            anonymousClass2 = (AnonymousClass2) continuation;
            int i5 = anonymousClass2.f33204S;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                anonymousClass2.f33204S = i5 - Integer.MIN_VALUE;
            } else {
                anonymousClass2 = new AnonymousClass2(continuation);
            }
        }
        Object obj = anonymousClass2.f33207o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = anonymousClass2.f33204S;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            top = intRect.getTop();
            bottom = intRect.getBottom();
            RelativeScroller relativeScroller = this.scrollTracker;
            anonymousClass2.f33206n = this;
            anonymousClass2.f33209t = scrollCaptureSession;
            anonymousClass2.f33203O = intRect;
            anonymousClass2.J2 = top;
            anonymousClass2.f33208r = bottom;
            anonymousClass2.f33204S = 1;
            if (relativeScroller.J2(top, bottom, anonymousClass2) != coroutine_suspended) {
                composeScrollCaptureCallback = this;
            }
            return coroutine_suspended;
        }
        if (i7 != 1) {
            if (i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = anonymousClass2.f33208r;
            i2 = anonymousClass2.J2;
            intRect2 = (IntRect) anonymousClass2.f33203O;
            ScrollCaptureSession scrollCaptureSessionN = j.n(anonymousClass2.f33209t);
            composeScrollCaptureCallback2 = (ComposeScrollCaptureCallback) anonymousClass2.f33206n;
            ResultKt.throwOnFailure(obj);
            scrollCaptureSession2 = scrollCaptureSessionN;
            iT = composeScrollCaptureCallback2.scrollTracker.t(i2);
            iT2 = composeScrollCaptureCallback2.scrollTracker.t(i3);
            IntRect intRectT = IntRect.t(intRect2, 0, iT, 0, iT2, 5, null);
            if (iT != iT2) {
                return IntRect.INSTANCE.n();
            }
            Canvas canvasLockHardwareCanvas = scrollCaptureSession2.getSurface().lockHardwareCanvas();
            try {
                canvasLockHardwareCanvas.save();
                canvasLockHardwareCanvas.translate(-intRectT.getLeft(), -intRectT.getTop());
                canvasLockHardwareCanvas.translate(-composeScrollCaptureCallback2.viewportBoundsInWindow.getLeft(), -composeScrollCaptureCallback2.viewportBoundsInWindow.getTop());
                composeScrollCaptureCallback2.composeView.getRootView().draw(canvasLockHardwareCanvas);
                scrollCaptureSession2.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
                return intRectT.ty(0, MathKt.roundToInt(composeScrollCaptureCallback2.scrollTracker.getScrollAmount()));
            } catch (Throwable th) {
                scrollCaptureSession2.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
                throw th;
            }
        }
        int i8 = anonymousClass2.f33208r;
        int i9 = anonymousClass2.J2;
        IntRect intRect3 = (IntRect) anonymousClass2.f33203O;
        ScrollCaptureSession scrollCaptureSessionN2 = j.n(anonymousClass2.f33209t);
        composeScrollCaptureCallback = (ComposeScrollCaptureCallback) anonymousClass2.f33206n;
        ResultKt.throwOnFailure(obj);
        top = i9;
        intRect = intRect3;
        bottom = i8;
        scrollCaptureSession = scrollCaptureSessionN2;
        AnonymousClass3 anonymousClass3 = new Function1<Long, Unit>() { // from class: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback.onScrollCaptureImageRequest.3
            public final void n(long j2) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l2) {
                n(l2.longValue());
                return Unit.INSTANCE;
            }
        };
        anonymousClass2.f33206n = composeScrollCaptureCallback;
        anonymousClass2.f33209t = scrollCaptureSession;
        anonymousClass2.f33203O = intRect;
        anonymousClass2.J2 = top;
        anonymousClass2.f33208r = bottom;
        anonymousClass2.f33204S = 2;
        if (MonotonicFrameClockKt.t(anonymousClass3, anonymousClass2) != coroutine_suspended) {
            intRect2 = intRect;
            i2 = top;
            composeScrollCaptureCallback2 = composeScrollCaptureCallback;
            scrollCaptureSession2 = scrollCaptureSession;
            i3 = bottom;
            iT = composeScrollCaptureCallback2.scrollTracker.t(i2);
            iT2 = composeScrollCaptureCallback2.scrollTracker.t(i3);
            IntRect intRectT2 = IntRect.t(intRect2, 0, iT, 0, iT2, 5, null);
            if (iT != iT2) {
            }
        }
        return coroutine_suspended;
    }

    public void onScrollCaptureEnd(Runnable onReady) {
        C.nr(this.coroutineScope, V1.f3456n, null, new AnonymousClass1(onReady, null), 2, null);
    }

    public void onScrollCaptureImageRequest(ScrollCaptureSession session, CancellationSignal signal, Rect captureArea, Consumer onComplete) {
        ComposeScrollCaptureCallback_androidKt.t(this.coroutineScope, signal, new C15341(session, captureArea, onComplete, null));
    }

    public void onScrollCaptureSearch(CancellationSignal signal, Consumer onReady) {
        onReady.accept(RectHelper_androidKt.rl(this.viewportBoundsInWindow));
    }

    public void onScrollCaptureStart(ScrollCaptureSession session, CancellationSignal signal, Runnable onReady) {
        this.scrollTracker.nr();
        this.requestCount = 0;
        this.listener.n();
        onReady.run();
    }

    public ComposeScrollCaptureCallback(SemanticsNode semanticsNode, IntRect intRect, vd vdVar, ScrollCaptureSessionListener scrollCaptureSessionListener, View view) {
        this.node = semanticsNode;
        this.viewportBoundsInWindow = intRect;
        this.listener = scrollCaptureSessionListener;
        this.composeView = view;
        this.coroutineScope = Lu.xMQ(vdVar, DisableAnimationMotionDurationScale.f33215n);
        this.scrollTracker = new RelativeScroller(intRect.J2(), new ComposeScrollCaptureCallback$scrollTracker$1(this, null));
    }
}
