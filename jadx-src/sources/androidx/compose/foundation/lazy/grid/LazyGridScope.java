package androidx.compose.foundation.lazy.grid;

import aT.dE.JLZo;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.caoccao.javet.exceptions.JavetError;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@LazyGridScopeMarker
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001JÊ\u0001\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022%\b\u0002\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000420\b\u0002\u0010\r\u001a*\u0012\u0004\u0012\u00020\n\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0002\b\f2%\b\u0002\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000421\u0010\u0012\u001a-\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00100\t¢\u0006\u0002\b\u0011¢\u0006\u0002\b\fH&¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0001\u0001\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "", "", JavetError.PARAMETER_COUNT, "Lkotlin/Function1;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "index", "key", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "Lkotlin/ExtensionFunctionType;", TtmlNode.TAG_SPAN, "contentType", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "", "Landroidx/compose/runtime/Composable;", "itemContent", "gh", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface LazyGridScope {
    void gh(int count, Function1 key, Function2 span, Function1 contentType, Function4 itemContent);

    static /* synthetic */ void KN(LazyGridScope lazyGridScope, int i2, Function1 function1, Function2 function2, Function1 function12, Function4 function4, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(JLZo.BZbkLsjXiZ);
        }
        if ((i3 & 2) != 0) {
            function1 = null;
        }
        if ((i3 & 4) != 0) {
            function2 = null;
        }
        if ((i3 & 8) != 0) {
            function12 = new Function1() { // from class: androidx.compose.foundation.lazy.grid.LazyGridScope$items$1
                public final Void n(int i5) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return n(((Number) obj2).intValue());
                }
            };
        }
        lazyGridScope.gh(i2, function1, function2, function12, function4);
    }
}
