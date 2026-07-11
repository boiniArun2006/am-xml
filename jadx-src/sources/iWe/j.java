package iWe;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class j extends I28 {
    private static final yMa.j rl = yMa.j.O();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final oK9.w6 f68126n;

    private boolean Uo() {
        oK9.w6 w6Var = this.f68126n;
        if (w6Var == null) {
            rl.mUb("ApplicationInfo is null");
            return false;
        }
        if (!w6Var.Z()) {
            rl.mUb("GoogleAppId is null");
            return false;
        }
        if (!this.f68126n.r()) {
            rl.mUb("AppInstanceId is null");
            return false;
        }
        if (!this.f68126n.o()) {
            rl.mUb("ApplicationProcessState is null");
            return false;
        }
        if (!this.f68126n.Ik()) {
            return true;
        }
        if (!this.f68126n.ty().az()) {
            rl.mUb("AndroidAppInfo.packageName is null");
            return false;
        }
        if (this.f68126n.ty().ty()) {
            return true;
        }
        rl.mUb("AndroidAppInfo.sdkVersion is null");
        return false;
    }

    j(oK9.w6 w6Var) {
        this.f68126n = w6Var;
    }

    @Override // iWe.I28
    public boolean t() {
        if (!Uo()) {
            rl.mUb("ApplicationInfo is invalid");
            return false;
        }
        return true;
    }
}
