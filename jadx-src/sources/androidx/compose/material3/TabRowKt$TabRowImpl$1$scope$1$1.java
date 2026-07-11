package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J#\u0010\b\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR#\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00108\u0006¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"androidx/compose/material3/TabRowKt$TabRowImpl$1$scope$1$1", "Landroidx/compose/material3/TabIndicatorScope;", "Landroidx/compose/material3/TabPositionsHolder;", "Landroidx/compose/ui/Modifier;", "", "selectedTabIndex", "", "matchContentSize", c.f62177j, "(Landroidx/compose/ui/Modifier;IZ)Landroidx/compose/ui/Modifier;", "", "Landroidx/compose/material3/TabPosition;", "positions", "", "t", "(Ljava/util/List;)V", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/runtime/MutableState;", "rl", "()Landroidx/compose/runtime/MutableState;", "tabPositions", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TabRowKt$TabRowImpl$1$scope$1$1 implements TabIndicatorScope, TabPositionsHolder {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final MutableState tabPositions = SnapshotStateKt__SnapshotStateKt.O(CollectionsKt.emptyList(), null, 2, null);

    @Override // androidx.compose.material3.TabIndicatorScope
    public Modifier n(Modifier modifier, int i2, boolean z2) {
        return modifier.Zmq(new TabIndicatorModifier(this.tabPositions, i2, z2));
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final MutableState getTabPositions() {
        return this.tabPositions;
    }

    public void t(List positions) {
        this.tabPositions.setValue(positions);
    }

    TabRowKt$TabRowImpl$1$scope$1$1() {
    }
}
