package u9n;

import mc.Wre;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class j implements Nge.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Wre f74139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w6 f74140b;

    public void destroy() {
        this.f74140b = null;
        this.f74139a.destroy();
    }

    public void authenticate() {
        tGr.w6.f73452n.execute(new n(this));
    }

    public String getOdt() {
        w6 w6Var = this.f74140b;
        return w6Var != null ? w6Var.f74142n : "";
    }

    public boolean isAuthenticated() {
        return this.f74139a.h();
    }

    public boolean isConnected() {
        return this.f74139a.a();
    }

    @Override // Nge.n
    public void onCredentialsRequestFailed(String str) {
        this.f74139a.onCredentialsRequestFailed(str);
    }

    @Override // Nge.n
    public void onCredentialsRequestSuccess(String str, String str2) {
        this.f74139a.onCredentialsRequestSuccess(str, str2);
    }

    public j(eh.j jVar, Msr.j jVar2) {
        eh.n.rl.f63842n = jVar;
        Msr.n.rl.f6781n = jVar2;
    }
}
