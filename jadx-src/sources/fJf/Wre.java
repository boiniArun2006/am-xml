package fJf;

import android.os.SharedMemory;
import android.system.ErrnoException;
import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class Wre implements UGc, Closeable {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final long f66871O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private SharedMemory f66872n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ByteBuffer f66873t;

    @Override // fJf.UGc
    public synchronized int O(int i2, byte[] bArr, int i3, int i5) {
        int iN;
        Hh.C.Uo(bArr);
        Hh.C.Uo(this.f66873t);
        iN = Q.n(i2, i5, getSize());
        Q.rl(i2, bArr.length, i3, iN, getSize());
        this.f66873t.position(i2);
        this.f66873t.get(bArr, i3, iN);
        return iN;
    }

    @Override // fJf.UGc, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (!isClosed()) {
                SharedMemory sharedMemory = this.f66872n;
                if (sharedMemory != null) {
                    sharedMemory.close();
                }
                ByteBuffer byteBuffer = this.f66873t;
                if (byteBuffer != null) {
                    SharedMemory.unmap(byteBuffer);
                }
                this.f66873t = null;
                this.f66872n = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000e  */
    @Override // fJf.UGc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized boolean isClosed() {
        boolean z2;
        if (this.f66873t != null) {
            z2 = this.f66872n == null;
        }
        return z2;
    }

    @Override // fJf.UGc
    public synchronized int rl(int i2, byte[] bArr, int i3, int i5) {
        int iN;
        Hh.C.Uo(bArr);
        Hh.C.Uo(this.f66873t);
        iN = Q.n(i2, i5, getSize());
        Q.rl(i2, bArr.length, i3, iN, getSize());
        this.f66873t.position(i2);
        this.f66873t.put(bArr, i3, iN);
        return iN;
    }

    @Override // fJf.UGc
    public synchronized byte xMQ(int i2) {
        Hh.C.xMQ(!isClosed());
        Hh.C.rl(Boolean.valueOf(i2 >= 0));
        Hh.C.rl(Boolean.valueOf(i2 < getSize()));
        Hh.C.Uo(this.f66873t);
        return this.f66873t.get(i2);
    }

    private void Z(int i2, UGc uGc, int i3, int i5) {
        if (!(uGc instanceof Wre)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        Hh.C.xMQ(!isClosed());
        Hh.C.xMQ(!uGc.isClosed());
        Hh.C.Uo(this.f66873t);
        Hh.C.Uo(uGc.getByteBuffer());
        Q.rl(i2, uGc.getSize(), i3, i5, getSize());
        this.f66873t.position(i2);
        uGc.getByteBuffer().position(i3);
        byte[] bArr = new byte[i5];
        this.f66873t.get(bArr, 0, i5);
        uGc.getByteBuffer().put(bArr, 0, i5);
    }

    @Override // fJf.UGc
    public ByteBuffer getByteBuffer() {
        return this.f66873t;
    }

    @Override // fJf.UGc
    public int getSize() {
        Hh.C.Uo(this.f66872n);
        return this.f66872n.getSize();
    }

    @Override // fJf.UGc
    public long n() {
        return this.f66871O;
    }

    @Override // fJf.UGc
    public long qie() {
        throw new UnsupportedOperationException("Cannot get the pointer of an  AshmemMemoryChunk");
    }

    public Wre(int i2) {
        boolean z2;
        if (i2 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Hh.C.rl(Boolean.valueOf(z2));
        try {
            SharedMemory sharedMemoryCreate = SharedMemory.create("AshmemMemoryChunk", i2);
            this.f66872n = sharedMemoryCreate;
            this.f66873t = sharedMemoryCreate.mapReadWrite();
            this.f66871O = System.identityHashCode(this);
        } catch (ErrnoException e2) {
            throw new RuntimeException("Fail to create AshmemMemory", e2);
        }
    }

    @Override // fJf.UGc
    public void Uo(int i2, UGc uGc, int i3, int i5) {
        Hh.C.Uo(uGc);
        if (uGc.n() == n()) {
            Log.w("AshmemMemoryChunk", "Copying from AshmemMemoryChunk " + Long.toHexString(n()) + " to AshmemMemoryChunk " + Long.toHexString(uGc.n()) + " which are the same ");
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
