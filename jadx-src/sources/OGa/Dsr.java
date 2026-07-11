package OGa;

import com.google.firebase.encoders.EncodingException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class Dsr implements WkR.Wre {
    private final Wre nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private WkR.n f7288t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f7287n = false;
    private boolean rl = false;

    void rl(WkR.n nVar, boolean z2) {
        this.f7287n = false;
        this.f7288t = nVar;
        this.rl = z2;
    }

    private void n() {
        if (this.f7287n) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f7287n = true;
    }

    Dsr(Wre wre) {
        this.nr = wre;
    }

    @Override // WkR.Wre
    public WkR.Wre J2(boolean z2) {
        n();
        this.nr.qie(this.f7288t, z2, this.rl);
        return this;
    }

    @Override // WkR.Wre
    public WkR.Wre nr(String str) {
        n();
        this.nr.HI(this.f7288t, str, this.rl);
        return this;
    }
}
