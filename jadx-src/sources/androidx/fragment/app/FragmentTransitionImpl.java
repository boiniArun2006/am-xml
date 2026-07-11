package androidx.fragment.app;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.core.os.CancellationSignal;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RestrictTo
public abstract class FragmentTransitionImpl {
    private static boolean xMQ(List list, View view, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (list.get(i3) == view) {
                return true;
            }
        }
        return false;
    }

    public abstract Object HI(Object obj, Object obj2, Object obj3);

    public abstract Object KN(Object obj);

    public abstract void O(ViewGroup viewGroup, Object obj);

    public abstract void S(Object obj, View view);

    public abstract boolean Uo(Object obj);

    public void WPU(Fragment fragment, Object obj, CancellationSignal cancellationSignal, Runnable runnable) {
        aYN(fragment, obj, cancellationSignal, null, runnable);
    }

    public abstract void XQ(Object obj, Rect rect);

    public void Z(Object obj, float f3) {
    }

    public boolean az() {
        if (!FragmentManager.F(4)) {
            return false;
        }
        Log.i("FragmentManager", "Older versions of AndroidX Transition do not support seeking. Add dependency on AndroidX Transition 1.5.0 or higher to enable seeking.");
        return false;
    }

    public abstract Object ck(Object obj, Object obj2, Object obj3);

    public abstract void g(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public Object mUb(ViewGroup viewGroup, Object obj) {
        return null;
    }

    public abstract void n(Object obj, View view);

    public abstract void nY(Object obj, View view, ArrayList arrayList);

    public void nr(Object obj, Runnable runnable) {
    }

    public abstract void o(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3);

    public abstract void r(Object obj, View view, ArrayList arrayList);

    public abstract void rl(Object obj, ArrayList arrayList);

    public void t(Object obj) {
    }

    public abstract Object te(Object obj);

    public boolean ty(Object obj) {
        return false;
    }

    protected static boolean qie(List list) {
        return list == null || list.isEmpty();
    }

    ArrayList Ik(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) arrayList.get(i2);
            arrayList2.add(ViewCompat.N(view));
            ViewCompat.UhV(view, null);
        }
        return arrayList2;
    }

    protected static void J2(List list, View view) {
        int size = list.size();
        if (!xMQ(list, view, size)) {
            if (ViewCompat.N(view) != null) {
                list.add(view);
            }
            for (int i2 = size; i2 < list.size(); i2++) {
                View view2 = (View) list.get(i2);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = viewGroup.getChildAt(i3);
                        if (!xMQ(list, childAt, size) && ViewCompat.N(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    void ViF(View view, final ArrayList arrayList, final ArrayList arrayList2, final ArrayList arrayList3, Map map) {
        final int size = arrayList2.size();
        final ArrayList arrayList4 = new ArrayList();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = (View) arrayList.get(i2);
            String strN = ViewCompat.N(view2);
            arrayList4.add(strN);
            if (strN != null) {
                ViewCompat.UhV(view2, null);
                String str = (String) map.get(strN);
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i3))) {
                        ViewCompat.UhV((View) arrayList2.get(i3), strN);
                        break;
                    }
                    i3++;
                }
            }
        }
        OneShotPreDrawListener.n(view, new Runnable() { // from class: androidx.fragment.app.FragmentTransitionImpl.1
            @Override // java.lang.Runnable
            public void run() {
                for (int i5 = 0; i5 < size; i5++) {
                    ViewCompat.UhV((View) arrayList2.get(i5), (String) arrayList3.get(i5));
                    ViewCompat.UhV((View) arrayList.get(i5), (String) arrayList4.get(i5));
                }
            }
        });
    }

    public void aYN(Fragment fragment, Object obj, CancellationSignal cancellationSignal, Runnable runnable, Runnable runnable2) {
        runnable2.run();
    }

    protected void gh(View view, Rect rect) {
        if (!view.isAttachedToWindow()) {
            return;
        }
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getMatrix().mapRect(rectF);
        rectF.offset(view.getLeft(), view.getTop());
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            rectF.offset(-view2.getScrollX(), -view2.getScrollY());
            view2.getMatrix().mapRect(rectF);
            rectF.offset(view2.getLeft(), view2.getTop());
            parent = view2.getParent();
        }
        view.getRootView().getLocationOnScreen(new int[2]);
        rectF.offset(r1[0], r1[1]);
        rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }
}
