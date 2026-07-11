package io.grpc.internal;

/* JADX INFO: renamed from: io.grpc.internal.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class AbstractC2174n implements RGN {
    @Override // io.grpc.internal.RGN
    public void Po6() {
    }

    @Override // io.grpc.internal.RGN, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // io.grpc.internal.RGN
    public boolean markSupported() {
        return false;
    }

    public final int readInt() {
        n(4);
        return (readUnsignedByte() << 24) | (readUnsignedByte() << 16) | (readUnsignedByte() << 8) | readUnsignedByte();
    }

    @Override // io.grpc.internal.RGN
    public void reset() {
        throw new UnsupportedOperationException();
    }

    protected final void n(int i2) {
        if (nr() >= i2) {
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}
