package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@UnstableApi
public final class ToInt16PcmAudioProcessor extends BaseAudioProcessor {
    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        int i2 = audioFormat.encoding;
        if (i2 == 3 || i2 == 2 || i2 == 268435456 || i2 == 21 || i2 == 1342177280 || i2 == 22 || i2 == 1610612736 || i2 == 4) {
            return i2 != 2 ? new AudioProcessor.AudioFormat(audioFormat.sampleRate, audioFormat.channelCount, 2) : AudioProcessor.AudioFormat.NOT_SET;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    @Override // androidx.media3.common.audio.AudioProcessor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void queueInput(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        int i3 = this.inputAudioFormat.encoding;
        if (i3 != 3) {
            if (i3 != 4) {
                if (i3 != 21) {
                    if (i3 != 22) {
                        if (i3 != 268435456) {
                            if (i3 != 1342177280) {
                                if (i3 != 1610612736) {
                                    throw new IllegalStateException();
                                }
                                i2 /= 2;
                            }
                        }
                    }
                }
                i2 /= 3;
                i2 *= 2;
            } else {
                i2 /= 2;
            }
        } else {
            i2 *= 2;
        }
        ByteBuffer byteBufferReplaceOutputBuffer = replaceOutputBuffer(i2);
        int i5 = this.inputAudioFormat.encoding;
        if (i5 != 3) {
            if (i5 != 4) {
                if (i5 != 21) {
                    if (i5 != 22) {
                        if (i5 != 268435456) {
                            if (i5 != 1342177280) {
                                if (i5 == 1610612736) {
                                    while (iPosition < iLimit) {
                                        byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition + 1));
                                        byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition));
                                        iPosition += 4;
                                    }
                                } else {
                                    throw new IllegalStateException();
                                }
                            } else {
                                while (iPosition < iLimit) {
                                    byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition + 1));
                                    byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition));
                                    iPosition += 3;
                                }
                            }
                        } else {
                            while (iPosition < iLimit) {
                                byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition + 1));
                                byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition));
                                iPosition += 2;
                            }
                        }
                    } else {
                        while (iPosition < iLimit) {
                            byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition + 2));
                            byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition + 3));
                            iPosition += 4;
                        }
                    }
                } else {
                    while (iPosition < iLimit) {
                        byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition + 1));
                        byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition + 2));
                        iPosition += 3;
                    }
                }
            } else {
                while (iPosition < iLimit) {
                    short sConstrainValue = (short) (Util.constrainValue(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                    byteBufferReplaceOutputBuffer.put((byte) (sConstrainValue & 255));
                    byteBufferReplaceOutputBuffer.put((byte) ((sConstrainValue >> 8) & 255));
                    iPosition += 4;
                }
            }
        } else {
            while (iPosition < iLimit) {
                byteBufferReplaceOutputBuffer.put((byte) 0);
                byteBufferReplaceOutputBuffer.put((byte) ((byteBuffer.get(iPosition) & UByte.MAX_VALUE) - 128));
                iPosition++;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferReplaceOutputBuffer.flip();
    }
}
