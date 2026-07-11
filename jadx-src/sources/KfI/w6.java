package KfI;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class w6 implements oy.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final oy.j f5744n = new w6();

    private static final class I28 implements WkR.w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final I28 f5745n = new I28();
        private static final WkR.n rl = WkR.n.nr("eventType");

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final WkR.n f5746t = WkR.n.nr("sessionData");
        private static final WkR.n nr = WkR.n.nr("applicationInfo");

        @Override // WkR.w6
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public void n(SPz sPz, WkR.Ml ml) {
            ml.Uo(rl, sPz.rl());
            ml.Uo(f5746t, sPz.t());
            ml.Uo(nr, sPz.n());
        }

        private I28() {
        }
    }

    private static final class Ml implements WkR.w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final Ml f5748n = new Ml();
        private static final WkR.n rl = WkR.n.nr("processName");

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final WkR.n f5749t = WkR.n.nr("pid");
        private static final WkR.n nr = WkR.n.nr("importance");

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final WkR.n f5747O = WkR.n.nr("defaultProcess");

        @Override // WkR.w6
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public void n(l3D l3d, WkR.Ml ml) {
            ml.Uo(rl, l3d.t());
            ml.n(f5749t, l3d.rl());
            ml.n(nr, l3d.n());
            ml.O(f5747O, l3d.nr());
        }

        private Ml() {
        }
    }

    private static final class Wre implements WkR.w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final Wre f5751n = new Wre();
        private static final WkR.n rl = WkR.n.nr("sessionId");

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final WkR.n f5752t = WkR.n.nr("firstSessionId");
        private static final WkR.n nr = WkR.n.nr("sessionIndex");

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final WkR.n f5750O = WkR.n.nr("eventTimestampUs");
        private static final WkR.n J2 = WkR.n.nr("dataCollectionStatus");
        private static final WkR.n Uo = WkR.n.nr("firebaseInstallationId");
        private static final WkR.n KN = WkR.n.nr("firebaseAuthenticationToken");

        @Override // WkR.w6
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public void n(Ew ew, WkR.Ml ml) {
            ml.Uo(rl, ew.J2());
            ml.Uo(f5752t, ew.O());
            ml.n(nr, ew.Uo());
            ml.rl(f5750O, ew.rl());
            ml.Uo(J2, ew.n());
            ml.Uo(Uo, ew.nr());
            ml.Uo(KN, ew.t());
        }

        private Wre() {
        }
    }

    private static final class j implements WkR.w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final j f5754n = new j();
        private static final WkR.n rl = WkR.n.nr("packageName");

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final WkR.n f5755t = WkR.n.nr("versionName");
        private static final WkR.n nr = WkR.n.nr("appBuildVersion");

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final WkR.n f5753O = WkR.n.nr("deviceManufacturer");
        private static final WkR.n J2 = WkR.n.nr("currentProcessDetails");
        private static final WkR.n Uo = WkR.n.nr("appProcessDetails");

        @Override // WkR.w6
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public void n(KfI.j jVar, WkR.Ml ml) {
            ml.Uo(rl, jVar.O());
            ml.Uo(f5755t, jVar.J2());
            ml.Uo(nr, jVar.n());
            ml.Uo(f5753O, jVar.nr());
            ml.Uo(J2, jVar.t());
            ml.Uo(Uo, jVar.rl());
        }

        private j() {
        }
    }

    private static final class n implements WkR.w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final n f5757n = new n();
        private static final WkR.n rl = WkR.n.nr("appId");

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final WkR.n f5758t = WkR.n.nr("deviceModel");
        private static final WkR.n nr = WkR.n.nr("sessionSdkVersion");

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final WkR.n f5756O = WkR.n.nr("osVersion");
        private static final WkR.n J2 = WkR.n.nr("logEnvironment");
        private static final WkR.n Uo = WkR.n.nr("androidAppInfo");

        @Override // WkR.w6
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public void n(KfI.n nVar, WkR.Ml ml) {
            ml.Uo(rl, nVar.rl());
            ml.Uo(f5758t, nVar.t());
            ml.Uo(nr, nVar.J2());
            ml.Uo(f5756O, nVar.O());
            ml.Uo(J2, nVar.nr());
            ml.Uo(Uo, nVar.n());
        }

        private n() {
        }
    }

    /* JADX INFO: renamed from: KfI.w6$w6, reason: collision with other inner class name */
    private static final class C0195w6 implements WkR.w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final C0195w6 f5759n = new C0195w6();
        private static final WkR.n rl = WkR.n.nr("performance");

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final WkR.n f5760t = WkR.n.nr("crashlytics");
        private static final WkR.n nr = WkR.n.nr("sessionSamplingRate");

        @Override // WkR.w6
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public void n(KfI.I28 i28, WkR.Ml ml) {
            ml.Uo(rl, i28.rl());
            ml.Uo(f5760t, i28.n());
            ml.t(nr, i28.t());
        }

        private C0195w6() {
        }
    }

    @Override // oy.j
    public void n(oy.n nVar) {
        nVar.n(SPz.class, I28.f5745n);
        nVar.n(Ew.class, Wre.f5751n);
        nVar.n(KfI.I28.class, C0195w6.f5759n);
        nVar.n(KfI.n.class, n.f5757n);
        nVar.n(KfI.j.class, j.f5754n);
        nVar.n(l3D.class, Ml.f5748n);
    }

    private w6() {
    }
}
