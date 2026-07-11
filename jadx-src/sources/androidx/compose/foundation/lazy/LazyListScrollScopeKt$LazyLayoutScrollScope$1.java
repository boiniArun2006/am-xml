package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012¨\u0006\u001a"}, d2 = {"androidx/compose/foundation/lazy/LazyListScrollScopeKt$LazyLayoutScrollScope$1", "Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;", "Landroidx/compose/foundation/gestures/ScrollScope;", "", "pixels", "nr", "(F)F", "", "index", "offset", "", "t", "(II)V", "targetIndex", "targetOffset", "J2", "(II)I", "KN", "()I", "firstVisibleItemIndex", "Uo", "firstVisibleItemScrollOffset", "rl", "lastVisibleItemIndex", c.f62177j, "itemCount", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyListScrollScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListScrollScope.kt\nandroidx/compose/foundation/lazy/LazyListScrollScopeKt$LazyLayoutScrollScope$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,67:1\n117#2,2:68\n34#2,6:70\n119#2:76\n*S KotlinDebug\n*F\n+ 1 LazyListScrollScope.kt\nandroidx/compose/foundation/lazy/LazyListScrollScopeKt$LazyLayoutScrollScope$1\n*L\n61#1:68,2\n61#1:70,6\n61#1:76\n*E\n"})
public final class LazyListScrollScopeKt$LazyLayoutScrollScope$1 implements LazyLayoutScrollScope, ScrollScope {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ ScrollScope f18103n;
    final /* synthetic */ LazyListState rl;

    @Override // androidx.compose.foundation.gestures.ScrollScope
    public float nr(float pixels) {
        return this.f18103n.nr(pixels);
    }

    LazyListScrollScopeKt$LazyLayoutScrollScope$1(ScrollScope scrollScope, LazyListState lazyListState) {
        this.rl = lazyListState;
        this.f18103n = scrollScope;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public int J2(int targetIndex, int targetOffset) {
        Object obj;
        LazyListLayoutInfo lazyListLayoutInfoAYN = this.rl.aYN();
        int iN = 0;
        if (lazyListLayoutInfoAYN.getVisibleItemsInfo().isEmpty()) {
            return 0;
        }
        int iKN = KN();
        if (targetIndex > rl() || iKN > targetIndex) {
            iN = (LazyListLayoutInfoKt.n(lazyListLayoutInfoAYN) * (targetIndex - KN())) - Uo();
        } else {
            List visibleItemsInfo = lazyListLayoutInfoAYN.getVisibleItemsInfo();
            int size = visibleItemsInfo.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    obj = null;
                    break;
                }
                obj = visibleItemsInfo.get(i2);
                if (((LazyListItemInfo) obj).getIndex() == targetIndex) {
                    break;
                }
                i2++;
            }
            LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) obj;
            if (lazyListItemInfo != null) {
                iN = lazyListItemInfo.n();
            }
        }
        return iN + targetOffset;
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
        return this.rl.aYN().getTotalItemsCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public int rl() {
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt.lastOrNull(this.rl.aYN().getVisibleItemsInfo());
        if (lazyListItemInfo != null) {
            return lazyListItemInfo.getIndex();
        }
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public void t(int index, int offset) {
        this.rl.v(index, offset, true);
    }
}
