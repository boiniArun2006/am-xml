package androidx.webkit.internal;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebView;
import androidx.annotation.RequiresApi;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebMessagePortCompat;
import androidx.webkit.WebViewCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RequiresApi
public class ApiHelperForM {

    /* JADX INFO: renamed from: androidx.webkit.internal.ApiHelperForM$1, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    class AnonymousClass1 extends WebMessagePort.WebMessageCallback {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ WebMessagePortCompat.WebMessageCallbackCompat f42504n;

        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            this.f42504n.n(new WebMessagePortImpl(webMessagePort), WebMessagePortImpl.rl(webMessage));
        }
    }

    /* JADX INFO: renamed from: androidx.webkit.internal.ApiHelperForM$2, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    class AnonymousClass2 extends WebMessagePort.WebMessageCallback {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ WebMessagePortCompat.WebMessageCallbackCompat f42505n;

        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            this.f42505n.n(new WebMessagePortImpl(webMessagePort), WebMessagePortImpl.rl(webMessage));
        }
    }

    /* JADX INFO: renamed from: androidx.webkit.internal.ApiHelperForM$3, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    class AnonymousClass3 extends WebView.VisualStateCallback {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ WebViewCompat.VisualStateCallback f42506n;

        @Override // android.webkit.WebView.VisualStateCallback
        public void onComplete(long j2) {
            this.f42506n.onComplete(j2);
        }
    }

    public static WebMessageCompat n(WebMessage webMessage) {
        return new WebMessageCompat(webMessage.getData(), WebMessagePortImpl.nr(webMessage.getPorts()));
    }

    public static CharSequence rl(WebResourceError webResourceError) {
        return webResourceError.getDescription();
    }

    public static int t(WebResourceError webResourceError) {
        return webResourceError.getErrorCode();
    }
}
