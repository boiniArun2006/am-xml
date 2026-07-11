package androidx.media3.common.audio;

import androidx.media3.common.util.Assertions;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class Sonic {
    private static final int AMDF_FREQUENCY = 4000;
    private static final int BYTES_PER_SAMPLE = 2;
    private static final int MAXIMUM_PITCH = 400;
    private static final int MINIMUM_PITCH = 65;
    private static final float MINIMUM_SLOWDOWN_RATE = 0.99999f;
    private static final float MINIMUM_SPEEDUP_RATE = 1.00001f;
    private double accumulatedSpeedAdjustmentError;
    private final int channelCount;
    private final short[] downSampleBuffer;
    private short[] inputBuffer;
    private int inputFrameCount;
    private final int inputSampleRateHz;
    private int maxDiff;
    private final int maxPeriod;
    private final int maxRequiredFrameCount;
    private int minDiff;
    private final int minPeriod;
    private int newRatePosition;
    private int oldRatePosition;
    private short[] outputBuffer;
    private int outputFrameCount;
    private final float pitch;
    private short[] pitchBuffer;
    private int pitchFrameCount;
    private int prevMinDiff;
    private int prevPeriod;
    private final float rate;
    private int remainingInputToCopyFrameCount;
    private final float speed;

    private short[] ensureSpaceForAdditionalFrames(short[] sArr, int i2, int i3) {
        int length = sArr.length;
        int i5 = this.channelCount;
        int i7 = length / i5;
        return i2 + i3 <= i7 ? sArr : Arrays.copyOf(sArr, (((i7 * 3) / 2) + i3) * i5);
    }

    public static long getExpectedFrameCountAfterProcessorApplied(int i2, int i3, float f3, float f4, long j2) {
        float f5 = (i2 / i3) * f4;
        double d2 = f3 / f4;
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(f5));
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(j2);
        if (d2 > 1.0000100135803223d || d2 < 0.9999899864196777d) {
            bigDecimalValueOf = bigDecimalValueOf.divide(BigDecimal.valueOf(d2), RoundingMode.HALF_EVEN);
        }
        return f5 == 1.0f ? bigDecimalValueOf.longValueExact() : bigDecimalValueOf.divide(bigDecimal, RoundingMode.HALF_EVEN).longValueExact() - calculateAccumulatedTruncationErrorForResampling(bigDecimalValueOf, BigDecimal.valueOf(i2), bigDecimal);
    }

    static long getExpectedInputFrameCountForOutputFrameCount(int i2, int i3, float f3, float f4, long j2) {
        long frameCountBeforeResamplingForOutputCount = getFrameCountBeforeResamplingForOutputCount(BigDecimal.valueOf(i2), new BigDecimal(String.valueOf((i2 / i3) * f4)), BigDecimal.valueOf(j2));
        double d2 = f3 / f4;
        return (d2 > 1.0000100135803223d || d2 < 0.9999899864196777d) ? BigDecimal.valueOf(frameCountBeforeResamplingForOutputCount).multiply(BigDecimal.valueOf(d2)).setScale(0, RoundingMode.FLOOR).longValueExact() : frameCountBeforeResamplingForOutputCount;
    }

    private static void overlapAdd(int i2, int i3, short[] sArr, int i5, short[] sArr2, int i7, short[] sArr3, int i8) {
        for (int i9 = 0; i9 < i3; i9++) {
            int i10 = (i5 * i3) + i9;
            int i11 = (i8 * i3) + i9;
            int i12 = (i7 * i3) + i9;
            for (int i13 = 0; i13 < i2; i13++) {
                sArr[i10] = (short) (((sArr2[i12] * (i2 - i13)) + (sArr3[i11] * i13)) / i2);
                i10 += i3;
                i12 += i3;
                i11 += i3;
            }
        }
    }

    private boolean previousPeriodBetter(int i2, int i3) {
        return i2 != 0 && this.prevPeriod != 0 && i3 <= i2 * 3 && i2 * 2 > this.prevMinDiff * 3;
    }

    public void flush() {
        this.inputFrameCount = 0;
        this.outputFrameCount = 0;
        this.pitchFrameCount = 0;
        this.oldRatePosition = 0;
        this.newRatePosition = 0;
        this.remainingInputToCopyFrameCount = 0;
        this.prevPeriod = 0;
        this.prevMinDiff = 0;
        this.minDiff = 0;
        this.maxDiff = 0;
        this.accumulatedSpeedAdjustmentError = 0.0d;
    }

    private void adjustRate(float f3, int i2) {
        int i3;
        int i5;
        if (this.outputFrameCount == i2) {
            return;
        }
        int i7 = this.inputSampleRateHz;
        long j2 = (long) (i7 / f3);
        long j3 = i7;
        while (j2 != 0 && j3 != 0 && j2 % 2 == 0 && j3 % 2 == 0) {
            j2 /= 2;
            j3 /= 2;
        }
        moveNewSamplesToPitchBuffer(i2);
        int i8 = 0;
        while (true) {
            int i9 = this.pitchFrameCount;
            if (i8 >= i9 - 1) {
                removePitchFrames(i9 - 1);
                return;
            }
            while (true) {
                i3 = this.oldRatePosition;
                long j4 = ((long) (i3 + 1)) * j2;
                i5 = this.newRatePosition;
                if (j4 <= ((long) i5) * j3) {
                    break;
                }
                this.outputBuffer = ensureSpaceForAdditionalFrames(this.outputBuffer, this.outputFrameCount, 1);
                int i10 = 0;
                while (true) {
                    int i11 = this.channelCount;
                    if (i10 < i11) {
                        this.outputBuffer[(this.outputFrameCount * i11) + i10] = interpolate(this.pitchBuffer, (i11 * i8) + i10, j3, j2);
                        i10++;
                    }
                }
                this.newRatePosition++;
                this.outputFrameCount++;
            }
            int i12 = i3 + 1;
            this.oldRatePosition = i12;
            if (i12 == j3) {
                this.oldRatePosition = 0;
                Assertions.checkState(((long) i5) == j2);
                this.newRatePosition = 0;
            }
            i8++;
        }
    }

    static long calculateAccumulatedTruncationErrorForResampling(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        RoundingMode roundingMode = RoundingMode.HALF_EVEN;
        BigDecimal bigDecimalDivide = bigDecimal.divide(bigDecimal2, 20, roundingMode);
        BigDecimal bigDecimalDivide2 = bigDecimal2.divide(bigDecimal3, 20, roundingMode);
        RoundingMode roundingMode2 = RoundingMode.FLOOR;
        return bigDecimalDivide.multiply(bigDecimalDivide2.subtract(bigDecimalDivide2.setScale(0, roundingMode2))).setScale(0, roundingMode2).longValueExact();
    }

    private void changeSpeed(double d2) {
        Sonic sonic;
        double d4;
        int i2 = this.inputFrameCount;
        if (i2 < this.maxRequiredFrameCount) {
            return;
        }
        int iInsertPitchPeriod = 0;
        while (true) {
            if (this.remainingInputToCopyFrameCount > 0) {
                iInsertPitchPeriod += copyInputToOutput(iInsertPitchPeriod);
                sonic = this;
                d4 = d2;
            } else {
                int iFindPitchPeriod = findPitchPeriod(this.inputBuffer, iInsertPitchPeriod);
                if (d2 > 1.0d) {
                    sonic = this;
                    d4 = d2;
                    iInsertPitchPeriod += iFindPitchPeriod + sonic.skipPitchPeriod(this.inputBuffer, iInsertPitchPeriod, d4, iFindPitchPeriod);
                } else {
                    sonic = this;
                    d4 = d2;
                    iInsertPitchPeriod += sonic.insertPitchPeriod(sonic.inputBuffer, iInsertPitchPeriod, d4, iFindPitchPeriod);
                }
            }
            if (sonic.maxRequiredFrameCount + iInsertPitchPeriod > i2) {
                removeProcessedInputFrames(iInsertPitchPeriod);
                return;
            }
            d2 = d4;
        }
    }

    private int copyInputToOutput(int i2) {
        int iMin = Math.min(this.maxRequiredFrameCount, this.remainingInputToCopyFrameCount);
        copyToOutput(this.inputBuffer, i2, iMin);
        this.remainingInputToCopyFrameCount -= iMin;
        return iMin;
    }

    private void copyToOutput(short[] sArr, int i2, int i3) {
        short[] sArrEnsureSpaceForAdditionalFrames = ensureSpaceForAdditionalFrames(this.outputBuffer, this.outputFrameCount, i3);
        this.outputBuffer = sArrEnsureSpaceForAdditionalFrames;
        int i5 = this.channelCount;
        System.arraycopy(sArr, i2 * i5, sArrEnsureSpaceForAdditionalFrames, this.outputFrameCount * i5, i5 * i3);
        this.outputFrameCount += i3;
    }

    private void downSampleInput(short[] sArr, int i2, int i3) {
        int i5 = this.maxRequiredFrameCount / i3;
        int i7 = this.channelCount;
        int i8 = i3 * i7;
        int i9 = i2 * i7;
        for (int i10 = 0; i10 < i5; i10++) {
            int i11 = 0;
            for (int i12 = 0; i12 < i8; i12++) {
                i11 += sArr[(i10 * i8) + i9 + i12];
            }
            this.downSampleBuffer[i10] = (short) (i11 / i8);
        }
    }

    private int findPitchPeriod(short[] sArr, int i2) {
        int iFindPitchPeriodInRange;
        int i3 = this.inputSampleRateHz;
        int i5 = i3 > 4000 ? i3 / 4000 : 1;
        if (this.channelCount == 1 && i5 == 1) {
            iFindPitchPeriodInRange = findPitchPeriodInRange(sArr, i2, this.minPeriod, this.maxPeriod);
        } else {
            downSampleInput(sArr, i2, i5);
            int iFindPitchPeriodInRange2 = findPitchPeriodInRange(this.downSampleBuffer, 0, this.minPeriod / i5, this.maxPeriod / i5);
            if (i5 != 1) {
                int i7 = iFindPitchPeriodInRange2 * i5;
                int i8 = i5 * 4;
                int i9 = i7 - i8;
                int i10 = i7 + i8;
                int i11 = this.minPeriod;
                if (i9 < i11) {
                    i9 = i11;
                }
                int i12 = this.maxPeriod;
                if (i10 > i12) {
                    i10 = i12;
                }
                if (this.channelCount == 1) {
                    iFindPitchPeriodInRange = findPitchPeriodInRange(sArr, i2, i9, i10);
                } else {
                    downSampleInput(sArr, i2, 1);
                    iFindPitchPeriodInRange = findPitchPeriodInRange(this.downSampleBuffer, 0, i9, i10);
                }
            } else {
                iFindPitchPeriodInRange = iFindPitchPeriodInRange2;
            }
        }
        int i13 = previousPeriodBetter(this.minDiff, this.maxDiff) ? this.prevPeriod : iFindPitchPeriodInRange;
        this.prevMinDiff = this.minDiff;
        this.prevPeriod = iFindPitchPeriodInRange;
        return i13;
    }

    private int findPitchPeriodInRange(short[] sArr, int i2, int i3, int i5) {
        int i7 = i2 * this.channelCount;
        int i8 = 255;
        int i9 = 1;
        int i10 = 0;
        int i11 = 0;
        while (i3 <= i5) {
            int iAbs = 0;
            for (int i12 = 0; i12 < i3; i12++) {
                iAbs += Math.abs(sArr[i7 + i12] - sArr[(i7 + i3) + i12]);
            }
            if (iAbs * i10 < i9 * i3) {
                i10 = i3;
                i9 = iAbs;
            }
            if (iAbs * i8 > i11 * i3) {
                i8 = i3;
                i11 = iAbs;
            }
            i3++;
        }
        this.minDiff = i9 / i10;
        this.maxDiff = i11 / i8;
        return i10;
    }

    private static long getFrameCountBeforeResamplingForOutputCount(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        RoundingMode roundingMode = RoundingMode.FLOOR;
        return bigDecimal.multiply(bigDecimal3).divide(bigDecimal.divide(bigDecimal2, 0, roundingMode), 0, roundingMode).longValueExact();
    }

    private int insertPitchPeriod(short[] sArr, int i2, double d2, int i3) {
        int i5;
        if (d2 < 0.5d) {
            double d4 = ((((double) i3) * d2) / (1.0d - d2)) + this.accumulatedSpeedAdjustmentError;
            int iRound = (int) Math.round(d4);
            this.accumulatedSpeedAdjustmentError = d4 - ((double) iRound);
            i5 = iRound;
        } else {
            double d5 = ((((double) i3) * ((2.0d * d2) - 1.0d)) / (1.0d - d2)) + this.accumulatedSpeedAdjustmentError;
            int iRound2 = (int) Math.round(d5);
            this.remainingInputToCopyFrameCount = iRound2;
            this.accumulatedSpeedAdjustmentError = d5 - ((double) iRound2);
            i5 = i3;
        }
        int i7 = i3 + i5;
        short[] sArrEnsureSpaceForAdditionalFrames = ensureSpaceForAdditionalFrames(this.outputBuffer, this.outputFrameCount, i7);
        this.outputBuffer = sArrEnsureSpaceForAdditionalFrames;
        int i8 = this.channelCount;
        System.arraycopy(sArr, i2 * i8, sArrEnsureSpaceForAdditionalFrames, this.outputFrameCount * i8, i8 * i3);
        overlapAdd(i5, this.channelCount, this.outputBuffer, this.outputFrameCount + i3, sArr, i2 + i3, sArr, i2);
        this.outputFrameCount += i7;
        return i5;
    }

    private short interpolate(short[] sArr, int i2, long j2, long j3) {
        short s2 = sArr[i2];
        short s3 = sArr[i2 + this.channelCount];
        long j4 = ((long) this.newRatePosition) * j2;
        int i3 = this.oldRatePosition;
        long j5 = ((long) i3) * j3;
        long j6 = ((long) (i3 + 1)) * j3;
        long j7 = j6 - j4;
        long j9 = j6 - j5;
        return (short) (((((long) s2) * j7) + ((j9 - j7) * ((long) s3))) / j9);
    }

    private void moveNewSamplesToPitchBuffer(int i2) {
        int i3 = this.outputFrameCount - i2;
        short[] sArrEnsureSpaceForAdditionalFrames = ensureSpaceForAdditionalFrames(this.pitchBuffer, this.pitchFrameCount, i3);
        this.pitchBuffer = sArrEnsureSpaceForAdditionalFrames;
        short[] sArr = this.outputBuffer;
        int i5 = this.channelCount;
        System.arraycopy(sArr, i2 * i5, sArrEnsureSpaceForAdditionalFrames, this.pitchFrameCount * i5, i5 * i3);
        this.outputFrameCount = i2;
        this.pitchFrameCount += i3;
    }

    private void processStreamInput() {
        int i2 = this.outputFrameCount;
        float f3 = this.speed;
        float f4 = this.pitch;
        double d2 = f3 / f4;
        float f5 = this.rate * f4;
        if (d2 > 1.0000100135803223d || d2 < 0.9999899864196777d) {
            changeSpeed(d2);
        } else {
            copyToOutput(this.inputBuffer, 0, this.inputFrameCount);
            this.inputFrameCount = 0;
        }
        if (f5 != 1.0f) {
            adjustRate(f5, i2);
        }
    }

    private void removePitchFrames(int i2) {
        if (i2 == 0) {
            return;
        }
        short[] sArr = this.pitchBuffer;
        int i3 = this.channelCount;
        System.arraycopy(sArr, i2 * i3, sArr, 0, (this.pitchFrameCount - i2) * i3);
        this.pitchFrameCount -= i2;
    }

    private void removeProcessedInputFrames(int i2) {
        int i3 = this.inputFrameCount - i2;
        short[] sArr = this.inputBuffer;
        int i5 = this.channelCount;
        System.arraycopy(sArr, i2 * i5, sArr, 0, i5 * i3);
        this.inputFrameCount = i3;
    }

    private int skipPitchPeriod(short[] sArr, int i2, double d2, int i3) {
        int i5;
        if (d2 >= 2.0d) {
            double d4 = (((double) i3) / (d2 - 1.0d)) + this.accumulatedSpeedAdjustmentError;
            int iRound = (int) Math.round(d4);
            this.accumulatedSpeedAdjustmentError = d4 - ((double) iRound);
            i5 = iRound;
        } else {
            double d5 = ((((double) i3) * (2.0d - d2)) / (d2 - 1.0d)) + this.accumulatedSpeedAdjustmentError;
            int iRound2 = (int) Math.round(d5);
            this.remainingInputToCopyFrameCount = iRound2;
            this.accumulatedSpeedAdjustmentError = d5 - ((double) iRound2);
            i5 = i3;
        }
        short[] sArrEnsureSpaceForAdditionalFrames = ensureSpaceForAdditionalFrames(this.outputBuffer, this.outputFrameCount, i5);
        this.outputBuffer = sArrEnsureSpaceForAdditionalFrames;
        overlapAdd(i5, this.channelCount, sArrEnsureSpaceForAdditionalFrames, this.outputFrameCount, sArr, i2, sArr, i2 + i3);
        this.outputFrameCount += i5;
        return i5;
    }

    public void getOutput(ShortBuffer shortBuffer) {
        Assertions.checkState(this.outputFrameCount >= 0);
        int iMin = Math.min(shortBuffer.remaining() / this.channelCount, this.outputFrameCount);
        shortBuffer.put(this.outputBuffer, 0, this.channelCount * iMin);
        int i2 = this.outputFrameCount - iMin;
        this.outputFrameCount = i2;
        short[] sArr = this.outputBuffer;
        int i3 = this.channelCount;
        System.arraycopy(sArr, iMin * i3, sArr, 0, i2 * i3);
    }

    public int getOutputSize() {
        Assertions.checkState(this.outputFrameCount >= 0);
        return this.outputFrameCount * this.channelCount * 2;
    }

    public int getPendingInputBytes() {
        return this.inputFrameCount * this.channelCount * 2;
    }

    public void queueEndOfStream() {
        int i2;
        int i3 = this.inputFrameCount;
        float f3 = this.speed;
        float f4 = this.pitch;
        double d2 = f3 / f4;
        double d4 = this.rate * f4;
        int i5 = this.remainingInputToCopyFrameCount;
        int i7 = this.outputFrameCount + ((int) ((((((((double) (i3 - i5)) / d2) + ((double) i5)) + this.accumulatedSpeedAdjustmentError) + ((double) this.pitchFrameCount)) / d4) + 0.5d));
        this.accumulatedSpeedAdjustmentError = 0.0d;
        this.inputBuffer = ensureSpaceForAdditionalFrames(this.inputBuffer, i3, (this.maxRequiredFrameCount * 2) + i3);
        int i8 = 0;
        while (true) {
            i2 = this.maxRequiredFrameCount;
            int i9 = this.channelCount;
            if (i8 >= i2 * 2 * i9) {
                break;
            }
            this.inputBuffer[(i9 * i3) + i8] = 0;
            i8++;
        }
        this.inputFrameCount += i2 * 2;
        processStreamInput();
        if (this.outputFrameCount > i7) {
            this.outputFrameCount = Math.max(i7, 0);
        }
        this.inputFrameCount = 0;
        this.remainingInputToCopyFrameCount = 0;
        this.pitchFrameCount = 0;
    }

    public Sonic(int i2, int i3, float f3, float f4, int i5) {
        this.inputSampleRateHz = i2;
        this.channelCount = i3;
        this.speed = f3;
        this.pitch = f4;
        this.rate = i2 / i5;
        this.minPeriod = i2 / 400;
        int i7 = i2 / 65;
        this.maxPeriod = i7;
        int i8 = i7 * 2;
        this.maxRequiredFrameCount = i8;
        this.downSampleBuffer = new short[i8];
        this.inputBuffer = new short[i8 * i3];
        this.outputBuffer = new short[i8 * i3];
        this.pitchBuffer = new short[i8 * i3];
    }

    public void queueInput(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i2 = this.channelCount;
        int i3 = iRemaining / i2;
        short[] sArrEnsureSpaceForAdditionalFrames = ensureSpaceForAdditionalFrames(this.inputBuffer, this.inputFrameCount, i3);
        this.inputBuffer = sArrEnsureSpaceForAdditionalFrames;
        shortBuffer.get(sArrEnsureSpaceForAdditionalFrames, this.inputFrameCount * this.channelCount, ((i2 * i3) * 2) / 2);
        this.inputFrameCount += i3;
        processStreamInput();
    }
}
