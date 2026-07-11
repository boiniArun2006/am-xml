package com.fyber.inneractive.sdk.player.exoplayer2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f55880d = new s(1.0f, 1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f55881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f55882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f55883c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s.class == obj.getClass()) {
            s sVar = (s) obj;
            if (this.f55881a == sVar.f55881a && this.f55882b == sVar.f55882b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f55882b) + ((Float.floatToRawIntBits(this.f55881a) + 527) * 31);
    }

    public s(float f3, float f4) {
        this.f55881a = f3;
        this.f55882b = f4;
        this.f55883c = Math.round(f3 * 1000.0f);
    }
}
