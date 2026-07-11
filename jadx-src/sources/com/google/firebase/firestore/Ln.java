package com.google.firebase.firestore;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.fuX;
import com.google.protobuf.RGN;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import uB.C2398j;
import uB.s4;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class Ln {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final FirebaseFirestore f60328n;
    private final fuX.j rl;

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f60329n;

        static {
            int[] iArr = new int[fuX.j.values().length];
            f60329n = iArr;
            try {
                iArr[fuX.j.PREVIOUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60329n[fuX.j.ESTIMATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private Object O(RGN rgn) {
        return new Timestamp(rgn.getSeconds(), rgn.getNanos());
    }

    private List n(C2398j c2398j) {
        ArrayList arrayList = new ArrayList(c2398j.Ik());
        Iterator it = c2398j.KN().iterator();
        while (it.hasNext()) {
            arrayList.add(J2((uB.s4) it.next()));
        }
        return arrayList;
    }

    private Object nr(uB.s4 s4Var) {
        int i2 = j.f60329n[this.rl.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                return null;
            }
            return O(pUk.s4.n(s4Var));
        }
        uB.s4 s4VarRl = pUk.s4.rl(s4Var);
        if (s4VarRl == null) {
            return null;
        }
        return J2(s4VarRl);
    }

    lej Uo(Map map) {
        List listKN = ((uB.s4) map.get("value")).Z().KN();
        double[] dArr = new double[listKN.size()];
        for (int i2 = 0; i2 < listKN.size(); i2++) {
            dArr[i2] = ((uB.s4) listKN.get(i2)).aYN();
        }
        return new lej(dArr);
    }

    Map rl(Map map) {
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map2.put((String) entry.getKey(), J2((uB.s4) entry.getValue()));
        }
        return map2;
    }

    public Ln(FirebaseFirestore firebaseFirestore, fuX.j jVar) {
        this.f60328n = firebaseFirestore;
        this.rl = jVar;
    }

    private Object t(uB.s4 s4Var) {
        pUk.Wre wreT = pUk.Wre.t(s4Var.te());
        pUk.C cJ2 = pUk.C.J2(s4Var.te());
        pUk.Wre wreNr = this.f60328n.nr();
        if (!wreT.equals(wreNr)) {
            wqP.QJ.nr("DocumentSnapshot", "Document %s contains a document reference within a different database (%s/%s) which is not supported. It will be treated as a reference in the current database (%s/%s) instead.", cJ2.qie(), wreT.J2(), wreT.nr(), wreNr.J2(), wreNr.nr());
        }
        return new CN3(cJ2, this.f60328n);
    }

    public Object J2(uB.s4 s4Var) {
        switch (pUk.SPz.N(s4Var)) {
            case 0:
                return null;
            case 1:
                return Boolean.valueOf(s4Var.XQ());
            case 2:
                if (s4Var.E2().equals(s4.w6.INTEGER_VALUE)) {
                    return Long.valueOf(s4Var.nY());
                }
                return Double.valueOf(s4Var.aYN());
            case 3:
                return O(s4Var.fD());
            case 4:
                return nr(s4Var);
            case 5:
                return s4Var.iF();
            case 6:
                return com.google.firebase.firestore.j.rl(s4Var.S());
            case 7:
                return t(s4Var);
            case 8:
                return new QJ(s4Var.ViF().qie(), s4Var.ViF().az());
            case 9:
                return n(s4Var.Z());
            case 10:
                return Uo(s4Var.g().qie());
            case 11:
                return rl(s4Var.g().qie());
            default:
                throw wqP.n.n("Unknown value type: " + s4Var.E2(), new Object[0]);
        }
    }
}
