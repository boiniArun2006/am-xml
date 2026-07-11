package com.safedk.android.internal.partials;

import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class VideoBridge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63099a = "VideoBridge";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f63100b = "";

    /* JADX INFO: renamed from: com.safedk.android.internal.partials.VideoBridge$1, reason: invalid class name */
    static class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ VideoContentListener f63101a;

        AnonymousClass1(VideoContentListener videoContentListener) {
            this.f63101a = videoContentListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoBridge.b(this.f63101a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(VideoContentListener videoContentListener) {
        if (SafeDK.ad()) {
            try {
                Logger.d(f63099a, "fyberOnVideoCompleted triggered ", ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a("", (String) null, true, "api-event");
            } catch (Throwable th) {
                Logger.e(f63099a, "Exception in fyberOnVideoCompleted", th);
            }
        }
    }
}
