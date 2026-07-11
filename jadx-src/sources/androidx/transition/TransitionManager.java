package androidx.transition;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.collection.ArrayMap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class TransitionManager {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static Transition f42246n = new AutoTransition();
    private static ThreadLocal rl = new ThreadLocal();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static ArrayList f42247t = new ArrayList();

    private static class MultiListener implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Transition f42248n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        ViewGroup f42249t;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        private void n() {
            this.f42249t.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f42249t.removeOnAttachStateChangeListener(this);
        }

        MultiListener(Transition transition, ViewGroup viewGroup) {
            this.f42248n = transition;
            this.f42249t = viewGroup;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            n();
            if (!TransitionManager.f42247t.remove(this.f42249t)) {
                return true;
            }
            final ArrayMap arrayMapT = TransitionManager.t();
            ArrayList arrayList = (ArrayList) arrayMapT.get(this.f42249t);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                arrayMapT.put(this.f42249t, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f42248n);
            this.f42248n.t(new TransitionListenerAdapter() { // from class: androidx.transition.TransitionManager.MultiListener.1
                @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                public void xMQ(Transition transition) {
                    ((ArrayList) arrayMapT.get(MultiListener.this.f42249t)).remove(transition);
                    transition.D(this);
                }
            });
            this.f42248n.az(this.f42249t, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).I(this.f42249t);
                }
            }
            this.f42248n.B(this.f42249t);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            n();
            TransitionManager.f42247t.remove(this.f42249t);
            ArrayList arrayList = (ArrayList) TransitionManager.t().get(this.f42249t);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).I(this.f42249t);
                }
            }
            this.f42248n.ty(true);
        }
    }

    public static void n(ViewGroup viewGroup, Transition transition) {
        if (f42247t.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        f42247t.add(viewGroup);
        if (transition == null) {
            transition = f42246n;
        }
        Transition transitionClone = transition.clone();
        O(viewGroup, transitionClone);
        Scene.t(viewGroup, null);
        nr(viewGroup, transitionClone);
    }

    private static void nr(ViewGroup viewGroup, Transition transition) {
        if (transition == null || viewGroup == null) {
            return;
        }
        MultiListener multiListener = new MultiListener(transition, viewGroup);
        viewGroup.addOnAttachStateChangeListener(multiListener);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(multiListener);
    }

    public static TransitionSeekController rl(ViewGroup viewGroup, Transition transition) {
        if (f42247t.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!transition.v()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        f42247t.add(viewGroup);
        Transition transitionClone = transition.clone();
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.C(transitionClone);
        O(viewGroup, transitionSet);
        Scene.t(viewGroup, null);
        nr(viewGroup, transitionSet);
        viewGroup.invalidate();
        return transitionSet.r();
    }

    static ArrayMap t() {
        ArrayMap arrayMap;
        WeakReference weakReference = (WeakReference) rl.get();
        if (weakReference != null && (arrayMap = (ArrayMap) weakReference.get()) != null) {
            return arrayMap;
        }
        ArrayMap arrayMap2 = new ArrayMap();
        rl.set(new WeakReference(arrayMap2));
        return arrayMap2;
    }

    private static void O(ViewGroup viewGroup, Transition transition) {
        ArrayList arrayList = (ArrayList) t().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Transition) it.next()).FX(viewGroup);
            }
        }
        if (transition != null) {
            transition.az(viewGroup, true);
        }
        Scene sceneRl = Scene.rl(viewGroup);
        if (sceneRl != null) {
            sceneRl.n();
        }
    }
}
