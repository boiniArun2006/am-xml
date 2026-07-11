package androidx.compose.foundation.lazy.grid;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", c.f62177j, "(Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;)J"}, k = 3, mv = {1, 9, 0})
final class LazyGridIntervalContent$stickyHeader$1 extends Lambda implements Function1<LazyGridItemSpanScope, GridItemSpan> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final LazyGridIntervalContent$stickyHeader$1 f18251n = new LazyGridIntervalContent$stickyHeader$1();

    LazyGridIntervalContent$stickyHeader$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope) {
        return GridItemSpan.n(n(lazyGridItemSpanScope));
    }

    public final long n(LazyGridItemSpanScope lazyGridItemSpanScope) {
        return LazyGridSpanKt.n(lazyGridItemSpanScope.n());
    }
}
