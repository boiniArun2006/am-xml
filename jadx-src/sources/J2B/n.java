package J2B;

import Vy.Pl;
import android.view.View;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class n extends Ml {
    private static n J2 = new n();

    public static n gh() {
        return J2;
    }

    private n() {
    }

    @Override // J2B.Ml
    public void J2(boolean z2) {
        Iterator it = w6.O().t().iterator();
        while (it.hasNext()) {
            ((Pl) it.next()).qie().ty(z2);
        }
    }

    @Override // J2B.Ml
    public boolean KN() {
        Iterator it = w6.O().n().iterator();
        while (it.hasNext()) {
            View viewAz = ((Pl) it.next()).az();
            if (viewAz != null && viewAz.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
