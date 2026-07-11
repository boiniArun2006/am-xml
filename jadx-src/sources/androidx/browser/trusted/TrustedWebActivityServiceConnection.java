package androidx.browser.trusted;

import a8o.j;
import android.app.Notification;
import android.content.ComponentName;
import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class TrustedWebActivityServiceConnection {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final a8o.n f14620n;
    private final ComponentName rl;

    /* JADX INFO: renamed from: androidx.browser.trusted.TrustedWebActivityServiceConnection$1, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    class AnonymousClass1 extends j.AbstractBinderC0466j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TrustedWebActivityCallback f14621n;

        @Override // a8o.j
        public void xg(String str, Bundle bundle) {
            this.f14621n.n(str, bundle);
        }
    }

    static class ActiveNotificationsArgs {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Parcelable[] f14622n;

        public Bundle n() {
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS", this.f14622n);
            return bundle;
        }

        ActiveNotificationsArgs(Parcelable[] parcelableArr) {
            this.f14622n = parcelableArr;
        }
    }

    static class CancelNotificationArgs {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final String f14623n;
        public final int rl;

        public static CancelNotificationArgs n(Bundle bundle) {
            TrustedWebActivityServiceConnection.n(bundle, "android.support.customtabs.trusted.PLATFORM_TAG");
            TrustedWebActivityServiceConnection.n(bundle, "android.support.customtabs.trusted.PLATFORM_ID");
            return new CancelNotificationArgs(bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG"), bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID"));
        }

        CancelNotificationArgs(String str, int i2) {
            this.f14623n = str;
            this.rl = i2;
        }
    }

    static class NotificationsEnabledArgs {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final String f14624n;

        public static NotificationsEnabledArgs n(Bundle bundle) {
            TrustedWebActivityServiceConnection.n(bundle, "android.support.customtabs.trusted.CHANNEL_NAME");
            return new NotificationsEnabledArgs(bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME"));
        }

        NotificationsEnabledArgs(String str) {
            this.f14624n = str;
        }
    }

    static class NotifyNotificationArgs {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final String f14625n;
        public final String nr;
        public final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final Notification f14626t;

        public static NotifyNotificationArgs n(Bundle bundle) {
            TrustedWebActivityServiceConnection.n(bundle, "android.support.customtabs.trusted.PLATFORM_TAG");
            TrustedWebActivityServiceConnection.n(bundle, "android.support.customtabs.trusted.PLATFORM_ID");
            TrustedWebActivityServiceConnection.n(bundle, "android.support.customtabs.trusted.NOTIFICATION");
            TrustedWebActivityServiceConnection.n(bundle, "android.support.customtabs.trusted.CHANNEL_NAME");
            return new NotifyNotificationArgs(bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG"), bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID"), (Notification) bundle.getParcelable("android.support.customtabs.trusted.NOTIFICATION"), bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME"));
        }

        NotifyNotificationArgs(String str, int i2, Notification notification, String str2) {
            this.f14625n = str;
            this.rl = i2;
            this.f14626t = notification;
            this.nr = str2;
        }
    }

    static class ResultArgs {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f14627n;

        public Bundle n() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS", this.f14627n);
            return bundle;
        }

        ResultArgs(boolean z2) {
            this.f14627n = z2;
        }
    }

    TrustedWebActivityServiceConnection(a8o.n nVar, ComponentName componentName) {
        this.f14620n = nVar;
        this.rl = componentName;
    }

    static void n(Bundle bundle, String str) {
        if (bundle.containsKey(str)) {
            return;
        }
        throw new IllegalArgumentException("Bundle must contain " + str);
    }
}
