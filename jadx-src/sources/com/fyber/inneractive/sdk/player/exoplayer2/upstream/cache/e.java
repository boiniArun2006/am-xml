package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.net.Uri;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.e0;
import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class e implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f56029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f56030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f56031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f56032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f56033e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f56034f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f56035g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f56036h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f56037i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Uri f56038j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f56039k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f56040l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f56041m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f56042n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public m f56043o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f56044p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f56045q;

    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar) throws IOException {
        boolean z2;
        try {
            Uri uri = kVar.f56108a;
            this.f56038j = uri;
            this.f56039k = kVar.f56113f;
            String string = kVar.f56112e;
            if (string == null) {
                string = uri.toString();
            }
            this.f56040l = string;
            this.f56041m = kVar.f56110c;
            if (!this.f56034f || !this.f56044p) {
                z2 = kVar.f56111d == -1 && this.f56035g;
            }
            this.f56045q = z2;
            long j2 = kVar.f56111d;
            if (j2 != -1 || z2) {
                this.f56042n = j2;
            } else {
                long jA = this.f56029a.a(string);
                this.f56042n = jA;
                if (jA != -1) {
                    long j3 = jA - kVar.f56110c;
                    this.f56042n = j3;
                    if (j3 <= 0) {
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.i();
                    }
                }
            }
            a(true);
            return this.f56042n;
        } catch (IOException e2) {
            if (this.f56036h == this.f56030b || (e2 instanceof a)) {
                this.f56044p = true;
            }
            throw e2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() throws IOException {
        this.f56038j = null;
        try {
            b();
        } catch (IOException e2) {
            if (this.f56036h == this.f56030b || (e2 instanceof a)) {
                this.f56044p = true;
            }
            throw e2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        if (i3 == 0) {
            return 0;
        }
        if (this.f56042n == 0) {
            return -1;
        }
        try {
            int i5 = this.f56036h.read(bArr, i2, i3);
            if (i5 >= 0) {
                long j2 = i5;
                this.f56041m += j2;
                long j3 = this.f56042n;
                if (j3 != -1) {
                    this.f56042n = j3 - j2;
                    return i5;
                }
            } else {
                if (this.f56037i) {
                    a(this.f56041m);
                    this.f56042n = 0L;
                }
                b();
                long j4 = this.f56042n;
                if ((j4 > 0 || j4 == -1) && a(false)) {
                    return read(bArr, i2, i3);
                }
            }
            return i5;
        } catch (IOException e2) {
            if (this.f56036h == this.f56030b || (e2 instanceof a)) {
                this.f56044p = true;
            }
            throw e2;
        }
    }

    public final void b() {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar = this.f56036h;
        if (hVar == null) {
            return;
        }
        try {
            hVar.close();
            this.f56036h = null;
            this.f56037i = false;
            m mVar = this.f56043o;
            if (mVar != null) {
                l lVar = this.f56029a;
                synchronized (lVar) {
                    if (mVar != lVar.f56073c.remove(mVar.f56050a)) {
                        throw new IllegalStateException();
                    }
                    lVar.notifyAll();
                }
                this.f56043o = null;
            }
        } catch (Throwable th) {
            m mVar2 = this.f56043o;
            if (mVar2 != null) {
                this.f56029a.b(mVar2);
                this.f56043o = null;
            }
            throw th;
        }
    }

    public e(l lVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar2, c cVar) {
        this.f56029a = lVar;
        this.f56030b = hVar2;
        this.f56032d = hVar;
        if (cVar != null) {
            this.f56031c = new e0(hVar, cVar);
        } else {
            this.f56031c = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar = this.f56036h;
        return hVar == this.f56032d ? hVar.a() : this.f56038j;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(boolean z2) throws IOException {
        m mVarA;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar;
        long jA;
        IOException iOException = null;
        if (this.f56045q) {
            mVarA = null;
        } else if (this.f56033e) {
            try {
                l lVar = this.f56029a;
                String str = this.f56040l;
                long j2 = this.f56041m;
                synchronized (lVar) {
                    while (true) {
                        mVarA = lVar.a(str, j2);
                        if (mVarA != null) {
                            break;
                        }
                        lVar.wait();
                    }
                }
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            }
        } else {
            mVarA = this.f56029a.a(this.f56040l, this.f56041m);
        }
        if (mVarA == null) {
            this.f56036h = this.f56032d;
            Uri uri = this.f56038j;
            long j3 = this.f56041m;
            kVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.k(uri, j3, j3, this.f56042n, this.f56040l, this.f56039k);
        } else if (mVarA.f56053d) {
            Uri uriFromFile = Uri.fromFile(mVarA.f56054e);
            long j4 = this.f56041m - mVarA.f56051b;
            long jMin = mVarA.f56052c - j4;
            long j5 = this.f56042n;
            if (j5 != -1) {
                jMin = Math.min(jMin, j5);
            }
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.k(uriFromFile, this.f56041m, j4, jMin, this.f56040l, this.f56039k);
            this.f56036h = this.f56030b;
            kVar = kVar2;
        } else {
            long jMin2 = mVarA.f56052c;
            if (jMin2 == -1) {
                jMin2 = this.f56042n;
            } else {
                long j6 = this.f56042n;
                if (j6 != -1) {
                    jMin2 = Math.min(jMin2, j6);
                }
            }
            long j7 = jMin2;
            Uri uri2 = this.f56038j;
            long j9 = this.f56041m;
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar3 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.k(uri2, j9, j9, j7, this.f56040l, this.f56039k);
            e0 e0Var = this.f56031c;
            if (e0Var != null) {
                this.f56036h = e0Var;
                this.f56043o = mVarA;
            } else {
                this.f56036h = this.f56032d;
                this.f56029a.b(mVarA);
            }
            kVar = kVar3;
        }
        boolean z3 = false;
        this.f56037i = kVar.f56111d == -1;
        try {
            jA = this.f56036h.a(kVar);
            z3 = true;
        } catch (IOException e2) {
            if (z2 || !this.f56037i) {
                iOException = e2;
                if (iOException == null) {
                    throw iOException;
                }
                jA = 0;
            } else {
                for (Throwable cause = e2; cause != null; cause = cause.getCause()) {
                    if ((cause instanceof com.fyber.inneractive.sdk.player.exoplayer2.upstream.i) && ((com.fyber.inneractive.sdk.player.exoplayer2.upstream.i) cause).f56101a == 0) {
                        break;
                    }
                }
                iOException = e2;
                if (iOException == null) {
                }
            }
        }
        if (this.f56037i && jA != -1) {
            this.f56042n = jA;
            a(kVar.f56110c + jA);
        }
        return z3;
    }

    public final void a(long j2) {
        if (this.f56036h == this.f56031c) {
            l lVar = this.f56029a;
            String str = this.f56040l;
            synchronized (lVar) {
                try {
                    i iVar = lVar.f56074d;
                    h hVar = (h) iVar.f56060a.get(str);
                    if (hVar == null) {
                        iVar.a(str, j2);
                    } else if (hVar.f56059d != j2) {
                        hVar.f56059d = j2;
                        iVar.f56065f = true;
                    }
                    lVar.f56074d.b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
