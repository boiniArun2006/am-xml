package FSZ;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface qz extends Q, A72.w6 {

    public static class j {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public final n f2618O;
        public int Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Object f2619n;
        public final Pj0.j rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f2620t = 0;
        public boolean nr = false;
        public int J2 = 0;

        public static j rl(Object obj, Pj0.j jVar, n nVar) {
            return n(obj, jVar, -1, nVar);
        }

        public static j n(Object obj, Pj0.j jVar, int i2, n nVar) {
            return new j(obj, jVar, nVar, i2);
        }

        private j(Object obj, Pj0.j jVar, n nVar, int i2) {
            this.f2619n = Hh.C.Uo(obj);
            this.rl = (Pj0.j) Hh.C.Uo(Pj0.j.T(jVar));
            this.f2618O = nVar;
            this.Uo = i2;
        }
    }

    public interface n {
        void n(Object obj, boolean z2);
    }

    Pj0.j nr(Object obj);

    Pj0.j t(Object obj, Pj0.j jVar, n nVar);
}
