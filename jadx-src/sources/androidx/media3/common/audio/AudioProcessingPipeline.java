package androidx.media3.common.audio;

import androidx.annotation.Nullable;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.nKK;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@UnstableApi
public final class AudioProcessingPipeline {
    private final nKK audioProcessors;
    private boolean inputEnded;
    private AudioProcessor.AudioFormat outputAudioFormat;
    private AudioProcessor.AudioFormat pendingOutputAudioFormat;
    private final List<AudioProcessor> activeAudioProcessors = new ArrayList();
    private ByteBuffer[] outputBuffers = new ByteBuffer[0];

    private void processData(ByteBuffer byteBuffer) {
        boolean z2;
        for (boolean z3 = true; z3; z3 = z2) {
            z2 = false;
            int i2 = 0;
            while (i2 <= getFinalOutputBufferIndex()) {
                if (!this.outputBuffers[i2].hasRemaining()) {
                    AudioProcessor audioProcessor = this.activeAudioProcessors.get(i2);
                    if (!audioProcessor.isEnded()) {
                        ByteBuffer byteBuffer2 = i2 > 0 ? this.outputBuffers[i2 - 1] : byteBuffer.hasRemaining() ? byteBuffer : AudioProcessor.EMPTY_BUFFER;
                        long jRemaining = byteBuffer2.remaining();
                        audioProcessor.queueInput(byteBuffer2);
                        this.outputBuffers[i2] = audioProcessor.getOutput();
                        z2 |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.outputBuffers[i2].hasRemaining();
                    } else if (!this.outputBuffers[i2].hasRemaining() && i2 < getFinalOutputBufferIndex()) {
                        this.activeAudioProcessors.get(i2 + 1).queueEndOfStream();
                    }
                }
                i2++;
            }
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioProcessingPipeline)) {
            return false;
        }
        AudioProcessingPipeline audioProcessingPipeline = (AudioProcessingPipeline) obj;
        if (this.audioProcessors.size() != audioProcessingPipeline.audioProcessors.size()) {
            return false;
        }
        for (int i2 = 0; i2 < this.audioProcessors.size(); i2++) {
            if (this.audioProcessors.get(i2) != audioProcessingPipeline.audioProcessors.get(i2)) {
                return false;
            }
        }
        return true;
    }

    public void reset() {
        for (int i2 = 0; i2 < this.audioProcessors.size(); i2++) {
            AudioProcessor audioProcessor = (AudioProcessor) this.audioProcessors.get(i2);
            audioProcessor.flush();
            audioProcessor.reset();
        }
        this.outputBuffers = new ByteBuffer[0];
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.NOT_SET;
        this.outputAudioFormat = audioFormat;
        this.pendingOutputAudioFormat = audioFormat;
        this.inputEnded = false;
    }

    private int getFinalOutputBufferIndex() {
        return this.outputBuffers.length - 1;
    }

    public AudioProcessor.AudioFormat configure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        if (audioFormat.equals(AudioProcessor.AudioFormat.NOT_SET)) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        for (int i2 = 0; i2 < this.audioProcessors.size(); i2++) {
            AudioProcessor audioProcessor = (AudioProcessor) this.audioProcessors.get(i2);
            AudioProcessor.AudioFormat audioFormatConfigure = audioProcessor.configure(audioFormat);
            if (audioProcessor.isActive()) {
                Assertions.checkState(!audioFormatConfigure.equals(AudioProcessor.AudioFormat.NOT_SET));
                audioFormat = audioFormatConfigure;
            }
        }
        this.pendingOutputAudioFormat = audioFormat;
        return audioFormat;
    }

    public void flush() {
        this.activeAudioProcessors.clear();
        this.outputAudioFormat = this.pendingOutputAudioFormat;
        this.inputEnded = false;
        for (int i2 = 0; i2 < this.audioProcessors.size(); i2++) {
            AudioProcessor audioProcessor = (AudioProcessor) this.audioProcessors.get(i2);
            audioProcessor.flush();
            if (audioProcessor.isActive()) {
                this.activeAudioProcessors.add(audioProcessor);
            }
        }
        this.outputBuffers = new ByteBuffer[this.activeAudioProcessors.size()];
        for (int i3 = 0; i3 <= getFinalOutputBufferIndex(); i3++) {
            this.outputBuffers[i3] = this.activeAudioProcessors.get(i3).getOutput();
        }
    }

    public AudioProcessor.AudioFormat getOutputAudioFormat() {
        return this.outputAudioFormat;
    }

    public int hashCode() {
        return this.audioProcessors.hashCode();
    }

    public boolean isEnded() {
        return this.inputEnded && this.activeAudioProcessors.get(getFinalOutputBufferIndex()).isEnded() && !this.outputBuffers[getFinalOutputBufferIndex()].hasRemaining();
    }

    public boolean isOperational() {
        return !this.activeAudioProcessors.isEmpty();
    }

    public AudioProcessingPipeline(nKK nkk) {
        this.audioProcessors = nkk;
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.NOT_SET;
        this.outputAudioFormat = audioFormat;
        this.pendingOutputAudioFormat = audioFormat;
        this.inputEnded = false;
    }

    public ByteBuffer getOutput() {
        if (!isOperational()) {
            return AudioProcessor.EMPTY_BUFFER;
        }
        ByteBuffer byteBuffer = this.outputBuffers[getFinalOutputBufferIndex()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        processData(AudioProcessor.EMPTY_BUFFER);
        return this.outputBuffers[getFinalOutputBufferIndex()];
    }

    public void queueEndOfStream() {
        if (isOperational() && !this.inputEnded) {
            this.inputEnded = true;
            this.activeAudioProcessors.get(0).queueEndOfStream();
        }
    }

    public void queueInput(ByteBuffer byteBuffer) {
        if (isOperational() && !this.inputEnded) {
            processData(byteBuffer);
        }
    }
}
