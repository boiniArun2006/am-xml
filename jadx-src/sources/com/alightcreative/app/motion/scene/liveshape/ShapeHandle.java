package com.alightcreative.app.motion.scene.liveshape;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\fHÆ\u0003J\t\u0010%\u001a\u00020\u000eHÆ\u0003JY\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010'\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0014\u0010\n\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006-"}, d2 = {"Lcom/alightcreative/app/motion/scene/liveshape/ShapeHandle;", "Lcom/alightcreative/app/motion/scene/liveshape/IShapeHandle;", "id", "", "paramId", "type", "Lcom/alightcreative/app/motion/scene/liveshape/ShapeHandleType;", "invertX", "", "invertY", "lockRatio", "style", "Lcom/alightcreative/app/motion/scene/liveshape/ShapeHandleStyle;", "icon", "Lcom/alightcreative/app/motion/scene/liveshape/ShapeHandleIcon;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/alightcreative/app/motion/scene/liveshape/ShapeHandleType;ZZZLcom/alightcreative/app/motion/scene/liveshape/ShapeHandleStyle;Lcom/alightcreative/app/motion/scene/liveshape/ShapeHandleIcon;)V", "getId", "()Ljava/lang/String;", "getParamId", "getType", "()Lcom/alightcreative/app/motion/scene/liveshape/ShapeHandleType;", "getInvertX", "()Z", "getInvertY", "getLockRatio", "getStyle", "()Lcom/alightcreative/app/motion/scene/liveshape/ShapeHandleStyle;", "getIcon", "()Lcom/alightcreative/app/motion/scene/liveshape/ShapeHandleIcon;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ShapeHandle implements IShapeHandle {
    public static final int $stable = 0;
    private final ShapeHandleIcon icon;
    private final String id;
    private final boolean invertX;
    private final boolean invertY;
    private final boolean lockRatio;
    private final String paramId;
    private final ShapeHandleStyle style;
    private final ShapeHandleType type;

    public static /* synthetic */ ShapeHandle copy$default(ShapeHandle shapeHandle, String str, String str2, ShapeHandleType shapeHandleType, boolean z2, boolean z3, boolean z4, ShapeHandleStyle shapeHandleStyle, ShapeHandleIcon shapeHandleIcon, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = shapeHandle.id;
        }
        if ((i2 & 2) != 0) {
            str2 = shapeHandle.paramId;
        }
        if ((i2 & 4) != 0) {
            shapeHandleType = shapeHandle.type;
        }
        if ((i2 & 8) != 0) {
            z2 = shapeHandle.invertX;
        }
        if ((i2 & 16) != 0) {
            z3 = shapeHandle.invertY;
        }
        if ((i2 & 32) != 0) {
            z4 = shapeHandle.lockRatio;
        }
        if ((i2 & 64) != 0) {
            shapeHandleStyle = shapeHandle.style;
        }
        if ((i2 & 128) != 0) {
            shapeHandleIcon = shapeHandle.icon;
        }
        ShapeHandleStyle shapeHandleStyle2 = shapeHandleStyle;
        ShapeHandleIcon shapeHandleIcon2 = shapeHandleIcon;
        boolean z5 = z3;
        boolean z6 = z4;
        return shapeHandle.copy(str, str2, shapeHandleType, z2, z5, z6, shapeHandleStyle2, shapeHandleIcon2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getParamId() {
        return this.paramId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ShapeHandleType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getInvertX() {
        return this.invertX;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getInvertY() {
        return this.invertY;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getLockRatio() {
        return this.lockRatio;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ShapeHandleStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final ShapeHandleIcon getIcon() {
        return this.icon;
    }

    public final ShapeHandle copy(String id, String paramId, ShapeHandleType type, boolean invertX, boolean invertY, boolean lockRatio, ShapeHandleStyle style, ShapeHandleIcon icon) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(paramId, "paramId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new ShapeHandle(id, paramId, type, invertX, invertY, lockRatio, style, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShapeHandle)) {
            return false;
        }
        ShapeHandle shapeHandle = (ShapeHandle) other;
        return Intrinsics.areEqual(this.id, shapeHandle.id) && Intrinsics.areEqual(this.paramId, shapeHandle.paramId) && this.type == shapeHandle.type && this.invertX == shapeHandle.invertX && this.invertY == shapeHandle.invertY && this.lockRatio == shapeHandle.lockRatio && this.style == shapeHandle.style && this.icon == shapeHandle.icon;
    }

    public int hashCode() {
        return (((((((((((((this.id.hashCode() * 31) + this.paramId.hashCode()) * 31) + this.type.hashCode()) * 31) + Boolean.hashCode(this.invertX)) * 31) + Boolean.hashCode(this.invertY)) * 31) + Boolean.hashCode(this.lockRatio)) * 31) + this.style.hashCode()) * 31) + this.icon.hashCode();
    }

    public String toString() {
        return "ShapeHandle(id=" + this.id + ", paramId=" + this.paramId + ", type=" + this.type + ", invertX=" + this.invertX + ", invertY=" + this.invertY + ", lockRatio=" + this.lockRatio + ", style=" + this.style + ", icon=" + this.icon + ")";
    }

    public ShapeHandle(String id, String paramId, ShapeHandleType type, boolean z2, boolean z3, boolean z4, ShapeHandleStyle style, ShapeHandleIcon icon) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(paramId, "paramId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.id = id;
        this.paramId = paramId;
        this.type = type;
        this.invertX = z2;
        this.invertY = z3;
        this.lockRatio = z4;
        this.style = style;
        this.icon = icon;
    }

    @Override // com.alightcreative.app.motion.scene.liveshape.IShapeHandle
    public ShapeHandleIcon getIcon() {
        return this.icon;
    }

    @Override // com.alightcreative.app.motion.scene.liveshape.IShapeHandle
    public String getId() {
        return this.id;
    }

    @Override // com.alightcreative.app.motion.scene.liveshape.IShapeHandle
    public boolean getInvertX() {
        return this.invertX;
    }

    @Override // com.alightcreative.app.motion.scene.liveshape.IShapeHandle
    public boolean getInvertY() {
        return this.invertY;
    }

    @Override // com.alightcreative.app.motion.scene.liveshape.IShapeHandle
    public boolean getLockRatio() {
        return this.lockRatio;
    }

    @Override // com.alightcreative.app.motion.scene.liveshape.IShapeHandle
    public String getParamId() {
        return this.paramId;
    }

    @Override // com.alightcreative.app.motion.scene.liveshape.IShapeHandle
    public ShapeHandleStyle getStyle() {
        return this.style;
    }

    @Override // com.alightcreative.app.motion.scene.liveshape.IShapeHandle
    public ShapeHandleType getType() {
        return this.type;
    }
}
