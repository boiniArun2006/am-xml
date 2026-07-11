package jMi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class n {
    private static final yMa.j nr = yMa.j.O();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f69403n;
    private final oSp.n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private bF.fuX f69404t;

    private boolean n() {
        if (this.f69404t == null) {
            bF.Dsr dsr = (bF.Dsr) this.rl.get();
            if (dsr != null) {
                this.f69404t = dsr.n(this.f69403n, oK9.Dsr.class, bF.n.rl("proto"), new bF.CN3() { // from class: jMi.j
                    @Override // bF.CN3
                    public final Object apply(Object obj) {
                        return ((oK9.Dsr) obj).toByteArray();
                    }
                });
            } else {
                nr.mUb("Flg TransportFactory is not available at the moment");
            }
        }
        return this.f69404t != null;
    }

    n(oSp.n nVar, String str) {
        this.f69403n = str;
        this.rl = nVar;
    }

    public void rl(oK9.Dsr dsr) {
        if (!n()) {
            nr.mUb("Unable to dispatch event because Flg Transport is not available");
        } else {
            this.f69404t.n(bF.w6.J2(dsr));
        }
    }
}
