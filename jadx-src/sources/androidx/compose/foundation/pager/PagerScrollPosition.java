package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u000eJ\u001d\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R+\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00028F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$\"\u0004\b%\u0010\u001dR+\u0010\u0005\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00048F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(\"\u0004\b)\u0010\u001aR\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010.R\u0017\u00103\u001a\u0002008\u0006¢\u0006\f\n\u0004\b\u0014\u00101\u001a\u0004\b+\u00102¨\u00064"}, d2 = {"Landroidx/compose/foundation/pager/PagerScrollPosition;", "", "", "currentPage", "", "currentPageOffsetFraction", "Landroidx/compose/foundation/pager/PagerState;", "state", "<init>", "(IFLandroidx/compose/foundation/pager/PagerState;)V", "page", "offsetFraction", "", "xMQ", "(IF)V", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "measureResult", "gh", "(Landroidx/compose/foundation/pager/PagerMeasureResult;)V", "index", "J2", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "itemProvider", "O", "(Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;I)I", "mUb", "(F)V", "delta", c.f62177j, "(I)V", "Landroidx/compose/foundation/pager/PagerState;", "getState", "()Landroidx/compose/foundation/pager/PagerState;", "<set-?>", "rl", "Landroidx/compose/runtime/MutableIntState;", "()I", "Uo", "t", "Landroidx/compose/runtime/MutableFloatState;", "()F", "KN", "", "nr", "Z", "hadFirstNotEmptyLayout", "Ljava/lang/Object;", "lastKnownCurrentPageKey", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "nearestRangeState", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPagerScrollPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerScrollPosition.kt\nandroidx/compose/foundation/pager/PagerScrollPosition\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 PagerScrollPosition.kt\nandroidx/compose/foundation/pager/PagerScrollPositionKt\n*L\n1#1,137:1\n78#2:138\n107#2,2:139\n79#3:141\n112#3,2:142\n127#4,4:144\n*S KotlinDebug\n*F\n+ 1 PagerScrollPosition.kt\nandroidx/compose/foundation/pager/PagerScrollPosition\n*L\n37#1:138\n37#1:139,2\n40#1:141\n40#1:142,2\n106#1:144,4\n*E\n"})
public final class PagerScrollPosition {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final LazyLayoutNearestRangeState nearestRangeState;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private Object lastKnownCurrentPageKey;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final PagerState state;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private boolean hadFirstNotEmptyLayout;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final MutableIntState currentPage;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final MutableFloatState currentPageOffsetFraction;

    private final void KN(float f3) {
        this.currentPageOffsetFraction.Z(f3);
    }

    private final void Uo(int i2) {
        this.currentPage.KN(i2);
    }

    public final int O(PagerLazyLayoutItemProvider itemProvider, int index) {
        int iN = LazyLayoutItemProviderKt.n(itemProvider, this.lastKnownCurrentPageKey, index);
        if (index != iN) {
            Uo(iN);
            this.nearestRangeState.XQ(index);
        }
        return iN;
    }

    public final void n(int delta) {
        KN(t() + (this.state.nHg() == 0 ? 0.0f : delta / this.state.nHg()));
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final LazyLayoutNearestRangeState getNearestRangeState() {
        return this.nearestRangeState;
    }

    public final int rl() {
        return this.currentPage.J2();
    }

    public final float t() {
        return this.currentPageOffsetFraction.n();
    }

    public PagerScrollPosition(int i2, float f3, PagerState pagerState) {
        this.state = pagerState;
        this.currentPage = SnapshotIntStateKt.n(i2);
        this.currentPageOffsetFraction = PrimitiveSnapshotStateKt.n(f3);
        this.nearestRangeState = new LazyLayoutNearestRangeState(i2, 30, 100);
    }

    private final void xMQ(int page, float offsetFraction) {
        Uo(page);
        this.nearestRangeState.XQ(page);
        KN(offsetFraction);
    }

    public final void J2(int index, float offsetFraction) {
        xMQ(index, offsetFraction);
        this.lastKnownCurrentPageKey = null;
    }

    public final void gh(PagerMeasureResult measureResult) {
        Object key;
        int index;
        MeasuredPage currentPage = measureResult.getCurrentPage();
        if (currentPage != null) {
            key = currentPage.getKey();
        } else {
            key = null;
        }
        this.lastKnownCurrentPageKey = key;
        if (!this.hadFirstNotEmptyLayout && measureResult.getVisiblePagesInfo().isEmpty()) {
            return;
        }
        this.hadFirstNotEmptyLayout = true;
        MeasuredPage currentPage2 = measureResult.getCurrentPage();
        if (currentPage2 != null) {
            index = currentPage2.getIndex();
        } else {
            index = 0;
        }
        xMQ(index, measureResult.getCurrentPageOffsetFraction());
    }

    public final void mUb(float offsetFraction) {
        KN(offsetFraction);
    }
}
