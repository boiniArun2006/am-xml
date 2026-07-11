package com.facebook.common.memory;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface PooledByteBuffer extends Closeable {

    public static class ClosedException extends RuntimeException {
        public ClosedException() {
            super("Invalid bytebuf. Already closed");
        }
    }

    int O(int i2, byte[] bArr, int i3, int i5);

    ByteBuffer getByteBuffer();

    boolean isClosed();

    long qie();

    int size();

    byte xMQ(int i2);
}
