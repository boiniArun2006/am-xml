package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.runtime.Stable;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Stable
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u000b*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/lazy/DefaultLazyListPrefetchStrategy;", "Landroidx/compose/foundation/lazy/LazyListPrefetchStrategy;", "", "nestedPrefetchItemCount", "<init>", "(I)V", "Landroidx/compose/foundation/lazy/LazyListPrefetchScope;", "", "delta", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "layoutInfo", "", "t", "(Landroidx/compose/foundation/lazy/LazyListPrefetchScope;FLandroidx/compose/foundation/lazy/LazyListLayoutInfo;)V", "nr", "(Landroidx/compose/foundation/lazy/LazyListPrefetchScope;Landroidx/compose/foundation/lazy/LazyListLayoutInfo;)V", "Landroidx/compose/foundation/lazy/layout/NestedPrefetchScope;", "firstVisibleItemIndex", c.f62177j, "(Landroidx/compose/foundation/lazy/layout/NestedPrefetchScope;I)V", "I", "rl", "indexToPrefetch", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "currentPrefetchHandle", "", "Z", "wasScrollingForward", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyListPrefetchStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListPrefetchStrategy.kt\nandroidx/compose/foundation/lazy/DefaultLazyListPrefetchStrategy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,200:1\n1#2:201\n*E\n"})
final class DefaultLazyListPrefetchStrategy implements LazyListPrefetchStrategy {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int nestedPrefetchItemCount;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private boolean wasScrollingForward;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private int indexToPrefetch = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private LazyLayoutPrefetchState.PrefetchHandle currentPrefetchHandle;

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchStrategy
    public void n(NestedPrefetchScope nestedPrefetchScope, int i2) {
        int i3 = this.nestedPrefetchItemCount;
        for (int i5 = 0; i5 < i3; i5++) {
            nestedPrefetchScope.n(i2 + i5);
        }
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchStrategy
    public void nr(LazyListPrefetchScope lazyListPrefetchScope, LazyListLayoutInfo lazyListLayoutInfo) {
        if (this.indexToPrefetch == -1 || lazyListLayoutInfo.xMQ().isEmpty()) {
            return;
        }
        if (this.indexToPrefetch != (this.wasScrollingForward ? ((LazyListItemInfo) CollectionsKt.last(lazyListLayoutInfo.xMQ())).getIndex() + 1 : ((LazyListItemInfo) CollectionsKt.first(lazyListLayoutInfo.xMQ())).getIndex() - 1)) {
            this.indexToPrefetch = -1;
            LazyLayoutPrefetchState.PrefetchHandle prefetchHandle = this.currentPrefetchHandle;
            if (prefetchHandle != null) {
                prefetchHandle.cancel();
            }
            this.currentPrefetchHandle = null;
        }
    }

    public DefaultLazyListPrefetchStrategy(int i2) {
        this.nestedPrefetchItemCount = i2;
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchStrategy
    public void t(LazyListPrefetchScope lazyListPrefetchScope, float f3, LazyListLayoutInfo lazyListLayoutInfo) {
        boolean z2;
        int index;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle2;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle3;
        if (!lazyListLayoutInfo.xMQ().isEmpty()) {
            if (f3 < 0.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                index = ((LazyListItemInfo) CollectionsKt.last(lazyListLayoutInfo.xMQ())).getIndex() + 1;
            } else {
                index = ((LazyListItemInfo) CollectionsKt.first(lazyListLayoutInfo.xMQ())).getIndex() - 1;
            }
            if (index >= 0 && index < lazyListLayoutInfo.J2()) {
                if (index != this.indexToPrefetch) {
                    if (this.wasScrollingForward != z2 && (prefetchHandle3 = this.currentPrefetchHandle) != null) {
                        prefetchHandle3.cancel();
                    }
                    this.wasScrollingForward = z2;
                    this.indexToPrefetch = index;
                    this.currentPrefetchHandle = lazyListPrefetchScope.n(index);
                }
                if (z2) {
                    LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt.last(lazyListLayoutInfo.xMQ());
                    if (((lazyListItemInfo.n() + lazyListItemInfo.getSize()) + lazyListLayoutInfo.Uo()) - lazyListLayoutInfo.O() < (-f3) && (prefetchHandle2 = this.currentPrefetchHandle) != null) {
                        prefetchHandle2.n();
                        return;
                    }
                    return;
                }
                if (lazyListLayoutInfo.KN() - ((LazyListItemInfo) CollectionsKt.first(lazyListLayoutInfo.xMQ())).n() < f3 && (prefetchHandle = this.currentPrefetchHandle) != null) {
                    prefetchHandle.n();
                }
            }
        }
    }
}
