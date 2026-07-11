package com.alightcreative.app.motion.scene.userparam;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.app.motion.scene.ColorKt;
import com.alightcreative.app.motion.scene.GeometryKt;
import com.alightcreative.app.motion.scene.Quaternion;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.app.motion.scene.Vector3D;
import com.alightcreative.app.motion.scene.Vector4D;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b5\b\u0087\b\u0018\u0000 K2\u00020\u0001:\u0001KBs\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019B\u0011\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u001bB\u0011\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u001cB\u0011\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u001dB\u0011\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u001eB\u0011\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u001fB\u0011\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010 B\u0011\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010!B\u0011\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\"B\u0011\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010#B\u0011\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010$J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\t\u0010=\u001a\u00020\u0007HÆ\u0003J\t\u0010>\u001a\u00020\tHÆ\u0003J\t\u0010?\u001a\u00020\u000bHÆ\u0003J\t\u0010@\u001a\u00020\rHÆ\u0003J\t\u0010A\u001a\u00020\u000fHÆ\u0003J\t\u0010B\u001a\u00020\u0011HÆ\u0003J\t\u0010C\u001a\u00020\u0013HÆ\u0003J\t\u0010D\u001a\u00020\u0015HÆ\u0003J\t\u0010E\u001a\u00020\u0017HÆ\u0003Jw\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017HÆ\u0001J\u0013\u0010G\u001a\u00020\u00132\b\u0010H\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010I\u001a\u00020\u0007HÖ\u0001J\t\u0010J\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:¨\u0006L"}, d2 = {"Lcom/alightcreative/app/motion/scene/userparam/UserParameterValue;", "", "dataType", "Lcom/alightcreative/app/motion/scene/userparam/DataType;", "floatValue", "", "intValue", "", "colorValue", "Lcom/alightcreative/app/motion/scene/SolidColor;", "vec2DValue", "Lcom/alightcreative/app/motion/scene/Vector2D;", "vec3DValue", "Lcom/alightcreative/app/motion/scene/Vector3D;", "vec4DValue", "Lcom/alightcreative/app/motion/scene/Vector4D;", "quatValue", "Lcom/alightcreative/app/motion/scene/Quaternion;", "booleanValue", "", "textureValue", "Landroid/net/Uri;", "stringValue", "", "<init>", "(Lcom/alightcreative/app/motion/scene/userparam/DataType;FILcom/alightcreative/app/motion/scene/SolidColor;Lcom/alightcreative/app/motion/scene/Vector2D;Lcom/alightcreative/app/motion/scene/Vector3D;Lcom/alightcreative/app/motion/scene/Vector4D;Lcom/alightcreative/app/motion/scene/Quaternion;ZLandroid/net/Uri;Ljava/lang/String;)V", "value", "(F)V", "(I)V", "(Lcom/alightcreative/app/motion/scene/SolidColor;)V", "(Z)V", "(Landroid/net/Uri;)V", "(Lcom/alightcreative/app/motion/scene/Vector2D;)V", "(Lcom/alightcreative/app/motion/scene/Vector3D;)V", "(Lcom/alightcreative/app/motion/scene/Vector4D;)V", "(Lcom/alightcreative/app/motion/scene/Quaternion;)V", "(Ljava/lang/String;)V", "getDataType", "()Lcom/alightcreative/app/motion/scene/userparam/DataType;", "getFloatValue", "()F", "getIntValue", "()I", "getColorValue", "()Lcom/alightcreative/app/motion/scene/SolidColor;", "getVec2DValue", "()Lcom/alightcreative/app/motion/scene/Vector2D;", "getVec3DValue", "()Lcom/alightcreative/app/motion/scene/Vector3D;", "getVec4DValue", "()Lcom/alightcreative/app/motion/scene/Vector4D;", "getQuatValue", "()Lcom/alightcreative/app/motion/scene/Quaternion;", "getBooleanValue", "()Z", "getTextureValue", "()Landroid/net/Uri;", "getStringValue", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", InneractiveMediationNameConsts.OTHER, "hashCode", "toString", "Companion", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserParameterValue {
    private final boolean booleanValue;
    private final SolidColor colorValue;
    private final DataType dataType;
    private final float floatValue;
    private final int intValue;
    private final Quaternion quatValue;
    private final String stringValue;
    private final Uri textureValue;
    private final Vector2D vec2DValue;
    private final Vector3D vec3DValue;
    private final Vector4D vec4DValue;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final UserParameterValue NONE = new UserParameterValue(DataType.NONE, 0.0f, 0, null, null, null, null, null, false, null, null, 2046, null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/alightcreative/app/motion/scene/userparam/UserParameterValue$Companion;", "", "<init>", "()V", "NONE", "Lcom/alightcreative/app/motion/scene/userparam/UserParameterValue;", "getNONE", "()Lcom/alightcreative/app/motion/scene/userparam/UserParameterValue;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final UserParameterValue getNONE() {
            return UserParameterValue.NONE;
        }
    }

    public UserParameterValue(DataType dataType, float f3, int i2, SolidColor colorValue, Vector2D vec2DValue, Vector3D vec3DValue, Vector4D vec4DValue, Quaternion quatValue, boolean z2, Uri textureValue, String stringValue) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        Intrinsics.checkNotNullParameter(colorValue, "colorValue");
        Intrinsics.checkNotNullParameter(vec2DValue, "vec2DValue");
        Intrinsics.checkNotNullParameter(vec3DValue, "vec3DValue");
        Intrinsics.checkNotNullParameter(vec4DValue, "vec4DValue");
        Intrinsics.checkNotNullParameter(quatValue, "quatValue");
        Intrinsics.checkNotNullParameter(textureValue, "textureValue");
        Intrinsics.checkNotNullParameter(stringValue, "stringValue");
        this.dataType = dataType;
        this.floatValue = f3;
        this.intValue = i2;
        this.colorValue = colorValue;
        this.vec2DValue = vec2DValue;
        this.vec3DValue = vec3DValue;
        this.vec4DValue = vec4DValue;
        this.quatValue = quatValue;
        this.booleanValue = z2;
        this.textureValue = textureValue;
        this.stringValue = stringValue;
    }

    public static /* synthetic */ UserParameterValue copy$default(UserParameterValue userParameterValue, DataType dataType, float f3, int i2, SolidColor solidColor, Vector2D vector2D, Vector3D vector3D, Vector4D vector4D, Quaternion quaternion, boolean z2, Uri uri, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            dataType = userParameterValue.dataType;
        }
        if ((i3 & 2) != 0) {
            f3 = userParameterValue.floatValue;
        }
        if ((i3 & 4) != 0) {
            i2 = userParameterValue.intValue;
        }
        if ((i3 & 8) != 0) {
            solidColor = userParameterValue.colorValue;
        }
        if ((i3 & 16) != 0) {
            vector2D = userParameterValue.vec2DValue;
        }
        if ((i3 & 32) != 0) {
            vector3D = userParameterValue.vec3DValue;
        }
        if ((i3 & 64) != 0) {
            vector4D = userParameterValue.vec4DValue;
        }
        if ((i3 & 128) != 0) {
            quaternion = userParameterValue.quatValue;
        }
        if ((i3 & 256) != 0) {
            z2 = userParameterValue.booleanValue;
        }
        if ((i3 & 512) != 0) {
            uri = userParameterValue.textureValue;
        }
        if ((i3 & 1024) != 0) {
            str = userParameterValue.stringValue;
        }
        Uri uri2 = uri;
        String str2 = str;
        Quaternion quaternion2 = quaternion;
        boolean z3 = z2;
        Vector3D vector3D2 = vector3D;
        Vector4D vector4D2 = vector4D;
        Vector2D vector2D2 = vector2D;
        int i5 = i2;
        return userParameterValue.copy(dataType, f3, i5, solidColor, vector2D2, vector3D2, vector4D2, quaternion2, z3, uri2, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DataType getDataType() {
        return this.dataType;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Uri getTextureValue() {
        return this.textureValue;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getStringValue() {
        return this.stringValue;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getFloatValue() {
        return this.floatValue;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getIntValue() {
        return this.intValue;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SolidColor getColorValue() {
        return this.colorValue;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Vector2D getVec2DValue() {
        return this.vec2DValue;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Vector3D getVec3DValue() {
        return this.vec3DValue;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Vector4D getVec4DValue() {
        return this.vec4DValue;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Quaternion getQuatValue() {
        return this.quatValue;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getBooleanValue() {
        return this.booleanValue;
    }

    public final UserParameterValue copy(DataType dataType, float floatValue, int intValue, SolidColor colorValue, Vector2D vec2DValue, Vector3D vec3DValue, Vector4D vec4DValue, Quaternion quatValue, boolean booleanValue, Uri textureValue, String stringValue) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        Intrinsics.checkNotNullParameter(colorValue, "colorValue");
        Intrinsics.checkNotNullParameter(vec2DValue, "vec2DValue");
        Intrinsics.checkNotNullParameter(vec3DValue, "vec3DValue");
        Intrinsics.checkNotNullParameter(vec4DValue, "vec4DValue");
        Intrinsics.checkNotNullParameter(quatValue, "quatValue");
        Intrinsics.checkNotNullParameter(textureValue, "textureValue");
        Intrinsics.checkNotNullParameter(stringValue, "stringValue");
        return new UserParameterValue(dataType, floatValue, intValue, colorValue, vec2DValue, vec3DValue, vec4DValue, quatValue, booleanValue, textureValue, stringValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserParameterValue)) {
            return false;
        }
        UserParameterValue userParameterValue = (UserParameterValue) other;
        return this.dataType == userParameterValue.dataType && Float.compare(this.floatValue, userParameterValue.floatValue) == 0 && this.intValue == userParameterValue.intValue && Intrinsics.areEqual(this.colorValue, userParameterValue.colorValue) && Intrinsics.areEqual(this.vec2DValue, userParameterValue.vec2DValue) && Intrinsics.areEqual(this.vec3DValue, userParameterValue.vec3DValue) && Intrinsics.areEqual(this.vec4DValue, userParameterValue.vec4DValue) && Intrinsics.areEqual(this.quatValue, userParameterValue.quatValue) && this.booleanValue == userParameterValue.booleanValue && Intrinsics.areEqual(this.textureValue, userParameterValue.textureValue) && Intrinsics.areEqual(this.stringValue, userParameterValue.stringValue);
    }

    public int hashCode() {
        return (((((((((((((((((((this.dataType.hashCode() * 31) + Float.hashCode(this.floatValue)) * 31) + Integer.hashCode(this.intValue)) * 31) + this.colorValue.hashCode()) * 31) + this.vec2DValue.hashCode()) * 31) + this.vec3DValue.hashCode()) * 31) + this.vec4DValue.hashCode()) * 31) + this.quatValue.hashCode()) * 31) + Boolean.hashCode(this.booleanValue)) * 31) + this.textureValue.hashCode()) * 31) + this.stringValue.hashCode();
    }

    public String toString() {
        return "UserParameterValue(dataType=" + this.dataType + ", floatValue=" + this.floatValue + ", intValue=" + this.intValue + ", colorValue=" + this.colorValue + ", vec2DValue=" + this.vec2DValue + ", vec3DValue=" + this.vec3DValue + ", vec4DValue=" + this.vec4DValue + ", quatValue=" + this.quatValue + ", booleanValue=" + this.booleanValue + ", textureValue=" + this.textureValue + ", stringValue=" + this.stringValue + ")";
    }

    public final boolean getBooleanValue() {
        return this.booleanValue;
    }

    public final SolidColor getColorValue() {
        return this.colorValue;
    }

    public final DataType getDataType() {
        return this.dataType;
    }

    public final float getFloatValue() {
        return this.floatValue;
    }

    public final int getIntValue() {
        return this.intValue;
    }

    public final Quaternion getQuatValue() {
        return this.quatValue;
    }

    public final String getStringValue() {
        return this.stringValue;
    }

    public final Uri getTextureValue() {
        return this.textureValue;
    }

    public final Vector2D getVec2DValue() {
        return this.vec2DValue;
    }

    public final Vector3D getVec3DValue() {
        return this.vec3DValue;
    }

    public final Vector4D getVec4DValue() {
        return this.vec4DValue;
    }

    public /* synthetic */ UserParameterValue(DataType dataType, float f3, int i2, SolidColor solidColor, Vector2D vector2D, Vector3D vector3D, Vector4D vector4D, Quaternion quaternion, boolean z2, Uri uri, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(dataType, (i3 & 2) != 0 ? 0.0f : f3, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? ColorKt.SolidColor() : solidColor, (i3 & 16) != 0 ? GeometryKt.Vector2D() : vector2D, (i3 & 32) != 0 ? GeometryKt.Vector3D() : vector3D, (i3 & 64) != 0 ? GeometryKt.Vector4D() : vector4D, (i3 & 128) != 0 ? Quaternion.INSTANCE.getIDENTITY() : quaternion, (i3 & 256) == 0 ? z2 : false, (i3 & 512) != 0 ? Uri.EMPTY : uri, (i3 & 1024) != 0 ? "" : str);
    }

    public UserParameterValue(float f3) {
        this(DataType.FLOAT, f3, 0, null, null, null, null, null, false, null, null, 2044, null);
    }

    public UserParameterValue(int i2) {
        this(DataType.INT, 0.0f, i2, null, null, null, null, null, false, null, null, 2042, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UserParameterValue(SolidColor value) {
        this(DataType.SOLID_COLOR, 0.0f, 0, value, null, null, null, null, false, null, null, 2038, null);
        Intrinsics.checkNotNullParameter(value, "value");
    }

    public UserParameterValue(boolean z2) {
        this(DataType.BOOLEAN, 0.0f, 0, null, null, null, null, null, z2, null, null, 1790, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UserParameterValue(Uri value) {
        this(DataType.TEXTURE, 0.0f, 0, null, null, null, null, null, false, value, null, 1534, null);
        Intrinsics.checkNotNullParameter(value, "value");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UserParameterValue(Vector2D value) {
        this(DataType.VEC2, 0.0f, 0, null, value, null, null, null, false, null, null, 2030, null);
        Intrinsics.checkNotNullParameter(value, "value");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UserParameterValue(Vector3D value) {
        this(DataType.VEC3, 0.0f, 0, null, null, value, null, null, false, null, null, 2014, null);
        Intrinsics.checkNotNullParameter(value, "value");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UserParameterValue(Vector4D value) {
        this(DataType.VEC4, 0.0f, 0, null, null, null, value, null, false, null, null, 1982, null);
        Intrinsics.checkNotNullParameter(value, "value");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UserParameterValue(Quaternion value) {
        this(DataType.QUAT, 0.0f, 0, null, null, null, null, value, false, null, null, 1918, null);
        Intrinsics.checkNotNullParameter(value, "value");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UserParameterValue(String value) {
        this(DataType.STRING, 0.0f, 0, null, null, null, null, null, false, null, value, 1022, null);
        Intrinsics.checkNotNullParameter(value, "value");
    }
}
