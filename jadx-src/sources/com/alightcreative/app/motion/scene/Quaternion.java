package com.alightcreative.app.motion.scene;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0001,B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u0000J\u0006\u0010\u000f\u001a\u00020\u0003J\t\u0010\u0010\u001a\u00020\u0000H\u0086\u0002J\t\u0010\u0011\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0016H\u0086\u0002J\u0011\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0016H\u0086\u0002J\u000e\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0000J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0011\u0010\u0015\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u001bH\u0086\u0002J\b\u0010\"\u001a\u00020#H\u0016J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J1\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010)\u001a\u00020\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u001c\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\nR\u0011\u0010\u001e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\nR\u0011\u0010 \u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b!\u0010\n¨\u0006-"}, d2 = {"Lcom/alightcreative/app/motion/scene/Quaternion;", "", "x", "", "y", "z", "w", "<init>", "(DDDD)V", "getX", "()D", "getY", "getZ", "getW", "normalize", "length", "unaryPlus", "unaryMinus", "plus", InneractiveMediationNameConsts.OTHER, "minus", "times", "", TtmlNode.TAG_DIV, TtmlNode.TEXT_EMPHASIS_MARK_DOT, "isNaN", "", "Lcom/alightcreative/app/motion/scene/Vector3D;", "roll", "getRoll", "pitch", "getPitch", "yaw", "getYaw", "toString", "", "component1", "component2", "component3", "component4", "copy", "equals", "hashCode", "", "Companion", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Quaternion {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Quaternion IDENTITY = new Quaternion(0.0d, 0.0d, 0.0d, 1.0d);
    private final double w;
    private final double x;
    private final double y;
    private final double z;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nJ\u0016\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/alightcreative/app/motion/scene/Quaternion$Companion;", "", "<init>", "()V", "IDENTITY", "Lcom/alightcreative/app/motion/scene/Quaternion;", "getIDENTITY", "()Lcom/alightcreative/app/motion/scene/Quaternion;", "fromEulerAngles", "x", "", "y", "z", "rotateAxisAngle", "axis", "Lcom/alightcreative/app/motion/scene/Vector3D;", "degrees", "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Quaternion rotateAxisAngle(Vector3D axis, float degrees) {
            Intrinsics.checkNotNullParameter(axis, "axis");
            double d2 = ((((double) degrees) % 360.0d) * 3.141592653589793d) / 180.0d;
            double dSin = Math.sin(d2 / 2.0d);
            return new Quaternion(((double) axis.getX()) * dSin, ((double) axis.getY()) * dSin, ((double) axis.getZ()) * dSin, Math.cos(d2 / ((double) 2.0f))).normalize();
        }

        public final Quaternion getIDENTITY() {
            return Quaternion.IDENTITY;
        }

        public final Quaternion fromEulerAngles(double x2, double y2, double z2) {
            double d2 = x2 * 0.0174533d * 0.5d;
            double dCos = Math.cos(d2);
            double d4 = y2 * 0.0174533d * 0.5d;
            double dCos2 = Math.cos(d4);
            double d5 = 0.0174533d * z2 * 0.5d;
            double dCos3 = Math.cos(d5);
            double dSin = Math.sin(d2);
            double dSin2 = Math.sin(d4);
            double dSin3 = Math.sin(d5);
            double d6 = dSin * dCos2;
            double d7 = dCos * dSin2;
            double d8 = dCos * dCos2;
            double d9 = dSin * dSin2;
            return new Quaternion((d6 * dCos3) - (d7 * dSin3), (d7 * dCos3) + (d6 * dSin3), (d8 * dSin3) - (d9 * dCos3), (d8 * dCos3) + (d9 * dSin3));
        }
    }

    public static /* synthetic */ Quaternion copy$default(Quaternion quaternion, double d2, double d4, double d5, double d6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            d2 = quaternion.x;
        }
        double d7 = d2;
        if ((i2 & 2) != 0) {
            d4 = quaternion.y;
        }
        double d8 = d4;
        if ((i2 & 4) != 0) {
            d5 = quaternion.z;
        }
        return quaternion.copy(d7, d8, d5, (i2 & 8) != 0 ? quaternion.w : d6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getY() {
        return this.y;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getZ() {
        return this.z;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getW() {
        return this.w;
    }

    public final Quaternion copy(double x2, double y2, double z2, double w2) {
        return new Quaternion(x2, y2, z2, w2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Quaternion)) {
            return false;
        }
        Quaternion quaternion = (Quaternion) other;
        return Double.compare(this.x, quaternion.x) == 0 && Double.compare(this.y, quaternion.y) == 0 && Double.compare(this.z, quaternion.z) == 0 && Double.compare(this.w, quaternion.w) == 0;
    }

    public int hashCode() {
        return (((((Double.hashCode(this.x) * 31) + Double.hashCode(this.y)) * 31) + Double.hashCode(this.z)) * 31) + Double.hashCode(this.w);
    }

    public final Quaternion times(Quaternion other) {
        Intrinsics.checkNotNullParameter(other, "other");
        double d2 = this.w;
        double d4 = this.x;
        double d5 = this.y;
        double d6 = this.z;
        double d7 = other.w;
        double d8 = other.x;
        double d9 = other.y;
        double d10 = other.z;
        return new Quaternion((((d2 * d8) + (d4 * d7)) + (d5 * d10)) - (d6 * d9), ((d2 * d9) - (d4 * d10)) + (d5 * d7) + (d6 * d8), (((d2 * d10) + (d4 * d9)) - (d5 * d8)) + (d6 * d7), (((d2 * d7) - (d4 * d8)) - (d5 * d9)) - (d6 * d10));
    }

    public final Quaternion unaryPlus() {
        return this;
    }

    public final Quaternion div(float other) {
        double d2 = other;
        return new Quaternion(this.x / d2, this.y / d2, this.z / d2, this.w / d2);
    }

    public final double dot(Quaternion other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return (this.x * other.x) + (this.y * other.y) + (this.z * other.z) + (this.w * other.w);
    }

    public final double getPitch() {
        double d2 = this.w;
        double d4 = this.x;
        double d5 = this.y;
        return (Math.atan2(((d2 * d4) + (this.z * d5)) * 2.0d, 1.0d - (((d4 * d4) + (d5 * d5)) * 2.0d)) * 180.0d) / 3.141592653589793d;
    }

    public final double getRoll() {
        double d2 = this.x;
        double d4 = this.y;
        double d5 = this.w;
        double d6 = this.z;
        return (Math.atan2(((d2 * d4) + (d5 * d6)) * 2.0d, (((d5 * d5) + (d2 * d2)) - (d4 * d4)) - (d6 * d6)) * 180.0d) / 3.141592653589793d;
    }

    public final double getW() {
        return this.w;
    }

    public final double getX() {
        return this.x;
    }

    public final double getY() {
        return this.y;
    }

    public final double getYaw() {
        return (Math.asin(RangesKt.coerceIn(((double) (-2.0f)) * ((this.x * this.z) - (this.w * this.y)), -1.0d, 1.0d)) * 180.0d) / 3.141592653589793d;
    }

    public final double getZ() {
        return this.z;
    }

    public final boolean isNaN() {
        return Double.isNaN(this.x) || Double.isNaN(this.y) || Double.isNaN(this.z) || Double.isNaN(this.w);
    }

    public final Quaternion minus(Quaternion other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return new Quaternion(this.x - other.x, this.y - other.y, this.z - other.z, this.w - other.w);
    }

    public final Quaternion plus(Quaternion other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return new Quaternion(this.x + other.x, this.y + other.y, this.z + other.z, this.w + other.w);
    }

    public String toString() {
        String str = String.format(Locale.ROOT, "%.6f,%.6f,%.6f,%.6f", Arrays.copyOf(new Object[]{Double.valueOf(this.x), Double.valueOf(this.y), Double.valueOf(this.z), Double.valueOf(this.w)}, 4));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public final Quaternion unaryMinus() {
        return new Quaternion(-this.x, -this.y, -this.z, -this.w);
    }

    public Quaternion(double d2, double d4, double d5, double d6) {
        this.x = d2;
        this.y = d4;
        this.z = d5;
        this.w = d6;
    }

    public final double length() {
        return Math.sqrt(dot(this));
    }

    public final Quaternion normalize() {
        double length = length();
        if (length <= 0.0d) {
            return IDENTITY;
        }
        double d2 = ((double) 1.0f) / length;
        return new Quaternion(this.x * d2, this.y * d2, this.z * d2, this.w * d2);
    }

    public final Quaternion times(float other) {
        double d2 = other;
        return new Quaternion(this.x * d2, this.y * d2, this.z * d2, this.w * d2);
    }

    public final Vector3D times(Vector3D other) {
        Intrinsics.checkNotNullParameter(other, "other");
        double z2 = this.y * ((double) other.getZ());
        double y2 = other.getY();
        double d2 = this.z;
        double d4 = z2 - (y2 * d2);
        double x2 = d2 * ((double) other.getX());
        double z3 = other.getZ();
        double d5 = this.x;
        double d6 = x2 - (z3 * d5);
        double y3 = d5 * ((double) other.getY());
        double x3 = other.getX();
        double d7 = this.y;
        double d8 = y3 - (x3 * d7);
        double d9 = this.z;
        double d10 = (d7 * d8) - (d6 * d9);
        double d11 = this.x;
        return new Vector3D((float) (((double) other.getX()) + (((d4 * this.w) + d10) * 2.0d)), (float) (((double) other.getY()) + (((d6 * this.w) + ((d9 * d4) - (d8 * d11))) * 2.0d)), (float) (((double) other.getZ()) + (((d8 * this.w) + ((d11 * d6) - (d7 * d4))) * 2.0d)));
    }
}
