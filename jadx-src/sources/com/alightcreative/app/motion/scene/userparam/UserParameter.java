package com.alightcreative.app.motion.scene.userparam;

import androidx.compose.runtime.internal.StabilityInferred;
import cS.Zv.SzFNXybiSxdx;
import com.alightcreative.app.motion.scene.Quaternion;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.app.motion.scene.Vector3D;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000e\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\u000e !\"#$%&'()*+,-¨\u0006."}, d2 = {"Lcom/alightcreative/app/motion/scene/userparam/UserParameter;", "", "<init>", "()V", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "getName", "()Ljava/lang/String;", "label", "getLabel", "dataType", "Lcom/alightcreative/app/motion/scene/userparam/DataType;", "getDataType", "()Lcom/alightcreative/app/motion/scene/userparam/DataType;", "enabledByDefault", "", "getEnabledByDefault", "()Z", "Slider", "StaticText", "Spinner", "Angle", "Orientation", "Color", "HueRing", "HueDisc", "Texture", "Switch", "Point", "XYZ", "Selector", "FloatValue", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter$Angle;", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter$Color;", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter$FloatValue;", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter$HueDisc;", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter$HueRing;", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter$Orientation;", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter$Point;", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter$Selector;", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter$Slider;", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter$Spinner;", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter$StaticText;", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter$Switch;", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter$Texture;", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter$XYZ;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class UserParameter {
    public static final int $stable = 0;

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003JE\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001J\u0013\u0010!\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lcom/alightcreative/app/motion/scene/userparam/UserParameter$Angle;", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "label", "enabledByDefault", "", "minValue", "", "maxValue", "defaultValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZFFF)V", "getName", "()Ljava/lang/String;", "getLabel", "getEnabledByDefault", "()Z", "getMinValue", "()F", "getMaxValue", "getDefaultValue", "dataType", "Lcom/alightcreative/app/motion/scene/userparam/DataType;", "getDataType", "()Lcom/alightcreative/app/motion/scene/userparam/DataType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Angle extends UserParameter {
        public static final int $stable = 0;
        private final DataType dataType;
        private final float defaultValue;
        private final boolean enabledByDefault;
        private final String label;
        private final float maxValue;
        private final float minValue;
        private final String name;

        public static /* synthetic */ Angle copy$default(Angle angle, String str, String str2, boolean z2, float f3, float f4, float f5, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = angle.name;
            }
            if ((i2 & 2) != 0) {
                str2 = angle.label;
            }
            if ((i2 & 4) != 0) {
                z2 = angle.enabledByDefault;
            }
            if ((i2 & 8) != 0) {
                f3 = angle.minValue;
            }
            if ((i2 & 16) != 0) {
                f4 = angle.maxValue;
            }
            if ((i2 & 32) != 0) {
                f5 = angle.defaultValue;
            }
            float f6 = f4;
            float f7 = f5;
            return angle.copy(str, str2, z2, f3, f6, f7);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getEnabledByDefault() {
            return this.enabledByDefault;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final float getMinValue() {
            return this.minValue;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final float getMaxValue() {
            return this.maxValue;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final float getDefaultValue() {
            return this.defaultValue;
        }

        public final Angle copy(String name, String label, boolean enabledByDefault, float minValue, float maxValue, float defaultValue) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(label, "label");
            return new Angle(name, label, enabledByDefault, minValue, maxValue, defaultValue);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Angle)) {
                return false;
            }
            Angle angle = (Angle) other;
            return Intrinsics.areEqual(this.name, angle.name) && Intrinsics.areEqual(this.label, angle.label) && this.enabledByDefault == angle.enabledByDefault && Float.compare(this.minValue, angle.minValue) == 0 && Float.compare(this.maxValue, angle.maxValue) == 0 && Float.compare(this.defaultValue, angle.defaultValue) == 0;
        }

        public int hashCode() {
            return (((((((((this.name.hashCode() * 31) + this.label.hashCode()) * 31) + Boolean.hashCode(this.enabledByDefault)) * 31) + Float.hashCode(this.minValue)) * 31) + Float.hashCode(this.maxValue)) * 31) + Float.hashCode(this.defaultValue);
        }

        public String toString() {
            return "Angle(name=" + this.name + ", label=" + this.label + ", enabledByDefault=" + this.enabledByDefault + ", minValue=" + this.minValue + ", maxValue=" + this.maxValue + ", defaultValue=" + this.defaultValue + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Angle(String name, String label, boolean z2, float f3, float f4, float f5) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(label, "label");
            this.name = name;
            this.label = label;
            this.enabledByDefault = z2;
            this.minValue = f3;
            this.maxValue = f4;
            this.defaultValue = f5;
            this.dataType = DataType.FLOAT;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public DataType getDataType() {
            return this.dataType;
        }

        public final float getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public boolean getEnabledByDefault() {
            return this.enabledByDefault;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public String getLabel() {
            return this.label;
        }

        public final float getMaxValue() {
            return this.maxValue;
        }

        public final float getMinValue() {
            return this.minValue;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public String getName() {
            return this.name;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lcom/alightcreative/app/motion/scene/userparam/UserParameter$Color;", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "label", "enabledByDefault", "", "defaultValue", "Lcom/alightcreative/app/motion/scene/SolidColor;", "hasAlpha", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLcom/alightcreative/app/motion/scene/SolidColor;Z)V", "getName", "()Ljava/lang/String;", "getLabel", "getEnabledByDefault", "()Z", "getDefaultValue", "()Lcom/alightcreative/app/motion/scene/SolidColor;", "getHasAlpha", "dataType", "Lcom/alightcreative/app/motion/scene/userparam/DataType;", "getDataType", "()Lcom/alightcreative/app/motion/scene/userparam/DataType;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Color extends UserParameter {
        public static final int $stable = 0;
        private final DataType dataType;
        private final SolidColor defaultValue;
        private final boolean enabledByDefault;
        private final boolean hasAlpha;
        private final String label;
        private final String name;

        public static /* synthetic */ Color copy$default(Color color, String str, String str2, boolean z2, SolidColor solidColor, boolean z3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = color.name;
            }
            if ((i2 & 2) != 0) {
                str2 = color.label;
            }
            if ((i2 & 4) != 0) {
                z2 = color.enabledByDefault;
            }
            if ((i2 & 8) != 0) {
                solidColor = color.defaultValue;
            }
            if ((i2 & 16) != 0) {
                z3 = color.hasAlpha;
            }
            boolean z4 = z3;
            boolean z5 = z2;
            return color.copy(str, str2, z5, solidColor, z4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getEnabledByDefault() {
            return this.enabledByDefault;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final SolidColor getDefaultValue() {
            return this.defaultValue;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getHasAlpha() {
            return this.hasAlpha;
        }

        public final Color copy(String name, String label, boolean enabledByDefault, SolidColor defaultValue, boolean hasAlpha) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            return new Color(name, label, enabledByDefault, defaultValue, hasAlpha);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Color)) {
                return false;
            }
            Color color = (Color) other;
            return Intrinsics.areEqual(this.name, color.name) && Intrinsics.areEqual(this.label, color.label) && this.enabledByDefault == color.enabledByDefault && Intrinsics.areEqual(this.defaultValue, color.defaultValue) && this.hasAlpha == color.hasAlpha;
        }

        public int hashCode() {
            return (((((((this.name.hashCode() * 31) + this.label.hashCode()) * 31) + Boolean.hashCode(this.enabledByDefault)) * 31) + this.defaultValue.hashCode()) * 31) + Boolean.hashCode(this.hasAlpha);
        }

        public String toString() {
            return "Color(name=" + this.name + ", label=" + this.label + ", enabledByDefault=" + this.enabledByDefault + ", defaultValue=" + this.defaultValue + SzFNXybiSxdx.ICXJEOC + this.hasAlpha + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Color(String name, String label, boolean z2, SolidColor defaultValue, boolean z3) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            this.name = name;
            this.label = label;
            this.enabledByDefault = z2;
            this.defaultValue = defaultValue;
            this.hasAlpha = z3;
            this.dataType = DataType.SOLID_COLOR;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public DataType getDataType() {
            return this.dataType;
        }

        public final SolidColor getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public boolean getEnabledByDefault() {
            return this.enabledByDefault;
        }

        public final boolean getHasAlpha() {
            return this.hasAlpha;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public String getLabel() {
            return this.label;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public String getName() {
            return this.name;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\tR\u0014\u0010\u0012\u001a\u00020\u0013X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, d2 = {"Lcom/alightcreative/app/motion/scene/userparam/UserParameter$FloatValue;", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "value", "", "<init>", "(Ljava/lang/String;F)V", "getName", "()Ljava/lang/String;", "getValue", "()F", "dataType", "Lcom/alightcreative/app/motion/scene/userparam/DataType;", "getDataType", "()Lcom/alightcreative/app/motion/scene/userparam/DataType;", "label", "getLabel", "enabledByDefault", "", "getEnabledByDefault", "()Z", "component1", "component2", "copy", "equals", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FloatValue extends UserParameter {
        public static final int $stable = 0;
        private final DataType dataType;
        private final boolean enabledByDefault;
        private final String label;
        private final String name;
        private final float value;

        public static /* synthetic */ FloatValue copy$default(FloatValue floatValue, String str, float f3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = floatValue.name;
            }
            if ((i2 & 2) != 0) {
                f3 = floatValue.value;
            }
            return floatValue.copy(str, f3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getValue() {
            return this.value;
        }

        public final FloatValue copy(String name, float value) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new FloatValue(name, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FloatValue)) {
                return false;
            }
            FloatValue floatValue = (FloatValue) other;
            return Intrinsics.areEqual(this.name, floatValue.name) && Float.compare(this.value, floatValue.value) == 0;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + Float.hashCode(this.value);
        }

        public String toString() {
            return "FloatValue(name=" + this.name + ", value=" + this.value + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FloatValue(String name, float f3) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.value = f3;
            this.dataType = DataType.FLOAT;
            this.label = "";
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public DataType getDataType() {
            return this.dataType;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public boolean getEnabledByDefault() {
            return this.enabledByDefault;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public String getLabel() {
            return this.label;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public String getName() {
            return this.name;
        }

        public final float getValue() {
            return this.value;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lcom/alightcreative/app/motion/scene/userparam/UserParameter$HueDisc;", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "label", "enabledByDefault", "", "bias", "defaultValue", "Lcom/alightcreative/app/motion/scene/Vector3D;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/alightcreative/app/motion/scene/Vector3D;)V", "getName", "()Ljava/lang/String;", "getLabel", "getEnabledByDefault", "()Z", "getBias", "getDefaultValue", "()Lcom/alightcreative/app/motion/scene/Vector3D;", "dataType", "Lcom/alightcreative/app/motion/scene/userparam/DataType;", "getDataType", "()Lcom/alightcreative/app/motion/scene/userparam/DataType;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HueDisc extends UserParameter {
        public static final int $stable = 0;
        private final boolean bias;
        private final DataType dataType;
        private final Vector3D defaultValue;
        private final boolean enabledByDefault;
        private final String label;
        private final String name;

        public static /* synthetic */ HueDisc copy$default(HueDisc hueDisc, String str, String str2, boolean z2, boolean z3, Vector3D vector3D, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = hueDisc.name;
            }
            if ((i2 & 2) != 0) {
                str2 = hueDisc.label;
            }
            if ((i2 & 4) != 0) {
                z2 = hueDisc.enabledByDefault;
            }
            if ((i2 & 8) != 0) {
                z3 = hueDisc.bias;
            }
            if ((i2 & 16) != 0) {
                vector3D = hueDisc.defaultValue;
            }
            Vector3D vector3D2 = vector3D;
            boolean z4 = z2;
            return hueDisc.copy(str, str2, z4, z3, vector3D2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getEnabledByDefault() {
            return this.enabledByDefault;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getBias() {
            return this.bias;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Vector3D getDefaultValue() {
            return this.defaultValue;
        }

        public final HueDisc copy(String name, String label, boolean enabledByDefault, boolean bias, Vector3D defaultValue) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            return new HueDisc(name, label, enabledByDefault, bias, defaultValue);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HueDisc)) {
                return false;
            }
            HueDisc hueDisc = (HueDisc) other;
            return Intrinsics.areEqual(this.name, hueDisc.name) && Intrinsics.areEqual(this.label, hueDisc.label) && this.enabledByDefault == hueDisc.enabledByDefault && this.bias == hueDisc.bias && Intrinsics.areEqual(this.defaultValue, hueDisc.defaultValue);
        }

        public int hashCode() {
            return (((((((this.name.hashCode() * 31) + this.label.hashCode()) * 31) + Boolean.hashCode(this.enabledByDefault)) * 31) + Boolean.hashCode(this.bias)) * 31) + this.defaultValue.hashCode();
        }

        public String toString() {
            return "HueDisc(name=" + this.name + ", label=" + this.label + ", enabledByDefault=" + this.enabledByDefault + ", bias=" + this.bias + ", defaultValue=" + this.defaultValue + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HueDisc(String name, String label, boolean z2, boolean z3, Vector3D defaultValue) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            this.name = name;
            this.label = label;
            this.enabledByDefault = z2;
            this.bias = z3;
            this.defaultValue = defaultValue;
            this.dataType = DataType.VEC3;
        }

        public final boolean getBias() {
            return this.bias;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public DataType getDataType() {
            return this.dataType;
        }

        public final Vector3D getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public boolean getEnabledByDefault() {
            return this.enabledByDefault;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public String getLabel() {
            return this.label;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public String getName() {
            return this.name;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/alightcreative/app/motion/scene/userparam/UserParameter$HueRing;", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "label", "enabledByDefault", "", "defaultValue", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZF)V", "getName", "()Ljava/lang/String;", "getLabel", "getEnabledByDefault", "()Z", "getDefaultValue", "()F", "dataType", "Lcom/alightcreative/app/motion/scene/userparam/DataType;", "getDataType", "()Lcom/alightcreative/app/motion/scene/userparam/DataType;", "component1", "component2", "component3", "component4", "copy", "equals", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HueRing extends UserParameter {
        public static final int $stable = 0;
        private final DataType dataType;
        private final float defaultValue;
        private final boolean enabledByDefault;
        private final String label;
        private final String name;

        public static /* synthetic */ HueRing copy$default(HueRing hueRing, String str, String str2, boolean z2, float f3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = hueRing.name;
            }
            if ((i2 & 2) != 0) {
                str2 = hueRing.label;
            }
            if ((i2 & 4) != 0) {
                z2 = hueRing.enabledByDefault;
            }
            if ((i2 & 8) != 0) {
                f3 = hueRing.defaultValue;
            }
            return hueRing.copy(str, str2, z2, f3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getEnabledByDefault() {
            return this.enabledByDefault;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final float getDefaultValue() {
            return this.defaultValue;
        }

        public final HueRing copy(String name, String label, boolean enabledByDefault, float defaultValue) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(label, "label");
            return new HueRing(name, label, enabledByDefault, defaultValue);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HueRing)) {
                return false;
            }
            HueRing hueRing = (HueRing) other;
            return Intrinsics.areEqual(this.name, hueRing.name) && Intrinsics.areEqual(this.label, hueRing.label) && this.enabledByDefault == hueRing.enabledByDefault && Float.compare(this.defaultValue, hueRing.defaultValue) == 0;
        }

        public int hashCode() {
            return (((((this.name.hashCode() * 31) + this.label.hashCode()) * 31) + Boolean.hashCode(this.enabledByDefault)) * 31) + Float.hashCode(this.defaultValue);
        }

        public String toString() {
            return "HueRing(name=" + this.name + ", label=" + this.label + ", enabledByDefault=" + this.enabledByDefault + ", defaultValue=" + this.defaultValue + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HueRing(String name, String label, boolean z2, float f3) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(label, "label");
            this.name = name;
            this.label = label;
            this.enabledByDefault = z2;
            this.defaultValue = f3;
            this.dataType = DataType.FLOAT;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public DataType getDataType() {
            return this.dataType;
        }

        public final float getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public boolean getEnabledByDefault() {
            return this.enabledByDefault;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public String getLabel() {
            return this.label;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public String getName() {
            return this.name;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lcom/alightcreative/app/motion/scene/userparam/UserParameter$Orientation;", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "label", "enabledByDefault", "", "defaultValue", "Lcom/alightcreative/app/motion/scene/Quaternion;", "invert", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLcom/alightcreative/app/motion/scene/Quaternion;Z)V", "getName", "()Ljava/lang/String;", "getLabel", "getEnabledByDefault", "()Z", "getDefaultValue", "()Lcom/alightcreative/app/motion/scene/Quaternion;", "getInvert", "dataType", "Lcom/alightcreative/app/motion/scene/userparam/DataType;", "getDataType", "()Lcom/alightcreative/app/motion/scene/userparam/DataType;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Orientation extends UserParameter {
        public static final int $stable = 0;
        private final DataType dataType;
        private final Quaternion defaultValue;
        private final boolean enabledByDefault;
        private final boolean invert;
        private final String label;
        private final String name;

        public static /* synthetic */ Orientation copy$default(Orientation orientation, String str, String str2, boolean z2, Quaternion quaternion, boolean z3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = orientation.name;
            }
            if ((i2 & 2) != 0) {
                str2 = orientation.label;
            }
            if ((i2 & 4) != 0) {
                z2 = orientation.enabledByDefault;
            }
            if ((i2 & 8) != 0) {
                quaternion = orientation.defaultValue;
            }
            if ((i2 & 16) != 0) {
                z3 = orientation.invert;
            }
            boolean z4 = z3;
            boolean z5 = z2;
            return orientation.copy(str, str2, z5, quaternion, z4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getEnabledByDefault() {
            return this.enabledByDefault;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Quaternion getDefaultValue() {
            return this.defaultValue;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getInvert() {
            return this.invert;
        }

        public final Orientation copy(String name, String label, boolean enabledByDefault, Quaternion defaultValue, boolean invert) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            return new Orientation(name, label, enabledByDefault, defaultValue, invert);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Orientation)) {
                return false;
            }
            Orientation orientation = (Orientation) other;
            return Intrinsics.areEqual(this.name, orientation.name) && Intrinsics.areEqual(this.label, orientation.label) && this.enabledByDefault == orientation.enabledByDefault && Intrinsics.areEqual(this.defaultValue, orientation.defaultValue) && this.invert == orientation.invert;
        }

        public int hashCode() {
            return (((((((this.name.hashCode() * 31) + this.label.hashCode()) * 31) + Boolean.hashCode(this.enabledByDefault)) * 31) + this.defaultValue.hashCode()) * 31) + Boolean.hashCode(this.invert);
        }

        public String toString() {
            return "Orientation(name=" + this.name + ", label=" + this.label + ", enabledByDefault=" + this.enabledByDefault + ", defaultValue=" + this.defaultValue + ", invert=" + this.invert + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Orientation(String name, String label, boolean z2, Quaternion defaultValue, boolean z3) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            this.name = name;
            this.label = label;
            this.enabledByDefault = z2;
            this.defaultValue = defaultValue;
            this.invert = z3;
            this.dataType = DataType.QUAT;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public DataType getDataType() {
            return this.dataType;
        }

        public final Quaternion getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public boolean getEnabledByDefault() {
            return this.enabledByDefault;
        }

        public final boolean getInvert() {
            return this.invert;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public String getLabel() {
            return this.label;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public String getName() {
            return this.name;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\t\u0010(\u001a\u00020\fHÆ\u0003J\t\u0010)\u001a\u00020\u000eHÆ\u0003JY\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010+\u001a\u00020\u00062\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00061"}, d2 = {"Lcom/alightcreative/app/motion/scene/userparam/UserParameter$Point;", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "label", "enabledByDefault", "", "minOffset", "Lcom/alightcreative/app/motion/scene/Vector2D;", "maxOffset", "defaultValue", "pointType", "Lcom/alightcreative/app/motion/scene/userparam/PointType;", "step", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLcom/alightcreative/app/motion/scene/Vector2D;Lcom/alightcreative/app/motion/scene/Vector2D;Lcom/alightcreative/app/motion/scene/Vector2D;Lcom/alightcreative/app/motion/scene/userparam/PointType;F)V", "getName", "()Ljava/lang/String;", "getLabel", "getEnabledByDefault", "()Z", "getMinOffset", "()Lcom/alightcreative/app/motion/scene/Vector2D;", "getMaxOffset", "getDefaultValue", "getPointType", "()Lcom/alightcreative/app/motion/scene/userparam/PointType;", "getStep", "()F", "dataType", "Lcom/alightcreative/app/motion/scene/userparam/DataType;", "getDataType", "()Lcom/alightcreative/app/motion/scene/userparam/DataType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Point extends UserParameter {
        public static final int $stable = 0;
        private final DataType dataType;
        private final Vector2D defaultValue;
        private final boolean enabledByDefault;
        private final String label;
        private final Vector2D maxOffset;
        private final Vector2D minOffset;
        private final String name;
        private final PointType pointType;
        private final float step;

        public static /* synthetic */ Point copy$default(Point point, String str, String str2, boolean z2, Vector2D vector2D, Vector2D vector2D2, Vector2D vector2D3, PointType pointType, float f3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = point.name;
            }
            if ((i2 & 2) != 0) {
                str2 = point.label;
            }
            if ((i2 & 4) != 0) {
                z2 = point.enabledByDefault;
            }
            if ((i2 & 8) != 0) {
                vector2D = point.minOffset;
            }
            if ((i2 & 16) != 0) {
                vector2D2 = point.maxOffset;
            }
            if ((i2 & 32) != 0) {
                vector2D3 = point.defaultValue;
            }
            if ((i2 & 64) != 0) {
                pointType = point.pointType;
            }
            if ((i2 & 128) != 0) {
                f3 = point.step;
            }
            PointType pointType2 = pointType;
            float f4 = f3;
            Vector2D vector2D4 = vector2D2;
            Vector2D vector2D5 = vector2D3;
            return point.copy(str, str2, z2, vector2D, vector2D4, vector2D5, pointType2, f4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getEnabledByDefault() {
            return this.enabledByDefault;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Vector2D getMinOffset() {
            return this.minOffset;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Vector2D getMaxOffset() {
            return this.maxOffset;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Vector2D getDefaultValue() {
            return this.defaultValue;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final PointType getPointType() {
            return this.pointType;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final float getStep() {
            return this.step;
        }

        public final Point copy(String name, String label, boolean enabledByDefault, Vector2D minOffset, Vector2D maxOffset, Vector2D defaultValue, PointType pointType, float step) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(minOffset, "minOffset");
            Intrinsics.checkNotNullParameter(maxOffset, "maxOffset");
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            Intrinsics.checkNotNullParameter(pointType, "pointType");
            return new Point(name, label, enabledByDefault, minOffset, maxOffset, defaultValue, pointType, step);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Point)) {
                return false;
            }
            Point point = (Point) other;
            return Intrinsics.areEqual(this.name, point.name) && Intrinsics.areEqual(this.label, point.label) && this.enabledByDefault == point.enabledByDefault && Intrinsics.areEqual(this.minOffset, point.minOffset) && Intrinsics.areEqual(this.maxOffset, point.maxOffset) && Intrinsics.areEqual(this.defaultValue, point.defaultValue) && this.pointType == point.pointType && Float.compare(this.step, point.step) == 0;
        }

        public int hashCode() {
            return (((((((((((((this.name.hashCode() * 31) + this.label.hashCode()) * 31) + Boolean.hashCode(this.enabledByDefault)) * 31) + this.minOffset.hashCode()) * 31) + this.maxOffset.hashCode()) * 31) + this.defaultValue.hashCode()) * 31) + this.pointType.hashCode()) * 31) + Float.hashCode(this.step);
        }

        public String toString() {
            return "Point(name=" + this.name + ", label=" + this.label + ", enabledByDefault=" + this.enabledByDefault + ", minOffset=" + this.minOffset + ", maxOffset=" + this.maxOffset + ", defaultValue=" + this.defaultValue + ", pointType=" + this.pointType + ", step=" + this.step + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Point(String name, String label, boolean z2, Vector2D minOffset, Vector2D maxOffset, Vector2D defaultValue, PointType pointType, float f3) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(minOffset, "minOffset");
            Intrinsics.checkNotNullParameter(maxOffset, "maxOffset");
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            Intrinsics.checkNotNullParameter(pointType, "pointType");
            this.name = name;
            this.label = label;
            this.enabledByDefault = z2;
            this.minOffset = minOffset;
            this.maxOffset = maxOffset;
            this.defaultValue = defaultValue;
            this.pointType = pointType;
            this.step = f3;
            this.dataType = DataType.VEC2;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public DataType getDataType() {
            return this.dataType;
        }

        public final Vector2D getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public boolean getEnabledByDefault() {
            return this.enabledByDefault;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public String getLabel() {
            return this.label;
        }

        public final Vector2D getMaxOffset() {
            return this.maxOffset;
        }

        public final Vector2D getMinOffset() {
            return this.minOffset;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public String getName() {
            return this.name;
        }

        public final PointType getPointType() {
            return this.pointType;
        }

        public final float getStep() {
            return this.step;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\t\u0010$\u001a\u00020\rHÆ\u0003JK\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010&\u001a\u00020\u00062\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\u000bHÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001cX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006+"}, d2 = {"Lcom/alightcreative/app/motion/scene/userparam/UserParameter$Selector;", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "label", "enabledByDefault", "", "choices", "", "Lcom/alightcreative/app/motion/scene/userparam/ChoiceInfo;", "defaultChoice", "", "style", "Lcom/alightcreative/app/motion/scene/userparam/SelectorStyle;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;ILcom/alightcreative/app/motion/scene/userparam/SelectorStyle;)V", "getName", "()Ljava/lang/String;", "getLabel", "getEnabledByDefault", "()Z", "getChoices", "()Ljava/util/List;", "getDefaultChoice", "()I", "getStyle", "()Lcom/alightcreative/app/motion/scene/userparam/SelectorStyle;", "dataType", "Lcom/alightcreative/app/motion/scene/userparam/DataType;", "getDataType", "()Lcom/alightcreative/app/motion/scene/userparam/DataType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", InneractiveMediationNameConsts.OTHER, "", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Selector extends UserParameter {
        public static final int $stable = 8;
        private final List<ChoiceInfo> choices;
        private final DataType dataType;
        private final int defaultChoice;
        private final boolean enabledByDefault;
        private final String label;
        private final String name;
        private final SelectorStyle style;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Selector copy$default(Selector selector, String str, String str2, boolean z2, List list, int i2, SelectorStyle selectorStyle, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = selector.name;
            }
            if ((i3 & 2) != 0) {
                str2 = selector.label;
            }
            if ((i3 & 4) != 0) {
                z2 = selector.enabledByDefault;
            }
            if ((i3 & 8) != 0) {
                list = selector.choices;
            }
            if ((i3 & 16) != 0) {
                i2 = selector.defaultChoice;
            }
            if ((i3 & 32) != 0) {
                selectorStyle = selector.style;
            }
            int i5 = i2;
            SelectorStyle selectorStyle2 = selectorStyle;
            return selector.copy(str, str2, z2, list, i5, selectorStyle2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getEnabledByDefault() {
            return this.enabledByDefault;
        }

        public final List<ChoiceInfo> component4() {
            return this.choices;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final int getDefaultChoice() {
            return this.defaultChoice;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final SelectorStyle getStyle() {
            return this.style;
        }

        public final Selector copy(String name, String label, boolean enabledByDefault, List<ChoiceInfo> choices, int defaultChoice, SelectorStyle style) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(choices, "choices");
            Intrinsics.checkNotNullParameter(style, "style");
            return new Selector(name, label, enabledByDefault, choices, defaultChoice, style);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Selector)) {
                return false;
            }
            Selector selector = (Selector) other;
            return Intrinsics.areEqual(this.name, selector.name) && Intrinsics.areEqual(this.label, selector.label) && this.enabledByDefault == selector.enabledByDefault && Intrinsics.areEqual(this.choices, selector.choices) && this.defaultChoice == selector.defaultChoice && this.style == selector.style;
        }

        public int hashCode() {
            return (((((((((this.name.hashCode() * 31) + this.label.hashCode()) * 31) + Boolean.hashCode(this.enabledByDefault)) * 31) + this.choices.hashCode()) * 31) + Integer.hashCode(this.defaultChoice)) * 31) + this.style.hashCode();
        }

        public String toString() {
            return "Selector(name=" + this.name + ", label=" + this.label + ", enabledByDefault=" + this.enabledByDefault + ", choices=" + this.choices + ", defaultChoice=" + this.defaultChoice + ", style=" + this.style + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Selector(String name, String label, boolean z2, List<ChoiceInfo> choices, int i2, SelectorStyle style) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(choices, "choices");
            Intrinsics.checkNotNullParameter(style, "style");
            this.name = name;
            this.label = label;
            this.enabledByDefault = z2;
            this.choices = choices;
            this.defaultChoice = i2;
            this.style = style;
            this.dataType = DataType.INT;
        }

        public final List<ChoiceInfo> getChoices() {
            return this.choices;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public DataType getDataType() {
            return this.dataType;
        }

        public final int getDefaultChoice() {
            return this.defaultChoice;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public boolean getEnabledByDefault() {
            return this.enabledByDefault;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public String getLabel() {
            return this.label;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public String getName() {
            return this.name;
        }

        public final SelectorStyle getStyle() {
            return this.style;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0011\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\t\u00100\u001a\u00020\bHÆ\u0003J\t\u00101\u001a\u00020\bHÆ\u0003J\t\u00102\u001a\u00020\u000eHÆ\u0003J\t\u00103\u001a\u00020\bHÆ\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\b0\u0011HÆ\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\b0\u0011HÆ\u0003J\u008d\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\b2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0011HÆ\u0001J\u0013\u00107\u001a\u00020\u00062\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010:\u001a\u00020;HÖ\u0001J\t\u0010<\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0014\u0010&\u001a\u00020'X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u0006="}, d2 = {"Lcom/alightcreative/app/motion/scene/userparam/UserParameter$Slider;", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "label", "enabledByDefault", "", "minValue", "", "maxValue", "step", "defaultValue", "originValue", "sliderType", "Lcom/alightcreative/app/motion/scene/userparam/SliderType;", "logScale", "tickMarks", "", "snapValues", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZFFFFFLcom/alightcreative/app/motion/scene/userparam/SliderType;FLjava/util/List;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getLabel", "getEnabledByDefault", "()Z", "getMinValue", "()F", "getMaxValue", "getStep", "getDefaultValue", "getOriginValue", "getSliderType", "()Lcom/alightcreative/app/motion/scene/userparam/SliderType;", "getLogScale", "getTickMarks", "()Ljava/util/List;", "getSnapValues", "dataType", "Lcom/alightcreative/app/motion/scene/userparam/DataType;", "getDataType", "()Lcom/alightcreative/app/motion/scene/userparam/DataType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Slider extends UserParameter {
        public static final int $stable = 8;
        private final DataType dataType;
        private final float defaultValue;
        private final boolean enabledByDefault;
        private final String label;
        private final float logScale;
        private final float maxValue;
        private final float minValue;
        private final String name;
        private final float originValue;
        private final SliderType sliderType;
        private final List<Float> snapValues;
        private final float step;
        private final List<Float> tickMarks;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Slider copy$default(Slider slider, String str, String str2, boolean z2, float f3, float f4, float f5, float f6, float f7, SliderType sliderType, float f8, List list, List list2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = slider.name;
            }
            if ((i2 & 2) != 0) {
                str2 = slider.label;
            }
            if ((i2 & 4) != 0) {
                z2 = slider.enabledByDefault;
            }
            if ((i2 & 8) != 0) {
                f3 = slider.minValue;
            }
            if ((i2 & 16) != 0) {
                f4 = slider.maxValue;
            }
            if ((i2 & 32) != 0) {
                f5 = slider.step;
            }
            if ((i2 & 64) != 0) {
                f6 = slider.defaultValue;
            }
            if ((i2 & 128) != 0) {
                f7 = slider.originValue;
            }
            if ((i2 & 256) != 0) {
                sliderType = slider.sliderType;
            }
            if ((i2 & 512) != 0) {
                f8 = slider.logScale;
            }
            if ((i2 & 1024) != 0) {
                list = slider.tickMarks;
            }
            if ((i2 & 2048) != 0) {
                list2 = slider.snapValues;
            }
            List list3 = list;
            List list4 = list2;
            SliderType sliderType2 = sliderType;
            float f9 = f8;
            float f10 = f6;
            float f11 = f7;
            float f12 = f4;
            float f13 = f5;
            return slider.copy(str, str2, z2, f3, f12, f13, f10, f11, sliderType2, f9, list3, list4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final float getLogScale() {
            return this.logScale;
        }

        public final List<Float> component11() {
            return this.tickMarks;
        }

        public final List<Float> component12() {
            return this.snapValues;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getEnabledByDefault() {
            return this.enabledByDefault;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final float getMinValue() {
            return this.minValue;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final float getMaxValue() {
            return this.maxValue;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final float getStep() {
            return this.step;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final float getDefaultValue() {
            return this.defaultValue;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final float getOriginValue() {
            return this.originValue;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final SliderType getSliderType() {
            return this.sliderType;
        }

        public final Slider copy(String name, String label, boolean enabledByDefault, float minValue, float maxValue, float step, float defaultValue, float originValue, SliderType sliderType, float logScale, List<Float> tickMarks, List<Float> snapValues) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(sliderType, "sliderType");
            Intrinsics.checkNotNullParameter(tickMarks, "tickMarks");
            Intrinsics.checkNotNullParameter(snapValues, "snapValues");
            return new Slider(name, label, enabledByDefault, minValue, maxValue, step, defaultValue, originValue, sliderType, logScale, tickMarks, snapValues);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Slider)) {
                return false;
            }
            Slider slider = (Slider) other;
            return Intrinsics.areEqual(this.name, slider.name) && Intrinsics.areEqual(this.label, slider.label) && this.enabledByDefault == slider.enabledByDefault && Float.compare(this.minValue, slider.minValue) == 0 && Float.compare(this.maxValue, slider.maxValue) == 0 && Float.compare(this.step, slider.step) == 0 && Float.compare(this.defaultValue, slider.defaultValue) == 0 && Float.compare(this.originValue, slider.originValue) == 0 && this.sliderType == slider.sliderType && Float.compare(this.logScale, slider.logScale) == 0 && Intrinsics.areEqual(this.tickMarks, slider.tickMarks) && Intrinsics.areEqual(this.snapValues, slider.snapValues);
        }

        public int hashCode() {
            return (((((((((((((((((((((this.name.hashCode() * 31) + this.label.hashCode()) * 31) + Boolean.hashCode(this.enabledByDefault)) * 31) + Float.hashCode(this.minValue)) * 31) + Float.hashCode(this.maxValue)) * 31) + Float.hashCode(this.step)) * 31) + Float.hashCode(this.defaultValue)) * 31) + Float.hashCode(this.originValue)) * 31) + this.sliderType.hashCode()) * 31) + Float.hashCode(this.logScale)) * 31) + this.tickMarks.hashCode()) * 31) + this.snapValues.hashCode();
        }

        public String toString() {
            return "Slider(name=" + this.name + ", label=" + this.label + ", enabledByDefault=" + this.enabledByDefault + ", minValue=" + this.minValue + ", maxValue=" + this.maxValue + ", step=" + this.step + ", defaultValue=" + this.defaultValue + ", originValue=" + this.originValue + ", sliderType=" + this.sliderType + ", logScale=" + this.logScale + ", tickMarks=" + this.tickMarks + ", snapValues=" + this.snapValues + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Slider(String name, String label, boolean z2, float f3, float f4, float f5, float f6, float f7, SliderType sliderType, float f8, List<Float> tickMarks, List<Float> snapValues) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(sliderType, "sliderType");
            Intrinsics.checkNotNullParameter(tickMarks, "tickMarks");
            Intrinsics.checkNotNullParameter(snapValues, "snapValues");
            this.name = name;
            this.label = label;
            this.enabledByDefault = z2;
            this.minValue = f3;
            this.maxValue = f4;
            this.step = f5;
            this.defaultValue = f6;
            this.originValue = f7;
            this.sliderType = sliderType;
            this.logScale = f8;
            this.tickMarks = tickMarks;
            this.snapValues = snapValues;
            this.dataType = DataType.FLOAT;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public DataType getDataType() {
            return this.dataType;
        }

        public final float getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public boolean getEnabledByDefault() {
            return this.enabledByDefault;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public String getLabel() {
            return this.label;
        }

        public final float getLogScale() {
            return this.logScale;
        }

        public final float getMaxValue() {
            return this.maxValue;
        }

        public final float getMinValue() {
            return this.minValue;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public String getName() {
            return this.name;
        }

        public final float getOriginValue() {
            return this.originValue;
        }

        public final SliderType getSliderType() {
            return this.sliderType;
        }

        public final List<Float> getSnapValues() {
            return this.snapValues;
        }

        public final float getStep() {
            return this.step;
        }

        public final List<Float> getTickMarks() {
            return this.tickMarks;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\t\u0010+\u001a\u00020\bHÆ\u0003J\t\u0010,\u001a\u00020\bHÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\t\u00100\u001a\u00020\u000eHÆ\u0003J\t\u00101\u001a\u00020\bHÆ\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\b0\u0011HÆ\u0003J}\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\b2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0011HÆ\u0001J\u0013\u00104\u001a\u00020\u00062\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020%X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006:"}, d2 = {"Lcom/alightcreative/app/motion/scene/userparam/UserParameter$Spinner;", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "label", "enabledByDefault", "", "minValue", "", "maxValue", "step", "defaultValue", "originValue", "sliderType", "Lcom/alightcreative/app/motion/scene/userparam/SliderType;", "multiplier", "tickMarks", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZFFFFFLcom/alightcreative/app/motion/scene/userparam/SliderType;FLjava/util/List;)V", "getName", "()Ljava/lang/String;", "getLabel", "getEnabledByDefault", "()Z", "getMinValue", "()F", "getMaxValue", "getStep", "getDefaultValue", "getOriginValue", "getSliderType", "()Lcom/alightcreative/app/motion/scene/userparam/SliderType;", "getMultiplier", "getTickMarks", "()Ljava/util/List;", "dataType", "Lcom/alightcreative/app/motion/scene/userparam/DataType;", "getDataType", "()Lcom/alightcreative/app/motion/scene/userparam/DataType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Spinner extends UserParameter {
        public static final int $stable = 8;
        private final DataType dataType;
        private final float defaultValue;
        private final boolean enabledByDefault;
        private final String label;
        private final float maxValue;
        private final float minValue;
        private final float multiplier;
        private final String name;
        private final float originValue;
        private final SliderType sliderType;
        private final float step;
        private final List<Float> tickMarks;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Spinner copy$default(Spinner spinner, String str, String str2, boolean z2, float f3, float f4, float f5, float f6, float f7, SliderType sliderType, float f8, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = spinner.name;
            }
            if ((i2 & 2) != 0) {
                str2 = spinner.label;
            }
            if ((i2 & 4) != 0) {
                z2 = spinner.enabledByDefault;
            }
            if ((i2 & 8) != 0) {
                f3 = spinner.minValue;
            }
            if ((i2 & 16) != 0) {
                f4 = spinner.maxValue;
            }
            if ((i2 & 32) != 0) {
                f5 = spinner.step;
            }
            if ((i2 & 64) != 0) {
                f6 = spinner.defaultValue;
            }
            if ((i2 & 128) != 0) {
                f7 = spinner.originValue;
            }
            if ((i2 & 256) != 0) {
                sliderType = spinner.sliderType;
            }
            if ((i2 & 512) != 0) {
                f8 = spinner.multiplier;
            }
            if ((i2 & 1024) != 0) {
                list = spinner.tickMarks;
            }
            float f9 = f8;
            List list2 = list;
            float f10 = f7;
            SliderType sliderType2 = sliderType;
            float f11 = f5;
            float f12 = f6;
            float f13 = f4;
            boolean z3 = z2;
            return spinner.copy(str, str2, z3, f3, f13, f11, f12, f10, sliderType2, f9, list2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final float getMultiplier() {
            return this.multiplier;
        }

        public final List<Float> component11() {
            return this.tickMarks;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getEnabledByDefault() {
            return this.enabledByDefault;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final float getMinValue() {
            return this.minValue;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final float getMaxValue() {
            return this.maxValue;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final float getStep() {
            return this.step;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final float getDefaultValue() {
            return this.defaultValue;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final float getOriginValue() {
            return this.originValue;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final SliderType getSliderType() {
            return this.sliderType;
        }

        public final Spinner copy(String name, String label, boolean enabledByDefault, float minValue, float maxValue, float step, float defaultValue, float originValue, SliderType sliderType, float multiplier, List<Float> tickMarks) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(sliderType, "sliderType");
            Intrinsics.checkNotNullParameter(tickMarks, "tickMarks");
            return new Spinner(name, label, enabledByDefault, minValue, maxValue, step, defaultValue, originValue, sliderType, multiplier, tickMarks);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Spinner)) {
                return false;
            }
            Spinner spinner = (Spinner) other;
            return Intrinsics.areEqual(this.name, spinner.name) && Intrinsics.areEqual(this.label, spinner.label) && this.enabledByDefault == spinner.enabledByDefault && Float.compare(this.minValue, spinner.minValue) == 0 && Float.compare(this.maxValue, spinner.maxValue) == 0 && Float.compare(this.step, spinner.step) == 0 && Float.compare(this.defaultValue, spinner.defaultValue) == 0 && Float.compare(this.originValue, spinner.originValue) == 0 && this.sliderType == spinner.sliderType && Float.compare(this.multiplier, spinner.multiplier) == 0 && Intrinsics.areEqual(this.tickMarks, spinner.tickMarks);
        }

        public int hashCode() {
            return (((((((((((((((((((this.name.hashCode() * 31) + this.label.hashCode()) * 31) + Boolean.hashCode(this.enabledByDefault)) * 31) + Float.hashCode(this.minValue)) * 31) + Float.hashCode(this.maxValue)) * 31) + Float.hashCode(this.step)) * 31) + Float.hashCode(this.defaultValue)) * 31) + Float.hashCode(this.originValue)) * 31) + this.sliderType.hashCode()) * 31) + Float.hashCode(this.multiplier)) * 31) + this.tickMarks.hashCode();
        }

        public String toString() {
            return "Spinner(name=" + this.name + ", label=" + this.label + ", enabledByDefault=" + this.enabledByDefault + ", minValue=" + this.minValue + ", maxValue=" + this.maxValue + ", step=" + this.step + ", defaultValue=" + this.defaultValue + ", originValue=" + this.originValue + ", sliderType=" + this.sliderType + ", multiplier=" + this.multiplier + ", tickMarks=" + this.tickMarks + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Spinner(String name, String label, boolean z2, float f3, float f4, float f5, float f6, float f7, SliderType sliderType, float f8, List<Float> tickMarks) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(sliderType, "sliderType");
            Intrinsics.checkNotNullParameter(tickMarks, "tickMarks");
            this.name = name;
            this.label = label;
            this.enabledByDefault = z2;
            this.minValue = f3;
            this.maxValue = f4;
            this.step = f5;
            this.defaultValue = f6;
            this.originValue = f7;
            this.sliderType = sliderType;
            this.multiplier = f8;
            this.tickMarks = tickMarks;
            this.dataType = DataType.FLOAT;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public DataType getDataType() {
            return this.dataType;
        }

        public final float getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public boolean getEnabledByDefault() {
            return this.enabledByDefault;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public String getLabel() {
            return this.label;
        }

        public final float getMaxValue() {
            return this.maxValue;
        }

        public final float getMinValue() {
            return this.minValue;
        }

        public final float getMultiplier() {
            return this.multiplier;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public String getName() {
            return this.name;
        }

        public final float getOriginValue() {
            return this.originValue;
        }

        public final SliderType getSliderType() {
            return this.sliderType;
        }

        public final float getStep() {
            return this.step;
        }

        public final List<Float> getTickMarks() {
            return this.tickMarks;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003JG\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010#\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006)"}, d2 = {"Lcom/alightcreative/app/motion/scene/userparam/UserParameter$StaticText;", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "label", "enabledByDefault", "", "text", "style", "Lcom/alightcreative/app/motion/scene/userparam/StaticTextStyle;", "hintType", "Lcom/alightcreative/app/motion/scene/userparam/HintType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/alightcreative/app/motion/scene/userparam/StaticTextStyle;Lcom/alightcreative/app/motion/scene/userparam/HintType;)V", "getName", "()Ljava/lang/String;", "getLabel", "getEnabledByDefault", "()Z", "getText", "getStyle", "()Lcom/alightcreative/app/motion/scene/userparam/StaticTextStyle;", "getHintType", "()Lcom/alightcreative/app/motion/scene/userparam/HintType;", "dataType", "Lcom/alightcreative/app/motion/scene/userparam/DataType;", "getDataType", "()Lcom/alightcreative/app/motion/scene/userparam/DataType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StaticText extends UserParameter {
        public static final int $stable = 0;
        private final DataType dataType;
        private final boolean enabledByDefault;
        private final HintType hintType;
        private final String label;
        private final String name;
        private final StaticTextStyle style;
        private final String text;

        public static /* synthetic */ StaticText copy$default(StaticText staticText, String str, String str2, boolean z2, String str3, StaticTextStyle staticTextStyle, HintType hintType, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = staticText.name;
            }
            if ((i2 & 2) != 0) {
                str2 = staticText.label;
            }
            if ((i2 & 4) != 0) {
                z2 = staticText.enabledByDefault;
            }
            if ((i2 & 8) != 0) {
                str3 = staticText.text;
            }
            if ((i2 & 16) != 0) {
                staticTextStyle = staticText.style;
            }
            if ((i2 & 32) != 0) {
                hintType = staticText.hintType;
            }
            StaticTextStyle staticTextStyle2 = staticTextStyle;
            HintType hintType2 = hintType;
            return staticText.copy(str, str2, z2, str3, staticTextStyle2, hintType2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getEnabledByDefault() {
            return this.enabledByDefault;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final StaticTextStyle getStyle() {
            return this.style;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final HintType getHintType() {
            return this.hintType;
        }

        public final StaticText copy(String name, String label, boolean enabledByDefault, String text, StaticTextStyle style, HintType hintType) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(style, "style");
            return new StaticText(name, label, enabledByDefault, text, style, hintType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StaticText)) {
                return false;
            }
            StaticText staticText = (StaticText) other;
            return Intrinsics.areEqual(this.name, staticText.name) && Intrinsics.areEqual(this.label, staticText.label) && this.enabledByDefault == staticText.enabledByDefault && Intrinsics.areEqual(this.text, staticText.text) && this.style == staticText.style && this.hintType == staticText.hintType;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.name.hashCode() * 31) + this.label.hashCode()) * 31) + Boolean.hashCode(this.enabledByDefault)) * 31) + this.text.hashCode()) * 31) + this.style.hashCode()) * 31;
            HintType hintType = this.hintType;
            return iHashCode + (hintType == null ? 0 : hintType.hashCode());
        }

        public String toString() {
            return "StaticText(name=" + this.name + ", label=" + this.label + ", enabledByDefault=" + this.enabledByDefault + ", text=" + this.text + ", style=" + this.style + ", hintType=" + this.hintType + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StaticText(String name, String label, boolean z2, String text, StaticTextStyle style, HintType hintType) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(style, "style");
            this.name = name;
            this.label = label;
            this.enabledByDefault = z2;
            this.text = text;
            this.style = style;
            this.hintType = hintType;
            this.dataType = DataType.NONE;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public DataType getDataType() {
            return this.dataType;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public boolean getEnabledByDefault() {
            return this.enabledByDefault;
        }

        public final HintType getHintType() {
            return this.hintType;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public String getLabel() {
            return this.label;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public String getName() {
            return this.name;
        }

        public final StaticTextStyle getStyle() {
            return this.style;
        }

        public final String getText() {
            return this.text;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003JA\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0001J\u0013\u0010 \u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lcom/alightcreative/app/motion/scene/userparam/UserParameter$Switch;", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "label", "enabledByDefault", "", "defaultValue", "enableTargets", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;)V", "getName", "()Ljava/lang/String;", "getLabel", "getEnabledByDefault", "()Z", "getDefaultValue", "getEnableTargets", "()Ljava/util/List;", "setEnableTargets", "(Ljava/util/List;)V", "dataType", "Lcom/alightcreative/app/motion/scene/userparam/DataType;", "getDataType", "()Lcom/alightcreative/app/motion/scene/userparam/DataType;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Switch extends UserParameter {
        public static final int $stable = 8;
        private final DataType dataType;
        private final boolean defaultValue;
        private List<String> enableTargets;
        private final boolean enabledByDefault;
        private final String label;
        private final String name;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Switch copy$default(Switch r02, String str, String str2, boolean z2, boolean z3, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = r02.name;
            }
            if ((i2 & 2) != 0) {
                str2 = r02.label;
            }
            if ((i2 & 4) != 0) {
                z2 = r02.enabledByDefault;
            }
            if ((i2 & 8) != 0) {
                z3 = r02.defaultValue;
            }
            if ((i2 & 16) != 0) {
                list = r02.enableTargets;
            }
            List list2 = list;
            boolean z4 = z2;
            return r02.copy(str, str2, z4, z3, list2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getEnabledByDefault() {
            return this.enabledByDefault;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getDefaultValue() {
            return this.defaultValue;
        }

        public final List<String> component5() {
            return this.enableTargets;
        }

        public final Switch copy(String name, String label, boolean enabledByDefault, boolean defaultValue, List<String> enableTargets) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(enableTargets, "enableTargets");
            return new Switch(name, label, enabledByDefault, defaultValue, enableTargets);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Switch)) {
                return false;
            }
            Switch r52 = (Switch) other;
            return Intrinsics.areEqual(this.name, r52.name) && Intrinsics.areEqual(this.label, r52.label) && this.enabledByDefault == r52.enabledByDefault && this.defaultValue == r52.defaultValue && Intrinsics.areEqual(this.enableTargets, r52.enableTargets);
        }

        public int hashCode() {
            return (((((((this.name.hashCode() * 31) + this.label.hashCode()) * 31) + Boolean.hashCode(this.enabledByDefault)) * 31) + Boolean.hashCode(this.defaultValue)) * 31) + this.enableTargets.hashCode();
        }

        public String toString() {
            return "Switch(name=" + this.name + ", label=" + this.label + ", enabledByDefault=" + this.enabledByDefault + ", defaultValue=" + this.defaultValue + ", enableTargets=" + this.enableTargets + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Switch(String name, String label, boolean z2, boolean z3, List<String> enableTargets) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(enableTargets, "enableTargets");
            this.name = name;
            this.label = label;
            this.enabledByDefault = z2;
            this.defaultValue = z3;
            this.enableTargets = enableTargets;
            this.dataType = DataType.BOOLEAN;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public DataType getDataType() {
            return this.dataType;
        }

        public final boolean getDefaultValue() {
            return this.defaultValue;
        }

        public final List<String> getEnableTargets() {
            return this.enableTargets;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public boolean getEnabledByDefault() {
            return this.enabledByDefault;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public String getLabel() {
            return this.label;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public String getName() {
            return this.name;
        }

        public final void setEnableTargets(List<String> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.enableTargets = list;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003JG\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010#\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\u000bHÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006("}, d2 = {"Lcom/alightcreative/app/motion/scene/userparam/UserParameter$Texture;", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "label", "enabledByDefault", "", "srcType", "Lcom/alightcreative/app/motion/scene/userparam/TextureSrcType;", "src", "downsample", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLcom/alightcreative/app/motion/scene/userparam/TextureSrcType;Ljava/lang/String;I)V", "getName", "()Ljava/lang/String;", "getLabel", "getEnabledByDefault", "()Z", "getSrcType", "()Lcom/alightcreative/app/motion/scene/userparam/TextureSrcType;", "getSrc", "getDownsample", "()I", "dataType", "Lcom/alightcreative/app/motion/scene/userparam/DataType;", "getDataType", "()Lcom/alightcreative/app/motion/scene/userparam/DataType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", InneractiveMediationNameConsts.OTHER, "", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Texture extends UserParameter {
        public static final int $stable = 0;
        private final DataType dataType;
        private final int downsample;
        private final boolean enabledByDefault;
        private final String label;
        private final String name;
        private final String src;
        private final TextureSrcType srcType;

        public /* synthetic */ Texture(String str, String str2, boolean z2, TextureSrcType textureSrcType, String str3, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, z2, textureSrcType, str3, (i3 & 32) != 0 ? 1 : i2);
        }

        public static /* synthetic */ Texture copy$default(Texture texture, String str, String str2, boolean z2, TextureSrcType textureSrcType, String str3, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = texture.name;
            }
            if ((i3 & 2) != 0) {
                str2 = texture.label;
            }
            if ((i3 & 4) != 0) {
                z2 = texture.enabledByDefault;
            }
            if ((i3 & 8) != 0) {
                textureSrcType = texture.srcType;
            }
            if ((i3 & 16) != 0) {
                str3 = texture.src;
            }
            if ((i3 & 32) != 0) {
                i2 = texture.downsample;
            }
            String str4 = str3;
            int i5 = i2;
            return texture.copy(str, str2, z2, textureSrcType, str4, i5);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getEnabledByDefault() {
            return this.enabledByDefault;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final TextureSrcType getSrcType() {
            return this.srcType;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getSrc() {
            return this.src;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final int getDownsample() {
            return this.downsample;
        }

        public final Texture copy(String name, String label, boolean enabledByDefault, TextureSrcType srcType, String src, int downsample) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(srcType, "srcType");
            return new Texture(name, label, enabledByDefault, srcType, src, downsample);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Texture)) {
                return false;
            }
            Texture texture = (Texture) other;
            return Intrinsics.areEqual(this.name, texture.name) && Intrinsics.areEqual(this.label, texture.label) && this.enabledByDefault == texture.enabledByDefault && this.srcType == texture.srcType && Intrinsics.areEqual(this.src, texture.src) && this.downsample == texture.downsample;
        }

        public int hashCode() {
            int iHashCode = ((((((this.name.hashCode() * 31) + this.label.hashCode()) * 31) + Boolean.hashCode(this.enabledByDefault)) * 31) + this.srcType.hashCode()) * 31;
            String str = this.src;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.downsample);
        }

        public String toString() {
            return "Texture(name=" + this.name + ", label=" + this.label + ", enabledByDefault=" + this.enabledByDefault + ", srcType=" + this.srcType + ", src=" + this.src + ", downsample=" + this.downsample + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Texture(String name, String label, boolean z2, TextureSrcType srcType, String str, int i2) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(srcType, "srcType");
            this.name = name;
            this.label = label;
            this.enabledByDefault = z2;
            this.srcType = srcType;
            this.src = str;
            this.downsample = i2;
            this.dataType = DataType.TEXTURE;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public DataType getDataType() {
            return this.dataType;
        }

        public final int getDownsample() {
            return this.downsample;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public boolean getEnabledByDefault() {
            return this.enabledByDefault;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public String getLabel() {
            return this.label;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public String getName() {
            return this.name;
        }

        public final String getSrc() {
            return this.src;
        }

        public final TextureSrcType getSrcType() {
            return this.srcType;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\fHÆ\u0003JO\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010&\u001a\u00020\u00062\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006,"}, d2 = {"Lcom/alightcreative/app/motion/scene/userparam/UserParameter$XYZ;", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "label", "enabledByDefault", "", "minOffset", "Lcom/alightcreative/app/motion/scene/Vector3D;", "maxOffset", "defaultValue", "pointType", "Lcom/alightcreative/app/motion/scene/userparam/XYZType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLcom/alightcreative/app/motion/scene/Vector3D;Lcom/alightcreative/app/motion/scene/Vector3D;Lcom/alightcreative/app/motion/scene/Vector3D;Lcom/alightcreative/app/motion/scene/userparam/XYZType;)V", "getName", "()Ljava/lang/String;", "getLabel", "getEnabledByDefault", "()Z", "getMinOffset", "()Lcom/alightcreative/app/motion/scene/Vector3D;", "getMaxOffset", "getDefaultValue", "getPointType", "()Lcom/alightcreative/app/motion/scene/userparam/XYZType;", "dataType", "Lcom/alightcreative/app/motion/scene/userparam/DataType;", "getDataType", "()Lcom/alightcreative/app/motion/scene/userparam/DataType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class XYZ extends UserParameter {
        public static final int $stable = 0;
        private final DataType dataType;
        private final Vector3D defaultValue;
        private final boolean enabledByDefault;
        private final String label;
        private final Vector3D maxOffset;
        private final Vector3D minOffset;
        private final String name;
        private final XYZType pointType;

        public static /* synthetic */ XYZ copy$default(XYZ xyz, String str, String str2, boolean z2, Vector3D vector3D, Vector3D vector3D2, Vector3D vector3D3, XYZType xYZType, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = xyz.name;
            }
            if ((i2 & 2) != 0) {
                str2 = xyz.label;
            }
            if ((i2 & 4) != 0) {
                z2 = xyz.enabledByDefault;
            }
            if ((i2 & 8) != 0) {
                vector3D = xyz.minOffset;
            }
            if ((i2 & 16) != 0) {
                vector3D2 = xyz.maxOffset;
            }
            if ((i2 & 32) != 0) {
                vector3D3 = xyz.defaultValue;
            }
            if ((i2 & 64) != 0) {
                xYZType = xyz.pointType;
            }
            Vector3D vector3D4 = vector3D3;
            XYZType xYZType2 = xYZType;
            Vector3D vector3D5 = vector3D2;
            boolean z3 = z2;
            return xyz.copy(str, str2, z3, vector3D, vector3D5, vector3D4, xYZType2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getEnabledByDefault() {
            return this.enabledByDefault;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Vector3D getMinOffset() {
            return this.minOffset;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Vector3D getMaxOffset() {
            return this.maxOffset;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Vector3D getDefaultValue() {
            return this.defaultValue;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final XYZType getPointType() {
            return this.pointType;
        }

        public final XYZ copy(String name, String label, boolean enabledByDefault, Vector3D minOffset, Vector3D maxOffset, Vector3D defaultValue, XYZType pointType) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(minOffset, "minOffset");
            Intrinsics.checkNotNullParameter(maxOffset, "maxOffset");
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            Intrinsics.checkNotNullParameter(pointType, "pointType");
            return new XYZ(name, label, enabledByDefault, minOffset, maxOffset, defaultValue, pointType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof XYZ)) {
                return false;
            }
            XYZ xyz = (XYZ) other;
            return Intrinsics.areEqual(this.name, xyz.name) && Intrinsics.areEqual(this.label, xyz.label) && this.enabledByDefault == xyz.enabledByDefault && Intrinsics.areEqual(this.minOffset, xyz.minOffset) && Intrinsics.areEqual(this.maxOffset, xyz.maxOffset) && Intrinsics.areEqual(this.defaultValue, xyz.defaultValue) && this.pointType == xyz.pointType;
        }

        public int hashCode() {
            return (((((((((((this.name.hashCode() * 31) + this.label.hashCode()) * 31) + Boolean.hashCode(this.enabledByDefault)) * 31) + this.minOffset.hashCode()) * 31) + this.maxOffset.hashCode()) * 31) + this.defaultValue.hashCode()) * 31) + this.pointType.hashCode();
        }

        public String toString() {
            return "XYZ(name=" + this.name + ", label=" + this.label + ", enabledByDefault=" + this.enabledByDefault + ", minOffset=" + this.minOffset + ", maxOffset=" + this.maxOffset + ", defaultValue=" + this.defaultValue + ", pointType=" + this.pointType + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public XYZ(String name, String label, boolean z2, Vector3D minOffset, Vector3D maxOffset, Vector3D defaultValue, XYZType pointType) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(minOffset, "minOffset");
            Intrinsics.checkNotNullParameter(maxOffset, "maxOffset");
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            Intrinsics.checkNotNullParameter(pointType, "pointType");
            this.name = name;
            this.label = label;
            this.enabledByDefault = z2;
            this.minOffset = minOffset;
            this.maxOffset = maxOffset;
            this.defaultValue = defaultValue;
            this.pointType = pointType;
            this.dataType = DataType.VEC3;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public DataType getDataType() {
            return this.dataType;
        }

        public final Vector3D getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public boolean getEnabledByDefault() {
            return this.enabledByDefault;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public String getLabel() {
            return this.label;
        }

        public final Vector3D getMaxOffset() {
            return this.maxOffset;
        }

        public final Vector3D getMinOffset() {
            return this.minOffset;
        }

        @Override // com.alightcreative.app.motion.scene.userparam.UserParameter
        public String getName() {
            return this.name;
        }

        public final XYZType getPointType() {
            return this.pointType;
        }
    }

    public /* synthetic */ UserParameter(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract DataType getDataType();

    public abstract boolean getEnabledByDefault();

    public abstract String getLabel();

    public abstract String getName();

    private UserParameter() {
    }
}
