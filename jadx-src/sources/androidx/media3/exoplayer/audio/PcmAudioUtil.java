package androidx.media3.exoplayer.audio;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@UnstableApi
public final class PcmAudioUtil {
    public static int readAs32BitIntPcm(ByteBuffer byteBuffer, int i2) {
        if (i2 == 2) {
            return ((byteBuffer.get() & UByte.MAX_VALUE) << 24) | ((byteBuffer.get() & UByte.MAX_VALUE) << 16);
        }
        if (i2 == 3) {
            return (byteBuffer.get() & UByte.MAX_VALUE) << 24;
        }
        if (i2 == 4) {
            float fConstrainValue = Util.constrainValue(byteBuffer.getFloat(), -1.0f, 1.0f);
            return fConstrainValue < 0.0f ? (int) ((-fConstrainValue) * (-2.14748365E9f)) : (int) (fConstrainValue * 2.14748365E9f);
        }
        if (i2 == 21) {
            return ((byteBuffer.get() & UByte.MAX_VALUE) << 24) | ((byteBuffer.get() & UByte.MAX_VALUE) << 8) | ((byteBuffer.get() & UByte.MAX_VALUE) << 16);
        }
        if (i2 == 22) {
            return ((byteBuffer.get() & UByte.MAX_VALUE) << 24) | (byteBuffer.get() & UByte.MAX_VALUE) | ((byteBuffer.get() & UByte.MAX_VALUE) << 8) | ((byteBuffer.get() & UByte.MAX_VALUE) << 16);
        }
        if (i2 == 268435456) {
            return ((byteBuffer.get() & UByte.MAX_VALUE) << 16) | ((byteBuffer.get() & UByte.MAX_VALUE) << 24);
        }
        if (i2 == 1342177280) {
            return ((byteBuffer.get() & UByte.MAX_VALUE) << 8) | ((byteBuffer.get() & UByte.MAX_VALUE) << 24) | ((byteBuffer.get() & UByte.MAX_VALUE) << 16);
        }
        if (i2 == 1610612736) {
            return (byteBuffer.get() & UByte.MAX_VALUE) | ((byteBuffer.get() & UByte.MAX_VALUE) << 24) | ((byteBuffer.get() & UByte.MAX_VALUE) << 16) | ((byteBuffer.get() & UByte.MAX_VALUE) << 8);
        }
        throw new IllegalStateException();
    }

    public static void write32BitIntPcm(ByteBuffer byteBuffer, int i2, int i3) {
        if (i3 == 2) {
            byteBuffer.put((byte) (i2 >> 16));
            byteBuffer.put((byte) (i2 >> 24));
            return;
        }
        if (i3 == 3) {
            byteBuffer.put((byte) (i2 >> 24));
            return;
        }
        if (i3 == 4) {
            if (i2 < 0) {
                byteBuffer.putFloat((-i2) / (-2.14748365E9f));
                return;
            } else {
                byteBuffer.putFloat(i2 / 2.14748365E9f);
                return;
            }
        }
        if (i3 == 21) {
            byteBuffer.put((byte) (i2 >> 8));
            byteBuffer.put((byte) (i2 >> 16));
            byteBuffer.put((byte) (i2 >> 24));
            return;
        }
        if (i3 == 22) {
            byteBuffer.put((byte) i2);
            byteBuffer.put((byte) (i2 >> 8));
            byteBuffer.put((byte) (i2 >> 16));
            byteBuffer.put((byte) (i2 >> 24));
            return;
        }
        if (i3 == 268435456) {
            byteBuffer.put((byte) (i2 >> 24));
            byteBuffer.put((byte) (i2 >> 16));
            return;
        }
        if (i3 == 1342177280) {
            byteBuffer.put((byte) (i2 >> 24));
            byteBuffer.put((byte) (i2 >> 16));
            byteBuffer.put((byte) (i2 >> 8));
        } else {
            if (i3 != 1610612736) {
                throw new IllegalStateException();
            }
            byteBuffer.put((byte) (i2 >> 24));
            byteBuffer.put((byte) (i2 >> 16));
            byteBuffer.put((byte) (i2 >> 8));
            byteBuffer.put((byte) i2);
        }
    }

    private PcmAudioUtil() {
    }

    public static ByteBuffer rampUpVolume(ByteBuffer byteBuffer, int i2, int i3, int i5, int i7) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
        int iPosition = byteBuffer.position();
        while (byteBuffer.hasRemaining() && i5 < i7) {
            write32BitIntPcm(byteBufferOrder, (int) ((((long) readAs32BitIntPcm(byteBuffer, i2)) * ((long) i5)) / ((long) i7)), i2);
            if (byteBuffer.position() == iPosition + i3) {
                i5++;
                iPosition = byteBuffer.position();
            }
        }
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.flip();
        return byteBufferOrder;
    }
}
