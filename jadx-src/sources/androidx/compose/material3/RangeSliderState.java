package androidx.compose.material3;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b.\b\u0007\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J*\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0017H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R*\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R+\u00101\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.\"\u0004\b/\u00100R+\u00104\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010-\u001a\u0004\b!\u0010.\"\u0004\b3\u00100R0\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\b\u0018\u0001058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001a\u0010B\u001a\u00020=8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR+\u0010F\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bC\u0010-\u001a\u0004\bD\u0010.\"\u0004\bE\u00100R+\u0010J\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bG\u0010-\u001a\u0004\bH\u0010.\"\u0004\bI\u00100R+\u0010M\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bK\u0010-\u001a\u0004\bC\u0010.\"\u0004\bL\u00100R+\u0010S\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u00058@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010 \"\u0004\bQ\u0010RR+\u0010V\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010-\u001a\u0004\bT\u0010.\"\u0004\bU\u00100R+\u0010Y\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010-\u001a\u0004\bW\u0010.\"\u0004\bX\u00100R+\u0010_\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u000e8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bW\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R&\u0010`\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b058\u0000X\u0080\u0004¢\u0006\f\n\u0004\bT\u00107\u001a\u0004\bG\u00109R+\u0010\u0016\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\ba\u0010-\u001a\u0004\bK\u0010.\"\u0004\bb\u00100R+\u0010\u0015\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bH\u0010-\u001a\u0004\bN\u0010.\"\u0004\bc\u00100R$\u0010\u0003\u001a\u00020\u00022\u0006\u0010d\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010.\"\u0004\be\u00100R$\u0010\u0004\u001a\u00020\u00022\u0006\u0010d\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010.\"\u0004\bf\u00100R\u0014\u0010g\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b6\u0010.R\u0014\u0010h\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b2\u0010.R\u0014\u0010i\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\ba\u0010 R\u0014\u0010j\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b>\u0010 \u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006k"}, d2 = {"Landroidx/compose/material3/RangeSliderState;", "", "", "activeRangeStart", "activeRangeEnd", "", "steps", "Lkotlin/Function0;", "", "onValueChangeFinished", "Lkotlin/ranges/ClosedFloatingPointRange;", "valueRange", "<init>", "(FFILkotlin/jvm/functions/Function0;Lkotlin/ranges/ClosedFloatingPointRange;)V", "", "isStart", "offset", "aYN", "(ZF)V", "Xw", "()V", "minPx", "maxPx", "Landroidx/compose/material3/SliderRange;", "nY", "(FFJ)J", "userValue", "ViF", "(FFF)F", c.f62177j, "I", "r", "()I", "rl", "Lkotlin/jvm/functions/Function0;", "az", "()Lkotlin/jvm/functions/Function0;", "N", "(Lkotlin/jvm/functions/Function0;)V", "t", "Lkotlin/ranges/ClosedFloatingPointRange;", "S", "()Lkotlin/ranges/ClosedFloatingPointRange;", "<set-?>", "nr", "Landroidx/compose/runtime/MutableFloatState;", "()F", "fD", "(F)V", "activeRangeStartState", "O", "te", "activeRangeEndState", "Lkotlin/Function1;", "J2", "Lkotlin/jvm/functions/Function1;", "qie", "()Lkotlin/jvm/functions/Function1;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "(Lkotlin/jvm/functions/Function1;)V", "onValueChange", "", "Uo", "[F", "o", "()[F", "tickFractions", "KN", "XQ", "bzg", "trackHeight", "xMQ", "Ik", "v", "startThumbWidth", "mUb", "E2", "endThumbWidth", "gh", "Landroidx/compose/runtime/MutableIntState;", "Z", "rV9", "(I)V", "totalWidth", "HI", "s7N", "rawOffsetStart", "ty", "nHg", "rawOffsetEnd", "Landroidx/compose/runtime/MutableState;", "WPU", "()Z", "wTp", "(Z)V", "isRtl", "gestureEndAction", "ck", "e", "X", "newVal", "iF", "g", "coercedActiveRangeStartAsFraction", "coercedActiveRangeEndAsFraction", "startSteps", "endSteps", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/RangeSliderState\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 3 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2263:1\n76#2:2264\n109#2,2:2265\n76#2:2267\n109#2,2:2268\n76#2:2270\n109#2,2:2271\n76#2:2273\n109#2,2:2274\n76#2:2276\n109#2,2:2277\n76#2:2282\n109#2,2:2283\n76#2:2285\n109#2,2:2286\n76#2:2291\n109#2,2:2292\n76#2:2294\n109#2,2:2295\n75#3:2279\n108#3,2:2280\n81#4:2288\n107#4,2:2289\n1#5:2297\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/RangeSliderState\n*L\n2069#1:2264\n2069#1:2265,2\n2070#1:2267\n2070#1:2268,2\n2106#1:2270\n2106#1:2271,2\n2107#1:2273\n2107#1:2274,2\n2108#1:2276\n2108#1:2277,2\n2110#1:2282\n2110#1:2283,2\n2111#1:2285\n2111#1:2286,2\n2117#1:2291\n2117#1:2292,2\n2118#1:2294\n2118#1:2295,2\n2109#1:2279\n2109#1:2280,2\n2113#1:2288\n2113#1:2289,2\n*E\n"})
public final class RangeSliderState {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private Function1 onValueChange;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final MutableFloatState activeRangeEndState;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final float[] tickFractions;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int steps;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final MutableFloatState activeRangeStartState;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private Function0 onValueChangeFinished;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final ClosedFloatingPointRange valueRange;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final MutableFloatState trackHeight = PrimitiveSnapshotStateKt.n(0.0f);

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final MutableFloatState startThumbWidth = PrimitiveSnapshotStateKt.n(0.0f);

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final MutableFloatState endThumbWidth = PrimitiveSnapshotStateKt.n(0.0f);

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final MutableIntState totalWidth = SnapshotIntStateKt.n(0);

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final MutableFloatState rawOffsetStart = PrimitiveSnapshotStateKt.n(0.0f);

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final MutableFloatState rawOffsetEnd = PrimitiveSnapshotStateKt.n(0.0f);

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private final MutableState isRtl = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private final Function1 gestureEndAction = new Function1<Boolean, Unit>() { // from class: androidx.compose.material3.RangeSliderState$gestureEndAction$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z2) {
            Function0 onValueChangeFinished = this.f27166n.getOnValueChangeFinished();
            if (onValueChangeFinished != null) {
                onValueChangeFinished.invoke();
            }
        }
    };

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private final MutableFloatState maxPx = PrimitiveSnapshotStateKt.n(0.0f);

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private final MutableFloatState minPx = PrimitiveSnapshotStateKt.n(0.0f);

    /* JADX WARN: Multi-variable type inference failed */
    private final float ViF(float minPx, float maxPx, float userValue) {
        return SliderKt.te(((Number) this.valueRange.getStart()).floatValue(), ((Number) this.valueRange.getEndInclusive()).floatValue(), userValue, minPx, maxPx);
    }

    private final void X(float f3) {
        this.minPx.Z(f3);
    }

    private final void e(float f3) {
        this.maxPx.Z(f3);
    }

    private final void fD(float f3) {
        this.activeRangeStartState.Z(f3);
    }

    private final float gh() {
        return this.minPx.n();
    }

    private final float mUb() {
        return this.maxPx.n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long nY(float minPx, float maxPx, long offset) {
        return SliderKt.iF(minPx, maxPx, offset, ((Number) this.valueRange.getStart()).floatValue(), ((Number) this.valueRange.getEndInclusive()).floatValue());
    }

    private final float nr() {
        return this.activeRangeStartState.n();
    }

    private final float rl() {
        return this.activeRangeEndState.n();
    }

    private final void te(float f3) {
        this.activeRangeEndState.Z(f3);
    }

    public final void E2(float f3) {
        this.endThumbWidth.Z(f3);
    }

    public final float HI() {
        return this.rawOffsetStart.n();
    }

    public final float Ik() {
        return this.startThumbWidth.n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float J2() {
        return SliderKt.S(((Number) this.valueRange.getStart()).floatValue(), ((Number) this.valueRange.getEndInclusive()).floatValue(), t());
    }

    public final float KN() {
        return this.endThumbWidth.n();
    }

    public final void N(Function0 function0) {
        this.onValueChangeFinished = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float O() {
        return SliderKt.S(((Number) this.valueRange.getStart()).floatValue(), ((Number) this.valueRange.getEndInclusive()).floatValue(), n());
    }

    /* JADX INFO: renamed from: S, reason: from getter */
    public final ClosedFloatingPointRange getValueRange() {
        return this.valueRange;
    }

    public final void T(Function1 function1) {
        this.onValueChange = function1;
    }

    public final int Uo() {
        return (int) Math.floor(this.steps * (1.0f - J2()));
    }

    public final boolean WPU() {
        return ((Boolean) this.isRtl.getValue()).booleanValue();
    }

    public final float XQ() {
        return this.trackHeight.n();
    }

    public final int Z() {
        return this.totalWidth.J2();
    }

    public final void aYN(boolean isStart, float offset) {
        long jXMQ;
        if (isStart) {
            s7N(HI() + offset);
            nHg(ViF(gh(), mUb(), n()));
            float fTy = ty();
            jXMQ = SliderKt.xMQ(SliderKt.e(RangesKt.coerceIn(HI(), gh(), fTy), this.tickFractions, gh(), mUb()), fTy);
        } else {
            nHg(ty() + offset);
            s7N(ViF(gh(), mUb(), t()));
            float fHI = HI();
            jXMQ = SliderKt.xMQ(fHI, SliderKt.e(RangesKt.coerceIn(ty(), fHI, mUb()), this.tickFractions, gh(), mUb()));
        }
        long jNY = nY(gh(), mUb(), jXMQ);
        if (SliderRange.O(jNY, SliderKt.xMQ(t(), n()))) {
            return;
        }
        Function1 function1 = this.onValueChange;
        if (function1 == null) {
            iF(SliderRange.Uo(jNY));
            g(SliderRange.J2(jNY));
        } else if (function1 != null) {
            function1.invoke(SliderRange.rl(jNY));
        }
    }

    /* JADX INFO: renamed from: az, reason: from getter */
    public final Function0 getOnValueChangeFinished() {
        return this.onValueChangeFinished;
    }

    public final void bzg(float f3) {
        this.trackHeight.Z(f3);
    }

    public final int ck() {
        return (int) Math.floor(this.steps * O());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void iF(float f3) {
        fD(SliderKt.e(RangesKt.coerceIn(f3, ((Number) this.valueRange.getStart()).floatValue(), n()), this.tickFractions, ((Number) this.valueRange.getStart()).floatValue(), ((Number) this.valueRange.getEndInclusive()).floatValue()));
    }

    public final void nHg(float f3) {
        this.rawOffsetEnd.Z(f3);
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final float[] getTickFractions() {
        return this.tickFractions;
    }

    /* JADX INFO: renamed from: qie, reason: from getter */
    public final Function1 getOnValueChange() {
        return this.onValueChange;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final int getSteps() {
        return this.steps;
    }

    public final void rV9(int i2) {
        this.totalWidth.KN(i2);
    }

    public final void s7N(float f3) {
        this.rawOffsetStart.Z(f3);
    }

    public final float ty() {
        return this.rawOffsetEnd.n();
    }

    public final void v(float f3) {
        this.startThumbWidth.Z(f3);
    }

    public final void wTp(boolean z2) {
        this.isRtl.setValue(Boolean.valueOf(z2));
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final Function1 getGestureEndAction() {
        return this.gestureEndAction;
    }

    public RangeSliderState(float f3, float f4, int i2, Function0 function0, ClosedFloatingPointRange closedFloatingPointRange) {
        this.steps = i2;
        this.onValueChangeFinished = function0;
        this.valueRange = closedFloatingPointRange;
        this.activeRangeStartState = PrimitiveSnapshotStateKt.n(f3);
        this.activeRangeEndState = PrimitiveSnapshotStateKt.n(f4);
        this.tickFractions = SliderKt.X(i2);
    }

    public final void Xw() {
        float f3 = 2;
        float fMax = Math.max(Z() - (KN() / f3), 0.0f);
        float fMin = Math.min(Ik() / f3, fMax);
        if (gh() == fMin && mUb() == fMax) {
            return;
        }
        X(fMin);
        e(fMax);
        s7N(ViF(gh(), mUb(), t()));
        nHg(ViF(gh(), mUb(), n()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(float f3) {
        te(SliderKt.e(RangesKt.coerceIn(f3, t(), ((Number) this.valueRange.getEndInclusive()).floatValue()), this.tickFractions, ((Number) this.valueRange.getStart()).floatValue(), ((Number) this.valueRange.getEndInclusive()).floatValue()));
    }

    public final float n() {
        return rl();
    }

    public final float t() {
        return nr();
    }
}
