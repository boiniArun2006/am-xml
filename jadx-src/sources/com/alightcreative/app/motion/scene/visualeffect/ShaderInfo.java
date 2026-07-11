package com.alightcreative.app.motion.scene.visualeffect;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\tHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/alightcreative/app/motion/scene/visualeffect/ShaderInfo;", "", "type", "Lcom/alightcreative/app/motion/scene/visualeffect/ShaderType;", "source", "", "precision", "Lcom/alightcreative/app/motion/scene/visualeffect/ShaderPrecision;", "groupId", "", "<init>", "(Lcom/alightcreative/app/motion/scene/visualeffect/ShaderType;Ljava/lang/String;Lcom/alightcreative/app/motion/scene/visualeffect/ShaderPrecision;I)V", "getType", "()Lcom/alightcreative/app/motion/scene/visualeffect/ShaderType;", "getSource", "()Ljava/lang/String;", "getPrecision", "()Lcom/alightcreative/app/motion/scene/visualeffect/ShaderPrecision;", "getGroupId", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ShaderInfo {
    public static final int $stable = 0;
    private final int groupId;
    private final ShaderPrecision precision;
    private final String source;
    private final ShaderType type;

    public static /* synthetic */ ShaderInfo copy$default(ShaderInfo shaderInfo, ShaderType shaderType, String str, ShaderPrecision shaderPrecision, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            shaderType = shaderInfo.type;
        }
        if ((i3 & 2) != 0) {
            str = shaderInfo.source;
        }
        if ((i3 & 4) != 0) {
            shaderPrecision = shaderInfo.precision;
        }
        if ((i3 & 8) != 0) {
            i2 = shaderInfo.groupId;
        }
        return shaderInfo.copy(shaderType, str, shaderPrecision, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ShaderType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ShaderPrecision getPrecision() {
        return this.precision;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getGroupId() {
        return this.groupId;
    }

    public final ShaderInfo copy(ShaderType type, String source, ShaderPrecision precision, int groupId) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(precision, "precision");
        return new ShaderInfo(type, source, precision, groupId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShaderInfo)) {
            return false;
        }
        ShaderInfo shaderInfo = (ShaderInfo) other;
        return this.type == shaderInfo.type && Intrinsics.areEqual(this.source, shaderInfo.source) && this.precision == shaderInfo.precision && this.groupId == shaderInfo.groupId;
    }

    public int hashCode() {
        return (((((this.type.hashCode() * 31) + this.source.hashCode()) * 31) + this.precision.hashCode()) * 31) + Integer.hashCode(this.groupId);
    }

    public String toString() {
        return "ShaderInfo(type=" + this.type + ", source=" + this.source + ", precision=" + this.precision + ", groupId=" + this.groupId + ")";
    }

    public ShaderInfo(ShaderType type, String source, ShaderPrecision precision, int i2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(precision, "precision");
        this.type = type;
        this.source = source;
        this.precision = precision;
        this.groupId = i2;
    }

    public final int getGroupId() {
        return this.groupId;
    }

    public final ShaderPrecision getPrecision() {
        return this.precision;
    }

    public final String getSource() {
        return this.source;
    }

    public final ShaderType getType() {
        return this.type;
    }
}
