package androidx.compose.foundation.lazy;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u001d\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015R+\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u0010R+\u0010\b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u0010R\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010!R\u0017\u0010&\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b\u001a\u0010$\u001a\u0004\b\u001b\u0010%¨\u0006'"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListScrollPosition;", "", "", "initialIndex", "initialScrollOffset", "<init>", "(II)V", "index", "scrollOffset", "", "Uo", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "measureResult", "KN", "(Landroidx/compose/foundation/lazy/LazyListMeasureResult;)V", "xMQ", "(I)V", "nr", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "itemProvider", "mUb", "(Landroidx/compose/foundation/lazy/LazyListItemProvider;I)I", "<set-?>", c.f62177j, "Landroidx/compose/runtime/MutableIntState;", "()I", "O", "rl", "t", "J2", "", "Z", "hadFirstNotEmptyLayout", "Ljava/lang/Object;", "lastKnownFirstItemKey", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "nearestRangeState", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyListScrollPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListScrollPosition.kt\nandroidx/compose/foundation/lazy/LazyListScrollPosition\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,123:1\n78#2:124\n107#2,2:125\n78#2:127\n107#2,2:128\n50#3,5:130\n50#3,5:135\n96#3,5:140\n*S KotlinDebug\n*F\n+ 1 LazyListScrollPosition.kt\nandroidx/compose/foundation/lazy/LazyListScrollPosition\n*L\n33#1:124\n33#1:125,2\n35#1:127\n35#1:128,2\n59#1:130,5\n67#1:135,5\n108#1:140,5\n*E\n"})
public final class LazyListScrollPosition {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final LazyLayoutNearestRangeState nearestRangeState;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final MutableIntState index;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private Object lastKnownFirstItemKey;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final MutableIntState scrollOffset;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean hadFirstNotEmptyLayout;

    private final void Uo(int index, int scrollOffset) {
        if (!(((float) index) >= 0.0f)) {
            InlineClassHelperKt.n("Index should be non-negative (" + index + ')');
        }
        O(index);
        this.nearestRangeState.XQ(index);
        J2(scrollOffset);
    }

    public final void xMQ(int scrollOffset) {
        if (!(((float) scrollOffset) >= 0.0f)) {
            InlineClassHelperKt.t("scrollOffset should be non-negative");
        }
        J2(scrollOffset);
    }

    private final void J2(int i2) {
        this.scrollOffset.KN(i2);
    }

    public final void O(int i2) {
        this.index.KN(i2);
    }

    public final int mUb(LazyListItemProvider itemProvider, int index) {
        int iN = LazyLayoutItemProviderKt.n(itemProvider, this.lastKnownFirstItemKey, index);
        if (index != iN) {
            O(iN);
            this.nearestRangeState.XQ(index);
        }
        return iN;
    }

    public final int n() {
        return this.index.J2();
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final LazyLayoutNearestRangeState getNearestRangeState() {
        return this.nearestRangeState;
    }

    public final int t() {
        return this.scrollOffset.J2();
    }

    public LazyListScrollPosition(int i2, int i3) {
        this.index = SnapshotIntStateKt.n(i2);
        this.scrollOffset = SnapshotIntStateKt.n(i3);
        this.nearestRangeState = new LazyLayoutNearestRangeState(i2, 30, 100);
    }

    public final void KN(LazyListMeasureResult measureResult) {
        Object key;
        LazyListMeasuredItem firstVisibleItem = measureResult.getFirstVisibleItem();
        if (firstVisibleItem != null) {
            key = firstVisibleItem.getKey();
        } else {
            key = null;
        }
        this.lastKnownFirstItemKey = key;
        if (!this.hadFirstNotEmptyLayout && measureResult.getTotalItemsCount() <= 0) {
            return;
        }
        boolean z2 = true;
        this.hadFirstNotEmptyLayout = true;
        int firstVisibleItemScrollOffset = measureResult.getFirstVisibleItemScrollOffset();
        int index = 0;
        if (firstVisibleItemScrollOffset < 0.0f) {
            z2 = false;
        }
        if (!z2) {
            InlineClassHelperKt.t("scrollOffset should be non-negative");
        }
        LazyListMeasuredItem firstVisibleItem2 = measureResult.getFirstVisibleItem();
        if (firstVisibleItem2 != null) {
            index = firstVisibleItem2.getIndex();
        }
        Uo(index, firstVisibleItemScrollOffset);
    }

    public final void nr(int index, int scrollOffset) {
        Uo(index, scrollOffset);
        this.lastKnownFirstItemKey = null;
    }
}
