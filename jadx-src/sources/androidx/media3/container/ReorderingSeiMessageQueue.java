package androidx.media3.container;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@RestrictTo
@UnstableApi
public final class ReorderingSeiMessageQueue {

    @Nullable
    private SampleSeiMessages lastQueuedMessage;
    private final SeiConsumer seiConsumer;
    private final ArrayDeque<ParsableByteArray> unusedParsableByteArrays = new ArrayDeque<>();
    private final ArrayDeque<SampleSeiMessages> unusedSampleSeiMessages = new ArrayDeque<>();
    private final PriorityQueue<SampleSeiMessages> pendingSeiMessages = new PriorityQueue<>();
    private int reorderingQueueSize = -1;

    private static final class SampleSeiMessages implements Comparable<SampleSeiMessages> {
        public long presentationTimeUs = -9223372036854775807L;
        public final List<ParsableByteArray> nalBuffers = new ArrayList();

        @Override // java.lang.Comparable
        public int compareTo(SampleSeiMessages sampleSeiMessages) {
            return Long.compare(this.presentationTimeUs, sampleSeiMessages.presentationTimeUs);
        }

        public void init(long j2, ParsableByteArray parsableByteArray) {
            boolean z2;
            if (j2 != -9223372036854775807L) {
                z2 = true;
            } else {
                z2 = false;
            }
            Assertions.checkArgument(z2);
            Assertions.checkState(this.nalBuffers.isEmpty());
            this.presentationTimeUs = j2;
            this.nalBuffers.add(parsableByteArray);
        }
    }

    public interface SeiConsumer {
        void consume(long j2, ParsableByteArray parsableByteArray);
    }

    public void flush() {
        flushQueueDownToSize(0);
    }

    private ParsableByteArray copy(ParsableByteArray parsableByteArray) {
        ParsableByteArray parsableByteArray2 = this.unusedParsableByteArrays.isEmpty() ? new ParsableByteArray() : this.unusedParsableByteArrays.pop();
        parsableByteArray2.reset(parsableByteArray.bytesLeft());
        System.arraycopy(parsableByteArray.getData(), parsableByteArray.getPosition(), parsableByteArray2.getData(), 0, parsableByteArray2.bytesLeft());
        return parsableByteArray2;
    }

    private void flushQueueDownToSize(int i2) {
        while (this.pendingSeiMessages.size() > i2) {
            SampleSeiMessages sampleSeiMessages = (SampleSeiMessages) Util.castNonNull(this.pendingSeiMessages.poll());
            for (int i3 = 0; i3 < sampleSeiMessages.nalBuffers.size(); i3++) {
                this.seiConsumer.consume(sampleSeiMessages.presentationTimeUs, sampleSeiMessages.nalBuffers.get(i3));
                this.unusedParsableByteArrays.push(sampleSeiMessages.nalBuffers.get(i3));
            }
            sampleSeiMessages.nalBuffers.clear();
            SampleSeiMessages sampleSeiMessages2 = this.lastQueuedMessage;
            if (sampleSeiMessages2 != null && sampleSeiMessages2.presentationTimeUs == sampleSeiMessages.presentationTimeUs) {
                this.lastQueuedMessage = null;
            }
            this.unusedSampleSeiMessages.push(sampleSeiMessages);
        }
    }

    public void add(long j2, ParsableByteArray parsableByteArray) {
        int i2 = this.reorderingQueueSize;
        if (i2 == 0 || (i2 != -1 && this.pendingSeiMessages.size() >= this.reorderingQueueSize && j2 < ((SampleSeiMessages) Util.castNonNull(this.pendingSeiMessages.peek())).presentationTimeUs)) {
            this.seiConsumer.consume(j2, parsableByteArray);
            return;
        }
        ParsableByteArray parsableByteArrayCopy = copy(parsableByteArray);
        SampleSeiMessages sampleSeiMessages = this.lastQueuedMessage;
        if (sampleSeiMessages != null && j2 == sampleSeiMessages.presentationTimeUs) {
            sampleSeiMessages.nalBuffers.add(parsableByteArrayCopy);
            return;
        }
        SampleSeiMessages sampleSeiMessages2 = this.unusedSampleSeiMessages.isEmpty() ? new SampleSeiMessages() : this.unusedSampleSeiMessages.pop();
        sampleSeiMessages2.init(j2, parsableByteArrayCopy);
        this.pendingSeiMessages.add(sampleSeiMessages2);
        this.lastQueuedMessage = sampleSeiMessages2;
        int i3 = this.reorderingQueueSize;
        if (i3 != -1) {
            flushQueueDownToSize(i3);
        }
    }

    public void clear() {
        this.pendingSeiMessages.clear();
    }

    public int getMaxSize() {
        return this.reorderingQueueSize;
    }

    public void setMaxSize(int i2) {
        Assertions.checkState(i2 >= 0);
        this.reorderingQueueSize = i2;
        flushQueueDownToSize(i2);
    }

    public ReorderingSeiMessageQueue(SeiConsumer seiConsumer) {
        this.seiConsumer = seiConsumer;
    }
}
