package androidx.compose.foundation.lazy.staggeredgrid;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "it", "", c.f62177j, "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
final class LazyStaggeredGridMeasureKt$measure$1$30$1 extends Lambda implements Function1<LazyStaggeredGridMeasuredItem, CharSequence> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final LazyStaggeredGridMeasureKt$measure$1$30$1 f18732n = new LazyStaggeredGridMeasureKt$measure$1$30$1();

    LazyStaggeredGridMeasureKt$measure$1$30$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final CharSequence invoke(LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem) {
        return String.valueOf(lazyStaggeredGridMeasuredItem.getIndex());
    }
}
