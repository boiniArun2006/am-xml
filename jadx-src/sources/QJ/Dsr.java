package QJ;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j f7972n;
    private final boolean nr;
    private final GO.fuX rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final GO.Ml f7973t;

    public enum j {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public j n() {
        return this.f7972n;
    }

    public boolean nr() {
        return this.nr;
    }

    public GO.fuX rl() {
        return this.rl;
    }

    public GO.Ml t() {
        return this.f7973t;
    }

    public Dsr(j jVar, GO.fuX fux, GO.Ml ml, boolean z2) {
        this.f7972n = jVar;
        this.rl = fux;
        this.f7973t = ml;
        this.nr = z2;
    }
}
