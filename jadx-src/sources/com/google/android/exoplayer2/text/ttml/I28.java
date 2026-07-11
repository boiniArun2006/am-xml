package com.google.android.exoplayer2.text.ttml;

import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Util;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class I28 implements Subtitle {
    private final Map J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Map f58333O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final n f58334n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Map f58335r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long[] f58336t;

    @Override // com.google.android.exoplayer2.text.Subtitle
    public List getCues(long j2) {
        return this.f58334n.KN(j2, this.f58333O, this.J2, this.f58335r);
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public long getEventTime(int i2) {
        return this.f58336t[i2];
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getEventTimeCount() {
        return this.f58336t.length;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getNextEventTimeIndex(long j2) {
        int iBinarySearchCeil = Util.binarySearchCeil(this.f58336t, j2, false, false);
        if (iBinarySearchCeil < this.f58336t.length) {
            return iBinarySearchCeil;
        }
        return -1;
    }

    public I28(n nVar, Map map, Map map2, Map map3) {
        Map mapUnmodifiableMap;
        this.f58334n = nVar;
        this.J2 = map2;
        this.f58335r = map3;
        if (map != null) {
            mapUnmodifiableMap = Collections.unmodifiableMap(map);
        } else {
            mapUnmodifiableMap = Collections.EMPTY_MAP;
        }
        this.f58333O = mapUnmodifiableMap;
        this.f58336t = nVar.mUb();
    }
}
