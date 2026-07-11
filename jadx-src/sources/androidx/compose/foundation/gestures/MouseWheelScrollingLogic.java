package androidx.compose.foundation.gestures;

import GJW.Lu;
import GJW.N;
import GJW.Qik;
import GJW.vd;
import GJW.xuv;
import ILs.C;
import ILs.CN3;
import ILs.aC;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.MouseWheelScrollingLogic;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Velocity;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001dBR\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00121\u0010\r\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\f*\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J=\u0010\u0018\u001a\u00020\f*\u00020\u00022'\u0010\u0017\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0002\b\u0016H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\"\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\"\u001a\u0004\u0018\u00010!*\b\u0012\u0004\u0012\u00020!0 H\u0002¢\u0006\u0004\b\"\u0010#J\u001a\u0010$\u001a\u00020!*\b\u0012\u0004\u0012\u00020!0 H\u0082@¢\u0006\u0004\b$\u0010%J+\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)\"\u0004\b\u0000\u0010&2\u000e\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000'H\u0002¢\u0006\u0004\b*\u0010+J\u001e\u0010.\u001a\u00020\u001d*\u00020\u00022\u0006\u0010-\u001a\u00020,H\u0002ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\f2\u0006\u0010-\u001a\u00020!H\u0002¢\u0006\u0004\b0\u00101J,\u00105\u001a\u00020\f*\u00020\u00022\u0006\u0010-\u001a\u00020!2\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u000202H\u0082@¢\u0006\u0004\b5\u00106J[\u0010@\u001a\u00020\f*\u00020\u00152\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u000208072\u0006\u0010:\u001a\u0002022\u0006\u0010<\u001a\u00020;2!\u0010?\u001a\u001d\u0012\u0013\u0012\u001102¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(>\u0012\u0004\u0012\u00020\u001d0=H\u0082@¢\u0006\u0004\b@\u0010AJ\u001b\u0010C\u001a\u000202*\u00020\u00152\u0006\u0010B\u001a\u000202H\u0002¢\u0006\u0004\bC\u0010DJ\u0015\u0010E\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bE\u0010FJ(\u0010I\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010H\u001a\u00020G2\u0006\u0010\u001c\u001a\u00020\u001bø\u0001\u0000¢\u0006\u0004\bI\u0010JJ\u0015\u0010M\u001a\u00020\f2\u0006\u0010L\u001a\u00020K¢\u0006\u0004\bM\u0010NR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR?\u0010\r\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010[\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010\u001eR\u0018\u0010_\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010c\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006e"}, d2 = {"Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic;", "", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "scrollingLogic", "Landroidx/compose/foundation/gestures/ScrollConfig;", "mouseWheelScrollConfig", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Velocity;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "velocity", "Lkotlin/coroutines/Continuation;", "", "onScrollStopped", "Landroidx/compose/ui/unit/Density;", "density", "<init>", "(Landroidx/compose/foundation/gestures/ScrollingLogic;Landroidx/compose/foundation/gestures/ScrollConfig;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/unit/Density;)V", "Landroidx/compose/ui/input/pointer/PointerEvent;", "ck", "(Landroidx/compose/ui/input/pointer/PointerEvent;)V", "Landroidx/compose/foundation/gestures/NestedScrollScope;", "Lkotlin/ExtensionFunctionType;", "block", "g", "(Landroidx/compose/foundation/gestures/ScrollingLogic;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pointerEvent", "Landroidx/compose/ui/unit/IntSize;", "bounds", "", "Z", "(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z", "LILs/CN3;", "Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;", "WPU", "(LILs/CN3;)Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;", "ty", "(LILs/CN3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "E", "Lkotlin/Function0;", "builderAction", "Lkotlin/sequences/Sequence;", "ViF", "(Lkotlin/jvm/functions/Function0;)Lkotlin/sequences/Sequence;", "Landroidx/compose/ui/geometry/Offset;", "scrollDelta", "HI", "(Landroidx/compose/foundation/gestures/ScrollingLogic;J)Z", "aYN", "(Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;)V", "", "threshold", "speed", "r", "(Landroidx/compose/foundation/gestures/ScrollingLogic;Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;FFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/AnimationState;", "Landroidx/compose/animation/core/AnimationVector1D;", "animationState", "targetValue", "", "durationMillis", "Lkotlin/Function1;", "lastValue", "shouldCancelAnimation", "az", "(Landroidx/compose/foundation/gestures/NestedScrollScope;Landroidx/compose/animation/core/AnimationState;FILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delta", "Ik", "(Landroidx/compose/foundation/gestures/NestedScrollScope;F)F", "nY", "(Landroidx/compose/ui/unit/Density;)V", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "XQ", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "LGJW/vd;", "coroutineScope", "S", "(LGJW/vd;)V", c.f62177j, "Landroidx/compose/foundation/gestures/ScrollingLogic;", "rl", "Landroidx/compose/foundation/gestures/ScrollConfig;", "t", "Lkotlin/jvm/functions/Function2;", "nr", "Landroidx/compose/ui/unit/Density;", "O", "LILs/CN3;", "channel", "J2", "isScrolling", "LGJW/xuv;", "Uo", "LGJW/xuv;", "receivingMouseWheelEventsJob", "Landroidx/compose/foundation/gestures/MouseWheelVelocityTracker;", "KN", "Landroidx/compose/foundation/gestures/MouseWheelVelocityTracker;", "velocityTracker", "MouseWheelScrollDelta", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMouseWheelScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MouseWheelScrollable.kt\nandroidx/compose/foundation/gestures/MouseWheelScrollingLogic\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,363:1\n73#1:364\n102#2,2:365\n34#2,6:367\n104#2:373\n102#2,2:374\n34#2,6:376\n104#2:382\n34#2,6:383\n1#3:389\n*S KotlinDebug\n*F\n+ 1 MouseWheelScrollable.kt\nandroidx/compose/foundation/gestures/MouseWheelScrollingLogic\n*L\n63#1:364\n63#1:365,2\n63#1:367,6\n63#1:373\n73#1:374,2\n73#1:376,6\n73#1:382\n75#1:383,6\n*E\n"})
public final class MouseWheelScrollingLogic {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private boolean isScrolling;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private xuv receivingMouseWheelEventsJob;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ScrollingLogic scrollingLogic;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private Density density;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final ScrollConfig mouseWheelScrollConfig;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Function2 onScrollStopped;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final CN3 channel = aC.rl(Integer.MAX_VALUE, null, null, 6, null);

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final MouseWheelVelocityTracker velocityTracker = new MouseWheelVelocityTracker();

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;", "", "Landroidx/compose/ui/geometry/Offset;", "value", "", "timeMillis", "", "shouldApplyImmediately", "<init>", "(JJZLkotlin/jvm/internal/DefaultConstructorMarker;)V", InneractiveMediationNameConsts.OTHER, "J2", "(Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;)Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;", c.f62177j, "(JJZ)Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "equals", "(Ljava/lang/Object;)Z", "J", "O", "()J", "rl", "nr", "t", "Z", "()Z", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    static final /* data */ class MouseWheelScrollDelta {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final long value;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata and from toString */
        private final long timeMillis;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean shouldApplyImmediately;

        public /* synthetic */ MouseWheelScrollDelta(long j2, long j3, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j2, j3, z2);
        }

        public static /* synthetic */ MouseWheelScrollDelta rl(MouseWheelScrollDelta mouseWheelScrollDelta, long j2, long j3, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                j2 = mouseWheelScrollDelta.value;
            }
            long j4 = j2;
            if ((i2 & 2) != 0) {
                j3 = mouseWheelScrollDelta.timeMillis;
            }
            long j5 = j3;
            if ((i2 & 4) != 0) {
                z2 = mouseWheelScrollDelta.shouldApplyImmediately;
            }
            return mouseWheelScrollDelta.n(j4, j5, z2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MouseWheelScrollDelta)) {
                return false;
            }
            MouseWheelScrollDelta mouseWheelScrollDelta = (MouseWheelScrollDelta) other;
            return Offset.mUb(this.value, mouseWheelScrollDelta.value) && this.timeMillis == mouseWheelScrollDelta.timeMillis && this.shouldApplyImmediately == mouseWheelScrollDelta.shouldApplyImmediately;
        }

        public int hashCode() {
            return (((Offset.HI(this.value) * 31) + Long.hashCode(this.timeMillis)) * 31) + Boolean.hashCode(this.shouldApplyImmediately);
        }

        public final MouseWheelScrollDelta n(long value, long timeMillis, boolean shouldApplyImmediately) {
            return new MouseWheelScrollDelta(value, timeMillis, shouldApplyImmediately, null);
        }

        public String toString() {
            return "MouseWheelScrollDelta(value=" + ((Object) Offset.o(this.value)) + ", timeMillis=" + this.timeMillis + ", shouldApplyImmediately=" + this.shouldApplyImmediately + ')';
        }

        private MouseWheelScrollDelta(long j2, long j3, boolean z2) {
            this.value = j2;
            this.timeMillis = j3;
            this.shouldApplyImmediately = z2;
        }

        public final MouseWheelScrollDelta J2(MouseWheelScrollDelta other) {
            return new MouseWheelScrollDelta(Offset.Ik(this.value, other.value), Math.max(this.timeMillis, other.timeMillis), this.shouldApplyImmediately, null);
        }

        /* JADX INFO: renamed from: O, reason: from getter */
        public final long getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: nr, reason: from getter */
        public final long getTimeMillis() {
            return this.timeMillis;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final boolean getShouldApplyImmediately() {
            return this.shouldApplyImmediately;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float Ik(NestedScrollScope nestedScrollScope, float f3) {
        ScrollingLogic scrollingLogic = this.scrollingLogic;
        return scrollingLogic.e(scrollingLogic.ViF(nestedScrollScope.rl(scrollingLogic.X(scrollingLogic.aYN(f3)), NestedScrollSource.INSTANCE.rl())));
    }

    private final Sequence ViF(Function0 builderAction) {
        return SequencesKt.sequence(new MouseWheelScrollingLogic$untilNull$1(builderAction, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MouseWheelScrollDelta WPU(final CN3 cn3) {
        MouseWheelScrollDelta mouseWheelScrollDeltaJ2 = null;
        for (MouseWheelScrollDelta mouseWheelScrollDelta : ViF(new Function0<MouseWheelScrollDelta>() { // from class: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$sumOrNull$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final MouseWheelScrollingLogic.MouseWheelScrollDelta invoke() {
                return (MouseWheelScrollingLogic.MouseWheelScrollDelta) C.J2(cn3.O());
            }
        })) {
            mouseWheelScrollDeltaJ2 = mouseWheelScrollDeltaJ2 == null ? mouseWheelScrollDelta : mouseWheelScrollDeltaJ2.J2(mouseWheelScrollDelta);
        }
        return mouseWheelScrollDeltaJ2;
    }

    private final boolean Z(PointerEvent pointerEvent, long bounds) {
        long jT2 = this.mouseWheelScrollConfig.t(this.density, pointerEvent, bounds);
        if (HI(this.scrollingLogic, jT2)) {
            return C.gh(this.channel.nr(new MouseWheelScrollDelta(jT2, ((PointerInputChange) CollectionsKt.first(pointerEvent.getChanges())).getUptimeMillis(), !this.mouseWheelScrollConfig.n() || this.mouseWheelScrollConfig.rl(pointerEvent), null)));
        }
        return this.isScrolling;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void aYN(MouseWheelScrollDelta scrollDelta) {
        this.velocityTracker.n(scrollDelta.getTimeMillis(), scrollDelta.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object az(final NestedScrollScope nestedScrollScope, AnimationState animationState, float f3, int i2, final Function1 function1, Continuation continuation) {
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.element = ((Number) animationState.getValue()).floatValue();
        Object objMUb = SuspendAnimationKt.mUb(animationState, Boxing.boxFloat(f3), AnimationSpecKt.ty(i2, 0, EasingKt.O(), 2, null), true, new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$animateMouseWheelScroll$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                n(animationScope);
                return Unit.INSTANCE;
            }

            public final void n(AnimationScope animationScope) {
                float fFloatValue = ((Number) animationScope.O()).floatValue() - floatRef.element;
                if (!MouseWheelScrollableKt.nr(fFloatValue)) {
                    if (!MouseWheelScrollableKt.nr(fFloatValue - this.Ik(nestedScrollScope, fFloatValue))) {
                        animationScope.n();
                        return;
                    } else {
                        floatRef.element += fFloatValue;
                    }
                }
                if (((Boolean) function1.invoke(Float.valueOf(floatRef.element))).booleanValue()) {
                    animationScope.n();
                }
            }
        }, continuation);
        return objMUb == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMUb : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(ScrollingLogic scrollingLogic, Function2 function2, Continuation continuation) {
        MouseWheelScrollingLogic$userScroll$1 mouseWheelScrollingLogic$userScroll$1;
        MouseWheelScrollingLogic mouseWheelScrollingLogic;
        if (continuation instanceof MouseWheelScrollingLogic$userScroll$1) {
            mouseWheelScrollingLogic$userScroll$1 = (MouseWheelScrollingLogic$userScroll$1) continuation;
            int i2 = mouseWheelScrollingLogic$userScroll$1.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mouseWheelScrollingLogic$userScroll$1.J2 = i2 - Integer.MIN_VALUE;
            } else {
                mouseWheelScrollingLogic$userScroll$1 = new MouseWheelScrollingLogic$userScroll$1(this, continuation);
            }
        }
        Object obj = mouseWheelScrollingLogic$userScroll$1.f16963t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = mouseWheelScrollingLogic$userScroll$1.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            this.isScrolling = true;
            MouseWheelScrollingLogic$userScroll$2 mouseWheelScrollingLogic$userScroll$2 = new MouseWheelScrollingLogic$userScroll$2(scrollingLogic, function2, null);
            mouseWheelScrollingLogic$userScroll$1.f16962n = this;
            mouseWheelScrollingLogic$userScroll$1.J2 = 1;
            if (N.t(mouseWheelScrollingLogic$userScroll$2, mouseWheelScrollingLogic$userScroll$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            mouseWheelScrollingLogic = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mouseWheelScrollingLogic = (MouseWheelScrollingLogic) mouseWheelScrollingLogic$userScroll$1.f16962n;
            ResultKt.throwOnFailure(obj);
        }
        mouseWheelScrollingLogic.isScrolling = false;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, androidx.compose.foundation.gestures.MouseWheelScrollingLogic$MouseWheelScrollDelta] */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, androidx.compose.animation.core.AnimationState] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object o(MouseWheelScrollingLogic mouseWheelScrollingLogic, Ref.ObjectRef objectRef, Ref.FloatRef floatRef, ScrollingLogic scrollingLogic, Ref.ObjectRef objectRef2, long j2, Continuation continuation) {
        MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1 mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1;
        Ref.FloatRef floatRef2;
        ScrollingLogic scrollingLogic2;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        MouseWheelScrollingLogic mouseWheelScrollingLogic2 = mouseWheelScrollingLogic;
        if (continuation instanceof MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1) {
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1 = (MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1) continuation;
            int i2 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.f16947Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.f16947Z = i2 - Integer.MIN_VALUE;
            } else {
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1(continuation);
            }
        }
        Object objO = mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.f16949o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.f16947Z;
        boolean z2 = false;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objO);
            if (j2 < 0) {
                return Boxing.boxBoolean(false);
            }
            MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2 mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2(mouseWheelScrollingLogic2, null);
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.f16948n = mouseWheelScrollingLogic2;
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.f16951t = objectRef;
            floatRef2 = floatRef;
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.f16946O = floatRef2;
            scrollingLogic2 = scrollingLogic;
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.J2 = scrollingLogic2;
            objectRef3 = objectRef2;
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.f16950r = objectRef3;
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.f16947Z = 1;
            objO = Qik.O(j2, mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2, mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1);
            if (objO == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef4 = objectRef;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ref.ObjectRef objectRef5 = (Ref.ObjectRef) mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.f16950r;
            ScrollingLogic scrollingLogic3 = (ScrollingLogic) mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.J2;
            Ref.FloatRef floatRef3 = (Ref.FloatRef) mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.f16946O;
            objectRef4 = (Ref.ObjectRef) mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.f16951t;
            MouseWheelScrollingLogic mouseWheelScrollingLogic3 = (MouseWheelScrollingLogic) mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.f16948n;
            ResultKt.throwOnFailure(objO);
            objectRef3 = objectRef5;
            scrollingLogic2 = scrollingLogic3;
            floatRef2 = floatRef3;
            mouseWheelScrollingLogic2 = mouseWheelScrollingLogic3;
        }
        MouseWheelScrollDelta mouseWheelScrollDelta = (MouseWheelScrollDelta) objO;
        if (mouseWheelScrollDelta != null) {
            ?? Rl = MouseWheelScrollDelta.rl(mouseWheelScrollDelta, 0L, 0L, ((MouseWheelScrollDelta) objectRef4.element).getShouldApplyImmediately(), 3, null);
            objectRef4.element = Rl;
            floatRef2.element = scrollingLogic2.e(scrollingLogic2.ViF(Rl.getValue()));
            objectRef3.element = AnimationStateKt.t(0.0f, 0.0f, 0L, 0L, false, 30, null);
            mouseWheelScrollingLogic2.aYN(mouseWheelScrollDelta);
            z2 = !MouseWheelScrollableKt.nr(floatRef2.element);
        }
        return Boxing.boxBoolean(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0110, code lost:
    
        if (r0.invoke(r1, r9) == r10) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, androidx.compose.foundation.gestures.MouseWheelScrollingLogic$MouseWheelScrollDelta] */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, androidx.compose.animation.core.AnimationState] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(ScrollingLogic scrollingLogic, MouseWheelScrollDelta mouseWheelScrollDelta, float f3, float f4, Continuation continuation) {
        MouseWheelScrollingLogic$dispatchMouseWheelScroll$1 mouseWheelScrollingLogic$dispatchMouseWheelScroll$1;
        Ref.FloatRef floatRef;
        MouseWheelScrollingLogic mouseWheelScrollingLogic;
        float f5;
        ScrollingLogic scrollingLogic2;
        if (continuation instanceof MouseWheelScrollingLogic$dispatchMouseWheelScroll$1) {
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$1 = (MouseWheelScrollingLogic$dispatchMouseWheelScroll$1) continuation;
            int i2 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$1.f16927Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$1.f16927Z = i2 - Integer.MIN_VALUE;
            } else {
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$1 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$1(this, continuation);
            }
        }
        MouseWheelScrollingLogic$dispatchMouseWheelScroll$1 mouseWheelScrollingLogic$dispatchMouseWheelScroll$12 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$1;
        Object obj = mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.f16930r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.f16927Z;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = mouseWheelScrollDelta;
            aYN(mouseWheelScrollDelta);
            MouseWheelScrollDelta mouseWheelScrollDeltaWPU = WPU(this.channel);
            if (mouseWheelScrollDeltaWPU != null) {
                aYN(mouseWheelScrollDeltaWPU);
                objectRef.element = ((MouseWheelScrollDelta) objectRef.element).J2(mouseWheelScrollDeltaWPU);
            }
            Ref.FloatRef floatRef2 = new Ref.FloatRef();
            float fE2 = scrollingLogic.e(scrollingLogic.ViF(((MouseWheelScrollDelta) objectRef.element).getValue()));
            floatRef2.element = fE2;
            if (MouseWheelScrollableKt.nr(fE2)) {
                return Unit.INSTANCE;
            }
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = AnimationStateKt.t(0.0f, 0.0f, 0L, 0L, false, 30, null);
            MouseWheelScrollingLogic$dispatchMouseWheelScroll$3 mouseWheelScrollingLogic$dispatchMouseWheelScroll$3 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$3(floatRef2, objectRef2, objectRef, f3, this, f4, scrollingLogic, null);
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.f16928n = this;
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.f16931t = scrollingLogic;
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.f16926O = floatRef2;
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.J2 = f4;
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.f16927Z = 1;
            if (g(scrollingLogic, mouseWheelScrollingLogic$dispatchMouseWheelScroll$3, mouseWheelScrollingLogic$dispatchMouseWheelScroll$12) != coroutine_suspended) {
                floatRef = floatRef2;
                mouseWheelScrollingLogic = this;
                f5 = f4;
                scrollingLogic2 = scrollingLogic;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        f5 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.J2;
        floatRef = (Ref.FloatRef) mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.f16926O;
        scrollingLogic2 = (ScrollingLogic) mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.f16931t;
        mouseWheelScrollingLogic = (MouseWheelScrollingLogic) mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.f16928n;
        ResultKt.throwOnFailure(obj);
        long jRl = mouseWheelScrollingLogic.velocityTracker.rl();
        if (Velocity.Uo(jRl, Velocity.INSTANCE.n())) {
            jRl = scrollingLogic2.T(scrollingLogic2.aYN(Math.signum(floatRef.element)) * Math.min(Math.abs(floatRef.element) / 100, f5) * 1000);
        }
        Function2 function2 = mouseWheelScrollingLogic.onScrollStopped;
        Velocity velocityRl = Velocity.rl(jRl);
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.f16928n = null;
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.f16931t = null;
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.f16926O = null;
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.f16927Z = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object ty(CN3 cn3, Continuation continuation) {
        return Lu.J2(new MouseWheelScrollingLogic$busyReceive$2(cn3, null), continuation);
    }

    public final void S(vd coroutineScope) {
        if (this.receivingMouseWheelEventsJob == null) {
            this.receivingMouseWheelEventsJob = GJW.C.nr(coroutineScope, null, null, new MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1(this, null), 3, null);
        }
    }

    public final void XQ(PointerEvent pointerEvent, PointerEventPass pass, long bounds) {
        if (pass == PointerEventPass.f32080t && PointerEventType.mUb(pointerEvent.getType(), PointerEventType.INSTANCE.J2())) {
            List changes = pointerEvent.getChanges();
            int size = changes.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((PointerInputChange) changes.get(i2)).ck()) {
                    return;
                }
            }
            if (Z(pointerEvent, bounds)) {
                ck(pointerEvent);
            }
        }
    }

    public final void nY(Density density) {
        this.density = density;
    }

    public MouseWheelScrollingLogic(ScrollingLogic scrollingLogic, ScrollConfig scrollConfig, Function2 function2, Density density) {
        this.scrollingLogic = scrollingLogic;
        this.mouseWheelScrollConfig = scrollConfig;
        this.onScrollStopped = function2;
        this.density = density;
    }

    private final boolean HI(ScrollingLogic scrollingLogic, long j2) {
        float fE2 = scrollingLogic.e(scrollingLogic.ViF(j2));
        if (fE2 == 0.0f) {
            return false;
        }
        if (fE2 > 0.0f) {
            return scrollingLogic.getScrollableState().J2();
        }
        return scrollingLogic.getScrollableState().nr();
    }

    private final void ck(PointerEvent pointerEvent) {
        List changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((PointerInputChange) changes.get(i2)).n();
        }
    }
}
