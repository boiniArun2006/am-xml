package androidx.compose.foundation.lazy.staggeredgrid;

import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "index", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", c.f62177j, "(I)Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;"}, k = 3, mv = {1, 9, 0})
public final class LazyStaggeredGridDslKt$items$4$1 extends Lambda implements Function1<Integer, StaggeredGridItemSpan> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Function1 f18654n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ List f18655t;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ StaggeredGridItemSpan invoke(Integer num) {
        return n(num.intValue());
    }

    public final StaggeredGridItemSpan n(int i2) {
        return (StaggeredGridItemSpan) this.f18654n.invoke(this.f18655t.get(i2));
    }
}
