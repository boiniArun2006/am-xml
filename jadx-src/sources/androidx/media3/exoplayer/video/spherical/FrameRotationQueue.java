package androidx.media3.exoplayer.video.spherical;

import android.opengl.Matrix;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.TimedValueQueue;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class FrameRotationQueue {
    private boolean recenterMatrixComputed;
    private final float[] recenterMatrix = new float[16];
    private final float[] rotationMatrix = new float[16];
    private final TimedValueQueue<float[]> rotations = new TimedValueQueue<>();

    private static void getRotationMatrixFromAngleAxis(float[] fArr, float[] fArr2) {
        float f3 = fArr2[0];
        float f4 = -fArr2[1];
        float f5 = -fArr2[2];
        float length = Matrix.length(f3, f4, f5);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f3 / length, f4 / length, f5 / length);
        } else {
            GlUtil.setToIdentity(fArr);
        }
    }

    public boolean pollRotationMatrix(float[] fArr, long j2) {
        float[] fArrPollFloor = this.rotations.pollFloor(j2);
        if (fArrPollFloor == null) {
            return false;
        }
        getRotationMatrixFromAngleAxis(this.rotationMatrix, fArrPollFloor);
        if (!this.recenterMatrixComputed) {
            computeRecenterMatrix(this.recenterMatrix, this.rotationMatrix);
            this.recenterMatrixComputed = true;
        }
        Matrix.multiplyMM(fArr, 0, this.recenterMatrix, 0, this.rotationMatrix, 0);
        return true;
    }

    public void reset() {
        this.rotations.clear();
        this.recenterMatrixComputed = false;
    }

    public void setRotation(long j2, float[] fArr) {
        this.rotations.add(j2, fArr);
    }

    public static void computeRecenterMatrix(float[] fArr, float[] fArr2) {
        GlUtil.setToIdentity(fArr);
        float f3 = fArr2[10];
        float f4 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f3 * f3) + (f4 * f4));
        float f5 = fArr2[10];
        fArr[0] = f5 / fSqrt;
        float f6 = fArr2[8];
        fArr[2] = f6 / fSqrt;
        fArr[8] = (-f6) / fSqrt;
        fArr[10] = f5 / fSqrt;
    }
}
