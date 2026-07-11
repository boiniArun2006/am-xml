package com.alightcreative.app.motion.scene.animators;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/alightcreative/app/motion/scene/animators/UIControl;", "", "<init>", "()V", "Slider", "Switch", "Lcom/alightcreative/app/motion/scene/animators/UIControl$Slider;", "Lcom/alightcreative/app/motion/scene/animators/UIControl$Switch;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class UIControl {
    public static final int $stable = 0;

    @StabilityInferred
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/alightcreative/app/motion/scene/animators/UIControl$Slider;", "Lcom/alightcreative/app/motion/scene/animators/UIControl;", "min", "", "max", "steps", "", "<init>", "(DDI)V", "getMin", "()D", "getMax", "getSteps", "()I", "component1", "component2", "component3", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "", "hashCode", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Slider extends UIControl {
        public static final int $stable = 0;
        private final double max;
        private final double min;
        private final int steps;

        public Slider(double d2, double d4, int i2) {
            super(null);
            this.min = d2;
            this.max = d4;
            this.steps = i2;
        }

        public static /* synthetic */ Slider copy$default(Slider slider, double d2, double d4, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                d2 = slider.min;
            }
            double d5 = d2;
            if ((i3 & 2) != 0) {
                d4 = slider.max;
            }
            double d6 = d4;
            if ((i3 & 4) != 0) {
                i2 = slider.steps;
            }
            return slider.copy(d5, d6, i2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final double getMin() {
            return this.min;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final double getMax() {
            return this.max;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getSteps() {
            return this.steps;
        }

        public final Slider copy(double min, double max, int steps) {
            return new Slider(min, max, steps);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Slider)) {
                return false;
            }
            Slider slider = (Slider) other;
            return Double.compare(this.min, slider.min) == 0 && Double.compare(this.max, slider.max) == 0 && this.steps == slider.steps;
        }

        public int hashCode() {
            return (((Double.hashCode(this.min) * 31) + Double.hashCode(this.max)) * 31) + Integer.hashCode(this.steps);
        }

        public String toString() {
            return "Slider(min=" + this.min + ", max=" + this.max + ", steps=" + this.steps + ")";
        }

        public final double getMax() {
            return this.max;
        }

        public final double getMin() {
            return this.min;
        }

        public final int getSteps() {
            return this.steps;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u00126\u0010\u0002\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\u0004\b\u000b\u0010\fJ9\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003HÆ\u0003JC\u0010\u0010\u001a\u00020\u000028\b\u0002\u0010\u0002\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\nHÖ\u0001RA\u0010\u0002\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/alightcreative/app/motion/scene/animators/UIControl$Switch;", "Lcom/alightcreative/app/motion/scene/animators/UIControl;", "getLabel", "Lkotlin/Function2;", "Landroid/content/Context;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "context", "", "fieldValue", "", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "getGetLabel", "()Lkotlin/jvm/functions/Function2;", "component1", "copy", "equals", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Switch extends UIControl {
        public static final int $stable = 0;
        private final Function2<Context, Boolean, String> getLabel;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Switch copy$default(Switch r02, Function2 function2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                function2 = r02.getLabel;
            }
            return r02.copy(function2);
        }

        public final Function2<Context, Boolean, String> component1() {
            return this.getLabel;
        }

        public final Switch copy(Function2<? super Context, ? super Boolean, String> getLabel) {
            Intrinsics.checkNotNullParameter(getLabel, "getLabel");
            return new Switch(getLabel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Switch) && Intrinsics.areEqual(this.getLabel, ((Switch) other).getLabel);
        }

        public int hashCode() {
            return this.getLabel.hashCode();
        }

        public String toString() {
            return "Switch(getLabel=" + this.getLabel + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Switch(Function2<? super Context, ? super Boolean, String> getLabel) {
            super(null);
            Intrinsics.checkNotNullParameter(getLabel, "getLabel");
            this.getLabel = getLabel;
        }

        public final Function2<Context, Boolean, String> getGetLabel() {
            return this.getLabel;
        }
    }

    public /* synthetic */ UIControl(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private UIControl() {
    }
}
