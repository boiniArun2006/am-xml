package Li;

import android.content.Context;
import com.google.firebase.Pl;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class n {
    public n(com.google.firebase.Wre wre, Pl pl, Executor executor) {
        Context contextQie = wre.qie();
        com.google.firebase.perf.config.j.Uo().bzg(contextQie);
        com.google.firebase.perf.application.j jVarRl = com.google.firebase.perf.application.j.rl();
        jVarRl.xMQ(contextQie);
        jVarRl.mUb(new Wre());
        if (pl != null) {
            AppStartTrace appStartTraceQie = AppStartTrace.qie();
            appStartTraceQie.S(contextQie);
            executor.execute(new AppStartTrace.w6(appStartTraceQie));
        }
        SessionManager.getInstance().initializeGaugeCollection();
    }
}
