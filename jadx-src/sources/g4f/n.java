package g4f;

import a88.Pl;
import android.view.View;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class n extends Ml {
    private static n J2 = new n();

    public static n gh() {
        return J2;
    }

    private n() {
    }

    @Override // g4f.Ml
    public void J2(boolean z2) {
        Iterator it = w6.O().t().iterator();
        while (it.hasNext()) {
            ((Pl) it.next()).ty().ty(z2);
        }
    }

    @Override // g4f.Ml
    public boolean KN() {
        Iterator it = w6.O().n().iterator();
        while (it.hasNext()) {
            View viewHI = ((Pl) it.next()).HI();
            if (viewHI != null && viewHI.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
