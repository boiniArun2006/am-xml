package com.facebook.imagepipeline.memory;

import A72.aC;
import fJf.UGc;
import fJf.r;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class MemoryPooledByteBufferOutputStream extends aC {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f52424O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final I28 f52425n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Pj0.j f52426t;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0002j\u0002`\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/imagepipeline/memory/MemoryPooledByteBufferOutputStream$InvalidStreamException;", "Lkotlin/RuntimeException;", "Ljava/lang/RuntimeException;", "<init>", "()V", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InvalidStreamException extends RuntimeException {
        public InvalidStreamException() {
            super("OutputStream no longer valid");
        }
    }

    public /* synthetic */ MemoryPooledByteBufferOutputStream(I28 i28, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i28, (i3 & 2) != 0 ? i28.te() : i2);
    }

    @Override // java.io.OutputStream
    public void write(int i2) throws IOException {
        write(new byte[]{(byte) i2});
    }

    private final void rl() {
        if (!Pj0.j.FX(this.f52426t)) {
            throw new InvalidStreamException();
        }
    }

    @Override // A72.aC, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        Pj0.j.M7(this.f52426t);
        this.f52426t = null;
        this.f52424O = -1;
        super.close();
    }

    @Override // A72.aC
    public int size() {
        return this.f52424O;
    }

    public MemoryPooledByteBufferOutputStream(I28 pool, int i2) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        if (i2 > 0) {
            this.f52425n = pool;
            this.f52424O = 0;
            this.f52426t = Pj0.j.Mx(pool.get(i2), pool);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final void Uo(int i2) throws Throwable {
        rl();
        Pj0.j jVar = this.f52426t;
        if (jVar != null) {
            Intrinsics.checkNotNull(jVar);
            if (i2 <= ((UGc) jVar.eF()).getSize()) {
                return;
            }
            Object obj = this.f52425n.get(i2);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            UGc uGc = (UGc) obj;
            Pj0.j jVar2 = this.f52426t;
            if (jVar2 != null) {
                Intrinsics.checkNotNull(jVar2);
                ((UGc) jVar2.eF()).Uo(0, uGc, 0, this.f52424O);
                Pj0.j jVar3 = this.f52426t;
                Intrinsics.checkNotNull(jVar3);
                jVar3.close();
                this.f52426t = Pj0.j.Mx(uGc, this.f52425n);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // A72.aC
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public r n() {
        rl();
        Pj0.j jVar = this.f52426t;
        if (jVar != null) {
            return new r(jVar, this.f52424O);
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // java.io.OutputStream
    public void write(byte[] buffer, int i2, int i3) throws Throwable {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (i2 >= 0 && i3 >= 0 && i2 + i3 <= buffer.length) {
            rl();
            Uo(this.f52424O + i3);
            Pj0.j jVar = this.f52426t;
            if (jVar != null) {
                ((UGc) jVar.eF()).rl(this.f52424O, buffer, i2, i3);
                this.f52424O += i3;
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new ArrayIndexOutOfBoundsException("length=" + buffer.length + "; regionStart=" + i2 + "; regionLength=" + i3);
    }
}
