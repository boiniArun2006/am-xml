package fJf;

import com.facebook.common.memory.PooledByteBuffer;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class r implements PooledByteBuffer {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f66896n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Pj0.j f66897t;

    @Override // com.facebook.common.memory.PooledByteBuffer
    public synchronized int O(int i2, byte[] bArr, int i3, int i5) {
        n();
        Hh.C.rl(Boolean.valueOf(i2 + i5 <= this.f66896n));
        Hh.C.Uo(this.f66897t);
        return ((UGc) this.f66897t.eF()).O(i2, bArr, i3, i5);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        Pj0.j.M7(this.f66897t);
        this.f66897t = null;
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public synchronized ByteBuffer getByteBuffer() {
        Hh.C.Uo(this.f66897t);
        return ((UGc) this.f66897t.eF()).getByteBuffer();
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public synchronized boolean isClosed() {
        return !Pj0.j.FX(this.f66897t);
    }

    synchronized void n() {
        if (isClosed()) {
            throw new PooledByteBuffer.ClosedException();
        }
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public synchronized long qie() {
        n();
        Hh.C.Uo(this.f66897t);
        return ((UGc) this.f66897t.eF()).qie();
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public synchronized int size() {
        n();
        return this.f66896n;
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public synchronized byte xMQ(int i2) {
        n();
        Hh.C.rl(Boolean.valueOf(i2 >= 0));
        Hh.C.rl(Boolean.valueOf(i2 < this.f66896n));
        Hh.C.Uo(this.f66897t);
        return ((UGc) this.f66897t.eF()).xMQ(i2);
    }

    public r(Pj0.j jVar, int i2) {
        boolean z2;
        Hh.C.Uo(jVar);
        if (i2 >= 0 && i2 <= ((UGc) jVar.eF()).getSize()) {
            z2 = true;
        } else {
            z2 = false;
        }
        Hh.C.rl(Boolean.valueOf(z2));
        this.f66897t = jVar.clone();
        this.f66896n = i2;
    }
}
