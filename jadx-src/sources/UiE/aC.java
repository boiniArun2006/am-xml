package UiE;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.facebook.s4;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class aC {
    public static final j rl = new j(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static volatile aC f10812t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Lazy f10813n;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final aC n() {
            aC aCVarN = aC.n();
            if (aCVarN == null) {
                synchronized (this) {
                    DefaultConstructorMarker defaultConstructorMarker = null;
                    if (!s4.e()) {
                        return null;
                    }
                    aC aCVarN2 = aC.n();
                    if (aCVarN2 == null) {
                        aCVarN2 = new aC(defaultConstructorMarker);
                        aC.rl(aCVarN2);
                    }
                    return aCVarN2;
                }
            }
            return aCVarN;
        }
    }

    public static final class w6 implements Application.ActivityLifecycleCallbacks {
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
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            aC aCVarN = aC.rl.n();
            if (aCVarN != null) {
                aCVarN.Uo(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            aC aCVarN = aC.rl.n();
            if (aCVarN != null) {
                aCVarN.Uo(activity);
            }
        }

        w6() {
        }
    }

    public /* synthetic */ aC(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    static final class n extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f10814n = new n();

        n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences invoke() {
            return s4.qie().getSharedPreferences("com.facebook.sdk.APPLINK_INFO", 0);
        }
    }

    private aC() {
        this.f10813n = LazyKt.lazy(n.f10814n);
    }

    public static final /* synthetic */ aC n() {
        if (VmF.j.nr(aC.class)) {
            return null;
        }
        try {
            return f10812t;
        } catch (Throwable th) {
            VmF.j.rl(th, aC.class);
            return null;
        }
    }

    public static final /* synthetic */ void rl(aC aCVar) {
        if (VmF.j.nr(aC.class)) {
            return;
        }
        try {
            f10812t = aCVar;
        } catch (Throwable th) {
            VmF.j.rl(th, aC.class);
        }
    }

    private final SharedPreferences J2() {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            Object value = this.f10813n.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-preferences>(...)");
            return (SharedPreferences) value;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    public final void KN(Uri uri, Intent intent) {
        if (!VmF.j.nr(this)) {
            try {
                Intrinsics.checkNotNullParameter(uri, "uri");
                Intrinsics.checkNotNullParameter(intent, "intent");
                String strNr = nr(uri);
                if (strNr == null) {
                    strNr = t(intent);
                }
                if (strNr != null) {
                    J2().edit().putString("campaign_ids", strNr).apply();
                }
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }

    public final String O(String key) {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(key, "key");
            return J2().getString(key, null);
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    public final void Uo(Activity activity) {
        if (!VmF.j.nr(this)) {
            try {
                Intrinsics.checkNotNullParameter(activity, "activity");
                Uri data = activity.getIntent().getData();
                if (data == null) {
                    return;
                }
                Intent intent = activity.getIntent();
                Intrinsics.checkNotNullExpressionValue(intent, "activity.intent");
                KN(data, intent);
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }

    public final String nr(Uri uri) {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(uri, "uri");
            String queryParameter = uri.getQueryParameter("al_applink_data");
            if (queryParameter == null) {
                return null;
            }
            try {
                return new JSONObject(queryParameter).getString("campaign_ids");
            } catch (Exception unused) {
                Log.d("AppLinkManager", "Fail to parse Applink data from Uri");
                return null;
            }
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    public final String t(Intent intent) {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(intent, "intent");
            Bundle bundleExtra = intent.getBundleExtra("al_applink_data");
            if (bundleExtra == null) {
                return null;
            }
            return bundleExtra.getString("campaign_ids");
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    public final void xMQ(Application application) {
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(application, "application");
            application.registerActivityLifecycleCallbacks(new w6());
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }
}
