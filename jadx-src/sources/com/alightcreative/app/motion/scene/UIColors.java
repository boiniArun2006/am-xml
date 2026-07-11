package com.alightcreative.app.motion.scene;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.app.motion.scene.rendering.RenderEnvironment;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 82\u00020\u0001:\u00018B\u0093\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u0095\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J\t\u00106\u001a\u000207HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014¨\u00069"}, d2 = {"Lcom/alightcreative/app/motion/scene/UIColors;", "", "singleSelectionBg", "Lcom/alightcreative/app/motion/scene/SolidColor;", "singleSelectionFg", "multiSelectionShade", "multiSelectionBg", "multiSelectionFg", "selectableHintBg", "selectableHintFg", "motionPathBg", "motionPathFg", "detailEditBg", "detailEditFg", "outlineEditBg", "outlineEditFg", "activePointFg", "<init>", "(Lcom/alightcreative/app/motion/scene/SolidColor;Lcom/alightcreative/app/motion/scene/SolidColor;Lcom/alightcreative/app/motion/scene/SolidColor;Lcom/alightcreative/app/motion/scene/SolidColor;Lcom/alightcreative/app/motion/scene/SolidColor;Lcom/alightcreative/app/motion/scene/SolidColor;Lcom/alightcreative/app/motion/scene/SolidColor;Lcom/alightcreative/app/motion/scene/SolidColor;Lcom/alightcreative/app/motion/scene/SolidColor;Lcom/alightcreative/app/motion/scene/SolidColor;Lcom/alightcreative/app/motion/scene/SolidColor;Lcom/alightcreative/app/motion/scene/SolidColor;Lcom/alightcreative/app/motion/scene/SolidColor;Lcom/alightcreative/app/motion/scene/SolidColor;)V", "getSingleSelectionBg", "()Lcom/alightcreative/app/motion/scene/SolidColor;", "getSingleSelectionFg", "getMultiSelectionShade", "getMultiSelectionBg", "getMultiSelectionFg", "getSelectableHintBg", "getSelectableHintFg", "getMotionPathBg", "getMotionPathFg", "getDetailEditBg", "getDetailEditFg", "getOutlineEditBg", "getOutlineEditFg", "getActivePointFg", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "Companion", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UIColors {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final UIColors DEFAULT = new UIColors(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    private final SolidColor activePointFg;
    private final SolidColor detailEditBg;
    private final SolidColor detailEditFg;
    private final SolidColor motionPathBg;
    private final SolidColor motionPathFg;
    private final SolidColor multiSelectionBg;
    private final SolidColor multiSelectionFg;
    private final SolidColor multiSelectionShade;
    private final SolidColor outlineEditBg;
    private final SolidColor outlineEditFg;
    private final SolidColor selectableHintBg;
    private final SolidColor selectableHintFg;
    private final SolidColor singleSelectionBg;
    private final SolidColor singleSelectionFg;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/alightcreative/app/motion/scene/UIColors$Companion;", "", "<init>", "()V", "DEFAULT", "Lcom/alightcreative/app/motion/scene/UIColors;", "getDEFAULT", "()Lcom/alightcreative/app/motion/scene/UIColors;", "from", "env", "Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironment;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final UIColors from(RenderEnvironment env) {
            Intrinsics.checkNotNullParameter(env, "env");
            return new UIColors(null, null, RenderEnvironment.DefaultImpls.colorFromAttr$default(env, 2130968779, null, 2, null), RenderEnvironment.DefaultImpls.colorFromAttr$default(env, 2130968731, null, 2, null), RenderEnvironment.DefaultImpls.colorFromAttr$default(env, 2130968731, null, 2, null), null, null, null, null, null, RenderEnvironment.DefaultImpls.colorFromAttr$default(env, 2130968731, null, 2, null), null, null, RenderEnvironment.DefaultImpls.colorFromAttr$default(env, 2130968731, null, 2, null), 7139, null);
        }

        public final UIColors getDEFAULT() {
            return UIColors.DEFAULT;
        }
    }

    public UIColors() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SolidColor getSingleSelectionBg() {
        return this.singleSelectionBg;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final SolidColor getDetailEditBg() {
        return this.detailEditBg;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final SolidColor getDetailEditFg() {
        return this.detailEditFg;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final SolidColor getOutlineEditBg() {
        return this.outlineEditBg;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final SolidColor getOutlineEditFg() {
        return this.outlineEditFg;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final SolidColor getActivePointFg() {
        return this.activePointFg;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SolidColor getSingleSelectionFg() {
        return this.singleSelectionFg;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SolidColor getMultiSelectionShade() {
        return this.multiSelectionShade;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SolidColor getMultiSelectionBg() {
        return this.multiSelectionBg;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final SolidColor getMultiSelectionFg() {
        return this.multiSelectionFg;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final SolidColor getSelectableHintBg() {
        return this.selectableHintBg;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final SolidColor getSelectableHintFg() {
        return this.selectableHintFg;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final SolidColor getMotionPathBg() {
        return this.motionPathBg;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final SolidColor getMotionPathFg() {
        return this.motionPathFg;
    }

    public final UIColors copy(SolidColor singleSelectionBg, SolidColor singleSelectionFg, SolidColor multiSelectionShade, SolidColor multiSelectionBg, SolidColor multiSelectionFg, SolidColor selectableHintBg, SolidColor selectableHintFg, SolidColor motionPathBg, SolidColor motionPathFg, SolidColor detailEditBg, SolidColor detailEditFg, SolidColor outlineEditBg, SolidColor outlineEditFg, SolidColor activePointFg) {
        Intrinsics.checkNotNullParameter(singleSelectionBg, "singleSelectionBg");
        Intrinsics.checkNotNullParameter(singleSelectionFg, "singleSelectionFg");
        Intrinsics.checkNotNullParameter(multiSelectionShade, "multiSelectionShade");
        Intrinsics.checkNotNullParameter(multiSelectionBg, "multiSelectionBg");
        Intrinsics.checkNotNullParameter(multiSelectionFg, "multiSelectionFg");
        Intrinsics.checkNotNullParameter(selectableHintBg, "selectableHintBg");
        Intrinsics.checkNotNullParameter(selectableHintFg, "selectableHintFg");
        Intrinsics.checkNotNullParameter(motionPathBg, "motionPathBg");
        Intrinsics.checkNotNullParameter(motionPathFg, "motionPathFg");
        Intrinsics.checkNotNullParameter(detailEditBg, "detailEditBg");
        Intrinsics.checkNotNullParameter(detailEditFg, "detailEditFg");
        Intrinsics.checkNotNullParameter(outlineEditBg, "outlineEditBg");
        Intrinsics.checkNotNullParameter(outlineEditFg, "outlineEditFg");
        Intrinsics.checkNotNullParameter(activePointFg, "activePointFg");
        return new UIColors(singleSelectionBg, singleSelectionFg, multiSelectionShade, multiSelectionBg, multiSelectionFg, selectableHintBg, selectableHintFg, motionPathBg, motionPathFg, detailEditBg, detailEditFg, outlineEditBg, outlineEditFg, activePointFg);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UIColors)) {
            return false;
        }
        UIColors uIColors = (UIColors) other;
        return Intrinsics.areEqual(this.singleSelectionBg, uIColors.singleSelectionBg) && Intrinsics.areEqual(this.singleSelectionFg, uIColors.singleSelectionFg) && Intrinsics.areEqual(this.multiSelectionShade, uIColors.multiSelectionShade) && Intrinsics.areEqual(this.multiSelectionBg, uIColors.multiSelectionBg) && Intrinsics.areEqual(this.multiSelectionFg, uIColors.multiSelectionFg) && Intrinsics.areEqual(this.selectableHintBg, uIColors.selectableHintBg) && Intrinsics.areEqual(this.selectableHintFg, uIColors.selectableHintFg) && Intrinsics.areEqual(this.motionPathBg, uIColors.motionPathBg) && Intrinsics.areEqual(this.motionPathFg, uIColors.motionPathFg) && Intrinsics.areEqual(this.detailEditBg, uIColors.detailEditBg) && Intrinsics.areEqual(this.detailEditFg, uIColors.detailEditFg) && Intrinsics.areEqual(this.outlineEditBg, uIColors.outlineEditBg) && Intrinsics.areEqual(this.outlineEditFg, uIColors.outlineEditFg) && Intrinsics.areEqual(this.activePointFg, uIColors.activePointFg);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.singleSelectionBg.hashCode() * 31) + this.singleSelectionFg.hashCode()) * 31) + this.multiSelectionShade.hashCode()) * 31) + this.multiSelectionBg.hashCode()) * 31) + this.multiSelectionFg.hashCode()) * 31) + this.selectableHintBg.hashCode()) * 31) + this.selectableHintFg.hashCode()) * 31) + this.motionPathBg.hashCode()) * 31) + this.motionPathFg.hashCode()) * 31) + this.detailEditBg.hashCode()) * 31) + this.detailEditFg.hashCode()) * 31) + this.outlineEditBg.hashCode()) * 31) + this.outlineEditFg.hashCode()) * 31) + this.activePointFg.hashCode();
    }

    public String toString() {
        return "UIColors(singleSelectionBg=" + this.singleSelectionBg + ", singleSelectionFg=" + this.singleSelectionFg + ", multiSelectionShade=" + this.multiSelectionShade + ", multiSelectionBg=" + this.multiSelectionBg + ", multiSelectionFg=" + this.multiSelectionFg + ", selectableHintBg=" + this.selectableHintBg + ", selectableHintFg=" + this.selectableHintFg + ", motionPathBg=" + this.motionPathBg + ", motionPathFg=" + this.motionPathFg + ", detailEditBg=" + this.detailEditBg + ", detailEditFg=" + this.detailEditFg + ", outlineEditBg=" + this.outlineEditBg + ", outlineEditFg=" + this.outlineEditFg + ", activePointFg=" + this.activePointFg + ")";
    }

    public UIColors(SolidColor singleSelectionBg, SolidColor singleSelectionFg, SolidColor multiSelectionShade, SolidColor multiSelectionBg, SolidColor multiSelectionFg, SolidColor selectableHintBg, SolidColor selectableHintFg, SolidColor motionPathBg, SolidColor motionPathFg, SolidColor detailEditBg, SolidColor detailEditFg, SolidColor outlineEditBg, SolidColor outlineEditFg, SolidColor activePointFg) {
        Intrinsics.checkNotNullParameter(singleSelectionBg, "singleSelectionBg");
        Intrinsics.checkNotNullParameter(singleSelectionFg, "singleSelectionFg");
        Intrinsics.checkNotNullParameter(multiSelectionShade, "multiSelectionShade");
        Intrinsics.checkNotNullParameter(multiSelectionBg, "multiSelectionBg");
        Intrinsics.checkNotNullParameter(multiSelectionFg, "multiSelectionFg");
        Intrinsics.checkNotNullParameter(selectableHintBg, "selectableHintBg");
        Intrinsics.checkNotNullParameter(selectableHintFg, "selectableHintFg");
        Intrinsics.checkNotNullParameter(motionPathBg, "motionPathBg");
        Intrinsics.checkNotNullParameter(motionPathFg, "motionPathFg");
        Intrinsics.checkNotNullParameter(detailEditBg, "detailEditBg");
        Intrinsics.checkNotNullParameter(detailEditFg, "detailEditFg");
        Intrinsics.checkNotNullParameter(outlineEditBg, "outlineEditBg");
        Intrinsics.checkNotNullParameter(outlineEditFg, "outlineEditFg");
        Intrinsics.checkNotNullParameter(activePointFg, "activePointFg");
        this.singleSelectionBg = singleSelectionBg;
        this.singleSelectionFg = singleSelectionFg;
        this.multiSelectionShade = multiSelectionShade;
        this.multiSelectionBg = multiSelectionBg;
        this.multiSelectionFg = multiSelectionFg;
        this.selectableHintBg = selectableHintBg;
        this.selectableHintFg = selectableHintFg;
        this.motionPathBg = motionPathBg;
        this.motionPathFg = motionPathFg;
        this.detailEditBg = detailEditBg;
        this.detailEditFg = detailEditFg;
        this.outlineEditBg = outlineEditBg;
        this.outlineEditFg = outlineEditFg;
        this.activePointFg = activePointFg;
    }

    public final SolidColor getActivePointFg() {
        return this.activePointFg;
    }

    public final SolidColor getDetailEditBg() {
        return this.detailEditBg;
    }

    public final SolidColor getDetailEditFg() {
        return this.detailEditFg;
    }

    public final SolidColor getMotionPathBg() {
        return this.motionPathBg;
    }

    public final SolidColor getMotionPathFg() {
        return this.motionPathFg;
    }

    public final SolidColor getMultiSelectionBg() {
        return this.multiSelectionBg;
    }

    public final SolidColor getMultiSelectionFg() {
        return this.multiSelectionFg;
    }

    public final SolidColor getMultiSelectionShade() {
        return this.multiSelectionShade;
    }

    public final SolidColor getOutlineEditBg() {
        return this.outlineEditBg;
    }

    public final SolidColor getOutlineEditFg() {
        return this.outlineEditFg;
    }

    public final SolidColor getSelectableHintBg() {
        return this.selectableHintBg;
    }

    public final SolidColor getSelectableHintFg() {
        return this.selectableHintFg;
    }

    public final SolidColor getSingleSelectionBg() {
        return this.singleSelectionBg;
    }

    public final SolidColor getSingleSelectionFg() {
        return this.singleSelectionFg;
    }

    public /* synthetic */ UIColors(SolidColor solidColor, SolidColor solidColor2, SolidColor solidColor3, SolidColor solidColor4, SolidColor solidColor5, SolidColor solidColor6, SolidColor solidColor7, SolidColor solidColor8, SolidColor solidColor9, SolidColor solidColor10, SolidColor solidColor11, SolidColor solidColor12, SolidColor solidColor13, SolidColor solidColor14, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? SolidColor.INSTANCE.getBLACK() : solidColor, (i2 & 2) != 0 ? SolidColor.INSTANCE.getWHITE() : solidColor2, (i2 & 4) != 0 ? SolidColor.INSTANCE.getBLACK() : solidColor3, (i2 & 8) != 0 ? SolidColor.INSTANCE.getBLACK() : solidColor4, (i2 & 16) != 0 ? SolidColor.INSTANCE.getGREEN() : solidColor5, (i2 & 32) != 0 ? SolidColor.INSTANCE.getBLACK() : solidColor6, (i2 & 64) != 0 ? SolidColor.INSTANCE.getRED() : solidColor7, (i2 & 128) != 0 ? new SolidColor(0.7f, 0.7f, 0.7f, 0.6f) : solidColor8, (i2 & 256) != 0 ? SolidColor.INSTANCE.getBLACK() : solidColor9, (i2 & 512) != 0 ? SolidColor.INSTANCE.getBLACK() : solidColor10, (i2 & 1024) != 0 ? SolidColor.INSTANCE.getRED() : solidColor11, (i2 & 2048) != 0 ? SolidColor.INSTANCE.getWHITE() : solidColor12, (i2 & 4096) != 0 ? SolidColor.INSTANCE.getBLACK() : solidColor13, (i2 & 8192) != 0 ? SolidColor.INSTANCE.getRED() : solidColor14);
    }
}
