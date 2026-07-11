package jg;

import CZF.I28;
import QmE.C;
import QmE.C1434c;
import QmE.C1449m;
import QmE.DAz;
import QmE.Dsr;
import QmE.Ew;
import QmE.K;
import QmE.Ln;
import QmE.Lu;
import QmE.M;
import QmE.Md;
import QmE.Ml;
import QmE.P;
import QmE.Q;
import QmE.QJ;
import QmE.SPz;
import QmE.UGc;
import QmE.Z;
import QmE.Zs;
import QmE.aC;
import QmE.afx;
import QmE.ci;
import QmE.fuX;
import QmE.g9s;
import QmE.h;
import QmE.iwV;
import QmE.j;
import QmE.l3D;
import QmE.lej;
import QmE.nKK;
import QmE.psW;
import QmE.qf;
import QmE.r;
import QmE.rv6;
import QmE.s4;
import QmE.u;
import QmE.vd;
import QmE.yg;
import jg.n;
import jgV.Wre;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class j implements yg {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final IPN.j f69520n;

    public j(IPN.j lazyPico) {
        Intrinsics.checkNotNullParameter(lazyPico, "lazyPico");
        this.f69520n = lazyPico;
    }

    @Override // QmE.yg
    public void n(QmE.j event) {
        n zs;
        n c2;
        n c0995n;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof j.I28) {
            c0995n = new n.C0995n();
        } else {
            if (event instanceof j.Ml) {
                j.Ml ml = (j.Ml) event;
                c2 = new n.j(ml.n(), ml.rl());
            } else if (event instanceof QmE.n) {
                c0995n = n.w6.f69604O;
            } else if (event instanceof QmE.w6) {
                c2 = new n.Ml(((QmE.w6) event).n());
            } else if (event instanceof Ml) {
                c0995n = n.I28.f69528O;
            } else if (Intrinsics.areEqual(event, j.C1444o.f8538n)) {
                c0995n = n.Wre.f69573O;
            } else if (event instanceof j.qz) {
                c2 = new n.CN3(((j.qz) event).n());
            } else if (Intrinsics.areEqual(event, j.Pl.f8438n)) {
                c0995n = n.fuX.f69582O;
            } else if (Intrinsics.areEqual(event, j.Xo.f8469n)) {
                c0995n = n.Dsr.f69526O;
            } else if (Intrinsics.areEqual(event, j.eO.f8496n)) {
                c0995n = n.aC.f69577O;
            } else if (Intrinsics.areEqual(event, j.C1448z.f8603n)) {
                c0995n = n.C.f69523O;
            } else if (event instanceof j.QJ) {
                c2 = new n.o(((j.QJ) event).n());
            } else if (event instanceof j.l3D) {
                c2 = new n.qz(((j.l3D) event).n());
            } else if (Intrinsics.areEqual(event, j.C1437c.f8483n)) {
                c0995n = n.Pl.f69567O;
            } else if (Intrinsics.areEqual(event, j.s4.f8570n)) {
                c0995n = n.Xo.f69574O;
            } else if (event instanceof j.UGc) {
                c2 = new n.eO(((j.UGc) event).n());
            } else if (event instanceof j.Ln) {
                j.Ln ln2 = (j.Ln) event;
                c2 = new n.QJ(ln2.n(), ln2.rl());
            } else if (event instanceof j.M5) {
                j.M5 m5 = (j.M5) event;
                c2 = new n.l3D(m5.n(), m5.rl());
            } else if (event instanceof j.YzO) {
                c2 = new n.ci(((j.YzO) event).n());
            } else if (event instanceof fuX) {
                c2 = new n.C2198c(((fuX) event).n());
            } else if (event instanceof Dsr) {
                c2 = new n.s4(((Dsr) event).n());
            } else if (event instanceof aC) {
                c2 = new n.UGc(((aC) event).rl());
            } else if (event instanceof C) {
                c2 = new n.Q(((C) event).n());
            } else if (event instanceof j.QaP) {
                c2 = new n.r(((j.QaP) event).n());
            } else if (event instanceof j.FKk) {
                c2 = new n.SPz(((j.FKk) event).n());
            } else if (event instanceof j.R6) {
                c0995n = n.g9s.f69583O;
            } else if (event instanceof j.RzR) {
                c2 = new n.afx(((j.RzR) event).n());
            } else if (event instanceof j.ozJ) {
                j.ozJ ozj = (j.ozJ) event;
                c2 = new n.Z(ozj.rl(), ozj.n());
            } else {
                if (event instanceof j.C1438dT) {
                    j.C1438dT c1438dT = (j.C1438dT) event;
                    zs = new n.Ew(c1438dT.O(), c1438dT.rl(), c1438dT.t(), c1438dT.Uo(), c1438dT.J2(), c1438dT.n(), c1438dT.nr());
                } else if (event instanceof j.AZy) {
                    j.AZy aZy = (j.AZy) event;
                    c2 = new n.nKK(aZy.rl(), aZy.n());
                } else if (event instanceof j.HcS) {
                    c0995n = n.DAz.f69525O;
                } else if (event instanceof j.VoU) {
                    c0995n = n.u.f69602O;
                } else if (event instanceof j.s6u) {
                    c0995n = n.qf.f69597O;
                } else if (event instanceof j.D) {
                    c2 = new n.Ln(((j.D) event).n());
                } else if (event instanceof j.W) {
                    c2 = new n.lej(((j.W) event).n());
                } else if (event instanceof j.t6) {
                    j.t6 t6Var = (j.t6) event;
                    c2 = new n.iwV(t6Var.rl(), t6Var.n(), t6Var.nr(), t6Var.t());
                } else if (event instanceof j.U) {
                    j.U u2 = (j.U) event;
                    c2 = new n.M(u2.rl(), u2.n(), u2.t());
                } else if (event instanceof j.IE) {
                    j.IE ie = (j.IE) event;
                    c2 = new n.rv6(ie.rl(), ie.n(), ie.t());
                } else if (Intrinsics.areEqual(event, j.zpl.f8606n)) {
                    c0995n = n.vd.f69603O;
                } else if (Intrinsics.areEqual(event, j.ibE.f8517n)) {
                    c0995n = n.Lu.f69531O;
                } else if (event instanceof j.Sw) {
                    j.Sw sw = (j.Sw) event;
                    c2 = new n.h(sw.rl(), sw.n());
                } else if (event instanceof j.xq) {
                    j.xq xqVar = (j.xq) event;
                    c2 = new n.K(xqVar.n(), xqVar.rl());
                } else if (event instanceof j.rfW) {
                    c2 = new n.psW(((j.rfW) event).n());
                } else if (event instanceof j.xTb) {
                    c2 = new n.Md(((j.xTb) event).n());
                } else if (event instanceof j.rrk) {
                    j.rrk rrkVar = (j.rrk) event;
                    zs = new n.Zs(rrkVar.nr(), rrkVar.O(), rrkVar.t(), rrkVar.rl(), rrkVar.n());
                } else if (event instanceof j.m8h) {
                    c2 = new n.P(((j.m8h) event).n());
                } else if (event instanceof j.eh) {
                    c2 = new n.C2199m(((j.eh) event).n());
                } else if (Intrinsics.areEqual(event, j.Ji.f8411n)) {
                    c0995n = n.iF.f69585O;
                } else if (Intrinsics.areEqual(event, j.Su.f8452n)) {
                    c0995n = n.mz.f69592O;
                } else if (event instanceof j.iy) {
                    c2 = new n.yg(((j.iy) event).n());
                } else if (event instanceof j.J) {
                    j.J j2 = (j.J) event;
                    c2 = new n.pO(j2.rl(), j2.n());
                } else if (event instanceof j.Z5b) {
                    c2 = new n.Sis(((j.Z5b) event).n());
                } else if (event instanceof j.qfL) {
                    c2 = new n.l4Z(((j.qfL) event).n());
                } else {
                    zs = null;
                    String strTy = null;
                    if (event instanceof j.QUT) {
                        j.QUT qut = (j.QUT) event;
                        if (Intrinsics.areEqual(qut, QJ.f8356n)) {
                            c0995n = n.OU.j.C0989j.f69542O;
                        } else if (qut instanceof l3D) {
                            c2 = new n.OU.j.C0990n(((l3D) event).n());
                        } else if (Intrinsics.areEqual(qut, C1434c.f8366n)) {
                            c0995n = n.OU.j.w6.f69544O;
                        } else if (Intrinsics.areEqual(qut, s4.f8619n)) {
                            c0995n = n.OU.j.Ml.f69538O;
                        } else if (Intrinsics.areEqual(qut, UGc.f8358n)) {
                            c0995n = n.OU.j.I28.f69537O;
                        } else if (qut instanceof Q) {
                            c2 = new n.OU.j.Wre(com.alightcreative.app.motion.templates.Ml.ty(((Q) event).n()));
                        } else if (qut instanceof r) {
                            r rVar = (r) event;
                            c2 = new n.OU.j.CN3(rVar.n(), rVar.rl());
                        } else if (qut instanceof SPz) {
                            SPz sPz = (SPz) event;
                            c2 = new n.OU.j.fuX(com.alightcreative.app.motion.templates.Ml.ty(sPz.n()), sPz.rl());
                        } else if (qut instanceof ci) {
                            c2 = new n.OU.j.Dsr(((ci) event).n());
                        } else if (Intrinsics.areEqual(qut, g9s.f8370n)) {
                            c0995n = n.OU.j.aC.f69540O;
                        } else if (Intrinsics.areEqual(qut, afx.f8365n)) {
                            c0995n = n.OU.AbstractC0991n.j.f69552O;
                        } else if (Intrinsics.areEqual(qut, Z.f8361n)) {
                            c0995n = n.OU.AbstractC0991n.C0992n.f69553O;
                        } else if (Intrinsics.areEqual(qut, Ew.f8344n)) {
                            c0995n = n.OU.AbstractC0991n.w6.f69554O;
                        } else if (Intrinsics.areEqual(qut, nKK.f8611n)) {
                            c0995n = n.OU.AbstractC0991n.Ml.f69548O;
                        } else if (Intrinsics.areEqual(qut, DAz.f8342n)) {
                            c0995n = n.OU.AbstractC0991n.I28.f69547O;
                        } else if (Intrinsics.areEqual(qut, u.f8620n)) {
                            c0995n = n.OU.AbstractC0991n.Wre.f69549O;
                        } else if (Intrinsics.areEqual(qut, qf.f8614n)) {
                            c0995n = n.OU.AbstractC0991n.CN3.f69545O;
                        } else if (qut instanceof Ln) {
                            c2 = new n.OU.AbstractC0991n.fuX(com.alightcreative.app.motion.templates.Ml.ty(((Ln) event).n()));
                        } else if (Intrinsics.areEqual(qut, lej.f8608n)) {
                            c0995n = n.OU.AbstractC0991n.Dsr.f69546O;
                        } else if (Intrinsics.areEqual(qut, iwV.f8372n)) {
                            c0995n = n.OU.AbstractC0991n.aC.f69550O;
                        } else if (Intrinsics.areEqual(qut, M.f8350n)) {
                            c0995n = n.OU.w6.j.f69563O;
                        } else if (Intrinsics.areEqual(qut, rv6.f8618n)) {
                            c0995n = n.OU.w6.C0993n.f69564O;
                        } else if (Intrinsics.areEqual(qut, vd.f8621n)) {
                            c0995n = n.OU.w6.C0994w6.f69565O;
                        } else if (Intrinsics.areEqual(qut, Lu.f8349n)) {
                            c0995n = n.OU.w6.Ml.f69559O;
                        } else if (Intrinsics.areEqual(qut, h.f8371n)) {
                            c0995n = n.OU.w6.I28.f69558O;
                        } else if (qut instanceof K) {
                            K k2 = (K) event;
                            String strN = k2.n().n();
                            K.j jVarN = k2.n();
                            if (!Intrinsics.areEqual(jVarN, K.j.C0291j.rl)) {
                                if (!(jVarN instanceof K.j.n)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                strTy = com.alightcreative.app.motion.templates.Ml.ty(((K.j.n) k2.n()).rl());
                            }
                            c2 = new n.OU.w6.Wre(strN, strTy);
                        } else if (Intrinsics.areEqual(qut, psW.f8613n)) {
                            c0995n = n.OU.w6.CN3.f69556O;
                        } else if (Intrinsics.areEqual(qut, Md.f8351n)) {
                            c0995n = n.OU.w6.fuX.f69562O;
                        } else if (qut instanceof Zs) {
                            Zs zs2 = (Zs) event;
                            c2 = new n.OU.w6.Dsr(zs2.n(), zs2.rl());
                        } else if (qut instanceof P) {
                            c2 = new n.OU.w6.aC(((P) event).n());
                        } else {
                            if (!(qut instanceof C1449m)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c2 = new n.OU.w6.C(((C1449m) event).n());
                        }
                    }
                }
                c0995n = zs;
            }
            c0995n = c2;
        }
        if (c0995n != null) {
            Object obj = this.f69520n.get();
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            Wre.n((I28) obj, c0995n.rl(), c0995n.n());
        }
    }
}
