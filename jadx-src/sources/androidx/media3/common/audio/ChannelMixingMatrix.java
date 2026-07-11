package androidx.media3.common.audio;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@UnstableApi
public final class ChannelMixingMatrix {
    private final float[] coefficients;
    private final int inputChannelCount;
    private final boolean isDiagonal;
    private final boolean isIdentity;
    private final boolean isZero;
    private final int outputChannelCount;

    private static float[] checkCoefficientsValid(float[] fArr) {
        for (int i2 = 0; i2 < fArr.length; i2++) {
            if (fArr[i2] < 0.0f) {
                throw new IllegalArgumentException("Coefficient at index " + i2 + " is negative.");
            }
        }
        return fArr;
    }

    private static float[] createConstantGainMixingCoefficients(int i2, int i3) {
        if (i2 == i3) {
            return initializeIdentityMatrix(i3);
        }
        if (i2 == 1 && i3 == 2) {
            return new float[]{1.0f, 1.0f};
        }
        if (i2 == 2 && i3 == 1) {
            return new float[]{0.5f, 0.5f};
        }
        throw new UnsupportedOperationException("Default channel mixing coefficients for " + i2 + "->" + i3 + " are not yet implemented.");
    }

    private static float[] createConstantPowerMixingCoefficients(int i2, int i3) {
        if (i3 == 1) {
            return getConstantPowerCoefficientsToMono(i2);
        }
        if (i3 == 2) {
            return getConstantPowerCoefficientsToStereo(i2);
        }
        if (i2 == i3) {
            return initializeIdentityMatrix(i3);
        }
        throw new UnsupportedOperationException("Default constant power channel mixing coefficients for " + i2 + "->" + i3 + " are not implemented.");
    }

    public static ChannelMixingMatrix create(int i2, int i3) {
        return new ChannelMixingMatrix(i2, i3, createConstantGainMixingCoefficients(i2, i3));
    }

    public static ChannelMixingMatrix createForConstantPower(int i2, int i3) {
        return new ChannelMixingMatrix(i2, i3, createConstantPowerMixingCoefficients(i2, i3));
    }

    private static float[] getConstantPowerCoefficientsToMono(int i2) {
        switch (i2) {
            case 1:
                return new float[]{1.0f};
            case 2:
                return new float[]{0.7071f, 0.7071f};
            case 3:
                return new float[]{0.7071f, 0.7071f, 1.0f};
            case 4:
                return new float[]{0.7071f, 0.7071f, 0.5f, 0.5f};
            case 5:
                return new float[]{0.7071f, 0.7071f, 1.0f, 0.5f, 0.5f};
            case 6:
                return new float[]{0.7071f, 0.7071f, 1.0f, 0.7071f, 0.5f, 0.5f};
            default:
                throw new UnsupportedOperationException("Default constant power channel mixing coefficients for " + i2 + "->1 are not implemented.");
        }
    }

    private static float[] initializeIdentityMatrix(int i2) {
        float[] fArr = new float[i2 * i2];
        for (int i3 = 0; i3 < i2; i3++) {
            fArr[(i2 * i3) + i3] = 1.0f;
        }
        return fArr;
    }

    public int getInputChannelCount() {
        return this.inputChannelCount;
    }

    public float getMixingCoefficient(int i2, int i3) {
        return this.coefficients[(i2 * this.outputChannelCount) + i3];
    }

    public int getOutputChannelCount() {
        return this.outputChannelCount;
    }

    public boolean isDiagonal() {
        return this.isDiagonal;
    }

    public boolean isIdentity() {
        return this.isIdentity;
    }

    public boolean isSquare() {
        return this.inputChannelCount == this.outputChannelCount;
    }

    public boolean isZero() {
        return this.isZero;
    }

    public ChannelMixingMatrix scaleBy(float f3) {
        float[] fArr = new float[this.coefficients.length];
        int i2 = 0;
        while (true) {
            float[] fArr2 = this.coefficients;
            if (i2 >= fArr2.length) {
                return new ChannelMixingMatrix(this.inputChannelCount, this.outputChannelCount, fArr);
            }
            fArr[i2] = fArr2[i2] * f3;
            i2++;
        }
    }

    public ChannelMixingMatrix(int i2, int i3, float[] fArr) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7 = false;
        if (i2 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Assertions.checkArgument(z2, "Input channel count must be positive.");
        if (i3 > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Assertions.checkArgument(z3, "Output channel count must be positive.");
        if (fArr.length == i2 * i3) {
            z4 = true;
        } else {
            z4 = false;
        }
        Assertions.checkArgument(z4, "Coefficient array length is invalid.");
        this.inputChannelCount = i2;
        this.outputChannelCount = i3;
        this.coefficients = checkCoefficientsValid(fArr);
        boolean z9 = true;
        boolean z10 = true;
        boolean z11 = true;
        for (int i5 = 0; i5 < i2; i5++) {
            for (int i7 = 0; i7 < i3; i7++) {
                float mixingCoefficient = getMixingCoefficient(i5, i7);
                if (i5 == i7) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (mixingCoefficient != 1.0f && z6) {
                    z11 = false;
                }
                if (mixingCoefficient != 0.0f) {
                    z9 = false;
                    if (!z6) {
                        z10 = false;
                    }
                }
            }
        }
        this.isZero = z9;
        if (isSquare() && z10) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.isDiagonal = z5;
        if (z5 && z11) {
            z7 = true;
        }
        this.isIdentity = z7;
    }

    private static float[] getConstantPowerCoefficientsToStereo(int i2) {
        switch (i2) {
            case 1:
                return new float[]{0.7071f, 0.7071f};
            case 2:
                return new float[]{1.0f, 0.0f, 0.0f, 1.0f};
            case 3:
                return new float[]{1.0f, 0.0f, 0.7071f, 0.0f, 1.0f, 0.7071f};
            case 4:
                return new float[]{1.0f, 0.0f, 0.7071f, 0.0f, 0.0f, 1.0f, 0.0f, 0.7071f};
            case 5:
                return new float[]{1.0f, 0.0f, 0.7071f, 0.7071f, 0.0f, 0.0f, 1.0f, 0.7071f, 0.0f, 0.7071f};
            case 6:
                return new float[]{1.0f, 0.0f, 0.7071f, 0.5f, 0.7071f, 0.0f, 0.0f, 1.0f, 0.7071f, 0.5f, 0.0f, 0.7071f};
            default:
                throw new UnsupportedOperationException("Default constant power channel mixing coefficients for " + i2 + "->2 are not implemented.");
        }
    }
}
