package iWe;

import oK9.CN3;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class n extends I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CN3 f68127n;

    @Override // iWe.I28
    public boolean t() {
        if (!this.f68127n.S()) {
            return false;
        }
        if (this.f68127n.r() > 0 || this.f68127n.Ik() > 0) {
            return true;
        }
        return this.f68127n.XQ() && this.f68127n.Z().az();
    }

    n(CN3 cn3) {
        this.f68127n = cn3;
    }
}
