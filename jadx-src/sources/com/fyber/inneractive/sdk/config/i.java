package com.fyber.inneractive.sdk.config;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f53389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f53390b;

    public final Context a() {
        Context context = (Context) com.fyber.inneractive.sdk.util.v.a(this.f53390b);
        return context != null ? context : this.f53389a;
    }

    public i(Context context, Context context2) {
        h hVar = new h(this);
        this.f53389a = context2;
        if (context instanceof Activity) {
            this.f53390b = new WeakReference(context);
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(hVar);
        }
    }
}
