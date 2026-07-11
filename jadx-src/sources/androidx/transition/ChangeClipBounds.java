package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class ChangeClipBounds extends Transition {
    private static final String[] ofS = {"android:clipBounds:clip"};

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    static final Rect f42147C = new Rect();

    private static class Listener extends AnimatorListenerAdapter implements Transition.TransitionListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Rect f42148n;
        private final Rect rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final View f42149t;

        @Override // androidx.transition.Transition.TransitionListener
        public void O(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void gh(Transition transition) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void xMQ(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void J2(Transition transition) {
            Rect clipBounds = this.f42149t.getClipBounds();
            if (clipBounds == null) {
                clipBounds = ChangeClipBounds.f42147C;
            }
            this.f42149t.setTag(R.id.f42197O, clipBounds);
            this.f42149t.setClipBounds(this.rl);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void nr(Transition transition) {
            View view = this.f42149t;
            int i2 = R.id.f42197O;
            this.f42149t.setClipBounds((Rect) view.getTag(i2));
            this.f42149t.setTag(i2, null);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z2) {
            if (z2) {
                this.f42149t.setClipBounds(this.f42148n);
            } else {
                this.f42149t.setClipBounds(this.rl);
            }
        }

        Listener(View view, Rect rect, Rect rect2) {
            this.f42149t = view;
            this.f42148n = rect;
            this.rl = rect2;
        }
    }

    @Override // androidx.transition.Transition
    public Animator ck(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null || !transitionValues.f42259n.containsKey("android:clipBounds:clip") || !transitionValues2.f42259n.containsKey("android:clipBounds:clip")) {
            return null;
        }
        Rect rect = (Rect) transitionValues.f42259n.get("android:clipBounds:clip");
        Rect rect2 = (Rect) transitionValues2.f42259n.get("android:clipBounds:clip");
        if (rect == null && rect2 == null) {
            return null;
        }
        Rect rect3 = rect == null ? (Rect) transitionValues.f42259n.get("android:clipBounds:bounds") : rect;
        Rect rect4 = rect2 == null ? (Rect) transitionValues2.f42259n.get("android:clipBounds:bounds") : rect2;
        if (rect3.equals(rect4)) {
            return null;
        }
        transitionValues2.rl.setClipBounds(rect);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(transitionValues2.rl, (Property<View, V>) ViewUtils.f42271t, new RectEvaluator(new Rect()), rect3, rect4);
        Listener listener = new Listener(transitionValues2.rl, rect, rect2);
        objectAnimatorOfObject.addListener(listener);
        t(listener);
        return objectAnimatorOfObject;
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

    private void pJg(TransitionValues transitionValues, boolean z2) {
        View view = transitionValues.rl;
        if (view.getVisibility() == 8) {
            return;
        }
        Rect clipBounds = z2 ? (Rect) view.getTag(R.id.f42197O) : null;
        if (clipBounds == null) {
            clipBounds = view.getClipBounds();
        }
        Rect rect = clipBounds != f42147C ? clipBounds : null;
        transitionValues.f42259n.put("android:clipBounds:clip", rect);
        if (rect == null) {
            transitionValues.f42259n.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
        }
    }

    @Override // androidx.transition.Transition
    public String[] nHg() {
        return ofS;
    }
}
