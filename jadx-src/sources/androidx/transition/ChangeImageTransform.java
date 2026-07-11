package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.transition.Transition;
import androidx.transition.TransitionUtils;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class ChangeImageTransform extends Transition {
    private static final String[] ofS = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final TypeEvaluator f42150C = new TypeEvaluator<Matrix>() { // from class: androidx.transition.ChangeImageTransform.1
        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f3, Matrix matrix, Matrix matrix2) {
            return null;
        }
    };
    private static final Property Mx = new Property<ImageView, Matrix>(Matrix.class, "animatedTransform") { // from class: androidx.transition.ChangeImageTransform.2
        @Override // android.util.Property
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Matrix get(ImageView imageView) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public void set(ImageView imageView, Matrix matrix) {
            ImageViewUtils.n(imageView, matrix);
        }
    };

    private static class Listener extends AnimatorListenerAdapter implements Transition.TransitionListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ImageView f42152n;
        private boolean nr = true;
        private final Matrix rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Matrix f42153t;

        @Override // androidx.transition.Transition.TransitionListener
        public void O(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void gh(Transition transition) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z2) {
            this.nr = z2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z2) {
            this.nr = false;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void xMQ(Transition transition) {
        }

        private void n() {
            ImageView imageView = this.f42152n;
            int i2 = R.id.Uo;
            Matrix matrix = (Matrix) imageView.getTag(i2);
            if (matrix != null) {
                ImageViewUtils.n(this.f42152n, matrix);
                this.f42152n.setTag(i2, null);
            }
        }

        private void rl(Matrix matrix) {
            this.f42152n.setTag(R.id.Uo, matrix);
            ImageViewUtils.n(this.f42152n, this.f42153t);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void J2(Transition transition) {
            if (this.nr) {
                rl(this.rl);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.nr = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            rl((Matrix) ((ObjectAnimator) animator).getAnimatedValue());
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.nr = false;
        }

        Listener(ImageView imageView, Matrix matrix, Matrix matrix2) {
            this.f42152n = imageView;
            this.rl = matrix;
            this.f42153t = matrix2;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void nr(Transition transition) {
            n();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            n();
        }
    }

    @Override // androidx.transition.Transition
    public Animator ck(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        Rect rect = (Rect) transitionValues.f42259n.get("android:changeImageTransform:bounds");
        Rect rect2 = (Rect) transitionValues2.f42259n.get("android:changeImageTransform:bounds");
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) transitionValues.f42259n.get("android:changeImageTransform:matrix");
        Matrix matrix2 = (Matrix) transitionValues2.f42259n.get("android:changeImageTransform:matrix");
        boolean z2 = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
        if (rect.equals(rect2) && z2) {
            return null;
        }
        ImageView imageView = (ImageView) transitionValues2.rl;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return G7(imageView);
        }
        if (matrix == null) {
            matrix = MatrixUtils.f42192n;
        }
        if (matrix2 == null) {
            matrix2 = MatrixUtils.f42192n;
        }
        Mx.set(imageView, matrix);
        ObjectAnimator objectAnimatorMx = Mx(imageView, matrix, matrix2);
        Listener listener = new Listener(imageView, matrix, matrix2);
        objectAnimatorMx.addListener(listener);
        objectAnimatorMx.addPauseListener(listener);
        t(listener);
        return objectAnimatorMx;
    }

    @Override // androidx.transition.Transition
    public void qie(TransitionValues transitionValues) {
        pJg(transitionValues, true);
    }

    @Override // androidx.transition.Transition
    public boolean v() {
        return true;
    }

    @Override // androidx.transition.Transition
    public void xMQ(TransitionValues transitionValues) {
        pJg(transitionValues, false);
    }

    /* JADX INFO: renamed from: androidx.transition.ChangeImageTransform$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f42151n;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f42151n = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42151n[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private ObjectAnimator G7(ImageView imageView) {
        Property property = Mx;
        TypeEvaluator typeEvaluator = f42150C;
        Matrix matrix = MatrixUtils.f42192n;
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) property, typeEvaluator, matrix, matrix);
    }

    private ObjectAnimator Mx(ImageView imageView, Matrix matrix, Matrix matrix2) {
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) Mx, new TransitionUtils.MatrixEvaluator(), matrix, matrix2);
    }

    private void pJg(TransitionValues transitionValues, boolean z2) {
        View view = transitionValues.rl;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            Map map = transitionValues.f42259n;
            map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            Matrix matrixC = z2 ? (Matrix) imageView.getTag(R.id.Uo) : null;
            if (matrixC == null) {
                matrixC = C(imageView);
            }
            map.put("android:changeImageTransform:matrix", matrixC);
        }
    }

    @Override // androidx.transition.Transition
    public String[] nHg() {
        return ofS;
    }

    private static Matrix C(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            int i2 = AnonymousClass3.f42151n[imageView.getScaleType().ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    return new Matrix(imageView.getImageMatrix());
                }
                return ofS(imageView);
            }
            return fcU(imageView);
        }
        return new Matrix(imageView.getImageMatrix());
    }

    private static Matrix fcU(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        Matrix matrix = new Matrix();
        matrix.postScale(imageView.getWidth() / drawable.getIntrinsicWidth(), imageView.getHeight() / drawable.getIntrinsicHeight());
        return matrix;
    }

    private static Matrix ofS(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        float width = imageView.getWidth();
        float f3 = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float height = imageView.getHeight();
        float f4 = intrinsicHeight;
        float fMax = Math.max(width / f3, height / f4);
        int iRound = Math.round((width - (f3 * fMax)) / 2.0f);
        int iRound2 = Math.round((height - (f4 * fMax)) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.postScale(fMax, fMax);
        matrix.postTranslate(iRound, iRound2);
        return matrix;
    }
}
