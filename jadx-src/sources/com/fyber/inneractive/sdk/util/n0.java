package com.fyber.inneractive.sdk.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f57015b = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakHashMap f57014a = new WeakHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f57016c = new j(16, new i0());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f57017d = new j(16, new j0());

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Context context, View view, m0 m0Var) {
        IAlog.a("%strackView called with context: %s view: %s", "IAVisibilityTracker: ", context, view);
        if (context == null) {
            throw new IllegalStateException("View must be attached to an Activity context");
        }
        Context applicationContext = context.getApplicationContext();
        WeakHashMap weakHashMap = (WeakHashMap) this.f57015b.get(applicationContext);
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            this.f57015b.put(applicationContext, weakHashMap);
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                View decorView = activity.getWindow() != null ? activity.getWindow().getDecorView() : view.getRootView();
                ViewTreeObserver viewTreeObserver = decorView.getViewTreeObserver();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    k0 k0Var = new k0(this, applicationContext);
                    viewTreeObserver.addOnPreDrawListener(k0Var);
                    this.f57014a.put(applicationContext, new Pair(viewTreeObserver, k0Var));
                }
            }
        }
        weakHashMap.put(view, m0Var);
        b();
    }

    public final void b(Context context) {
        WeakHashMap weakHashMap;
        if (context == null || (weakHashMap = (WeakHashMap) this.f57015b.get(context)) == null) {
            return;
        }
        j jVar = this.f57017d;
        Object objPoll = jVar.f57004a.poll();
        if (objPoll == null) {
            objPoll = jVar.f57005b.a();
        }
        HashSet<View> hashSet = (HashSet) objPoll;
        hashSet.addAll(weakHashMap.keySet());
        for (View view : hashSet) {
            m0 m0Var = (m0) weakHashMap.get(view);
            if (m0Var != null) {
                j jVar2 = this.f57016c;
                Object objPoll2 = jVar2.f57004a.poll();
                if (objPoll2 == null) {
                    objPoll2 = jVar2.f57005b.a();
                }
                Rect rect = (Rect) objPoll2;
                m0Var.a((view == null || view.getParent() == null || !view.isShown() || !view.getGlobalVisibleRect(rect)) ? 0.0f : (rect.width() * rect.height()) / (view.getWidth() * view.getHeight()), rect);
                this.f57016c.f57004a.offer(rect);
            }
        }
        hashSet.clear();
        this.f57017d.f57004a.offer(hashSet);
    }

    public final void a(View view) {
        IAlog.a("%sunTrackView called with view", "IAVisibilityTracker: ");
        if (view == null) {
            IAlog.a("%sunTrackView called with a null view!", "IAVisibilityTracker: ");
            return;
        }
        Context context = view.getContext();
        if (context == null) {
            IAlog.a("%sview.getContext() returned null!", "IAVisibilityTracker: ");
            return;
        }
        Map map = (Map) this.f57015b.get(context);
        if (map != null) {
            if (map.remove(view) != null) {
                if (IAlog.f56974a <= 2) {
                    IAlog.e("removeViewFromContext found view for removal!", new Object[0]);
                }
                if (map.isEmpty()) {
                    this.f57015b.remove(context);
                    a(context);
                }
            }
        } else {
            for (Context context2 : new HashSet(this.f57015b.keySet())) {
                WeakHashMap weakHashMap = (WeakHashMap) this.f57015b.get(context2);
                if (weakHashMap != null && weakHashMap.remove(view) != null) {
                    if (IAlog.f56974a <= 2) {
                        IAlog.e("removeViewFromContext found view for removal!", new Object[0]);
                    }
                    if (weakHashMap.isEmpty()) {
                        this.f57015b.remove(context2);
                        a(context2);
                    }
                }
            }
        }
        b();
    }

    public final void b() {
        for (Context context : this.f57015b.keySet()) {
            IAlog.a("%stracking context: %s", "IAVisibilityTracker: ", context);
            WeakHashMap weakHashMap = (WeakHashMap) this.f57015b.get(context);
            if (weakHashMap != null) {
                Iterator it = weakHashMap.keySet().iterator();
                while (it.hasNext()) {
                    IAlog.a("%stracking view: %s", "IAVisibilityTracker: ", (View) it.next());
                }
            }
        }
    }

    public final void a() {
        this.f57015b.clear();
        Iterator it = this.f57014a.keySet().iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) this.f57014a.get((Context) it.next());
            if (pair != null && ((ViewTreeObserver) pair.first).isAlive()) {
                ((ViewTreeObserver) pair.first).removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) pair.second);
            }
        }
        this.f57014a.clear();
    }

    public final void a(Context context) {
        Pair pair = (Pair) this.f57014a.get(context);
        if (pair != null) {
            if (((ViewTreeObserver) pair.first).isAlive()) {
                ((ViewTreeObserver) pair.first).removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) pair.second);
            }
            this.f57014a.remove(context);
        }
    }
}
