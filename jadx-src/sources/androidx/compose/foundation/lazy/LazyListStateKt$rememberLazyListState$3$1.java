package androidx.compose.foundation.lazy;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListState;", c.f62177j, "()Landroidx/compose/foundation/lazy/LazyListState;"}, k = 3, mv = {1, 9, 0})
final class LazyListStateKt$rememberLazyListState$3$1 extends Lambda implements Function0<LazyListState> {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ LazyListPrefetchStrategy f18140O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ int f18141n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ int f18142t;

    @Override // kotlin.jvm.functions.Function0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final LazyListState invoke() {
        return new LazyListState(this.f18141n, this.f18142t, this.f18140O);
    }
}
