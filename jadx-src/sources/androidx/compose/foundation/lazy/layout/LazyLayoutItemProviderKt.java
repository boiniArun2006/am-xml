package androidx.compose.foundation.lazy.layout;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "", "key", "", "lastKnownIndex", c.f62177j, "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;Ljava/lang/Object;I)I", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LazyLayoutItemProviderKt {
    public static final int n(LazyLayoutItemProvider lazyLayoutItemProvider, Object obj, int i2) {
        int iT;
        return (obj == null || lazyLayoutItemProvider.n() == 0 || (i2 < lazyLayoutItemProvider.n() && Intrinsics.areEqual(obj, lazyLayoutItemProvider.nr(i2))) || (iT = lazyLayoutItemProvider.t(obj)) == -1) ? i2 : iT;
    }
}
