package androidx.transition;

import Hr.CQ.USEaHtCMH;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public class TransitionValues {
    public View rl;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Map f42259n = new HashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final ArrayList f42260t = new ArrayList();

    public boolean equals(Object obj) {
        if (!(obj instanceof TransitionValues)) {
            return false;
        }
        TransitionValues transitionValues = (TransitionValues) obj;
        return this.rl == transitionValues.rl && this.f42259n.equals(transitionValues.f42259n);
    }

    public int hashCode() {
        return (this.rl.hashCode() * 31) + this.f42259n.hashCode();
    }

    public String toString() {
        String str = ((USEaHtCMH.bamaQTQjzKCoRPL + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.rl + "\n") + "    values:";
        for (String str2 : this.f42259n.keySet()) {
            str = str + "    " + str2 + ": " + this.f42259n.get(str2) + "\n";
        }
        return str;
    }

    public TransitionValues(View view) {
        this.rl = view;
    }
}
