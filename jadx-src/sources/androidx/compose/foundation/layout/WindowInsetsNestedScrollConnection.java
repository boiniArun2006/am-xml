package androidx.compose.foundation.layout;

import GJW.Lu;
import GJW.Pl;
import GJW.eO;
import GJW.xuv;
import android.graphics.Insets;
import android.os.CancellationSignal;
import android.view.View;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Velocity;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@RequiresApi
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u0015H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\rH\u0002¢\u0006\u0004\b\"\u0010\u000fJ\"\u0010%\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010$\u001a\u00020#H\u0016ø\u0001\u0000¢\u0006\u0004\b%\u0010&J*\u0010(\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010$\u001a\u00020#H\u0016ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u001b\u0010*\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0019H\u0096@ø\u0001\u0000¢\u0006\u0004\b*\u0010+J#\u0010,\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0019H\u0096@ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u001f\u00101\u001a\u00020\r2\u0006\u0010.\u001a\u00020\u00102\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020\r¢\u0006\u0004\b3\u0010\u000fJ\u0017\u00104\u001a\u00020\r2\u0006\u0010.\u001a\u00020\u0010H\u0016¢\u0006\u0004\b4\u00105J\u0019\u00106\u001a\u00020\r2\b\u0010.\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b6\u00105R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0018\u0010I\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010L\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010O\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010NR\u0016\u0010Q\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010(R\u0018\u0010U\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR \u0010Y\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010X\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Z"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroid/view/WindowInsetsAnimationControlListener;", "Landroidx/compose/foundation/layout/AndroidWindowInsets;", "windowInsets", "Landroid/view/View;", "view", "Landroidx/compose/foundation/layout/SideCalculator;", "sideCalculator", "Landroidx/compose/ui/unit/Density;", "density", "<init>", "(Landroidx/compose/foundation/layout/AndroidWindowInsets;Landroid/view/View;Landroidx/compose/foundation/layout/SideCalculator;Landroidx/compose/ui/unit/Density;)V", "", "az", "()V", "Landroid/view/WindowInsetsAnimationController;", "qie", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/geometry/Offset;", "available", "", "scrollAmount", "ty", "(JF)J", "Landroidx/compose/ui/unit/Velocity;", "flingAmount", "", "towardShown", "gh", "(JFZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "inset", "KN", "(F)V", "xMQ", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "tEO", "(JI)J", "consumed", "F", "(JJI)J", "lS", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "z", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "controller", "", "types", "onReady", "(Landroid/view/WindowInsetsAnimationController;I)V", "mUb", "onFinished", "(Landroid/view/WindowInsetsAnimationController;)V", "onCancelled", c.f62177j, "Landroidx/compose/foundation/layout/AndroidWindowInsets;", "getWindowInsets", "()Landroidx/compose/foundation/layout/AndroidWindowInsets;", "t", "Landroid/view/View;", "getView", "()Landroid/view/View;", "O", "Landroidx/compose/foundation/layout/SideCalculator;", "getSideCalculator", "()Landroidx/compose/foundation/layout/SideCalculator;", "J2", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "r", "Landroid/view/WindowInsetsAnimationController;", "animationController", "o", "Z", "isControllerRequested", "Landroid/os/CancellationSignal;", "Landroid/os/CancellationSignal;", "cancellationSignal", "S", "partialConsumption", "LGJW/xuv;", "g", "LGJW/xuv;", "animationJob", "LGJW/Pl;", "E2", "LGJW/Pl;", "continuation", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,708:1\n314#2,11:709\n65#3:720\n69#3:723\n65#3:725\n69#3:728\n60#4:721\n70#4:724\n60#4:726\n70#4:729\n22#5:722\n22#5:727\n26#5:730\n26#5:731\n26#5:732\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection\n*L\n202#1:709,11\n209#1:720\n209#1:723\n216#1:725\n216#1:728\n209#1:721\n209#1:724\n216#1:726\n216#1:729\n209#1:722\n216#1:727\n256#1:730\n257#1:731\n370#1:732\n*E\n"})
final class WindowInsetsNestedScrollConnection implements NestedScrollConnection, WindowInsetsAnimationControlListener {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private Pl continuation;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final Density density;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final SideCalculator sideCalculator;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private float partialConsumption;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private final CancellationSignal cancellationSignal = new CancellationSignal();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private xuv animationJob;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final AndroidWindowInsets windowInsets;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean isControllerRequested;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private WindowInsetsAnimationController animationController;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* JADX INFO: Access modifiers changed from: private */
    public final void KN(float inset) {
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (windowInsetsAnimationController != null) {
            windowInsetsAnimationController.setInsetsAndAlpha(this.sideCalculator.t(windowInsetsAnimationController.getCurrentInsets(), Math.round(inset)), 1.0f, 0.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void az() {
        if (this.isControllerRequested) {
            return;
        }
        this.isControllerRequested = true;
        WindowInsetsController windowInsetsController = this.view.getWindowInsetsController();
        if (windowInsetsController != null) {
            windowInsetsController.controlWindowInsetsAnimation(this.windowInsets.getType(), -1L, null, this.cancellationSignal, aC.n(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object gh(long j2, float f3, boolean z2, Continuation continuation) {
        WindowInsetsNestedScrollConnection$fling$1 windowInsetsNestedScrollConnection$fling$1;
        WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection;
        long j3;
        Ref.FloatRef floatRef;
        long j4;
        WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection2;
        long j5;
        WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection3;
        float f4 = f3;
        if (continuation instanceof WindowInsetsNestedScrollConnection$fling$1) {
            windowInsetsNestedScrollConnection$fling$1 = (WindowInsetsNestedScrollConnection$fling$1) continuation;
            int i2 = windowInsetsNestedScrollConnection$fling$1.f17863Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                windowInsetsNestedScrollConnection$fling$1.f17863Z = i2 - Integer.MIN_VALUE;
            } else {
                windowInsetsNestedScrollConnection$fling$1 = new WindowInsetsNestedScrollConnection$fling$1(this, continuation);
            }
        }
        Object obj = windowInsetsNestedScrollConnection$fling$1.f17866r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = windowInsetsNestedScrollConnection$fling$1.f17863Z;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            xuv xuvVar = this.animationJob;
            if (xuvVar != null) {
                xuvVar.cancel((CancellationException) new WindowInsetsAnimationCancelledException());
            }
            this.animationJob = null;
            this.partialConsumption = 0.0f;
            if ((f4 == 0.0f && !z2) || (this.animationController == null && this.windowInsets.Uo() == z2)) {
                return Velocity.rl(Velocity.INSTANCE.n());
            }
            windowInsetsNestedScrollConnection$fling$1.f17864n = this;
            windowInsetsNestedScrollConnection$fling$1.f17862O = j2;
            windowInsetsNestedScrollConnection$fling$1.J2 = f4;
            windowInsetsNestedScrollConnection$fling$1.f17863Z = 1;
            Object objQie = qie(windowInsetsNestedScrollConnection$fling$1);
            if (objQie != coroutine_suspended) {
                windowInsetsNestedScrollConnection = this;
                j3 = j2;
                obj = objQie;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                j4 = windowInsetsNestedScrollConnection$fling$1.f17862O;
                floatRef = (Ref.FloatRef) windowInsetsNestedScrollConnection$fling$1.f17867t;
                windowInsetsNestedScrollConnection2 = (WindowInsetsNestedScrollConnection) windowInsetsNestedScrollConnection$fling$1.f17864n;
                ResultKt.throwOnFailure(obj);
                return Velocity.rl(windowInsetsNestedScrollConnection2.sideCalculator.Uo(j4, floatRef.element));
            }
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j5 = windowInsetsNestedScrollConnection$fling$1.f17862O;
            windowInsetsNestedScrollConnection3 = (WindowInsetsNestedScrollConnection) windowInsetsNestedScrollConnection$fling$1.f17864n;
            ResultKt.throwOnFailure(obj);
            return Velocity.rl(windowInsetsNestedScrollConnection3.sideCalculator.Uo(j5, 0.0f));
        }
        f4 = windowInsetsNestedScrollConnection$fling$1.J2;
        j3 = windowInsetsNestedScrollConnection$fling$1.f17862O;
        WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection4 = (WindowInsetsNestedScrollConnection) windowInsetsNestedScrollConnection$fling$1.f17864n;
        ResultKt.throwOnFailure(obj);
        windowInsetsNestedScrollConnection = windowInsetsNestedScrollConnection4;
        WindowInsetsAnimationController windowInsetsAnimationControllerN = Ml.n(obj);
        if (windowInsetsAnimationControllerN == null) {
            return Velocity.rl(Velocity.INSTANCE.n());
        }
        int iO = windowInsetsNestedScrollConnection.sideCalculator.O(windowInsetsAnimationControllerN.getHiddenStateInsets());
        int iO2 = windowInsetsNestedScrollConnection.sideCalculator.O(windowInsetsAnimationControllerN.getShownStateInsets());
        int iO3 = windowInsetsNestedScrollConnection.sideCalculator.O(windowInsetsAnimationControllerN.getCurrentInsets());
        if ((f4 <= 0.0f && iO3 == iO) || (f4 >= 0.0f && iO3 == iO2)) {
            windowInsetsAnimationControllerN.finish(iO3 == iO2);
            windowInsetsNestedScrollConnection.animationController = null;
            return Velocity.rl(Velocity.INSTANCE.n());
        }
        SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec = new SplineBasedFloatDecayAnimationSpec(windowInsetsNestedScrollConnection.density);
        float fJ2 = iO3 + splineBasedFloatDecayAnimationSpec.J2(f4);
        float f5 = iO;
        boolean z3 = (fJ2 - f5) / ((float) (iO2 - iO)) > 0.5f;
        int i5 = z3 ? iO2 : iO;
        if (fJ2 > iO2 || fJ2 < f5) {
            float f6 = f4;
            Ref.FloatRef floatRef2 = new Ref.FloatRef();
            WindowInsetsNestedScrollConnection$fling$2 windowInsetsNestedScrollConnection$fling$2 = new WindowInsetsNestedScrollConnection$fling$2(windowInsetsNestedScrollConnection, iO3, f6, splineBasedFloatDecayAnimationSpec, iO, iO2, floatRef2, windowInsetsAnimationControllerN, z3, null);
            windowInsetsNestedScrollConnection$fling$1.f17864n = windowInsetsNestedScrollConnection;
            windowInsetsNestedScrollConnection$fling$1.f17867t = floatRef2;
            windowInsetsNestedScrollConnection$fling$1.f17862O = j3;
            windowInsetsNestedScrollConnection$fling$1.f17863Z = 2;
            if (Lu.J2(windowInsetsNestedScrollConnection$fling$2, windowInsetsNestedScrollConnection$fling$1) != coroutine_suspended) {
                floatRef = floatRef2;
                j4 = j3;
                windowInsetsNestedScrollConnection2 = windowInsetsNestedScrollConnection;
                return Velocity.rl(windowInsetsNestedScrollConnection2.sideCalculator.Uo(j4, floatRef.element));
            }
        } else {
            WindowInsetsNestedScrollConnection$fling$3 windowInsetsNestedScrollConnection$fling$3 = new WindowInsetsNestedScrollConnection$fling$3(windowInsetsNestedScrollConnection, iO3, i5, f4, windowInsetsAnimationControllerN, z3, null);
            windowInsetsNestedScrollConnection$fling$1.f17864n = windowInsetsNestedScrollConnection;
            windowInsetsNestedScrollConnection$fling$1.f17862O = j3;
            windowInsetsNestedScrollConnection$fling$1.f17863Z = 3;
            if (Lu.J2(windowInsetsNestedScrollConnection$fling$3, windowInsetsNestedScrollConnection$fling$1) != coroutine_suspended) {
                j5 = j3;
                windowInsetsNestedScrollConnection3 = windowInsetsNestedScrollConnection;
                return Velocity.rl(windowInsetsNestedScrollConnection3.sideCalculator.Uo(j5, 0.0f));
            }
        }
        return coroutine_suspended;
    }

    private final Object qie(Continuation continuation) {
        Object objWPU = this.animationController;
        if (objWPU == null) {
            eO eOVar = new eO(IntrinsicsKt.intercepted(continuation), 1);
            eOVar.e();
            this.continuation = eOVar;
            az();
            objWPU = eOVar.WPU();
            if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
        }
        return objWPU;
    }

    private final long ty(long available, float scrollAmount) {
        xuv xuvVar = this.animationJob;
        if (xuvVar != null) {
            xuvVar.cancel((CancellationException) new WindowInsetsAnimationCancelledException());
            this.animationJob = null;
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (scrollAmount != 0.0f) {
            if (this.windowInsets.Uo() != (scrollAmount > 0.0f) || windowInsetsAnimationController != null) {
                if (windowInsetsAnimationController == null) {
                    this.partialConsumption = 0.0f;
                    az();
                    return this.sideCalculator.J2(available);
                }
                int iO = this.sideCalculator.O(windowInsetsAnimationController.getHiddenStateInsets());
                int iO2 = this.sideCalculator.O(windowInsetsAnimationController.getShownStateInsets());
                Insets currentInsets = windowInsetsAnimationController.getCurrentInsets();
                int iO3 = this.sideCalculator.O(currentInsets);
                if (iO3 == (scrollAmount > 0.0f ? iO2 : iO)) {
                    this.partialConsumption = 0.0f;
                    return Offset.INSTANCE.t();
                }
                float f3 = iO3 + scrollAmount + this.partialConsumption;
                int iCoerceIn = RangesKt.coerceIn(Math.round(f3), iO, iO2);
                this.partialConsumption = f3 - Math.round(f3);
                if (iCoerceIn != iO3) {
                    windowInsetsAnimationController.setInsetsAndAlpha(this.sideCalculator.t(currentInsets, iCoerceIn), 1.0f, 0.0f);
                }
                return this.sideCalculator.J2(available);
            }
        }
        return Offset.INSTANCE.t();
    }

    private final void xMQ() {
        WindowInsetsAnimationController windowInsetsAnimationController;
        WindowInsetsAnimationController windowInsetsAnimationController2 = this.animationController;
        if (windowInsetsAnimationController2 != null && windowInsetsAnimationController2.isReady() && (windowInsetsAnimationController = this.animationController) != null) {
            windowInsetsAnimationController.finish(this.windowInsets.Uo());
        }
        this.animationController = null;
        Pl pl = this.continuation;
        if (pl != null) {
            pl.r(null, new Function1<Throwable, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$animationEnded$1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }
            });
        }
        this.continuation = null;
        xuv xuvVar = this.animationJob;
        if (xuvVar != null) {
            xuvVar.cancel((CancellationException) new WindowInsetsAnimationCancelledException());
        }
        this.animationJob = null;
        this.partialConsumption = 0.0f;
        this.isControllerRequested = false;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public long F(long consumed, long available, int source) {
        return ty(available, this.sideCalculator.n(Float.intBitsToFloat((int) (available >> 32)), Float.intBitsToFloat((int) (4294967295L & available))));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public Object lS(long j2, Continuation continuation) {
        return gh(j2, this.sideCalculator.nr(Velocity.KN(j2), Velocity.xMQ(j2)), false, continuation);
    }

    public final void mUb() {
        Pl pl = this.continuation;
        if (pl != null) {
            pl.r(null, new Function1<Throwable, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$dispose$1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }
            });
        }
        xuv xuvVar = this.animationJob;
        if (xuvVar != null) {
            xuv.j.rl(xuvVar, null, 1, null);
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (windowInsetsAnimationController != null) {
            windowInsetsAnimationController.finish(!Intrinsics.areEqual(windowInsetsAnimationController.getCurrentInsets(), windowInsetsAnimationController.getHiddenStateInsets()));
        }
    }

    public void onReady(WindowInsetsAnimationController controller, int types) {
        this.animationController = controller;
        this.isControllerRequested = false;
        Pl pl = this.continuation;
        if (pl != null) {
            pl.r(controller, new Function1<Throwable, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.onReady.1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }
            });
        }
        this.continuation = null;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public long tEO(long available, int source) {
        return ty(available, this.sideCalculator.nr(Float.intBitsToFloat((int) (available >> 32)), Float.intBitsToFloat((int) (4294967295L & available))));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public Object z(long j2, long j3, Continuation continuation) {
        return gh(j3, this.sideCalculator.n(Velocity.KN(j3), Velocity.xMQ(j3)), true, continuation);
    }

    public WindowInsetsNestedScrollConnection(AndroidWindowInsets androidWindowInsets, View view, SideCalculator sideCalculator, Density density) {
        this.windowInsets = androidWindowInsets;
        this.view = view;
        this.sideCalculator = sideCalculator;
        this.density = density;
    }

    public void onCancelled(WindowInsetsAnimationController controller) {
        xMQ();
    }

    public void onFinished(WindowInsetsAnimationController controller) {
        xMQ();
    }
}
