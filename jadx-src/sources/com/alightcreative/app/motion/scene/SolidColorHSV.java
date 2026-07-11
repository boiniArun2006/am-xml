package com.alightcreative.app.motion.scene;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/alightcreative/app/motion/scene/SolidColorHSV;", "", CmcdData.STREAMING_FORMAT_HLS, "", CmcdData.STREAMING_FORMAT_SS, "v", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "<init>", "(FFFF)V", "getH", "()F", "getS", "getV", "getA", "component1", "component2", "component3", "component4", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "Companion", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SolidColorHSV {
    public static final int $stable = 0;
    private final float a;
    private final float h;
    private final float s;
    private final float v;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final SolidColorHSV BLACK = new SolidColorHSV(0.0f, 0.0f, 0.0f, 1.0f);
    private static final SolidColorHSV WHITE = new SolidColorHSV(0.0f, 0.0f, 1.0f, 1.0f);
    private static final SolidColorHSV RED = new SolidColorHSV(0.0f, 1.0f, 1.0f, 1.0f);
    private static final SolidColorHSV ORANGE = new SolidColorHSV(30.0f, 1.0f, 1.0f, 1.0f);
    private static final SolidColorHSV YELLOW = new SolidColorHSV(60.0f, 1.0f, 1.0f, 1.0f);
    private static final SolidColorHSV GREEN = new SolidColorHSV(120.0f, 1.0f, 1.0f, 1.0f);
    private static final SolidColorHSV CYAN = new SolidColorHSV(180.0f, 1.0f, 1.0f, 1.0f);
    private static final SolidColorHSV BLUE = new SolidColorHSV(240.0f, 1.0f, 1.0f, 1.0f);
    private static final SolidColorHSV PURPLE = new SolidColorHSV(270.0f, 1.0f, 1.0f, 1.0f);
    private static final SolidColorHSV MAGENTA = new SolidColorHSV(300.0f, 1.0f, 1.0f, 1.0f);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/alightcreative/app/motion/scene/SolidColorHSV$Companion;", "", "<init>", "()V", "BLACK", "Lcom/alightcreative/app/motion/scene/SolidColorHSV;", "getBLACK", "()Lcom/alightcreative/app/motion/scene/SolidColorHSV;", "WHITE", "getWHITE", "RED", "getRED", "ORANGE", "getORANGE", "YELLOW", "getYELLOW", "GREEN", "getGREEN", "CYAN", "getCYAN", "BLUE", "getBLUE", "PURPLE", "getPURPLE", "MAGENTA", "getMAGENTA", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SolidColorHSV getBLACK() {
            return SolidColorHSV.BLACK;
        }

        public final SolidColorHSV getBLUE() {
            return SolidColorHSV.BLUE;
        }

        public final SolidColorHSV getCYAN() {
            return SolidColorHSV.CYAN;
        }

        public final SolidColorHSV getGREEN() {
            return SolidColorHSV.GREEN;
        }

        public final SolidColorHSV getMAGENTA() {
            return SolidColorHSV.MAGENTA;
        }

        public final SolidColorHSV getORANGE() {
            return SolidColorHSV.ORANGE;
        }

        public final SolidColorHSV getPURPLE() {
            return SolidColorHSV.PURPLE;
        }

        public final SolidColorHSV getRED() {
            return SolidColorHSV.RED;
        }

        public final SolidColorHSV getWHITE() {
            return SolidColorHSV.WHITE;
        }

        public final SolidColorHSV getYELLOW() {
            return SolidColorHSV.YELLOW;
        }
    }

    public SolidColorHSV(float f3, float f4, float f5, float f6) {
        this.h = f3;
        this.s = f4;
        this.v = f5;
        this.a = f6;
    }

    public static /* synthetic */ SolidColorHSV copy$default(SolidColorHSV solidColorHSV, float f3, float f4, float f5, float f6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f3 = solidColorHSV.h;
        }
        if ((i2 & 2) != 0) {
            f4 = solidColorHSV.s;
        }
        if ((i2 & 4) != 0) {
            f5 = solidColorHSV.v;
        }
        if ((i2 & 8) != 0) {
            f6 = solidColorHSV.a;
        }
        return solidColorHSV.copy(f3, f4, f5, f6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getH() {
        return this.h;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getS() {
        return this.s;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getV() {
        return this.v;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getA() {
        return this.a;
    }

    public final SolidColorHSV copy(float h2, float s2, float v2, float a2) {
        return new SolidColorHSV(h2, s2, v2, a2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SolidColorHSV)) {
            return false;
        }
        SolidColorHSV solidColorHSV = (SolidColorHSV) other;
        return Float.compare(this.h, solidColorHSV.h) == 0 && Float.compare(this.s, solidColorHSV.s) == 0 && Float.compare(this.v, solidColorHSV.v) == 0 && Float.compare(this.a, solidColorHSV.a) == 0;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.h) * 31) + Float.hashCode(this.s)) * 31) + Float.hashCode(this.v)) * 31) + Float.hashCode(this.a);
    }

    public String toString() {
        return "SolidColorHSV(h=" + this.h + ", s=" + this.s + ", v=" + this.v + ", a=" + this.a + ")";
    }

    public final float getA() {
        return this.a;
    }

    public final float getH() {
        return this.h;
    }

    public final float getS() {
        return this.s;
    }

    public final float getV() {
        return this.v;
    }

    public /* synthetic */ SolidColorHSV(float f3, float f4, float f5, float f6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f3, f4, f5, (i2 & 8) != 0 ? 1.0f : f6);
    }
}
