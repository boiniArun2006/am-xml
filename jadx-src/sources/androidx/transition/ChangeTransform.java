package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.browser.trusted.sharing.KcI.qUrazMnwDskFs;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class ChangeTransform extends Transition {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f42155C;
    private Matrix Mx;
    boolean ofS;

    /* JADX INFO: renamed from: G7, reason: collision with root package name */
    private static final String[] f42154G7 = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};
    private static final Property fcU = new Property<PathAnimatorMatrix, float[]>(float[].class, "nonTranslations") { // from class: androidx.transition.ChangeTransform.1
        @Override // android.util.Property
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public float[] get(PathAnimatorMatrix pathAnimatorMatrix) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public void set(PathAnimatorMatrix pathAnimatorMatrix, float[] fArr) {
            pathAnimatorMatrix.nr(fArr);
        }
    };
    private static final Property eWT = new Property<PathAnimatorMatrix, PointF>(PointF.class, "translations") { // from class: androidx.transition.ChangeTransform.2
        @Override // android.util.Property
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public PointF get(PathAnimatorMatrix pathAnimatorMatrix) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public void set(PathAnimatorMatrix pathAnimatorMatrix, PointF pointF) {
            pathAnimatorMatrix.t(pointF);
        }
    };
    private static final boolean ul = true;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    private static class GhostListener extends TransitionListenerAdapter {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private View f42156n;
        private GhostView rl;

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void J2(Transition transition) {
            this.rl.setVisibility(4);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void nr(Transition transition) {
            this.rl.setVisibility(0);
        }

        GhostListener(View view, GhostView ghostView) {
            this.f42156n = view;
            this.rl = ghostView;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void xMQ(Transition transition) {
            transition.D(this);
            GhostViewUtils.rl(this.f42156n);
            this.f42156n.setTag(R.id.mUb, null);
            this.f42156n.setTag(R.id.f42199t, null);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    private static class Listener extends AnimatorListenerAdapter {
        private final Transforms J2;
        private final Matrix KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final View f42157O;
        private final PathAnimatorMatrix Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f42158n;
        private final boolean nr;
        private final Matrix rl = new Matrix();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final boolean f42159t;

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f42158n = true;
        }

        private void n(Matrix matrix) {
            this.rl.set(matrix);
            this.f42157O.setTag(R.id.mUb, this.rl);
            this.J2.n(this.f42157O);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f42158n) {
                if (this.f42159t && this.nr) {
                    n(this.KN);
                } else {
                    this.f42157O.setTag(R.id.mUb, null);
                    this.f42157O.setTag(R.id.f42199t, null);
                }
            }
            ViewUtils.nr(this.f42157O, null);
            this.J2.n(this.f42157O);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            n(this.Uo.n());
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            ChangeTransform.G7(this.f42157O);
        }

        Listener(View view, Transforms transforms, PathAnimatorMatrix pathAnimatorMatrix, Matrix matrix, boolean z2, boolean z3) {
            this.f42159t = z2;
            this.nr = z3;
            this.f42157O = view;
            this.J2 = transforms;
            this.Uo = pathAnimatorMatrix;
            this.KN = matrix;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    private static class PathAnimatorMatrix {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private float f42160O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Matrix f42161n = new Matrix();
        private float nr;
        private final View rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final float[] f42162t;

        private void rl() {
            float[] fArr = this.f42162t;
            fArr[2] = this.nr;
            fArr[5] = this.f42160O;
            this.f42161n.setValues(fArr);
            ViewUtils.nr(this.rl, this.f42161n);
        }

        Matrix n() {
            return this.f42161n;
        }

        void nr(float[] fArr) {
            System.arraycopy(fArr, 0, this.f42162t, 0, fArr.length);
            rl();
        }

        void t(PointF pointF) {
            this.nr = pointF.x;
            this.f42160O = pointF.y;
            rl();
        }

        PathAnimatorMatrix(View view, float[] fArr) {
            this.rl = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.f42162t = fArr2;
            this.nr = fArr2[2];
            this.f42160O = fArr2[5];
            rl();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    private static class Transforms {
        final float J2;
        final float KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final float f42163O;
        final float Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final float f42164n;
        final float nr;
        final float rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final float f42165t;

        public boolean equals(Object obj) {
            if (!(obj instanceof Transforms)) {
                return false;
            }
            Transforms transforms = (Transforms) obj;
            return transforms.f42164n == this.f42164n && transforms.rl == this.rl && transforms.f42165t == this.f42165t && transforms.nr == this.nr && transforms.f42163O == this.f42163O && transforms.J2 == this.J2 && transforms.Uo == this.Uo && transforms.KN == this.KN;
        }

        public int hashCode() {
            float f3 = this.f42164n;
            int iFloatToIntBits = (f3 != 0.0f ? Float.floatToIntBits(f3) : 0) * 31;
            float f4 = this.rl;
            int iFloatToIntBits2 = (iFloatToIntBits + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31;
            float f5 = this.f42165t;
            int iFloatToIntBits3 = (iFloatToIntBits2 + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0)) * 31;
            float f6 = this.nr;
            int iFloatToIntBits4 = (iFloatToIntBits3 + (f6 != 0.0f ? Float.floatToIntBits(f6) : 0)) * 31;
            float f7 = this.f42163O;
            int iFloatToIntBits5 = (iFloatToIntBits4 + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31;
            float f8 = this.J2;
            int iFloatToIntBits6 = (iFloatToIntBits5 + (f8 != 0.0f ? Float.floatToIntBits(f8) : 0)) * 31;
            float f9 = this.Uo;
            int iFloatToIntBits7 = (iFloatToIntBits6 + (f9 != 0.0f ? Float.floatToIntBits(f9) : 0)) * 31;
            float f10 = this.KN;
            return iFloatToIntBits7 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0);
        }

        public void n(View view) {
            ChangeTransform.eWT(view, this.f42164n, this.rl, this.f42165t, this.nr, this.f42163O, this.J2, this.Uo, this.KN);
        }

        Transforms(View view) {
            this.f42164n = view.getTranslationX();
            this.rl = view.getTranslationY();
            this.f42165t = ViewCompat.nHg(view);
            this.nr = view.getScaleX();
            this.f42163O = view.getScaleY();
            this.J2 = view.getRotationX();
            this.Uo = view.getRotationY();
            this.KN = view.getRotation();
        }
    }

    static void G7(View view) {
        eWT(view, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
    }

    private ObjectAnimator C(TransitionValues transitionValues, TransitionValues transitionValues2, boolean z2) {
        Matrix matrix = (Matrix) transitionValues.f42259n.get("android:changeTransform:matrix");
        Matrix matrix2 = (Matrix) transitionValues2.f42259n.get("android:changeTransform:matrix");
        if (matrix == null) {
            matrix = MatrixUtils.f42192n;
        }
        if (matrix2 == null) {
            matrix2 = MatrixUtils.f42192n;
        }
        Matrix matrix3 = matrix2;
        if (matrix.equals(matrix3)) {
            return null;
        }
        Transforms transforms = (Transforms) transitionValues2.f42259n.get("android:changeTransform:transforms");
        View view = transitionValues2.rl;
        G7(view);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix3.getValues(fArr2);
        PathAnimatorMatrix pathAnimatorMatrix = new PathAnimatorMatrix(view, fArr);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(pathAnimatorMatrix, PropertyValuesHolder.ofObject(fcU, new FloatArrayEvaluator(new float[9]), fArr, fArr2), PropertyValuesHolderUtils.n(eWT, nY().n(fArr[2], fArr[5], fArr2[2], fArr2[5])));
        Listener listener = new Listener(view, transforms, pathAnimatorMatrix, matrix3, z2, this.ofS);
        objectAnimatorOfPropertyValuesHolder.addListener(listener);
        objectAnimatorOfPropertyValuesHolder.addPauseListener(listener);
        return objectAnimatorOfPropertyValuesHolder;
    }

    private void fcU(TransitionValues transitionValues, TransitionValues transitionValues2) {
        Matrix matrix = (Matrix) transitionValues2.f42259n.get("android:changeTransform:parentMatrix");
        transitionValues2.rl.setTag(R.id.f42199t, matrix);
        Matrix matrix2 = this.Mx;
        matrix2.reset();
        matrix.invert(matrix2);
        Matrix matrix3 = (Matrix) transitionValues.f42259n.get("android:changeTransform:matrix");
        if (matrix3 == null) {
            matrix3 = new Matrix();
            transitionValues.f42259n.put("android:changeTransform:matrix", matrix3);
        }
        matrix3.postConcat((Matrix) transitionValues.f42259n.get("android:changeTransform:parentMatrix"));
        matrix3.postConcat(matrix2);
    }

    private void ofS(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        View view = transitionValues2.rl;
        Matrix matrix = new Matrix((Matrix) transitionValues2.f42259n.get("android:changeTransform:parentMatrix"));
        ViewUtils.xMQ(viewGroup, matrix);
        GhostView ghostViewN = GhostViewUtils.n(view, viewGroup, matrix);
        if (ghostViewN == null) {
            return;
        }
        ghostViewN.n((ViewGroup) transitionValues.f42259n.get("android:changeTransform:parent"), transitionValues.rl);
        Transition transition = this;
        while (true) {
            TransitionSet transitionSet = transition.f42220U;
            if (transitionSet == null) {
                break;
            } else {
                transition = transitionSet;
            }
        }
        transition.t(new GhostListener(view, ghostViewN));
        if (ul) {
            View view2 = transitionValues.rl;
            if (view2 != transitionValues2.rl) {
                ViewUtils.J2(view2, 0.0f);
            }
            ViewUtils.J2(view, 1.0f);
        }
    }

    private void pJg(TransitionValues transitionValues) {
        View view = transitionValues.rl;
        if (view.getVisibility() == 8) {
            return;
        }
        transitionValues.f42259n.put("android:changeTransform:parent", view.getParent());
        transitionValues.f42259n.put("android:changeTransform:transforms", new Transforms(view));
        Matrix matrix = view.getMatrix();
        transitionValues.f42259n.put("android:changeTransform:matrix", (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
        if (this.f42155C) {
            Matrix matrix2 = new Matrix();
            ViewUtils.KN((ViewGroup) view.getParent(), matrix2);
            matrix2.preTranslate(-r2.getScrollX(), -r2.getScrollY());
            transitionValues.f42259n.put("android:changeTransform:parentMatrix", matrix2);
            transitionValues.f42259n.put(qUrazMnwDskFs.JDGrk, view.getTag(R.id.mUb));
            transitionValues.f42259n.put("android:changeTransform:intermediateParentMatrix", view.getTag(R.id.f42199t));
        }
    }

    @Override // androidx.transition.Transition
    public Animator ck(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null || !transitionValues.f42259n.containsKey("android:changeTransform:parent") || !transitionValues2.f42259n.containsKey("android:changeTransform:parent")) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) transitionValues.f42259n.get("android:changeTransform:parent");
        boolean z2 = this.f42155C && !Mx(viewGroup2, (ViewGroup) transitionValues2.f42259n.get("android:changeTransform:parent"));
        Matrix matrix = (Matrix) transitionValues.f42259n.get("android:changeTransform:intermediateMatrix");
        if (matrix != null) {
            transitionValues.f42259n.put("android:changeTransform:matrix", matrix);
        }
        Matrix matrix2 = (Matrix) transitionValues.f42259n.get("android:changeTransform:intermediateParentMatrix");
        if (matrix2 != null) {
            transitionValues.f42259n.put("android:changeTransform:parentMatrix", matrix2);
        }
        if (z2) {
            fcU(transitionValues, transitionValues2);
        }
        ObjectAnimator objectAnimatorC = C(transitionValues, transitionValues2, z2);
        if (z2 && objectAnimatorC != null && this.ofS) {
            ofS(viewGroup, transitionValues, transitionValues2);
            return objectAnimatorC;
        }
        if (!ul) {
            viewGroup2.endViewTransition(transitionValues.rl);
        }
        return objectAnimatorC;
    }

    @Override // androidx.transition.Transition
    public String[] nHg() {
        return f42154G7;
    }

    private boolean Mx(ViewGroup viewGroup, ViewGroup viewGroup2) {
        if (bzg(viewGroup) && bzg(viewGroup2)) {
            TransitionValues transitionValuesAYN = aYN(viewGroup, true);
            if (transitionValuesAYN != null && viewGroup2 == transitionValuesAYN.rl) {
                return true;
            }
            return false;
        }
        if (viewGroup == viewGroup2) {
            return true;
        }
        return false;
    }

    static void eWT(View view, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        view.setTranslationX(f3);
        view.setTranslationY(f4);
        ViewCompat.i(view, f5);
        view.setScaleX(f6);
        view.setScaleY(f7);
        view.setRotationX(f8);
        view.setRotationY(f9);
        view.setRotation(f10);
    }

    @Override // androidx.transition.Transition
    public void qie(TransitionValues transitionValues) {
        pJg(transitionValues);
        if (!ul) {
            ((ViewGroup) transitionValues.rl.getParent()).startViewTransition(transitionValues.rl);
        }
    }

    @Override // androidx.transition.Transition
    public void xMQ(TransitionValues transitionValues) {
        pJg(transitionValues);
    }
}
