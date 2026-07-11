package com.alightcreative.app.motion.scene.visualeffect;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u001f\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\"\u001a\u00020\nH\u0016J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\u0015\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003J\t\u0010(\u001a\u00020\fHÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0\u000fHÆ\u0003Ja\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000fHÆ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010!\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/alightcreative/app/motion/scene/visualeffect/KeyableVisualEffectRef;", "", "id", "", "instanceId", "", "parameters", "", "Lcom/alightcreative/app/motion/scene/userparam/KeyableUserParameterValue;", "renderGroup", "", "hidden", "", "locallyApplied", "disabledRenderGroups", "", "<init>", "(Ljava/lang/String;JLjava/util/Map;IZZLjava/util/Set;)V", "getId", "()Ljava/lang/String;", "getInstanceId", "()J", "getParameters", "()Ljava/util/Map;", "getRenderGroup", "()I", "getHidden", "()Z", "getLocallyApplied", "getDisabledRenderGroups", "()Ljava/util/Set;", "equals", InneractiveMediationNameConsts.OTHER, "_hashCode", "hashCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class KeyableVisualEffectRef {
    public static final int $stable = 8;
    private int _hashCode;
    private final Set<Integer> disabledRenderGroups;
    private final boolean hidden;
    private final String id;
    private final long instanceId;
    private final boolean locallyApplied;
    private final Map<String, KeyableUserParameterValue> parameters;
    private final int renderGroup;

    public KeyableVisualEffectRef(String id, long j2, Map<String, KeyableUserParameterValue> parameters, int i2, boolean z2, boolean z3, Set<Integer> disabledRenderGroups) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(disabledRenderGroups, "disabledRenderGroups");
        this.id = id;
        this.instanceId = j2;
        this.parameters = parameters;
        this.renderGroup = i2;
        this.hidden = z2;
        this.locallyApplied = z3;
        this.disabledRenderGroups = disabledRenderGroups;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KeyableVisualEffectRef copy$default(KeyableVisualEffectRef keyableVisualEffectRef, String str, long j2, Map map, int i2, boolean z2, boolean z3, Set set, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = keyableVisualEffectRef.id;
        }
        if ((i3 & 2) != 0) {
            j2 = keyableVisualEffectRef.instanceId;
        }
        if ((i3 & 4) != 0) {
            map = keyableVisualEffectRef.parameters;
        }
        if ((i3 & 8) != 0) {
            i2 = keyableVisualEffectRef.renderGroup;
        }
        if ((i3 & 16) != 0) {
            z2 = keyableVisualEffectRef.hidden;
        }
        if ((i3 & 32) != 0) {
            z3 = keyableVisualEffectRef.locallyApplied;
        }
        if ((i3 & 64) != 0) {
            set = keyableVisualEffectRef.disabledRenderGroups;
        }
        Set set2 = set;
        boolean z4 = z2;
        Map map2 = map;
        return keyableVisualEffectRef.copy(str, j2, map2, i2, z4, z3, set2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getInstanceId() {
        return this.instanceId;
    }

    public final Map<String, KeyableUserParameterValue> component3() {
        return this.parameters;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getRenderGroup() {
        return this.renderGroup;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getHidden() {
        return this.hidden;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getLocallyApplied() {
        return this.locallyApplied;
    }

    public final Set<Integer> component7() {
        return this.disabledRenderGroups;
    }

    public final KeyableVisualEffectRef copy(String id, long instanceId, Map<String, KeyableUserParameterValue> parameters, int renderGroup, boolean hidden, boolean locallyApplied, Set<Integer> disabledRenderGroups) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(disabledRenderGroups, "disabledRenderGroups");
        return new KeyableVisualEffectRef(id, instanceId, parameters, renderGroup, hidden, locallyApplied, disabledRenderGroups);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(KeyableVisualEffectRef.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef");
        KeyableVisualEffectRef keyableVisualEffectRef = (KeyableVisualEffectRef) other;
        return Intrinsics.areEqual(this.id, keyableVisualEffectRef.id) && this.instanceId == keyableVisualEffectRef.instanceId && Intrinsics.areEqual(this.parameters, keyableVisualEffectRef.parameters) && this.renderGroup == keyableVisualEffectRef.renderGroup && Intrinsics.areEqual(this.disabledRenderGroups, keyableVisualEffectRef.disabledRenderGroups);
    }

    public String toString() {
        return "KeyableVisualEffectRef(id=" + this.id + ", instanceId=" + this.instanceId + ", parameters=" + this.parameters + ", renderGroup=" + this.renderGroup + ", hidden=" + this.hidden + ", locallyApplied=" + this.locallyApplied + ", disabledRenderGroups=" + this.disabledRenderGroups + ")";
    }

    public final Set<Integer> getDisabledRenderGroups() {
        return this.disabledRenderGroups;
    }

    public final boolean getHidden() {
        return this.hidden;
    }

    public final String getId() {
        return this.id;
    }

    public final long getInstanceId() {
        return this.instanceId;
    }

    public final boolean getLocallyApplied() {
        return this.locallyApplied;
    }

    public final Map<String, KeyableUserParameterValue> getParameters() {
        return this.parameters;
    }

    public final int getRenderGroup() {
        return this.renderGroup;
    }

    public int hashCode() {
        int i2 = this._hashCode;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = (((((((this.id.hashCode() * 31) + Long.hashCode(this.instanceId)) * 31) + this.parameters.hashCode()) * 31) + this.renderGroup) * 31) + this.disabledRenderGroups.hashCode();
        this._hashCode = iHashCode;
        return iHashCode;
    }

    public /* synthetic */ KeyableVisualEffectRef(String str, long j2, Map map, int i2, boolean z2, boolean z3, Set set, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j2, (i3 & 4) != 0 ? MapsKt.emptyMap() : map, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? false : z2, (i3 & 32) != 0 ? false : z3, (i3 & 64) != 0 ? SetsKt.emptySet() : set);
    }
}
