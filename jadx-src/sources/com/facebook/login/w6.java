package com.facebook.login;

import android.content.ComponentName;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class w6 extends CustomTabsServiceConnection {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static CustomTabsSession f52987O;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static CustomTabsClient f52989t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f52988n = new j(null);
    private static final ReentrantLock J2 = new ReentrantLock();

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final void t(Uri url) {
            Intrinsics.checkNotNullParameter(url, "url");
            nr();
            w6.J2.lock();
            CustomTabsSession customTabsSession = w6.f52987O;
            if (customTabsSession != null) {
                customTabsSession.Uo(url, null, null);
            }
            w6.J2.unlock();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void nr() {
            CustomTabsClient customTabsClient;
            w6.J2.lock();
            if (w6.f52987O == null && (customTabsClient = w6.f52989t) != null) {
                w6.f52987O = customTabsClient.J2(null);
            }
            w6.J2.unlock();
        }

        public final CustomTabsSession rl() {
            w6.J2.lock();
            CustomTabsSession customTabsSession = w6.f52987O;
            w6.f52987O = null;
            w6.J2.unlock();
            return customTabsSession;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        Intrinsics.checkNotNullParameter(componentName, "componentName");
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public void onCustomTabsServiceConnected(ComponentName name, CustomTabsClient newClient) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(newClient, "newClient");
        newClient.KN(0L);
        f52989t = newClient;
        f52988n.nr();
    }
}
