package androidx.constraintlayout.core.dsl;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class MotionScene {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ArrayList f35127n;
    ArrayList rl;

    public String toString() {
        StringBuilder sb = new StringBuilder("{\n");
        if (!this.f35127n.isEmpty()) {
            sb.append("Transitions:{\n");
            Iterator it = this.f35127n.iterator();
            while (it.hasNext()) {
                sb.append(((Transition) it.next()).toString());
            }
            sb.append("},\n");
        }
        if (!this.rl.isEmpty()) {
            sb.append("ConstraintSets:{\n");
            Iterator it2 = this.rl.iterator();
            while (it2.hasNext()) {
                sb.append(((ConstraintSet) it2.next()).toString());
            }
            sb.append("},\n");
        }
        sb.append("}\n");
        return sb.toString();
    }
}
