package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Wre f52776n = new Wre();
    private static final String[] rl = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    public static final String n() {
        if (VmF.j.nr(Wre.class)) {
            return null;
        }
        try {
            Context contextQie = com.facebook.s4.qie();
            List<ResolveInfo> listQueryIntentServices = contextQie.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            Intrinsics.checkNotNullExpressionValue(listQueryIntentServices, "context.packageManager.q…ervices(serviceIntent, 0)");
            HashSet hashSet = ArraysKt.toHashSet(rl);
            Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
            while (it.hasNext()) {
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                    return serviceInfo.packageName;
                }
            }
            return null;
        } catch (Throwable th) {
            VmF.j.rl(th, Wre.class);
            return null;
        }
    }

    public static final String rl() {
        if (VmF.j.nr(Wre.class)) {
            return null;
        }
        try {
            return "fbconnect://cct." + com.facebook.s4.qie().getPackageName();
        } catch (Throwable th) {
            VmF.j.rl(th, Wre.class);
            return null;
        }
    }

    public static final String t(String developerDefinedRedirectURI) {
        if (VmF.j.nr(Wre.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(developerDefinedRedirectURI, "developerDefinedRedirectURI");
            return Lu.nr(com.facebook.s4.qie(), developerDefinedRedirectURI) ? developerDefinedRedirectURI : Lu.nr(com.facebook.s4.qie(), rl()) ? rl() : "";
        } catch (Throwable th) {
            VmF.j.rl(th, Wre.class);
            return null;
        }
    }

    private Wre() {
    }
}
