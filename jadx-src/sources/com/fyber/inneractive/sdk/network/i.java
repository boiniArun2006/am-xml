package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class i {
    public static FilterInputStream a(InputStream inputStream, boolean z2) {
        try {
            if (z2) {
                IAlog.a("HttpExecutorBase: getInputStream found gzip encoding", new Object[0]);
                return new GZIPInputStream(inputStream);
            }
            IAlog.a("HttpExecutorBase: getInputStream no gzip encoding", new Object[0]);
            return new BufferedInputStream(inputStream);
        } catch (Exception unused) {
            return null;
        }
    }

    public static l a(FilterInputStream filterInputStream, int i2, String str, Map map, String str2) throws b, q1 {
        try {
            l lVar = new l(filterInputStream, i2, str, map, str2);
            if (lVar.f54270a / 100 != 5) {
                return lVar;
            }
            throw new b(String.format("server returned error %d", Integer.valueOf(lVar.f54270a)));
        } catch (b e2) {
            IAlog.a("failed executing network request msg: %s", e2.getMessage());
            throw new b(e2);
        } catch (Exception e3) {
            IAlog.a("failed reading network response msg: %s", e3.getMessage());
            throw new q1(e3);
        }
    }
}
