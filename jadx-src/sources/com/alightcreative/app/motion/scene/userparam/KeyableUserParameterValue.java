package com.alightcreative.app.motion.scene.userparam;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.app.motion.scene.Keyable;
import com.alightcreative.app.motion.scene.KeyableFloat;
import com.alightcreative.app.motion.scene.KeyableKt;
import com.alightcreative.app.motion.scene.KeyableQuaternion;
import com.alightcreative.app.motion.scene.KeyableSolidColor;
import com.alightcreative.app.motion.scene.KeyableVector2D;
import com.alightcreative.app.motion.scene.KeyableVector3D;
import com.alightcreative.app.motion.scene.KeyableVector4D;
import com.alightcreative.app.motion.scene.Quaternion;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.app.motion.scene.Vector3D;
import com.alightcreative.app.motion.scene.Vector4D;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.internal.ads_identifier.VR.wDgKoYAES;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aB\u0011\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001cB\u0011\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001d¢\u0006\u0004\b\u0019\u0010\u001eB\u0011\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001fB\u0011\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010 B\u0011\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010!B\u0011\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\"¢\u0006\u0004\b\u0019\u0010#B\u0011\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010$B\u0011\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010%B\u0011\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010&B\u0011\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020'¢\u0006\u0004\b\u0019\u0010(B\u0011\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010)B\u0011\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020*¢\u0006\u0004\b\u0019\u0010+B\u0011\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010,B\u0011\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020-¢\u0006\u0004\b\u0019\u0010.B\u0011\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020/¢\u0006\u0004\b\u0019\u00100B\u0011\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u00101J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\u000f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010E\u001a\u00020\bHÆ\u0003J\u000f\u0010F\u001a\b\u0012\u0004\u0012\u00020\n0\u0005HÆ\u0003J\u000f\u0010G\u001a\b\u0012\u0004\u0012\u00020\f0\u0005HÆ\u0003J\u000f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005HÆ\u0003J\u000f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005HÆ\u0003J\u000f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005HÆ\u0003J\t\u0010K\u001a\u00020\u0014HÆ\u0003J\t\u0010L\u001a\u00020\u0016HÆ\u0003J\t\u0010M\u001a\u00020\u0018HÆ\u0003J\u009b\u0001\u0010N\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00052\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00052\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018HÆ\u0001J\u0013\u0010O\u001a\u00020\u00142\b\u0010P\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Q\u001a\u00020\bHÖ\u0001J\t\u0010R\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b8\u00105R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u00105R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005¢\u0006\b\n\u0000\u001a\u0004\b:\u00105R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005¢\u0006\b\n\u0000\u001a\u0004\b;\u00105R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005¢\u0006\b\n\u0000\u001a\u0004\b<\u00105R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\bA\u0010B¨\u0006S"}, d2 = {"Lcom/alightcreative/app/motion/scene/userparam/KeyableUserParameterValue;", "", "dataType", "Lcom/alightcreative/app/motion/scene/userparam/DataType;", "floatValue", "Lcom/alightcreative/app/motion/scene/Keyable;", "", "intValue", "", "colorValue", "Lcom/alightcreative/app/motion/scene/SolidColor;", "vec2DValue", "Lcom/alightcreative/app/motion/scene/Vector2D;", "vec3DValue", "Lcom/alightcreative/app/motion/scene/Vector3D;", "vec4DValue", "Lcom/alightcreative/app/motion/scene/Vector4D;", "quatValue", "Lcom/alightcreative/app/motion/scene/Quaternion;", "booleanValue", "", "textureValue", "Landroid/net/Uri;", "stringValue", "", "<init>", "(Lcom/alightcreative/app/motion/scene/userparam/DataType;Lcom/alightcreative/app/motion/scene/Keyable;ILcom/alightcreative/app/motion/scene/Keyable;Lcom/alightcreative/app/motion/scene/Keyable;Lcom/alightcreative/app/motion/scene/Keyable;Lcom/alightcreative/app/motion/scene/Keyable;Lcom/alightcreative/app/motion/scene/Keyable;ZLandroid/net/Uri;Ljava/lang/String;)V", "value", "(F)V", "Lcom/alightcreative/app/motion/scene/KeyableFloat;", "(Lcom/alightcreative/app/motion/scene/KeyableFloat;)V", "(I)V", "(Lcom/alightcreative/app/motion/scene/SolidColor;)V", "(Lcom/alightcreative/app/motion/scene/Quaternion;)V", "Lcom/alightcreative/app/motion/scene/KeyableSolidColor;", "(Lcom/alightcreative/app/motion/scene/KeyableSolidColor;)V", "(Z)V", "(Landroid/net/Uri;)V", "(Lcom/alightcreative/app/motion/scene/Vector2D;)V", "Lcom/alightcreative/app/motion/scene/KeyableVector2D;", "(Lcom/alightcreative/app/motion/scene/KeyableVector2D;)V", "(Lcom/alightcreative/app/motion/scene/Vector3D;)V", "Lcom/alightcreative/app/motion/scene/KeyableVector3D;", "(Lcom/alightcreative/app/motion/scene/KeyableVector3D;)V", "(Lcom/alightcreative/app/motion/scene/Vector4D;)V", "Lcom/alightcreative/app/motion/scene/KeyableVector4D;", "(Lcom/alightcreative/app/motion/scene/KeyableVector4D;)V", "Lcom/alightcreative/app/motion/scene/KeyableQuaternion;", "(Lcom/alightcreative/app/motion/scene/KeyableQuaternion;)V", "(Ljava/lang/String;)V", "getDataType", "()Lcom/alightcreative/app/motion/scene/userparam/DataType;", "getFloatValue", "()Lcom/alightcreative/app/motion/scene/Keyable;", "getIntValue", "()I", "getColorValue", "getVec2DValue", "getVec3DValue", "getVec4DValue", "getQuatValue", "getBooleanValue", "()Z", "getTextureValue", "()Landroid/net/Uri;", "getStringValue", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", InneractiveMediationNameConsts.OTHER, "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class KeyableUserParameterValue {
    public static final int $stable = 8;
    private final boolean booleanValue;
    private final Keyable<SolidColor> colorValue;
    private final DataType dataType;
    private final Keyable<Float> floatValue;
    private final int intValue;
    private final Keyable<Quaternion> quatValue;
    private final String stringValue;
    private final Uri textureValue;
    private final Keyable<Vector2D> vec2DValue;
    private final Keyable<Vector3D> vec3DValue;
    private final Keyable<Vector4D> vec4DValue;

    public KeyableUserParameterValue(DataType dataType, Keyable<Float> floatValue, int i2, Keyable<SolidColor> colorValue, Keyable<Vector2D> vec2DValue, Keyable<Vector3D> vec3DValue, Keyable<Vector4D> vec4DValue, Keyable<Quaternion> quatValue, boolean z2, Uri textureValue, String stringValue) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        Intrinsics.checkNotNullParameter(floatValue, "floatValue");
        Intrinsics.checkNotNullParameter(colorValue, "colorValue");
        Intrinsics.checkNotNullParameter(vec2DValue, "vec2DValue");
        Intrinsics.checkNotNullParameter(vec3DValue, "vec3DValue");
        Intrinsics.checkNotNullParameter(vec4DValue, "vec4DValue");
        Intrinsics.checkNotNullParameter(quatValue, "quatValue");
        Intrinsics.checkNotNullParameter(textureValue, "textureValue");
        Intrinsics.checkNotNullParameter(stringValue, "stringValue");
        this.dataType = dataType;
        this.floatValue = floatValue;
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

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KeyableUserParameterValue copy$default(KeyableUserParameterValue keyableUserParameterValue, DataType dataType, Keyable keyable, int i2, Keyable keyable2, Keyable keyable3, Keyable keyable4, Keyable keyable5, Keyable keyable6, boolean z2, Uri uri, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            dataType = keyableUserParameterValue.dataType;
        }
        if ((i3 & 2) != 0) {
            keyable = keyableUserParameterValue.floatValue;
        }
        if ((i3 & 4) != 0) {
            i2 = keyableUserParameterValue.intValue;
        }
        if ((i3 & 8) != 0) {
            keyable2 = keyableUserParameterValue.colorValue;
        }
        if ((i3 & 16) != 0) {
            keyable3 = keyableUserParameterValue.vec2DValue;
        }
        if ((i3 & 32) != 0) {
            keyable4 = keyableUserParameterValue.vec3DValue;
        }
        if ((i3 & 64) != 0) {
            keyable5 = keyableUserParameterValue.vec4DValue;
        }
        if ((i3 & 128) != 0) {
            keyable6 = keyableUserParameterValue.quatValue;
        }
        if ((i3 & 256) != 0) {
            z2 = keyableUserParameterValue.booleanValue;
        }
        if ((i3 & 512) != 0) {
            uri = keyableUserParameterValue.textureValue;
        }
        if ((i3 & 1024) != 0) {
            str = keyableUserParameterValue.stringValue;
        }
        Uri uri2 = uri;
        String str2 = str;
        Keyable keyable7 = keyable6;
        boolean z3 = z2;
        Keyable keyable8 = keyable4;
        Keyable keyable9 = keyable5;
        Keyable keyable10 = keyable3;
        int i5 = i2;
        return keyableUserParameterValue.copy(dataType, keyable, i5, keyable2, keyable10, keyable8, keyable9, keyable7, z3, uri2, str2);
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

    public final Keyable<Float> component2() {
        return this.floatValue;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getIntValue() {
        return this.intValue;
    }

    public final Keyable<SolidColor> component4() {
        return this.colorValue;
    }

    public final Keyable<Vector2D> component5() {
        return this.vec2DValue;
    }

    public final Keyable<Vector3D> component6() {
        return this.vec3DValue;
    }

    public final Keyable<Vector4D> component7() {
        return this.vec4DValue;
    }

    public final Keyable<Quaternion> component8() {
        return this.quatValue;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getBooleanValue() {
        return this.booleanValue;
    }

    public final KeyableUserParameterValue copy(DataType dataType, Keyable<Float> floatValue, int intValue, Keyable<SolidColor> colorValue, Keyable<Vector2D> vec2DValue, Keyable<Vector3D> vec3DValue, Keyable<Vector4D> vec4DValue, Keyable<Quaternion> quatValue, boolean booleanValue, Uri textureValue, String stringValue) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        Intrinsics.checkNotNullParameter(floatValue, "floatValue");
        Intrinsics.checkNotNullParameter(colorValue, "colorValue");
        Intrinsics.checkNotNullParameter(vec2DValue, "vec2DValue");
        Intrinsics.checkNotNullParameter(vec3DValue, "vec3DValue");
        Intrinsics.checkNotNullParameter(vec4DValue, "vec4DValue");
        Intrinsics.checkNotNullParameter(quatValue, "quatValue");
        Intrinsics.checkNotNullParameter(textureValue, "textureValue");
        Intrinsics.checkNotNullParameter(stringValue, "stringValue");
        return new KeyableUserParameterValue(dataType, floatValue, intValue, colorValue, vec2DValue, vec3DValue, vec4DValue, quatValue, booleanValue, textureValue, stringValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KeyableUserParameterValue)) {
            return false;
        }
        KeyableUserParameterValue keyableUserParameterValue = (KeyableUserParameterValue) other;
        return this.dataType == keyableUserParameterValue.dataType && Intrinsics.areEqual(this.floatValue, keyableUserParameterValue.floatValue) && this.intValue == keyableUserParameterValue.intValue && Intrinsics.areEqual(this.colorValue, keyableUserParameterValue.colorValue) && Intrinsics.areEqual(this.vec2DValue, keyableUserParameterValue.vec2DValue) && Intrinsics.areEqual(this.vec3DValue, keyableUserParameterValue.vec3DValue) && Intrinsics.areEqual(this.vec4DValue, keyableUserParameterValue.vec4DValue) && Intrinsics.areEqual(this.quatValue, keyableUserParameterValue.quatValue) && this.booleanValue == keyableUserParameterValue.booleanValue && Intrinsics.areEqual(this.textureValue, keyableUserParameterValue.textureValue) && Intrinsics.areEqual(this.stringValue, keyableUserParameterValue.stringValue);
    }

    public int hashCode() {
        return (((((((((((((((((((this.dataType.hashCode() * 31) + this.floatValue.hashCode()) * 31) + Integer.hashCode(this.intValue)) * 31) + this.colorValue.hashCode()) * 31) + this.vec2DValue.hashCode()) * 31) + this.vec3DValue.hashCode()) * 31) + this.vec4DValue.hashCode()) * 31) + this.quatValue.hashCode()) * 31) + Boolean.hashCode(this.booleanValue)) * 31) + this.textureValue.hashCode()) * 31) + this.stringValue.hashCode();
    }

    public String toString() {
        return "KeyableUserParameterValue(dataType=" + this.dataType + ", floatValue=" + this.floatValue + ", intValue=" + this.intValue + ", colorValue=" + this.colorValue + ", vec2DValue=" + this.vec2DValue + ", vec3DValue=" + this.vec3DValue + ", vec4DValue=" + this.vec4DValue + ", quatValue=" + this.quatValue + ", booleanValue=" + this.booleanValue + ", textureValue=" + this.textureValue + ", stringValue=" + this.stringValue + ")";
    }

    public final boolean getBooleanValue() {
        return this.booleanValue;
    }

    public final Keyable<SolidColor> getColorValue() {
        return this.colorValue;
    }

    public final DataType getDataType() {
        return this.dataType;
    }

    public final Keyable<Float> getFloatValue() {
        return this.floatValue;
    }

    public final int getIntValue() {
        return this.intValue;
    }

    public final Keyable<Quaternion> getQuatValue() {
        return this.quatValue;
    }

    public final String getStringValue() {
        return this.stringValue;
    }

    public final Uri getTextureValue() {
        return this.textureValue;
    }

    public final Keyable<Vector2D> getVec2DValue() {
        return this.vec2DValue;
    }

    public final Keyable<Vector3D> getVec3DValue() {
        return this.vec3DValue;
    }

    public final Keyable<Vector4D> getVec4DValue() {
        return this.vec4DValue;
    }

    public /* synthetic */ KeyableUserParameterValue(DataType dataType, Keyable keyable, int i2, Keyable keyable2, Keyable keyable3, Keyable keyable4, Keyable keyable5, Keyable keyable6, boolean z2, Uri uri, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(dataType, (i3 & 2) != 0 ? KeyableKt.getKEYABLE_FLOAT_DEFAULT() : keyable, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? KeyableKt.getKEYABLE_SOLID_COLOR_DEFAULT() : keyable2, (i3 & 16) != 0 ? KeyableKt.getKEYABLE_VECTOR2D_DEFAULT() : keyable3, (i3 & 32) != 0 ? KeyableKt.getKEYABLE_VECTOR3D_DEFAULT() : keyable4, (i3 & 64) != 0 ? KeyableKt.getKEYABLE_VECTOR4D_DEFAULT() : keyable5, (i3 & 128) != 0 ? KeyableQuaternion.INSTANCE.getIDENTITY() : keyable6, (i3 & 256) == 0 ? z2 : false, (i3 & 512) != 0 ? Uri.EMPTY : uri, (i3 & 1024) != 0 ? "" : str);
    }

    public KeyableUserParameterValue(float f3) {
        this(DataType.FLOAT, KeyableKt.keyable(f3), 0, null, null, null, null, null, false, null, null, 2044, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KeyableUserParameterValue(KeyableFloat value) {
        this(DataType.FLOAT, value, 0, null, null, null, null, null, false, null, null, 2044, null);
        Intrinsics.checkNotNullParameter(value, "value");
    }

    public KeyableUserParameterValue(int i2) {
        this(DataType.INT, null, i2, null, null, null, null, null, false, null, null, 2042, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KeyableUserParameterValue(SolidColor value) {
        this(DataType.SOLID_COLOR, null, 0, KeyableKt.keyable(value), null, null, null, null, false, null, null, 2038, null);
        Intrinsics.checkNotNullParameter(value, "value");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KeyableUserParameterValue(Quaternion value) {
        this(DataType.QUAT, null, 0, null, null, null, null, KeyableKt.keyable(value), false, null, null, 1918, null);
        Intrinsics.checkNotNullParameter(value, "value");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KeyableUserParameterValue(KeyableSolidColor value) {
        this(DataType.SOLID_COLOR, null, 0, value, null, null, null, null, false, null, null, 2038, null);
        Intrinsics.checkNotNullParameter(value, "value");
    }

    public KeyableUserParameterValue(boolean z2) {
        this(DataType.BOOLEAN, null, 0, null, null, null, null, null, z2, null, null, 1790, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KeyableUserParameterValue(Uri value) {
        this(DataType.TEXTURE, null, 0, null, null, null, null, null, false, value, null, 1534, null);
        Intrinsics.checkNotNullParameter(value, "value");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KeyableUserParameterValue(Vector2D value) {
        this(DataType.VEC2, null, 0, null, KeyableKt.keyable(value), null, null, null, false, null, null, 2030, null);
        Intrinsics.checkNotNullParameter(value, "value");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KeyableUserParameterValue(KeyableVector2D value) {
        this(DataType.VEC2, null, 0, null, value, null, null, null, false, null, null, 2030, null);
        Intrinsics.checkNotNullParameter(value, "value");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KeyableUserParameterValue(Vector3D value) {
        this(DataType.VEC3, null, 0, null, null, KeyableKt.keyable(value), null, null, false, null, null, 2014, null);
        Intrinsics.checkNotNullParameter(value, "value");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KeyableUserParameterValue(KeyableVector3D value) {
        this(DataType.VEC3, null, 0, null, null, value, null, null, false, null, null, 2014, null);
        Intrinsics.checkNotNullParameter(value, "value");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KeyableUserParameterValue(Vector4D value) {
        this(DataType.VEC4, null, 0, null, null, null, KeyableKt.keyable(value), null, false, null, null, 1982, null);
        Intrinsics.checkNotNullParameter(value, "value");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KeyableUserParameterValue(KeyableVector4D value) {
        this(DataType.VEC4, null, 0, null, null, null, value, null, false, null, null, 1982, null);
        Intrinsics.checkNotNullParameter(value, "value");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KeyableUserParameterValue(KeyableQuaternion value) {
        this(DataType.QUAT, null, 0, null, null, null, null, value, false, null, null, 1918, null);
        Intrinsics.checkNotNullParameter(value, "value");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KeyableUserParameterValue(String str) {
        this(DataType.STRING, null, 0, null, null, null, null, null, false, null, str, 1022, null);
        Intrinsics.checkNotNullParameter(str, wDgKoYAES.AyGVDSpCDhkJDEm);
    }
}
