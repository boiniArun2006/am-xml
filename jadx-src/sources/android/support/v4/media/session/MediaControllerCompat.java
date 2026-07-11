package android.support.v4.media.session;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.j;
import android.support.v4.media.session.n;
import android.view.KeyEvent;
import androidx.core.app.BundleCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class MediaControllerCompat {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final n f13135n;
    private final MediaSessionCompat.Token rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final HashSet f13136t = new HashSet();

    static class MediaControllerImplApi21 implements n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final MediaSessionCompat.Token f13137O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        protected final Object f13138n;
        final Object rl = new Object();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final List f13139t = new ArrayList();
        private HashMap nr = new HashMap();

        private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private WeakReference f13140n;

            ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.f13140n = new WeakReference(mediaControllerImplApi21);
            }

            @Override // android.os.ResultReceiver
            protected void onReceiveResult(int i2, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = (MediaControllerImplApi21) this.f13140n.get();
                if (mediaControllerImplApi21 == null || bundle == null) {
                    return;
                }
                synchronized (mediaControllerImplApi21.rl) {
                    mediaControllerImplApi21.f13137O.O(n.j.fcU(BundleCompat.n(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                    mediaControllerImplApi21.f13137O.J2(bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
                    mediaControllerImplApi21.rl();
                }
            }
        }

        private static class j extends j.BinderC0484j {
            @Override // android.support.v4.media.session.j
            public void D(CharSequence charSequence) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.j
            public void HI(List list) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.j
            public void N(ParcelableVolumeInfo parcelableVolumeInfo) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.j
            public void WPU(MediaMetadataCompat mediaMetadataCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.j
            public void XQ() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.j
            public void bzg(Bundle bundle) {
                throw new AssertionError();
            }

            j(j jVar) {
                super(jVar);
            }
        }

        private void t() {
            nr("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.n
        public boolean n(KeyEvent keyEvent) {
            return android.support.v4.media.session.w6.n(this.f13138n, keyEvent);
        }

        public void nr(String str, Bundle bundle, ResultReceiver resultReceiver) {
            android.support.v4.media.session.w6.t(this.f13138n, str, bundle, resultReceiver);
        }

        void rl() {
            if (this.f13137O.t() == null) {
                return;
            }
            Iterator it = this.f13139t.iterator();
            if (!it.hasNext()) {
                this.f13139t.clear();
                return;
            }
            android.support.v4.media.j.n(it.next());
            this.nr.put(null, new j(null));
            throw null;
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) throws RemoteException {
            this.f13137O = token;
            Object objRl = android.support.v4.media.session.w6.rl(context, token.nr());
            this.f13138n = objRl;
            if (objRl != null) {
                if (token.t() == null) {
                    t();
                    return;
                }
                return;
            }
            throw new RemoteException();
        }
    }

    public static abstract class j implements IBinder.DeathRecipient {

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaControllerCompat$j$j, reason: collision with other inner class name */
        private static class BinderC0484j extends j.AbstractBinderC0485j {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final WeakReference f13141n;

            @Override // android.support.v4.media.session.j
            public void J(boolean z2) {
            }

            @Override // android.support.v4.media.session.j
            public void M7(boolean z2) {
                android.support.v4.media.j.n(this.f13141n.get());
            }

            @Override // android.support.v4.media.session.j
            public void Mx(PlaybackStateCompat playbackStateCompat) {
                android.support.v4.media.j.n(this.f13141n.get());
            }

            @Override // android.support.v4.media.session.j
            public void O(String str, Bundle bundle) {
                android.support.v4.media.j.n(this.f13141n.get());
            }

            @Override // android.support.v4.media.session.j
            public void iF(int i2) {
                android.support.v4.media.j.n(this.f13141n.get());
            }

            @Override // android.support.v4.media.session.j
            public void onRepeatModeChanged(int i2) {
                android.support.v4.media.j.n(this.f13141n.get());
            }

            @Override // android.support.v4.media.session.j
            public void ty() {
                android.support.v4.media.j.n(this.f13141n.get());
            }

            BinderC0484j(j jVar) {
                this.f13141n = new WeakReference(jVar);
            }
        }
    }

    interface n {
        boolean n(KeyEvent keyEvent);
    }

    static class Ml extends w6 {
        public Ml(Context context, MediaSessionCompat.Token token) {
            super(context, token);
        }
    }

    static class w6 extends MediaControllerImplApi21 {
        public w6(Context context, MediaSessionCompat.Token token) {
            super(context, token);
        }
    }

    public boolean n(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.f13135n.n(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token) {
        if (token != null) {
            this.rl = token;
            this.f13135n = new Ml(context, token);
            return;
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }
}
