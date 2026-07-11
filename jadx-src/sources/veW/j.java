package veW;

import com.caoccao.javet.exceptions.JavetError;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class j implements oy.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final oy.j f74719n = new j();

    private static final class CN3 implements WkR.w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final CN3 f74720n = new CN3();
        private static final WkR.n rl = WkR.n.n("startMs").rl(OGa.j.rl().t(1).n()).n();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final WkR.n f74721t = WkR.n.n("endMs").rl(OGa.j.rl().t(2).n()).n();

        @Override // WkR.w6
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public void n(Dy.Wre wre, WkR.Ml ml) {
            ml.rl(rl, wre.rl());
            ml.rl(f74721t, wre.n());
        }

        private CN3() {
        }
    }

    private static final class Ml implements WkR.w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final Ml f74723n = new Ml();
        private static final WkR.n rl = WkR.n.n("logSource").rl(OGa.j.rl().t(1).n()).n();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final WkR.n f74724t = WkR.n.n("logEventDropped").rl(OGa.j.rl().t(2).n()).n();

        @Override // WkR.w6
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public void n(Dy.Ml ml, WkR.Ml ml2) {
            ml2.Uo(rl, ml.rl());
            ml2.Uo(f74724t, ml.n());
        }

        private Ml() {
        }
    }

    private static final class Wre implements WkR.w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final Wre f74725n = new Wre();
        private static final WkR.n rl = WkR.n.n("currentCacheSizeBytes").rl(OGa.j.rl().t(1).n()).n();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final WkR.n f74726t = WkR.n.n("maxCacheSizeBytes").rl(OGa.j.rl().t(2).n()).n();

        @Override // WkR.w6
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public void n(Dy.I28 i28, WkR.Ml ml) {
            ml.rl(rl, i28.n());
            ml.rl(f74726t, i28.rl());
        }

        private Wre() {
        }
    }

    /* JADX INFO: renamed from: veW.j$j, reason: collision with other inner class name */
    private static final class C1243j implements WkR.w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final C1243j f74728n = new C1243j();
        private static final WkR.n rl = WkR.n.n("window").rl(OGa.j.rl().t(1).n()).n();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final WkR.n f74729t = WkR.n.n("logSourceMetrics").rl(OGa.j.rl().t(2).n()).n();
        private static final WkR.n nr = WkR.n.n("globalMetrics").rl(OGa.j.rl().t(3).n()).n();

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final WkR.n f74727O = WkR.n.n("appNamespace").rl(OGa.j.rl().t(4).n()).n();

        @Override // WkR.w6
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public void n(Dy.j jVar, WkR.Ml ml) {
            ml.Uo(rl, jVar.nr());
            ml.Uo(f74729t, jVar.t());
            ml.Uo(nr, jVar.rl());
            ml.Uo(f74727O, jVar.n());
        }

        private C1243j() {
        }
    }

    private static final class n implements WkR.w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final n f74730n = new n();
        private static final WkR.n rl = WkR.n.n("storageMetrics").rl(OGa.j.rl().t(1).n()).n();

        @Override // WkR.w6
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public void n(Dy.n nVar, WkR.Ml ml) {
            ml.Uo(rl, nVar.n());
        }

        private n() {
        }
    }

    private static final class w6 implements WkR.w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final w6 f74731n = new w6();
        private static final WkR.n rl = WkR.n.n("eventsDroppedCount").rl(OGa.j.rl().t(1).n()).n();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final WkR.n f74732t = WkR.n.n(JavetError.PARAMETER_REASON).rl(OGa.j.rl().t(3).n()).n();

        @Override // WkR.w6
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public void n(Dy.w6 w6Var, WkR.Ml ml) {
            ml.rl(rl, w6Var.n());
            ml.Uo(f74732t, w6Var.rl());
        }

        private w6() {
        }
    }

    private static final class I28 implements WkR.w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final I28 f74722n = new I28();
        private static final WkR.n rl = WkR.n.nr("clientMetrics");

        public void rl(qz qzVar, WkR.Ml ml) {
            throw null;
        }

        private I28() {
        }

        @Override // WkR.w6
        public /* bridge */ /* synthetic */ void n(Object obj, Object obj2) {
            android.support.v4.media.j.n(obj);
            rl(null, (WkR.Ml) obj2);
        }
    }

    @Override // oy.j
    public void n(oy.n nVar) {
        nVar.n(qz.class, I28.f74722n);
        nVar.n(Dy.j.class, C1243j.f74728n);
        nVar.n(Dy.Wre.class, CN3.f74720n);
        nVar.n(Dy.Ml.class, Ml.f74723n);
        nVar.n(Dy.w6.class, w6.f74731n);
        nVar.n(Dy.n.class, n.f74730n);
        nVar.n(Dy.I28.class, Wre.f74725n);
    }

    private j() {
    }
}
