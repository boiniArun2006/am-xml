package androidx.compose.foundation.lazy.grid;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", c.f62177j, "(Ljava/util/List;)Landroidx/compose/foundation/lazy/grid/LazyGridState;"}, k = 3, mv = {1, 9, 0})
final class LazyGridState$Companion$saver$4 extends Lambda implements Function1<List<? extends Integer>, LazyGridState> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ LazyGridPrefetchStrategy f18344n;

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final LazyGridState invoke(List list) {
        return new LazyGridState(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue(), this.f18344n);
    }
}
