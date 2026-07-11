package oW;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class O extends l4Z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f71477n;
    private String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f71478t;

    @Override // oW.l4Z
    public final l4Z n(String str) {
        this.rl = str;
        return this;
    }

    @Override // oW.l4Z
    public final l4Z nr(String str) {
        this.f71477n = str;
        return this;
    }

    @Override // oW.l4Z
    public final mz rl() {
        return new LEl(this.f71477n, this.rl, this.f71478t);
    }

    @Override // oW.l4Z
    public final l4Z t(String str) {
        this.f71478t = str;
        return this;
    }

    O() {
    }
}
