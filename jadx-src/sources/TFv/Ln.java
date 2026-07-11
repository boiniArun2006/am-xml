package TFv;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface Ln {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f10289n = j.f10290n;

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ j f10290n = new j();
        private static final Ln rl = new lej();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final Ln f10291t = new iwV();

        public static /* synthetic */ Ln rl(j jVar, long j2, long j3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                j2 = 0;
            }
            if ((i2 & 2) != 0) {
                j3 = Long.MAX_VALUE;
            }
            return jVar.n(j2, j3);
        }

        public final Ln n(long j2, long j3) {
            return new M(j2, j3);
        }

        public final Ln nr() {
            return f10291t;
        }

        public final Ln t() {
            return rl;
        }

        private j() {
        }
    }

    Wre n(rv6 rv6Var);
}
