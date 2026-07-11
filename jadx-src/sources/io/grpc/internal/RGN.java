package io.grpc.internal;

import java.io.Closeable;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public interface RGN extends Closeable {
    default void E() {
    }

    void ER(OutputStream outputStream, int i2);

    void I(ByteBuffer byteBuffer);

    void Po6();

    void Rl(byte[] bArr, int i2, int i3);

    RGN S(int i2);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    boolean markSupported();

    int nr();

    int readUnsignedByte();

    void reset();

    void skipBytes(int i2);
}
