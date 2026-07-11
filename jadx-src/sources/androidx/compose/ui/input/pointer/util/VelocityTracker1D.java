package androidx.compose.ui.input.pointer.util;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0001/B\u001d\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001e\u001a\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010 R\u0014\u0010\"\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010!R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010%R\u0016\u0010'\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010!R\u0014\u0010*\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)R\u0014\u0010.\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010)¨\u00060"}, d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker1D;", "", "", "isDataDifferential", "Landroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;", "strategy", "<init>", "(ZLandroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;)V", "(Z)V", "", "dataPoints", "time", "", "sampleCount", "", "rl", "([F[FI)F", "", "timeMillis", "dataPoint", "", c.f62177j, "(JF)V", "t", "()F", "maximumVelocity", "nr", "(F)F", "O", "()V", "Z", "()Z", "Landroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;", "I", "minSampleSize", "", "Landroidx/compose/ui/input/pointer/util/DataPointAtTime;", "[Landroidx/compose/ui/input/pointer/util/DataPointAtTime;", "samples", "index", "J2", "[F", "reusableDataPointsArray", "Uo", "reusableTimeArray", "KN", "reusableVelocityCoefficients", "Strategy", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVelocityTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTracker1D\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,706:1\n56#2,5:707\n*S KotlinDebug\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTracker1D\n*L\n290#1:707,5\n*E\n"})
public final class VelocityTracker1D {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final float[] reusableDataPointsArray;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final float[] reusableVelocityCoefficients;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private int index;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final float[] reusableTimeArray;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean isDataDifferential;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final DataPointAtTime[] samples;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Strategy strategy;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int minSampleSize;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Strategy {
        private static final /* synthetic */ EnumEntries J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final /* synthetic */ Strategy[] f32178O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Strategy f32179n = new Strategy("Lsq2", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final Strategy f32180t = new Strategy("Impulse", 1);

        private static final /* synthetic */ Strategy[] n() {
            return new Strategy[]{f32179n, f32180t};
        }

        public static Strategy valueOf(String str) {
            return (Strategy) Enum.valueOf(Strategy.class, str);
        }

        public static Strategy[] values() {
            return (Strategy[]) f32178O.clone();
        }

        static {
            Strategy[] strategyArrN = n();
            f32178O = strategyArrN;
            J2 = EnumEntriesKt.enumEntries(strategyArrN);
        }

        private Strategy(String str, int i2) {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Strategy.values().length];
            try {
                iArr[Strategy.f32180t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Strategy.f32179n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VelocityTracker1D(boolean z2, Strategy strategy) {
        this.isDataDifferential = z2;
        this.strategy = strategy;
        if (z2 && strategy.equals(Strategy.f32179n)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[strategy.ordinal()];
        int i3 = 2;
        if (i2 != 1) {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i3 = 3;
        }
        this.minSampleSize = i3;
        this.samples = new DataPointAtTime[20];
        this.reusableDataPointsArray = new float[20];
        this.reusableTimeArray = new float[20];
        this.reusableVelocityCoefficients = new float[3];
    }

    public final float nr(float maximumVelocity) {
        if (!(maximumVelocity > 0.0f)) {
            InlineClassHelperKt.t("maximumVelocity should be a positive value. You specified=" + maximumVelocity);
        }
        float fT = t();
        if (fT == 0.0f || Float.isNaN(fT)) {
            return 0.0f;
        }
        return fT > 0.0f ? RangesKt.coerceAtMost(fT, maximumVelocity) : RangesKt.coerceAtLeast(fT, -maximumVelocity);
    }

    private final float rl(float[] dataPoints, float[] time, int sampleCount) {
        try {
            return VelocityTrackerKt.xMQ(time, dataPoints, sampleCount, 2, this.reusableVelocityCoefficients)[1];
        } catch (IllegalArgumentException unused) {
            return 0.0f;
        }
    }

    public final void O() {
        ArraysKt.fill$default(this.samples, (Object) null, 0, 0, 6, (Object) null);
        this.index = 0;
    }

    public final void n(long timeMillis, float dataPoint) {
        int i2 = (this.index + 1) % 20;
        this.index = i2;
        VelocityTrackerKt.mUb(this.samples, i2, timeMillis, dataPoint);
    }

    public final float t() {
        float fJ2;
        float[] fArr = this.reusableDataPointsArray;
        float[] fArr2 = this.reusableTimeArray;
        int i2 = this.index;
        DataPointAtTime dataPointAtTime = this.samples[i2];
        if (dataPointAtTime == null) {
            return 0.0f;
        }
        int i3 = 0;
        DataPointAtTime dataPointAtTime2 = dataPointAtTime;
        while (true) {
            DataPointAtTime dataPointAtTime3 = this.samples[i2];
            if (dataPointAtTime3 == null) {
                break;
            }
            float time = dataPointAtTime.getTime() - dataPointAtTime3.getTime();
            float fAbs = Math.abs(dataPointAtTime3.getTime() - dataPointAtTime2.getTime());
            DataPointAtTime dataPointAtTime4 = (this.strategy == Strategy.f32179n || this.isDataDifferential) ? dataPointAtTime3 : dataPointAtTime;
            if (time > 100.0f || fAbs > 40.0f) {
                break;
            }
            fArr[i3] = dataPointAtTime3.getDataPoint();
            fArr2[i3] = -time;
            if (i2 == 0) {
                i2 = 20;
            }
            i2--;
            i3++;
            if (i3 >= 20) {
                break;
            }
            dataPointAtTime2 = dataPointAtTime4;
        }
        if (i3 < this.minSampleSize) {
            return 0.0f;
        }
        int i5 = WhenMappings.$EnumSwitchMapping$0[this.strategy.ordinal()];
        if (i5 == 1) {
            fJ2 = VelocityTrackerKt.J2(fArr, fArr2, i3, this.isDataDifferential);
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            fJ2 = rl(fArr, fArr2, i3);
        }
        return fJ2 * 1000;
    }

    public /* synthetic */ VelocityTracker1D(boolean z2, Strategy strategy, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z2, (i2 & 2) != 0 ? Strategy.f32179n : strategy);
    }

    public VelocityTracker1D(boolean z2) {
        this(z2, Strategy.f32180t);
    }
}
