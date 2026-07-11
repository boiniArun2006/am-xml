package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.Size;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.internal.measurement.zzfb;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class FirebaseAnalytics {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static volatile FirebaseAnalytics f60053t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final zzfb f60054n;
    private ExecutorService rl;

    public enum j {
        GRANTED,
        DENIED
    }

    public enum n {
        AD_STORAGE,
        ANALYTICS_STORAGE,
        AD_USER_DATA,
        AD_PERSONALIZATION
    }

    final /* synthetic */ zzfb J2() {
        return this.f60054n;
    }

    private final ExecutorService Uo() throws Throwable {
        FirebaseAnalytics firebaseAnalytics;
        synchronized (FirebaseAnalytics.class) {
            try {
                try {
                    if (this.rl == null) {
                        firebaseAnalytics = this;
                        firebaseAnalytics.rl = new com.google.firebase.analytics.n(firebaseAnalytics, 0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                    } else {
                        firebaseAnalytics = this;
                    }
                    return firebaseAnalytics.rl;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    @NonNull
    @RequiresPermission
    @Keep
    public static FirebaseAnalytics getInstance(@NonNull Context context) {
        if (f60053t == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f60053t == null) {
                        f60053t = new FirebaseAnalytics(zzfb.zza(context, null));
                    }
                } finally {
                }
            }
        }
        return f60053t;
    }

    public void O(String str, String str2) {
        this.f60054n.zzk(null, str, str2, false);
    }

    public void nr(Map map) {
        Bundle bundle = new Bundle();
        j jVar = (j) map.get(n.AD_STORAGE);
        if (jVar != null) {
            int iOrdinal = jVar.ordinal();
            if (iOrdinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (iOrdinal == 1) {
                bundle.putString("ad_storage", "denied");
            }
        }
        j jVar2 = (j) map.get(n.ANALYTICS_STORAGE);
        if (jVar2 != null) {
            int iOrdinal2 = jVar2.ordinal();
            if (iOrdinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (iOrdinal2 == 1) {
                bundle.putString("analytics_storage", "denied");
            }
        }
        j jVar3 = (j) map.get(n.AD_USER_DATA);
        if (jVar3 != null) {
            int iOrdinal3 = jVar3.ordinal();
            if (iOrdinal3 == 0) {
                bundle.putString("ad_user_data", "granted");
            } else if (iOrdinal3 == 1) {
                bundle.putString("ad_user_data", "denied");
            }
        }
        j jVar4 = (j) map.get(n.AD_PERSONALIZATION);
        if (jVar4 != null) {
            int iOrdinal4 = jVar4.ordinal();
            if (iOrdinal4 == 0) {
                bundle.putString("ad_personalization", "granted");
            } else if (iOrdinal4 == 1) {
                bundle.putString("ad_personalization", "denied");
            }
        }
        this.f60054n.zzr(bundle);
    }

    public void rl(String str, Bundle bundle) {
        this.f60054n.zzh(str, bundle);
    }

    @Keep
    @MainThread
    @Deprecated
    public void setCurrentScreen(@NonNull Activity activity, @Nullable @Size String str, @Nullable @Size String str2) {
        this.f60054n.zzp(zzdf.zza(activity), str, str2);
    }

    public void t(boolean z2) {
        this.f60054n.zzq(Boolean.valueOf(z2));
    }

    public FirebaseAnalytics(zzfb zzfbVar) {
        Preconditions.checkNotNull(zzfbVar);
        this.f60054n = zzfbVar;
    }

    @Nullable
    @Keep
    public static zzlj getScionFrontendApiImplementation(Context context, @Nullable Bundle bundle) {
        zzfb zzfbVarZza = zzfb.zza(context, bundle);
        if (zzfbVarZza == null) {
            return null;
        }
        return new Ml(zzfbVarZza);
    }

    @NonNull
    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) Tasks.await(com.google.firebase.installations.w6.ck().getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            throw new IllegalStateException(e2);
        } catch (ExecutionException e3) {
            throw new IllegalStateException(e3.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    public Task n() {
        try {
            return Tasks.call(Uo(), new w6(this));
        } catch (RuntimeException e2) {
            this.f60054n.zzD(5, "Failed to schedule task for getAppInstanceId", null, null, null);
            return Tasks.forException(e2);
        }
    }
}
