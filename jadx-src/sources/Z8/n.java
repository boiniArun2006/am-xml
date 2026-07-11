package Z8;

import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.FileUploadManager;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class n implements oy.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final oy.j f12347n = new n();

    private static final class CN3 implements WkR.w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final CN3 f12348n = new CN3();
        private static final WkR.n rl = WkR.n.nr("prequest");

        @Override // WkR.w6
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public void n(l3D l3d, WkR.Ml ml) {
            ml.Uo(rl, l3d.rl());
        }

        private CN3() {
        }
    }

    private static final class Dsr implements WkR.w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final Dsr f12350n = new Dsr();
        private static final WkR.n rl = WkR.n.nr("requestTimeMs");

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final WkR.n f12351t = WkR.n.nr("requestUptimeMs");
        private static final WkR.n nr = WkR.n.nr("clientInfo");

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final WkR.n f12349O = WkR.n.nr("logSource");
        private static final WkR.n J2 = WkR.n.nr("logSourceName");
        private static final WkR.n Uo = WkR.n.nr("logEvent");
        private static final WkR.n KN = WkR.n.nr("qosTier");

        @Override // WkR.w6
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public void n(s4 s4Var, WkR.Ml ml) {
            ml.rl(rl, s4Var.Uo());
            ml.rl(f12351t, s4Var.KN());
            ml.Uo(nr, s4Var.rl());
            ml.Uo(f12349O, s4Var.nr());
            ml.Uo(J2, s4Var.O());
            ml.Uo(Uo, s4Var.t());
            ml.Uo(KN, s4Var.J2());
        }

        private Dsr() {
        }
    }

    private static final class I28 implements WkR.w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final I28 f12352n = new I28();
        private static final WkR.n rl = WkR.n.nr("clearBlob");

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final WkR.n f12353t = WkR.n.nr("encryptedBlob");

        @Override // WkR.w6
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public void n(z zVar, WkR.Ml ml) {
            ml.Uo(rl, zVar.rl());
            ml.Uo(f12353t, zVar.t());
        }

        private I28() {
        }
    }

    private static final class Ml implements WkR.w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final Ml f12354n = new Ml();
        private static final WkR.n rl = WkR.n.nr("privacyContext");

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final WkR.n f12355t = WkR.n.nr("productIdOrigin");

        @Override // WkR.w6
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public void n(eO eOVar, WkR.Ml ml) {
            ml.Uo(rl, eOVar.rl());
            ml.Uo(f12355t, eOVar.t());
        }

        private Ml() {
        }
    }

    private static final class Wre implements WkR.w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final Wre f12356n = new Wre();
        private static final WkR.n rl = WkR.n.nr("originAssociatedProductId");

        @Override // WkR.w6
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public void n(QJ qj, WkR.Ml ml) {
            ml.Uo(rl, qj.rl());
        }

        private Wre() {
        }
    }

    private static final class aC implements WkR.w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final aC f12357n = new aC();
        private static final WkR.n rl = WkR.n.nr("networkType");

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final WkR.n f12358t = WkR.n.nr("mobileSubtype");

        @Override // WkR.w6
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public void n(Q q2, WkR.Ml ml) {
            ml.Uo(rl, q2.t());
            ml.Uo(f12358t, q2.rl());
        }

        private aC() {
        }
    }

    private static final class fuX implements WkR.w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final fuX f12360n = new fuX();
        private static final WkR.n rl = WkR.n.nr("eventTimeMs");

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final WkR.n f12361t = WkR.n.nr("eventCode");
        private static final WkR.n nr = WkR.n.nr("complianceData");

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final WkR.n f12359O = WkR.n.nr("eventUptimeMs");
        private static final WkR.n J2 = WkR.n.nr("sourceExtension");
        private static final WkR.n Uo = WkR.n.nr("sourceExtensionJsonProto3");
        private static final WkR.n KN = WkR.n.nr("timezoneOffsetSeconds");
        private static final WkR.n xMQ = WkR.n.nr("networkConnectionInfo");
        private static final WkR.n mUb = WkR.n.nr("experimentIds");

        @Override // WkR.w6
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public void n(AbstractC1495c abstractC1495c, WkR.Ml ml) {
            ml.rl(rl, abstractC1495c.nr());
            ml.Uo(f12361t, abstractC1495c.t());
            ml.Uo(nr, abstractC1495c.rl());
            ml.rl(f12359O, abstractC1495c.O());
            ml.Uo(J2, abstractC1495c.KN());
            ml.Uo(Uo, abstractC1495c.xMQ());
            ml.rl(KN, abstractC1495c.mUb());
            ml.Uo(xMQ, abstractC1495c.Uo());
            ml.Uo(mUb, abstractC1495c.J2());
        }

        private fuX() {
        }
    }

    private static final class j implements WkR.w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final j f12363n = new j();
        private static final WkR.n rl = WkR.n.nr("sdkVersion");

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final WkR.n f12364t = WkR.n.nr("model");
        private static final WkR.n nr = WkR.n.nr("hardware");

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final WkR.n f12362O = WkR.n.nr("device");
        private static final WkR.n J2 = WkR.n.nr(AppLovinEventTypes.USER_VIEWED_PRODUCT);
        private static final WkR.n Uo = WkR.n.nr("osBuild");
        private static final WkR.n KN = WkR.n.nr("manufacturer");
        private static final WkR.n xMQ = WkR.n.nr(FileUploadManager.f61565c);
        private static final WkR.n mUb = WkR.n.nr("locale");
        private static final WkR.n gh = WkR.n.nr("country");
        private static final WkR.n qie = WkR.n.nr("mccMnc");
        private static final WkR.n az = WkR.n.nr("applicationBuild");

        @Override // WkR.w6
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public void n(Z8.j jVar, WkR.Ml ml) {
            ml.Uo(rl, jVar.az());
            ml.Uo(f12364t, jVar.mUb());
            ml.Uo(nr, jVar.J2());
            ml.Uo(f12362O, jVar.nr());
            ml.Uo(J2, jVar.qie());
            ml.Uo(Uo, jVar.gh());
            ml.Uo(KN, jVar.KN());
            ml.Uo(xMQ, jVar.O());
            ml.Uo(mUb, jVar.Uo());
            ml.Uo(gh, jVar.t());
            ml.Uo(qie, jVar.xMQ());
            ml.Uo(az, jVar.rl());
        }

        private j() {
        }
    }

    /* JADX INFO: renamed from: Z8.n$n, reason: collision with other inner class name */
    private static final class C0446n implements WkR.w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final C0446n f12365n = new C0446n();
        private static final WkR.n rl = WkR.n.nr("logRequest");

        @Override // WkR.w6
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public void n(Pl pl, WkR.Ml ml) {
            ml.Uo(rl, pl.t());
        }

        private C0446n() {
        }
    }

    private static final class w6 implements WkR.w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final w6 f12366n = new w6();
        private static final WkR.n rl = WkR.n.nr("clientType");

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final WkR.n f12367t = WkR.n.nr("androidClientInfo");

        @Override // WkR.w6
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public void n(Xo xo, WkR.Ml ml) {
            ml.Uo(rl, xo.t());
            ml.Uo(f12367t, xo.rl());
        }

        private w6() {
        }
    }

    @Override // oy.j
    public void n(oy.n nVar) {
        C0446n c0446n = C0446n.f12365n;
        nVar.n(Pl.class, c0446n);
        nVar.n(Z8.Ml.class, c0446n);
        Dsr dsr = Dsr.f12350n;
        nVar.n(s4.class, dsr);
        nVar.n(C.class, dsr);
        w6 w6Var = w6.f12366n;
        nVar.n(Xo.class, w6Var);
        nVar.n(Z8.I28.class, w6Var);
        j jVar = j.f12363n;
        nVar.n(Z8.j.class, jVar);
        nVar.n(Z8.w6.class, jVar);
        fuX fux = fuX.f12360n;
        nVar.n(AbstractC1495c.class, fux);
        nVar.n(Z8.aC.class, fux);
        Ml ml = Ml.f12354n;
        nVar.n(eO.class, ml);
        nVar.n(Z8.Wre.class, ml);
        CN3 cn3 = CN3.f12348n;
        nVar.n(l3D.class, cn3);
        nVar.n(Z8.Dsr.class, cn3);
        Wre wre = Wre.f12356n;
        nVar.n(QJ.class, wre);
        nVar.n(Z8.fuX.class, wre);
        aC aCVar = aC.f12357n;
        nVar.n(Q.class, aCVar);
        nVar.n(qz.class, aCVar);
        I28 i28 = I28.f12352n;
        nVar.n(z.class, i28);
        nVar.n(Z8.CN3.class, i28);
    }

    private n() {
    }
}
