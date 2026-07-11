package com.fyber.inneractive.sdk.cache;

import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.File;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class d implements a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f53176c = IAlog.a(d.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f53177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f53178b;

    @Override // com.fyber.inneractive.sdk.cache.a
    public final void a(Object obj) {
        String str = this.f53177a;
        IAlog.c("%s: onCacheCommitted: %s for url: %s", f53176c, (Uri) obj, str);
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final boolean d() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String b() {
        return "";
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String c() {
        return this.f53178b;
    }

    public d(String str) {
        this.f53177a = str;
        Locale locale = Locale.US;
        int iHashCode = str.hashCode();
        StringBuilder sb = new StringBuilder();
        sb.append(iHashCode);
        this.f53178b = sb.toString();
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final Object a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return Uri.fromFile(new File(str));
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String a() {
        return this.f53177a;
    }
}
