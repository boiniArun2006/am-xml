package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.caoccao.javet.node.modules.NodeModuleProcess;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class qz extends Md {
    private boolean Xw;
    public static final j jB = new j(null);

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static final String f52815U = qz.class.getName();

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final qz n(Context context, String url, String expectedRedirectUrl) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(expectedRedirectUrl, "expectedRedirectUrl");
            Md.o(context);
            return new qz(context, url, expectedRedirectUrl, null);
        }
    }

    public /* synthetic */ qz(Context context, String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2);
    }

    private qz(Context context, String str, String str2) {
        super(context, str);
        g(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(qz this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        super.cancel();
    }

    @Override // com.facebook.internal.Md
    public Bundle WPU(String str) {
        Bundle bundlePJg = vd.pJg(Uri.parse(str).getQuery());
        String string = bundlePJg.getString("bridge_args");
        bundlePJg.remove("bridge_args");
        if (!vd.I(string)) {
            try {
                bundlePJg.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", w6.n(new JSONObject(string)));
            } catch (JSONException e2) {
                vd.ijL(f52815U, "Unable to parse bridge_args JSON", e2);
            }
        }
        String string2 = bundlePJg.getString("method_results");
        bundlePJg.remove("method_results");
        if (!vd.I(string2)) {
            try {
                bundlePJg.putBundle("com.facebook.platform.protocol.RESULT_ARGS", w6.n(new JSONObject(string2)));
            } catch (JSONException e3) {
                vd.ijL(f52815U, "Unable to parse bridge_args JSON", e3);
            }
        }
        bundlePJg.remove(NodeModuleProcess.PROPERTY_VERSION);
        bundlePJg.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", nKK.Z());
        return bundlePJg;
    }

    @Override // com.facebook.internal.Md, android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        WebView webViewR = r();
        if (XQ() && !Z() && webViewR != null && webViewR.isShown()) {
            if (this.Xw) {
                return;
            }
            this.Xw = true;
            webViewR.loadUrl("javascript:(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.facebook.internal.o
                @Override // java.lang.Runnable
                public final void run() {
                    qz.e(this.f52812n);
                }
            }, 1500L);
            return;
        }
        super.cancel();
    }
}
