package androidx.compose.foundation.pager;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/pager/PagerState;", "", c.f62177j, "(Landroidx/compose/foundation/pager/PagerState;)J", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PagerScrollPositionKt {
    public static final long n(PagerState pagerState) {
        return (((long) pagerState.S()) * ((long) pagerState.nHg())) + MathKt.roundToLong(pagerState.WPU() * pagerState.nHg());
    }
}
