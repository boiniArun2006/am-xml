package EDL;

import Msr.Ml;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class j extends IIgniteServiceCallback.Stub {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final mc.j f2263n;

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
        this.f2263n.a(str);
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onSuccess(String str) {
        String string;
        try {
            string = new JSONObject(str).getJSONObject("data").getString("token");
        } catch (Exception e2) {
            Msr.n.n(Ml.ONE_DT_GENERAL_ERROR, e2);
            eh.n.rl("%s : resolveClientToken : %s", "IgniteAuthenticationCallback", e2.toString());
            string = null;
        }
        this.f2263n.c(string);
    }

    public j(mc.j jVar) {
        this.f2263n = jVar;
    }
}
