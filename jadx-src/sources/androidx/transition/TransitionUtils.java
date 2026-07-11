package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TypeEvaluator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
class TransitionUtils {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final boolean f42256n;

    static class MatrixEvaluator implements TypeEvaluator<Matrix> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final float[] f42257n = new float[9];
        final float[] rl = new float[9];

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final Matrix f42258t = new Matrix();

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f3, Matrix matrix, Matrix matrix2) {
            matrix.getValues(this.f42257n);
            matrix2.getValues(this.rl);
            for (int i2 = 0; i2 < 9; i2++) {
                float[] fArr = this.rl;
                float f4 = fArr[i2];
                float f5 = this.f42257n[i2];
                fArr[i2] = f5 + ((f4 - f5) * f3);
            }
            this.f42258t.setValues(this.rl);
            return this.f42258t;
        }

        MatrixEvaluator() {
        }
    }

    @RequiresApi
    static class Api28Impl {
        @DoNotInline
        static Bitmap n(Picture picture) {
            return Bitmap.createBitmap(picture);
        }
    }

    static {
        f42256n = Build.VERSION.SDK_INT >= 28;
    }

    static View n(ViewGroup viewGroup, View view, View view2) {
        Matrix matrix = new Matrix();
        matrix.setTranslate(-view2.getScrollX(), -view2.getScrollY());
        ViewUtils.KN(view, matrix);
        ViewUtils.xMQ(viewGroup, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        matrix.mapRect(rectF);
        int iRound = Math.round(rectF.left);
        int iRound2 = Math.round(rectF.top);
        int iRound3 = Math.round(rectF.right);
        int iRound4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Bitmap bitmapRl = rl(view, matrix, rectF, viewGroup);
        if (bitmapRl != null) {
            imageView.setImageBitmap(bitmapRl);
        }
        imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
        imageView.layout(iRound, iRound2, iRound3, iRound4);
        return imageView;
    }

    static Animator t(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animator, animator2);
        return animatorSet;
    }

    private static Bitmap rl(View view, Matrix matrix, RectF rectF, ViewGroup viewGroup) {
        boolean z2;
        int iIndexOfChild;
        ViewGroup viewGroup2;
        boolean zIsAttachedToWindow = view.isAttachedToWindow();
        if (viewGroup != null && viewGroup.isAttachedToWindow()) {
            z2 = true;
        } else {
            z2 = false;
        }
        Bitmap bitmapCreateBitmap = null;
        if (!zIsAttachedToWindow) {
            if (!z2) {
                return null;
            }
            viewGroup2 = (ViewGroup) view.getParent();
            iIndexOfChild = viewGroup2.indexOfChild(view);
            viewGroup.getOverlay().add(view);
        } else {
            iIndexOfChild = 0;
            viewGroup2 = null;
        }
        int iRound = Math.round(rectF.width());
        int iRound2 = Math.round(rectF.height());
        if (iRound > 0 && iRound2 > 0) {
            float fMin = Math.min(1.0f, 1048576.0f / (iRound * iRound2));
            int iRound3 = Math.round(iRound * fMin);
            int iRound4 = Math.round(iRound2 * fMin);
            matrix.postTranslate(-rectF.left, -rectF.top);
            matrix.postScale(fMin, fMin);
            if (f42256n) {
                Picture picture = new Picture();
                Canvas canvasBeginRecording = picture.beginRecording(iRound3, iRound4);
                canvasBeginRecording.concat(matrix);
                view.draw(canvasBeginRecording);
                picture.endRecording();
                bitmapCreateBitmap = Api28Impl.n(picture);
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap(iRound3, iRound4, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.concat(matrix);
                view.draw(canvas);
            }
        }
        if (!zIsAttachedToWindow) {
            viewGroup.getOverlay().remove(view);
            viewGroup2.addView(view, iIndexOfChild);
        }
        return bitmapCreateBitmap;
    }
}
