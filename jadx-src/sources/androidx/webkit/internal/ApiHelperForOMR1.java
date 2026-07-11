package androidx.webkit.internal;

import android.webkit.SafeBrowsingResponse;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@RequiresApi
public class ApiHelperForOMR1 {
    public static void n(SafeBrowsingResponse safeBrowsingResponse, boolean z2) {
        safeBrowsingResponse.showInterstitial(z2);
    }
}
