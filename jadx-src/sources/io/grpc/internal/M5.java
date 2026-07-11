package io.grpc.internal;

import JP.Dsr;
import androidx.constraintlayout.core.dsl.kYF.obbPUqyhtS;
import io.grpc.StatusRuntimeException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class M5 implements h {
    private final IG KN;
    private long az;
    private int gh;
    private boolean mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Ml f68300n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private N f68301t;
    private final h6y xMQ;
    private int rl = -1;
    private JP.C nr = Dsr.n.f4494n;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f68299O = true;
    private final w6 J2 = new w6();
    private final ByteBuffer Uo = ByteBuffer.allocate(5);
    private int qie = -1;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    public interface Ml {
        void J2(N n2, boolean z2, boolean z3, int i2);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    private final class n extends OutputStream {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f68303n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private N f68304t;

        private n() {
            this.f68303n = new ArrayList();
        }

        @Override // java.io.OutputStream
        public void write(int i2) {
            N n2 = this.f68304t;
            if (n2 == null || n2.n() <= 0) {
                write(new byte[]{(byte) i2}, 0, 1);
            } else {
                this.f68304t.rl((byte) i2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int nr() {
            Iterator it = this.f68303n.iterator();
            int iNr = 0;
            while (it.hasNext()) {
                iNr += ((N) it.next()).nr();
            }
            return iNr;
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i2, int i3) {
            if (this.f68304t == null) {
                N n2 = M5.this.KN.n(i3);
                this.f68304t = n2;
                this.f68303n.add(n2);
            }
            while (i3 > 0) {
                int iMin = Math.min(i3, this.f68304t.n());
                if (iMin == 0) {
                    N n3 = M5.this.KN.n(Math.max(i3, this.f68304t.nr() * 2));
                    this.f68304t = n3;
                    this.f68303n.add(n3);
                } else {
                    this.f68304t.write(bArr, i2, iMin);
                    i2 += iMin;
                    i3 -= iMin;
                }
            }
        }
    }

    private int ck(InputStream inputStream, int i2) throws IOException {
        if (i2 != -1) {
            this.az = i2;
            return az(inputStream, i2);
        }
        n nVar = new n();
        int iHI = HI(inputStream, nVar);
        gh(nVar, false);
        return iHI;
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    private class w6 extends OutputStream {
        private w6() {
        }

        @Override // java.io.OutputStream
        public void write(int i2) {
            write(new byte[]{(byte) i2}, 0, 1);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i2, int i3) {
            M5.this.ty(bArr, i2, i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int HI(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (inputStream instanceof JP.l3D) {
            return ((JP.l3D) inputStream).n(outputStream);
        }
        long jRl = JMO.j.rl(inputStream, outputStream);
        t1.Xo.mUb(jRl <= 2147483647L, "Message size overflow: %s", jRl);
        return (int) jRl;
    }

    private int J2(InputStream inputStream) {
        if ((inputStream instanceof JP.Ew) || (inputStream instanceof ByteArrayInputStream)) {
            return inputStream.available();
        }
        return -1;
    }

    private void O(boolean z2, boolean z3) {
        N n2 = this.f68301t;
        this.f68301t = null;
        this.f68300n.J2(n2, z2, z3, this.gh);
        this.gh = 0;
    }

    private void Uo() {
        N n2 = this.f68301t;
        if (n2 != null) {
            n2.release();
            this.f68301t = null;
        }
    }

    private int az(InputStream inputStream, int i2) {
        int i3 = this.rl;
        if (i3 >= 0 && i2 > i3) {
            throw io.grpc.SPz.ty.Ik(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(i2), Integer.valueOf(this.rl))).nr();
        }
        this.Uo.clear();
        this.Uo.put((byte) 0).putInt(i2);
        if (this.f68301t == null) {
            this.f68301t = this.KN.n(this.Uo.position() + i2);
        }
        ty(this.Uo.array(), 0, this.Uo.position());
        return HI(inputStream, this.J2);
    }

    private int qie(InputStream inputStream, int i2) throws IOException {
        n nVar = new n();
        OutputStream outputStreamT = this.nr.t(nVar);
        try {
            int iHI = HI(inputStream, outputStreamT);
            outputStreamT.close();
            int i3 = this.rl;
            if (i3 >= 0 && iHI > i3) {
                throw io.grpc.SPz.ty.Ik(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iHI), Integer.valueOf(this.rl))).nr();
            }
            gh(nVar, true);
            return iHI;
        } catch (Throwable th) {
            outputStreamT.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ty(byte[] bArr, int i2, int i3) {
        while (i3 > 0) {
            N n2 = this.f68301t;
            if (n2 != null && n2.n() == 0) {
                O(false, false);
            }
            if (this.f68301t == null) {
                this.f68301t = this.KN.n(i3);
            }
            int iMin = Math.min(i3, this.f68301t.n());
            this.f68301t.write(bArr, i2, iMin);
            i2 += iMin;
            i3 -= iMin;
        }
    }

    @Override // io.grpc.internal.h
    public void KN(int i2) {
        t1.Xo.S(this.rl == -1, "max size already set");
        this.rl = i2;
    }

    @Override // io.grpc.internal.h
    public void flush() {
        N n2 = this.f68301t;
        if (n2 == null || n2.nr() <= 0) {
            return;
        }
        O(false, true);
    }

    @Override // io.grpc.internal.h
    public boolean isClosed() {
        return this.mUb;
    }

    @Override // io.grpc.internal.h
    public void rl(InputStream inputStream) {
        mUb();
        this.gh++;
        int i2 = this.qie + 1;
        this.qie = i2;
        this.az = 0L;
        this.xMQ.xMQ(i2);
        boolean z2 = this.f68299O && this.nr != Dsr.n.f4494n;
        try {
            int iJ2 = J2(inputStream);
            int iCk = (iJ2 == 0 || !z2) ? ck(inputStream, iJ2) : qie(inputStream, iJ2);
            if (iJ2 != -1 && iCk != iJ2) {
                throw io.grpc.SPz.f68187o.Ik(String.format("Message length inaccurate %s != %s", Integer.valueOf(iCk), Integer.valueOf(iJ2))).nr();
            }
            long j2 = iCk;
            this.xMQ.gh(j2);
            this.xMQ.qie(this.az);
            this.xMQ.mUb(this.qie, this.az, j2);
        } catch (StatusRuntimeException e2) {
            throw e2;
        } catch (IOException e3) {
            throw io.grpc.SPz.f68187o.Ik("Failed to frame message").ck(e3).nr();
        } catch (RuntimeException e4) {
            throw io.grpc.SPz.f68187o.Ik("Failed to frame message").ck(e4).nr();
        }
    }

    @Override // io.grpc.internal.h
    /* JADX INFO: renamed from: xMQ, reason: merged with bridge method [inline-methods] */
    public M5 n(JP.C c2) {
        this.nr = (JP.C) t1.Xo.ck(c2, "Can't pass an empty compressor");
        return this;
    }

    public M5(Ml ml, IG ig, h6y h6yVar) {
        this.f68300n = (Ml) t1.Xo.ck(ml, obbPUqyhtS.pjoNBMc);
        this.KN = (IG) t1.Xo.ck(ig, "bufferAllocator");
        this.xMQ = (h6y) t1.Xo.ck(h6yVar, "statsTraceCtx");
    }

    private void gh(n nVar, boolean z2) {
        int iNr = nVar.nr();
        int i2 = this.rl;
        if (i2 >= 0 && iNr > i2) {
            throw io.grpc.SPz.ty.Ik(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iNr), Integer.valueOf(this.rl))).nr();
        }
        this.Uo.clear();
        this.Uo.put(z2 ? (byte) 1 : (byte) 0).putInt(iNr);
        N n2 = this.KN.n(5);
        n2.write(this.Uo.array(), 0, this.Uo.position());
        if (iNr == 0) {
            this.f68301t = n2;
            return;
        }
        this.f68300n.J2(n2, false, false, this.gh - 1);
        this.gh = 1;
        List list = nVar.f68303n;
        for (int i3 = 0; i3 < list.size() - 1; i3++) {
            this.f68300n.J2((N) list.get(i3), false, false, 0);
        }
        this.f68301t = (N) list.get(list.size() - 1);
        this.az = iNr;
    }

    private void mUb() {
        if (!isClosed()) {
        } else {
            throw new IllegalStateException("Framer already closed");
        }
    }

    @Override // io.grpc.internal.h
    public void close() {
        if (!isClosed()) {
            this.mUb = true;
            N n2 = this.f68301t;
            if (n2 != null && n2.nr() == 0) {
                Uo();
            }
            O(true, true);
        }
    }
}
