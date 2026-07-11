package androidx.compose.material3.carousel;

import androidx.collection.FloatList;
import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 82\u00020\u0001:\u00019BM\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rB1\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u000eJ)\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b#\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001f\u0010%R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010%R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010%R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010$\u001a\u0004\b)\u0010%R\u0014\u0010+\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010$R\u0014\u0010,\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010$R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00102\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010/R\u0017\u00106\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b.\u00105R\u0011\u00107\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b&\u0010%¨\u0006:"}, d2 = {"Landroidx/compose/material3/carousel/Strategy;", "", "Landroidx/compose/material3/carousel/KeylineList;", "defaultKeylines", "", "startKeylineSteps", "endKeylineSteps", "", "availableSpace", "itemSpacing", "beforeContentPadding", "afterContentPadding", "<init>", "(Landroidx/compose/material3/carousel/KeylineList;Ljava/util/List;Ljava/util/List;FFFF)V", "(Landroidx/compose/material3/carousel/KeylineList;FFFF)V", "scrollOffset", "maxScrollOffset", "", "roundToNearestStep", "Uo", "(FFZ)Landroidx/compose/material3/carousel/KeylineList;", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", c.f62177j, "Landroidx/compose/material3/carousel/KeylineList;", "t", "()Landroidx/compose/material3/carousel/KeylineList;", "rl", "Ljava/util/List;", "xMQ", "()Ljava/util/List;", "nr", "F", "()F", "O", "J2", "getBeforeContentPadding", "getAfterContentPadding", "KN", "startShiftDistance", "endShiftDistance", "Landroidx/collection/FloatList;", "mUb", "Landroidx/collection/FloatList;", "startShiftPoints", "gh", "endShiftPoints", "qie", "Z", "()Z", "isValid", "itemMainAxisSize", "az", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Strategy {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final float beforeContentPadding;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final float startShiftDistance;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final float itemSpacing;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final float afterContentPadding;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final FloatList endShiftPoints;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final FloatList startShiftPoints;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final KeylineList defaultKeylines;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final float availableSpace;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final boolean isValid;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final List startKeylineSteps;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final List endKeylineSteps;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final float endShiftDistance;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int ty = 8;
    private static final Strategy HI = new Strategy(KeylineListKt.n(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), 0.0f, 0.0f, 0.0f, 0.0f);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/material3/carousel/Strategy$Companion;", "", "<init>", "()V", "Landroidx/compose/material3/carousel/Strategy;", "Empty", "Landroidx/compose/material3/carousel/Strategy;", c.f62177j, "()Landroidx/compose/material3/carousel/Strategy;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Strategy n() {
            return Strategy.HI;
        }
    }

    private Strategy(KeylineList keylineList, List list, List list2, float f3, float f4, float f5, float f6) {
        this.defaultKeylines = keylineList;
        this.startKeylineSteps = list;
        this.endKeylineSteps = list2;
        this.availableSpace = f3;
        this.itemSpacing = f4;
        this.beforeContentPadding = f5;
        this.afterContentPadding = f6;
        float fTy = StrategyKt.ty(list, f5);
        this.startShiftDistance = fTy;
        float fGh = StrategyKt.gh(list2, f6);
        this.endShiftDistance = fGh;
        this.startShiftPoints = StrategyKt.HI(fTy, list, true);
        this.endShiftPoints = StrategyKt.HI(fGh, list2, false);
        this.isValid = (keylineList.isEmpty() || f3 == 0.0f || O() == 0.0f) ? false : true;
    }

    public final KeylineList Uo(float scrollOffset, float maxScrollOffset, boolean roundToNearestStep) {
        float fMax = Math.max(0.0f, scrollOffset);
        float f3 = this.startShiftDistance;
        float fMax2 = Math.max(0.0f, maxScrollOffset - this.endShiftDistance);
        if (f3 <= fMax && fMax <= fMax2) {
            return this.defaultKeylines;
        }
        float fCk = StrategyKt.ck(1.0f, 0.0f, 0.0f, f3, fMax);
        FloatList floatList = this.startShiftPoints;
        List list = this.startKeylineSteps;
        if (fMax > fMax2) {
            fCk = StrategyKt.ck(0.0f, 1.0f, fMax2, maxScrollOffset, fMax);
            floatList = this.endShiftPoints;
            list = this.endKeylineSteps;
        }
        ShiftPointRange shiftPointRangeQie = StrategyKt.qie(list.size(), floatList, fCk);
        if (roundToNearestStep) {
            return (KeylineList) list.get(MathKt.roundToInt(shiftPointRangeQie.getSteppedInterpolation()) == 0 ? shiftPointRangeQie.getFromStepIndex() : shiftPointRangeQie.getToStepIndex());
        }
        return KeylineListKt.O((KeylineList) list.get(shiftPointRangeQie.getFromStepIndex()), (KeylineList) list.get(shiftPointRangeQie.getToStepIndex()), shiftPointRangeQie.getSteppedInterpolation());
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Strategy)) {
            return false;
        }
        boolean z2 = this.isValid;
        if (!z2 && !((Strategy) other).isValid) {
            return true;
        }
        Strategy strategy = (Strategy) other;
        return z2 == strategy.isValid && this.availableSpace == strategy.availableSpace && this.itemSpacing == strategy.itemSpacing && this.beforeContentPadding == strategy.beforeContentPadding && this.afterContentPadding == strategy.afterContentPadding && O() == strategy.O() && this.startShiftDistance == strategy.startShiftDistance && this.endShiftDistance == strategy.endShiftDistance && Intrinsics.areEqual(this.startShiftPoints, strategy.startShiftPoints) && Intrinsics.areEqual(this.endShiftPoints, strategy.endShiftPoints) && Intrinsics.areEqual(this.defaultKeylines, strategy.defaultKeylines);
    }

    public static /* synthetic */ KeylineList KN(Strategy strategy, float f3, float f4, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return strategy.Uo(f3, f4, z2);
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final float getItemSpacing() {
        return this.itemSpacing;
    }

    public final float O() {
        return this.defaultKeylines.KN().getSize();
    }

    public int hashCode() {
        boolean z2 = this.isValid;
        return !z2 ? Boolean.hashCode(z2) : (((((((((((((((((((Boolean.hashCode(z2) * 31) + Float.hashCode(this.availableSpace)) * 31) + Float.hashCode(this.itemSpacing)) * 31) + Float.hashCode(this.beforeContentPadding)) * 31) + Float.hashCode(this.afterContentPadding)) * 31) + Float.hashCode(O())) * 31) + Float.hashCode(this.startShiftDistance)) * 31) + Float.hashCode(this.endShiftDistance)) * 31) + this.startShiftPoints.hashCode()) * 31) + this.endShiftPoints.hashCode()) * 31) + this.defaultKeylines.hashCode();
    }

    /* JADX INFO: renamed from: mUb, reason: from getter */
    public final boolean getIsValid() {
        return this.isValid;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final List getEndKeylineSteps() {
        return this.endKeylineSteps;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final float getAvailableSpace() {
        return this.availableSpace;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final KeylineList getDefaultKeylines() {
        return this.defaultKeylines;
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final List getStartKeylineSteps() {
        return this.startKeylineSteps;
    }

    public Strategy(KeylineList keylineList, float f3, float f4, float f5, float f6) {
        this(keylineList, StrategyKt.az(keylineList, f3, f4, f5), StrategyKt.mUb(keylineList, f3, f4, f6), f3, f4, f5, f6);
    }
}
