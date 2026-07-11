package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class a extends c {
    public final long P0;
    public final ArrayList Q0;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public final ArrayList f55124R0;

    public final a b(int i2) {
        int size = this.f55124R0.size();
        for (int i3 = 0; i3 < size; i3++) {
            a aVar = (a) this.f55124R0.get(i3);
            if (aVar.f55183a == i2) {
                return aVar;
            }
        }
        return null;
    }

    public final b c(int i2) {
        int size = this.Q0.size();
        for (int i3 = 0; i3 < size; i3++) {
            b bVar = (b) this.Q0.get(i3);
            if (bVar.f55183a == i2) {
                return bVar;
            }
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c
    public final String toString() {
        return c.a(this.f55183a) + " leaves: " + Arrays.toString(this.Q0.toArray()) + " containers: " + Arrays.toString(this.f55124R0.toArray());
    }

    public a(int i2, long j2) {
        super(i2);
        this.P0 = j2;
        this.Q0 = new ArrayList();
        this.f55124R0 = new ArrayList();
    }
}
