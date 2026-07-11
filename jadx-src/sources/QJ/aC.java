package QJ;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class aC implements w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f7990n;
    private final j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f7991t;

    public enum j {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static j rl(int i2) {
            return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? MERGE : EXCLUDE_INTERSECTIONS : INTERSECT : SUBTRACT : ADD : MERGE;
        }
    }

    @Override // QJ.w6
    public ef.w6 n(com.airbnb.lottie.Xo xo, FQq.Dsr dsr, gL.n nVar) {
        if (xo.k(FQq.s4.MergePathsApi19)) {
            return new ef.o(this);
        }
        x0.CN3.t("Animation contains merge paths but they are disabled.");
        return null;
    }

    public boolean nr() {
        return this.f7991t;
    }

    public j rl() {
        return this.rl;
    }

    public String t() {
        return this.f7990n;
    }

    public String toString() {
        return "MergePaths{mode=" + this.rl + '}';
    }

    public aC(String str, j jVar, boolean z2) {
        this.f7990n = str;
        this.rl = jVar;
        this.f7991t = z2;
    }
}
