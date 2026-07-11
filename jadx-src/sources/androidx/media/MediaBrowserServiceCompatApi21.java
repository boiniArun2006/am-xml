package androidx.media;

import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@RequiresApi
class MediaBrowserServiceCompatApi21 {

    static class MediaBrowserServiceAdaptor extends MediaBrowserService {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final ServiceCompatProxy f39196n;

        @Override // android.service.media.MediaBrowserService
        public void onLoadChildren(String str, MediaBrowserService.Result result) {
            this.f39196n.nr(str, new ResultWrapper(result));
        }

        MediaBrowserServiceAdaptor(Context context, ServiceCompatProxy serviceCompatProxy) {
            attachBaseContext(context);
            this.f39196n = serviceCompatProxy;
        }

        @Override // android.service.media.MediaBrowserService
        public MediaBrowserService.BrowserRoot onGetRoot(String str, int i2, Bundle bundle) {
            Bundle bundle2;
            MediaSessionCompat.n(bundle);
            ServiceCompatProxy serviceCompatProxy = this.f39196n;
            if (bundle == null) {
                bundle2 = null;
            } else {
                bundle2 = new Bundle(bundle);
            }
            BrowserRoot browserRootT = serviceCompatProxy.t(str, i2, bundle2);
            if (browserRootT == null) {
                return null;
            }
            return new MediaBrowserService.BrowserRoot(browserRootT.f39195n, browserRootT.rl);
        }
    }

    static class ResultWrapper<T> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        MediaBrowserService.Result f39197n;

        List n(List list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Parcel parcel = (Parcel) it.next();
                parcel.setDataPosition(0);
                arrayList.add(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            }
            return arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void rl(Object obj) {
            if (obj instanceof List) {
                this.f39197n.sendResult(n((List) obj));
                return;
            }
            if (!(obj instanceof Parcel)) {
                this.f39197n.sendResult(null);
                return;
            }
            Parcel parcel = (Parcel) obj;
            parcel.setDataPosition(0);
            this.f39197n.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
            parcel.recycle();
        }

        ResultWrapper(MediaBrowserService.Result result) {
            this.f39197n = result;
        }
    }

    public interface ServiceCompatProxy {
        void nr(String str, ResultWrapper resultWrapper);

        BrowserRoot t(String str, int i2, Bundle bundle);
    }

    static class BrowserRoot {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final String f39195n;
        final Bundle rl;

        BrowserRoot(String str, Bundle bundle) {
            this.f39195n = str;
            this.rl = bundle;
        }
    }

    public static Object n(Context context, ServiceCompatProxy serviceCompatProxy) {
        return new MediaBrowserServiceAdaptor(context, serviceCompatProxy);
    }

    public static void nr(Object obj, Object obj2) {
        ((MediaBrowserService) obj).setSessionToken((MediaSession.Token) obj2);
    }

    public static IBinder rl(Object obj, Intent intent) {
        return ((MediaBrowserService) obj).onBind(intent);
    }

    public static void t(Object obj) {
        ((MediaBrowserService) obj).onCreate();
    }
}
