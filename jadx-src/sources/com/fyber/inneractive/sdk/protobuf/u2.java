package com.fyber.inneractive.sdk.protobuf;

import java.util.AbstractList;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f56681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o3 f56682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o3 f56683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o3 f56684d;

    public static Object a(int i2, List list, Object obj, o3 o3Var) {
        return obj;
    }

    public static void b(int i2, List list, c0 c0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i3 = 0;
        if (!z2) {
            c0Var.getClass();
            while (i3 < list.size()) {
                b0 b0Var = c0Var.f56538a;
                double dDoubleValue = ((Double) list.get(i3)).doubleValue();
                b0Var.getClass();
                b0Var.a(i2, Double.doubleToRawLongBits(dDoubleValue));
                i3++;
            }
            return;
        }
        c0Var.f56538a.c(i2, 2);
        int i5 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Double) list.get(i7)).getClass();
            Logger logger = b0.f56531b;
            i5 += 8;
        }
        c0Var.f56538a.g(i5);
        while (i3 < list.size()) {
            b0 b0Var2 = c0Var.f56538a;
            double dDoubleValue2 = ((Double) list.get(i3)).doubleValue();
            b0Var2.getClass();
            b0Var2.c(Double.doubleToRawLongBits(dDoubleValue2));
            i3++;
        }
    }

    public static void c(int i2, List list, c0 c0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i3 = 0;
        if (!z2) {
            c0Var.getClass();
            while (i3 < list.size()) {
                c0Var.f56538a.b(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        c0Var.f56538a.c(i2, 2);
        int iA = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iA += b0.a(((Integer) list.get(i5)).intValue());
        }
        c0Var.f56538a.g(iA);
        while (i3 < list.size()) {
            c0Var.f56538a.f(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public static void d(int i2, List list, c0 c0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i3 = 0;
        if (!z2) {
            c0Var.getClass();
            while (i3 < list.size()) {
                c0Var.f56538a.a(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        c0Var.f56538a.c(i2, 2);
        int i5 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Integer) list.get(i7)).getClass();
            Logger logger = b0.f56531b;
            i5 += 4;
        }
        c0Var.f56538a.g(i5);
        while (i3 < list.size()) {
            c0Var.f56538a.e(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public static void e(int i2, List list, c0 c0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i3 = 0;
        if (!z2) {
            c0Var.getClass();
            while (i3 < list.size()) {
                c0Var.f56538a.a(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        c0Var.f56538a.c(i2, 2);
        int i5 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Long) list.get(i7)).getClass();
            Logger logger = b0.f56531b;
            i5 += 8;
        }
        c0Var.f56538a.g(i5);
        while (i3 < list.size()) {
            c0Var.f56538a.c(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public static void f(int i2, List list, c0 c0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i3 = 0;
        if (!z2) {
            c0Var.getClass();
            while (i3 < list.size()) {
                b0 b0Var = c0Var.f56538a;
                float fFloatValue = ((Float) list.get(i3)).floatValue();
                b0Var.getClass();
                b0Var.a(i2, Float.floatToRawIntBits(fFloatValue));
                i3++;
            }
            return;
        }
        c0Var.f56538a.c(i2, 2);
        int i5 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Float) list.get(i7)).getClass();
            Logger logger = b0.f56531b;
            i5 += 4;
        }
        c0Var.f56538a.g(i5);
        while (i3 < list.size()) {
            b0 b0Var2 = c0Var.f56538a;
            float fFloatValue2 = ((Float) list.get(i3)).floatValue();
            b0Var2.getClass();
            b0Var2.e(Float.floatToRawIntBits(fFloatValue2));
            i3++;
        }
    }

    public static void g(int i2, List list, c0 c0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i3 = 0;
        if (!z2) {
            c0Var.getClass();
            while (i3 < list.size()) {
                c0Var.f56538a.b(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        c0Var.f56538a.c(i2, 2);
        int iC = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            int iIntValue = ((Integer) list.get(i5)).intValue();
            iC += iIntValue >= 0 ? b0.c(iIntValue) : 10;
        }
        c0Var.f56538a.g(iC);
        while (i3 < list.size()) {
            c0Var.f56538a.f(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f56681a = cls;
        f56682b = a(false);
        f56683c = a(true);
        f56684d = new o3();
    }

    public static void a(int i2, List list, c0 c0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i3 = 0;
        if (!z2) {
            c0Var.getClass();
            while (i3 < list.size()) {
                c0Var.f56538a.a(i2, ((Boolean) list.get(i3)).booleanValue());
                i3++;
            }
            return;
        }
        c0Var.f56538a.c(i2, 2);
        int i5 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Boolean) list.get(i7)).getClass();
            Logger logger = b0.f56531b;
            i5++;
        }
        c0Var.f56538a.g(i5);
        while (i3 < list.size()) {
            c0Var.f56538a.a(((Boolean) list.get(i3)).booleanValue() ? (byte) 1 : (byte) 0);
            i3++;
        }
    }

    public static void h(int i2, List list, c0 c0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i3 = 0;
        if (!z2) {
            c0Var.getClass();
            while (i3 < list.size()) {
                c0Var.f56538a.b(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        c0Var.f56538a.c(i2, 2);
        int iA = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iA += b0.a(((Long) list.get(i5)).longValue());
        }
        c0Var.f56538a.g(iA);
        while (i3 < list.size()) {
            c0Var.f56538a.d(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public static void i(int i2, List list, c0 c0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i3 = 0;
        if (!z2) {
            c0Var.getClass();
            while (i3 < list.size()) {
                c0Var.f56538a.a(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        c0Var.f56538a.c(i2, 2);
        int i5 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Integer) list.get(i7)).getClass();
            Logger logger = b0.f56531b;
            i5 += 4;
        }
        c0Var.f56538a.g(i5);
        while (i3 < list.size()) {
            c0Var.f56538a.e(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public static void j(int i2, List list, c0 c0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i3 = 0;
        if (!z2) {
            c0Var.getClass();
            while (i3 < list.size()) {
                c0Var.f56538a.a(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        c0Var.f56538a.c(i2, 2);
        int i5 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Long) list.get(i7)).getClass();
            Logger logger = b0.f56531b;
            i5 += 8;
        }
        c0Var.f56538a.g(i5);
        while (i3 < list.size()) {
            c0Var.f56538a.c(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public static void k(int i2, List list, c0 c0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i3 = 0;
        if (!z2) {
            c0Var.getClass();
            while (i3 < list.size()) {
                c0Var.f56538a.d(i2, b0.d(((Integer) list.get(i3)).intValue()));
                i3++;
            }
            return;
        }
        c0Var.f56538a.c(i2, 2);
        int iC = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iC += b0.c(b0.d(((Integer) list.get(i5)).intValue()));
        }
        c0Var.f56538a.g(iC);
        while (i3 < list.size()) {
            c0Var.f56538a.g(b0.d(((Integer) list.get(i3)).intValue()));
            i3++;
        }
    }

    public static void l(int i2, List list, c0 c0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i3 = 0;
        if (!z2) {
            c0Var.getClass();
            while (i3 < list.size()) {
                c0Var.f56538a.b(i2, b0.b(((Long) list.get(i3)).longValue()));
                i3++;
            }
            return;
        }
        c0Var.f56538a.c(i2, 2);
        int iA = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iA += b0.a(b0.b(((Long) list.get(i5)).longValue()));
        }
        c0Var.f56538a.g(iA);
        while (i3 < list.size()) {
            c0Var.f56538a.d(b0.b(((Long) list.get(i3)).longValue()));
            i3++;
        }
    }

    public static void m(int i2, List list, c0 c0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i3 = 0;
        if (!z2) {
            c0Var.getClass();
            while (i3 < list.size()) {
                c0Var.f56538a.d(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        c0Var.f56538a.c(i2, 2);
        int iC = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iC += b0.c(((Integer) list.get(i5)).intValue());
        }
        c0Var.f56538a.g(iC);
        while (i3 < list.size()) {
            c0Var.f56538a.g(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public static void n(int i2, List list, c0 c0Var, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i3 = 0;
        if (!z2) {
            c0Var.getClass();
            while (i3 < list.size()) {
                c0Var.f56538a.b(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        c0Var.f56538a.c(i2, 2);
        int iA = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iA += b0.a(((Long) list.get(i5)).longValue());
        }
        c0Var.f56538a.g(iA);
        while (i3 < list.size()) {
            c0Var.f56538a.d(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public static int d(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof a1)) {
            int iC = 0;
            while (i2 < size) {
                iC += b0.c(b0.d(((Integer) list.get(i2)).intValue()));
                i2++;
            }
            return iC;
        }
        a1 a1Var = (a1) list;
        int iC2 = 0;
        while (i2 < size) {
            a1Var.d(i2);
            iC2 += b0.c(b0.d(a1Var.f56525b[i2]));
            i2++;
        }
        return iC2;
    }

    public static int e(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof u1)) {
            int iA = 0;
            while (i2 < size) {
                iA += b0.a(b0.b(((Long) list.get(i2)).longValue()));
                i2++;
            }
            return iA;
        }
        u1 u1Var = (u1) list;
        int iA2 = 0;
        while (i2 < size) {
            u1Var.c(i2);
            iA2 += b0.a(b0.b(u1Var.f56679b[i2]));
            i2++;
        }
        return iA2;
    }

    public static int g(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof u1)) {
            int iA = 0;
            while (i2 < size) {
                iA += b0.a(((Long) list.get(i2)).longValue());
                i2++;
            }
            return iA;
        }
        u1 u1Var = (u1) list;
        int iA2 = 0;
        while (i2 < size) {
            u1Var.c(i2);
            iA2 += b0.a(u1Var.f56679b[i2]);
            i2++;
        }
        return iA2;
    }

    public static void a(int i2, List list, c0 c0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0Var.getClass();
        for (int i3 = 0; i3 < list.size(); i3++) {
            c0Var.f56538a.a(i2, (s) list.get(i3));
        }
    }

    public static void b(int i2, List list, c0 c0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0Var.getClass();
        int i3 = 0;
        if (list instanceof q1) {
            q1 q1Var = (q1) list;
            while (i3 < list.size()) {
                Object objA = q1Var.a(i3);
                if (objA instanceof String) {
                    c0Var.f56538a.a((String) objA, i2);
                } else {
                    c0Var.f56538a.a(i2, (s) objA);
                }
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            c0Var.f56538a.a((String) list.get(i3), i2);
            i3++;
        }
    }

    public static int c(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof u1)) {
            int iA = 0;
            while (i2 < size) {
                iA += b0.a(((Long) list.get(i2)).longValue());
                i2++;
            }
            return iA;
        }
        u1 u1Var = (u1) list;
        int iA2 = 0;
        while (i2 < size) {
            u1Var.c(i2);
            iA2 += b0.a(u1Var.f56679b[i2]);
            i2++;
        }
        return iA2;
    }

    public static int f(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof a1)) {
            int iC = 0;
            while (i2 < size) {
                iC += b0.c(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return iC;
        }
        a1 a1Var = (a1) list;
        int iC2 = 0;
        while (i2 < size) {
            a1Var.d(i2);
            iC2 += b0.c(a1Var.f56525b[i2]);
            i2++;
        }
        return iC2;
    }

    public static void a(int i2, List list, c0 c0Var, t2 t2Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0Var.getClass();
        for (int i3 = 0; i3 < list.size(); i3++) {
            c0Var.a(i2, list.get(i3), t2Var);
        }
    }

    public static int a(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof a1)) {
            int iA = 0;
            while (i2 < size) {
                iA += b0.a(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return iA;
        }
        a1 a1Var = (a1) list;
        int iA2 = 0;
        while (i2 < size) {
            a1Var.d(i2);
            iA2 += b0.a(a1Var.f56525b[i2]);
            i2++;
        }
        return iA2;
    }

    public static int c(int i2, List list) {
        int iA;
        int iA2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        int iB = b0.b(i2) * size;
        if (!(list instanceof q1)) {
            while (i3 < size) {
                Object obj = list.get(i3);
                if (obj instanceof s) {
                    iA = b0.a((s) obj);
                } else {
                    iA = b0.a((String) obj);
                }
                iB = iA + iB;
                i3++;
            }
            return iB;
        }
        q1 q1Var = (q1) list;
        while (i3 < size) {
            Object objA = q1Var.a(i3);
            if (objA instanceof s) {
                iA2 = b0.a((s) objA);
            } else {
                iA2 = b0.a((String) objA);
            }
            iB = iA2 + iB;
            i3++;
        }
        return iB;
    }

    public static void b(int i2, List list, c0 c0Var, t2 t2Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0Var.getClass();
        for (int i3 = 0; i3 < list.size(); i3++) {
            c0Var.f56538a.a(i2, (d2) list.get(i3), t2Var);
        }
    }

    public static int a(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (b0.b(i2) + 4) * size;
    }

    public static int b(List list) {
        int iC;
        int iC2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof a1)) {
            int i3 = 0;
            while (i2 < size) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                if (iIntValue >= 0) {
                    iC = b0.c(iIntValue);
                } else {
                    Logger logger = b0.f56531b;
                    iC = 10;
                }
                i3 += iC;
                i2++;
            }
            return i3;
        }
        a1 a1Var = (a1) list;
        int i5 = 0;
        while (i2 < size) {
            a1Var.d(i2);
            int i7 = a1Var.f56525b[i2];
            if (i7 >= 0) {
                iC2 = b0.c(i7);
            } else {
                Logger logger2 = b0.f56531b;
                iC2 = 10;
            }
            i5 += iC2;
            i2++;
        }
        return i5;
    }

    public static o3 a(boolean z2) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (o3) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z2));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static Object a(int i2, AbstractList abstractList, e1 e1Var, Object obj, o3 o3Var) {
        if (e1Var == null) {
            return obj;
        }
        int size = abstractList.size();
        int i3 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            Integer num = (Integer) abstractList.get(i5);
            int iIntValue = num.intValue();
            if (e1Var.a(iIntValue) != null) {
                if (i5 != i3) {
                    abstractList.set(i3, num);
                }
                i3++;
            } else {
                obj = a(i2, iIntValue, obj, o3Var);
            }
        }
        if (i3 != size) {
            abstractList.subList(i3, size).clear();
        }
        return obj;
    }

    public static Object a(int i2, int i3, Object obj, o3 o3Var) {
        if (obj == null) {
            o3Var.getClass();
            obj = new n3();
        }
        o3Var.getClass();
        ((n3) obj).a(i2 << 3, Long.valueOf(i3));
        return obj;
    }

    public static int b(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (b0.b(i2) + 8) * size;
    }
}
