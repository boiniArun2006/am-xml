package androidx.browser.customtabs;

import P.n;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;
import androidx.collection.SimpleArrayMap;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class CustomTabsService extends Service {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final SimpleArrayMap f14573n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private n.j f14574t;

    /* JADX INFO: renamed from: androidx.browser.customtabs.CustomTabsService$1, reason: invalid class name */
    class AnonymousClass1 extends n.j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ CustomTabsService f14575n;

        @Override // P.n
        public boolean eF(P.j jVar) {
            return Jk(jVar, null);
        }

        private boolean Jk(P.j jVar, PendingIntent pendingIntent) {
            final CustomTabsSessionToken customTabsSessionToken = new CustomTabsSessionToken(jVar, pendingIntent);
            try {
                IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() { // from class: androidx.browser.customtabs.j
                    @Override // android.os.IBinder.DeathRecipient
                    public final void binderDied() {
                        this.f14600n.f14575n.n(customTabsSessionToken);
                    }
                };
                synchronized (this.f14575n.f14573n) {
                    jVar.asBinder().linkToDeath(deathRecipient, 0);
                    this.f14575n.f14573n.put(jVar.asBinder(), deathRecipient);
                }
                return this.f14575n.O(customTabsSessionToken);
            } catch (RemoteException unused) {
                return false;
            }
        }

        private Uri n1(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            return Build.VERSION.SDK_INT >= 33 ? (Uri) Api33Impl.n(bundle, "target_origin", Uri.class) : (Uri) bundle.getParcelable("target_origin");
        }

        private PendingIntent ul(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(CustomTabsIntent.EXTRA_SESSION_ID);
            bundle.remove(CustomTabsIntent.EXTRA_SESSION_ID);
            return pendingIntent;
        }

        @Override // P.n
        public boolean G7(P.j jVar, Bundle bundle) {
            return this.f14575n.t(new CustomTabsSessionToken(jVar, ul(bundle)), bundle);
        }

        @Override // P.n
        public Bundle Ik(String str, Bundle bundle) {
            return this.f14575n.rl(str, bundle);
        }

        @Override // P.n
        public boolean KN(P.j jVar, Uri uri) {
            return this.f14575n.xMQ(new CustomTabsSessionToken(jVar, null), uri, null, new Bundle());
        }

        @Override // P.n
        public boolean S(P.j jVar, Uri uri, int i2, Bundle bundle) {
            return this.f14575n.Uo(new CustomTabsSessionToken(jVar, ul(bundle)), uri, i2, bundle);
        }

        @Override // P.n
        public boolean Xw(P.j jVar, Uri uri, Bundle bundle) {
            return this.f14575n.xMQ(new CustomTabsSessionToken(jVar, ul(bundle)), uri, n1(bundle), bundle);
        }

        @Override // P.n
        public boolean aYN(P.j jVar, Uri uri, Bundle bundle, List list) {
            return this.f14575n.nr(new CustomTabsSessionToken(jVar, ul(bundle)), uri, bundle, list);
        }

        @Override // P.n
        public boolean fD(P.j jVar, Bundle bundle) {
            return this.f14575n.gh(new CustomTabsSessionToken(jVar, ul(bundle)), bundle);
        }

        @Override // P.n
        public boolean ijL(P.j jVar, int i2, Uri uri, Bundle bundle) {
            return this.f14575n.qie(new CustomTabsSessionToken(jVar, ul(bundle)), i2, uri, bundle);
        }

        @Override // P.n
        public boolean p5(long j2) {
            return this.f14575n.az(j2);
        }

        @Override // P.n
        public int v(P.j jVar, String str, Bundle bundle) {
            return this.f14575n.J2(new CustomTabsSessionToken(jVar, ul(bundle)), str, bundle);
        }

        @Override // P.n
        public boolean P5(P.j jVar, Bundle bundle) {
            return Jk(jVar, ul(bundle));
        }

        @Override // P.n
        public boolean rV9(P.j jVar, IBinder iBinder, Bundle bundle) {
            return this.f14575n.mUb(new CustomTabsSessionToken(jVar, ul(bundle)), EngagementSignalsCallbackRemote.n(iBinder), bundle);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface FilePurpose {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Relation {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Result {
    }

    protected abstract int J2(CustomTabsSessionToken customTabsSessionToken, String str, Bundle bundle);

    protected abstract boolean KN(CustomTabsSessionToken customTabsSessionToken, Uri uri);

    protected abstract boolean O(CustomTabsSessionToken customTabsSessionToken);

    protected abstract boolean Uo(CustomTabsSessionToken customTabsSessionToken, Uri uri, int i2, Bundle bundle);

    protected abstract boolean az(long j2);

    protected abstract boolean gh(CustomTabsSessionToken customTabsSessionToken, Bundle bundle);

    protected boolean mUb(CustomTabsSessionToken customTabsSessionToken, EngagementSignalsCallback engagementSignalsCallback, Bundle bundle) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean n(CustomTabsSessionToken customTabsSessionToken) {
        try {
            synchronized (this.f14573n) {
                try {
                    IBinder iBinderN = customTabsSessionToken.n();
                    if (iBinderN == null) {
                        return false;
                    }
                    iBinderN.unlinkToDeath((IBinder.DeathRecipient) this.f14573n.get(iBinderN), 0);
                    this.f14573n.remove(iBinderN);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (NoSuchElementException unused) {
            return false;
        }
    }

    protected abstract boolean nr(CustomTabsSessionToken customTabsSessionToken, Uri uri, Bundle bundle, List list);

    protected abstract boolean qie(CustomTabsSessionToken customTabsSessionToken, int i2, Uri uri, Bundle bundle);

    protected abstract Bundle rl(String str, Bundle bundle);

    protected boolean t(CustomTabsSessionToken customTabsSessionToken, Bundle bundle) {
        return false;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f14574t;
    }

    protected boolean xMQ(CustomTabsSessionToken customTabsSessionToken, Uri uri, Uri uri2, Bundle bundle) {
        return KN(customTabsSessionToken, uri);
    }
}
