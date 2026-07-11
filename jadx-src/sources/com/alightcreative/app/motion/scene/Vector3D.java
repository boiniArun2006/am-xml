package com.alightcreative.app.motion.scene;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0014R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006 "}, d2 = {"Lcom/alightcreative/app/motion/scene/Vector3D;", "Lcom/alightcreative/app/motion/scene/OptionalVector3D;", "Landroid/os/Parcelable;", "x", "", "y", "z", "<init>", "(FFF)V", "getX", "()F", "getY", "getZ", "toString", "", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", InneractiveMediationNameConsts.OTHER, "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Vector3D extends OptionalVector3D implements Parcelable {
    public static final int $stable = 0;
    private final float x;
    private final float y;
    private final float z;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<Vector3D> CREATOR = new Creator();
    private static final Vector3D ZERO = new Vector3D(0.0f, 0.0f, 0.0f);
    private static final Vector3D ONE = new Vector3D(1.0f, 1.0f, 1.0f);
    private static final Vector3D HALF = new Vector3D(0.5f, 0.5f, 0.5f);
    private static final Vector3D UNIT = GeometryKt.normalize(new Vector3D(1.0f, 1.0f, 1.0f));
    private static final Vector3D UNIT_X = new Vector3D(1.0f, 0.0f, 0.0f);
    private static final Vector3D UNIT_Y = new Vector3D(0.0f, 1.0f, 0.0f);
    private static final Vector3D UNIT_Z = new Vector3D(0.0f, 0.0f, 1.0f);
    private static final Vector3D UNIT_MINUS_X = new Vector3D(-1.0f, 0.0f, 0.0f);
    private static final Vector3D UNIT_MINUS_Y = new Vector3D(0.0f, -1.0f, 0.0f);
    private static final Vector3D UNIT_MINUS_Z = new Vector3D(0.0f, 0.0f, -1.0f);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/alightcreative/app/motion/scene/Vector3D$Companion;", "", "<init>", "()V", "ZERO", "Lcom/alightcreative/app/motion/scene/Vector3D;", "getZERO", "()Lcom/alightcreative/app/motion/scene/Vector3D;", "ONE", "getONE", "HALF", "getHALF", "UNIT", "getUNIT", "UNIT_X", "getUNIT_X", "UNIT_Y", "getUNIT_Y", "UNIT_Z", "getUNIT_Z", "UNIT_MINUS_X", "getUNIT_MINUS_X", "UNIT_MINUS_Y", "getUNIT_MINUS_Y", "UNIT_MINUS_Z", "getUNIT_MINUS_Z", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Vector3D getHALF() {
            return Vector3D.HALF;
        }

        public final Vector3D getONE() {
            return Vector3D.ONE;
        }

        public final Vector3D getUNIT() {
            return Vector3D.UNIT;
        }

        public final Vector3D getUNIT_MINUS_X() {
            return Vector3D.UNIT_MINUS_X;
        }

        public final Vector3D getUNIT_MINUS_Y() {
            return Vector3D.UNIT_MINUS_Y;
        }

        public final Vector3D getUNIT_MINUS_Z() {
            return Vector3D.UNIT_MINUS_Z;
        }

        public final Vector3D getUNIT_X() {
            return Vector3D.UNIT_X;
        }

        public final Vector3D getUNIT_Y() {
            return Vector3D.UNIT_Y;
        }

        public final Vector3D getUNIT_Z() {
            return Vector3D.UNIT_Z;
        }

        public final Vector3D getZERO() {
            return Vector3D.ZERO;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Vector3D> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Vector3D createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Vector3D(parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Vector3D[] newArray(int i2) {
            return new Vector3D[i2];
        }
    }

    public Vector3D(float f3, float f4, float f5) {
        super(null);
        this.x = f3;
        this.y = f4;
        this.z = f5;
    }

    public static /* synthetic */ Vector3D copy$default(Vector3D vector3D, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f3 = vector3D.x;
        }
        if ((i2 & 2) != 0) {
            f4 = vector3D.y;
        }
        if ((i2 & 4) != 0) {
            f5 = vector3D.z;
        }
        return vector3D.copy(f3, f4, f5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getY() {
        return this.y;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getZ() {
        return this.z;
    }

    public final Vector3D copy(float x2, float y2, float z2) {
        return new Vector3D(x2, y2, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Vector3D)) {
            return false;
        }
        Vector3D vector3D = (Vector3D) other;
        return Float.compare(this.x, vector3D.x) == 0 && Float.compare(this.y, vector3D.y) == 0 && Float.compare(this.z, vector3D.z) == 0;
    }

    public int hashCode() {
        return (((Float.hashCode(this.x) * 31) + Float.hashCode(this.y)) * 31) + Float.hashCode(this.z);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeFloat(this.x);
        dest.writeFloat(this.y);
        dest.writeFloat(this.z);
    }

    public /* synthetic */ Vector3D(float f3, float f4, float f5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f3, f4, (i2 & 4) != 0 ? 0.0f : f5);
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public final float getZ() {
        return this.z;
    }

    public String toString() {
        String str = String.format(Locale.ROOT, "%.6f,%.6f,%.6f", Arrays.copyOf(new Object[]{Float.valueOf(this.x), Float.valueOf(this.y), Float.valueOf(this.z)}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
