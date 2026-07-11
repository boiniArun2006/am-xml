package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Stable
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u000b*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/lazy/grid/DefaultLazyGridPrefetchStrategy;", "Landroidx/compose/foundation/lazy/grid/LazyGridPrefetchStrategy;", "", "nestedPrefetchItemCount", "<init>", "(I)V", "Landroidx/compose/foundation/lazy/grid/LazyGridPrefetchScope;", "", "delta", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "layoutInfo", "", "t", "(Landroidx/compose/foundation/lazy/grid/LazyGridPrefetchScope;FLandroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;)V", "nr", "(Landroidx/compose/foundation/lazy/grid/LazyGridPrefetchScope;Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;)V", "Landroidx/compose/foundation/lazy/layout/NestedPrefetchScope;", "firstVisibleItemIndex", c.f62177j, "(Landroidx/compose/foundation/lazy/layout/NestedPrefetchScope;I)V", "I", "rl", "lineToPrefetch", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "Landroidx/compose/runtime/collection/MutableVector;", "currentLinePrefetchHandles", "", "Z", "wasScrollingForward", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyGridPrefetchStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridPrefetchStrategy.kt\nandroidx/compose/foundation/lazy/grid/DefaultLazyGridPrefetchStrategy\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,230:1\n1101#2:231\n1083#2,2:232\n423#3,9:234\n136#3:243\n423#3,9:244\n423#3,9:253\n423#3,9:262\n1#4:271\n*S KotlinDebug\n*F\n+ 1 LazyGridPrefetchStrategy.kt\nandroidx/compose/foundation/lazy/grid/DefaultLazyGridPrefetchStrategy\n*L\n134#1:231\n134#1:232,2\n174#1:234,9\n179#1:243\n190#1:244,9\n199#1:253,9\n220#1:262,9\n*E\n"})
final class DefaultLazyGridPrefetchStrategy implements LazyGridPrefetchStrategy {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int nestedPrefetchItemCount;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private boolean wasScrollingForward;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private int lineToPrefetch = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final MutableVector currentLinePrefetchHandles = new MutableVector(new LazyLayoutPrefetchState.PrefetchHandle[16], 0);

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy
    public void n(NestedPrefetchScope nestedPrefetchScope, int i2) {
        int i3 = this.nestedPrefetchItemCount;
        for (int i5 = 0; i5 < i3; i5++) {
            nestedPrefetchScope.n(i2 + i5);
        }
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy
    public void nr(LazyGridPrefetchScope lazyGridPrefetchScope, LazyGridLayoutInfo lazyGridLayoutInfo) {
        int iXMQ;
        if (this.lineToPrefetch == -1 || lazyGridLayoutInfo.xMQ().isEmpty()) {
            return;
        }
        if (this.wasScrollingForward) {
            LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) CollectionsKt.last(lazyGridLayoutInfo.xMQ());
            iXMQ = (lazyGridLayoutInfo.n() == Orientation.f16969n ? lazyGridItemInfo.xMQ() : lazyGridItemInfo.gh()) + 1;
        } else {
            LazyGridItemInfo lazyGridItemInfo2 = (LazyGridItemInfo) CollectionsKt.first(lazyGridLayoutInfo.xMQ());
            iXMQ = (lazyGridLayoutInfo.n() == Orientation.f16969n ? lazyGridItemInfo2.xMQ() : lazyGridItemInfo2.gh()) - 1;
        }
        if (this.lineToPrefetch != iXMQ) {
            this.lineToPrefetch = -1;
            MutableVector mutableVector = this.currentLinePrefetchHandles;
            Object[] objArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i2 = 0; i2 < size; i2++) {
                ((LazyLayoutPrefetchState.PrefetchHandle) objArr[i2]).cancel();
            }
            this.currentLinePrefetchHandles.KN();
        }
    }

    public DefaultLazyGridPrefetchStrategy(int i2) {
        this.nestedPrefetchItemCount = i2;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy
    public void t(LazyGridPrefetchScope lazyGridPrefetchScope, float f3, LazyGridLayoutInfo lazyGridLayoutInfo) {
        boolean z2;
        int iGh;
        int i2;
        int index;
        int iGh2;
        if (!lazyGridLayoutInfo.xMQ().isEmpty()) {
            int i3 = 0;
            if (f3 < 0.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) CollectionsKt.last(lazyGridLayoutInfo.xMQ());
                if (lazyGridLayoutInfo.n() == Orientation.f16969n) {
                    iGh2 = lazyGridItemInfo.xMQ();
                } else {
                    iGh2 = lazyGridItemInfo.gh();
                }
                i2 = iGh2 + 1;
                index = ((LazyGridItemInfo) CollectionsKt.last(lazyGridLayoutInfo.xMQ())).getIndex() + 1;
            } else {
                LazyGridItemInfo lazyGridItemInfo2 = (LazyGridItemInfo) CollectionsKt.first(lazyGridLayoutInfo.xMQ());
                if (lazyGridLayoutInfo.n() == Orientation.f16969n) {
                    iGh = lazyGridItemInfo2.xMQ();
                } else {
                    iGh = lazyGridItemInfo2.gh();
                }
                i2 = iGh - 1;
                index = ((LazyGridItemInfo) CollectionsKt.first(lazyGridLayoutInfo.xMQ())).getIndex() - 1;
            }
            if (index >= 0 && index < lazyGridLayoutInfo.J2()) {
                if (i2 != this.lineToPrefetch && i2 >= 0) {
                    if (this.wasScrollingForward != z2) {
                        MutableVector mutableVector = this.currentLinePrefetchHandles;
                        Object[] objArr = mutableVector.content;
                        int size = mutableVector.getSize();
                        for (int i5 = 0; i5 < size; i5++) {
                            ((LazyLayoutPrefetchState.PrefetchHandle) objArr[i5]).cancel();
                        }
                    }
                    this.wasScrollingForward = z2;
                    this.lineToPrefetch = i2;
                    this.currentLinePrefetchHandles.KN();
                    MutableVector mutableVector2 = this.currentLinePrefetchHandles;
                    mutableVector2.O(mutableVector2.getSize(), lazyGridPrefetchScope.n(i2));
                }
                if (z2) {
                    int iT = LazyGridSnapLayoutInfoProviderKt.t((LazyGridItemInfo) CollectionsKt.last(lazyGridLayoutInfo.xMQ()), lazyGridLayoutInfo.n());
                    if (((LazyGridSnapLayoutInfoProviderKt.rl(r8, lazyGridLayoutInfo.n()) + iT) + lazyGridLayoutInfo.Uo()) - lazyGridLayoutInfo.O() < (-f3)) {
                        MutableVector mutableVector3 = this.currentLinePrefetchHandles;
                        Object[] objArr2 = mutableVector3.content;
                        int size2 = mutableVector3.getSize();
                        while (i3 < size2) {
                            ((LazyLayoutPrefetchState.PrefetchHandle) objArr2[i3]).n();
                            i3++;
                        }
                        return;
                    }
                    return;
                }
                if (lazyGridLayoutInfo.KN() - LazyGridSnapLayoutInfoProviderKt.rl((LazyGridItemInfo) CollectionsKt.first(lazyGridLayoutInfo.xMQ()), lazyGridLayoutInfo.n()) < f3) {
                    MutableVector mutableVector4 = this.currentLinePrefetchHandles;
                    Object[] objArr3 = mutableVector4.content;
                    int size3 = mutableVector4.getSize();
                    while (i3 < size3) {
                        ((LazyLayoutPrefetchState.PrefetchHandle) objArr3[i3]).n();
                        i3++;
                    }
                }
            }
        }
    }
}
