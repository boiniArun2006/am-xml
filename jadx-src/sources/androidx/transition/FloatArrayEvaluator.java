package androidx.transition;

import android.animation.TypeEvaluator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class FloatArrayEvaluator implements TypeEvaluator<float[]> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float[] f42168n;

    @Override // android.animation.TypeEvaluator
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public float[] evaluate(float f3, float[] fArr, float[] fArr2) {
        float[] fArr3 = this.f42168n;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        for (int i2 = 0; i2 < fArr3.length; i2++) {
            float f4 = fArr[i2];
            fArr3[i2] = f4 + ((fArr2[i2] - f4) * f3);
        }
        return fArr3;
    }

    FloatArrayEvaluator(float[] fArr) {
        this.f42168n = fArr;
    }
}
