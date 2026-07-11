package androidx.compose.foundation.lazy;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "", c.f62177j, "(Landroidx/compose/foundation/lazy/LazyListLayoutInfo;)I", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyListLayoutInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListLayoutInfo.kt\nandroidx/compose/foundation/lazy/LazyListLayoutInfoKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,95:1\n133#2,3:96\n34#2,6:99\n136#2:105\n*S KotlinDebug\n*F\n+ 1 LazyListLayoutInfo.kt\nandroidx/compose/foundation/lazy/LazyListLayoutInfoKt\n*L\n92#1:96,3\n92#1:99,6\n92#1:105\n*E\n"})
public final class LazyListLayoutInfoKt {
    public static final int n(LazyListLayoutInfo lazyListLayoutInfo) {
        List listXMQ = lazyListLayoutInfo.xMQ();
        int size = listXMQ.size();
        int size2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            size2 += ((LazyListItemInfo) listXMQ.get(i2)).getSize();
        }
        return (size2 / listXMQ.size()) + lazyListLayoutInfo.Uo();
    }
}
