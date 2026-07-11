package androidx.compose.foundation.pager;

import GJW.vd;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.MeasureResult;
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
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b,\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BÁ\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!H\u0096\u0001¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u0004\u0018\u00010\u00002\u0006\u0010$\u001a\u00020\u0006¢\u0006\u0004\b%\u0010&R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u001a\u0010\t\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b/\u0010.R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b'\u00104R\u001a\u0010\f\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010,\u001a\u0004\b5\u0010.R\u001a\u0010\r\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u0010,\u001a\u0004\b2\u0010.R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u0010\"\u001a\u0004\b6\u00107R\u001a\u0010\u0010\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010,\u001a\u0004\b8\u0010.R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b0\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b<\u0010;R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0015\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010,\u001a\u0004\bA\u0010.R\u0017\u0010\u0016\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bB\u0010\"\u001a\u0004\bC\u00107R\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\b=\u0010ER\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0017\u0010\u001a\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b<\u0010\"\u001a\u0004\bH\u00107R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b?\u0010(\u001a\u0004\bI\u0010*R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\bJ\u0010(\u001a\u0004\bK\u0010*R\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\"\u0010L\u001a\u0004\bF\u0010MR \u0010Q\u001a\u000e\u0012\u0004\u0012\u00020O\u0012\u0004\u0012\u00020\u00060N8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bJ\u0010PR\u0014\u0010S\u001a\u00020\u00068\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bR\u0010.R'\u0010Y\u001a\u0015\u0012\u0004\u0012\u00020U\u0012\u0004\u0012\u00020!\u0018\u00010T¢\u0006\u0002\bV8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0014\u0010[\u001a\u00020\u00068\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bZ\u0010.R\u001a\u0010^\u001a\u00020\\8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b+\u0010]R\u0014\u0010_\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010.R\u0011\u0010`\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bB\u00107\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006a"}, d2 = {"Landroidx/compose/foundation/pager/PagerMeasureResult;", "Landroidx/compose/foundation/pager/PagerLayoutInfo;", "Landroidx/compose/ui/layout/MeasureResult;", "", "Landroidx/compose/foundation/pager/MeasuredPage;", "visiblePagesInfo", "", "pageSize", "pageSpacing", "afterContentPadding", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "viewportStartOffset", "viewportEndOffset", "", "reverseLayout", "beyondViewportPageCount", "firstVisiblePage", "currentPage", "", "currentPageOffsetFraction", "firstVisiblePageScrollOffset", "canScrollForward", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "snapPosition", "measureResult", "remeasureNeeded", "extraPagesBefore", "extraPagesAfter", "LGJW/vd;", "coroutineScope", "<init>", "(Ljava/util/List;IIILandroidx/compose/foundation/gestures/Orientation;IIZILandroidx/compose/foundation/pager/MeasuredPage;Landroidx/compose/foundation/pager/MeasuredPage;FIZLandroidx/compose/foundation/gestures/snapping/SnapPosition;Landroidx/compose/ui/layout/MeasureResult;ZLjava/util/List;Ljava/util/List;LGJW/vd;)V", "", "Z", "()V", "delta", "az", "(I)Landroidx/compose/foundation/pager/PagerMeasureResult;", c.f62177j, "Ljava/util/List;", "xMQ", "()Ljava/util/List;", "rl", "I", "J2", "()I", "t", "mUb", "nr", "O", "Landroidx/compose/foundation/gestures/Orientation;", "()Landroidx/compose/foundation/gestures/Orientation;", "KN", "Uo", "()Z", "gh", "Landroidx/compose/foundation/pager/MeasuredPage;", "S", "()Landroidx/compose/foundation/pager/MeasuredPage;", "Ik", "qie", "F", "r", "()F", "WPU", "ty", "HI", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "()Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "ck", "Landroidx/compose/ui/layout/MeasureResult;", "getRemeasureNeeded", "getExtraPagesBefore", "o", "getExtraPagesAfter", "LGJW/vd;", "()LGJW/vd;", "", "Landroidx/compose/ui/layout/AlignmentLine;", "()Ljava/util/Map;", "alignmentLines", "getHeight", "height", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "Lkotlin/ExtensionFunctionType;", "XQ", "()Lkotlin/jvm/functions/Function1;", "rulers", "getWidth", "width", "Landroidx/compose/ui/unit/IntSize;", "()J", "viewportSize", "beforeContentPadding", "canScrollBackward", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPagerMeasureResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerMeasureResult.kt\nandroidx/compose/foundation/pager/PagerMeasureResult\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,148:1\n30#2:149\n80#3:150\n34#4,6:151\n34#4,6:157\n34#4,6:163\n*S KotlinDebug\n*F\n+ 1 PagerMeasureResult.kt\nandroidx/compose/foundation/pager/PagerMeasureResult\n*L\n50#1:149\n50#1:150\n115#1:151,6\n116#1:157,6\n117#1:163,6\n*E\n"})
public final class PagerMeasureResult implements PagerLayoutInfo, MeasureResult {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private final SnapPosition snapPosition;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private final boolean remeasureNeeded;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final int viewportStartOffset;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final boolean reverseLayout;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final Orientation orientation;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final int viewportEndOffset;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private final vd coroutineScope;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final int firstVisiblePageScrollOffset;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private final MeasureResult measureResult;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final MeasuredPage currentPage;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final MeasuredPage firstVisiblePage;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final List visiblePagesInfo;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final int afterContentPadding;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final List extraPagesAfter;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final float currentPageOffsetFraction;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final List extraPagesBefore;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final int pageSize;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int pageSpacing;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private final boolean canScrollForward;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final int beyondViewportPageCount;

    public PagerMeasureResult(List list, int i2, int i3, int i5, Orientation orientation, int i7, int i8, boolean z2, int i9, MeasuredPage measuredPage, MeasuredPage measuredPage2, float f3, int i10, boolean z3, SnapPosition snapPosition, MeasureResult measureResult, boolean z4, List list2, List list3, vd vdVar) {
        this.visiblePagesInfo = list;
        this.pageSize = i2;
        this.pageSpacing = i3;
        this.afterContentPadding = i5;
        this.orientation = orientation;
        this.viewportStartOffset = i7;
        this.viewportEndOffset = i8;
        this.reverseLayout = z2;
        this.beyondViewportPageCount = i9;
        this.firstVisiblePage = measuredPage;
        this.currentPage = measuredPage2;
        this.currentPageOffsetFraction = f3;
        this.firstVisiblePageScrollOffset = i10;
        this.canScrollForward = z3;
        this.snapPosition = snapPosition;
        this.measureResult = measureResult;
        this.remeasureNeeded = z4;
        this.extraPagesBefore = list2;
        this.extraPagesAfter = list3;
        this.coroutineScope = vdVar;
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

    /* JADX INFO: renamed from: HI, reason: from getter */
    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    /* JADX INFO: renamed from: Ik, reason: from getter */
    public final MeasuredPage getCurrentPage() {
        return this.currentPage;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    /* JADX INFO: renamed from: J2, reason: from getter */
    public int getPageSize() {
        return this.pageSize;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    /* JADX INFO: renamed from: KN, reason: from getter */
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    /* JADX INFO: renamed from: O, reason: from getter */
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    /* JADX INFO: renamed from: S, reason: from getter */
    public final MeasuredPage getFirstVisiblePage() {
        return this.firstVisiblePage;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    /* JADX INFO: renamed from: Uo, reason: from getter */
    public boolean getReverseLayout() {
        return this.reverseLayout;
    }

    /* JADX INFO: renamed from: WPU, reason: from getter */
    public final int getFirstVisiblePageScrollOffset() {
        return this.firstVisiblePageScrollOffset;
    }

    public final PagerMeasureResult az(int delta) {
        int i2;
        int pageSize = getPageSize() + getPageSpacing();
        if (!this.remeasureNeeded && !getVisiblePagesInfo().isEmpty() && this.firstVisiblePage != null && (i2 = this.firstVisiblePageScrollOffset - delta) >= 0 && i2 < pageSize) {
            float f3 = pageSize != 0 ? delta / pageSize : 0.0f;
            float f4 = this.currentPageOffsetFraction - f3;
            if (this.currentPage != null && f4 < 0.5f && f4 > -0.5f) {
                MeasuredPage measuredPage = (MeasuredPage) CollectionsKt.first(getVisiblePagesInfo());
                MeasuredPage measuredPage2 = (MeasuredPage) CollectionsKt.last(getVisiblePagesInfo());
                if (delta >= 0 ? Math.min(getViewportStartOffset() - measuredPage.getOffset(), getViewportEndOffset() - measuredPage2.getOffset()) > delta : Math.min((measuredPage.getOffset() + pageSize) - getViewportStartOffset(), (measuredPage2.getOffset() + pageSize) - getViewportEndOffset()) > (-delta)) {
                    List visiblePagesInfo = getVisiblePagesInfo();
                    int size = visiblePagesInfo.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((MeasuredPage) visiblePagesInfo.get(i3)).rl(delta);
                    }
                    List list = this.extraPagesBefore;
                    int size2 = list.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        ((MeasuredPage) list.get(i5)).rl(delta);
                    }
                    List list2 = this.extraPagesAfter;
                    int size3 = list2.size();
                    for (int i7 = 0; i7 < size3; i7++) {
                        ((MeasuredPage) list2.get(i7)).rl(delta);
                    }
                    return new PagerMeasureResult(getVisiblePagesInfo(), getPageSize(), getPageSpacing(), getAfterContentPadding(), getOrientation(), getViewportStartOffset(), getViewportEndOffset(), getReverseLayout(), getBeyondViewportPageCount(), this.firstVisiblePage, this.currentPage, this.currentPageOffsetFraction - f3, this.firstVisiblePageScrollOffset - delta, this.canScrollForward || delta > 0, getSnapPosition(), this.measureResult, this.remeasureNeeded, this.extraPagesBefore, this.extraPagesAfter, this.coroutineScope);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ck, reason: from getter */
    public final vd getCoroutineScope() {
        return this.coroutineScope;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    /* JADX INFO: renamed from: gh, reason: from getter */
    public int getBeyondViewportPageCount() {
        return this.beyondViewportPageCount;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    /* JADX INFO: renamed from: mUb, reason: from getter */
    public int getPageSpacing() {
        return this.pageSpacing;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    /* JADX INFO: renamed from: n, reason: from getter */
    public Orientation getOrientation() {
        return this.orientation;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    /* JADX INFO: renamed from: qie, reason: from getter */
    public SnapPosition getSnapPosition() {
        return this.snapPosition;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final float getCurrentPageOffsetFraction() {
        return this.currentPageOffsetFraction;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    /* JADX INFO: renamed from: t, reason: from getter */
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    public final boolean ty() {
        MeasuredPage measuredPage = this.firstVisiblePage;
        return ((measuredPage != null ? measuredPage.getIndex() : 0) == 0 && this.firstVisiblePageScrollOffset == 0) ? false : true;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public List getVisiblePagesInfo() {
        return this.visiblePagesInfo;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int nr() {
        return -getViewportStartOffset();
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public long rl() {
        return IntSize.t((((long) getRl()) & 4294967295L) | (((long) getF32270n()) << 32));
    }

    public /* synthetic */ PagerMeasureResult(List list, int i2, int i3, int i5, Orientation orientation, int i7, int i8, boolean z2, int i9, MeasuredPage measuredPage, MeasuredPage measuredPage2, float f3, int i10, boolean z3, SnapPosition snapPosition, MeasureResult measureResult, boolean z4, List list2, List list3, vd vdVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, i2, i3, i5, orientation, i7, i8, z2, i9, measuredPage, measuredPage2, f3, i10, z3, snapPosition, measureResult, z4, (i11 & 131072) != 0 ? CollectionsKt.emptyList() : list2, (i11 & 262144) != 0 ? CollectionsKt.emptyList() : list3, vdVar);
    }
}
