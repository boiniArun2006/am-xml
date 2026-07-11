package gq;

import com.google.firebase.Timestamp;
import g0.j;
import hoV.I28;
import hoV.Ml;
import hoV.j;
import hoV.n;
import hoV.w6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pUk.eO;
import uB.C;
import uB.C2395Wre;
import uB.UGc;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class eO {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.google.firebase.firestore.remote.r f67770n;

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f67771n;
        static final /* synthetic */ int[] rl;

        static {
            int[] iArr = new int[w6.EnumC0960w6.values().length];
            rl = iArr;
            try {
                iArr[w6.EnumC0960w6.DOCUMENTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                rl[w6.EnumC0960w6.QUERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[j.w6.values().length];
            f67771n = iArr2;
            try {
                iArr2[j.w6.DOCUMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f67771n[j.w6.NO_DOCUMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f67771n[j.w6.UNKNOWN_DOCUMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private pUk.QJ J2(hoV.n nVar, boolean z2) {
        pUk.QJ qjIk = pUk.QJ.Ik(this.f67770n.gh(nVar.qie()), this.f67770n.S(nVar.az()));
        return z2 ? qjIk.o() : qjIk;
    }

    private pUk.QJ KN(hoV.Ml ml) {
        return pUk.QJ.r(this.f67770n.gh(ml.qie()), this.f67770n.S(ml.az()));
    }

    private pUk.QJ n(C2395Wre c2395Wre, boolean z2) {
        pUk.QJ qjHI = pUk.QJ.HI(this.f67770n.gh(c2395Wre.HI()), this.f67770n.S(c2395Wre.ck()), pUk.l3D.J2(c2395Wre.az()));
        return z2 ? qjHI.o() : qjHI;
    }

    hoV.w6 HI(oJ oJVar) {
        l4Z l4z = l4Z.LISTEN;
        wqP.n.t(l4z.equals(oJVar.t()), "Only queries with purpose %s may be stored, got %s", l4z, oJVar.t());
        w6.n nVarNY = hoV.w6.nY();
        nVarNY.ck(oJVar.KN()).qie(oJVar.O()).gh(this.f67770n.p5(oJVar.rl())).HI(this.f67770n.p5(oJVar.J2())).ty(oJVar.nr());
        uh.vd vdVarUo = oJVar.Uo();
        if (vdVarUo.o()) {
            nVarNY.mUb(this.f67770n.iF(vdVarUo));
        } else {
            nVarNY.az(this.f67770n.Xw(vdVarUo));
        }
        return (hoV.w6) nVarNY.build();
    }

    public BC.Wre nr(uB.UGc uGc) {
        return this.f67770n.qie(uGc);
    }

    public uB.UGc qie(BC.Wre wre) {
        return this.f67770n.wTp(wre);
    }

    public List rl(g0.j jVar) {
        ArrayList arrayList = new ArrayList();
        for (j.w6 w6Var : jVar.az()) {
            arrayList.add(eO.w6.rl(pUk.z.o(w6Var.qie()), w6Var.ty().equals(j.w6.Ml.ARRAY_CONFIG) ? eO.w6.j.CONTAINS : w6Var.az().equals(j.w6.EnumC0933w6.ASCENDING) ? eO.w6.j.ASCENDING : eO.w6.j.DESCENDING));
        }
        return arrayList;
    }

    pUk.QJ t(hoV.j jVar) {
        int i2 = j.f67771n[jVar.ty().ordinal()];
        if (i2 == 1) {
            return n(jVar.az(), jVar.HI());
        }
        if (i2 == 2) {
            return J2(jVar.ck(), jVar.HI());
        }
        if (i2 == 3) {
            return KN(jVar.Ik());
        }
        throw wqP.n.n("Unknown MaybeDocument %s", jVar);
    }

    public eO(com.google.firebase.firestore.remote.r rVar) {
        this.f67770n = rVar;
    }

    private hoV.Ml ck(pUk.fuX fux) {
        Ml.n nVarTy = hoV.Ml.ty();
        nVarTy.xMQ(this.f67770n.N(fux.getKey()));
        nVarTy.mUb(this.f67770n.P5(fux.getVersion().rl()));
        return (hoV.Ml) nVarTy.build();
    }

    private hoV.n ty(pUk.fuX fux) {
        n.C0959n c0959nTy = hoV.n.ty();
        c0959nTy.xMQ(this.f67770n.N(fux.getKey()));
        c0959nTy.mUb(this.f67770n.P5(fux.getVersion().rl()));
        return (hoV.n) c0959nTy.build();
    }

    private C2395Wre xMQ(pUk.fuX fux) {
        C2395Wre.n nVarO = C2395Wre.o();
        nVarO.mUb(this.f67770n.N(fux.getKey()));
        nVarO.xMQ(fux.getData().xMQ());
        nVarO.gh(this.f67770n.P5(fux.getVersion().rl()));
        return (C2395Wre) nVarO.build();
    }

    BC.CN3 O(hoV.I28 i28) {
        int iO = i28.o();
        Timestamp timestampZ = this.f67770n.Z(i28.Z());
        int iR = i28.r();
        ArrayList arrayList = new ArrayList(iR);
        for (int i2 = 0; i2 < iR; i2++) {
            arrayList.add(this.f67770n.qie(i28.Ik(i2)));
        }
        ArrayList arrayList2 = new ArrayList(i28.S());
        int i3 = 0;
        while (i3 < i28.S()) {
            uB.UGc uGcXQ = i28.XQ(i3);
            int i5 = i3 + 1;
            if (i5 < i28.S() && i28.XQ(i5).nY()) {
                wqP.n.t(i28.XQ(i3).g(), "TransformMutation should be preceded by a patch or set mutation", new Object[0]);
                UGc.n nVarFD = uB.UGc.fD(uGcXQ);
                Iterator it = i28.XQ(i5).Z().mUb().iterator();
                while (it.hasNext()) {
                    nVarFD.xMQ((C.w6) it.next());
                }
                arrayList2.add(this.f67770n.qie((uB.UGc) nVarFD.build()));
                i3 = i5;
            } else {
                arrayList2.add(this.f67770n.qie(uGcXQ));
            }
            i3++;
        }
        return new BC.CN3(iO, timestampZ, arrayList, arrayList2);
    }

    oJ Uo(hoV.w6 w6Var) {
        uh.vd vdVarO;
        int iAYN = w6Var.aYN();
        pUk.UGc uGcS = this.f67770n.S(w6Var.WPU());
        pUk.UGc uGcS2 = this.f67770n.S(w6Var.o());
        com.google.protobuf.C cS2 = w6Var.S();
        long jZ = w6Var.Z();
        int i2 = j.rl[w6Var.ViF().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                vdVarO = this.f67770n.r(w6Var.XQ());
            } else {
                throw wqP.n.n("Unknown targetType %d", w6Var.ViF());
            }
        } else {
            vdVarO = this.f67770n.O(w6Var.r());
        }
        return new oJ(vdVarO, iAYN, jZ, l4Z.LISTEN, uGcS, uGcS2, cS2, null);
    }

    hoV.I28 az(BC.CN3 cn3) {
        I28.n nVarWPU = hoV.I28.WPU();
        nVarWPU.gh(cn3.nr());
        nVarWPU.qie(this.f67770n.P5(cn3.J2()));
        Iterator it = cn3.t().iterator();
        while (it.hasNext()) {
            nVarWPU.xMQ(this.f67770n.wTp((BC.Wre) it.next()));
        }
        Iterator it2 = cn3.Uo().iterator();
        while (it2.hasNext()) {
            nVarWPU.mUb(this.f67770n.wTp((BC.Wre) it2.next()));
        }
        return (hoV.I28) nVarWPU.build();
    }

    hoV.j gh(pUk.fuX fux) {
        j.n nVarR = hoV.j.r();
        if (fux.J2()) {
            nVarR.gh(ty(fux));
        } else if (fux.KN()) {
            nVarR.xMQ(xMQ(fux));
        } else if (fux.Uo()) {
            nVarR.qie(ck(fux));
        } else {
            throw wqP.n.n("Cannot encode invalid document %s", fux);
        }
        nVarR.mUb(fux.rl());
        return (hoV.j) nVarR.build();
    }

    public g0.j mUb(List list) {
        j.n nVarTy = g0.j.ty();
        nVarTy.mUb(j.Ml.COLLECTION_GROUP);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            eO.w6 w6Var = (eO.w6) it.next();
            j.w6.n nVarHI = j.w6.HI();
            nVarHI.mUb(w6Var.t().t());
            if (w6Var.nr() == eO.w6.j.CONTAINS) {
                nVarHI.xMQ(j.w6.EnumC0931j.f67024O);
            } else if (w6Var.nr() == eO.w6.j.ASCENDING) {
                nVarHI.gh(j.w6.EnumC0933w6.ASCENDING);
            } else {
                nVarHI.gh(j.w6.EnumC0933w6.DESCENDING);
            }
            nVarTy.xMQ(nVarHI);
        }
        return (g0.j) nVarTy.build();
    }
}
