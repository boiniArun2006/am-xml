package com.google.android.exoplayer2.text.cea;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderOutputBuffer;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoder;
import com.google.android.exoplayer2.text.SubtitleInputBuffer;
import com.google.android.exoplayer2.text.SubtitleOutputBuffer;
import com.google.android.exoplayer2.text.cea.w6;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
abstract class w6 implements SubtitleDecoder {
    private static final int NUM_INPUT_BUFFERS = 10;
    private static final int NUM_OUTPUT_BUFFERS = 2;
    private final ArrayDeque<n> availableInputBuffers = new ArrayDeque<>();
    private final ArrayDeque<SubtitleOutputBuffer> availableOutputBuffers;

    @Nullable
    private n dequeuedInputBuffer;
    private long playbackPositionUs;
    private long queuedInputBufferCount;
    private final PriorityQueue<n> queuedInputBuffers;

    private static final class n extends SubtitleInputBuffer implements Comparable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private long f58288n;

        private n() {
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public int compareTo(n nVar) {
            if (isEndOfStream() != nVar.isEndOfStream()) {
                if (!isEndOfStream()) {
                    return -1;
                }
                return 1;
            }
            long j2 = this.timeUs - nVar.timeUs;
            if (j2 == 0) {
                j2 = this.f58288n - nVar.f58288n;
                if (j2 == 0) {
                    return 0;
                }
            }
            if (j2 <= 0) {
                return -1;
            }
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.google.android.exoplayer2.text.cea.w6$w6, reason: collision with other inner class name */
    static final class C0771w6 extends SubtitleOutputBuffer {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private DecoderOutputBuffer.Owner f58289n;

        @Override // com.google.android.exoplayer2.decoder.DecoderOutputBuffer
        public final void release() {
            this.f58289n.releaseOutputBuffer(this);
        }

        public C0771w6(DecoderOutputBuffer.Owner owner) {
            this.f58289n = owner;
        }
    }

    protected abstract Subtitle createSubtitle();

    protected abstract void decode(SubtitleInputBuffer subtitleInputBuffer);

    protected abstract boolean isNewSubtitleDataAvailable();

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public void release() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.decoder.Decoder
    public SubtitleInputBuffer dequeueInputBuffer() {
        Assertions.checkState(this.dequeuedInputBuffer == null);
        if (this.availableInputBuffers.isEmpty()) {
            return null;
        }
        n nVarPollFirst = this.availableInputBuffers.pollFirst();
        this.dequeuedInputBuffer = nVarPollFirst;
        return nVarPollFirst;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.decoder.Decoder
    public SubtitleOutputBuffer dequeueOutputBuffer() {
        if (this.availableOutputBuffers.isEmpty()) {
            return null;
        }
        while (!this.queuedInputBuffers.isEmpty() && ((n) Util.castNonNull(this.queuedInputBuffers.peek())).timeUs <= this.playbackPositionUs) {
            n nVar = (n) Util.castNonNull(this.queuedInputBuffers.poll());
            if (nVar.isEndOfStream()) {
                SubtitleOutputBuffer subtitleOutputBuffer = (SubtitleOutputBuffer) Util.castNonNull(this.availableOutputBuffers.pollFirst());
                subtitleOutputBuffer.addFlag(4);
                n(nVar);
                return subtitleOutputBuffer;
            }
            decode(nVar);
            if (isNewSubtitleDataAvailable()) {
                Subtitle subtitleCreateSubtitle = createSubtitle();
                SubtitleOutputBuffer subtitleOutputBuffer2 = (SubtitleOutputBuffer) Util.castNonNull(this.availableOutputBuffers.pollFirst());
                subtitleOutputBuffer2.setContent(nVar.timeUs, subtitleCreateSubtitle, Long.MAX_VALUE);
                n(nVar);
                return subtitleOutputBuffer2;
            }
            n(nVar);
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public void flush() {
        this.queuedInputBufferCount = 0L;
        this.playbackPositionUs = 0L;
        while (!this.queuedInputBuffers.isEmpty()) {
            n((n) Util.castNonNull(this.queuedInputBuffers.poll()));
        }
        n nVar = this.dequeuedInputBuffer;
        if (nVar != null) {
            n(nVar);
            this.dequeuedInputBuffer = null;
        }
    }

    @Nullable
    protected final SubtitleOutputBuffer getAvailableOutputBuffer() {
        return this.availableOutputBuffers.pollFirst();
    }

    protected final long getPositionUs() {
        return this.playbackPositionUs;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.decoder.Decoder
    public void queueInputBuffer(SubtitleInputBuffer subtitleInputBuffer) {
        Assertions.checkArgument(subtitleInputBuffer == this.dequeuedInputBuffer);
        n nVar = (n) subtitleInputBuffer;
        if (nVar.isDecodeOnly()) {
            n(nVar);
        } else {
            long j2 = this.queuedInputBufferCount;
            this.queuedInputBufferCount = 1 + j2;
            nVar.f58288n = j2;
            this.queuedInputBuffers.add(nVar);
        }
        this.dequeuedInputBuffer = null;
    }

    @Override // com.google.android.exoplayer2.text.SubtitleDecoder
    public void setPositionUs(long j2) {
        this.playbackPositionUs = j2;
    }

    public w6() {
        for (int i2 = 0; i2 < 10; i2++) {
            this.availableInputBuffers.add(new n());
        }
        this.availableOutputBuffers = new ArrayDeque<>();
        for (int i3 = 0; i3 < 2; i3++) {
            this.availableOutputBuffers.add(new C0771w6(new DecoderOutputBuffer.Owner() { // from class: com.google.android.exoplayer2.text.cea.n
                @Override // com.google.android.exoplayer2.decoder.DecoderOutputBuffer.Owner
                public final void releaseOutputBuffer(DecoderOutputBuffer decoderOutputBuffer) {
                    this.f58287n.releaseOutputBuffer((w6.C0771w6) decoderOutputBuffer);
                }
            }));
        }
        this.queuedInputBuffers = new PriorityQueue<>();
    }

    private void n(n nVar) {
        nVar.clear();
        this.availableInputBuffers.add(nVar);
    }

    protected void releaseOutputBuffer(SubtitleOutputBuffer subtitleOutputBuffer) {
        subtitleOutputBuffer.clear();
        this.availableOutputBuffers.add(subtitleOutputBuffer);
    }
}
