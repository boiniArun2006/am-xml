package androidx.compose.material3.carousel;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0080\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJV\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b\u001d\u0010\u001a¨\u0006$"}, d2 = {"Landroidx/compose/material3/carousel/Keyline;", "", "", "size", "offset", "unadjustedOffset", "", "isFocal", "isAnchor", "isPivot", "cutoff", "<init>", "(FFFZZZF)V", c.f62177j, "(FFFZZZF)Landroidx/compose/material3/carousel/Keyline;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "F", "O", "()F", "rl", "nr", "t", "J2", "Z", "KN", "()Z", "Uo", "xMQ", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Keyline {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata and from toString */
    private final boolean isPivot;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAnchor;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata and from toString */
    private final float cutoff;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final float size;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata and from toString */
    private final boolean isFocal;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata and from toString */
    private final float offset;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final float unadjustedOffset;

    public static /* synthetic */ Keyline rl(Keyline keyline, float f3, float f4, float f5, boolean z2, boolean z3, boolean z4, float f6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f3 = keyline.size;
        }
        if ((i2 & 2) != 0) {
            f4 = keyline.offset;
        }
        if ((i2 & 4) != 0) {
            f5 = keyline.unadjustedOffset;
        }
        if ((i2 & 8) != 0) {
            z2 = keyline.isFocal;
        }
        if ((i2 & 16) != 0) {
            z3 = keyline.isAnchor;
        }
        if ((i2 & 32) != 0) {
            z4 = keyline.isPivot;
        }
        if ((i2 & 64) != 0) {
            f6 = keyline.cutoff;
        }
        boolean z5 = z4;
        float f7 = f6;
        boolean z6 = z3;
        float f8 = f5;
        return keyline.n(f3, f4, f8, z2, z6, z5, f7);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Keyline)) {
            return false;
        }
        Keyline keyline = (Keyline) other;
        return Float.compare(this.size, keyline.size) == 0 && Float.compare(this.offset, keyline.offset) == 0 && Float.compare(this.unadjustedOffset, keyline.unadjustedOffset) == 0 && this.isFocal == keyline.isFocal && this.isAnchor == keyline.isAnchor && this.isPivot == keyline.isPivot && Float.compare(this.cutoff, keyline.cutoff) == 0;
    }

    public int hashCode() {
        return (((((((((((Float.hashCode(this.size) * 31) + Float.hashCode(this.offset)) * 31) + Float.hashCode(this.unadjustedOffset)) * 31) + Boolean.hashCode(this.isFocal)) * 31) + Boolean.hashCode(this.isAnchor)) * 31) + Boolean.hashCode(this.isPivot)) * 31) + Float.hashCode(this.cutoff);
    }

    public final Keyline n(float size, float offset, float unadjustedOffset, boolean isFocal, boolean isAnchor, boolean isPivot, float cutoff) {
        return new Keyline(size, offset, unadjustedOffset, isFocal, isAnchor, isPivot, cutoff);
    }

    public String toString() {
        return "Keyline(size=" + this.size + ", offset=" + this.offset + ", unadjustedOffset=" + this.unadjustedOffset + ", isFocal=" + this.isFocal + ", isAnchor=" + this.isAnchor + ", isPivot=" + this.isPivot + ", cutoff=" + this.cutoff + ')';
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final float getUnadjustedOffset() {
        return this.unadjustedOffset;
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final boolean getIsFocal() {
        return this.isFocal;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final float getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final boolean getIsAnchor() {
        return this.isAnchor;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final float getOffset() {
        return this.offset;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final float getCutoff() {
        return this.cutoff;
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final boolean getIsPivot() {
        return this.isPivot;
    }

    public Keyline(float f3, float f4, float f5, boolean z2, boolean z3, boolean z4, float f6) {
        this.size = f3;
        this.offset = f4;
        this.unadjustedOffset = f5;
        this.isFocal = z2;
        this.isAnchor = z3;
        this.isPivot = z4;
        this.cutoff = f6;
    }
}
