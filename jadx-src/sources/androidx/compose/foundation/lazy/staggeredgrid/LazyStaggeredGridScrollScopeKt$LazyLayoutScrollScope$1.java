package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.ui.unit.IntOffset;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012¨\u0006\u001a"}, d2 = {"androidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollScopeKt$LazyLayoutScrollScope$1", "Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;", "Landroidx/compose/foundation/gestures/ScrollScope;", "", "pixels", "nr", "(F)F", "", "index", "offset", "", "t", "(II)V", "targetIndex", "targetOffset", "J2", "(II)I", "KN", "()I", "firstVisibleItemIndex", "Uo", "firstVisibleItemScrollOffset", "rl", "lastVisibleItemIndex", c.f62177j, "itemCount", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridScrollScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridScrollScope.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollScopeKt$LazyLayoutScrollScope$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,76:1\n1#2:77\n117#3,2:78\n34#3,6:80\n119#3:86\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridScrollScope.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollScopeKt$LazyLayoutScrollScope$1\n*L\n60#1:78,2\n60#1:80,6\n60#1:86\n*E\n"})
public final class LazyStaggeredGridScrollScopeKt$LazyLayoutScrollScope$1 implements LazyLayoutScrollScope, ScrollScope {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ ScrollScope f18769n;
    final /* synthetic */ LazyStaggeredGridState rl;

    @Override // androidx.compose.foundation.gestures.ScrollScope
    public float nr(float pixels) {
        return this.f18769n.nr(pixels);
    }

    LazyStaggeredGridScrollScopeKt$LazyLayoutScrollScope$1(ScrollScope scrollScope, LazyStaggeredGridState lazyStaggeredGridState) {
        this.rl = lazyStaggeredGridState;
        this.f18769n = scrollScope;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public int J2(int targetIndex, int targetOffset) {
        Object obj;
        int iQie;
        LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfoViF = this.rl.ViF();
        int i2 = 0;
        if (lazyStaggeredGridLayoutInfoViF.getVisibleItemsInfo().isEmpty()) {
            return 0;
        }
        List visibleItemsInfo = lazyStaggeredGridLayoutInfoViF.getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = visibleItemsInfo.get(i2);
            if (((LazyStaggeredGridItemInfo) obj).getIndex() == targetIndex) {
                break;
            }
            i2++;
        }
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo = (LazyStaggeredGridItemInfo) obj;
        if (lazyStaggeredGridItemInfo == null) {
            int iNr = LazyStaggeredGridMeasureResultKt.nr(lazyStaggeredGridLayoutInfoViF);
            int iWPU = this.rl.WPU();
            iQie = (iNr * ((targetIndex / iWPU) - (KN() / iWPU))) - Uo();
        } else {
            iQie = lazyStaggeredGridLayoutInfoViF.getOrientation() == Orientation.f16969n ? IntOffset.qie(lazyStaggeredGridItemInfo.getOffset()) : IntOffset.gh(lazyStaggeredGridItemInfo.getOffset());
        }
        return iQie + targetOffset;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public int KN() {
        return this.rl.o();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public int Uo() {
        return this.rl.Z();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public int n() {
        return this.rl.ViF().getTotalItemsCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public int rl() {
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo = (LazyStaggeredGridItemInfo) CollectionsKt.lastOrNull(this.rl.ViF().getVisibleItemsInfo());
        if (lazyStaggeredGridItemInfo != null) {
            return lazyStaggeredGridItemInfo.getIndex();
        }
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public void t(int index, int offset) {
        this.rl.jB(index, offset, true);
    }
}
