package ln;

import FSZ.AbstractC1349z;
import FSZ.C1348c;
import aB.AbstractC1501Ml;
import aB.C1500I28;
import android.content.Context;
import com.facebook.imagepipeline.producers.M5;
import com.facebook.imagepipeline.producers.YzO;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class UGc {
    private static UGc Ik;
    private static final Class ck = UGc.class;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static boolean f70479o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static QJ f70480r;
    private YqR.j HI;
    private C1348c J2;
    private C1348c KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private FSZ.qz f70481O;
    private FSZ.qz Uo;
    private AbstractC1501Ml az;
    private ci gh;
    private UM7.Ml mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final M5 f70482n;
    private final Hh.qz nr;
    private Md qie;
    private final InterfaceC2265c rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final C2267j f70483t;
    private dF.Ml ty;
    private bAP.n xMQ;

    private ci HI() {
        if (this.gh == null) {
            this.gh = this.rl.getExperiments().HI().n(this.rl.getContext(), this.rl.Z().gh(), xMQ(), this.rl.KN(), this.rl.E2(), this.rl.nY(), this.rl.getExperiments().g(), this.rl.X(), this.rl.Z().xMQ(this.rl.XQ()), this.rl.Z().mUb(), O(), KN(), this.nr, this.rl.ViF(), az(), this.rl.getExperiments().J2(), this.rl.getExperiments().O(), this.rl.getExperiments().nr(), this.rl.getExperiments().qie(), J2(), this.rl.getExperiments().gh(), this.rl.getExperiments().Z());
        }
        return this.gh;
    }

    public static synchronized void Z(InterfaceC2265c interfaceC2265c) {
        if (Ik != null) {
            Dzy.j.XQ(ck, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
            if (f70479o) {
                return;
            }
        }
        Ik = new UGc(interfaceC2265c);
    }

    private Md ck() {
        boolean zS = this.rl.getExperiments().S();
        if (this.qie == null) {
            this.qie = new Md(this.rl.getContext().getApplicationContext().getContentResolver(), HI(), this.rl.rl(), this.rl.nY(), this.rl.getExperiments().s7N(), this.f70482n, this.rl.E2(), zS, this.rl.getExperiments().nHg(), this.rl.ck(), gh(), this.rl.getExperiments().fD(), this.rl.getExperiments().te(), this.rl.getExperiments().n(), this.rl.g());
        }
        return this.qie;
    }

    private UM7.Ml gh() {
        if (this.mUb == null) {
            if (this.rl.ty() == null && this.rl.az() == null && this.rl.getExperiments().N()) {
                this.mUb = new UM7.fuX(this.rl.getExperiments().qie());
            } else {
                this.mUb = new UM7.Wre(this.rl.getExperiments().qie(), this.rl.getExperiments().WPU(), this.rl.ty(), this.rl.az(), this.rl.getExperiments().E2());
            }
        }
        return this.mUb;
    }

    private QJ n() {
        Md mdCk = ck();
        Set setO = this.rl.O();
        Set setN = this.rl.n();
        Hh.qz qzVarIF = this.rl.iF();
        C1348c c1348cO = O();
        C1348c c1348cKN = KN();
        Hh.qz qzVar = this.nr;
        FSZ.aC aCVarViF = this.rl.ViF();
        M5 m5 = this.f70482n;
        Hh.qz qzVarO = this.rl.getExperiments().o();
        Hh.qz qzVarT = this.rl.getExperiments().T();
        this.rl.e();
        return new QJ(mdCk, setO, setN, qzVarIF, c1348cO, c1348cKN, qzVar, aCVarViF, m5, qzVarO, qzVarT, null, this.rl);
    }

    public static synchronized void o(Context context) {
        try {
            if (T5.n.nr()) {
                T5.n.n("ImagePipelineFactory#initialize");
            }
            Z(l3D.nHg(context).n());
            if (T5.n.nr()) {
                T5.n.rl();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static UGc qie() {
        return (UGc) Hh.C.KN(Ik, "ImagePipelineFactory was not initialized!");
    }

    private YqR.j t() {
        if (this.HI == null) {
            this.HI = YqR.n.n(az(), this.rl.X(), nr(), this.rl.getExperiments().xMQ(), this.rl.getExperiments().XQ(), this.rl.getExperiments().rl(), this.rl.getExperiments().t(), this.rl.qie());
        }
        return this.HI;
    }

    private bAP.n xMQ() {
        bAP.n nVarT;
        bAP.n nVarRl;
        if (this.xMQ == null) {
            if (this.rl.r() != null) {
                this.xMQ = this.rl.r();
            } else {
                YqR.j jVarT = t();
                if (jVarT != null) {
                    nVarT = jVarT.t();
                    nVarRl = jVarT.rl();
                } else {
                    nVarT = null;
                    nVarRl = null;
                }
                bAP.n nVarR = r();
                this.rl.HI();
                this.xMQ = new bAP.j(nVarT, nVarRl, nVarR, ty());
            }
        }
        return this.xMQ;
    }

    public ypp.j Ik() {
        if (this.rl.getExperiments().nY()) {
            return new QG7.j();
        }
        return null;
    }

    public C2267j J2() {
        return this.f70483t;
    }

    public C1348c KN() {
        if (this.KN == null) {
            this.KN = FSZ.QJ.n(this.rl.t() != null ? this.rl.t() : Uo(), this.rl.te());
        }
        return this.KN;
    }

    public C1348c O() {
        if (this.J2 == null) {
            this.J2 = FSZ.s4.n(nr(), this.rl.te());
        }
        return this.J2;
    }

    public FSZ.qz Uo() {
        if (this.Uo == null) {
            this.Uo = AbstractC1349z.n(this.rl.o(), this.rl.fD(), this.rl.J2());
        }
        return this.Uo;
    }

    public AbstractC1501Ml az() {
        if (this.az == null) {
            this.az = C1500I28.n(this.rl.Z(), ty(), J2());
        }
        return this.az;
    }

    public QJ mUb() {
        if (f70480r == null) {
            f70480r = n();
        }
        return f70480r;
    }

    public FSZ.qz nr() {
        if (this.f70481O == null) {
            this.f70481O = this.rl.aYN().n(this.rl.Ik(), this.rl.fD(), this.rl.Uo(), this.rl.getExperiments().Ik(), this.rl.getExperiments().ck(), this.rl.gh());
        }
        return this.f70481O;
    }

    public bAP.n r() {
        if (this.rl.getExperiments().nY()) {
            return new QG7.n(this.rl.getContext().getApplicationContext().getResources());
        }
        return null;
    }

    public dF.Ml ty() {
        if (this.ty == null) {
            this.ty = dF.I28.n(this.rl.Z(), this.rl.getExperiments().X(), this.rl.getExperiments().r(), this.rl.getExperiments().ty());
        }
        return this.ty;
    }

    public UGc(InterfaceC2265c interfaceC2265c) {
        M5 yzO;
        if (T5.n.nr()) {
            T5.n.n("ImagePipelineConfig()");
        }
        InterfaceC2265c interfaceC2265c2 = (InterfaceC2265c) Hh.C.Uo(interfaceC2265c);
        this.rl = interfaceC2265c2;
        if (interfaceC2265c2.getExperiments().e()) {
            yzO = new com.facebook.imagepipeline.producers.g9s(interfaceC2265c.X().n());
        } else {
            yzO = new YzO(interfaceC2265c.X().n());
        }
        this.f70482n = yzO;
        this.f70483t = new C2267j(interfaceC2265c.WPU());
        if (T5.n.nr()) {
            T5.n.rl();
        }
        this.nr = interfaceC2265c2.S();
        if (interfaceC2265c2.getExperiments().nY()) {
            com.facebook.imageformat.I28.O().Uo(true);
        }
    }

    public ypp.j rl(Context context) {
        YqR.j jVarT = t();
        if (jVarT == null) {
            return null;
        }
        return jVarT.n(context);
    }
}
