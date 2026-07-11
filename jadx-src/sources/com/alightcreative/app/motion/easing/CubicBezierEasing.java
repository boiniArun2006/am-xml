package com.alightcreative.app.motion.easing;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.alightcreative.app.motion.scene.Vector2D;
import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInSymbol;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0001)B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003H\u0002J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003H\u0016J\u001c\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u001c2\u0006\u0010\u0019\u001a\u00020\u0003H\u0016J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J1\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006*"}, d2 = {"Lcom/alightcreative/app/motion/easing/CubicBezierEasing;", "Lcom/alightcreative/app/motion/easing/SplittableEasing;", "p1x", "", "p1y", "p2x", "p2y", "<init>", "(FFFF)V", "getP1x", "()F", "getP1y", "getP2x", "getP2y", "serializeToString", "", "getHandles", "", "Lcom/alightcreative/app/motion/easing/EasingHandle;", "copyWithUpdatedHandle", "Lcom/alightcreative/app/motion/easing/Easing;", "id", "position", "Lcom/alightcreative/app/motion/scene/Vector2D;", "getTForX", "t", "interpolate", V8ValueBuiltInSymbol.PROPERTY_SPLIT, "Lkotlin/Pair;", "component1", "component2", "component3", "component4", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "toString", "Companion", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CubicBezierEasing implements SplittableEasing {
    public static final int $stable = 0;
    private final float p1x;
    private final float p1y;
    private final float p2x;
    private final float p2y;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final CubicBezierEasing EASE_IN = new CubicBezierEasing(0.42f, 0.0f, 1.0f, 1.0f);
    private static final CubicBezierEasing EASE_OUT = new CubicBezierEasing(0.0f, 0.0f, 0.58f, 1.0f);
    private static final CubicBezierEasing EASE_IN_OUT = new CubicBezierEasing(0.42f, 0.0f, 0.58f, 1.0f);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002J\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002J \u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002J \u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002J \u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\rH\u0002J$\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u001a2\u0006\u0010\u0018\u001a\u00020\rH\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/alightcreative/app/motion/easing/CubicBezierEasing$Companion;", "", "<init>", "()V", "EASE_IN", "Lcom/alightcreative/app/motion/easing/CubicBezierEasing;", "getEASE_IN", "()Lcom/alightcreative/app/motion/easing/CubicBezierEasing;", "EASE_OUT", "getEASE_OUT", "EASE_IN_OUT", "getEASE_IN_OUT", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "", "aA1", "aA2", "b", "c", "calcBezier", "aT", "getSlope", "lerp", "p1", "p2", "fraction", "deCasteljauIteration", "", "coordinates", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nCubicBezierEasing.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CubicBezierEasing.kt\ncom/alightcreative/app/motion/easing/CubicBezierEasing$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,125:1\n1557#2:126\n1628#2,3:127\n*S KotlinDebug\n*F\n+ 1 CubicBezierEasing.kt\ncom/alightcreative/app/motion/easing/CubicBezierEasing$Companion\n*L\n122#1:126\n122#1:127,3\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final float a(float aA1, float aA2) {
            return (1.0f - (aA2 * 3.0f)) + (aA1 * 3.0f);
        }

        private final float b(float aA1, float aA2) {
            return (aA2 * 3.0f) - (aA1 * 6.0f);
        }

        private final float c(float aA1) {
            return aA1 * 3.0f;
        }

        private final float lerp(float p1, float p2, float fraction) {
            return (p1 * (1 - fraction)) + (p2 * fraction);
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float getSlope(float aT2, float aA1, float aA2) {
            return (a(aA1, aA2) * 3.0f * aT2 * aT2) + (b(aA1, aA2) * 2.0f * aT2) + c(aA1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float calcBezier(float aT2, float aA1, float aA2) {
            return ((((a(aA1, aA2) * aT2) + b(aA1, aA2)) * aT2) + c(aA1)) * aT2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Float> deCasteljauIteration(List<Float> coordinates, float fraction) {
            List<Pair> listZipWithNext = CollectionsKt.zipWithNext(coordinates);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listZipWithNext, 10));
            for (Pair pair : listZipWithNext) {
                arrayList.add(Float.valueOf(CubicBezierEasing.INSTANCE.lerp(((Number) pair.component1()).floatValue(), ((Number) pair.component2()).floatValue(), fraction)));
            }
            return arrayList;
        }

        public final CubicBezierEasing getEASE_IN() {
            return CubicBezierEasing.EASE_IN;
        }

        public final CubicBezierEasing getEASE_IN_OUT() {
            return CubicBezierEasing.EASE_IN_OUT;
        }

        public final CubicBezierEasing getEASE_OUT() {
            return CubicBezierEasing.EASE_OUT;
        }
    }

    public static /* synthetic */ CubicBezierEasing copy$default(CubicBezierEasing cubicBezierEasing, float f3, float f4, float f5, float f6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f3 = cubicBezierEasing.p1x;
        }
        if ((i2 & 2) != 0) {
            f4 = cubicBezierEasing.p1y;
        }
        if ((i2 & 4) != 0) {
            f5 = cubicBezierEasing.p2x;
        }
        if ((i2 & 8) != 0) {
            f6 = cubicBezierEasing.p2y;
        }
        return cubicBezierEasing.copy(f3, f4, f5, f6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getP1x() {
        return this.p1x;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getP1y() {
        return this.p1y;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getP2x() {
        return this.p2x;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getP2y() {
        return this.p2y;
    }

    public final CubicBezierEasing copy(float p1x, float p1y, float p2x, float p2y) {
        return new CubicBezierEasing(p1x, p1y, p2x, p2y);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CubicBezierEasing)) {
            return false;
        }
        CubicBezierEasing cubicBezierEasing = (CubicBezierEasing) other;
        return Float.compare(this.p1x, cubicBezierEasing.p1x) == 0 && Float.compare(this.p1y, cubicBezierEasing.p1y) == 0 && Float.compare(this.p2x, cubicBezierEasing.p2x) == 0 && Float.compare(this.p2y, cubicBezierEasing.p2y) == 0;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.p1x) * 31) + Float.hashCode(this.p1y)) * 31) + Float.hashCode(this.p2x)) * 31) + Float.hashCode(this.p2y);
    }

    public String toString() {
        return "CubicBezierEasing(p1x=" + this.p1x + ", p1y=" + this.p1y + ", p2x=" + this.p2x + ", p2y=" + this.p2y + ")";
    }

    private final float getTForX(float t3) {
        float fCoerceAtMost = RangesKt.coerceAtMost(this.p1x, 0.95f);
        float fCoerceAtLeast = RangesKt.coerceAtLeast(this.p2x, 0.05f);
        int i2 = (t3 < 0.05f || ((double) t3) > 0.95d) ? 3 : 1;
        int i3 = i2 * 8;
        if (i3 < 0) {
            return t3;
        }
        float f3 = 1000.0f;
        int i5 = 0;
        float fCalcBezier = t3;
        while (true) {
            Companion companion = INSTANCE;
            float slope = companion.getSlope(fCalcBezier, fCoerceAtMost, fCoerceAtLeast);
            if (slope == 0.0f) {
                return fCalcBezier;
            }
            if (i5 > 2 && Math.abs(slope - f3) < 0.01d / ((double) i2)) {
                return fCalcBezier;
            }
            fCalcBezier -= (companion.calcBezier(fCalcBezier, fCoerceAtMost, fCoerceAtLeast) - t3) / slope;
            if (i5 == i3) {
                return fCalcBezier;
            }
            i5++;
            f3 = slope;
        }
    }

    @Override // com.alightcreative.app.motion.easing.Easing
    public Easing copyWithUpdatedHandle(String id, Vector2D position) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(position, "position");
        return Intrinsics.areEqual(id, "1") ? copy$default(this, RangesKt.coerceIn(position.getX(), 0.0f, 1.0f), position.getY(), 0.0f, 0.0f, 12, null) : Intrinsics.areEqual(id, "2") ? copy$default(this, 0.0f, 0.0f, RangesKt.coerceIn(position.getX(), 0.0f, 1.0f), position.getY(), 3, null) : this;
    }

    @Override // com.alightcreative.app.motion.easing.Easing
    public List<EasingHandle> getHandles() {
        return CollectionsKt.listOf((Object[]) new EasingHandle[]{new EasingHandle("1", new Vector2D(this.p1x, this.p1y), new Vector2D(0.0f, 0.0f), false, 0.0f, null, 56, null), new EasingHandle("2", new Vector2D(this.p2x, this.p2y), new Vector2D(1.0f, 1.0f), false, 0.0f, null, 56, null)});
    }

    public final float getP1x() {
        return this.p1x;
    }

    public final float getP1y() {
        return this.p1y;
    }

    public final float getP2x() {
        return this.p2x;
    }

    public final float getP2y() {
        return this.p2y;
    }

    @Override // com.alightcreative.app.motion.easing.Easing
    public float interpolate(float t3) {
        if (this.p1x == this.p1y && this.p2x == this.p2y) {
            return t3;
        }
        if (t3 >= 0.0f) {
            return INSTANCE.calcBezier(getTForX(t3), this.p1y, this.p2y);
        }
        Companion companion = INSTANCE;
        return t3 * ((companion.calcBezier(getTForX(0.01f), this.p1y, this.p2y) - companion.calcBezier(getTForX(0.0f), this.p1y, this.p2y)) / 0.01f);
    }

    @Override // com.alightcreative.app.motion.easing.Easing
    public String serializeToString() {
        return "cubicBezier " + this.p1x + " " + this.p1y + " " + this.p2x + " " + this.p2y;
    }

    @Override // com.alightcreative.app.motion.easing.SplittableEasing
    public Pair<SplittableEasing, SplittableEasing> split(float t3) {
        if (this.p1x == this.p1y && this.p2x == this.p2y) {
            return TuplesKt.to(this, this);
        }
        float tForX = getTForX(t3);
        List listListOf = CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(0.0f), Float.valueOf(this.p1x), Float.valueOf(this.p2x), Float.valueOf(1.0f)});
        List listListOf2 = CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(0.0f), Float.valueOf(this.p1y), Float.valueOf(this.p2y), Float.valueOf(1.0f)});
        Companion companion = INSTANCE;
        List listDeCasteljauIteration = companion.deCasteljauIteration(listListOf, tForX);
        List listDeCasteljauIteration2 = companion.deCasteljauIteration(listListOf2, tForX);
        List listDeCasteljauIteration3 = companion.deCasteljauIteration(listDeCasteljauIteration, tForX);
        List listDeCasteljauIteration4 = companion.deCasteljauIteration(listDeCasteljauIteration2, tForX);
        float fFloatValue = ((Number) CollectionsKt.single(companion.deCasteljauIteration(listDeCasteljauIteration3, tForX))).floatValue();
        float fFloatValue2 = ((Number) CollectionsKt.single(companion.deCasteljauIteration(listDeCasteljauIteration4, tForX))).floatValue();
        float f3 = 1;
        float f4 = f3 - fFloatValue;
        float f5 = f3 - fFloatValue2;
        return TuplesKt.to(new CubicBezierEasing(((Number) listDeCasteljauIteration.get(0)).floatValue() / fFloatValue, ((Number) listDeCasteljauIteration2.get(0)).floatValue() / fFloatValue2, ((Number) listDeCasteljauIteration3.get(0)).floatValue() / fFloatValue, ((Number) listDeCasteljauIteration4.get(0)).floatValue() / fFloatValue2), new CubicBezierEasing((((Number) listDeCasteljauIteration3.get(1)).floatValue() - fFloatValue) / f4, (((Number) listDeCasteljauIteration4.get(1)).floatValue() - fFloatValue2) / f5, (((Number) listDeCasteljauIteration.get(2)).floatValue() - fFloatValue) / f4, (((Number) listDeCasteljauIteration2.get(2)).floatValue() - fFloatValue2) / f5));
    }

    public CubicBezierEasing(float f3, float f4, float f5, float f6) {
        this.p1x = f3;
        this.p1y = f4;
        this.p2x = f5;
        this.p2y = f6;
    }
}
