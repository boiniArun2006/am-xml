package nl4;

import R0.CN3;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class j extends InputStream {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Timer f71220O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InputStream f71221n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f71223r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final CN3 f71224t;
    private long J2 = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f71222o = -1;

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            int i2 = this.f71221n.read();
            long jT2 = this.f71220O.t();
            if (this.f71223r == -1) {
                this.f71223r = jT2;
            }
            if (i2 != -1 || this.f71222o != -1) {
                n(1L);
                this.f71224t.ck(this.J2);
                return i2;
            }
            this.f71222o = jT2;
            this.f71224t.r(jT2);
            this.f71224t.rl();
            return i2;
        } catch (IOException e2) {
            this.f71224t.r(this.f71220O.t());
            Ml.nr(this.f71224t);
            throw e2;
        }
    }

    private void n(long j2) {
        long j3 = this.J2;
        if (j3 == -1) {
            this.J2 = j2;
        } else {
            this.J2 = j3 + j2;
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        try {
            return this.f71221n.available();
        } catch (IOException e2) {
            this.f71224t.r(this.f71220O.t());
            Ml.nr(this.f71224t);
            throw e2;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        long jT2 = this.f71220O.t();
        if (this.f71222o == -1) {
            this.f71222o = jT2;
        }
        try {
            this.f71221n.close();
            long j2 = this.J2;
            if (j2 != -1) {
                this.f71224t.ck(j2);
            }
            long j3 = this.f71223r;
            if (j3 != -1) {
                this.f71224t.o(j3);
            }
            this.f71224t.r(this.f71222o);
            this.f71224t.rl();
        } catch (IOException e2) {
            this.f71224t.r(this.f71220O.t());
            Ml.nr(this.f71224t);
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public void mark(int i2) {
        this.f71221n.mark(i2);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f71221n.markSupported();
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        try {
            this.f71221n.reset();
        } catch (IOException e2) {
            this.f71224t.r(this.f71220O.t());
            Ml.nr(this.f71224t);
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j2) throws IOException {
        try {
            long jSkip = this.f71221n.skip(j2);
            long jT2 = this.f71220O.t();
            if (this.f71223r == -1) {
                this.f71223r = jT2;
            }
            if (jSkip == 0 && j2 != 0 && this.f71222o == -1) {
                this.f71222o = jT2;
                this.f71224t.r(jT2);
                return jSkip;
            }
            n(jSkip);
            this.f71224t.ck(this.J2);
            return jSkip;
        } catch (IOException e2) {
            this.f71224t.r(this.f71220O.t());
            Ml.nr(this.f71224t);
            throw e2;
        }
    }

    public j(InputStream inputStream, CN3 cn3, Timer timer) {
        this.f71220O = timer;
        this.f71221n = inputStream;
        this.f71224t = cn3;
        this.f71223r = cn3.O();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        try {
            int i5 = this.f71221n.read(bArr, i2, i3);
            long jT2 = this.f71220O.t();
            if (this.f71223r == -1) {
                this.f71223r = jT2;
            }
            if (i5 == -1 && this.f71222o == -1) {
                this.f71222o = jT2;
                this.f71224t.r(jT2);
                this.f71224t.rl();
                return i5;
            }
            n(i5);
            this.f71224t.ck(this.J2);
            return i5;
        } catch (IOException e2) {
            this.f71224t.r(this.f71220O.t());
            Ml.nr(this.f71224t);
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            int i2 = this.f71221n.read(bArr);
            long jT2 = this.f71220O.t();
            if (this.f71223r == -1) {
                this.f71223r = jT2;
            }
            if (i2 == -1 && this.f71222o == -1) {
                this.f71222o = jT2;
                this.f71224t.r(jT2);
                this.f71224t.rl();
                return i2;
            }
            n(i2);
            this.f71224t.ck(this.J2);
            return i2;
        } catch (IOException e2) {
            this.f71224t.r(this.f71220O.t());
            Ml.nr(this.f71224t);
            throw e2;
        }
    }
}
