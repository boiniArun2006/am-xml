package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012¨\u0006\u001a"}, d2 = {"androidx/compose/foundation/pager/PagerScrollScopeKt$LazyLayoutScrollScope$1", "Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;", "Landroidx/compose/foundation/gestures/ScrollScope;", "", "pixels", "nr", "(F)F", "", "index", "offset", "", "t", "(II)V", "targetIndex", "targetOffset", "J2", "(II)I", "KN", "()I", "firstVisibleItemIndex", "Uo", "firstVisibleItemScrollOffset", "rl", "lastVisibleItemIndex", c.f62177j, "itemCount", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PagerScrollScopeKt$LazyLayoutScrollScope$1 implements LazyLayoutScrollScope, ScrollScope {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ ScrollScope f18978n;
    final /* synthetic */ PagerState rl;

    @Override // androidx.compose.foundation.gestures.ScrollScope
    public float nr(float pixels) {
        return this.f18978n.nr(pixels);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public void t(int index, int offset) {
        this.rl.eTf(index, offset / this.rl.nHg(), true);
    }

    PagerScrollScopeKt$LazyLayoutScrollScope$1(ScrollScope scrollScope, PagerState pagerState) {
        this.rl = pagerState;
        this.f18978n = scrollScope;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public int J2(int targetIndex, int targetOffset) {
        return (int) (RangesKt.coerceIn(PagerScrollPositionKt.n(this.rl) + ((long) MathKt.roundToInt((((targetIndex - this.rl.S()) * this.rl.nHg()) - (this.rl.WPU() * this.rl.nHg())) + targetOffset)), this.rl.getMinScrollOffset(), this.rl.getMaxScrollOffset()) - PagerScrollPositionKt.n(this.rl));
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public int KN() {
        return this.rl.getFirstVisiblePage();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public int Uo() {
        return this.rl.getFirstVisiblePageOffset();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public int n() {
        return this.rl.T();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public int rl() {
        return ((PageInfo) CollectionsKt.last(this.rl.iF().getVisiblePagesInfo())).getIndex();
    }
}
