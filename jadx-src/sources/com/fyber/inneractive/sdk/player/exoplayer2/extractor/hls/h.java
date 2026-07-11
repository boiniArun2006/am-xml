package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.exoplayer.hls.HlsMediaChunk;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.b0;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.q;
import com.fyber.inneractive.sdk.player.exoplayer2.util.v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class h extends com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.b {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final AtomicInteger f54822G = new AtomicInteger();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f54823A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f54824B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f54825C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public n f54826D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public volatile boolean f54827E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public volatile boolean f54828F;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f54829j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f54830k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a f54831l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f54832m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.k f54833n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f54834o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f54835p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v f54836q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f54837r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.i f54838s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f54839t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f54840u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List f54841v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f54842w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.n f54843x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f54844y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.i f54845z;

    /* JADX WARN: Illegal instructions before constructor call */
    public h(com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar2, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar, List list, int i2, Object obj, long j2, long j3, int i3, int i5, boolean z2, v vVar, h hVar2, byte[] bArr, byte[] bArr2) {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.h aVar2 = (bArr == null || bArr2 == null) ? hVar : new a(hVar, bArr, bArr2);
        super(i2, i3, j2, j3, aVar.f54905b, aVar2, kVar, obj);
        this.f54830k = i5;
        this.f54833n = kVar2;
        this.f54831l = aVar;
        this.f54841v = list;
        this.f54835p = z2;
        this.f54836q = vVar;
        this.f54834o = aVar2 instanceof a;
        String lastPathSegment = kVar.f56108a.getLastPathSegment();
        this.f54837r = lastPathSegment;
        boolean z3 = true;
        boolean z4 = lastPathSegment.endsWith(".aac") || lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3") || lastPathSegment.endsWith(".mp3");
        this.f54842w = z4;
        if (hVar2 != null) {
            this.f54843x = hVar2.f54843x;
            this.f54844y = hVar2.f54844y;
            this.f54838s = hVar2.f54845z;
            boolean z5 = hVar2.f54831l != aVar;
            this.f54839t = z5;
            if (hVar2.f54830k == i5 && !z5) {
                z3 = false;
            }
            this.f54840u = z3;
        } else {
            this.f54843x = z4 ? new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.n() : null;
            this.f54844y = z4 ? new com.fyber.inneractive.sdk.player.exoplayer2.util.n(10) : null;
            this.f54838s = null;
            this.f54839t = false;
            this.f54840u = true;
        }
        this.f54832m = hVar;
        this.f54829j = f54822G.getAndIncrement();
    }

    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.metadata.b bVarA;
        bVar.f54728e = 0;
        if (!bVar.a(this.f54844y.f56206a, 0, 10, true)) {
            return -9223372036854775807L;
        }
        this.f54844y.c(10);
        if (this.f54844y.l() != com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.n.f55843b) {
            return -9223372036854775807L;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.f54844y;
        nVar.e(nVar.f56207b + 3);
        int i2 = this.f54844y.i();
        int i3 = i2 + 10;
        if (i3 > this.f54844y.a()) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f54844y;
            byte[] bArr = nVar2.f56206a;
            nVar2.c(i3);
            System.arraycopy(bArr, 0, this.f54844y.f56206a, 0, 10);
        }
        if (!bVar.a(this.f54844y.f56206a, 10, i2, true) || (bVarA = this.f54843x.a(i2, this.f54844y.f56206a)) == null) {
            return -9223372036854775807L;
        }
        int length = bVarA.f55816a.length;
        for (int i5 = 0; i5 < length; i5++) {
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o oVar = bVarA.f55816a[i5];
            if (oVar instanceof q) {
                q qVar = (q) oVar;
                if (HlsMediaChunk.PRIV_TIMESTAMP_FRAME_OWNER.equals(qVar.f55846b)) {
                    System.arraycopy(qVar.f55847c, 0, this.f54844y.f56206a, 0, 8);
                    this.f54844y.c(8);
                    return this.f54844y.g();
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void b() {
        this.f54827E = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a
    public final long c() {
        return this.f54824B;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ec A[Catch: all -> 0x01fb, TryCatch #3 {all -> 0x01fb, blocks: (B:128:0x01db, B:130:0x01ec, B:132:0x01f4, B:136:0x01ff, B:135:0x01fd, B:138:0x0207, B:147:0x0225, B:145:0x021a, B:146:0x0224, B:140:0x020e, B:142:0x0212), top: B:158:0x01db, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0207 A[Catch: all -> 0x01fb, TRY_LEAVE, TryCatch #3 {all -> 0x01fb, blocks: (B:128:0x01db, B:130:0x01ec, B:132:0x01f4, B:136:0x01ff, B:135:0x01fd, B:138:0x0207, B:147:0x0225, B:145:0x021a, B:146:0x0224, B:140:0x020e, B:142:0x0212), top: B:158:0x01db, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x020e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ef  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void load() {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar;
        boolean z2;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar2;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.i pVar;
        boolean z3;
        int i2;
        String strA;
        String strA2;
        int iA = 0;
        if (this.f54845z == null && !this.f54842w) {
            if ("text/vtt".equals(this.f54831l.f54905b.f55858f) || this.f54837r.endsWith(".webvtt") || this.f54837r.endsWith(".vtt")) {
                pVar = new p(this.f55898c.f55877y, this.f54836q);
            } else {
                if (this.f54840u) {
                    if (!this.f54837r.endsWith(".mp4")) {
                        if (!this.f54837r.startsWith(".m4", r2.length() - 4)) {
                            List list = this.f54841v;
                            if (list != null) {
                                i2 = 48;
                            } else {
                                list = Collections.EMPTY_LIST;
                                i2 = 16;
                            }
                            String str = this.f55898c.f55855c;
                            if (!TextUtils.isEmpty(str)) {
                                if (str == null) {
                                    strA = null;
                                    if (!"audio/mp4a-latm".equals(strA)) {
                                        i2 |= 2;
                                    }
                                    if (str != null) {
                                        strA2 = null;
                                        if (!"video/avc".equals(strA2)) {
                                            i2 |= 4;
                                        }
                                    } else {
                                        for (String str2 : str.split(",")) {
                                            strA2 = com.fyber.inneractive.sdk.player.exoplayer2.util.i.a(str2);
                                            if (strA2 != null && "video".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(strA2))) {
                                                break;
                                            }
                                        }
                                        strA2 = null;
                                        if (!"video/avc".equals(strA2)) {
                                        }
                                    }
                                } else {
                                    for (String str3 : str.split(",")) {
                                        strA = com.fyber.inneractive.sdk.player.exoplayer2.util.i.a(str3);
                                        if (strA != null && "audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(strA))) {
                                            break;
                                        }
                                    }
                                    strA = null;
                                    if (!"audio/mp4a-latm".equals(strA)) {
                                    }
                                    if (str != null) {
                                    }
                                }
                            }
                            b0 b0Var = new b0(2, this.f54836q, new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.e(i2, list));
                            z3 = true;
                            pVar = b0Var;
                        }
                    }
                    pVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.m(this.f54836q);
                } else {
                    pVar = this.f54838s;
                    z3 = false;
                }
                if (z3) {
                    pVar.a(this.f54826D);
                }
                this.f54845z = pVar;
            }
            z3 = true;
            if (z3) {
            }
            this.f54845z = pVar;
        }
        if (this.f54838s != this.f54845z && !this.f54825C && (kVar2 = this.f54833n) != null) {
            int i3 = this.f54823A;
            int i5 = z.f56234a;
            if (i3 != 0) {
                long j2 = kVar2.f56111d;
                long j3 = j2 == -1 ? -1L : j2 - ((long) i3);
                Uri uri = kVar2.f56108a;
                long j4 = ((long) i3) + kVar2.f56110c;
                kVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.k(uri, j4, j4, j3, kVar2.f56112e, kVar2.f56113f);
            }
            try {
                com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar = this.f54832m;
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.b(hVar, kVar2.f56109b, hVar.a(kVar2));
                int iA2 = 0;
                while (iA2 == 0) {
                    try {
                        if (this.f54827E) {
                            break;
                        } else {
                            iA2 = this.f54845z.a(bVar, (com.fyber.inneractive.sdk.player.exoplayer2.extractor.o) null);
                        }
                    } finally {
                        this.f54823A = (int) (bVar.f54726c - this.f54833n.f56109b);
                    }
                }
                z.a(this.f55903h);
                this.f54825C = true;
            } finally {
            }
        }
        if (this.f54827E) {
            return;
        }
        try {
            if (this.f54834o) {
                kVar = this.f55896a;
                z2 = this.f54824B != 0;
                if (this.f54835p) {
                    v vVar = this.f54836q;
                    synchronized (vVar) {
                        while (vVar.f56232c == -9223372036854775807L) {
                            vVar.wait();
                        }
                    }
                } else {
                    v vVar2 = this.f54836q;
                    if (vVar2.f56230a == Long.MAX_VALUE) {
                        vVar2.c(this.f55901f);
                    }
                }
                com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar2 = this.f55903h;
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.b(hVar2, kVar.f56109b, hVar2.a(kVar));
                if (this.f54845z == null) {
                    long jA = a(bVar2);
                    this.f54845z = a(jA != -9223372036854775807L ? this.f54836q.b(jA) : this.f55901f);
                }
                if (z2) {
                    bVar2.a(this.f54824B);
                }
                while (iA == 0) {
                    try {
                        if (this.f54827E) {
                            break;
                        } else {
                            iA = this.f54845z.a(bVar2, (com.fyber.inneractive.sdk.player.exoplayer2.extractor.o) null);
                        }
                    } finally {
                        this.f54824B = (int) (bVar2.f54726c - this.f55896a.f56109b);
                    }
                }
                z.a(this.f55903h);
                this.f54828F = true;
                return;
            }
            kVar = this.f55896a;
            int i7 = this.f54824B;
            int i8 = z.f56234a;
            if (i7 != 0) {
                long j5 = kVar.f56111d;
                long j6 = j5 != -1 ? j5 - ((long) i7) : -1L;
                Uri uri2 = kVar.f56108a;
                long j7 = ((long) i7) + kVar.f56110c;
                kVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.k(uri2, j7, j7, j6, kVar.f56112e, kVar.f56113f);
            }
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar22 = this.f55903h;
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar22 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.b(hVar22, kVar.f56109b, hVar22.a(kVar));
            if (this.f54845z == null) {
            }
            if (z2) {
            }
            while (iA == 0) {
            }
            z.a(this.f55903h);
            this.f54828F = true;
            return;
        } finally {
        }
        if (this.f54835p) {
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final boolean a() {
        return this.f54827E;
    }

    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.i a(long j2) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.i aVar;
        if (this.f54837r.endsWith(".aac")) {
            aVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.c(j2);
        } else if (!this.f54837r.endsWith(".ac3") && !this.f54837r.endsWith(".ec3")) {
            if (this.f54837r.endsWith(".mp3")) {
                aVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.c(j2);
            } else {
                throw new IllegalArgumentException("Unkown extension for audio file: " + this.f54837r);
            }
        } else {
            aVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.a(j2);
        }
        aVar.a(this.f54826D);
        return aVar;
    }
}
