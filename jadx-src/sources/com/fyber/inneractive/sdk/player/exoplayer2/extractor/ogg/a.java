package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class a implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f55357a;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return true;
    }

    public a(b bVar) {
        this.f55357a = bVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j2) {
        if (j2 == 0) {
            return this.f55357a.f55359b;
        }
        b bVar = this.f55357a;
        long j3 = (((long) bVar.f55361d.f55404i) * j2) / 1000000;
        long j4 = bVar.f55359b;
        long j5 = bVar.f55360c;
        long j6 = ((((j5 - j4) * j3) / bVar.f55363f) - 30000) + j4;
        if (j6 >= j4) {
            j4 = j6;
        }
        return j4 >= j5 ? j5 - 1 : j4;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        b bVar = this.f55357a;
        return (bVar.f55363f * 1000000) / ((long) bVar.f55361d.f55404i);
    }
}
