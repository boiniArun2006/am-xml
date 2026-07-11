package f6d;

import android.graphics.Bitmap;
import android.util.Log;
import f6d.j;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class I28 implements j {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final String f66571S = "I28";
    private boolean HI;
    private int Ik;
    private Ml J2;
    private byte[] KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private byte[] f66572O;
    private short[] Uo;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private Boolean f66573Z;
    private int ck;
    private int[] gh;
    private byte[] mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int[] f66574n;
    private ByteBuffer nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f66575o;
    private int qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f66576r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final j.InterfaceC0917j f66577t;
    private Bitmap ty;
    private byte[] xMQ;
    private final int[] rl = new int[256];
    private Bitmap.Config XQ = Bitmap.Config.ARGB_8888;
    private w6 az = new w6();

    private int KN(int i2, int i3, int i5) {
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = i2; i12 < this.Ik + i2; i12++) {
            byte[] bArr = this.mUb;
            if (i12 >= bArr.length || i12 >= i3) {
                break;
            }
            int i13 = this.f66574n[bArr[i12] & UByte.MAX_VALUE];
            if (i13 != 0) {
                i7 += (i13 >> 24) & 255;
                i8 += (i13 >> 16) & 255;
                i9 += (i13 >> 8) & 255;
                i10 += i13 & 255;
                i11++;
            }
        }
        int i14 = i2 + i5;
        for (int i15 = i14; i15 < this.Ik + i14; i15++) {
            byte[] bArr2 = this.mUb;
            if (i15 >= bArr2.length || i15 >= i3) {
                break;
            }
            int i16 = this.f66574n[bArr2[i15] & UByte.MAX_VALUE];
            if (i16 != 0) {
                i7 += (i16 >> 24) & 255;
                i8 += (i16 >> 16) & 255;
                i9 += (i16 >> 8) & 255;
                i10 += i16 & 255;
                i11++;
            }
        }
        if (i11 == 0) {
            return 0;
        }
        return ((i7 / i11) << 24) | ((i8 / i11) << 16) | ((i9 / i11) << 8) | (i10 / i11);
    }

    public synchronized void Ik(w6 w6Var, ByteBuffer byteBuffer) {
        r(w6Var, byteBuffer, 1);
    }

    @Override // f6d.j
    public void J2() {
        this.qie = -1;
    }

    @Override // f6d.j
    public void clear() {
        this.az = null;
        byte[] bArr = this.mUb;
        if (bArr != null) {
            this.f66577t.O(bArr);
        }
        int[] iArr = this.gh;
        if (iArr != null) {
            this.f66577t.J2(iArr);
        }
        Bitmap bitmap = this.ty;
        if (bitmap != null) {
            this.f66577t.n(bitmap);
        }
        this.ty = null;
        this.nr = null;
        this.f66573Z = null;
        byte[] bArr2 = this.f66572O;
        if (bArr2 != null) {
            this.f66577t.O(bArr2);
        }
    }

    public synchronized void o(w6 w6Var, byte[] bArr) {
        Ik(w6Var, ByteBuffer.wrap(bArr));
    }

    public synchronized void r(w6 w6Var, ByteBuffer byteBuffer, int i2) {
        try {
            if (i2 <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i2);
            }
            int iHighestOneBit = Integer.highestOneBit(i2);
            this.ck = 0;
            this.az = w6Var;
            this.qie = -1;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.nr = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            this.nr.order(ByteOrder.LITTLE_ENDIAN);
            this.HI = false;
            Iterator it = w6Var.f66583O.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((n) it.next()).Uo == 3) {
                    this.HI = true;
                    break;
                }
            }
            this.Ik = iHighestOneBit;
            int i3 = w6Var.J2;
            this.f66575o = i3 / iHighestOneBit;
            int i5 = w6Var.Uo;
            this.f66576r = i5 / iHighestOneBit;
            this.mUb = this.f66577t.rl(i3 * i5);
            this.gh = this.f66577t.nr(this.f66575o * this.f66576r);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // f6d.j
    public synchronized Bitmap t() {
        try {
            if (this.az.f66585t <= 0 || this.qie < 0) {
                String str = f66571S;
                if (Log.isLoggable(str, 3)) {
                    Log.d(str, "Unable to decode frame, frameCount=" + this.az.f66585t + ", framePointer=" + this.qie);
                }
                this.ck = 1;
            }
            int i2 = this.ck;
            if (i2 != 1 && i2 != 2) {
                this.ck = 0;
                if (this.f66572O == null) {
                    this.f66572O = this.f66577t.rl(255);
                }
                n nVar = (n) this.az.f66583O.get(this.qie);
                int i3 = this.qie - 1;
                n nVar2 = i3 >= 0 ? (n) this.az.f66583O.get(i3) : null;
                int[] iArr = nVar.gh;
                if (iArr == null) {
                    iArr = this.az.f66584n;
                }
                this.f66574n = iArr;
                if (iArr == null) {
                    String str2 = f66571S;
                    if (Log.isLoggable(str2, 3)) {
                        Log.d(str2, "No valid color table found for frame #" + this.qie);
                    }
                    this.ck = 1;
                    return null;
                }
                if (nVar.J2) {
                    System.arraycopy(iArr, 0, this.rl, 0, iArr.length);
                    int[] iArr2 = this.rl;
                    this.f66574n = iArr2;
                    iArr2[nVar.KN] = 0;
                    if (nVar.Uo == 2 && this.qie == 0) {
                        this.f66573Z = Boolean.TRUE;
                    }
                }
                return Z(nVar, nVar2);
            }
            String str3 = f66571S;
            if (Log.isLoggable(str3, 3)) {
                Log.d(str3, "Unable to decode frame, status=" + this.ck);
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized int ty(byte[] bArr) {
        try {
            w6 w6VarRl = qie().ck(bArr).rl();
            this.az = w6VarRl;
            if (bArr != null) {
                o(w6VarRl, bArr);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.ck;
    }

    private Bitmap Z(n nVar, n nVar2) {
        int i2;
        int i3;
        Bitmap bitmap;
        int[] iArr = this.gh;
        int i5 = 0;
        if (nVar2 == null) {
            Bitmap bitmap2 = this.ty;
            if (bitmap2 != null) {
                this.f66577t.n(bitmap2);
            }
            this.ty = null;
            Arrays.fill(iArr, 0);
        }
        if (nVar2 != null && nVar2.Uo == 3 && this.ty == null) {
            Arrays.fill(iArr, 0);
        }
        if (nVar2 != null && (i3 = nVar2.Uo) > 0) {
            if (i3 == 2) {
                if (!nVar.J2) {
                    w6 w6Var = this.az;
                    int i7 = w6Var.qie;
                    if (nVar.gh == null || w6Var.mUb != nVar.KN) {
                        i5 = i7;
                    }
                }
                int i8 = nVar2.nr;
                int i9 = this.Ik;
                int i10 = i8 / i9;
                int i11 = nVar2.rl / i9;
                int i12 = nVar2.f66582t / i9;
                int i13 = nVar2.f66581n / i9;
                int i14 = this.f66575o;
                int i15 = (i11 * i14) + i13;
                int i16 = (i10 * i14) + i15;
                while (i15 < i16) {
                    int i17 = i15 + i12;
                    for (int i18 = i15; i18 < i17; i18++) {
                        iArr[i18] = i5;
                    }
                    i15 += this.f66575o;
                }
            } else if (i3 == 3 && (bitmap = this.ty) != null) {
                int i19 = this.f66575o;
                bitmap.getPixels(iArr, 0, i19, 0, 0, i19, this.f66576r);
            }
        }
        gh(nVar);
        if (nVar.f66580O || this.Ik != 1) {
            xMQ(nVar);
        } else {
            mUb(nVar);
        }
        if (this.HI && ((i2 = nVar.Uo) == 0 || i2 == 1)) {
            if (this.ty == null) {
                this.ty = az();
            }
            Bitmap bitmap3 = this.ty;
            int i20 = this.f66575o;
            bitmap3.setPixels(iArr, 0, i20, 0, 0, i20, this.f66576r);
        }
        Bitmap bitmapAz = az();
        int i21 = this.f66575o;
        bitmapAz.setPixels(iArr, 0, i21, 0, 0, i21, this.f66576r);
        return bitmapAz;
    }

    private Bitmap az() {
        Boolean bool = this.f66573Z;
        Bitmap bitmapT = this.f66577t.t(this.f66575o, this.f66576r, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.XQ);
        bitmapT.setHasAlpha(true);
        return bitmapT;
    }

    private int ck() {
        return this.nr.get() & UByte.MAX_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v15, types: [short] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    private void gh(n nVar) {
        int i2;
        int i3;
        byte[] bArr;
        short s2;
        I28 i28 = this;
        if (nVar != null) {
            i28.nr.position(nVar.mUb);
        }
        if (nVar == null) {
            w6 w6Var = i28.az;
            i2 = w6Var.J2;
            i3 = w6Var.Uo;
        } else {
            i2 = nVar.f66582t;
            i3 = nVar.nr;
        }
        int i5 = i2 * i3;
        byte[] bArr2 = i28.mUb;
        if (bArr2 == null || bArr2.length < i5) {
            i28.mUb = i28.f66577t.rl(i5);
        }
        byte[] bArr3 = i28.mUb;
        if (i28.Uo == null) {
            i28.Uo = new short[4096];
        }
        short[] sArr = i28.Uo;
        if (i28.KN == null) {
            i28.KN = new byte[4096];
        }
        byte[] bArr4 = i28.KN;
        if (i28.xMQ == null) {
            i28.xMQ = new byte[4097];
        }
        byte[] bArr5 = i28.xMQ;
        int iCk = i28.ck();
        int i7 = 1 << iCk;
        int i8 = i7 + 1;
        int i9 = i7 + 2;
        int i10 = iCk + 1;
        int i11 = (1 << i10) - 1;
        byte b2 = 0;
        for (int i12 = 0; i12 < i7; i12++) {
            sArr[i12] = 0;
            bArr4[i12] = (byte) i12;
        }
        byte[] bArr6 = i28.f66572O;
        int i13 = i10;
        int i14 = i9;
        int i15 = i11;
        int i16 = 0;
        int iHI = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = -1;
        while (true) {
            if (i16 >= i5) {
                break;
            }
            if (iHI == 0) {
                iHI = i28.HI();
                if (iHI <= 0) {
                    i28.ck = 3;
                    break;
                }
                i17 = b2;
            }
            i19 += (bArr6[i17] & UByte.MAX_VALUE) << i18;
            i17++;
            iHI--;
            int i24 = i18 + 8;
            int i25 = i14;
            int i26 = i23;
            int i27 = i13;
            short[] sArr2 = sArr;
            int i29 = i22;
            while (true) {
                bArr = bArr4;
                if (i24 < i27) {
                    i14 = i25;
                    i22 = i29;
                    break;
                }
                int i30 = i19 & i15;
                i19 >>= i27;
                i24 -= i27;
                if (i30 == i7) {
                    i27 = i10;
                    i25 = i9;
                    i15 = i11;
                    bArr4 = bArr;
                    i26 = -1;
                } else {
                    if (i30 == i8) {
                        i22 = i29;
                        i14 = i25;
                        break;
                    }
                    byte[] bArr7 = bArr5;
                    if (i26 == -1) {
                        bArr3[i20] = bArr[i30];
                        i20++;
                        i16++;
                        i26 = i30;
                        i29 = i26;
                        bArr4 = bArr;
                        bArr5 = bArr7;
                    } else {
                        if (i30 >= i25) {
                            bArr7[i21] = (byte) i29;
                            i21++;
                            s2 = i26;
                        } else {
                            s2 = i30;
                        }
                        while (s2 >= i7) {
                            bArr7[i21] = bArr[s2];
                            i21++;
                            s2 = sArr2[s2];
                        }
                        int i31 = bArr[s2] & UByte.MAX_VALUE;
                        byte b4 = (byte) i31;
                        bArr3[i20] = b4;
                        while (true) {
                            i20++;
                            i16++;
                            if (i21 <= 0) {
                                break;
                            }
                            i21--;
                            bArr3[i20] = bArr7[i21];
                        }
                        if (i25 < 4096) {
                            sArr2[i25] = (short) i26;
                            bArr[i25] = b4;
                            i25++;
                            if ((i25 & i15) == 0 && i25 < 4096) {
                                i27++;
                                i15 += i25;
                            }
                        }
                        i26 = i30;
                        bArr4 = bArr;
                        bArr5 = bArr7;
                        i29 = i31;
                    }
                }
            }
            i18 = i24;
            sArr = sArr2;
            bArr4 = bArr;
            b2 = 0;
            i23 = i26;
            i13 = i27;
            i28 = this;
        }
        Arrays.fill(bArr3, i20, i5, b2);
    }

    private void mUb(n nVar) {
        n nVar2 = nVar;
        int[] iArr = this.gh;
        int i2 = nVar2.nr;
        int i3 = nVar2.rl;
        int i5 = nVar2.f66582t;
        int i7 = nVar2.f66581n;
        boolean z2 = this.qie == 0;
        int i8 = this.f66575o;
        byte[] bArr = this.mUb;
        int[] iArr2 = this.f66574n;
        int i9 = 0;
        byte b2 = -1;
        while (i9 < i2) {
            int i10 = (i9 + i3) * i8;
            int i11 = i10 + i7;
            int i12 = i11 + i5;
            int i13 = i10 + i8;
            if (i13 < i12) {
                i12 = i13;
            }
            int i14 = nVar2.f66582t * i9;
            int i15 = i11;
            while (i15 < i12) {
                byte b4 = bArr[i14];
                int[] iArr3 = iArr;
                int i16 = b4 & UByte.MAX_VALUE;
                if (i16 != b2) {
                    int i17 = iArr2[i16];
                    if (i17 != 0) {
                        iArr3[i15] = i17;
                    } else {
                        b2 = b4;
                    }
                }
                i14++;
                i15++;
                iArr = iArr3;
            }
            i9++;
            nVar2 = nVar;
        }
        Boolean bool = this.f66573Z;
        this.f66573Z = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f66573Z == null && z2 && b2 != -1));
    }

    private Ml qie() {
        if (this.J2 == null) {
            this.J2 = new Ml();
        }
        return this.J2;
    }

    private void xMQ(n nVar) {
        int i2;
        int i3;
        int i5;
        int i7;
        int[] iArr = this.gh;
        int i8 = nVar.nr;
        int i9 = this.Ik;
        int i10 = i8 / i9;
        int i11 = nVar.rl / i9;
        int i12 = nVar.f66582t / i9;
        int i13 = nVar.f66581n / i9;
        boolean z2 = this.qie == 0;
        int i14 = this.f66575o;
        int i15 = this.f66576r;
        byte[] bArr = this.mUb;
        int[] iArr2 = this.f66574n;
        Boolean bool = this.f66573Z;
        int i16 = 8;
        int i17 = 0;
        int i18 = 0;
        int i19 = 1;
        while (i18 < i10) {
            int[] iArr3 = iArr;
            if (nVar.f66580O) {
                if (i17 >= i10) {
                    int i20 = i19 + 1;
                    i2 = i10;
                    if (i20 == 2) {
                        i19 = i20;
                        i17 = 4;
                    } else if (i20 == 3) {
                        i19 = i20;
                        i16 = 4;
                        i17 = 2;
                    } else if (i20 != 4) {
                        i19 = i20;
                    } else {
                        i19 = i20;
                        i17 = 1;
                        i16 = 2;
                    }
                } else {
                    i2 = i10;
                }
                i3 = i17 + i16;
            } else {
                i2 = i10;
                i3 = i17;
                i17 = i18;
            }
            int i21 = i17 + i11;
            boolean z3 = i9 == 1;
            if (i21 < i15) {
                int i22 = i21 * i14;
                int i23 = i22 + i13;
                int i24 = i23 + i12;
                int i25 = i22 + i14;
                if (i25 < i24) {
                    i24 = i25;
                }
                i5 = i3;
                int i26 = i18 * i9 * nVar.f66582t;
                if (z3) {
                    int i27 = i23;
                    while (i27 < i24) {
                        int i28 = i27;
                        int i29 = iArr2[bArr[i26] & UByte.MAX_VALUE];
                        if (i29 != 0) {
                            iArr3[i28] = i29;
                        } else if (z2 && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i26 += i9;
                        i27 = i28 + 1;
                    }
                } else {
                    int i30 = ((i24 - i23) * i9) + i26;
                    i7 = i9;
                    int i31 = i23;
                    while (i31 < i24) {
                        int i32 = i24;
                        int iKN = KN(i26, i30, nVar.f66582t);
                        if (iKN != 0) {
                            iArr3[i31] = iKN;
                        } else if (z2 && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i26 += i7;
                        i31++;
                        i24 = i32;
                    }
                    i18++;
                    i9 = i7;
                    iArr = iArr3;
                    i10 = i2;
                    i17 = i5;
                }
            } else {
                i5 = i3;
            }
            i7 = i9;
            i18++;
            i9 = i7;
            iArr = iArr3;
            i10 = i2;
            i17 = i5;
        }
        if (this.f66573Z == null) {
            this.f66573Z = Boolean.valueOf(bool == null ? false : bool.booleanValue());
        }
    }

    @Override // f6d.j
    public int O(int i2) {
        if (i2 < 0) {
            return -1;
        }
        w6 w6Var = this.az;
        if (i2 < w6Var.f66585t) {
            return ((n) w6Var.f66583O.get(i2)).xMQ;
        }
        return -1;
    }

    @Override // f6d.j
    public int Uo() {
        return this.qie;
    }

    @Override // f6d.j
    public int getHeight() {
        return this.az.Uo;
    }

    @Override // f6d.j
    public int getStatus() {
        return this.ck;
    }

    @Override // f6d.j
    public int getWidth() {
        return this.az.J2;
    }

    @Override // f6d.j
    public int n() {
        return this.az.f66585t;
    }

    @Override // f6d.j
    public void nr() {
        this.qie = (this.qie + 1) % this.az.f66585t;
    }

    @Override // f6d.j
    public int rl(InputStream inputStream, int i2) {
        if (inputStream != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2 > 0 ? i2 + 4096 : 16384);
                byte[] bArr = new byte[16384];
                while (true) {
                    int i3 = inputStream.read(bArr, 0, 16384);
                    if (i3 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i3);
                }
                byteArrayOutputStream.flush();
                ty(byteArrayOutputStream.toByteArray());
            } catch (IOException e2) {
                Log.w(f66571S, "Error reading data from stream", e2);
            }
        } else {
            this.ck = 2;
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e3) {
                Log.w(f66571S, "Error closing stream", e3);
            }
        }
        return this.ck;
    }

    public I28(j.InterfaceC0917j interfaceC0917j) {
        this.f66577t = interfaceC0917j;
    }

    private int HI() {
        int iCk = ck();
        if (iCk <= 0) {
            return iCk;
        }
        ByteBuffer byteBuffer = this.nr;
        byteBuffer.get(this.f66572O, 0, Math.min(iCk, byteBuffer.remaining()));
        return iCk;
    }
}
