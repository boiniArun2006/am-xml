package androidx.compose.foundation.lazy.staggeredgrid;

import GJW.vd;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Density;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b1\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u00ad\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0014\u0012\u0006\u0010\u001c\u001a\u00020\u0014\u0012\u0006\u0010\u001d\u001a\u00020\u0014\u0012\u0006\u0010\u001e\u001a\u00020\u0014\u0012\u0006\u0010\u001f\u001a\u00020\u0014\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$H\u0096\u0001¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u0004\u0018\u00010\u00002\u0006\u0010'\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\n¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b)\u00102\u001a\u0004\b9\u00104R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b:\u0010%\u001a\u0004\b;\u0010<R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b=\u0010%\u001a\u0004\b\f\u0010<R\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b>\u0010%\u001a\u0004\b?\u0010<R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b;\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b3\u0010G\u001a\u0004\bH\u0010IR\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\b:\u0010LR \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010M\u001a\u0004\b@\u0010NR \u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b-\u0010O\u001a\u0004\b/\u0010PR\u001a\u0010\u001b\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010K\u001a\u0004\bQ\u0010LR\u001a\u0010\u001c\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010K\u001a\u0004\bR\u0010LR\u001a\u0010\u001d\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010K\u001a\u0004\b5\u0010LR\u001a\u0010\u001e\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010K\u001a\u0004\b1\u0010LR\u001a\u0010\u001f\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010K\u001a\u0004\b=\u0010LR\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b%\u0010T\u001a\u0004\bJ\u0010UR\u001a\u0010Z\u001a\u00020V8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\b+\u0010YR \u0010^\u001a\u000e\u0012\u0004\u0012\u00020\\\u0012\u0004\u0012\u00020\u00140[8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bS\u0010]R\u0014\u0010`\u001a\u00020\u00148\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b_\u0010LR'\u0010e\u001a\u0015\u0012\u0004\u0012\u00020b\u0012\u0004\u0012\u00020$\u0018\u00010a¢\u0006\u0002\bc8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\bW\u0010dR\u0014\u0010g\u001a\u00020\u00148\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bf\u0010LR\u0011\u0010h\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b>\u0010<\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006i"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "Landroidx/compose/ui/layout/MeasureResult;", "", "firstVisibleItemIndices", "firstVisibleItemScrollOffsets", "", "consumedScroll", "measureResult", "scrollBackAmount", "", "canScrollForward", "isVertical", "remeasureNeeded", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "slots", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "spanProvider", "Landroidx/compose/ui/unit/Density;", "density", "", "totalItemsCount", "", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "visibleItemsInfo", "Landroidx/compose/ui/unit/IntSize;", "viewportSize", "viewportStartOffset", "viewportEndOffset", "beforeContentPadding", "afterContentPadding", "mainAxisItemSpacing", "LGJW/vd;", "coroutineScope", "<init>", "([I[IFLandroidx/compose/ui/layout/MeasureResult;FZZZLandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;Landroidx/compose/ui/unit/Density;ILjava/util/List;JIIIIILGJW/vd;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "Z", "()V", "delta", "updateAnimations", "O", "(IZ)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", c.f62177j, "[I", "ty", "()[I", "rl", "HI", "t", "F", "gh", "()F", "nr", "Landroidx/compose/ui/layout/MeasureResult;", "getMeasureResult", "()Landroidx/compose/ui/layout/MeasureResult;", "ck", "J2", "mUb", "()Z", "Uo", "KN", "getRemeasureNeeded", "xMQ", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "Ik", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "r", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "Landroidx/compose/ui/unit/Density;", "az", "()Landroidx/compose/ui/unit/Density;", "qie", "I", "()I", "Ljava/util/List;", "()Ljava/util/List;", "J", "()J", "WPU", "S", "o", "LGJW/vd;", "()LGJW/vd;", "Landroidx/compose/foundation/gestures/Orientation;", "XQ", "Landroidx/compose/foundation/gestures/Orientation;", "()Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "Landroidx/compose/ui/layout/AlignmentLine;", "()Ljava/util/Map;", "alignmentLines", "getHeight", "height", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "Lkotlin/ExtensionFunctionType;", "()Lkotlin/jvm/functions/Function1;", "rulers", "getWidth", "width", "canScrollBackward", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasureResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasureResult.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,297:1\n34#2,6:298\n34#2,6:304\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasureResult.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult\n*L\n178#1:298,6\n212#1:304,6\n*E\n"})
public final class LazyStaggeredGridMeasureResult implements LazyStaggeredGridLayoutInfo, MeasureResult {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private final int viewportStartOffset;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private final int beforeContentPadding;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final boolean canScrollForward;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final boolean remeasureNeeded;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final float scrollBackAmount;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final boolean isVertical;

    /* JADX INFO: renamed from: XQ, reason: from kotlin metadata */
    private final Orientation orientation;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private final vd coroutineScope;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final List visibleItemsInfo;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private final int viewportEndOffset;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final Density density;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final LazyStaggeredGridSpanProvider spanProvider;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int[] firstVisibleItemIndices;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final MeasureResult measureResult;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisItemSpacing;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final int totalItemsCount;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final int afterContentPadding;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final int[] firstVisibleItemScrollOffsets;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final float consumedScroll;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private final long viewportSize;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final LazyStaggeredGridSlots slots;

    public /* synthetic */ LazyStaggeredGridMeasureResult(int[] iArr, int[] iArr2, float f3, MeasureResult measureResult, float f4, boolean z2, boolean z3, boolean z4, LazyStaggeredGridSlots lazyStaggeredGridSlots, LazyStaggeredGridSpanProvider lazyStaggeredGridSpanProvider, Density density, int i2, List list, long j2, int i3, int i5, int i7, int i8, int i9, vd vdVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(iArr, iArr2, f3, measureResult, f4, z2, z3, z4, lazyStaggeredGridSlots, lazyStaggeredGridSpanProvider, density, i2, list, j2, i3, i5, i7, i8, i9, vdVar);
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
    public int getF32234n() {
        return this.measureResult.getF32234n();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    /* JADX INFO: renamed from: o */
    public Map getF32235t() {
        return this.measureResult.getF32235t();
    }

    private LazyStaggeredGridMeasureResult(int[] iArr, int[] iArr2, float f3, MeasureResult measureResult, float f4, boolean z2, boolean z3, boolean z4, LazyStaggeredGridSlots lazyStaggeredGridSlots, LazyStaggeredGridSpanProvider lazyStaggeredGridSpanProvider, Density density, int i2, List list, long j2, int i3, int i5, int i7, int i8, int i9, vd vdVar) {
        this.firstVisibleItemIndices = iArr;
        this.firstVisibleItemScrollOffsets = iArr2;
        this.consumedScroll = f3;
        this.measureResult = measureResult;
        this.scrollBackAmount = f4;
        this.canScrollForward = z2;
        this.isVertical = z3;
        this.remeasureNeeded = z4;
        this.slots = lazyStaggeredGridSlots;
        this.spanProvider = lazyStaggeredGridSpanProvider;
        this.density = density;
        this.totalItemsCount = i2;
        this.visibleItemsInfo = list;
        this.viewportSize = j2;
        this.viewportStartOffset = i3;
        this.viewportEndOffset = i5;
        this.beforeContentPadding = i7;
        this.afterContentPadding = i8;
        this.mainAxisItemSpacing = i9;
        this.coroutineScope = vdVar;
        this.orientation = z3 ? Orientation.f16969n : Orientation.f16970t;
    }

    /* JADX INFO: renamed from: HI, reason: from getter */
    public final int[] getFirstVisibleItemScrollOffsets() {
        return this.firstVisibleItemScrollOffsets;
    }

    /* JADX INFO: renamed from: Ik, reason: from getter */
    public final LazyStaggeredGridSlots getSlots() {
        return this.slots;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    /* JADX INFO: renamed from: J2, reason: from getter */
    public int getTotalItemsCount() {
        return this.totalItemsCount;
    }

    public final boolean KN() {
        return this.firstVisibleItemIndices[0] != 0 || this.firstVisibleItemScrollOffsets[0] > 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0082, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b2, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LazyStaggeredGridMeasureResult O(int delta, boolean updateAnimations) {
        if (this.remeasureNeeded || getVisibleItemsInfo().isEmpty() || this.firstVisibleItemIndices.length == 0 || this.firstVisibleItemScrollOffsets.length == 0) {
            return null;
        }
        int viewportEndOffset = getViewportEndOffset() - getAfterContentPadding();
        List visibleItemsInfo = getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                List visibleItemsInfo2 = getVisibleItemsInfo();
                int size2 = visibleItemsInfo2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((LazyStaggeredGridMeasuredItem) visibleItemsInfo2.get(i3)).xMQ(delta, updateAnimations);
                }
                int[] iArr = this.firstVisibleItemIndices;
                int length = this.firstVisibleItemScrollOffsets.length;
                int[] iArr2 = new int[length];
                for (int i5 = 0; i5 < length; i5++) {
                    iArr2[i5] = this.firstVisibleItemScrollOffsets[i5] - delta;
                }
                return new LazyStaggeredGridMeasureResult(iArr, iArr2, delta, this.measureResult, this.scrollBackAmount, this.canScrollForward || delta > 0, this.isVertical, this.remeasureNeeded, this.slots, this.spanProvider, this.density, getTotalItemsCount(), getVisibleItemsInfo(), getViewportSize(), getViewportStartOffset(), getViewportEndOffset(), getBeforeContentPadding(), getAfterContentPadding(), getMainAxisItemSpacing(), this.coroutineScope, null);
            }
            LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem = (LazyStaggeredGridMeasuredItem) visibleItemsInfo.get(i2);
            if (lazyStaggeredGridMeasuredItem.getNonScrollableItem()) {
                break;
            }
            if ((lazyStaggeredGridMeasuredItem.ck() <= 0) != (lazyStaggeredGridMeasuredItem.ck() + delta <= 0)) {
                break;
            }
            if (lazyStaggeredGridMeasuredItem.ck() <= getViewportStartOffset()) {
                if (delta < 0) {
                    if ((lazyStaggeredGridMeasuredItem.ck() + lazyStaggeredGridMeasuredItem.getMainAxisSizeWithSpacings()) - getViewportStartOffset() <= (-delta)) {
                        break;
                    }
                } else if (getViewportStartOffset() - lazyStaggeredGridMeasuredItem.ck() <= delta) {
                    break;
                }
            }
            if (lazyStaggeredGridMeasuredItem.ck() + lazyStaggeredGridMeasuredItem.getMainAxisSizeWithSpacings() >= viewportEndOffset) {
                if (delta < 0) {
                    if ((lazyStaggeredGridMeasuredItem.ck() + lazyStaggeredGridMeasuredItem.getMainAxisSizeWithSpacings()) - getViewportEndOffset() <= (-delta)) {
                        break;
                    }
                } else {
                    if (getViewportEndOffset() - lazyStaggeredGridMeasuredItem.ck() <= delta) {
                        break;
                    }
                }
            }
            i2++;
        }
        return null;
    }

    /* JADX INFO: renamed from: S, reason: from getter */
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    /* JADX INFO: renamed from: Uo, reason: from getter */
    public int getMainAxisItemSpacing() {
        return this.mainAxisItemSpacing;
    }

    /* JADX INFO: renamed from: WPU, reason: from getter */
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    /* JADX INFO: renamed from: az, reason: from getter */
    public final Density getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: ck, reason: from getter */
    public final float getScrollBackAmount() {
        return this.scrollBackAmount;
    }

    /* JADX INFO: renamed from: gh, reason: from getter */
    public final float getConsumedScroll() {
        return this.consumedScroll;
    }

    /* JADX INFO: renamed from: mUb, reason: from getter */
    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    /* JADX INFO: renamed from: n, reason: from getter */
    public Orientation getOrientation() {
        return this.orientation;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    /* JADX INFO: renamed from: nr, reason: from getter */
    public int getBeforeContentPadding() {
        return this.beforeContentPadding;
    }

    /* JADX INFO: renamed from: qie, reason: from getter */
    public final vd getCoroutineScope() {
        return this.coroutineScope;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final LazyStaggeredGridSpanProvider getSpanProvider() {
        return this.spanProvider;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    /* JADX INFO: renamed from: rl, reason: from getter */
    public long getViewportSize() {
        return this.viewportSize;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    /* JADX INFO: renamed from: t, reason: from getter */
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    /* JADX INFO: renamed from: ty, reason: from getter */
    public final int[] getFirstVisibleItemIndices() {
        return this.firstVisibleItemIndices;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public List getVisibleItemsInfo() {
        return this.visibleItemsInfo;
    }
}
