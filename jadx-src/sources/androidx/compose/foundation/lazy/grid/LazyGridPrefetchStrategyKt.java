package androidx.compose.foundation.lazy.grid;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "nestedPrefetchItemCount", "Landroidx/compose/foundation/lazy/grid/LazyGridPrefetchStrategy;", c.f62177j, "(I)Landroidx/compose/foundation/lazy/grid/LazyGridPrefetchStrategy;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LazyGridPrefetchStrategyKt {
    public static final LazyGridPrefetchStrategy n(int i2) {
        return new DefaultLazyGridPrefetchStrategy(i2);
    }

    public static /* synthetic */ LazyGridPrefetchStrategy rl(int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 2;
        }
        return n(i2);
    }
}
