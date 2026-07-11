package com.google.android.exoplayer2.text.dvb;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class j {
    private final fuX J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final C0772j f58290O;
    private Bitmap Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Paint f58291n;
    private final n nr;
    private final Paint rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Canvas f58292t;
    private static final byte[] KN = {0, 7, 8, 15};
    private static final byte[] xMQ = {0, 119, -120, -1};
    private static final byte[] mUb = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    private static final class Wre {
        public final int J2;
        public final int KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public final int f58299O;
        public final int Uo;
        public final SparseArray gh;
        public final int mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f58300n;
        public final int nr;
        public final boolean rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f58301t;
        public final int xMQ;

        public void n(Wre wre) {
            SparseArray sparseArray = wre.gh;
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                this.gh.put(sparseArray.keyAt(i2), (CN3) sparseArray.valueAt(i2));
            }
        }

        public Wre(int i2, boolean z2, int i3, int i5, int i7, int i8, int i9, int i10, int i11, int i12, SparseArray sparseArray) {
            this.f58300n = i2;
            this.rl = z2;
            this.f58301t = i3;
            this.nr = i5;
            this.f58299O = i7;
            this.J2 = i8;
            this.Uo = i9;
            this.KN = i10;
            this.xMQ = i11;
            this.mUb = i12;
            this.gh = sparseArray;
        }
    }

    private static final class fuX {
        public n KN;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f58303n;
        public final int rl;
        public Ml xMQ;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final SparseArray f58304t = new SparseArray();
        public final SparseArray nr = new SparseArray();

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public final SparseArray f58302O = new SparseArray();
        public final SparseArray J2 = new SparseArray();
        public final SparseArray Uo = new SparseArray();

        public void n() {
            this.f58304t.clear();
            this.nr.clear();
            this.f58302O.clear();
            this.J2.clear();
            this.Uo.clear();
            this.KN = null;
            this.xMQ = null;
        }

        public fuX(int i2, int i3) {
            this.f58303n = i2;
            this.rl = i3;
        }
    }

    private static int J2(int i2, int i3, int i5, int i7) {
        return (i2 << 24) | (i3 << 16) | (i5 << 8) | i7;
    }

    private static int KN(ParsableBitArray parsableBitArray, int[] iArr, byte[] bArr, int i2, int i3, Paint paint, Canvas canvas) {
        boolean z2;
        int i5;
        int bits;
        int bits2;
        boolean z3 = false;
        while (true) {
            int bits3 = parsableBitArray.readBits(4);
            if (bits3 != 0) {
                z2 = z3;
                i5 = 1;
            } else if (parsableBitArray.readBit()) {
                if (parsableBitArray.readBit()) {
                    int bits4 = parsableBitArray.readBits(2);
                    if (bits4 == 0) {
                        z2 = z3;
                        i5 = 1;
                        bits3 = 0;
                    } else if (bits4 == 1) {
                        bits3 = 0;
                        i5 = 2;
                        z2 = z3;
                    } else if (bits4 == 2) {
                        bits = parsableBitArray.readBits(4) + 9;
                        bits2 = parsableBitArray.readBits(4);
                    } else if (bits4 != 3) {
                        z2 = z3;
                        bits3 = 0;
                        i5 = 0;
                    } else {
                        bits = parsableBitArray.readBits(8) + 25;
                        bits2 = parsableBitArray.readBits(4);
                    }
                } else {
                    bits = parsableBitArray.readBits(2) + 4;
                    bits2 = parsableBitArray.readBits(4);
                }
                z2 = z3;
                i5 = bits;
                bits3 = bits2;
            } else {
                int bits5 = parsableBitArray.readBits(3);
                if (bits5 != 0) {
                    z2 = z3;
                    i5 = bits5 + 2;
                    bits3 = 0;
                } else {
                    z2 = true;
                    bits3 = 0;
                    i5 = 0;
                }
            }
            if (i5 != 0 && paint != null) {
                if (bArr != null) {
                    bits3 = bArr[bits3];
                }
                paint.setColor(iArr[bits3]);
                canvas.drawRect(i2, i3, i2 + i5, 1 + i3, paint);
            }
            i2 += i5;
            if (z2) {
                return i2;
            }
            z3 = z2;
        }
    }

    private static int Uo(ParsableBitArray parsableBitArray, int[] iArr, byte[] bArr, int i2, int i3, Paint paint, Canvas canvas) {
        boolean z2;
        int i5;
        int bits;
        int bits2;
        boolean z3 = false;
        while (true) {
            int bits3 = parsableBitArray.readBits(2);
            if (bits3 != 0) {
                z2 = z3;
                i5 = 1;
            } else {
                if (parsableBitArray.readBit()) {
                    bits = parsableBitArray.readBits(3) + 3;
                    bits2 = parsableBitArray.readBits(2);
                } else {
                    if (parsableBitArray.readBit()) {
                        z2 = z3;
                        i5 = 1;
                    } else {
                        int bits4 = parsableBitArray.readBits(2);
                        if (bits4 == 0) {
                            z2 = true;
                        } else if (bits4 == 1) {
                            z2 = z3;
                            i5 = 2;
                        } else if (bits4 == 2) {
                            bits = parsableBitArray.readBits(4) + 12;
                            bits2 = parsableBitArray.readBits(2);
                        } else if (bits4 != 3) {
                            z2 = z3;
                        } else {
                            bits = parsableBitArray.readBits(8) + 29;
                            bits2 = parsableBitArray.readBits(2);
                        }
                        bits3 = 0;
                        i5 = 0;
                    }
                    bits3 = 0;
                }
                z2 = z3;
                i5 = bits;
                bits3 = bits2;
            }
            if (i5 != 0 && paint != null) {
                if (bArr != null) {
                    bits3 = bArr[bits3];
                }
                paint.setColor(iArr[bits3]);
                canvas.drawRect(i2, i3, i2 + i5, 1 + i3, paint);
            }
            i2 += i5;
            if (z2) {
                return i2;
            }
            z3 = z2;
        }
    }

    private static n az(ParsableBitArray parsableBitArray) {
        int i2;
        int i3;
        int i5;
        int bits;
        parsableBitArray.skipBits(4);
        boolean bit = parsableBitArray.readBit();
        parsableBitArray.skipBits(3);
        int bits2 = parsableBitArray.readBits(16);
        int bits3 = parsableBitArray.readBits(16);
        if (bit) {
            int bits4 = parsableBitArray.readBits(16);
            int bits5 = parsableBitArray.readBits(16);
            int bits6 = parsableBitArray.readBits(16);
            bits = parsableBitArray.readBits(16);
            i5 = bits5;
            i3 = bits6;
            i2 = bits4;
        } else {
            i2 = 0;
            i3 = 0;
            i5 = bits2;
            bits = bits3;
        }
        return new n(bits2, bits3, i2, i5, i3, bits);
    }

    private static void gh(w6 w6Var, C0772j c0772j, int i2, int i3, int i5, Paint paint, Canvas canvas) {
        int[] iArr = i2 == 3 ? c0772j.nr : i2 == 2 ? c0772j.f58306t : c0772j.rl;
        mUb(w6Var.f58311t, iArr, i2, i3, i5, paint, canvas);
        mUb(w6Var.nr, iArr, i2, i3, i5 + 1, paint, canvas);
    }

    private static int xMQ(ParsableBitArray parsableBitArray, int[] iArr, byte[] bArr, int i2, int i3, Paint paint, Canvas canvas) {
        boolean z2;
        int bits;
        boolean z3 = false;
        while (true) {
            int bits2 = parsableBitArray.readBits(8);
            if (bits2 != 0) {
                z2 = z3;
                bits = 1;
            } else if (parsableBitArray.readBit()) {
                z2 = z3;
                bits = parsableBitArray.readBits(7);
                bits2 = parsableBitArray.readBits(8);
            } else {
                int bits3 = parsableBitArray.readBits(7);
                if (bits3 != 0) {
                    z2 = z3;
                    bits = bits3;
                    bits2 = 0;
                } else {
                    z2 = true;
                    bits2 = 0;
                    bits = 0;
                }
            }
            if (bits != 0 && paint != null) {
                if (bArr != null) {
                    bits2 = bArr[bits2];
                }
                paint.setColor(iArr[bits2]);
                canvas.drawRect(i2, i3, i2 + bits, 1 + i3, paint);
            }
            i2 += bits;
            if (z2) {
                return i2;
            }
            z3 = z2;
        }
    }

    private static final class CN3 {
        public final int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public final int f58293O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f58294n;
        public final int nr;
        public final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f58295t;

        public CN3(int i2, int i3, int i5, int i7, int i8, int i9) {
            this.f58294n = i2;
            this.rl = i3;
            this.f58295t = i5;
            this.nr = i7;
            this.f58293O = i8;
            this.J2 = i9;
        }
    }

    private static final class I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f58296n;
        public final int rl;

        public I28(int i2, int i3) {
            this.f58296n = i2;
            this.rl = i3;
        }
    }

    private static final class Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f58297n;
        public final SparseArray nr;
        public final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f58298t;

        public Ml(int i2, int i3, int i5, SparseArray sparseArray) {
            this.f58297n = i2;
            this.rl = i3;
            this.f58298t = i5;
            this.nr = sparseArray;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.text.dvb.j$j, reason: collision with other inner class name */
    private static final class C0772j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f58305n;
        public final int[] nr;
        public final int[] rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int[] f58306t;

        public C0772j(int i2, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f58305n = i2;
            this.rl = iArr;
            this.f58306t = iArr2;
            this.nr = iArr3;
        }
    }

    private static final class n {
        public final int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public final int f58307O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f58308n;
        public final int nr;
        public final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f58309t;

        public n(int i2, int i3, int i5, int i7, int i8, int i9) {
            this.f58308n = i2;
            this.rl = i3;
            this.f58309t = i5;
            this.nr = i7;
            this.f58307O = i8;
            this.J2 = i9;
        }
    }

    private static final class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f58310n;
        public final byte[] nr;
        public final boolean rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final byte[] f58311t;

        public w6(int i2, boolean z2, byte[] bArr, byte[] bArr2) {
            this.f58310n = i2;
            this.rl = z2;
            this.f58311t = bArr;
            this.nr = bArr2;
        }
    }

    private static Ml HI(ParsableBitArray parsableBitArray, int i2) {
        int bits = parsableBitArray.readBits(8);
        int bits2 = parsableBitArray.readBits(4);
        int bits3 = parsableBitArray.readBits(2);
        parsableBitArray.skipBits(2);
        int i3 = i2 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i3 > 0) {
            int bits4 = parsableBitArray.readBits(8);
            parsableBitArray.skipBits(8);
            i3 -= 6;
            sparseArray.put(bits4, new I28(parsableBitArray.readBits(16), parsableBitArray.readBits(16)));
        }
        return new Ml(bits, bits2, bits3, sparseArray);
    }

    private static void Ik(ParsableBitArray parsableBitArray, fuX fux) {
        Wre wre;
        int bits = parsableBitArray.readBits(8);
        int bits2 = parsableBitArray.readBits(16);
        int bits3 = parsableBitArray.readBits(16);
        int bytePosition = parsableBitArray.getBytePosition() + bits3;
        if (bits3 * 8 > parsableBitArray.bitsLeft()) {
            Log.w("DvbParser", "Data field length exceeds limit");
            parsableBitArray.skipBits(parsableBitArray.bitsLeft());
            return;
        }
        switch (bits) {
            case 16:
                if (bits2 == fux.f58303n) {
                    Ml ml = fux.xMQ;
                    Ml mlHI = HI(parsableBitArray, bits3);
                    if (mlHI.f58298t != 0) {
                        fux.xMQ = mlHI;
                        fux.f58304t.clear();
                        fux.nr.clear();
                        fux.f58302O.clear();
                    } else if (ml != null && ml.rl != mlHI.rl) {
                        fux.xMQ = mlHI;
                    }
                }
                break;
            case 17:
                Ml ml2 = fux.xMQ;
                if (bits2 == fux.f58303n && ml2 != null) {
                    Wre wreCk = ck(parsableBitArray, bits3);
                    if (ml2.f58298t == 0 && (wre = (Wre) fux.f58304t.get(wreCk.f58300n)) != null) {
                        wreCk.n(wre);
                    }
                    fux.f58304t.put(wreCk.f58300n, wreCk);
                }
                break;
            case 18:
                if (bits2 == fux.f58303n) {
                    C0772j c0772jQie = qie(parsableBitArray, bits3);
                    fux.nr.put(c0772jQie.f58305n, c0772jQie);
                } else if (bits2 == fux.rl) {
                    C0772j c0772jQie2 = qie(parsableBitArray, bits3);
                    fux.J2.put(c0772jQie2.f58305n, c0772jQie2);
                }
                break;
            case 19:
                if (bits2 == fux.f58303n) {
                    w6 w6VarTy = ty(parsableBitArray);
                    fux.f58302O.put(w6VarTy.f58310n, w6VarTy);
                } else if (bits2 == fux.rl) {
                    w6 w6VarTy2 = ty(parsableBitArray);
                    fux.Uo.put(w6VarTy2.f58310n, w6VarTy2);
                }
                break;
            case 20:
                if (bits2 == fux.f58303n) {
                    fux.KN = az(parsableBitArray);
                }
                break;
        }
        parsableBitArray.skipBytes(bytePosition - parsableBitArray.getBytePosition());
    }

    private static int[] O() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 < 8) {
                iArr[i2] = J2(63, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
            } else {
                int i3 = i2 & 136;
                if (i3 == 0) {
                    iArr[i2] = J2(255, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 8) {
                    iArr[i2] = J2(127, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 128) {
                    iArr[i2] = J2(255, ((i2 & 1) != 0 ? 43 : 0) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = J2(255, ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static Wre ck(ParsableBitArray parsableBitArray, int i2) {
        int i3;
        int bits;
        int bits2;
        char c2;
        int bits3 = parsableBitArray.readBits(8);
        int i5 = 4;
        parsableBitArray.skipBits(4);
        boolean bit = parsableBitArray.readBit();
        parsableBitArray.skipBits(3);
        int i7 = 16;
        int bits4 = parsableBitArray.readBits(16);
        int bits5 = parsableBitArray.readBits(16);
        int bits6 = parsableBitArray.readBits(3);
        int bits7 = parsableBitArray.readBits(3);
        int i8 = 2;
        parsableBitArray.skipBits(2);
        int bits8 = parsableBitArray.readBits(8);
        int bits9 = parsableBitArray.readBits(8);
        int bits10 = parsableBitArray.readBits(4);
        int bits11 = parsableBitArray.readBits(2);
        parsableBitArray.skipBits(2);
        int i9 = i2 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i9 > 0) {
            int bits12 = parsableBitArray.readBits(i7);
            int bits13 = parsableBitArray.readBits(i8);
            int bits14 = parsableBitArray.readBits(i8);
            int bits15 = parsableBitArray.readBits(12);
            parsableBitArray.skipBits(i5);
            int bits16 = parsableBitArray.readBits(12);
            int i10 = i9 - 6;
            if (bits13 != 1) {
                i3 = 2;
                if (bits13 != 2) {
                    bits2 = 0;
                    bits = 0;
                    i9 = i10;
                    c2 = '\b';
                }
                sparseArray.put(bits12, new CN3(bits13, bits14, bits15, bits16, bits2, bits));
                i7 = 16;
                i8 = i3;
                i5 = 4;
            } else {
                i3 = 2;
            }
            c2 = '\b';
            i9 -= 8;
            bits2 = parsableBitArray.readBits(8);
            bits = parsableBitArray.readBits(8);
            sparseArray.put(bits12, new CN3(bits13, bits14, bits15, bits16, bits2, bits));
            i7 = 16;
            i8 = i3;
            i5 = 4;
        }
        return new Wre(bits3, bit, bits4, bits5, bits6, bits7, bits8, bits9, bits10, bits11, sparseArray);
    }

    private static void mUb(byte[] bArr, int[] iArr, int i2, int i3, int i5, Paint paint, Canvas canvas) {
        int[] iArr2;
        Paint paint2;
        Canvas canvas2;
        byte[] bArr2;
        byte[] bArr3;
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr);
        byte[] bArrN = null;
        byte[] bArrN2 = null;
        int iUo = i3;
        int i7 = i5;
        byte[] bArrN3 = null;
        while (parsableBitArray.bitsLeft() != 0) {
            int bits = parsableBitArray.readBits(8);
            if (bits != 240) {
                switch (bits) {
                    case 16:
                        iArr2 = iArr;
                        Paint paint3 = paint;
                        canvas2 = canvas;
                        if (i2 == 3) {
                            bArr3 = bArrN3 == null ? xMQ : bArrN3;
                        } else if (i2 != 2) {
                            bArr2 = null;
                            paint2 = paint3;
                            iUo = Uo(parsableBitArray, iArr2, bArr2, iUo, i7, paint2, canvas2);
                            parsableBitArray.byteAlign();
                        } else {
                            bArr3 = bArrN2 == null ? KN : bArrN2;
                        }
                        paint2 = paint3;
                        bArr2 = bArr3;
                        iUo = Uo(parsableBitArray, iArr2, bArr2, iUo, i7, paint2, canvas2);
                        parsableBitArray.byteAlign();
                        break;
                    case 17:
                        iArr2 = iArr;
                        Paint paint4 = paint;
                        canvas2 = canvas;
                        paint2 = paint4;
                        iUo = KN(parsableBitArray, iArr2, i2 == 3 ? bArrN == null ? mUb : bArrN : null, iUo, i7, paint2, canvas2);
                        parsableBitArray.byteAlign();
                        break;
                    case 18:
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        iUo = xMQ(parsableBitArray, iArr2, null, iUo, i7, paint2, canvas2);
                        break;
                    default:
                        switch (bits) {
                            case 32:
                                bArrN2 = n(4, 4, parsableBitArray);
                                break;
                            case 33:
                                bArrN3 = n(4, 8, parsableBitArray);
                                break;
                            case 34:
                                bArrN = n(16, 8, parsableBitArray);
                                break;
                        }
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        break;
                }
            } else {
                iArr2 = iArr;
                paint2 = paint;
                canvas2 = canvas;
                i7 += 2;
                iUo = i3;
            }
            iArr = iArr2;
            paint = paint2;
            canvas = canvas2;
        }
    }

    private static byte[] n(int i2, int i3, ParsableBitArray parsableBitArray) {
        byte[] bArr = new byte[i2];
        for (int i5 = 0; i5 < i2; i5++) {
            bArr[i5] = (byte) parsableBitArray.readBits(i3);
        }
        return bArr;
    }

    private static int[] nr() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            if (i2 < 8) {
                iArr[i2] = J2(255, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i2] = J2(255, (i2 & 1) != 0 ? 127 : 0, (i2 & 2) != 0 ? 127 : 0, (i2 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static C0772j qie(ParsableBitArray parsableBitArray, int i2) {
        int bits;
        int i3;
        int bits2;
        int bits3;
        int bits4;
        int i5 = 8;
        int bits5 = parsableBitArray.readBits(8);
        parsableBitArray.skipBits(8);
        int i7 = 2;
        int i8 = i2 - 2;
        int[] iArrT = t();
        int[] iArrNr = nr();
        int[] iArrO = O();
        while (i8 > 0) {
            int bits6 = parsableBitArray.readBits(i5);
            int bits7 = parsableBitArray.readBits(i5);
            int[] iArr = (bits7 & 128) != 0 ? iArrT : (bits7 & 64) != 0 ? iArrNr : iArrO;
            if ((bits7 & 1) != 0) {
                bits3 = parsableBitArray.readBits(i5);
                bits4 = parsableBitArray.readBits(i5);
                bits = parsableBitArray.readBits(i5);
                bits2 = parsableBitArray.readBits(i5);
                i3 = i8 - 6;
            } else {
                int bits8 = parsableBitArray.readBits(6) << i7;
                int bits9 = parsableBitArray.readBits(4) << 4;
                bits = parsableBitArray.readBits(4) << 4;
                i3 = i8 - 4;
                bits2 = parsableBitArray.readBits(i7) << 6;
                bits3 = bits8;
                bits4 = bits9;
            }
            if (bits3 == 0) {
                bits2 = 255;
                bits4 = 0;
                bits = 0;
            }
            double d2 = bits3;
            double d4 = bits4 - 128;
            double d5 = bits - 128;
            iArr[bits6] = J2((byte) (255 - (bits2 & 255)), Util.constrainValue((int) (d2 + (1.402d * d4)), 0, 255), Util.constrainValue((int) ((d2 - (0.34414d * d5)) - (d4 * 0.71414d)), 0, 255), Util.constrainValue((int) (d2 + (d5 * 1.772d)), 0, 255));
            i8 = i3;
            bits5 = bits5;
            i5 = 8;
            i7 = 2;
        }
        return new C0772j(bits5, iArrT, iArrNr, iArrO);
    }

    private static int[] t() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static w6 ty(ParsableBitArray parsableBitArray) {
        byte[] bArr;
        int bits = parsableBitArray.readBits(16);
        parsableBitArray.skipBits(4);
        int bits2 = parsableBitArray.readBits(2);
        boolean bit = parsableBitArray.readBit();
        parsableBitArray.skipBits(1);
        byte[] bArr2 = Util.EMPTY_BYTE_ARRAY;
        if (bits2 != 1) {
            if (bits2 == 0) {
                int bits3 = parsableBitArray.readBits(16);
                int bits4 = parsableBitArray.readBits(16);
                if (bits3 > 0) {
                    bArr2 = new byte[bits3];
                    parsableBitArray.readBytes(bArr2, 0, bits3);
                }
                if (bits4 > 0) {
                    bArr = new byte[bits4];
                    parsableBitArray.readBytes(bArr, 0, bits4);
                }
            }
            return new w6(bits, bit, bArr2, bArr);
        }
        parsableBitArray.skipBits(parsableBitArray.readBits(8) * 16);
        bArr = bArr2;
        return new w6(bits, bit, bArr2, bArr);
    }

    public void r() {
        this.J2.n();
    }

    public List rl(byte[] bArr, int i2) {
        SparseArray sparseArray;
        int i3;
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr, i2);
        while (parsableBitArray.bitsLeft() >= 48 && parsableBitArray.readBits(8) == 15) {
            Ik(parsableBitArray, this.J2);
        }
        fuX fux = this.J2;
        Ml ml = fux.xMQ;
        if (ml == null) {
            return Collections.EMPTY_LIST;
        }
        n nVar = fux.KN;
        if (nVar == null) {
            nVar = this.nr;
        }
        Bitmap bitmap = this.Uo;
        if (bitmap == null || nVar.f58308n + 1 != bitmap.getWidth() || nVar.rl + 1 != this.Uo.getHeight()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(nVar.f58308n + 1, nVar.rl + 1, Bitmap.Config.ARGB_8888);
            this.Uo = bitmapCreateBitmap;
            this.f58292t.setBitmap(bitmapCreateBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray2 = ml.nr;
        int i5 = 0;
        while (i5 < sparseArray2.size()) {
            this.f58292t.save();
            I28 i28 = (I28) sparseArray2.valueAt(i5);
            Wre wre = (Wre) this.J2.f58304t.get(sparseArray2.keyAt(i5));
            int i7 = i28.f58296n + nVar.f58309t;
            int i8 = i28.rl + nVar.f58307O;
            this.f58292t.clipRect(i7, i8, Math.min(wre.f58301t + i7, nVar.nr), Math.min(wre.nr + i8, nVar.J2));
            C0772j c0772j = (C0772j) this.J2.nr.get(wre.Uo);
            if (c0772j == null && (c0772j = (C0772j) this.J2.J2.get(wre.Uo)) == null) {
                c0772j = this.f58290O;
            }
            C0772j c0772j2 = c0772j;
            SparseArray sparseArray3 = wre.gh;
            int i9 = 0;
            while (i9 < sparseArray3.size()) {
                int iKeyAt = sparseArray3.keyAt(i9);
                CN3 cn3 = (CN3) sparseArray3.valueAt(i9);
                w6 w6Var = (w6) this.J2.f58302O.get(iKeyAt);
                if (w6Var == null) {
                    w6Var = (w6) this.J2.Uo.get(iKeyAt);
                }
                if (w6Var != null) {
                    sparseArray = sparseArray2;
                    i3 = i9;
                    gh(w6Var, c0772j2, wre.J2, cn3.f58295t + i7, cn3.nr + i8, w6Var.rl ? null : this.f58291n, this.f58292t);
                } else {
                    sparseArray = sparseArray2;
                    i3 = i9;
                }
                i9 = i3 + 1;
                sparseArray2 = sparseArray;
            }
            SparseArray sparseArray4 = sparseArray2;
            if (wre.rl) {
                int i10 = wre.J2;
                this.rl.setColor(i10 == 3 ? c0772j2.nr[wre.KN] : i10 == 2 ? c0772j2.f58306t[wre.xMQ] : c0772j2.rl[wre.mUb]);
                this.f58292t.drawRect(i7, i8, wre.f58301t + i7, wre.nr + i8, this.rl);
            }
            arrayList.add(new Cue.Builder().setBitmap(Bitmap.createBitmap(this.Uo, i7, i8, wre.f58301t, wre.nr)).setPosition(i7 / nVar.f58308n).setPositionAnchor(0).setLine(i8 / nVar.rl, 0).setLineAnchor(0).setSize(wre.f58301t / nVar.f58308n).setBitmapHeight(wre.nr / nVar.rl).build());
            this.f58292t.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f58292t.restore();
            i5++;
            sparseArray2 = sparseArray4;
        }
        return Collections.unmodifiableList(arrayList);
    }

    public j(int i2, int i3) {
        Paint paint = new Paint();
        this.f58291n = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.rl = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f58292t = new Canvas();
        this.nr = new n(719, 575, 0, 719, 0, 575);
        this.f58290O = new C0772j(0, t(), nr(), O());
        this.J2 = new fuX(i2, i3);
    }
}
