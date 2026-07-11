package com.facebook.imagepipeline.memory;

import Hh.C;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import fJf.Q;
import fJf.UGc;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Hh.Ml
public class NativeMemoryChunk implements UGc, Closeable {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f52427O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f52428n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f52429t;

    public NativeMemoryChunk(int i2) {
        C.rl(Boolean.valueOf(i2 > 0));
        this.f52429t = i2;
        this.f52428n = nativeAllocate(i2);
        this.f52427O = false;
    }

    @Hh.Ml
    private static native long nativeAllocate(int i2);

    @Hh.Ml
    private static native void nativeCopyFromByteArray(long j2, byte[] bArr, int i2, int i3);

    @Hh.Ml
    private static native void nativeCopyToByteArray(long j2, byte[] bArr, int i2, int i3);

    @Hh.Ml
    private static native void nativeFree(long j2);

    @Hh.Ml
    private static native void nativeMemcpy(long j2, long j3, int i2);

    @Hh.Ml
    private static native byte nativeReadByte(long j2);

    @Override // fJf.UGc
    public synchronized int O(int i2, byte[] bArr, int i3, int i5) {
        int iN;
        C.Uo(bArr);
        C.xMQ(!isClosed());
        iN = Q.n(i2, i5, this.f52429t);
        Q.rl(i2, bArr.length, i3, iN, this.f52429t);
        nativeCopyToByteArray(this.f52428n + ((long) i2), bArr, i3, iN);
        return iN;
    }

    @Override // fJf.UGc, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.f52427O) {
            this.f52427O = true;
            nativeFree(this.f52428n);
        }
    }

    @Override // fJf.UGc
    public ByteBuffer getByteBuffer() {
        return null;
    }

    @Override // fJf.UGc
    public synchronized boolean isClosed() {
        return this.f52427O;
    }

    @Override // fJf.UGc
    public synchronized int rl(int i2, byte[] bArr, int i3, int i5) {
        int iN;
        C.Uo(bArr);
        C.xMQ(!isClosed());
        iN = Q.n(i2, i5, this.f52429t);
        Q.rl(i2, bArr.length, i3, iN, this.f52429t);
        nativeCopyFromByteArray(this.f52428n + ((long) i2), bArr, i3, iN);
        return iN;
    }

    @Override // fJf.UGc
    public synchronized byte xMQ(int i2) {
        C.xMQ(!isClosed());
        C.rl(Boolean.valueOf(i2 >= 0));
        C.rl(Boolean.valueOf(i2 < this.f52429t));
        return nativeReadByte(this.f52428n + ((long) i2));
    }

    static {
        y5Y.j.nr("imagepipeline");
    }

    private void Z(int i2, UGc uGc, int i3, int i5) {
        if (!(uGc instanceof NativeMemoryChunk)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        C.xMQ(!isClosed());
        C.xMQ(!uGc.isClosed());
        Q.rl(i2, uGc.getSize(), i3, i5, this.f52429t);
        nativeMemcpy(uGc.qie() + ((long) i3), this.f52428n + ((long) i2), i5);
    }

    @Override // fJf.UGc
    public int getSize() {
        return this.f52429t;
    }

    @Override // fJf.UGc
    public long n() {
        return this.f52428n;
    }

    @Override // fJf.UGc
    public long qie() {
        return this.f52428n;
    }

    @Override // fJf.UGc
    public void Uo(int i2, UGc uGc, int i3, int i5) {
        C.Uo(uGc);
        if (uGc.n() == n()) {
            Log.w("NativeMemoryChunk", "Copying from NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(this)) + " to NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(uGc)) + " which share the same address " + Long.toHexString(this.f52428n));
            C.rl(Boolean.FALSE);
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

    protected void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        Log.w("NativeMemoryChunk", "finalize: Chunk " + Integer.toHexString(System.identityHashCode(this)) + " still active. ");
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @VisibleForTesting
    public NativeMemoryChunk() {
        this.f52429t = 0;
        this.f52428n = 0L;
        this.f52427O = true;
    }
}
