package androidx.emoji2.text.flatbuffer;

import java.io.InputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class FlatBufferBuilder {

    static class ByteBufferBackedInputStream extends InputStream {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        ByteBuffer f38369n;

        @Override // java.io.InputStream
        public int read() {
            try {
                return this.f38369n.get() & UByte.MAX_VALUE;
            } catch (BufferUnderflowException unused) {
                return -1;
            }
        }
    }

    public static abstract class ByteBufferFactory {
    }

    public static final class HeapByteBufferFactory extends ByteBufferFactory {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final HeapByteBufferFactory f38370n = new HeapByteBufferFactory();
    }
}
