package androidx.transition;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.core.os.CancellationSignal;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransitionImpl;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RestrictTo
public class FragmentTransitionSupport extends FragmentTransitionImpl {
    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void WPU(Fragment fragment, Object obj, CancellationSignal cancellationSignal, Runnable runnable) {
        aYN(fragment, obj, cancellationSignal, null, runnable);
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public boolean az() {
        return true;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public boolean ty(Object obj) {
        boolean zV2 = ((Transition) obj).v();
        if (!zV2) {
            Log.v("FragmentManager", "Predictive back not available for AndroidX Transition " + obj + ". Please enable seeking support for the designated transition by overriding isSeekingSupported().");
        }
        return zV2;
    }

    public static /* synthetic */ void iF(Runnable runnable, Transition transition, Runnable runnable2) {
        if (runnable != null) {
            runnable.run();
        } else {
            transition.cancel();
            runnable2.run();
        }
    }

    public void E2(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        Transition transition = (Transition) obj;
        int i2 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int iFcU = transitionSet.fcU();
            while (i2 < iFcU) {
                E2(transitionSet.G7(i2), arrayList, arrayList2);
                i2++;
            }
            return;
        }
        if (fD(transition)) {
            return;
        }
        List listT = transition.T();
        if (listT.size() == arrayList.size() && listT.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i2 < size) {
                transition.nr((View) arrayList2.get(i2));
                i2++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.a((View) arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public Object HI(Object obj, Object obj2, Object obj3) {
        Transition transitionQm = (Transition) obj;
        Transition transition = (Transition) obj2;
        Transition transition2 = (Transition) obj3;
        if (transitionQm != null && transition != null) {
            transitionQm = new TransitionSet().C(transitionQm).C(transition).qm(1);
        } else if (transitionQm == null) {
            transitionQm = transition != null ? transition : null;
        }
        if (transition2 == null) {
            return transitionQm;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transitionQm != null) {
            transitionSet.C(transitionQm);
        }
        transitionSet.C(transition2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public Object KN(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void O(ViewGroup viewGroup, Object obj) {
        TransitionManager.n(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void S(Object obj, View view) {
        if (view != null) {
            final Rect rect = new Rect();
            gh(view, rect);
            ((Transition) obj).dR0(new Transition.EpicenterCallback() { // from class: androidx.transition.FragmentTransitionSupport.1
                @Override // androidx.transition.Transition.EpicenterCallback
                public Rect n(Transition transition) {
                    return rect;
                }
            });
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public boolean Uo(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void XQ(Object obj, final Rect rect) {
        if (obj != null) {
            ((Transition) obj).dR0(new Transition.EpicenterCallback() { // from class: androidx.transition.FragmentTransitionSupport.5
                @Override // androidx.transition.Transition.EpicenterCallback
                public Rect n(Transition transition) {
                    Rect rect2 = rect;
                    if (rect2 == null || rect2.isEmpty()) {
                        return null;
                    }
                    return rect;
                }
            });
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void Z(Object obj, float f3) {
        TransitionSeekController transitionSeekController = (TransitionSeekController) obj;
        if (transitionSeekController.isReady()) {
            long jRl = (long) (f3 * transitionSeekController.rl());
            if (jRl == 0) {
                jRl = 1;
            }
            if (jRl == transitionSeekController.rl()) {
                jRl = transitionSeekController.rl() - 1;
            }
            transitionSeekController.Uo(jRl);
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void aYN(Fragment fragment, Object obj, CancellationSignal cancellationSignal, final Runnable runnable, final Runnable runnable2) {
        final Transition transition = (Transition) obj;
        cancellationSignal.t(new CancellationSignal.OnCancelListener() { // from class: androidx.transition.j
            @Override // androidx.core.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                FragmentTransitionSupport.iF(runnable, transition, runnable2);
            }
        });
        transition.t(new Transition.TransitionListener() { // from class: androidx.transition.FragmentTransitionSupport.4
            @Override // androidx.transition.Transition.TransitionListener
            public void J2(Transition transition2) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void O(Transition transition2) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void gh(Transition transition2) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void nr(Transition transition2) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void xMQ(Transition transition2) {
                runnable2.run();
            }
        });
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public Object ck(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.C((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.C((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.C((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void g(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.T().clear();
            transitionSet.T().addAll(arrayList2);
            E2(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public Object mUb(ViewGroup viewGroup, Object obj) {
        return TransitionManager.rl(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void n(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).nr(view);
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void nY(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List listT = transitionSet.T();
        listT.clear();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            FragmentTransitionImpl.J2(listT, (View) arrayList.get(i2));
        }
        listT.add(view);
        arrayList.add(view);
        rl(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void nr(Object obj, Runnable runnable) {
        ((TransitionSeekController) obj).mUb(runnable);
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void o(Object obj, final Object obj2, final ArrayList arrayList, final Object obj3, final ArrayList arrayList2, final Object obj4, final ArrayList arrayList3) {
        ((Transition) obj).t(new TransitionListenerAdapter() { // from class: androidx.transition.FragmentTransitionSupport.3
            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void O(Transition transition) {
                Object obj5 = obj2;
                if (obj5 != null) {
                    FragmentTransitionSupport.this.E2(obj5, arrayList, null);
                }
                Object obj6 = obj3;
                if (obj6 != null) {
                    FragmentTransitionSupport.this.E2(obj6, arrayList2, null);
                }
                Object obj7 = obj4;
                if (obj7 != null) {
                    FragmentTransitionSupport.this.E2(obj7, arrayList3, null);
                }
            }

            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void xMQ(Transition transition) {
                transition.D(this);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void r(Object obj, final View view, final ArrayList arrayList) {
        ((Transition) obj).t(new Transition.TransitionListener() { // from class: androidx.transition.FragmentTransitionSupport.2
            @Override // androidx.transition.Transition.TransitionListener
            public void J2(Transition transition) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void gh(Transition transition) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void nr(Transition transition) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void O(Transition transition) {
                transition.D(this);
                transition.t(this);
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void xMQ(Transition transition) {
                transition.D(this);
                view.setVisibility(8);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((View) arrayList.get(i2)).setVisibility(0);
                }
            }
        });
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void rl(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i2 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int iFcU = transitionSet.fcU();
            while (i2 < iFcU) {
                rl(transitionSet.G7(i2), arrayList);
                i2++;
            }
            return;
        }
        if (fD(transition) || !FragmentTransitionImpl.qie(transition.T())) {
            return;
        }
        int size = arrayList.size();
        while (i2 < size) {
            transition.nr((View) arrayList.get(i2));
            i2++;
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void t(Object obj) {
        ((TransitionSeekController) obj).n();
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public Object te(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.C((Transition) obj);
        return transitionSet;
    }

    private static boolean fD(Transition transition) {
        if (FragmentTransitionImpl.qie(transition.E2()) && FragmentTransitionImpl.qie(transition.e()) && FragmentTransitionImpl.qie(transition.X())) {
            return false;
        }
        return true;
    }
}
