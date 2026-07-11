package kIp;

import FSZ.qz;
import Hh.Pl;
import X1.I28;
import aB.AbstractC1501Ml;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import bA.C1665w6;
import bA.InterfaceC1656I28;
import gwe.C;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import wVf.Wre;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class Ml implements ypp.j {
    private final qz J2;
    private final Hh.qz KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final AbstractC1501Ml f69840O;
    private final Hh.qz Uo;
    private final Hh.qz az;
    private final Hh.qz gh;
    private final Hh.qz mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Szt.n f69841n;
    private final Jv.n nr;
    private final Hh.qz qie;
    private final ScheduledExecutorService rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ExecutorService f69842t;
    private final Hh.qz ty = Pl.rl;
    private final Hh.qz xMQ;

    private zdu.n J2(I28 i28) {
        int iIntValue = ((Integer) this.Uo.get()).intValue();
        return iIntValue != 1 ? iIntValue != 2 ? iIntValue != 3 ? new Eo.Ml() : new Eo.w6() : new Eo.n(nr(i28), false) : new Eo.n(nr(i28), true);
    }

    private wVf.n Uo(zdu.w6 w6Var, Bitmap.Config config) {
        AbstractC1501Ml abstractC1501Ml = this.f69840O;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return new wVf.w6(abstractC1501Ml, w6Var, config, this.f69842t);
    }

    private Szt.w6 nr(I28 i28) {
        return new Szt.w6(new Eo.j(i28.hashCode(), ((Boolean) this.xMQ.get()).booleanValue()), this.J2);
    }

    @Override // ypp.j
    public boolean rl(InterfaceC1656I28 interfaceC1656I28) {
        return interfaceC1656I28 instanceof C1665w6;
    }

    public Ml(Szt.n nVar, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService, Jv.n nVar2, AbstractC1501Ml abstractC1501Ml, qz qzVar, Hh.qz qzVar2, Hh.qz qzVar3, Hh.qz qzVar4, Hh.qz qzVar5, Hh.qz qzVar6, Hh.qz qzVar7, Hh.qz qzVar8) {
        this.f69841n = nVar;
        this.rl = scheduledExecutorService;
        this.f69842t = executorService;
        this.nr = nVar2;
        this.f69840O = abstractC1501Ml;
        this.J2 = qzVar;
        this.Uo = qzVar2;
        this.KN = qzVar3;
        this.xMQ = qzVar4;
        this.mUb = qzVar5;
        this.qie = qzVar7;
        this.gh = qzVar6;
        this.az = qzVar8;
    }

    private y8.j O(I28 i28, Bitmap.Config config, ra.w6 w6Var) {
        wVf.j wre;
        wVf.n nVarUo;
        X1.j jVarT = t(i28);
        VWJ.j jVar = new VWJ.j(jVarT);
        zdu.n nVarJ2 = J2(i28);
        VWJ.n nVar = new VWJ.n(nVarJ2, jVarT, ((Boolean) this.mUb.get()).booleanValue());
        int iIntValue = ((Integer) this.KN.get()).intValue();
        if (iIntValue > 0) {
            wre = new wVf.Ml(iIntValue);
            nVarUo = Uo(nVar, config);
        } else {
            wre = null;
            nVarUo = null;
        }
        if (((Boolean) this.mUb.get()).booleanValue()) {
            wre = new Wre(i28.O(), jVar, nVar, new C(this.f69840O, ((Integer) this.qie.get()).intValue(), ((Integer) this.az.get()).intValue()), ((Boolean) this.gh.get()).booleanValue());
        }
        return y8.w6.r(new zdu.j(this.f69840O, nVarJ2, jVar, nVar, ((Boolean) this.mUb.get()).booleanValue(), wre, nVarUo, null), this.nr, this.rl);
    }

    private X1.j t(I28 i28) {
        X1.w6 w6VarNr = i28.nr();
        return this.f69841n.n(i28, new Rect(0, 0, w6VarNr.getWidth(), w6VarNr.getHeight()));
    }

    @Override // ypp.j
    public Drawable n(InterfaceC1656I28 interfaceC1656I28) {
        Bitmap.Config configJ2;
        if (!rl(interfaceC1656I28)) {
            return null;
        }
        C1665w6 c1665w6 = (C1665w6) interfaceC1656I28;
        X1.w6 w6VarFcU = c1665w6.fcU();
        I28 i28 = (I28) Hh.C.Uo(c1665w6.n1());
        if (w6VarFcU != null) {
            configJ2 = w6VarFcU.J2();
        } else {
            configJ2 = null;
        }
        y8.j jVarO = O(i28, configJ2, null);
        if (((Boolean) this.ty.get()).booleanValue()) {
            return new P6h.Wre(jVarO);
        }
        return new P6h.n(jVarO);
    }
}
