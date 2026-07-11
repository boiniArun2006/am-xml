package pUk;

import com.caoccao.javet.values.primitive.V8ValueNull;
import com.google.protobuf.RGN;
import com.google.protobuf.gnv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import uB.C2398j;
import uB.InterfaceC2399n;
import uB.s4;
import wqP.Z;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class SPz {
    public static uB.s4 HI;
    public static final uB.s4 J2;
    public static uB.s4 KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final uB.s4 f72003O;
    private static final uB.s4 Uo;
    public static uB.s4 az;
    public static uB.s4 ck;
    public static uB.s4 gh;
    public static uB.s4 mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final uB.s4 f72004n = (uB.s4) uB.s4.X().az(Double.NaN).build();
    public static final uB.s4 nr;
    public static uB.s4 qie;
    public static final uB.s4 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final uB.s4 f72005t;
    public static uB.s4 ty;
    public static uB.s4 xMQ;

    public static boolean r(uB.s4 s4Var, uB.s4 s4Var2) {
        int iN;
        if (s4Var == s4Var2) {
            return true;
        }
        if (s4Var == null || s4Var2 == null || (iN = N(s4Var)) != N(s4Var2)) {
            return false;
        }
        if (iN == 2) {
            return e(s4Var, s4Var2);
        }
        if (iN == 4) {
            return s4.n(s4Var).equals(s4.n(s4Var2));
        }
        if (iN == Integer.MAX_VALUE) {
            return true;
        }
        switch (iN) {
            case 9:
                return n(s4Var, s4Var2);
            case 10:
            case 11:
                return X(s4Var, s4Var2);
            default:
                return s4Var.equals(s4Var2);
        }
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f72006n;

        static {
            int[] iArr = new int[s4.w6.values().length];
            f72006n = iArr;
            try {
                iArr[s4.w6.NULL_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f72006n[s4.w6.BOOLEAN_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f72006n[s4.w6.INTEGER_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f72006n[s4.w6.DOUBLE_VALUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f72006n[s4.w6.TIMESTAMP_VALUE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f72006n[s4.w6.STRING_VALUE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f72006n[s4.w6.BYTES_VALUE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f72006n[s4.w6.REFERENCE_VALUE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f72006n[s4.w6.GEO_POINT_VALUE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f72006n[s4.w6.ARRAY_VALUE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f72006n[s4.w6.MAP_VALUE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private static void KN(StringBuilder sb, uB.s4 s4Var) {
        switch (j.f72006n[s4Var.E2().ordinal()]) {
            case 1:
                sb.append(V8ValueNull.NULL);
                return;
            case 2:
                sb.append(s4Var.XQ());
                return;
            case 3:
                sb.append(s4Var.nY());
                return;
            case 4:
                sb.append(s4Var.aYN());
                return;
            case 5:
                Uo(sb, s4Var.fD());
                return;
            case 6:
                sb.append(s4Var.iF());
                return;
            case 7:
                sb.append(Z.WPU(s4Var.S()));
                return;
            case 8:
                J2(sb, s4Var);
                return;
            case 9:
                nr(sb, s4Var.ViF());
                return;
            case 10:
                t(sb, s4Var.Z());
                return;
            case 11:
                O(sb, s4Var.g());
                return;
            default:
                throw wqP.n.n("Invalid value type: " + s4Var.E2(), new Object[0]);
        }
    }

    public static int N(uB.s4 s4Var) {
        switch (j.f72006n[s4Var.E2().ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
                return 3;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                if (s4.t(s4Var)) {
                    return 4;
                }
                if (ViF(s4Var)) {
                    return Integer.MAX_VALUE;
                }
                return fD(s4Var) ? 10 : 11;
            default:
                throw wqP.n.n("Invalid value type: " + s4Var.E2(), new Object[0]);
        }
    }

    private static void O(StringBuilder sb, uB.eO eOVar) {
        ArrayList<String> arrayList = new ArrayList(eOVar.qie().keySet());
        Collections.sort(arrayList);
        sb.append("{");
        boolean z2 = true;
        for (String str : arrayList) {
            if (z2) {
                z2 = false;
            } else {
                sb.append(",");
            }
            sb.append(str);
            sb.append(":");
            KN(sb, eOVar.ty(str));
        }
        sb.append("}");
    }

    public static boolean S(uB.s4 s4Var) {
        return s4Var != null && s4Var.E2() == s4.w6.DOUBLE_VALUE;
    }

    public static boolean ViF(uB.s4 s4Var) {
        return nr.equals(s4Var.g().qie().get("__type__"));
    }

    public static boolean WPU(uB.s4 s4Var) {
        return s4Var != null && s4Var.E2() == s4.w6.INTEGER_VALUE;
    }

    public static boolean XQ(uB.s4 s4Var) {
        return s4Var != null && s4Var.E2() == s4.w6.ARRAY_VALUE;
    }

    public static uB.s4 Z(uB.s4 s4Var) {
        switch (j.f72006n[s4Var.E2().ordinal()]) {
            case 1:
                return KN;
            case 2:
                return xMQ;
            case 3:
            case 4:
                return mUb;
            case 5:
                return gh;
            case 6:
                return qie;
            case 7:
                return az;
            case 8:
                return ty;
            case 9:
                return HI;
            case 10:
                return Uo;
            case 11:
                return fD(s4Var) ? ck : f72003O;
            default:
                throw new IllegalArgumentException("Unknown value type: " + s4Var.E2());
        }
    }

    public static boolean aYN(uB.s4 s4Var) {
        return s4Var != null && s4Var.E2() == s4.w6.MAP_VALUE;
    }

    public static boolean fD(uB.s4 s4Var) {
        return J2.equals(s4Var.g().qie().get("__type__"));
    }

    public static boolean g(uB.s4 s4Var) {
        return s4Var != null && s4Var.E2() == s4.w6.NULL_VALUE;
    }

    public static boolean iF(uB.s4 s4Var) {
        return s4Var != null && s4Var.E2() == s4.w6.REFERENCE_VALUE;
    }

    public static boolean nY(uB.s4 s4Var) {
        return s4Var != null && Double.isNaN(s4Var.aYN());
    }

    public static uB.s4 o(uB.s4 s4Var) {
        switch (j.f72006n[s4Var.E2().ordinal()]) {
            case 1:
                return rl;
            case 2:
                return KN;
            case 3:
            case 4:
                return xMQ;
            case 5:
                return mUb;
            case 6:
                return gh;
            case 7:
                return qie;
            case 8:
                return az;
            case 9:
                return ty;
            case 10:
                return HI;
            case 11:
                return fD(s4Var) ? Uo : ck;
            default:
                throw new IllegalArgumentException("Unknown value type: " + s4Var.E2());
        }
    }

    private static int qie(uB.eO eOVar, uB.eO eOVar2) {
        Iterator it = new TreeMap(eOVar.qie()).entrySet().iterator();
        Iterator it2 = new TreeMap(eOVar2.qie()).entrySet().iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Map.Entry entry2 = (Map.Entry) it2.next();
            int iTy = Z.ty((String) entry.getKey(), (String) entry2.getKey());
            if (iTy != 0) {
                return iTy;
            }
            int iXMQ = xMQ((uB.s4) entry.getValue(), (uB.s4) entry2.getValue());
            if (iXMQ != 0) {
                return iXMQ;
            }
        }
        return Z.Uo(it.hasNext(), it2.hasNext());
    }

    public static String rl(uB.s4 s4Var) {
        StringBuilder sb = new StringBuilder();
        KN(sb, s4Var);
        return sb.toString();
    }

    private static void t(StringBuilder sb, C2398j c2398j) {
        sb.append("[");
        for (int i2 = 0; i2 < c2398j.Ik(); i2++) {
            KN(sb, c2398j.ck(i2));
            if (i2 != c2398j.Ik() - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
    }

    private static int ty(String str, String str2) {
        String[] strArrSplit = str.split("/", -1);
        String[] strArrSplit2 = str2.split("/", -1);
        int iMin = Math.min(strArrSplit.length, strArrSplit2.length);
        for (int i2 = 0; i2 < iMin; i2++) {
            int iCompareTo = strArrSplit[i2].compareTo(strArrSplit2[i2]);
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Z.gh(strArrSplit.length, strArrSplit2.length);
    }

    static {
        uB.s4 s4Var = (uB.s4) uB.s4.X().r(gnv.NULL_VALUE).build();
        rl = s4Var;
        f72005t = s4Var;
        uB.s4 s4Var2 = (uB.s4) uB.s4.X().Z("__max__").build();
        nr = s4Var2;
        f72003O = (uB.s4) uB.s4.X().ck(uB.eO.r().gh("__type__", s4Var2)).build();
        uB.s4 s4Var3 = (uB.s4) uB.s4.X().Z("__vector__").build();
        J2 = s4Var3;
        Uo = (uB.s4) uB.s4.X().ck(uB.eO.r().gh("__type__", s4Var3).gh("value", (uB.s4) uB.s4.X().xMQ(C2398j.r()).build())).build();
        KN = (uB.s4) uB.s4.X().gh(false).build();
        xMQ = (uB.s4) uB.s4.X().az(Double.NaN).build();
        mUb = (uB.s4) uB.s4.X().XQ(RGN.newBuilder().setSeconds(Long.MIN_VALUE)).build();
        gh = (uB.s4) uB.s4.X().Z("").build();
        qie = (uB.s4) uB.s4.X().qie(com.google.protobuf.C.EMPTY).build();
        az = T(Wre.f72009O, C.t());
        ty = (uB.s4) uB.s4.X().ty(oFA.j.ty().xMQ(-90.0d).mUb(-180.0d)).build();
        HI = (uB.s4) uB.s4.X().mUb(C2398j.HI()).build();
        ck = (uB.s4) uB.s4.X().Ik(uB.eO.mUb()).build();
    }

    public static int E2(uB.s4 s4Var, boolean z2, uB.s4 s4Var2, boolean z3) {
        int iXMQ = xMQ(s4Var, s4Var2);
        if (iXMQ != 0) {
            return iXMQ;
        }
        if (z2 && !z3) {
            return -1;
        }
        if (!z2 && z3) {
            return 1;
        }
        return 0;
    }

    private static int HI(RGN rgn, RGN rgn2) {
        int iQie = Z.qie(rgn.getSeconds(), rgn2.getSeconds());
        if (iQie != 0) {
            return iQie;
        }
        return Z.gh(rgn.getNanos(), rgn2.getNanos());
    }

    public static boolean Ik(InterfaceC2399n interfaceC2399n, uB.s4 s4Var) {
        Iterator it = interfaceC2399n.KN().iterator();
        while (it.hasNext()) {
            if (r((uB.s4) it.next(), s4Var)) {
                return true;
            }
        }
        return false;
    }

    private static void J2(StringBuilder sb, uB.s4 s4Var) {
        wqP.n.t(iF(s4Var), "Value should be a ReferenceValue", new Object[0]);
        sb.append(C.J2(s4Var.te()));
    }

    public static uB.s4 T(Wre wre, C c2) {
        return (uB.s4) uB.s4.X().o(String.format("projects/%s/databases/%s/documents/%s", wre.J2(), wre.nr(), c2.toString())).build();
    }

    private static void Uo(StringBuilder sb, RGN rgn) {
        sb.append(String.format("time(%s,%s)", Long.valueOf(rgn.getSeconds()), Integer.valueOf(rgn.getNanos())));
    }

    private static boolean X(uB.s4 s4Var, uB.s4 s4Var2) {
        uB.eO eOVarG = s4Var.g();
        uB.eO eOVarG2 = s4Var2.g();
        if (eOVarG.gh() != eOVarG2.gh()) {
            return false;
        }
        for (Map.Entry entry : eOVarG.qie().entrySet()) {
            if (!r((uB.s4) entry.getValue(), (uB.s4) eOVarG2.qie().get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    private static int az(uB.s4 s4Var, uB.s4 s4Var2) {
        s4.w6 w6VarE2 = s4Var.E2();
        s4.w6 w6Var = s4.w6.DOUBLE_VALUE;
        if (w6VarE2 == w6Var) {
            double dAYN = s4Var.aYN();
            if (s4Var2.E2() == w6Var) {
                return Z.mUb(dAYN, s4Var2.aYN());
            }
            if (s4Var2.E2() == s4.w6.INTEGER_VALUE) {
                return Z.az(dAYN, s4Var2.nY());
            }
        } else {
            s4.w6 w6VarE22 = s4Var.E2();
            s4.w6 w6Var2 = s4.w6.INTEGER_VALUE;
            if (w6VarE22 == w6Var2) {
                long jNY = s4Var.nY();
                if (s4Var2.E2() == w6Var2) {
                    return Z.qie(jNY, s4Var2.nY());
                }
                if (s4Var2.E2() == w6Var) {
                    return Z.az(s4Var2.aYN(), jNY) * (-1);
                }
            }
        }
        throw wqP.n.n("Unexpected values: %s vs %s", s4Var, s4Var2);
    }

    private static int ck(uB.eO eOVar, uB.eO eOVar2) {
        Map mapQie = eOVar.qie();
        Map mapQie2 = eOVar2.qie();
        C2398j c2398jZ = ((uB.s4) mapQie.get("value")).Z();
        C2398j c2398jZ2 = ((uB.s4) mapQie2.get("value")).Z();
        int iGh = Z.gh(c2398jZ.Ik(), c2398jZ2.Ik());
        if (iGh != 0) {
            return iGh;
        }
        return mUb(c2398jZ, c2398jZ2);
    }

    private static boolean e(uB.s4 s4Var, uB.s4 s4Var2) {
        s4.w6 w6VarE2 = s4Var.E2();
        s4.w6 w6Var = s4.w6.INTEGER_VALUE;
        if (w6VarE2 == w6Var && s4Var2.E2() == w6Var) {
            if (s4Var.nY() == s4Var2.nY()) {
                return true;
            }
            return false;
        }
        s4.w6 w6VarE22 = s4Var.E2();
        s4.w6 w6Var2 = s4.w6.DOUBLE_VALUE;
        if (w6VarE22 == w6Var2 && s4Var2.E2() == w6Var2 && Double.doubleToLongBits(s4Var.aYN()) == Double.doubleToLongBits(s4Var2.aYN())) {
            return true;
        }
        return false;
    }

    private static int gh(oFA.j jVar, oFA.j jVar2) {
        int iMUb = Z.mUb(jVar.qie(), jVar2.qie());
        if (iMUb == 0) {
            return Z.mUb(jVar.az(), jVar2.az());
        }
        return iMUb;
    }

    private static int mUb(C2398j c2398j, C2398j c2398j2) {
        int iMin = Math.min(c2398j.Ik(), c2398j2.Ik());
        for (int i2 = 0; i2 < iMin; i2++) {
            int iXMQ = xMQ(c2398j.ck(i2), c2398j2.ck(i2));
            if (iXMQ != 0) {
                return iXMQ;
            }
        }
        return Z.gh(c2398j.Ik(), c2398j2.Ik());
    }

    private static boolean n(uB.s4 s4Var, uB.s4 s4Var2) {
        C2398j c2398jZ = s4Var.Z();
        C2398j c2398jZ2 = s4Var2.Z();
        if (c2398jZ.Ik() != c2398jZ2.Ik()) {
            return false;
        }
        for (int i2 = 0; i2 < c2398jZ.Ik(); i2++) {
            if (!r(c2398jZ.ck(i2), c2398jZ2.ck(i2))) {
                return false;
            }
        }
        return true;
    }

    public static int nHg(uB.s4 s4Var, boolean z2, uB.s4 s4Var2, boolean z3) {
        int iXMQ = xMQ(s4Var, s4Var2);
        if (iXMQ != 0) {
            return iXMQ;
        }
        if (z2 && !z3) {
            return 1;
        }
        if (!z2 && z3) {
            return -1;
        }
        return 0;
    }

    private static void nr(StringBuilder sb, oFA.j jVar) {
        sb.append(String.format("geo(%s,%s)", Double.valueOf(jVar.qie()), Double.valueOf(jVar.az())));
    }

    public static boolean te(uB.s4 s4Var) {
        if (!WPU(s4Var) && !S(s4Var)) {
            return false;
        }
        return true;
    }

    public static int xMQ(uB.s4 s4Var, uB.s4 s4Var2) {
        int iN = N(s4Var);
        int iN2 = N(s4Var2);
        if (iN != iN2) {
            return Z.gh(iN, iN2);
        }
        if (iN != Integer.MAX_VALUE) {
            switch (iN) {
                case 0:
                    break;
                case 1:
                    return Z.Uo(s4Var.XQ(), s4Var2.XQ());
                case 2:
                    return az(s4Var, s4Var2);
                case 3:
                    return HI(s4Var.fD(), s4Var2.fD());
                case 4:
                    return HI(s4.n(s4Var), s4.n(s4Var2));
                case 5:
                    return Z.ty(s4Var.iF(), s4Var2.iF());
                case 6:
                    return Z.xMQ(s4Var.S(), s4Var2.S());
                case 7:
                    return ty(s4Var.te(), s4Var2.te());
                case 8:
                    return gh(s4Var.ViF(), s4Var2.ViF());
                case 9:
                    return mUb(s4Var.Z(), s4Var2.Z());
                case 10:
                    return ck(s4Var.g(), s4Var2.g());
                case 11:
                    return qie(s4Var.g(), s4Var2.g());
                default:
                    throw wqP.n.n("Invalid value type: " + iN, new Object[0]);
            }
        }
        return 0;
    }
}
