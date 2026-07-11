package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.r;
import com.fyber.inneractive.sdk.player.exoplayer2.m;
import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.util.l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class f extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f54773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f54774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f54775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f54776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f54777f;

    public final boolean a(n nVar) throws d {
        int iJ = nVar.j();
        int i2 = (iJ >> 4) & 15;
        int i3 = iJ & 15;
        if (i3 != 7) {
            throw new d(m.a("Video format not supported: ", i3));
        }
        this.f54777f = i2;
        return i2 != 5;
    }

    public f(r rVar) {
        super(rVar);
        this.f54773b = new n(l.f56198a);
        this.f54774c = new n(4);
    }

    public final void a(n nVar, long j2) throws com.fyber.inneractive.sdk.player.exoplayer2.r {
        int iJ = nVar.j();
        long jL = (((long) nVar.l()) * 1000) + j2;
        if (iJ == 0 && !this.f54776e) {
            byte[] bArr = new byte[nVar.f56208c - nVar.f56207b];
            n nVar2 = new n(bArr);
            nVar.a(bArr, 0, nVar.f56208c - nVar.f56207b);
            com.fyber.inneractive.sdk.player.exoplayer2.video.a aVarA = com.fyber.inneractive.sdk.player.exoplayer2.video.a.a(nVar2);
            this.f54775d = aVarA.f56262b;
            this.f54772a.a(o.a(null, "video/avc", -1, aVarA.f56263c, aVarA.f56264d, aVarA.f56261a, -1, aVarA.f56265e, null, -1, null, null));
            this.f54776e = true;
            return;
        }
        if (iJ == 1 && this.f54776e) {
            byte[] bArr2 = this.f54774c.f56206a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i2 = 4 - this.f54775d;
            int i3 = 0;
            while (nVar.f56208c - nVar.f56207b > 0) {
                nVar.a(this.f54774c.f56206a, i2, this.f54775d);
                this.f54774c.e(0);
                int iM = this.f54774c.m();
                this.f54773b.e(0);
                this.f54772a.a(4, this.f54773b);
                this.f54772a.a(iM, nVar);
                i3 = i3 + 4 + iM;
            }
            this.f54772a.a(jL, this.f54777f == 1 ? 1 : 0, i3, 0, null);
        }
    }
}
