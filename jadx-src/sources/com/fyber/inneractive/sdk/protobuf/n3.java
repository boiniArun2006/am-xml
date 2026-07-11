package com.fyber.inneractive.sdk.protobuf;

import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class n3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n3 f56625f = new n3(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f56626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f56627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f56628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f56629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f56630e;

    public n3() {
        this(0, new int[8], new Object[8], true);
    }

    public static n3 a(n3 n3Var, n3 n3Var2) {
        int i2 = n3Var.f56626a + n3Var2.f56626a;
        int[] iArrCopyOf = Arrays.copyOf(n3Var.f56627b, i2);
        System.arraycopy(n3Var2.f56627b, 0, iArrCopyOf, n3Var.f56626a, n3Var2.f56626a);
        Object[] objArrCopyOf = Arrays.copyOf(n3Var.f56628c, i2);
        System.arraycopy(n3Var2.f56628c, 0, objArrCopyOf, n3Var.f56626a, n3Var2.f56626a);
        return new n3(i2, iArrCopyOf, objArrCopyOf, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof n3)) {
            return false;
        }
        n3 n3Var = (n3) obj;
        int i2 = this.f56626a;
        if (i2 == n3Var.f56626a) {
            int[] iArr = this.f56627b;
            int[] iArr2 = n3Var.f56627b;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    Object[] objArr = this.f56628c;
                    Object[] objArr2 = n3Var.f56628c;
                    int i5 = this.f56626a;
                    for (int i7 = 0; i7 < i5; i7++) {
                        if (objArr[i7].equals(objArr2[i7])) {
                        }
                    }
                    return true;
                }
                if (iArr[i3] != iArr2[i3]) {
                    break;
                }
                i3++;
            }
        }
        return false;
    }

    public n3(int i2, int[] iArr, Object[] objArr, boolean z2) {
        this.f56629d = -1;
        this.f56626a = i2;
        this.f56627b = iArr;
        this.f56628c = objArr;
        this.f56630e = z2;
    }

    public final int hashCode() {
        int i2 = this.f56626a;
        int i3 = (i2 + 527) * 31;
        int[] iArr = this.f56627b;
        int iHashCode = 17;
        int i5 = 17;
        for (int i7 = 0; i7 < i2; i7++) {
            i5 = (i5 * 31) + iArr[i7];
        }
        int i8 = (i3 + i5) * 31;
        Object[] objArr = this.f56628c;
        int i9 = this.f56626a;
        for (int i10 = 0; i10 < i9; i10++) {
            iHashCode = (iHashCode * 31) + objArr[i10].hashCode();
        }
        return i8 + iHashCode;
    }

    public final boolean a(int i2, w wVar) throws m1 {
        int iT;
        if (!this.f56630e) {
            throw new UnsupportedOperationException();
        }
        int i3 = i2 >>> 3;
        int i5 = i2 & 7;
        if (i5 == 0) {
            a(i2, Long.valueOf(wVar.l()));
            return true;
        }
        if (i5 == 1) {
            a(i2, Long.valueOf(wVar.i()));
            return true;
        }
        if (i5 == 2) {
            a(i2, wVar.e());
            return true;
        }
        if (i5 != 3) {
            if (i5 == 4) {
                return false;
            }
            if (i5 == 5) {
                a(i2, Integer.valueOf(wVar.h()));
                return true;
            }
            int i7 = n1.f56624a;
            throw new m1();
        }
        n3 n3Var = new n3();
        do {
            iT = wVar.t();
            if (iT == 0) {
                break;
            }
        } while (n3Var.a(iT, wVar));
        wVar.a((i3 << 3) | 4);
        a(i2, n3Var);
        return true;
    }

    public final void a(int i2, Object obj) {
        if (this.f56630e) {
            int i3 = this.f56626a;
            int[] iArr = this.f56627b;
            if (i3 == iArr.length) {
                int i5 = i3 + (i3 < 4 ? 8 : i3 >> 1);
                this.f56627b = Arrays.copyOf(iArr, i5);
                this.f56628c = Arrays.copyOf(this.f56628c, i5);
            }
            int[] iArr2 = this.f56627b;
            int i7 = this.f56626a;
            iArr2[i7] = i2;
            this.f56628c[i7] = obj;
            this.f56626a = i7 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void a(c0 c0Var) {
        if (this.f56626a == 0) {
            return;
        }
        c0Var.getClass();
        for (int i2 = 0; i2 < this.f56626a; i2++) {
            int i3 = this.f56627b[i2];
            Object obj = this.f56628c[i2];
            int i5 = i3 >>> 3;
            int i7 = i3 & 7;
            if (i7 == 0) {
                c0Var.f56538a.b(i5, ((Long) obj).longValue());
            } else if (i7 == 1) {
                c0Var.f56538a.a(i5, ((Long) obj).longValue());
            } else if (i7 == 2) {
                c0Var.f56538a.a(i5, (s) obj);
            } else if (i7 == 3) {
                c0Var.f56538a.c(i5, 3);
                ((n3) obj).a(c0Var);
                c0Var.f56538a.c(i5, 4);
            } else if (i7 == 5) {
                c0Var.f56538a.a(i5, ((Integer) obj).intValue());
            } else {
                int i8 = n1.f56624a;
                throw new RuntimeException(new m1());
            }
        }
    }

    public final int a() {
        int iB;
        int i2 = this.f56629d;
        if (i2 != -1) {
            return i2;
        }
        int iA = 0;
        for (int i3 = 0; i3 < this.f56626a; i3++) {
            int i5 = this.f56627b[i3];
            int i7 = i5 >>> 3;
            int i8 = i5 & 7;
            if (i8 == 0) {
                iB = b0.b(i7) + b0.a(((Long) this.f56628c[i3]).longValue());
            } else if (i8 == 1) {
                ((Long) this.f56628c[i3]).getClass();
                iB = b0.b(i7) + 8;
            } else if (i8 == 2) {
                iB = b0.a((s) this.f56628c[i3]) + b0.b(i7);
            } else if (i8 == 3) {
                iA = ((n3) this.f56628c[i3]).a() + (b0.b(i7) * 2) + iA;
            } else if (i8 == 5) {
                ((Integer) this.f56628c[i3]).getClass();
                iB = b0.b(i7) + 4;
            } else {
                int i9 = n1.f56624a;
                throw new IllegalStateException(new m1());
            }
            iA = iB + iA;
        }
        this.f56629d = iA;
        return iA;
    }
}
