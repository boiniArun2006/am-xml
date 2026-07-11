package com.applovin.impl.sdk.nativeAd;

import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.AbstractRunnableC1782i5;
import com.applovin.impl.f2;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.UUID;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class a extends AbstractRunnableC1782i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AppLovinNativeAdImpl f50331g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC0711a f50332h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f50333i;

    /* JADX INFO: renamed from: com.applovin.impl.sdk.nativeAd.a$a, reason: collision with other inner class name */
    public interface InterfaceC0711a {
        void a(AppLovinNativeAdImpl appLovinNativeAdImpl);
    }

    private Uri b(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (C1804o.a()) {
            this.f48735c.a(this.f48734b, "Attempting to cache resource: " + uri);
        }
        String strA = this.f48733a.G().a(a(), uri.toString(), this.f50331g.getCachePrefix(), Collections.EMPTY_LIST, false, false, 1, this.f50333i, f2.a(this.f50331g));
        if (TextUtils.isEmpty(strA)) {
            if (C1804o.a()) {
                this.f48735c.b(this.f48734b, "Unable to cache resource for uri: " + uri);
            }
            return null;
        }
        File fileA = this.f48733a.G().a(strA, a());
        if (fileA != null) {
            Uri uriFromFile = Uri.fromFile(fileA);
            if (uriFromFile != null) {
                return uriFromFile;
            }
            if (C1804o.a()) {
                this.f48735c.b(this.f48734b, "Unable to extract Uri from image file");
            }
            return null;
        }
        if (C1804o.a()) {
            this.f48735c.b(this.f48734b, "Unable to retrieve File from cached image filename = " + strA);
        }
        return null;
    }

    public a(AppLovinNativeAdImpl appLovinNativeAdImpl, C1802k c1802k, InterfaceC0711a interfaceC0711a) {
        super("TaskCacheNativeAd", c1802k);
        this.f50333i = UUID.randomUUID().toString();
        this.f50331g = appLovinNativeAdImpl;
        this.f50332h = interfaceC0711a;
    }

    private float a(Uri uri) {
        FileInputStream fileInputStream;
        int i2;
        int i3;
        File file = new File(uri.getPath());
        if (!file.exists()) {
            return -1.0f;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(fileInputStream, null, options);
                i2 = options.outWidth;
                i3 = options.outHeight;
            } finally {
            }
        } catch (IOException e2) {
            if (C1804o.a()) {
                this.f48735c.a(this.f48734b, "Failed to calculate aspect ratio", e2);
            }
        }
        if (i2 <= 0 || i3 <= 0) {
            fileInputStream.close();
            return -1.0f;
        }
        float f3 = i2 / i3;
        fileInputStream.close();
        return f3;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (C1804o.a()) {
            this.f48735c.a(this.f48734b, "Begin caching ad #" + this.f50331g.getAdIdNumber() + "...");
        }
        Uri uriB = b(this.f50331g.getIconUri());
        if (uriB != null) {
            this.f50331g.setIconUri(uriB);
        }
        Uri uriB2 = b(this.f50331g.getMainImageUri());
        if (uriB2 != null) {
            this.f50331g.setMainImageUri(uriB2);
            float fA2 = a(uriB2);
            if (fA2 > 0.0f) {
                this.f50331g.setMainImageAspectRatio(fA2);
            }
        }
        Uri uriB3 = b(this.f50331g.getPrivacyIconUri());
        if (uriB3 != null) {
            this.f50331g.setPrivacyIconUri(uriB3);
        }
        if (C1804o.a()) {
            this.f48735c.a(this.f48734b, "Finished caching ad #" + this.f50331g.getAdIdNumber());
        }
        this.f50332h.a(this.f50331g);
    }
}
