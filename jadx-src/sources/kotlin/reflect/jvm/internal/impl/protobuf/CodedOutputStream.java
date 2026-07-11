package kotlin.reflect.jvm.internal.impl.protobuf;

import com.google.android.exoplayer2.C;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class CodedOutputStream {
    private final byte[] buffer;
    private final int limit;
    private final OutputStream output;
    private int totalBytesWritten = 0;
    private int position = 0;

    public static class OutOfSpaceException extends IOException {
        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    public static int computeBoolSizeNoTag(boolean z2) {
        return 1;
    }

    public static int computeByteArraySizeNoTag(byte[] bArr) {
        return computeRawVarint32Size(bArr.length) + bArr.length;
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

    static int computePreferredBufferSize(int i2) {
        if (i2 > 4096) {
            return 4096;
        }
        return i2;
    }

    public static int computeRawVarint32Size(int i2) {
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

    public static int computeRawVarint64Size(long j2) {
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (((-16384) & j2) == 0) {
            return 2;
        }
        if (((-2097152) & j2) == 0) {
            return 3;
        }
        if (((-268435456) & j2) == 0) {
            return 4;
        }
        if (((-34359738368L) & j2) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j2) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j2) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j2) == 0) {
            return 8;
        }
        return (j2 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int computeSFixed32SizeNoTag(int i2) {
        return 4;
    }

    public static int computeSFixed64SizeNoTag(long j2) {
        return 8;
    }

    public static int computeTagSize(int i2) {
        return computeRawVarint32Size(WireFormat.makeTag(i2, 0));
    }

    public static int encodeZigZag32(int i2) {
        return (i2 >> 31) ^ (i2 << 1);
    }

    public static long encodeZigZag64(long j2) {
        return (j2 >> 63) ^ (j2 << 1);
    }

    public void writeBool(int i2, boolean z2) throws IOException {
        writeTag(i2, 0);
        writeBoolNoTag(z2);
    }

    public void writeByteArrayNoTag(byte[] bArr) throws IOException {
        writeRawVarint32(bArr.length);
        writeRawBytes(bArr);
    }

    public void writeBytes(int i2, ByteString byteString) throws IOException {
        writeTag(i2, 2);
        writeBytesNoTag(byteString);
    }

    public void writeDouble(int i2, double d2) throws IOException {
        writeTag(i2, 1);
        writeDoubleNoTag(d2);
    }

    public void writeEnum(int i2, int i3) throws IOException {
        writeTag(i2, 0);
        writeEnumNoTag(i3);
    }

    public void writeFloat(int i2, float f3) throws IOException {
        writeTag(i2, 5);
        writeFloatNoTag(f3);
    }

    public void writeGroup(int i2, MessageLite messageLite) throws IOException {
        writeTag(i2, 3);
        writeGroupNoTag(messageLite);
        writeTag(i2, 4);
    }

    public void writeInt32(int i2, int i3) throws IOException {
        writeTag(i2, 0);
        writeInt32NoTag(i3);
    }

    public void writeMessage(int i2, MessageLite messageLite) throws IOException {
        writeTag(i2, 2);
        writeMessageNoTag(messageLite);
    }

    public void writeMessageSetExtension(int i2, MessageLite messageLite) throws IOException {
        writeTag(1, 3);
        writeUInt32(2, i2);
        writeMessage(3, messageLite);
        writeTag(1, 4);
    }

    public void writeRawByte(byte b2) throws IOException {
        if (this.position == this.limit) {
            refreshBuffer();
        }
        byte[] bArr = this.buffer;
        int i2 = this.position;
        this.position = i2 + 1;
        bArr[i2] = b2;
        this.totalBytesWritten++;
    }

    public void writeRawBytes(ByteString byteString) throws IOException {
        writeRawBytes(byteString, 0, byteString.size());
    }

    public void writeRawLittleEndian64(long j2) throws IOException {
        writeRawByte(((int) j2) & 255);
        writeRawByte(((int) (j2 >> 8)) & 255);
        writeRawByte(((int) (j2 >> 16)) & 255);
        writeRawByte(((int) (j2 >> 24)) & 255);
        writeRawByte(((int) (j2 >> 32)) & 255);
        writeRawByte(((int) (j2 >> 40)) & 255);
        writeRawByte(((int) (j2 >> 48)) & 255);
        writeRawByte(((int) (j2 >> 56)) & 255);
    }

    public void writeSInt64(int i2, long j2) throws IOException {
        writeTag(i2, 0);
        writeSInt64NoTag(j2);
    }

    public void writeUInt32(int i2, int i3) throws IOException {
        writeTag(i2, 0);
        writeUInt32NoTag(i3);
    }

    public static int computeInt32SizeNoTag(int i2) {
        if (i2 >= 0) {
            return computeRawVarint32Size(i2);
        }
        return 10;
    }

    public static int computeStringSizeNoTag(String str) {
        try {
            byte[] bytes = str.getBytes(C.UTF8_NAME);
            return computeRawVarint32Size(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UTF-8 not supported.", e2);
        }
    }

    public static CodedOutputStream newInstance(OutputStream outputStream, int i2) {
        return new CodedOutputStream(outputStream, new byte[i2]);
    }

    private void refreshBuffer() throws IOException {
        OutputStream outputStream = this.output;
        if (outputStream == null) {
            throw new OutOfSpaceException();
        }
        outputStream.write(this.buffer, 0, this.position);
        this.position = 0;
    }

    public void flush() throws IOException {
        if (this.output != null) {
            refreshBuffer();
        }
    }

    public void writeInt32NoTag(int i2) throws IOException {
        if (i2 >= 0) {
            writeRawVarint32(i2);
        } else {
            writeRawVarint64(i2);
        }
    }

    public void writeRawBytes(byte[] bArr) throws IOException {
        writeRawBytes(bArr, 0, bArr.length);
    }

    public void writeRawLittleEndian32(int i2) throws IOException {
        writeRawByte(i2 & 255);
        writeRawByte((i2 >> 8) & 255);
        writeRawByte((i2 >> 16) & 255);
        writeRawByte((i2 >> 24) & 255);
    }

    public void writeRawVarint32(int i2) throws IOException {
        while ((i2 & (-128)) != 0) {
            writeRawByte((i2 & 127) | 128);
            i2 >>>= 7;
        }
        writeRawByte(i2);
    }

    public void writeRawVarint64(long j2) throws IOException {
        while (((-128) & j2) != 0) {
            writeRawByte((((int) j2) & 127) | 128);
            j2 >>>= 7;
        }
        writeRawByte((int) j2);
    }

    public void writeStringNoTag(String str) throws IOException {
        byte[] bytes = str.getBytes(C.UTF8_NAME);
        writeRawVarint32(bytes.length);
        writeRawBytes(bytes);
    }

    private CodedOutputStream(OutputStream outputStream, byte[] bArr) {
        this.output = outputStream;
        this.buffer = bArr;
        this.limit = bArr.length;
    }

    public static int computeBoolSize(int i2, boolean z2) {
        return computeTagSize(i2) + computeBoolSizeNoTag(z2);
    }

    public static int computeBytesSize(int i2, ByteString byteString) {
        return computeTagSize(i2) + computeBytesSizeNoTag(byteString);
    }

    public static int computeBytesSizeNoTag(ByteString byteString) {
        return computeRawVarint32Size(byteString.size()) + byteString.size();
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

    public static int computeFloatSize(int i2, float f3) {
        return computeTagSize(i2) + computeFloatSizeNoTag(f3);
    }

    public static int computeGroupSizeNoTag(MessageLite messageLite) {
        return messageLite.getSerializedSize();
    }

    public static int computeInt32Size(int i2, int i3) {
        return computeTagSize(i2) + computeInt32SizeNoTag(i3);
    }

    public static int computeInt64SizeNoTag(long j2) {
        return computeRawVarint64Size(j2);
    }

    public static int computeLazyFieldSizeNoTag(LazyFieldLite lazyFieldLite) {
        int serializedSize = lazyFieldLite.getSerializedSize();
        return computeRawVarint32Size(serializedSize) + serializedSize;
    }

    public static int computeMessageSize(int i2, MessageLite messageLite) {
        return computeTagSize(i2) + computeMessageSizeNoTag(messageLite);
    }

    public static int computeMessageSizeNoTag(MessageLite messageLite) {
        int serializedSize = messageLite.getSerializedSize();
        return computeRawVarint32Size(serializedSize) + serializedSize;
    }

    public static int computeSInt32SizeNoTag(int i2) {
        return computeRawVarint32Size(encodeZigZag32(i2));
    }

    public static int computeSInt64Size(int i2, long j2) {
        return computeTagSize(i2) + computeSInt64SizeNoTag(j2);
    }

    public static int computeSInt64SizeNoTag(long j2) {
        return computeRawVarint64Size(encodeZigZag64(j2));
    }

    public static int computeUInt32SizeNoTag(int i2) {
        return computeRawVarint32Size(i2);
    }

    public static int computeUInt64SizeNoTag(long j2) {
        return computeRawVarint64Size(j2);
    }

    public void writeBoolNoTag(boolean z2) throws IOException {
        writeRawByte(z2 ? 1 : 0);
    }

    public void writeBytesNoTag(ByteString byteString) throws IOException {
        writeRawVarint32(byteString.size());
        writeRawBytes(byteString);
    }

    public void writeDoubleNoTag(double d2) throws IOException {
        writeRawLittleEndian64(Double.doubleToRawLongBits(d2));
    }

    public void writeEnumNoTag(int i2) throws IOException {
        writeInt32NoTag(i2);
    }

    public void writeFixed32NoTag(int i2) throws IOException {
        writeRawLittleEndian32(i2);
    }

    public void writeFixed64NoTag(long j2) throws IOException {
        writeRawLittleEndian64(j2);
    }

    public void writeFloatNoTag(float f3) throws IOException {
        writeRawLittleEndian32(Float.floatToRawIntBits(f3));
    }

    public void writeGroupNoTag(MessageLite messageLite) throws IOException {
        messageLite.writeTo(this);
    }

    public void writeInt64NoTag(long j2) throws IOException {
        writeRawVarint64(j2);
    }

    public void writeMessageNoTag(MessageLite messageLite) throws IOException {
        writeRawVarint32(messageLite.getSerializedSize());
        messageLite.writeTo(this);
    }

    public void writeRawBytes(byte[] bArr, int i2, int i3) throws IOException {
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
        refreshBuffer();
        if (i10 <= this.limit) {
            System.arraycopy(bArr, i9, this.buffer, 0, i10);
            this.position = i10;
        } else {
            this.output.write(bArr, i9, i10);
        }
        this.totalBytesWritten += i10;
    }

    public void writeSFixed32NoTag(int i2) throws IOException {
        writeRawLittleEndian32(i2);
    }

    public void writeSFixed64NoTag(long j2) throws IOException {
        writeRawLittleEndian64(j2);
    }

    public void writeSInt32NoTag(int i2) throws IOException {
        writeRawVarint32(encodeZigZag32(i2));
    }

    public void writeSInt64NoTag(long j2) throws IOException {
        writeRawVarint64(encodeZigZag64(j2));
    }

    public void writeTag(int i2, int i3) throws IOException {
        writeRawVarint32(WireFormat.makeTag(i2, i3));
    }

    public void writeUInt32NoTag(int i2) throws IOException {
        writeRawVarint32(i2);
    }

    public void writeUInt64NoTag(long j2) throws IOException {
        writeRawVarint64(j2);
    }

    public void writeRawByte(int i2) throws IOException {
        writeRawByte((byte) i2);
    }

    public void writeRawBytes(ByteString byteString, int i2, int i3) throws IOException {
        int i5 = this.limit;
        int i7 = this.position;
        if (i5 - i7 >= i3) {
            byteString.copyTo(this.buffer, i2, i7, i3);
            this.position += i3;
            this.totalBytesWritten += i3;
            return;
        }
        int i8 = i5 - i7;
        byteString.copyTo(this.buffer, i2, i7, i8);
        int i9 = i2 + i8;
        int i10 = i3 - i8;
        this.position = this.limit;
        this.totalBytesWritten += i8;
        refreshBuffer();
        if (i10 <= this.limit) {
            byteString.copyTo(this.buffer, i9, 0, i10);
            this.position = i10;
        } else {
            byteString.writeTo(this.output, i9, i10);
        }
        this.totalBytesWritten += i10;
    }
}
