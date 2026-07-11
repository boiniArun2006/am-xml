package com.google.protobuf;

import com.caoccao.javet.values.reference.V8ValueTypedArray;
import com.google.protobuf.C;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class LEl extends C.Dsr {
    private final ByteBuffer buffer;

    class j extends InputStream {
        private final ByteBuffer buf;

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.buf.hasRemaining()) {
                return this.buf.get() & UByte.MAX_VALUE;
            }
            return -1;
        }

        j() {
            this.buf = LEl.this.buffer.slice();
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.buf.remaining();
        }

        @Override // java.io.InputStream
        public void mark(int i2) {
            qf.mark(this.buf);
        }

        @Override // java.io.InputStream
        public void reset() throws IOException {
            try {
                qf.reset(this.buf);
            } catch (InvalidMarkException e2) {
                throw new IOException(e2);
            }
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) throws IOException {
            if (!this.buf.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i3, this.buf.remaining());
            this.buf.get(bArr, i2, iMin);
            return iMin;
        }
    }

    @Override // com.google.protobuf.C
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c2 = (C) obj;
        if (size() != c2.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        return obj instanceof LEl ? this.buffer.equals(((LEl) obj).buffer) : obj instanceof Fl ? obj.equals(this) : this.buffer.equals(c2.asReadOnlyByteBuffer());
    }

    @Override // com.google.protobuf.C.Dsr
    boolean equalsRange(C c2, int i2, int i3) {
        return substring(0, i3).equals(c2.substring(i2, i3 + i2));
    }

    @Override // com.google.protobuf.C
    protected int partialHash(int i2, int i3, int i5) {
        for (int i7 = i3; i7 < i3 + i5; i7++) {
            i2 = (i2 * 31) + this.buffer.get(i7);
        }
        return i2;
    }

    @Override // com.google.protobuf.C
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(toByteArray());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    private ByteBuffer slice(int i2, int i3) {
        if (i2 < this.buffer.position() || i3 > this.buffer.limit() || i2 > i3) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        ByteBuffer byteBufferSlice = this.buffer.slice();
        qf.position(byteBufferSlice, i2 - this.buffer.position());
        qf.limit(byteBufferSlice, i3 - this.buffer.position());
        return byteBufferSlice;
    }

    private Object writeReplace() {
        return C.copyFrom(this.buffer.slice());
    }

    @Override // com.google.protobuf.C
    public ByteBuffer asReadOnlyByteBuffer() {
        return this.buffer.asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.C
    public byte byteAt(int i2) {
        try {
            return this.buffer.get(i2);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw e2;
        } catch (IndexOutOfBoundsException e3) {
            throw new ArrayIndexOutOfBoundsException(e3.getMessage());
        }
    }

    @Override // com.google.protobuf.C
    public void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.buffer.slice());
    }

    @Override // com.google.protobuf.C
    protected void copyToInternal(byte[] bArr, int i2, int i3, int i5) {
        ByteBuffer byteBufferSlice = this.buffer.slice();
        qf.position(byteBufferSlice, i2);
        byteBufferSlice.get(bArr, i3, i5);
    }

    @Override // com.google.protobuf.C
    public boolean isValidUtf8() {
        return L0y.isValidUtf8(this.buffer);
    }

    @Override // com.google.protobuf.C
    public AbstractC1923o newCodedInput() {
        return AbstractC1923o.newInstance(this.buffer, true);
    }

    @Override // com.google.protobuf.C
    public InputStream newInput() {
        return new j();
    }

    @Override // com.google.protobuf.C
    protected int partialIsValidUtf8(int i2, int i3, int i5) {
        return L0y.partialIsValidUtf8(i2, this.buffer, i3, i5 + i3);
    }

    @Override // com.google.protobuf.C
    public int size() {
        return this.buffer.remaining();
    }

    @Override // com.google.protobuf.C
    protected String toStringInternal(Charset charset) {
        byte[] byteArray;
        int length;
        int iArrayOffset;
        if (this.buffer.hasArray()) {
            byteArray = this.buffer.array();
            iArrayOffset = this.buffer.arrayOffset() + this.buffer.position();
            length = this.buffer.remaining();
        } else {
            byteArray = toByteArray();
            length = byteArray.length;
            iArrayOffset = 0;
        }
        return new String(byteArray, iArrayOffset, length, charset);
    }

    @Override // com.google.protobuf.C
    void writeTo(aC aCVar) throws IOException {
        aCVar.writeLazy(this.buffer.slice());
    }

    @Override // com.google.protobuf.C
    void writeToInternal(OutputStream outputStream, int i2, int i3) throws IOException {
        if (!this.buffer.hasArray()) {
            Dsr.write(slice(i2, i3 + i2), outputStream);
        } else {
            outputStream.write(this.buffer.array(), this.buffer.arrayOffset() + this.buffer.position() + i2, i3);
        }
    }

    LEl(ByteBuffer byteBuffer) {
        nKK.checkNotNull(byteBuffer, V8ValueTypedArray.PROPERTY_BUFFER);
        this.buffer = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    @Override // com.google.protobuf.C
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        return Collections.singletonList(asReadOnlyByteBuffer());
    }

    @Override // com.google.protobuf.C
    public byte internalByteAt(int i2) {
        return byteAt(i2);
    }

    @Override // com.google.protobuf.C
    public C substring(int i2, int i3) {
        try {
            return new LEl(slice(i2, i3));
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw e2;
        } catch (IndexOutOfBoundsException e3) {
            throw new ArrayIndexOutOfBoundsException(e3.getMessage());
        }
    }
}
