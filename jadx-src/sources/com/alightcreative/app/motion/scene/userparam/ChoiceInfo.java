package com.alightcreative.app.motion.scene.userparam;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J-\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/alightcreative/app/motion/scene/userparam/ChoiceInfo;", "", "value", "", "label", "", "enableTargets", "", "<init>", "(ILjava/lang/String;Ljava/util/List;)V", "getValue", "()I", "getLabel", "()Ljava/lang/String;", "getEnableTargets", "()Ljava/util/List;", "setEnableTargets", "(Ljava/util/List;)V", "component1", "component2", "component3", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChoiceInfo {
    public static final int $stable = 8;
    private List<String> enableTargets;
    private final String label;
    private final int value;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChoiceInfo copy$default(ChoiceInfo choiceInfo, int i2, String str, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = choiceInfo.value;
        }
        if ((i3 & 2) != 0) {
            str = choiceInfo.label;
        }
        if ((i3 & 4) != 0) {
            list = choiceInfo.enableTargets;
        }
        return choiceInfo.copy(i2, str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    public final List<String> component3() {
        return this.enableTargets;
    }

    public final ChoiceInfo copy(int value, String label, List<String> enableTargets) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(enableTargets, "enableTargets");
        return new ChoiceInfo(value, label, enableTargets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChoiceInfo)) {
            return false;
        }
        ChoiceInfo choiceInfo = (ChoiceInfo) other;
        return this.value == choiceInfo.value && Intrinsics.areEqual(this.label, choiceInfo.label) && Intrinsics.areEqual(this.enableTargets, choiceInfo.enableTargets);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.value) * 31) + this.label.hashCode()) * 31) + this.enableTargets.hashCode();
    }

    public String toString() {
        return "ChoiceInfo(value=" + this.value + ", label=" + this.label + ", enableTargets=" + this.enableTargets + ")";
    }

    public ChoiceInfo(int i2, String label, List<String> enableTargets) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(enableTargets, "enableTargets");
        this.value = i2;
        this.label = label;
        this.enableTargets = enableTargets;
    }

    public final List<String> getEnableTargets() {
        return this.enableTargets;
    }

    public final String getLabel() {
        return this.label;
    }

    public final int getValue() {
        return this.value;
    }

    public final void setEnableTargets(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.enableTargets = list;
    }
}
