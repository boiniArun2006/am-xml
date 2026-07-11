package B7;

import com.caoccao.javet.utils.Float16;
import java.nio.ShortBuffer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class Wre {
    /* JADX INFO: Access modifiers changed from: private */
    public static final float J2(int i2) {
        return i2 / Float16.EXPONENT_SIGNIFICAND_MASK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ShortBuffer O(ShortBuffer shortBuffer) {
        ShortBuffer shortBufferAllocate = ShortBuffer.allocate(shortBuffer.remaining());
        shortBufferAllocate.put(shortBufferAllocate.duplicate());
        shortBufferAllocate.flip();
        return shortBufferAllocate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Sequence nr(ShortBuffer shortBuffer, ShortBuffer shortBuffer2, int i2) {
        if (shortBuffer2.remaining() < i2) {
            ShortBuffer shortBufferDuplicate = shortBuffer2.duplicate();
            ShortBuffer receiverCopy = shortBuffer.duplicate();
            int iRemaining = shortBuffer2.remaining() + shortBuffer.remaining();
            if (iRemaining < i2) {
                ShortBuffer shortBufferAllocate = ShortBuffer.allocate(iRemaining);
                shortBufferAllocate.put(shortBufferDuplicate);
                shortBufferAllocate.put(receiverCopy);
                shortBufferAllocate.flip();
                return SequencesKt.sequenceOf(shortBufferAllocate);
            }
            ShortBuffer shortBufferAllocate2 = ShortBuffer.allocate(i2);
            int iRemaining2 = shortBufferDuplicate.remaining();
            shortBufferAllocate2.put(shortBufferDuplicate);
            receiverCopy.limit((shortBuffer.position() + i2) - iRemaining2);
            shortBufferAllocate2.put(receiverCopy);
            receiverCopy.limit(shortBuffer.limit());
            shortBufferAllocate2.flip();
            Sequence sequenceSequenceOf = SequencesKt.sequenceOf(shortBufferAllocate2);
            Intrinsics.checkNotNullExpressionValue(receiverCopy, "receiverCopy");
            return SequencesKt.plus(sequenceSequenceOf, v9.Dsr.n(receiverCopy, i2));
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
