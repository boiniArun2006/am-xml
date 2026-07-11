package AYM;

import com.google.android.gms.internal.play_billing.LFHI.HrvQKfmFZJudBc;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Wre {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private n f86O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Cwp.n f87n;
    private int nr = -1;
    private Cwp.j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Cwp.w6 f88t;

    public static boolean rl(int i2) {
        return i2 >= 0 && i2 < 8;
    }

    public void J2(Cwp.n nVar) {
        this.f87n = nVar;
    }

    public void O(n nVar) {
        this.f86O = nVar;
    }

    public void Uo(Cwp.w6 w6Var) {
        this.f88t = w6Var;
    }

    public n n() {
        return this.f86O;
    }

    public void nr(int i2) {
        this.nr = i2;
    }

    public void t(Cwp.j jVar) {
        this.rl = jVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.f87n);
        sb.append("\n ecLevel: ");
        sb.append(this.rl);
        sb.append("\n version: ");
        sb.append(this.f88t);
        sb.append("\n maskPattern: ");
        sb.append(this.nr);
        if (this.f86O == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.f86O);
        }
        sb.append(HrvQKfmFZJudBc.rBDaJm);
        return sb.toString();
    }
}
