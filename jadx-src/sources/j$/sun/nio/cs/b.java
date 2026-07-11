package j$.sun.nio.cs;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
final class b extends CharsetEncoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f68894a;

    @Override // java.nio.charset.CharsetEncoder
    public final boolean canEncode(char c2) {
        return c2 <= 255;
    }

    @Override // java.nio.charset.CharsetEncoder
    public final boolean isLegalReplacement(byte[] bArr) {
        return true;
    }

    b(c cVar) {
        super(cVar, 1.0f, 1.0f);
        this.f68894a = new e();
    }

    private static int a(char[] cArr, int i2, byte[] bArr, int i3, int i5) {
        int i7 = 0;
        if (i5 <= 0) {
            return 0;
        }
        Objects.requireNonNull(cArr);
        Objects.requireNonNull(bArr);
        if (i2 < 0 || i2 >= cArr.length) {
            throw new ArrayIndexOutOfBoundsException(i2);
        }
        if (i3 < 0 || i3 >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i3);
        }
        int i8 = (i2 + i5) - 1;
        if (i8 < 0 || i8 >= cArr.length) {
            throw new ArrayIndexOutOfBoundsException(i8);
        }
        int i9 = (i3 + i5) - 1;
        if (i9 < 0 || i9 >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i9);
        }
        while (i7 < i5) {
            int i10 = i2 + 1;
            char c2 = cArr[i2];
            if (c2 > 255) {
                break;
            }
            bArr[i3] = (byte) c2;
            i7++;
            i2 = i10;
            i3++;
        }
        return i7;
    }

    @Override // java.nio.charset.CharsetEncoder
    protected final CoderResult encodeLoop(CharBuffer charBuffer, ByteBuffer byteBuffer) {
        CoderResult coderResultD;
        CoderResult coderResultD2;
        boolean zHasArray = charBuffer.hasArray();
        e eVar = this.f68894a;
        if (zHasArray && byteBuffer.hasArray()) {
            char[] cArrArray = charBuffer.array();
            int iArrayOffset = charBuffer.arrayOffset();
            int iPosition = charBuffer.position() + iArrayOffset;
            int iLimit = charBuffer.limit() + iArrayOffset;
            if (iPosition > iLimit) {
                iPosition = iLimit;
            }
            byte[] bArrArray = byteBuffer.array();
            int iArrayOffset2 = byteBuffer.arrayOffset();
            int iPosition2 = byteBuffer.position() + iArrayOffset2;
            int iLimit2 = byteBuffer.limit() + iArrayOffset2;
            if (iPosition2 > iLimit2) {
                iPosition2 = iLimit2;
            }
            int i2 = iLimit2 - iPosition2;
            int i3 = iLimit - iPosition;
            if (i2 >= i3) {
                i2 = i3;
            }
            try {
                int iA = a(cArrArray, iPosition, bArrArray, iPosition2, i2);
                int i5 = iPosition + iA;
                int i7 = iPosition2 + iA;
                if (iA != i2) {
                    if (eVar.c(cArrArray[i5], cArrArray, i5, iLimit) < 0) {
                        coderResultD2 = eVar.a();
                    } else {
                        coderResultD2 = eVar.d();
                    }
                } else if (i2 < i3) {
                    coderResultD2 = CoderResult.OVERFLOW;
                } else {
                    coderResultD2 = CoderResult.UNDERFLOW;
                }
                return coderResultD2;
            } catch (Throwable th) {
                throw th;
            }
        }
        int iPosition3 = charBuffer.position();
        while (true) {
            try {
                if (charBuffer.hasRemaining()) {
                    char c2 = charBuffer.get();
                    if (c2 <= 255) {
                        if (!byteBuffer.hasRemaining()) {
                            coderResultD = CoderResult.OVERFLOW;
                            break;
                        }
                        byteBuffer.put((byte) c2);
                        iPosition3++;
                    } else if (eVar.b(c2, charBuffer) < 0) {
                        coderResultD = eVar.a();
                    } else {
                        coderResultD = eVar.d();
                    }
                } else {
                    coderResultD = CoderResult.UNDERFLOW;
                    break;
                }
            } finally {
            }
        }
        return coderResultD;
    }
}
