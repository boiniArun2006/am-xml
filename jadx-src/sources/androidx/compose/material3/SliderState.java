package androidx.compose.material3;

import GJW.Lu;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\u000b\u0010\fJA\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2'\u0010\u0014\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000f¢\u0006\u0002\b\u0013H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001eH\u0000ø\u0001\u0000¢\u0006\u0004\b \u0010!J'\u0010%\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0002H\u0002¢\u0006\u0004\b%\u0010&J'\u0010(\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0002H\u0002¢\u0006\u0004\b(\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010)\u001a\u0004\b*\u0010+R*\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R+\u0010;\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010\u0019R0\u0010C\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010<8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001a\u0010I\u001a\u00020D8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR+\u0010O\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010+\"\u0004\bM\u0010NR\"\u0010V\u001a\u00020P8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bQ\u00108\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR+\u0010Y\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b?\u00107\u001a\u0004\bW\u00109\"\u0004\bX\u0010\u0019R+\u0010\\\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b-\u00107\u001a\u0004\bZ\u00109\"\u0004\b[\u0010\u0019R+\u0010a\u001a\u00020P2\u0006\u00105\u001a\u00020P8@@BX\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010S\"\u0004\b`\u0010UR \u0010c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\bb\u0010,\u001a\u0004\bQ\u0010.R+\u0010e\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b*\u00107\u001a\u0004\bb\u00109\"\u0004\bd\u0010\u0019R+\u0010g\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bZ\u00107\u001a\u0004\b]\u00109\"\u0004\bf\u0010\u0019R\u0014\u0010i\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010hR\u0014\u0010l\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010kR$\u0010\u0003\u001a\u00020\u00022\u0006\u0010m\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bn\u00109\"\u0004\bo\u0010\u0019R\u0014\u0010p\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bJ\u00109\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006q"}, d2 = {"Landroidx/compose/material3/SliderState;", "Landroidx/compose/foundation/gestures/DraggableState;", "", "value", "", "steps", "Lkotlin/Function0;", "", "onValueChangeFinished", "Lkotlin/ranges/ClosedFloatingPointRange;", "valueRange", "<init>", "(FILkotlin/jvm/functions/Function0;Lkotlin/ranges/ClosedFloatingPointRange;)V", "Landroidx/compose/foundation/MutatePriority;", "dragPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/DragScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", c.f62177j, "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delta", "rl", "(F)V", "newTrackHeight", "newTotalWidth", "s7N", "(FI)V", "Landroidx/compose/ui/geometry/Offset;", "pos", "WPU", "(J)V", "minPx", "maxPx", "offset", "ViF", "(FFF)F", "userValue", "aYN", "I", "az", "()I", "Lkotlin/jvm/functions/Function0;", "mUb", "()Lkotlin/jvm/functions/Function0;", "te", "(Lkotlin/jvm/functions/Function0;)V", "t", "Lkotlin/ranges/ClosedFloatingPointRange;", "o", "()Lkotlin/ranges/ClosedFloatingPointRange;", "<set-?>", "nr", "Landroidx/compose/runtime/MutableFloatState;", "Z", "()F", "nHg", "valueState", "Lkotlin/Function1;", "O", "Lkotlin/jvm/functions/Function1;", "xMQ", "()Lkotlin/jvm/functions/Function1;", "g", "(Lkotlin/jvm/functions/Function1;)V", "onValueChange", "", "J2", "[F", "HI", "()[F", "tickFractions", "Uo", "Landroidx/compose/runtime/MutableIntState;", "ck", "X", "(I)V", "totalWidth", "", "KN", "S", "()Z", "E2", "(Z)V", "isRtl", "Ik", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "trackHeight", "ty", "e", "thumbWidth", "gh", "Landroidx/compose/runtime/MutableState;", "XQ", "nY", "isDragging", "qie", "gestureEndAction", "fD", "rawOffset", "iF", "pressOffset", "Landroidx/compose/foundation/gestures/DragScope;", "dragScope", "Landroidx/compose/foundation/MutatorMutex;", "Landroidx/compose/foundation/MutatorMutex;", "scrollMutex", "newVal", "r", "N", "coercedValueAsFraction", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderState\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2263:1\n76#2:2264\n109#2,2:2265\n76#2:2271\n109#2,2:2272\n76#2:2274\n109#2,2:2275\n76#2:2280\n109#2,2:2281\n76#2:2283\n109#2,2:2284\n1#3:2267\n75#4:2268\n108#4,2:2269\n81#5:2277\n107#5,2:2278\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderState\n*L\n1948#1:2264\n1948#1:2265,2\n1998#1:2271\n1998#1:2272,2\n1999#1:2274\n1999#1:2275,2\n2029#1:2280\n2029#1:2281,2\n2030#1:2283\n2030#1:2284,2\n1996#1:2268\n1996#1:2269,2\n2009#1:2277\n2009#1:2278,2\n*E\n"})
public final class SliderState implements DraggableState {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final float[] tickFractions;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private boolean isRtl;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private Function1 onValueChange;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final MutableFloatState rawOffset;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int steps;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final MutableFloatState valueState;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private Function0 onValueChangeFinished;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final ClosedFloatingPointRange valueRange;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final MutableIntState totalWidth = SnapshotIntStateKt.n(0);

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final MutableFloatState trackHeight = PrimitiveSnapshotStateKt.n(0.0f);

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final MutableFloatState thumbWidth = PrimitiveSnapshotStateKt.n(0.0f);

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final MutableState isDragging = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final Function0 gestureEndAction = new Function0<Unit>() { // from class: androidx.compose.material3.SliderState$gestureEndAction$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Function0 onValueChangeFinished;
            if (this.f27821n.XQ() || (onValueChangeFinished = this.f27821n.getOnValueChangeFinished()) == null) {
                return;
            }
            onValueChangeFinished.invoke();
        }
    };

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private final MutableFloatState pressOffset = PrimitiveSnapshotStateKt.n(0.0f);

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private final DragScope dragScope = new DragScope() { // from class: androidx.compose.material3.SliderState$dragScope$1
        @Override // androidx.compose.foundation.gestures.DragScope
        public void n(float pixels) {
            this.f27820n.rl(pixels);
        }
    };

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private final MutatorMutex scrollMutex = new MutatorMutex();

    /* JADX WARN: Multi-variable type inference failed */
    private final float ViF(float minPx, float maxPx, float offset) {
        return SliderKt.te(minPx, maxPx, offset, ((Number) this.valueRange.getStart()).floatValue(), ((Number) this.valueRange.getEndInclusive()).floatValue());
    }

    private final void X(int i2) {
        this.totalWidth.KN(i2);
    }

    private final float Z() {
        return this.valueState.n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final float aYN(float minPx, float maxPx, float userValue) {
        return SliderKt.te(((Number) this.valueRange.getStart()).floatValue(), ((Number) this.valueRange.getEndInclusive()).floatValue(), userValue, minPx, maxPx);
    }

    private final int ck() {
        return this.totalWidth.J2();
    }

    private final void fD(float f3) {
        this.rawOffset.Z(f3);
    }

    private final float gh() {
        return this.pressOffset.n();
    }

    private final void iF(float f3) {
        this.pressOffset.Z(f3);
    }

    private final void nHg(float f3) {
        this.valueState.Z(f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void nY(boolean z2) {
        this.isDragging.setValue(Boolean.valueOf(z2));
    }

    private final float qie() {
        return this.rawOffset.n();
    }

    public final void E2(boolean z2) {
        this.isRtl = z2;
    }

    /* JADX INFO: renamed from: HI, reason: from getter */
    public final float[] getTickFractions() {
        return this.tickFractions;
    }

    public final float Ik() {
        return this.trackHeight.n();
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final Function0 getGestureEndAction() {
        return this.gestureEndAction;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void N(float f3) {
        nHg(SliderKt.e(RangesKt.coerceIn(f3, ((Number) this.valueRange.getStart()).floatValue(), ((Number) this.valueRange.getEndInclusive()).floatValue()), this.tickFractions, ((Number) this.valueRange.getStart()).floatValue(), ((Number) this.valueRange.getEndInclusive()).floatValue()));
    }

    /* JADX INFO: renamed from: S, reason: from getter */
    public final boolean getIsRtl() {
        return this.isRtl;
    }

    public final void T(float f3) {
        this.trackHeight.Z(f3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float Uo() {
        return SliderKt.S(((Number) this.valueRange.getStart()).floatValue(), ((Number) this.valueRange.getEndInclusive()).floatValue(), RangesKt.coerceIn(r(), ((Number) this.valueRange.getStart()).floatValue(), ((Number) this.valueRange.getEndInclusive()).floatValue()));
    }

    public final void WPU(long pos) {
        iF((this.isRtl ? ck() - Offset.az(pos) : Offset.az(pos)) - qie());
    }

    public final boolean XQ() {
        return ((Boolean) this.isDragging.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: az, reason: from getter */
    public final int getSteps() {
        return this.steps;
    }

    public final void e(float f3) {
        this.thumbWidth.Z(f3);
    }

    public final void g(Function1 function1) {
        this.onValueChange = function1;
    }

    /* JADX INFO: renamed from: mUb, reason: from getter */
    public final Function0 getOnValueChangeFinished() {
        return this.onValueChangeFinished;
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public Object n(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        Object objJ2 = Lu.J2(new SliderState$drag$2(this, mutatePriority, function2, null), continuation);
        return objJ2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJ2 : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final ClosedFloatingPointRange getValueRange() {
        return this.valueRange;
    }

    public final void te(Function0 function0) {
        this.onValueChangeFinished = function0;
    }

    public final float ty() {
        return this.thumbWidth.n();
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final Function1 getOnValueChange() {
        return this.onValueChange;
    }

    public SliderState(float f3, int i2, Function0 function0, ClosedFloatingPointRange closedFloatingPointRange) {
        this.steps = i2;
        this.onValueChangeFinished = function0;
        this.valueRange = closedFloatingPointRange;
        this.valueState = PrimitiveSnapshotStateKt.n(f3);
        this.tickFractions = SliderKt.X(i2);
        this.rawOffset = PrimitiveSnapshotStateKt.n(aYN(0.0f, 0.0f, f3));
    }

    public final float r() {
        return Z();
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public void rl(float delta) {
        float f3 = 2;
        float fMax = Math.max(ck() - (ty() / f3), 0.0f);
        float fMin = Math.min(ty() / f3, fMax);
        fD(qie() + delta + gh());
        iF(0.0f);
        float fViF = ViF(fMin, fMax, SliderKt.e(qie(), this.tickFractions, fMin, fMax));
        if (fViF == r()) {
            return;
        }
        Function1 function1 = this.onValueChange;
        if (function1 != null) {
            if (function1 != null) {
                function1.invoke(Float.valueOf(fViF));
                return;
            }
            return;
        }
        N(fViF);
    }

    public final void s7N(float newTrackHeight, int newTotalWidth) {
        T(newTrackHeight);
        X(newTotalWidth);
    }
}
