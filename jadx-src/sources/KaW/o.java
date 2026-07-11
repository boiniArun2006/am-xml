package KaW;

import io.grpc.internal.AbstractC2174n;
import io.grpc.internal.RGN;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import kotlin.UByte;
import okio.Buffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
class o extends AbstractC2174n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Buffer f5600n;

    private void rl() {
    }

    @Override // io.grpc.internal.RGN
    public void ER(OutputStream outputStream, int i2) throws IOException {
        this.f5600n.writeTo(outputStream, i2);
    }

    @Override // io.grpc.internal.RGN
    public void I(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // io.grpc.internal.RGN
    public void Rl(byte[] bArr, int i2, int i3) {
        while (i3 > 0) {
            int i5 = this.f5600n.read(bArr, i2, i3);
            if (i5 == -1) {
                throw new IndexOutOfBoundsException("EOF trying to read " + i3 + " bytes");
            }
            i3 -= i5;
            i2 += i5;
        }
    }

    @Override // io.grpc.internal.RGN
    public RGN S(int i2) {
        Buffer buffer = new Buffer();
        buffer.write(this.f5600n, i2);
        return new o(buffer);
    }

    @Override // io.grpc.internal.AbstractC2174n, io.grpc.internal.RGN, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        this.f5600n.clear();
    }

    @Override // io.grpc.internal.RGN
    public int nr() {
        return (int) this.f5600n.size();
    }

    @Override // io.grpc.internal.RGN
    public void skipBytes(int i2) {
        try {
            this.f5600n.skip(i2);
        } catch (EOFException e2) {
            throw new IndexOutOfBoundsException(e2.getMessage());
        }
    }

    o(Buffer buffer) {
        this.f5600n = buffer;
    }

    @Override // io.grpc.internal.RGN
    public int readUnsignedByte() {
        try {
            rl();
            return this.f5600n.readByte() & UByte.MAX_VALUE;
        } catch (EOFException e2) {
            throw new IndexOutOfBoundsException(e2.getMessage());
        }
    }
}
