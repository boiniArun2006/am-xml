package com.alightcreative.app.motion.scene.visualeffect;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/alightcreative/app/motion/scene/visualeffect/ShaderGroup;", "", "id", "", "enabledByDefault", "", "shaders", "", "Lcom/alightcreative/app/motion/scene/visualeffect/ShaderType;", "Lcom/alightcreative/app/motion/scene/visualeffect/ShaderInfo;", "<init>", "(IZLjava/util/Map;)V", "getId", "()I", "getEnabledByDefault", "()Z", "getShaders", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", InneractiveMediationNameConsts.OTHER, "hashCode", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ShaderGroup {
    public static final int $stable = 8;
    private final boolean enabledByDefault;
    private final int id;
    private final Map<ShaderType, ShaderInfo> shaders;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShaderGroup copy$default(ShaderGroup shaderGroup, int i2, boolean z2, Map map, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = shaderGroup.id;
        }
        if ((i3 & 2) != 0) {
            z2 = shaderGroup.enabledByDefault;
        }
        if ((i3 & 4) != 0) {
            map = shaderGroup.shaders;
        }
        return shaderGroup.copy(i2, z2, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getEnabledByDefault() {
        return this.enabledByDefault;
    }

    public final Map<ShaderType, ShaderInfo> component3() {
        return this.shaders;
    }

    public final ShaderGroup copy(int id, boolean enabledByDefault, Map<ShaderType, ShaderInfo> shaders) {
        Intrinsics.checkNotNullParameter(shaders, "shaders");
        return new ShaderGroup(id, enabledByDefault, shaders);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShaderGroup)) {
            return false;
        }
        ShaderGroup shaderGroup = (ShaderGroup) other;
        return this.id == shaderGroup.id && this.enabledByDefault == shaderGroup.enabledByDefault && Intrinsics.areEqual(this.shaders, shaderGroup.shaders);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.id) * 31) + Boolean.hashCode(this.enabledByDefault)) * 31) + this.shaders.hashCode();
    }

    public String toString() {
        return "ShaderGroup(id=" + this.id + ", enabledByDefault=" + this.enabledByDefault + ", shaders=" + this.shaders + ")";
    }

    public ShaderGroup(int i2, boolean z2, Map<ShaderType, ShaderInfo> shaders) {
        Intrinsics.checkNotNullParameter(shaders, "shaders");
        this.id = i2;
        this.enabledByDefault = z2;
        this.shaders = shaders;
    }

    public final boolean getEnabledByDefault() {
        return this.enabledByDefault;
    }

    public final int getId() {
        return this.id;
    }

    public final Map<ShaderType, ShaderInfo> getShaders() {
        return this.shaders;
    }
}
