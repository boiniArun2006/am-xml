package com.fyber.inneractive.sdk.protobuf;

import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class i2 implements t2 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f56580q = new int[0];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Unsafe f56581r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f56582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f56583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f56584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f56585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d2 f56586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f56587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f56588g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f56589h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f56590i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f56591j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f56592k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k2 f56593l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t1 f56594m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o3 f56595n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j0 f56596o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z1 f56597p;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new s3());
        } catch (Throwable unused) {
            unsafe = null;
        }
        f56581r = unsafe;
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0387  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static i2 a(r2 r2Var, k2 k2Var, t1 t1Var, o3 o3Var, j0 j0Var, z1 z1Var) {
        int i2;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int iCharAt4;
        int i3;
        int iCharAt5;
        int i5;
        int[] iArr;
        int i7;
        int i8;
        char cCharAt;
        int i9;
        char cCharAt2;
        int i10;
        char cCharAt3;
        int i11;
        char cCharAt4;
        int i12;
        char cCharAt5;
        int i13;
        char cCharAt6;
        int i14;
        char cCharAt7;
        int i15;
        char cCharAt8;
        int i16;
        int i17;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i18;
        String str;
        int i19;
        int i20;
        int iObjectFieldOffset3;
        int i21;
        Field fieldA;
        char cCharAt9;
        int i22;
        Object obj;
        Field fieldA2;
        Object obj2;
        Field fieldA3;
        int i23;
        char cCharAt10;
        int i24;
        char cCharAt11;
        int i25;
        int i26;
        char cCharAt12;
        int i27;
        int i28;
        char cCharAt13;
        if (r2Var == null) {
            r2Var.getClass();
            throw new ClassCastException();
        }
        boolean z2 = ((r2Var.f56652d & 1) == 1 ? o2.PROTO2 : o2.PROTO3) == o2.PROTO3;
        String str2 = r2Var.f56650b;
        int length = str2.length();
        if (str2.charAt(0) >= 55296) {
            int i29 = 1;
            while (true) {
                i2 = i29 + 1;
                if (str2.charAt(i29) < 55296) {
                    break;
                }
                i29 = i2;
            }
        } else {
            i2 = 1;
        }
        int i30 = i2 + 1;
        int iCharAt6 = str2.charAt(i2);
        if (iCharAt6 >= 55296) {
            int i31 = iCharAt6 & 8191;
            int i32 = 13;
            while (true) {
                i28 = i30 + 1;
                cCharAt13 = str2.charAt(i30);
                if (cCharAt13 < 55296) {
                    break;
                }
                i31 |= (cCharAt13 & 8191) << i32;
                i32 += 13;
                i30 = i28;
            }
            iCharAt6 = i31 | (cCharAt13 << i32);
            i30 = i28;
        }
        if (iCharAt6 == 0) {
            i7 = 0;
            iCharAt2 = 0;
            iCharAt3 = 0;
            iCharAt4 = 0;
            i5 = 0;
            iCharAt5 = 0;
            i3 = i30;
            iArr = f56580q;
            iCharAt = 0;
        } else {
            int i33 = i30 + 1;
            iCharAt = str2.charAt(i30);
            if (iCharAt >= 55296) {
                int i34 = iCharAt & 8191;
                int i35 = 13;
                while (true) {
                    i15 = i33 + 1;
                    cCharAt8 = str2.charAt(i33);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i34 |= (cCharAt8 & 8191) << i35;
                    i35 += 13;
                    i33 = i15;
                }
                iCharAt = i34 | (cCharAt8 << i35);
                i33 = i15;
            }
            int i36 = i33 + 1;
            int iCharAt7 = str2.charAt(i33);
            if (iCharAt7 >= 55296) {
                int i37 = iCharAt7 & 8191;
                int i38 = 13;
                while (true) {
                    i14 = i36 + 1;
                    cCharAt7 = str2.charAt(i36);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i37 |= (cCharAt7 & 8191) << i38;
                    i38 += 13;
                    i36 = i14;
                }
                iCharAt7 = i37 | (cCharAt7 << i38);
                i36 = i14;
            }
            int i39 = i36 + 1;
            iCharAt2 = str2.charAt(i36);
            if (iCharAt2 >= 55296) {
                int i40 = iCharAt2 & 8191;
                int i41 = 13;
                while (true) {
                    i13 = i39 + 1;
                    cCharAt6 = str2.charAt(i39);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt6 & 8191) << i41;
                    i41 += 13;
                    i39 = i13;
                }
                iCharAt2 = i40 | (cCharAt6 << i41);
                i39 = i13;
            }
            int i42 = i39 + 1;
            iCharAt3 = str2.charAt(i39);
            if (iCharAt3 >= 55296) {
                int i43 = iCharAt3 & 8191;
                int i44 = 13;
                while (true) {
                    i12 = i42 + 1;
                    cCharAt5 = str2.charAt(i42);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt5 & 8191) << i44;
                    i44 += 13;
                    i42 = i12;
                }
                iCharAt3 = i43 | (cCharAt5 << i44);
                i42 = i12;
            }
            int i45 = i42 + 1;
            int iCharAt8 = str2.charAt(i42);
            if (iCharAt8 >= 55296) {
                int i46 = iCharAt8 & 8191;
                int i47 = 13;
                while (true) {
                    i11 = i45 + 1;
                    cCharAt4 = str2.charAt(i45);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt4 & 8191) << i47;
                    i47 += 13;
                    i45 = i11;
                }
                iCharAt8 = i46 | (cCharAt4 << i47);
                i45 = i11;
            }
            int i48 = i45 + 1;
            iCharAt4 = str2.charAt(i45);
            if (iCharAt4 >= 55296) {
                int i49 = iCharAt4 & 8191;
                int i50 = 13;
                while (true) {
                    i10 = i48 + 1;
                    cCharAt3 = str2.charAt(i48);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt3 & 8191) << i50;
                    i50 += 13;
                    i48 = i10;
                }
                iCharAt4 = i49 | (cCharAt3 << i50);
                i48 = i10;
            }
            int i51 = i48 + 1;
            int iCharAt9 = str2.charAt(i48);
            if (iCharAt9 >= 55296) {
                int i52 = iCharAt9 & 8191;
                int i53 = 13;
                while (true) {
                    i9 = i51 + 1;
                    cCharAt2 = str2.charAt(i51);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt2 & 8191) << i53;
                    i53 += 13;
                    i51 = i9;
                }
                iCharAt9 = i52 | (cCharAt2 << i53);
                i51 = i9;
            }
            i3 = i51 + 1;
            iCharAt5 = str2.charAt(i51);
            if (iCharAt5 >= 55296) {
                int i54 = iCharAt5 & 8191;
                int i55 = i3;
                int i56 = 13;
                while (true) {
                    i8 = i55 + 1;
                    cCharAt = str2.charAt(i55);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i54 |= (cCharAt & 8191) << i56;
                    i56 += 13;
                    i55 = i8;
                }
                iCharAt5 = i54 | (cCharAt << i56);
                i3 = i8;
            }
            int[] iArr2 = new int[iCharAt5 + iCharAt4 + iCharAt9];
            i5 = (iCharAt * 2) + iCharAt7;
            int i57 = iCharAt8;
            iArr = iArr2;
            i7 = i57;
        }
        Unsafe unsafe = f56581r;
        Object[] objArr = r2Var.f56651c;
        Class<?> cls = r2Var.f56649a.getClass();
        int[] iArr3 = new int[i7 * 3];
        Object[] objArr2 = new Object[i7 * 2];
        int i58 = iCharAt4 + iCharAt5;
        int i59 = i3;
        int i60 = i58;
        int i61 = iCharAt5;
        int i62 = 0;
        int i63 = 0;
        while (i59 < length) {
            int i64 = i59 + 1;
            int iCharAt10 = str2.charAt(i59);
            int i65 = length;
            if (iCharAt10 >= 55296) {
                int i66 = iCharAt10 & 8191;
                int i67 = i64;
                int i68 = 13;
                while (true) {
                    i26 = i67 + 1;
                    cCharAt12 = str2.charAt(i67);
                    i27 = i66;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i66 = i27 | ((cCharAt12 & 8191) << i68);
                    i68 += 13;
                    i67 = i26;
                }
                iCharAt10 = i27 | (cCharAt12 << i68);
                i16 = i26;
            } else {
                i16 = i64;
            }
            int i69 = i16 + 1;
            int iCharAt11 = str2.charAt(i16);
            int i70 = iCharAt10;
            if (iCharAt11 >= 55296) {
                int i71 = iCharAt11 & 8191;
                int i72 = i69;
                int i73 = 13;
                while (true) {
                    i24 = i72 + 1;
                    cCharAt11 = str2.charAt(i72);
                    i25 = i71;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i71 = i25 | ((cCharAt11 & 8191) << i73);
                    i73 += 13;
                    i72 = i24;
                }
                iCharAt11 = i25 | (cCharAt11 << i73);
                i17 = i24;
            } else {
                i17 = i69;
            }
            Object[] objArr3 = objArr;
            int i74 = iCharAt11 & 255;
            int i75 = iCharAt;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i62] = i63;
                i62++;
            }
            int[] iArr4 = iArr3;
            if (i74 >= 51) {
                int i76 = i17 + 1;
                int iCharAt12 = str2.charAt(i17);
                char c2 = 55296;
                if (iCharAt12 >= 55296) {
                    int i77 = iCharAt12 & 8191;
                    int i78 = 13;
                    while (true) {
                        i23 = i76 + 1;
                        cCharAt10 = str2.charAt(i76);
                        if (cCharAt10 < c2) {
                            break;
                        }
                        i77 |= (cCharAt10 & 8191) << i78;
                        i78 += 13;
                        i76 = i23;
                        c2 = 55296;
                    }
                    iCharAt12 = i77 | (cCharAt10 << i78);
                    i76 = i23;
                }
                int i79 = i74 - 51;
                int i80 = iCharAt12;
                if (i79 == 9 || i79 == 17) {
                    i22 = i5 + 1;
                    objArr2[((i63 / 3) * 2) + 1] = objArr3[i5];
                } else {
                    if (i79 == 12 && !z2) {
                        i22 = i5 + 1;
                        objArr2[((i63 / 3) * 2) + 1] = objArr3[i5];
                    }
                    int i81 = i80 * 2;
                    obj = objArr3[i81];
                    if (obj instanceof Field) {
                        fieldA2 = a((Class) cls, (String) obj);
                        objArr3[i81] = fieldA2;
                    } else {
                        fieldA2 = (Field) obj;
                    }
                    int i82 = i76;
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldA2);
                    int i83 = i81 + 1;
                    i20 = i82;
                    obj2 = objArr3[i83];
                    i19 = iObjectFieldOffset4;
                    if (obj2 instanceof Field) {
                        fieldA3 = a((Class) cls, (String) obj2);
                        objArr3[i83] = fieldA3;
                    } else {
                        fieldA3 = (Field) obj2;
                    }
                    iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldA3);
                    str = str2;
                    i18 = 0;
                }
                i5 = i22;
                int i812 = i80 * 2;
                obj = objArr3[i812];
                if (obj instanceof Field) {
                }
                int i822 = i76;
                int iObjectFieldOffset42 = (int) unsafe.objectFieldOffset(fieldA2);
                int i832 = i812 + 1;
                i20 = i822;
                obj2 = objArr3[i832];
                i19 = iObjectFieldOffset42;
                if (obj2 instanceof Field) {
                }
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldA3);
                str = str2;
                i18 = 0;
            } else {
                int i84 = i5 + 1;
                Field fieldA4 = a((Class) cls, (String) objArr3[i5]);
                if (i74 == 9 || i74 == 17) {
                    objArr2[((i63 / 3) * 2) + 1] = fieldA4.getType();
                } else {
                    if (i74 == 27 || i74 == 49) {
                        i5 += 2;
                        objArr2[((i63 / 3) * 2) + 1] = objArr3[i84];
                    } else if (i74 == 12 || i74 == 30 || i74 == 44) {
                        if (!z2) {
                            i5 += 2;
                            objArr2[((i63 / 3) * 2) + 1] = objArr3[i84];
                        }
                    } else if (i74 == 50) {
                        int i85 = i61 + 1;
                        iArr[i61] = i63;
                        int i86 = (i63 / 3) * 2;
                        int i87 = i5 + 2;
                        objArr2[i86] = objArr3[i84];
                        if ((iCharAt11 & 2048) != 0) {
                            objArr2[i86 + 1] = objArr3[i87];
                            i5 += 3;
                        } else {
                            i5 = i87;
                        }
                        i61 = i85;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldA4);
                    if ((iCharAt11 & 4096) == 4096 || i74 > 17) {
                        iObjectFieldOffset2 = 1048575;
                        i18 = 0;
                    } else {
                        int i88 = i17 + 1;
                        int iCharAt13 = str2.charAt(i17);
                        if (iCharAt13 >= 55296) {
                            int i89 = iCharAt13 & 8191;
                            int i90 = 13;
                            while (true) {
                                i21 = i88 + 1;
                                cCharAt9 = str2.charAt(i88);
                                if (cCharAt9 < 55296) {
                                    break;
                                }
                                i89 |= (cCharAt9 & 8191) << i90;
                                i90 += 13;
                                i88 = i21;
                            }
                            iCharAt13 = i89 | (cCharAt9 << i90);
                        } else {
                            i21 = i88;
                        }
                        int i91 = (iCharAt13 / 32) + (i75 * 2);
                        Object obj3 = objArr3[i91];
                        if (obj3 instanceof Field) {
                            fieldA = (Field) obj3;
                        } else {
                            fieldA = a((Class) cls, (String) obj3);
                            objArr3[i91] = fieldA;
                        }
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldA);
                        i18 = iCharAt13 % 32;
                        i17 = i21;
                    }
                    str = str2;
                    if (i74 >= 18 && i74 <= 49) {
                        iArr[i60] = iObjectFieldOffset;
                        i60++;
                    }
                    i19 = iObjectFieldOffset;
                    i20 = i17;
                    iObjectFieldOffset3 = iObjectFieldOffset2;
                }
                i5 = i84;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldA4);
                if ((iCharAt11 & 4096) == 4096) {
                    iObjectFieldOffset2 = 1048575;
                    i18 = 0;
                    str = str2;
                    if (i74 >= 18) {
                        iArr[i60] = iObjectFieldOffset;
                        i60++;
                    }
                    i19 = iObjectFieldOffset;
                    i20 = i17;
                    iObjectFieldOffset3 = iObjectFieldOffset2;
                }
            }
            int i92 = i63 + 1;
            iArr4[i63] = i70;
            int i93 = i63 + 2;
            iArr4[i92] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i74 << 20) | i19;
            i63 += 3;
            iArr4[i93] = (i18 << 20) | iObjectFieldOffset3;
            str2 = str;
            objArr = objArr3;
            length = i65;
            iCharAt = i75;
            i59 = i20;
            iArr3 = iArr4;
        }
        return new i2(iArr3, objArr2, iCharAt2, iCharAt3, r2Var.f56649a, z2, iArr, iCharAt5, i58, k2Var, t1Var, o3Var, j0Var, z1Var);
    }

    public static long d(int i2) {
        return i2 & 1048575;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01cb  */
    @Override // com.fyber.inneractive.sdk.protobuf.t2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(Object obj, Object obj2) {
        int length = this.f56582a.length;
        int i2 = 0;
        while (true) {
            boolean zA = true;
            if (i2 >= length) {
                this.f56595n.getClass();
                n3 n3Var = ((z0) obj).unknownFields;
                this.f56595n.getClass();
                if (!n3Var.equals(((z0) obj2).unknownFields)) {
                    return false;
                }
                if (!this.f56587f) {
                    return true;
                }
                this.f56596o.getClass();
                n0 n0Var = ((GeneratedMessageLite$ExtendableMessage) obj).extensions;
                this.f56596o.getClass();
                return n0Var.equals(((GeneratedMessageLite$ExtendableMessage) obj2).extensions);
            }
            int[] iArr = this.f56582a;
            int i3 = iArr[i2 + 1];
            long j2 = i3 & 1048575;
            switch ((i3 & 267386880) >>> 20) {
                case 0:
                    if (a(i2, obj, obj2)) {
                        w3 w3Var = x3.f56720c;
                        if (Double.doubleToLongBits(w3Var.c(obj, j2)) != Double.doubleToLongBits(w3Var.c(obj2, j2))) {
                            zA = false;
                        }
                        break;
                    }
                    break;
                case 1:
                    if (a(i2, obj, obj2)) {
                        w3 w3Var2 = x3.f56720c;
                        if (Float.floatToIntBits(w3Var2.d(obj, j2)) != Float.floatToIntBits(w3Var2.d(obj2, j2))) {
                        }
                    }
                    break;
                case 2:
                    if (!a(i2, obj, obj2) || x3.d(obj, j2) != x3.d(obj2, j2)) {
                    }
                    break;
                case 3:
                    if (!a(i2, obj, obj2) || x3.d(obj, j2) != x3.d(obj2, j2)) {
                    }
                    break;
                case 4:
                    if (!a(i2, obj, obj2) || x3.c(obj, j2) != x3.c(obj2, j2)) {
                    }
                    break;
                case 5:
                    if (!a(i2, obj, obj2) || x3.d(obj, j2) != x3.d(obj2, j2)) {
                    }
                    break;
                case 6:
                    if (!a(i2, obj, obj2) || x3.c(obj, j2) != x3.c(obj2, j2)) {
                    }
                    break;
                case 7:
                    if (a(i2, obj, obj2)) {
                        w3 w3Var3 = x3.f56720c;
                        if (w3Var3.a(obj, j2) != w3Var3.a(obj2, j2)) {
                        }
                    }
                    break;
                case 8:
                    if (!a(i2, obj, obj2) || !u2.a(x3.e(obj, j2), x3.e(obj2, j2))) {
                    }
                    break;
                case 9:
                    if (!a(i2, obj, obj2) || !u2.a(x3.e(obj, j2), x3.e(obj2, j2))) {
                    }
                    break;
                case 10:
                    if (!a(i2, obj, obj2) || !u2.a(x3.e(obj, j2), x3.e(obj2, j2))) {
                    }
                    break;
                case 11:
                    if (!a(i2, obj, obj2) || x3.c(obj, j2) != x3.c(obj2, j2)) {
                    }
                    break;
                case 12:
                    if (!a(i2, obj, obj2) || x3.c(obj, j2) != x3.c(obj2, j2)) {
                    }
                    break;
                case 13:
                    if (!a(i2, obj, obj2) || x3.c(obj, j2) != x3.c(obj2, j2)) {
                    }
                    break;
                case 14:
                    if (!a(i2, obj, obj2) || x3.d(obj, j2) != x3.d(obj2, j2)) {
                    }
                    break;
                case 15:
                    if (!a(i2, obj, obj2) || x3.c(obj, j2) != x3.c(obj2, j2)) {
                    }
                    break;
                case 16:
                    if (!a(i2, obj, obj2) || x3.d(obj, j2) != x3.d(obj2, j2)) {
                    }
                    break;
                case 17:
                    if (!a(i2, obj, obj2) || !u2.a(x3.e(obj, j2), x3.e(obj2, j2))) {
                    }
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zA = u2.a(x3.e(obj, j2), x3.e(obj2, j2));
                    break;
                case 50:
                    zA = u2.a(x3.e(obj, j2), x3.e(obj2, j2));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long j3 = iArr[i2 + 2] & 1048575;
                    if (x3.c(obj, j3) != x3.c(obj2, j3) || !u2.a(x3.e(obj, j2), x3.e(obj2, j2))) {
                    }
                    break;
            }
            if (!zA) {
                return false;
            }
            i2 += 3;
        }
    }

    public final t2 c(int i2) {
        int i3 = (i2 / 3) * 2;
        Object[] objArr = this.f56583b;
        t2 t2Var = (t2) objArr[i3];
        if (t2Var != null) {
            return t2Var;
        }
        t2 t2VarA = p2.f56635c.a((Class) objArr[i3 + 1]);
        this.f56583b[i3] = t2VarA;
        return t2VarA;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0100 A[PHI: r2
      0x0100: PHI (r2v30 int) = (r2v10 int), (r2v31 int) binds: [B:82:0x0227, B:40:0x00fe] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.fyber.inneractive.sdk.protobuf.t2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(Object obj) {
        int i2;
        long jDoubleToLongBits;
        int i3;
        int iFloatToIntBits;
        int i5;
        int i7;
        int length = this.f56582a.length;
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9 += 3) {
            int[] iArr = this.f56582a;
            int i10 = iArr[i9 + 1];
            int i11 = iArr[i9];
            long j2 = 1048575 & i10;
            int iHashCode = 37;
            int i12 = 1237;
            switch ((i10 & 267386880) >>> 20) {
                case 0:
                    i2 = i8 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(x3.f56720c.c(obj, j2));
                    Charset charset = l1.f56612a;
                    i7 = i2 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    i8 = i7;
                    break;
                case 1:
                    i3 = i8 * 53;
                    iFloatToIntBits = Float.floatToIntBits(x3.f56720c.d(obj, j2));
                    i7 = iFloatToIntBits + i3;
                    i8 = i7;
                    break;
                case 2:
                    i2 = i8 * 53;
                    jDoubleToLongBits = x3.d(obj, j2);
                    Charset charset2 = l1.f56612a;
                    i7 = i2 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    i8 = i7;
                    break;
                case 3:
                    i2 = i8 * 53;
                    jDoubleToLongBits = x3.d(obj, j2);
                    Charset charset3 = l1.f56612a;
                    i7 = i2 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    i8 = i7;
                    break;
                case 4:
                    i3 = i8 * 53;
                    iFloatToIntBits = x3.c(obj, j2);
                    i7 = iFloatToIntBits + i3;
                    i8 = i7;
                    break;
                case 5:
                    i2 = i8 * 53;
                    jDoubleToLongBits = x3.d(obj, j2);
                    Charset charset4 = l1.f56612a;
                    i7 = i2 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    i8 = i7;
                    break;
                case 6:
                    i3 = i8 * 53;
                    iFloatToIntBits = x3.c(obj, j2);
                    i7 = iFloatToIntBits + i3;
                    i8 = i7;
                    break;
                case 7:
                    i5 = i8 * 53;
                    boolean zA = x3.f56720c.a(obj, j2);
                    Charset charset5 = l1.f56612a;
                    if (zA) {
                        i12 = 1231;
                    }
                    i7 = i12 + i5;
                    i8 = i7;
                    break;
                case 8:
                    i3 = i8 * 53;
                    iFloatToIntBits = ((String) x3.e(obj, j2)).hashCode();
                    i7 = iFloatToIntBits + i3;
                    i8 = i7;
                    break;
                case 9:
                    Object objE = x3.e(obj, j2);
                    if (objE != null) {
                        iHashCode = objE.hashCode();
                    }
                    iFloatToIntBits = i8 * 53;
                    i3 = iHashCode;
                    i7 = iFloatToIntBits + i3;
                    i8 = i7;
                    break;
                case 10:
                    i3 = i8 * 53;
                    iFloatToIntBits = x3.e(obj, j2).hashCode();
                    i7 = iFloatToIntBits + i3;
                    i8 = i7;
                    break;
                case 11:
                    i3 = i8 * 53;
                    iFloatToIntBits = x3.c(obj, j2);
                    i7 = iFloatToIntBits + i3;
                    i8 = i7;
                    break;
                case 12:
                    i3 = i8 * 53;
                    iFloatToIntBits = x3.c(obj, j2);
                    i7 = iFloatToIntBits + i3;
                    i8 = i7;
                    break;
                case 13:
                    i3 = i8 * 53;
                    iFloatToIntBits = x3.c(obj, j2);
                    i7 = iFloatToIntBits + i3;
                    i8 = i7;
                    break;
                case 14:
                    i2 = i8 * 53;
                    jDoubleToLongBits = x3.d(obj, j2);
                    Charset charset6 = l1.f56612a;
                    i7 = i2 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    i8 = i7;
                    break;
                case 15:
                    i3 = i8 * 53;
                    iFloatToIntBits = x3.c(obj, j2);
                    i7 = iFloatToIntBits + i3;
                    i8 = i7;
                    break;
                case 16:
                    i2 = i8 * 53;
                    jDoubleToLongBits = x3.d(obj, j2);
                    Charset charset7 = l1.f56612a;
                    i7 = i2 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    i8 = i7;
                    break;
                case 17:
                    Object objE2 = x3.e(obj, j2);
                    if (objE2 != null) {
                        iHashCode = objE2.hashCode();
                    }
                    iFloatToIntBits = i8 * 53;
                    i3 = iHashCode;
                    i7 = iFloatToIntBits + i3;
                    i8 = i7;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i3 = i8 * 53;
                    iFloatToIntBits = x3.e(obj, j2).hashCode();
                    i7 = iFloatToIntBits + i3;
                    i8 = i7;
                    break;
                case 50:
                    i3 = i8 * 53;
                    iFloatToIntBits = x3.e(obj, j2).hashCode();
                    i7 = iFloatToIntBits + i3;
                    i8 = i7;
                    break;
                case 51:
                    if (a(obj, i11, i9)) {
                        i2 = i8 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(((Double) x3.e(obj, j2)).doubleValue());
                        Charset charset8 = l1.f56612a;
                        i7 = i2 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        i8 = i7;
                    }
                    break;
                case 52:
                    if (a(obj, i11, i9)) {
                        i3 = i8 * 53;
                        iFloatToIntBits = Float.floatToIntBits(((Float) x3.e(obj, j2)).floatValue());
                        i7 = iFloatToIntBits + i3;
                        i8 = i7;
                    }
                    break;
                case 53:
                    if (a(obj, i11, i9)) {
                        i2 = i8 * 53;
                        jDoubleToLongBits = ((Long) x3.e(obj, j2)).longValue();
                        Charset charset9 = l1.f56612a;
                        i7 = i2 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        i8 = i7;
                    }
                    break;
                case 54:
                    if (a(obj, i11, i9)) {
                        i2 = i8 * 53;
                        jDoubleToLongBits = ((Long) x3.e(obj, j2)).longValue();
                        Charset charset10 = l1.f56612a;
                        i7 = i2 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        i8 = i7;
                    }
                    break;
                case 55:
                    if (a(obj, i11, i9)) {
                        i3 = i8 * 53;
                        iFloatToIntBits = ((Integer) x3.e(obj, j2)).intValue();
                        i7 = iFloatToIntBits + i3;
                        i8 = i7;
                    }
                    break;
                case 56:
                    if (a(obj, i11, i9)) {
                        i2 = i8 * 53;
                        jDoubleToLongBits = ((Long) x3.e(obj, j2)).longValue();
                        Charset charset11 = l1.f56612a;
                        i7 = i2 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        i8 = i7;
                    }
                    break;
                case 57:
                    if (a(obj, i11, i9)) {
                        i3 = i8 * 53;
                        iFloatToIntBits = ((Integer) x3.e(obj, j2)).intValue();
                        i7 = iFloatToIntBits + i3;
                        i8 = i7;
                    }
                    break;
                case 58:
                    if (a(obj, i11, i9)) {
                        i5 = i8 * 53;
                        boolean zBooleanValue = ((Boolean) x3.e(obj, j2)).booleanValue();
                        Charset charset12 = l1.f56612a;
                        if (zBooleanValue) {
                        }
                        i7 = i12 + i5;
                        i8 = i7;
                    }
                    break;
                case 59:
                    if (a(obj, i11, i9)) {
                        i3 = i8 * 53;
                        iFloatToIntBits = ((String) x3.e(obj, j2)).hashCode();
                        i7 = iFloatToIntBits + i3;
                        i8 = i7;
                    }
                    break;
                case 60:
                    if (a(obj, i11, i9)) {
                        i3 = i8 * 53;
                        iFloatToIntBits = x3.e(obj, j2).hashCode();
                        i7 = iFloatToIntBits + i3;
                        i8 = i7;
                    }
                    break;
                case 61:
                    if (a(obj, i11, i9)) {
                        i3 = i8 * 53;
                        iFloatToIntBits = x3.e(obj, j2).hashCode();
                        i7 = iFloatToIntBits + i3;
                        i8 = i7;
                    }
                    break;
                case 62:
                    if (a(obj, i11, i9)) {
                        i3 = i8 * 53;
                        iFloatToIntBits = ((Integer) x3.e(obj, j2)).intValue();
                        i7 = iFloatToIntBits + i3;
                        i8 = i7;
                    }
                    break;
                case 63:
                    if (a(obj, i11, i9)) {
                        i3 = i8 * 53;
                        iFloatToIntBits = ((Integer) x3.e(obj, j2)).intValue();
                        i7 = iFloatToIntBits + i3;
                        i8 = i7;
                    }
                    break;
                case 64:
                    if (a(obj, i11, i9)) {
                        i3 = i8 * 53;
                        iFloatToIntBits = ((Integer) x3.e(obj, j2)).intValue();
                        i7 = iFloatToIntBits + i3;
                        i8 = i7;
                    }
                    break;
                case 65:
                    if (a(obj, i11, i9)) {
                        i2 = i8 * 53;
                        jDoubleToLongBits = ((Long) x3.e(obj, j2)).longValue();
                        Charset charset13 = l1.f56612a;
                        i7 = i2 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        i8 = i7;
                    }
                    break;
                case 66:
                    if (a(obj, i11, i9)) {
                        i3 = i8 * 53;
                        iFloatToIntBits = ((Integer) x3.e(obj, j2)).intValue();
                        i7 = iFloatToIntBits + i3;
                        i8 = i7;
                    }
                    break;
                case 67:
                    if (a(obj, i11, i9)) {
                        i2 = i8 * 53;
                        jDoubleToLongBits = ((Long) x3.e(obj, j2)).longValue();
                        Charset charset14 = l1.f56612a;
                        i7 = i2 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        i8 = i7;
                    }
                    break;
                case 68:
                    if (a(obj, i11, i9)) {
                        i3 = i8 * 53;
                        iFloatToIntBits = x3.e(obj, j2).hashCode();
                        i7 = iFloatToIntBits + i3;
                        i8 = i7;
                    }
                    break;
            }
        }
        this.f56595n.getClass();
        int iHashCode2 = ((z0) obj).unknownFields.hashCode() + (i8 * 53);
        if (!this.f56587f) {
            return iHashCode2;
        }
        this.f56596o.getClass();
        return ((GeneratedMessageLite$ExtendableMessage) obj).extensions.f56621a.hashCode() + (iHashCode2 * 53);
    }

    public final void e(int i2, Object obj, Object obj2) {
        int[] iArr = this.f56582a;
        int i3 = iArr[i2 + 1];
        int i5 = iArr[i2];
        long j2 = i3 & 1048575;
        if (a(obj2, i5, i2)) {
            Object objE = a(obj, i5, i2) ? x3.e(obj, j2) : null;
            Object objE2 = x3.e(obj2, j2);
            if (objE != null && objE2 != null) {
                x3.a(j2, obj, l1.a(objE, objE2));
                b(obj, i5, i2);
            } else if (objE2 != null) {
                x3.a(j2, obj, objE2);
                b(obj, i5, i2);
            }
        }
    }

    public i2(int[] iArr, Object[] objArr, int i2, int i3, d2 d2Var, boolean z2, int[] iArr2, int i5, int i7, k2 k2Var, t1 t1Var, o3 o3Var, j0 j0Var, z1 z1Var) {
        boolean z3;
        this.f56582a = iArr;
        this.f56583b = objArr;
        this.f56584c = i2;
        this.f56585d = i3;
        this.f56588g = d2Var instanceof z0;
        this.f56589h = z2;
        if (j0Var != null && (d2Var instanceof GeneratedMessageLite$ExtendableMessage)) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f56587f = z3;
        this.f56590i = iArr2;
        this.f56591j = i5;
        this.f56592k = i7;
        this.f56593l = k2Var;
        this.f56594m = t1Var;
        this.f56595n = o3Var;
        this.f56596o = j0Var;
        this.f56586e = d2Var;
        this.f56597p = z1Var;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final void c(Object obj) {
        int i2;
        int i3 = this.f56591j;
        while (true) {
            i2 = this.f56592k;
            if (i3 >= i2) {
                break;
            }
            long j2 = this.f56582a[this.f56590i[i3] + 1] & 1048575;
            Object objE = x3.e(obj, j2);
            if (objE != null) {
                this.f56597p.getClass();
                ((y1) objE).f56730a = false;
                x3.a(j2, obj, objE);
            }
            i3++;
        }
        int length = this.f56590i.length;
        while (i2 < length) {
            this.f56594m.a(obj, this.f56590i[i2]);
            i2++;
        }
        this.f56595n.getClass();
        ((z0) obj).unknownFields.f56630e = false;
        if (this.f56587f) {
            this.f56596o.getClass();
            ((GeneratedMessageLite$ExtendableMessage) obj).extensions.e();
        }
    }

    public final void c(int i2, Object obj, Object obj2) {
        long j2 = this.f56582a[i2 + 1] & 1048575;
        Object objE = x3.e(obj, j2);
        if (objE != null) {
            this.f56597p.getClass();
            if (!((y1) objE).f56730a) {
                this.f56597p.getClass();
                y1 y1Var = y1.f56729b;
                y1 y1Var2 = y1Var.isEmpty() ? new y1() : new y1(y1Var);
                this.f56597p.getClass();
                z1.a(y1Var2, objE);
                x3.a(j2, obj, y1Var2);
                objE = y1Var2;
            }
        } else {
            this.f56597p.getClass();
            y1 y1Var3 = y1.f56729b;
            objE = y1Var3.isEmpty() ? new y1() : new y1(y1Var3);
            x3.a(j2, obj, objE);
        }
        this.f56597p.getClass();
        this.f56597p.getClass();
        obj2.getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0811 A[PHI: r10
      0x0811: PHI (r10v25 int) = (r10v3 int), (r10v26 int) binds: [B:496:0x0ced, B:313:0x080a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0a49 A[PHI: r22
      0x0a49: PHI (r22v30 int) = (r22v15 int), (r22v16 int), (r22v17 int), (r22v24 int), (r22v25 int), (r22v28 int), (r22v31 int) binds: [B:442:0x0bb3, B:438:0x0b97, B:434:0x0b7b, B:408:0x0ab6, B:404:0x0a9c, B:397:0x0a65, B:392:0x0a47] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0b02 A[PHI: r22
      0x0b02: PHI (r22v48 int) = (r22v22 int), (r22v23 int), (r22v51 int) binds: [B:419:0x0b00, B:412:0x0ad0, B:343:0x08ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0185 A[PHI: r4
      0x0185: PHI (r4v102 int) = (r4v40 int), (r4v104 int) binds: [B:237:0x0630, B:61:0x017d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.fyber.inneractive.sdk.protobuf.t2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(Object obj) {
        int i2;
        int iB;
        int iA;
        int i3;
        int iB2;
        int iA2;
        int iB3;
        int iB4;
        int iB5;
        int serializedSize;
        int iA3;
        int iB6;
        int iB7;
        int iA4;
        int iA5;
        int iB8;
        int iA6;
        int iA7;
        int iB9;
        int iC;
        int iB10;
        int iA8;
        int iB11;
        int i5 = 267386880;
        int i7 = 1048575;
        int i8 = 1;
        if (this.f56589h) {
            Unsafe unsafe = f56581r;
            int i9 = 0;
            int iB12 = 0;
            while (true) {
                int[] iArr = this.f56582a;
                if (i9 < iArr.length) {
                    int i10 = iArr[i9 + 1];
                    int i11 = (i10 & i5) >>> 20;
                    int i12 = iArr[i9];
                    int i13 = i5;
                    long j2 = i10 & 1048575;
                    if (i11 >= FieldType.DOUBLE_LIST_PACKED.id() && i11 <= FieldType.SINT64_LIST_PACKED.id()) {
                        int i14 = this.f56582a[i9 + 2];
                    }
                    switch (i11) {
                        case 0:
                            if (a(i9, obj)) {
                                iA5 = g2.a(i12, 8, iB12);
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 1:
                            if (a(i9, obj)) {
                                iA5 = g2.a(i12, 4, iB12);
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 2:
                            if (a(i9, obj)) {
                                long jD = x3.d(obj, j2);
                                iB8 = b0.b(i12);
                                iA6 = b0.a(jD);
                                iA7 = iA6 + iB8;
                                iA5 = iA7 + iB12;
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 3:
                            if (a(i9, obj)) {
                                iA7 = b0.a(x3.d(obj, j2)) + b0.b(i12);
                                iA5 = iA7 + iB12;
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 4:
                            if (a(i9, obj)) {
                                int iC2 = x3.c(obj, j2);
                                iB9 = b0.b(i12);
                                iC = iC2 >= 0 ? b0.c(iC2) : 10;
                                iA7 = iC + iB9;
                                iA5 = iA7 + iB12;
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 5:
                            if (a(i9, obj)) {
                                iA5 = g2.a(i12, 8, iB12);
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 6:
                            if (a(i9, obj)) {
                                iA5 = g2.a(i12, 4, iB12);
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 7:
                            if (a(i9, obj)) {
                                iA5 = g2.a(i12, 1, iB12);
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 8:
                            if (a(i9, obj)) {
                                Object objE = x3.e(obj, j2);
                                if (objE instanceof s) {
                                    iB10 = b0.b(i12);
                                    iA8 = b0.a((s) objE);
                                } else {
                                    iB10 = b0.b(i12);
                                    iA8 = b0.a((String) objE);
                                }
                                iA7 = iA8 + iB10;
                                iA5 = iA7 + iB12;
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 9:
                            if (a(i9, obj)) {
                                Object objE2 = x3.e(obj, j2);
                                t2 t2VarC = c(i9);
                                Class cls = u2.f56681a;
                                int iB13 = b0.b(i12);
                                int serializedSize2 = ((b) ((d2) objE2)).getSerializedSize(t2VarC);
                                iA5 = l0.a(serializedSize2, serializedSize2, iB13, iB12);
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 10:
                            if (a(i9, obj)) {
                                s sVar = (s) x3.e(obj, j2);
                                iB10 = b0.b(i12);
                                iA8 = b0.a(sVar);
                                iA7 = iA8 + iB10;
                                iA5 = iA7 + iB12;
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 11:
                            if (a(i9, obj)) {
                                int iC3 = x3.c(obj, j2);
                                iB10 = b0.b(i12);
                                iA8 = b0.c(iC3);
                                iA7 = iA8 + iB10;
                                iA5 = iA7 + iB12;
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 12:
                            if (a(i9, obj)) {
                                int iC4 = x3.c(obj, j2);
                                iB10 = b0.b(i12);
                                iA8 = b0.a(iC4);
                                iA7 = iA8 + iB10;
                                iA5 = iA7 + iB12;
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 13:
                            if (a(i9, obj)) {
                                iA5 = g2.a(i12, 4, iB12);
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 14:
                            if (a(i9, obj)) {
                                iA5 = g2.a(i12, 8, iB12);
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 15:
                            if (a(i9, obj)) {
                                int iC5 = x3.c(obj, j2);
                                iB8 = b0.b(i12);
                                iA6 = b0.c(b0.d(iC5));
                                iA7 = iA6 + iB8;
                                iA5 = iA7 + iB12;
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 16:
                            if (a(i9, obj)) {
                                long jD2 = x3.d(obj, j2);
                                iB8 = b0.b(i12);
                                iA6 = b0.a(b0.b(jD2));
                                iA7 = iA6 + iB8;
                                iA5 = iA7 + iB12;
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 17:
                            if (a(i9, obj)) {
                                d2 d2Var = (d2) x3.e(obj, j2);
                                t2 t2VarC2 = c(i9);
                                iB8 = b0.b(i12) * 2;
                                iA6 = ((b) d2Var).getSerializedSize(t2VarC2);
                                iA7 = iA6 + iB8;
                                iA5 = iA7 + iB12;
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 18:
                            iA7 = u2.b(i12, (List) x3.e(obj, j2));
                            iA5 = iA7 + iB12;
                            iB12 = iA5;
                            i9 += 3;
                            i5 = i13;
                            break;
                        case 19:
                            iA7 = u2.a(i12, (List) x3.e(obj, j2));
                            iA5 = iA7 + iB12;
                            iB12 = iA5;
                            i9 += 3;
                            i5 = i13;
                            break;
                        case 20:
                            List list = (List) x3.e(obj, j2);
                            Class cls2 = u2.f56681a;
                            iA7 = list.size() == 0 ? 0 : h2.a(i12, list.size(), u2.c(list));
                            iA5 = iA7 + iB12;
                            iB12 = iA5;
                            i9 += 3;
                            i5 = i13;
                            break;
                        case 21:
                            List list2 = (List) x3.e(obj, j2);
                            Class cls3 = u2.f56681a;
                            int size = list2.size();
                            if (size != 0) {
                                iA7 = h2.a(i12, size, u2.g(list2));
                            }
                            iA5 = iA7 + iB12;
                            iB12 = iA5;
                            i9 += 3;
                            i5 = i13;
                            break;
                        case 22:
                            List list3 = (List) x3.e(obj, j2);
                            Class cls4 = u2.f56681a;
                            int size2 = list3.size();
                            if (size2 != 0) {
                                iA7 = h2.a(i12, size2, u2.b(list3));
                            }
                            iA5 = iA7 + iB12;
                            iB12 = iA5;
                            i9 += 3;
                            i5 = i13;
                            break;
                        case 23:
                            iA7 = u2.b(i12, (List) x3.e(obj, j2));
                            iA5 = iA7 + iB12;
                            iB12 = iA5;
                            i9 += 3;
                            i5 = i13;
                            break;
                        case 24:
                            iA7 = u2.a(i12, (List) x3.e(obj, j2));
                            iA5 = iA7 + iB12;
                            iB12 = iA5;
                            i9 += 3;
                            i5 = i13;
                            break;
                        case 25:
                            List list4 = (List) x3.e(obj, j2);
                            Class cls5 = u2.f56681a;
                            int size3 = list4.size();
                            iB12 = (size3 == 0 ? 0 : (b0.b(i12) + 1) * size3) + iB12;
                            i9 += 3;
                            i5 = i13;
                            break;
                        case 26:
                            iA7 = u2.c(i12, (List) x3.e(obj, j2));
                            iA5 = iA7 + iB12;
                            iB12 = iA5;
                            i9 += 3;
                            i5 = i13;
                            break;
                        case 27:
                            List list5 = (List) x3.e(obj, j2);
                            t2 t2VarC3 = c(i9);
                            Class cls6 = u2.f56681a;
                            int size4 = list5.size();
                            if (size4 == 0) {
                                iB11 = 0;
                            } else {
                                iB11 = b0.b(i12) * size4;
                                for (int i15 = 0; i15 < size4; i15++) {
                                    int serializedSize3 = ((b) ((d2) list5.get(i15))).getSerializedSize(t2VarC3);
                                    iB11 = b0.c(serializedSize3) + serializedSize3 + iB11;
                                }
                            }
                            iB12 = iB11 + iB12;
                            i9 += 3;
                            i5 = i13;
                            break;
                        case 28:
                            List list6 = (List) x3.e(obj, j2);
                            Class cls7 = u2.f56681a;
                            int size5 = list6.size();
                            if (size5 != 0) {
                                iB11 = b0.b(i12) * size5;
                                for (int i16 = 0; i16 < list6.size(); i16++) {
                                    iB11 = b0.a((s) list6.get(i16)) + iB11;
                                }
                            }
                            iB12 = iB11 + iB12;
                            i9 += 3;
                            i5 = i13;
                            break;
                        case 29:
                            List list7 = (List) x3.e(obj, j2);
                            Class cls8 = u2.f56681a;
                            int size6 = list7.size();
                            if (size6 != 0) {
                                iA7 = h2.a(i12, size6, u2.f(list7));
                            }
                            iA5 = iA7 + iB12;
                            iB12 = iA5;
                            i9 += 3;
                            i5 = i13;
                            break;
                        case 30:
                            List list8 = (List) x3.e(obj, j2);
                            Class cls9 = u2.f56681a;
                            int size7 = list8.size();
                            if (size7 != 0) {
                                iA7 = h2.a(i12, size7, u2.a(list8));
                            }
                            iA5 = iA7 + iB12;
                            iB12 = iA5;
                            i9 += 3;
                            i5 = i13;
                            break;
                        case 31:
                            iA7 = u2.a(i12, (List) x3.e(obj, j2));
                            iA5 = iA7 + iB12;
                            iB12 = iA5;
                            i9 += 3;
                            i5 = i13;
                            break;
                        case 32:
                            iA7 = u2.b(i12, (List) x3.e(obj, j2));
                            iA5 = iA7 + iB12;
                            iB12 = iA5;
                            i9 += 3;
                            i5 = i13;
                            break;
                        case 33:
                            List list9 = (List) x3.e(obj, j2);
                            Class cls10 = u2.f56681a;
                            int size8 = list9.size();
                            if (size8 != 0) {
                                iA7 = h2.a(i12, size8, u2.d(list9));
                            }
                            iA5 = iA7 + iB12;
                            iB12 = iA5;
                            i9 += 3;
                            i5 = i13;
                            break;
                        case 34:
                            List list10 = (List) x3.e(obj, j2);
                            Class cls11 = u2.f56681a;
                            int size9 = list10.size();
                            if (size9 != 0) {
                                iA7 = h2.a(i12, size9, u2.e(list10));
                            }
                            iA5 = iA7 + iB12;
                            iB12 = iA5;
                            i9 += 3;
                            i5 = i13;
                            break;
                        case 35:
                            List list11 = (List) unsafe.getObject(obj, j2);
                            Class cls12 = u2.f56681a;
                            int size10 = list11.size() * 8;
                            if (size10 > 0) {
                                iA5 = l0.a(size10, b0.b(i12), size10, iB12);
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 36:
                            List list12 = (List) unsafe.getObject(obj, j2);
                            Class cls13 = u2.f56681a;
                            int size11 = list12.size() * 4;
                            if (size11 > 0) {
                                iA5 = l0.a(size11, b0.b(i12), size11, iB12);
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 37:
                            int iC6 = u2.c((List) unsafe.getObject(obj, j2));
                            if (iC6 > 0) {
                                iA5 = l0.a(iC6, b0.b(i12), iC6, iB12);
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 38:
                            int iG = u2.g((List) unsafe.getObject(obj, j2));
                            if (iG > 0) {
                                iA5 = l0.a(iG, b0.b(i12), iG, iB12);
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 39:
                            int iB14 = u2.b((List) unsafe.getObject(obj, j2));
                            if (iB14 > 0) {
                                iA5 = l0.a(iB14, b0.b(i12), iB14, iB12);
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 40:
                            List list13 = (List) unsafe.getObject(obj, j2);
                            Class cls14 = u2.f56681a;
                            int size12 = list13.size() * 8;
                            if (size12 > 0) {
                                iA5 = l0.a(size12, b0.b(i12), size12, iB12);
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 41:
                            List list14 = (List) unsafe.getObject(obj, j2);
                            Class cls15 = u2.f56681a;
                            int size13 = list14.size() * 4;
                            if (size13 > 0) {
                                iA5 = l0.a(size13, b0.b(i12), size13, iB12);
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 42:
                            List list15 = (List) unsafe.getObject(obj, j2);
                            Class cls16 = u2.f56681a;
                            int size14 = list15.size();
                            if (size14 > 0) {
                                iA5 = l0.a(size14, b0.b(i12), size14, iB12);
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 43:
                            int iF = u2.f((List) unsafe.getObject(obj, j2));
                            if (iF > 0) {
                                iA5 = l0.a(iF, b0.b(i12), iF, iB12);
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 44:
                            int iA9 = u2.a((List) unsafe.getObject(obj, j2));
                            if (iA9 > 0) {
                                iA5 = l0.a(iA9, b0.b(i12), iA9, iB12);
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 45:
                            List list16 = (List) unsafe.getObject(obj, j2);
                            Class cls17 = u2.f56681a;
                            int size15 = list16.size() * 4;
                            if (size15 > 0) {
                                iA5 = l0.a(size15, b0.b(i12), size15, iB12);
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 46:
                            List list17 = (List) unsafe.getObject(obj, j2);
                            Class cls18 = u2.f56681a;
                            int size16 = list17.size() * 8;
                            if (size16 > 0) {
                                iA5 = l0.a(size16, b0.b(i12), size16, iB12);
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 47:
                            int iD = u2.d((List) unsafe.getObject(obj, j2));
                            if (iD > 0) {
                                iA5 = l0.a(iD, b0.b(i12), iD, iB12);
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 48:
                            int iE = u2.e((List) unsafe.getObject(obj, j2));
                            if (iE > 0) {
                                iA5 = l0.a(iE, b0.b(i12), iE, iB12);
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 49:
                            List list18 = (List) x3.e(obj, j2);
                            t2 t2VarC4 = c(i9);
                            Class cls19 = u2.f56681a;
                            int size17 = list18.size();
                            if (size17 != 0) {
                                iB11 = 0;
                                for (int i17 = 0; i17 < size17; i17++) {
                                    iB11 = ((b) ((d2) list18.get(i17))).getSerializedSize(t2VarC4) + (b0.b(i12) * 2) + iB11;
                                }
                            }
                            iB12 = iB11 + iB12;
                            i9 += 3;
                            i5 = i13;
                            break;
                        case 50:
                            z1 z1Var = this.f56597p;
                            Object objE3 = x3.e(obj, j2);
                            Object objB = b(i9);
                            z1Var.getClass();
                            y1 y1Var = (y1) objE3;
                            if (objB == null) {
                                if (y1Var.isEmpty()) {
                                    continue;
                                } else {
                                    Iterator it = y1Var.entrySet().iterator();
                                    if (it.hasNext()) {
                                        Map.Entry entry = (Map.Entry) it.next();
                                        entry.getKey();
                                        entry.getValue();
                                        throw null;
                                    }
                                }
                                i9 += 3;
                                i5 = i13;
                            } else {
                                throw new ClassCastException();
                            }
                            break;
                        case 51:
                            if (a(obj, i12, i9)) {
                                iA5 = g2.a(i12, 8, iB12);
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 52:
                            if (a(obj, i12, i9)) {
                                iA5 = g2.a(i12, 4, iB12);
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 53:
                            if (a(obj, i12, i9)) {
                                long jLongValue = ((Long) x3.e(obj, j2)).longValue();
                                iB8 = b0.b(i12);
                                iA6 = b0.a(jLongValue);
                                iA7 = iA6 + iB8;
                                iA5 = iA7 + iB12;
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 54:
                            if (a(obj, i12, i9)) {
                                long jLongValue2 = ((Long) x3.e(obj, j2)).longValue();
                                iB8 = b0.b(i12);
                                iA6 = b0.a(jLongValue2);
                                iA7 = iA6 + iB8;
                                iA5 = iA7 + iB12;
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 55:
                            if (a(obj, i12, i9)) {
                                int iIntValue = ((Integer) x3.e(obj, j2)).intValue();
                                iB9 = b0.b(i12);
                                if (iIntValue >= 0) {
                                    iC = b0.c(iIntValue);
                                }
                                iA7 = iC + iB9;
                                iA5 = iA7 + iB12;
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 56:
                            if (a(obj, i12, i9)) {
                                iA5 = g2.a(i12, 8, iB12);
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 57:
                            if (a(obj, i12, i9)) {
                                iA5 = g2.a(i12, 4, iB12);
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 58:
                            if (a(obj, i12, i9)) {
                                iA5 = g2.a(i12, 1, iB12);
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 59:
                            if (a(obj, i12, i9)) {
                                Object objE4 = x3.e(obj, j2);
                                if (objE4 instanceof s) {
                                    iB10 = b0.b(i12);
                                    iA8 = b0.a((s) objE4);
                                } else {
                                    iB10 = b0.b(i12);
                                    iA8 = b0.a((String) objE4);
                                }
                                iA7 = iA8 + iB10;
                                iA5 = iA7 + iB12;
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 60:
                            if (a(obj, i12, i9)) {
                                Object objE5 = x3.e(obj, j2);
                                t2 t2VarC5 = c(i9);
                                Class cls20 = u2.f56681a;
                                int iB15 = b0.b(i12);
                                int serializedSize4 = ((b) ((d2) objE5)).getSerializedSize(t2VarC5);
                                iA5 = l0.a(serializedSize4, serializedSize4, iB15, iB12);
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 61:
                            if (a(obj, i12, i9)) {
                                s sVar2 = (s) x3.e(obj, j2);
                                iB10 = b0.b(i12);
                                iA8 = b0.a(sVar2);
                                iA7 = iA8 + iB10;
                                iA5 = iA7 + iB12;
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 62:
                            if (a(obj, i12, i9)) {
                                int iIntValue2 = ((Integer) x3.e(obj, j2)).intValue();
                                iB10 = b0.b(i12);
                                iA8 = b0.c(iIntValue2);
                                iA7 = iA8 + iB10;
                                iA5 = iA7 + iB12;
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 63:
                            if (a(obj, i12, i9)) {
                                int iIntValue3 = ((Integer) x3.e(obj, j2)).intValue();
                                iB10 = b0.b(i12);
                                iA8 = b0.a(iIntValue3);
                                iA7 = iA8 + iB10;
                                iA5 = iA7 + iB12;
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 64:
                            if (a(obj, i12, i9)) {
                                iA5 = g2.a(i12, 4, iB12);
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 65:
                            if (a(obj, i12, i9)) {
                                iA5 = g2.a(i12, 8, iB12);
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 66:
                            if (a(obj, i12, i9)) {
                                int iIntValue4 = ((Integer) x3.e(obj, j2)).intValue();
                                iB8 = b0.b(i12);
                                iA6 = b0.c(b0.d(iIntValue4));
                                iA7 = iA6 + iB8;
                                iA5 = iA7 + iB12;
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 67:
                            if (a(obj, i12, i9)) {
                                long jLongValue3 = ((Long) x3.e(obj, j2)).longValue();
                                iB8 = b0.b(i12);
                                iA6 = b0.a(b0.b(jLongValue3));
                                iA7 = iA6 + iB8;
                                iA5 = iA7 + iB12;
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        case 68:
                            if (a(obj, i12, i9)) {
                                d2 d2Var2 = (d2) x3.e(obj, j2);
                                t2 t2VarC6 = c(i9);
                                iB8 = b0.b(i12) * 2;
                                iA6 = ((b) d2Var2).getSerializedSize(t2VarC6);
                                iA7 = iA6 + iB8;
                                iA5 = iA7 + iB12;
                                iB12 = iA5;
                                i9 += 3;
                                i5 = i13;
                            } else {
                                i9 += 3;
                                i5 = i13;
                            }
                            break;
                        default:
                            i9 += 3;
                            i5 = i13;
                            break;
                    }
                } else {
                    this.f56595n.getClass();
                    return ((z0) obj).unknownFields.a() + iB12;
                }
            }
        } else {
            Unsafe unsafe2 = f56581r;
            int i18 = 1048575;
            int i19 = 0;
            int iA10 = 0;
            int i20 = 0;
            while (true) {
                int[] iArr2 = this.f56582a;
                if (i19 < iArr2.length) {
                    int i21 = iArr2[i19 + 1];
                    int i22 = iArr2[i19];
                    int i23 = (i21 & 267386880) >>> 20;
                    int i24 = i7;
                    if (i23 <= 17) {
                        int i25 = iArr2[i19 + 2];
                        int i26 = i25 & i24;
                        i2 = i8 << (i25 >>> 20);
                        if (i26 != i18) {
                            i20 = unsafe2.getInt(obj, i26);
                            i18 = i26;
                        }
                    } else {
                        i2 = 0;
                    }
                    long j3 = i21 & i24;
                    switch (i23) {
                        case 0:
                            if ((i2 & i20) != 0) {
                                iA10 = g2.a(i22, 8, iA10);
                            }
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 1:
                            if ((i2 & i20) != 0) {
                                iA10 = g2.a(i22, 4, iA10);
                            }
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 2:
                            if ((i2 & i20) != 0) {
                                long j4 = unsafe2.getLong(obj, j3);
                                iB = b0.b(i22);
                                iA = b0.a(j4);
                                iB3 = iB + iA;
                                iA10 = iB3 + iA10;
                                i19 += 3;
                                i7 = i24;
                            } else {
                                i19 += 3;
                                i7 = i24;
                            }
                            break;
                        case 3:
                            if ((i2 & i20) != 0) {
                                long j5 = unsafe2.getLong(obj, j3);
                                iB = b0.b(i22);
                                iA = b0.a(j5);
                                iB3 = iB + iA;
                                iA10 = iB3 + iA10;
                                i19 += 3;
                                i7 = i24;
                            } else {
                                i19 += 3;
                                i7 = i24;
                            }
                            break;
                        case 4:
                            if ((i2 & i20) != 0) {
                                int i27 = unsafe2.getInt(obj, j3);
                                iA = b0.b(i22);
                                iB = i27 >= 0 ? b0.c(i27) : 10;
                                iB3 = iB + iA;
                                iA10 = iB3 + iA10;
                                i19 += 3;
                                i7 = i24;
                            } else {
                                i19 += 3;
                                i7 = i24;
                            }
                            break;
                        case 5:
                            if ((i2 & i20) != 0) {
                                iA10 = g2.a(i22, 8, iA10);
                            }
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 6:
                            if ((i2 & i20) != 0) {
                                iA10 = g2.a(i22, 4, iA10);
                            }
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 7:
                            i3 = i8;
                            if ((i2 & i20) != 0) {
                                i8 = i3;
                                iA10 = g2.a(i22, i8, iA10);
                            } else {
                                i8 = i3;
                            }
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 8:
                            i3 = i8;
                            if ((i2 & i20) != 0) {
                                Object object = unsafe2.getObject(obj, j3);
                                if (object instanceof s) {
                                    iB2 = b0.b(i22);
                                    iA2 = b0.a((s) object);
                                } else {
                                    iB2 = b0.b(i22);
                                    iA2 = b0.a((String) object);
                                }
                                iB3 = iA2 + iB2;
                                i8 = i3;
                                iA10 = iB3 + iA10;
                                i19 += 3;
                                i7 = i24;
                            }
                            i8 = i3;
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 9:
                            i3 = i8;
                            if ((i2 & i20) != 0) {
                                Object object2 = unsafe2.getObject(obj, j3);
                                t2 t2VarC7 = c(i19);
                                Class cls21 = u2.f56681a;
                                int iB16 = b0.b(i22);
                                int serializedSize5 = ((b) ((d2) object2)).getSerializedSize(t2VarC7);
                                iA10 = l0.a(serializedSize5, serializedSize5, iB16, iA10);
                            }
                            i8 = i3;
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 10:
                            i3 = i8;
                            if ((i2 & i20) != 0) {
                                s sVar3 = (s) unsafe2.getObject(obj, j3);
                                iB2 = b0.b(i22);
                                iA2 = b0.a(sVar3);
                                iB3 = iA2 + iB2;
                                i8 = i3;
                                iA10 = iB3 + iA10;
                                i19 += 3;
                                i7 = i24;
                            }
                            i8 = i3;
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 11:
                            i3 = i8;
                            if ((i2 & i20) != 0) {
                                int i28 = unsafe2.getInt(obj, j3);
                                iB2 = b0.b(i22);
                                iA2 = b0.c(i28);
                                iB3 = iA2 + iB2;
                                i8 = i3;
                                iA10 = iB3 + iA10;
                                i19 += 3;
                                i7 = i24;
                            }
                            i8 = i3;
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 12:
                            i3 = i8;
                            if ((i2 & i20) != 0) {
                                int i29 = unsafe2.getInt(obj, j3);
                                iB2 = b0.b(i22);
                                iA2 = b0.a(i29);
                                iB3 = iA2 + iB2;
                                i8 = i3;
                                iA10 = iB3 + iA10;
                                i19 += 3;
                                i7 = i24;
                            }
                            i8 = i3;
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 13:
                            i3 = i8;
                            if ((i2 & i20) != 0) {
                                iA10 = g2.a(i22, 4, iA10);
                            }
                            i8 = i3;
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 14:
                            i3 = i8;
                            if ((i2 & i20) != 0) {
                                iA10 = g2.a(i22, 8, iA10);
                            }
                            i8 = i3;
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 15:
                            i3 = i8;
                            if ((i2 & i20) != 0) {
                                int i30 = unsafe2.getInt(obj, j3);
                                iB4 = b0.b(i22);
                                iA = b0.c(b0.d(i30));
                                iB = iB4;
                                i8 = i3;
                                iB3 = iB + iA;
                                iA10 = iB3 + iA10;
                                i19 += 3;
                                i7 = i24;
                            }
                            i8 = i3;
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 16:
                            i3 = i8;
                            if ((i2 & i20) != 0) {
                                long j6 = unsafe2.getLong(obj, j3);
                                iB4 = b0.b(i22);
                                iA = b0.a(b0.b(j6));
                                iB = iB4;
                                i8 = i3;
                                iB3 = iB + iA;
                                iA10 = iB3 + iA10;
                                i19 += 3;
                                i7 = i24;
                            }
                            i8 = i3;
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 17:
                            i3 = i8;
                            if ((i2 & i20) != 0) {
                                d2 d2Var3 = (d2) unsafe2.getObject(obj, j3);
                                t2 t2VarC8 = c(i19);
                                iB5 = b0.b(i22) * 2;
                                serializedSize = ((b) d2Var3).getSerializedSize(t2VarC8);
                                iB3 = serializedSize + iB5;
                                i8 = i3;
                                iA10 = iB3 + iA10;
                                i19 += 3;
                                i7 = i24;
                            }
                            i8 = i3;
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 18:
                            iB3 = u2.b(i22, (List) unsafe2.getObject(obj, j3));
                            iA10 = iB3 + iA10;
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 19:
                            iB3 = u2.a(i22, (List) unsafe2.getObject(obj, j3));
                            iA10 = iB3 + iA10;
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 20:
                            i3 = i8;
                            List list19 = (List) unsafe2.getObject(obj, j3);
                            Class cls22 = u2.f56681a;
                            iA3 = list19.size() == 0 ? 0 : h2.a(i22, list19.size(), u2.c(list19));
                            iA10 = iA3 + iA10;
                            i8 = i3;
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 21:
                            i3 = i8;
                            List list20 = (List) unsafe2.getObject(obj, j3);
                            Class cls23 = u2.f56681a;
                            int size18 = list20.size();
                            if (size18 != 0) {
                                iA3 = h2.a(i22, size18, u2.g(list20));
                            }
                            iA10 = iA3 + iA10;
                            i8 = i3;
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 22:
                            i3 = i8;
                            List list21 = (List) unsafe2.getObject(obj, j3);
                            Class cls24 = u2.f56681a;
                            int size19 = list21.size();
                            if (size19 != 0) {
                                iA3 = h2.a(i22, size19, u2.b(list21));
                            }
                            iA10 = iA3 + iA10;
                            i8 = i3;
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 23:
                            iB3 = u2.b(i22, (List) unsafe2.getObject(obj, j3));
                            iA10 = iB3 + iA10;
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 24:
                            iB3 = u2.a(i22, (List) unsafe2.getObject(obj, j3));
                            iA10 = iB3 + iA10;
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 25:
                            i3 = i8;
                            List list22 = (List) unsafe2.getObject(obj, j3);
                            Class cls25 = u2.f56681a;
                            int size20 = list22.size();
                            iA10 = (size20 == 0 ? 0 : (b0.b(i22) + 1) * size20) + iA10;
                            i8 = i3;
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 26:
                            iB3 = u2.c(i22, (List) unsafe2.getObject(obj, j3));
                            iA10 = iB3 + iA10;
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 27:
                            i3 = i8;
                            List list23 = (List) unsafe2.getObject(obj, j3);
                            t2 t2VarC9 = c(i19);
                            Class cls26 = u2.f56681a;
                            int size21 = list23.size();
                            if (size21 == 0) {
                                iB6 = 0;
                            } else {
                                iB6 = b0.b(i22) * size21;
                                for (int i31 = 0; i31 < size21; i31++) {
                                    int serializedSize6 = ((b) ((d2) list23.get(i31))).getSerializedSize(t2VarC9);
                                    iB6 += b0.c(serializedSize6) + serializedSize6;
                                }
                            }
                            iA10 = iB6 + iA10;
                            i8 = i3;
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 28:
                            i3 = i8;
                            List list24 = (List) unsafe2.getObject(obj, j3);
                            Class cls27 = u2.f56681a;
                            int size22 = list24.size();
                            if (size22 != 0) {
                                iB6 = b0.b(i22) * size22;
                                for (int i32 = 0; i32 < list24.size(); i32++) {
                                    iB6 += b0.a((s) list24.get(i32));
                                }
                            }
                            iA10 = iB6 + iA10;
                            i8 = i3;
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 29:
                            i3 = i8;
                            List list25 = (List) unsafe2.getObject(obj, j3);
                            Class cls28 = u2.f56681a;
                            int size23 = list25.size();
                            if (size23 != 0) {
                                iA3 = h2.a(i22, size23, u2.f(list25));
                            }
                            iA10 = iA3 + iA10;
                            i8 = i3;
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 30:
                            i3 = i8;
                            List list26 = (List) unsafe2.getObject(obj, j3);
                            Class cls29 = u2.f56681a;
                            int size24 = list26.size();
                            if (size24 != 0) {
                                iA3 = h2.a(i22, size24, u2.a(list26));
                            }
                            iA10 = iA3 + iA10;
                            i8 = i3;
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 31:
                            iB3 = u2.a(i22, (List) unsafe2.getObject(obj, j3));
                            iA10 = iB3 + iA10;
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 32:
                            iB3 = u2.b(i22, (List) unsafe2.getObject(obj, j3));
                            iA10 = iB3 + iA10;
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 33:
                            i3 = i8;
                            List list27 = (List) unsafe2.getObject(obj, j3);
                            Class cls30 = u2.f56681a;
                            int size25 = list27.size();
                            if (size25 != 0) {
                                iA3 = h2.a(i22, size25, u2.d(list27));
                            }
                            iA10 = iA3 + iA10;
                            i8 = i3;
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 34:
                            i3 = i8;
                            List list28 = (List) unsafe2.getObject(obj, j3);
                            Class cls31 = u2.f56681a;
                            int size26 = list28.size();
                            if (size26 != 0) {
                                iA3 = h2.a(i22, size26, u2.e(list28));
                            }
                            iA10 = iA3 + iA10;
                            i8 = i3;
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 35:
                            i3 = i8;
                            List list29 = (List) unsafe2.getObject(obj, j3);
                            Class cls32 = u2.f56681a;
                            int size27 = list29.size() * 8;
                            if (size27 > 0) {
                                iA10 = l0.a(size27, b0.b(i22), size27, iA10);
                            }
                            i8 = i3;
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 36:
                            i3 = i8;
                            List list30 = (List) unsafe2.getObject(obj, j3);
                            Class cls33 = u2.f56681a;
                            int size28 = list30.size() * 4;
                            if (size28 > 0) {
                                iA10 = l0.a(size28, b0.b(i22), size28, iA10);
                            }
                            i8 = i3;
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 37:
                            i3 = i8;
                            int iC7 = u2.c((List) unsafe2.getObject(obj, j3));
                            if (iC7 > 0) {
                                iA10 = l0.a(iC7, b0.b(i22), iC7, iA10);
                            }
                            i8 = i3;
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 38:
                            i3 = i8;
                            int iG2 = u2.g((List) unsafe2.getObject(obj, j3));
                            if (iG2 > 0) {
                                iA10 = l0.a(iG2, b0.b(i22), iG2, iA10);
                            }
                            i8 = i3;
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 39:
                            i3 = i8;
                            int iB17 = u2.b((List) unsafe2.getObject(obj, j3));
                            if (iB17 > 0) {
                                iA10 = l0.a(iB17, b0.b(i22), iB17, iA10);
                            }
                            i8 = i3;
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 40:
                            i3 = i8;
                            List list31 = (List) unsafe2.getObject(obj, j3);
                            Class cls34 = u2.f56681a;
                            int size29 = list31.size() * 8;
                            if (size29 > 0) {
                                iA10 = l0.a(size29, b0.b(i22), size29, iA10);
                            }
                            i8 = i3;
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 41:
                            i3 = i8;
                            List list32 = (List) unsafe2.getObject(obj, j3);
                            Class cls35 = u2.f56681a;
                            int size30 = list32.size() * 4;
                            if (size30 > 0) {
                                iA10 = l0.a(size30, b0.b(i22), size30, iA10);
                            }
                            i8 = i3;
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 42:
                            i3 = i8;
                            List list33 = (List) unsafe2.getObject(obj, j3);
                            Class cls36 = u2.f56681a;
                            int size31 = list33.size();
                            if (size31 > 0) {
                                iA10 = l0.a(size31, b0.b(i22), size31, iA10);
                            }
                            i8 = i3;
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 43:
                            i3 = i8;
                            int iF2 = u2.f((List) unsafe2.getObject(obj, j3));
                            if (iF2 > 0) {
                                iA10 = l0.a(iF2, b0.b(i22), iF2, iA10);
                            }
                            i8 = i3;
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 44:
                            i3 = i8;
                            int iA11 = u2.a((List) unsafe2.getObject(obj, j3));
                            if (iA11 > 0) {
                                iA10 = l0.a(iA11, b0.b(i22), iA11, iA10);
                            }
                            i8 = i3;
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 45:
                            i3 = i8;
                            List list34 = (List) unsafe2.getObject(obj, j3);
                            Class cls37 = u2.f56681a;
                            int size32 = list34.size() * 4;
                            if (size32 > 0) {
                                iA10 = l0.a(size32, b0.b(i22), size32, iA10);
                            }
                            i8 = i3;
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 46:
                            i3 = i8;
                            List list35 = (List) unsafe2.getObject(obj, j3);
                            Class cls38 = u2.f56681a;
                            int size33 = list35.size() * 8;
                            if (size33 > 0) {
                                iA10 = l0.a(size33, b0.b(i22), size33, iA10);
                            }
                            i8 = i3;
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 47:
                            i3 = i8;
                            int iD2 = u2.d((List) unsafe2.getObject(obj, j3));
                            if (iD2 > 0) {
                                iA10 = l0.a(iD2, b0.b(i22), iD2, iA10);
                            }
                            i8 = i3;
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 48:
                            i3 = i8;
                            int iE2 = u2.e((List) unsafe2.getObject(obj, j3));
                            if (iE2 > 0) {
                                iA10 = l0.a(iE2, b0.b(i22), iE2, iA10);
                            }
                            i8 = i3;
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 49:
                            List list36 = (List) unsafe2.getObject(obj, j3);
                            t2 t2VarC10 = c(i19);
                            Class cls39 = u2.f56681a;
                            int size34 = list36.size();
                            if (size34 == 0) {
                                i3 = i8;
                                iB6 = 0;
                                iA10 = iB6 + iA10;
                                i8 = i3;
                                i19 += 3;
                                i7 = i24;
                            } else {
                                int i33 = 0;
                                iB6 = 0;
                                while (i33 < size34) {
                                    iB6 += ((b) ((d2) list36.get(i33))).getSerializedSize(t2VarC10) + (b0.b(i22) * 2);
                                    i33++;
                                    i8 = i8;
                                }
                                i3 = i8;
                                iA10 = iB6 + iA10;
                                i8 = i3;
                                i19 += 3;
                                i7 = i24;
                            }
                            break;
                        case 50:
                            z1 z1Var2 = this.f56597p;
                            Object object3 = unsafe2.getObject(obj, j3);
                            Object objB2 = b(i19);
                            z1Var2.getClass();
                            y1 y1Var2 = (y1) object3;
                            if (objB2 == null) {
                                if (y1Var2.isEmpty()) {
                                    continue;
                                } else {
                                    Iterator it2 = y1Var2.entrySet().iterator();
                                    if (it2.hasNext()) {
                                        Map.Entry entry2 = (Map.Entry) it2.next();
                                        entry2.getKey();
                                        entry2.getValue();
                                        throw null;
                                    }
                                }
                                i19 += 3;
                                i7 = i24;
                            } else {
                                throw new ClassCastException();
                            }
                            break;
                        case 51:
                            if (a(obj, i22, i19)) {
                                iA10 = g2.a(i22, 8, iA10);
                            }
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 52:
                            if (a(obj, i22, i19)) {
                                iA10 = g2.a(i22, 4, iA10);
                            }
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 53:
                            if (a(obj, i22, i19)) {
                                long jLongValue4 = ((Long) x3.e(obj, j3)).longValue();
                                iB = b0.b(i22);
                                iA = b0.a(jLongValue4);
                                iB3 = iB + iA;
                                iA10 = iB3 + iA10;
                                i19 += 3;
                                i7 = i24;
                            } else {
                                i19 += 3;
                                i7 = i24;
                            }
                            break;
                        case 54:
                            if (a(obj, i22, i19)) {
                                long jLongValue5 = ((Long) x3.e(obj, j3)).longValue();
                                iB = b0.b(i22);
                                iA = b0.a(jLongValue5);
                                iB3 = iB + iA;
                                iA10 = iB3 + iA10;
                                i19 += 3;
                                i7 = i24;
                            } else {
                                i19 += 3;
                                i7 = i24;
                            }
                            break;
                        case 55:
                            if (a(obj, i22, i19)) {
                                int iIntValue5 = ((Integer) x3.e(obj, j3)).intValue();
                                iA = b0.b(i22);
                                if (iIntValue5 >= 0) {
                                    iB = b0.c(iIntValue5);
                                }
                                iB3 = iB + iA;
                                iA10 = iB3 + iA10;
                                i19 += 3;
                                i7 = i24;
                            } else {
                                i19 += 3;
                                i7 = i24;
                            }
                            break;
                        case 56:
                            if (a(obj, i22, i19)) {
                                iA10 = g2.a(i22, 8, iA10);
                            }
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 57:
                            if (a(obj, i22, i19)) {
                                iA10 = g2.a(i22, 4, iA10);
                            }
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 58:
                            if (a(obj, i22, i19)) {
                                iA10 = g2.a(i22, i8, iA10);
                            }
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 59:
                            if (a(obj, i22, i19)) {
                                Object object4 = unsafe2.getObject(obj, j3);
                                if (object4 instanceof s) {
                                    iB7 = b0.b(i22);
                                    iA4 = b0.a((s) object4);
                                } else {
                                    iB7 = b0.b(i22);
                                    iA4 = b0.a((String) object4);
                                }
                                iB3 = iA4 + iB7;
                                iA10 = iB3 + iA10;
                                i19 += 3;
                                i7 = i24;
                            } else {
                                i19 += 3;
                                i7 = i24;
                            }
                            break;
                        case 60:
                            if (a(obj, i22, i19)) {
                                Object object5 = unsafe2.getObject(obj, j3);
                                t2 t2VarC11 = c(i19);
                                Class cls40 = u2.f56681a;
                                int iB18 = b0.b(i22);
                                int serializedSize7 = ((b) ((d2) object5)).getSerializedSize(t2VarC11);
                                iA10 = l0.a(serializedSize7, serializedSize7, iB18, iA10);
                            }
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 61:
                            if (a(obj, i22, i19)) {
                                s sVar4 = (s) unsafe2.getObject(obj, j3);
                                iB7 = b0.b(i22);
                                iA4 = b0.a(sVar4);
                                iB3 = iA4 + iB7;
                                iA10 = iB3 + iA10;
                                i19 += 3;
                                i7 = i24;
                            } else {
                                i19 += 3;
                                i7 = i24;
                            }
                            break;
                        case 62:
                            if (a(obj, i22, i19)) {
                                int iIntValue6 = ((Integer) x3.e(obj, j3)).intValue();
                                iB7 = b0.b(i22);
                                iA4 = b0.c(iIntValue6);
                                iB3 = iA4 + iB7;
                                iA10 = iB3 + iA10;
                                i19 += 3;
                                i7 = i24;
                            } else {
                                i19 += 3;
                                i7 = i24;
                            }
                            break;
                        case 63:
                            if (a(obj, i22, i19)) {
                                int iIntValue7 = ((Integer) x3.e(obj, j3)).intValue();
                                iB7 = b0.b(i22);
                                iA4 = b0.a(iIntValue7);
                                iB3 = iA4 + iB7;
                                iA10 = iB3 + iA10;
                                i19 += 3;
                                i7 = i24;
                            } else {
                                i19 += 3;
                                i7 = i24;
                            }
                            break;
                        case 64:
                            if (a(obj, i22, i19)) {
                                iA10 = g2.a(i22, 4, iA10);
                            }
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 65:
                            if (a(obj, i22, i19)) {
                                iA10 = g2.a(i22, 8, iA10);
                            }
                            i19 += 3;
                            i7 = i24;
                            break;
                        case 66:
                            if (a(obj, i22, i19)) {
                                int iIntValue8 = ((Integer) x3.e(obj, j3)).intValue();
                                int iB19 = b0.b(i22);
                                iA = b0.c(b0.d(iIntValue8));
                                iB = iB19;
                                iB3 = iB + iA;
                                iA10 = iB3 + iA10;
                                i19 += 3;
                                i7 = i24;
                            } else {
                                i19 += 3;
                                i7 = i24;
                            }
                            break;
                        case 67:
                            if (a(obj, i22, i19)) {
                                long jLongValue6 = ((Long) x3.e(obj, j3)).longValue();
                                iB = b0.b(i22);
                                iA = b0.a(b0.b(jLongValue6));
                                iB3 = iB + iA;
                                iA10 = iB3 + iA10;
                                i19 += 3;
                                i7 = i24;
                            } else {
                                i19 += 3;
                                i7 = i24;
                            }
                            break;
                        case 68:
                            if (a(obj, i22, i19)) {
                                d2 d2Var4 = (d2) unsafe2.getObject(obj, j3);
                                t2 t2VarC12 = c(i19);
                                iB5 = b0.b(i22) * 2;
                                serializedSize = ((b) d2Var4).getSerializedSize(t2VarC12);
                                i3 = i8;
                                iB3 = serializedSize + iB5;
                                i8 = i3;
                                iA10 = iB3 + iA10;
                                i19 += 3;
                                i7 = i24;
                            } else {
                                i19 += 3;
                                i7 = i24;
                            }
                            break;
                        default:
                            i19 += 3;
                            i7 = i24;
                            break;
                    }
                } else {
                    this.f56595n.getClass();
                    int iA12 = ((z0) obj).unknownFields.a() + iA10;
                    if (!this.f56587f) {
                        return iA12;
                    }
                    this.f56596o.getClass();
                    return ((GeneratedMessageLite$ExtendableMessage) obj).extensions.b() + iA12;
                }
            }
        }
    }

    public static Field a(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public final void d(int i2, Object obj, Object obj2) {
        long j2 = this.f56582a[i2 + 1] & 1048575;
        if (a(i2, obj2)) {
            Object objE = x3.e(obj, j2);
            Object objE2 = x3.e(obj2, j2);
            if (objE != null && objE2 != null) {
                x3.a(j2, obj, l1.a(objE, objE2));
                b(i2, obj);
            } else if (objE2 != null) {
                x3.a(j2, obj, objE2);
                b(i2, obj);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final Object a() {
        k2 k2Var = this.f56593l;
        d2 d2Var = this.f56586e;
        k2Var.getClass();
        return ((z0) d2Var).dynamicMethod(y0.NEW_MUTABLE_INSTANCE);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    @Override // com.fyber.inneractive.sdk.protobuf.t2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        Object obj3;
        obj2.getClass();
        int i2 = 0;
        while (true) {
            int[] iArr = this.f56582a;
            if (i2 < iArr.length) {
                int i3 = iArr[i2 + 1];
                long j2 = 1048575 & i3;
                int i5 = iArr[i2];
                switch ((i3 & 267386880) >>> 20) {
                    case 0:
                        if (!a(i2, obj2)) {
                            obj3 = obj;
                        } else {
                            w3 w3Var = x3.f56720c;
                            obj3 = obj;
                            w3Var.a(obj3, j2, w3Var.c(obj2, j2));
                            b(i2, obj3);
                        }
                        break;
                    case 1:
                        if (a(i2, obj2)) {
                            w3 w3Var2 = x3.f56720c;
                            w3Var2.a(obj, j2, w3Var2.d(obj2, j2));
                            b(i2, obj);
                        }
                        obj3 = obj;
                        break;
                    case 2:
                        if (a(i2, obj2)) {
                            x3.a(obj, j2, x3.d(obj2, j2));
                            b(i2, obj);
                        }
                        obj3 = obj;
                        break;
                    case 3:
                        if (a(i2, obj2)) {
                            x3.a(obj, j2, x3.d(obj2, j2));
                            b(i2, obj);
                        }
                        obj3 = obj;
                        break;
                    case 4:
                        if (a(i2, obj2)) {
                            x3.a(obj, j2, x3.c(obj2, j2));
                            b(i2, obj);
                        }
                        obj3 = obj;
                        break;
                    case 5:
                        if (a(i2, obj2)) {
                            x3.a(obj, j2, x3.d(obj2, j2));
                            b(i2, obj);
                        }
                        obj3 = obj;
                        break;
                    case 6:
                        if (a(i2, obj2)) {
                            x3.a(obj, j2, x3.c(obj2, j2));
                            b(i2, obj);
                        }
                        obj3 = obj;
                        break;
                    case 7:
                        if (a(i2, obj2)) {
                            w3 w3Var3 = x3.f56720c;
                            w3Var3.a(obj, j2, w3Var3.a(obj2, j2));
                            b(i2, obj);
                        }
                        obj3 = obj;
                        break;
                    case 8:
                        if (a(i2, obj2)) {
                            x3.a(j2, obj, x3.e(obj2, j2));
                            b(i2, obj);
                        }
                        obj3 = obj;
                        break;
                    case 9:
                        d(i2, obj, obj2);
                        obj3 = obj;
                        break;
                    case 10:
                        if (a(i2, obj2)) {
                            x3.a(j2, obj, x3.e(obj2, j2));
                            b(i2, obj);
                        }
                        obj3 = obj;
                        break;
                    case 11:
                        if (a(i2, obj2)) {
                            x3.a(obj, j2, x3.c(obj2, j2));
                            b(i2, obj);
                        }
                        obj3 = obj;
                        break;
                    case 12:
                        if (a(i2, obj2)) {
                            x3.a(obj, j2, x3.c(obj2, j2));
                            b(i2, obj);
                        }
                        obj3 = obj;
                        break;
                    case 13:
                        if (a(i2, obj2)) {
                            x3.a(obj, j2, x3.c(obj2, j2));
                            b(i2, obj);
                        }
                        obj3 = obj;
                        break;
                    case 14:
                        if (a(i2, obj2)) {
                            x3.a(obj, j2, x3.d(obj2, j2));
                            b(i2, obj);
                        }
                        obj3 = obj;
                        break;
                    case 15:
                        if (a(i2, obj2)) {
                            x3.a(obj, j2, x3.c(obj2, j2));
                            b(i2, obj);
                        }
                        obj3 = obj;
                        break;
                    case 16:
                        if (a(i2, obj2)) {
                            x3.a(obj, j2, x3.d(obj2, j2));
                            b(i2, obj);
                        }
                        obj3 = obj;
                        break;
                    case 17:
                        d(i2, obj, obj2);
                        obj3 = obj;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.f56594m.a(j2, obj, obj2);
                        obj3 = obj;
                        break;
                    case 50:
                        z1 z1Var = this.f56597p;
                        Class cls = u2.f56681a;
                        Object objE = x3.e(obj, j2);
                        Object objE2 = x3.e(obj2, j2);
                        z1Var.getClass();
                        x3.a(j2, obj, z1.a(objE, objE2));
                        obj3 = obj;
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (a(obj2, i5, i2)) {
                            x3.a(j2, obj, x3.e(obj2, j2));
                            b(obj, i5, i2);
                        }
                        obj3 = obj;
                        break;
                    case 60:
                        e(i2, obj, obj2);
                        obj3 = obj;
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (a(obj2, i5, i2)) {
                            x3.a(j2, obj, x3.e(obj2, j2));
                            b(obj, i5, i2);
                        }
                        obj3 = obj;
                        break;
                    case 68:
                        e(i2, obj, obj2);
                        obj3 = obj;
                        break;
                }
                i2 += 3;
                obj = obj3;
            } else {
                Object obj4 = obj;
                o3 o3Var = this.f56595n;
                Class cls2 = u2.f56681a;
                o3Var.getClass();
                z0 z0Var = (z0) obj4;
                n3 n3VarA = z0Var.unknownFields;
                n3 n3Var = ((z0) obj2).unknownFields;
                if (!n3Var.equals(n3.f56625f)) {
                    n3VarA = n3.a(n3VarA, n3Var);
                }
                z0Var.unknownFields = n3VarA;
                if (this.f56587f) {
                    this.f56596o.getClass();
                    n0 n0Var = ((GeneratedMessageLite$ExtendableMessage) obj2).extensions;
                    if (n0Var.f56621a.isEmpty()) {
                        return;
                    }
                    ((GeneratedMessageLite$ExtendableMessage) obj4).ensureExtensionsAreMutable().a(n0Var);
                    return;
                }
                return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x073e  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0768  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x07bc  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x07d3  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x07ea  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0816  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x082b  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0845  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0858  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0868  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0878  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0888  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0898  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x08a8  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x08b8  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x08c8  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x08d8  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x08e8  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x08f8  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0908  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0918  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0928  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0938  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x094b  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x095b  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x096b  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x097b  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x098b  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x099b  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x09ab  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x09bf  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x09cf  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x09e0  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x09f1  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0a02  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0a13  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0a24  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0a35  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0a46  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0a57  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0a6b  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0a7b  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0a8b  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0a9d  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0aaf  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0ac1  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0ad3  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0ae7  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0aff  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0b0f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0b23  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0b34  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0b45  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0b56  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0b67  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0b78  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0b89  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02fa  */
    @Override // com.fyber.inneractive.sdk.protobuf.t2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, c0 c0Var) {
        Iterator itD;
        Map.Entry entry;
        int i2;
        int i3;
        int i5;
        int i7;
        Map.Entry entry2;
        Iterator w2Var;
        c0Var.getClass();
        int i8 = 267386880;
        int i9 = 0;
        int i10 = 1;
        int i11 = 1048575;
        if (q4.ASCENDING == q4.DESCENDING) {
            this.f56595n.getClass();
            ((z0) obj).unknownFields.a(c0Var);
            if (this.f56587f) {
                this.f56596o.getClass();
                n0 n0Var = ((GeneratedMessageLite$ExtendableMessage) obj).extensions;
                if (n0Var.f56621a.isEmpty()) {
                    entry2 = null;
                    w2Var = null;
                } else {
                    if (n0Var.f56623c) {
                        e3 e3Var = n0Var.f56621a;
                        if (e3Var.f56558g == null) {
                            e3Var.f56558g = new x2(e3Var);
                        }
                        w2Var = new o1(new w2(e3Var.f56558g.f56717b));
                    } else {
                        e3 e3Var2 = n0Var.f56621a;
                        if (e3Var2.f56558g == null) {
                            e3Var2.f56558g = new x2(e3Var2);
                        }
                        w2Var = new w2(e3Var2.f56558g.f56717b);
                    }
                    entry2 = (Map.Entry) w2Var.next();
                }
            }
            for (int length = this.f56582a.length - 3; length >= 0; length -= 3) {
                int[] iArr = this.f56582a;
                int i12 = iArr[length + 1];
                int i13 = iArr[length];
                while (entry2 != null) {
                    this.f56596o.getClass();
                    if (((w0) entry2.getKey()).f56698b > i13) {
                        this.f56596o.getClass();
                        j0.a(c0Var, entry2);
                        entry2 = w2Var.hasNext() ? (Map.Entry) w2Var.next() : null;
                    } else {
                        switch ((i12 & 267386880) >>> 20) {
                            case 0:
                                if (a(length, obj)) {
                                    c0Var.a(i13, x3.f56720c.c(obj, i12 & 1048575));
                                }
                                break;
                            case 1:
                                if (a(length, obj)) {
                                    c0Var.a(i13, x3.f56720c.d(obj, i12 & 1048575));
                                }
                                break;
                            case 2:
                                if (a(length, obj)) {
                                    c0Var.f56538a.b(i13, x3.d(obj, i12 & 1048575));
                                }
                                break;
                            case 3:
                                if (a(length, obj)) {
                                    c0Var.f56538a.b(i13, x3.d(obj, i12 & 1048575));
                                }
                                break;
                            case 4:
                                if (a(length, obj)) {
                                    c0Var.f56538a.b(i13, x3.c(obj, i12 & 1048575));
                                }
                                break;
                            case 5:
                                if (a(length, obj)) {
                                    c0Var.f56538a.a(i13, x3.d(obj, i12 & 1048575));
                                }
                                break;
                            case 6:
                                if (a(length, obj)) {
                                    c0Var.f56538a.a(i13, x3.c(obj, i12 & 1048575));
                                }
                                break;
                            case 7:
                                if (a(length, obj)) {
                                    c0Var.f56538a.a(i13, x3.f56720c.a(obj, i12 & 1048575));
                                }
                                break;
                            case 8:
                                if (a(length, obj)) {
                                    a(i13, x3.e(obj, i12 & 1048575), c0Var);
                                }
                                break;
                            case 9:
                                if (a(length, obj)) {
                                    c0Var.f56538a.a(i13, (d2) x3.e(obj, i12 & 1048575), c(length));
                                }
                                break;
                            case 10:
                                if (a(length, obj)) {
                                    c0Var.f56538a.a(i13, (s) x3.e(obj, i12 & 1048575));
                                }
                                break;
                            case 11:
                                if (a(length, obj)) {
                                    c0Var.f56538a.d(i13, x3.c(obj, i12 & 1048575));
                                }
                                break;
                            case 12:
                                if (a(length, obj)) {
                                    c0Var.f56538a.b(i13, x3.c(obj, i12 & 1048575));
                                }
                                break;
                            case 13:
                                if (a(length, obj)) {
                                    c0Var.f56538a.a(i13, x3.c(obj, i12 & 1048575));
                                }
                                break;
                            case 14:
                                if (a(length, obj)) {
                                    c0Var.f56538a.a(i13, x3.d(obj, i12 & 1048575));
                                }
                                break;
                            case 15:
                                if (a(length, obj)) {
                                    c0Var.a(i13, x3.c(obj, i12 & 1048575));
                                }
                                break;
                            case 16:
                                if (a(length, obj)) {
                                    c0Var.a(i13, x3.d(obj, i12 & 1048575));
                                }
                                break;
                            case 17:
                                if (a(length, obj)) {
                                    c0Var.a(i13, x3.e(obj, i12 & 1048575), c(length));
                                }
                                break;
                            case 18:
                                u2.b(this.f56582a[length], (List) x3.e(obj, i12 & 1048575), c0Var, false);
                                break;
                            case 19:
                                u2.f(this.f56582a[length], (List) x3.e(obj, i12 & 1048575), c0Var, false);
                                break;
                            case 20:
                                u2.h(this.f56582a[length], (List) x3.e(obj, i12 & 1048575), c0Var, false);
                                break;
                            case 21:
                                u2.n(this.f56582a[length], (List) x3.e(obj, i12 & 1048575), c0Var, false);
                                break;
                            case 22:
                                u2.g(this.f56582a[length], (List) x3.e(obj, i12 & 1048575), c0Var, false);
                                break;
                            case 23:
                                u2.e(this.f56582a[length], (List) x3.e(obj, i12 & 1048575), c0Var, false);
                                break;
                            case 24:
                                u2.d(this.f56582a[length], (List) x3.e(obj, i12 & 1048575), c0Var, false);
                                break;
                            case 25:
                                u2.a(this.f56582a[length], (List) x3.e(obj, i12 & 1048575), c0Var, false);
                                break;
                            case 26:
                                u2.b(this.f56582a[length], (List) x3.e(obj, i12 & 1048575), c0Var);
                                break;
                            case 27:
                                u2.b(this.f56582a[length], (List) x3.e(obj, i12 & 1048575), c0Var, c(length));
                                break;
                            case 28:
                                u2.a(this.f56582a[length], (List) x3.e(obj, i12 & 1048575), c0Var);
                                break;
                            case 29:
                                u2.m(this.f56582a[length], (List) x3.e(obj, i12 & 1048575), c0Var, false);
                                break;
                            case 30:
                                u2.c(this.f56582a[length], (List) x3.e(obj, i12 & 1048575), c0Var, false);
                                break;
                            case 31:
                                u2.i(this.f56582a[length], (List) x3.e(obj, i12 & 1048575), c0Var, false);
                                break;
                            case 32:
                                u2.j(this.f56582a[length], (List) x3.e(obj, i12 & 1048575), c0Var, false);
                                break;
                            case 33:
                                u2.k(this.f56582a[length], (List) x3.e(obj, i12 & 1048575), c0Var, false);
                                break;
                            case 34:
                                u2.l(this.f56582a[length], (List) x3.e(obj, i12 & 1048575), c0Var, false);
                                break;
                            case 35:
                                u2.b(this.f56582a[length], (List) x3.e(obj, i12 & 1048575), c0Var, true);
                                break;
                            case 36:
                                u2.f(this.f56582a[length], (List) x3.e(obj, i12 & 1048575), c0Var, true);
                                break;
                            case 37:
                                u2.h(this.f56582a[length], (List) x3.e(obj, i12 & 1048575), c0Var, true);
                                break;
                            case 38:
                                u2.n(this.f56582a[length], (List) x3.e(obj, i12 & 1048575), c0Var, true);
                                break;
                            case 39:
                                u2.g(this.f56582a[length], (List) x3.e(obj, i12 & 1048575), c0Var, true);
                                break;
                            case 40:
                                u2.e(this.f56582a[length], (List) x3.e(obj, i12 & 1048575), c0Var, true);
                                break;
                            case 41:
                                u2.d(this.f56582a[length], (List) x3.e(obj, i12 & 1048575), c0Var, true);
                                break;
                            case 42:
                                u2.a(this.f56582a[length], (List) x3.e(obj, i12 & 1048575), c0Var, true);
                                break;
                            case 43:
                                u2.m(this.f56582a[length], (List) x3.e(obj, i12 & 1048575), c0Var, true);
                                break;
                            case 44:
                                u2.c(this.f56582a[length], (List) x3.e(obj, i12 & 1048575), c0Var, true);
                                break;
                            case 45:
                                u2.i(this.f56582a[length], (List) x3.e(obj, i12 & 1048575), c0Var, true);
                                break;
                            case 46:
                                u2.j(this.f56582a[length], (List) x3.e(obj, i12 & 1048575), c0Var, true);
                                break;
                            case 47:
                                u2.k(this.f56582a[length], (List) x3.e(obj, i12 & 1048575), c0Var, true);
                                break;
                            case 48:
                                u2.l(this.f56582a[length], (List) x3.e(obj, i12 & 1048575), c0Var, true);
                                break;
                            case 49:
                                u2.a(this.f56582a[length], (List) x3.e(obj, i12 & 1048575), c0Var, c(length));
                                break;
                            case 50:
                                if (x3.e(obj, i12 & 1048575) != null) {
                                    z1 z1Var = this.f56597p;
                                    Object objB = b(length);
                                    z1Var.getClass();
                                    objB.getClass();
                                    throw new ClassCastException();
                                }
                                break;
                                break;
                            case 51:
                                if (a(obj, i13, length)) {
                                    c0Var.a(i13, ((Double) x3.e(obj, i12 & 1048575)).doubleValue());
                                }
                                break;
                            case 52:
                                if (a(obj, i13, length)) {
                                    c0Var.a(i13, ((Float) x3.e(obj, i12 & 1048575)).floatValue());
                                }
                                break;
                            case 53:
                                if (a(obj, i13, length)) {
                                    c0Var.f56538a.b(i13, ((Long) x3.e(obj, i12 & 1048575)).longValue());
                                }
                                break;
                            case 54:
                                if (a(obj, i13, length)) {
                                    c0Var.f56538a.b(i13, ((Long) x3.e(obj, i12 & 1048575)).longValue());
                                }
                                break;
                            case 55:
                                if (a(obj, i13, length)) {
                                    c0Var.f56538a.b(i13, ((Integer) x3.e(obj, i12 & 1048575)).intValue());
                                }
                                break;
                            case 56:
                                if (a(obj, i13, length)) {
                                    c0Var.f56538a.a(i13, ((Long) x3.e(obj, i12 & 1048575)).longValue());
                                }
                                break;
                            case 57:
                                if (a(obj, i13, length)) {
                                    c0Var.f56538a.a(i13, ((Integer) x3.e(obj, i12 & 1048575)).intValue());
                                }
                                break;
                            case 58:
                                if (a(obj, i13, length)) {
                                    c0Var.f56538a.a(i13, ((Boolean) x3.e(obj, i12 & 1048575)).booleanValue());
                                }
                                break;
                            case 59:
                                if (a(obj, i13, length)) {
                                    a(i13, x3.e(obj, i12 & 1048575), c0Var);
                                }
                                break;
                            case 60:
                                if (a(obj, i13, length)) {
                                    c0Var.f56538a.a(i13, (d2) x3.e(obj, i12 & 1048575), c(length));
                                }
                                break;
                            case 61:
                                if (a(obj, i13, length)) {
                                    c0Var.f56538a.a(i13, (s) x3.e(obj, i12 & 1048575));
                                }
                                break;
                            case 62:
                                if (a(obj, i13, length)) {
                                    c0Var.f56538a.d(i13, ((Integer) x3.e(obj, i12 & 1048575)).intValue());
                                }
                                break;
                            case 63:
                                if (a(obj, i13, length)) {
                                    c0Var.f56538a.b(i13, ((Integer) x3.e(obj, i12 & 1048575)).intValue());
                                }
                                break;
                            case 64:
                                if (a(obj, i13, length)) {
                                    c0Var.f56538a.a(i13, ((Integer) x3.e(obj, i12 & 1048575)).intValue());
                                }
                                break;
                            case 65:
                                if (a(obj, i13, length)) {
                                    c0Var.f56538a.a(i13, ((Long) x3.e(obj, i12 & 1048575)).longValue());
                                }
                                break;
                            case 66:
                                if (a(obj, i13, length)) {
                                    c0Var.a(i13, ((Integer) x3.e(obj, i12 & 1048575)).intValue());
                                }
                                break;
                            case 67:
                                if (a(obj, i13, length)) {
                                    c0Var.a(i13, ((Long) x3.e(obj, i12 & 1048575)).longValue());
                                }
                                break;
                            case 68:
                                if (a(obj, i13, length)) {
                                    c0Var.a(i13, x3.e(obj, i12 & 1048575), c(length));
                                }
                                break;
                        }
                    }
                }
                switch ((i12 & 267386880) >>> 20) {
                }
            }
            while (entry2 != null) {
                this.f56596o.getClass();
                j0.a(c0Var, entry2);
                entry2 = w2Var.hasNext() ? (Map.Entry) w2Var.next() : null;
            }
            return;
        }
        if (this.f56589h) {
            b(obj, c0Var);
            return;
        }
        if (this.f56587f) {
            this.f56596o.getClass();
            n0 n0Var2 = ((GeneratedMessageLite$ExtendableMessage) obj).extensions;
            if (n0Var2.f56621a.isEmpty()) {
                itD = null;
                entry = null;
            } else {
                itD = n0Var2.d();
                entry = (Map.Entry) itD.next();
            }
        }
        int length2 = this.f56582a.length;
        Unsafe unsafe = f56581r;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1048575;
        while (i14 < length2) {
            int[] iArr2 = this.f56582a;
            int i17 = iArr2[i14 + 1];
            int i18 = i8;
            int i19 = iArr2[i14];
            int i20 = (i17 & i18) >>> 20;
            int i21 = i11;
            if (i20 <= 17) {
                int i22 = iArr2[i14 + 2];
                int i23 = i22 & i21;
                if (i23 != i16) {
                    i15 = unsafe.getInt(obj, i23);
                    i16 = i23;
                }
                i2 = i10 << (i22 >>> 20);
            } else {
                i2 = i9;
            }
            while (entry != null) {
                this.f56596o.getClass();
                if (((w0) entry.getKey()).f56698b <= i19) {
                    this.f56596o.getClass();
                    j0.a(c0Var, entry);
                    entry = itD.hasNext() ? (Map.Entry) itD.next() : null;
                } else {
                    long j2 = i17 & i21;
                    switch (i20) {
                        case 0:
                            i3 = 1;
                            i5 = 0;
                            if ((i15 & i2) != 0) {
                                c0Var.a(i19, x3.f56720c.c(obj, j2));
                            }
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 1:
                            i3 = 1;
                            i5 = 0;
                            if ((i15 & i2) != 0) {
                                c0Var.a(i19, x3.f56720c.d(obj, j2));
                            }
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 2:
                            i3 = 1;
                            i5 = 0;
                            if ((i15 & i2) != 0) {
                                c0Var.f56538a.b(i19, unsafe.getLong(obj, j2));
                            }
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 3:
                            i3 = 1;
                            i5 = 0;
                            if ((i15 & i2) != 0) {
                                c0Var.f56538a.b(i19, unsafe.getLong(obj, j2));
                            }
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 4:
                            i3 = 1;
                            i5 = 0;
                            if ((i15 & i2) != 0) {
                                c0Var.f56538a.b(i19, unsafe.getInt(obj, j2));
                            }
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 5:
                            i3 = 1;
                            i5 = 0;
                            if ((i15 & i2) != 0) {
                                c0Var.f56538a.a(i19, unsafe.getLong(obj, j2));
                            }
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 6:
                            i3 = 1;
                            i5 = 0;
                            if ((i15 & i2) != 0) {
                                c0Var.f56538a.a(i19, unsafe.getInt(obj, j2));
                            }
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 7:
                            i3 = 1;
                            i5 = 0;
                            if ((i15 & i2) != 0) {
                                c0Var.f56538a.a(i19, x3.f56720c.a(obj, j2));
                            }
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 8:
                            i3 = 1;
                            i5 = 0;
                            if ((i15 & i2) != 0) {
                                a(i19, unsafe.getObject(obj, j2), c0Var);
                            }
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 9:
                            i3 = 1;
                            i5 = 0;
                            if ((i15 & i2) != 0) {
                                c0Var.f56538a.a(i19, (d2) unsafe.getObject(obj, j2), c(i14));
                            }
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 10:
                            i3 = 1;
                            i5 = 0;
                            if ((i15 & i2) != 0) {
                                c0Var.f56538a.a(i19, (s) unsafe.getObject(obj, j2));
                            }
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 11:
                            i3 = 1;
                            i5 = 0;
                            if ((i15 & i2) != 0) {
                                c0Var.f56538a.d(i19, unsafe.getInt(obj, j2));
                            }
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 12:
                            i3 = 1;
                            i5 = 0;
                            if ((i15 & i2) != 0) {
                                c0Var.f56538a.b(i19, unsafe.getInt(obj, j2));
                            }
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 13:
                            i3 = 1;
                            i5 = 0;
                            if ((i15 & i2) != 0) {
                                c0Var.f56538a.a(i19, unsafe.getInt(obj, j2));
                            }
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 14:
                            i3 = 1;
                            i5 = 0;
                            if ((i15 & i2) != 0) {
                                c0Var.f56538a.a(i19, unsafe.getLong(obj, j2));
                            }
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 15:
                            i3 = 1;
                            i5 = 0;
                            if ((i15 & i2) != 0) {
                                c0Var.a(i19, unsafe.getInt(obj, j2));
                            }
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 16:
                            i3 = 1;
                            i5 = 0;
                            if ((i15 & i2) != 0) {
                                c0Var.a(i19, unsafe.getLong(obj, j2));
                            }
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 17:
                            i3 = 1;
                            i5 = 0;
                            if ((i15 & i2) != 0) {
                                c0Var.a(i19, unsafe.getObject(obj, j2), c(i14));
                            }
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 18:
                            i7 = 0;
                            i3 = 1;
                            u2.b(this.f56582a[i14], (List) unsafe.getObject(obj, j2), c0Var, false);
                            i5 = i7;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 19:
                            i7 = 0;
                            i3 = 1;
                            u2.f(this.f56582a[i14], (List) unsafe.getObject(obj, j2), c0Var, false);
                            i5 = i7;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 20:
                            i7 = 0;
                            i3 = 1;
                            u2.h(this.f56582a[i14], (List) unsafe.getObject(obj, j2), c0Var, false);
                            i5 = i7;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 21:
                            i7 = 0;
                            i3 = 1;
                            u2.n(this.f56582a[i14], (List) unsafe.getObject(obj, j2), c0Var, false);
                            i5 = i7;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 22:
                            i7 = 0;
                            i3 = 1;
                            u2.g(this.f56582a[i14], (List) unsafe.getObject(obj, j2), c0Var, false);
                            i5 = i7;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 23:
                            i7 = 0;
                            i3 = 1;
                            u2.e(this.f56582a[i14], (List) unsafe.getObject(obj, j2), c0Var, false);
                            i5 = i7;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 24:
                            i7 = 0;
                            i3 = 1;
                            u2.d(this.f56582a[i14], (List) unsafe.getObject(obj, j2), c0Var, false);
                            i5 = i7;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 25:
                            i3 = 1;
                            i7 = 0;
                            u2.a(this.f56582a[i14], (List) unsafe.getObject(obj, j2), c0Var, false);
                            i5 = i7;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 26:
                            i3 = 1;
                            u2.b(this.f56582a[i14], (List) unsafe.getObject(obj, j2), c0Var);
                            i5 = 0;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 27:
                            i3 = 1;
                            u2.b(this.f56582a[i14], (List) unsafe.getObject(obj, j2), c0Var, c(i14));
                            i5 = 0;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 28:
                            i3 = 1;
                            u2.a(this.f56582a[i14], (List) unsafe.getObject(obj, j2), c0Var);
                            i5 = 0;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 29:
                            i7 = 0;
                            i3 = 1;
                            u2.m(this.f56582a[i14], (List) unsafe.getObject(obj, j2), c0Var, false);
                            i5 = i7;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 30:
                            i7 = 0;
                            i3 = 1;
                            u2.c(this.f56582a[i14], (List) unsafe.getObject(obj, j2), c0Var, false);
                            i5 = i7;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 31:
                            i7 = 0;
                            i3 = 1;
                            u2.i(this.f56582a[i14], (List) unsafe.getObject(obj, j2), c0Var, false);
                            i5 = i7;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 32:
                            i7 = 0;
                            i3 = 1;
                            u2.j(this.f56582a[i14], (List) unsafe.getObject(obj, j2), c0Var, false);
                            i5 = i7;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 33:
                            i7 = 0;
                            i3 = 1;
                            u2.k(this.f56582a[i14], (List) unsafe.getObject(obj, j2), c0Var, false);
                            i5 = i7;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 34:
                            i3 = 1;
                            i7 = 0;
                            u2.l(this.f56582a[i14], (List) unsafe.getObject(obj, j2), c0Var, false);
                            i5 = i7;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 35:
                            i3 = 1;
                            u2.b(this.f56582a[i14], (List) unsafe.getObject(obj, j2), c0Var, true);
                            i5 = 0;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 36:
                            i3 = 1;
                            u2.f(this.f56582a[i14], (List) unsafe.getObject(obj, j2), c0Var, true);
                            i5 = 0;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 37:
                            i3 = 1;
                            u2.h(this.f56582a[i14], (List) unsafe.getObject(obj, j2), c0Var, true);
                            i5 = 0;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 38:
                            i3 = 1;
                            u2.n(this.f56582a[i14], (List) unsafe.getObject(obj, j2), c0Var, true);
                            i5 = 0;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 39:
                            i3 = 1;
                            u2.g(this.f56582a[i14], (List) unsafe.getObject(obj, j2), c0Var, true);
                            i5 = 0;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 40:
                            i3 = 1;
                            u2.e(this.f56582a[i14], (List) unsafe.getObject(obj, j2), c0Var, true);
                            i5 = 0;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 41:
                            i3 = 1;
                            u2.d(this.f56582a[i14], (List) unsafe.getObject(obj, j2), c0Var, true);
                            i5 = 0;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 42:
                            i3 = 1;
                            u2.a(this.f56582a[i14], (List) unsafe.getObject(obj, j2), c0Var, true);
                            i5 = 0;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 43:
                            i3 = 1;
                            u2.m(this.f56582a[i14], (List) unsafe.getObject(obj, j2), c0Var, true);
                            i5 = 0;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 44:
                            i3 = 1;
                            u2.c(this.f56582a[i14], (List) unsafe.getObject(obj, j2), c0Var, true);
                            i5 = 0;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 45:
                            i3 = 1;
                            u2.i(this.f56582a[i14], (List) unsafe.getObject(obj, j2), c0Var, true);
                            i5 = 0;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 46:
                            i3 = 1;
                            u2.j(this.f56582a[i14], (List) unsafe.getObject(obj, j2), c0Var, true);
                            i5 = 0;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 47:
                            i3 = 1;
                            u2.k(this.f56582a[i14], (List) unsafe.getObject(obj, j2), c0Var, true);
                            i5 = 0;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 48:
                            i3 = 1;
                            u2.l(this.f56582a[i14], (List) unsafe.getObject(obj, j2), c0Var, true);
                            i5 = 0;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 49:
                            u2.a(this.f56582a[i14], (List) unsafe.getObject(obj, j2), c0Var, c(i14));
                            i3 = 1;
                            i5 = 0;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 50:
                            if (unsafe.getObject(obj, j2) != null) {
                                z1 z1Var2 = this.f56597p;
                                Object objB2 = b(i14);
                                z1Var2.getClass();
                                objB2.getClass();
                                throw new ClassCastException();
                            }
                            i3 = 1;
                            i5 = 0;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 51:
                            if (a(obj, i19, i14)) {
                                c0Var.a(i19, ((Double) x3.e(obj, j2)).doubleValue());
                            }
                            i3 = 1;
                            i5 = 0;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 52:
                            if (a(obj, i19, i14)) {
                                c0Var.a(i19, ((Float) x3.e(obj, j2)).floatValue());
                            }
                            i3 = 1;
                            i5 = 0;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 53:
                            if (a(obj, i19, i14)) {
                                c0Var.f56538a.b(i19, ((Long) x3.e(obj, j2)).longValue());
                            }
                            i3 = 1;
                            i5 = 0;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 54:
                            if (a(obj, i19, i14)) {
                                c0Var.f56538a.b(i19, ((Long) x3.e(obj, j2)).longValue());
                            }
                            i3 = 1;
                            i5 = 0;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 55:
                            if (a(obj, i19, i14)) {
                                c0Var.f56538a.b(i19, ((Integer) x3.e(obj, j2)).intValue());
                            }
                            i3 = 1;
                            i5 = 0;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 56:
                            if (a(obj, i19, i14)) {
                                c0Var.f56538a.a(i19, ((Long) x3.e(obj, j2)).longValue());
                            }
                            i3 = 1;
                            i5 = 0;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 57:
                            if (a(obj, i19, i14)) {
                                c0Var.f56538a.a(i19, ((Integer) x3.e(obj, j2)).intValue());
                            }
                            i3 = 1;
                            i5 = 0;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 58:
                            if (a(obj, i19, i14)) {
                                c0Var.f56538a.a(i19, ((Boolean) x3.e(obj, j2)).booleanValue());
                            }
                            i3 = 1;
                            i5 = 0;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 59:
                            if (a(obj, i19, i14)) {
                                a(i19, unsafe.getObject(obj, j2), c0Var);
                            }
                            i3 = 1;
                            i5 = 0;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 60:
                            if (a(obj, i19, i14)) {
                                c0Var.f56538a.a(i19, (d2) unsafe.getObject(obj, j2), c(i14));
                            }
                            i3 = 1;
                            i5 = 0;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 61:
                            if (a(obj, i19, i14)) {
                                c0Var.f56538a.a(i19, (s) unsafe.getObject(obj, j2));
                            }
                            i3 = 1;
                            i5 = 0;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 62:
                            if (a(obj, i19, i14)) {
                                c0Var.f56538a.d(i19, ((Integer) x3.e(obj, j2)).intValue());
                            }
                            i3 = 1;
                            i5 = 0;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 63:
                            if (a(obj, i19, i14)) {
                                c0Var.f56538a.b(i19, ((Integer) x3.e(obj, j2)).intValue());
                            }
                            i3 = 1;
                            i5 = 0;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 64:
                            if (a(obj, i19, i14)) {
                                c0Var.f56538a.a(i19, ((Integer) x3.e(obj, j2)).intValue());
                            }
                            i3 = 1;
                            i5 = 0;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 65:
                            if (a(obj, i19, i14)) {
                                c0Var.f56538a.a(i19, ((Long) x3.e(obj, j2)).longValue());
                            }
                            i3 = 1;
                            i5 = 0;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 66:
                            if (a(obj, i19, i14)) {
                                c0Var.a(i19, ((Integer) x3.e(obj, j2)).intValue());
                            }
                            i3 = 1;
                            i5 = 0;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 67:
                            if (a(obj, i19, i14)) {
                                c0Var.a(i19, ((Long) x3.e(obj, j2)).longValue());
                            }
                            i3 = 1;
                            i5 = 0;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        case 68:
                            if (a(obj, i19, i14)) {
                                c0Var.a(i19, unsafe.getObject(obj, j2), c(i14));
                            }
                            i3 = 1;
                            i5 = 0;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                        default:
                            i3 = 1;
                            i5 = 0;
                            i14 += 3;
                            i10 = i3;
                            i9 = i5;
                            i8 = i18;
                            i11 = i21;
                            break;
                    }
                }
            }
            long j22 = i17 & i21;
            switch (i20) {
            }
        }
        while (entry != null) {
            this.f56596o.getClass();
            j0.a(c0Var, entry);
            entry = itD.hasNext() ? (Map.Entry) itD.next() : null;
        }
        this.f56595n.getClass();
        ((z0) obj).unknownFields.a(c0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0377  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Object obj, c0 c0Var) {
        Iterator itD;
        Map.Entry entry;
        if (this.f56587f) {
            this.f56596o.getClass();
            n0 n0Var = ((GeneratedMessageLite$ExtendableMessage) obj).extensions;
            if (n0Var.f56621a.isEmpty()) {
                itD = null;
                entry = null;
            } else {
                itD = n0Var.d();
                entry = (Map.Entry) itD.next();
            }
        }
        int length = this.f56582a.length;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int[] iArr = this.f56582a;
            int i3 = iArr[i2 + 1];
            int i5 = iArr[i2];
            while (entry != null) {
                this.f56596o.getClass();
                if (((w0) entry.getKey()).f56698b <= i5) {
                    this.f56596o.getClass();
                    j0.a(c0Var, entry);
                    entry = itD.hasNext() ? (Map.Entry) itD.next() : null;
                } else {
                    switch ((267386880 & i3) >>> 20) {
                        case 0:
                            if (a(i2, obj)) {
                                c0Var.a(i5, x3.f56720c.c(obj, i3 & 1048575));
                            }
                            break;
                        case 1:
                            if (a(i2, obj)) {
                                c0Var.a(i5, x3.f56720c.d(obj, i3 & 1048575));
                            }
                            break;
                        case 2:
                            if (a(i2, obj)) {
                                c0Var.f56538a.b(i5, x3.d(obj, i3 & 1048575));
                            }
                            break;
                        case 3:
                            if (a(i2, obj)) {
                                c0Var.f56538a.b(i5, x3.d(obj, i3 & 1048575));
                            }
                            break;
                        case 4:
                            if (a(i2, obj)) {
                                c0Var.f56538a.b(i5, x3.c(obj, i3 & 1048575));
                            }
                            break;
                        case 5:
                            if (a(i2, obj)) {
                                c0Var.f56538a.a(i5, x3.d(obj, i3 & 1048575));
                            }
                            break;
                        case 6:
                            if (a(i2, obj)) {
                                c0Var.f56538a.a(i5, x3.c(obj, i3 & 1048575));
                            }
                            break;
                        case 7:
                            if (a(i2, obj)) {
                                c0Var.f56538a.a(i5, x3.f56720c.a(obj, i3 & 1048575));
                            }
                            break;
                        case 8:
                            if (a(i2, obj)) {
                                a(i5, x3.e(obj, i3 & 1048575), c0Var);
                            }
                            break;
                        case 9:
                            if (a(i2, obj)) {
                                c0Var.f56538a.a(i5, (d2) x3.e(obj, i3 & 1048575), c(i2));
                            }
                            break;
                        case 10:
                            if (a(i2, obj)) {
                                c0Var.f56538a.a(i5, (s) x3.e(obj, i3 & 1048575));
                            }
                            break;
                        case 11:
                            if (a(i2, obj)) {
                                c0Var.f56538a.d(i5, x3.c(obj, i3 & 1048575));
                            }
                            break;
                        case 12:
                            if (a(i2, obj)) {
                                c0Var.f56538a.b(i5, x3.c(obj, i3 & 1048575));
                            }
                            break;
                        case 13:
                            if (a(i2, obj)) {
                                c0Var.f56538a.a(i5, x3.c(obj, i3 & 1048575));
                            }
                            break;
                        case 14:
                            if (a(i2, obj)) {
                                c0Var.f56538a.a(i5, x3.d(obj, i3 & 1048575));
                            }
                            break;
                        case 15:
                            if (a(i2, obj)) {
                                c0Var.a(i5, x3.c(obj, i3 & 1048575));
                            }
                            break;
                        case 16:
                            if (a(i2, obj)) {
                                c0Var.a(i5, x3.d(obj, i3 & 1048575));
                            }
                            break;
                        case 17:
                            if (a(i2, obj)) {
                                c0Var.a(i5, x3.e(obj, i3 & 1048575), c(i2));
                            }
                            break;
                        case 18:
                            u2.b(this.f56582a[i2], (List) x3.e(obj, i3 & 1048575), c0Var, false);
                            break;
                        case 19:
                            u2.f(this.f56582a[i2], (List) x3.e(obj, i3 & 1048575), c0Var, false);
                            break;
                        case 20:
                            u2.h(this.f56582a[i2], (List) x3.e(obj, i3 & 1048575), c0Var, false);
                            break;
                        case 21:
                            u2.n(this.f56582a[i2], (List) x3.e(obj, i3 & 1048575), c0Var, false);
                            break;
                        case 22:
                            u2.g(this.f56582a[i2], (List) x3.e(obj, i3 & 1048575), c0Var, false);
                            break;
                        case 23:
                            u2.e(this.f56582a[i2], (List) x3.e(obj, i3 & 1048575), c0Var, false);
                            break;
                        case 24:
                            u2.d(this.f56582a[i2], (List) x3.e(obj, i3 & 1048575), c0Var, false);
                            break;
                        case 25:
                            u2.a(this.f56582a[i2], (List) x3.e(obj, i3 & 1048575), c0Var, false);
                            break;
                        case 26:
                            u2.b(this.f56582a[i2], (List) x3.e(obj, i3 & 1048575), c0Var);
                            break;
                        case 27:
                            u2.b(this.f56582a[i2], (List) x3.e(obj, i3 & 1048575), c0Var, c(i2));
                            break;
                        case 28:
                            u2.a(this.f56582a[i2], (List) x3.e(obj, i3 & 1048575), c0Var);
                            break;
                        case 29:
                            u2.m(this.f56582a[i2], (List) x3.e(obj, i3 & 1048575), c0Var, false);
                            break;
                        case 30:
                            u2.c(this.f56582a[i2], (List) x3.e(obj, i3 & 1048575), c0Var, false);
                            break;
                        case 31:
                            u2.i(this.f56582a[i2], (List) x3.e(obj, i3 & 1048575), c0Var, false);
                            break;
                        case 32:
                            u2.j(this.f56582a[i2], (List) x3.e(obj, i3 & 1048575), c0Var, false);
                            break;
                        case 33:
                            u2.k(this.f56582a[i2], (List) x3.e(obj, i3 & 1048575), c0Var, false);
                            break;
                        case 34:
                            u2.l(this.f56582a[i2], (List) x3.e(obj, i3 & 1048575), c0Var, false);
                            break;
                        case 35:
                            u2.b(this.f56582a[i2], (List) x3.e(obj, i3 & 1048575), c0Var, true);
                            break;
                        case 36:
                            u2.f(this.f56582a[i2], (List) x3.e(obj, i3 & 1048575), c0Var, true);
                            break;
                        case 37:
                            u2.h(this.f56582a[i2], (List) x3.e(obj, i3 & 1048575), c0Var, true);
                            break;
                        case 38:
                            u2.n(this.f56582a[i2], (List) x3.e(obj, i3 & 1048575), c0Var, true);
                            break;
                        case 39:
                            u2.g(this.f56582a[i2], (List) x3.e(obj, i3 & 1048575), c0Var, true);
                            break;
                        case 40:
                            u2.e(this.f56582a[i2], (List) x3.e(obj, i3 & 1048575), c0Var, true);
                            break;
                        case 41:
                            u2.d(this.f56582a[i2], (List) x3.e(obj, i3 & 1048575), c0Var, true);
                            break;
                        case 42:
                            u2.a(this.f56582a[i2], (List) x3.e(obj, i3 & 1048575), c0Var, true);
                            break;
                        case 43:
                            u2.m(this.f56582a[i2], (List) x3.e(obj, i3 & 1048575), c0Var, true);
                            break;
                        case 44:
                            u2.c(this.f56582a[i2], (List) x3.e(obj, i3 & 1048575), c0Var, true);
                            break;
                        case 45:
                            u2.i(this.f56582a[i2], (List) x3.e(obj, i3 & 1048575), c0Var, true);
                            break;
                        case 46:
                            u2.j(this.f56582a[i2], (List) x3.e(obj, i3 & 1048575), c0Var, true);
                            break;
                        case 47:
                            u2.k(this.f56582a[i2], (List) x3.e(obj, i3 & 1048575), c0Var, true);
                            break;
                        case 48:
                            u2.l(this.f56582a[i2], (List) x3.e(obj, i3 & 1048575), c0Var, true);
                            break;
                        case 49:
                            u2.a(this.f56582a[i2], (List) x3.e(obj, i3 & 1048575), c0Var, c(i2));
                            break;
                        case 50:
                            if (x3.e(obj, i3 & 1048575) != null) {
                                z1 z1Var = this.f56597p;
                                Object objB = b(i2);
                                z1Var.getClass();
                                objB.getClass();
                                throw new ClassCastException();
                            }
                            break;
                            break;
                        case 51:
                            if (a(obj, i5, i2)) {
                                c0Var.a(i5, ((Double) x3.e(obj, i3 & 1048575)).doubleValue());
                            }
                            break;
                        case 52:
                            if (a(obj, i5, i2)) {
                                c0Var.a(i5, ((Float) x3.e(obj, i3 & 1048575)).floatValue());
                            }
                            break;
                        case 53:
                            if (a(obj, i5, i2)) {
                                c0Var.f56538a.b(i5, ((Long) x3.e(obj, i3 & 1048575)).longValue());
                            }
                            break;
                        case 54:
                            if (a(obj, i5, i2)) {
                                c0Var.f56538a.b(i5, ((Long) x3.e(obj, i3 & 1048575)).longValue());
                            }
                            break;
                        case 55:
                            if (a(obj, i5, i2)) {
                                c0Var.f56538a.b(i5, ((Integer) x3.e(obj, i3 & 1048575)).intValue());
                            }
                            break;
                        case 56:
                            if (a(obj, i5, i2)) {
                                c0Var.f56538a.a(i5, ((Long) x3.e(obj, i3 & 1048575)).longValue());
                            }
                            break;
                        case 57:
                            if (a(obj, i5, i2)) {
                                c0Var.f56538a.a(i5, ((Integer) x3.e(obj, i3 & 1048575)).intValue());
                            }
                            break;
                        case 58:
                            if (a(obj, i5, i2)) {
                                c0Var.f56538a.a(i5, ((Boolean) x3.e(obj, i3 & 1048575)).booleanValue());
                            }
                            break;
                        case 59:
                            if (a(obj, i5, i2)) {
                                a(i5, x3.e(obj, i3 & 1048575), c0Var);
                            }
                            break;
                        case 60:
                            if (a(obj, i5, i2)) {
                                c0Var.f56538a.a(i5, (d2) x3.e(obj, i3 & 1048575), c(i2));
                            }
                            break;
                        case 61:
                            if (a(obj, i5, i2)) {
                                c0Var.f56538a.a(i5, (s) x3.e(obj, i3 & 1048575));
                            }
                            break;
                        case 62:
                            if (a(obj, i5, i2)) {
                                c0Var.f56538a.d(i5, ((Integer) x3.e(obj, i3 & 1048575)).intValue());
                            }
                            break;
                        case 63:
                            if (a(obj, i5, i2)) {
                                c0Var.f56538a.b(i5, ((Integer) x3.e(obj, i3 & 1048575)).intValue());
                            }
                            break;
                        case 64:
                            if (a(obj, i5, i2)) {
                                c0Var.f56538a.a(i5, ((Integer) x3.e(obj, i3 & 1048575)).intValue());
                            }
                            break;
                        case 65:
                            if (a(obj, i5, i2)) {
                                c0Var.f56538a.a(i5, ((Long) x3.e(obj, i3 & 1048575)).longValue());
                            }
                            break;
                        case 66:
                            if (a(obj, i5, i2)) {
                                c0Var.a(i5, ((Integer) x3.e(obj, i3 & 1048575)).intValue());
                            }
                            break;
                        case 67:
                            if (a(obj, i5, i2)) {
                                c0Var.a(i5, ((Long) x3.e(obj, i3 & 1048575)).longValue());
                            }
                            break;
                        case 68:
                            if (a(obj, i5, i2)) {
                                c0Var.a(i5, x3.e(obj, i3 & 1048575), c(i2));
                            }
                            break;
                    }
                }
            }
            switch ((267386880 & i3) >>> 20) {
            }
        }
        while (entry != null) {
            this.f56596o.getClass();
            j0.a(c0Var, entry);
            entry = itD.hasNext() ? (Map.Entry) itD.next() : null;
        }
        this.f56595n.getClass();
        ((z0) obj).unknownFields.a(c0Var);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final void a(Object obj, s2 s2Var, h0 h0Var) throws Throwable {
        h0Var.getClass();
        a(this.f56595n, this.f56596o, obj, s2Var, h0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:360:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0711 A[Catch: all -> 0x0722, TryCatch #3 {all -> 0x0722, blocks: (B:215:0x070c, B:217:0x0711, B:219:0x071a, B:223:0x0725), top: B:243:0x070c }] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x074a A[LOOP:3: B:234:0x0746->B:236:0x074a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x072b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(o3 o3Var, j0 j0Var, Object obj, s2 s2Var, h0 h0Var) throws Throwable {
        o3 o3Var2;
        Object obj2;
        i2 i2Var;
        int i2;
        int iS;
        int i3;
        x0 x0VarA;
        s2 s2Var2;
        h0 h0Var2;
        s2 s2Var3;
        Object objA;
        i2 i2Var2 = this;
        Object obj3 = obj;
        h0 h0Var3 = h0Var;
        Object objB = null;
        n0 n0VarEnsureExtensionsAreMutable = null;
        while (true) {
            try {
                iS = s2Var.s();
            } catch (Throwable th) {
                th = th;
                o3Var2 = o3Var;
            }
            if (iS >= i2Var2.f56584c) {
                try {
                    int iA = iS <= i2Var2.f56585d ? i2Var2.a(iS, 0) : -1;
                    i3 = iA;
                } catch (Throwable th2) {
                    th = th2;
                    o3Var2 = o3Var;
                }
                if (i3 >= 0) {
                    o3Var2 = o3Var;
                    Object obj4 = objB;
                    try {
                        int i5 = i2Var2.f56582a[i3 + 1];
                        switch ((267386880 & i5) >>> 20) {
                            case 0:
                                s2Var2 = s2Var;
                                h0Var2 = h0Var3;
                                i2Var = i2Var2;
                                try {
                                } catch (m1 unused) {
                                    obj2 = obj;
                                } catch (Throwable th3) {
                                    th = th3;
                                    obj2 = obj;
                                }
                                try {
                                    x3.f56720c.a(obj, d(i5), s2Var2.h());
                                    obj2 = obj;
                                    i2Var.b(i3, obj2);
                                    i2Var2 = i2Var;
                                    objB = obj4;
                                } catch (m1 unused2) {
                                    obj2 = obj;
                                    objB = obj4;
                                    try {
                                        o3Var2.getClass();
                                        if (objB == null) {
                                        }
                                        if (o3.a(objB, s2Var2)) {
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    obj2 = obj;
                                    objB = obj4;
                                    while (i2 < i2Var.f56592k) {
                                    }
                                    if (objB != null) {
                                    }
                                    throw th;
                                }
                                h0Var3 = h0Var2;
                                break;
                            case 1:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                x3.f56720c.a(obj2, d(i5), s2Var.k());
                                i2Var.b(i3, obj2);
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 2:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                x3.a(obj2, d(i5), s2Var.o());
                                i2Var.b(i3, obj2);
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 3:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                x3.a(obj2, d(i5), s2Var.f());
                                i2Var.b(i3, obj2);
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 4:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                x3.a(obj2, d(i5), s2Var.d());
                                i2Var.b(i3, obj2);
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 5:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                x3.a(obj2, d(i5), s2Var.g());
                                i2Var.b(i3, obj2);
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 6:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                x3.a(obj2, d(i5), s2Var.q());
                                i2Var.b(i3, obj2);
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 7:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                x3.f56720c.a(obj2, d(i5), s2Var.r());
                                i2Var.b(i3, obj2);
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 8:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                if ((i5 & 536870912) != 0) {
                                    x3.a(i5 & 1048575, obj2, s2Var.p());
                                } else if (i2Var.f56588g) {
                                    x3.a(i5 & 1048575, obj2, s2Var.n());
                                } else {
                                    x3.a(i5 & 1048575, obj2, s2Var.a());
                                }
                                i2Var.b(i3, obj2);
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 9:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                if (i2Var.a(i3, obj2)) {
                                    x3.a(d(i5), obj2, l1.a(x3.e(obj2, d(i5)), s2Var.b(i2Var.c(i3), h0Var2)));
                                } else {
                                    x3.a(d(i5), obj2, s2Var.b(i2Var.c(i3), h0Var2));
                                    i2Var.b(i3, obj2);
                                }
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 10:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                x3.a(d(i5), obj2, s2Var.a());
                                i2Var.b(i3, obj2);
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 11:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                x3.a(obj2, d(i5), s2Var.c());
                                i2Var.b(i3, obj2);
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 12:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                int iB = s2Var.b();
                                i2Var.a(i3);
                                x3.a(obj2, d(i5), iB);
                                i2Var.b(i3, obj2);
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 13:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                x3.a(obj2, d(i5), s2Var.m());
                                i2Var.b(i3, obj2);
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 14:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                x3.a(obj2, d(i5), s2Var.t());
                                i2Var.b(i3, obj2);
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 15:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                x3.a(obj2, d(i5), s2Var.j());
                                i2Var.b(i3, obj2);
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 16:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                x3.a(obj2, d(i5), s2Var.l());
                                i2Var.b(i3, obj2);
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 17:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                if (i2Var.a(i3, obj2)) {
                                    x3.a(d(i5), obj2, l1.a(x3.e(obj2, d(i5)), s2Var.a(i2Var.c(i3), h0Var2)));
                                } else {
                                    x3.a(d(i5), obj2, s2Var.a(i2Var.c(i3), h0Var2));
                                    i2Var.b(i3, obj2);
                                }
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 18:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                s2Var.j(i2Var.f56594m.b(obj2, d(i5)));
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 19:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                s2Var.d(i2Var.f56594m.b(obj2, d(i5)));
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 20:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                s2Var.k(i2Var.f56594m.b(obj2, d(i5)));
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 21:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                s2Var.a(i2Var.f56594m.b(obj2, d(i5)));
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 22:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                s2Var.o(i2Var.f56594m.b(obj2, d(i5)));
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 23:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                s2Var.n(i2Var.f56594m.b(obj2, d(i5)));
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 24:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                s2Var.e(i2Var.f56594m.b(obj2, d(i5)));
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 25:
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                s2Var.l(i2Var.f56594m.b(obj2, d(i5)));
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 26:
                                s2Var2 = s2Var;
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                try {
                                    i2Var.a(obj2, i5, s2Var2);
                                    i2Var2 = i2Var;
                                    objB = obj4;
                                } catch (m1 unused3) {
                                    objB = obj4;
                                    o3Var2.getClass();
                                    if (objB == null) {
                                    }
                                    if (o3.a(objB, s2Var2)) {
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    objB = obj4;
                                    while (i2 < i2Var.f56592k) {
                                    }
                                    if (objB != null) {
                                    }
                                    throw th;
                                }
                                h0Var3 = h0Var2;
                                break;
                            case 27:
                                obj2 = obj3;
                                try {
                                    i2Var2.a(obj2, i5, s2Var, i2Var2.c(i3), h0Var);
                                    i2Var = i2Var2;
                                    h0Var2 = h0Var;
                                    i2Var2 = i2Var;
                                    objB = obj4;
                                } catch (m1 unused4) {
                                    i2Var = i2Var2;
                                    s2Var2 = s2Var;
                                    h0Var2 = h0Var;
                                    objB = obj4;
                                    o3Var2.getClass();
                                    if (objB == null) {
                                    }
                                    if (o3.a(objB, s2Var2)) {
                                    }
                                }
                                h0Var3 = h0Var2;
                                break;
                            case 28:
                                s2Var3 = s2Var;
                                obj2 = obj3;
                                s2Var3.h(i2Var2.f56594m.b(obj2, d(i5)));
                                h0Var2 = h0Var;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 29:
                                s2Var3 = s2Var;
                                obj2 = obj3;
                                s2Var3.i(i2Var2.f56594m.b(obj2, d(i5)));
                                h0Var2 = h0Var;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 30:
                                obj2 = obj3;
                                List listB = i2Var2.f56594m.b(obj2, d(i5));
                                s2Var.p(listB);
                                i2Var2.a(i3);
                                objA = u2.a(iS, listB, obj4, o3Var2);
                                objB = objA;
                                h0Var3 = h0Var;
                                break;
                            case 31:
                                s2Var3 = s2Var;
                                obj2 = obj3;
                                s2Var3.f(i2Var2.f56594m.b(obj2, d(i5)));
                                h0Var2 = h0Var;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 32:
                                s2Var3 = s2Var;
                                obj2 = obj3;
                                s2Var3.m(i2Var2.f56594m.b(obj2, d(i5)));
                                h0Var2 = h0Var;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 33:
                                s2Var3 = s2Var;
                                obj2 = obj3;
                                s2Var3.c(i2Var2.f56594m.b(obj2, d(i5)));
                                h0Var2 = h0Var;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 34:
                                s2Var3 = s2Var;
                                obj2 = obj3;
                                s2Var3.g(i2Var2.f56594m.b(obj2, d(i5)));
                                h0Var2 = h0Var;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 35:
                                s2Var3 = s2Var;
                                obj2 = obj3;
                                s2Var3.j(i2Var2.f56594m.b(obj2, d(i5)));
                                h0Var2 = h0Var;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 36:
                                s2Var3 = s2Var;
                                obj2 = obj3;
                                s2Var3.d(i2Var2.f56594m.b(obj2, d(i5)));
                                h0Var2 = h0Var;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 37:
                                s2Var3 = s2Var;
                                obj2 = obj3;
                                s2Var3.k(i2Var2.f56594m.b(obj2, d(i5)));
                                h0Var2 = h0Var;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 38:
                                s2Var3 = s2Var;
                                obj2 = obj3;
                                s2Var3.a(i2Var2.f56594m.b(obj2, d(i5)));
                                h0Var2 = h0Var;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 39:
                                s2Var3 = s2Var;
                                obj2 = obj3;
                                s2Var3.o(i2Var2.f56594m.b(obj2, d(i5)));
                                h0Var2 = h0Var;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 40:
                                s2Var3 = s2Var;
                                obj2 = obj3;
                                s2Var3.n(i2Var2.f56594m.b(obj2, d(i5)));
                                h0Var2 = h0Var;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 41:
                                s2Var3 = s2Var;
                                obj2 = obj3;
                                s2Var3.e(i2Var2.f56594m.b(obj2, d(i5)));
                                h0Var2 = h0Var;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 42:
                                s2Var3 = s2Var;
                                obj2 = obj3;
                                s2Var3.l(i2Var2.f56594m.b(obj2, d(i5)));
                                h0Var2 = h0Var;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 43:
                                s2Var3 = s2Var;
                                obj2 = obj3;
                                s2Var3.i(i2Var2.f56594m.b(obj2, d(i5)));
                                h0Var2 = h0Var;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 44:
                                obj2 = obj3;
                                List listB2 = i2Var2.f56594m.b(obj2, d(i5));
                                s2Var.p(listB2);
                                i2Var2.a(i3);
                                objA = u2.a(iS, listB2, obj4, o3Var2);
                                objB = objA;
                                h0Var3 = h0Var;
                                break;
                            case 45:
                                s2Var3 = s2Var;
                                obj2 = obj3;
                                s2Var3.f(i2Var2.f56594m.b(obj2, d(i5)));
                                h0Var2 = h0Var;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 46:
                                s2Var3 = s2Var;
                                obj2 = obj3;
                                s2Var3.m(i2Var2.f56594m.b(obj2, d(i5)));
                                h0Var2 = h0Var;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 47:
                                s2Var3 = s2Var;
                                obj2 = obj3;
                                s2Var3.c(i2Var2.f56594m.b(obj2, d(i5)));
                                h0Var2 = h0Var;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 48:
                                s2Var3 = s2Var;
                                obj2 = obj3;
                                try {
                                    s2Var3.g(i2Var2.f56594m.b(obj2, d(i5)));
                                    h0Var2 = h0Var;
                                    i2Var = i2Var2;
                                    i2Var2 = i2Var;
                                    objB = obj4;
                                } catch (m1 unused5) {
                                    h0Var2 = h0Var;
                                    i2Var = i2Var2;
                                    s2Var2 = s2Var3;
                                    objB = obj4;
                                    o3Var2.getClass();
                                    if (objB == null) {
                                    }
                                    if (o3.a(objB, s2Var2)) {
                                    }
                                }
                                h0Var3 = h0Var2;
                                break;
                            case 49:
                                try {
                                    obj2 = obj3;
                                } catch (m1 unused6) {
                                    h0Var2 = h0Var;
                                    s2Var2 = s2Var;
                                    obj2 = obj3;
                                    i2Var = i2Var2;
                                    objB = obj4;
                                    o3Var2.getClass();
                                    if (objB == null) {
                                    }
                                    if (o3.a(objB, s2Var2)) {
                                    }
                                }
                                try {
                                    try {
                                        i2Var2.a(obj2, d(i5), s2Var, i2Var2.c(i3), h0Var);
                                        s2Var3 = s2Var;
                                        h0Var2 = h0Var;
                                        i2Var = i2Var2;
                                        i2Var2 = i2Var;
                                        objB = obj4;
                                    } catch (m1 unused7) {
                                        h0Var2 = h0Var;
                                        i2Var = i2Var2;
                                        s2Var2 = s2Var;
                                        objB = obj4;
                                        o3Var2.getClass();
                                        if (objB == null) {
                                        }
                                        if (o3.a(objB, s2Var2)) {
                                        }
                                    }
                                    h0Var3 = h0Var2;
                                } catch (Throwable th7) {
                                    th = th7;
                                    i2Var = i2Var2;
                                    objB = obj4;
                                    while (i2 < i2Var.f56592k) {
                                    }
                                    if (objB != null) {
                                    }
                                    throw th;
                                }
                                break;
                            case 50:
                                i2Var2.c(i3, obj3, i2Var2.b(i3));
                                throw null;
                            case 51:
                                x3.a(d(i5), obj3, Double.valueOf(s2Var.h()));
                                i2Var2.b(obj3, iS, i3);
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 52:
                                x3.a(d(i5), obj3, Float.valueOf(s2Var.k()));
                                i2Var2.b(obj3, iS, i3);
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 53:
                                x3.a(d(i5), obj3, Long.valueOf(s2Var.o()));
                                i2Var2.b(obj3, iS, i3);
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 54:
                                x3.a(d(i5), obj3, Long.valueOf(s2Var.f()));
                                i2Var2.b(obj3, iS, i3);
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 55:
                                x3.a(d(i5), obj3, Integer.valueOf(s2Var.d()));
                                i2Var2.b(obj3, iS, i3);
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 56:
                                x3.a(d(i5), obj3, Long.valueOf(s2Var.g()));
                                i2Var2.b(obj3, iS, i3);
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 57:
                                x3.a(d(i5), obj3, Integer.valueOf(s2Var.q()));
                                i2Var2.b(obj3, iS, i3);
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 58:
                                x3.a(d(i5), obj3, Boolean.valueOf(s2Var.r()));
                                i2Var2.b(obj3, iS, i3);
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 59:
                                if ((i5 & 536870912) != 0) {
                                    x3.a(i5 & 1048575, obj3, s2Var.p());
                                } else if (i2Var2.f56588g) {
                                    x3.a(i5 & 1048575, obj3, s2Var.n());
                                } else {
                                    x3.a(i5 & 1048575, obj3, s2Var.a());
                                }
                                i2Var2.b(obj3, iS, i3);
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 60:
                                if (i2Var2.a(obj3, iS, i3)) {
                                    x3.a(d(i5), obj3, l1.a(x3.e(obj3, d(i5)), s2Var.b(i2Var2.c(i3), h0Var3)));
                                } else {
                                    x3.a(d(i5), obj3, s2Var.b(i2Var2.c(i3), h0Var3));
                                    i2Var2.b(i3, obj3);
                                }
                                i2Var2.b(obj3, iS, i3);
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 61:
                                x3.a(d(i5), obj3, s2Var.a());
                                i2Var2.b(obj3, iS, i3);
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 62:
                                x3.a(d(i5), obj3, Integer.valueOf(s2Var.c()));
                                i2Var2.b(obj3, iS, i3);
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 63:
                                int iB2 = s2Var.b();
                                i2Var2.a(i3);
                                x3.a(d(i5), obj3, Integer.valueOf(iB2));
                                i2Var2.b(obj3, iS, i3);
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 64:
                                x3.a(d(i5), obj3, Integer.valueOf(s2Var.m()));
                                i2Var2.b(obj3, iS, i3);
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 65:
                                x3.a(d(i5), obj3, Long.valueOf(s2Var.t()));
                                i2Var2.b(obj3, iS, i3);
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 66:
                                x3.a(d(i5), obj3, Integer.valueOf(s2Var.j()));
                                i2Var2.b(obj3, iS, i3);
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 67:
                                x3.a(d(i5), obj3, Long.valueOf(s2Var.l()));
                                i2Var2.b(obj3, iS, i3);
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            case 68:
                                x3.a(d(i5), obj3, s2Var.a(i2Var2.c(i3), h0Var3));
                                i2Var2.b(obj3, iS, i3);
                                h0Var2 = h0Var3;
                                obj2 = obj3;
                                i2Var = i2Var2;
                                i2Var2 = i2Var;
                                objB = obj4;
                                h0Var3 = h0Var2;
                                break;
                            default:
                                if (obj4 == null) {
                                    try {
                                        o3Var2.getClass();
                                        objB = new n3();
                                    } catch (m1 unused8) {
                                        s2Var2 = s2Var;
                                        h0Var2 = h0Var3;
                                        obj2 = obj3;
                                        i2Var = i2Var2;
                                        objB = obj4;
                                        o3Var2.getClass();
                                        if (objB == null) {
                                            z0 z0Var = (z0) obj2;
                                            n3 n3Var = z0Var.unknownFields;
                                            if (n3Var == n3.f56625f) {
                                                n3Var = new n3();
                                                z0Var.unknownFields = n3Var;
                                            }
                                            objB = n3Var;
                                        }
                                        if (o3.a(objB, s2Var2)) {
                                            for (int i7 = i2Var.f56591j; i7 < i2Var.f56592k; i7++) {
                                                objB = i2Var.b(i2Var.f56590i[i7], obj2, objB);
                                            }
                                            if (objB != null) {
                                                o3.a(obj2, objB);
                                                return;
                                            }
                                            return;
                                        }
                                        i2Var2 = i2Var;
                                        h0Var3 = h0Var2;
                                        obj3 = obj2;
                                    }
                                } else {
                                    objB = obj4;
                                }
                                try {
                                    o3Var2.getClass();
                                } catch (m1 unused9) {
                                    s2Var2 = s2Var;
                                    h0Var2 = h0Var3;
                                    obj2 = obj3;
                                    i2Var = i2Var2;
                                    o3Var2.getClass();
                                    if (objB == null) {
                                    }
                                    if (o3.a(objB, s2Var2)) {
                                    }
                                }
                                if (!o3.a(objB, s2Var)) {
                                    for (int i8 = i2Var2.f56591j; i8 < i2Var2.f56592k; i8++) {
                                        objB = i2Var2.b(i2Var2.f56590i[i8], obj3, objB);
                                    }
                                    if (objB != null) {
                                        o3.a(obj3, objB);
                                    }
                                }
                                break;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        obj2 = obj3;
                    }
                } else if (iS == Integer.MAX_VALUE) {
                    for (int i9 = i2Var2.f56591j; i9 < i2Var2.f56592k; i9++) {
                        objB = i2Var2.b(i2Var2.f56590i[i9], obj3, objB);
                    }
                    if (objB != null) {
                        o3Var.getClass();
                        o3.a(obj3, objB);
                    }
                } else {
                    if (i2Var2.f56587f) {
                        d2 d2Var = i2Var2.f56586e;
                        j0Var.getClass();
                        x0VarA = h0Var3.a(iS, d2Var);
                    } else {
                        x0VarA = null;
                    }
                    if (x0VarA != null) {
                        if (n0VarEnsureExtensionsAreMutable == null) {
                            j0Var.getClass();
                            n0VarEnsureExtensionsAreMutable = ((GeneratedMessageLite$ExtendableMessage) obj3).ensureExtensionsAreMutable();
                        }
                        n0 n0Var = n0VarEnsureExtensionsAreMutable;
                        j0Var.getClass();
                        try {
                            objB = j0.a(s2Var, x0VarA, h0Var3, n0Var, objB, o3Var);
                            n0VarEnsureExtensionsAreMutable = n0Var;
                            obj2 = obj3;
                            h0Var3 = h0Var;
                        } catch (Throwable th9) {
                            th = th9;
                            o3Var2 = o3Var;
                        }
                    } else {
                        o3Var2 = o3Var;
                        Object obj5 = objB;
                        try {
                            o3Var2.getClass();
                            if (obj5 == null) {
                                z0 z0Var2 = (z0) obj3;
                                n3 n3Var2 = z0Var2.unknownFields;
                                if (n3Var2 == n3.f56625f) {
                                    n3Var2 = new n3();
                                    z0Var2.unknownFields = n3Var2;
                                }
                                objB = n3Var2;
                            } else {
                                objB = obj5;
                            }
                            try {
                                if (!o3.a(objB, s2Var)) {
                                    for (int i10 = i2Var2.f56591j; i10 < i2Var2.f56592k; i10++) {
                                        objB = i2Var2.b(i2Var2.f56590i[i10], obj3, objB);
                                    }
                                    if (objB != null) {
                                        o3.a(obj3, objB);
                                    }
                                }
                            } catch (Throwable th10) {
                                th = th10;
                            }
                        } catch (Throwable th11) {
                            th = th11;
                            obj2 = obj3;
                            objB = obj5;
                        }
                    }
                    obj2 = obj3;
                    i2Var = i2Var2;
                }
                obj3 = obj2;
            }
            for (i2 = i2Var.f56591j; i2 < i2Var.f56592k; i2++) {
                objB = i2Var.b(i2Var.f56590i[i2], obj2, objB);
            }
            if (objB != null) {
                o3Var2.getClass();
                o3.a(obj2, objB);
            }
            throw th;
        }
    }

    public final Object b(int i2) {
        return this.f56583b[(i2 / 3) * 2];
    }

    public final Object b(int i2, Object obj, Object obj2) {
        int i3 = this.f56582a[i2];
        if (x3.e(obj, r0[i2 + 1] & 1048575) == null) {
            return obj2;
        }
        a(i2);
        return obj2;
    }

    public final void b(int i2, Object obj) {
        int i3 = this.f56582a[i2 + 2];
        long j2 = 1048575 & i3;
        if (j2 == 1048575) {
            return;
        }
        x3.a(obj, j2, (1 << (i3 >>> 20)) | x3.c(obj, j2));
    }

    public final void b(Object obj, int i2, int i3) {
        x3.a(obj, this.f56582a[i3 + 2] & 1048575, i2);
    }

    public final int a(Object obj, byte[] bArr, int i2, int i3, int i5, int i7, int i8, long j2, int i9, long j3, f fVar) throws n1 {
        int iA;
        int iA2;
        int i10;
        int iA3;
        int iA4;
        int i11;
        int iC;
        Unsafe unsafe = f56581r;
        k1 k1VarB = (k1) unsafe.getObject(obj, j3);
        if (!((c) k1VarB).f56537a) {
            int size = k1VarB.size();
            k1VarB = k1VarB.b(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j3, k1VarB);
        }
        switch (i9) {
            case 18:
            case 35:
                if (i7 == 2) {
                    d0 d0Var = (d0) k1VarB;
                    int iD = g.d(bArr, i2, fVar);
                    int i12 = fVar.f56560a + iD;
                    while (iD < i12) {
                        d0Var.a(Double.longBitsToDouble(g.b(iD, bArr)));
                        iD += 8;
                    }
                    if (iD == i12) {
                        return iD;
                    }
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i7 != 1) {
                    return i2;
                }
                d0 d0Var2 = (d0) k1VarB;
                d0Var2.a(Double.longBitsToDouble(g.b(i2, bArr)));
                for (int i13 = i2 + 8; i13 < i3; i13 = iA + 8) {
                    iA = i13 + 1;
                    byte b2 = bArr[i13];
                    if (b2 >= 0) {
                        fVar.f56560a = b2;
                    } else {
                        iA = g.a(b2, bArr, iA, fVar);
                    }
                    if (i5 != fVar.f56560a) {
                        return i13;
                    }
                    d0Var2.a(Double.longBitsToDouble(g.b(iA, bArr)));
                }
                return i13;
            case 19:
            case 36:
                if (i7 == 2) {
                    q0 q0Var = (q0) k1VarB;
                    int iD2 = g.d(bArr, i2, fVar);
                    int i14 = fVar.f56560a + iD2;
                    while (iD2 < i14) {
                        q0Var.a(Float.intBitsToFloat(g.a(iD2, bArr)));
                        iD2 += 4;
                    }
                    if (iD2 == i14) {
                        return iD2;
                    }
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i7 != 5) {
                    return i2;
                }
                q0 q0Var2 = (q0) k1VarB;
                q0Var2.a(Float.intBitsToFloat(g.a(i2, bArr)));
                for (int i15 = i2 + 4; i15 < i3; i15 = iA2 + 4) {
                    iA2 = i15 + 1;
                    byte b4 = bArr[i15];
                    if (b4 >= 0) {
                        fVar.f56560a = b4;
                    } else {
                        iA2 = g.a(b4, bArr, iA2, fVar);
                    }
                    if (i5 != fVar.f56560a) {
                        return i15;
                    }
                    q0Var2.a(Float.intBitsToFloat(g.a(iA2, bArr)));
                }
                return i15;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i7 == 2) {
                    u1 u1Var = (u1) k1VarB;
                    int iD3 = g.d(bArr, i2, fVar);
                    int i16 = fVar.f56560a + iD3;
                    while (iD3 < i16) {
                        iD3 = g.e(bArr, iD3, fVar);
                        u1Var.a(fVar.f56561b);
                    }
                    if (iD3 == i16) {
                        return iD3;
                    }
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i7 != 0) {
                    return i2;
                }
                u1 u1Var2 = (u1) k1VarB;
                int iE = g.e(bArr, i2, fVar);
                u1Var2.a(fVar.f56561b);
                while (iE < i3) {
                    int iA5 = iE + 1;
                    byte b5 = bArr[iE];
                    if (b5 >= 0) {
                        fVar.f56560a = b5;
                    } else {
                        iA5 = g.a(b5, bArr, iA5, fVar);
                    }
                    if (i5 != fVar.f56560a) {
                        return iE;
                    }
                    iE = g.e(bArr, iA5, fVar);
                    u1Var2.a(fVar.f56561b);
                }
                return iE;
            case 22:
            case 29:
            case 39:
            case 43:
                i10 = i2;
                if (i7 == 2) {
                    return g.a(bArr, i10, k1VarB, fVar);
                }
                if (i7 == 0) {
                    return g.c(i5, bArr, i10, i3, k1VarB, fVar);
                }
                return i10;
            case 23:
            case 32:
            case 40:
            case 46:
                i10 = i2;
                if (i7 == 2) {
                    u1 u1Var3 = (u1) k1VarB;
                    int iD4 = g.d(bArr, i10, fVar);
                    int i17 = fVar.f56560a + iD4;
                    while (iD4 < i17) {
                        u1Var3.a(g.b(iD4, bArr));
                        iD4 += 8;
                    }
                    if (iD4 == i17) {
                        return iD4;
                    }
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i7 == 1) {
                    u1 u1Var4 = (u1) k1VarB;
                    u1Var4.a(g.b(i10, bArr));
                    for (int i18 = i10 + 8; i18 < i3; i18 = iA3 + 8) {
                        iA3 = i18 + 1;
                        byte b6 = bArr[i18];
                        if (b6 >= 0) {
                            fVar.f56560a = b6;
                        } else {
                            iA3 = g.a(b6, bArr, iA3, fVar);
                        }
                        if (i5 != fVar.f56560a) {
                            return i18;
                        }
                        u1Var4.a(g.b(iA3, bArr));
                    }
                    return i18;
                }
                return i10;
            case 24:
            case 31:
            case 41:
            case 45:
                i10 = i2;
                if (i7 == 2) {
                    a1 a1Var = (a1) k1VarB;
                    int iD5 = g.d(bArr, i10, fVar);
                    int i19 = fVar.f56560a + iD5;
                    while (iD5 < i19) {
                        a1Var.c(g.a(iD5, bArr));
                        iD5 += 4;
                    }
                    if (iD5 == i19) {
                        return iD5;
                    }
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i7 == 5) {
                    a1 a1Var2 = (a1) k1VarB;
                    a1Var2.c(g.a(i10, bArr));
                    for (int i20 = i10 + 4; i20 < i3; i20 = iA4 + 4) {
                        iA4 = i20 + 1;
                        byte b7 = bArr[i20];
                        if (b7 >= 0) {
                            fVar.f56560a = b7;
                        } else {
                            iA4 = g.a(b7, bArr, iA4, fVar);
                        }
                        if (i5 != fVar.f56560a) {
                            return i20;
                        }
                        a1Var2.c(g.a(iA4, bArr));
                    }
                    return i20;
                }
                return i10;
            case 25:
            case 42:
                i10 = i2;
                if (i7 == 2) {
                    j jVar = (j) k1VarB;
                    int iD6 = g.d(bArr, i10, fVar);
                    int i21 = fVar.f56560a + iD6;
                    while (iD6 < i21) {
                        iD6 = g.e(bArr, iD6, fVar);
                        jVar.a(fVar.f56561b != 0);
                    }
                    if (iD6 == i21) {
                        return iD6;
                    }
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i7 == 0) {
                    j jVar2 = (j) k1VarB;
                    int iE2 = g.e(bArr, i10, fVar);
                    jVar2.a(fVar.f56561b != 0);
                    while (iE2 < i3) {
                        int iA6 = iE2 + 1;
                        byte b8 = bArr[iE2];
                        if (b8 >= 0) {
                            fVar.f56560a = b8;
                        } else {
                            iA6 = g.a(b8, bArr, iA6, fVar);
                        }
                        if (i5 != fVar.f56560a) {
                            return iE2;
                        }
                        iE2 = g.e(bArr, iA6, fVar);
                        jVar2.a(fVar.f56561b != 0);
                    }
                    return iE2;
                }
                return i10;
            case 26:
                i11 = i2;
                if (i7 == 2) {
                    if ((j2 & 536870912) == 0) {
                        return g.a(i5, bArr, i11, i3, k1VarB, fVar);
                    }
                    return g.b(i5, bArr, i11, i3, k1VarB, fVar);
                }
                return i11;
            case 27:
                i11 = i2;
                if (i7 == 2) {
                    t2 t2VarC = c(i8);
                    int iA7 = g.a(t2VarC, bArr, i11, i3, fVar);
                    k1VarB.add(fVar.f56562c);
                    while (iA7 < i3) {
                        int iA8 = iA7 + 1;
                        byte b9 = bArr[iA7];
                        if (b9 >= 0) {
                            fVar.f56560a = b9;
                        } else {
                            iA8 = g.a(b9, bArr, iA8, fVar);
                        }
                        if (i5 != fVar.f56560a) {
                            return iA7;
                        }
                        iA7 = g.a(t2VarC, bArr, iA8, i3, fVar);
                        k1VarB.add(fVar.f56562c);
                    }
                    return iA7;
                }
                return i11;
            case 28:
                i11 = i2;
                if (i7 == 2) {
                    int iD7 = g.d(bArr, i11, fVar);
                    int i22 = fVar.f56560a;
                    if (i22 >= 0) {
                        if (i22 > bArr.length - iD7) {
                            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        }
                        if (i22 == 0) {
                            k1VarB.add(s.f56654b);
                        } else {
                            int i23 = iD7 + i22;
                            s.a(iD7, i23, bArr.length);
                            k1VarB.add(new q(s.f56655c.a(bArr, iD7, i22)));
                            iD7 = i23;
                        }
                        while (iD7 < i3) {
                            int iA9 = iD7 + 1;
                            byte b10 = bArr[iD7];
                            if (b10 >= 0) {
                                fVar.f56560a = b10;
                            } else {
                                iA9 = g.a(b10, bArr, iA9, fVar);
                            }
                            if (i5 != fVar.f56560a) {
                                return iD7;
                            }
                            iD7 = iA9 + 1;
                            byte b11 = bArr[iA9];
                            if (b11 >= 0) {
                                fVar.f56560a = b11;
                            } else {
                                iD7 = g.a(b11, bArr, iD7, fVar);
                            }
                            int i24 = fVar.f56560a;
                            if (i24 >= 0) {
                                if (i24 > bArr.length - iD7) {
                                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                }
                                if (i24 == 0) {
                                    k1VarB.add(s.f56654b);
                                } else {
                                    int i25 = iD7 + i24;
                                    s.a(iD7, i25, bArr.length);
                                    k1VarB.add(new q(s.f56655c.a(bArr, iD7, i24)));
                                    iD7 = i25;
                                }
                            } else {
                                throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                            }
                        }
                        return iD7;
                    }
                    throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }
                return i11;
            case 30:
            case 44:
                if (i7 == 2) {
                    iC = g.a(bArr, i2, k1VarB, fVar);
                } else {
                    if (i7 != 0) {
                        return i2;
                    }
                    iC = g.c(i5, bArr, i2, i3, k1VarB, fVar);
                }
                z0 z0Var = (z0) obj;
                n3 n3Var = z0Var.unknownFields;
                if (n3Var == n3.f56625f) {
                    n3Var = null;
                }
                a(i8);
                Class cls = u2.f56681a;
                if (n3Var != null) {
                    z0Var.unknownFields = n3Var;
                }
                return iC;
            case 33:
            case 47:
                if (i7 == 2) {
                    a1 a1Var3 = (a1) k1VarB;
                    int iD8 = g.d(bArr, i2, fVar);
                    int i26 = fVar.f56560a + iD8;
                    while (iD8 < i26) {
                        int i27 = iD8 + 1;
                        byte b12 = bArr[iD8];
                        if (b12 >= 0) {
                            fVar.f56560a = b12;
                            iD8 = i27;
                        } else {
                            iD8 = g.a(b12, bArr, i27, fVar);
                        }
                        a1Var3.c(w.b(fVar.f56560a));
                    }
                    if (iD8 == i26) {
                        return iD8;
                    }
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i7 != 0) {
                    return i2;
                }
                a1 a1Var4 = (a1) k1VarB;
                int iD9 = g.d(bArr, i2, fVar);
                a1Var4.c(w.b(fVar.f56560a));
                while (iD9 < i3) {
                    int iA10 = iD9 + 1;
                    byte b13 = bArr[iD9];
                    if (b13 >= 0) {
                        fVar.f56560a = b13;
                    } else {
                        iA10 = g.a(b13, bArr, iA10, fVar);
                    }
                    if (i5 != fVar.f56560a) {
                        return iD9;
                    }
                    iD9 = iA10 + 1;
                    byte b14 = bArr[iA10];
                    if (b14 >= 0) {
                        fVar.f56560a = b14;
                    } else {
                        iD9 = g.a(b14, bArr, iD9, fVar);
                    }
                    a1Var4.c(w.b(fVar.f56560a));
                }
                return iD9;
            case 34:
            case 48:
                if (i7 == 2) {
                    u1 u1Var5 = (u1) k1VarB;
                    int iD10 = g.d(bArr, i2, fVar);
                    int i28 = fVar.f56560a + iD10;
                    while (iD10 < i28) {
                        iD10 = g.e(bArr, iD10, fVar);
                        u1Var5.a(w.a(fVar.f56561b));
                    }
                    if (iD10 == i28) {
                        return iD10;
                    }
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i7 != 0) {
                    return i2;
                }
                u1 u1Var6 = (u1) k1VarB;
                int iE3 = g.e(bArr, i2, fVar);
                u1Var6.a(w.a(fVar.f56561b));
                while (iE3 < i3) {
                    int iA11 = iE3 + 1;
                    byte b15 = bArr[iE3];
                    if (b15 >= 0) {
                        fVar.f56560a = b15;
                    } else {
                        iA11 = g.a(b15, bArr, iA11, fVar);
                    }
                    if (i5 != fVar.f56560a) {
                        return iE3;
                    }
                    iE3 = g.e(bArr, iA11, fVar);
                    u1Var6.a(w.a(fVar.f56561b));
                }
                return iE3;
            case 49:
                if (i7 == 3) {
                    t2 t2VarC2 = c(i8);
                    int i29 = (i5 & (-8)) | 4;
                    int iA12 = g.a(t2VarC2, bArr, i2, i3, i29, fVar);
                    t2 t2Var = t2VarC2;
                    byte[] bArr2 = bArr;
                    int i30 = i3;
                    f fVar2 = fVar;
                    k1VarB.add(fVar2.f56562c);
                    while (iA12 < i30) {
                        int iD11 = g.d(bArr2, iA12, fVar2);
                        if (i5 != fVar2.f56560a) {
                            return iA12;
                        }
                        byte[] bArr3 = bArr2;
                        t2 t2Var2 = t2Var;
                        int i31 = i30;
                        f fVar3 = fVar2;
                        iA12 = g.a(t2Var2, bArr3, iD11, i31, i29, fVar3);
                        k1VarB.add(fVar3.f56562c);
                        t2Var = t2Var2;
                        bArr2 = bArr3;
                        i30 = i31;
                        fVar2 = fVar3;
                    }
                    return iA12;
                }
            default:
                return i2;
        }
    }

    public final int a(Object obj, byte[] bArr, int i2, int i3, int i5, int i7, int i8, int i9, int i10, long j2, int i11, f fVar) throws n1 {
        Object object;
        Unsafe unsafe = f56581r;
        long j3 = this.f56582a[i11 + 2] & 1048575;
        switch (i10) {
            case 51:
                if (i8 != 1) {
                    return i2;
                }
                unsafe.putObject(obj, j2, Double.valueOf(Double.longBitsToDouble(g.b(i2, bArr))));
                int i12 = i2 + 8;
                unsafe.putInt(obj, j3, i7);
                return i12;
            case 52:
                if (i8 != 5) {
                    return i2;
                }
                unsafe.putObject(obj, j2, Float.valueOf(Float.intBitsToFloat(g.a(i2, bArr))));
                int i13 = i2 + 4;
                unsafe.putInt(obj, j3, i7);
                return i13;
            case 53:
            case 54:
                if (i8 != 0) {
                    return i2;
                }
                int iE = g.e(bArr, i2, fVar);
                unsafe.putObject(obj, j2, Long.valueOf(fVar.f56561b));
                unsafe.putInt(obj, j3, i7);
                return iE;
            case 55:
            case 62:
                if (i8 != 0) {
                    return i2;
                }
                int iD = g.d(bArr, i2, fVar);
                unsafe.putObject(obj, j2, Integer.valueOf(fVar.f56560a));
                unsafe.putInt(obj, j3, i7);
                return iD;
            case 56:
            case 65:
                if (i8 != 1) {
                    return i2;
                }
                unsafe.putObject(obj, j2, Long.valueOf(g.b(i2, bArr)));
                int i14 = i2 + 8;
                unsafe.putInt(obj, j3, i7);
                return i14;
            case 57:
            case 64:
                if (i8 != 5) {
                    return i2;
                }
                unsafe.putObject(obj, j2, Integer.valueOf(g.a(i2, bArr)));
                int i15 = i2 + 4;
                unsafe.putInt(obj, j3, i7);
                return i15;
            case 58:
                if (i8 != 0) {
                    return i2;
                }
                int iE2 = g.e(bArr, i2, fVar);
                unsafe.putObject(obj, j2, Boolean.valueOf(fVar.f56561b != 0));
                unsafe.putInt(obj, j3, i7);
                return iE2;
            case 59:
                if (i8 != 2) {
                    return i2;
                }
                int iD2 = g.d(bArr, i2, fVar);
                int i16 = fVar.f56560a;
                if (i16 == 0) {
                    unsafe.putObject(obj, j2, "");
                } else {
                    if ((i9 & 536870912) != 0) {
                        if (!d4.f56549a.b(bArr, iD2, iD2 + i16)) {
                            throw new n1("Protocol message had invalid UTF-8.");
                        }
                    }
                    unsafe.putObject(obj, j2, new String(bArr, iD2, i16, l1.f56612a));
                    iD2 += i16;
                }
                unsafe.putInt(obj, j3, i7);
                return iD2;
            case 60:
                if (i8 != 2) {
                    return i2;
                }
                int iA = g.a(c(i11), bArr, i2, i3, fVar);
                object = unsafe.getInt(obj, j3) == i7 ? unsafe.getObject(obj, j2) : null;
                if (object == null) {
                    unsafe.putObject(obj, j2, fVar.f56562c);
                } else {
                    unsafe.putObject(obj, j2, l1.a(object, fVar.f56562c));
                }
                unsafe.putInt(obj, j3, i7);
                return iA;
            case 61:
                if (i8 != 2) {
                    return i2;
                }
                int iA2 = g.a(bArr, i2, fVar);
                unsafe.putObject(obj, j2, fVar.f56562c);
                unsafe.putInt(obj, j3, i7);
                return iA2;
            case 63:
                if (i8 != 0) {
                    return i2;
                }
                int iD3 = g.d(bArr, i2, fVar);
                int i17 = fVar.f56560a;
                a(i11);
                unsafe.putObject(obj, j2, Integer.valueOf(i17));
                unsafe.putInt(obj, j3, i7);
                return iD3;
            case 66:
                if (i8 != 0) {
                    return i2;
                }
                int iD4 = g.d(bArr, i2, fVar);
                unsafe.putObject(obj, j2, Integer.valueOf(w.b(fVar.f56560a)));
                unsafe.putInt(obj, j3, i7);
                return iD4;
            case 67:
                if (i8 != 0) {
                    return i2;
                }
                int iE3 = g.e(bArr, i2, fVar);
                unsafe.putObject(obj, j2, Long.valueOf(w.a(fVar.f56561b)));
                unsafe.putInt(obj, j3, i7);
                return iE3;
            case 68:
                if (i8 == 3) {
                    int iA3 = g.a(c(i11), bArr, i2, i3, (i5 & (-8)) | 4, fVar);
                    object = unsafe.getInt(obj, j3) == i7 ? unsafe.getObject(obj, j2) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j2, fVar.f56562c);
                    } else {
                        unsafe.putObject(obj, j2, l1.a(object, fVar.f56562c));
                    }
                    unsafe.putInt(obj, j3, i7);
                    return iA3;
                }
                break;
        }
        return i2;
    }

    public final void a(int i2) {
        if (this.f56583b[((i2 / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x0477, code lost:
    
        r0 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0835, code lost:
    
        if (r0 == 1048575) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x0837, code lost:
    
        r23.putInt(r9, r0, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x083d, code lost:
    
        r0 = r8.f56591j;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0843, code lost:
    
        if (r0 >= r8.f56592k) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0845, code lost:
    
        r1 = (com.fyber.inneractive.sdk.protobuf.n3) r8.b(r8.f56590i[r0], r9, r1);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0852, code lost:
    
        if (r1 == null) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0854, code lost:
    
        r8.f56595n.getClass();
        ((com.fyber.inneractive.sdk.protobuf.z0) r9).unknownFields = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0860, code lost:
    
        if (r35 != 0) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0862, code lost:
    
        if (r4 != r3) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x086a, code lost:
    
        throw new com.fyber.inneractive.sdk.protobuf.n1("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x086b, code lost:
    
        if (r4 > r3) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x086d, code lost:
    
        if (r13 != r35) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x086f, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0875, code lost:
    
        throw new com.fyber.inneractive.sdk.protobuf.n1("Failed to parse the message.");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x07cc  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x07f8  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Type update failed for variable: r30v0 'this'  ??, new type: com.fyber.inneractive.sdk.protobuf.i2
    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 22781. Try increasing type updates limit count.
    	at jadx.core.dex.visitors.typeinference.TypeUpdateInfo.requestUpdate(TypeUpdateInfo.java:37)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:224)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:399)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:86)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:72)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Type update failed for variable: r30v0 'this'  ??, new type: com.fyber.inneractive.sdk.protobuf.i2
    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 22781. Try increasing type updates limit count.
    	at jadx.core.dex.visitors.typeinference.TypeUpdateInfo.requestUpdate(TypeUpdateInfo.java:37)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:224)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(Object obj, byte[] bArr, int i2, int i3, int i5, f fVar) throws n1 {
        int i7;
        Unsafe unsafe;
        i2 i2Var;
        Object obj2;
        int iA;
        int i8;
        int i9;
        boolean z2;
        int iE;
        int i10;
        f fVar2;
        int i11;
        n3 n3Var;
        int i12;
        Object objA;
        w0 w0Var;
        int iD;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z3;
        int i18;
        Unsafe unsafe2;
        f fVar3;
        int iE2;
        Unsafe unsafe3;
        Unsafe unsafe4;
        int i19;
        int i20;
        int iC;
        int iA2;
        i2 i2Var2;
        int i21;
        int i22;
        int i23;
        int iA3;
        i2 i2Var3 = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        int i24 = i3;
        f fVar4 = fVar;
        Unsafe unsafe5 = f56581r;
        int i25 = 0;
        int i26 = i2;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = -1;
        int i31 = 1048575;
        while (true) {
            Object objValueOf = null;
            if (i26 < i24) {
                int iA4 = i26 + 1;
                int i32 = bArr2[i26];
                if (i32 < 0) {
                    iA4 = g.a(i32, bArr2, iA4, fVar4);
                    i32 = fVar4.f56560a;
                }
                int i33 = iA4;
                int i34 = i32;
                int i35 = (i34 == true ? 1 : 0) >>> 3;
                int i36 = (i34 == true ? 1 : 0) & 7;
                if (i35 > i30) {
                    iA = (i35 < i2Var3.f56584c || i35 > i2Var3.f56585d) ? -1 : i2Var3.a(i35, i27 / 3);
                    if (iA != -1) {
                        i30 = i35;
                        i7 = i31;
                        unsafe = unsafe5;
                        i8 = 0;
                        i9 = 0;
                        z2 = true;
                        i2Var = i2Var3;
                        obj2 = obj3;
                        iE = i33;
                        i10 = i34 == true ? 1 : 0;
                        fVar2 = fVar;
                    } else {
                        int[] iArr = i2Var3.f56582a;
                        int i37 = iArr[iA + 1];
                        int i38 = (i37 & 267386880) >>> 20;
                        long j2 = i37 & 1048575;
                        if (i38 <= 17) {
                            int i39 = iArr[iA + 2];
                            int i40 = 1 << (i39 >>> 20);
                            int i41 = i39 & 1048575;
                            if (i41 != i31) {
                                i13 = i35;
                                if (i31 != 1048575) {
                                    unsafe5.putInt(obj3, i31, i28);
                                }
                                i14 = unsafe5.getInt(obj3, i41);
                                i15 = i41;
                            } else {
                                i13 = i35;
                                i14 = i28;
                                i15 = i31;
                            }
                            switch (i38) {
                                case 0:
                                    i16 = i3;
                                    i17 = i15;
                                    z3 = true;
                                    i18 = i33;
                                    i8 = iA;
                                    unsafe2 = unsafe5;
                                    fVar3 = fVar;
                                    if (i36 == 1) {
                                        x3.f56720c.a(obj3, j2, Double.longBitsToDouble(g.b(i18, bArr)));
                                        iE2 = i18 + 8;
                                        int i42 = i14 | i40;
                                        i7 = i17;
                                        obj2 = obj3;
                                        i24 = i16;
                                        i27 = i8;
                                        unsafe = unsafe2;
                                        i11 = i34 == true ? 1 : 0;
                                        i26 = iE2;
                                        i30 = i13;
                                        i9 = 0;
                                        i2Var = i2Var3;
                                        i28 = i42;
                                        bArr2 = bArr;
                                        i29 = i11;
                                        i2Var3 = i2Var;
                                        obj3 = obj2;
                                        i25 = i9;
                                        unsafe5 = unsafe;
                                        i31 = i7;
                                        fVar4 = fVar;
                                    }
                                    i7 = i17;
                                    i2Var = i2Var3;
                                    z2 = z3;
                                    unsafe = unsafe2;
                                    i10 = i34 == true ? 1 : 0;
                                    i30 = i13;
                                    i28 = i14;
                                    i9 = 0;
                                    fVar2 = fVar3;
                                    obj2 = obj3;
                                    iE = i18;
                                    break;
                                case 1:
                                    i16 = i3;
                                    i17 = i15;
                                    i18 = i33;
                                    i8 = iA;
                                    unsafe2 = unsafe5;
                                    fVar3 = fVar;
                                    if (i36 == 5) {
                                        x3.f56720c.a(obj3, j2, Float.intBitsToFloat(g.a(i18, bArr)));
                                        iE2 = i18 + 4;
                                        int i422 = i14 | i40;
                                        i7 = i17;
                                        obj2 = obj3;
                                        i24 = i16;
                                        i27 = i8;
                                        unsafe = unsafe2;
                                        i11 = i34 == true ? 1 : 0;
                                        i26 = iE2;
                                        i30 = i13;
                                        i9 = 0;
                                        i2Var = i2Var3;
                                        i28 = i422;
                                        bArr2 = bArr;
                                        i29 = i11;
                                        i2Var3 = i2Var;
                                        obj3 = obj2;
                                        i25 = i9;
                                        unsafe5 = unsafe;
                                        i31 = i7;
                                        fVar4 = fVar;
                                    }
                                    z3 = true;
                                    i7 = i17;
                                    i2Var = i2Var3;
                                    z2 = z3;
                                    unsafe = unsafe2;
                                    i10 = i34 == true ? 1 : 0;
                                    i30 = i13;
                                    i28 = i14;
                                    i9 = 0;
                                    fVar2 = fVar3;
                                    obj2 = obj3;
                                    iE = i18;
                                    break;
                                case 2:
                                case 3:
                                    i16 = i3;
                                    unsafe3 = unsafe5;
                                    i17 = i15;
                                    fVar3 = fVar;
                                    i18 = i33;
                                    i8 = iA;
                                    if (i36 == 0) {
                                        iE2 = g.e(bArr, i18, fVar3);
                                        unsafe3.putLong(obj3, j2, fVar3.f56561b);
                                        unsafe2 = unsafe3;
                                        int i4222 = i14 | i40;
                                        i7 = i17;
                                        obj2 = obj3;
                                        i24 = i16;
                                        i27 = i8;
                                        unsafe = unsafe2;
                                        i11 = i34 == true ? 1 : 0;
                                        i26 = iE2;
                                        i30 = i13;
                                        i9 = 0;
                                        i2Var = i2Var3;
                                        i28 = i4222;
                                        bArr2 = bArr;
                                        i29 = i11;
                                        i2Var3 = i2Var;
                                        obj3 = obj2;
                                        i25 = i9;
                                        unsafe5 = unsafe;
                                        i31 = i7;
                                        fVar4 = fVar;
                                    }
                                    unsafe2 = unsafe3;
                                    z3 = true;
                                    i7 = i17;
                                    i2Var = i2Var3;
                                    z2 = z3;
                                    unsafe = unsafe2;
                                    i10 = i34 == true ? 1 : 0;
                                    i30 = i13;
                                    i28 = i14;
                                    i9 = 0;
                                    fVar2 = fVar3;
                                    obj2 = obj3;
                                    iE = i18;
                                    break;
                                case 4:
                                case 11:
                                    i16 = i3;
                                    unsafe3 = unsafe5;
                                    i17 = i15;
                                    fVar3 = fVar;
                                    i18 = i33;
                                    i8 = iA;
                                    if (i36 == 0) {
                                        int iA5 = i18 + 1;
                                        byte b2 = bArr[i18];
                                        if (b2 >= 0) {
                                            fVar3.f56560a = b2;
                                        } else {
                                            iA5 = g.a(b2, bArr, iA5, fVar3);
                                        }
                                        iE2 = iA5;
                                        unsafe3.putInt(obj3, j2, fVar3.f56560a);
                                        unsafe2 = unsafe3;
                                        int i42222 = i14 | i40;
                                        i7 = i17;
                                        obj2 = obj3;
                                        i24 = i16;
                                        i27 = i8;
                                        unsafe = unsafe2;
                                        i11 = i34 == true ? 1 : 0;
                                        i26 = iE2;
                                        i30 = i13;
                                        i9 = 0;
                                        i2Var = i2Var3;
                                        i28 = i42222;
                                        bArr2 = bArr;
                                        i29 = i11;
                                        i2Var3 = i2Var;
                                        obj3 = obj2;
                                        i25 = i9;
                                        unsafe5 = unsafe;
                                        i31 = i7;
                                        fVar4 = fVar;
                                    }
                                    unsafe2 = unsafe3;
                                    z3 = true;
                                    i7 = i17;
                                    i2Var = i2Var3;
                                    z2 = z3;
                                    unsafe = unsafe2;
                                    i10 = i34 == true ? 1 : 0;
                                    i30 = i13;
                                    i28 = i14;
                                    i9 = 0;
                                    fVar2 = fVar3;
                                    obj2 = obj3;
                                    iE = i18;
                                    break;
                                case 5:
                                case 14:
                                    i16 = i3;
                                    unsafe4 = unsafe5;
                                    i17 = i15;
                                    z3 = true;
                                    fVar3 = fVar;
                                    i8 = iA;
                                    if (i36 != 1) {
                                        i18 = i33;
                                        unsafe2 = unsafe4;
                                        i7 = i17;
                                        i2Var = i2Var3;
                                        z2 = z3;
                                        unsafe = unsafe2;
                                        i10 = i34 == true ? 1 : 0;
                                        i30 = i13;
                                        i28 = i14;
                                        i9 = 0;
                                        fVar2 = fVar3;
                                        obj2 = obj3;
                                        iE = i18;
                                    } else {
                                        unsafe3 = unsafe4;
                                        unsafe3.putLong(obj3, j2, g.b(i33, bArr));
                                        iE2 = i33 + 8;
                                        unsafe2 = unsafe3;
                                        int i422222 = i14 | i40;
                                        i7 = i17;
                                        obj2 = obj3;
                                        i24 = i16;
                                        i27 = i8;
                                        unsafe = unsafe2;
                                        i11 = i34 == true ? 1 : 0;
                                        i26 = iE2;
                                        i30 = i13;
                                        i9 = 0;
                                        i2Var = i2Var3;
                                        i28 = i422222;
                                        bArr2 = bArr;
                                        i29 = i11;
                                        i2Var3 = i2Var;
                                        obj3 = obj2;
                                        i25 = i9;
                                        unsafe5 = unsafe;
                                        i31 = i7;
                                        fVar4 = fVar;
                                    }
                                    break;
                                case 6:
                                case 13:
                                    i16 = i3;
                                    i19 = i33;
                                    unsafe4 = unsafe5;
                                    i17 = i15;
                                    fVar3 = fVar;
                                    i8 = iA;
                                    if (i36 == 5) {
                                        unsafe4.putInt(obj3, j2, g.a(i19, bArr));
                                        iE2 = i19 + 4;
                                        unsafe2 = unsafe4;
                                        int i4222222 = i14 | i40;
                                        i7 = i17;
                                        obj2 = obj3;
                                        i24 = i16;
                                        i27 = i8;
                                        unsafe = unsafe2;
                                        i11 = i34 == true ? 1 : 0;
                                        i26 = iE2;
                                        i30 = i13;
                                        i9 = 0;
                                        i2Var = i2Var3;
                                        i28 = i4222222;
                                        bArr2 = bArr;
                                        i29 = i11;
                                        i2Var3 = i2Var;
                                        obj3 = obj2;
                                        i25 = i9;
                                        unsafe5 = unsafe;
                                        i31 = i7;
                                        fVar4 = fVar;
                                    }
                                    i18 = i19;
                                    unsafe2 = unsafe4;
                                    z3 = true;
                                    i7 = i17;
                                    i2Var = i2Var3;
                                    z2 = z3;
                                    unsafe = unsafe2;
                                    i10 = i34 == true ? 1 : 0;
                                    i30 = i13;
                                    i28 = i14;
                                    i9 = 0;
                                    fVar2 = fVar3;
                                    obj2 = obj3;
                                    iE = i18;
                                    break;
                                case 7:
                                    i16 = i3;
                                    i19 = i33;
                                    unsafe4 = unsafe5;
                                    fVar3 = fVar;
                                    i8 = iA;
                                    if (i36 != 0) {
                                        i17 = i15;
                                        i18 = i19;
                                        unsafe2 = unsafe4;
                                        z3 = true;
                                        i7 = i17;
                                        i2Var = i2Var3;
                                        z2 = z3;
                                        unsafe = unsafe2;
                                        i10 = i34 == true ? 1 : 0;
                                        i30 = i13;
                                        i28 = i14;
                                        i9 = 0;
                                        fVar2 = fVar3;
                                        obj2 = obj3;
                                        iE = i18;
                                    } else {
                                        iE2 = g.e(bArr, i19, fVar3);
                                        i17 = i15;
                                        x3.f56720c.a(obj3, j2, fVar3.f56561b != 0);
                                        unsafe2 = unsafe4;
                                        int i42222222 = i14 | i40;
                                        i7 = i17;
                                        obj2 = obj3;
                                        i24 = i16;
                                        i27 = i8;
                                        unsafe = unsafe2;
                                        i11 = i34 == true ? 1 : 0;
                                        i26 = iE2;
                                        i30 = i13;
                                        i9 = 0;
                                        i2Var = i2Var3;
                                        i28 = i42222222;
                                        bArr2 = bArr;
                                        i29 = i11;
                                        i2Var3 = i2Var;
                                        obj3 = obj2;
                                        i25 = i9;
                                        unsafe5 = unsafe;
                                        i31 = i7;
                                        fVar4 = fVar;
                                    }
                                    break;
                                case 8:
                                    i16 = i3;
                                    i20 = i33;
                                    unsafe4 = unsafe5;
                                    fVar3 = fVar;
                                    i8 = iA;
                                    if (i36 == 2) {
                                        if ((i37 & 536870912) == 0) {
                                            iC = g.b(bArr, i20, fVar3);
                                        } else {
                                            iC = g.c(bArr, i20, fVar3);
                                        }
                                        iE2 = iC;
                                        unsafe4.putObject(obj3, j2, fVar3.f56562c);
                                        i17 = i15;
                                        unsafe2 = unsafe4;
                                        int i422222222 = i14 | i40;
                                        i7 = i17;
                                        obj2 = obj3;
                                        i24 = i16;
                                        i27 = i8;
                                        unsafe = unsafe2;
                                        i11 = i34 == true ? 1 : 0;
                                        i26 = iE2;
                                        i30 = i13;
                                        i9 = 0;
                                        i2Var = i2Var3;
                                        i28 = i422222222;
                                        bArr2 = bArr;
                                        i29 = i11;
                                        i2Var3 = i2Var;
                                        obj3 = obj2;
                                        i25 = i9;
                                        unsafe5 = unsafe;
                                        i31 = i7;
                                        fVar4 = fVar;
                                    }
                                    i18 = i20;
                                    i17 = i15;
                                    z3 = true;
                                    unsafe2 = unsafe4;
                                    i7 = i17;
                                    i2Var = i2Var3;
                                    z2 = z3;
                                    unsafe = unsafe2;
                                    i10 = i34 == true ? 1 : 0;
                                    i30 = i13;
                                    i28 = i14;
                                    i9 = 0;
                                    fVar2 = fVar3;
                                    obj2 = obj3;
                                    iE = i18;
                                    break;
                                case 9:
                                    i16 = i3;
                                    i20 = i33;
                                    unsafe4 = unsafe5;
                                    fVar3 = fVar;
                                    i8 = iA;
                                    if (i36 == 2) {
                                        iA2 = g.a(i2Var3.c(i8), bArr, i20, i16, fVar3);
                                        if ((i14 & i40) == 0) {
                                            unsafe4.putObject(obj3, j2, fVar3.f56562c);
                                        } else {
                                            unsafe4.putObject(obj3, j2, l1.a(unsafe4.getObject(obj3, j2), fVar3.f56562c));
                                        }
                                        iE2 = iA2;
                                        i17 = i15;
                                        unsafe2 = unsafe4;
                                        int i4222222222 = i14 | i40;
                                        i7 = i17;
                                        obj2 = obj3;
                                        i24 = i16;
                                        i27 = i8;
                                        unsafe = unsafe2;
                                        i11 = i34 == true ? 1 : 0;
                                        i26 = iE2;
                                        i30 = i13;
                                        i9 = 0;
                                        i2Var = i2Var3;
                                        i28 = i4222222222;
                                        bArr2 = bArr;
                                        i29 = i11;
                                        i2Var3 = i2Var;
                                        obj3 = obj2;
                                        i25 = i9;
                                        unsafe5 = unsafe;
                                        i31 = i7;
                                        fVar4 = fVar;
                                    }
                                    i18 = i20;
                                    i17 = i15;
                                    z3 = true;
                                    unsafe2 = unsafe4;
                                    i7 = i17;
                                    i2Var = i2Var3;
                                    z2 = z3;
                                    unsafe = unsafe2;
                                    i10 = i34 == true ? 1 : 0;
                                    i30 = i13;
                                    i28 = i14;
                                    i9 = 0;
                                    fVar2 = fVar3;
                                    obj2 = obj3;
                                    iE = i18;
                                    break;
                                case 10:
                                    i16 = i3;
                                    i20 = i33;
                                    unsafe4 = unsafe5;
                                    fVar3 = fVar;
                                    i8 = iA;
                                    if (i36 == 2) {
                                        iE2 = g.a(bArr, i20, fVar3);
                                        unsafe4.putObject(obj3, j2, fVar3.f56562c);
                                        i17 = i15;
                                        unsafe2 = unsafe4;
                                        int i42222222222 = i14 | i40;
                                        i7 = i17;
                                        obj2 = obj3;
                                        i24 = i16;
                                        i27 = i8;
                                        unsafe = unsafe2;
                                        i11 = i34 == true ? 1 : 0;
                                        i26 = iE2;
                                        i30 = i13;
                                        i9 = 0;
                                        i2Var = i2Var3;
                                        i28 = i42222222222;
                                        bArr2 = bArr;
                                        i29 = i11;
                                        i2Var3 = i2Var;
                                        obj3 = obj2;
                                        i25 = i9;
                                        unsafe5 = unsafe;
                                        i31 = i7;
                                        fVar4 = fVar;
                                    }
                                    i18 = i20;
                                    i17 = i15;
                                    z3 = true;
                                    unsafe2 = unsafe4;
                                    i7 = i17;
                                    i2Var = i2Var3;
                                    z2 = z3;
                                    unsafe = unsafe2;
                                    i10 = i34 == true ? 1 : 0;
                                    i30 = i13;
                                    i28 = i14;
                                    i9 = 0;
                                    fVar2 = fVar3;
                                    obj2 = obj3;
                                    iE = i18;
                                    break;
                                case 12:
                                    i16 = i3;
                                    i20 = i33;
                                    unsafe4 = unsafe5;
                                    fVar3 = fVar;
                                    i8 = iA;
                                    if (i36 == 0) {
                                        int iA6 = i20 + 1;
                                        byte b4 = bArr[i20];
                                        if (b4 >= 0) {
                                            fVar3.f56560a = b4;
                                        } else {
                                            iA6 = g.a(b4, bArr, iA6, fVar3);
                                        }
                                        iE2 = iA6;
                                        int i43 = fVar3.f56560a;
                                        i2Var3.a(i8);
                                        unsafe4.putInt(obj3, j2, i43);
                                        i17 = i15;
                                        unsafe2 = unsafe4;
                                        int i422222222222 = i14 | i40;
                                        i7 = i17;
                                        obj2 = obj3;
                                        i24 = i16;
                                        i27 = i8;
                                        unsafe = unsafe2;
                                        i11 = i34 == true ? 1 : 0;
                                        i26 = iE2;
                                        i30 = i13;
                                        i9 = 0;
                                        i2Var = i2Var3;
                                        i28 = i422222222222;
                                        bArr2 = bArr;
                                        i29 = i11;
                                        i2Var3 = i2Var;
                                        obj3 = obj2;
                                        i25 = i9;
                                        unsafe5 = unsafe;
                                        i31 = i7;
                                        fVar4 = fVar;
                                    }
                                    i18 = i20;
                                    i17 = i15;
                                    z3 = true;
                                    unsafe2 = unsafe4;
                                    i7 = i17;
                                    i2Var = i2Var3;
                                    z2 = z3;
                                    unsafe = unsafe2;
                                    i10 = i34 == true ? 1 : 0;
                                    i30 = i13;
                                    i28 = i14;
                                    i9 = 0;
                                    fVar2 = fVar3;
                                    obj2 = obj3;
                                    iE = i18;
                                    break;
                                case 15:
                                    i16 = i3;
                                    i20 = i33;
                                    unsafe4 = unsafe5;
                                    fVar3 = fVar;
                                    i8 = iA;
                                    if (i36 == 0) {
                                        int iA7 = i20 + 1;
                                        byte b5 = bArr[i20];
                                        if (b5 >= 0) {
                                            fVar3.f56560a = b5;
                                        } else {
                                            iA7 = g.a(b5, bArr, iA7, fVar3);
                                        }
                                        iE2 = iA7;
                                        unsafe4.putInt(obj3, j2, w.b(fVar3.f56560a));
                                        i17 = i15;
                                        unsafe2 = unsafe4;
                                        int i4222222222222 = i14 | i40;
                                        i7 = i17;
                                        obj2 = obj3;
                                        i24 = i16;
                                        i27 = i8;
                                        unsafe = unsafe2;
                                        i11 = i34 == true ? 1 : 0;
                                        i26 = iE2;
                                        i30 = i13;
                                        i9 = 0;
                                        i2Var = i2Var3;
                                        i28 = i4222222222222;
                                        bArr2 = bArr;
                                        i29 = i11;
                                        i2Var3 = i2Var;
                                        obj3 = obj2;
                                        i25 = i9;
                                        unsafe5 = unsafe;
                                        i31 = i7;
                                        fVar4 = fVar;
                                    }
                                    i18 = i20;
                                    i17 = i15;
                                    z3 = true;
                                    unsafe2 = unsafe4;
                                    i7 = i17;
                                    i2Var = i2Var3;
                                    z2 = z3;
                                    unsafe = unsafe2;
                                    i10 = i34 == true ? 1 : 0;
                                    i30 = i13;
                                    i28 = i14;
                                    i9 = 0;
                                    fVar2 = fVar3;
                                    obj2 = obj3;
                                    iE = i18;
                                    break;
                                case 16:
                                    i16 = i3;
                                    i20 = i33;
                                    int i44 = iA;
                                    if (i36 != 0) {
                                        Unsafe unsafe6 = unsafe5;
                                        fVar3 = fVar;
                                        unsafe4 = unsafe6;
                                        i8 = i44;
                                        i18 = i20;
                                        i17 = i15;
                                        z3 = true;
                                        unsafe2 = unsafe4;
                                        i7 = i17;
                                        i2Var = i2Var3;
                                        z2 = z3;
                                        unsafe = unsafe2;
                                        i10 = i34 == true ? 1 : 0;
                                        i30 = i13;
                                        i28 = i14;
                                        i9 = 0;
                                        fVar2 = fVar3;
                                        obj2 = obj3;
                                        iE = i18;
                                    } else {
                                        iE2 = g.e(bArr, i20, fVar);
                                        i8 = i44;
                                        unsafe3 = unsafe5;
                                        unsafe3.putLong(obj3, j2, w.a(fVar.f56561b));
                                        i17 = i15;
                                        unsafe2 = unsafe3;
                                        int i42222222222222 = i14 | i40;
                                        i7 = i17;
                                        obj2 = obj3;
                                        i24 = i16;
                                        i27 = i8;
                                        unsafe = unsafe2;
                                        i11 = i34 == true ? 1 : 0;
                                        i26 = iE2;
                                        i30 = i13;
                                        i9 = 0;
                                        i2Var = i2Var3;
                                        i28 = i42222222222222;
                                        bArr2 = bArr;
                                        i29 = i11;
                                        i2Var3 = i2Var;
                                        obj3 = obj2;
                                        i25 = i9;
                                        unsafe5 = unsafe;
                                        i31 = i7;
                                        fVar4 = fVar;
                                    }
                                    break;
                                case 17:
                                    if (i36 == 3) {
                                        int i45 = iA;
                                        iA2 = g.a(i2Var3.c(iA), bArr, i33, i3, (i13 << 3) | 4, fVar);
                                        i16 = i3;
                                        if ((i14 & i40) == 0) {
                                            unsafe5.putObject(obj3, j2, fVar.f56562c);
                                        } else {
                                            unsafe5.putObject(obj3, j2, l1.a(unsafe5.getObject(obj3, j2), fVar.f56562c));
                                        }
                                        unsafe4 = unsafe5;
                                        i8 = i45;
                                        iE2 = iA2;
                                        i17 = i15;
                                        unsafe2 = unsafe4;
                                        int i422222222222222 = i14 | i40;
                                        i7 = i17;
                                        obj2 = obj3;
                                        i24 = i16;
                                        i27 = i8;
                                        unsafe = unsafe2;
                                        i11 = i34 == true ? 1 : 0;
                                        i26 = iE2;
                                        i30 = i13;
                                        i9 = 0;
                                        i2Var = i2Var3;
                                        i28 = i422222222222222;
                                        bArr2 = bArr;
                                        i29 = i11;
                                        i2Var3 = i2Var;
                                        obj3 = obj2;
                                        i25 = i9;
                                        unsafe5 = unsafe;
                                        i31 = i7;
                                        fVar4 = fVar;
                                        break;
                                    }
                                default:
                                    i18 = i33;
                                    i8 = iA;
                                    i17 = i15;
                                    z3 = true;
                                    unsafe2 = unsafe5;
                                    fVar3 = fVar;
                                    i7 = i17;
                                    i2Var = i2Var3;
                                    z2 = z3;
                                    unsafe = unsafe2;
                                    i10 = i34 == true ? 1 : 0;
                                    i30 = i13;
                                    i28 = i14;
                                    i9 = 0;
                                    fVar2 = fVar3;
                                    obj2 = obj3;
                                    iE = i18;
                                    break;
                            }
                        } else {
                            int i46 = i34 == true ? 1 : 0;
                            Unsafe unsafe7 = unsafe5;
                            i8 = iA;
                            int i47 = i28;
                            if (i38 == 27) {
                                if (i36 == 2) {
                                    k1 k1VarB = (k1) unsafe7.getObject(obj3, j2);
                                    if (!((c) k1VarB).f56537a) {
                                        int size = k1VarB.size();
                                        k1VarB = k1VarB.b(size == 0 ? 10 : size * 2);
                                        unsafe7.putObject(obj3, j2, k1VarB);
                                    }
                                    t2 t2VarC = i2Var3.c(i8);
                                    int iA8 = g.a(t2VarC, bArr, i33, i24, fVar);
                                    k1VarB.add(fVar.f56562c);
                                    while (true) {
                                        if (iA8 < i24) {
                                            int iA9 = iA8 + 1;
                                            byte b6 = bArr[iA8];
                                            if (b6 >= 0) {
                                                fVar.f56560a = b6;
                                            } else {
                                                iA9 = g.a(b6, bArr, iA9, fVar);
                                            }
                                            i23 = i46;
                                            if (i23 == fVar.f56560a) {
                                                iA8 = g.a(t2VarC, bArr, iA9, i24, fVar);
                                                k1VarB.add(fVar.f56562c);
                                                i46 = i23 == true ? 1 : 0;
                                            }
                                        } else {
                                            i23 = i46;
                                        }
                                    }
                                    obj2 = obj3;
                                    unsafe = unsafe7;
                                    i28 = i47;
                                    i7 = i31;
                                    i27 = i8;
                                    i26 = iA8;
                                    i11 = i23;
                                    i30 = i35;
                                    i9 = 0;
                                    i2Var = i2Var3;
                                    bArr2 = bArr;
                                    i29 = i11;
                                    i2Var3 = i2Var;
                                    obj3 = obj2;
                                    i25 = i9;
                                    unsafe5 = unsafe;
                                    i31 = i7;
                                    fVar4 = fVar;
                                } else {
                                    i2Var2 = i2Var3;
                                    unsafe = unsafe7;
                                    i7 = i31;
                                    i21 = i33;
                                    i9 = 0;
                                    z2 = true;
                                    i10 = i46 == true ? 1 : 0;
                                    i22 = i47;
                                }
                            } else if (i38 <= 49) {
                                i7 = i31;
                                unsafe = unsafe7;
                                i22 = i47;
                                i9 = 0;
                                z2 = true;
                                i10 = i46 == true ? 1 : 0;
                                Object obj4 = obj3;
                                fVar2 = fVar;
                                int iA10 = a(obj4, bArr, i33, i24, i10 == true ? 1 : 0, i36, i8, i37, i38, j2, fVar2);
                                i8 = i8;
                                i2Var = this;
                                obj2 = obj4;
                                if (iA10 != i33) {
                                    i26 = iA10;
                                    i30 = i35;
                                    f fVar5 = fVar2;
                                    i29 = i10;
                                    fVar4 = fVar5;
                                    bArr2 = bArr;
                                    i28 = i22;
                                    i24 = i3;
                                    i2Var3 = i2Var;
                                    obj3 = obj2;
                                    i27 = i8;
                                    i25 = i9;
                                    unsafe5 = unsafe;
                                    i31 = i7;
                                } else {
                                    iA3 = iA10;
                                    i30 = i35;
                                    i28 = i22;
                                    iE = iA3;
                                }
                            } else {
                                i9 = 0;
                                unsafe = unsafe7;
                                i22 = i47;
                                i7 = i31;
                                i21 = i33;
                                z2 = true;
                                i10 = i46 == true ? 1 : 0;
                                i2Var2 = this;
                                if (i38 != 50) {
                                    fVar2 = fVar;
                                    Object obj5 = obj3;
                                    i30 = i35;
                                    iA3 = i2Var2.a(obj5, bArr, i21, i3, i10 == true ? 1 : 0, i30, i36, i37, i38, j2, i8, fVar2);
                                    i2Var = i2Var2;
                                    obj2 = obj5;
                                    i8 = i8;
                                    if (iA3 != i21) {
                                        i26 = iA3;
                                        f fVar52 = fVar2;
                                        i29 = i10;
                                        fVar4 = fVar52;
                                        bArr2 = bArr;
                                        i28 = i22;
                                        i24 = i3;
                                        i2Var3 = i2Var;
                                        obj3 = obj2;
                                        i27 = i8;
                                        i25 = i9;
                                        unsafe5 = unsafe;
                                        i31 = i7;
                                    } else {
                                        i28 = i22;
                                        iE = iA3;
                                    }
                                } else if (i36 == 2) {
                                    Unsafe unsafe8 = f56581r;
                                    Object objB = i2Var2.b(i8);
                                    Object object = unsafe8.getObject(obj3, j2);
                                    i2Var2.f56597p.getClass();
                                    if (!((y1) object).f56730a) {
                                        i2Var2.f56597p.getClass();
                                        y1 y1Var = y1.f56729b;
                                        y1 y1Var2 = y1Var.isEmpty() ? new y1() : new y1(y1Var);
                                        i2Var2.f56597p.getClass();
                                        z1.a(y1Var2, object);
                                        unsafe8.putObject(obj3, j2, y1Var2);
                                    }
                                    i2Var2.f56597p.getClass();
                                    objB.getClass();
                                    throw new ClassCastException();
                                }
                            }
                            i28 = i22;
                            fVar2 = fVar;
                            i2Var = i2Var2;
                            obj2 = obj3;
                            iE = i21;
                            i30 = i35;
                        }
                    }
                    if (i10 == i5 || i5 == 0) {
                        if (!i2Var.f56587f && fVar2.f56563d != h0.a()) {
                            d2 d2Var = i2Var.f56586e;
                            o3 o3Var = i2Var.f56595n;
                            x0 x0VarA = fVar2.f56563d.a(i30, d2Var);
                            if (x0VarA == null) {
                                z0 z0Var = (z0) obj2;
                                n3 n3Var2 = z0Var.unknownFields;
                                if (n3Var2 == n3.f56625f) {
                                    n3Var2 = new n3();
                                    z0Var.unknownFields = n3Var2;
                                }
                                i24 = i3;
                                int i48 = i10;
                                int iA11 = g.a(i48 == true ? 1 : 0, bArr, iE, i24, n3Var2, fVar2);
                                i11 = i48 == true ? 1 : 0;
                                i26 = iA11;
                                i27 = i8;
                            } else {
                                i24 = i3;
                                int i49 = i10;
                                f fVar6 = fVar2;
                                GeneratedMessageLite$ExtendableMessage generatedMessageLite$ExtendableMessage = (GeneratedMessageLite$ExtendableMessage) obj2;
                                generatedMessageLite$ExtendableMessage.ensureExtensionsAreMutable();
                                n0 n0Var = generatedMessageLite$ExtendableMessage.extensions;
                                w0 w0Var2 = x0VarA.f56714d;
                                int i50 = i8;
                                if (w0Var2.f56700d && w0Var2.f56701e) {
                                    switch (e.f56550a[w0Var2.f56699c.ordinal()]) {
                                        case 1:
                                            i12 = i49 == true ? 1 : 0;
                                            d0 d0Var = new d0();
                                            iD = g.d(bArr, iE, fVar6);
                                            int i51 = fVar6.f56560a + iD;
                                            while (iD < i51) {
                                                d0Var.a(Double.longBitsToDouble(g.b(iD, bArr)));
                                                iD += 8;
                                            }
                                            if (iD == i51) {
                                                n0Var.c(x0VarA.f56714d, d0Var);
                                                i27 = i50;
                                                i26 = iD;
                                            } else {
                                                throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            break;
                                        case 2:
                                            i12 = i49 == true ? 1 : 0;
                                            q0 q0Var = new q0();
                                            iD = g.d(bArr, iE, fVar6);
                                            int i52 = fVar6.f56560a + iD;
                                            while (iD < i52) {
                                                q0Var.a(Float.intBitsToFloat(g.a(iD, bArr)));
                                                iD += 4;
                                            }
                                            if (iD == i52) {
                                                n0Var.c(x0VarA.f56714d, q0Var);
                                                i27 = i50;
                                                i26 = iD;
                                            } else {
                                                throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            break;
                                        case 3:
                                        case 4:
                                            i12 = i49 == true ? 1 : 0;
                                            u1 u1Var = new u1();
                                            iD = g.d(bArr, iE, fVar6);
                                            int i53 = fVar6.f56560a + iD;
                                            while (iD < i53) {
                                                iD = g.e(bArr, iD, fVar6);
                                                u1Var.a(fVar6.f56561b);
                                            }
                                            if (iD == i53) {
                                                n0Var.c(x0VarA.f56714d, u1Var);
                                                i27 = i50;
                                                i26 = iD;
                                            } else {
                                                throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            break;
                                        case 5:
                                        case 6:
                                            i12 = i49 == true ? 1 : 0;
                                            a1 a1Var = new a1();
                                            iD = g.a(bArr, iE, a1Var, fVar6);
                                            n0Var.c(x0VarA.f56714d, a1Var);
                                            i27 = i50;
                                            i26 = iD;
                                            break;
                                        case 7:
                                        case 8:
                                            i12 = i49 == true ? 1 : 0;
                                            u1 u1Var2 = new u1();
                                            iD = g.d(bArr, iE, fVar6);
                                            int i54 = fVar6.f56560a + iD;
                                            while (iD < i54) {
                                                u1Var2.a(g.b(iD, bArr));
                                                iD += 8;
                                            }
                                            if (iD == i54) {
                                                n0Var.c(x0VarA.f56714d, u1Var2);
                                                i27 = i50;
                                                i26 = iD;
                                            } else {
                                                throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            break;
                                        case 9:
                                        case 10:
                                            i12 = i49 == true ? 1 : 0;
                                            a1 a1Var2 = new a1();
                                            iD = g.d(bArr, iE, fVar6);
                                            int i55 = fVar6.f56560a + iD;
                                            while (iD < i55) {
                                                a1Var2.c(g.a(iD, bArr));
                                                iD += 4;
                                            }
                                            if (iD == i55) {
                                                n0Var.c(x0VarA.f56714d, a1Var2);
                                                i27 = i50;
                                                i26 = iD;
                                            } else {
                                                throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            break;
                                        case 11:
                                            i12 = i49 == true ? 1 : 0;
                                            j jVar = new j();
                                            iD = g.d(bArr, iE, fVar6);
                                            int i56 = fVar6.f56560a + iD;
                                            while (iD < i56) {
                                                iD = g.e(bArr, iD, fVar6);
                                                jVar.a(fVar6.f56561b != 0 ? z2 : i9);
                                            }
                                            if (iD == i56) {
                                                n0Var.c(x0VarA.f56714d, jVar);
                                                i27 = i50;
                                                i26 = iD;
                                            } else {
                                                throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            break;
                                        case 12:
                                            i12 = i49 == true ? 1 : 0;
                                            a1 a1Var3 = new a1();
                                            iD = g.d(bArr, iE, fVar6);
                                            int i57 = fVar6.f56560a + iD;
                                            while (iD < i57) {
                                                int i58 = iD + 1;
                                                byte b7 = bArr[iD];
                                                if (b7 >= 0) {
                                                    fVar6.f56560a = b7;
                                                    iD = i58;
                                                } else {
                                                    iD = g.a(b7, bArr, i58, fVar6);
                                                }
                                                a1Var3.c(w.b(fVar6.f56560a));
                                            }
                                            if (iD == i57) {
                                                n0Var.c(x0VarA.f56714d, a1Var3);
                                                i27 = i50;
                                                i26 = iD;
                                            } else {
                                                throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            break;
                                        case 13:
                                            u1 u1Var3 = new u1();
                                            iD = g.d(bArr, iE, fVar6);
                                            int i59 = fVar6.f56560a + iD;
                                            while (iD < i59) {
                                                iD = g.e(bArr, iD, fVar6);
                                                u1Var3.a(w.a(fVar6.f56561b));
                                                i49 = i49 == true ? 1 : 0;
                                            }
                                            i12 = i49;
                                            if (iD == i59) {
                                                n0Var.c(x0VarA.f56714d, u1Var3);
                                                i27 = i50;
                                                i26 = iD;
                                            } else {
                                                throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            break;
                                        case 14:
                                            a1 a1Var4 = new a1();
                                            int iA12 = g.a(bArr, iE, a1Var4, fVar6);
                                            n3 n3Var3 = generatedMessageLite$ExtendableMessage.unknownFields;
                                            if (n3Var3 == n3.f56625f) {
                                                n3Var3 = null;
                                            }
                                            n3 n3Var4 = (n3) u2.a(i30, a1Var4, x0VarA.f56714d.f56697a, n3Var3, o3Var);
                                            if (n3Var4 != null) {
                                                generatedMessageLite$ExtendableMessage.unknownFields = n3Var4;
                                            }
                                            n0Var.c(x0VarA.f56714d, a1Var4);
                                            i27 = i50;
                                            i11 = i49 == true ? 1 : 0;
                                            i26 = iA12;
                                            break;
                                        default:
                                            throw new IllegalStateException("Type cannot be packed: " + x0VarA.f56714d.f56699c);
                                    }
                                } else {
                                    i12 = i49 == true ? 1 : 0;
                                    j4 j4Var = w0Var2.f56699c;
                                    if (j4Var == j4.ENUM) {
                                        iE = g.d(bArr, iE, fVar6);
                                        if (x0VarA.f56714d.f56697a.a(fVar6.f56560a) == null) {
                                            n3 n3Var5 = generatedMessageLite$ExtendableMessage.unknownFields;
                                            if (n3Var5 == n3.f56625f) {
                                                n3Var5 = new n3();
                                                generatedMessageLite$ExtendableMessage.unknownFields = n3Var5;
                                            }
                                            u2.a(i30, fVar6.f56560a, n3Var5, o3Var);
                                            i27 = i50;
                                            i26 = iE;
                                        } else {
                                            objValueOf = Integer.valueOf(fVar6.f56560a);
                                        }
                                    } else {
                                        switch (e.f56550a[j4Var.ordinal()]) {
                                            case 1:
                                                objValueOf = Double.valueOf(Double.longBitsToDouble(g.b(iE, bArr)));
                                                iE += 8;
                                                objA = objValueOf;
                                                w0Var = x0VarA.f56714d;
                                                if (!w0Var.f56700d) {
                                                    n0Var.a(w0Var, objA);
                                                } else {
                                                    int i60 = e.f56550a[w0Var.f56699c.ordinal()];
                                                    if (i60 == 17 || i60 == 18) {
                                                        Object obj6 = n0Var.f56621a.get(x0VarA.f56714d);
                                                        if (obj6 != null) {
                                                            objA = l1.a(obj6, objA);
                                                        }
                                                    }
                                                    n0Var.c(x0VarA.f56714d, objA);
                                                }
                                                i27 = i50;
                                                i24 = i3;
                                                i26 = iE;
                                                break;
                                            case 2:
                                                objValueOf = Float.valueOf(Float.intBitsToFloat(g.a(iE, bArr)));
                                                iE += 4;
                                                objA = objValueOf;
                                                w0Var = x0VarA.f56714d;
                                                if (!w0Var.f56700d) {
                                                }
                                                i27 = i50;
                                                i24 = i3;
                                                i26 = iE;
                                                break;
                                            case 3:
                                            case 4:
                                                iE = g.e(bArr, iE, fVar6);
                                                objValueOf = Long.valueOf(fVar6.f56561b);
                                                objA = objValueOf;
                                                w0Var = x0VarA.f56714d;
                                                if (!w0Var.f56700d) {
                                                }
                                                i27 = i50;
                                                i24 = i3;
                                                i26 = iE;
                                                break;
                                            case 5:
                                            case 6:
                                                iE = g.d(bArr, iE, fVar6);
                                                objValueOf = Integer.valueOf(fVar6.f56560a);
                                                objA = objValueOf;
                                                w0Var = x0VarA.f56714d;
                                                if (!w0Var.f56700d) {
                                                }
                                                i27 = i50;
                                                i24 = i3;
                                                i26 = iE;
                                                break;
                                            case 7:
                                            case 8:
                                                objValueOf = Long.valueOf(g.b(iE, bArr));
                                                iE += 8;
                                                objA = objValueOf;
                                                w0Var = x0VarA.f56714d;
                                                if (!w0Var.f56700d) {
                                                }
                                                i27 = i50;
                                                i24 = i3;
                                                i26 = iE;
                                                break;
                                            case 9:
                                            case 10:
                                                objValueOf = Integer.valueOf(g.a(iE, bArr));
                                                iE += 4;
                                                objA = objValueOf;
                                                w0Var = x0VarA.f56714d;
                                                if (!w0Var.f56700d) {
                                                }
                                                i27 = i50;
                                                i24 = i3;
                                                i26 = iE;
                                                break;
                                            case 11:
                                                iE = g.e(bArr, iE, fVar6);
                                                objValueOf = Boolean.valueOf(fVar6.f56561b != 0 ? z2 : i9);
                                                objA = objValueOf;
                                                w0Var = x0VarA.f56714d;
                                                if (!w0Var.f56700d) {
                                                }
                                                i27 = i50;
                                                i24 = i3;
                                                i26 = iE;
                                                break;
                                            case 12:
                                                iE = g.d(bArr, iE, fVar6);
                                                objValueOf = Integer.valueOf(w.b(fVar6.f56560a));
                                                objA = objValueOf;
                                                w0Var = x0VarA.f56714d;
                                                if (!w0Var.f56700d) {
                                                }
                                                i27 = i50;
                                                i24 = i3;
                                                i26 = iE;
                                                break;
                                            case 13:
                                                iE = g.e(bArr, iE, fVar6);
                                                objValueOf = Long.valueOf(w.a(fVar6.f56561b));
                                                objA = objValueOf;
                                                w0Var = x0VarA.f56714d;
                                                if (!w0Var.f56700d) {
                                                }
                                                i27 = i50;
                                                i24 = i3;
                                                i26 = iE;
                                                break;
                                            case 14:
                                                throw new IllegalStateException("Shouldn't reach here.");
                                            case 15:
                                                iE = g.a(bArr, iE, fVar6);
                                                objA = fVar6.f56562c;
                                                w0Var = x0VarA.f56714d;
                                                if (!w0Var.f56700d) {
                                                }
                                                i27 = i50;
                                                i24 = i3;
                                                i26 = iE;
                                                break;
                                            case 16:
                                                iE = g.b(bArr, iE, fVar6);
                                                objA = fVar6.f56562c;
                                                w0Var = x0VarA.f56714d;
                                                if (!w0Var.f56700d) {
                                                }
                                                i27 = i50;
                                                i24 = i3;
                                                i26 = iE;
                                                break;
                                            case 17:
                                                iE = g.a(p2.f56635c.a(x0VarA.f56713c.getClass()), bArr, iE, i24, (i30 << 3) | 4, fVar6);
                                                objA = fVar6.f56562c;
                                                w0Var = x0VarA.f56714d;
                                                if (!w0Var.f56700d) {
                                                }
                                                i27 = i50;
                                                i24 = i3;
                                                i26 = iE;
                                                break;
                                            case 18:
                                                iE = g.a(p2.f56635c.a(x0VarA.f56713c.getClass()), bArr, iE, i24, fVar6);
                                                objA = fVar6.f56562c;
                                                w0Var = x0VarA.f56714d;
                                                if (!w0Var.f56700d) {
                                                }
                                                i27 = i50;
                                                i24 = i3;
                                                i26 = iE;
                                                break;
                                        }
                                    }
                                    objA = objValueOf;
                                    w0Var = x0VarA.f56714d;
                                    if (!w0Var.f56700d) {
                                    }
                                    i27 = i50;
                                    i24 = i3;
                                    i26 = iE;
                                }
                                i11 = i12;
                            }
                        } else {
                            int i61 = i10;
                            int i62 = i8;
                            f fVar7 = fVar2;
                            z0 z0Var2 = (z0) obj2;
                            n3Var = z0Var2.unknownFields;
                            if (n3Var == n3.f56625f) {
                                n3Var = new n3();
                                z0Var2.unknownFields = n3Var;
                            }
                            n3 n3Var6 = n3Var;
                            i24 = i3;
                            int iA13 = g.a(i61 == true ? 1 : 0, bArr, iE, i24, n3Var6, fVar7);
                            i11 = i61 == true ? 1 : 0;
                            i27 = i62;
                            i26 = iA13;
                        }
                        bArr2 = bArr;
                        i29 = i11;
                        i2Var3 = i2Var;
                        obj3 = obj2;
                        i25 = i9;
                        unsafe5 = unsafe;
                        i31 = i7;
                        fVar4 = fVar;
                    } else {
                        i24 = i3;
                        i26 = iE;
                        i29 = i10;
                    }
                } else {
                    if (i35 >= i2Var3.f56584c && i35 <= i2Var3.f56585d) {
                        iA = i2Var3.a(i35, i25);
                    }
                    if (iA != -1) {
                    }
                    if (i10 == i5) {
                    }
                    if (!i2Var.f56587f) {
                        int i612 = i10;
                        int i622 = i8;
                        f fVar72 = fVar2;
                        z0 z0Var22 = (z0) obj2;
                        n3Var = z0Var22.unknownFields;
                        if (n3Var == n3.f56625f) {
                        }
                        n3 n3Var62 = n3Var;
                        i24 = i3;
                        int iA132 = g.a(i612 == true ? 1 : 0, bArr, iE, i24, n3Var62, fVar72);
                        i11 = i612 == true ? 1 : 0;
                        i27 = i622;
                        i26 = iA132;
                        bArr2 = bArr;
                        i29 = i11;
                        i2Var3 = i2Var;
                        obj3 = obj2;
                        i25 = i9;
                        unsafe5 = unsafe;
                        i31 = i7;
                        fVar4 = fVar;
                    }
                }
            } else {
                i7 = i31;
                unsafe = unsafe5;
                i2Var = i2Var3;
                obj2 = obj3;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:37:0x009e. Please report as an issue. */
    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final void a(Object obj, byte[] bArr, int i2, int i3, f fVar) throws n1 {
        int iA;
        int i5;
        int i7;
        int i8;
        int i9;
        Unsafe unsafe;
        int i10;
        int i11;
        Unsafe unsafe2;
        Object obj2;
        int i12;
        int i13;
        int i14;
        int i15;
        int iE;
        int i16;
        int i17;
        int iC;
        int i18;
        i2 i2Var = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        int i19 = i3;
        f fVar2 = fVar;
        if (i2Var.f56589h) {
            Unsafe unsafe3 = f56581r;
            int i20 = -1;
            int i21 = 0;
            int iA2 = i2;
            int i22 = -1;
            int i23 = 0;
            int i24 = 0;
            int i25 = 1048575;
            while (iA2 < i19) {
                int iA3 = iA2 + 1;
                int i26 = bArr2[iA2];
                if (i26 < 0) {
                    iA3 = g.a(i26, bArr2, iA3, fVar2);
                    i26 = fVar2.f56560a;
                }
                int i27 = i26 >>> 3;
                int i28 = i26 & 7;
                if (i27 > i22) {
                    int i29 = i24 / 3;
                    if (i27 >= i2Var.f56584c && i27 <= i2Var.f56585d) {
                        iA = i2Var.a(i27, i29);
                        i24 = iA;
                    }
                    i24 = i20;
                } else {
                    if (i27 >= i2Var.f56584c && i27 <= i2Var.f56585d) {
                        iA = i2Var.a(i27, i21);
                        i24 = iA;
                    }
                    i24 = i20;
                }
                if (i24 == i20) {
                    unsafe2 = unsafe3;
                    obj2 = obj3;
                    i5 = i26;
                    i7 = i25;
                    i13 = iA3;
                    i8 = i27;
                    i24 = i21;
                    i11 = i23;
                } else {
                    int[] iArr = i2Var.f56582a;
                    int i30 = iArr[i24 + 1];
                    int i31 = (i30 & 267386880) >>> 20;
                    long j2 = i30 & 1048575;
                    if (i31 <= 17) {
                        int i32 = iArr[i24 + 2];
                        int i33 = 1 << (i32 >>> 20);
                        int i34 = i32 & 1048575;
                        int i35 = 1048575;
                        if (i34 != i25) {
                            if (i25 != 1048575) {
                                unsafe3.putInt(obj3, i25, i23);
                                i35 = 1048575;
                            }
                            if (i34 != i35) {
                                i23 = unsafe3.getInt(obj3, i34);
                            }
                            i14 = i34;
                        } else {
                            i14 = i25;
                        }
                        int i36 = i23;
                        switch (i31) {
                            case 0:
                                i15 = i3;
                                unsafe2 = unsafe3;
                                i5 = i26;
                                if (i28 == 1) {
                                    x3.f56720c.a(obj3, j2, Double.longBitsToDouble(g.b(iA3, bArr2)));
                                    iE = iA3 + 8;
                                    i23 = i36 | i33;
                                    obj2 = obj3;
                                    i18 = i15;
                                    i7 = i14;
                                    iA2 = iE;
                                    i8 = i27;
                                }
                                obj2 = obj3;
                                i7 = i14;
                                i13 = iA3;
                                i8 = i27;
                                i11 = i36;
                                break;
                            case 1:
                                i15 = i3;
                                unsafe2 = unsafe3;
                                i5 = i26;
                                if (i28 == 5) {
                                    x3.f56720c.a(obj3, j2, Float.intBitsToFloat(g.a(iA3, bArr2)));
                                    iE = iA3 + 4;
                                    i23 = i36 | i33;
                                    obj2 = obj3;
                                    i18 = i15;
                                    i7 = i14;
                                    iA2 = iE;
                                    i8 = i27;
                                }
                                obj2 = obj3;
                                i7 = i14;
                                i13 = iA3;
                                i8 = i27;
                                i11 = i36;
                                break;
                            case 2:
                            case 3:
                                i15 = i3;
                                i16 = i26;
                                if (i28 == 0) {
                                    iE = g.e(bArr2, iA3, fVar2);
                                    unsafe3.putLong(obj3, j2, fVar2.f56561b);
                                    unsafe2 = unsafe3;
                                    i23 = i36 | i33;
                                    obj2 = obj3;
                                    i18 = i15;
                                    i7 = i14;
                                    iA2 = iE;
                                    i8 = i27;
                                }
                                unsafe2 = unsafe3;
                                i5 = i16;
                                obj2 = obj3;
                                i7 = i14;
                                i13 = iA3;
                                i8 = i27;
                                i11 = i36;
                                break;
                            case 4:
                            case 11:
                                i15 = i3;
                                i16 = i26;
                                if (i28 == 0) {
                                    int iA4 = iA3 + 1;
                                    byte b2 = bArr2[iA3];
                                    if (b2 >= 0) {
                                        fVar2.f56560a = b2;
                                    } else {
                                        iA4 = g.a(b2, bArr2, iA4, fVar2);
                                    }
                                    iE = iA4;
                                    unsafe3.putInt(obj3, j2, fVar2.f56560a);
                                    unsafe2 = unsafe3;
                                    i23 = i36 | i33;
                                    obj2 = obj3;
                                    i18 = i15;
                                    i7 = i14;
                                    iA2 = iE;
                                    i8 = i27;
                                }
                                unsafe2 = unsafe3;
                                i5 = i16;
                                obj2 = obj3;
                                i7 = i14;
                                i13 = iA3;
                                i8 = i27;
                                i11 = i36;
                                break;
                            case 5:
                            case 14:
                                i15 = i3;
                                if (i28 == 1) {
                                    unsafe3.putLong(obj3, j2, g.b(iA3, bArr2));
                                    iE = iA3 + 8;
                                    unsafe2 = unsafe3;
                                    i23 = i36 | i33;
                                    obj2 = obj3;
                                    i18 = i15;
                                    i7 = i14;
                                    iA2 = iE;
                                    i8 = i27;
                                }
                                unsafe2 = unsafe3;
                                i5 = i26;
                                obj2 = obj3;
                                i7 = i14;
                                i13 = iA3;
                                i8 = i27;
                                i11 = i36;
                                break;
                            case 6:
                            case 13:
                                i15 = i3;
                                if (i28 == 5) {
                                    unsafe3.putInt(obj3, j2, g.a(iA3, bArr2));
                                    iE = iA3 + 4;
                                    unsafe2 = unsafe3;
                                    i23 = i36 | i33;
                                    obj2 = obj3;
                                    i18 = i15;
                                    i7 = i14;
                                    iA2 = iE;
                                    i8 = i27;
                                }
                                unsafe2 = unsafe3;
                                i5 = i26;
                                obj2 = obj3;
                                i7 = i14;
                                i13 = iA3;
                                i8 = i27;
                                i11 = i36;
                                break;
                            case 7:
                                i17 = i3;
                                if (i28 == 0) {
                                    iE = g.e(bArr2, iA3, fVar2);
                                    x3.f56720c.a(obj3, j2, fVar2.f56561b != 0);
                                    unsafe2 = unsafe3;
                                    i15 = i17;
                                    i23 = i36 | i33;
                                    obj2 = obj3;
                                    i18 = i15;
                                    i7 = i14;
                                    iA2 = iE;
                                    i8 = i27;
                                }
                                unsafe2 = unsafe3;
                                i5 = i26;
                                obj2 = obj3;
                                i7 = i14;
                                i13 = iA3;
                                i8 = i27;
                                i11 = i36;
                                break;
                            case 8:
                                i17 = i3;
                                if (i28 == 2) {
                                    if ((536870912 & i30) == 0) {
                                        iC = g.b(bArr2, iA3, fVar2);
                                    } else {
                                        iC = g.c(bArr2, iA3, fVar2);
                                    }
                                    iE = iC;
                                    unsafe3.putObject(obj3, j2, fVar2.f56562c);
                                    unsafe2 = unsafe3;
                                    i15 = i17;
                                    i23 = i36 | i33;
                                    obj2 = obj3;
                                    i18 = i15;
                                    i7 = i14;
                                    iA2 = iE;
                                    i8 = i27;
                                }
                                unsafe2 = unsafe3;
                                i5 = i26;
                                obj2 = obj3;
                                i7 = i14;
                                i13 = iA3;
                                i8 = i27;
                                i11 = i36;
                                break;
                            case 9:
                                if (i28 != 2) {
                                    unsafe2 = unsafe3;
                                    i5 = i26;
                                    obj2 = obj3;
                                    i7 = i14;
                                    i13 = iA3;
                                    i8 = i27;
                                    i11 = i36;
                                } else {
                                    i17 = i3;
                                    iE = g.a(i2Var.c(i24), bArr2, iA3, i17, fVar2);
                                    Object object = unsafe3.getObject(obj3, j2);
                                    if (object == null) {
                                        unsafe3.putObject(obj3, j2, fVar2.f56562c);
                                    } else {
                                        unsafe3.putObject(obj3, j2, l1.a(object, fVar2.f56562c));
                                    }
                                    unsafe2 = unsafe3;
                                    i15 = i17;
                                    i23 = i36 | i33;
                                    obj2 = obj3;
                                    i18 = i15;
                                    i7 = i14;
                                    iA2 = iE;
                                    i8 = i27;
                                }
                                break;
                            case 10:
                                if (i28 != 2) {
                                    unsafe2 = unsafe3;
                                    i5 = i26;
                                    obj2 = obj3;
                                    i7 = i14;
                                    i13 = iA3;
                                    i8 = i27;
                                    i11 = i36;
                                } else {
                                    iE = g.a(bArr2, iA3, fVar2);
                                    unsafe3.putObject(obj3, j2, fVar2.f56562c);
                                    i15 = i3;
                                    unsafe2 = unsafe3;
                                    i23 = i36 | i33;
                                    obj2 = obj3;
                                    i18 = i15;
                                    i7 = i14;
                                    iA2 = iE;
                                    i8 = i27;
                                }
                                break;
                            case 12:
                                if (i28 != 0) {
                                    unsafe2 = unsafe3;
                                    i5 = i26;
                                    obj2 = obj3;
                                    i7 = i14;
                                    i13 = iA3;
                                    i8 = i27;
                                    i11 = i36;
                                } else {
                                    int iA5 = iA3 + 1;
                                    byte b4 = bArr2[iA3];
                                    if (b4 >= 0) {
                                        fVar2.f56560a = b4;
                                    } else {
                                        iA5 = g.a(b4, bArr2, iA5, fVar2);
                                    }
                                    iE = iA5;
                                    unsafe3.putInt(obj3, j2, fVar2.f56560a);
                                    i15 = i3;
                                    unsafe2 = unsafe3;
                                    i23 = i36 | i33;
                                    obj2 = obj3;
                                    i18 = i15;
                                    i7 = i14;
                                    iA2 = iE;
                                    i8 = i27;
                                }
                                break;
                            case 15:
                                if (i28 != 0) {
                                    unsafe2 = unsafe3;
                                    i5 = i26;
                                    obj2 = obj3;
                                    i7 = i14;
                                    i13 = iA3;
                                    i8 = i27;
                                    i11 = i36;
                                } else {
                                    int iA6 = iA3 + 1;
                                    byte b5 = bArr2[iA3];
                                    if (b5 >= 0) {
                                        fVar2.f56560a = b5;
                                    } else {
                                        iA6 = g.a(b5, bArr2, iA6, fVar2);
                                    }
                                    iE = iA6;
                                    unsafe3.putInt(obj3, j2, w.b(fVar2.f56560a));
                                    i15 = i3;
                                    unsafe2 = unsafe3;
                                    i23 = i36 | i33;
                                    obj2 = obj3;
                                    i18 = i15;
                                    i7 = i14;
                                    iA2 = iE;
                                    i8 = i27;
                                }
                                break;
                            case 16:
                                if (i28 != 0) {
                                    unsafe2 = unsafe3;
                                    i5 = i26;
                                    obj2 = obj3;
                                    i7 = i14;
                                    i13 = iA3;
                                    i8 = i27;
                                    i11 = i36;
                                } else {
                                    iE = g.e(bArr2, iA3, fVar2);
                                    unsafe3.putLong(obj3, j2, w.a(fVar2.f56561b));
                                    i15 = i3;
                                    unsafe2 = unsafe3;
                                    i23 = i36 | i33;
                                    obj2 = obj3;
                                    i18 = i15;
                                    i7 = i14;
                                    iA2 = iE;
                                    i8 = i27;
                                }
                                break;
                            default:
                                unsafe2 = unsafe3;
                                i5 = i26;
                                obj2 = obj3;
                                i7 = i14;
                                i13 = iA3;
                                i8 = i27;
                                i11 = i36;
                                break;
                        }
                        i2Var = this;
                        bArr2 = bArr;
                        fVar2 = fVar;
                        i19 = i18;
                        obj3 = obj2;
                        unsafe3 = unsafe2;
                        i22 = i8;
                        i25 = i7;
                        i20 = -1;
                        i21 = 0;
                    } else {
                        i19 = i3;
                        int i37 = i26;
                        int i38 = i25;
                        int i39 = i23;
                        Unsafe unsafe4 = unsafe3;
                        if (i31 != 27) {
                            i5 = i37 == true ? 1 : 0;
                            if (i31 <= 49) {
                                int i40 = iA3;
                                i8 = i27;
                                Object obj4 = obj3;
                                byte[] bArr3 = bArr2;
                                int i41 = i24;
                                int iA7 = a(obj4, bArr3, i40, i3, i5 == true ? 1 : 0, i28, i41, i30, i31, j2, fVar2);
                                i5 = i5 == true ? 1 : 0;
                                i9 = i41;
                                unsafe2 = unsafe4;
                                if (iA7 != i40) {
                                    iA2 = iA7;
                                    i7 = i38;
                                    i11 = i39;
                                    obj2 = obj4;
                                    i2Var = this;
                                    bArr2 = bArr;
                                    i19 = i3;
                                    fVar2 = fVar;
                                    obj3 = obj2;
                                    i24 = i9;
                                    unsafe3 = unsafe2;
                                    i23 = i11;
                                } else {
                                    i12 = iA7;
                                    i7 = i38;
                                    i11 = i39;
                                    obj2 = obj4;
                                    i13 = i12;
                                    i24 = i9;
                                }
                            } else {
                                i7 = i38;
                                i8 = i27;
                                i9 = i24;
                                unsafe = unsafe4;
                                i10 = iA3;
                                if (i31 != 50) {
                                    Object obj5 = obj3;
                                    i11 = i39;
                                    unsafe2 = unsafe;
                                    int iA8 = a(obj5, bArr, i10, i3, i5 == true ? 1 : 0, i8, i28, i30, i31, j2, i9, fVar);
                                    obj2 = obj5;
                                    i5 = i5 == true ? 1 : 0;
                                    if (iA8 != i10) {
                                        iA2 = iA8;
                                        i2Var = this;
                                        bArr2 = bArr;
                                        i19 = i3;
                                        fVar2 = fVar;
                                        obj3 = obj2;
                                        i24 = i9;
                                        unsafe3 = unsafe2;
                                        i23 = i11;
                                    } else {
                                        i12 = iA8;
                                        i13 = i12;
                                        i24 = i9;
                                    }
                                } else if (i28 == 2) {
                                    Unsafe unsafe5 = f56581r;
                                    Object objB = b(i9);
                                    Object object2 = unsafe5.getObject(obj3, j2);
                                    this.f56597p.getClass();
                                    if (!((y1) object2).f56730a) {
                                        this.f56597p.getClass();
                                        y1 y1Var = y1.f56729b;
                                        y1 y1Var2 = y1Var.isEmpty() ? new y1() : new y1(y1Var);
                                        this.f56597p.getClass();
                                        z1.a(y1Var2, object2);
                                        unsafe5.putObject(obj3, j2, y1Var2);
                                    }
                                    this.f56597p.getClass();
                                    objB.getClass();
                                    throw new ClassCastException();
                                }
                            }
                            i22 = i8;
                            i25 = i7;
                            i20 = -1;
                            i21 = 0;
                        } else if (i28 == 2) {
                            k1 k1VarB = (k1) unsafe4.getObject(obj3, j2);
                            if (!((c) k1VarB).f56537a) {
                                int size = k1VarB.size();
                                k1VarB = k1VarB.b(size == 0 ? 10 : size * 2);
                                unsafe4.putObject(obj3, j2, k1VarB);
                            }
                            t2 t2VarC = i2Var.c(i24);
                            int iA9 = g.a(t2VarC, bArr2, iA3, i19, fVar2);
                            k1VarB.add(fVar2.f56562c);
                            while (iA9 < i19) {
                                int iA10 = iA9 + 1;
                                byte b6 = bArr2[iA9];
                                if (b6 >= 0) {
                                    fVar2.f56560a = b6;
                                } else {
                                    iA10 = g.a(b6, bArr2, iA10, fVar2);
                                }
                                int i42 = i37;
                                if (i42 != fVar2.f56560a) {
                                    unsafe3 = unsafe4;
                                    iA2 = iA9;
                                    i25 = i38;
                                    i22 = i27;
                                    i23 = i39;
                                    i20 = -1;
                                    i21 = 0;
                                } else {
                                    iA9 = g.a(t2VarC, bArr2, iA10, i19, fVar2);
                                    k1VarB.add(fVar2.f56562c);
                                    i37 = i42 == true ? 1 : 0;
                                }
                            }
                            unsafe3 = unsafe4;
                            iA2 = iA9;
                            i25 = i38;
                            i22 = i27;
                            i23 = i39;
                            i20 = -1;
                            i21 = 0;
                        } else {
                            i5 = i37 == true ? 1 : 0;
                            unsafe = unsafe4;
                            i7 = i38;
                            i10 = iA3;
                            i8 = i27;
                            i9 = i24;
                        }
                        obj2 = obj3;
                        i13 = i10;
                        unsafe2 = unsafe;
                        i24 = i9;
                        i11 = i39;
                    }
                }
                z0 z0Var = (z0) obj2;
                n3 n3Var = z0Var.unknownFields;
                if (n3Var == n3.f56625f) {
                    n3Var = new n3();
                    z0Var.unknownFields = n3Var;
                }
                i18 = i3;
                iA2 = g.a(i5 == true ? 1 : 0, bArr, i13, i3, n3Var, fVar);
                i23 = i11;
                i2Var = this;
                bArr2 = bArr;
                fVar2 = fVar;
                i19 = i18;
                obj3 = obj2;
                unsafe3 = unsafe2;
                i22 = i8;
                i25 = i7;
                i20 = -1;
                i21 = 0;
            }
            Unsafe unsafe6 = unsafe3;
            Object obj6 = obj3;
            int i43 = i25;
            int i44 = i23;
            int i45 = i19;
            if (i43 != 1048575) {
                unsafe6.putInt(obj6, i43, i44);
            }
            if (iA2 != i45) {
                throw new n1("Failed to parse the message.");
            }
            return;
        }
        a(obj3, bArr, i2, i19, 0, fVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a7  */
    @Override // com.fyber.inneractive.sdk.protobuf.t2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Object obj) {
        boolean zA;
        int i2 = 1048575;
        int i3 = 0;
        int i5 = 0;
        while (true) {
            boolean zA2 = true;
            if (i3 < this.f56591j) {
                int i7 = this.f56590i[i3];
                int[] iArr = this.f56582a;
                int i8 = iArr[i7];
                int i9 = iArr[i7 + 1];
                int i10 = iArr[i7 + 2];
                int i11 = i10 & 1048575;
                int i12 = 1 << (i10 >>> 20);
                if (i11 != i2) {
                    if (i11 != 1048575) {
                        i5 = f56581r.getInt(obj, i11);
                    }
                    i2 = i11;
                }
                if ((268435456 & i9) != 0) {
                    if (i2 == 1048575) {
                        zA = a(i7, obj);
                    } else {
                        zA = (i5 & i12) != 0;
                    }
                    if (!zA) {
                        return false;
                    }
                }
                int i13 = (267386880 & i9) >>> 20;
                if (i13 == 9 || i13 == 17) {
                    if (i2 == 1048575) {
                        zA2 = a(i7, obj);
                    } else if ((i12 & i5) == 0) {
                        zA2 = false;
                    }
                    if (zA2 && !c(i7).a(x3.e(obj, i9 & 1048575))) {
                        return false;
                    }
                } else if (i13 == 27) {
                    List list = (List) x3.e(obj, i9 & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        t2 t2VarC = c(i7);
                        for (int i14 = 0; i14 < list.size(); i14++) {
                            if (!t2VarC.a(list.get(i14))) {
                                return false;
                            }
                        }
                    }
                } else if (i13 == 60 || i13 == 68) {
                    if (a(obj, i8, i7) && !c(i7).a(x3.e(obj, i9 & 1048575))) {
                        return false;
                    }
                } else if (i13 != 49) {
                    if (i13 != 50) {
                        continue;
                    } else {
                        z1 z1Var = this.f56597p;
                        Object objE = x3.e(obj, i9 & 1048575);
                        z1Var.getClass();
                        if (!((y1) objE).isEmpty()) {
                            Object objB = b(i7);
                            this.f56597p.getClass();
                            objB.getClass();
                            throw new ClassCastException();
                        }
                    }
                }
                i3++;
            } else {
                if (this.f56587f) {
                    this.f56596o.getClass();
                    if (!((GeneratedMessageLite$ExtendableMessage) obj).extensions.c()) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    public static void a(int i2, Object obj, c0 c0Var) {
        if (obj instanceof String) {
            c0Var.f56538a.a((String) obj, i2);
        } else {
            c0Var.f56538a.a(i2, (s) obj);
        }
    }

    public final void a(Object obj, int i2, s2 s2Var) {
        if ((536870912 & i2) != 0) {
            s2Var.b(this.f56594m.b(obj, i2 & 1048575));
        } else {
            s2Var.q(this.f56594m.b(obj, i2 & 1048575));
        }
    }

    public final void a(Object obj, int i2, s2 s2Var, t2 t2Var, h0 h0Var) {
        s2Var.b(this.f56594m.b(obj, i2 & 1048575), t2Var, h0Var);
    }

    public final void a(Object obj, long j2, s2 s2Var, t2 t2Var, h0 h0Var) {
        s2Var.a(this.f56594m.b(obj, j2), t2Var, h0Var);
    }

    public final boolean a(int i2, Object obj) {
        int[] iArr = this.f56582a;
        int i3 = iArr[i2 + 2];
        long j2 = i3 & 1048575;
        if (j2 != 1048575) {
            return ((1 << (i3 >>> 20)) & x3.c(obj, j2)) != 0;
        }
        int i5 = iArr[i2 + 1];
        long j3 = i5 & 1048575;
        switch ((i5 & 267386880) >>> 20) {
            case 0:
                return x3.f56720c.c(obj, j3) != 0.0d;
            case 1:
                return x3.f56720c.d(obj, j3) != 0.0f;
            case 2:
                return x3.d(obj, j3) != 0;
            case 3:
                return x3.d(obj, j3) != 0;
            case 4:
                return x3.c(obj, j3) != 0;
            case 5:
                return x3.d(obj, j3) != 0;
            case 6:
                return x3.c(obj, j3) != 0;
            case 7:
                return x3.f56720c.a(obj, j3);
            case 8:
                Object objE = x3.e(obj, j3);
                if (objE instanceof String) {
                    return !((String) objE).isEmpty();
                }
                if (objE instanceof s) {
                    return !s.f56654b.equals(objE);
                }
                throw new IllegalArgumentException();
            case 9:
                return x3.e(obj, j3) != null;
            case 10:
                return !s.f56654b.equals(x3.e(obj, j3));
            case 11:
                return x3.c(obj, j3) != 0;
            case 12:
                return x3.c(obj, j3) != 0;
            case 13:
                return x3.c(obj, j3) != 0;
            case 14:
                return x3.d(obj, j3) != 0;
            case 15:
                return x3.c(obj, j3) != 0;
            case 16:
                return x3.d(obj, j3) != 0;
            case 17:
                return x3.e(obj, j3) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean a(Object obj, int i2, int i3) {
        return x3.c(obj, (long) (this.f56582a[i3 + 2] & 1048575)) == i2;
    }

    public final boolean a(int i2, Object obj, Object obj2) {
        return a(i2, obj) == a(i2, obj2);
    }

    public final int a(int i2, int i3) {
        int length = (this.f56582a.length / 3) - 1;
        while (i3 <= length) {
            int i5 = (length + i3) >>> 1;
            int i7 = i5 * 3;
            int i8 = this.f56582a[i7];
            if (i2 == i8) {
                return i7;
            }
            if (i2 < i8) {
                length = i5 - 1;
            } else {
                i3 = i5 + 1;
            }
        }
        return -1;
    }
}
