package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.r;
import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.util.n;
import java.util.Collections;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class a extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f54753e = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f54754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f54755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f54756d;

    public final boolean a(n nVar) throws d {
        if (this.f54754b) {
            nVar.e(nVar.f56207b + 1);
        } else {
            int iJ = nVar.j();
            int i2 = (iJ >> 4) & 15;
            this.f54756d = i2;
            if (i2 == 2) {
                this.f54772a.a(o.a(null, "audio/mpeg", -1, -1, 1, f54753e[(iJ >> 2) & 3], null, null, null));
                this.f54755c = true;
            } else if (i2 == 7 || i2 == 8) {
                this.f54772a.a(o.a(null, i2 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw", -1, -1, 1, 8000, (iJ & 1) == 1 ? 2 : 3, -1, -1, null, null, 0, null, null));
                this.f54755c = true;
            } else if (i2 != 10) {
                throw new d("Audio format not supported: " + this.f54756d);
            }
            this.f54754b = true;
        }
        return true;
    }

    public a(r rVar) {
        super(rVar);
    }

    public final void a(n nVar, long j2) {
        if (this.f54756d == 2) {
            int i2 = nVar.f56208c - nVar.f56207b;
            this.f54772a.a(i2, nVar);
            this.f54772a.a(j2, 1, i2, 0, null);
            return;
        }
        int iJ = nVar.j();
        if (iJ == 0 && !this.f54755c) {
            int i3 = nVar.f56208c - nVar.f56207b;
            byte[] bArr = new byte[i3];
            nVar.a(bArr, 0, i3);
            Pair pairA = com.fyber.inneractive.sdk.player.exoplayer2.util.d.a(bArr);
            this.f54772a.a(o.a(null, "audio/mp4a-latm", -1, -1, ((Integer) pairA.second).intValue(), ((Integer) pairA.first).intValue(), Collections.singletonList(bArr), null, null));
            this.f54755c = true;
            return;
        }
        if (this.f54756d != 10 || iJ == 1) {
            int i5 = nVar.f56208c - nVar.f56207b;
            this.f54772a.a(i5, nVar);
            this.f54772a.a(j2, 1, i5, 0, null);
        }
    }
}
