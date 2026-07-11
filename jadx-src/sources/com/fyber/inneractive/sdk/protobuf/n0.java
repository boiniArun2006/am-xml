package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class n0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n0 f56620d = new n0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e3 f56621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f56622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f56623c;

    public n0() {
        int i2 = e3.f56551h;
        this.f56621a = new v2(16);
    }

    public static boolean b(Map.Entry entry) {
        w0 w0Var = (w0) entry.getKey();
        if (w0Var.f56699c.a() != k4.MESSAGE) {
            return true;
        }
        if (!w0Var.f56700d) {
            Object value = entry.getValue();
            if (value instanceof d2) {
                return ((d2) value).isInitialized();
            }
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!((d2) it.next()).isInitialized()) {
                return false;
            }
        }
        return true;
    }

    public final void a(n0 n0Var) {
        for (int i2 = 0; i2 < n0Var.f56621a.f56553b.size(); i2++) {
            c((Map.Entry) n0Var.f56621a.f56553b.get(i2));
        }
        Iterator it = n0Var.f56621a.b().iterator();
        while (it.hasNext()) {
            c((Map.Entry) it.next());
        }
    }

    public final boolean c() {
        for (int i2 = 0; i2 < this.f56621a.f56553b.size(); i2++) {
            if (!b((Map.Entry) this.f56621a.f56553b.get(i2))) {
                return false;
            }
        }
        Iterator it = this.f56621a.b().iterator();
        while (it.hasNext()) {
            if (!b((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Iterator d() {
        return this.f56623c ? new o1(this.f56621a.entrySet().iterator()) : this.f56621a.entrySet().iterator();
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final n0 m180clone() {
        n0 n0Var = new n0();
        for (int i2 = 0; i2 < this.f56621a.f56553b.size(); i2++) {
            Map.Entry entry = (Map.Entry) this.f56621a.f56553b.get(i2);
            n0Var.c((w0) entry.getKey(), entry.getValue());
        }
        for (Map.Entry entry2 : this.f56621a.b()) {
            n0Var.c((w0) entry2.getKey(), entry2.getValue());
        }
        n0Var.f56623c = this.f56623c;
        return n0Var;
    }

    public final void e() {
        if (this.f56622b) {
            return;
        }
        v2 v2Var = (v2) this.f56621a;
        if (!v2Var.f56555d) {
            for (int i2 = 0; i2 < v2Var.f56553b.size(); i2++) {
                Map.Entry entry = (Map.Entry) v2Var.f56553b.get(i2);
                if (((w0) entry.getKey()).f56700d) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : v2Var.b()) {
                if (((w0) entry2.getKey()).f56700d) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        if (!v2Var.f56555d) {
            v2Var.f56554c = v2Var.f56554c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(v2Var.f56554c);
            v2Var.f56557f = v2Var.f56557f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(v2Var.f56557f);
            v2Var.f56555d = true;
        }
        this.f56622b = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n0) {
            return this.f56621a.equals(((n0) obj).f56621a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f56621a.hashCode();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d(w0 w0Var, Object obj) {
        boolean z2;
        j4 j4Var = w0Var.f56699c;
        Charset charset = l1.f56612a;
        obj.getClass();
        switch (m0.f56616a[j4Var.a().ordinal()]) {
            case 1:
                z2 = obj instanceof Integer;
                break;
            case 2:
                z2 = obj instanceof Long;
                break;
            case 3:
                z2 = obj instanceof Float;
                break;
            case 4:
                z2 = obj instanceof Double;
                break;
            case 5:
                z2 = obj instanceof Boolean;
                break;
            case 6:
                z2 = obj instanceof String;
                break;
            case 7:
                z2 = (obj instanceof s) || (obj instanceof byte[]);
                break;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof d1)) {
                }
                break;
            case 9:
                z2 = obj instanceof d2;
                break;
        }
        if (!z2) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(w0Var.f56698b), w0Var.f56699c.a(), obj.getClass().getName()));
        }
    }

    public n0(int i2) {
        int i3 = e3.f56551h;
        this.f56621a = new v2(0);
        e();
        e();
    }

    public final int a() {
        int iA = 0;
        for (int i2 = 0; i2 < this.f56621a.f56553b.size(); i2++) {
            iA += a((Map.Entry) this.f56621a.f56553b.get(i2));
        }
        Iterator it = this.f56621a.b().iterator();
        while (it.hasNext()) {
            iA += a((Map.Entry) it.next());
        }
        return iA;
    }

    public final void c(Map.Entry entry) {
        w0 w0Var = (w0) entry.getKey();
        Object value = entry.getValue();
        if (w0Var.f56700d) {
            Object arrayList = this.f56621a.get(w0Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) arrayList;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            this.f56621a.a(w0Var, arrayList);
            return;
        }
        if (w0Var.f56699c.a() == k4.MESSAGE) {
            Object obj2 = this.f56621a.get(w0Var);
            if (obj2 == null) {
                e3 e3Var = this.f56621a;
                if (value instanceof byte[]) {
                    byte[] bArr3 = (byte[]) value;
                    byte[] bArr4 = new byte[bArr3.length];
                    System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                    value = bArr4;
                }
                e3Var.a(w0Var, value);
                return;
            }
            t0 t0Var = (t0) ((d2) obj2).toBuilder();
            t0Var.c();
            t0.a(t0Var.f56666b, (z0) ((d2) value));
            this.f56621a.a(w0Var, t0Var.a());
            return;
        }
        e3 e3Var2 = this.f56621a;
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        e3Var2.a(w0Var, value);
    }

    public final int b() {
        int iB = 0;
        for (int i2 = 0; i2 < this.f56621a.f56553b.size(); i2++) {
            Map.Entry entry = (Map.Entry) this.f56621a.f56553b.get(i2);
            iB += b((w0) entry.getKey(), entry.getValue());
        }
        for (Map.Entry entry2 : this.f56621a.b()) {
            iB += b((w0) entry2.getKey(), entry2.getValue());
        }
        return iB;
    }

    public static int a(Map.Entry entry) {
        w0 w0Var = (w0) entry.getKey();
        Object value = entry.getValue();
        if (w0Var.f56699c.a() == k4.MESSAGE && !w0Var.f56700d && !w0Var.f56701e) {
            int i2 = ((w0) entry.getKey()).f56698b;
            int iC = b0.c(i2) + b0.b(2) + (b0.b(1) * 2);
            int iB = b0.b(3);
            int serializedSize = ((d2) value).getSerializedSize();
            return l0.a(serializedSize, serializedSize, iB, iC);
        }
        return b(w0Var, value);
    }

    public static int b(w0 w0Var, Object obj) {
        int iB;
        int iA;
        j4 j4Var = w0Var.f56699c;
        int i2 = w0Var.f56698b;
        if (w0Var.f56700d) {
            int iA2 = 0;
            if (w0Var.f56701e) {
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    iA2 += a(j4Var, it.next());
                }
                iB = b0.b(i2) + iA2;
                iA = b0.c(iA2);
            } else {
                for (Object obj2 : (List) obj) {
                    int iB2 = b0.b(i2);
                    if (j4Var == j4.GROUP) {
                        iB2 *= 2;
                    }
                    iA2 += a(j4Var, obj2) + iB2;
                }
                return iA2;
            }
        } else {
            iB = b0.b(i2);
            if (j4Var == j4.GROUP) {
                iB *= 2;
            }
            iA = a(j4Var, obj);
        }
        return iA + iB;
    }

    public static int a(j4 j4Var, Object obj) {
        int serializedSize;
        int iC;
        switch (m0.f56617b[j4Var.ordinal()]) {
            case 1:
                ((Double) obj).getClass();
                Logger logger = b0.f56531b;
                return 8;
            case 2:
                ((Float) obj).getClass();
                Logger logger2 = b0.f56531b;
                return 4;
            case 3:
                return b0.a(((Long) obj).longValue());
            case 4:
                return b0.a(((Long) obj).longValue());
            case 5:
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue >= 0) {
                    return b0.c(iIntValue);
                }
                Logger logger3 = b0.f56531b;
                return 10;
            case 6:
                ((Long) obj).getClass();
                Logger logger4 = b0.f56531b;
                return 8;
            case 7:
                ((Integer) obj).getClass();
                Logger logger5 = b0.f56531b;
                return 4;
            case 8:
                ((Boolean) obj).getClass();
                Logger logger6 = b0.f56531b;
                return 1;
            case 9:
                Logger logger7 = b0.f56531b;
                return ((d2) obj).getSerializedSize();
            case 10:
                Logger logger8 = b0.f56531b;
                serializedSize = ((d2) obj).getSerializedSize();
                iC = b0.c(serializedSize);
                break;
            case 11:
                if (obj instanceof s) {
                    return b0.a((s) obj);
                }
                return b0.a((String) obj);
            case 12:
                if (obj instanceof s) {
                    return b0.a((s) obj);
                }
                Logger logger9 = b0.f56531b;
                serializedSize = ((byte[]) obj).length;
                iC = b0.c(serializedSize);
                break;
                break;
            case 13:
                return b0.c(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                Logger logger10 = b0.f56531b;
                return 4;
            case 15:
                ((Long) obj).getClass();
                Logger logger11 = b0.f56531b;
                return 8;
            case 16:
                return b0.c(b0.d(((Integer) obj).intValue()));
            case 17:
                return b0.a(b0.b(((Long) obj).longValue()));
            case 18:
                if (obj instanceof d1) {
                    return b0.a(((d1) obj).a());
                }
                return b0.a(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iC + serializedSize;
    }

    public final void c(w0 w0Var, Object obj) {
        if (w0Var.f56700d) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    d(w0Var, it.next());
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            d(w0Var, obj);
        }
        this.f56621a.a(w0Var, obj);
    }

    public final void a(w0 w0Var, Object obj) {
        List arrayList;
        if (w0Var.f56700d) {
            d(w0Var, obj);
            Object obj2 = this.f56621a.get(w0Var);
            if (obj2 == null) {
                arrayList = new ArrayList();
                this.f56621a.a(w0Var, arrayList);
            } else {
                arrayList = (List) obj2;
            }
            arrayList.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }
}
