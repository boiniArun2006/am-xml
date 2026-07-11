package androidx.compose.foundation.lazy.grid;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridState;", c.f62177j, "()Landroidx/compose/foundation/lazy/grid/LazyGridState;"}, k = 3, mv = {1, 9, 0})
final class LazyGridStateKt$rememberLazyGridState$3$1 extends Lambda implements Function0<LazyGridState> {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ LazyGridPrefetchStrategy f18370O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ int f18371n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ int f18372t;

    @Override // kotlin.jvm.functions.Function0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final LazyGridState invoke() {
        return new LazyGridState(this.f18371n, this.f18372t, this.f18370O);
    }
}
