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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\"B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0017R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006#"}, d2 = {"Lcom/alightcreative/app/motion/scene/Vector4D;", "Lcom/alightcreative/app/motion/scene/OptionalVector4D;", "Landroid/os/Parcelable;", "x", "", "y", "z", "w", "<init>", "(FFFF)V", "getX", "()F", "getY", "getZ", "getW", "toString", "", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", InneractiveMediationNameConsts.OTHER, "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Vector4D extends OptionalVector4D implements Parcelable {
    public static final int $stable = 0;
    private final float w;
    private final float x;
    private final float y;
    private final float z;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<Vector4D> CREATOR = new Creator();
    private static final Vector4D ZERO = new Vector4D(0.0f, 0.0f, 0.0f, 0.0f);
    private static final Vector4D ONE = new Vector4D(1.0f, 1.0f, 1.0f, 1.0f);
    private static final Vector4D HALF = new Vector4D(0.5f, 0.5f, 0.5f, 0.5f);
    private static final Vector4D UNIT = GeometryKt.normalize(new Vector4D(1.0f, 1.0f, 1.0f, 1.0f));
    private static final Vector4D UNIT_X = new Vector4D(1.0f, 0.0f, 0.0f, 0.0f);
    private static final Vector4D UNIT_Y = new Vector4D(0.0f, 1.0f, 0.0f, 0.0f);
    private static final Vector4D UNIT_Z = new Vector4D(0.0f, 0.0f, 1.0f, 0.0f);
    private static final Vector4D UNIT_W = new Vector4D(0.0f, 0.0f, 0.0f, 1.0f);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/alightcreative/app/motion/scene/Vector4D$Companion;", "", "<init>", "()V", "ZERO", "Lcom/alightcreative/app/motion/scene/Vector4D;", "getZERO", "()Lcom/alightcreative/app/motion/scene/Vector4D;", "ONE", "getONE", "HALF", "getHALF", "UNIT", "getUNIT", "UNIT_X", "getUNIT_X", "UNIT_Y", "getUNIT_Y", "UNIT_Z", "getUNIT_Z", "UNIT_W", "getUNIT_W", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Vector4D getHALF() {
            return Vector4D.HALF;
        }

        public final Vector4D getONE() {
            return Vector4D.ONE;
        }

        public final Vector4D getUNIT() {
            return Vector4D.UNIT;
        }

        public final Vector4D getUNIT_W() {
            return Vector4D.UNIT_W;
        }

        public final Vector4D getUNIT_X() {
            return Vector4D.UNIT_X;
        }

        public final Vector4D getUNIT_Y() {
            return Vector4D.UNIT_Y;
        }

        public final Vector4D getUNIT_Z() {
            return Vector4D.UNIT_Z;
        }

        public final Vector4D getZERO() {
            return Vector4D.ZERO;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Vector4D> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Vector4D createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Vector4D(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Vector4D[] newArray(int i2) {
            return new Vector4D[i2];
        }
    }

    public Vector4D(float f3, float f4, float f5, float f6) {
        super(null);
        this.x = f3;
        this.y = f4;
        this.z = f5;
        this.w = f6;
    }

    public static /* synthetic */ Vector4D copy$default(Vector4D vector4D, float f3, float f4, float f5, float f6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f3 = vector4D.x;
        }
        if ((i2 & 2) != 0) {
            f4 = vector4D.y;
        }
        if ((i2 & 4) != 0) {
            f5 = vector4D.z;
        }
        if ((i2 & 8) != 0) {
            f6 = vector4D.w;
        }
        return vector4D.copy(f3, f4, f5, f6);
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

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getW() {
        return this.w;
    }

    public final Vector4D copy(float x2, float y2, float z2, float w2) {
        return new Vector4D(x2, y2, z2, w2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Vector4D)) {
            return false;
        }
        Vector4D vector4D = (Vector4D) other;
        return Float.compare(this.x, vector4D.x) == 0 && Float.compare(this.y, vector4D.y) == 0 && Float.compare(this.z, vector4D.z) == 0 && Float.compare(this.w, vector4D.w) == 0;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.x) * 31) + Float.hashCode(this.y)) * 31) + Float.hashCode(this.z)) * 31) + Float.hashCode(this.w);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeFloat(this.x);
        dest.writeFloat(this.y);
        dest.writeFloat(this.z);
        dest.writeFloat(this.w);
    }

    public final float getW() {
        return this.w;
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
        String str = String.format(Locale.ROOT, "%.6f,%.6f,%.6f,%.6f", Arrays.copyOf(new Object[]{Float.valueOf(this.x), Float.valueOf(this.y), Float.valueOf(this.z), Float.valueOf(this.w)}, 4));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
