package mc;

import org.json.JSONObject;
import r0.AbstractC2351j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class w6 implements Runnable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Runnable f70890n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ I28 f70891t;

    public w6(I28 i28, Ml ml) {
        this.f70891t = i28;
        this.f70890n = ml;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tUa.j jVarN;
        I28 i28 = this.f70891t;
        if (i28.a()) {
            try {
                jVarN = AbstractC2351j.n(new JSONObject(i28.E2.version()));
            } catch (Exception e2) {
                Msr.n.n(Msr.Ml.ONE_DT_GENERAL_ERROR, e2);
                eh.n.rl("%s: resolveIgniteServiceVersion : unable to resolve version : %s", "IgniteAuthenticationComponent", e2.toString());
                jVarN = new tUa.j(false, "");
            }
        } else {
            jVarN = new tUa.j(false, "");
        }
        i28.f70871g = jVarN;
        tGr.w6.rl.post(this.f70890n);
    }
}
