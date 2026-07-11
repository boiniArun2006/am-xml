package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class DependencyNode implements Dependency {
    int J2;
    public int Uo;
    WidgetRun nr;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Dependency f35561n = null;
    public boolean rl = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f35562t = false;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Type f35560O = Type.UNKNOWN;
    int KN = 1;
    DimensionDependency xMQ = null;
    public boolean mUb = false;
    List gh = new ArrayList();
    List qie = new ArrayList();

    enum Type {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void n(Dependency dependency) {
        Iterator it = this.qie.iterator();
        while (it.hasNext()) {
            if (!((DependencyNode) it.next()).mUb) {
                return;
            }
        }
        this.f35562t = true;
        Dependency dependency2 = this.f35561n;
        if (dependency2 != null) {
            dependency2.n(this);
        }
        if (this.rl) {
            this.nr.n(this);
            return;
        }
        DependencyNode dependencyNode = null;
        int i2 = 0;
        for (DependencyNode dependencyNode2 : this.qie) {
            if (!(dependencyNode2 instanceof DimensionDependency)) {
                i2++;
                dependencyNode = dependencyNode2;
            }
        }
        if (dependencyNode != null && i2 == 1 && dependencyNode.mUb) {
            DimensionDependency dimensionDependency = this.xMQ;
            if (dimensionDependency != null) {
                if (!dimensionDependency.mUb) {
                    return;
                } else {
                    this.J2 = this.KN * dimensionDependency.Uo;
                }
            }
            nr(dependencyNode.Uo + this.J2);
        }
        Dependency dependency3 = this.f35561n;
        if (dependency3 != null) {
            dependency3.n(this);
        }
    }

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

    public void rl(Dependency dependency) {
        this.gh.add(dependency);
        if (this.mUb) {
            dependency.n(dependency);
        }
    }

    public void t() {
        this.qie.clear();
        this.gh.clear();
        this.mUb = false;
        this.Uo = 0;
        this.f35562t = false;
        this.rl = false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.nr.rl.S());
        sb.append(":");
        sb.append(this.f35560O);
        sb.append("(");
        sb.append(this.mUb ? Integer.valueOf(this.Uo) : "unresolved");
        sb.append(") <t=");
        sb.append(this.qie.size());
        sb.append(":d=");
        sb.append(this.gh.size());
        sb.append(">");
        return sb.toString();
    }

    public DependencyNode(WidgetRun widgetRun) {
        this.nr = widgetRun;
    }
}
