package Cs3;

import K6D.Ml;
import QmE.C;
import QmE.C1450z;
import QmE.CN3;
import QmE.Dsr;
import QmE.Pl;
import QmE.Wre;
import QmE.Xo;
import QmE.aC;
import QmE.eO;
import QmE.fuX;
import QmE.j;
import QmE.o;
import QmE.qz;
import QmE.w6;
import QmE.yg;
import ajd.j;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import ga6.j;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import rB.I28;
import rB.Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class j implements yg {
    private static final List HI;
    private static final List Ik;
    private static final List J2;
    private static final List KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final List f1020O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final List f1021S;
    private static final List Uo;
    private static final List ViF;
    private static final List WPU;
    private static final List XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final List f1022Z;
    private static final List aYN;
    private static final List az;
    private static final List ck;
    private static final List gh;
    private static final List mUb;
    private static final List nY;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final List f1023o;
    private static final List qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final List f1024r;
    private static final List ty;
    private static final List xMQ;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Ml f1026n;
    public static final C0035j rl = new C0035j(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f1025t = 8;
    private static final List nr = CollectionsKt.listOf(MRAIDPresenter.ERROR);

    /* JADX INFO: renamed from: Cs3.j$j, reason: collision with other inner class name */
    public static final class C0035j {
        public /* synthetic */ C0035j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0035j() {
        }
    }

    public /* synthetic */ class n {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[j.w6.values().length];
            try {
                iArr[j.w6.f67632t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.w6.f67628O.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.w6.J2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[j.w6.f67631r.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        List listListOf = CollectionsKt.listOf("account_manager");
        f1020O = listListOf;
        J2 = CollectionsKt.plus((Collection) listListOf, (Iterable) CollectionsKt.listOf("account_deletion_completed"));
        Uo = CollectionsKt.plus((Collection) listListOf, (Iterable) CollectionsKt.listOf("account_deletion_failed"));
        KN = CollectionsKt.plus((Collection) listListOf, (Iterable) CollectionsKt.listOf("sign_in_canceled"));
        xMQ = CollectionsKt.plus((Collection) listListOf, (Iterable) CollectionsKt.listOf("sign_in_started"));
        mUb = CollectionsKt.plus((Collection) listListOf, (Iterable) CollectionsKt.listOf("sign_in_completed"));
        gh = CollectionsKt.plus((Collection) listListOf, (Iterable) CollectionsKt.listOf("sign_in_failed"));
        qie = CollectionsKt.plus((Collection) listListOf, (Iterable) CollectionsKt.listOf("sign_out_completed"));
        az = CollectionsKt.plus((Collection) listListOf, (Iterable) CollectionsKt.listOf("sign_out_failed"));
        ty = CollectionsKt.plus((Collection) listListOf, (Iterable) CollectionsKt.listOf("unlink_auth_provider_completed"));
        HI = CollectionsKt.plus((Collection) listListOf, (Iterable) CollectionsKt.listOf("unlink_auth_provider_failed"));
        List listListOf2 = CollectionsKt.listOf("setup");
        ck = listListOf2;
        Ik = CollectionsKt.listOf("dynamic_links_import");
        f1024r = CollectionsKt.plus((Collection) listListOf2, (Iterable) CollectionsKt.listOf("first_paywall"));
        f1023o = CollectionsKt.listOf("settings_download_failed");
        f1022Z = CollectionsKt.listOf("subscriptions");
        List listListOf3 = CollectionsKt.listOf("export");
        XQ = listListOf3;
        f1021S = CollectionsKt.plus((Collection) listListOf3, (Iterable) CollectionsKt.listOf("export_operation"));
        WPU = CollectionsKt.plus((Collection) listListOf3, (Iterable) CollectionsKt.listOf("save"));
        List listListOf4 = CollectionsKt.listOf("monetization");
        aYN = listListOf4;
        ViF = CollectionsKt.plus((Collection) listListOf4, (Iterable) CollectionsKt.listOf("paywall_shown"));
        nY = CollectionsKt.listOf((Object[]) new String[]{"account", "properties", MRAIDPresenter.ERROR});
    }

    public j(Ml spiderSense) {
        Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
        this.f1026n = d3.j.nr(spiderSense, "alight");
    }

    private final j.EnumC0481j rl(j.w6 w6Var) {
        int i2 = n.$EnumSwitchMapping$0[w6Var.ordinal()];
        if (i2 == 1) {
            return j.EnumC0481j.f13105t;
        }
        if (i2 == 2) {
            return j.EnumC0481j.f13101O;
        }
        if (i2 == 3) {
            return j.EnumC0481j.J2;
        }
        if (i2 == 4) {
            return j.EnumC0481j.f13104r;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // QmE.yg
    public void n(QmE.j event) {
        pq.Ml ml;
        String strN;
        String strN2;
        String strN3;
        String strN4;
        String strN5;
        String strN6;
        String strN7;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof j.C1443n) {
            I28.rl(this.f1026n, J2, j.EnumC0481j.f13105t, null, null, null, 28, null);
            Unit unit = Unit.INSTANCE;
            return;
        }
        if (event instanceof j.w6) {
            I28.rl(this.f1026n, Uo, j.EnumC0481j.J2, null, null, rWZ.j.gh(((j.w6) event).n()), 12, null);
            Unit unit2 = Unit.INSTANCE;
            return;
        }
        if (event instanceof QmE.n) {
            Ml.n.rl(this.f1026n.O(), new ajd.j(ck, j.EnumC0481j.f13105t, null, null, null, 28, null), null, 2, null);
            Unit unit3 = Unit.INSTANCE;
            return;
        }
        if (event instanceof w6) {
            K6D.Ml mlO = this.f1026n.O();
            List list = ck;
            j.EnumC0481j enumC0481j = j.EnumC0481j.f13104r;
            String strN8 = ((w6) event).n();
            Ml.n.t(mlO, new ajd.j(list, enumC0481j, strN8 == null ? "" : strN8, null, null, 24, null), null, 2, null);
            Unit unit4 = Unit.INSTANCE;
            return;
        }
        if (event instanceof QmE.Ml) {
            Ml.n.nr(this.f1026n.O(), new ajd.j(ck, j.EnumC0481j.f13105t, null, null, null, 28, null), null, 2, null);
            return;
        }
        if (event instanceof CN3) {
            Ml.n.nr(this.f1026n.O(), new ajd.j(Ik, j.EnumC0481j.f13105t, null, null, null, 28, null), null, 2, null);
            return;
        }
        if (event instanceof QmE.I28) {
            K6D.Ml mlO2 = this.f1026n.O();
            List list2 = Ik;
            j.EnumC0481j enumC0481j2 = j.EnumC0481j.f13105t;
            String strN9 = ((QmE.I28) event).n();
            Ml.n.rl(mlO2, new ajd.j(list2, enumC0481j2, strN9 == null ? "" : strN9, null, null, 24, null), null, 2, null);
            Unit unit5 = Unit.INSTANCE;
            return;
        }
        if (event instanceof Wre) {
            K6D.Ml mlO3 = this.f1026n.O();
            List list3 = Ik;
            j.EnumC0481j enumC0481j3 = j.EnumC0481j.J2;
            String strN10 = ((Wre) event).n();
            Ml.n.t(mlO3, new ajd.j(list3, enumC0481j3, strN10 == null ? "" : strN10, null, null, 24, null), null, 2, null);
            Unit unit6 = Unit.INSTANCE;
            return;
        }
        if (event instanceof j.xZD) {
            ga6.j jVarN = ((j.xZD) event).n();
            rB.Ml mlO4 = d3.j.O(this.f1026n, nr);
            List listListOf = CollectionsKt.listOf(jVarN.n().rl());
            j.EnumC0481j enumC0481jRl = rl(jVarN.nr());
            String strRl = jVarN.rl();
            pq.Ml ml2 = new pq.Ml();
            ml2.O("error_domain", jVarN.t().rl());
            ml2.O("error_throwable", jVarN.O().toString());
            Unit unit7 = Unit.INSTANCE;
            I28.rl(mlO4, listListOf, enumC0481jRl, strRl, null, ml2, 8, null);
            return;
        }
        if (event instanceof fuX) {
            K6D.Ml mlO5 = this.f1026n.O();
            List list4 = f1021S;
            j.EnumC0481j enumC0481j4 = j.EnumC0481j.f13101O;
            pq.Ml ml3 = new pq.Ml();
            fuX fux = (fuX) event;
            Integer numN = fux.n();
            if (numN != null && (strN7 = rWZ.j.n(numN.intValue())) != null) {
                ml3.O("export_format", strN7);
                Unit unit8 = Unit.INSTANCE;
            }
            ml3.J2("project_ids", rWZ.j.mUb(fux.rl()));
            Unit unit9 = Unit.INSTANCE;
            Ml.n.n(mlO5, new ajd.j(list4, enumC0481j4, null, null, ml3, 12, null), null, 2, null);
            return;
        }
        if (event instanceof Dsr) {
            K6D.Ml mlO6 = this.f1026n.O();
            List list5 = f1021S;
            pq.Ml ml4 = new pq.Ml();
            Dsr dsr = (Dsr) event;
            Integer numN2 = dsr.n();
            if (numN2 != null && (strN6 = rWZ.j.n(numN2.intValue())) != null) {
                ml4.O("export_format", strN6);
                Unit unit10 = Unit.INSTANCE;
            }
            ml4.J2("project_ids", rWZ.j.mUb(dsr.rl()));
            Unit unit11 = Unit.INSTANCE;
            Ml.n.rl(mlO6, new ajd.j(list5, null, null, null, ml4, 14, null), null, 2, null);
            return;
        }
        if (event instanceof aC) {
            K6D.Ml mlO7 = this.f1026n.O();
            List list6 = f1021S;
            j.EnumC0481j enumC0481j5 = j.EnumC0481j.J2;
            aC aCVar = (aC) event;
            pq.Ml mlGh = rWZ.j.gh(aCVar.n());
            Integer numRl = aCVar.rl();
            if (numRl != null && (strN5 = rWZ.j.n(numRl.intValue())) != null) {
                mlGh.O("export_format", strN5);
                Unit unit12 = Unit.INSTANCE;
            }
            mlGh.J2("project_ids", rWZ.j.mUb(aCVar.t()));
            Unit unit13 = Unit.INSTANCE;
            Ml.n.t(mlO7, new ajd.j(list6, enumC0481j5, null, null, mlGh, 12, null), null, 2, null);
            return;
        }
        if (event instanceof o) {
            K6D.Ml mlO8 = this.f1026n.O();
            List list7 = WPU;
            pq.Ml ml5 = new pq.Ml();
            o oVar = (o) event;
            Integer numN3 = oVar.n();
            if (numN3 != null && (strN4 = rWZ.j.n(numN3.intValue())) != null) {
                ml5.O("export_format", strN4);
                Unit unit14 = Unit.INSTANCE;
            }
            ml5.J2("project_ids", rWZ.j.mUb(oVar.rl()));
            Unit unit15 = Unit.INSTANCE;
            Ml.n.rl(mlO8, new ajd.j(list7, null, null, null, ml5, 14, null), null, 2, null);
            return;
        }
        if (event instanceof qz) {
            K6D.Ml mlO9 = this.f1026n.O();
            List list8 = WPU;
            j.EnumC0481j enumC0481j6 = j.EnumC0481j.J2;
            qz qzVar = (qz) event;
            pq.Ml mlGh2 = rWZ.j.gh(qzVar.n());
            Integer numRl2 = qzVar.rl();
            if (numRl2 != null && (strN3 = rWZ.j.n(numRl2.intValue())) != null) {
                mlGh2.O("export_format", strN3);
                Unit unit16 = Unit.INSTANCE;
            }
            mlGh2.J2("project_ids", rWZ.j.mUb(qzVar.t()));
            Unit unit17 = Unit.INSTANCE;
            Ml.n.t(mlO9, new ajd.j(list8, enumC0481j6, null, null, mlGh2, 12, null), null, 2, null);
            return;
        }
        if (event instanceof Pl) {
            K6D.Ml mlO10 = this.f1026n.O();
            List list9 = WPU;
            pq.Ml ml6 = new pq.Ml();
            Pl pl = (Pl) event;
            Integer numN4 = pl.n();
            if (numN4 != null && (strN2 = rWZ.j.n(numN4.intValue())) != null) {
                ml6.O("export_format", strN2);
                Unit unit18 = Unit.INSTANCE;
            }
            ml6.J2("project_ids", rWZ.j.mUb(pl.rl()));
            Unit unit19 = Unit.INSTANCE;
            Ml.n.nr(mlO10, new ajd.j(list9, null, null, null, ml6, 14, null), null, 2, null);
            return;
        }
        if (event instanceof C) {
            K6D.Ml mlO11 = this.f1026n.O();
            List list10 = f1021S;
            pq.Ml ml7 = new pq.Ml();
            C c2 = (C) event;
            Integer numN5 = c2.n();
            if (numN5 != null && (strN = rWZ.j.n(numN5.intValue())) != null) {
                ml7.O("export_format", strN);
                Unit unit20 = Unit.INSTANCE;
            }
            ml7.J2("project_ids", rWZ.j.mUb(c2.rl()));
            Unit unit21 = Unit.INSTANCE;
            Ml.n.nr(mlO11, new ajd.j(list10, null, null, null, ml7, 14, null), null, 2, null);
            return;
        }
        if (event instanceof Xo) {
            Ml.n.rl(this.f1026n.O(), new ajd.j(f1024r, j.EnumC0481j.f13105t, null, null, null, 28, null), null, 2, null);
            Unit unit22 = Unit.INSTANCE;
            return;
        }
        if (event instanceof eO) {
            K6D.Ml mlO12 = this.f1026n.O();
            List list11 = f1024r;
            j.EnumC0481j enumC0481j7 = j.EnumC0481j.J2;
            String strN11 = ((eO) event).n();
            Ml.n.t(mlO12, new ajd.j(list11, enumC0481j7, strN11 == null ? "" : strN11, null, null, 24, null), null, 2, null);
            Unit unit23 = Unit.INSTANCE;
            return;
        }
        if (event instanceof C1450z) {
            Ml.n.nr(this.f1026n.O(), new ajd.j(f1024r, j.EnumC0481j.f13105t, null, null, null, 28, null), null, 2, null);
            return;
        }
        if (event instanceof j.hQ) {
            I28.rl(this.f1026n, f1022Z, j.EnumC0481j.f13104r, "could not find subscription " + ((j.hQ) event).n(), null, null, 24, null);
            Unit unit24 = Unit.INSTANCE;
            return;
        }
        if (event instanceof j.Ji) {
            I28.rl(this.f1026n, KN, j.EnumC0481j.f13105t, null, null, null, 28, null);
            Unit unit25 = Unit.INSTANCE;
            return;
        }
        if (event instanceof j.Su) {
            I28.rl(this.f1026n, xMQ, j.EnumC0481j.f13105t, null, null, null, 28, null);
            Unit unit26 = Unit.INSTANCE;
            return;
        }
        if (event instanceof j.iy) {
            rB.Ml ml8 = this.f1026n;
            List list12 = mUb;
            j.EnumC0481j enumC0481j8 = j.EnumC0481j.f13105t;
            pq.Ml ml9 = new pq.Ml();
            String strN12 = ((j.iy) event).n();
            if (strN12 != null) {
                ml9.O("provider", strN12);
                Unit unit27 = Unit.INSTANCE;
            }
            Unit unit28 = Unit.INSTANCE;
            I28.rl(ml8, list12, enumC0481j8, null, null, ml9, 12, null);
            return;
        }
        if (event instanceof j.J) {
            rB.Ml ml10 = this.f1026n;
            List list13 = gh;
            j.EnumC0481j enumC0481j9 = j.EnumC0481j.J2;
            j.J j2 = (j.J) event;
            Exception excN = j2.n();
            if (excN == null || (ml = rWZ.j.gh(excN)) == null) {
                ml = new pq.Ml();
            }
            pq.Ml ml11 = ml;
            String strRl2 = j2.rl();
            if (strRl2 != null) {
                ml11.O("provider", strRl2);
                Unit unit29 = Unit.INSTANCE;
            }
            Unit unit30 = Unit.INSTANCE;
            I28.rl(ml10, list13, enumC0481j9, null, null, ml11, 12, null);
            return;
        }
        if (event instanceof j.I) {
            I28.rl(this.f1026n, qie, j.EnumC0481j.f13105t, null, null, null, 28, null);
            Unit unit31 = Unit.INSTANCE;
            return;
        }
        if (event instanceof j.dd) {
            I28.rl(this.f1026n, az, j.EnumC0481j.J2, null, null, rWZ.j.gh(((j.dd) event).n()), 12, null);
            Unit unit32 = Unit.INSTANCE;
            return;
        }
        if (event instanceof j.J2L) {
            I28.rl(this.f1026n, ty, j.EnumC0481j.f13105t, null, null, null, 28, null);
            Unit unit33 = Unit.INSTANCE;
            return;
        }
        if (event instanceof j.tUY) {
            I28.rl(this.f1026n, HI, j.EnumC0481j.J2, null, null, rWZ.j.gh(((j.tUY) event).n()), 12, null);
            Unit unit34 = Unit.INSTANCE;
            return;
        }
        if (event instanceof j.IE) {
            rB.Ml ml12 = this.f1026n;
            List list14 = ViF;
            j.EnumC0481j enumC0481j10 = j.EnumC0481j.f13105t;
            pq.Ml ml13 = new pq.Ml();
            String strRl3 = ((j.IE) event).rl();
            ml13.O("hook", strRl3 != null ? strRl3 : "");
            Unit unit35 = Unit.INSTANCE;
            I28.rl(ml12, list14, enumC0481j10, null, null, ml13, 12, null);
            return;
        }
        if (event instanceof j.rd) {
            j.rd rdVar = (j.rd) event;
            I28.rl(this.f1026n, nY, j.EnumC0481j.J2, rdVar.n(), rdVar.rl(), null, 16, null);
            Unit unit36 = Unit.INSTANCE;
        } else {
            if (!(event instanceof j.C0292j)) {
                Unit unit37 = Unit.INSTANCE;
                return;
            }
            j.C0292j c0292j = (j.C0292j) event;
            I28.rl(this.f1026n, nY, j.EnumC0481j.J2, c0292j.n(), c0292j.rl(), null, 16, null);
            Unit unit38 = Unit.INSTANCE;
        }
    }
}
