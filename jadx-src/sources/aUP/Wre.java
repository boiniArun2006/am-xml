package aUP;

import android.media.MediaCodecInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class Wre implements Comparable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f13010n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Integer f13011t;

    public Wre(oC.Wre params, MediaCodecInfo.VideoCapabilities capabilities) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        this.f13010n = Math.abs(eO.nr(eO.J2(params), capabilities.getWidthAlignment()) - eO.J2(params)) + Math.abs(eO.nr(eO.O(params), capabilities.getHeightAlignment()) - eO.O(params));
        this.f13011t = (Integer) capabilities.getBitrateRange().clamp(Integer.valueOf(params.t()));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public int compareTo(Wre other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int i2 = this.f13010n;
        int i3 = other.f13010n;
        if (i2 < i3) {
            return 1;
        }
        if (i2 > i3) {
            return -1;
        }
        int iIntValue = this.f13011t.intValue();
        Integer num = other.f13011t;
        Intrinsics.checkNotNullExpressionValue(num, "other.bitrateScore");
        return Intrinsics.compare(iIntValue, num.intValue());
    }
}
