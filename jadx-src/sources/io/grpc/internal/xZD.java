package io.grpc.internal;

import JP.Dsr;
import JP.InterfaceC1378z;
import io.grpc.internal.tI;
import java.io.Closeable;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.zip.DataFormatException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class xZD implements Closeable, ci {
    private final Pp J2;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private long f68797N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final h6y f68798O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f68799S;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private UGc f68802X;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private byte[] f68803Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f68804e;
    private int jB;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private n f68806n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Md f68807o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private InterfaceC1378z f68808r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f68809t;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private I28 f68805g = I28.HEADER;
    private int E2 = 5;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private UGc f68800T = new UGc();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f68810v = false;
    private int Xw = -1;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private boolean f68801U = false;
    private volatile boolean P5 = false;

    private enum I28 {
        HEADER,
        BODY
    }

    static final class Ml extends FilterInputStream {
        private long J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private long f68814O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f68815n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private long f68816r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final h6y f68817t;

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i2) {
            ((FilterInputStream) this).in.mark(i2);
            this.f68816r = this.J2;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int i2 = ((FilterInputStream) this).in.read();
            if (i2 != -1) {
                this.J2++;
            }
            rl();
            n();
            return i2;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.f68816r == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.J2 = this.f68816r;
        }

        private void n() {
            long j2 = this.J2;
            long j3 = this.f68814O;
            if (j2 > j3) {
                this.f68817t.J2(j2 - j3);
                this.f68814O = this.J2;
            }
        }

        private void rl() {
            if (this.J2 <= this.f68815n) {
                return;
            }
            throw io.grpc.SPz.ty.Ik("Decompressed gRPC message exceeds maximum size " + this.f68815n).nr();
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j2) throws IOException {
            long jSkip = ((FilterInputStream) this).in.skip(j2);
            this.J2 += jSkip;
            rl();
            n();
            return jSkip;
        }

        Ml(InputStream inputStream, int i2, h6y h6yVar) {
            super(inputStream);
            this.f68816r = -1L;
            this.f68815n = i2;
            this.f68817t = h6yVar;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) throws IOException {
            int i5 = ((FilterInputStream) this).in.read(bArr, i2, i3);
            if (i5 != -1) {
                this.J2 += (long) i5;
            }
            rl();
            n();
            return i5;
        }
    }

    public interface n {
        void O(boolean z2);

        void n(tI.j jVar);

        void nr(Throwable th);

        void t(int i2);
    }

    private static class w6 implements tI.j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private InputStream f68819n;

        /* synthetic */ w6(InputStream inputStream, j jVar) {
            this(inputStream);
        }

        private w6(InputStream inputStream) {
            this.f68819n = inputStream;
        }

        @Override // io.grpc.internal.tI.j
        public InputStream next() {
            InputStream inputStream = this.f68819n;
            this.f68819n = null;
            return inputStream;
        }
    }

    private boolean a() throws Throwable {
        int iM;
        int i2 = 0;
        try {
            if (this.f68802X == null) {
                this.f68802X = new UGc();
            }
            int iEF = 0;
            iM = 0;
            while (true) {
                try {
                    int iNr = this.E2 - this.f68802X.nr();
                    if (iNr <= 0) {
                        if (iEF > 0) {
                            this.f68806n.t(iEF);
                            if (this.f68805g == I28.BODY) {
                                if (this.f68807o != null) {
                                    this.f68798O.Uo(iM);
                                    this.jB += iM;
                                    return true;
                                }
                                this.f68798O.Uo(iEF);
                                this.jB += iEF;
                            }
                        }
                        return true;
                    }
                    if (this.f68807o != null) {
                        try {
                            byte[] bArr = this.f68803Z;
                            if (bArr == null || this.f68799S == bArr.length) {
                                this.f68803Z = new byte[Math.min(iNr, 2097152)];
                                this.f68799S = 0;
                            }
                            int iZ = this.f68807o.z(this.f68803Z, this.f68799S, Math.min(iNr, this.f68803Z.length - this.f68799S));
                            iEF += this.f68807o.eF();
                            iM += this.f68807o.M();
                            if (iZ == 0) {
                                if (iEF > 0) {
                                    this.f68806n.t(iEF);
                                    if (this.f68805g == I28.BODY) {
                                        if (this.f68807o != null) {
                                            this.f68798O.Uo(iM);
                                            this.jB += iM;
                                            return false;
                                        }
                                        this.f68798O.Uo(iEF);
                                        this.jB += iEF;
                                    }
                                }
                                return false;
                            }
                            this.f68802X.rl(B.J2(this.f68803Z, this.f68799S, iZ));
                            this.f68799S += iZ;
                        } catch (IOException e2) {
                            throw new RuntimeException(e2);
                        } catch (DataFormatException e3) {
                            throw new RuntimeException(e3);
                        }
                    } else {
                        if (this.f68800T.nr() == 0) {
                            if (iEF > 0) {
                                this.f68806n.t(iEF);
                                if (this.f68805g == I28.BODY) {
                                    if (this.f68807o != null) {
                                        this.f68798O.Uo(iM);
                                        this.jB += iM;
                                        return false;
                                    }
                                    this.f68798O.Uo(iEF);
                                    this.jB += iEF;
                                }
                            }
                            return false;
                        }
                        int iMin = Math.min(iNr, this.f68800T.nr());
                        iEF += iMin;
                        this.f68802X.rl(this.f68800T.S(iMin));
                    }
                } catch (Throwable th) {
                    int i3 = iEF;
                    th = th;
                    i2 = i3;
                    if (i2 > 0) {
                        this.f68806n.t(i2);
                        if (this.f68805g == I28.BODY) {
                            if (this.f68807o != null) {
                                this.f68798O.Uo(iM);
                                this.jB += iM;
                            } else {
                                this.f68798O.Uo(i2);
                                this.jB += i2;
                            }
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            iM = 0;
        }
    }

    void fcU() {
        this.P5 = true;
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f68818n;

        static {
            int[] iArr = new int[I28.values().length];
            f68818n = iArr;
            try {
                iArr[I28.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f68818n[I28.BODY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private void FX() {
        int unsignedByte = this.f68802X.readUnsignedByte();
        if ((unsignedByte & 254) != 0) {
            throw io.grpc.SPz.f68187o.Ik("gRPC frame header malformed: reserved bits not zero").nr();
        }
        this.f68804e = (unsignedByte & 1) != 0;
        int i2 = this.f68802X.readInt();
        this.E2 = i2;
        if (i2 < 0 || i2 > this.f68809t) {
            throw io.grpc.SPz.ty.Ik(String.format(Locale.US, "gRPC message exceeds maximum size %d: %d", Integer.valueOf(this.f68809t), Integer.valueOf(this.E2))).nr();
        }
        int i3 = this.Xw + 1;
        this.Xw = i3;
        this.f68798O.nr(i3);
        this.J2.nr();
        this.f68805g = I28.BODY;
    }

    private void M() {
        this.f68798O.O(this.Xw, this.jB, -1L);
        this.jB = 0;
        InputStream inputStreamU = this.f68804e ? U() : M7();
        this.f68802X.E();
        this.f68802X = null;
        this.f68806n.n(new w6(inputStreamU, null));
        this.f68805g = I28.HEADER;
        this.E2 = 5;
    }

    private InputStream M7() {
        this.f68798O.J2(this.f68802X.nr());
        return B.t(this.f68802X, true);
    }

    private InputStream U() {
        InterfaceC1378z interfaceC1378z = this.f68808r;
        if (interfaceC1378z == Dsr.n.f4494n) {
            throw io.grpc.SPz.f68187o.Ik("Can't decode compressed gRPC message as compression not configured").nr();
        }
        try {
            return new Ml(interfaceC1378z.rl(B.t(this.f68802X, true)), this.f68809t, this.f68798O);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    private boolean eF() {
        Md md = this.f68807o;
        return md != null ? md.fcU() : this.f68800T.nr() == 0;
    }

    private void n() {
        if (this.f68810v) {
            return;
        }
        this.f68810v = true;
        while (!this.P5 && this.f68797N > 0 && a()) {
            try {
                int i2 = j.f68818n[this.f68805g.ordinal()];
                if (i2 == 1) {
                    FX();
                } else {
                    if (i2 != 2) {
                        throw new AssertionError("Invalid state: " + this.f68805g);
                    }
                    M();
                    this.f68797N--;
                }
            } catch (Throwable th) {
                this.f68810v = false;
                throw th;
            }
        }
        if (this.P5) {
            close();
            this.f68810v = false;
        } else {
            if (this.f68801U && eF()) {
                close();
            }
            this.f68810v = false;
        }
    }

    void Mx(n nVar) {
        this.f68806n = nVar;
    }

    @Override // io.grpc.internal.ci
    public void Uo(int i2) {
        this.f68809t = i2;
    }

    @Override // io.grpc.internal.ci
    public void Z(RGN rgn) throws Throwable {
        t1.Xo.ck(rgn, "data");
        boolean z2 = true;
        try {
            if (p5()) {
                rgn.close();
                return;
            }
            Md md = this.f68807o;
            if (md != null) {
                md.M7(rgn);
            } else {
                this.f68800T.rl(rgn);
            }
            try {
                n();
            } catch (Throwable th) {
                th = th;
                z2 = false;
                if (z2) {
                    rgn.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public boolean isClosed() {
        return this.f68800T == null && this.f68807o == null;
    }

    @Override // io.grpc.internal.ci
    public void jB(InterfaceC1378z interfaceC1378z) {
        t1.Xo.S(this.f68807o == null, "Already set full stream decompressor");
        this.f68808r = (InterfaceC1378z) t1.Xo.ck(interfaceC1378z, "Can't pass an empty decompressor");
    }

    @Override // io.grpc.internal.ci
    public void rl(int i2) {
        t1.Xo.O(i2 > 0, "numMessages must be > 0");
        if (isClosed()) {
            return;
        }
        this.f68797N += (long) i2;
        n();
    }

    public void z(Md md) {
        t1.Xo.S(this.f68808r == Dsr.n.f4494n, "per-message decompressor already set");
        t1.Xo.S(this.f68807o == null, "full stream decompressor already set");
        this.f68807o = (Md) t1.Xo.ck(md, "Can't pass a null full stream decompressor");
        this.f68800T = null;
    }

    public xZD(n nVar, InterfaceC1378z interfaceC1378z, int i2, h6y h6yVar, Pp pp) {
        this.f68806n = (n) t1.Xo.ck(nVar, "sink");
        this.f68808r = (InterfaceC1378z) t1.Xo.ck(interfaceC1378z, "decompressor");
        this.f68809t = i2;
        this.f68798O = (h6y) t1.Xo.ck(h6yVar, "statsTraceCtx");
        this.J2 = (Pp) t1.Xo.ck(pp, "transportTracer");
    }

    private boolean p5() {
        if (!isClosed() && !this.f68801U) {
            return false;
        }
        return true;
    }

    @Override // io.grpc.internal.ci
    public void T() {
        if (isClosed()) {
            return;
        }
        if (eF()) {
            close();
        } else {
            this.f68801U = true;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, io.grpc.internal.ci
    public void close() {
        boolean z2;
        if (isClosed()) {
            return;
        }
        UGc uGc = this.f68802X;
        boolean z3 = false;
        if (uGc != null && uGc.nr() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        try {
            Md md = this.f68807o;
            if (md != null) {
                if (z2 || md.FX()) {
                    z3 = true;
                }
                this.f68807o.close();
                z2 = z3;
            }
            UGc uGc2 = this.f68800T;
            if (uGc2 != null) {
                uGc2.close();
            }
            UGc uGc3 = this.f68802X;
            if (uGc3 != null) {
                uGc3.close();
            }
            this.f68807o = null;
            this.f68800T = null;
            this.f68802X = null;
            this.f68806n.O(z2);
        } catch (Throwable th) {
            this.f68807o = null;
            this.f68800T = null;
            this.f68802X = null;
            throw th;
        }
    }
}
