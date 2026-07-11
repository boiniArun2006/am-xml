package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.motion.widget.ViewTransition;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.SharedValues;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class ViewTransitionController {
    ArrayList J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    ArrayList f35806O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final MotionLayout f35807n;
    private String nr;
    private ArrayList rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private HashSet f35808t;

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.ViewTransitionController$1, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    class AnonymousClass1 implements SharedValues.SharedValuesListener {
    }

    private void KN(ViewTransition viewTransition, View... viewArr) {
        int currentState = this.f35807n.getCurrentState();
        if (viewTransition.f35797O == 2) {
            viewTransition.t(this, this.f35807n, currentState, null, viewArr);
            return;
        }
        if (currentState != -1) {
            ConstraintSet constraintSetETf = this.f35807n.eTf(currentState);
            if (constraintSetETf == null) {
                return;
            }
            viewTransition.t(this, this.f35807n, currentState, constraintSetETf, viewArr);
            return;
        }
        Log.w(this.nr, "No support for ViewTransition within transition yet. Currently: " + this.f35807n.toString());
    }

    void J2(MotionEvent motionEvent) {
        int currentState = this.f35807n.getCurrentState();
        if (currentState == -1) {
            return;
        }
        if (this.f35808t == null) {
            this.f35808t = new HashSet();
            for (ViewTransition viewTransition : this.rl) {
                int childCount = this.f35807n.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = this.f35807n.getChildAt(i2);
                    if (viewTransition.Uo(childAt)) {
                        childAt.getId();
                        this.f35808t.add(childAt);
                    }
                }
            }
        }
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        Rect rect = new Rect();
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f35806O;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = this.f35806O.iterator();
            while (it.hasNext()) {
                ((ViewTransition.Animate) it.next()).nr(action, x2, y2);
            }
        }
        if (action == 0 || action == 1) {
            ConstraintSet constraintSetETf = this.f35807n.eTf(currentState);
            for (ViewTransition viewTransition2 : this.rl) {
                if (viewTransition2.KN(action)) {
                    for (View view : this.f35808t) {
                        if (viewTransition2.Uo(view)) {
                            view.getHitRect(rect);
                            if (rect.contains((int) x2, (int) y2)) {
                                viewTransition2.t(this, this.f35807n, currentState, constraintSetETf, view);
                            }
                        }
                    }
                }
            }
        }
    }

    void O(ViewTransition.Animate animate) {
        this.J2.add(animate);
    }

    void Uo(int i2, View... viewArr) {
        ArrayList arrayList = new ArrayList();
        ViewTransition viewTransition = null;
        for (ViewTransition viewTransition2 : this.rl) {
            if (viewTransition2.O() == i2) {
                for (View view : viewArr) {
                    if (viewTransition2.nr(view)) {
                        arrayList.add(view);
                    }
                }
                if (!arrayList.isEmpty()) {
                    KN(viewTransition2, (View[]) arrayList.toArray(new View[0]));
                    arrayList.clear();
                }
                viewTransition = viewTransition2;
            }
        }
        if (viewTransition == null) {
            Log.e(this.nr, " Could not find ViewTransition");
        }
    }

    void n(ViewTransition.Animate animate) {
        if (this.f35806O == null) {
            this.f35806O = new ArrayList();
        }
        this.f35806O.add(animate);
    }

    void nr() {
        this.f35807n.invalidate();
    }

    void rl() {
        ArrayList arrayList = this.f35806O;
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ViewTransition.Animate) it.next()).n();
        }
        this.f35806O.removeAll(this.J2);
        this.J2.clear();
        if (this.f35806O.isEmpty()) {
            this.f35806O = null;
        }
    }

    boolean t(int i2, MotionController motionController) {
        for (ViewTransition viewTransition : this.rl) {
            if (viewTransition.O() == i2) {
                viewTransition.J2.n(motionController);
                return true;
            }
        }
        return false;
    }
}
