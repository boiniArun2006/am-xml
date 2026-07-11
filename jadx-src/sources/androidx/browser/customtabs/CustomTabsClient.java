package androidx.browser.customtabs;

import P.j;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.d;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class CustomTabsClient {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final P.n f14534n;
    private final ComponentName rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Context f14535t;

    public static String nr(Context context, List list) {
        return O(context, list, false);
    }

    public static boolean rl(Context context, String str) {
        if (str == null) {
            return false;
        }
        final Context applicationContext = context.getApplicationContext();
        try {
            return n(applicationContext, str, new CustomTabsServiceConnection() { // from class: androidx.browser.customtabs.CustomTabsClient.1
                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(ComponentName componentName) {
                }

                @Override // androidx.browser.customtabs.CustomTabsServiceConnection
                public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
                    customTabsClient.KN(0L);
                    applicationContext.unbindService(this);
                }
            });
        } catch (SecurityException unused) {
            return false;
        }
    }

    public CustomTabsSession J2(CustomTabsCallback customTabsCallback) {
        return Uo(customTabsCallback, null);
    }

    private j.AbstractBinderC0258j t(final CustomTabsCallback customTabsCallback) {
        return new j.AbstractBinderC0258j() { // from class: androidx.browser.customtabs.CustomTabsClient.2

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private Handler f14538n = new Handler(Looper.getMainLooper());

            @Override // P.j
            public void FX(final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.f14538n.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.10
                    @Override // java.lang.Runnable
                    public void run() {
                        customTabsCallback.onUnminimized(bundle);
                    }
                });
            }

            @Override // P.j
            public void M(final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.f14538n.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.9
                    @Override // java.lang.Runnable
                    public void run() {
                        customTabsCallback.onMinimized(bundle);
                    }
                });
            }

            @Override // P.j
            public void a(final int i2, final int i3, final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.f14538n.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.6
                    @Override // java.lang.Runnable
                    public void run() {
                        customTabsCallback.onActivityResized(i2, i3, bundle);
                    }
                });
            }

            @Override // P.j
            public Bundle ck(String str, Bundle bundle) {
                CustomTabsCallback customTabsCallback2 = customTabsCallback;
                if (customTabsCallback2 == null) {
                    return null;
                }
                return customTabsCallback2.extraCallbackWithResult(str, bundle);
            }

            @Override // P.j
            public void dR0(final int i2, final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.f14538n.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        customTabsCallback.onNavigationEvent(i2, bundle);
                    }
                });
            }

            @Override // P.j
            public void gh(final int i2, final int i3, final int i5, final int i7, final int i8, final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.f14538n.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.8
                    @Override // java.lang.Runnable
                    public void run() {
                        customTabsCallback.onActivityLayout(i2, i3, i5, i7, i8, bundle);
                    }
                });
            }

            @Override // P.j
            public void m(final String str, final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.f14538n.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.4
                    @Override // java.lang.Runnable
                    public void run() {
                        customTabsCallback.onPostMessage(str, bundle);
                    }
                });
            }

            @Override // P.j
            public void nY(final String str, final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.f14538n.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.2
                    @Override // java.lang.Runnable
                    public void run() {
                        customTabsCallback.extraCallback(str, bundle);
                    }
                });
            }

            @Override // P.j
            public void ofS(final int i2, final Uri uri, final boolean z2, final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.f14538n.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.5
                    @Override // java.lang.Runnable
                    public void run() {
                        customTabsCallback.onRelationshipValidationResult(i2, uri, z2, bundle);
                    }
                });
            }

            @Override // P.j
            public void pJg(final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.f14538n.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.3
                    @Override // java.lang.Runnable
                    public void run() {
                        customTabsCallback.onMessageChannelReady(bundle);
                    }
                });
            }

            @Override // P.j
            public void te(final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.f14538n.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.7
                    @Override // java.lang.Runnable
                    public void run() {
                        customTabsCallback.onWarmupCompleted(bundle);
                    }
                });
            }
        };
    }

    public boolean KN(long j2) {
        try {
            return this.f14534n.p5(j2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    CustomTabsClient(P.n nVar, ComponentName componentName, Context context) {
        this.f14534n = nVar;
        this.rl = componentName;
        this.f14535t = context;
    }

    public static String O(Context context, List list, boolean z2) {
        List<String> arrayList;
        ResolveInfo resolveInfoResolveActivity;
        PackageManager packageManager = context.getPackageManager();
        if (list == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = list;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(d.f62221v));
        if (!z2 && (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT >= 30) {
            Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
            return null;
        }
        return null;
    }

    private CustomTabsSession Uo(CustomTabsCallback customTabsCallback, PendingIntent pendingIntent) {
        boolean zEF;
        j.AbstractBinderC0258j abstractBinderC0258jT = t(customTabsCallback);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(CustomTabsIntent.EXTRA_SESSION_ID, pendingIntent);
                zEF = this.f14534n.P5(abstractBinderC0258jT, bundle);
            } else {
                zEF = this.f14534n.eF(abstractBinderC0258jT);
            }
            if (!zEF) {
                return null;
            }
            return new CustomTabsSession(this.f14534n, abstractBinderC0258jT, this.rl, pendingIntent);
        } catch (RemoteException unused) {
            return null;
        }
    }

    public static boolean n(Context context, String str, CustomTabsServiceConnection customTabsServiceConnection) {
        customTabsServiceConnection.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, customTabsServiceConnection, 33);
    }
}
