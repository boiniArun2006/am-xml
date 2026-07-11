package com.alightcreative.app.motion.scene;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 12\u00020\u0001:\u00011Bk\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\rHÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003Jm\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0005HÆ\u0001J\u0013\u0010+\u001a\u00020\u00072\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u000200HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015¨\u00062"}, d2 = {"Lcom/alightcreative/app/motion/scene/CameraProperties;", "", "type", "Lcom/alightcreative/app/motion/scene/CameraType;", "fov", "Lcom/alightcreative/app/motion/scene/KeyableFloat;", "focusBlurEnabled", "", "focusDistance", "focusDepthOfField", "focusBlurStrength", "fogEnabled", "fogColor", "Lcom/alightcreative/app/motion/scene/KeyableSolidColor;", "fogNearZ", "fogFarZ", "<init>", "(Lcom/alightcreative/app/motion/scene/CameraType;Lcom/alightcreative/app/motion/scene/KeyableFloat;ZLcom/alightcreative/app/motion/scene/KeyableFloat;Lcom/alightcreative/app/motion/scene/KeyableFloat;Lcom/alightcreative/app/motion/scene/KeyableFloat;ZLcom/alightcreative/app/motion/scene/KeyableSolidColor;Lcom/alightcreative/app/motion/scene/KeyableFloat;Lcom/alightcreative/app/motion/scene/KeyableFloat;)V", "getType", "()Lcom/alightcreative/app/motion/scene/CameraType;", "getFov", "()Lcom/alightcreative/app/motion/scene/KeyableFloat;", "getFocusBlurEnabled", "()Z", "getFocusDistance", "getFocusDepthOfField", "getFocusBlurStrength", "getFogEnabled", "getFogColor", "()Lcom/alightcreative/app/motion/scene/KeyableSolidColor;", "getFogNearZ", "getFogFarZ", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "Companion", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CameraProperties {
    private final boolean focusBlurEnabled;
    private final KeyableFloat focusBlurStrength;
    private final KeyableFloat focusDepthOfField;
    private final KeyableFloat focusDistance;
    private final KeyableSolidColor fogColor;
    private final boolean fogEnabled;
    private final KeyableFloat fogFarZ;
    private final KeyableFloat fogNearZ;
    private final KeyableFloat fov;
    private final CameraType type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final CameraProperties DEFAULT = new CameraProperties(null, null, false, null, null, null, false, null, null, null, 1023, null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/alightcreative/app/motion/scene/CameraProperties$Companion;", "", "<init>", "()V", "DEFAULT", "Lcom/alightcreative/app/motion/scene/CameraProperties;", "getDEFAULT", "()Lcom/alightcreative/app/motion/scene/CameraProperties;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CameraProperties getDEFAULT() {
            return CameraProperties.DEFAULT;
        }
    }

    public CameraProperties() {
        this(null, null, false, null, null, null, false, null, null, null, 1023, null);
    }

    public static /* synthetic */ CameraProperties copy$default(CameraProperties cameraProperties, CameraType cameraType, KeyableFloat keyableFloat, boolean z2, KeyableFloat keyableFloat2, KeyableFloat keyableFloat3, KeyableFloat keyableFloat4, boolean z3, KeyableSolidColor keyableSolidColor, KeyableFloat keyableFloat5, KeyableFloat keyableFloat6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cameraType = cameraProperties.type;
        }
        if ((i2 & 2) != 0) {
            keyableFloat = cameraProperties.fov;
        }
        if ((i2 & 4) != 0) {
            z2 = cameraProperties.focusBlurEnabled;
        }
        if ((i2 & 8) != 0) {
            keyableFloat2 = cameraProperties.focusDistance;
        }
        if ((i2 & 16) != 0) {
            keyableFloat3 = cameraProperties.focusDepthOfField;
        }
        if ((i2 & 32) != 0) {
            keyableFloat4 = cameraProperties.focusBlurStrength;
        }
        if ((i2 & 64) != 0) {
            z3 = cameraProperties.fogEnabled;
        }
        if ((i2 & 128) != 0) {
            keyableSolidColor = cameraProperties.fogColor;
        }
        if ((i2 & 256) != 0) {
            keyableFloat5 = cameraProperties.fogNearZ;
        }
        if ((i2 & 512) != 0) {
            keyableFloat6 = cameraProperties.fogFarZ;
        }
        KeyableFloat keyableFloat7 = keyableFloat5;
        KeyableFloat keyableFloat8 = keyableFloat6;
        boolean z4 = z3;
        KeyableSolidColor keyableSolidColor2 = keyableSolidColor;
        KeyableFloat keyableFloat9 = keyableFloat3;
        KeyableFloat keyableFloat10 = keyableFloat4;
        return cameraProperties.copy(cameraType, keyableFloat, z2, keyableFloat2, keyableFloat9, keyableFloat10, z4, keyableSolidColor2, keyableFloat7, keyableFloat8);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CameraType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final KeyableFloat getFogFarZ() {
        return this.fogFarZ;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final KeyableFloat getFov() {
        return this.fov;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getFocusBlurEnabled() {
        return this.focusBlurEnabled;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final KeyableFloat getFocusDistance() {
        return this.focusDistance;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final KeyableFloat getFocusDepthOfField() {
        return this.focusDepthOfField;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final KeyableFloat getFocusBlurStrength() {
        return this.focusBlurStrength;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getFogEnabled() {
        return this.fogEnabled;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final KeyableSolidColor getFogColor() {
        return this.fogColor;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final KeyableFloat getFogNearZ() {
        return this.fogNearZ;
    }

    public final CameraProperties copy(CameraType type, KeyableFloat fov, boolean focusBlurEnabled, KeyableFloat focusDistance, KeyableFloat focusDepthOfField, KeyableFloat focusBlurStrength, boolean fogEnabled, KeyableSolidColor fogColor, KeyableFloat fogNearZ, KeyableFloat fogFarZ) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(fov, "fov");
        Intrinsics.checkNotNullParameter(focusDistance, "focusDistance");
        Intrinsics.checkNotNullParameter(focusDepthOfField, "focusDepthOfField");
        Intrinsics.checkNotNullParameter(focusBlurStrength, "focusBlurStrength");
        Intrinsics.checkNotNullParameter(fogColor, "fogColor");
        Intrinsics.checkNotNullParameter(fogNearZ, "fogNearZ");
        Intrinsics.checkNotNullParameter(fogFarZ, "fogFarZ");
        return new CameraProperties(type, fov, focusBlurEnabled, focusDistance, focusDepthOfField, focusBlurStrength, fogEnabled, fogColor, fogNearZ, fogFarZ);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CameraProperties)) {
            return false;
        }
        CameraProperties cameraProperties = (CameraProperties) other;
        return this.type == cameraProperties.type && Intrinsics.areEqual(this.fov, cameraProperties.fov) && this.focusBlurEnabled == cameraProperties.focusBlurEnabled && Intrinsics.areEqual(this.focusDistance, cameraProperties.focusDistance) && Intrinsics.areEqual(this.focusDepthOfField, cameraProperties.focusDepthOfField) && Intrinsics.areEqual(this.focusBlurStrength, cameraProperties.focusBlurStrength) && this.fogEnabled == cameraProperties.fogEnabled && Intrinsics.areEqual(this.fogColor, cameraProperties.fogColor) && Intrinsics.areEqual(this.fogNearZ, cameraProperties.fogNearZ) && Intrinsics.areEqual(this.fogFarZ, cameraProperties.fogFarZ);
    }

    public int hashCode() {
        return (((((((((((((((((this.type.hashCode() * 31) + this.fov.hashCode()) * 31) + Boolean.hashCode(this.focusBlurEnabled)) * 31) + this.focusDistance.hashCode()) * 31) + this.focusDepthOfField.hashCode()) * 31) + this.focusBlurStrength.hashCode()) * 31) + Boolean.hashCode(this.fogEnabled)) * 31) + this.fogColor.hashCode()) * 31) + this.fogNearZ.hashCode()) * 31) + this.fogFarZ.hashCode();
    }

    public String toString() {
        return "CameraProperties(type=" + this.type + ", fov=" + this.fov + ", focusBlurEnabled=" + this.focusBlurEnabled + ", focusDistance=" + this.focusDistance + ", focusDepthOfField=" + this.focusDepthOfField + ", focusBlurStrength=" + this.focusBlurStrength + ", fogEnabled=" + this.fogEnabled + ", fogColor=" + this.fogColor + ", fogNearZ=" + this.fogNearZ + ", fogFarZ=" + this.fogFarZ + ")";
    }

    public CameraProperties(CameraType type, KeyableFloat fov, boolean z2, KeyableFloat focusDistance, KeyableFloat focusDepthOfField, KeyableFloat focusBlurStrength, boolean z3, KeyableSolidColor fogColor, KeyableFloat fogNearZ, KeyableFloat fogFarZ) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(fov, "fov");
        Intrinsics.checkNotNullParameter(focusDistance, "focusDistance");
        Intrinsics.checkNotNullParameter(focusDepthOfField, "focusDepthOfField");
        Intrinsics.checkNotNullParameter(focusBlurStrength, "focusBlurStrength");
        Intrinsics.checkNotNullParameter(fogColor, "fogColor");
        Intrinsics.checkNotNullParameter(fogNearZ, "fogNearZ");
        Intrinsics.checkNotNullParameter(fogFarZ, "fogFarZ");
        this.type = type;
        this.fov = fov;
        this.focusBlurEnabled = z2;
        this.focusDistance = focusDistance;
        this.focusDepthOfField = focusDepthOfField;
        this.focusBlurStrength = focusBlurStrength;
        this.fogEnabled = z3;
        this.fogColor = fogColor;
        this.fogNearZ = fogNearZ;
        this.fogFarZ = fogFarZ;
    }

    public final boolean getFocusBlurEnabled() {
        return this.focusBlurEnabled;
    }

    public final KeyableFloat getFocusBlurStrength() {
        return this.focusBlurStrength;
    }

    public final KeyableFloat getFocusDepthOfField() {
        return this.focusDepthOfField;
    }

    public final KeyableFloat getFocusDistance() {
        return this.focusDistance;
    }

    public final KeyableSolidColor getFogColor() {
        return this.fogColor;
    }

    public final boolean getFogEnabled() {
        return this.fogEnabled;
    }

    public final KeyableFloat getFogFarZ() {
        return this.fogFarZ;
    }

    public final KeyableFloat getFogNearZ() {
        return this.fogNearZ;
    }

    public final KeyableFloat getFov() {
        return this.fov;
    }

    public final CameraType getType() {
        return this.type;
    }

    public /* synthetic */ CameraProperties(CameraType cameraType, KeyableFloat keyableFloat, boolean z2, KeyableFloat keyableFloat2, KeyableFloat keyableFloat3, KeyableFloat keyableFloat4, boolean z3, KeyableSolidColor keyableSolidColor, KeyableFloat keyableFloat5, KeyableFloat keyableFloat6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? CameraType.Perspective : cameraType, (i2 & 2) != 0 ? KeyableKt.keyable(60.0f) : keyableFloat, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? KeyableKt.keyable(500.0f) : keyableFloat2, (i2 & 16) != 0 ? KeyableKt.keyable(100.0f) : keyableFloat3, (i2 & 32) != 0 ? KeyableKt.keyable(0.5f) : keyableFloat4, (i2 & 64) != 0 ? false : z3, (i2 & 128) != 0 ? KeyableKt.keyable(SolidColor.INSTANCE.getWHITE()) : keyableSolidColor, (i2 & 256) != 0 ? KeyableKt.keyable(0.0f) : keyableFloat5, (i2 & 512) != 0 ? KeyableKt.keyable(500.0f) : keyableFloat6);
    }
}
