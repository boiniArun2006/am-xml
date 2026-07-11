package androidx.constraintlayout.core.dsl;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class ConstraintSet {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f35065n;
    ArrayList rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    ArrayList f35066t;

    public String toString() {
        StringBuilder sb = new StringBuilder(this.f35065n + ":{\n");
        if (!this.rl.isEmpty()) {
            Iterator it = this.rl.iterator();
            while (it.hasNext()) {
                sb.append(((Constraint) it.next()).toString());
            }
        }
        if (!this.f35066t.isEmpty()) {
            Iterator it2 = this.f35066t.iterator();
            while (it2.hasNext()) {
                sb.append(((Helper) it2.next()).toString());
            }
        }
        sb.append("},\n");
        return sb.toString();
    }
}
