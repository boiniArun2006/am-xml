package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.r;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.d0;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.x;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class k implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.b f54971a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.j f54976f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.f f54979i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f54980j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a f54981k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d f54982l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f54983m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f54973c = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f54977g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b0 f54978h = new b0("HlsPlaylistTracker:MasterPlaylist");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f54972b = new g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IdentityHashMap f54974d = new IdentityHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f54975e = new Handler();

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(z zVar, long j2, long j3, boolean z2) {
        d0 d0Var = (d0) zVar;
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = this.f54979i;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = d0Var.f56086a;
        long j4 = d0Var.f56091f;
        if (fVar.f55914b != null) {
            fVar.f55913a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.c(fVar, kVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j2, j3, j4));
        }
    }

    public k(Uri uri, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.j jVar) {
        this.f54971a = bVar;
        this.f54979i = fVar;
        this.f54976f = jVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(z zVar, long j2, long j3) {
        b bVar;
        d0 d0Var = (d0) zVar;
        e eVar = d0Var.f56089d;
        boolean z2 = eVar instanceof d;
        if (z2) {
            List listSingletonList = Collections.singletonList(new a(eVar.f54934a, new o("0", "application/x-mpegURL", null, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, null, null)));
            List list = Collections.EMPTY_LIST;
            bVar = new b(null, listSingletonList, list, list, null, null);
        } else {
            bVar = (b) eVar;
        }
        this.f54980j = bVar;
        this.f54981k = (a) bVar.f54906b.get(0);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(bVar.f54906b);
        arrayList.addAll(bVar.f54907c);
        arrayList.addAll(bVar.f54908d);
        int size = arrayList.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i2 = 0; i2 < size; i2++) {
            a aVar = (a) arrayList.get(i2);
            this.f54974d.put(aVar, new h(this, aVar, jElapsedRealtime));
        }
        h hVar = (h) this.f54974d.get(this.f54981k);
        if (z2) {
            hVar.a((d) eVar);
        } else {
            hVar.b();
        }
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = this.f54979i;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = d0Var.f56086a;
        long j4 = d0Var.f56091f;
        if (fVar.f55914b != null) {
            fVar.f55913a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.b(fVar, kVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j2, j3, j4));
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final int a(z zVar, long j2, long j3, IOException iOException) {
        d0 d0Var = (d0) zVar;
        boolean z2 = iOException instanceof r;
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = this.f54979i;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = d0Var.f56086a;
        long j4 = d0Var.f56091f;
        if (fVar.f55914b != null) {
            fVar.f55913a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.d(fVar, kVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j2, j3, j4, iOException, z2));
        }
        return z2 ? 3 : 0;
    }

    public final d a(a aVar) {
        d dVar;
        h hVar = (h) this.f54974d.get(aVar);
        hVar.getClass();
        hVar.f54966g = SystemClock.elapsedRealtime();
        d dVar2 = hVar.f54963d;
        if (dVar2 != null && this.f54980j.f54906b.contains(aVar) && (((dVar = this.f54982l) == null || !dVar.f54928j) && ((h) this.f54974d.get(this.f54981k)).f54966g - SystemClock.elapsedRealtime() > 15000)) {
            this.f54981k = aVar;
            ((h) this.f54974d.get(aVar)).b();
        }
        return dVar2;
    }
}
