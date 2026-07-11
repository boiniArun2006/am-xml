package com.alightcreative.app.motion.scene.visualeffect;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.app.motion.scene.userparam.UserParameterValue;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\nHÆ\u0003JC\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\bHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/alightcreative/app/motion/scene/visualeffect/VisualEffectRef;", "", "id", "", "parameters", "", "Lcom/alightcreative/app/motion/scene/userparam/UserParameterValue;", "renderGroup", "", "disabledRenderGroups", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;ILjava/util/Set;)V", "getId", "()Ljava/lang/String;", "getParameters", "()Ljava/util/Map;", "getRenderGroup", "()I", "getDisabledRenderGroups", "()Ljava/util/Set;", "component1", "component2", "component3", "component4", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class VisualEffectRef {
    public static final int $stable = 8;
    private final Set<Integer> disabledRenderGroups;
    private final String id;
    private final Map<String, UserParameterValue> parameters;
    private final int renderGroup;

    public VisualEffectRef(String id, Map<String, UserParameterValue> parameters, int i2, Set<Integer> disabledRenderGroups) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(disabledRenderGroups, "disabledRenderGroups");
        this.id = id;
        this.parameters = parameters;
        this.renderGroup = i2;
        this.disabledRenderGroups = disabledRenderGroups;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VisualEffectRef copy$default(VisualEffectRef visualEffectRef, String str, Map map, int i2, Set set, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = visualEffectRef.id;
        }
        if ((i3 & 2) != 0) {
            map = visualEffectRef.parameters;
        }
        if ((i3 & 4) != 0) {
            i2 = visualEffectRef.renderGroup;
        }
        if ((i3 & 8) != 0) {
            set = visualEffectRef.disabledRenderGroups;
        }
        return visualEffectRef.copy(str, map, i2, set);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final Map<String, UserParameterValue> component2() {
        return this.parameters;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getRenderGroup() {
        return this.renderGroup;
    }

    public final Set<Integer> component4() {
        return this.disabledRenderGroups;
    }

    public final VisualEffectRef copy(String id, Map<String, UserParameterValue> parameters, int renderGroup, Set<Integer> disabledRenderGroups) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(disabledRenderGroups, "disabledRenderGroups");
        return new VisualEffectRef(id, parameters, renderGroup, disabledRenderGroups);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VisualEffectRef)) {
            return false;
        }
        VisualEffectRef visualEffectRef = (VisualEffectRef) other;
        return Intrinsics.areEqual(this.id, visualEffectRef.id) && Intrinsics.areEqual(this.parameters, visualEffectRef.parameters) && this.renderGroup == visualEffectRef.renderGroup && Intrinsics.areEqual(this.disabledRenderGroups, visualEffectRef.disabledRenderGroups);
    }

    public int hashCode() {
        return (((((this.id.hashCode() * 31) + this.parameters.hashCode()) * 31) + Integer.hashCode(this.renderGroup)) * 31) + this.disabledRenderGroups.hashCode();
    }

    public String toString() {
        return "VisualEffectRef(id=" + this.id + ", parameters=" + this.parameters + ", renderGroup=" + this.renderGroup + ", disabledRenderGroups=" + this.disabledRenderGroups + ")";
    }

    public final Set<Integer> getDisabledRenderGroups() {
        return this.disabledRenderGroups;
    }

    public final String getId() {
        return this.id;
    }

    public final Map<String, UserParameterValue> getParameters() {
        return this.parameters;
    }

    public final int getRenderGroup() {
        return this.renderGroup;
    }

    public /* synthetic */ VisualEffectRef(String str, Map map, int i2, Set set, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? MapsKt.emptyMap() : map, i2, set);
    }
}
