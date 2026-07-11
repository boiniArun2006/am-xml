package Z7;

import OM5.n;
import android.content.Context;
import j9J.Ml;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class j {

    /* JADX INFO: renamed from: Z7.j$j, reason: collision with other inner class name */
    public interface InterfaceC0444j {
        Set t();
    }

    public static boolean n(Context context) {
        Set setT = ((InterfaceC0444j) n.n(context, InterfaceC0444j.class)).t();
        Ml.t(setT.size() <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (setT.isEmpty()) {
            return true;
        }
        return ((Boolean) setT.iterator().next()).booleanValue();
    }
}
