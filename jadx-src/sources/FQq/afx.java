package FQq;

import androidx.collection.ArraySet;
import androidx.core.util.Pair;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class afx {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f2564n = false;
    private final Set rl = new ArraySet();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map f2565t = new HashMap();
    private final Comparator nr = new j();

    class j implements Comparator {
        j() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public int compare(Pair pair, Pair pair2) {
            float fFloatValue = ((Float) pair.rl).floatValue();
            float fFloatValue2 = ((Float) pair2.rl).floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    }

    public void n(String str, float f3) {
        if (this.f2564n) {
            x0.C c2 = (x0.C) this.f2565t.get(str);
            if (c2 == null) {
                c2 = new x0.C();
                this.f2565t.put(str, c2);
            }
            c2.n(f3);
            if (str.equals("__container")) {
                Iterator it = this.rl.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.j.n(it.next());
                    throw null;
                }
            }
        }
    }

    void rl(boolean z2) {
        this.f2564n = z2;
    }
}
