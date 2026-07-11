package fJf;

import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class qz implements UGc, Closeable {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final long f66893O = System.identityHashCode(this);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ByteBuffer f66894n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f66895t;

    @Override // fJf.UGc
    public synchronized int O(int i2, byte[] bArr, int i3, int i5) {
        int iN;
        Hh.C.Uo(bArr);
        Hh.C.xMQ(!isClosed());
        Hh.C.Uo(this.f66894n);
        iN = Q.n(i2, i5, this.f66895t);
        Q.rl(i2, bArr.length, i3, iN, this.f66895t);
        this.f66894n.position(i2);
        this.f66894n.get(bArr, i3, iN);
        return iN;
    }

    @Override // fJf.UGc, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f66894n = null;
    }

    @Override // fJf.UGc
    public synchronized ByteBuffer getByteBuffer() {
        return this.f66894n;
    }

    @Override // fJf.UGc
    public synchronized boolean isClosed() {
        return this.f66894n == null;
    }

    @Override // fJf.UGc
    public synchronized int rl(int i2, byte[] bArr, int i3, int i5) {
        int iN;
        Hh.C.Uo(bArr);
        Hh.C.xMQ(!isClosed());
        Hh.C.Uo(this.f66894n);
        iN = Q.n(i2, i5, this.f66895t);
        Q.rl(i2, bArr.length, i3, iN, this.f66895t);
        this.f66894n.position(i2);
        this.f66894n.put(bArr, i3, iN);
        return iN;
    }

    @Override // fJf.UGc
    public synchronized byte xMQ(int i2) {
        Hh.C.xMQ(!isClosed());
        Hh.C.rl(Boolean.valueOf(i2 >= 0));
        Hh.C.rl(Boolean.valueOf(i2 < this.f66895t));
        Hh.C.Uo(this.f66894n);
        return this.f66894n.get(i2);
    }

    private void Z(int i2, UGc uGc, int i3, int i5) {
        if (!(uGc instanceof qz)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        Hh.C.xMQ(!isClosed());
        Hh.C.xMQ(!uGc.isClosed());
        Hh.C.Uo(this.f66894n);
        Q.rl(i2, uGc.getSize(), i3, i5, this.f66895t);
        this.f66894n.position(i2);
        ByteBuffer byteBuffer = (ByteBuffer) Hh.C.Uo(uGc.getByteBuffer());
        byteBuffer.position(i3);
        byte[] bArr = new byte[i5];
        this.f66894n.get(bArr, 0, i5);
        byteBuffer.put(bArr, 0, i5);
    }

    @Override // fJf.UGc
    public int getSize() {
        return this.f66895t;
    }

    @Override // fJf.UGc
    public long n() {
        return this.f66893O;
    }

    @Override // fJf.UGc
    public long qie() {
        throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
    }

    public qz(int i2) {
        this.f66894n = ByteBuffer.allocateDirect(i2);
        this.f66895t = i2;
    }

    @Override // fJf.UGc
    public void Uo(int i2, UGc uGc, int i3, int i5) {
        Hh.C.Uo(uGc);
        if (uGc.n() == n()) {
            Log.w("BufferMemoryChunk", "Copying from BufferMemoryChunk " + Long.toHexString(n()) + " to BufferMemoryChunk " + Long.toHexString(uGc.n()) + " which are the same ");
            Hh.C.rl(Boolean.FALSE);
        }
        if (uGc.n() < n()) {
            synchronized (uGc) {
                synchronized (this) {
                    Z(i2, uGc, i3, i5);
                }
            }
        } else {
            synchronized (this) {
                synchronized (uGc) {
                    Z(i2, uGc, i3, i5);
                }
            }
        }
    }
}
