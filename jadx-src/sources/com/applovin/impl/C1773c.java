package com.applovin.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.applovin.impl.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class C1773c implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f48158a = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference f48159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference f48160c;

    public Activity a() {
        return (Activity) this.f48160c.get();
    }

    public Activity b() {
        return (Activity) this.f48159b.get();
    }

    public void a(AbstractC1772b abstractC1772b) {
        this.f48158a.add(abstractC1772b);
    }

    public void b(AbstractC1772b abstractC1772b) {
        this.f48158a.remove(abstractC1772b);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Iterator it = new ArrayList(this.f48158a).iterator();
        while (it.hasNext()) {
            ((AbstractC1772b) it.next()).onActivityCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Iterator it = new ArrayList(this.f48158a).iterator();
        while (it.hasNext()) {
            ((AbstractC1772b) it.next()).onActivityDestroyed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f48160c = new WeakReference(null);
        Iterator it = new ArrayList(this.f48158a).iterator();
        while (it.hasNext()) {
            ((AbstractC1772b) it.next()).onActivityPaused(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        WeakReference weakReference = new WeakReference(activity);
        this.f48159b = weakReference;
        this.f48160c = weakReference;
        Iterator it = new ArrayList(this.f48158a).iterator();
        while (it.hasNext()) {
            ((AbstractC1772b) it.next()).onActivityResumed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Iterator it = new ArrayList(this.f48158a).iterator();
        while (it.hasNext()) {
            ((AbstractC1772b) it.next()).onActivitySaveInstanceState(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Iterator it = new ArrayList(this.f48158a).iterator();
        while (it.hasNext()) {
            ((AbstractC1772b) it.next()).onActivityStarted(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Iterator it = new ArrayList(this.f48158a).iterator();
        while (it.hasNext()) {
            ((AbstractC1772b) it.next()).onActivityStopped(activity);
        }
    }

    public C1773c(Context context) {
        this.f48159b = new WeakReference(null);
        this.f48160c = new WeakReference(null);
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            this.f48159b = new WeakReference(activity);
            if (activity.hasWindowFocus()) {
                this.f48160c = this.f48159b;
            }
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
    }
}
