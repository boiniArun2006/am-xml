package androidx.compose.material3.carousel;

import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u001fB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001a\u0010\u0014¨\u0006 "}, d2 = {"Landroidx/compose/material3/carousel/Arrangement;", "", "", "priority", "", "smallSize", "smallCount", "mediumSize", "mediumCount", "largeSize", "largeCount", "<init>", "(IFIFIFI)V", "", "xMQ", "()Z", "targetLargeSize", "rl", "(F)F", "mUb", "()I", c.f62177j, "I", "F", "KN", "()F", "t", "Uo", "nr", "J2", "O", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Arrangement {

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final float largeSize;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final int mediumCount;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final int largeCount;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int priority;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final float mediumSize;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final float smallSize;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int smallCount;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jg\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J_\u0010\u001d\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Landroidx/compose/material3/carousel/Arrangement$Companion;", "", "<init>", "()V", "", "priority", "", "availableSpace", "itemSpacing", "smallCount", "smallSize", "minSmallSize", "maxSmallSize", "mediumCount", "mediumSize", "largeCount", "largeSize", "Landroidx/compose/material3/carousel/Arrangement;", "t", "(IFFIFFFIFIF)Landroidx/compose/material3/carousel/Arrangement;", c.f62177j, "(FIFII)F", "targetSmallSize", "", "smallCounts", "targetMediumSize", "mediumCounts", "targetLargeSize", "largeCounts", "rl", "(FFFFF[IF[IF[I)Landroidx/compose/material3/carousel/Arrangement;", "MediumItemFlexPercentage", "F", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final float n(float availableSpace, int smallCount, float smallSize, int mediumCount, int largeCount) {
            float f3 = mediumCount / 2.0f;
            return (availableSpace - ((smallCount + f3) * smallSize)) / (largeCount + f3);
        }

        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final Arrangement t(int priority, float availableSpace, float itemSpacing, int smallCount, float smallSize, float minSmallSize, float maxSmallSize, int mediumCount, float mediumSize, int largeCount, float largeSize) {
            float fMax;
            float f3;
            Companion companion;
            int i2;
            int i3;
            float fN;
            float f4;
            float f5;
            float f6 = availableSpace - ((((largeCount + mediumCount) + smallCount) - 1) * itemSpacing);
            float fCoerceIn = RangesKt.coerceIn(smallSize, minSmallSize, maxSmallSize);
            float f7 = largeCount;
            float f8 = mediumCount;
            float f9 = (largeSize * f7) + (mediumSize * f8);
            float f10 = smallCount;
            float f11 = f6 - (f9 + (fCoerceIn * f10));
            if (smallCount <= 0 || f11 <= 0.0f) {
                if (smallCount > 0 && f11 < 0.0f) {
                    fMax = Math.max(f11 / f10, minSmallSize - fCoerceIn);
                }
                if (smallCount <= 0) {
                    f3 = fCoerceIn;
                    i2 = mediumCount;
                    i3 = largeCount;
                    companion = this;
                } else {
                    f3 = 0.0f;
                    companion = this;
                    i2 = mediumCount;
                    i3 = largeCount;
                }
                fN = companion.n(f6, smallCount, f3, i2, i3);
                float f12 = f3;
                f4 = (fN + f12) / 2.0f;
                if (i2 > 0 && fN != largeSize) {
                    f5 = (largeSize - fN) * f7;
                    float fMin = Math.min(Math.abs(f5), 0.1f * f4 * f8);
                    if (f5 <= 0.0f) {
                        f4 -= fMin / f8;
                        fN += fMin / f7;
                    } else {
                        f4 += fMin / f8;
                        fN -= fMin / f7;
                    }
                }
                return new Arrangement(priority, f12, smallCount, f4, i2, fN, i3);
            }
            fMax = Math.min(f11 / f10, maxSmallSize - fCoerceIn);
            fCoerceIn += fMax;
            if (smallCount <= 0) {
            }
            fN = companion.n(f6, smallCount, f3, i2, i3);
            float f122 = f3;
            f4 = (fN + f122) / 2.0f;
            if (i2 > 0) {
                f5 = (largeSize - fN) * f7;
                float fMin2 = Math.min(Math.abs(f5), 0.1f * f4 * f8);
                if (f5 <= 0.0f) {
                }
            }
            return new Arrangement(priority, f122, smallCount, f4, i2, fN, i3);
        }

        public final Arrangement rl(float availableSpace, float itemSpacing, float targetSmallSize, float minSmallSize, float maxSmallSize, int[] smallCounts, float targetMediumSize, int[] mediumCounts, float targetLargeSize, int[] largeCounts) {
            int[] iArr = smallCounts;
            int length = largeCounts.length;
            Arrangement arrangement = null;
            int i2 = 1;
            int i3 = 0;
            while (i3 < length) {
                int i5 = largeCounts[i3];
                int length2 = mediumCounts.length;
                int i7 = 0;
                while (i7 < length2) {
                    int i8 = mediumCounts[i7];
                    int length3 = iArr.length;
                    int i9 = 0;
                    while (i9 < length3) {
                        int i10 = i7;
                        int i11 = iArr[i9];
                        Arrangement arrangement2 = arrangement;
                        int i12 = i3;
                        int i13 = length2;
                        int i14 = length3;
                        int i15 = i9;
                        Arrangement arrangementT = t(i2, availableSpace, itemSpacing, i11, targetSmallSize, minSmallSize, maxSmallSize, i8, targetMediumSize, i5, targetLargeSize);
                        if (arrangement2 != null && arrangementT.rl(targetLargeSize) >= arrangement2.rl(targetLargeSize)) {
                            arrangement = arrangement2;
                        } else {
                            if (arrangementT.rl(targetLargeSize) == 0.0f) {
                                return arrangementT;
                            }
                            arrangement = arrangementT;
                        }
                        i2++;
                        i9 = i15 + 1;
                        iArr = smallCounts;
                        i3 = i12;
                        length2 = i13;
                        i7 = i10;
                        length3 = i14;
                    }
                    i7++;
                    iArr = smallCounts;
                }
                i3++;
                iArr = smallCounts;
            }
            return arrangement;
        }
    }

    private final boolean xMQ() {
        int i2 = this.largeCount;
        if (i2 <= 0 || this.smallCount <= 0 || this.mediumCount <= 0) {
            return i2 <= 0 || this.smallCount <= 0 || this.largeSize > this.smallSize;
        }
        float f3 = this.largeSize;
        float f4 = this.mediumSize;
        return f3 > f4 && f4 > this.smallSize;
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final float getMediumSize() {
        return this.mediumSize;
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final float getSmallSize() {
        return this.smallSize;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final int getMediumCount() {
        return this.mediumCount;
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final int getSmallCount() {
        return this.smallCount;
    }

    public final int mUb() {
        return this.largeCount + this.mediumCount + this.smallCount;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final float getLargeSize() {
        return this.largeSize;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final int getLargeCount() {
        return this.largeCount;
    }

    public Arrangement(int i2, float f3, int i3, float f4, int i5, float f5, int i7) {
        this.priority = i2;
        this.smallSize = f3;
        this.smallCount = i3;
        this.mediumSize = f4;
        this.mediumCount = i5;
        this.largeSize = f5;
        this.largeCount = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float rl(float targetLargeSize) {
        if (!xMQ()) {
            return Float.MAX_VALUE;
        }
        return Math.abs(targetLargeSize - this.largeSize) * this.priority;
    }
}
