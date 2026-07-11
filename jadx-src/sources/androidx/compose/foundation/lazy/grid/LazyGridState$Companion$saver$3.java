package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.saveable.SaverScope;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/runtime/saveable/SaverScope;", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "it", "", "", c.f62177j, "(Landroidx/compose/runtime/saveable/SaverScope;Landroidx/compose/foundation/lazy/grid/LazyGridState;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
final class LazyGridState$Companion$saver$3 extends Lambda implements Function2<SaverScope, LazyGridState, List<? extends Integer>> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final LazyGridState$Companion$saver$3 f18343n = new LazyGridState$Companion$saver$3();

    LazyGridState$Companion$saver$3() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final List invoke(SaverScope saverScope, LazyGridState lazyGridState) {
        return CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(lazyGridState.r()), Integer.valueOf(lazyGridState.o())});
    }
}
