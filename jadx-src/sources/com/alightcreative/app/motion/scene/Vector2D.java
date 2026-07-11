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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000b\u001a\u00020\fH\u0016J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0011R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/alightcreative/app/motion/scene/Vector2D;", "Lcom/alightcreative/app/motion/scene/OptionalVector2D;", "Landroid/os/Parcelable;", "x", "", "y", "<init>", "(FF)V", "getX", "()F", "getY", "toString", "", "component1", "component2", "copy", "describeContents", "", "equals", "", InneractiveMediationNameConsts.OTHER, "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Vector2D extends OptionalVector2D implements Parcelable {
    public static final int $stable = 0;
    private final float x;
    private final float y;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<Vector2D> CREATOR = new Creator();
    private static final Vector2D ZERO = new Vector2D(0.0f, 0.0f);
    private static final Vector2D ONE = new Vector2D(1.0f, 1.0f);
    private static final Vector2D HALF = new Vector2D(0.5f, 0.5f);
    private static final Vector2D UNIT = GeometryKt.normalize(new Vector2D(1.0f, 1.0f));
    private static final Vector2D UNIT_X = new Vector2D(1.0f, 0.0f);
    private static final Vector2D UNIT_Y = new Vector2D(0.0f, 1.0f);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/alightcreative/app/motion/scene/Vector2D$Companion;", "", "<init>", "()V", "ZERO", "Lcom/alightcreative/app/motion/scene/Vector2D;", "getZERO", "()Lcom/alightcreative/app/motion/scene/Vector2D;", "ONE", "getONE", "HALF", "getHALF", "UNIT", "getUNIT", "UNIT_X", "getUNIT_X", "UNIT_Y", "getUNIT_Y", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Vector2D getHALF() {
            return Vector2D.HALF;
        }

        public final Vector2D getONE() {
            return Vector2D.ONE;
        }

        public final Vector2D getUNIT() {
            return Vector2D.UNIT;
        }

        public final Vector2D getUNIT_X() {
            return Vector2D.UNIT_X;
        }

        public final Vector2D getUNIT_Y() {
            return Vector2D.UNIT_Y;
        }

        public final Vector2D getZERO() {
            return Vector2D.ZERO;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Vector2D> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Vector2D createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Vector2D(parcel.readFloat(), parcel.readFloat());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Vector2D[] newArray(int i2) {
            return new Vector2D[i2];
        }
    }

    public Vector2D(float f3, float f4) {
        super(null);
        this.x = f3;
        this.y = f4;
    }

    public static /* synthetic */ Vector2D copy$default(Vector2D vector2D, float f3, float f4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f3 = vector2D.x;
        }
        if ((i2 & 2) != 0) {
            f4 = vector2D.y;
        }
        return vector2D.copy(f3, f4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getY() {
        return this.y;
    }

    public final Vector2D copy(float x2, float y2) {
        return new Vector2D(x2, y2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Vector2D)) {
            return false;
        }
        Vector2D vector2D = (Vector2D) other;
        return Float.compare(this.x, vector2D.x) == 0 && Float.compare(this.y, vector2D.y) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.x) * 31) + Float.hashCode(this.y);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeFloat(this.x);
        dest.writeFloat(this.y);
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public String toString() {
        String str = String.format(Locale.ROOT, "%.6f,%.6f", Arrays.copyOf(new Object[]{Float.valueOf(this.x), Float.valueOf(this.y)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
