package com.fyber.inneractive.sdk.measurement;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.x;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class h implements com.fyber.inneractive.sdk.response.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public URL f54054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f54055b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f54057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f54058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f54059f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f54056c = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f54060g = false;

    public final void a(x xVar, String str) {
        List arrayList = (List) this.f54056c.get(xVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f54056c.put(xVar, arrayList);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        arrayList.add(str);
    }

    public final boolean b() {
        if (!this.f54060g || this.f54054a == null) {
            return false;
        }
        String str = this.f54055b;
        if (str != null) {
            return !TextUtils.isEmpty(str) && this.f54055b.equalsIgnoreCase("omid");
        }
        return true;
    }

    public final String toString() {
        return "Verification{mJavaScriptResource=" + this.f54054a + ", mTrackingEvents=" + this.f54056c + ", mVerificationParameters='" + this.f54057d + "', mVendor='" + this.f54058e + "'}";
    }

    @Override // com.fyber.inneractive.sdk.response.i
    public final List a(x xVar) {
        HashMap map;
        if (xVar == null || (map = this.f54056c) == null) {
            return null;
        }
        return (List) map.get(xVar);
    }

    public final String a() {
        if (!this.f54060g) {
            return "JavaScriptResource = ";
        }
        if (TextUtils.isEmpty(this.f54055b)) {
            return "apiFramework = ";
        }
        if (!this.f54055b.equalsIgnoreCase("omid")) {
            return "apiFramework = " + this.f54055b;
        }
        return "JavaScriptResource_url = " + (TextUtils.isEmpty(this.f54059f) ? "" : this.f54059f);
    }
}
