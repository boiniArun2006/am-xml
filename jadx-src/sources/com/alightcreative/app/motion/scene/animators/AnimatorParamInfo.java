package com.alightcreative.app.motion.scene.animators;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\r\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\nHÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\f\b\u0002\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/alightcreative/app/motion/scene/animators/AnimatorParamInfo;", "", "id", "", "getLabel", "Lkotlin/Function1;", "Landroid/content/Context;", "control", "Lcom/alightcreative/app/motion/scene/animators/UIControl;", "parentAnimatorInfo", "Lcom/alightcreative/app/motion/scene/animators/AnimatorInfo;", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/alightcreative/app/motion/scene/animators/UIControl;Lcom/alightcreative/app/motion/scene/animators/AnimatorInfo;)V", "getId", "()Ljava/lang/String;", "getGetLabel", "()Lkotlin/jvm/functions/Function1;", "getControl", "()Lcom/alightcreative/app/motion/scene/animators/UIControl;", "getParentAnimatorInfo", "()Lcom/alightcreative/app/motion/scene/animators/AnimatorInfo;", "component1", "component2", "component3", "component4", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AnimatorParamInfo {
    public static final int $stable = 8;
    private final UIControl control;
    private final Function1<Context, String> getLabel;
    private final String id;
    private final AnimatorInfo<?> parentAnimatorInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnimatorParamInfo copy$default(AnimatorParamInfo animatorParamInfo, String str, Function1 function1, UIControl uIControl, AnimatorInfo animatorInfo, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = animatorParamInfo.id;
        }
        if ((i2 & 2) != 0) {
            function1 = animatorParamInfo.getLabel;
        }
        if ((i2 & 4) != 0) {
            uIControl = animatorParamInfo.control;
        }
        if ((i2 & 8) != 0) {
            animatorInfo = animatorParamInfo.parentAnimatorInfo;
        }
        return animatorParamInfo.copy(str, function1, uIControl, animatorInfo);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final Function1<Context, String> component2() {
        return this.getLabel;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final UIControl getControl() {
        return this.control;
    }

    public final AnimatorInfo<?> component4() {
        return this.parentAnimatorInfo;
    }

    public final AnimatorParamInfo copy(String id, Function1<? super Context, String> getLabel, UIControl control, AnimatorInfo<?> parentAnimatorInfo) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(getLabel, "getLabel");
        Intrinsics.checkNotNullParameter(control, "control");
        Intrinsics.checkNotNullParameter(parentAnimatorInfo, "parentAnimatorInfo");
        return new AnimatorParamInfo(id, getLabel, control, parentAnimatorInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnimatorParamInfo)) {
            return false;
        }
        AnimatorParamInfo animatorParamInfo = (AnimatorParamInfo) other;
        return Intrinsics.areEqual(this.id, animatorParamInfo.id) && Intrinsics.areEqual(this.getLabel, animatorParamInfo.getLabel) && Intrinsics.areEqual(this.control, animatorParamInfo.control) && Intrinsics.areEqual(this.parentAnimatorInfo, animatorParamInfo.parentAnimatorInfo);
    }

    public int hashCode() {
        return (((((this.id.hashCode() * 31) + this.getLabel.hashCode()) * 31) + this.control.hashCode()) * 31) + this.parentAnimatorInfo.hashCode();
    }

    public String toString() {
        return "AnimatorParamInfo(id=" + this.id + ", getLabel=" + this.getLabel + ", control=" + this.control + ", parentAnimatorInfo=" + this.parentAnimatorInfo + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnimatorParamInfo(String id, Function1<? super Context, String> getLabel, UIControl control, AnimatorInfo<?> parentAnimatorInfo) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(getLabel, "getLabel");
        Intrinsics.checkNotNullParameter(control, "control");
        Intrinsics.checkNotNullParameter(parentAnimatorInfo, "parentAnimatorInfo");
        this.id = id;
        this.getLabel = getLabel;
        this.control = control;
        this.parentAnimatorInfo = parentAnimatorInfo;
    }

    public final UIControl getControl() {
        return this.control;
    }

    public final Function1<Context, String> getGetLabel() {
        return this.getLabel;
    }

    public final String getId() {
        return this.id;
    }

    public final AnimatorInfo<?> getParentAnimatorInfo() {
        return this.parentAnimatorInfo;
    }
}
