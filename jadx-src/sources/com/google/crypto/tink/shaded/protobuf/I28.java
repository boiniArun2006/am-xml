package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.SPz;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
abstract class I28 {

    static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f59876n;
        public final Xo nr;
        public long rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f59877t;

        j(Xo xo) {
            xo.getClass();
            this.nr = xo;
        }
    }

    static int Ik(byte[] bArr, int i2, SPz.Ml ml, j jVar) throws InvalidProtocolBufferException {
        Wre wre = (Wre) ml;
        int iT = T(bArr, i2, jVar);
        int i3 = jVar.f59876n + iT;
        while (iT < i3) {
            iT = s7N(bArr, iT, jVar);
            wre.addBoolean(jVar.rl != 0);
        }
        if (iT == i3) {
            return iT;
        }
        throw InvalidProtocolBufferException.az();
    }

    static int J2(int i2, byte[] bArr, int i3, int i5, Object obj, rv6 rv6Var, gnv gnvVar, j jVar) {
        jVar.nr.n(rv6Var, i2 >>> 3);
        return e(i2, bArr, i3, i5, h.HI(obj), jVar);
    }

    static int KN(int i2, byte[] bArr, int i3, int i5, SPz.Ml ml, j jVar) {
        r rVar = (r) ml;
        rVar.addInt(Uo(bArr, i3));
        int i7 = i3 + 4;
        while (i7 < i5) {
            int iT = T(bArr, i7, jVar);
            if (i2 != jVar.f59876n) {
                break;
            }
            rVar.addInt(Uo(bArr, iT));
            i7 = iT + 4;
        }
        return i7;
    }

    static int N(int i2, byte[] bArr, int i3, int i5, SPz.Ml ml, j jVar) {
        r rVar = (r) ml;
        int iT = T(bArr, i3, jVar);
        rVar.addInt(jVar.f59876n);
        while (iT < i5) {
            int iT2 = T(bArr, iT, jVar);
            if (i2 != jVar.f59876n) {
                break;
            }
            iT = T(bArr, iT2, jVar);
            rVar.addInt(jVar.f59876n);
        }
        return iT;
    }

    static int O(int i2, byte[] bArr, int i3, int i5, SPz.Ml ml, j jVar) {
        AbstractC1904o abstractC1904o = (AbstractC1904o) ml;
        abstractC1904o.addDouble(nr(bArr, i3));
        int i7 = i3 + 8;
        while (i7 < i5) {
            int iT = T(bArr, i7, jVar);
            if (i2 != jVar.f59876n) {
                break;
            }
            abstractC1904o.addDouble(nr(bArr, iT));
            i7 = iT + 8;
        }
        return i7;
    }

    static int S(byte[] bArr, int i2, SPz.Ml ml, j jVar) throws InvalidProtocolBufferException {
        r rVar = (r) ml;
        int iT = T(bArr, i2, jVar);
        int i3 = jVar.f59876n + iT;
        while (iT < i3) {
            iT = T(bArr, iT, jVar);
            rVar.addInt(Dsr.rl(jVar.f59876n));
        }
        if (iT == i3) {
            return iT;
        }
        throw InvalidProtocolBufferException.az();
    }

    static int T(byte[] bArr, int i2, j jVar) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return X(b2, bArr, i3, jVar);
        }
        jVar.f59876n = b2;
        return i3;
    }

    static int Uo(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i2] & UByte.MAX_VALUE) | ((bArr[i2 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i2 + 2] & UByte.MAX_VALUE) << 16);
    }

    static int ViF(byte[] bArr, int i2, SPz.Ml ml, j jVar) throws InvalidProtocolBufferException {
        Ew ew = (Ew) ml;
        int iT = T(bArr, i2, jVar);
        int i3 = jVar.f59876n + iT;
        while (iT < i3) {
            iT = s7N(bArr, iT, jVar);
            ew.addLong(jVar.rl);
        }
        if (iT == i3) {
            return iT;
        }
        throw InvalidProtocolBufferException.az();
    }

    static int WPU(byte[] bArr, int i2, SPz.Ml ml, j jVar) throws InvalidProtocolBufferException {
        Ew ew = (Ew) ml;
        int iT = T(bArr, i2, jVar);
        int i3 = jVar.f59876n + iT;
        while (iT < i3) {
            iT = s7N(bArr, iT, jVar);
            ew.addLong(Dsr.t(jVar.rl));
        }
        if (iT == i3) {
            return iT;
        }
        throw InvalidProtocolBufferException.az();
    }

    static int X(int i2, byte[] bArr, int i3, j jVar) {
        int i5 = i2 & 127;
        int i7 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            jVar.f59876n = i5 | (b2 << 7);
            return i7;
        }
        int i8 = i5 | ((b2 & ByteCompanionObject.MAX_VALUE) << 7);
        int i9 = i3 + 2;
        byte b4 = bArr[i7];
        if (b4 >= 0) {
            jVar.f59876n = i8 | (b4 << 14);
            return i9;
        }
        int i10 = i8 | ((b4 & ByteCompanionObject.MAX_VALUE) << 14);
        int i11 = i3 + 3;
        byte b5 = bArr[i9];
        if (b5 >= 0) {
            jVar.f59876n = i10 | (b5 << 21);
            return i11;
        }
        int i12 = i10 | ((b5 & ByteCompanionObject.MAX_VALUE) << 21);
        int i13 = i3 + 4;
        byte b6 = bArr[i11];
        if (b6 >= 0) {
            jVar.f59876n = i12 | (b6 << 28);
            return i13;
        }
        int i14 = i12 | ((b6 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i15 = i13 + 1;
            if (bArr[i13] >= 0) {
                jVar.f59876n = i14;
                return i15;
            }
            i13 = i15;
        }
    }

    static int XQ(byte[] bArr, int i2, SPz.Ml ml, j jVar) throws InvalidProtocolBufferException {
        s4 s4Var = (s4) ml;
        int iT = T(bArr, i2, jVar);
        int i3 = jVar.f59876n + iT;
        while (iT < i3) {
            s4Var.addFloat(gh(bArr, iT));
            iT += 4;
        }
        if (iT == i3) {
            return iT;
        }
        throw InvalidProtocolBufferException.az();
    }

    static int Z(byte[] bArr, int i2, SPz.Ml ml, j jVar) throws InvalidProtocolBufferException {
        Ew ew = (Ew) ml;
        int iT = T(bArr, i2, jVar);
        int i3 = jVar.f59876n + iT;
        while (iT < i3) {
            ew.addLong(xMQ(bArr, iT));
            iT += 8;
        }
        if (iT == i3) {
            return iT;
        }
        throw InvalidProtocolBufferException.az();
    }

    static int aYN(byte[] bArr, int i2, SPz.Ml ml, j jVar) throws InvalidProtocolBufferException {
        r rVar = (r) ml;
        int iT = T(bArr, i2, jVar);
        int i3 = jVar.f59876n + iT;
        while (iT < i3) {
            iT = T(bArr, iT, jVar);
            rVar.addInt(jVar.f59876n);
        }
        if (iT == i3) {
            return iT;
        }
        throw InvalidProtocolBufferException.az();
    }

    static int g(int i2, byte[] bArr, int i3, int i5, SPz.Ml ml, j jVar) {
        Ew ew = (Ew) ml;
        int iS7N = s7N(bArr, i3, jVar);
        ew.addLong(Dsr.t(jVar.rl));
        while (iS7N < i5) {
            int iT = T(bArr, iS7N, jVar);
            if (i2 != jVar.f59876n) {
                break;
            }
            iS7N = s7N(bArr, iT, jVar);
            ew.addLong(Dsr.t(jVar.rl));
        }
        return iS7N;
    }

    static int mUb(int i2, byte[] bArr, int i3, int i5, SPz.Ml ml, j jVar) {
        Ew ew = (Ew) ml;
        ew.addLong(xMQ(bArr, i3));
        int i7 = i3 + 8;
        while (i7 < i5) {
            int iT = T(bArr, i7, jVar);
            if (i2 != jVar.f59876n) {
                break;
            }
            ew.addLong(xMQ(bArr, iT));
            i7 = iT + 8;
        }
        return i7;
    }

    static int n(int i2, byte[] bArr, int i3, int i5, SPz.Ml ml, j jVar) {
        Wre wre = (Wre) ml;
        int iS7N = s7N(bArr, i3, jVar);
        wre.addBoolean(jVar.rl != 0);
        while (iS7N < i5) {
            int iT = T(bArr, iS7N, jVar);
            if (i2 != jVar.f59876n) {
                break;
            }
            iS7N = s7N(bArr, iT, jVar);
            wre.addBoolean(jVar.rl != 0);
        }
        return iS7N;
    }

    static int nHg(long j2, byte[] bArr, int i2, j jVar) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        long j3 = (j2 & 127) | (((long) (b2 & ByteCompanionObject.MAX_VALUE)) << 7);
        int i5 = 7;
        while (b2 < 0) {
            int i7 = i3 + 1;
            byte b4 = bArr[i3];
            i5 += 7;
            j3 |= ((long) (b4 & ByteCompanionObject.MAX_VALUE)) << i5;
            i3 = i7;
            b2 = b4;
        }
        jVar.rl = j3;
        return i3;
    }

    static int nY(int i2, byte[] bArr, int i3, int i5, SPz.Ml ml, j jVar) {
        r rVar = (r) ml;
        int iT = T(bArr, i3, jVar);
        rVar.addInt(Dsr.rl(jVar.f59876n));
        while (iT < i5) {
            int iT2 = T(bArr, iT, jVar);
            if (i2 != jVar.f59876n) {
                break;
            }
            iT = T(bArr, iT2, jVar);
            rVar.addInt(Dsr.rl(jVar.f59876n));
        }
        return iT;
    }

    static int o(byte[] bArr, int i2, SPz.Ml ml, j jVar) throws InvalidProtocolBufferException {
        r rVar = (r) ml;
        int iT = T(bArr, i2, jVar);
        int i3 = jVar.f59876n + iT;
        while (iT < i3) {
            rVar.addInt(Uo(bArr, iT));
            iT += 4;
        }
        if (iT == i3) {
            return iT;
        }
        throw InvalidProtocolBufferException.az();
    }

    static int qie(int i2, byte[] bArr, int i3, int i5, SPz.Ml ml, j jVar) {
        s4 s4Var = (s4) ml;
        s4Var.addFloat(gh(bArr, i3));
        int i7 = i3 + 4;
        while (i7 < i5) {
            int iT = T(bArr, i7, jVar);
            if (i2 != jVar.f59876n) {
                break;
            }
            s4Var.addFloat(gh(bArr, iT));
            i7 = iT + 4;
        }
        return i7;
    }

    static int r(byte[] bArr, int i2, SPz.Ml ml, j jVar) throws InvalidProtocolBufferException {
        AbstractC1904o abstractC1904o = (AbstractC1904o) ml;
        int iT = T(bArr, i2, jVar);
        int i3 = jVar.f59876n + iT;
        while (iT < i3) {
            abstractC1904o.addDouble(nr(bArr, iT));
            iT += 8;
        }
        if (iT == i3) {
            return iT;
        }
        throw InvalidProtocolBufferException.az();
    }

    static int rV9(Object obj, mz mzVar, byte[] bArr, int i2, int i3, j jVar) throws InvalidProtocolBufferException {
        int iX = i2 + 1;
        int i5 = bArr[i2];
        if (i5 < 0) {
            iX = X(i5, bArr, iX, jVar);
            i5 = jVar.f59876n;
        }
        int i7 = iX;
        if (i5 < 0 || i5 > i3 - i7) {
            throw InvalidProtocolBufferException.az();
        }
        int i8 = i7 + i5;
        mzVar.n(obj, bArr, i7, i8, jVar);
        jVar.f59877t = obj;
        return i8;
    }

    static int s7N(byte[] bArr, int i2, j jVar) {
        int i3 = i2 + 1;
        long j2 = bArr[i2];
        if (j2 < 0) {
            return nHg(j2, bArr, i3, jVar);
        }
        jVar.rl = j2;
        return i3;
    }

    static int ty(mz mzVar, int i2, byte[] bArr, int i3, int i5, SPz.Ml ml, j jVar) {
        int i7 = (i2 & (-8)) | 4;
        int iAz = az(mzVar, bArr, i3, i5, i7, jVar);
        ml.add(jVar.f59877t);
        while (iAz < i5) {
            int iT = T(bArr, iAz, jVar);
            if (i2 != jVar.f59876n) {
                break;
            }
            iAz = az(mzVar, bArr, iT, i5, i7, jVar);
            ml.add(jVar.f59877t);
        }
        return iAz;
    }

    static int v(Object obj, mz mzVar, byte[] bArr, int i2, int i3, int i5, j jVar) {
        int iFX = ((h) mzVar).FX(obj, bArr, i2, i3, i5, jVar);
        jVar.f59877t = obj;
        return iFX;
    }

    static int wTp(int i2, byte[] bArr, int i3, int i5, SPz.Ml ml, j jVar) {
        Ew ew = (Ew) ml;
        int iS7N = s7N(bArr, i3, jVar);
        ew.addLong(jVar.rl);
        while (iS7N < i5) {
            int iT = T(bArr, iS7N, jVar);
            if (i2 != jVar.f59876n) {
                break;
            }
            iS7N = s7N(bArr, iT, jVar);
            ew.addLong(jVar.rl);
        }
        return iS7N;
    }

    static long xMQ(byte[] bArr, int i2) {
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    static int E2(byte[] bArr, int i2, j jVar) throws InvalidProtocolBufferException {
        int iT = T(bArr, i2, jVar);
        int i3 = jVar.f59876n;
        if (i3 >= 0) {
            if (i3 == 0) {
                jVar.f59877t = "";
                return iT;
            }
            jVar.f59877t = xZD.O(bArr, iT, i3);
            return iT + i3;
        }
        throw InvalidProtocolBufferException.Uo();
    }

    static int HI(mz mzVar, byte[] bArr, int i2, int i3, j jVar) throws InvalidProtocolBufferException {
        Object objNewInstance = mzVar.newInstance();
        int iRV9 = rV9(objNewInstance, mzVar, bArr, i2, i3, jVar);
        mzVar.makeImmutable(objNewInstance);
        jVar.f59877t = objNewInstance;
        return iRV9;
    }

    static int az(mz mzVar, byte[] bArr, int i2, int i3, int i5, j jVar) {
        Object objNewInstance = mzVar.newInstance();
        int iV = v(objNewInstance, mzVar, bArr, i2, i3, i5, jVar);
        mzVar.makeImmutable(objNewInstance);
        jVar.f59877t = objNewInstance;
        return iV;
    }

    static int ck(mz mzVar, int i2, byte[] bArr, int i3, int i5, SPz.Ml ml, j jVar) throws InvalidProtocolBufferException {
        int iHI = HI(mzVar, bArr, i3, i5, jVar);
        ml.add(jVar.f59877t);
        while (iHI < i5) {
            int iT = T(bArr, iHI, jVar);
            if (i2 != jVar.f59876n) {
                break;
            }
            iHI = HI(mzVar, bArr, iT, i5, jVar);
            ml.add(jVar.f59877t);
        }
        return iHI;
    }

    static int e(int i2, byte[] bArr, int i3, int i5, fg fgVar, j jVar) throws InvalidProtocolBufferException {
        if (M5.n(i2) != 0) {
            int iRl = M5.rl(i2);
            if (iRl != 0) {
                if (iRl != 1) {
                    if (iRl != 2) {
                        if (iRl != 3) {
                            if (iRl == 5) {
                                fgVar.ty(i2, Integer.valueOf(Uo(bArr, i3)));
                                return i3 + 4;
                            }
                            throw InvalidProtocolBufferException.t();
                        }
                        fg fgVarGh = fg.gh();
                        int i7 = (i2 & (-8)) | 4;
                        int i8 = 0;
                        while (true) {
                            if (i3 >= i5) {
                                break;
                            }
                            int iT = T(bArr, i3, jVar);
                            i8 = jVar.f59876n;
                            if (i8 == i7) {
                                i3 = iT;
                                break;
                            }
                            i3 = e(i8, bArr, iT, i5, fgVarGh, jVar);
                        }
                        if (i3 <= i5 && i8 == i7) {
                            fgVar.ty(i2, fgVarGh);
                            return i3;
                        }
                        throw InvalidProtocolBufferException.KN();
                    }
                    int iT2 = T(bArr, i3, jVar);
                    int i9 = jVar.f59876n;
                    if (i9 >= 0) {
                        if (i9 <= bArr.length - iT2) {
                            if (i9 == 0) {
                                fgVar.ty(i2, fuX.f59997t);
                            } else {
                                fgVar.ty(i2, fuX.Uo(bArr, iT2, i9));
                            }
                            return iT2 + i9;
                        }
                        throw InvalidProtocolBufferException.az();
                    }
                    throw InvalidProtocolBufferException.Uo();
                }
                fgVar.ty(i2, Long.valueOf(xMQ(bArr, i3)));
                return i3 + 8;
            }
            int iS7N = s7N(bArr, i3, jVar);
            fgVar.ty(i2, Long.valueOf(jVar.rl));
            return iS7N;
        }
        throw InvalidProtocolBufferException.t();
    }

    static int fD(int i2, byte[] bArr, int i3, int i5, SPz.Ml ml, j jVar) throws InvalidProtocolBufferException {
        int iT = T(bArr, i3, jVar);
        int i7 = jVar.f59876n;
        if (i7 >= 0) {
            if (i7 == 0) {
                ml.add("");
            } else {
                int i8 = iT + i7;
                if (xZD.ty(bArr, iT, i8)) {
                    ml.add(new String(bArr, iT, i7, SPz.rl));
                    iT = i8;
                } else {
                    throw InvalidProtocolBufferException.nr();
                }
            }
            while (iT < i5) {
                int iT2 = T(bArr, iT, jVar);
                if (i2 != jVar.f59876n) {
                    break;
                }
                iT = T(bArr, iT2, jVar);
                int i9 = jVar.f59876n;
                if (i9 >= 0) {
                    if (i9 == 0) {
                        ml.add("");
                    } else {
                        int i10 = iT + i9;
                        if (xZD.ty(bArr, iT, i10)) {
                            ml.add(new String(bArr, iT, i9, SPz.rl));
                            iT = i10;
                        } else {
                            throw InvalidProtocolBufferException.nr();
                        }
                    }
                } else {
                    throw InvalidProtocolBufferException.Uo();
                }
            }
            return iT;
        }
        throw InvalidProtocolBufferException.Uo();
    }

    static float gh(byte[] bArr, int i2) {
        return Float.intBitsToFloat(Uo(bArr, i2));
    }

    static int iF(int i2, byte[] bArr, int i3, int i5, SPz.Ml ml, j jVar) throws InvalidProtocolBufferException {
        int iT = T(bArr, i3, jVar);
        int i7 = jVar.f59876n;
        if (i7 >= 0) {
            if (i7 == 0) {
                ml.add("");
            } else {
                ml.add(new String(bArr, iT, i7, SPz.rl));
                iT += i7;
            }
            while (iT < i5) {
                int iT2 = T(bArr, iT, jVar);
                if (i2 != jVar.f59876n) {
                    break;
                }
                iT = T(bArr, iT2, jVar);
                int i8 = jVar.f59876n;
                if (i8 >= 0) {
                    if (i8 == 0) {
                        ml.add("");
                    } else {
                        ml.add(new String(bArr, iT, i8, SPz.rl));
                        iT += i8;
                    }
                } else {
                    throw InvalidProtocolBufferException.Uo();
                }
            }
            return iT;
        }
        throw InvalidProtocolBufferException.Uo();
    }

    static double nr(byte[] bArr, int i2) {
        return Double.longBitsToDouble(xMQ(bArr, i2));
    }

    static int rl(byte[] bArr, int i2, j jVar) throws InvalidProtocolBufferException {
        int iT = T(bArr, i2, jVar);
        int i3 = jVar.f59876n;
        if (i3 >= 0) {
            if (i3 <= bArr.length - iT) {
                if (i3 == 0) {
                    jVar.f59877t = fuX.f59997t;
                    return iT;
                }
                jVar.f59877t = fuX.Uo(bArr, iT, i3);
                return iT + i3;
            }
            throw InvalidProtocolBufferException.az();
        }
        throw InvalidProtocolBufferException.Uo();
    }

    static int t(int i2, byte[] bArr, int i3, int i5, SPz.Ml ml, j jVar) throws InvalidProtocolBufferException {
        int iT = T(bArr, i3, jVar);
        int i7 = jVar.f59876n;
        if (i7 >= 0) {
            if (i7 <= bArr.length - iT) {
                if (i7 == 0) {
                    ml.add(fuX.f59997t);
                } else {
                    ml.add(fuX.Uo(bArr, iT, i7));
                    iT += i7;
                }
                while (iT < i5) {
                    int iT2 = T(bArr, iT, jVar);
                    if (i2 != jVar.f59876n) {
                        break;
                    }
                    iT = T(bArr, iT2, jVar);
                    int i8 = jVar.f59876n;
                    if (i8 >= 0) {
                        if (i8 <= bArr.length - iT) {
                            if (i8 == 0) {
                                ml.add(fuX.f59997t);
                            } else {
                                ml.add(fuX.Uo(bArr, iT, i8));
                                iT += i8;
                            }
                        } else {
                            throw InvalidProtocolBufferException.az();
                        }
                    } else {
                        throw InvalidProtocolBufferException.Uo();
                    }
                }
                return iT;
            }
            throw InvalidProtocolBufferException.az();
        }
        throw InvalidProtocolBufferException.Uo();
    }

    static int te(byte[] bArr, int i2, j jVar) throws InvalidProtocolBufferException {
        int iT = T(bArr, i2, jVar);
        int i3 = jVar.f59876n;
        if (i3 >= 0) {
            if (i3 == 0) {
                jVar.f59877t = "";
                return iT;
            }
            jVar.f59877t = new String(bArr, iT, i3, SPz.rl);
            return iT + i3;
        }
        throw InvalidProtocolBufferException.Uo();
    }
}
