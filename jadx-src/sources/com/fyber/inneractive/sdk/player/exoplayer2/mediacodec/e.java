package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.text.TextUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f55807b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == e.class) {
            e eVar = (e) obj;
            if (TextUtils.equals(this.f55806a, eVar.f55806a) && this.f55807b == eVar.f55807b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f55806a;
        return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.f55807b ? 1231 : 1237);
    }

    public e(boolean z2, String str) {
        this.f55806a = str;
        this.f55807b = z2;
    }
}
