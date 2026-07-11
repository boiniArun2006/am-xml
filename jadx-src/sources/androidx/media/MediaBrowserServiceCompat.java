package androidx.media;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.collection.ArrayMap;
import androidx.core.app.BundleCompat;
import androidx.core.util.Pair;
import androidx.media.MediaBrowserServiceCompatApi21;
import androidx.media.MediaBrowserServiceCompatApi23;
import androidx.media.MediaBrowserServiceCompatApi26;
import androidx.media.MediaSessionManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class MediaBrowserServiceCompat extends Service {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final boolean f39127o = Log.isLoggable("MBServiceCompat", 3);
    final ServiceHandler J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    ConnectionRecord f39128O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private MediaBrowserServiceImpl f39129n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    MediaSessionCompat.Token f39130r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final ArrayMap f39131t;

    public static final class BrowserRoot {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f39132n;
        private final Bundle rl;

        public Bundle n() {
            return this.rl;
        }

        public String rl() {
            return this.f39132n;
        }
    }

    private class ConnectionRecord implements IBinder.DeathRecipient {
        public final ServiceCallbacks J2;
        public BrowserRoot KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public final Bundle f39133O;
        public final HashMap Uo = new HashMap();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final String f39134n;
        public final MediaSessionManager.RemoteUserInfo nr;
        public final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f39135t;

        ConnectionRecord(String str, int i2, int i3, Bundle bundle, ServiceCallbacks serviceCallbacks) {
            this.f39134n = str;
            this.rl = i2;
            this.f39135t = i3;
            this.nr = new MediaSessionManager.RemoteUserInfo(str, i2, i3);
            this.f39133O = bundle;
            this.J2 = serviceCallbacks;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            MediaBrowserServiceCompat.this.J2.post(new Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.ConnectionRecord.1
                @Override // java.lang.Runnable
                public void run() {
                    ConnectionRecord connectionRecord = ConnectionRecord.this;
                    MediaBrowserServiceCompat.this.f39131t.remove(connectionRecord.J2.asBinder());
                }
            });
        }
    }

    interface MediaBrowserServiceImpl {
        IBinder onBind(Intent intent);

        void onCreate();
    }

    @RequiresApi
    class MediaBrowserServiceImplApi21 implements MediaBrowserServiceImpl, MediaBrowserServiceCompatApi21.ServiceCompatProxy {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final List f39137n = new ArrayList();
        Object rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Messenger f39138t;

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$1, reason: invalid class name */
        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
        class AnonymousClass1 implements Runnable {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ MediaSessionCompat.Token f39139n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ MediaBrowserServiceImplApi21 f39140t;

            @Override // java.lang.Runnable
            public void run() {
                if (!this.f39140t.f39137n.isEmpty()) {
                    android.support.v4.media.session.n nVarT = this.f39139n.t();
                    if (nVarT != null) {
                        Iterator it = this.f39140t.f39137n.iterator();
                        while (it.hasNext()) {
                            BundleCompat.rl((Bundle) it.next(), "extra_session_binder", nVarT.asBinder());
                        }
                    }
                    this.f39140t.f39137n.clear();
                }
                MediaBrowserServiceCompatApi21.nr(this.f39140t.rl, this.f39139n.nr());
            }
        }

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$3, reason: invalid class name */
        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
        class AnonymousClass3 implements Runnable {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ MediaBrowserServiceImplApi21 f39141O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ String f39142n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Bundle f39143t;

            @Override // java.lang.Runnable
            public void run() {
                Iterator it = MediaBrowserServiceCompat.this.f39131t.keySet().iterator();
                while (it.hasNext()) {
                    this.f39141O.O((ConnectionRecord) MediaBrowserServiceCompat.this.f39131t.get((IBinder) it.next()), this.f39142n, this.f39143t);
                }
            }
        }

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$4, reason: invalid class name */
        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
        class AnonymousClass4 implements Runnable {
            final /* synthetic */ MediaBrowserServiceImplApi21 J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Bundle f39144O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ MediaSessionManager.RemoteUserInfo f39145n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f39146t;

            @Override // java.lang.Runnable
            public void run() {
                for (int i2 = 0; i2 < MediaBrowserServiceCompat.this.f39131t.getSize(); i2++) {
                    ConnectionRecord connectionRecord = (ConnectionRecord) MediaBrowserServiceCompat.this.f39131t.az(i2);
                    if (connectionRecord.nr.equals(this.f39145n)) {
                        this.J2.O(connectionRecord, this.f39146t, this.f39144O);
                    }
                }
            }
        }

        @Override // androidx.media.MediaBrowserServiceCompatApi21.ServiceCompatProxy
        public MediaBrowserServiceCompatApi21.BrowserRoot t(String str, int i2, Bundle bundle) {
            Bundle bundleN;
            if (bundle == null || bundle.getInt("extra_client_version", 0) == 0) {
                bundleN = null;
            } else {
                bundle.remove("extra_client_version");
                this.f39138t = new Messenger(MediaBrowserServiceCompat.this.J2);
                bundleN = new Bundle();
                bundleN.putInt("extra_service_version", 2);
                BundleCompat.rl(bundleN, "extra_messenger", this.f39138t.getBinder());
                MediaSessionCompat.Token token = MediaBrowserServiceCompat.this.f39130r;
                if (token != null) {
                    android.support.v4.media.session.n nVarT = token.t();
                    BundleCompat.rl(bundleN, "extra_session_binder", nVarT == null ? null : nVarT.asBinder());
                } else {
                    this.f39137n.add(bundleN);
                }
            }
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.f39128O = mediaBrowserServiceCompat.new ConnectionRecord(str, -1, i2, bundle, null);
            BrowserRoot browserRootO = MediaBrowserServiceCompat.this.O(str, i2, bundle);
            MediaBrowserServiceCompat.this.f39128O = null;
            if (browserRootO == null) {
                return null;
            }
            if (bundleN == null) {
                bundleN = browserRootO.n();
            } else if (browserRootO.n() != null) {
                bundleN.putAll(browserRootO.n());
            }
            return new MediaBrowserServiceCompatApi21.BrowserRoot(browserRootO.rl(), bundleN);
        }

        MediaBrowserServiceImplApi21() {
        }

        void O(ConnectionRecord connectionRecord, String str, Bundle bundle) {
            List<Pair> list = (List) connectionRecord.Uo.get(str);
            if (list != null) {
                for (Pair pair : list) {
                    if (MediaBrowserCompatUtils.rl(bundle, (Bundle) pair.rl)) {
                        MediaBrowserServiceCompat.this.az(str, connectionRecord, (Bundle) pair.rl, bundle);
                    }
                }
            }
        }

        @Override // androidx.media.MediaBrowserServiceCompatApi21.ServiceCompatProxy
        public void nr(String str, final MediaBrowserServiceCompatApi21.ResultWrapper resultWrapper) {
            MediaBrowserServiceCompat.this.J2(str, new Result<List<MediaBrowserCompat.MediaItem>>(str) { // from class: androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21.2
                /* JADX INFO: Access modifiers changed from: package-private */
                @Override // androidx.media.MediaBrowserServiceCompat.Result
                /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
                public void nr(List list) {
                    ArrayList arrayList;
                    if (list != null) {
                        arrayList = new ArrayList();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            MediaBrowserCompat.MediaItem mediaItem = (MediaBrowserCompat.MediaItem) it.next();
                            Parcel parcelObtain = Parcel.obtain();
                            mediaItem.writeToParcel(parcelObtain, 0);
                            arrayList.add(parcelObtain);
                        }
                    } else {
                        arrayList = null;
                    }
                    resultWrapper.rl(arrayList);
                }
            });
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public IBinder onBind(Intent intent) {
            return MediaBrowserServiceCompatApi21.rl(this.rl, intent);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void onCreate() {
            Object objN = MediaBrowserServiceCompatApi21.n(MediaBrowserServiceCompat.this, this);
            this.rl = objN;
            MediaBrowserServiceCompatApi21.t(objN);
        }
    }

    @RequiresApi
    class MediaBrowserServiceImplApi23 extends MediaBrowserServiceImplApi21 implements MediaBrowserServiceCompatApi23.ServiceCompatProxy {
        MediaBrowserServiceImplApi23() {
            super();
        }

        @Override // androidx.media.MediaBrowserServiceCompatApi23.ServiceCompatProxy
        public void n(String str, final MediaBrowserServiceCompatApi21.ResultWrapper resultWrapper) {
            MediaBrowserServiceCompat.this.KN(str, new Result<MediaBrowserCompat.MediaItem>(str) { // from class: androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23.1
                /* JADX INFO: Access modifiers changed from: package-private */
                @Override // androidx.media.MediaBrowserServiceCompat.Result
                /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
                public void nr(MediaBrowserCompat.MediaItem mediaItem) {
                    if (mediaItem == null) {
                        resultWrapper.rl(null);
                        return;
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    mediaItem.writeToParcel(parcelObtain, 0);
                    resultWrapper.rl(parcelObtain);
                }
            });
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21, androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void onCreate() {
            Object objN = MediaBrowserServiceCompatApi23.n(MediaBrowserServiceCompat.this, this);
            this.rl = objN;
            MediaBrowserServiceCompatApi21.t(objN);
        }
    }

    @RequiresApi
    class MediaBrowserServiceImplApi26 extends MediaBrowserServiceImplApi23 implements MediaBrowserServiceCompatApi26.ServiceCompatProxy {
        MediaBrowserServiceImplApi26() {
            super();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23, androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21, androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void onCreate() {
            Object objN = MediaBrowserServiceCompatApi26.n(MediaBrowserServiceCompat.this, this);
            this.rl = objN;
            MediaBrowserServiceCompatApi21.t(objN);
        }

        @Override // androidx.media.MediaBrowserServiceCompatApi26.ServiceCompatProxy
        public void rl(String str, final MediaBrowserServiceCompatApi26.ResultWrapper resultWrapper, Bundle bundle) {
            MediaBrowserServiceCompat.this.Uo(str, new Result<List<MediaBrowserCompat.MediaItem>>(str) { // from class: androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi26.1
                /* JADX INFO: Access modifiers changed from: package-private */
                @Override // androidx.media.MediaBrowserServiceCompat.Result
                /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
                public void nr(List list) {
                    ArrayList arrayList;
                    if (list != null) {
                        arrayList = new ArrayList();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            MediaBrowserCompat.MediaItem mediaItem = (MediaBrowserCompat.MediaItem) it.next();
                            Parcel parcelObtain = Parcel.obtain();
                            mediaItem.writeToParcel(parcelObtain, 0);
                            arrayList.add(parcelObtain);
                        }
                    } else {
                        arrayList = null;
                    }
                    resultWrapper.rl(arrayList, n());
                }
            }, bundle);
        }
    }

    @RequiresApi
    class MediaBrowserServiceImplApi28 extends MediaBrowserServiceImplApi26 {
        MediaBrowserServiceImplApi28() {
            super();
        }
    }

    class MediaBrowserServiceImplBase implements MediaBrowserServiceImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Messenger f39148n;
        final /* synthetic */ MediaBrowserServiceCompat rl;

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplBase$1, reason: invalid class name */
        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
        class AnonymousClass1 implements Runnable {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ MediaSessionCompat.Token f39149n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ MediaBrowserServiceImplBase f39150t;

            @Override // java.lang.Runnable
            public void run() {
                Iterator it = this.f39150t.rl.f39131t.values().iterator();
                while (it.hasNext()) {
                    ConnectionRecord connectionRecord = (ConnectionRecord) it.next();
                    try {
                        connectionRecord.J2.t(connectionRecord.KN.rl(), this.f39149n, connectionRecord.KN.n());
                    } catch (RemoteException unused) {
                        Log.w("MBServiceCompat", "Connection for " + connectionRecord.f39134n + " is no longer valid.");
                        it.remove();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplBase$2, reason: invalid class name */
        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
        class AnonymousClass2 implements Runnable {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ MediaBrowserServiceImplBase f39151O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ String f39152n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Bundle f39153t;

            @Override // java.lang.Runnable
            public void run() {
                Iterator it = this.f39151O.rl.f39131t.keySet().iterator();
                while (it.hasNext()) {
                    this.f39151O.n((ConnectionRecord) this.f39151O.rl.f39131t.get((IBinder) it.next()), this.f39152n, this.f39153t);
                }
            }
        }

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplBase$3, reason: invalid class name */
        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
        class AnonymousClass3 implements Runnable {
            final /* synthetic */ MediaBrowserServiceImplBase J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Bundle f39154O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ MediaSessionManager.RemoteUserInfo f39155n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f39156t;

            @Override // java.lang.Runnable
            public void run() {
                for (int i2 = 0; i2 < this.J2.rl.f39131t.getSize(); i2++) {
                    ConnectionRecord connectionRecord = (ConnectionRecord) this.J2.rl.f39131t.az(i2);
                    if (connectionRecord.nr.equals(this.f39155n)) {
                        this.J2.n(connectionRecord, this.f39156t, this.f39154O);
                        return;
                    }
                }
            }
        }

        void n(ConnectionRecord connectionRecord, String str, Bundle bundle) {
            List<Pair> list = (List) connectionRecord.Uo.get(str);
            if (list != null) {
                for (Pair pair : list) {
                    if (MediaBrowserCompatUtils.rl(bundle, (Bundle) pair.rl)) {
                        this.rl.az(str, connectionRecord, (Bundle) pair.rl, bundle);
                    }
                }
            }
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public IBinder onBind(Intent intent) {
            if ("android.media.browse.MediaBrowserService".equals(intent.getAction())) {
                return this.f39148n.getBinder();
            }
            return null;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void onCreate() {
            this.f39148n = new Messenger(this.rl.J2);
        }
    }

    public static class Result<T> {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f39157O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Object f39158n;
        private boolean nr;
        private boolean rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f39159t;

        void nr(Object obj) {
        }

        public void J2(Object obj) {
            if (!this.f39159t && !this.nr) {
                this.f39159t = true;
                nr(obj);
            } else {
                throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f39158n);
            }
        }

        public void O(Bundle bundle) {
            if (!this.f39159t && !this.nr) {
                this.nr = true;
                t(bundle);
            } else {
                throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.f39158n);
            }
        }

        void Uo(int i2) {
            this.f39157O = i2;
        }

        int n() {
            return this.f39157O;
        }

        boolean rl() {
            return this.rl || this.f39159t || this.nr;
        }

        void t(Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an error for " + this.f39158n);
        }

        Result(Object obj) {
            this.f39158n = obj;
        }
    }

    private class ServiceBinderImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ MediaBrowserServiceCompat f39160n;

        public void J2(final String str, final IBinder iBinder, final ServiceCallbacks serviceCallbacks) {
            this.f39160n.J2.n(new Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.4
                @Override // java.lang.Runnable
                public void run() {
                    ConnectionRecord connectionRecord = (ConnectionRecord) ServiceBinderImpl.this.f39160n.f39131t.get(serviceCallbacks.asBinder());
                    if (connectionRecord == null) {
                        Log.w("MBServiceCompat", "removeSubscription for callback that isn't registered id=" + str);
                        return;
                    }
                    if (ServiceBinderImpl.this.f39160n.ck(str, connectionRecord, iBinder)) {
                        return;
                    }
                    Log.w("MBServiceCompat", "removeSubscription called for " + str + " which is not subscribed");
                }
            });
        }

        public void O(final ServiceCallbacks serviceCallbacks, final String str, final int i2, final int i3, final Bundle bundle) {
            this.f39160n.J2.n(new Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.6
                @Override // java.lang.Runnable
                public void run() {
                    IBinder iBinderAsBinder = serviceCallbacks.asBinder();
                    ServiceBinderImpl.this.f39160n.f39131t.remove(iBinderAsBinder);
                    ConnectionRecord connectionRecord = ServiceBinderImpl.this.f39160n.new ConnectionRecord(str, i2, i3, bundle, serviceCallbacks);
                    ServiceBinderImpl.this.f39160n.f39131t.put(iBinderAsBinder, connectionRecord);
                    try {
                        iBinderAsBinder.linkToDeath(connectionRecord, 0);
                    } catch (RemoteException unused) {
                        Log.w("MBServiceCompat", "IBinder is already dead.");
                    }
                }
            });
        }

        public void n(final String str, final IBinder iBinder, final Bundle bundle, final ServiceCallbacks serviceCallbacks) {
            this.f39160n.J2.n(new Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.3
                @Override // java.lang.Runnable
                public void run() {
                    ConnectionRecord connectionRecord = (ConnectionRecord) ServiceBinderImpl.this.f39160n.f39131t.get(serviceCallbacks.asBinder());
                    if (connectionRecord != null) {
                        ServiceBinderImpl.this.f39160n.n(str, connectionRecord, iBinder, bundle);
                        return;
                    }
                    Log.w("MBServiceCompat", "addSubscription for callback that isn't registered id=" + str);
                }
            });
        }

        public void rl(final String str, final int i2, final int i3, final Bundle bundle, final ServiceCallbacks serviceCallbacks) {
            if (this.f39160n.t(str, i3)) {
                this.f39160n.J2.n(new Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.1
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // java.lang.Runnable
                    public void run() {
                        IBinder iBinderAsBinder = serviceCallbacks.asBinder();
                        ServiceBinderImpl.this.f39160n.f39131t.remove(iBinderAsBinder);
                        ConnectionRecord connectionRecord = ServiceBinderImpl.this.f39160n.new ConnectionRecord(str, i2, i3, bundle, serviceCallbacks);
                        MediaBrowserServiceCompat mediaBrowserServiceCompat = ServiceBinderImpl.this.f39160n;
                        mediaBrowserServiceCompat.f39128O = connectionRecord;
                        BrowserRoot browserRootO = mediaBrowserServiceCompat.O(str, i3, bundle);
                        connectionRecord.KN = browserRootO;
                        MediaBrowserServiceCompat mediaBrowserServiceCompat2 = ServiceBinderImpl.this.f39160n;
                        mediaBrowserServiceCompat2.f39128O = null;
                        if (browserRootO != null) {
                            try {
                                mediaBrowserServiceCompat2.f39131t.put(iBinderAsBinder, connectionRecord);
                                iBinderAsBinder.linkToDeath(connectionRecord, 0);
                                if (ServiceBinderImpl.this.f39160n.f39130r != null) {
                                    serviceCallbacks.t(connectionRecord.KN.rl(), ServiceBinderImpl.this.f39160n.f39130r, connectionRecord.KN.n());
                                    return;
                                }
                                return;
                            } catch (RemoteException unused) {
                                Log.w("MBServiceCompat", "Calling onConnect() failed. Dropping client. pkg=" + str);
                                ServiceBinderImpl.this.f39160n.f39131t.remove(iBinderAsBinder);
                                return;
                            }
                        }
                        Log.i("MBServiceCompat", "No root for client " + str + " from service " + getClass().getName());
                        try {
                            serviceCallbacks.rl();
                        } catch (RemoteException unused2) {
                            Log.w("MBServiceCompat", "Calling onConnectFailed() failed. Ignoring. pkg=" + str);
                        }
                    }
                });
                return;
            }
            throw new IllegalArgumentException("Package/uid mismatch: uid=" + i3 + " package=" + str);
        }

        public void t(final ServiceCallbacks serviceCallbacks) {
            this.f39160n.J2.n(new Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.2
                @Override // java.lang.Runnable
                public void run() {
                    ConnectionRecord connectionRecord = (ConnectionRecord) ServiceBinderImpl.this.f39160n.f39131t.remove(serviceCallbacks.asBinder());
                    if (connectionRecord != null) {
                        connectionRecord.J2.asBinder().unlinkToDeath(connectionRecord, 0);
                    }
                }
            });
        }

        public void xMQ(final ServiceCallbacks serviceCallbacks) {
            this.f39160n.J2.n(new Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.7
                @Override // java.lang.Runnable
                public void run() {
                    IBinder iBinderAsBinder = serviceCallbacks.asBinder();
                    ConnectionRecord connectionRecord = (ConnectionRecord) ServiceBinderImpl.this.f39160n.f39131t.remove(iBinderAsBinder);
                    if (connectionRecord != null) {
                        iBinderAsBinder.unlinkToDeath(connectionRecord, 0);
                    }
                }
            });
        }

        public void KN(final String str, final Bundle bundle, final ResultReceiver resultReceiver, final ServiceCallbacks serviceCallbacks) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                this.f39160n.J2.n(new Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.9
                    @Override // java.lang.Runnable
                    public void run() {
                        ConnectionRecord connectionRecord = (ConnectionRecord) ServiceBinderImpl.this.f39160n.f39131t.get(serviceCallbacks.asBinder());
                        if (connectionRecord != null) {
                            ServiceBinderImpl.this.f39160n.qie(str, bundle, connectionRecord, resultReceiver);
                            return;
                        }
                        Log.w("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + str + ", extras=" + bundle);
                    }
                });
            }
        }

        public void Uo(final String str, final Bundle bundle, final ResultReceiver resultReceiver, final ServiceCallbacks serviceCallbacks) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                this.f39160n.J2.n(new Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.8
                    @Override // java.lang.Runnable
                    public void run() {
                        ConnectionRecord connectionRecord = (ConnectionRecord) ServiceBinderImpl.this.f39160n.f39131t.get(serviceCallbacks.asBinder());
                        if (connectionRecord != null) {
                            ServiceBinderImpl.this.f39160n.HI(str, bundle, connectionRecord, resultReceiver);
                            return;
                        }
                        Log.w("MBServiceCompat", "search for callback that isn't registered query=" + str);
                    }
                });
            }
        }

        public void nr(final String str, final ResultReceiver resultReceiver, final ServiceCallbacks serviceCallbacks) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                this.f39160n.J2.n(new Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.5
                    @Override // java.lang.Runnable
                    public void run() {
                        ConnectionRecord connectionRecord = (ConnectionRecord) ServiceBinderImpl.this.f39160n.f39131t.get(serviceCallbacks.asBinder());
                        if (connectionRecord != null) {
                            ServiceBinderImpl.this.f39160n.ty(str, connectionRecord, resultReceiver);
                            return;
                        }
                        Log.w("MBServiceCompat", "getMediaItem for callback that isn't registered id=" + str);
                    }
                });
            }
        }
    }

    private interface ServiceCallbacks {
        IBinder asBinder();

        void n(String str, List list, Bundle bundle, Bundle bundle2);

        void rl();

        void t(String str, MediaSessionCompat.Token token, Bundle bundle);
    }

    private static class ServiceCallbacksCompat implements ServiceCallbacks {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Messenger f39193n;

        @Override // androidx.media.MediaBrowserServiceCompat.ServiceCallbacks
        public void rl() throws RemoteException {
            nr(2, null);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.ServiceCallbacks
        public IBinder asBinder() {
            return this.f39193n.getBinder();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.ServiceCallbacks
        public void n(String str, List list, Bundle bundle, Bundle bundle2) throws RemoteException {
            Bundle bundle3 = new Bundle();
            bundle3.putString("data_media_item_id", str);
            bundle3.putBundle("data_options", bundle);
            bundle3.putBundle("data_notify_children_changed_options", bundle2);
            if (list != null) {
                bundle3.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
            }
            nr(3, bundle3);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.ServiceCallbacks
        public void t(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt("extra_service_version", 2);
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putParcelable("data_media_session_token", token);
            bundle2.putBundle("data_root_hints", bundle);
            nr(1, bundle2);
        }

        ServiceCallbacksCompat(Messenger messenger) {
            this.f39193n = messenger;
        }

        private void nr(int i2, Bundle bundle) throws RemoteException {
            Message messageObtain = Message.obtain();
            messageObtain.what = i2;
            messageObtain.arg1 = 2;
            messageObtain.setData(bundle);
            this.f39193n.send(messageObtain);
        }
    }

    public abstract void J2(String str, Result result);

    public void KN(String str, Result result) {
        result.Uo(2);
        result.J2(null);
    }

    public abstract BrowserRoot O(String str, int i2, Bundle bundle);

    public void Uo(String str, Result result, Bundle bundle) {
        result.Uo(1);
        J2(str, result);
    }

    boolean ck(String str, ConnectionRecord connectionRecord, IBinder iBinder) {
        boolean z2 = false;
        try {
            if (iBinder != null) {
                List list = (List) connectionRecord.Uo.get(str);
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (iBinder == ((Pair) it.next()).f36686n) {
                            it.remove();
                            z2 = true;
                        }
                    }
                    if (list.size() == 0) {
                        connectionRecord.Uo.remove(str);
                    }
                }
            } else if (connectionRecord.Uo.remove(str) != null) {
                z2 = true;
            }
            return z2;
        } finally {
            this.f39128O = connectionRecord;
            gh(str);
            this.f39128O = null;
        }
    }

    @Override // android.app.Service
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public void gh(String str) {
    }

    public void mUb(String str, Bundle bundle) {
    }

    public void nr(String str, Bundle bundle, Result result) {
        result.O(null);
    }

    boolean t(String str, int i2) {
        if (str == null) {
            return false;
        }
        for (String str2 : getPackageManager().getPackagesForUid(i2)) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public void xMQ(String str, Bundle bundle, Result result) {
        result.Uo(4);
        result.J2(null);
    }

    private final class ServiceHandler extends Handler {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ServiceBinderImpl f39194n;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.n(bundle);
                    this.f39194n.rl(data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle, new ServiceCallbacksCompat(message.replyTo));
                    break;
                case 2:
                    this.f39194n.t(new ServiceCallbacksCompat(message.replyTo));
                    break;
                case 3:
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.n(bundle2);
                    this.f39194n.n(data.getString("data_media_item_id"), BundleCompat.n(data, "data_callback_token"), bundle2, new ServiceCallbacksCompat(message.replyTo));
                    break;
                case 4:
                    this.f39194n.J2(data.getString("data_media_item_id"), BundleCompat.n(data, "data_callback_token"), new ServiceCallbacksCompat(message.replyTo));
                    break;
                case 5:
                    this.f39194n.nr(data.getString("data_media_item_id"), (ResultReceiver) data.getParcelable("data_result_receiver"), new ServiceCallbacksCompat(message.replyTo));
                    break;
                case 6:
                    Bundle bundle3 = data.getBundle("data_root_hints");
                    MediaSessionCompat.n(bundle3);
                    this.f39194n.O(new ServiceCallbacksCompat(message.replyTo), data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle3);
                    break;
                case 7:
                    this.f39194n.xMQ(new ServiceCallbacksCompat(message.replyTo));
                    break;
                case 8:
                    Bundle bundle4 = data.getBundle("data_search_extras");
                    MediaSessionCompat.n(bundle4);
                    this.f39194n.Uo(data.getString("data_search_query"), bundle4, (ResultReceiver) data.getParcelable("data_result_receiver"), new ServiceCallbacksCompat(message.replyTo));
                    break;
                case 9:
                    Bundle bundle5 = data.getBundle("data_custom_action_extras");
                    MediaSessionCompat.n(bundle5);
                    this.f39194n.KN(data.getString("data_custom_action"), bundle5, (ResultReceiver) data.getParcelable("data_result_receiver"), new ServiceCallbacksCompat(message.replyTo));
                    break;
                default:
                    Log.w("MBServiceCompat", "Unhandled message: " + message + "\n  Service version: 2\n  Client version: " + message.arg1);
                    break;
            }
        }

        public void n(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(Message message, long j2) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            data.putInt("data_calling_pid", Binder.getCallingPid());
            return super.sendMessageAtTime(message, j2);
        }
    }

    void HI(String str, Bundle bundle, ConnectionRecord connectionRecord, final ResultReceiver resultReceiver) {
        Result<List<MediaBrowserCompat.MediaItem>> result = new Result<List<MediaBrowserCompat.MediaItem>>(str) { // from class: androidx.media.MediaBrowserServiceCompat.3
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.media.MediaBrowserServiceCompat.Result
            /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
            public void nr(List list) {
                if ((n() & 4) == 0 && list != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelableArray("search_results", (Parcelable[]) list.toArray(new MediaBrowserCompat.MediaItem[0]));
                    resultReceiver.rl(0, bundle2);
                    return;
                }
                resultReceiver.rl(-1, null);
            }
        };
        this.f39128O = connectionRecord;
        xMQ(str, bundle, result);
        this.f39128O = null;
        if (result.rl()) {
            return;
        }
        throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=" + str);
    }

    void az(final String str, final ConnectionRecord connectionRecord, final Bundle bundle, final Bundle bundle2) {
        Result<List<MediaBrowserCompat.MediaItem>> result = new Result<List<MediaBrowserCompat.MediaItem>>(str) { // from class: androidx.media.MediaBrowserServiceCompat.1
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.media.MediaBrowserServiceCompat.Result
            /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
            public void nr(List list) {
                if (MediaBrowserServiceCompat.this.f39131t.get(connectionRecord.J2.asBinder()) != connectionRecord) {
                    if (MediaBrowserServiceCompat.f39127o) {
                        Log.d("MBServiceCompat", "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + connectionRecord.f39134n + " id=" + str);
                        return;
                    }
                    return;
                }
                if ((n() & 1) != 0) {
                    list = MediaBrowserServiceCompat.this.rl(list, bundle);
                }
                try {
                    connectionRecord.J2.n(str, list, bundle, bundle2);
                } catch (RemoteException unused) {
                    Log.w("MBServiceCompat", "Calling onLoadChildren() failed for id=" + str + " package=" + connectionRecord.f39134n);
                }
            }
        };
        this.f39128O = connectionRecord;
        if (bundle == null) {
            J2(str, result);
        } else {
            Uo(str, result, bundle);
        }
        this.f39128O = null;
        if (result.rl()) {
            return;
        }
        throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + connectionRecord.f39134n + " id=" + str);
    }

    void n(String str, ConnectionRecord connectionRecord, IBinder iBinder, Bundle bundle) {
        List<Pair> arrayList = (List) connectionRecord.Uo.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        for (Pair pair : arrayList) {
            if (iBinder == pair.f36686n && MediaBrowserCompatUtils.n(bundle, (Bundle) pair.rl)) {
                return;
            }
        }
        arrayList.add(new Pair(iBinder, bundle));
        connectionRecord.Uo.put(str, arrayList);
        az(str, connectionRecord, bundle, null);
        this.f39128O = connectionRecord;
        mUb(str, bundle);
        this.f39128O = null;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f39129n.onBind(intent);
    }

    void qie(String str, Bundle bundle, ConnectionRecord connectionRecord, final ResultReceiver resultReceiver) {
        Result<Bundle> result = new Result<Bundle>(str) { // from class: androidx.media.MediaBrowserServiceCompat.4
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.media.MediaBrowserServiceCompat.Result
            /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
            public void nr(Bundle bundle2) {
                resultReceiver.rl(0, bundle2);
            }

            @Override // androidx.media.MediaBrowserServiceCompat.Result
            void t(Bundle bundle2) {
                resultReceiver.rl(-1, bundle2);
            }
        };
        this.f39128O = connectionRecord;
        nr(str, bundle, result);
        this.f39128O = null;
        if (result.rl()) {
            return;
        }
        throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
    }

    List rl(List list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i2 = bundle.getInt("android.media.browse.extra.PAGE", -1);
        int i3 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if (i2 == -1 && i3 == -1) {
            return list;
        }
        int i5 = i3 * i2;
        int size = i5 + i3;
        if (i2 < 0 || i3 < 1 || i5 >= list.size()) {
            return Collections.EMPTY_LIST;
        }
        if (size > list.size()) {
            size = list.size();
        }
        return list.subList(i5, size);
    }

    void ty(String str, ConnectionRecord connectionRecord, final ResultReceiver resultReceiver) {
        Result<MediaBrowserCompat.MediaItem> result = new Result<MediaBrowserCompat.MediaItem>(str) { // from class: androidx.media.MediaBrowserServiceCompat.2
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.media.MediaBrowserServiceCompat.Result
            /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
            public void nr(MediaBrowserCompat.MediaItem mediaItem) {
                if ((n() & 2) != 0) {
                    resultReceiver.rl(-1, null);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putParcelable("media_item", mediaItem);
                resultReceiver.rl(0, bundle);
            }
        };
        this.f39128O = connectionRecord;
        KN(str, result);
        this.f39128O = null;
        if (result.rl()) {
            return;
        }
        throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=" + str);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            this.f39129n = new MediaBrowserServiceImplApi28();
        } else if (i2 >= 26) {
            this.f39129n = new MediaBrowserServiceImplApi26();
        } else {
            this.f39129n = new MediaBrowserServiceImplApi23();
        }
        this.f39129n.onCreate();
    }
}
