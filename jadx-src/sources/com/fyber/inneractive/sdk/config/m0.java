package com.fyber.inneractive.sdk.config;

import android.content.Context;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class m0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f53406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f53407b;

    public m0(Context context, w wVar) {
        this.f53406a = context;
        this.f53407b = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            try {
                int i2 = AdvertisingIdClient.f58593n;
                n0.a(this.f53406a, this.f53407b);
                v vVar = u.f53482a.f53490b;
                if (vVar != null) {
                    str = vVar.f53486a;
                } else {
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    n.a(this.f53406a, this.f53407b);
                }
            } catch (Throwable th) {
                IAlog.a("SDK internal error: Make sure that Google Play Services for Mobile Ads is added to the compile dependencies of your project", th, new Object[0]);
            }
        }
    }
}
