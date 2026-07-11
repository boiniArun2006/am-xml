package fJf;

import com.facebook.imagepipeline.memory.MemoryPooledByteBufferOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class SPz implements A72.fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.facebook.imagepipeline.memory.I28 f66870n;
    private final A72.C rl;

    public SPz(com.facebook.imagepipeline.memory.I28 pool, A72.C pooledByteStreams) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        Intrinsics.checkNotNullParameter(pooledByteStreams, "pooledByteStreams");
        this.f66870n = pool;
        this.rl = pooledByteStreams;
    }

    public final r J2(InputStream inputStream, MemoryPooledByteBufferOutputStream outputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        this.rl.n(inputStream, outputStream);
        return outputStream.n();
    }

    @Override // A72.fuX
    /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
    public r rl(InputStream inputStream, int i2) throws Throwable {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(this.f66870n, i2);
        try {
            return J2(inputStream, memoryPooledByteBufferOutputStream);
        } finally {
            memoryPooledByteBufferOutputStream.close();
        }
    }

    @Override // A72.fuX
    /* JADX INFO: renamed from: Uo, reason: merged with bridge method [inline-methods] */
    public r n(InputStream inputStream) throws Throwable {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(this.f66870n, 0, 2, null);
        try {
            return J2(inputStream, memoryPooledByteBufferOutputStream);
        } finally {
            memoryPooledByteBufferOutputStream.close();
        }
    }

    @Override // A72.fuX
    /* JADX INFO: renamed from: gh, reason: merged with bridge method [inline-methods] */
    public MemoryPooledByteBufferOutputStream O(int i2) {
        return new MemoryPooledByteBufferOutputStream(this.f66870n, i2);
    }

    @Override // A72.fuX
    /* JADX INFO: renamed from: mUb, reason: merged with bridge method [inline-methods] */
    public MemoryPooledByteBufferOutputStream t() {
        return new MemoryPooledByteBufferOutputStream(this.f66870n, 0, 2, null);
    }

    @Override // A72.fuX
    /* JADX INFO: renamed from: xMQ, reason: merged with bridge method [inline-methods] */
    public r nr(byte[] bytes) throws Throwable {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(this.f66870n, bytes.length);
        try {
            try {
                memoryPooledByteBufferOutputStream.write(bytes, 0, bytes.length);
                return memoryPooledByteBufferOutputStream.n();
            } catch (IOException e2) {
                throw Hh.Xo.n(e2);
            }
        } finally {
            memoryPooledByteBufferOutputStream.close();
        }
    }
}
