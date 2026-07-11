package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "", c.f62177j, "(Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;)I", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyGridLayoutInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridLayoutInfo.kt\nandroidx/compose/foundation/lazy/grid/LazyGridLayoutInfoKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,133:1\n59#2:134\n54#2:136\n90#3:135\n85#3:137\n*S KotlinDebug\n*F\n+ 1 LazyGridLayoutInfo.kt\nandroidx/compose/foundation/lazy/grid/LazyGridLayoutInfoKt\n*L\n117#1:134\n119#1:136\n117#1:135\n119#1:137\n*E\n"})
public final class LazyGridLayoutInfoKt {
    private static final int rl(boolean z2, LazyGridLayoutInfo lazyGridLayoutInfo, int i2) {
        return z2 ? ((LazyGridItemInfo) lazyGridLayoutInfo.xMQ().get(i2)).xMQ() : ((LazyGridItemInfo) lazyGridLayoutInfo.xMQ().get(i2)).gh();
    }

    public static final int n(LazyGridLayoutInfo lazyGridLayoutInfo) {
        boolean z2;
        long jN;
        if (lazyGridLayoutInfo.n() == Orientation.f16969n) {
            z2 = true;
        } else {
            z2 = false;
        }
        List listXMQ = lazyGridLayoutInfo.xMQ();
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        while (i2 < listXMQ.size()) {
            int iRl = rl(z2, lazyGridLayoutInfo, i2);
            if (iRl == -1) {
                i2++;
            } else {
                int iMax = 0;
                while (i2 < listXMQ.size() && rl(z2, lazyGridLayoutInfo, i2) == iRl) {
                    if (z2) {
                        jN = ((LazyGridItemInfo) listXMQ.get(i2)).n() & 4294967295L;
                    } else {
                        jN = ((LazyGridItemInfo) listXMQ.get(i2)).n() >> 32;
                    }
                    iMax = Math.max(iMax, (int) jN);
                    i2++;
                }
                i3 += iMax;
                i5++;
            }
        }
        return (i3 / i5) + lazyGridLayoutInfo.Uo();
    }
}
