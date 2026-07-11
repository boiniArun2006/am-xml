package A72;

import com.facebook.common.memory.PooledByteBuffer;
import java.io.InputStream;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class Dsr extends InputStream {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f12O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final PooledByteBuffer f13n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f14t;

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (available() <= 0) {
            return -1;
        }
        PooledByteBuffer pooledByteBuffer = this.f13n;
        int i2 = this.f14t;
        this.f14t = i2 + 1;
        return pooledByteBuffer.xMQ(i2) & UByte.MAX_VALUE;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f13n.size() - this.f14t;
    }

    @Override // java.io.InputStream
    public void mark(int i2) {
        this.f12O = this.f14t;
    }

    @Override // java.io.InputStream
    public void reset() {
        this.f14t = this.f12O;
    }

    @Override // java.io.InputStream
    public long skip(long j2) {
        Hh.C.rl(Boolean.valueOf(j2 >= 0));
        int iMin = Math.min((int) j2, available());
        this.f14t += iMin;
        return iMin;
    }

    public Dsr(PooledByteBuffer pooledByteBuffer) {
        Hh.C.rl(Boolean.valueOf(!pooledByteBuffer.isClosed()));
        this.f13n = (PooledByteBuffer) Hh.C.Uo(pooledByteBuffer);
        this.f14t = 0;
        this.f12O = 0;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) {
        if (i2 >= 0 && i3 >= 0 && i2 + i3 <= bArr.length) {
            int iAvailable = available();
            if (iAvailable <= 0) {
                return -1;
            }
            if (i3 <= 0) {
                return 0;
            }
            int iMin = Math.min(iAvailable, i3);
            this.f13n.O(this.f14t, bArr, i2, iMin);
            this.f14t += iMin;
            return iMin;
        }
        throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i2 + "; regionLength=" + i3);
    }
}
