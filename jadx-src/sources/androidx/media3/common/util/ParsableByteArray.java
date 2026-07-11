package androidx.media3.common.util;

import androidx.annotation.Nullable;
import com.google.common.collect.Ln;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@UnstableApi
public final class ParsableByteArray {
    private static final char[] CR_AND_LF = {'\r', '\n'};
    private static final char[] LF = {'\n'};
    private static final Ln SUPPORTED_CHARSETS_FOR_READLINE = Ln.S(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    private byte[] data;
    private int limit;
    private int position;

    public ParsableByteArray() {
        this.data = Util.EMPTY_BYTE_ARRAY;
    }

    public char peekChar() {
        byte[] bArr = this.data;
        int i2 = this.position;
        return (char) ((bArr[i2 + 1] & UByte.MAX_VALUE) | ((bArr[i2] & UByte.MAX_VALUE) << 8));
    }

    public void readBytes(ParsableBitArray parsableBitArray, int i2) {
        readBytes(parsableBitArray.data, 0, i2);
        parsableBitArray.setPosition(0);
    }

    @Nullable
    public String readLine() {
        return readLine(StandardCharsets.UTF_8);
    }

    public String readNullTerminatedString(int i2) {
        if (i2 == 0) {
            return "";
        }
        int i3 = this.position;
        int i5 = (i3 + i2) - 1;
        String strFromUtf8Bytes = Util.fromUtf8Bytes(this.data, i3, (i5 >= this.limit || this.data[i5] != 0) ? i2 : i2 - 1);
        this.position += i2;
        return strFromUtf8Bytes;
    }

    public String readString(int i2) {
        return readString(i2, StandardCharsets.UTF_8);
    }

    public void reset(int i2) {
        reset(capacity() < i2 ? new byte[i2] : this.data, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int findNextLineTerminator(Charset charset) {
        int i2;
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) {
            i2 = 1;
        } else {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i2 = 2;
        }
        int i3 = this.position;
        while (true) {
            int i5 = this.limit;
            if (i3 >= i5 - (i2 - 1)) {
                return i5;
            }
            if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && Util.isLinebreak(this.data[i3])) {
                break;
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr = this.data;
                if (bArr[i3] == 0 && Util.isLinebreak(bArr[i3 + 1])) {
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    byte[] bArr2 = this.data;
                    if (bArr2[i3 + 1] == 0 && Util.isLinebreak(bArr2[i3])) {
                        break;
                    }
                }
                i3 += i2;
            }
        }
        return i3;
    }

    private int peekCharacterAndSize(Charset charset) {
        byte b2;
        byte b4;
        byte b5 = 1;
        if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && bytesLeft() >= 1) {
            b2 = this.data[this.position];
            b4 = 0;
        } else {
            if ((charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) && bytesLeft() >= 2) {
                byte[] bArr = this.data;
                int i2 = this.position;
                b4 = bArr[i2];
                b2 = bArr[i2 + 1];
            } else {
                if (!charset.equals(StandardCharsets.UTF_16LE) || bytesLeft() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.data;
                int i3 = this.position;
                b4 = bArr2[i3 + 1];
                b2 = bArr2[i3];
            }
            b5 = 2;
        }
        return com.google.common.primitives.Wre.Uo(b4, b2, (byte) 0, b5);
    }

    private void skipLineTerminator(Charset charset) {
        if (readCharacterIfInList(charset, CR_AND_LF) == '\r') {
            readCharacterIfInList(charset, LF);
        }
    }

    public int bytesLeft() {
        return this.limit - this.position;
    }

    public int capacity() {
        return this.data.length;
    }

    public byte[] getData() {
        return this.data;
    }

    public int getPosition() {
        return this.position;
    }

    public int limit() {
        return this.limit;
    }

    public char peekChar(Charset charset) {
        Assertions.checkArgument(SUPPORTED_CHARSETS_FOR_READLINE.contains(charset), "Unsupported charset: " + charset);
        return (char) (peekCharacterAndSize(charset) >> 16);
    }

    public int peekUnsignedByte() {
        return this.data[this.position] & UByte.MAX_VALUE;
    }

    public int readInt() {
        byte[] bArr = this.data;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        int i5 = (bArr[i2] & UByte.MAX_VALUE) << 24;
        int i7 = i2 + 2;
        this.position = i7;
        int i8 = ((bArr[i3] & UByte.MAX_VALUE) << 16) | i5;
        int i9 = i2 + 3;
        this.position = i9;
        int i10 = i8 | ((bArr[i7] & UByte.MAX_VALUE) << 8);
        this.position = i2 + 4;
        return (bArr[i9] & UByte.MAX_VALUE) | i10;
    }

    public int readInt24() {
        byte[] bArr = this.data;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        int i5 = ((bArr[i2] & UByte.MAX_VALUE) << 24) >> 8;
        int i7 = i2 + 2;
        this.position = i7;
        int i8 = ((bArr[i3] & UByte.MAX_VALUE) << 8) | i5;
        this.position = i2 + 3;
        return (bArr[i7] & UByte.MAX_VALUE) | i8;
    }

    @Nullable
    public String readLine(Charset charset) {
        Assertions.checkArgument(SUPPORTED_CHARSETS_FOR_READLINE.contains(charset), "Unsupported charset: " + charset);
        if (bytesLeft() == 0) {
            return null;
        }
        if (!charset.equals(StandardCharsets.US_ASCII)) {
            readUtfCharsetFromBom();
        }
        String string = readString(findNextLineTerminator(charset) - this.position, charset);
        if (this.position == this.limit) {
            return string;
        }
        skipLineTerminator(charset);
        return string;
    }

    public int readLittleEndianInt() {
        byte[] bArr = this.data;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        int i5 = bArr[i2] & UByte.MAX_VALUE;
        int i7 = i2 + 2;
        this.position = i7;
        int i8 = ((bArr[i3] & UByte.MAX_VALUE) << 8) | i5;
        int i9 = i2 + 3;
        this.position = i9;
        int i10 = i8 | ((bArr[i7] & UByte.MAX_VALUE) << 16);
        this.position = i2 + 4;
        return ((bArr[i9] & UByte.MAX_VALUE) << 24) | i10;
    }

    public int readLittleEndianInt24() {
        byte[] bArr = this.data;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        int i5 = bArr[i2] & UByte.MAX_VALUE;
        int i7 = i2 + 2;
        this.position = i7;
        int i8 = ((bArr[i3] & UByte.MAX_VALUE) << 8) | i5;
        this.position = i2 + 3;
        return ((bArr[i7] & UByte.MAX_VALUE) << 16) | i8;
    }

    public long readLittleEndianLong() {
        byte[] bArr = this.data;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        long j2 = ((long) bArr[i2]) & 255;
        int i5 = i2 + 2;
        this.position = i5;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 8);
        int i7 = i2 + 3;
        this.position = i7;
        long j4 = j3 | ((((long) bArr[i5]) & 255) << 16);
        int i8 = i2 + 4;
        this.position = i8;
        long j5 = j4 | ((((long) bArr[i7]) & 255) << 24);
        int i9 = i2 + 5;
        this.position = i9;
        long j6 = j5 | ((((long) bArr[i8]) & 255) << 32);
        int i10 = i2 + 6;
        this.position = i10;
        long j7 = j6 | ((((long) bArr[i9]) & 255) << 40);
        int i11 = i2 + 7;
        this.position = i11;
        long j9 = j7 | ((((long) bArr[i10]) & 255) << 48);
        this.position = i2 + 8;
        return ((((long) bArr[i11]) & 255) << 56) | j9;
    }

    public short readLittleEndianShort() {
        byte[] bArr = this.data;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        int i5 = bArr[i2] & UByte.MAX_VALUE;
        this.position = i2 + 2;
        return (short) (((bArr[i3] & UByte.MAX_VALUE) << 8) | i5);
    }

    public long readLittleEndianUnsignedInt() {
        byte[] bArr = this.data;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        long j2 = ((long) bArr[i2]) & 255;
        int i5 = i2 + 2;
        this.position = i5;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 8);
        int i7 = i2 + 3;
        this.position = i7;
        long j4 = j3 | ((((long) bArr[i5]) & 255) << 16);
        this.position = i2 + 4;
        return ((((long) bArr[i7]) & 255) << 24) | j4;
    }

    public int readLittleEndianUnsignedInt24() {
        byte[] bArr = this.data;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        int i5 = bArr[i2] & UByte.MAX_VALUE;
        int i7 = i2 + 2;
        this.position = i7;
        int i8 = ((bArr[i3] & UByte.MAX_VALUE) << 8) | i5;
        this.position = i2 + 3;
        return ((bArr[i7] & UByte.MAX_VALUE) << 16) | i8;
    }

    public int readLittleEndianUnsignedShort() {
        byte[] bArr = this.data;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        int i5 = bArr[i2] & UByte.MAX_VALUE;
        this.position = i2 + 2;
        return ((bArr[i3] & UByte.MAX_VALUE) << 8) | i5;
    }

    public long readLong() {
        byte[] bArr = this.data;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        long j2 = (((long) bArr[i2]) & 255) << 56;
        int i5 = i2 + 2;
        this.position = i5;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 48);
        int i7 = i2 + 3;
        this.position = i7;
        long j4 = j3 | ((((long) bArr[i5]) & 255) << 40);
        int i8 = i2 + 4;
        this.position = i8;
        long j5 = j4 | ((((long) bArr[i7]) & 255) << 32);
        int i9 = i2 + 5;
        this.position = i9;
        long j6 = j5 | ((((long) bArr[i8]) & 255) << 24);
        int i10 = i2 + 6;
        this.position = i10;
        long j7 = j6 | ((((long) bArr[i9]) & 255) << 16);
        int i11 = i2 + 7;
        this.position = i11;
        long j9 = j7 | ((((long) bArr[i10]) & 255) << 8);
        this.position = i2 + 8;
        return (((long) bArr[i11]) & 255) | j9;
    }

    public short readShort() {
        byte[] bArr = this.data;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        int i5 = (bArr[i2] & UByte.MAX_VALUE) << 8;
        this.position = i2 + 2;
        return (short) ((bArr[i3] & UByte.MAX_VALUE) | i5);
    }

    public String readString(int i2, Charset charset) {
        String str = new String(this.data, this.position, i2, charset);
        this.position += i2;
        return str;
    }

    public int readUnsignedByte() {
        byte[] bArr = this.data;
        int i2 = this.position;
        this.position = i2 + 1;
        return bArr[i2] & UByte.MAX_VALUE;
    }

    public int readUnsignedFixedPoint1616() {
        byte[] bArr = this.data;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        int i5 = (bArr[i2] & UByte.MAX_VALUE) << 8;
        this.position = i2 + 2;
        int i7 = (bArr[i3] & UByte.MAX_VALUE) | i5;
        this.position = i2 + 4;
        return i7;
    }

    public long readUnsignedInt() {
        byte[] bArr = this.data;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        long j2 = (((long) bArr[i2]) & 255) << 24;
        int i5 = i2 + 2;
        this.position = i5;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        int i7 = i2 + 3;
        this.position = i7;
        long j4 = j3 | ((((long) bArr[i5]) & 255) << 8);
        this.position = i2 + 4;
        return (((long) bArr[i7]) & 255) | j4;
    }

    public int readUnsignedInt24() {
        byte[] bArr = this.data;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        int i5 = (bArr[i2] & UByte.MAX_VALUE) << 16;
        int i7 = i2 + 2;
        this.position = i7;
        int i8 = ((bArr[i3] & UByte.MAX_VALUE) << 8) | i5;
        this.position = i2 + 3;
        return (bArr[i7] & UByte.MAX_VALUE) | i8;
    }

    public long readUnsignedLeb128ToLong() {
        long j2 = 0;
        for (int i2 = 0; i2 < 9; i2++) {
            if (this.position == this.limit) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long unsignedByte = readUnsignedByte();
            j2 |= (127 & unsignedByte) << (i2 * 7);
            if ((unsignedByte & 128) == 0) {
                return j2;
            }
        }
        return j2;
    }

    public int readUnsignedShort() {
        byte[] bArr = this.data;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        int i5 = (bArr[i2] & UByte.MAX_VALUE) << 8;
        this.position = i2 + 2;
        return (bArr[i3] & UByte.MAX_VALUE) | i5;
    }

    public long readUtf8EncodedLong() {
        int i2;
        int i3;
        long j2 = this.data[this.position];
        int i5 = 7;
        while (true) {
            if (i5 < 0) {
                break;
            }
            int i7 = 1 << i5;
            if ((((long) i7) & j2) != 0) {
                i5--;
            } else if (i5 < 6) {
                j2 &= (long) (i7 - 1);
                i3 = 7 - i5;
            } else if (i5 == 7) {
                i3 = 1;
            }
        }
        i3 = 0;
        if (i3 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j2);
        }
        for (i2 = 1; i2 < i3; i2++) {
            byte b2 = this.data[this.position + i2];
            if ((b2 & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j2);
            }
            j2 = (j2 << 6) | ((long) (b2 & 63));
        }
        this.position += i3;
        return j2;
    }

    public void reset(byte[] bArr) {
        reset(bArr, bArr.length);
    }

    public void setLimit(int i2) {
        Assertions.checkArgument(i2 >= 0 && i2 <= this.data.length);
        this.limit = i2;
    }

    public void setPosition(int i2) {
        Assertions.checkArgument(i2 >= 0 && i2 <= this.limit);
        this.position = i2;
    }

    public void skipBytes(int i2) {
        setPosition(this.position + i2);
    }

    public ParsableByteArray(int i2) {
        this.data = new byte[i2];
        this.limit = i2;
    }

    private char readCharacterIfInList(Charset charset, char[] cArr) {
        int iPeekCharacterAndSize = peekCharacterAndSize(charset);
        if (iPeekCharacterAndSize != 0) {
            char c2 = (char) (iPeekCharacterAndSize >> 16);
            if (com.google.common.primitives.n.n(cArr, c2)) {
                this.position += iPeekCharacterAndSize & 65535;
                return c2;
            }
            return (char) 0;
        }
        return (char) 0;
    }

    public void ensureCapacity(int i2) {
        if (i2 > capacity()) {
            this.data = Arrays.copyOf(this.data, i2);
        }
    }

    public void readBytes(byte[] bArr, int i2, int i3) {
        System.arraycopy(this.data, this.position, bArr, i2, i3);
        this.position += i3;
    }

    @Nullable
    public String readDelimiterTerminatedString(char c2) {
        if (bytesLeft() == 0) {
            return null;
        }
        int i2 = this.position;
        while (i2 < this.limit && this.data[i2] != c2) {
            i2++;
        }
        byte[] bArr = this.data;
        int i3 = this.position;
        String strFromUtf8Bytes = Util.fromUtf8Bytes(bArr, i3, i2 - i3);
        this.position = i2;
        if (i2 < this.limit) {
            this.position = i2 + 1;
        }
        return strFromUtf8Bytes;
    }

    public double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public int readLittleEndianUnsignedIntToInt() {
        int littleEndianInt = readLittleEndianInt();
        if (littleEndianInt >= 0) {
            return littleEndianInt;
        }
        throw new IllegalStateException("Top bit not zero: " + littleEndianInt);
    }

    public int readSynchSafeInt() {
        return (readUnsignedByte() << 21) | (readUnsignedByte() << 14) | (readUnsignedByte() << 7) | readUnsignedByte();
    }

    public int readUnsignedIntToInt() {
        int i2 = readInt();
        if (i2 >= 0) {
            return i2;
        }
        throw new IllegalStateException("Top bit not zero: " + i2);
    }

    public int readUnsignedLeb128ToInt() {
        return com.google.common.primitives.Wre.nr(readUnsignedLeb128ToLong());
    }

    public long readUnsignedLongToLong() {
        long j2 = readLong();
        if (j2 >= 0) {
            return j2;
        }
        throw new IllegalStateException("Top bit not zero: " + j2);
    }

    @Nullable
    public Charset readUtfCharsetFromBom() {
        if (bytesLeft() >= 3) {
            byte[] bArr = this.data;
            int i2 = this.position;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.position = i2 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (bytesLeft() >= 2) {
            byte[] bArr2 = this.data;
            int i3 = this.position;
            byte b2 = bArr2[i3];
            if (b2 == -2 && bArr2[i3 + 1] == -1) {
                this.position = i3 + 2;
                return StandardCharsets.UTF_16BE;
            }
            if (b2 == -1 && bArr2[i3 + 1] == -2) {
                this.position = i3 + 2;
                return StandardCharsets.UTF_16LE;
            }
            return null;
        }
        return null;
    }

    public void reset(byte[] bArr, int i2) {
        this.data = bArr;
        this.limit = i2;
        this.position = 0;
    }

    public void readBytes(ByteBuffer byteBuffer, int i2) {
        byteBuffer.put(this.data, this.position, i2);
        this.position += i2;
    }

    public ParsableByteArray(byte[] bArr) {
        this.data = bArr;
        this.limit = bArr.length;
    }

    @Nullable
    public String readNullTerminatedString() {
        return readDelimiterTerminatedString((char) 0);
    }

    public ParsableByteArray(byte[] bArr, int i2) {
        this.data = bArr;
        this.limit = i2;
    }
}
