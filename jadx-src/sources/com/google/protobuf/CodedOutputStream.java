package com.google.protobuf;

import com.caoccao.javet.values.reference.V8ValueTypedArray;
import com.google.protobuf.L0y;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class CodedOutputStream extends aC {
    public static final int DEFAULT_BUFFER_SIZE = 4096;

    @Deprecated
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    private boolean serializationDeterministic;
    Pl wrapper;
    private static final Logger logger = Logger.getLogger(CodedOutputStream.class.getName());
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = g9.hasUnsafeArrayOperations();

    private static final class CN3 extends CodedOutputStream {
        private final ByteBuffer buffer;
        private final int initialPosition;
        private final ByteBuffer originalBuffer;

        CN3(ByteBuffer byteBuffer) {
            super();
            this.originalBuffer = byteBuffer;
            this.buffer = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.initialPosition = byteBuffer.position();
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.aC
        public void write(byte b2) throws IOException {
            try {
                this.buffer.put(b2);
            } catch (BufferOverflowException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBool(int i2, boolean z2) throws IOException {
            writeTag(i2, 0);
            write(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i2, byte[] bArr) throws IOException {
            writeByteArray(i2, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteBuffer(int i2, ByteBuffer byteBuffer) throws IOException {
            writeTag(i2, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytes(int i2, C c2) throws IOException {
            writeTag(i2, 2);
            writeBytesNoTag(c2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32(int i2, int i3) throws IOException {
            writeTag(i2, 5);
            writeFixed32NoTag(i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64(int i2, long j2) throws IOException {
            writeTag(i2, 1);
            writeFixed64NoTag(j2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32(int i2, int i3) throws IOException {
            writeTag(i2, 0);
            writeInt32NoTag(i3);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.aC
        public void writeLazy(byte[] bArr, int i2, int i3) throws IOException {
            write(bArr, i2, i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessage(int i2, yg ygVar) throws IOException {
            writeTag(i2, 2);
            writeMessageNoTag(ygVar);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageNoTag(yg ygVar) throws IOException {
            writeUInt32NoTag(ygVar.getSerializedSize());
            ygVar.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i2, yg ygVar) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i2);
            writeMessage(3, ygVar);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i2, C c2) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i2);
            writeBytes(3, c2);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeString(int i2, String str) throws IOException {
            writeTag(i2, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32(int i2, int i3) throws IOException {
            writeTag(i2, 0);
            writeUInt32NoTag(i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64(int i2, long j2) throws IOException {
            writeTag(i2, 0);
            writeUInt64NoTag(j2);
        }

        private void encode(String str) throws IOException {
            try {
                L0y.encodeUtf8(str, this.buffer);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void flush() {
            qf.position(this.originalBuffer, this.buffer.position());
        }

        @Override // com.google.protobuf.CodedOutputStream
        public int getTotalBytesWritten() {
            return this.buffer.position() - this.initialPosition;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public int spaceLeft() {
            return this.buffer.remaining();
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i2, byte[] bArr, int i3, int i5) throws IOException {
            writeTag(i2, 2);
            writeByteArrayNoTag(bArr, i3, i5);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i2) throws IOException {
            try {
                this.buffer.putInt(i2);
            } catch (BufferOverflowException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j2) throws IOException {
            try {
                this.buffer.putLong(j2);
            } catch (BufferOverflowException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i2) throws IOException {
            if (i2 >= 0) {
                writeUInt32NoTag(i2);
            } else {
                writeUInt64NoTag(i2);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.aC
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws IOException {
            int iPosition = this.buffer.position();
            try {
                int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                    writeUInt32NoTag(L0y.encodedLength(str));
                    encode(str);
                    return;
                }
                int iPosition2 = this.buffer.position() + iComputeUInt32SizeNoTag2;
                qf.position(this.buffer, iPosition2);
                encode(str);
                int iPosition3 = this.buffer.position();
                qf.position(this.buffer, iPosition);
                writeUInt32NoTag(iPosition3 - iPosition2);
                qf.position(this.buffer, iPosition3);
            } catch (L0y.Ml e2) {
                qf.position(this.buffer, iPosition);
                inefficientWriteStringNoTag(str, e2);
            } catch (IllegalArgumentException e3) {
                throw new OutOfSpaceException(e3);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i2) throws IOException {
            while ((i2 & (-128)) != 0) {
                try {
                    this.buffer.put((byte) ((i2 & 127) | 128));
                    i2 >>>= 7;
                } catch (BufferOverflowException e2) {
                    throw new OutOfSpaceException(e2);
                }
            }
            this.buffer.put((byte) i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j2) throws IOException {
            while (((-128) & j2) != 0) {
                try {
                    this.buffer.put((byte) ((((int) j2) & 127) | 128));
                    j2 >>>= 7;
                } catch (BufferOverflowException e2) {
                    throw new OutOfSpaceException(e2);
                }
            }
            this.buffer.put((byte) j2);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.aC
        public void write(byte[] bArr, int i2, int i3) throws IOException {
            try {
                this.buffer.put(bArr, i2, i3);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            } catch (BufferOverflowException e3) {
                throw new OutOfSpaceException(e3);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i2, int i3) throws IOException {
            writeUInt32NoTag(i3);
            write(bArr, i2, i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytesNoTag(C c2) throws IOException {
            writeUInt32NoTag(c2.size());
            c2.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessage(int i2, yg ygVar, R6 r6) throws IOException {
            writeTag(i2, 2);
            writeMessageNoTag(ygVar, r6);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessageNoTag(yg ygVar, R6 r6) throws IOException {
            writeUInt32NoTag(((com.google.protobuf.j) ygVar).getSerializedSize(r6));
            r6.writeTo(ygVar, this.wrapper);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            qf.clear(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeTag(int i2, int i3) throws IOException {
            writeUInt32NoTag(CM.makeTag(i2, i3));
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.aC
        public void write(ByteBuffer byteBuffer) throws IOException {
            try {
                this.buffer.put(byteBuffer);
            } catch (BufferOverflowException e2) {
                throw new OutOfSpaceException(e2);
            }
        }
    }

    private static final class I28 extends w6 {
        private final ByteBuffer byteBuffer;
        private int initialPosition;

        @Override // com.google.protobuf.CodedOutputStream.w6, com.google.protobuf.CodedOutputStream
        public void flush() {
            qf.position(this.byteBuffer, this.initialPosition + getTotalBytesWritten());
        }

        I28(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.byteBuffer = byteBuffer;
            this.initialPosition = byteBuffer.position();
        }
    }

    private static final class Ml extends n {
        private final aC out;

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.aC
        public void write(byte b2) throws IOException {
            if (this.position == this.limit) {
                doFlush();
            }
            buffer(b2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i2, byte[] bArr) throws IOException {
            writeByteArray(i2, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteBuffer(int i2, ByteBuffer byteBuffer) throws IOException {
            writeTag(i2, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytes(int i2, C c2) throws IOException {
            writeTag(i2, 2);
            writeBytesNoTag(c2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i2) throws IOException {
            flushIfNotAvailable(4);
            bufferFixed32NoTag(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.aC
        public void writeLazy(byte[] bArr, int i2, int i3) throws IOException {
            flush();
            this.out.writeLazy(bArr, i2, i3);
            this.totalBytesWritten += i3;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessage(int i2, yg ygVar) throws IOException {
            writeTag(i2, 2);
            writeMessageNoTag(ygVar);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageNoTag(yg ygVar) throws IOException {
            writeUInt32NoTag(ygVar.getSerializedSize());
            ygVar.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i2, yg ygVar) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i2);
            writeMessage(3, ygVar);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i2, C c2) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i2);
            writeBytes(3, c2);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeString(int i2, String str) throws IOException {
            writeTag(i2, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i2) throws IOException {
            flushIfNotAvailable(5);
            bufferUInt32NoTag(i2);
        }

        private void doFlush() throws IOException {
            this.out.write(this.buffer, 0, this.position);
            this.position = 0;
        }

        private void flushIfNotAvailable(int i2) throws IOException {
            if (this.limit - this.position < i2) {
                doFlush();
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void flush() throws IOException {
            if (this.position > 0) {
                doFlush();
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBool(int i2, boolean z2) throws IOException {
            flushIfNotAvailable(11);
            bufferTag(i2, 0);
            buffer(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i2, byte[] bArr, int i3, int i5) throws IOException {
            writeTag(i2, 2);
            writeByteArrayNoTag(bArr, i3, i5);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32(int i2, int i3) throws IOException {
            flushIfNotAvailable(14);
            bufferTag(i2, 5);
            bufferFixed32NoTag(i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64(int i2, long j2) throws IOException {
            flushIfNotAvailable(18);
            bufferTag(i2, 1);
            bufferFixed64NoTag(j2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j2) throws IOException {
            flushIfNotAvailable(8);
            bufferFixed64NoTag(j2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32(int i2, int i3) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i2, 0);
            bufferInt32NoTag(i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i2) throws IOException {
            if (i2 >= 0) {
                writeUInt32NoTag(i2);
            } else {
                writeUInt64NoTag(i2);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32(int i2, int i3) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i2, 0);
            bufferUInt32NoTag(i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64(int i2, long j2) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i2, 0);
            bufferUInt64NoTag(j2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j2) throws IOException {
            flushIfNotAvailable(10);
            bufferUInt64NoTag(j2);
        }

        Ml(aC aCVar, int i2) {
            super(i2);
            if (aCVar != null) {
                this.out = aCVar;
                return;
            }
            throw new NullPointerException("out");
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i2, int i3) throws IOException {
            writeUInt32NoTag(i3);
            write(bArr, i2, i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytesNoTag(C c2) throws IOException {
            writeUInt32NoTag(c2.size());
            c2.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessage(int i2, yg ygVar, R6 r6) throws IOException {
            writeTag(i2, 2);
            writeMessageNoTag(ygVar, r6);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessageNoTag(yg ygVar, R6 r6) throws IOException {
            writeUInt32NoTag(((com.google.protobuf.j) ygVar).getSerializedSize(r6));
            r6.writeTo(ygVar, this.wrapper);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            qf.clear(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws IOException {
            int length = str.length() * 3;
            int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(length);
            int i2 = iComputeUInt32SizeNoTag + length;
            int i3 = this.limit;
            if (i2 > i3) {
                byte[] bArr = new byte[length];
                int iEncode = L0y.encode(str, bArr, 0, length);
                writeUInt32NoTag(iEncode);
                writeLazy(bArr, 0, iEncode);
                return;
            }
            if (i2 > i3 - this.position) {
                doFlush();
            }
            int i5 = this.position;
            try {
                int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                    int i7 = i5 + iComputeUInt32SizeNoTag2;
                    this.position = i7;
                    int iEncode2 = L0y.encode(str, this.buffer, i7, this.limit - i7);
                    this.position = i5;
                    int i8 = (iEncode2 - i5) - iComputeUInt32SizeNoTag2;
                    bufferUInt32NoTag(i8);
                    this.position = iEncode2;
                    this.totalBytesWritten += i8;
                    return;
                }
                int iEncodedLength = L0y.encodedLength(str);
                bufferUInt32NoTag(iEncodedLength);
                this.position = L0y.encode(str, this.buffer, this.position, iEncodedLength);
                this.totalBytesWritten += iEncodedLength;
            } catch (L0y.Ml e2) {
                this.totalBytesWritten -= this.position - i5;
                this.position = i5;
                inefficientWriteStringNoTag(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new OutOfSpaceException(e3);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeTag(int i2, int i3) throws IOException {
            writeUInt32NoTag(CM.makeTag(i2, i3));
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.aC
        public void write(byte[] bArr, int i2, int i3) throws IOException {
            flush();
            this.out.write(bArr, i2, i3);
            this.totalBytesWritten += i3;
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.aC
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            flush();
            int iRemaining = byteBuffer.remaining();
            this.out.writeLazy(byteBuffer);
            this.totalBytesWritten += iRemaining;
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.aC
        public void write(ByteBuffer byteBuffer) throws IOException {
            flush();
            int iRemaining = byteBuffer.remaining();
            this.out.write(byteBuffer);
            this.totalBytesWritten += iRemaining;
        }
    }

    public static class OutOfSpaceException extends IOException {
        private static final String MESSAGE = "CodedOutputStream was writing to a flat byte array and ran out of space.";
        private static final long serialVersionUID = -6947486886997889499L;

        OutOfSpaceException() {
            super(MESSAGE);
        }

        OutOfSpaceException(String str) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str);
        }

        OutOfSpaceException(Throwable th) {
            super(MESSAGE, th);
        }

        OutOfSpaceException(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    private static final class Wre extends n {
        private final OutputStream out;

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.aC
        public void write(byte b2) throws IOException {
            if (this.position == this.limit) {
                doFlush();
            }
            buffer(b2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i2, byte[] bArr) throws IOException {
            writeByteArray(i2, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteBuffer(int i2, ByteBuffer byteBuffer) throws IOException {
            writeTag(i2, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytes(int i2, C c2) throws IOException {
            writeTag(i2, 2);
            writeBytesNoTag(c2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i2) throws IOException {
            flushIfNotAvailable(4);
            bufferFixed32NoTag(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.aC
        public void writeLazy(byte[] bArr, int i2, int i3) throws IOException {
            write(bArr, i2, i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessage(int i2, yg ygVar) throws IOException {
            writeTag(i2, 2);
            writeMessageNoTag(ygVar);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageNoTag(yg ygVar) throws IOException {
            writeUInt32NoTag(ygVar.getSerializedSize());
            ygVar.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i2, yg ygVar) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i2);
            writeMessage(3, ygVar);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i2, C c2) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i2);
            writeBytes(3, c2);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeString(int i2, String str) throws IOException {
            writeTag(i2, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i2) throws IOException {
            flushIfNotAvailable(5);
            bufferUInt32NoTag(i2);
        }

        private void doFlush() throws IOException {
            this.out.write(this.buffer, 0, this.position);
            this.position = 0;
        }

        private void flushIfNotAvailable(int i2) throws IOException {
            if (this.limit - this.position < i2) {
                doFlush();
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void flush() throws IOException {
            if (this.position > 0) {
                doFlush();
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBool(int i2, boolean z2) throws IOException {
            flushIfNotAvailable(11);
            bufferTag(i2, 0);
            buffer(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i2, byte[] bArr, int i3, int i5) throws IOException {
            writeTag(i2, 2);
            writeByteArrayNoTag(bArr, i3, i5);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32(int i2, int i3) throws IOException {
            flushIfNotAvailable(14);
            bufferTag(i2, 5);
            bufferFixed32NoTag(i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64(int i2, long j2) throws IOException {
            flushIfNotAvailable(18);
            bufferTag(i2, 1);
            bufferFixed64NoTag(j2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j2) throws IOException {
            flushIfNotAvailable(8);
            bufferFixed64NoTag(j2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32(int i2, int i3) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i2, 0);
            bufferInt32NoTag(i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i2) throws IOException {
            if (i2 >= 0) {
                writeUInt32NoTag(i2);
            } else {
                writeUInt64NoTag(i2);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.aC
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32(int i2, int i3) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i2, 0);
            bufferUInt32NoTag(i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64(int i2, long j2) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i2, 0);
            bufferUInt64NoTag(j2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j2) throws IOException {
            flushIfNotAvailable(10);
            bufferUInt64NoTag(j2);
        }

        Wre(OutputStream outputStream, int i2) {
            super(i2);
            if (outputStream != null) {
                this.out = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i2, int i3) throws IOException {
            writeUInt32NoTag(i3);
            write(bArr, i2, i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytesNoTag(C c2) throws IOException {
            writeUInt32NoTag(c2.size());
            c2.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessage(int i2, yg ygVar, R6 r6) throws IOException {
            writeTag(i2, 2);
            writeMessageNoTag(ygVar, r6);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessageNoTag(yg ygVar, R6 r6) throws IOException {
            writeUInt32NoTag(((com.google.protobuf.j) ygVar).getSerializedSize(r6));
            r6.writeTo(ygVar, this.wrapper);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            qf.clear(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws IOException {
            int iEncodedLength;
            try {
                int length = str.length() * 3;
                int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(length);
                int i2 = iComputeUInt32SizeNoTag + length;
                int i3 = this.limit;
                if (i2 > i3) {
                    byte[] bArr = new byte[length];
                    int iEncode = L0y.encode(str, bArr, 0, length);
                    writeUInt32NoTag(iEncode);
                    writeLazy(bArr, 0, iEncode);
                    return;
                }
                if (i2 > i3 - this.position) {
                    doFlush();
                }
                int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                int i5 = this.position;
                try {
                    if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                        int i7 = i5 + iComputeUInt32SizeNoTag2;
                        this.position = i7;
                        int iEncode2 = L0y.encode(str, this.buffer, i7, this.limit - i7);
                        this.position = i5;
                        iEncodedLength = (iEncode2 - i5) - iComputeUInt32SizeNoTag2;
                        bufferUInt32NoTag(iEncodedLength);
                        this.position = iEncode2;
                    } else {
                        iEncodedLength = L0y.encodedLength(str);
                        bufferUInt32NoTag(iEncodedLength);
                        this.position = L0y.encode(str, this.buffer, this.position, iEncodedLength);
                    }
                    this.totalBytesWritten += iEncodedLength;
                } catch (L0y.Ml e2) {
                    this.totalBytesWritten -= this.position - i5;
                    this.position = i5;
                    throw e2;
                } catch (ArrayIndexOutOfBoundsException e3) {
                    throw new OutOfSpaceException(e3);
                }
            } catch (L0y.Ml e4) {
                inefficientWriteStringNoTag(str, e4);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeTag(int i2, int i3) throws IOException {
            writeUInt32NoTag(CM.makeTag(i2, i3));
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.aC
        public void write(byte[] bArr, int i2, int i3) throws IOException {
            int i5 = this.limit;
            int i7 = this.position;
            if (i5 - i7 >= i3) {
                System.arraycopy(bArr, i2, this.buffer, i7, i3);
                this.position += i3;
                this.totalBytesWritten += i3;
                return;
            }
            int i8 = i5 - i7;
            System.arraycopy(bArr, i2, this.buffer, i7, i8);
            int i9 = i2 + i8;
            int i10 = i3 - i8;
            this.position = this.limit;
            this.totalBytesWritten += i8;
            doFlush();
            if (i10 <= this.limit) {
                System.arraycopy(bArr, i9, this.buffer, 0, i10);
                this.position = i10;
            } else {
                this.out.write(bArr, i9, i10);
            }
            this.totalBytesWritten += i10;
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.aC
        public void write(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            int i2 = this.limit;
            int i3 = this.position;
            if (i2 - i3 >= iRemaining) {
                byteBuffer.get(this.buffer, i3, iRemaining);
                this.position += iRemaining;
                this.totalBytesWritten += iRemaining;
                return;
            }
            int i5 = i2 - i3;
            byteBuffer.get(this.buffer, i3, i5);
            int i7 = iRemaining - i5;
            this.position = this.limit;
            this.totalBytesWritten += i5;
            doFlush();
            while (true) {
                int i8 = this.limit;
                if (i7 > i8) {
                    byteBuffer.get(this.buffer, 0, i8);
                    this.out.write(this.buffer, 0, this.limit);
                    int i9 = this.limit;
                    i7 -= i9;
                    this.totalBytesWritten += i9;
                } else {
                    byteBuffer.get(this.buffer, 0, i7);
                    this.position = i7;
                    this.totalBytesWritten += i7;
                    return;
                }
            }
        }
    }

    private static final class fuX extends CodedOutputStream {
        private final long address;
        private final ByteBuffer buffer;
        private final long initialPosition;
        private final long limit;
        private final long oneVarintLimit;
        private final ByteBuffer originalBuffer;
        private long position;

        fuX(ByteBuffer byteBuffer) {
            super();
            this.originalBuffer = byteBuffer;
            this.buffer = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long jAddressOffset = g9.addressOffset(byteBuffer);
            this.address = jAddressOffset;
            long jPosition = ((long) byteBuffer.position()) + jAddressOffset;
            this.initialPosition = jPosition;
            long jLimit = jAddressOffset + ((long) byteBuffer.limit());
            this.limit = jLimit;
            this.oneVarintLimit = jLimit - 10;
            this.position = jPosition;
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.aC
        public void write(byte b2) throws IOException {
            long j2 = this.position;
            if (j2 >= this.limit) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), 1));
            }
            this.position = 1 + j2;
            g9.putByte(j2, b2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBool(int i2, boolean z2) throws IOException {
            writeTag(i2, 0);
            write(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i2, byte[] bArr) throws IOException {
            writeByteArray(i2, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteBuffer(int i2, ByteBuffer byteBuffer) throws IOException {
            writeTag(i2, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytes(int i2, C c2) throws IOException {
            writeTag(i2, 2);
            writeBytesNoTag(c2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32(int i2, int i3) throws IOException {
            writeTag(i2, 5);
            writeFixed32NoTag(i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64(int i2, long j2) throws IOException {
            writeTag(i2, 1);
            writeFixed64NoTag(j2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32(int i2, int i3) throws IOException {
            writeTag(i2, 0);
            writeInt32NoTag(i3);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.aC
        public void writeLazy(byte[] bArr, int i2, int i3) throws IOException {
            write(bArr, i2, i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessage(int i2, yg ygVar) throws IOException {
            writeTag(i2, 2);
            writeMessageNoTag(ygVar);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageNoTag(yg ygVar) throws IOException {
            writeUInt32NoTag(ygVar.getSerializedSize());
            ygVar.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i2, yg ygVar) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i2);
            writeMessage(3, ygVar);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i2, C c2) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i2);
            writeBytes(3, c2);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeString(int i2, String str) throws IOException {
            writeTag(i2, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32(int i2, int i3) throws IOException {
            writeTag(i2, 0);
            writeUInt32NoTag(i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64(int i2, long j2) throws IOException {
            writeTag(i2, 0);
            writeUInt64NoTag(j2);
        }

        private int bufferPos(long j2) {
            return (int) (j2 - this.address);
        }

        private void repositionBuffer(long j2) {
            qf.position(this.buffer, bufferPos(j2));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void flush() {
            qf.position(this.originalBuffer, bufferPos(this.position));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public int getTotalBytesWritten() {
            return (int) (this.position - this.initialPosition);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public int spaceLeft() {
            return (int) (this.limit - this.position);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i2, byte[] bArr, int i3, int i5) throws IOException {
            writeTag(i2, 2);
            writeByteArrayNoTag(bArr, i3, i5);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i2) throws IOException {
            this.buffer.putInt(bufferPos(this.position), i2);
            this.position += 4;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j2) throws IOException {
            this.buffer.putLong(bufferPos(this.position), j2);
            this.position += 8;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i2) throws IOException {
            if (i2 >= 0) {
                writeUInt32NoTag(i2);
            } else {
                writeUInt64NoTag(i2);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.aC
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws IOException {
            long j2 = this.position;
            try {
                int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                    int iEncodedLength = L0y.encodedLength(str);
                    writeUInt32NoTag(iEncodedLength);
                    repositionBuffer(this.position);
                    L0y.encodeUtf8(str, this.buffer);
                    this.position += (long) iEncodedLength;
                    return;
                }
                int iBufferPos = bufferPos(this.position) + iComputeUInt32SizeNoTag2;
                qf.position(this.buffer, iBufferPos);
                L0y.encodeUtf8(str, this.buffer);
                int iPosition = this.buffer.position() - iBufferPos;
                writeUInt32NoTag(iPosition);
                this.position += (long) iPosition;
            } catch (L0y.Ml e2) {
                this.position = j2;
                repositionBuffer(j2);
                inefficientWriteStringNoTag(str, e2);
            } catch (IllegalArgumentException e3) {
                throw new OutOfSpaceException(e3);
            } catch (IndexOutOfBoundsException e4) {
                throw new OutOfSpaceException(e4);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i2) throws IOException {
            if (this.position <= this.oneVarintLimit) {
                while ((i2 & (-128)) != 0) {
                    long j2 = this.position;
                    this.position = j2 + 1;
                    g9.putByte(j2, (byte) ((i2 & 127) | 128));
                    i2 >>>= 7;
                }
                long j3 = this.position;
                this.position = 1 + j3;
                g9.putByte(j3, (byte) i2);
                return;
            }
            while (true) {
                long j4 = this.position;
                if (j4 >= this.limit) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), 1));
                }
                if ((i2 & (-128)) == 0) {
                    this.position = 1 + j4;
                    g9.putByte(j4, (byte) i2);
                    return;
                } else {
                    this.position = j4 + 1;
                    g9.putByte(j4, (byte) ((i2 & 127) | 128));
                    i2 >>>= 7;
                }
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j2) throws IOException {
            if (this.position <= this.oneVarintLimit) {
                while ((j2 & (-128)) != 0) {
                    long j3 = this.position;
                    this.position = j3 + 1;
                    g9.putByte(j3, (byte) ((((int) j2) & 127) | 128));
                    j2 >>>= 7;
                }
                long j4 = this.position;
                this.position = 1 + j4;
                g9.putByte(j4, (byte) j2);
                return;
            }
            while (true) {
                long j5 = this.position;
                if (j5 >= this.limit) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), 1));
                }
                if ((j2 & (-128)) == 0) {
                    this.position = 1 + j5;
                    g9.putByte(j5, (byte) j2);
                    return;
                } else {
                    this.position = j5 + 1;
                    g9.putByte(j5, (byte) ((((int) j2) & 127) | 128));
                    j2 >>>= 7;
                }
            }
        }

        static boolean isSupported() {
            return g9.hasUnsafeByteBufferOperations();
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i2, int i3) throws IOException {
            writeUInt32NoTag(i3);
            write(bArr, i2, i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytesNoTag(C c2) throws IOException {
            writeUInt32NoTag(c2.size());
            c2.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessage(int i2, yg ygVar, R6 r6) throws IOException {
            writeTag(i2, 2);
            writeMessageNoTag(ygVar, r6);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessageNoTag(yg ygVar, R6 r6) throws IOException {
            writeUInt32NoTag(((com.google.protobuf.j) ygVar).getSerializedSize(r6));
            r6.writeTo(ygVar, this.wrapper);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            qf.clear(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeTag(int i2, int i3) throws IOException {
            writeUInt32NoTag(CM.makeTag(i2, i3));
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.aC
        public void write(byte[] bArr, int i2, int i3) throws IOException {
            if (bArr != null && i2 >= 0 && i3 >= 0 && bArr.length - i3 >= i2) {
                long j2 = i3;
                long j3 = this.limit - j2;
                long j4 = this.position;
                if (j3 >= j4) {
                    g9.copyMemory(bArr, i2, j4, j2);
                    this.position += j2;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException("value");
            }
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), Integer.valueOf(i3)));
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.aC
        public void write(ByteBuffer byteBuffer) throws IOException {
            try {
                int iRemaining = byteBuffer.remaining();
                repositionBuffer(this.position);
                this.buffer.put(byteBuffer);
                this.position += (long) iRemaining;
            } catch (BufferOverflowException e2) {
                throw new OutOfSpaceException(e2);
            }
        }
    }

    private static abstract class n extends CodedOutputStream {
        final byte[] buffer;
        final int limit;
        int position;
        int totalBytesWritten;

        n(int i2) {
            super();
            if (i2 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i2, 20)];
            this.buffer = bArr;
            this.limit = bArr.length;
        }

        final void buffer(byte b2) {
            byte[] bArr = this.buffer;
            int i2 = this.position;
            this.position = i2 + 1;
            bArr[i2] = b2;
            this.totalBytesWritten++;
        }

        final void bufferFixed32NoTag(int i2) {
            byte[] bArr = this.buffer;
            int i3 = this.position;
            int i5 = i3 + 1;
            this.position = i5;
            bArr[i3] = (byte) (i2 & 255);
            int i7 = i3 + 2;
            this.position = i7;
            bArr[i5] = (byte) ((i2 >> 8) & 255);
            int i8 = i3 + 3;
            this.position = i8;
            bArr[i7] = (byte) ((i2 >> 16) & 255);
            this.position = i3 + 4;
            bArr[i8] = (byte) ((i2 >> 24) & 255);
            this.totalBytesWritten += 4;
        }

        final void bufferFixed64NoTag(long j2) {
            byte[] bArr = this.buffer;
            int i2 = this.position;
            int i3 = i2 + 1;
            this.position = i3;
            bArr[i2] = (byte) (j2 & 255);
            int i5 = i2 + 2;
            this.position = i5;
            bArr[i3] = (byte) ((j2 >> 8) & 255);
            int i7 = i2 + 3;
            this.position = i7;
            bArr[i5] = (byte) ((j2 >> 16) & 255);
            int i8 = i2 + 4;
            this.position = i8;
            bArr[i7] = (byte) (255 & (j2 >> 24));
            int i9 = i2 + 5;
            this.position = i9;
            bArr[i8] = (byte) (((int) (j2 >> 32)) & 255);
            int i10 = i2 + 6;
            this.position = i10;
            bArr[i9] = (byte) (((int) (j2 >> 40)) & 255);
            int i11 = i2 + 7;
            this.position = i11;
            bArr[i10] = (byte) (((int) (j2 >> 48)) & 255);
            this.position = i2 + 8;
            bArr[i11] = (byte) (((int) (j2 >> 56)) & 255);
            this.totalBytesWritten += 8;
        }

        final void bufferInt32NoTag(int i2) {
            if (i2 >= 0) {
                bufferUInt32NoTag(i2);
            } else {
                bufferUInt64NoTag(i2);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int getTotalBytesWritten() {
            return this.totalBytesWritten;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int spaceLeft() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        final void bufferTag(int i2, int i3) {
            bufferUInt32NoTag(CM.makeTag(i2, i3));
        }

        final void bufferUInt32NoTag(int i2) {
            if (CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS) {
                long j2 = this.position;
                while ((i2 & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i3 = this.position;
                    this.position = i3 + 1;
                    g9.putByte(bArr, i3, (byte) ((i2 & 127) | 128));
                    i2 >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i5 = this.position;
                this.position = i5 + 1;
                g9.putByte(bArr2, i5, (byte) i2);
                this.totalBytesWritten += (int) (((long) this.position) - j2);
                return;
            }
            while ((i2 & (-128)) != 0) {
                byte[] bArr3 = this.buffer;
                int i7 = this.position;
                this.position = i7 + 1;
                bArr3[i7] = (byte) ((i2 & 127) | 128);
                this.totalBytesWritten++;
                i2 >>>= 7;
            }
            byte[] bArr4 = this.buffer;
            int i8 = this.position;
            this.position = i8 + 1;
            bArr4[i8] = (byte) i2;
            this.totalBytesWritten++;
        }

        final void bufferUInt64NoTag(long j2) {
            if (CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS) {
                long j3 = this.position;
                while ((j2 & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i2 = this.position;
                    this.position = i2 + 1;
                    g9.putByte(bArr, i2, (byte) ((((int) j2) & 127) | 128));
                    j2 >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i3 = this.position;
                this.position = i3 + 1;
                g9.putByte(bArr2, i3, (byte) j2);
                this.totalBytesWritten += (int) (((long) this.position) - j3);
                return;
            }
            while ((j2 & (-128)) != 0) {
                byte[] bArr3 = this.buffer;
                int i5 = this.position;
                this.position = i5 + 1;
                bArr3[i5] = (byte) ((((int) j2) & 127) | 128);
                this.totalBytesWritten++;
                j2 >>>= 7;
            }
            byte[] bArr4 = this.buffer;
            int i7 = this.position;
            this.position = i7 + 1;
            bArr4[i7] = (byte) j2;
            this.totalBytesWritten++;
        }
    }

    private static class w6 extends CodedOutputStream {
        private final byte[] buffer;
        private final int limit;
        private final int offset;
        private int position;

        w6(byte[] bArr, int i2, int i3) {
            super();
            if (bArr == null) {
                throw new NullPointerException(V8ValueTypedArray.PROPERTY_BUFFER);
            }
            int i5 = i2 + i3;
            if ((i2 | i3 | (bArr.length - i5)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            this.buffer = bArr;
            this.offset = i2;
            this.position = i2;
            this.limit = i5;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void flush() {
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.aC
        public final void write(byte b2) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i2 = this.position;
                this.position = i2 + 1;
                bArr[i2] = b2;
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e2);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeBool(int i2, boolean z2) throws IOException {
            writeTag(i2, 0);
            write(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeByteArray(int i2, byte[] bArr) throws IOException {
            writeByteArray(i2, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeByteBuffer(int i2, ByteBuffer byteBuffer) throws IOException {
            writeTag(i2, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeBytes(int i2, C c2) throws IOException {
            writeTag(i2, 2);
            writeBytesNoTag(c2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeFixed32(int i2, int i3) throws IOException {
            writeTag(i2, 5);
            writeFixed32NoTag(i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeFixed64(int i2, long j2) throws IOException {
            writeTag(i2, 1);
            writeFixed64NoTag(j2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeInt32(int i2, int i3) throws IOException {
            writeTag(i2, 0);
            writeInt32NoTag(i3);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.aC
        public final void writeLazy(byte[] bArr, int i2, int i3) throws IOException {
            write(bArr, i2, i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeMessage(int i2, yg ygVar) throws IOException {
            writeTag(i2, 2);
            writeMessageNoTag(ygVar);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeMessageNoTag(yg ygVar) throws IOException {
            writeUInt32NoTag(ygVar.getSerializedSize());
            ygVar.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeMessageSetExtension(int i2, yg ygVar) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i2);
            writeMessage(3, ygVar);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeRawMessageSetExtension(int i2, C c2) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i2);
            writeBytes(3, c2);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeString(int i2, String str) throws IOException {
            writeTag(i2, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt32(int i2, int i3) throws IOException {
            writeTag(i2, 0);
            writeUInt32NoTag(i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt64(int i2, long j2) throws IOException {
            writeTag(i2, 0);
            writeUInt64NoTag(j2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int getTotalBytesWritten() {
            return this.position - this.offset;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int spaceLeft() {
            return this.limit - this.position;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeByteArray(int i2, byte[] bArr, int i3, int i5) throws IOException {
            writeTag(i2, 2);
            writeByteArrayNoTag(bArr, i3, i5);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeFixed32NoTag(int i2) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i3 = this.position;
                int i5 = i3 + 1;
                this.position = i5;
                bArr[i3] = (byte) (i2 & 255);
                int i7 = i3 + 2;
                this.position = i7;
                bArr[i5] = (byte) ((i2 >> 8) & 255);
                int i8 = i3 + 3;
                this.position = i8;
                bArr[i7] = (byte) ((i2 >> 16) & 255);
                this.position = i3 + 4;
                bArr[i8] = (byte) ((i2 >> 24) & 255);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e2);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeFixed64NoTag(long j2) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i2 = this.position;
                int i3 = i2 + 1;
                this.position = i3;
                bArr[i2] = (byte) (((int) j2) & 255);
                int i5 = i2 + 2;
                this.position = i5;
                bArr[i3] = (byte) (((int) (j2 >> 8)) & 255);
                int i7 = i2 + 3;
                this.position = i7;
                bArr[i5] = (byte) (((int) (j2 >> 16)) & 255);
                int i8 = i2 + 4;
                this.position = i8;
                bArr[i7] = (byte) (((int) (j2 >> 24)) & 255);
                int i9 = i2 + 5;
                this.position = i9;
                bArr[i8] = (byte) (((int) (j2 >> 32)) & 255);
                int i10 = i2 + 6;
                this.position = i10;
                bArr[i9] = (byte) (((int) (j2 >> 40)) & 255);
                int i11 = i2 + 7;
                this.position = i11;
                bArr[i10] = (byte) (((int) (j2 >> 48)) & 255);
                this.position = i2 + 8;
                bArr[i11] = (byte) (((int) (j2 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e2);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeInt32NoTag(int i2) throws IOException {
            if (i2 >= 0) {
                writeUInt32NoTag(i2);
            } else {
                writeUInt64NoTag(i2);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.aC
        public final void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeStringNoTag(String str) throws IOException {
            int i2 = this.position;
            try {
                int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                    writeUInt32NoTag(L0y.encodedLength(str));
                    this.position = L0y.encode(str, this.buffer, this.position, spaceLeft());
                    return;
                }
                int i3 = i2 + iComputeUInt32SizeNoTag2;
                this.position = i3;
                int iEncode = L0y.encode(str, this.buffer, i3, spaceLeft());
                this.position = i2;
                writeUInt32NoTag((iEncode - i2) - iComputeUInt32SizeNoTag2);
                this.position = iEncode;
            } catch (L0y.Ml e2) {
                this.position = i2;
                inefficientWriteStringNoTag(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new OutOfSpaceException(e3);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt32NoTag(int i2) throws IOException {
            while ((i2 & (-128)) != 0) {
                try {
                    byte[] bArr = this.buffer;
                    int i3 = this.position;
                    this.position = i3 + 1;
                    bArr[i3] = (byte) ((i2 & 127) | 128);
                    i2 >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e2);
                }
            }
            byte[] bArr2 = this.buffer;
            int i5 = this.position;
            this.position = i5 + 1;
            bArr2[i5] = (byte) i2;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeByteArrayNoTag(byte[] bArr, int i2, int i3) throws IOException {
            writeUInt32NoTag(i3);
            write(bArr, i2, i3);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeBytesNoTag(C c2) throws IOException {
            writeUInt32NoTag(c2.size());
            c2.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        final void writeMessage(int i2, yg ygVar, R6 r6) throws IOException {
            writeTag(i2, 2);
            writeUInt32NoTag(((com.google.protobuf.j) ygVar).getSerializedSize(r6));
            r6.writeTo(ygVar, this.wrapper);
        }

        @Override // com.google.protobuf.CodedOutputStream
        final void writeMessageNoTag(yg ygVar, R6 r6) throws IOException {
            writeUInt32NoTag(((com.google.protobuf.j) ygVar).getSerializedSize(r6));
            r6.writeTo(ygVar, this.wrapper);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            qf.clear(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeTag(int i2, int i3) throws IOException {
            writeUInt32NoTag(CM.makeTag(i2, i3));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt64NoTag(long j2) throws IOException {
            if (CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS && spaceLeft() >= 10) {
                while ((j2 & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i2 = this.position;
                    this.position = i2 + 1;
                    g9.putByte(bArr, i2, (byte) ((((int) j2) & 127) | 128));
                    j2 >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i3 = this.position;
                this.position = i3 + 1;
                g9.putByte(bArr2, i3, (byte) j2);
                return;
            }
            while ((j2 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.buffer;
                    int i5 = this.position;
                    this.position = i5 + 1;
                    bArr3[i5] = (byte) ((((int) j2) & 127) | 128);
                    j2 >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e2);
                }
            }
            byte[] bArr4 = this.buffer;
            int i7 = this.position;
            this.position = i7 + 1;
            bArr4[i7] = (byte) j2;
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.aC
        public final void write(byte[] bArr, int i2, int i3) throws IOException {
            try {
                System.arraycopy(bArr, i2, this.buffer, this.position, i3);
                this.position += i3;
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(i3)), e2);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.aC
        public final void write(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.buffer, this.position, iRemaining);
                this.position += iRemaining;
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(iRemaining)), e2);
            }
        }
    }

    public static int computeBoolSizeNoTag(boolean z2) {
        return 1;
    }

    public static int computeByteArraySizeNoTag(byte[] bArr) {
        return computeLengthDelimitedFieldSize(bArr.length);
    }

    public static int computeDoubleSizeNoTag(double d2) {
        return 8;
    }

    public static int computeFixed32SizeNoTag(int i2) {
        return 4;
    }

    public static int computeFixed64SizeNoTag(long j2) {
        return 8;
    }

    public static int computeFloatSizeNoTag(float f3) {
        return 4;
    }

    @Deprecated
    public static int computeGroupSize(int i2, yg ygVar) {
        return (computeTagSize(i2) * 2) + ygVar.getSerializedSize();
    }

    @Deprecated
    public static int computeGroupSizeNoTag(yg ygVar) {
        return ygVar.getSerializedSize();
    }

    public static int computeLazyFieldMessageSetExtensionSize(int i2, iwV iwv) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, i2) + computeLazyFieldSize(3, iwv);
    }

    public static int computeMessageSetExtensionSize(int i2, yg ygVar) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, i2) + computeMessageSize(3, ygVar);
    }

    public static int computeMessageSize(int i2, yg ygVar) {
        return computeTagSize(i2) + computeMessageSizeNoTag(ygVar);
    }

    public static int computeMessageSizeNoTag(yg ygVar) {
        return computeLengthDelimitedFieldSize(ygVar.getSerializedSize());
    }

    static int computePreferredBufferSize(int i2) {
        if (i2 > 4096) {
            return 4096;
        }
        return i2;
    }

    public static int computeRawMessageSetExtensionSize(int i2, C c2) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, i2) + computeBytesSize(3, c2);
    }

    public static int computeSFixed32SizeNoTag(int i2) {
        return 4;
    }

    public static int computeSFixed64SizeNoTag(long j2) {
        return 8;
    }

    public static int computeTagSize(int i2) {
        return computeUInt32SizeNoTag(CM.makeTag(i2, 0));
    }

    public static int computeUInt32SizeNoTag(int i2) {
        if ((i2 & (-128)) == 0) {
            return 1;
        }
        if ((i2 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i2) == 0) {
            return 3;
        }
        return (i2 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int computeUInt64SizeNoTag(long j2) {
        int i2;
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (j2 < 0) {
            return 10;
        }
        if (((-34359738368L) & j2) != 0) {
            j2 >>>= 28;
            i2 = 6;
        } else {
            i2 = 2;
        }
        if (((-2097152) & j2) != 0) {
            i2 += 2;
            j2 >>>= 14;
        }
        return (j2 & (-16384)) != 0 ? i2 + 1 : i2;
    }

    public static int encodeZigZag32(int i2) {
        return (i2 >> 31) ^ (i2 << 1);
    }

    public static long encodeZigZag64(long j2) {
        return (j2 >> 63) ^ (j2 << 1);
    }

    public static CodedOutputStream newInstance(OutputStream outputStream) {
        return newInstance(outputStream, 4096);
    }

    public abstract void flush() throws IOException;

    public abstract int getTotalBytesWritten();

    public abstract int spaceLeft();

    public void useDeterministicSerialization() {
        this.serializationDeterministic = true;
    }

    @Override // com.google.protobuf.aC
    public abstract void write(byte b2) throws IOException;

    @Override // com.google.protobuf.aC
    public abstract void write(ByteBuffer byteBuffer) throws IOException;

    @Override // com.google.protobuf.aC
    public abstract void write(byte[] bArr, int i2, int i3) throws IOException;

    public abstract void writeBool(int i2, boolean z2) throws IOException;

    public final void writeBoolNoTag(boolean z2) throws IOException {
        write(z2 ? (byte) 1 : (byte) 0);
    }

    public abstract void writeByteArray(int i2, byte[] bArr) throws IOException;

    public abstract void writeByteArray(int i2, byte[] bArr, int i3, int i5) throws IOException;

    public final void writeByteArrayNoTag(byte[] bArr) throws IOException {
        writeByteArrayNoTag(bArr, 0, bArr.length);
    }

    abstract void writeByteArrayNoTag(byte[] bArr, int i2, int i3) throws IOException;

    public abstract void writeByteBuffer(int i2, ByteBuffer byteBuffer) throws IOException;

    public abstract void writeBytes(int i2, C c2) throws IOException;

    public abstract void writeBytesNoTag(C c2) throws IOException;

    public abstract void writeFixed32(int i2, int i3) throws IOException;

    public abstract void writeFixed32NoTag(int i2) throws IOException;

    public abstract void writeFixed64(int i2, long j2) throws IOException;

    public abstract void writeFixed64NoTag(long j2) throws IOException;

    @Deprecated
    public final void writeGroup(int i2, yg ygVar) throws IOException {
        writeTag(i2, 3);
        writeGroupNoTag(ygVar);
        writeTag(i2, 4);
    }

    @Deprecated
    public final void writeGroupNoTag(yg ygVar) throws IOException {
        ygVar.writeTo(this);
    }

    public abstract void writeInt32(int i2, int i3) throws IOException;

    public abstract void writeInt32NoTag(int i2) throws IOException;

    @Override // com.google.protobuf.aC
    public abstract void writeLazy(ByteBuffer byteBuffer) throws IOException;

    @Override // com.google.protobuf.aC
    public abstract void writeLazy(byte[] bArr, int i2, int i3) throws IOException;

    public abstract void writeMessage(int i2, yg ygVar) throws IOException;

    abstract void writeMessage(int i2, yg ygVar, R6 r6) throws IOException;

    public abstract void writeMessageNoTag(yg ygVar) throws IOException;

    abstract void writeMessageNoTag(yg ygVar, R6 r6) throws IOException;

    public abstract void writeMessageSetExtension(int i2, yg ygVar) throws IOException;

    public final void writeRawByte(byte b2) throws IOException {
        write(b2);
    }

    public abstract void writeRawBytes(ByteBuffer byteBuffer) throws IOException;

    public final void writeRawBytes(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public abstract void writeRawMessageSetExtension(int i2, C c2) throws IOException;

    public abstract void writeString(int i2, String str) throws IOException;

    public abstract void writeStringNoTag(String str) throws IOException;

    public abstract void writeTag(int i2, int i3) throws IOException;

    public abstract void writeUInt32(int i2, int i3) throws IOException;

    public abstract void writeUInt32NoTag(int i2) throws IOException;

    public abstract void writeUInt64(int i2, long j2) throws IOException;

    public abstract void writeUInt64NoTag(long j2) throws IOException;

    private CodedOutputStream() {
    }

    @Deprecated
    static int computeGroupSize(int i2, yg ygVar, R6 r6) {
        return (computeTagSize(i2) * 2) + computeGroupSizeNoTag(ygVar, r6);
    }

    @Deprecated
    static int computeGroupSizeNoTag(yg ygVar, R6 r6) {
        return ((com.google.protobuf.j) ygVar).getSerializedSize(r6);
    }

    public static int computeInt32SizeNoTag(int i2) {
        if (i2 >= 0) {
            return computeUInt32SizeNoTag(i2);
        }
        return 10;
    }

    static int computeMessageSize(int i2, yg ygVar, R6 r6) {
        return computeTagSize(i2) + computeMessageSizeNoTag(ygVar, r6);
    }

    static int computeMessageSizeNoTag(yg ygVar, R6 r6) {
        return computeLengthDelimitedFieldSize(((com.google.protobuf.j) ygVar).getSerializedSize(r6));
    }

    public static CodedOutputStream newInstance(OutputStream outputStream, int i2) {
        return new Wre(outputStream, i2);
    }

    static CodedOutputStream newSafeInstance(ByteBuffer byteBuffer) {
        return new CN3(byteBuffer);
    }

    static CodedOutputStream newUnsafeInstance(ByteBuffer byteBuffer) {
        return new fuX(byteBuffer);
    }

    final void inefficientWriteStringNoTag(String str, L0y.Ml ml) throws IOException {
        logger.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) ml);
        byte[] bytes = str.getBytes(nKK.UTF_8);
        try {
            writeUInt32NoTag(bytes.length);
            writeLazy(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e2) {
            throw new OutOfSpaceException(e2);
        }
    }

    boolean isSerializationDeterministic() {
        return this.serializationDeterministic;
    }

    @Deprecated
    final void writeGroupNoTag(yg ygVar, R6 r6) throws IOException {
        r6.writeTo(ygVar, this.wrapper);
    }

    public final void writeRawByte(int i2) throws IOException {
        write((byte) i2);
    }

    public final void writeRawBytes(byte[] bArr, int i2, int i3) throws IOException {
        write(bArr, i2, i3);
    }

    public static int computeBoolSize(int i2, boolean z2) {
        return computeTagSize(i2) + computeBoolSizeNoTag(z2);
    }

    public static int computeByteArraySize(int i2, byte[] bArr) {
        return computeTagSize(i2) + computeByteArraySizeNoTag(bArr);
    }

    public static int computeByteBufferSize(int i2, ByteBuffer byteBuffer) {
        return computeTagSize(i2) + computeByteBufferSizeNoTag(byteBuffer);
    }

    public static int computeByteBufferSizeNoTag(ByteBuffer byteBuffer) {
        return computeLengthDelimitedFieldSize(byteBuffer.capacity());
    }

    public static int computeBytesSize(int i2, C c2) {
        return computeTagSize(i2) + computeBytesSizeNoTag(c2);
    }

    public static int computeBytesSizeNoTag(C c2) {
        return computeLengthDelimitedFieldSize(c2.size());
    }

    public static int computeDoubleSize(int i2, double d2) {
        return computeTagSize(i2) + computeDoubleSizeNoTag(d2);
    }

    public static int computeEnumSize(int i2, int i3) {
        return computeTagSize(i2) + computeEnumSizeNoTag(i3);
    }

    public static int computeEnumSizeNoTag(int i2) {
        return computeInt32SizeNoTag(i2);
    }

    public static int computeFixed32Size(int i2, int i3) {
        return computeTagSize(i2) + computeFixed32SizeNoTag(i3);
    }

    public static int computeFixed64Size(int i2, long j2) {
        return computeTagSize(i2) + computeFixed64SizeNoTag(j2);
    }

    public static int computeFloatSize(int i2, float f3) {
        return computeTagSize(i2) + computeFloatSizeNoTag(f3);
    }

    public static int computeInt32Size(int i2, int i3) {
        return computeTagSize(i2) + computeInt32SizeNoTag(i3);
    }

    public static int computeInt64Size(int i2, long j2) {
        return computeTagSize(i2) + computeInt64SizeNoTag(j2);
    }

    public static int computeInt64SizeNoTag(long j2) {
        return computeUInt64SizeNoTag(j2);
    }

    public static int computeLazyFieldSize(int i2, iwV iwv) {
        return computeTagSize(i2) + computeLazyFieldSizeNoTag(iwv);
    }

    public static int computeLazyFieldSizeNoTag(iwV iwv) {
        return computeLengthDelimitedFieldSize(iwv.getSerializedSize());
    }

    static int computeLengthDelimitedFieldSize(int i2) {
        return computeUInt32SizeNoTag(i2) + i2;
    }

    @Deprecated
    public static int computeRawVarint32Size(int i2) {
        return computeUInt32SizeNoTag(i2);
    }

    @Deprecated
    public static int computeRawVarint64Size(long j2) {
        return computeUInt64SizeNoTag(j2);
    }

    public static int computeSFixed32Size(int i2, int i3) {
        return computeTagSize(i2) + computeSFixed32SizeNoTag(i3);
    }

    public static int computeSFixed64Size(int i2, long j2) {
        return computeTagSize(i2) + computeSFixed64SizeNoTag(j2);
    }

    public static int computeSInt32Size(int i2, int i3) {
        return computeTagSize(i2) + computeSInt32SizeNoTag(i3);
    }

    public static int computeSInt32SizeNoTag(int i2) {
        return computeUInt32SizeNoTag(encodeZigZag32(i2));
    }

    public static int computeSInt64Size(int i2, long j2) {
        return computeTagSize(i2) + computeSInt64SizeNoTag(j2);
    }

    public static int computeSInt64SizeNoTag(long j2) {
        return computeUInt64SizeNoTag(encodeZigZag64(j2));
    }

    public static int computeStringSize(int i2, String str) {
        return computeTagSize(i2) + computeStringSizeNoTag(str);
    }

    public static int computeStringSizeNoTag(String str) {
        int length;
        try {
            length = L0y.encodedLength(str);
        } catch (L0y.Ml unused) {
            length = str.getBytes(nKK.UTF_8).length;
        }
        return computeLengthDelimitedFieldSize(length);
    }

    public static int computeUInt32Size(int i2, int i3) {
        return computeTagSize(i2) + computeUInt32SizeNoTag(i3);
    }

    public static int computeUInt64Size(int i2, long j2) {
        return computeTagSize(i2) + computeUInt64SizeNoTag(j2);
    }

    public static CodedOutputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public final void checkNoSpaceLeft() {
        if (spaceLeft() == 0) {
        } else {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void writeDouble(int i2, double d2) throws IOException {
        writeFixed64(i2, Double.doubleToRawLongBits(d2));
    }

    public final void writeDoubleNoTag(double d2) throws IOException {
        writeFixed64NoTag(Double.doubleToRawLongBits(d2));
    }

    public final void writeEnum(int i2, int i3) throws IOException {
        writeInt32(i2, i3);
    }

    public final void writeEnumNoTag(int i2) throws IOException {
        writeInt32NoTag(i2);
    }

    public final void writeFloat(int i2, float f3) throws IOException {
        writeFixed32(i2, Float.floatToRawIntBits(f3));
    }

    public final void writeFloatNoTag(float f3) throws IOException {
        writeFixed32NoTag(Float.floatToRawIntBits(f3));
    }

    public final void writeInt64(int i2, long j2) throws IOException {
        writeUInt64(i2, j2);
    }

    public final void writeInt64NoTag(long j2) throws IOException {
        writeUInt64NoTag(j2);
    }

    public final void writeRawBytes(C c2) throws IOException {
        c2.writeTo(this);
    }

    @Deprecated
    public final void writeRawLittleEndian32(int i2) throws IOException {
        writeFixed32NoTag(i2);
    }

    @Deprecated
    public final void writeRawLittleEndian64(long j2) throws IOException {
        writeFixed64NoTag(j2);
    }

    @Deprecated
    public final void writeRawVarint32(int i2) throws IOException {
        writeUInt32NoTag(i2);
    }

    @Deprecated
    public final void writeRawVarint64(long j2) throws IOException {
        writeUInt64NoTag(j2);
    }

    public final void writeSFixed32(int i2, int i3) throws IOException {
        writeFixed32(i2, i3);
    }

    public final void writeSFixed32NoTag(int i2) throws IOException {
        writeFixed32NoTag(i2);
    }

    public final void writeSFixed64(int i2, long j2) throws IOException {
        writeFixed64(i2, j2);
    }

    public final void writeSFixed64NoTag(long j2) throws IOException {
        writeFixed64NoTag(j2);
    }

    public final void writeSInt32(int i2, int i3) throws IOException {
        writeUInt32(i2, encodeZigZag32(i3));
    }

    public final void writeSInt32NoTag(int i2) throws IOException {
        writeUInt32NoTag(encodeZigZag32(i2));
    }

    public final void writeSInt64(int i2, long j2) throws IOException {
        writeUInt64(i2, encodeZigZag64(j2));
    }

    public final void writeSInt64NoTag(long j2) throws IOException {
        writeUInt64NoTag(encodeZigZag64(j2));
    }

    public static CodedOutputStream newInstance(byte[] bArr, int i2, int i3) {
        return new w6(bArr, i2, i3);
    }

    @Deprecated
    final void writeGroup(int i2, yg ygVar, R6 r6) throws IOException {
        writeTag(i2, 3);
        writeGroupNoTag(ygVar, r6);
        writeTag(i2, 4);
    }

    public static CodedOutputStream newInstance(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new I28(byteBuffer);
        }
        if (byteBuffer.isDirect() && !byteBuffer.isReadOnly()) {
            if (fuX.isSupported()) {
                return newUnsafeInstance(byteBuffer);
            }
            return newSafeInstance(byteBuffer);
        }
        throw new IllegalArgumentException("ByteBuffer is read-only");
    }

    @Deprecated
    public static CodedOutputStream newInstance(ByteBuffer byteBuffer, int i2) {
        return newInstance(byteBuffer);
    }

    static CodedOutputStream newInstance(aC aCVar, int i2) {
        if (i2 >= 0) {
            return new Ml(aCVar, i2);
        }
        throw new IllegalArgumentException("bufferSize must be positive");
    }
}
