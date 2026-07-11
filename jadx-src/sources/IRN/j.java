package IRN;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class j implements oy.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final oy.j f4231n = new j();

    /* JADX INFO: renamed from: IRN.j$j, reason: collision with other inner class name */
    private static final class C0143j implements WkR.w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final C0143j f4233n = new C0143j();
        private static final WkR.n rl = WkR.n.nr("rolloutId");

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final WkR.n f4234t = WkR.n.nr("parameterKey");
        private static final WkR.n nr = WkR.n.nr("parameterValue");

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final WkR.n f4232O = WkR.n.nr("variantId");
        private static final WkR.n J2 = WkR.n.nr("templateVersion");

        @Override // WkR.w6
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public void n(aC aCVar, WkR.Ml ml) {
            ml.Uo(rl, aCVar.O());
            ml.Uo(f4234t, aCVar.t());
            ml.Uo(nr, aCVar.nr());
            ml.Uo(f4232O, aCVar.Uo());
            ml.rl(J2, aCVar.J2());
        }

        private C0143j() {
        }
    }

    @Override // oy.j
    public void n(oy.n nVar) {
        C0143j c0143j = C0143j.f4233n;
        nVar.n(aC.class, c0143j);
        nVar.n(n.class, c0143j);
    }

    private j() {
    }
}
