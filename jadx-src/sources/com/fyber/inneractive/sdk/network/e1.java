package com.fyber.inneractive.sdk.network;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class e1 extends t0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f54245p;

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int g() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final boolean u() {
        return false;
    }

    public e1(com.fyber.inneractive.sdk.flow.endcard.loaders.companion.d dVar, String str, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(dVar, g0.f54259c.a(), rVar);
        this.f54245p = str;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final o0 a(l lVar, Map map, int i2) {
        o0 o0Var = new o0();
        d1 d1Var = new d1();
        try {
            InputStream inputStream = lVar.f54272c;
            if (inputStream != null) {
                int iA = t0.a(map);
                AtomicInteger atomicInteger = new AtomicInteger(0);
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new com.fyber.inneractive.sdk.util.v0(inputStream, atomicInteger));
                if (atomicInteger.get() != iA) {
                    bitmapDecodeStream = null;
                }
                Bitmap bitmap = bitmapDecodeStream;
                if (bitmap != null) {
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    int i3 = width * height;
                    int[] iArr = new int[i3];
                    bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
                    int i5 = -1;
                    for (int i7 = 0; i7 < i3; i7++) {
                        int i8 = iArr[i7];
                        if (i7 != 0) {
                            if (i8 != i5) {
                                d1Var.f54238a = bitmap;
                                IAlog.a("SimpleImageLoader: Got a valid bitmap %s", this.f54245p);
                                break;
                            }
                        } else {
                            i5 = i8;
                        }
                    }
                    IAlog.a("SimpleImageLoader: Got an invalid bitmap", new Object[0]);
                    d1Var.f54239b = "Got an invalid bitmap";
                } else {
                    IAlog.a("SimpleImageLoader: Got an invalid bitmap", new Object[0]);
                    d1Var.f54239b = "Got an invalid bitmap";
                }
            }
        } catch (Exception e2) {
            IAlog.c("SimpleImageLoader: Exception on load image %s %s", e2.getMessage(), e2.toString());
            d1Var.f54239b = e2.getMessage();
        } catch (OutOfMemoryError e3) {
            IAlog.c("SimpleImageLoader: OutOfMemoryError on load image %s", e3.getMessage());
            Bitmap bitmap2 = d1Var.f54238a;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            d1Var.f54239b = e3.getMessage();
        }
        o0Var.f54294a = d1Var;
        return o0Var;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final m0 m() {
        return m0.GET;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final g1 o() {
        return g1.LOW;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final String r() {
        return this.f54245p;
    }
}
