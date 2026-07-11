package c;

import Rc.w6;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Collections;

/* JADX INFO: renamed from: c.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class AbstractC1673n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final w6.j f43436n = w6.j.n(CmcdData.STREAMING_FORMAT_SS, CmcdData.OBJECT_TYPE_AUDIO_ONLY);
    private static final w6.j rl = w6.j.n(CmcdData.STREAMING_FORMAT_SS, "e", "o", "r");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final w6.j f43437t = w6.j.n("fc", "sc", "sw", "t", "o");

    public static GO.C n(Rc.w6 w6Var, FQq.Dsr dsr) {
        w6Var.Uo();
        GO.qz qzVarT = null;
        GO.o oVarRl = null;
        while (w6Var.jB()) {
            int iMx = w6Var.Mx(f43436n);
            if (iMx != 0) {
                if (iMx != 1) {
                    w6Var.fcU();
                    w6Var.n1();
                } else {
                    qzVarT = t(w6Var, dsr);
                }
            } else {
                oVarRl = rl(w6Var, dsr);
            }
        }
        w6Var.T();
        return new GO.C(qzVarT, oVarRl);
    }

    private static GO.o rl(Rc.w6 w6Var, FQq.Dsr dsr) {
        w6Var.Uo();
        GO.Ml ml = null;
        GO.Ml mlKN = null;
        GO.Ml mlKN2 = null;
        QJ.s4 s4Var = null;
        while (w6Var.jB()) {
            int iMx = w6Var.Mx(rl);
            if (iMx != 0) {
                if (iMx != 1) {
                    if (iMx != 2) {
                        if (iMx != 3) {
                            w6Var.fcU();
                            w6Var.n1();
                        } else {
                            int iP5 = w6Var.p5();
                            if (iP5 != 1 && iP5 != 2) {
                                dsr.n("Unsupported text range units: " + iP5);
                                s4Var = QJ.s4.INDEX;
                            } else if (iP5 == 1) {
                                s4Var = QJ.s4.PERCENT;
                            } else {
                                s4Var = QJ.s4.INDEX;
                            }
                        }
                    } else {
                        mlKN2 = AbstractC1669Ml.KN(w6Var, dsr);
                    }
                } else {
                    mlKN = AbstractC1669Ml.KN(w6Var, dsr);
                }
            } else {
                ml = AbstractC1669Ml.KN(w6Var, dsr);
            }
        }
        w6Var.T();
        if (ml == null && mlKN != null) {
            ml = new GO.Ml(Collections.singletonList(new Ect.j(0)));
        }
        return new GO.o(ml, mlKN, mlKN2, s4Var);
    }

    private static GO.qz t(Rc.w6 w6Var, FQq.Dsr dsr) {
        w6Var.Uo();
        GO.j jVarT = null;
        GO.j jVarT2 = null;
        GO.n nVarO = null;
        GO.n nVarO2 = null;
        GO.Ml mlKN = null;
        while (w6Var.jB()) {
            int iMx = w6Var.Mx(f43437t);
            if (iMx != 0) {
                if (iMx != 1) {
                    if (iMx != 2) {
                        if (iMx != 3) {
                            if (iMx != 4) {
                                w6Var.fcU();
                                w6Var.n1();
                            } else {
                                mlKN = AbstractC1669Ml.KN(w6Var, dsr);
                            }
                        } else {
                            nVarO2 = AbstractC1669Ml.O(w6Var, dsr);
                        }
                    } else {
                        nVarO = AbstractC1669Ml.O(w6Var, dsr);
                    }
                } else {
                    jVarT2 = AbstractC1669Ml.t(w6Var, dsr);
                }
            } else {
                jVarT = AbstractC1669Ml.t(w6Var, dsr);
            }
        }
        w6Var.T();
        return new GO.qz(jVarT, jVarT2, nVarO, nVarO2, mlKN);
    }
}
