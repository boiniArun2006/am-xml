package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class ChangeBounds extends Transition {

    /* JADX INFO: renamed from: G7, reason: collision with root package name */
    private static final Property f42138G7;
    private static final Property Mx;
    private static final Property eWT;
    private static final Property fcU;
    private static final Property ul;
    private boolean ofS = false;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final String[] f42137C = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final RectEvaluator n1 = new RectEvaluator();

    private static class ClipListener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        private final int J2;
        private final int KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final boolean f42140O;
        private final int Uo;
        private final int az;
        private final int gh;
        private final int mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final View f42141n;
        private final Rect nr;
        private final int qie;
        private final Rect rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final boolean f42142t;
        private boolean ty;
        private final int xMQ;

        @Override // androidx.transition.Transition.TransitionListener
        public void O(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void gh(Transition transition) {
            this.ty = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void xMQ(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void J2(Transition transition) {
            this.f42141n.setTag(R.id.f42197O, this.f42141n.getClipBounds());
            this.f42141n.setClipBounds(this.f42140O ? null : this.nr);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void nr(Transition transition) {
            View view = this.f42141n;
            int i2 = R.id.f42197O;
            Rect rect = (Rect) view.getTag(i2);
            this.f42141n.setTag(i2, null);
            this.f42141n.setClipBounds(rect);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z2) {
            if (this.ty) {
                return;
            }
            Rect rect = null;
            if (z2) {
                if (!this.f42142t) {
                    rect = this.rl;
                }
            } else if (!this.f42140O) {
                rect = this.nr;
            }
            this.f42141n.setClipBounds(rect);
            if (z2) {
                ViewUtils.O(this.f42141n, this.J2, this.Uo, this.KN, this.xMQ);
            } else {
                ViewUtils.O(this.f42141n, this.mUb, this.gh, this.qie, this.az);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z2) {
            int iMax = Math.max(this.KN - this.J2, this.qie - this.mUb);
            int iMax2 = Math.max(this.xMQ - this.Uo, this.az - this.gh);
            int i2 = z2 ? this.mUb : this.J2;
            int i3 = z2 ? this.gh : this.Uo;
            ViewUtils.O(this.f42141n, i2, i3, iMax + i2, iMax2 + i3);
            this.f42141n.setClipBounds(z2 ? this.nr : this.rl);
        }

        ClipListener(View view, Rect rect, boolean z2, Rect rect2, boolean z3, int i2, int i3, int i5, int i7, int i8, int i9, int i10, int i11) {
            this.f42141n = view;
            this.rl = rect;
            this.f42142t = z2;
            this.nr = rect2;
            this.f42140O = z3;
            this.J2 = i2;
            this.Uo = i3;
            this.KN = i5;
            this.xMQ = i7;
            this.mUb = i8;
            this.gh = i9;
            this.qie = i10;
            this.az = i11;
        }
    }

    private static class SuppressLayoutListener extends TransitionListenerAdapter {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f42143n = false;
        final ViewGroup rl;

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void J2(Transition transition) {
            ViewGroupUtils.t(this.rl, false);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void gh(Transition transition) {
            ViewGroupUtils.t(this.rl, false);
            this.f42143n = true;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void nr(Transition transition) {
            ViewGroupUtils.t(this.rl, true);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void xMQ(Transition transition) {
            if (!this.f42143n) {
                ViewGroupUtils.t(this.rl, false);
            }
            transition.D(this);
        }

        SuppressLayoutListener(ViewGroup viewGroup) {
            this.rl = viewGroup;
        }
    }

    private static class ViewBounds {
        private int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final View f42144O;
        private int Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f42145n;
        private int nr;
        private int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f42146t;

        private void rl() {
            ViewUtils.O(this.f42144O, this.f42145n, this.rl, this.f42146t, this.nr);
            this.J2 = 0;
            this.Uo = 0;
        }

        void n(PointF pointF) {
            this.f42146t = Math.round(pointF.x);
            this.nr = Math.round(pointF.y);
            int i2 = this.Uo + 1;
            this.Uo = i2;
            if (this.J2 == i2) {
                rl();
            }
        }

        void t(PointF pointF) {
            this.f42145n = Math.round(pointF.x);
            this.rl = Math.round(pointF.y);
            int i2 = this.J2 + 1;
            this.J2 = i2;
            if (i2 == this.Uo) {
                rl();
            }
        }

        ViewBounds(View view) {
            this.f42144O = view;
        }
    }

    @Override // androidx.transition.Transition
    public boolean v() {
        return true;
    }

    static {
        Class<PointF> cls = PointF.class;
        String str = "topLeft";
        Mx = new Property<ViewBounds, PointF>(cls, str) { // from class: androidx.transition.ChangeBounds.1
            @Override // android.util.Property
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public PointF get(ViewBounds viewBounds) {
                return null;
            }

            @Override // android.util.Property
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public void set(ViewBounds viewBounds, PointF pointF) {
                viewBounds.t(pointF);
            }
        };
        String str2 = "bottomRight";
        f42138G7 = new Property<ViewBounds, PointF>(cls, str2) { // from class: androidx.transition.ChangeBounds.2
            @Override // android.util.Property
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public PointF get(ViewBounds viewBounds) {
                return null;
            }

            @Override // android.util.Property
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public void set(ViewBounds viewBounds, PointF pointF) {
                viewBounds.n(pointF);
            }
        };
        fcU = new Property<View, PointF>(cls, str2) { // from class: androidx.transition.ChangeBounds.3
            @Override // android.util.Property
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public PointF get(View view) {
                return null;
            }

            @Override // android.util.Property
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public void set(View view, PointF pointF) {
                ViewUtils.O(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
            }
        };
        eWT = new Property<View, PointF>(cls, str) { // from class: androidx.transition.ChangeBounds.4
            @Override // android.util.Property
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public PointF get(View view) {
                return null;
            }

            @Override // android.util.Property
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public void set(View view, PointF pointF) {
                ViewUtils.O(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
            }
        };
        ul = new Property<View, PointF>(cls, "position") { // from class: androidx.transition.ChangeBounds.5
            @Override // android.util.Property
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public PointF get(View view) {
                return null;
            }

            @Override // android.util.Property
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public void set(View view, PointF pointF) {
                int iRound = Math.round(pointF.x);
                int iRound2 = Math.round(pointF.y);
                ViewUtils.O(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
            }
        };
    }

    private void pJg(TransitionValues transitionValues) {
        View view = transitionValues.rl;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        transitionValues.f42259n.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        transitionValues.f42259n.put("android:changeBounds:parent", transitionValues.rl.getParent());
        if (this.ofS) {
            transitionValues.f42259n.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.transition.Transition
    public Animator ck(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int i2;
        int i3;
        int i5;
        int i7;
        ObjectAnimator objectAnimatorN;
        int i8;
        Rect rect;
        ObjectAnimator objectAnimatorOfObject;
        Animator animatorT;
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        Map map = transitionValues.f42259n;
        Map map2 = transitionValues2.f42259n;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = transitionValues2.rl;
        Rect rect2 = (Rect) transitionValues.f42259n.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) transitionValues2.f42259n.get("android:changeBounds:bounds");
        int i9 = rect2.left;
        int i10 = rect3.left;
        int i11 = rect2.top;
        int i12 = rect3.top;
        int i13 = rect2.right;
        int i14 = rect3.right;
        int i15 = rect2.bottom;
        int i16 = rect3.bottom;
        int i17 = i13 - i9;
        int i18 = i15 - i11;
        int i19 = i14 - i10;
        int i20 = i16 - i12;
        Rect rect4 = (Rect) transitionValues.f42259n.get("android:changeBounds:clip");
        Rect rect5 = (Rect) transitionValues2.f42259n.get("android:changeBounds:clip");
        if ((i17 == 0 || i18 == 0) && (i19 == 0 || i20 == 0)) {
            i2 = 0;
        } else {
            i2 = (i9 == i10 && i11 == i12) ? 0 : 1;
            if (i13 != i14 || i15 != i16) {
                i2++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i2++;
        }
        if (i2 <= 0) {
            return null;
        }
        if (this.ofS) {
            ViewUtils.O(view, i9, i11, Math.max(i17, i19) + i9, i11 + Math.max(i18, i20));
            if (i9 == i10 && i11 == i12) {
                objectAnimatorN = null;
                i3 = i15;
                i5 = i16;
                i7 = i10;
            } else {
                i3 = i15;
                i5 = i16;
                i7 = i10;
                objectAnimatorN = ObjectAnimatorUtils.n(view, ul, nY().n(i9, i11, i10, i12));
            }
            boolean z2 = rect4 == null;
            if (z2) {
                i8 = 0;
                rect = new Rect(0, 0, i17, i18);
            } else {
                i8 = 0;
                rect = rect4;
            }
            boolean z3 = rect5 == null ? 1 : i8;
            Rect rect6 = z3 != 0 ? new Rect(i8, i8, i19, i20) : rect5;
            if (rect.equals(rect6)) {
                objectAnimatorOfObject = null;
            } else {
                view.setClipBounds(rect);
                objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", n1, rect, rect6);
                ClipListener clipListener = new ClipListener(view, rect, z2, rect6, z3, i9, i11, i13, i3, i7, i12, i14, i5);
                objectAnimatorOfObject.addListener(clipListener);
                t(clipListener);
            }
            animatorT = TransitionUtils.t(objectAnimatorN, objectAnimatorOfObject);
        } else {
            ViewUtils.O(view, i9, i11, i13, i15);
            if (i2 != 2) {
                animatorT = (i9 == i10 && i11 == i12) ? ObjectAnimatorUtils.n(view, fcU, nY().n(i13, i15, i14, i16)) : ObjectAnimatorUtils.n(view, eWT, nY().n(i9, i11, i10, i12));
            } else if (i17 == i19 && i18 == i20) {
                animatorT = ObjectAnimatorUtils.n(view, ul, nY().n(i9, i11, i10, i12));
            } else {
                ViewBounds viewBounds = new ViewBounds(view);
                ObjectAnimator objectAnimatorN2 = ObjectAnimatorUtils.n(viewBounds, Mx, nY().n(i9, i11, i10, i12));
                ObjectAnimator objectAnimatorN3 = ObjectAnimatorUtils.n(viewBounds, f42138G7, nY().n(i13, i15, i14, i16));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorN2, objectAnimatorN3);
                animatorSet.addListener(new AnimatorListenerAdapter(viewBounds) { // from class: androidx.transition.ChangeBounds.6
                    private final ViewBounds mViewBounds;

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    final /* synthetic */ ViewBounds f42139n;

                    {
                        this.f42139n = viewBounds;
                        this.mViewBounds = viewBounds;
                    }
                });
                animatorT = animatorSet;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            ViewGroupUtils.t(viewGroup4, true);
            te().t(new SuppressLayoutListener(viewGroup4));
        }
        return animatorT;
    }

    @Override // androidx.transition.Transition
    public String[] nHg() {
        return f42137C;
    }

    @Override // androidx.transition.Transition
    public void qie(TransitionValues transitionValues) {
        Rect rect;
        pJg(transitionValues);
        if (this.ofS && (rect = (Rect) transitionValues.rl.getTag(R.id.f42197O)) != null) {
            transitionValues.f42259n.put("android:changeBounds:clip", rect);
        }
    }

    @Override // androidx.transition.Transition
    public void xMQ(TransitionValues transitionValues) {
        pJg(transitionValues);
    }
}
