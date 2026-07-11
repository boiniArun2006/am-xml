package com.fyber.inneractive.sdk.protobuf;

import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class g {
    public static int a(int i2, byte[] bArr, int i3, f fVar) {
        int i5 = i2 & 127;
        int i7 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            fVar.f56560a = i5 | (b2 << 7);
            return i7;
        }
        int i8 = i5 | ((b2 & ByteCompanionObject.MAX_VALUE) << 7);
        int i9 = i3 + 2;
        byte b4 = bArr[i7];
        if (b4 >= 0) {
            fVar.f56560a = i8 | (b4 << 14);
            return i9;
        }
        int i10 = i8 | ((b4 & ByteCompanionObject.MAX_VALUE) << 14);
        int i11 = i3 + 3;
        byte b5 = bArr[i9];
        if (b5 >= 0) {
            fVar.f56560a = i10 | (b5 << 21);
            return i11;
        }
        int i12 = i10 | ((b5 & ByteCompanionObject.MAX_VALUE) << 21);
        int i13 = i3 + 4;
        byte b6 = bArr[i11];
        if (b6 >= 0) {
            fVar.f56560a = i12 | (b6 << 28);
            return i13;
        }
        int i14 = i12 | ((b6 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i15 = i13 + 1;
            if (bArr[i13] >= 0) {
                fVar.f56560a = i14;
                return i15;
            }
            i13 = i15;
        }
    }

    public static long b(int i2, byte[] bArr) {
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    public static int c(byte[] bArr, int i2, f fVar) {
        int iD = d(bArr, i2, fVar);
        int i3 = fVar.f56560a;
        if (i3 < 0) {
            throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i3 == 0) {
            fVar.f56562c = "";
            return iD;
        }
        fVar.f56562c = d4.f56549a.a(bArr, iD, i3);
        return iD + i3;
    }

    public static int b(byte[] bArr, int i2, f fVar) {
        int iD = d(bArr, i2, fVar);
        int i3 = fVar.f56560a;
        if (i3 < 0) {
            throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i3 == 0) {
            fVar.f56562c = "";
            return iD;
        }
        fVar.f56562c = new String(bArr, iD, i3, l1.f56612a);
        return iD + i3;
    }

    public static int d(byte[] bArr, int i2, f fVar) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return a(b2, bArr, i3, fVar);
        }
        fVar.f56560a = b2;
        return i3;
    }

    public static int e(byte[] bArr, int i2, f fVar) {
        int i3 = i2 + 1;
        long j2 = bArr[i2];
        if (j2 >= 0) {
            fVar.f56561b = j2;
            return i3;
        }
        int i5 = i2 + 2;
        byte b2 = bArr[i3];
        long j3 = (j2 & 127) | (((long) (b2 & ByteCompanionObject.MAX_VALUE)) << 7);
        int i7 = 7;
        while (b2 < 0) {
            int i8 = i5 + 1;
            byte b4 = bArr[i5];
            i7 += 7;
            j3 |= ((long) (b4 & ByteCompanionObject.MAX_VALUE)) << i7;
            b2 = b4;
            i5 = i8;
        }
        fVar.f56561b = j3;
        return i5;
    }

    public static int b(int i2, byte[] bArr, int i3, int i5, k1 k1Var, f fVar) throws n1 {
        int iD = d(bArr, i3, fVar);
        int i7 = fVar.f56560a;
        if (i7 < 0) {
            throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i7 == 0) {
            k1Var.add("");
        } else {
            int i8 = iD + i7;
            if (d4.f56549a.b(bArr, iD, i8)) {
                k1Var.add(new String(bArr, iD, i7, l1.f56612a));
                iD = i8;
            } else {
                throw new n1("Protocol message had invalid UTF-8.");
            }
        }
        while (iD < i5) {
            int iA = iD + 1;
            byte b2 = bArr[iD];
            if (b2 >= 0) {
                fVar.f56560a = b2;
            } else {
                iA = a(b2, bArr, iA, fVar);
            }
            if (i2 != fVar.f56560a) {
                break;
            }
            iD = iA + 1;
            byte b4 = bArr[iA];
            if (b4 >= 0) {
                fVar.f56560a = b4;
            } else {
                iD = a(b4, bArr, iD, fVar);
            }
            int i9 = fVar.f56560a;
            if (i9 < 0) {
                throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i9 == 0) {
                k1Var.add("");
            } else {
                int i10 = iD + i9;
                if (d4.f56549a.b(bArr, iD, i10)) {
                    k1Var.add(new String(bArr, iD, i9, l1.f56612a));
                    iD = i10;
                } else {
                    throw new n1("Protocol message had invalid UTF-8.");
                }
            }
        }
        return iD;
    }

    public static int c(int i2, byte[] bArr, int i3, int i5, k1 k1Var, f fVar) {
        a1 a1Var = (a1) k1Var;
        int iD = d(bArr, i3, fVar);
        a1Var.c(fVar.f56560a);
        while (iD < i5) {
            int iA = iD + 1;
            byte b2 = bArr[iD];
            if (b2 >= 0) {
                fVar.f56560a = b2;
            } else {
                iA = a(b2, bArr, iA, fVar);
            }
            if (i2 != fVar.f56560a) {
                break;
            }
            iD = iA + 1;
            byte b4 = bArr[iA];
            if (b4 >= 0) {
                fVar.f56560a = b4;
            } else {
                iD = a(b4, bArr, iD, fVar);
            }
            a1Var.c(fVar.f56560a);
        }
        return iD;
    }

    public static int a(int i2, byte[] bArr, int i3, int i5, n3 n3Var, f fVar) {
        if ((i2 >>> 3) == 0) {
            throw new n1("Protocol message contained an invalid tag (zero).");
        }
        int i7 = i2 & 7;
        if (i7 == 0) {
            int iE = e(bArr, i3, fVar);
            n3Var.a(i2, Long.valueOf(fVar.f56561b));
            return iE;
        }
        if (i7 == 1) {
            n3Var.a(i2, Long.valueOf(b(i3, bArr)));
            return i3 + 8;
        }
        if (i7 == 2) {
            int iD = d(bArr, i3, fVar);
            int i8 = fVar.f56560a;
            if (i8 >= 0) {
                if (i8 > bArr.length - iD) {
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i8 == 0) {
                    n3Var.a(i2, s.f56654b);
                } else {
                    s.a(iD, iD + i8, bArr.length);
                    n3Var.a(i2, new q(s.f56655c.a(bArr, iD, i8)));
                }
                return iD + i8;
            }
            throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i7 != 3) {
            if (i7 == 5) {
                n3Var.a(i2, Integer.valueOf(a(i3, bArr)));
                return i3 + 4;
            }
            throw new n1("Protocol message contained an invalid tag (zero).");
        }
        n3 n3Var2 = new n3();
        int i9 = (i2 & (-8)) | 4;
        int i10 = 0;
        while (true) {
            if (i3 >= i5) {
                break;
            }
            int iD2 = d(bArr, i3, fVar);
            int i11 = fVar.f56560a;
            if (i11 == i9) {
                i10 = i11;
                i3 = iD2;
                break;
            }
            i3 = a(i11, bArr, iD2, i5, n3Var2, fVar);
            i10 = i11;
        }
        if (i3 <= i5 && i10 == i9) {
            n3Var.a(i2, n3Var2);
            return i3;
        }
        throw new n1("Failed to parse the message.");
    }

    public static int a(int i2, byte[] bArr, int i3, int i5, f fVar) {
        if ((i2 >>> 3) == 0) {
            throw new n1("Protocol message contained an invalid tag (zero).");
        }
        int i7 = i2 & 7;
        if (i7 == 0) {
            return e(bArr, i3, fVar);
        }
        if (i7 == 1) {
            return i3 + 8;
        }
        if (i7 == 2) {
            return d(bArr, i3, fVar) + fVar.f56560a;
        }
        if (i7 != 3) {
            if (i7 == 5) {
                return i3 + 4;
            }
            throw new n1("Protocol message contained an invalid tag (zero).");
        }
        int i8 = (i2 & (-8)) | 4;
        int i9 = 0;
        while (i3 < i5) {
            i3 = d(bArr, i3, fVar);
            i9 = fVar.f56560a;
            if (i9 == i8) {
                break;
            }
            i3 = a(i9, bArr, i3, i5, fVar);
        }
        if (i3 > i5 || i9 != i8) {
            throw new n1("Failed to parse the message.");
        }
        return i3;
    }

    public static int a(int i2, byte[] bArr) {
        return ((bArr[i2 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i2] & UByte.MAX_VALUE) | ((bArr[i2 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i2 + 2] & UByte.MAX_VALUE) << 16);
    }

    public static int a(byte[] bArr, int i2, f fVar) {
        int iD = d(bArr, i2, fVar);
        int i3 = fVar.f56560a;
        if (i3 >= 0) {
            if (i3 > bArr.length - iD) {
                throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i3 == 0) {
                fVar.f56562c = s.f56654b;
                return iD;
            }
            int i5 = iD + i3;
            s.a(iD, i5, bArr.length);
            fVar.f56562c = new q(s.f56655c.a(bArr, iD, i3));
            return i5;
        }
        throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static int a(t2 t2Var, byte[] bArr, int i2, int i3, f fVar) {
        int iA = i2 + 1;
        int i5 = bArr[i2];
        if (i5 < 0) {
            iA = a(i5, bArr, iA, fVar);
            i5 = fVar.f56560a;
        }
        int i7 = iA;
        if (i5 >= 0 && i5 <= i3 - i7) {
            Object objA = t2Var.a();
            int i8 = i7 + i5;
            t2Var.a(objA, bArr, i7, i8, fVar);
            t2Var.c(objA);
            fVar.f56562c = objA;
            return i8;
        }
        throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int a(t2 t2Var, byte[] bArr, int i2, int i3, int i5, f fVar) {
        i2 i2Var = (i2) t2Var;
        Object objA = i2Var.a();
        int iA = i2Var.a(objA, bArr, i2, i3, i5, fVar);
        i2Var.c(objA);
        fVar.f56562c = objA;
        return iA;
    }

    public static int a(byte[] bArr, int i2, k1 k1Var, f fVar) {
        a1 a1Var = (a1) k1Var;
        int iD = d(bArr, i2, fVar);
        int i3 = fVar.f56560a + iD;
        while (iD < i3) {
            int i5 = iD + 1;
            byte b2 = bArr[iD];
            if (b2 >= 0) {
                fVar.f56560a = b2;
                iD = i5;
            } else {
                iD = a(b2, bArr, i5, fVar);
            }
            a1Var.c(fVar.f56560a);
        }
        if (iD == i3) {
            return iD;
        }
        throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int a(int i2, byte[] bArr, int i3, int i5, k1 k1Var, f fVar) throws n1 {
        int iD = d(bArr, i3, fVar);
        int i7 = fVar.f56560a;
        if (i7 < 0) {
            throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i7 == 0) {
            k1Var.add("");
        } else {
            k1Var.add(new String(bArr, iD, i7, l1.f56612a));
            iD += i7;
        }
        while (iD < i5) {
            int iA = iD + 1;
            byte b2 = bArr[iD];
            if (b2 >= 0) {
                fVar.f56560a = b2;
            } else {
                iA = a(b2, bArr, iA, fVar);
            }
            if (i2 != fVar.f56560a) {
                break;
            }
            iD = iA + 1;
            byte b4 = bArr[iA];
            if (b4 >= 0) {
                fVar.f56560a = b4;
            } else {
                iD = a(b4, bArr, iD, fVar);
            }
            int i8 = fVar.f56560a;
            if (i8 < 0) {
                throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i8 == 0) {
                k1Var.add("");
            } else {
                k1Var.add(new String(bArr, iD, i8, l1.f56612a));
                iD += i8;
            }
        }
        return iD;
    }
}
