package com.google.firebase.firestore.remote;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Bundle;
import com.google.firebase.firestore.remote.qz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class aC implements qz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f60421n;
    private final List nr = new ArrayList();
    private final ConnectivityManager rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Runnable f60422t;

    /* JADX INFO: Access modifiers changed from: private */
    class Ml extends BroadcastReceiver {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f60423n;

        private Ml() {
            this.f60423n = false;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean zKN = aC.this.KN();
            if (aC.this.KN() && !this.f60423n) {
                aC.this.xMQ(true);
            } else if (!zKN && this.f60423n) {
                aC.this.xMQ(false);
            }
            this.f60423n = zKN;
        }

        /* synthetic */ Ml(aC aCVar, j jVar) {
            this();
        }
    }

    class j implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f60424n;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        j(AtomicBoolean atomicBoolean) {
            this.f60424n = atomicBoolean;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (this.f60424n.compareAndSet(true, false)) {
                aC.this.mUb();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (this.f60424n.compareAndSet(true, false)) {
                aC.this.mUb();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f60424n.compareAndSet(true, false)) {
                aC.this.mUb();
            }
        }
    }

    class n implements ComponentCallbacks2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f60426n;

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        n(AtomicBoolean atomicBoolean) {
            this.f60426n = atomicBoolean;
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i2) {
            if (i2 == 20) {
                this.f60426n.set(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class w6 extends ConnectivityManager.NetworkCallback {
        private w6() {
        }

        /* synthetic */ w6(aC aCVar, j jVar) {
            this();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            aC.this.xMQ(true);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            aC.this.xMQ(false);
        }
    }

    public void mUb() {
        wqP.QJ.n("AndroidConnectivityMonitor", "App has entered the foreground.", new Object[0]);
        if (KN()) {
            xMQ(true);
        }
    }

    private void J2() {
        Application application = (Application) this.f60421n.getApplicationContext();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        application.registerActivityLifecycleCallbacks(new j(atomicBoolean));
        application.registerComponentCallbacks(new n(atomicBoolean));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean KN() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f60421n.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    private void Uo() {
        j jVar = null;
        if (this.rl != null) {
            final w6 w6Var = new w6(this, jVar);
            this.rl.registerDefaultNetworkCallback(w6Var);
            this.f60422t = new Runnable() { // from class: com.google.firebase.firestore.remote.fuX
                @Override // java.lang.Runnable
                public final void run() {
                    this.f60437n.rl.unregisterNetworkCallback(w6Var);
                }
            };
        } else {
            final Ml ml = new Ml(this, jVar);
            this.f60421n.registerReceiver(ml, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f60422t = new Runnable() { // from class: com.google.firebase.firestore.remote.Dsr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f60377n.f60421n.unregisterReceiver(ml);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xMQ(boolean z2) {
        synchronized (this.nr) {
            try {
                Iterator it = this.nr.iterator();
                while (it.hasNext()) {
                    ((wqP.C) it.next()).accept(z2 ? qz.j.REACHABLE : qz.j.UNREACHABLE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.firebase.firestore.remote.qz
    public void n(wqP.C c2) {
        synchronized (this.nr) {
            this.nr.add(c2);
        }
    }

    aC(Context context) {
        boolean z2;
        if (context != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        wqP.n.t(z2, "Context must be non-null", new Object[0]);
        this.f60421n = context;
        this.rl = (ConnectivityManager) context.getSystemService("connectivity");
        J2();
        Uo();
    }
}
