package CKP;

import CKP.n;
import CKP.s4;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class n {
    private static ServiceConnection J2;
    private static Intent KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static Boolean f884O;
    private static Application.ActivityLifecycleCallbacks Uo;
    private static s4.j mUb;
    private static Boolean nr;
    private static Object xMQ;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final n f885n = new n();
    private static final String rl = n.class.getCanonicalName();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final AtomicBoolean f886t = new AtomicBoolean(false);

    public static final class j implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            Intrinsics.checkNotNullParameter(name, "name");
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(service, "service");
            n nVar = n.f885n;
            n.xMQ = z.n(com.facebook.s4.qie(), service);
        }

        j() {
        }
    }

    /* JADX INFO: renamed from: CKP.n$n, reason: collision with other inner class name */
    public static final class C0021n implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            try {
                com.facebook.s4.Z().execute(new Runnable() { // from class: CKP.Ml
                    @Override // java.lang.Runnable
                    public final void run() {
                        n.C0021n.t();
                    }
                });
            } catch (Exception unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            try {
                if (Intrinsics.areEqual(n.f884O, Boolean.TRUE) && Intrinsics.areEqual(activity.getLocalClassName(), "com.android.billingclient.api.ProxyBillingActivity")) {
                    com.facebook.s4.Z().execute(new Runnable() { // from class: CKP.w6
                        @Override // java.lang.Runnable
                        public final void run() {
                            n.C0021n.nr();
                        }
                    });
                }
            } catch (Exception unused) {
            }
        }

        C0021n() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void nr() {
            Context contextQie = com.facebook.s4.qie();
            ArrayList arrayListXMQ = z.xMQ(contextQie, n.xMQ);
            if (arrayListXMQ.isEmpty()) {
                arrayListXMQ = z.Uo(contextQie, n.xMQ);
            }
            n.f885n.J2(contextQie, arrayListXMQ, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void t() {
            Context contextQie = com.facebook.s4.qie();
            ArrayList arrayListXMQ = z.xMQ(contextQie, n.xMQ);
            n nVar = n.f885n;
            nVar.J2(contextQie, arrayListXMQ, false);
            nVar.J2(contextQie, z.mUb(contextQie, n.xMQ), true);
        }
    }

    private final void KN() {
        if (f886t.compareAndSet(false, true)) {
            Context contextQie = com.facebook.s4.qie();
            if (contextQie instanceof Application) {
                Application application = (Application) contextQie;
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = Uo;
                ServiceConnection serviceConnection = null;
                if (activityLifecycleCallbacks == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("callbacks");
                    activityLifecycleCallbacks = null;
                }
                application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
                Intent intent = KN;
                if (intent == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("intent");
                    intent = null;
                }
                ServiceConnection serviceConnection2 = J2;
                if (serviceConnection2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("serviceConnection");
                } else {
                    serviceConnection = serviceConnection2;
                }
                contextQie.bindService(intent, serviceConnection, 1);
            }
        }
    }

    private final void O() {
        if (nr != null) {
            return;
        }
        Boolean boolValueOf = Boolean.valueOf(s4.n("com.android.vending.billing.IInAppBillingService$Stub") != null);
        nr = boolValueOf;
        if (Intrinsics.areEqual(boolValueOf, Boolean.FALSE)) {
            return;
        }
        f884O = Boolean.valueOf(s4.n("com.android.billingclient.api.ProxyBillingActivity") != null);
        z.rl();
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
        Intrinsics.checkNotNullExpressionValue(intent, "Intent(\"com.android.vend…ge(\"com.android.vending\")");
        KN = intent;
        J2 = new j();
        Uo = new C0021n();
    }

    public static final void Uo(s4.j billingClientVersion) {
        Intrinsics.checkNotNullParameter(billingClientVersion, "billingClientVersion");
        n nVar = f885n;
        nVar.O();
        if (!Intrinsics.areEqual(nr, Boolean.FALSE) && UiE.C.Uo()) {
            mUb = billingClientVersion;
            nVar.KN();
        }
    }

    private n() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J2(Context context, ArrayList arrayList, boolean z2) {
        if (!arrayList.isEmpty()) {
            HashMap map = new HashMap();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String purchase = (String) it.next();
                try {
                    String sku = new JSONObject(purchase).getString("productId");
                    Intrinsics.checkNotNullExpressionValue(sku, "sku");
                    Intrinsics.checkNotNullExpressionValue(purchase, "purchase");
                    map.put(sku, purchase);
                    arrayList2.add(sku);
                } catch (JSONException e2) {
                    Log.e(rl, "Error parsing in-app purchase data.", e2);
                }
            }
            for (Map.Entry entry : z.gh(context, arrayList2, xMQ, z2).entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                String str3 = (String) map.get(str);
                if (str3 != null) {
                    UiE.C.gh(str3, str2, z2, mUb, false, 16, null);
                }
            }
        }
    }
}
