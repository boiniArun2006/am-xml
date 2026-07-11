package Vst;

import com.google.protobuf.RGN;
import java.util.Iterator;
import java.util.Map;
import pUk.C2331c;
import pUk.SPz;
import uB.C2398j;
import uB.eO;
import uB.s4;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final w6 f11351n = new w6();

    private void mUb(n nVar, int i2) {
        nVar.nr(i2);
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f11352n;

        static {
            int[] iArr = new int[s4.w6.values().length];
            f11352n = iArr;
            try {
                iArr[s4.w6.NULL_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11352n[s4.w6.BOOLEAN_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11352n[s4.w6.DOUBLE_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11352n[s4.w6.INTEGER_VALUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11352n[s4.w6.TIMESTAMP_VALUE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11352n[s4.w6.STRING_VALUE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11352n[s4.w6.BYTES_VALUE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11352n[s4.w6.REFERENCE_VALUE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11352n[s4.w6.GEO_POINT_VALUE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f11352n[s4.w6.MAP_VALUE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f11352n[s4.w6.ARRAY_VALUE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private void J2(s4 s4Var, n nVar) {
        switch (j.f11352n[s4Var.E2().ordinal()]) {
            case 1:
                mUb(nVar, 5);
                return;
            case 2:
                mUb(nVar, 10);
                nVar.nr(s4Var.XQ() ? 1L : 0L);
                return;
            case 3:
                double dAYN = s4Var.aYN();
                if (Double.isNaN(dAYN)) {
                    mUb(nVar, 13);
                    return;
                }
                mUb(nVar, 15);
                if (dAYN == -0.0d) {
                    nVar.rl(0.0d);
                    return;
                } else {
                    nVar.rl(dAYN);
                    return;
                }
            case 4:
                mUb(nVar, 15);
                nVar.rl(s4Var.nY());
                return;
            case 5:
                RGN rgnFD = s4Var.fD();
                mUb(nVar, 20);
                nVar.nr(rgnFD.getSeconds());
                nVar.nr(rgnFD.getNanos());
                return;
            case 6:
                nr(s4Var.iF(), nVar);
                KN(nVar);
                return;
            case 7:
                mUb(nVar, 30);
                nVar.n(s4Var.S());
                KN(nVar);
                return;
            case 8:
                rl(s4Var.te(), nVar);
                return;
            case 9:
                oFA.j jVarViF = s4Var.ViF();
                mUb(nVar, 45);
                nVar.rl(jVarViF.qie());
                nVar.rl(jVarViF.az());
                return;
            case 10:
                if (SPz.ViF(s4Var)) {
                    mUb(nVar, Integer.MAX_VALUE);
                    return;
                } else if (SPz.fD(s4Var)) {
                    Uo(s4Var.g(), nVar);
                    return;
                } else {
                    t(s4Var.g(), nVar);
                    KN(nVar);
                    return;
                }
            case 11:
                n(s4Var.Z(), nVar);
                KN(nVar);
                return;
            default:
                throw new IllegalArgumentException("unknown index value type " + s4Var.E2());
        }
    }

    private void KN(n nVar) {
        nVar.nr(2L);
    }

    private void n(C2398j c2398j, n nVar) {
        mUb(nVar, 50);
        Iterator it = c2398j.KN().iterator();
        while (it.hasNext()) {
            J2((s4) it.next(), nVar);
        }
    }

    private void nr(String str, n nVar) {
        mUb(nVar, 25);
        xMQ(str, nVar);
    }

    private void rl(String str, n nVar) {
        mUb(nVar, 37);
        C2331c c2331cO = C2331c.o(str);
        int iTy = c2331cO.ty();
        for (int i2 = 5; i2 < iTy; i2++) {
            String strMUb = c2331cO.mUb(i2);
            mUb(nVar, 60);
            xMQ(strMUb, nVar);
        }
    }

    private void t(eO eOVar, n nVar) {
        mUb(nVar, 55);
        for (Map.Entry entry : eOVar.qie().entrySet()) {
            String str = (String) entry.getKey();
            s4 s4Var = (s4) entry.getValue();
            nr(str, nVar);
            J2(s4Var, nVar);
        }
    }

    private w6() {
    }

    private void Uo(eO eOVar, n nVar) {
        Map mapQie = eOVar.qie();
        mUb(nVar, 53);
        int iIk = ((s4) mapQie.get("value")).Z().Ik();
        mUb(nVar, 15);
        nVar.nr(iIk);
        nr("value", nVar);
        J2((s4) mapQie.get("value"), nVar);
    }

    private void xMQ(String str, n nVar) {
        nVar.O(str);
    }

    public void O(s4 s4Var, n nVar) {
        J2(s4Var, nVar);
        nVar.t();
    }
}
