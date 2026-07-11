package com.applovin.impl;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.impl.d0;
import com.applovin.impl.e0;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1803m;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v3;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdkUtils;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.vungle.ads.internal.model.AdPayload;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import kotlin.text.Typography;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class l5 extends AbstractRunnableC1782i5 implements v3.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final com.applovin.impl.sdk.ad.b f48882g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AppLovinAdLoadListener f48883h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final String f48884i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C1803m f48885j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Collection f48886k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f48887l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected ExecutorService f48888m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected ExecutorService f48889n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected List f48890o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private d0 f48891p;

    class a implements e0.a {
        a() {
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            l5.this.f48882g.a(uri);
            C1804o c1804o = l5.this.f48735c;
            if (C1804o.a()) {
                l5 l5Var = l5.this;
                l5Var.f48735c.a(l5Var.f48734b, "Ad updated with muteImageUri = " + uri);
            }
        }
    }

    class b implements e0.a {
        b() {
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            l5.this.f48882g.b(uri);
            C1804o c1804o = l5.this.f48735c;
            if (C1804o.a()) {
                l5 l5Var = l5.this;
                l5Var.f48735c.a(l5Var.f48734b, "Ad updated with unmuteImageUri = " + uri);
            }
        }
    }

    class c implements e0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e0.a f48894a;

        c(e0.a aVar) {
            this.f48894a = aVar;
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri == null) {
                C1804o c1804o = l5.this.f48735c;
                if (C1804o.a()) {
                    l5 l5Var = l5.this;
                    l5Var.f48735c.b(l5Var.f48734b, "Failed to cache video");
                }
                l5.this.a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
                Bundle bundle = new Bundle();
                bundle.putLong(CreativeInfo.f62439c, l5.this.f48882g.getAdIdNumber());
                l5.this.f48733a.t().a(bundle, "video_caching_failed");
                return;
            }
            C1804o c1804o2 = l5.this.f48735c;
            if (C1804o.a()) {
                l5 l5Var2 = l5.this;
                l5Var2.f48735c.a(l5Var2.f48734b, "Finish caching video for ad #" + l5.this.f48882g.getAdIdNumber() + ". Updating ad with cachedVideoURL = " + uri);
            }
            this.f48894a.a(uri);
        }
    }

    class d implements d0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f48896a;

        d(e eVar) {
            this.f48896a = eVar;
        }

        @Override // com.applovin.impl.d0.c
        public void a(String str, boolean z2) {
            if (z2) {
                l5.this.a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_HTML_RESOURCES);
                return;
            }
            e eVar = this.f48896a;
            if (eVar != null) {
                eVar.a(str);
            }
        }
    }

    public interface e {
        void a(String str);
    }

    @Override // com.applovin.impl.v3.a
    public void a(y2 y2Var) {
        if (y2Var.Q().equalsIgnoreCase(this.f48882g.getMediationServeId())) {
            if (C1804o.a()) {
                this.f48735c.b(this.f48734b, "Updating flag for timeout...");
            }
            g();
        }
        this.f48733a.Z().b(this);
    }

    protected e0 b(String str, e0.a aVar) {
        return a(str, this.f48882g.S(), true, aVar);
    }

    Uri c(String str) {
        return b(str, this.f48882g.S(), true);
    }

    protected void g() {
        this.f48887l = true;
        List list = this.f48890o;
        if (list != null && !list.isEmpty()) {
            Iterator it = this.f48890o.iterator();
            while (it.hasNext()) {
                ((c0) it.next()).a(true);
            }
        }
        if (this.f48733a.q0().e()) {
            d0 d0Var = this.f48891p;
            if (d0Var != null) {
                d0Var.c();
                return;
            }
            return;
        }
        ExecutorService executorService = this.f48888m;
        if (executorService != null) {
            executorService.shutdown();
            this.f48888m = null;
        }
        ExecutorService executorService2 = this.f48889n;
        if (executorService2 != null) {
            executorService2.shutdown();
            this.f48889n = null;
        }
    }

    private Collection h() {
        HashSet hashSet = new HashSet();
        for (char c2 : ((String) this.f48733a.a(x4.D0)).toCharArray()) {
            hashSet.add(Character.valueOf(c2));
        }
        hashSet.add(Character.valueOf(Typography.quote));
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f48883h;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(this.f48882g);
            this.f48883h = null;
        }
    }

    Uri b(String str, List list, boolean z2) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        if (C1804o.a()) {
            this.f48735c.a(this.f48734b, "Caching video " + str + "...");
        }
        int iA = this.f48733a.G().a(str, this.f48882g);
        Map mapA = f2.a((AppLovinAdImpl) this.f48882g);
        String strA = this.f48885j.a(a(), str, this.f48882g.getCachePrefix(), list, z2, iA, this.f48884i, mapA);
        if (!StringUtils.isValidString(strA)) {
            if (C1804o.a()) {
                this.f48735c.b(this.f48734b, "Failed to cache video: " + str);
            }
            a(str, "cacheVideo", mapA);
            a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
            return null;
        }
        File fileA = this.f48885j.a(strA, a());
        if (fileA == null) {
            if (C1804o.a()) {
                this.f48735c.b(this.f48734b, "Unable to retrieve File from cached video filename = " + strA);
            }
            a(strA, "retrieveVideoFile", mapA);
            return null;
        }
        Uri uriFromFile = Uri.fromFile(fileA);
        if (uriFromFile == null) {
            if (C1804o.a()) {
                this.f48735c.b(this.f48734b, "Unable to create URI from cached video file = " + fileA);
            }
            a(strA, "extractUriFromVideoFile", mapA);
            return null;
        }
        if (C1804o.a()) {
            this.f48735c.a(this.f48734b, "Finish caching video for ad #" + this.f48882g.getAdIdNumber() + ". Updating ad with cachedVideoFilename = " + strA);
        }
        return uriFromFile;
    }

    protected String c(String str, List list, boolean z2) {
        try {
            InputStream inputStreamA = this.f48885j.a(str, list, z2, f2.a((AppLovinAdImpl) this.f48882g));
            if (inputStreamA == null) {
                if (inputStreamA == null) {
                    return null;
                }
                inputStreamA.close();
                return null;
            }
            try {
                String strA = this.f48885j.a(inputStreamA);
                inputStreamA.close();
                return strA;
            } finally {
            }
        } catch (Throwable th) {
            if (C1804o.a()) {
                this.f48735c.a(this.f48734b, "Unknown failure to read input stream.", th);
            }
            this.f48735c.a(this.f48734b, th);
            this.f48733a.D().a(this.f48734b, "readInputStreamAsString", th);
            return null;
        }
    }

    protected void k() {
        this.f48733a.Z().b(this);
        if (!this.f48733a.q0().e()) {
            ExecutorService executorService = this.f48888m;
            if (executorService != null) {
                executorService.shutdown();
                this.f48888m = null;
            }
            ExecutorService executorService2 = this.f48889n;
            if (executorService2 != null) {
                executorService2.shutdown();
                this.f48889n = null;
            }
        }
        MaxAdFormat maxAdFormatD = this.f48882g.getAdZone().d();
        if (((Boolean) this.f48733a.a(x4.X0)).booleanValue() && maxAdFormatD != null && maxAdFormatD.isFullscreenAd()) {
            this.f48733a.h().b(this.f48882g);
        }
        this.f48733a.d0().a(this.f48884i);
    }

    protected boolean l() {
        return this.f48887l;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f48882g.b1()) {
            if (C1804o.a()) {
                this.f48735c.a(this.f48734b, "Subscribing to timeout events...");
            }
            this.f48733a.Z().a(this);
        }
    }

    l5(String str, com.applovin.impl.sdk.ad.b bVar, C1802k c1802k, AppLovinAdLoadListener appLovinAdLoadListener) {
        String string;
        super(str, c1802k);
        this.f48884i = UUID.randomUUID().toString();
        if (bVar != null) {
            this.f48882g = bVar;
            this.f48883h = appLovinAdLoadListener;
            this.f48885j = c1802k.G();
            this.f48886k = h();
            if (((Boolean) c1802k.a(x4.I0)).booleanValue()) {
                if (c1802k.q0().e()) {
                    this.f48888m = c1802k.q0().a();
                    this.f48889n = c1802k.q0().d();
                    return;
                }
                if (StringUtils.isValidString(bVar.getMediationServeId())) {
                    string = bVar.getMediationServeId();
                } else {
                    string = UUID.randomUUID().toString();
                }
                this.f48888m = c1802k.q0().a("com.applovin.sdk.caching." + string, ((Integer) c1802k.a(x4.f50769K0)).intValue());
                this.f48889n = c1802k.q0().a("com.applovin.sdk.caching.html." + string, ((Integer) c1802k.a(x4.L0)).intValue());
                return;
            }
            return;
        }
        throw new IllegalArgumentException("No ad specified.");
    }

    protected List e() {
        if (C1804o.a()) {
            this.f48735c.a(this.f48734b, "Caching mute images...");
        }
        ArrayList arrayList = new ArrayList();
        if (this.f48882g.G() != null) {
            arrayList.add(a(this.f48882g.G().toString(), new a()));
        }
        if (this.f48882g.Y() != null) {
            arrayList.add(a(this.f48882g.Y().toString(), new b()));
        }
        return arrayList;
    }

    void f() {
        if (C1804o.a()) {
            this.f48735c.a(this.f48734b, "Rendered new ad:" + this.f48882g);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.AZy
            @Override // java.lang.Runnable
            public final void run() {
                this.f47698n.i();
            }
        });
    }

    void j() {
        if (!o0.d()) {
            if (C1804o.a()) {
                this.f48735c.a(this.f48734b, "Caching mute images...");
            }
            Uri uriA = a(this.f48882g.G(), "mute");
            if (uriA != null) {
                this.f48882g.a(uriA);
            }
            Uri uriA2 = a(this.f48882g.Y(), "unmute");
            if (uriA2 != null) {
                this.f48882g.b(uriA2);
            }
            if (C1804o.a()) {
                this.f48735c.a(this.f48734b, "Ad updated with muteImageFilename = " + this.f48882g.G() + ", unmuteImageFilename = " + this.f48882g.Y());
            }
        }
    }

    protected List a(List list) {
        this.f48890o = list;
        return this.f48733a.q0().a(list, this.f48888m);
    }

    protected e0 a(String str, e0.a aVar) {
        return new e0(str, this.f48882g, this.f48884i, this.f48733a, aVar);
    }

    protected e0 a(String str, List list, boolean z2, e0.a aVar) {
        if (TextUtils.isEmpty(str)) {
            if (!C1804o.a()) {
                return null;
            }
            this.f48735c.a(this.f48734b, "No video to cache, skipping...");
            return null;
        }
        if (C1804o.a()) {
            this.f48735c.a(this.f48734b, "Caching video " + str + "...");
        }
        return new e0(str, this.f48882g, list, z2, this.f48884i, this.f48733a, new c(aVar));
    }

    protected d0 a(String str, List list, e eVar) {
        d0 d0Var = new d0(str, this.f48882g, list, this.f48889n, this.f48884i, this.f48733a, new d(eVar));
        this.f48891p = d0Var;
        return d0Var;
    }

    protected Uri a(Uri uri, String str) {
        if (uri == null) {
            if (C1804o.a()) {
                this.f48735c.a(this.f48734b, "No " + str + " image to cache");
            }
            return null;
        }
        String string = uri.toString();
        if (TextUtils.isEmpty(string)) {
            if (C1804o.a()) {
                this.f48735c.a(this.f48734b, "Failed to cache " + str + " image");
            }
            return null;
        }
        if (C1804o.a()) {
            this.f48735c.a(this.f48734b, "Caching " + str + " image...");
        }
        return b(string);
    }

    protected Uri b(String str) {
        return a(str, this.f48882g.S(), true);
    }

    Uri a(String str, List list, boolean z2) {
        String str2;
        try {
            int iA = this.f48733a.G().a(str, this.f48882g);
            Map mapA = f2.a((AppLovinAdImpl) this.f48882g);
            str2 = str;
            try {
                String strA = this.f48885j.a(a(), str2, this.f48882g.getCachePrefix(), list, z2, iA, this.f48884i, mapA);
                if (StringUtils.isValidString(strA)) {
                    File fileA = this.f48885j.a(strA, a());
                    if (fileA != null) {
                        Uri uriFromFile = Uri.fromFile(fileA);
                        if (uriFromFile != null) {
                            return uriFromFile;
                        }
                        if (C1804o.a()) {
                            this.f48735c.b(this.f48734b, "Unable to extract Uri from image file");
                        }
                        a(strA, "extractUriFromImageFile", mapA);
                        return null;
                    }
                    if (C1804o.a()) {
                        this.f48735c.b(this.f48734b, "Unable to retrieve File from cached image filename = " + strA);
                    }
                    a(strA, "retrieveImageFile", mapA);
                    return null;
                }
                if (C1804o.a()) {
                    this.f48735c.b(this.f48734b, "Failed to cache image: " + str2);
                }
                a(str2, "cacheImageResource", mapA);
                return null;
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                if (C1804o.a()) {
                    this.f48735c.a(this.f48734b, "Failed to cache image at url = " + str2, th2);
                }
                Map mapA2 = f2.a((AppLovinAdImpl) this.f48882g);
                CollectionUtils.putStringIfValid("url", str2, mapA2);
                this.f48733a.D().a(this.f48734b, "cacheImageResource", th2, mapA2);
                return null;
            }
        } catch (Throwable th3) {
            th = th3;
            str2 = str;
        }
    }

    void a(com.applovin.impl.sdk.ad.b bVar) {
        String strA0 = bVar.a0();
        if (bVar.J0() && StringUtils.isValidString(strA0)) {
            String strA = a(strA0, bVar.S(), bVar);
            bVar.c(strA);
            this.f48735c.f(this.f48734b, "Ad updated with video button HTML assets cached = " + strA);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0039, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    String a(String str, List list, com.applovin.impl.sdk.ad.b bVar) {
        if (!TextUtils.isEmpty(str)) {
            if (!((Boolean) this.f48733a.a(x4.E0)).booleanValue()) {
                if (C1804o.a()) {
                    this.f48735c.a(this.f48734b, "Resource caching is disabled, skipping cache...");
                    return str;
                }
            } else {
                StringBuilder sb = new StringBuilder(str);
                List listQ = bVar.Q();
                List listH = bVar.H();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    int iIndexOf = 0;
                    int i2 = 0;
                    while (iIndexOf < sb.length()) {
                        if (!l()) {
                            iIndexOf = sb.indexOf(str2, i2);
                            if (iIndexOf == -1) {
                                break;
                            }
                            int length = sb.length();
                            int i3 = iIndexOf;
                            while (!this.f48886k.contains(Character.valueOf(sb.charAt(i3))) && i3 < length) {
                                i3++;
                            }
                            if (i3 > iIndexOf && i3 != length) {
                                String strSubstring = sb.substring(str2.length() + iIndexOf, i3);
                                String str3 = str2 + strSubstring;
                                if (StringUtils.isValidString(strSubstring) && !listH.contains(str3)) {
                                    Uri uriA = a(str2, strSubstring);
                                    if (uriA != null) {
                                        sb.replace(iIndexOf, i3, uriA.toString());
                                        bVar.a(uriA.toString(), str3);
                                    } else {
                                        if (listQ.contains(str3)) {
                                            a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_HTML_RESOURCES);
                                            this.f48887l = true;
                                        }
                                        if (C1804o.a()) {
                                            this.f48735c.b(this.f48734b, "Failed to cache HTML Resource: " + str3);
                                        }
                                        a(str3, "cacheHtmlResource", f2.a((AppLovinAdImpl) bVar));
                                    }
                                } else if (C1804o.a()) {
                                    this.f48735c.a(this.f48734b, "Skip caching of optional or non-resource: " + strSubstring);
                                }
                                i2 = i3;
                            } else if (C1804o.a()) {
                                this.f48735c.b(this.f48734b, "Unable to cache resource; ad HTML is invalid.");
                            }
                        }
                    }
                }
                return sb.toString();
            }
        }
        return str;
    }

    private Uri a(String str, String str2) {
        File fileA = this.f48885j.a(n7.a(Uri.parse(str2), this.f48882g.getCachePrefix(), this.f48733a), C1802k.o());
        if (fileA == null) {
            return null;
        }
        if (!((Boolean) this.f48733a.a(x4.f50786Q6)).booleanValue() && this.f48885j.a(fileA)) {
            return Uri.parse(AdPayload.FILE_SCHEME + fileA.getAbsolutePath());
        }
        String str3 = str + str2;
        if (!this.f48885j.a(fileA, str3, Arrays.asList(str), this.f48733a.G().a(str3, this.f48882g), this.f48884i, f2.a((AppLovinAdImpl) this.f48882g))) {
            return null;
        }
        return Uri.parse(AdPayload.FILE_SCHEME + fileA.getAbsolutePath());
    }

    void a(int i2) {
        if (this.f48883h != null) {
            if (C1804o.a()) {
                this.f48735c.a(this.f48734b, "Calling back ad load failed with error code: " + i2);
            }
            this.f48883h.failedToReceiveAd(i2);
            this.f48883h = null;
        }
        g();
    }

    protected void a(String str, String str2, Map map) {
        HashMap map2 = new HashMap(map);
        CollectionUtils.putStringIfValid("url", str, map2);
        this.f48733a.D().a(d2.M0, str2, map2);
    }
}
