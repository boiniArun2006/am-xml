package com.fyber.inneractive.sdk.network;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class w0 extends v0 {
    @Override // com.fyber.inneractive.sdk.network.v0, com.fyber.inneractive.sdk.network.t0
    public final o0 a(l lVar, Map map, int i2) throws n0 {
        o0 o0Var = new o0();
        try {
            InputStream inputStream = lVar.f54272c;
            int iA = t0.a(map);
            AtomicInteger atomicInteger = new AtomicInteger(0);
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new com.fyber.inneractive.sdk.util.v0(inputStream, atomicInteger));
            if (atomicInteger.get() != iA) {
                bitmapDecodeStream = null;
            }
            if (bitmapDecodeStream == null) {
                return o0Var;
            }
            String strA = com.fyber.inneractive.sdk.util.w0.a(bitmapDecodeStream);
            o0Var.f54294a = bitmapDecodeStream;
            o0Var.f54295b = strA;
            return o0Var;
        } catch (Exception e2) {
            IAlog.a("failed parse cacheable network request", e2, new Object[0]);
            throw new n0(e2);
        }
    }

    public w0(com.fyber.inneractive.sdk.ui.a aVar, Context context, com.fyber.inneractive.sdk.cache.b bVar) {
        super(aVar, context, bVar);
    }
}
