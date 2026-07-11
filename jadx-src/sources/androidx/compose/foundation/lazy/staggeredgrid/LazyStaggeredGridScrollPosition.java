package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00126\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010 \u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b \u0010!J\u001d\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%RD\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010&R$\u0010\u000e\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u0010(\u001a\u0004\b)\u0010*R+\u0010\u001e\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00068F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-\"\u0004\b.\u0010/R$\u0010\u001b\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b)\u0010(\u001a\u0004\b0\u0010*R+\u0010\u001f\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00068F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010,\u001a\u0004\b2\u0010-\"\u0004\b3\u0010/R\u0016\u00106\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00105R\u0018\u00108\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00107R\u0017\u0010<\u001a\u0002098\u0006¢\u0006\f\n\u0004\b \u0010:\u001a\u0004\b1\u0010;¨\u0006="}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;", "", "", "initialIndices", "initialOffsets", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "targetIndex", "laneCount", "fillIndices", "<init>", "([I[ILkotlin/jvm/functions/Function2;)V", "indices", c.f62177j, "([I)I", "offsets", "rl", "([I[I)I", "", "gh", "([I[I)V", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "measureResult", "qie", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;)V", "scrollOffsets", "az", "([I)V", "index", "scrollOffset", "KN", "(II)V", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "itemProvider", "ty", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;[I)[I", "Lkotlin/jvm/functions/Function2;", "<set-?>", "[I", "nr", "()[I", "t", "Landroidx/compose/runtime/MutableIntState;", "()I", "xMQ", "(I)V", "Uo", "O", "J2", "mUb", "", "Z", "hadFirstNotEmptyLayout", "Ljava/lang/Object;", "lastKnownFirstItemKey", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "nearestRangeState", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridScrollPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridScrollPosition.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n*L\n1#1,170:1\n78#2:171\n107#2,2:172\n78#2:174\n107#2,2:175\n13330#3,2:177\n117#4,2:179\n34#4,6:181\n119#4:187\n602#5,8:188\n602#5,8:196\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridScrollPosition.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition\n*L\n37#1:171\n37#1:172,2\n44#1:174\n44#1:175,2\n49#1:177,2\n86#1:179,2\n86#1:181,6\n86#1:187\n93#1:188,8\n145#1:196,8\n*E\n"})
public final class LazyStaggeredGridScrollPosition {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private boolean hadFirstNotEmptyLayout;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final LazyLayoutNearestRangeState nearestRangeState;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final MutableIntState scrollOffset;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private Object lastKnownFirstItemKey;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Function2 fillIndices;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private int[] scrollOffsets;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private int[] indices;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final MutableIntState index;

    private final int n(int[] indices) {
        int i2 = Integer.MAX_VALUE;
        for (int i3 : indices) {
            if (i3 <= 0) {
                return 0;
            }
            if (i2 > i3) {
                i2 = i3;
            }
        }
        if (i2 == Integer.MAX_VALUE) {
            return 0;
        }
        return i2;
    }

    public final void qie(LazyStaggeredGridMeasureResult measureResult) {
        Object obj;
        int iN = n(measureResult.getFirstVisibleItemIndices());
        List visibleItemsInfo = measureResult.getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = visibleItemsInfo.get(i2);
            if (((LazyStaggeredGridMeasuredItem) obj).getIndex() == iN) {
                break;
            } else {
                i2++;
            }
        }
        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem = (LazyStaggeredGridMeasuredItem) obj;
        this.lastKnownFirstItemKey = lazyStaggeredGridMeasuredItem != null ? lazyStaggeredGridMeasuredItem.getKey() : null;
        this.nearestRangeState.XQ(iN);
        if (this.hadFirstNotEmptyLayout || measureResult.getTotalItemsCount() > 0) {
            this.hadFirstNotEmptyLayout = true;
            Snapshot.Companion companion = Snapshot.INSTANCE;
            Snapshot snapshotNr = companion.nr();
            Function1 function1Uo = snapshotNr != null ? snapshotNr.getReadObserver() : null;
            Snapshot snapshotO = companion.O(snapshotNr);
            try {
                gh(measureResult.getFirstVisibleItemIndices(), measureResult.getFirstVisibleItemScrollOffsets());
                Unit unit = Unit.INSTANCE;
            } finally {
                companion.az(snapshotNr, snapshotO, function1Uo);
            }
        }
    }

    private final void gh(int[] indices, int[] offsets) {
        this.indices = indices;
        xMQ(n(indices));
        this.scrollOffsets = offsets;
        mUb(rl(indices, offsets));
    }

    private final void mUb(int i2) {
        this.scrollOffset.KN(i2);
    }

    private final void xMQ(int i2) {
        this.index.KN(i2);
    }

    public final int J2() {
        return this.scrollOffset.J2();
    }

    public final void KN(int index, int scrollOffset) {
        int[] iArr = (int[]) this.fillIndices.invoke(Integer.valueOf(index), Integer.valueOf(this.indices.length));
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr2[i2] = scrollOffset;
        }
        gh(iArr, iArr2);
        this.nearestRangeState.XQ(index);
        this.lastKnownFirstItemKey = null;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final LazyLayoutNearestRangeState getNearestRangeState() {
        return this.nearestRangeState;
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final int[] getScrollOffsets() {
        return this.scrollOffsets;
    }

    public final void az(int[] scrollOffsets) {
        this.scrollOffsets = scrollOffsets;
        mUb(rl(this.indices, scrollOffsets));
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final int[] getIndices() {
        return this.indices;
    }

    public final int t() {
        return this.index.J2();
    }

    public final int[] ty(LazyLayoutItemProvider itemProvider, int[] indices) {
        Object obj = this.lastKnownFirstItemKey;
        Integer orNull = ArraysKt.getOrNull(indices, 0);
        int iN = LazyLayoutItemProviderKt.n(itemProvider, obj, orNull != null ? orNull.intValue() : 0);
        if (ArraysKt.contains(indices, iN)) {
            return indices;
        }
        this.nearestRangeState.XQ(iN);
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot snapshotNr = companion.nr();
        Function1 function1Uo = snapshotNr != null ? snapshotNr.getReadObserver() : null;
        Snapshot snapshotO = companion.O(snapshotNr);
        try {
            int[] iArr = (int[]) this.fillIndices.invoke(Integer.valueOf(iN), Integer.valueOf(indices.length));
            companion.az(snapshotNr, snapshotO, function1Uo);
            this.indices = iArr;
            xMQ(n(iArr));
            return iArr;
        } catch (Throwable th) {
            companion.az(snapshotNr, snapshotO, function1Uo);
            throw th;
        }
    }

    public LazyStaggeredGridScrollPosition(int[] iArr, int[] iArr2, Function2 function2) {
        int iIntValue;
        this.fillIndices = function2;
        this.indices = iArr;
        this.index = SnapshotIntStateKt.n(n(iArr));
        this.scrollOffsets = iArr2;
        this.scrollOffset = SnapshotIntStateKt.n(rl(iArr, iArr2));
        Integer numMinOrNull = ArraysKt.minOrNull(iArr);
        if (numMinOrNull != null) {
            iIntValue = numMinOrNull.intValue();
        } else {
            iIntValue = 0;
        }
        this.nearestRangeState = new LazyLayoutNearestRangeState(iIntValue, 90, 200);
    }

    private final int rl(int[] indices, int[] offsets) {
        int iN = n(indices);
        int length = offsets.length;
        int iMin = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < length; i2++) {
            if (indices[i2] == iN) {
                iMin = Math.min(iMin, offsets[i2]);
            }
        }
        if (iMin == Integer.MAX_VALUE) {
            return 0;
        }
        return iMin;
    }
}
