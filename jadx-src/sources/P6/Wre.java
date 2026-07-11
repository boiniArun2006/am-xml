package P6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Wre {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private n f7574O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private bq4.n f7575n;
    private int nr = -1;
    private bq4.j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private bq4.w6 f7576t;

    public static boolean rl(int i2) {
        return i2 >= 0 && i2 < 8;
    }

    public void J2(bq4.n nVar) {
        this.f7575n = nVar;
    }

    public void O(n nVar) {
        this.f7574O = nVar;
    }

    public void Uo(bq4.w6 w6Var) {
        this.f7576t = w6Var;
    }

    public n n() {
        return this.f7574O;
    }

    public void nr(int i2) {
        this.nr = i2;
    }

    public void t(bq4.j jVar) {
        this.rl = jVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.f7575n);
        sb.append("\n ecLevel: ");
        sb.append(this.rl);
        sb.append("\n version: ");
        sb.append(this.f7576t);
        sb.append("\n maskPattern: ");
        sb.append(this.nr);
        if (this.f7574O == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.f7574O);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
