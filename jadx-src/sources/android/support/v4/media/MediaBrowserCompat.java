package android.support.v4.media;

import WJ.phkN.HFAkacKHsU;
import android.content.ComponentName;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.n;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.n;
import android.support.v4.os.ResultReceiver;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.core.app.BundleCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class MediaBrowserCompat {
    static final boolean rl = Log.isLoggable("MediaBrowserCompat", 3);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final w6 f13107n;

    interface CN3 {
        void KN(Messenger messenger);

        void Uo(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);

        void nr(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2);
    }

    private static class CustomActionResultReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        protected void n(int i2, Bundle bundle) {
        }
    }

    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new j();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f13108n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final MediaDescriptionCompat f13109t;

        static class j implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public MediaItem[] newArray(int i2) {
                return new MediaItem[i2];
            }

            j() {
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaItem{mFlags=" + this.f13108n + ", mDescription=" + this.f13109t + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f13108n);
            this.f13109t.writeToParcel(parcel, i2);
        }

        MediaItem(Parcel parcel) {
            this.f13108n = parcel.readInt();
            this.f13109t = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    static class Ml implements w6, CN3, n.j {
        protected int J2;
        protected Messenger KN;
        protected fuX Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Context f13111n;
        protected final Object rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        protected final Bundle f13112t;
        private MediaSessionCompat.Token xMQ;
        protected final j nr = new j(this);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final ArrayMap f13110O = new ArrayMap();

        @Override // android.support.v4.media.MediaBrowserCompat.CN3
        public void KN(Messenger messenger) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.CN3
        public void Uo(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.n.j
        public void rl() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.n.j
        public void t() {
            this.Uo = null;
            this.KN = null;
            this.xMQ = null;
            this.nr.n(null);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.w6
        public MediaSessionCompat.Token J2() {
            if (this.xMQ == null) {
                this.xMQ = MediaSessionCompat.Token.n(android.support.v4.media.n.J2(this.rl));
            }
            return this.xMQ;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.w6
        public void O() {
            android.support.v4.media.n.n(this.rl);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.w6
        public void disconnect() {
            Messenger messenger;
            fuX fux = this.Uo;
            if (fux != null && (messenger = this.KN) != null) {
                try {
                    fux.t(messenger);
                } catch (RemoteException unused) {
                    Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
                }
            }
            android.support.v4.media.n.nr(this.rl);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.n.j
        public void n() {
            Bundle bundleO = android.support.v4.media.n.O(this.rl);
            if (bundleO == null) {
                return;
            }
            this.J2 = bundleO.getInt("extra_service_version", 0);
            IBinder iBinderN = BundleCompat.n(bundleO, "extra_messenger");
            if (iBinderN != null) {
                this.Uo = new fuX(iBinderN, this.f13112t);
                Messenger messenger = new Messenger(this.nr);
                this.KN = messenger;
                this.nr.n(messenger);
                try {
                    this.Uo.n(this.f13111n, this.KN);
                } catch (RemoteException unused) {
                    Log.i(HFAkacKHsU.kAbpOorYuN, "Remote error registering client messenger.");
                }
            }
            android.support.v4.media.session.n nVarFcU = n.j.fcU(BundleCompat.n(bundleO, "extra_session_binder"));
            if (nVarFcU != null) {
                this.xMQ = MediaSessionCompat.Token.rl(android.support.v4.media.n.J2(this.rl), nVarFcU);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.CN3
        public void nr(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (this.KN != messenger) {
                return;
            }
            android.support.v4.media.j.n(this.f13110O.get(str));
            if (MediaBrowserCompat.rl) {
                Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + str);
            }
        }

        Ml(Context context, ComponentName componentName, n nVar, Bundle bundle) {
            Bundle bundle2;
            this.f13111n = context;
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            this.f13112t = bundle2;
            bundle2.putInt("extra_client_version", 1);
            nVar.nr(this);
            this.rl = android.support.v4.media.n.rl(context, componentName, nVar.f13115n, bundle2);
        }
    }

    private static class fuX {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Messenger f13113n;
        private Bundle rl;

        void t(Messenger messenger) throws RemoteException {
            rl(7, null, messenger);
        }

        void n(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putBundle("data_root_hints", this.rl);
            rl(6, bundle, messenger);
        }

        public fuX(IBinder iBinder, Bundle bundle) {
            this.f13113n = new Messenger(iBinder);
            this.rl = bundle;
        }

        private void rl(int i2, Bundle bundle, Messenger messenger) throws RemoteException {
            Message messageObtain = Message.obtain();
            messageObtain.what = i2;
            messageObtain.arg1 = 1;
            messageObtain.setData(bundle);
            messageObtain.replyTo = messenger;
            this.f13113n.send(messageObtain);
        }
    }

    private static class j extends Handler {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final WeakReference f13114n;
        private WeakReference rl;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference weakReference = this.rl;
            if (weakReference == null || weakReference.get() == null || this.f13114n.get() == null) {
                return;
            }
            Bundle data = message.getData();
            MediaSessionCompat.n(data);
            CN3 cn3 = (CN3) this.f13114n.get();
            Messenger messenger = (Messenger) this.rl.get();
            try {
                int i2 = message.what;
                if (i2 == 1) {
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.n(bundle);
                    cn3.Uo(messenger, data.getString("data_media_item_id"), (MediaSessionCompat.Token) data.getParcelable("data_media_session_token"), bundle);
                    return;
                }
                if (i2 == 2) {
                    cn3.KN(messenger);
                    return;
                }
                if (i2 == 3) {
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.n(bundle2);
                    Bundle bundle3 = data.getBundle("data_notify_children_changed_options");
                    MediaSessionCompat.n(bundle3);
                    cn3.nr(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), bundle2, bundle3);
                    return;
                }
                Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
            } catch (BadParcelableException unused) {
                Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                if (message.what == 1) {
                    cn3.KN(messenger);
                }
            }
        }

        void n(Messenger messenger) {
            this.rl = new WeakReference(messenger);
        }

        j(CN3 cn3) {
            this.f13114n = new WeakReference(cn3);
        }
    }

    public static class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Object f13115n = android.support.v4.media.n.t(new C0482n());
        j rl;

        interface j {
            void n();

            void rl();

            void t();
        }

        /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$n$n, reason: collision with other inner class name */
        private class C0482n implements n.j {
            C0482n() {
            }

            @Override // android.support.v4.media.n.j
            public void n() {
                j jVar = n.this.rl;
                if (jVar != null) {
                    jVar.n();
                }
                n.this.n();
            }

            @Override // android.support.v4.media.n.j
            public void rl() {
                j jVar = n.this.rl;
                if (jVar != null) {
                    jVar.rl();
                }
                n.this.rl();
            }

            @Override // android.support.v4.media.n.j
            public void t() {
                j jVar = n.this.rl;
                if (jVar != null) {
                    jVar.t();
                }
                n.this.t();
            }
        }

        public abstract void n();

        public abstract void rl();

        public abstract void t();

        void nr(j jVar) {
            this.rl = jVar;
        }
    }

    interface w6 {
        MediaSessionCompat.Token J2();

        void O();

        void disconnect();
    }

    static class I28 extends Ml {
        I28(Context context, ComponentName componentName, n nVar, Bundle bundle) {
            super(context, componentName, nVar, bundle);
        }
    }

    private static class ItemReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        protected void n(int i2, Bundle bundle) {
            MediaSessionCompat.n(bundle);
            if (i2 == 0 && bundle != null && bundle.containsKey("media_item")) {
                Parcelable parcelable = bundle.getParcelable("media_item");
                if (parcelable != null && !(parcelable instanceof MediaItem)) {
                    throw null;
                }
                throw null;
            }
            throw null;
        }
    }

    private static class SearchResultReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        protected void n(int i2, Bundle bundle) {
            Parcelable[] parcelableArray;
            MediaSessionCompat.n(bundle);
            if (i2 == 0 && bundle != null && bundle.containsKey("search_results") && (parcelableArray = bundle.getParcelableArray("search_results")) != null) {
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    arrayList.add((MediaItem) parcelable);
                }
                throw null;
            }
            throw null;
        }
    }

    static class Wre extends I28 {
        Wre(Context context, ComponentName componentName, n nVar, Bundle bundle) {
            super(context, componentName, nVar, bundle);
        }
    }

    public void n() {
        this.f13107n.O();
    }

    public void rl() {
        this.f13107n.disconnect();
    }

    public MediaSessionCompat.Token t() {
        return this.f13107n.J2();
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, n nVar, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f13107n = new Wre(context, componentName, nVar, bundle);
        } else {
            this.f13107n = new I28(context, componentName, nVar, bundle);
        }
    }
}
