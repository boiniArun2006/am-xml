package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.transition.Transition;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class Visibility extends Transition {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final String[] f42275C = {"android:visibility:visibility", "android:visibility:parent"};
    private int ofS = 3;

    private static class DisappearListener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        boolean J2 = false;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private boolean f42276O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final View f42277n;
        private final boolean nr;
        private final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final ViewGroup f42278t;

        @Override // androidx.transition.Transition.TransitionListener
        public void J2(Transition transition) {
            rl(false);
            if (this.J2) {
                return;
            }
            ViewUtils.Uo(this.f42277n, this.rl);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void O(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void gh(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void nr(Transition transition) {
            rl(true);
            if (this.J2) {
                return;
            }
            ViewUtils.Uo(this.f42277n, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.J2 = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            n();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        private void n() {
            if (!this.J2) {
                ViewUtils.Uo(this.f42277n, this.rl);
                ViewGroup viewGroup = this.f42278t;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            rl(false);
        }

        private void rl(boolean z2) {
            ViewGroup viewGroup;
            if (!this.nr || this.f42276O == z2 || (viewGroup = this.f42278t) == null) {
                return;
            }
            this.f42276O = z2;
            ViewGroupUtils.t(viewGroup, z2);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z2) {
            if (z2) {
                return;
            }
            n();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z2) {
            if (z2) {
                ViewUtils.Uo(this.f42277n, 0);
                ViewGroup viewGroup = this.f42278t;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }

        DisappearListener(View view, int i2, boolean z2) {
            this.f42277n = view;
            this.rl = i2;
            this.f42278t = (ViewGroup) view.getParent();
            this.nr = z2;
            rl(true);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void xMQ(Transition transition) {
            transition.D(this);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Mode {
    }

    private class OverlayListener extends AnimatorListenerAdapter implements Transition.TransitionListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ViewGroup f42280n;
        private boolean nr = true;
        private final View rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final View f42281t;

        @Override // androidx.transition.Transition.TransitionListener
        public void J2(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void O(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void nr(Transition transition) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            n();
        }

        OverlayListener(ViewGroup viewGroup, View view, View view2) {
            this.f42280n = viewGroup;
            this.rl = view;
            this.f42281t = view2;
        }

        private void n() {
            this.f42281t.setTag(R.id.nr, null);
            this.f42280n.getOverlay().remove(this.rl);
            this.nr = false;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void gh(Transition transition) {
            if (this.nr) {
                n();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z2) {
            if (z2) {
                return;
            }
            n();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f42280n.getOverlay().remove(this.rl);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.rl.getParent() == null) {
                this.f42280n.getOverlay().add(this.rl);
            } else {
                Visibility.this.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z2) {
            if (z2) {
                this.f42281t.setTag(R.id.nr, this.rl);
                this.f42280n.getOverlay().add(this.rl);
                this.nr = true;
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void xMQ(Transition transition) {
            transition.D(this);
        }
    }

    public Animator C(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return null;
    }

    public Animator G7(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return null;
    }

    @Override // androidx.transition.Transition
    public boolean rV9(TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null && transitionValues2 == null) {
            return false;
        }
        if (transitionValues != null && transitionValues2 != null && transitionValues2.f42259n.containsKey("android:visibility:visibility") != transitionValues.f42259n.containsKey("android:visibility:visibility")) {
            return false;
        }
        VisibilityInfo visibilityInfoOfS = ofS(transitionValues, transitionValues2);
        return visibilityInfoOfS.f42283n && (visibilityInfoOfS.f42284t == 0 || visibilityInfoOfS.nr == 0);
    }

    private static class VisibilityInfo {
        ViewGroup J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        ViewGroup f42282O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f42283n;
        int nr;
        boolean rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f42284t;

        VisibilityInfo() {
        }
    }

    private VisibilityInfo ofS(TransitionValues transitionValues, TransitionValues transitionValues2) {
        VisibilityInfo visibilityInfo = new VisibilityInfo();
        visibilityInfo.f42283n = false;
        visibilityInfo.rl = false;
        if (transitionValues == null || !transitionValues.f42259n.containsKey("android:visibility:visibility")) {
            visibilityInfo.f42284t = -1;
            visibilityInfo.f42282O = null;
        } else {
            visibilityInfo.f42284t = ((Integer) transitionValues.f42259n.get("android:visibility:visibility")).intValue();
            visibilityInfo.f42282O = (ViewGroup) transitionValues.f42259n.get("android:visibility:parent");
        }
        if (transitionValues2 == null || !transitionValues2.f42259n.containsKey("android:visibility:visibility")) {
            visibilityInfo.nr = -1;
            visibilityInfo.J2 = null;
        } else {
            visibilityInfo.nr = ((Integer) transitionValues2.f42259n.get("android:visibility:visibility")).intValue();
            visibilityInfo.J2 = (ViewGroup) transitionValues2.f42259n.get("android:visibility:parent");
        }
        if (transitionValues != null && transitionValues2 != null) {
            int i2 = visibilityInfo.f42284t;
            int i3 = visibilityInfo.nr;
            if (i2 != i3 || visibilityInfo.f42282O != visibilityInfo.J2) {
                if (i2 != i3) {
                    if (i2 == 0) {
                        visibilityInfo.rl = false;
                        visibilityInfo.f42283n = true;
                        return visibilityInfo;
                    }
                    if (i3 == 0) {
                        visibilityInfo.rl = true;
                        visibilityInfo.f42283n = true;
                        return visibilityInfo;
                    }
                } else {
                    if (visibilityInfo.J2 == null) {
                        visibilityInfo.rl = false;
                        visibilityInfo.f42283n = true;
                        return visibilityInfo;
                    }
                    if (visibilityInfo.f42282O == null) {
                        visibilityInfo.rl = true;
                        visibilityInfo.f42283n = true;
                        return visibilityInfo;
                    }
                }
            }
        } else {
            if (transitionValues == null && visibilityInfo.nr == 0) {
                visibilityInfo.rl = true;
                visibilityInfo.f42283n = true;
                return visibilityInfo;
            }
            if (transitionValues2 == null && visibilityInfo.f42284t == 0) {
                visibilityInfo.rl = false;
                visibilityInfo.f42283n = true;
            }
        }
        return visibilityInfo;
    }

    private void pJg(TransitionValues transitionValues) {
        transitionValues.f42259n.put("android:visibility:visibility", Integer.valueOf(transitionValues.rl.getVisibility()));
        transitionValues.f42259n.put("android:visibility:parent", transitionValues.rl.getParent());
        int[] iArr = new int[2];
        transitionValues.rl.getLocationOnScreen(iArr);
        transitionValues.f42259n.put("android:visibility:screenLocation", iArr);
    }

    public Animator Mx(ViewGroup viewGroup, TransitionValues transitionValues, int i2, TransitionValues transitionValues2, int i3) {
        if ((this.ofS & 1) != 1 || transitionValues2 == null) {
            return null;
        }
        if (transitionValues == null) {
            View view = (View) transitionValues2.rl.getParent();
            if (ofS(aYN(view, false), s7N(view, false)).f42283n) {
                return null;
            }
        }
        return C(viewGroup, transitionValues2.rl, transitionValues, transitionValues2);
    }

    public void eWT(int i2) {
        if ((i2 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.ofS = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069 A[PHI: r2
      0x0069: PHI (r2v3 android.view.View) = 
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v6 android.view.View)
     binds: [B:26:0x003e, B:31:0x004d, B:37:0x0076, B:39:0x0079, B:41:0x007f, B:43:0x0083, B:34:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Animator fcU(ViewGroup viewGroup, TransitionValues transitionValues, int i2, TransitionValues transitionValues2, int i3) {
        View view;
        boolean z2;
        View view2;
        boolean z3;
        if ((this.ofS & 2) != 2 || transitionValues == null) {
            return null;
        }
        View view3 = transitionValues.rl;
        View viewN = transitionValues2 != null ? transitionValues2.rl : null;
        int i5 = R.id.nr;
        View view4 = (View) view3.getTag(i5);
        if (view4 != null) {
            view2 = null;
            z3 = true;
        } else if (viewN == null || viewN.getParent() == null) {
            if (viewN != null) {
                view = null;
                z2 = false;
            } else {
                viewN = null;
                view = null;
                z2 = true;
            }
            if (z2) {
                if (view3.getParent() != null) {
                    if (view3.getParent() instanceof View) {
                        View view5 = (View) view3.getParent();
                        if (ofS(s7N(view5, true), aYN(view5, true)).f42283n) {
                            int id = view5.getId();
                            if (view5.getParent() != null || id == -1 || viewGroup.findViewById(id) == null || !this.f42210E) {
                            }
                        } else {
                            viewN = TransitionUtils.n(viewGroup, view3, view5);
                        }
                    }
                    View view6 = view;
                    view4 = viewN;
                    view2 = view6;
                    z3 = false;
                }
                view2 = view;
                z3 = false;
                view4 = view3;
            } else {
                View view62 = view;
                view4 = viewN;
                view2 = view62;
                z3 = false;
            }
        } else {
            if (i3 == 4 || view3 == viewN) {
                view = viewN;
                z2 = false;
                viewN = null;
            }
            if (z2) {
            }
        }
        if (view4 == null) {
            if (view2 == null) {
                return null;
            }
            int visibility = view2.getVisibility();
            ViewUtils.Uo(view2, 0);
            Animator animatorG7 = G7(viewGroup, view2, transitionValues, transitionValues2);
            if (animatorG7 == null) {
                ViewUtils.Uo(view2, visibility);
                return animatorG7;
            }
            DisappearListener disappearListener = new DisappearListener(view2, i3, true);
            animatorG7.addListener(disappearListener);
            te().t(disappearListener);
            return animatorG7;
        }
        if (!z3) {
            int[] iArr = (int[]) transitionValues.f42259n.get("android:visibility:screenLocation");
            int i7 = iArr[0];
            int i8 = iArr[1];
            int[] iArr2 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            view4.offsetLeftAndRight((i7 - iArr2[0]) - view4.getLeft());
            view4.offsetTopAndBottom((i8 - iArr2[1]) - view4.getTop());
            viewGroup.getOverlay().add(view4);
        }
        Animator animatorG72 = G7(viewGroup, view4, transitionValues, transitionValues2);
        if (!z3) {
            if (animatorG72 == null) {
                viewGroup.getOverlay().remove(view4);
                return animatorG72;
            }
            view3.setTag(i5, view4);
            OverlayListener overlayListener = new OverlayListener(viewGroup, view4, view3);
            animatorG72.addListener(overlayListener);
            animatorG72.addPauseListener(overlayListener);
            te().t(overlayListener);
        }
        return animatorG72;
    }

    @Override // androidx.transition.Transition
    public String[] nHg() {
        return f42275C;
    }

    @Override // androidx.transition.Transition
    public Animator ck(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        VisibilityInfo visibilityInfoOfS = ofS(transitionValues, transitionValues2);
        if (visibilityInfoOfS.f42283n) {
            if (visibilityInfoOfS.f42282O != null || visibilityInfoOfS.J2 != null) {
                if (visibilityInfoOfS.rl) {
                    return Mx(viewGroup, transitionValues, visibilityInfoOfS.f42284t, transitionValues2, visibilityInfoOfS.nr);
                }
                return fcU(viewGroup, transitionValues, visibilityInfoOfS.f42284t, transitionValues2, visibilityInfoOfS.nr);
            }
            return null;
        }
        return null;
    }

    @Override // androidx.transition.Transition
    public void qie(TransitionValues transitionValues) {
        pJg(transitionValues);
    }

    @Override // androidx.transition.Transition
    public void xMQ(TransitionValues transitionValues) {
        pJg(transitionValues);
    }
}
