package com.alightcreative.app.motion.scene.liveshape;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.app.motion.scene.Vector2D;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0012\u0010 \u001a\u00020!X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0012\u0010$\u001a\u00020\u001fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0012\u0010'\u001a\u00020\u0019X\u0096\u0005¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0012\u0010*\u001a\u00020\u0019X\u0096\u0005¢\u0006\u0006\u001a\u0004\b+\u0010)R\u0012\u0010,\u001a\u00020\u0019X\u0096\u0005¢\u0006\u0006\u001a\u0004\b-\u0010)R\u0012\u0010.\u001a\u00020\u001fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b/\u0010&R\u0012\u00100\u001a\u000201X\u0096\u0005¢\u0006\u0006\u001a\u0004\b2\u00103R\u0012\u00104\u001a\u000205X\u0096\u0005¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00068"}, d2 = {"Lcom/alightcreative/app/motion/scene/liveshape/PositionedShapeHandle;", "Lcom/alightcreative/app/motion/scene/liveshape/IShapeHandle;", "shapeHandle", "Lcom/alightcreative/app/motion/scene/liveshape/ShapeHandle;", "position", "Lcom/alightcreative/app/motion/scene/Vector2D;", "axis", "<init>", "(Lcom/alightcreative/app/motion/scene/liveshape/ShapeHandle;Lcom/alightcreative/app/motion/scene/Vector2D;Lcom/alightcreative/app/motion/scene/Vector2D;)V", "getShapeHandle", "()Lcom/alightcreative/app/motion/scene/liveshape/ShapeHandle;", "getPosition", "()Lcom/alightcreative/app/motion/scene/Vector2D;", "getAxis", "x", "", "getX", "()F", "y", "getY", "component1", "component2", "component3", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "toString", "", "icon", "Lcom/alightcreative/app/motion/scene/liveshape/ShapeHandleIcon;", "getIcon", "()Lcom/alightcreative/app/motion/scene/liveshape/ShapeHandleIcon;", "id", "getId", "()Ljava/lang/String;", "invertX", "getInvertX", "()Z", "invertY", "getInvertY", "lockRatio", "getLockRatio", "paramId", "getParamId", "style", "Lcom/alightcreative/app/motion/scene/liveshape/ShapeHandleStyle;", "getStyle", "()Lcom/alightcreative/app/motion/scene/liveshape/ShapeHandleStyle;", "type", "Lcom/alightcreative/app/motion/scene/liveshape/ShapeHandleType;", "getType", "()Lcom/alightcreative/app/motion/scene/liveshape/ShapeHandleType;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PositionedShapeHandle implements IShapeHandle {
    public static final int $stable = 0;
    private final Vector2D axis;
    private final Vector2D position;
    private final ShapeHandle shapeHandle;

    public static /* synthetic */ PositionedShapeHandle copy$default(PositionedShapeHandle positionedShapeHandle, ShapeHandle shapeHandle, Vector2D vector2D, Vector2D vector2D2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            shapeHandle = positionedShapeHandle.shapeHandle;
        }
        if ((i2 & 2) != 0) {
            vector2D = positionedShapeHandle.position;
        }
        if ((i2 & 4) != 0) {
            vector2D2 = positionedShapeHandle.axis;
        }
        return positionedShapeHandle.copy(shapeHandle, vector2D, vector2D2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ShapeHandle getShapeHandle() {
        return this.shapeHandle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Vector2D getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Vector2D getAxis() {
        return this.axis;
    }

    public final PositionedShapeHandle copy(ShapeHandle shapeHandle, Vector2D position, Vector2D axis) {
        Intrinsics.checkNotNullParameter(shapeHandle, "shapeHandle");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(axis, "axis");
        return new PositionedShapeHandle(shapeHandle, position, axis);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PositionedShapeHandle)) {
            return false;
        }
        PositionedShapeHandle positionedShapeHandle = (PositionedShapeHandle) other;
        return Intrinsics.areEqual(this.shapeHandle, positionedShapeHandle.shapeHandle) && Intrinsics.areEqual(this.position, positionedShapeHandle.position) && Intrinsics.areEqual(this.axis, positionedShapeHandle.axis);
    }

    @Override // com.alightcreative.app.motion.scene.liveshape.IShapeHandle
    public ShapeHandleIcon getIcon() {
        return this.shapeHandle.getIcon();
    }

    @Override // com.alightcreative.app.motion.scene.liveshape.IShapeHandle
    public String getId() {
        return this.shapeHandle.getId();
    }

    @Override // com.alightcreative.app.motion.scene.liveshape.IShapeHandle
    public boolean getInvertX() {
        return this.shapeHandle.getInvertX();
    }

    @Override // com.alightcreative.app.motion.scene.liveshape.IShapeHandle
    public boolean getInvertY() {
        return this.shapeHandle.getInvertY();
    }

    @Override // com.alightcreative.app.motion.scene.liveshape.IShapeHandle
    public boolean getLockRatio() {
        return this.shapeHandle.getLockRatio();
    }

    @Override // com.alightcreative.app.motion.scene.liveshape.IShapeHandle
    public String getParamId() {
        return this.shapeHandle.getParamId();
    }

    @Override // com.alightcreative.app.motion.scene.liveshape.IShapeHandle
    public ShapeHandleStyle getStyle() {
        return this.shapeHandle.getStyle();
    }

    @Override // com.alightcreative.app.motion.scene.liveshape.IShapeHandle
    public ShapeHandleType getType() {
        return this.shapeHandle.getType();
    }

    public int hashCode() {
        return (((this.shapeHandle.hashCode() * 31) + this.position.hashCode()) * 31) + this.axis.hashCode();
    }

    public String toString() {
        return "PositionedShapeHandle(shapeHandle=" + this.shapeHandle + ", position=" + this.position + ", axis=" + this.axis + ")";
    }

    public PositionedShapeHandle(ShapeHandle shapeHandle, Vector2D position, Vector2D axis) {
        Intrinsics.checkNotNullParameter(shapeHandle, "shapeHandle");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(axis, "axis");
        this.shapeHandle = shapeHandle;
        this.position = position;
        this.axis = axis;
    }

    public final Vector2D getAxis() {
        return this.axis;
    }

    public final Vector2D getPosition() {
        return this.position;
    }

    public final ShapeHandle getShapeHandle() {
        return this.shapeHandle;
    }

    public final float getX() {
        return this.position.getX();
    }

    public final float getY() {
        return this.position.getY();
    }
}
