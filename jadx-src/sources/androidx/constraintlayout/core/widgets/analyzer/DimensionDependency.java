package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
class DimensionDependency extends DependencyNode {
    public int az;

    @Override // androidx.constraintlayout.core.widgets.analyzer.DependencyNode
    public void nr(int i2) {
        if (this.mUb) {
            return;
        }
        this.mUb = true;
        this.Uo = i2;
        for (Dependency dependency : this.gh) {
            dependency.n(dependency);
        }
    }

    DimensionDependency(WidgetRun widgetRun) {
        super(widgetRun);
        if (widgetRun instanceof HorizontalWidgetRun) {
            this.f35560O = DependencyNode.Type.HORIZONTAL_DIMENSION;
        } else {
            this.f35560O = DependencyNode.Type.VERTICAL_DIMENSION;
        }
    }
}
