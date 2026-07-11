package androidx.transition;

import android.graphics.Matrix;
import android.graphics.RectF;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
class MatrixUtils {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final Matrix f42192n = new Matrix() { // from class: androidx.transition.MatrixUtils.1
        @Override // android.graphics.Matrix
        public boolean postRotate(float f3, float f4, float f5) {
            n();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postScale(float f3, float f4, float f5, float f6) {
            n();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postSkew(float f3, float f4, float f5, float f6) {
            n();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preRotate(float f3, float f4, float f5) {
            n();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preScale(float f3, float f4, float f5, float f6) {
            n();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preSkew(float f3, float f4, float f5, float f6) {
            n();
            return false;
        }

        @Override // android.graphics.Matrix
        public void setRotate(float f3, float f4, float f5) {
            n();
        }

        @Override // android.graphics.Matrix
        public void setScale(float f3, float f4, float f5, float f6) {
            n();
        }

        @Override // android.graphics.Matrix
        public void setSinCos(float f3, float f4, float f5, float f6) {
            n();
        }

        @Override // android.graphics.Matrix
        public void setSkew(float f3, float f4, float f5, float f6) {
            n();
        }

        void n() {
            throw new IllegalStateException("Matrix can not be modified");
        }

        @Override // android.graphics.Matrix
        public boolean postRotate(float f3) {
            n();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postScale(float f3, float f4) {
            n();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postSkew(float f3, float f4) {
            n();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preRotate(float f3) {
            n();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preScale(float f3, float f4) {
            n();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preSkew(float f3, float f4) {
            n();
            return false;
        }

        @Override // android.graphics.Matrix
        public void setRotate(float f3) {
            n();
        }

        @Override // android.graphics.Matrix
        public void setScale(float f3, float f4) {
            n();
        }

        @Override // android.graphics.Matrix
        public void setSinCos(float f3, float f4) {
            n();
        }

        @Override // android.graphics.Matrix
        public void setSkew(float f3, float f4) {
            n();
        }

        @Override // android.graphics.Matrix
        public boolean postConcat(Matrix matrix) {
            n();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postTranslate(float f3, float f4) {
            n();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preConcat(Matrix matrix) {
            n();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preTranslate(float f3, float f4) {
            n();
            return false;
        }

        @Override // android.graphics.Matrix
        public void reset() {
            n();
        }

        @Override // android.graphics.Matrix
        public void set(Matrix matrix) {
            n();
        }

        @Override // android.graphics.Matrix
        public boolean setConcat(Matrix matrix, Matrix matrix2) {
            n();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean setPolyToPoly(float[] fArr, int i2, float[] fArr2, int i3, int i5) {
            n();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean setRectToRect(RectF rectF, RectF rectF2, Matrix.ScaleToFit scaleToFit) {
            n();
            return false;
        }

        @Override // android.graphics.Matrix
        public void setTranslate(float f3, float f4) {
            n();
        }

        @Override // android.graphics.Matrix
        public void setValues(float[] fArr) {
            n();
        }
    };
}
