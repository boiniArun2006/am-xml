package com.fyber.inneractive.sdk.web;

import android.webkit.WebResourceRequest;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f57085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f57086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f57087c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d1.class != obj.getClass()) {
            return false;
        }
        d1 d1Var = (d1) obj;
        if (this.f57085a.equals(d1Var.f57085a) && this.f57086b.equals(d1Var.f57086b)) {
            return this.f57087c.equals(d1Var.f57087c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f57087c.hashCode() + ((this.f57086b.hashCode() + (this.f57085a.hashCode() * 31)) * 31);
    }

    public d1(WebResourceRequest webResourceRequest) {
        Map<String, String> requestHeaders;
        this.f57085a = webResourceRequest.getUrl().toString();
        this.f57086b = webResourceRequest.getMethod();
        if (webResourceRequest.getRequestHeaders() == null) {
            requestHeaders = Collections.EMPTY_MAP;
        } else {
            requestHeaders = webResourceRequest.getRequestHeaders();
        }
        this.f57087c = new HashMap(requestHeaders);
    }
}
