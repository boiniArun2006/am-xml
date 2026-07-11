package com.applovin.impl;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.d6;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.applovin.impl.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class C1784j implements AppLovinCommunicatorSubscriber {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f48763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f48764b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LinkedHashMap f48765c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f48766d = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: com.applovin.impl.j$a */
    class a extends LinkedHashMap {
        a() {
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            if (size() > 16) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.j$b */
    public interface b {
        void onCreativeIdGenerated(String str, String str2);
    }

    public Bundle a(String str) {
        Bundle bundle;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f48764b) {
            bundle = (Bundle) this.f48765c.get(str);
        }
        this.f48763a.O();
        if (C1804o.a()) {
            this.f48763a.O().a("AdReviewManager", "Retrieved ad info (" + bundle + ") for serve id: " + str);
        }
        return bundle;
    }

    public void b(b bVar) {
        this.f48766d.remove(bVar);
    }

    public void c(String str) {
        this.f48763a.O();
        if (C1804o.a()) {
            this.f48763a.O().a("AdReviewManager", "Removing ad info for serve id: " + str);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f48764b) {
            this.f48765c.remove(str);
        }
    }

    public static String b() {
        return b("getVersion");
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return C1784j.class.getSimpleName();
    }

    public C1784j(C1802k c1802k) {
        this.f48763a = c1802k;
        if (c()) {
            AppLovinCommunicator.getInstance(C1802k.o()).subscribe(this, "safedk_ad_info");
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private static java.lang.String b(java.lang.String r2) {
        /*
            java.lang.Class<com.applovin.quality.AppLovinQualityService> r0 = com.applovin.quality.AppLovinQualityService.class
            goto L9
        L3:
            java.lang.String r0 = "com.safedk.android.SafeDK"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L15
        L9:
            r1 = 0
            java.lang.reflect.Method r2 = r0.getMethod(r2, r1)     // Catch: java.lang.Throwable -> L15
            java.lang.Object r2 = r2.invoke(r1, r1)     // Catch: java.lang.Throwable -> L15
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L15
            return r2
        L15:
            java.lang.String r2 = ""
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.C1784j.b(java.lang.String):java.lang.String");
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("safedk_ad_info".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle bundle = appLovinCommunicatorMessage.getMessageData().getBundle("public");
            if (bundle == null) {
                this.f48763a.O();
                if (C1804o.a()) {
                    this.f48763a.O().k("AdReviewManager", "Received SafeDK ad info without public data");
                    return;
                }
                return;
            }
            Bundle bundle2 = appLovinCommunicatorMessage.getMessageData().getBundle("private");
            if (bundle2 == null) {
                this.f48763a.O();
                if (C1804o.a()) {
                    this.f48763a.O().k("AdReviewManager", "Received SafeDK ad info without private data");
                    return;
                }
                return;
            }
            if (MaxAdFormat.formatFromString(bundle2.getString("ad_format")) == null) {
                this.f48763a.O();
                if (C1804o.a()) {
                    this.f48763a.O().k("AdReviewManager", "Received SafeDK ad info without ad format");
                    return;
                }
                return;
            }
            final String string = bundle2.getString("id");
            if (TextUtils.isEmpty(string)) {
                this.f48763a.O();
                if (C1804o.a()) {
                    this.f48763a.O().k("AdReviewManager", "Received SafeDK ad info without serve id");
                    return;
                }
                return;
            }
            synchronized (this.f48764b) {
                try {
                    this.f48763a.O();
                    if (C1804o.a()) {
                        this.f48763a.O().a("AdReviewManager", "Storing current SafeDK ad info for serve id: " + string + ", public data: " + bundle);
                    }
                    this.f48765c.put(string, bundle);
                } catch (Throwable th) {
                    throw th;
                }
            }
            final String string2 = bundle.getString("ad_review_creative_id");
            this.f48763a.O();
            if (C1804o.a()) {
                this.f48763a.O().a("AdReviewManager", "Received SafeDK ad info with Ad Review creative id: " + string2);
            }
            if (StringUtils.isValidString(string2) && !this.f48766d.isEmpty()) {
                HashSet<b> hashSet = new HashSet(this.f48766d);
                this.f48763a.O();
                if (C1804o.a()) {
                    this.f48763a.O().a("AdReviewManager", "Notifying listeners: " + this.f48766d);
                }
                for (final b bVar : hashSet) {
                    this.f48763a.q0().a((AbstractRunnableC1782i5) new C1797r6(this.f48763a, "creativeIdGenerated", new Runnable() { // from class: com.applovin.impl.c7r
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f48198n.a(bVar, string, string2);
                        }
                    }), d6.b.OTHER);
                }
            }
        }
    }

    public static boolean c() {
        return StringUtils.isValidString(b());
    }

    public void a(b bVar) {
        this.f48766d.add(bVar);
    }

    public static String a() {
        return b("getSdkKey");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b bVar, String str, String str2) {
        this.f48763a.O();
        if (C1804o.a()) {
            this.f48763a.O().a("AdReviewManager", "Notifying Ad Review creative id generated for listener: " + bVar);
        }
        bVar.onCreativeIdGenerated(str, str2);
    }
}
