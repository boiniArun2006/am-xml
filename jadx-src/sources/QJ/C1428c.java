package QJ;

/* JADX INFO: renamed from: QJ.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class C1428c implements w6 {
    private final boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final GO.n f7997O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f7998n;
    private final GO.n nr;
    private final j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final GO.n f7999t;

    /* JADX INFO: renamed from: QJ.c$j */
    public enum j {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static j rl(int i2) {
            if (i2 == 1) {
                return SIMULTANEOUSLY;
            }
            if (i2 == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type " + i2);
        }
    }

    public j J2() {
        return this.rl;
    }

    public GO.n O() {
        return this.f7999t;
    }

    public boolean Uo() {
        return this.J2;
    }

    @Override // QJ.w6
    public ef.w6 n(com.airbnb.lottie.Xo xo, FQq.Dsr dsr, gL.n nVar) {
        return new ef.s4(nVar, this);
    }

    public GO.n nr() {
        return this.f7997O;
    }

    public GO.n rl() {
        return this.nr;
    }

    public String t() {
        return this.f7998n;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f7999t + ", end: " + this.nr + ", offset: " + this.f7997O + "}";
    }

    public C1428c(String str, j jVar, GO.n nVar, GO.n nVar2, GO.n nVar3, boolean z2) {
        this.f7998n = str;
        this.rl = jVar;
        this.f7999t = nVar;
        this.nr = nVar2;
        this.f7997O = nVar3;
        this.J2 = z2;
    }
}
