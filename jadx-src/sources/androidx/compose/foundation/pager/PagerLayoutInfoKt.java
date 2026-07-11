package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/pager/PagerLayoutInfo;", "", c.f62177j, "(Landroidx/compose/foundation/pager/PagerLayoutInfo;)I", "mainAxisViewportSize", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPagerLayoutInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerLayoutInfo.kt\nandroidx/compose/foundation/pager/PagerLayoutInfoKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,97:1\n59#2:98\n54#2:100\n90#3:99\n85#3:101\n*S KotlinDebug\n*F\n+ 1 PagerLayoutInfo.kt\nandroidx/compose/foundation/pager/PagerLayoutInfoKt\n*L\n96#1:98\n96#1:100\n96#1:99\n96#1:101\n*E\n"})
public final class PagerLayoutInfoKt {
    public static final int n(PagerLayoutInfo pagerLayoutInfo) {
        long jRl;
        if (pagerLayoutInfo.n() == Orientation.f16969n) {
            jRl = pagerLayoutInfo.rl() & 4294967295L;
        } else {
            jRl = pagerLayoutInfo.rl() >> 32;
        }
        return (int) jRl;
    }
}
