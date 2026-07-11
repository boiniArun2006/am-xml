package androidx.compose.material;

import GJW.C;
import GJW.vd;
import androidx.compose.foundation.ScrollState;
import androidx.compose.ui.unit.Density;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u000f\u001a\u00020\u000b*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/material/ScrollableTabData;", "", "Landroidx/compose/foundation/ScrollState;", "scrollState", "LGJW/vd;", "coroutineScope", "<init>", "(Landroidx/compose/foundation/ScrollState;LGJW/vd;)V", "Landroidx/compose/material/TabPosition;", "Landroidx/compose/ui/unit/Density;", "density", "", "edgeOffset", "", "tabPositions", "rl", "(Landroidx/compose/material/TabPosition;Landroidx/compose/ui/unit/Density;ILjava/util/List;)I", "selectedTab", "", "t", "(Landroidx/compose/ui/unit/Density;ILjava/util/List;I)V", c.f62177j, "Landroidx/compose/foundation/ScrollState;", "LGJW/vd;", "Ljava/lang/Integer;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class ScrollableTabData {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ScrollState scrollState;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final vd coroutineScope;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Integer selectedTab;

    public final void t(Density density, int edgeOffset, List tabPositions, int selectedTab) {
        int iRl;
        Integer num = this.selectedTab;
        if (num != null && num.intValue() == selectedTab) {
            return;
        }
        this.selectedTab = Integer.valueOf(selectedTab);
        TabPosition tabPosition = (TabPosition) CollectionsKt.getOrNull(tabPositions, selectedTab);
        if (tabPosition == null || this.scrollState.ty() == (iRl = rl(tabPosition, density, edgeOffset, tabPositions))) {
            return;
        }
        C.nr(this.coroutineScope, null, null, new ScrollableTabData$onLaidOut$1$1(this, iRl, null), 3, null);
    }

    public ScrollableTabData(ScrollState scrollState, vd vdVar) {
        this.scrollState = scrollState;
        this.coroutineScope = vdVar;
    }

    private final int rl(TabPosition tabPosition, Density density, int i2, List list) {
        int iHow = density.How(((TabPosition) CollectionsKt.last(list)).rl()) + i2;
        int iAz = iHow - this.scrollState.az();
        return RangesKt.coerceIn(density.How(tabPosition.getLeft()) - ((iAz / 2) - (density.How(tabPosition.getWidth()) / 2)), 0, RangesKt.coerceAtLeast(iHow - iAz, 0));
    }
}
