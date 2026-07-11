package com.fyber.inneractive.sdk.click;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.network.z0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.h0;
import com.fyber.inneractive.sdk.util.k1;
import com.fyber.inneractive.sdk.util.l1;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class d extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f53221a = false;

    @Override // com.fyber.inneractive.sdk.click.a
    public final boolean a(Uri uri, r rVar) {
        return "smartlink".equalsIgnoreCase(uri.getScheme()) && !this.f53221a;
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public final b a(Context context, Uri uri, List list) {
        Uri uri2;
        Uri uri3;
        Uri uri4;
        if (!a(uri, (r) null)) {
            return null;
        }
        PriorityQueue priorityQueue = new PriorityQueue();
        String queryParameter = uri.getQueryParameter("primaryUrl");
        List<String> queryParameters = uri.getQueryParameters("primaryTrackingUrl");
        k1 k1Var = k1.Primary;
        try {
            uri2 = Uri.parse(queryParameter);
        } catch (Exception unused) {
            uri2 = null;
        }
        if (uri2 != null) {
            priorityQueue.offer(new l1(k1Var, uri2, queryParameters));
        }
        String queryParameter2 = uri.getQueryParameter("fallbackUrl");
        List<String> queryParameters2 = uri.getQueryParameters("fallbackTrackingUrl");
        k1 k1Var2 = k1.FallBack;
        try {
            uri3 = Uri.parse(queryParameter2);
        } catch (Exception unused2) {
            uri3 = null;
        }
        if (uri3 != null) {
            priorityQueue.offer(new l1(k1Var2, uri3, queryParameters2));
        }
        if (priorityQueue.size() <= 0) {
            String string = uri.toString();
            q qVar = q.DEEP_LINK;
            if (list != null) {
                list.add(new j(string, false, qVar, null));
            }
            return r.a(uri.toString(), "FyberDeepLink", "fyberDeepLink is not valid");
        }
        while (true) {
            l1 l1Var = (l1) priorityQueue.poll();
            if (l1Var == null) {
                uri4 = null;
                break;
            }
            uri4 = l1Var.f57011b;
            String scheme = uri4.getScheme();
            q qVarA = a.a(uri4, (TextUtils.isEmpty(scheme) || !scheme.toLowerCase(Locale.US).startsWith(com.safedk.android.analytics.brandsafety.creatives.g.f62375e)) ? q.OPEN_IN_EXTERNAL_APPLICATION : q.OPENED_IN_EXTERNAL_BROWSER);
            boolean zA = h0.a(context, new Intent("android.intent.action.VIEW", uri4));
            String string2 = uri4.toString();
            if (list != null) {
                list.add(new j(string2, zA, qVarA, null));
            }
            if (zA) {
                for (String str : l1Var.f57012c) {
                    if (!TextUtils.isEmpty(str)) {
                        IAlog.d("%s %s", "SMART_LINK", str);
                        z0.b(str);
                    }
                }
            }
            if (!zA) {
                uri4 = null;
            }
            if (uri4 != null) {
                break;
            }
        }
        if (uri4 != null) {
            return new b(uri.toString(), a.a(uri4, q.OPEN_IN_EXTERNAL_APPLICATION), "FyberDeepLink", null);
        }
        return r.a(uri.toString(), "FyberDeepLink", "tryHandleDeepLinkWithExternalApp has failed");
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public final void a() {
        this.f53221a = true;
    }
}
