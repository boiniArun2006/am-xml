package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.caoccao.javet.utils.Float16;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@UnstableApi
public final class AudioMixingUtil {
    private static final float FLOAT_PCM_MAX_VALUE = 1.0f;
    private static final float FLOAT_PCM_MIN_VALUE = -1.0f;

    public static boolean canMix(AudioProcessor.AudioFormat audioFormat) {
        if (audioFormat.sampleRate == -1 || audioFormat.channelCount == -1) {
            return false;
        }
        int i2 = audioFormat.encoding;
        return i2 == 2 || i2 == 4;
    }

    private static float floatSampleToInt16Pcm(float f3) {
        return Util.constrainValue(f3 * (f3 < 0.0f ? 32768 : Float16.EXPONENT_SIGNIFICAND_MASK), -32768.0f, 32767.0f);
    }

    private static float int16SampleToFloatPcm(short s2) {
        return s2 / (s2 < 0 ? 32768 : Float16.EXPONENT_SIGNIFICAND_MASK);
    }

    private static float getPcmSample(ByteBuffer byteBuffer, boolean z2, boolean z3) {
        return z3 ? z2 ? byteBuffer.getShort() : floatSampleToInt16Pcm(byteBuffer.getFloat()) : z2 ? int16SampleToFloatPcm(byteBuffer.getShort()) : byteBuffer.getFloat();
    }

    public static ByteBuffer mix(ByteBuffer byteBuffer, AudioProcessor.AudioFormat audioFormat, ByteBuffer byteBuffer2, AudioProcessor.AudioFormat audioFormat2, ChannelMixingMatrix channelMixingMatrix, int i2, boolean z2, boolean z3) {
        boolean z4 = audioFormat.encoding == 2;
        boolean z5 = audioFormat2.encoding == 2;
        int inputChannelCount = channelMixingMatrix.getInputChannelCount();
        int outputChannelCount = channelMixingMatrix.getOutputChannelCount();
        float[] fArr = new float[inputChannelCount];
        float[] fArr2 = new float[outputChannelCount];
        for (int i3 = 0; i3 < i2; i3++) {
            if (z2) {
                int iPosition = byteBuffer2.position();
                for (int i5 = 0; i5 < outputChannelCount; i5++) {
                    fArr2[i5] = getPcmSample(byteBuffer2, z5, z5);
                }
                byteBuffer2.position(iPosition);
            }
            for (int i7 = 0; i7 < inputChannelCount; i7++) {
                fArr[i7] = getPcmSample(byteBuffer, z4, z5);
            }
            for (int i8 = 0; i8 < outputChannelCount; i8++) {
                for (int i9 = 0; i9 < inputChannelCount; i9++) {
                    fArr2[i8] = fArr2[i8] + (fArr[i9] * channelMixingMatrix.getMixingCoefficient(i9, i8));
                }
                if (z5) {
                    byteBuffer2.putShort((short) Util.constrainValue(fArr2[i8], -32768.0f, 32767.0f));
                } else {
                    byteBuffer2.putFloat(z3 ? Util.constrainValue(fArr2[i8], FLOAT_PCM_MIN_VALUE, 1.0f) : fArr2[i8]);
                }
                fArr2[i8] = 0.0f;
            }
        }
        return byteBuffer2;
    }

    private AudioMixingUtil() {
    }

    public static boolean canMix(AudioProcessor.AudioFormat audioFormat, AudioProcessor.AudioFormat audioFormat2) {
        return audioFormat.sampleRate == audioFormat2.sampleRate && canMix(audioFormat) && canMix(audioFormat2);
    }
}
