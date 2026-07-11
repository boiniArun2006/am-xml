package com.alightcreative.app.motion.scene;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/alightcreative/app/motion/scene/SolidColor;", "", "r", "", "g", "b", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "<init>", "(FFFF)V", "getR", "()F", "getG", "getB", "getA", "toString", "", "component1", "component2", "component3", "component4", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "Companion", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SolidColor {
    public static final int $stable = 0;
    private static final SolidColor BLACK;
    private static final SolidColor BLUE;
    private static final SolidColor GREEN;
    private static final SolidColor RED;
    private static final SolidColor WHITE;
    private static final SolidColor YELLOW;
    private final float a;
    private final float b;
    private final float g;
    private final float r;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final SolidColor TRANSPARENT = new SolidColor(0.0f, 0.0f, 0.0f, 0.0f);
    private static final SolidColor GRAY = new SolidColor(0.5f, 0.5f, 0.5f, 0.0f, 8, null);

    /* JADX INFO: renamed from: P6, reason: collision with root package name */
    private static final SolidColor f46028P6 = HI0.qf.t(-6447195);
    private static final SolidColor Y1 = HI0.qf.t(-16711768);
    private static final SolidColor G3 = HI0.qf.t(-2565928);

    /* JADX INFO: renamed from: P1, reason: collision with root package name */
    private static final SolidColor f46026P1 = HI0.qf.t(-3881525);
    private static final SolidColor P2 = HI0.qf.t(-4210493);

    /* JADX INFO: renamed from: P3, reason: collision with root package name */
    private static final SolidColor f46027P3 = HI0.qf.t(-5657676);
    private static final SolidColor CHROMA_KEY_GREEN = HI0.qf.t(-16731840);
    private static final SolidColor CHROMA_KEY_BLUE = HI0.qf.t(-16758853);
    private static final SolidColor LIGHT_GRAY = new SolidColor(0.85f, 0.85f, 0.85f, 0.0f, 8, null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b#\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007R\u0011\u0010\u001a\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0007R\u0011\u0010\u001c\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0007R\u0011\u0010\u001e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0007R\u0011\u0010 \u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0007R\u0011\u0010\"\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0007R\u0011\u0010$\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0007R\u0011\u0010&\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0007¨\u0006("}, d2 = {"Lcom/alightcreative/app/motion/scene/SolidColor$Companion;", "", "<init>", "()V", "RED", "Lcom/alightcreative/app/motion/scene/SolidColor;", "getRED", "()Lcom/alightcreative/app/motion/scene/SolidColor;", "GREEN", "getGREEN", "BLUE", "getBLUE", "BLACK", "getBLACK", "TRANSPARENT", "getTRANSPARENT", "WHITE", "getWHITE", "YELLOW", "getYELLOW", "GRAY", "getGRAY", "P6", "getP6", "Y1", "getY1", "G3", "getG3", "P1", "getP1", "P2", "getP2", "P3", "getP3", "CHROMA_KEY_GREEN", "getCHROMA_KEY_GREEN", "CHROMA_KEY_BLUE", "getCHROMA_KEY_BLUE", "LIGHT_GRAY", "getLIGHT_GRAY", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SolidColor getBLACK() {
            return SolidColor.BLACK;
        }

        public final SolidColor getBLUE() {
            return SolidColor.BLUE;
        }

        public final SolidColor getCHROMA_KEY_BLUE() {
            return SolidColor.CHROMA_KEY_BLUE;
        }

        public final SolidColor getCHROMA_KEY_GREEN() {
            return SolidColor.CHROMA_KEY_GREEN;
        }

        public final SolidColor getG3() {
            return SolidColor.G3;
        }

        public final SolidColor getGRAY() {
            return SolidColor.GRAY;
        }

        public final SolidColor getGREEN() {
            return SolidColor.GREEN;
        }

        public final SolidColor getLIGHT_GRAY() {
            return SolidColor.LIGHT_GRAY;
        }

        public final SolidColor getP1() {
            return SolidColor.f46026P1;
        }

        public final SolidColor getP2() {
            return SolidColor.P2;
        }

        public final SolidColor getP3() {
            return SolidColor.f46027P3;
        }

        public final SolidColor getP6() {
            return SolidColor.f46028P6;
        }

        public final SolidColor getRED() {
            return SolidColor.RED;
        }

        public final SolidColor getTRANSPARENT() {
            return SolidColor.TRANSPARENT;
        }

        public final SolidColor getWHITE() {
            return SolidColor.WHITE;
        }

        public final SolidColor getY1() {
            return SolidColor.Y1;
        }

        public final SolidColor getYELLOW() {
            return SolidColor.YELLOW;
        }
    }

    public SolidColor(float f3, float f4, float f5, float f6) {
        this.r = f3;
        this.g = f4;
        this.b = f5;
        this.a = f6;
    }

    public static /* synthetic */ SolidColor copy$default(SolidColor solidColor, float f3, float f4, float f5, float f6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f3 = solidColor.r;
        }
        if ((i2 & 2) != 0) {
            f4 = solidColor.g;
        }
        if ((i2 & 4) != 0) {
            f5 = solidColor.b;
        }
        if ((i2 & 8) != 0) {
            f6 = solidColor.a;
        }
        return solidColor.copy(f3, f4, f5, f6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getR() {
        return this.r;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getG() {
        return this.g;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getB() {
        return this.b;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getA() {
        return this.a;
    }

    public final SolidColor copy(float r2, float g2, float b2, float a2) {
        return new SolidColor(r2, g2, b2, a2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SolidColor)) {
            return false;
        }
        SolidColor solidColor = (SolidColor) other;
        return Float.compare(this.r, solidColor.r) == 0 && Float.compare(this.g, solidColor.g) == 0 && Float.compare(this.b, solidColor.b) == 0 && Float.compare(this.a, solidColor.a) == 0;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.r) * 31) + Float.hashCode(this.g)) * 31) + Float.hashCode(this.b)) * 31) + Float.hashCode(this.a);
    }

    static {
        float f3 = 0.0f;
        float f4 = 0.0f;
        RED = new SolidColor(1.0f, f3, 0.0f, f4, 8, null);
        GREEN = new SolidColor(f3, 1.0f, f4, 0.0f, 8, null);
        float f5 = 0.0f;
        BLUE = new SolidColor(0.0f, f4, 1.0f, f5, 8, null);
        BLACK = new SolidColor(f4, 0.0f, f5, 0.0f, 8, null);
        float f6 = 1.0f;
        float f7 = 1.0f;
        WHITE = new SolidColor(1.0f, f6, f7, f4, 8, null);
        YELLOW = new SolidColor(f6, f7, f4, 0.0f, 8, null);
    }

    public final float getA() {
        return this.a;
    }

    public final float getB() {
        return this.b;
    }

    public final float getG() {
        return this.g;
    }

    public final float getR() {
        return this.r;
    }

    public String toString() {
        return HI0.qf.rl(ColorKt.toInt(this));
    }

    public /* synthetic */ SolidColor(float f3, float f4, float f5, float f6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f3, f4, f5, (i2 & 8) != 0 ? 1.0f : f6);
    }
}
