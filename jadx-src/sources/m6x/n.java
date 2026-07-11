package m6x;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import uOq.CN3;
import uOq.Dsr;
import uOq.Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class n implements Dsr {
    @Override // uOq.Dsr
    public List n(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final uOq.w6 w6VarR : componentRegistrar.getComponents()) {
            final String strXMQ = w6VarR.xMQ();
            if (strXMQ != null) {
                w6VarR = w6VarR.r(new CN3() { // from class: m6x.j
                    @Override // uOq.CN3
                    public final Object n(Ml ml) {
                        return n.rl(strXMQ, w6VarR, ml);
                    }
                });
            }
            arrayList.add(w6VarR);
        }
        return arrayList;
    }

    public static /* synthetic */ Object rl(String str, uOq.w6 w6Var, Ml ml) {
        try {
            w6.rl(str);
            return w6Var.KN().n(ml);
        } finally {
            w6.n();
        }
    }
}
