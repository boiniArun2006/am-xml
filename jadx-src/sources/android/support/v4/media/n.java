package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
abstract class n {

    interface j {
        void n();

        void rl();

        void t();
    }

    /* JADX INFO: renamed from: android.support.v4.media.n$n, reason: collision with other inner class name */
    static class C0483n extends MediaBrowser.ConnectionCallback {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        protected final j f13134n;

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public void onConnected() {
            this.f13134n.n();
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public void onConnectionFailed() {
            this.f13134n.rl();
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public void onConnectionSuspended() {
            this.f13134n.t();
        }

        public C0483n(j jVar) {
            this.f13134n = jVar;
        }
    }

    public static Object J2(Object obj) {
        return ((MediaBrowser) obj).getSessionToken();
    }

    public static Bundle O(Object obj) {
        return ((MediaBrowser) obj).getExtras();
    }

    public static void n(Object obj) {
        ((MediaBrowser) obj).connect();
    }

    public static void nr(Object obj) {
        ((MediaBrowser) obj).disconnect();
    }

    public static Object rl(Context context, ComponentName componentName, Object obj, Bundle bundle) {
        return new MediaBrowser(context, componentName, (MediaBrowser.ConnectionCallback) obj, bundle);
    }

    public static Object t(j jVar) {
        return new C0483n(jVar);
    }
}
