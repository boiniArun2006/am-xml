package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/layout/SimplePlacementScope;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "parentWidth", "Landroidx/compose/ui/unit/LayoutDirection;", "parentLayoutDirection", "<init>", "(ILandroidx/compose/ui/unit/LayoutDirection;)V", "rl", "I", "J2", "()I", "t", "Landroidx/compose/ui/unit/LayoutDirection;", "O", "()Landroidx/compose/ui/unit/LayoutDirection;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class SimplePlacementScope extends Placeable.PlacementScope {

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final int parentWidth;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final LayoutDirection parentLayoutDirection;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    /* JADX INFO: renamed from: J2, reason: from getter */
    public int getParentWidth() {
        return this.parentWidth;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    /* JADX INFO: renamed from: O, reason: from getter */
    public LayoutDirection getParentLayoutDirection() {
        return this.parentLayoutDirection;
    }

    public SimplePlacementScope(int i2, LayoutDirection layoutDirection) {
        this.parentWidth = i2;
        this.parentLayoutDirection = layoutDirection;
    }
}
