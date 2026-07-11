package androidx.compose.foundation.lazy;

import androidx.collection.IntList;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010%\u001a\u0004\b \u0010&R\u0014\u0010'\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001dR\u0014\u0010+\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListItemProviderImpl;", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "Landroidx/compose/foundation/lazy/LazyListState;", "state", "Landroidx/compose/foundation/lazy/LazyListIntervalContent;", "intervalContent", "Landroidx/compose/foundation/lazy/LazyItemScopeImpl;", "itemScope", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "keyIndexMap", "<init>", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/lazy/LazyListIntervalContent;Landroidx/compose/foundation/lazy/LazyItemScopeImpl;Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;)V", "", "index", "", "key", "", "xMQ", "(ILjava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "nr", "(I)Ljava/lang/Object;", "J2", "t", "(Ljava/lang/Object;)I", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", c.f62177j, "Landroidx/compose/foundation/lazy/LazyListState;", "rl", "Landroidx/compose/foundation/lazy/LazyListIntervalContent;", "Landroidx/compose/foundation/lazy/LazyItemScopeImpl;", "Uo", "()Landroidx/compose/foundation/lazy/LazyItemScopeImpl;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "itemCount", "Landroidx/collection/IntList;", "O", "()Landroidx/collection/IntList;", "headerIndexes", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class LazyListItemProviderImpl implements LazyListItemProvider {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final LazyListState state;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final LazyLayoutKeyIndexMap keyIndexMap;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final LazyListIntervalContent intervalContent;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final LazyItemScopeImpl itemScope;

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public Object J2(int index) {
        return this.intervalContent.ty(index);
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemProvider
    public IntList O() {
        return this.intervalContent.r();
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemProvider
    /* JADX INFO: renamed from: Uo, reason: from getter */
    public LazyItemScopeImpl getItemScope() {
        return this.itemScope;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof LazyListItemProviderImpl) {
            return Intrinsics.areEqual(this.intervalContent, ((LazyListItemProviderImpl) other).intervalContent);
        }
        return false;
    }

    public int hashCode() {
        return this.intervalContent.hashCode();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int n() {
        return this.intervalContent.ck();
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemProvider
    /* JADX INFO: renamed from: rl, reason: from getter */
    public LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.keyIndexMap;
    }

    public LazyListItemProviderImpl(LazyListState lazyListState, LazyListIntervalContent lazyListIntervalContent, LazyItemScopeImpl lazyItemScopeImpl, LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap) {
        this.state = lazyListState;
        this.intervalContent = lazyListIntervalContent;
        this.itemScope = lazyItemScopeImpl;
        this.keyIndexMap = lazyLayoutKeyIndexMap;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public Object nr(int index) {
        Object objNr = getKeyIndexMap().nr(index);
        if (objNr == null) {
            return this.intervalContent.Ik(index);
        }
        return objNr;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int t(Object key) {
        return getKeyIndexMap().t(key);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public void xMQ(final int i2, Object obj, Composer composer, int i3) {
        composer.eF(-462424778);
        if (ComposerKt.v()) {
            ComposerKt.p5(-462424778, i3, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item (LazyListItemProvider.kt:80)");
        }
        LazyLayoutPinnableItemKt.n(obj, i2, this.state.getPinnedItems(), ComposableLambdaKt.nr(-824725566, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderImpl$Item$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                n(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void n(Composer composer2, int i5) {
                if (!composer2.HI((i5 & 3) != 2, i5 & 1)) {
                    composer2.wTp();
                    return;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(-824725566, i5, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item.<anonymous> (LazyListItemProvider.kt:82)");
                }
                LazyListIntervalContent lazyListIntervalContent = this.f18041n.intervalContent;
                int i7 = i2;
                LazyListItemProviderImpl lazyListItemProviderImpl = this.f18041n;
                IntervalList.Interval interval = lazyListIntervalContent.getIntervals().get(i7);
                ((LazyListInterval) interval.getValue()).getItem().invoke(lazyListItemProviderImpl.getItemScope(), Integer.valueOf(i7 - interval.getStartIndex()), composer2, 0);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }, composer, 54), composer, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
    }
}
