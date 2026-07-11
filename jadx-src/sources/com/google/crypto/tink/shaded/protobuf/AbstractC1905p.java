package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.SPz;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
abstract class AbstractC1905p {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Class f60028n = g();
    private static final gnv rl = te(false);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final gnv f60029t = te(true);
    private static final gnv nr = new KH();

    private static gnv te(boolean z2) {
        try {
            Class clsIF = iF();
            if (clsIF == null) {
                return null;
            }
            return (gnv) clsIF.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z2));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void B(int i2, List list, YzO yzO, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yzO.writeSInt32List(i2, list, z2);
    }

    public static void D(int i2, List list, YzO yzO) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yzO.writeStringList(i2, list);
    }

    public static void E(int i2, List list, YzO yzO, mz mzVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yzO.t(i2, list, mzVar);
    }

    public static void FX(int i2, List list, YzO yzO, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yzO.writeSFixed64List(i2, list, z2);
    }

    static int HI(int i2, Object obj, mz mzVar) {
        return CodedOutputStream.ViF(i2, (rv6) obj, mzVar);
    }

    public static void I(int i2, List list, YzO yzO, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yzO.writeUInt64List(i2, list, z2);
    }

    public static void J(int i2, List list, YzO yzO, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yzO.writeSInt64List(i2, list, z2);
    }

    public static void M(int i2, List list, YzO yzO, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yzO.writeSFixed32List(i2, list, z2);
    }

    public static void M7(int i2, List list, YzO yzO, mz mzVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yzO.J2(i2, list, mzVar);
    }

    public static void N(Class cls) {
        Class cls2;
        if (!Q.class.isAssignableFrom(cls) && (cls2 = f60028n) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    public static void P5(int i2, List list, YzO yzO, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yzO.writeFloatList(i2, list, z2);
    }

    public static gnv T() {
        return f60029t;
    }

    public static void U(int i2, List list, YzO yzO, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yzO.writeFixed64List(i2, list, z2);
    }

    public static gnv X() {
        return rl;
    }

    public static void Xw(int i2, List list, YzO yzO, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yzO.writeEnumList(i2, list, z2);
    }

    public static void a(int i2, List list, YzO yzO, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yzO.writeUInt32List(i2, list, z2);
    }

    public static void bzg(int i2, List list, YzO yzO, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yzO.writeDoubleList(i2, list, z2);
    }

    public static void eF(int i2, List list, YzO yzO, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yzO.writeInt64List(i2, list, z2);
    }

    private static Class g() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class iF() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void jB(int i2, List list, YzO yzO, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yzO.writeFixed32List(i2, list, z2);
    }

    static boolean nHg(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static Object nY(Object obj, int i2, List list, SPz.w6 w6Var, Object obj2, gnv gnvVar) {
        if (w6Var == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!w6Var.isInRange(iIntValue)) {
                    obj2 = s7N(obj, i2, iIntValue, obj2, gnvVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i3 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            Integer num = (Integer) list.get(i5);
            int iIntValue2 = num.intValue();
            if (w6Var.isInRange(iIntValue2)) {
                if (i5 != i3) {
                    list.set(i3, num);
                }
                i3++;
            } else {
                obj2 = s7N(obj, i2, iIntValue2, obj2, gnvVar);
            }
        }
        if (i3 != size) {
            list.subList(i3, size).clear();
        }
        return obj2;
    }

    public static void p5(int i2, List list, YzO yzO, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yzO.writeInt32List(i2, list, z2);
    }

    public static void rV9(int i2, List list, YzO yzO) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yzO.writeBytesList(i2, list);
    }

    static Object s7N(Object obj, int i2, int i3, Object obj2, gnv gnvVar) {
        if (obj2 == null) {
            obj2 = gnvVar.J2(obj);
        }
        gnvVar.O(obj2, i2, i3);
        return obj2;
    }

    public static void v(int i2, List list, YzO yzO, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yzO.writeBoolList(i2, list, z2);
    }

    public static gnv wTp() {
        return nr;
    }

    static void E2(qf qfVar, Object obj, Object obj2, long j2) {
        o7q.U(obj, j2, qfVar.mergeFrom(o7q.iF(obj, j2), o7q.iF(obj2, j2)));
    }

    static int Ik(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = r(list);
        if (z2) {
            return CodedOutputStream.wTp(i2) + CodedOutputStream.aYN(iR);
        }
        return iR + (size * CodedOutputStream.wTp(i2));
    }

    static int J2(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z2) {
            return CodedOutputStream.wTp(i2) + CodedOutputStream.aYN(size * 4);
        }
        return size * CodedOutputStream.qie(i2, 0);
    }

    static int KN(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z2) {
            return CodedOutputStream.wTp(i2) + CodedOutputStream.aYN(size * 8);
        }
        return size * CodedOutputStream.ty(i2, 0L);
    }

    static int O(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof r) {
            r rVar = (r) list;
            int iGh = 0;
            while (i2 < size) {
                iGh += CodedOutputStream.gh(rVar.getInt(i2));
                i2++;
            }
            return iGh;
        }
        int iGh2 = 0;
        while (i2 < size) {
            iGh2 += CodedOutputStream.gh(((Integer) list.get(i2)).intValue());
            i2++;
        }
        return iGh2;
    }

    static int S(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iWPU = WPU(list);
        if (z2) {
            return CodedOutputStream.wTp(i2) + CodedOutputStream.aYN(iWPU);
        }
        return iWPU + (size * CodedOutputStream.wTp(i2));
    }

    static int Uo(List list) {
        return list.size() * 4;
    }

    static int ViF(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Ew) {
            Ew ew = (Ew) list;
            int iXw = 0;
            while (i2 < size) {
                iXw += CodedOutputStream.Xw(ew.getLong(i2));
                i2++;
            }
            return iXw;
        }
        int iXw2 = 0;
        while (i2 < size) {
            iXw2 += CodedOutputStream.Xw(((Long) list.get(i2)).longValue());
            i2++;
        }
        return iXw2;
    }

    static int WPU(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof r) {
            r rVar = (r) list;
            int iRV9 = 0;
            while (i2 < size) {
                iRV9 += CodedOutputStream.rV9(rVar.getInt(i2));
                i2++;
            }
            return iRV9;
        }
        int iRV92 = 0;
        while (i2 < size) {
            iRV92 += CodedOutputStream.rV9(((Integer) list.get(i2)).intValue());
            i2++;
        }
        return iRV92;
    }

    static int XQ(int i2, List list) {
        int iS7N;
        int iS7N2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        int iWTp = CodedOutputStream.wTp(i2) * size;
        if (list instanceof afx) {
            afx afxVar = (afx) list;
            while (i3 < size) {
                Object raw = afxVar.getRaw(i3);
                if (raw instanceof fuX) {
                    iS7N2 = CodedOutputStream.Uo((fuX) raw);
                } else {
                    iS7N2 = CodedOutputStream.s7N((String) raw);
                }
                iWTp += iS7N2;
                i3++;
            }
            return iWTp;
        }
        while (i3 < size) {
            Object obj = list.get(i3);
            if (obj instanceof fuX) {
                iS7N = CodedOutputStream.Uo((fuX) obj);
            } else {
                iS7N = CodedOutputStream.s7N((String) obj);
            }
            iWTp += iS7N;
            i3++;
        }
        return iWTp;
    }

    static int Z(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Ew) {
            Ew ew = (Ew) list;
            int iN = 0;
            while (i2 < size) {
                iN += CodedOutputStream.N(ew.getLong(i2));
                i2++;
            }
            return iN;
        }
        int iN2 = 0;
        while (i2 < size) {
            iN2 += CodedOutputStream.N(((Long) list.get(i2)).longValue());
            i2++;
        }
        return iN2;
    }

    static int aYN(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iViF = ViF(list);
        if (z2) {
            return CodedOutputStream.wTp(i2) + CodedOutputStream.aYN(iViF);
        }
        return iViF + (size * CodedOutputStream.wTp(i2));
    }

    static int az(int i2, List list, boolean z2) {
        if (list.size() == 0) {
            return 0;
        }
        int iTy = ty(list);
        if (z2) {
            return CodedOutputStream.wTp(i2) + CodedOutputStream.aYN(iTy);
        }
        return iTy + (list.size() * CodedOutputStream.wTp(i2));
    }

    static int ck(int i2, List list, mz mzVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iWTp = CodedOutputStream.wTp(i2) * size;
        for (int i3 = 0; i3 < size; i3++) {
            iWTp += CodedOutputStream.nY((rv6) list.get(i3), mzVar);
        }
        return iWTp;
    }

    static void e(gnv gnvVar, Object obj, Object obj2) {
        gnvVar.ck(obj, gnvVar.gh(gnvVar.Uo(obj), gnvVar.Uo(obj2)));
    }

    static void fD(eO eOVar, Object obj, Object obj2) {
        l3D l3dT = eOVar.t(obj2);
        if (!l3dT.nr()) {
            eOVar.nr(obj).KN(l3dT);
        }
    }

    static int gh(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iQie = qie(list);
        if (z2) {
            return CodedOutputStream.wTp(i2) + CodedOutputStream.aYN(iQie);
        }
        return iQie + (size * CodedOutputStream.wTp(i2));
    }

    static int mUb(int i2, List list, mz mzVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iR += CodedOutputStream.r(i2, (rv6) list.get(i3), mzVar);
        }
        return iR;
    }

    static int n(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z2) {
            return CodedOutputStream.wTp(i2) + CodedOutputStream.aYN(size);
        }
        return size * CodedOutputStream.nr(i2, true);
    }

    static int nr(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iO = O(list);
        if (z2) {
            return CodedOutputStream.wTp(i2) + CodedOutputStream.aYN(iO);
        }
        return iO + (size * CodedOutputStream.wTp(i2));
    }

    static int o(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZ = Z(list);
        if (z2) {
            return CodedOutputStream.wTp(i2) + CodedOutputStream.aYN(iZ);
        }
        return iZ + (size * CodedOutputStream.wTp(i2));
    }

    static int qie(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof r) {
            r rVar = (r) list;
            int iXQ = 0;
            while (i2 < size) {
                iXQ += CodedOutputStream.XQ(rVar.getInt(i2));
                i2++;
            }
            return iXQ;
        }
        int iXQ2 = 0;
        while (i2 < size) {
            iXQ2 += CodedOutputStream.XQ(((Integer) list.get(i2)).intValue());
            i2++;
        }
        return iXQ2;
    }

    static int r(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof r) {
            r rVar = (r) list;
            int iX = 0;
            while (i2 < size) {
                iX += CodedOutputStream.X(rVar.getInt(i2));
                i2++;
            }
            return iX;
        }
        int iX2 = 0;
        while (i2 < size) {
            iX2 += CodedOutputStream.X(((Integer) list.get(i2)).intValue());
            i2++;
        }
        return iX2;
    }

    static int rl(List list) {
        return list.size();
    }

    static int t(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iWTp = size * CodedOutputStream.wTp(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            iWTp += CodedOutputStream.Uo((fuX) list.get(i3));
        }
        return iWTp;
    }

    static int ty(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Ew) {
            Ew ew = (Ew) list;
            int iWPU = 0;
            while (i2 < size) {
                iWPU += CodedOutputStream.WPU(ew.getLong(i2));
                i2++;
            }
            return iWPU;
        }
        int iWPU2 = 0;
        while (i2 < size) {
            iWPU2 += CodedOutputStream.WPU(((Long) list.get(i2)).longValue());
            i2++;
        }
        return iWPU2;
    }

    static int xMQ(List list) {
        return list.size() * 8;
    }
}
