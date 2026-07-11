package nl4;

import R0.CN3;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class n extends OutputStream {
    long J2 = -1;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    CN3 f71225O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final OutputStream f71226n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Timer f71227t;

    @Override // java.io.OutputStream
    public void write(int i2) throws IOException {
        try {
            this.f71226n.write(i2);
            long j2 = this.J2 + 1;
            this.J2 = j2;
            this.f71225O.az(j2);
        } catch (IOException e2) {
            this.f71225O.r(this.f71227t.t());
            Ml.nr(this.f71225O);
            throw e2;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        long j2 = this.J2;
        if (j2 != -1) {
            this.f71225O.az(j2);
        }
        this.f71225O.Ik(this.f71227t.t());
        try {
            this.f71226n.close();
        } catch (IOException e2) {
            this.f71225O.r(this.f71227t.t());
            Ml.nr(this.f71225O);
            throw e2;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        try {
            this.f71226n.flush();
        } catch (IOException e2) {
            this.f71225O.r(this.f71227t.t());
            Ml.nr(this.f71225O);
            throw e2;
        }
    }

    public n(OutputStream outputStream, CN3 cn3, Timer timer) {
        this.f71226n = outputStream;
        this.f71225O = cn3;
        this.f71227t = timer;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        try {
            this.f71226n.write(bArr);
            long length = this.J2 + ((long) bArr.length);
            this.J2 = length;
            this.f71225O.az(length);
        } catch (IOException e2) {
            this.f71225O.r(this.f71227t.t());
            Ml.nr(this.f71225O);
            throw e2;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i2, int i3) throws IOException {
        try {
            this.f71226n.write(bArr, i2, i3);
            long j2 = this.J2 + ((long) i3);
            this.J2 = j2;
            this.f71225O.az(j2);
        } catch (IOException e2) {
            this.f71225O.r(this.f71227t.t());
            Ml.nr(this.f71225O);
            throw e2;
        }
    }
}
