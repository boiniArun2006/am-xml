package EDL;

import Msr.Ml;
import Msr.w6;
import android.text.TextUtils;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback;
import java.util.ArrayList;
import java.util.Iterator;
import mc.fuX;
import r0.C2352n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class n extends IIgniteServiceCallback.Stub {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f2264n;

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onProgress(String str) {
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onScheduled(String str) {
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onStart(String str) {
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onError(String str) {
        eh.n.n("%s : unable to retrieve property: %s", "IgnitePropertyCallback", str);
        Iterator it = this.f2264n.iterator();
        while (it.hasNext()) {
            fuX fux = ((zC.j) it.next()).f76376n;
            if (fux != null) {
                eh.n.n("%s : on one dt error", "OneDTAuthenticator");
                fux.f70885e.set(true);
                if (fux.J2 != null) {
                    eh.n.rl("%s : on one dt error : %s", "IgniteManager", str);
                }
            }
        }
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onSuccess(String str) {
        eh.n.n("%s : property retrieved", "IgnitePropertyCallback");
        Iterator it = this.f2264n.iterator();
        while (it.hasNext()) {
            fuX fux = ((zC.j) it.next()).f76376n;
            if (fux != null) {
                if (TextUtils.isEmpty(str)) {
                    eh.n.n("%s : on one dt error", "OneDTAuthenticator");
                    fux.f70885e.set(true);
                    if (fux.J2 != null) {
                        eh.n.rl("%s : on one dt error : %s", "IgniteManager", "One DT is empty");
                    }
                    Msr.n.rl(Ml.RAW_ONE_DT_ERROR, "error_code", w6.ONE_DT_EMPTY_ENTITY.n());
                } else {
                    fux.f70888r.rl(str);
                    fux.f70887o.getClass();
                    u9n.w6 w6VarN = C2352n.n(str);
                    fux.f70884Z = w6VarN;
                    u9n.j jVar = fux.J2;
                    if (jVar != null) {
                        eh.n.n("%s : setting one dt entity", "IgniteManager");
                        jVar.f74140b = w6VarN;
                    }
                }
            }
        }
    }

    public n(zC.j jVar) {
        ArrayList arrayList = new ArrayList();
        this.f2264n = arrayList;
        arrayList.add(jVar);
    }
}
