package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import com.fyber.inneractive.sdk.player.exoplayer2.util.p;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.safedk.android.internal.partials.DTExchangeFilesBridge;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f56018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f56019b = 10485760;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f56020c = 20480;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.upstream.k f56021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public File f56022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public OutputStream f56023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public FileOutputStream f56024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f56025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f56026i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p f56027j;

    public final void a() {
        OutputStream outputStream = this.f56023f;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            this.f56024g.getFD().sync();
            z.a(this.f56023f);
            this.f56023f = null;
            File file = this.f56022e;
            this.f56022e = null;
            l lVar = this.f56018a;
            synchronized (lVar) {
                m mVarA = m.a(file, lVar.f56074d);
                if (mVarA == null) {
                    throw new IllegalStateException();
                }
                if (!lVar.f56073c.containsKey(mVarA.f56050a)) {
                    throw new IllegalStateException();
                }
                if (file.exists()) {
                    if (file.length() == 0) {
                        file.delete();
                        return;
                    }
                    long jA = lVar.a(mVarA.f56050a);
                    if (jA != -1 && mVarA.f56051b + mVarA.f56052c > jA) {
                        throw new IllegalStateException();
                    }
                    lVar.a(mVarA);
                    lVar.f56074d.b();
                    lVar.notifyAll();
                }
            }
        } catch (Throwable th) {
            z.a(this.f56023f);
            this.f56023f = null;
            File file2 = this.f56022e;
            this.f56022e = null;
            file2.delete();
            throw th;
        }
    }

    public final void b() throws FileNotFoundException {
        File file;
        long j2 = this.f56021d.f56111d;
        long jMin = j2 == -1 ? this.f56019b : Math.min(j2 - this.f56026i, this.f56019b);
        l lVar = this.f56018a;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = this.f56021d;
        String str = kVar.f56112e;
        long j3 = kVar.f56109b + this.f56026i;
        synchronized (lVar) {
            try {
                if (!lVar.f56073c.containsKey(str)) {
                    throw new IllegalStateException();
                }
                if (!lVar.f56071a.exists()) {
                    lVar.a();
                    lVar.f56071a.mkdirs();
                }
                lVar.f56072b.a(lVar, jMin);
                File file2 = lVar.f56071a;
                i iVar = lVar.f56074d;
                h hVarA = (h) iVar.f56060a.get(str);
                if (hVarA == null) {
                    hVarA = iVar.a(str, -1L);
                }
                int i2 = hVarA.f56056a;
                long jCurrentTimeMillis = System.currentTimeMillis();
                Pattern pattern = m.f56077g;
                file = new File(file2, i2 + "." + j3 + "." + jCurrentTimeMillis + ".v3.exo");
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f56022e = file;
        FileOutputStream fileOutputStreamFileOutputStreamCtor = DTExchangeFilesBridge.fileOutputStreamCtor(this.f56022e);
        this.f56024g = fileOutputStreamFileOutputStreamCtor;
        if (this.f56020c > 0) {
            p pVar = this.f56027j;
            if (pVar == null) {
                this.f56027j = new p(this.f56024g, this.f56020c);
            } else {
                pVar.a(fileOutputStreamFileOutputStreamCtor);
            }
            this.f56023f = this.f56027j;
        } else {
            this.f56023f = fileOutputStreamFileOutputStreamCtor;
        }
        this.f56025h = 0L;
    }

    public c(l lVar) {
        this.f56018a = lVar;
    }
}
