package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f57033a = new AtomicBoolean(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile String f57034b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f57035c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f57036d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p1 f57037e = new p1(this);

    public final String a() {
        if (!TextUtils.isEmpty(this.f57034b)) {
            return this.f57034b;
        }
        if (this.f57037e != null && this.f57033a.get()) {
            Handler handler = r.f57026b;
            handler.removeCallbacks(this.f57037e);
            handler.postDelayed(this.f57037e, 50L);
        }
        return System.getProperty("http.agent");
    }

    public final void b() {
        if (this.f57035c == null || !TextUtils.isEmpty(this.f57034b)) {
            return;
        }
        this.f57034b = this.f57035c.getSharedPreferences("fyber.ua", 0).getString("ua", null);
        if (!TextUtils.isEmpty(this.f57034b)) {
            IAlog.a("UserAgentProvider | populated user agent from shared prefs", new Object[0]);
            this.f57036d.compareAndSet(false, true);
        }
        r.f57025a.execute(new r1(this));
    }

    public final void c() {
        String defaultUserAgent;
        Context context = this.f57035c;
        if (context != null) {
            try {
                defaultUserAgent = WebSettings.getDefaultUserAgent(context);
            } catch (Throwable unused) {
                this.f57033a.set(false);
                defaultUserAgent = null;
            }
            if (TextUtils.isEmpty(defaultUserAgent)) {
                return;
            }
            this.f57034b = defaultUserAgent;
            if (!TextUtils.isEmpty(this.f57034b)) {
                IAlog.a("UserAgentProvider | populated user agent form updateUserAgentIfPossible", new Object[0]);
                this.f57036d.compareAndSet(false, true);
            }
            r.f57025a.execute(new q1(this, defaultUserAgent));
        }
    }
}
