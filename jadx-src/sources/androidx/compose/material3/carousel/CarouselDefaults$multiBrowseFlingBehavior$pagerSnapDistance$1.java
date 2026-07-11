package androidx.compose.material3.carousel;

import androidx.compose.foundation.pager.PagerSnapDistance;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\n\u0018\u00002\u00020\u0001J7\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/compose/material3/carousel/CarouselDefaults$multiBrowseFlingBehavior$pagerSnapDistance$1", "Landroidx/compose/foundation/pager/PagerSnapDistance;", "", "startPage", "suggestedTargetPage", "", "velocity", "pageSize", "pageSpacing", c.f62177j, "(IIFII)I", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CarouselDefaults$multiBrowseFlingBehavior$pagerSnapDistance$1 implements PagerSnapDistance {
    @Override // androidx.compose.foundation.pager.PagerSnapDistance
    public int n(int startPage, int suggestedTargetPage, float velocity, int pageSize, int pageSpacing) {
        return suggestedTargetPage;
    }
}
