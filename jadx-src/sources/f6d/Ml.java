package f6d;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final byte[] f66578n = new byte[256];
    private int nr = 0;
    private ByteBuffer rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private w6 f66579t;

    private void KN(int i2) {
        boolean z2 = false;
        while (!z2 && !n() && this.f66579t.f66585t <= i2) {
            int iT = t();
            if (iT == 33) {
                int iT2 = t();
                if (iT2 == 1) {
                    Ik();
                } else if (iT2 == 249) {
                    this.f66579t.nr = new n();
                    xMQ();
                } else if (iT2 == 254) {
                    Ik();
                } else if (iT2 != 255) {
                    Ik();
                } else {
                    O();
                    StringBuilder sb = new StringBuilder();
                    for (int i3 = 0; i3 < 11; i3++) {
                        sb.append((char) this.f66578n[i3]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        qie();
                    } else {
                        Ik();
                    }
                }
            } else if (iT == 44) {
                w6 w6Var = this.f66579t;
                if (w6Var.nr == null) {
                    w6Var.nr = new n();
                }
                nr();
            } else if (iT != 59) {
                this.f66579t.rl = 1;
            } else {
                z2 = true;
            }
        }
    }

    private void ty() {
        this.rl = null;
        Arrays.fill(this.f66578n, (byte) 0);
        this.f66579t = new w6();
        this.nr = 0;
    }

    private int[] J2(int i2) {
        byte[] bArr = new byte[i2 * 3];
        int[] iArr = null;
        try {
            this.rl.get(bArr);
            iArr = new int[256];
            int i3 = 0;
            int i5 = 0;
            while (i3 < i2) {
                int i7 = bArr[i5] & UByte.MAX_VALUE;
                int i8 = i5 + 2;
                int i9 = bArr[i5 + 1] & UByte.MAX_VALUE;
                i5 += 3;
                int i10 = i3 + 1;
                iArr[i3] = (i9 << 8) | (i7 << 16) | (-16777216) | (bArr[i8] & UByte.MAX_VALUE);
                i3 = i10;
            }
            return iArr;
        } catch (BufferUnderflowException e2) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e2);
            }
            this.f66579t.rl = 1;
            return iArr;
        }
    }

    private int az() {
        return this.rl.getShort();
    }

    private void gh() {
        this.f66579t.J2 = az();
        this.f66579t.Uo = az();
        int iT = t();
        w6 w6Var = this.f66579t;
        w6Var.KN = (iT & 128) != 0;
        w6Var.xMQ = (int) Math.pow(2.0d, (iT & 7) + 1);
        this.f66579t.mUb = t();
        this.f66579t.gh = t();
    }

    private void mUb() {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < 6; i2++) {
            sb.append((char) t());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f66579t.rl = 1;
            return;
        }
        gh();
        if (!this.f66579t.KN || n()) {
            return;
        }
        w6 w6Var = this.f66579t;
        w6Var.f66584n = J2(w6Var.xMQ);
        w6 w6Var2 = this.f66579t;
        w6Var2.qie = w6Var2.f66584n[w6Var2.mUb];
    }

    private boolean n() {
        return this.f66579t.rl != 0;
    }

    private void nr() {
        this.f66579t.nr.f66581n = az();
        this.f66579t.nr.rl = az();
        this.f66579t.nr.f66582t = az();
        this.f66579t.nr.nr = az();
        int iT = t();
        boolean z2 = (iT & 128) != 0;
        int iPow = (int) Math.pow(2.0d, (iT & 7) + 1);
        n nVar = this.f66579t.nr;
        nVar.f66580O = (iT & 64) != 0;
        if (z2) {
            nVar.gh = J2(iPow);
        } else {
            nVar.gh = null;
        }
        this.f66579t.nr.mUb = this.rl.position();
        r();
        if (n()) {
            return;
        }
        w6 w6Var = this.f66579t;
        w6Var.f66585t++;
        w6Var.f66583O.add(w6Var.nr);
    }

    private int t() {
        try {
            return this.rl.get() & UByte.MAX_VALUE;
        } catch (Exception unused) {
            this.f66579t.rl = 1;
            return 0;
        }
    }

    public Ml ck(byte[] bArr) {
        if (bArr != null) {
            HI(ByteBuffer.wrap(bArr));
            return this;
        }
        this.rl = null;
        this.f66579t.rl = 2;
        return this;
    }

    public w6 rl() {
        if (this.rl == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (n()) {
            return this.f66579t;
        }
        mUb();
        if (!n()) {
            Uo();
            w6 w6Var = this.f66579t;
            if (w6Var.f66585t < 0) {
                w6Var.rl = 1;
            }
        }
        return this.f66579t;
    }

    private void Ik() {
        int iT;
        do {
            iT = t();
            this.rl.position(Math.min(this.rl.position() + iT, this.rl.limit()));
        } while (iT > 0);
    }

    private void O() {
        int iT = t();
        this.nr = iT;
        if (iT > 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                try {
                    i3 = this.nr;
                    if (i2 < i3) {
                        i3 -= i2;
                        this.rl.get(this.f66578n, i2, i3);
                        i2 += i3;
                    } else {
                        return;
                    }
                } catch (Exception e2) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        Log.d("GifHeaderParser", "Error Reading Block n: " + i2 + " count: " + i3 + " blockSize: " + this.nr, e2);
                    }
                    this.f66579t.rl = 1;
                    return;
                }
            }
        }
    }

    private void Uo() {
        KN(Integer.MAX_VALUE);
    }

    private void qie() {
        do {
            O();
            byte[] bArr = this.f66578n;
            if (bArr[0] == 1) {
                this.f66579t.az = ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[1] & UByte.MAX_VALUE);
            }
            if (this.nr <= 0) {
                return;
            }
        } while (!n());
    }

    private void r() {
        t();
        Ik();
    }

    private void xMQ() {
        t();
        int iT = t();
        n nVar = this.f66579t.nr;
        int i2 = (iT & 28) >> 2;
        nVar.Uo = i2;
        boolean z2 = true;
        if (i2 == 0) {
            nVar.Uo = 1;
        }
        if ((iT & 1) == 0) {
            z2 = false;
        }
        nVar.J2 = z2;
        int iAz = az();
        if (iAz < 2) {
            iAz = 10;
        }
        n nVar2 = this.f66579t.nr;
        nVar2.xMQ = iAz * 10;
        nVar2.KN = t();
        t();
    }

    public Ml HI(ByteBuffer byteBuffer) {
        ty();
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.rl = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.rl.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
