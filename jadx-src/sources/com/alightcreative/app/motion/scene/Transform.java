package com.alightcreative.app.motion.scene;

import android.graphics.Matrix;
import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0001;Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\b2\u0006\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\bJ\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\t\u00100\u001a\u00020\bHÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u000eHÆ\u0003Jc\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020:HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001e\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u001dR\u001b\u0010\"\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b#\u0010\u001d¨\u0006<"}, d2 = {"Lcom/alightcreative/app/motion/scene/Transform;", "", "location", "Lcom/alightcreative/app/motion/scene/Vector3D;", "pivot", "Lcom/alightcreative/app/motion/scene/Vector2D;", "scale", "orientation", "", "size", "rotation", "opacity", "skew", "parentTransform", "Landroid/graphics/Matrix;", "<init>", "(Lcom/alightcreative/app/motion/scene/Vector3D;Lcom/alightcreative/app/motion/scene/Vector2D;Lcom/alightcreative/app/motion/scene/Vector2D;FFFFLcom/alightcreative/app/motion/scene/Vector2D;Landroid/graphics/Matrix;)V", "getLocation", "()Lcom/alightcreative/app/motion/scene/Vector3D;", "getPivot", "()Lcom/alightcreative/app/motion/scene/Vector2D;", "getScale", "getOrientation", "()F", "getSize", "getRotation", "getOpacity", "getSkew", "getParentTransform", "()Landroid/graphics/Matrix;", "matrix", "getMatrix", "matrix$delegate", "Lkotlin/Lazy;", "matrixReverseRotation", "getMatrixReverseRotation", "matrixReverseRotation$delegate", "getOptiMatrix", "scaleX", "scaleY", "offsetX", "offsetY", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "Companion", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Transform {
    private final Vector3D location;

    /* JADX INFO: renamed from: matrix$delegate, reason: from kotlin metadata */
    private final Lazy matrix;

    /* JADX INFO: renamed from: matrixReverseRotation$delegate, reason: from kotlin metadata */
    private final Lazy matrixReverseRotation;
    private final float opacity;
    private final float orientation;
    private final Matrix parentTransform;
    private final Vector2D pivot;
    private final float rotation;
    private final Vector2D scale;
    private final float size;
    private final Vector2D skew;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Transform IDENTITY = new Transform(null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 511, null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/alightcreative/app/motion/scene/Transform$Companion;", "", "<init>", "()V", "IDENTITY", "Lcom/alightcreative/app/motion/scene/Transform;", "getIDENTITY", "()Lcom/alightcreative/app/motion/scene/Transform;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Transform getIDENTITY() {
            return Transform.IDENTITY;
        }
    }

    public Transform() {
        this(null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 511, null);
    }

    public static /* synthetic */ Transform copy$default(Transform transform, Vector3D vector3D, Vector2D vector2D, Vector2D vector2D2, float f3, float f4, float f5, float f6, Vector2D vector2D3, Matrix matrix, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            vector3D = transform.location;
        }
        if ((i2 & 2) != 0) {
            vector2D = transform.pivot;
        }
        if ((i2 & 4) != 0) {
            vector2D2 = transform.scale;
        }
        if ((i2 & 8) != 0) {
            f3 = transform.orientation;
        }
        if ((i2 & 16) != 0) {
            f4 = transform.size;
        }
        if ((i2 & 32) != 0) {
            f5 = transform.rotation;
        }
        if ((i2 & 64) != 0) {
            f6 = transform.opacity;
        }
        if ((i2 & 128) != 0) {
            vector2D3 = transform.skew;
        }
        if ((i2 & 256) != 0) {
            matrix = transform.parentTransform;
        }
        Vector2D vector2D4 = vector2D3;
        Matrix matrix2 = matrix;
        float f7 = f5;
        float f8 = f6;
        float f9 = f4;
        Vector2D vector2D5 = vector2D2;
        return transform.copy(vector3D, vector2D, vector2D5, f3, f9, f7, f8, vector2D4, matrix2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Vector3D getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Vector2D getPivot() {
        return this.pivot;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Vector2D getScale() {
        return this.scale;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getOrientation() {
        return this.orientation;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getRotation() {
        return this.rotation;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final float getOpacity() {
        return this.opacity;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Vector2D getSkew() {
        return this.skew;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Matrix getParentTransform() {
        return this.parentTransform;
    }

    public final Transform copy(Vector3D location, Vector2D pivot, Vector2D scale, float orientation, float size, float rotation, float opacity, Vector2D skew, Matrix parentTransform) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(pivot, "pivot");
        Intrinsics.checkNotNullParameter(scale, "scale");
        Intrinsics.checkNotNullParameter(skew, "skew");
        Intrinsics.checkNotNullParameter(parentTransform, "parentTransform");
        return new Transform(location, pivot, scale, orientation, size, rotation, opacity, skew, parentTransform);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Transform)) {
            return false;
        }
        Transform transform = (Transform) other;
        return Intrinsics.areEqual(this.location, transform.location) && Intrinsics.areEqual(this.pivot, transform.pivot) && Intrinsics.areEqual(this.scale, transform.scale) && Float.compare(this.orientation, transform.orientation) == 0 && Float.compare(this.size, transform.size) == 0 && Float.compare(this.rotation, transform.rotation) == 0 && Float.compare(this.opacity, transform.opacity) == 0 && Intrinsics.areEqual(this.skew, transform.skew) && Intrinsics.areEqual(this.parentTransform, transform.parentTransform);
    }

    public int hashCode() {
        return (((((((((((((((this.location.hashCode() * 31) + this.pivot.hashCode()) * 31) + this.scale.hashCode()) * 31) + Float.hashCode(this.orientation)) * 31) + Float.hashCode(this.size)) * 31) + Float.hashCode(this.rotation)) * 31) + Float.hashCode(this.opacity)) * 31) + this.skew.hashCode()) * 31) + this.parentTransform.hashCode();
    }

    public String toString() {
        return "Transform(location=" + this.location + ", pivot=" + this.pivot + ", scale=" + this.scale + ", orientation=" + this.orientation + ", size=" + this.size + ", rotation=" + this.rotation + ", opacity=" + this.opacity + ", skew=" + this.skew + ", parentTransform=" + this.parentTransform + ")";
    }

    public Transform(Vector3D location, Vector2D pivot, Vector2D scale, float f3, float f4, float f5, float f6, Vector2D skew, Matrix parentTransform) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(pivot, "pivot");
        Intrinsics.checkNotNullParameter(scale, "scale");
        Intrinsics.checkNotNullParameter(skew, "skew");
        Intrinsics.checkNotNullParameter(parentTransform, "parentTransform");
        this.location = location;
        this.pivot = pivot;
        this.scale = scale;
        this.orientation = f3;
        this.size = f4;
        this.rotation = f5;
        this.opacity = f6;
        this.skew = skew;
        this.parentTransform = parentTransform;
        this.matrix = LazyKt.lazy(new Function0() { // from class: com.alightcreative.app.motion.scene.OA
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Transform.matrix_delegate$lambda$1(this.f45986n);
            }
        });
        this.matrixReverseRotation = LazyKt.lazy(new Function0() { // from class: com.alightcreative.app.motion.scene.Mo
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Transform.matrixReverseRotation_delegate$lambda$3(this.f45982n);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Matrix matrixReverseRotation_delegate$lambda$3(Transform transform) {
        Matrix matrix = new Matrix();
        matrix.preTranslate(transform.location.getX(), transform.location.getY());
        matrix.preTranslate(transform.pivot.getX(), transform.pivot.getY());
        matrix.preRotate(transform.rotation);
        matrix.preScale(transform.scale.getX(), transform.scale.getY());
        matrix.preSkew(transform.skew.getY(), transform.skew.getX());
        matrix.preTranslate(-transform.pivot.getX(), -transform.pivot.getY());
        matrix.preRotate(transform.orientation);
        float f3 = transform.size;
        matrix.preScale(f3, f3);
        GeometryKt.times(matrix, transform.parentTransform);
        return matrix;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Matrix matrix_delegate$lambda$1(Transform transform) {
        Matrix matrix = new Matrix();
        matrix.preTranslate(transform.location.getX(), transform.location.getY());
        matrix.preTranslate(transform.pivot.getX(), transform.pivot.getY());
        matrix.preRotate(transform.rotation);
        matrix.preScale(transform.scale.getX(), transform.scale.getY());
        matrix.preSkew(transform.skew.getX(), transform.skew.getY());
        matrix.preTranslate(-transform.pivot.getX(), -transform.pivot.getY());
        matrix.preRotate(transform.orientation);
        float f3 = transform.size;
        matrix.preScale(f3, f3);
        GeometryKt.times(matrix, transform.parentTransform);
        return matrix;
    }

    public final Vector3D getLocation() {
        return this.location;
    }

    public final Matrix getMatrix() {
        return (Matrix) this.matrix.getValue();
    }

    public final Matrix getMatrixReverseRotation() {
        return (Matrix) this.matrixReverseRotation.getValue();
    }

    public final float getOpacity() {
        return this.opacity;
    }

    public final Matrix getOptiMatrix(float scaleX, float scaleY, float offsetX, float offsetY) {
        Matrix matrix = new Matrix();
        matrix.preScale(scaleX, scaleY);
        matrix.preTranslate(offsetX, offsetY);
        matrix.preTranslate(this.location.getX(), this.location.getY());
        matrix.preTranslate(this.pivot.getX(), this.pivot.getY());
        matrix.preRotate(this.rotation);
        matrix.preScale(this.scale.getX(), this.scale.getY());
        matrix.preSkew(this.skew.getY(), this.skew.getX());
        matrix.preTranslate(-this.pivot.getX(), -this.pivot.getY());
        matrix.preRotate(this.orientation);
        float f3 = this.size;
        matrix.preScale(f3, f3);
        return GeometryKt.times(matrix, this.parentTransform);
    }

    public final float getOrientation() {
        return this.orientation;
    }

    public final Matrix getParentTransform() {
        return this.parentTransform;
    }

    public final Vector2D getPivot() {
        return this.pivot;
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final Vector2D getScale() {
        return this.scale;
    }

    public final float getSize() {
        return this.size;
    }

    public final Vector2D getSkew() {
        return this.skew;
    }

    public /* synthetic */ Transform(Vector3D vector3D, Vector2D vector2D, Vector2D vector2D2, float f3, float f4, float f5, float f6, Vector2D vector2D3, Matrix matrix, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Vector3D.INSTANCE.getZERO() : vector3D, (i2 & 2) != 0 ? Vector2D.INSTANCE.getZERO() : vector2D, (i2 & 4) != 0 ? Vector2D.INSTANCE.getONE() : vector2D2, (i2 & 8) != 0 ? 0.0f : f3, (i2 & 16) != 0 ? 1.0f : f4, (i2 & 32) != 0 ? 0.0f : f5, (i2 & 64) != 0 ? 1.0f : f6, (i2 & 128) != 0 ? Vector2D.INSTANCE.getZERO() : vector2D3, (i2 & 256) != 0 ? new Matrix() : matrix);
    }
}
