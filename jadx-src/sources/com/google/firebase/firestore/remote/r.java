package com.google.firebase.firestore.remote;

import BC.j;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.remote.Z;
import com.google.protobuf.RGN;
import gq.l4Z;
import gq.oJ;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import pUk.C2331c;
import uB.C;
import uB.C2391CN3;
import uB.C2392Dsr;
import uB.C2393I28;
import uB.C2395Wre;
import uB.C2396c;
import uB.C2397fuX;
import uB.C2398j;
import uB.QJ;
import uB.UGc;
import uB.Xo;
import uB.l3D;
import uB.z;
import uh.AbstractC2405z;
import uh.C;
import uh.Ln;
import uh.eO;
import uh.qf;
import uh.vd;
import wk.C2417j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class r {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final pUk.Wre f60456n;
    private final String rl;

    static /* synthetic */ class j {
        static final /* synthetic */ int[] J2;
        static final /* synthetic */ int[] KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        static final /* synthetic */ int[] f60457O;
        static final /* synthetic */ int[] Uo;
        static final /* synthetic */ int[] az;
        static final /* synthetic */ int[] gh;
        static final /* synthetic */ int[] mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f60458n;
        static final /* synthetic */ int[] nr;
        static final /* synthetic */ int[] qie;
        static final /* synthetic */ int[] rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        static final /* synthetic */ int[] f60459t;
        static final /* synthetic */ int[] xMQ;

        static {
            int[] iArr = new int[Xo.w6.values().length];
            az = iArr;
            try {
                iArr[Xo.w6.TARGET_CHANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                az[Xo.w6.DOCUMENT_CHANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                az[Xo.w6.DOCUMENT_DELETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                az[Xo.w6.DOCUMENT_REMOVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                az[Xo.w6.FILTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                az[Xo.w6.RESPONSETYPE_NOT_SET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[C2396c.w6.values().length];
            qie = iArr2;
            try {
                iArr2[C2396c.w6.f74230t.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                qie[C2396c.w6.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                qie[C2396c.w6.REMOVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                qie[C2396c.w6.CURRENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                qie[C2396c.w6.RESET.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                qie[C2396c.w6.UNRECOGNIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            int[] iArr3 = new int[QJ.I28.values().length];
            gh = iArr3;
            try {
                iArr3[QJ.I28.ASCENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                gh[QJ.I28.DESCENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            int[] iArr4 = new int[QJ.Wre.n.values().length];
            mUb = iArr4;
            try {
                iArr4[QJ.Wre.n.LESS_THAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                mUb[QJ.Wre.n.LESS_THAN_OR_EQUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                mUb[QJ.Wre.n.EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                mUb[QJ.Wre.n.NOT_EQUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                mUb[QJ.Wre.n.GREATER_THAN_OR_EQUAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                mUb[QJ.Wre.n.GREATER_THAN.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                mUb[QJ.Wre.n.ARRAY_CONTAINS.ordinal()] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                mUb[QJ.Wre.n.IN.ordinal()] = 8;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                mUb[QJ.Wre.n.ARRAY_CONTAINS_ANY.ordinal()] = 9;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                mUb[QJ.Wre.n.NOT_IN.ordinal()] = 10;
            } catch (NoSuchFieldError unused24) {
            }
            int[] iArr5 = new int[eO.n.values().length];
            xMQ = iArr5;
            try {
                iArr5[eO.n.LESS_THAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                xMQ[eO.n.LESS_THAN_OR_EQUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                xMQ[eO.n.EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                xMQ[eO.n.NOT_EQUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                xMQ[eO.n.GREATER_THAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                xMQ[eO.n.GREATER_THAN_OR_EQUAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                xMQ[eO.n.ARRAY_CONTAINS.ordinal()] = 7;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                xMQ[eO.n.IN.ordinal()] = 8;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                xMQ[eO.n.ARRAY_CONTAINS_ANY.ordinal()] = 9;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                xMQ[eO.n.NOT_IN.ordinal()] = 10;
            } catch (NoSuchFieldError unused34) {
            }
            int[] iArr6 = new int[QJ.C.n.values().length];
            KN = iArr6;
            try {
                iArr6[QJ.C.n.IS_NAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                KN[QJ.C.n.IS_NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                KN[QJ.C.n.IS_NOT_NAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                KN[QJ.C.n.IS_NOT_NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused38) {
            }
            int[] iArr7 = new int[QJ.fuX.n.values().length];
            Uo = iArr7;
            try {
                iArr7[QJ.fuX.n.COMPOSITE_FILTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                Uo[QJ.fuX.n.FIELD_FILTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                Uo[QJ.fuX.n.UNARY_FILTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused41) {
            }
            int[] iArr8 = new int[QJ.Ml.n.values().length];
            J2 = iArr8;
            try {
                iArr8[QJ.Ml.n.AND.ordinal()] = 1;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                J2[QJ.Ml.n.OR.ordinal()] = 2;
            } catch (NoSuchFieldError unused43) {
            }
            int[] iArr9 = new int[C.j.values().length];
            f60457O = iArr9;
            try {
                iArr9[C.j.AND.ordinal()] = 1;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f60457O[C.j.OR.ordinal()] = 2;
            } catch (NoSuchFieldError unused45) {
            }
            int[] iArr10 = new int[l4Z.values().length];
            nr = iArr10;
            try {
                iArr10[l4Z.LISTEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                nr[l4Z.EXISTENCE_FILTER_MISMATCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                nr[l4Z.EXISTENCE_FILTER_MISMATCH_BLOOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                nr[l4Z.LIMBO_RESOLUTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused49) {
            }
            int[] iArr11 = new int[C.w6.EnumC1216w6.values().length];
            f60459t = iArr11;
            try {
                iArr11[C.w6.EnumC1216w6.SET_TO_SERVER_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f60459t[C.w6.EnumC1216w6.APPEND_MISSING_ELEMENTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f60459t[C.w6.EnumC1216w6.REMOVE_ALL_FROM_ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f60459t[C.w6.EnumC1216w6.INCREMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused53) {
            }
            int[] iArr12 = new int[z.w6.values().length];
            rl = iArr12;
            try {
                iArr12[z.w6.UPDATE_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                rl[z.w6.EXISTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                rl[z.w6.CONDITIONTYPE_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused56) {
            }
            int[] iArr13 = new int[UGc.w6.values().length];
            f60458n = iArr13;
            try {
                iArr13[UGc.w6.UPDATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f60458n[UGc.w6.DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                f60458n[UGc.w6.VERIFY.ordinal()] = 3;
            } catch (NoSuchFieldError unused59) {
            }
        }
    }

    private BC.qz HI(uB.z zVar) {
        int i2 = j.rl[zVar.gh().ordinal()];
        if (i2 == 1) {
            return BC.qz.J2(S(zVar.ty()));
        }
        if (i2 == 2) {
            return BC.qz.n(zVar.az());
        }
        if (i2 == 3) {
            return BC.qz.f406t;
        }
        throw wqP.n.n("Unknown precondition", new Object[0]);
    }

    private BC.I28 KN(C.w6 w6Var) {
        int i2 = j.f60459t[w6Var.o().ordinal()];
        if (i2 == 1) {
            wqP.n.t(w6Var.r() == C.w6.n.REQUEST_TIME, "Unknown transform setToServerValue: %s", w6Var.r());
            return new BC.I28(pUk.z.o(w6Var.HI()), BC.Pl.t());
        }
        if (i2 == 2) {
            return new BC.I28(pUk.z.o(w6Var.HI()), new j.n(w6Var.ty().KN()));
        }
        if (i2 == 3) {
            return new BC.I28(pUk.z.o(w6Var.HI()), new j.C0010j(w6Var.Ik().KN()));
        }
        if (i2 == 4) {
            return new BC.I28(pUk.z.o(w6Var.HI()), new BC.aC(w6Var.ck()));
        }
        throw wqP.n.n("Unknown FieldTransform proto: %s", w6Var);
    }

    private QJ.fuX T(List list) {
        return X(new uh.C(list, C.j.AND));
    }

    private eO.n Uo(QJ.Wre.n nVar) {
        switch (j.mUb[nVar.ordinal()]) {
            case 1:
                return eO.n.LESS_THAN;
            case 2:
                return eO.n.LESS_THAN_OR_EQUAL;
            case 3:
                return eO.n.EQUAL;
            case 4:
                return eO.n.NOT_EQUAL;
            case 5:
                return eO.n.GREATER_THAN_OR_EQUAL;
            case 6:
                return eO.n.GREATER_THAN;
            case 7:
                return eO.n.ARRAY_CONTAINS;
            case 8:
                return eO.n.IN;
            case 9:
                return eO.n.ARRAY_CONTAINS_ANY;
            case 10:
                return eO.n.NOT_IN;
            default:
                throw wqP.n.n("Unhandled FieldFilter.operator %d", nVar);
        }
    }

    private String bzg(C2331c c2331c) {
        return jB(this.f60456n, c2331c);
    }

    private QJ.Wre.n fD(eO.n nVar) {
        switch (j.xMQ[nVar.ordinal()]) {
            case 1:
                return QJ.Wre.n.LESS_THAN;
            case 2:
                return QJ.Wre.n.LESS_THAN_OR_EQUAL;
            case 3:
                return QJ.Wre.n.EQUAL;
            case 4:
                return QJ.Wre.n.NOT_EQUAL;
            case 5:
                return QJ.Wre.n.GREATER_THAN;
            case 6:
                return QJ.Wre.n.GREATER_THAN_OR_EQUAL;
            case 7:
                return QJ.Wre.n.ARRAY_CONTAINS;
            case 8:
                return QJ.Wre.n.IN;
            case 9:
                return QJ.Wre.n.ARRAY_CONTAINS_ANY;
            case 10:
                return QJ.Wre.n.NOT_IN;
            default:
                throw wqP.n.n("Unknown operator %d", nVar);
        }
    }

    private String nHg(l4Z l4z) {
        int i2 = j.nr[l4z.ordinal()];
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return "existence-filter-mismatch";
        }
        if (i2 == 3) {
            return "existence-filter-mismatch-bloom";
        }
        if (i2 == 4) {
            return "limbo-document";
        }
        throw wqP.n.n("Unrecognized query purpose: %s", l4z);
    }

    public String N(pUk.C c2) {
        return jB(this.f60456n, c2.qie());
    }

    QJ.fuX ViF(uh.C c2) {
        ArrayList arrayList = new ArrayList(c2.rl().size());
        Iterator it = c2.rl().iterator();
        while (it.hasNext()) {
            arrayList.add(X((AbstractC2405z) it.next()));
        }
        if (arrayList.size() == 1) {
            return (QJ.fuX) arrayList.get(0);
        }
        QJ.Ml.j jVarCk = QJ.Ml.ck();
        jVarCk.mUb(nY(c2.O()));
        jVarCk.xMQ(arrayList);
        return (QJ.fuX) QJ.fuX.Ik().xMQ(jVarCk).build();
    }

    QJ.fuX X(AbstractC2405z abstractC2405z) {
        if (abstractC2405z instanceof uh.eO) {
            return M7((uh.eO) abstractC2405z);
        }
        if (abstractC2405z instanceof uh.C) {
            return ViF((uh.C) abstractC2405z);
        }
        throw wqP.n.n("Unrecognized filter type %s", abstractC2405z.toString());
    }

    public Timestamp Z(RGN rgn) {
        return new Timestamp(rgn.getSeconds(), rgn.getNanos());
    }

    public Z aYN(uB.Xo xo) {
        Z.I28 i28;
        int i2 = j.az[xo.ty().ordinal()];
        io.grpc.SPz sPzM = null;
        if (i2 == 1) {
            C2396c c2396cHI = xo.HI();
            int i3 = j.qie[c2396cHI.az().ordinal()];
            if (i3 == 1) {
                i28 = Z.I28.NoChange;
            } else if (i3 == 2) {
                i28 = Z.I28.Added;
            } else if (i3 == 3) {
                i28 = Z.I28.Removed;
                sPzM = M(c2396cHI.xMQ());
            } else if (i3 == 4) {
                i28 = Z.I28.Current;
            } else {
                if (i3 != 5) {
                    throw new IllegalArgumentException("Unknown target change type");
                }
                i28 = Z.I28.Reset;
            }
            return new Z.Ml(i28, c2396cHI.HI(), c2396cHI.qie(), sPzM);
        }
        if (i2 == 2) {
            C2391CN3 c2391cn3MUb = xo.mUb();
            List listQie = c2391cn3MUb.qie();
            List listGh = c2391cn3MUb.gh();
            pUk.C cGh = gh(c2391cn3MUb.mUb().HI());
            pUk.UGc uGcS = S(c2391cn3MUb.mUb().ck());
            wqP.n.t(!uGcS.equals(pUk.UGc.f72007t), "Got a document change without an update time", new Object[0]);
            pUk.QJ qjHI = pUk.QJ.HI(cGh, uGcS, pUk.l3D.J2(c2391cn3MUb.mUb().az()));
            return new Z.n(listQie, listGh, qjHI.getKey(), qjHI);
        }
        if (i2 == 3) {
            C2397fuX c2397fuXGh = xo.gh();
            List listQie2 = c2397fuXGh.qie();
            pUk.QJ qjIk = pUk.QJ.Ik(gh(c2397fuXGh.mUb()), S(c2397fuXGh.gh()));
            return new Z.n(Collections.EMPTY_LIST, listQie2, qjIk.getKey(), qjIk);
        }
        if (i2 == 4) {
            uB.aC aCVarQie = xo.qie();
            return new Z.n(Collections.EMPTY_LIST, aCVarQie.gh(), gh(aCVarQie.mUb()), null);
        }
        if (i2 != 5) {
            throw new IllegalArgumentException("Unknown change type set");
        }
        uB.o oVarAz = xo.az();
        return new Z.w6(oVarAz.gh(), new Pe.j(oVarAz.xMQ(), oVarAz.qie()));
    }

    public String n() {
        return this.rl;
    }

    QJ.Ml.n nY(C.j jVar) {
        int i2 = j.f60457O[jVar.ordinal()];
        if (i2 == 1) {
            return QJ.Ml.n.AND;
        }
        if (i2 == 2) {
            return QJ.Ml.n.OR;
        }
        throw wqP.n.n("Unrecognized composite filter type.", new Object[0]);
    }

    uh.C rl(QJ.Ml ml) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ml.ty().iterator();
        while (it.hasNext()) {
            arrayList.add(xMQ((QJ.fuX) it.next()));
        }
        return new uh.C(arrayList, t(ml.HI()));
    }

    C.j t(QJ.Ml.n nVar) {
        int i2 = j.J2[nVar.ordinal()];
        if (i2 == 1) {
            return C.j.AND;
        }
        if (i2 == 2) {
            return C.j.OR;
        }
        throw wqP.n.n("Only AND and OR composite filter types are supported.", new Object[0]);
    }

    AbstractC2405z xMQ(QJ.fuX fux) {
        int i2 = j.Uo[fux.HI().ordinal()];
        if (i2 == 1) {
            return rl(fux.qie());
        }
        if (i2 == 2) {
            return J2(fux.ty());
        }
        if (i2 == 3) {
            return XQ(fux.ck());
        }
        throw wqP.n.n("Unrecognized Filter.filterType %d", fux.HI());
    }

    public r(pUk.Wre wre) {
        this.f60456n = wre;
        this.rl = eF(wre).t();
    }

    private static C2331c E(C2331c c2331c) {
        boolean z2;
        if (c2331c.ty() > 4 && c2331c.mUb(4).equals("documents")) {
            z2 = true;
        } else {
            z2 = false;
        }
        wqP.n.t(z2, "Tried to deserialize invalid key %s", c2331c);
        return (C2331c) c2331c.HI(5);
    }

    private QJ.CN3 E2(pUk.z zVar) {
        return (QJ.CN3) QJ.CN3.qie().xMQ(zVar.t()).build();
    }

    private static boolean FX(C2331c c2331c) {
        if (c2331c.ty() < 4 || !c2331c.mUb(0).equals("projects") || !c2331c.mUb(2).equals("databases")) {
            return false;
        }
        return true;
    }

    private io.grpc.SPz M(C2417j c2417j) {
        return io.grpc.SPz.KN(c2417j.xMQ()).Ik(c2417j.getMessage());
    }

    private AbstractC2405z XQ(QJ.C c2) {
        pUk.z zVarO = pUk.z.o(c2.qie().gh());
        int i2 = j.KN[c2.az().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        return uh.eO.O(zVarO, eO.n.NOT_EQUAL, pUk.SPz.rl);
                    }
                    throw wqP.n.n("Unrecognized UnaryFilter.operator %d", c2.az());
                }
                return uh.eO.O(zVarO, eO.n.NOT_EQUAL, pUk.SPz.f72004n);
            }
            return uh.eO.O(zVarO, eO.n.EQUAL, pUk.SPz.rl);
        }
        return uh.eO.O(zVarO, eO.n.EQUAL, pUk.SPz.f72004n);
    }

    private C2331c ck(String str) {
        C2331c c2331cO = o(str);
        if (c2331cO.ty() == 4) {
            return C2331c.f72012t;
        }
        return E(c2331cO);
    }

    private C.w6 e(BC.I28 i28) {
        BC.eO eOVarRl = i28.rl();
        if (eOVarRl instanceof BC.Pl) {
            return (C.w6) C.w6.Z().mUb(i28.n().t()).az(C.w6.n.REQUEST_TIME).build();
        }
        if (eOVarRl instanceof j.n) {
            return (C.w6) C.w6.Z().mUb(i28.n().t()).xMQ(C2398j.r().xMQ(((j.n) eOVarRl).O())).build();
        }
        if (eOVarRl instanceof j.C0010j) {
            return (C.w6) C.w6.Z().mUb(i28.n().t()).qie(C2398j.r().xMQ(((j.C0010j) eOVarRl).O())).build();
        }
        if (eOVarRl instanceof BC.aC) {
            return (C.w6) C.w6.Z().mUb(i28.n().t()).gh(((BC.aC) eOVarRl).nr()).build();
        }
        throw wqP.n.n("Unknown transform: %s", eOVarRl);
    }

    private static C2331c eF(pUk.Wre wre) {
        return C2331c.r(Arrays.asList("projects", wre.J2(), "databases", wre.nr()));
    }

    private String jB(pUk.Wre wre, C2331c c2331c) {
        return ((C2331c) ((C2331c) eF(wre).n("documents")).rl(c2331c)).t();
    }

    private List mUb(QJ.fuX fux) {
        AbstractC2405z abstractC2405zXMQ = xMQ(fux);
        if (abstractC2405zXMQ instanceof uh.C) {
            uh.C c2 = (uh.C) abstractC2405zXMQ;
            if (c2.xMQ()) {
                return c2.rl();
            }
        }
        return Collections.singletonList(abstractC2405zXMQ);
    }

    private BC.Ml nr(C2392Dsr c2392Dsr) {
        int iTy = c2392Dsr.ty();
        HashSet hashSet = new HashSet(iTy);
        for (int i2 = 0; i2 < iTy; i2++) {
            hashSet.add(pUk.z.o(c2392Dsr.az(i2)));
        }
        return BC.Ml.n(hashSet);
    }

    private C2331c o(String str) {
        C2331c c2331cO = C2331c.o(str);
        wqP.n.t(FX(c2331cO), "Tried to deserialize invalid key %s", c2331cO);
        return c2331cO;
    }

    private uB.z rV9(BC.qz qzVar) {
        wqP.n.t(!qzVar.nr(), "Can't serialize an empty precondition", new Object[0]);
        z.n nVarHI = uB.z.HI();
        if (qzVar.t() != null) {
            return (uB.z) nVarHI.mUb(p5(qzVar.t())).build();
        }
        if (qzVar.rl() != null) {
            return (uB.z) nVarHI.xMQ(qzVar.rl().booleanValue()).build();
        }
        throw wqP.n.n("Unknown Precondition", new Object[0]);
    }

    private C2392Dsr te(BC.Ml ml) {
        C2392Dsr.n nVarHI = C2392Dsr.HI();
        Iterator it = ml.rl().iterator();
        while (it.hasNext()) {
            nVarHI.xMQ(((pUk.z) it.next()).t());
        }
        return (C2392Dsr) nVarHI.build();
    }

    private qf ty(QJ.Dsr dsr) {
        qf.j jVar;
        pUk.z zVarO = pUk.z.o(dsr.qie().gh());
        int i2 = j.gh[dsr.gh().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                jVar = qf.j.DESCENDING;
            } else {
                throw wqP.n.n("Unrecognized direction %d", dsr.gh());
            }
        } else {
            jVar = qf.j.ASCENDING;
        }
        return qf.nr(jVar, zVarO);
    }

    private QJ.Dsr v(qf qfVar) {
        QJ.Dsr.j jVarAz = QJ.Dsr.az();
        if (qfVar.rl().equals(qf.j.ASCENDING)) {
            jVarAz.xMQ(QJ.I28.ASCENDING);
        } else {
            jVarAz.xMQ(QJ.I28.DESCENDING);
        }
        jVarAz.mUb(E2(qfVar.t()));
        return (QJ.Dsr) jVarAz.build();
    }

    public vd Ik(String str, uB.QJ qj) {
        C2331c c2331c;
        String strQie;
        List listMUb;
        List arrayList;
        long value;
        uh.Dsr dsr;
        boolean z2;
        C2331c c2331cCk = ck(str);
        int iS = qj.S();
        uh.Dsr dsr2 = null;
        if (iS > 0) {
            if (iS == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            wqP.n.t(z2, "StructuredQuery.from with more than one collection is not supported.", new Object[0]);
            QJ.w6 w6VarXQ = qj.XQ(0);
            if (w6VarXQ.gh()) {
                c2331c = c2331cCk;
                strQie = w6VarXQ.qie();
            } else {
                c2331cCk = (C2331c) c2331cCk.n(w6VarXQ.qie());
                c2331c = c2331cCk;
                strQie = null;
            }
        } else {
            c2331c = c2331cCk;
            strQie = null;
        }
        if (qj.E2()) {
            listMUb = mUb(qj.g());
        } else {
            listMUb = Collections.EMPTY_LIST;
        }
        List list = listMUb;
        int iViF = qj.ViF();
        if (iViF > 0) {
            arrayList = new ArrayList(iViF);
            for (int i2 = 0; i2 < iViF; i2++) {
                arrayList.add(ty(qj.aYN(i2)));
            }
        } else {
            arrayList = Collections.EMPTY_LIST;
        }
        List list2 = arrayList;
        if (qj.iF()) {
            value = qj.WPU().getValue();
        } else {
            value = -1;
        }
        long j2 = value;
        if (qj.fD()) {
            dsr = new uh.Dsr(qj.nY().KN(), qj.nY().az());
        } else {
            dsr = null;
        }
        if (qj.te()) {
            dsr2 = new uh.Dsr(qj.Z().KN(), !qj.Z().az());
        }
        return new vd(c2331c, strQie, list, list2, j2, dsr, dsr2);
    }

    uh.eO J2(QJ.Wre wre) {
        return uh.eO.O(pUk.z.o(wre.az().gh()), Uo(wre.ty()), wre.HI());
    }

    QJ.fuX M7(uh.eO eOVar) {
        QJ.C.n nVar;
        QJ.C.n nVar2;
        eO.n nVarUo = eOVar.Uo();
        eO.n nVar3 = eO.n.EQUAL;
        if (nVarUo == nVar3 || eOVar.Uo() == eO.n.NOT_EQUAL) {
            QJ.C.j jVarTy = QJ.C.ty();
            jVarTy.xMQ(E2(eOVar.J2()));
            if (pUk.SPz.nY(eOVar.KN())) {
                if (eOVar.Uo() == nVar3) {
                    nVar2 = QJ.C.n.IS_NAN;
                } else {
                    nVar2 = QJ.C.n.IS_NOT_NAN;
                }
                jVarTy.mUb(nVar2);
                return (QJ.fuX) QJ.fuX.Ik().gh(jVarTy).build();
            }
            if (pUk.SPz.g(eOVar.KN())) {
                if (eOVar.Uo() == nVar3) {
                    nVar = QJ.C.n.IS_NULL;
                } else {
                    nVar = QJ.C.n.IS_NOT_NULL;
                }
                jVarTy.mUb(nVar);
                return (QJ.fuX) QJ.fuX.Ik().gh(jVarTy).build();
            }
        }
        QJ.Wre.j jVarCk = QJ.Wre.ck();
        jVarCk.xMQ(E2(eOVar.J2()));
        jVarCk.mUb(fD(eOVar.Uo()));
        jVarCk.gh(eOVar.KN());
        return (QJ.fuX) QJ.fuX.Ik().mUb(jVarCk).build();
    }

    public vd O(l3D.w6 w6Var) {
        int iTy = w6Var.ty();
        boolean z2 = true;
        if (iTy != 1) {
            z2 = false;
        }
        wqP.n.t(z2, "DocumentsTarget contained other than 1 document %d", Integer.valueOf(iTy));
        return Ln.rl(ck(w6Var.az(0))).aYN();
    }

    public RGN P5(Timestamp timestamp) {
        RGN.n nVarNewBuilder = RGN.newBuilder();
        nVarNewBuilder.setSeconds(timestamp.getSeconds());
        nVarNewBuilder.setNanos(timestamp.getNanoseconds());
        return (RGN) nVarNewBuilder.build();
    }

    public pUk.UGc S(RGN rgn) {
        if (rgn.getSeconds() == 0 && rgn.getNanos() == 0) {
            return pUk.UGc.f72007t;
        }
        return new pUk.UGc(Z(rgn));
    }

    public uB.l3D U(oJ oJVar) {
        l3D.n nVarHI = uB.l3D.HI();
        vd vdVarUo = oJVar.Uo();
        if (vdVarUo.o()) {
            nVarHI.xMQ(iF(vdVarUo));
        } else {
            nVarHI.gh(Xw(vdVarUo));
        }
        nVarHI.ty(oJVar.KN());
        if (oJVar.nr().isEmpty() && oJVar.J2().compareTo(pUk.UGc.f72007t) > 0) {
            nVarHI.qie(P5(oJVar.J2().rl()));
        } else {
            nVarHI.az(oJVar.nr());
        }
        if (oJVar.n() != null && (!oJVar.nr().isEmpty() || oJVar.J2().compareTo(pUk.UGc.f72007t) > 0)) {
            nVarHI.mUb(com.google.protobuf.afx.newBuilder().setValue(oJVar.n().intValue()));
        }
        return (uB.l3D) nVarHI.build();
    }

    public pUk.UGc WPU(uB.Xo xo) {
        if (xo.ty() != Xo.w6.TARGET_CHANGE) {
            return pUk.UGc.f72007t;
        }
        if (xo.HI().ty() != 0) {
            return pUk.UGc.f72007t;
        }
        return S(xo.HI().gh());
    }

    public l3D.Ml Xw(vd vdVar) {
        boolean z2;
        boolean z3;
        l3D.Ml.j jVarTy = l3D.Ml.ty();
        QJ.n nVarE = uB.QJ.e();
        C2331c c2331cTy = vdVar.ty();
        if (vdVar.nr() != null) {
            if (c2331cTy.ty() % 2 == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            wqP.n.t(z3, "Collection Group queries should be within a document path or root.", new Object[0]);
            jVarTy.xMQ(bzg(c2331cTy));
            QJ.w6.j jVarAz = QJ.w6.az();
            jVarAz.mUb(vdVar.nr());
            jVarAz.xMQ(true);
            nVarE.xMQ(jVarAz);
        } else {
            if (c2331cTy.ty() % 2 != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            wqP.n.t(z2, "Document queries with filters are not supported.", new Object[0]);
            jVarTy.xMQ(bzg((C2331c) c2331cTy.ck()));
            QJ.w6.j jVarAz2 = QJ.w6.az();
            jVarAz2.mUb(c2331cTy.xMQ());
            nVarE.xMQ(jVarAz2);
        }
        if (vdVar.KN().size() > 0) {
            nVarE.ty(T(vdVar.KN()));
        }
        Iterator it = vdVar.az().iterator();
        while (it.hasNext()) {
            nVarE.mUb(v((qf) it.next()));
        }
        if (vdVar.r()) {
            nVarE.qie(com.google.protobuf.afx.newBuilder().setValue((int) vdVar.mUb()));
        }
        if (vdVar.ck() != null) {
            C2393I28.n nVarHI = C2393I28.HI();
            nVarHI.xMQ(vdVar.ck().rl());
            nVarHI.mUb(vdVar.ck().t());
            nVarE.az(nVarHI);
        }
        if (vdVar.J2() != null) {
            C2393I28.n nVarHI2 = C2393I28.HI();
            nVarHI2.xMQ(vdVar.J2().rl());
            nVarHI2.mUb(!vdVar.J2().t());
            nVarE.gh(nVarHI2);
        }
        jVarTy.mUb(nVarE);
        return (l3D.Ml) jVarTy.build();
    }

    public BC.Dsr az(uB.SPz sPz, pUk.UGc uGc) {
        pUk.UGc uGcS = S(sPz.gh());
        if (!pUk.UGc.f72007t.equals(uGcS)) {
            uGc = uGcS;
        }
        int iMUb = sPz.mUb();
        ArrayList arrayList = new ArrayList(iMUb);
        for (int i2 = 0; i2 < iMUb; i2++) {
            arrayList.add(sPz.xMQ(i2));
        }
        return new BC.Dsr(uGc, arrayList);
    }

    public C2395Wre g(pUk.C c2, pUk.l3D l3d) {
        C2395Wre.n nVarO = C2395Wre.o();
        nVarO.mUb(N(c2));
        nVarO.xMQ(l3d.xMQ());
        return (C2395Wre) nVarO.build();
    }

    public pUk.C gh(String str) {
        C2331c c2331cO = o(str);
        wqP.n.t(c2331cO.mUb(1).equals(this.f60456n.J2()), "Tried to deserialize key from different project.", new Object[0]);
        wqP.n.t(c2331cO.mUb(3).equals(this.f60456n.nr()), "Tried to deserialize key from different database.", new Object[0]);
        return pUk.C.Uo(E(c2331cO));
    }

    public l3D.w6 iF(vd vdVar) {
        l3D.w6.j jVarHI = l3D.w6.HI();
        jVarHI.xMQ(bzg(vdVar.ty()));
        return (l3D.w6) jVarHI.build();
    }

    public RGN p5(pUk.UGc uGc) {
        return P5(uGc.rl());
    }

    public BC.Wre qie(uB.UGc uGc) {
        BC.qz qzVarHI;
        if (uGc.ViF()) {
            qzVarHI = HI(uGc.Ik());
        } else {
            qzVarHI = BC.qz.f406t;
        }
        BC.qz qzVar = qzVarHI;
        ArrayList arrayList = new ArrayList();
        Iterator it = uGc.WPU().iterator();
        while (it.hasNext()) {
            arrayList.add(KN((C.w6) it.next()));
        }
        int i2 = j.f60458n[uGc.o().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    return new BC.z(gh(uGc.aYN()), qzVar);
                }
                throw wqP.n.n("Unknown mutation operation: %d", uGc.o());
            }
            return new BC.w6(gh(uGc.r()), qzVar);
        }
        if (uGc.te()) {
            return new BC.o(gh(uGc.XQ().HI()), pUk.l3D.J2(uGc.XQ().az()), nr(uGc.S()), qzVar, arrayList);
        }
        return new BC.Xo(gh(uGc.XQ().HI()), pUk.l3D.J2(uGc.XQ().az()), qzVar, arrayList);
    }

    public vd r(l3D.Ml ml) {
        return Ik(ml.qie(), ml.az());
    }

    public Map s7N(oJ oJVar) {
        String strNHg = nHg(oJVar.t());
        if (strNHg == null) {
            return null;
        }
        HashMap map = new HashMap(1);
        map.put("goog-listen-tags", strNHg);
        return map;
    }

    public uB.UGc wTp(BC.Wre wre) {
        UGc.n nVarIF = uB.UGc.iF();
        if (wre instanceof BC.Xo) {
            nVarIF.qie(g(wre.J2(), ((BC.Xo) wre).ty()));
        } else if (wre instanceof BC.o) {
            nVarIF.qie(g(wre.J2(), ((BC.o) wre).ck()));
            nVarIF.az(te(wre.nr()));
        } else if (wre instanceof BC.w6) {
            nVarIF.gh(N(wre.J2()));
        } else if (wre instanceof BC.z) {
            nVarIF.ty(N(wre.J2()));
        } else {
            throw wqP.n.n("unknown mutation type %s", wre.getClass());
        }
        Iterator it = wre.O().iterator();
        while (it.hasNext()) {
            nVarIF.xMQ(e((BC.I28) it.next()));
        }
        if (!wre.Uo().nr()) {
            nVarIF.mUb(rV9(wre.Uo()));
        }
        return (uB.UGc) nVarIF.build();
    }
}
