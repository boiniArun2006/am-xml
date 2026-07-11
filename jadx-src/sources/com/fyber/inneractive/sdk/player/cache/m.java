package com.fyber.inneractive.sdk.player.cache;

import com.fyber.inneractive.sdk.network.z;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.File;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f54414a;

    public m(n nVar) {
        this.f54414a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j2;
        File fileA = n.a(this.f54414a.f54416a, "fyb.vamp.vid.cache");
        if (fileA != null) {
            try {
                IAlog.a("VideoCache opening the cache in directory - %s", fileA);
                this.f54414a.f54417b = g.a(fileA, 52428800L);
                g gVar = this.f54414a.f54417b;
                gVar.getClass();
                IAlog.e("DiskLruCache delete cache", new Object[0]);
                gVar.close();
                l.a(gVar.f54391a);
                this.f54414a.f54417b = g.a(fileA, 52428800L);
                g gVar2 = this.f54414a.f54417b;
                synchronized (gVar2) {
                    j2 = gVar2.f54398h;
                }
                IAlog.a("VideoCache opened the cache in directory - %s current size is %d", fileA, Long.valueOf(j2));
                n nVar = this.f54414a;
                nVar.f54417b.f54402l = nVar;
                nVar.f54418c = true;
            } catch (Throwable th) {
                z.a("Failed to open cache directory", th.getMessage(), null, null);
                IAlog.a("Failed to open cache directory", th, new Object[0]);
            }
        }
    }
}
