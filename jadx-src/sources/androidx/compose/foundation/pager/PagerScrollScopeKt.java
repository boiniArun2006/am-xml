package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/pager/PagerState;", "state", "Landroidx/compose/foundation/gestures/ScrollScope;", "scrollScope", "Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;", c.f62177j, "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/gestures/ScrollScope;)Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PagerScrollScopeKt {
    public static final LazyLayoutScrollScope n(PagerState pagerState, ScrollScope scrollScope) {
        return new PagerScrollScopeKt$LazyLayoutScrollScope$1(scrollScope, pagerState);
    }
}
