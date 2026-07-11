package A72;

import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class CN3 extends InputStream {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Pj0.fuX f7O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InputStream f8n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final byte[] f11t;
    private int J2 = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f10r = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f9o = false;

    @Override // java.io.InputStream
    public int read() throws IOException {
        Hh.C.xMQ(this.f10r <= this.J2);
        rl();
        if (!n()) {
            return -1;
        }
        byte[] bArr = this.f11t;
        int i2 = this.f10r;
        this.f10r = i2 + 1;
        return bArr[i2] & UByte.MAX_VALUE;
    }

    private boolean n() throws IOException {
        if (this.f10r < this.J2) {
            return true;
        }
        int i2 = this.f8n.read(this.f11t);
        if (i2 <= 0) {
            return false;
        }
        this.J2 = i2;
        this.f10r = 0;
        return true;
    }

    private void rl() throws IOException {
        if (this.f9o) {
            throw new IOException("stream already closed");
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        Hh.C.xMQ(this.f10r <= this.J2);
        rl();
        return (this.J2 - this.f10r) + this.f8n.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f9o) {
            return;
        }
        this.f9o = true;
        this.f7O.n(this.f11t);
        super.close();
    }

    protected void finalize() throws Throwable {
        if (!this.f9o) {
            Dzy.j.KN("PooledByteInputStream", "Finalized without closing");
            close();
        }
        super.finalize();
    }

    @Override // java.io.InputStream
    public long skip(long j2) throws IOException {
        Hh.C.xMQ(this.f10r <= this.J2);
        rl();
        int i2 = this.J2;
        int i3 = this.f10r;
        long j3 = i2 - i3;
        if (j3 >= j2) {
            this.f10r = (int) (((long) i3) + j2);
            return j2;
        }
        this.f10r = i2;
        return j3 + this.f8n.skip(j2 - j3);
    }

    public CN3(InputStream inputStream, byte[] bArr, Pj0.fuX fux) {
        this.f8n = (InputStream) Hh.C.Uo(inputStream);
        this.f11t = (byte[]) Hh.C.Uo(bArr);
        this.f7O = (Pj0.fuX) Hh.C.Uo(fux);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        Hh.C.xMQ(this.f10r <= this.J2);
        rl();
        if (!n()) {
            return -1;
        }
        int iMin = Math.min(this.J2 - this.f10r, i3);
        System.arraycopy(this.f11t, this.f10r, bArr, i2, iMin);
        this.f10r += iMin;
        return iMin;
    }
}
