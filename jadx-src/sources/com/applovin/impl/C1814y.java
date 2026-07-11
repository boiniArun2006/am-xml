package com.applovin.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import com.applovin.impl.sdk.C1804o;

/* JADX INFO: renamed from: com.applovin.impl.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class C1814y {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static C1814y f50863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f50864f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f50865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f50866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f50867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f50868d;

    public static C1814y a(Context context) {
        C1814y c1814y;
        synchronized (f50864f) {
            try {
                if (f50863e == null) {
                    f50863e = new C1814y(context);
                }
                c1814y = f50863e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1814y;
    }

    private C1814y(Context context) throws Throwable {
        Bundle bundle;
        int iIntValue;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            bundle = applicationInfo.metaData;
            try {
                try {
                    String str = applicationInfo.processName;
                    this.f50865a = bundle;
                    this.f50868d = str;
                } catch (PackageManager.NameNotFoundException e2) {
                    e = e2;
                    C1804o.c("AndroidManifest", "Failed to get meta data.", e);
                    this.f50865a = bundle;
                    this.f50868d = null;
                }
            } catch (Throwable th) {
                th = th;
                this.f50865a = bundle;
                this.f50868d = null;
                throw th;
            }
        } catch (PackageManager.NameNotFoundException e3) {
            e = e3;
            bundle = null;
        } catch (Throwable th2) {
            th = th2;
            bundle = null;
            this.f50865a = bundle;
            this.f50868d = null;
            throw th;
        }
        boolean z2 = false;
        try {
            XmlResourceParser xmlResourceParserOpenXmlResourceParser = context.getAssets().openXmlResourceParser("AndroidManifest.xml");
            int eventType = xmlResourceParserOpenXmlResourceParser.getEventType();
            iIntValue = 0;
            boolean zBooleanValue = false;
            do {
                if (2 == eventType) {
                    try {
                        if (xmlResourceParserOpenXmlResourceParser.getName().equals("application")) {
                            for (int i2 = 0; i2 < xmlResourceParserOpenXmlResourceParser.getAttributeCount(); i2++) {
                                String attributeName = xmlResourceParserOpenXmlResourceParser.getAttributeName(i2);
                                String attributeValue = xmlResourceParserOpenXmlResourceParser.getAttributeValue(i2);
                                if (attributeName.equals("networkSecurityConfig")) {
                                    iIntValue = Integer.valueOf(attributeValue.substring(1)).intValue();
                                } else if (attributeName.equals("usesCleartextTraffic")) {
                                    zBooleanValue = Boolean.valueOf(attributeValue).booleanValue();
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        z2 = zBooleanValue;
                        try {
                            C1804o.c("AndroidManifest", "Failed to parse AndroidManifest.xml.", th);
                            return;
                        } finally {
                            this.f50866b = iIntValue;
                            this.f50867c = z2;
                        }
                    }
                }
                eventType = xmlResourceParserOpenXmlResourceParser.next();
            } while (eventType != 1);
            this.f50866b = iIntValue;
            this.f50867c = zBooleanValue;
        } catch (Throwable th4) {
            th = th4;
            iIntValue = 0;
        }
    }

    public boolean a(String str) {
        Bundle bundle = this.f50865a;
        if (bundle != null) {
            return bundle.containsKey(str);
        }
        return false;
    }

    public boolean a(String str, boolean z2) {
        Bundle bundle = this.f50865a;
        return bundle != null ? bundle.getBoolean(str, z2) : z2;
    }

    public String a() {
        return this.f50868d;
    }
}
