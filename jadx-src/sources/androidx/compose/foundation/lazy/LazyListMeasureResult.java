package androidx.compose.foundation.lazy;

import GJW.vd;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b,\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u009f\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 H\u0096\u0001¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u0004\u0018\u00010\u00002\u0006\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0007¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b/\u0010!\u001a\u0004\b0\u00101R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b8\u00103\u001a\u0004\b9\u00105R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b:\u0010!\u001a\u0004\b;\u00101R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001d\u0010\u0013\u001a\u00020\u00128\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b%\u0010D\u001a\u0004\bE\u0010FR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\b@\u0010IR\u001a\u0010\u0016\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b<\u0010.R\u001a\u0010\u0017\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010,\u001a\u0004\b6\u0010.R\u001a\u0010\u0018\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u0010,\u001a\u0004\b8\u0010.R\u001a\u0010\u0019\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010!\u001a\u0004\bJ\u00101R\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010K\u001a\u0004\b'\u0010LR\u001a\u0010\u001c\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010,\u001a\u0004\b/\u0010.R\u001a\u0010\u001d\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010,\u001a\u0004\b:\u0010.R \u0010Q\u001a\u000e\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020\u00050M8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0014\u0010S\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bR\u0010.R'\u0010Y\u001a\u0015\u0012\u0004\u0012\u00020U\u0012\u0004\u0012\u00020 \u0018\u00010T¢\u0006\u0002\bV8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0014\u0010[\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bZ\u0010.R\u0011\u0010\\\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bG\u00101R\u001a\u0010^\u001a\u00020]8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b+\u0010FR\u0014\u0010_\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010.\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006`"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "firstVisibleItem", "", "firstVisibleItemScrollOffset", "", "canScrollForward", "", "consumedScroll", "measureResult", "scrollBackAmount", "remeasureNeeded", "LGJW/vd;", "coroutineScope", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/Constraints;", "childConstraints", "", "visibleItemsInfo", "viewportStartOffset", "viewportEndOffset", "totalItemsCount", "reverseLayout", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "afterContentPadding", "mainAxisItemSpacing", "<init>", "(Landroidx/compose/foundation/lazy/LazyListMeasuredItem;IZFLandroidx/compose/ui/layout/MeasureResult;FZLGJW/vd;Landroidx/compose/ui/unit/Density;JLjava/util/List;IIIZLandroidx/compose/foundation/gestures/Orientation;IILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "Z", "()V", "delta", "updateAnimations", "mUb", "(IZ)Landroidx/compose/foundation/lazy/LazyListMeasureResult;", c.f62177j, "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "Ik", "()Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "rl", "I", "r", "()I", "t", "qie", "()Z", "nr", "F", "ty", "()F", "O", "Landroidx/compose/ui/layout/MeasureResult;", "J2", "WPU", "Uo", "getRemeasureNeeded", "KN", "LGJW/vd;", "HI", "()LGJW/vd;", "xMQ", "Landroidx/compose/ui/unit/Density;", "ck", "()Landroidx/compose/ui/unit/Density;", "J", "az", "()J", "gh", "Ljava/util/List;", "()Ljava/util/List;", "S", "Landroidx/compose/foundation/gestures/Orientation;", "()Landroidx/compose/foundation/gestures/Orientation;", "", "Landroidx/compose/ui/layout/AlignmentLine;", "o", "()Ljava/util/Map;", "alignmentLines", "getHeight", "height", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "Lkotlin/ExtensionFunctionType;", "XQ", "()Lkotlin/jvm/functions/Function1;", "rulers", "getWidth", "width", "canScrollBackward", "Landroidx/compose/ui/unit/IntSize;", "viewportSize", "beforeContentPadding", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyListMeasureResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListMeasureResult.kt\nandroidx/compose/foundation/lazy/LazyListMeasureResult\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,152:1\n30#2:153\n80#3:154\n34#4,6:155\n*S KotlinDebug\n*F\n+ 1 LazyListMeasureResult.kt\nandroidx/compose/foundation/lazy/LazyListMeasureResult\n*L\n73#1:153\n73#1:154\n124#1:155,6\n*E\n"})
public final class LazyListMeasureResult implements LazyListLayoutInfo, MeasureResult {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private final boolean reverseLayout;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private final int afterContentPadding;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final float scrollBackAmount;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final vd coroutineScope;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final MeasureResult measureResult;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final boolean remeasureNeeded;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final int viewportEndOffset;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private final Orientation orientation;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final List visibleItemsInfo;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final long childConstraints;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final LazyListMeasuredItem firstVisibleItem;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final float consumedScroll;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final int viewportStartOffset;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisItemSpacing;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final int firstVisibleItemScrollOffset;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final boolean canScrollForward;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private final int totalItemsCount;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final Density density;

    public /* synthetic */ LazyListMeasureResult(LazyListMeasuredItem lazyListMeasuredItem, int i2, boolean z2, float f3, MeasureResult measureResult, float f4, boolean z3, vd vdVar, Density density, long j2, List list, int i3, int i5, int i7, boolean z4, Orientation orientation, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyListMeasuredItem, i2, z2, f3, measureResult, f4, z3, vdVar, density, j2, list, i3, i5, i7, z4, orientation, i8, i9);
    }

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

    private LazyListMeasureResult(LazyListMeasuredItem lazyListMeasuredItem, int i2, boolean z2, float f3, MeasureResult measureResult, float f4, boolean z3, vd vdVar, Density density, long j2, List list, int i3, int i5, int i7, boolean z4, Orientation orientation, int i8, int i9) {
        this.firstVisibleItem = lazyListMeasuredItem;
        this.firstVisibleItemScrollOffset = i2;
        this.canScrollForward = z2;
        this.consumedScroll = f3;
        this.measureResult = measureResult;
        this.scrollBackAmount = f4;
        this.remeasureNeeded = z3;
        this.coroutineScope = vdVar;
        this.density = density;
        this.childConstraints = j2;
        this.visibleItemsInfo = list;
        this.viewportStartOffset = i3;
        this.viewportEndOffset = i5;
        this.totalItemsCount = i7;
        this.reverseLayout = z4;
        this.orientation = orientation;
        this.afterContentPadding = i8;
        this.mainAxisItemSpacing = i9;
    }

    /* JADX INFO: renamed from: HI, reason: from getter */
    public final vd getCoroutineScope() {
        return this.coroutineScope;
    }

    /* JADX INFO: renamed from: Ik, reason: from getter */
    public final LazyListMeasuredItem getFirstVisibleItem() {
        return this.firstVisibleItem;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    /* JADX INFO: renamed from: J2, reason: from getter */
    public int getTotalItemsCount() {
        return this.totalItemsCount;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    /* JADX INFO: renamed from: KN, reason: from getter */
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    /* JADX INFO: renamed from: O, reason: from getter */
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    /* JADX INFO: renamed from: S, reason: from getter */
    public boolean getReverseLayout() {
        return this.reverseLayout;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    /* JADX INFO: renamed from: Uo, reason: from getter */
    public int getMainAxisItemSpacing() {
        return this.mainAxisItemSpacing;
    }

    /* JADX INFO: renamed from: WPU, reason: from getter */
    public final float getScrollBackAmount() {
        return this.scrollBackAmount;
    }

    /* JADX INFO: renamed from: az, reason: from getter */
    public final long getChildConstraints() {
        return this.childConstraints;
    }

    /* JADX INFO: renamed from: ck, reason: from getter */
    public final Density getDensity() {
        return this.density;
    }

    public final boolean gh() {
        LazyListMeasuredItem lazyListMeasuredItem = this.firstVisibleItem;
        return ((lazyListMeasuredItem != null ? lazyListMeasuredItem.getIndex() : 0) == 0 && this.firstVisibleItemScrollOffset == 0) ? false : true;
    }

    public final LazyListMeasureResult mUb(int delta, boolean updateAnimations) {
        LazyListMeasuredItem lazyListMeasuredItem;
        if (!this.remeasureNeeded && !getVisibleItemsInfo().isEmpty() && (lazyListMeasuredItem = this.firstVisibleItem) != null) {
            int mainAxisSizeWithSpacings = lazyListMeasuredItem.getMainAxisSizeWithSpacings();
            int i2 = this.firstVisibleItemScrollOffset - delta;
            if (i2 >= 0 && i2 < mainAxisSizeWithSpacings) {
                LazyListMeasuredItem lazyListMeasuredItem2 = (LazyListMeasuredItem) CollectionsKt.first(getVisibleItemsInfo());
                LazyListMeasuredItem lazyListMeasuredItem3 = (LazyListMeasuredItem) CollectionsKt.last(getVisibleItemsInfo());
                if (!lazyListMeasuredItem2.getNonScrollableItem() && !lazyListMeasuredItem3.getNonScrollableItem() && (delta >= 0 ? Math.min(getViewportStartOffset() - lazyListMeasuredItem2.getOffset(), getViewportEndOffset() - lazyListMeasuredItem3.getOffset()) > delta : Math.min((lazyListMeasuredItem2.getOffset() + lazyListMeasuredItem2.getMainAxisSizeWithSpacings()) - getViewportStartOffset(), (lazyListMeasuredItem3.getOffset() + lazyListMeasuredItem3.getMainAxisSizeWithSpacings()) - getViewportEndOffset()) > (-delta))) {
                    List visibleItemsInfo = getVisibleItemsInfo();
                    int size = visibleItemsInfo.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((LazyListMeasuredItem) visibleItemsInfo.get(i3)).O(delta, updateAnimations);
                    }
                    return new LazyListMeasureResult(this.firstVisibleItem, this.firstVisibleItemScrollOffset - delta, this.canScrollForward || delta > 0, delta, this.measureResult, this.scrollBackAmount, this.remeasureNeeded, this.coroutineScope, this.density, this.childConstraints, getVisibleItemsInfo(), getViewportStartOffset(), getViewportEndOffset(), getTotalItemsCount(), getReverseLayout(), getOrientation(), getAfterContentPadding(), getMainAxisItemSpacing(), null);
                }
            }
        }
        return null;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    /* JADX INFO: renamed from: n, reason: from getter */
    public Orientation getOrientation() {
        return this.orientation;
    }

    /* JADX INFO: renamed from: qie, reason: from getter */
    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final int getFirstVisibleItemScrollOffset() {
        return this.firstVisibleItemScrollOffset;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    /* JADX INFO: renamed from: t, reason: from getter */
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    /* JADX INFO: renamed from: ty, reason: from getter */
    public final float getConsumedScroll() {
        return this.consumedScroll;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public List getVisibleItemsInfo() {
        return this.visibleItemsInfo;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int nr() {
        return -getViewportStartOffset();
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public long rl() {
        return IntSize.t((((long) getRl()) & 4294967295L) | (((long) getF32270n()) << 32));
    }
}
