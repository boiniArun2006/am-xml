package androidx.browser.customtabs;

import P.n;
import P.w6;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class CustomTabsSession {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final PendingIntent f14576O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f14577n = new Object();
    private final ComponentName nr;
    private final P.n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final P.j f14578t;

    /* JADX INFO: renamed from: androidx.browser.customtabs.CustomTabsSession$1, reason: invalid class name */
    class AnonymousClass1 extends w6.j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Handler f14579n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ EngagementSignalsCallback f14580t;

        @Override // P.w6
        public void nr(final int i2, final Bundle bundle) {
            Handler handler = this.f14579n;
            final EngagementSignalsCallback engagementSignalsCallback = this.f14580t;
            handler.post(new Runnable() { // from class: androidx.browser.customtabs.w6
                @Override // java.lang.Runnable
                public final void run() {
                    engagementSignalsCallback.nr(i2, bundle);
                }
            });
        }

        @Override // P.w6
        public void rl(final boolean z2, final Bundle bundle) {
            Handler handler = this.f14579n;
            final EngagementSignalsCallback engagementSignalsCallback = this.f14580t;
            handler.post(new Runnable() { // from class: androidx.browser.customtabs.n
                @Override // java.lang.Runnable
                public final void run() {
                    engagementSignalsCallback.rl(z2, bundle);
                }
            });
        }

        @Override // P.w6
        public void t(final boolean z2, final Bundle bundle) {
            Handler handler = this.f14579n;
            final EngagementSignalsCallback engagementSignalsCallback = this.f14580t;
            handler.post(new Runnable() { // from class: androidx.browser.customtabs.Ml
                @Override // java.lang.Runnable
                public final void run() {
                    engagementSignalsCallback.t(z2, bundle);
                }
            });
        }
    }

    static class MockSession extends n.j {
        @Override // P.n
        public boolean G7(P.j jVar, Bundle bundle) {
            return false;
        }

        @Override // P.n
        public Bundle Ik(String str, Bundle bundle) {
            return null;
        }

        @Override // P.n
        public boolean KN(P.j jVar, Uri uri) {
            return false;
        }

        @Override // P.n
        public boolean P5(P.j jVar, Bundle bundle) {
            return false;
        }

        @Override // P.n
        public boolean S(P.j jVar, Uri uri, int i2, Bundle bundle) {
            return false;
        }

        @Override // P.n
        public boolean Xw(P.j jVar, Uri uri, Bundle bundle) {
            return false;
        }

        @Override // P.n
        public boolean aYN(P.j jVar, Uri uri, Bundle bundle, List list) {
            return false;
        }

        @Override // P.n
        public boolean eF(P.j jVar) {
            return false;
        }

        @Override // P.n
        public boolean fD(P.j jVar, Bundle bundle) {
            return false;
        }

        @Override // P.n
        public boolean ijL(P.j jVar, int i2, Uri uri, Bundle bundle) {
            return false;
        }

        @Override // P.n
        public boolean p5(long j2) {
            return false;
        }

        @Override // P.n
        public boolean rV9(P.j jVar, IBinder iBinder, Bundle bundle) {
            return false;
        }

        @Override // P.n
        public int v(P.j jVar, String str, Bundle bundle) {
            return 0;
        }
    }

    @RestrictTo
    public static class PendingSession {
    }

    public boolean gh(int i2, Uri uri, Bundle bundle) {
        if (i2 >= 1 && i2 <= 2) {
            try {
                return this.rl.ijL(this.f14578t, i2, uri, rl(bundle));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: androidx.browser.customtabs.CustomTabsSession$2, reason: invalid class name */
    class AnonymousClass2 extends w6.j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Executor f14581n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ EngagementSignalsCallback f14582t;

        @Override // P.w6
        public void nr(final int i2, final Bundle bundle) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                Executor executor = this.f14581n;
                final EngagementSignalsCallback engagementSignalsCallback = this.f14582t;
                executor.execute(new Runnable() { // from class: androidx.browser.customtabs.Wre
                    @Override // java.lang.Runnable
                    public final void run() {
                        engagementSignalsCallback.nr(i2, bundle);
                    }
                });
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }

        @Override // P.w6
        public void rl(final boolean z2, final Bundle bundle) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                Executor executor = this.f14581n;
                final EngagementSignalsCallback engagementSignalsCallback = this.f14582t;
                executor.execute(new Runnable() { // from class: androidx.browser.customtabs.CN3
                    @Override // java.lang.Runnable
                    public final void run() {
                        engagementSignalsCallback.rl(z2, bundle);
                    }
                });
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }

        @Override // P.w6
        public void t(final boolean z2, final Bundle bundle) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                Executor executor = this.f14581n;
                final EngagementSignalsCallback engagementSignalsCallback = this.f14582t;
                executor.execute(new Runnable() { // from class: androidx.browser.customtabs.I28
                    @Override // java.lang.Runnable
                    public final void run() {
                        engagementSignalsCallback.t(z2, bundle);
                    }
                });
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }

    private void n(Bundle bundle) {
        PendingIntent pendingIntent = this.f14576O;
        if (pendingIntent != null) {
            bundle.putParcelable(CustomTabsIntent.EXTRA_SESSION_ID, pendingIntent);
        }
    }

    private Bundle rl(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        n(bundle2);
        return bundle2;
    }

    private Bundle t(Uri uri) {
        Bundle bundle = new Bundle();
        if (uri != null) {
            bundle.putParcelable("target_origin", uri);
        }
        if (this.f14576O != null) {
            n(bundle);
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }

    PendingIntent J2() {
        return this.f14576O;
    }

    ComponentName O() {
        return this.nr;
    }

    IBinder nr() {
        return this.f14578t.asBinder();
    }

    public boolean xMQ(Uri uri) {
        return mUb(uri, null, new Bundle());
    }

    CustomTabsSession(P.n nVar, P.j jVar, ComponentName componentName, PendingIntent pendingIntent) {
        this.rl = nVar;
        this.f14578t = jVar;
        this.nr = componentName;
        this.f14576O = pendingIntent;
    }

    public int KN(String str, Bundle bundle) {
        int iV;
        Bundle bundleRl = rl(bundle);
        synchronized (this.f14577n) {
            try {
                try {
                    iV = this.rl.v(this.f14578t, str, bundleRl);
                } catch (RemoteException unused) {
                    return -2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iV;
    }

    public boolean Uo(Uri uri, Bundle bundle, List list) {
        try {
            return this.rl.aYN(this.f14578t, uri, rl(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean mUb(Uri uri, Uri uri2, Bundle bundle) {
        try {
            Bundle bundleT = t(uri2);
            if (bundleT != null) {
                bundle.putAll(bundleT);
                return this.rl.Xw(this.f14578t, uri, bundle);
            }
            return this.rl.KN(this.f14578t, uri);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
