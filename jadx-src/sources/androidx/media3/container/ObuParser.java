package androidx.media3.container;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.UnstableApi;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@UnstableApi
public final class ObuParser {
    public static final int OBU_FRAME = 6;
    public static final int OBU_FRAME_HEADER = 3;
    public static final int OBU_PADDING = 15;
    public static final int OBU_SEQUENCE_HEADER = 1;
    public static final int OBU_TEMPORAL_DELIMITER = 2;

    public static final class FrameHeader {
        private static final int FRAME_TYPE_INTRA_ONLY_FRAME = 2;
        private static final int FRAME_TYPE_KEY_FRAME = 0;
        private static final int FRAME_TYPE_SWITCH_FRAME = 3;
        private static final int PROBE_BYTES = 4;
        private final boolean isDependedOn;

        @Nullable
        public static FrameHeader parse(SequenceHeader sequenceHeader, Obu obu) {
            try {
                return new FrameHeader(sequenceHeader, obu);
            } catch (NotYetImplementedException unused) {
                return null;
            }
        }

        public boolean isDependedOn() {
            return this.isDependedOn;
        }

        private FrameHeader(SequenceHeader sequenceHeader, Obu obu) throws NotYetImplementedException {
            boolean z2;
            boolean bit;
            int bits;
            int i2 = obu.type;
            if (i2 != 6 && i2 != 3) {
                z2 = false;
            } else {
                z2 = true;
            }
            Assertions.checkArgument(z2);
            byte[] bArr = new byte[Math.min(4, obu.payload.remaining())];
            obu.payload.asReadOnlyBuffer().get(bArr);
            ParsableBitArray parsableBitArray = new ParsableBitArray(bArr);
            ObuParser.throwWhenFeatureRequired(sequenceHeader.reducedStillPictureHeader);
            if (parsableBitArray.readBit()) {
                this.isDependedOn = false;
                return;
            }
            int bits2 = parsableBitArray.readBits(2);
            boolean bit2 = parsableBitArray.readBit();
            ObuParser.throwWhenFeatureRequired(sequenceHeader.decoderModelInfoPresentFlag);
            if (!bit2) {
                this.isDependedOn = true;
                return;
            }
            if (bits2 != 3 && bits2 != 0) {
                bit = parsableBitArray.readBit();
            } else {
                bit = true;
            }
            parsableBitArray.skipBit();
            ObuParser.throwWhenFeatureRequired(!sequenceHeader.seqForceScreenContentTools);
            if (parsableBitArray.readBit()) {
                ObuParser.throwWhenFeatureRequired(!sequenceHeader.seqForceIntegerMv);
                parsableBitArray.skipBit();
            }
            ObuParser.throwWhenFeatureRequired(sequenceHeader.frameIdNumbersPresentFlag);
            if (bits2 != 3) {
                parsableBitArray.skipBit();
            }
            parsableBitArray.skipBits(sequenceHeader.orderHintBits);
            if (bits2 != 2 && bits2 != 0 && !bit) {
                parsableBitArray.skipBits(3);
            }
            if (bits2 != 3 && bits2 != 0) {
                bits = parsableBitArray.readBits(8);
            } else {
                bits = 255;
            }
            this.isDependedOn = bits != 0;
        }
    }

    private static class NotYetImplementedException extends Exception {
        private NotYetImplementedException() {
        }
    }

    public static final class Obu {
        public final ByteBuffer payload;
        public final int type;

        private Obu(int i2, ByteBuffer byteBuffer) {
            this.type = i2;
            this.payload = byteBuffer;
        }
    }

    public static final class SequenceHeader {
        public final boolean decoderModelInfoPresentFlag;
        public final boolean frameIdNumbersPresentFlag;
        public final int orderHintBits;
        public final boolean reducedStillPictureHeader;
        public final boolean seqForceIntegerMv;
        public final boolean seqForceScreenContentTools;

        @Nullable
        public static SequenceHeader parse(Obu obu) {
            try {
                return new SequenceHeader(obu);
            } catch (NotYetImplementedException unused) {
                return null;
            }
        }

        private static void skipTimingInfo(ParsableBitArray parsableBitArray) {
            parsableBitArray.skipBits(64);
            if (parsableBitArray.readBit()) {
                ObuParser.skipUvlc(parsableBitArray);
            }
        }

        private SequenceHeader(Obu obu) throws NotYetImplementedException {
            boolean z2;
            if (obu.type == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            Assertions.checkArgument(z2);
            byte[] bArr = new byte[obu.payload.remaining()];
            obu.payload.asReadOnlyBuffer().get(bArr);
            ParsableBitArray parsableBitArray = new ParsableBitArray(bArr);
            parsableBitArray.skipBits(4);
            boolean bit = parsableBitArray.readBit();
            this.reducedStillPictureHeader = bit;
            ObuParser.throwWhenFeatureRequired(bit);
            if (parsableBitArray.readBit()) {
                skipTimingInfo(parsableBitArray);
                boolean bit2 = parsableBitArray.readBit();
                this.decoderModelInfoPresentFlag = bit2;
                if (bit2) {
                    parsableBitArray.skipBits(47);
                }
            } else {
                this.decoderModelInfoPresentFlag = false;
            }
            boolean bit3 = parsableBitArray.readBit();
            int bits = parsableBitArray.readBits(5);
            for (int i2 = 0; i2 <= bits; i2++) {
                parsableBitArray.skipBits(12);
                if (parsableBitArray.readBits(5) > 7) {
                    parsableBitArray.skipBit();
                }
                ObuParser.throwWhenFeatureRequired(this.decoderModelInfoPresentFlag);
                if (bit3 && parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(4);
                }
            }
            int bits2 = parsableBitArray.readBits(4);
            int bits3 = parsableBitArray.readBits(4);
            parsableBitArray.skipBits(bits2 + 1);
            parsableBitArray.skipBits(bits3 + 1);
            boolean bit4 = parsableBitArray.readBit();
            this.frameIdNumbersPresentFlag = bit4;
            ObuParser.throwWhenFeatureRequired(bit4);
            parsableBitArray.skipBits(3);
            parsableBitArray.skipBits(4);
            boolean bit5 = parsableBitArray.readBit();
            if (bit5) {
                parsableBitArray.skipBits(2);
            }
            if (parsableBitArray.readBit()) {
                this.seqForceScreenContentTools = true;
            } else {
                this.seqForceScreenContentTools = parsableBitArray.readBit();
            }
            if (!this.seqForceScreenContentTools || parsableBitArray.readBit()) {
                this.seqForceIntegerMv = true;
            } else {
                this.seqForceIntegerMv = parsableBitArray.readBit();
            }
            if (bit5) {
                this.orderHintBits = parsableBitArray.readBits(3) + 1;
            } else {
                this.orderHintBits = 0;
            }
        }
    }

    private static int leb128(ByteBuffer byteBuffer) {
        int i2 = 0;
        for (int i3 = 0; i3 < 8; i3++) {
            byte b2 = byteBuffer.get();
            i2 |= (b2 & ByteCompanionObject.MAX_VALUE) << (i3 * 7);
            if ((b2 & ByteCompanionObject.MIN_VALUE) == 0) {
                return i2;
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void skipUvlc(ParsableBitArray parsableBitArray) {
        int i2 = 0;
        while (!parsableBitArray.readBit()) {
            i2++;
        }
        if (i2 < 32) {
            parsableBitArray.skipBits(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void throwWhenFeatureRequired(boolean z2) throws NotYetImplementedException {
        if (z2) {
            throw new NotYetImplementedException();
        }
    }

    private ObuParser() {
    }

    public static List<Obu> split(ByteBuffer byteBuffer) {
        int iRemaining;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (byteBufferAsReadOnlyBuffer.hasRemaining()) {
            byte b2 = byteBufferAsReadOnlyBuffer.get();
            int i2 = (b2 >> 3) & 15;
            if (((b2 >> 2) & 1) != 0) {
                byteBufferAsReadOnlyBuffer.get();
            }
            if (((b2 >> 1) & 1) != 0) {
                iRemaining = leb128(byteBufferAsReadOnlyBuffer);
            } else {
                iRemaining = byteBufferAsReadOnlyBuffer.remaining();
            }
            ByteBuffer byteBufferDuplicate = byteBufferAsReadOnlyBuffer.duplicate();
            byteBufferDuplicate.limit(byteBufferAsReadOnlyBuffer.position() + iRemaining);
            arrayList.add(new Obu(i2, byteBufferDuplicate));
            byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + iRemaining);
        }
        return arrayList;
    }
}
