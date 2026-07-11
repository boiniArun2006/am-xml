package io.grpc.internal;

import java.io.Closeable;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.ZipException;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
class Md implements Closeable {
    private int E2;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private long f68310X;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private Inflater f68311Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f68312e;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f68315o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f68316r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final UGc f68314n = new UGc();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final CRC32 f68317t = new CRC32();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final n f68307O = new n(this, null);
    private final byte[] J2 = new byte[512];

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private w6 f68308S = w6.HEADER;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f68313g = false;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f68309T = 0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f68306N = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f68318v = true;

    private class n {
        private n() {
        }

        /* synthetic */ n(Md md, j jVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int KN() {
            int unsignedByte;
            if (Md.this.f68315o - Md.this.f68316r > 0) {
                unsignedByte = Md.this.J2[Md.this.f68316r] & UByte.MAX_VALUE;
                Md.Uo(Md.this, 1);
            } else {
                unsignedByte = Md.this.f68314n.readUnsignedByte();
            }
            Md.this.f68317t.update(unsignedByte);
            Md.U(Md.this, 1);
            return unsignedByte;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int gh() {
            return (Md.this.f68315o - Md.this.f68316r) + Md.this.f68314n.nr();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void qie(int i2) {
            int i3;
            int i5 = Md.this.f68315o - Md.this.f68316r;
            if (i5 > 0) {
                int iMin = Math.min(i5, i2);
                Md.this.f68317t.update(Md.this.J2, Md.this.f68316r, iMin);
                Md.Uo(Md.this, iMin);
                i3 = i2 - iMin;
            } else {
                i3 = i2;
            }
            if (i3 > 0) {
                byte[] bArr = new byte[512];
                int i7 = 0;
                while (i7 < i3) {
                    int iMin2 = Math.min(i3 - i7, 512);
                    Md.this.f68314n.Rl(bArr, 0, iMin2);
                    Md.this.f68317t.update(bArr, 0, iMin2);
                    i7 += iMin2;
                }
            }
            Md.U(Md.this, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean Uo() {
            while (gh() > 0) {
                if (KN() == 0) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int mUb() {
            return KN() | (KN() << 8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long xMQ() {
            return ((long) mUb()) | (((long) mUb()) << 16);
        }
    }

    private enum w6 {
        HEADER,
        HEADER_EXTRA_LEN,
        HEADER_EXTRA,
        HEADER_NAME,
        HEADER_COMMENT,
        HEADER_CRC,
        INITIALIZE_INFLATER,
        INFLATING,
        INFLATER_NEEDS_INPUT,
        TRAILER
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f68319n;

        static {
            int[] iArr = new int[w6.values().length];
            f68319n = iArr;
            try {
                iArr[w6.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f68319n[w6.HEADER_EXTRA_LEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f68319n[w6.HEADER_EXTRA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f68319n[w6.HEADER_NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f68319n[w6.HEADER_COMMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f68319n[w6.HEADER_CRC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f68319n[w6.INITIALIZE_INFLATER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f68319n[w6.INFLATING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f68319n[w6.INFLATER_NEEDS_INPUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f68319n[w6.TRAILER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    private boolean GD() {
        int iGh = this.f68307O.gh();
        int i2 = this.f68312e;
        if (iGh < i2) {
            return false;
        }
        this.f68307O.qie(i2);
        this.f68308S = w6.HEADER_NAME;
        return true;
    }

    private boolean How() {
        if ((this.E2 & 8) != 8) {
            this.f68308S = w6.HEADER_COMMENT;
            return true;
        }
        if (!this.f68307O.Uo()) {
            return false;
        }
        this.f68308S = w6.HEADER_COMMENT;
        return true;
    }

    private boolean K() {
        if ((this.E2 & 4) != 4) {
            this.f68308S = w6.HEADER_NAME;
            return true;
        }
        if (this.f68307O.gh() < 2) {
            return false;
        }
        this.f68312e = this.f68307O.mUb();
        this.f68308S = w6.HEADER_EXTRA;
        return true;
    }

    private boolean Mx() {
        Inflater inflater = this.f68311Z;
        if (inflater == null) {
            this.f68311Z = new Inflater(true);
        } else {
            inflater.reset();
        }
        this.f68317t.reset();
        int i2 = this.f68315o;
        int i3 = this.f68316r;
        int i5 = i2 - i3;
        if (i5 > 0) {
            this.f68311Z.setInput(this.J2, i3, i5);
            this.f68308S = w6.INFLATING;
        } else {
            this.f68308S = w6.INFLATER_NEEDS_INPUT;
        }
        return true;
    }

    private boolean Org() throws ZipException {
        if ((this.E2 & 2) != 2) {
            this.f68308S = w6.INITIALIZE_INFLATER;
            return true;
        }
        if (this.f68307O.gh() < 2) {
            return false;
        }
        if ((((int) this.f68317t.getValue()) & 65535) != this.f68307O.mUb()) {
            throw new ZipException("Corrupt GZIP header");
        }
        this.f68308S = w6.INITIALIZE_INFLATER;
        return true;
    }

    private boolean T3L() throws ZipException {
        if (this.f68311Z != null && this.f68307O.gh() <= 18) {
            this.f68311Z.end();
            this.f68311Z = null;
        }
        if (this.f68307O.gh() < 8) {
            return false;
        }
        if (this.f68317t.getValue() != this.f68307O.xMQ() || this.f68310X != this.f68307O.xMQ()) {
            throw new ZipException("Corrupt GZIP trailer");
        }
        this.f68317t.reset();
        this.f68308S = w6.HEADER;
        return true;
    }

    static /* synthetic */ int U(Md md, int i2) {
        int i3 = md.f68309T + i2;
        md.f68309T = i3;
        return i3;
    }

    static /* synthetic */ int Uo(Md md, int i2) {
        int i3 = md.f68316r + i2;
        md.f68316r = i3;
        return i3;
    }

    private int a(byte[] bArr, int i2, int i3) throws DataFormatException {
        t1.Xo.S(this.f68311Z != null, "inflater is null");
        try {
            int totalIn = this.f68311Z.getTotalIn();
            int iInflate = this.f68311Z.inflate(bArr, i2, i3);
            int totalIn2 = this.f68311Z.getTotalIn() - totalIn;
            this.f68309T += totalIn2;
            this.f68306N += totalIn2;
            this.f68316r += totalIn2;
            this.f68317t.update(bArr, i2, iInflate);
            if (this.f68311Z.finished()) {
                this.f68310X = this.f68311Z.getBytesWritten() & 4294967295L;
                this.f68308S = w6.TRAILER;
                return iInflate;
            }
            if (this.f68311Z.needsInput()) {
                this.f68308S = w6.INFLATER_NEEDS_INPUT;
            }
            return iInflate;
        } catch (DataFormatException e2) {
            throw new DataFormatException("Inflater data format exception: " + e2.getMessage());
        }
    }

    private boolean n1() throws ZipException {
        if (this.f68307O.gh() < 10) {
            return false;
        }
        if (this.f68307O.mUb() != 35615) {
            throw new ZipException("Not in GZIP format");
        }
        if (this.f68307O.KN() != 8) {
            throw new ZipException("Unsupported compression method");
        }
        this.E2 = this.f68307O.KN();
        this.f68307O.qie(6);
        this.f68308S = w6.HEADER_EXTRA_LEN;
        return true;
    }

    private boolean p5() {
        t1.Xo.S(this.f68311Z != null, "inflater is null");
        t1.Xo.S(this.f68316r == this.f68315o, "inflaterInput has unconsumed bytes");
        int iMin = Math.min(this.f68314n.nr(), 512);
        if (iMin == 0) {
            return false;
        }
        this.f68316r = 0;
        this.f68315o = iMin;
        this.f68314n.Rl(this.J2, 0, iMin);
        this.f68311Z.setInput(this.J2, this.f68316r, iMin);
        this.f68308S = w6.INFLATING;
        return true;
    }

    private boolean qm() {
        if ((this.E2 & 16) != 16) {
            this.f68308S = w6.HEADER_CRC;
            return true;
        }
        if (!this.f68307O.Uo()) {
            return false;
        }
        this.f68308S = w6.HEADER_CRC;
        return true;
    }

    boolean FX() {
        t1.Xo.S(!this.f68313g, "GzipInflatingBuffer is closed");
        return (this.f68307O.gh() == 0 && this.f68308S == w6.HEADER) ? false : true;
    }

    int M() {
        int i2 = this.f68306N;
        this.f68306N = 0;
        return i2;
    }

    void M7(RGN rgn) {
        t1.Xo.S(!this.f68313g, "GzipInflatingBuffer is closed");
        this.f68314n.rl(rgn);
        this.f68318v = false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f68313g) {
            return;
        }
        this.f68313g = true;
        this.f68314n.close();
        Inflater inflater = this.f68311Z;
        if (inflater != null) {
            inflater.end();
            this.f68311Z = null;
        }
    }

    int eF() {
        int i2 = this.f68309T;
        this.f68309T = 0;
        return i2;
    }

    boolean fcU() {
        t1.Xo.S(!this.f68313g, "GzipInflatingBuffer is closed");
        return this.f68318v;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
    
        if (r2 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
    
        if (r6.f68308S != io.grpc.internal.Md.w6.f68326n) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
    
        if (r6.f68307O.gh() >= 10) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008a, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
    
        r6.f68318v = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008d, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    int z(byte[] bArr, int i2, int i3) throws ZipException {
        boolean z2 = true;
        t1.Xo.S(!this.f68313g, "GzipInflatingBuffer is closed");
        int iA = 0;
        while (true) {
            boolean zT3L = true;
            while (zT3L) {
                int i5 = i3 - iA;
                if (i5 > 0) {
                    switch (j.f68319n[this.f68308S.ordinal()]) {
                        case 1:
                            zT3L = n1();
                            break;
                        case 2:
                            zT3L = K();
                            break;
                        case 3:
                            zT3L = GD();
                            break;
                        case 4:
                            zT3L = How();
                            break;
                        case 5:
                            zT3L = qm();
                            break;
                        case 6:
                            zT3L = Org();
                            break;
                        case 7:
                            zT3L = Mx();
                            break;
                        case 8:
                            iA += a(bArr, i2 + iA, i5);
                            if (this.f68308S == w6.TRAILER) {
                                zT3L = T3L();
                            }
                            break;
                        case 9:
                            zT3L = p5();
                            break;
                        case 10:
                            zT3L = T3L();
                            break;
                        default:
                            throw new AssertionError("Invalid state: " + this.f68308S);
                    }
                }
            }
        }
    }

    Md() {
    }
}
