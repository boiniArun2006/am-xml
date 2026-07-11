package androidx.compose.foundation.lazy.grid;

import GJW.vd;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b.\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BÔ\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u00123\u0010\u001a\u001a/\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00190\u00180\u00170\u0013\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u0005\u0012\u0006\u0010\u001f\u001a\u00020\u0005\u0012\u0006\u0010 \u001a\u00020\u0007\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010#\u001a\u00020\u0005\u0012\u0006\u0010$\u001a\u00020\u0005¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'H\u0096\u0001¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u0004\u0018\u00010\u00002\u0006\u0010*\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u0007¢\u0006\u0004\b,\u0010-R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b6\u0010(\u001a\u0004\b7\u00108R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b?\u0010:\u001a\u0004\b@\u0010<R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bA\u0010(\u001a\u0004\bB\u00108R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010\u0012\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b,\u00103\u001a\u0004\bK\u00105RD\u0010\u001a\u001a/\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00190\u00180\u00170\u00138\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u0010P\u001a\u0004\bG\u0010QR\u001a\u0010\u001d\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u00103\u001a\u0004\bC\u00105R\u001a\u0010\u001e\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u00103\u001a\u0004\b=\u00105R\u001a\u0010\u001f\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u00103\u001a\u0004\b?\u00105R\u001a\u0010 \u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010(\u001a\u0004\bR\u00108R\u001a\u0010\"\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u0010S\u001a\u0004\b.\u0010TR\u001a\u0010#\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u00103\u001a\u0004\b6\u00105R\u001a\u0010$\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bU\u00103\u001a\u0004\bA\u00105R \u0010Y\u001a\u000e\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020\u00050V8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bU\u0010XR\u0014\u0010[\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bZ\u00105R'\u0010_\u001a\u0015\u0012\u0004\u0012\u00020\\\u0012\u0004\u0012\u00020'\u0018\u00010\u0013¢\u0006\u0002\b]8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b^\u0010OR\u0014\u0010a\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b`\u00105R\u0011\u0010b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bL\u00108R\u001a\u0010e\u001a\u00020c8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b2\u0010dR\u0014\u0010f\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u00105\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006g"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "firstVisibleLine", "", "firstVisibleLineScrollOffset", "", "canScrollForward", "", "consumedScroll", "measureResult", "scrollBackAmount", "remeasureNeeded", "LGJW/vd;", "coroutineScope", "Landroidx/compose/ui/unit/Density;", "density", "slotsPerLine", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "line", "", "Lkotlin/Pair;", "Landroidx/compose/ui/unit/Constraints;", "prefetchInfoRetriever", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "visibleItemsInfo", "viewportStartOffset", "viewportEndOffset", "totalItemsCount", "reverseLayout", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "afterContentPadding", "mainAxisItemSpacing", "<init>", "(Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;IZFLandroidx/compose/ui/layout/MeasureResult;FZLGJW/vd;Landroidx/compose/ui/unit/Density;ILkotlin/jvm/functions/Function1;Ljava/util/List;IIIZLandroidx/compose/foundation/gestures/Orientation;II)V", "", "Z", "()V", "delta", "updateAnimations", "mUb", "(IZ)Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", c.f62177j, "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "ck", "()Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "rl", "I", "Ik", "()I", "t", "qie", "()Z", "nr", "F", "az", "()F", "O", "Landroidx/compose/ui/layout/MeasureResult;", "J2", "WPU", "Uo", "getRemeasureNeeded", "KN", "LGJW/vd;", "ty", "()LGJW/vd;", "xMQ", "Landroidx/compose/ui/unit/Density;", "HI", "()Landroidx/compose/ui/unit/Density;", "aYN", "gh", "Lkotlin/jvm/functions/Function1;", "r", "()Lkotlin/jvm/functions/Function1;", "Ljava/util/List;", "()Ljava/util/List;", "S", "Landroidx/compose/foundation/gestures/Orientation;", "()Landroidx/compose/foundation/gestures/Orientation;", "o", "", "Landroidx/compose/ui/layout/AlignmentLine;", "()Ljava/util/Map;", "alignmentLines", "getHeight", "height", "Landroidx/compose/ui/layout/RulerScope;", "Lkotlin/ExtensionFunctionType;", "XQ", "rulers", "getWidth", "width", "canScrollBackward", "Landroidx/compose/ui/unit/IntSize;", "()J", "viewportSize", "beforeContentPadding", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyGridMeasureResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasureResult.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureResult\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,162:1\n30#2:163\n80#3:164\n34#4,6:165\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasureResult.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureResult\n*L\n76#1:163\n76#1:164\n133#1:165,6\n*E\n"})
public final class LazyGridMeasureResult implements LazyGridLayoutInfo, MeasureResult {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private final int totalItemsCount;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private final Orientation orientation;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final float scrollBackAmount;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final vd coroutineScope;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final MeasureResult measureResult;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final boolean remeasureNeeded;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final int viewportStartOffset;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private final boolean reverseLayout;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final Function1 prefetchInfoRetriever;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final int slotsPerLine;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final LazyGridMeasuredLine firstVisibleLine;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final float consumedScroll;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisItemSpacing;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final List visibleItemsInfo;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final int afterContentPadding;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final int firstVisibleLineScrollOffset;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final boolean canScrollForward;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private final int viewportEndOffset;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final Density density;

    @Override // androidx.compose.ui.layout.MeasureResult
    /* JADX INFO: renamed from: XQ */
    public Function1 getNr() {
        return this.measureResult.getNr();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public void Z() {
        this.measureResult.Z();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    /* JADX INFO: renamed from: getHeight */
    public int getRl() {
        return this.measureResult.getRl();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    /* JADX INFO: renamed from: getWidth */
    public int getF32270n() {
        return this.measureResult.getF32270n();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    /* JADX INFO: renamed from: o */
    public Map getF32271t() {
        return this.measureResult.getF32271t();
    }

    /* JADX INFO: renamed from: HI, reason: from getter */
    public final Density getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: Ik, reason: from getter */
    public final int getFirstVisibleLineScrollOffset() {
        return this.firstVisibleLineScrollOffset;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    /* JADX INFO: renamed from: J2, reason: from getter */
    public int getTotalItemsCount() {
        return this.totalItemsCount;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    /* JADX INFO: renamed from: KN, reason: from getter */
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    /* JADX INFO: renamed from: O, reason: from getter */
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    /* JADX INFO: renamed from: S, reason: from getter */
    public boolean getReverseLayout() {
        return this.reverseLayout;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    /* JADX INFO: renamed from: Uo, reason: from getter */
    public int getMainAxisItemSpacing() {
        return this.mainAxisItemSpacing;
    }

    /* JADX INFO: renamed from: WPU, reason: from getter */
    public final float getScrollBackAmount() {
        return this.scrollBackAmount;
    }

    /* JADX INFO: renamed from: aYN, reason: from getter */
    public final int getSlotsPerLine() {
        return this.slotsPerLine;
    }

    /* JADX INFO: renamed from: az, reason: from getter */
    public final float getConsumedScroll() {
        return this.consumedScroll;
    }

    /* JADX INFO: renamed from: ck, reason: from getter */
    public final LazyGridMeasuredLine getFirstVisibleLine() {
        return this.firstVisibleLine;
    }

    public final boolean gh() {
        LazyGridMeasuredLine lazyGridMeasuredLine = this.firstVisibleLine;
        return ((lazyGridMeasuredLine != null ? lazyGridMeasuredLine.getIndex() : 0) == 0 && this.firstVisibleLineScrollOffset == 0) ? false : true;
    }

    public final LazyGridMeasureResult mUb(int delta, boolean updateAnimations) {
        LazyGridMeasuredLine lazyGridMeasuredLine;
        if (!this.remeasureNeeded && !getVisibleItemsInfo().isEmpty() && (lazyGridMeasuredLine = this.firstVisibleLine) != null) {
            int mainAxisSizeWithSpacings = lazyGridMeasuredLine.getMainAxisSizeWithSpacings();
            int i2 = this.firstVisibleLineScrollOffset - delta;
            if (i2 >= 0 && i2 < mainAxisSizeWithSpacings) {
                LazyGridMeasuredItem lazyGridMeasuredItem = (LazyGridMeasuredItem) CollectionsKt.first(getVisibleItemsInfo());
                LazyGridMeasuredItem lazyGridMeasuredItem2 = (LazyGridMeasuredItem) CollectionsKt.last(getVisibleItemsInfo());
                if (!lazyGridMeasuredItem.getNonScrollableItem() && !lazyGridMeasuredItem2.getNonScrollableItem() && (delta >= 0 ? Math.min(getViewportStartOffset() - LazyGridSnapLayoutInfoProviderKt.rl(lazyGridMeasuredItem, getOrientation()), getViewportEndOffset() - LazyGridSnapLayoutInfoProviderKt.rl(lazyGridMeasuredItem2, getOrientation())) > delta : Math.min((LazyGridSnapLayoutInfoProviderKt.rl(lazyGridMeasuredItem, getOrientation()) + lazyGridMeasuredItem.getMainAxisSizeWithSpacings()) - getViewportStartOffset(), (LazyGridSnapLayoutInfoProviderKt.rl(lazyGridMeasuredItem2, getOrientation()) + lazyGridMeasuredItem2.getMainAxisSizeWithSpacings()) - getViewportEndOffset()) > (-delta))) {
                    List visibleItemsInfo = getVisibleItemsInfo();
                    int size = visibleItemsInfo.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((LazyGridMeasuredItem) visibleItemsInfo.get(i3)).ck(delta, updateAnimations);
                    }
                    return new LazyGridMeasureResult(this.firstVisibleLine, this.firstVisibleLineScrollOffset - delta, this.canScrollForward || delta > 0, delta, this.measureResult, this.scrollBackAmount, this.remeasureNeeded, this.coroutineScope, this.density, this.slotsPerLine, this.prefetchInfoRetriever, getVisibleItemsInfo(), getViewportStartOffset(), getViewportEndOffset(), getTotalItemsCount(), getReverseLayout(), getOrientation(), getAfterContentPadding(), getMainAxisItemSpacing());
                }
            }
        }
        return null;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    /* JADX INFO: renamed from: n, reason: from getter */
    public Orientation getOrientation() {
        return this.orientation;
    }

    /* JADX INFO: renamed from: qie, reason: from getter */
    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Function1 getPrefetchInfoRetriever() {
        return this.prefetchInfoRetriever;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    /* JADX INFO: renamed from: t, reason: from getter */
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    /* JADX INFO: renamed from: ty, reason: from getter */
    public final vd getCoroutineScope() {
        return this.coroutineScope;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public List getVisibleItemsInfo() {
        return this.visibleItemsInfo;
    }

    public LazyGridMeasureResult(LazyGridMeasuredLine lazyGridMeasuredLine, int i2, boolean z2, float f3, MeasureResult measureResult, float f4, boolean z3, vd vdVar, Density density, int i3, Function1 function1, List list, int i5, int i7, int i8, boolean z4, Orientation orientation, int i9, int i10) {
        this.firstVisibleLine = lazyGridMeasuredLine;
        this.firstVisibleLineScrollOffset = i2;
        this.canScrollForward = z2;
        this.consumedScroll = f3;
        this.measureResult = measureResult;
        this.scrollBackAmount = f4;
        this.remeasureNeeded = z3;
        this.coroutineScope = vdVar;
        this.density = density;
        this.slotsPerLine = i3;
        this.prefetchInfoRetriever = function1;
        this.visibleItemsInfo = list;
        this.viewportStartOffset = i5;
        this.viewportEndOffset = i7;
        this.totalItemsCount = i8;
        this.reverseLayout = z4;
        this.orientation = orientation;
        this.afterContentPadding = i9;
        this.mainAxisItemSpacing = i10;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int nr() {
        return -getViewportStartOffset();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public long rl() {
        return IntSize.t((((long) getRl()) & 4294967295L) | (((long) getF32270n()) << 32));
    }
}
