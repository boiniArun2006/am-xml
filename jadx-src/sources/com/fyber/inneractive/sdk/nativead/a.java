package com.fyber.inneractive.sdk.nativead;

import com.fyber.inneractive.sdk.network.z;
import com.fyber.inneractive.sdk.player.cache.g;
import com.fyber.inneractive.sdk.player.cache.l;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.File;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f54216a;

    public a(b bVar) {
        this.f54216a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j2;
        File fileA = b.a(this.f54216a);
        if (fileA != null) {
            try {
                IAlog.a("NativeCache opening the cache in directory - %s", fileA);
                this.f54216a.f54219b = g.a(fileA, 41943040L);
                g gVar = this.f54216a.f54219b;
                gVar.getClass();
                IAlog.e("DiskLruCache delete cache", new Object[0]);
                gVar.close();
                l.a(gVar.f54391a);
                this.f54216a.f54219b = g.a(fileA, 41943040L);
                g gVar2 = this.f54216a.f54219b;
                synchronized (gVar2) {
                    j2 = gVar2.f54398h;
                }
                IAlog.a("NativeCache opened the cache in directory - %s current size is %d", fileA, Long.valueOf(j2));
                b bVar = this.f54216a;
                bVar.f54219b.f54402l = bVar;
                bVar.f54220c = true;
            } catch (Throwable th) {
                z.a("Failed to open cache directory", th.getMessage(), null, null);
                IAlog.a("Failed to open cache directory", th, new Object[0]);
            }
        }
    }
}
