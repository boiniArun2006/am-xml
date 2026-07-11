package com.alightcreative.app.motion.scene.scripting;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/alightcreative/app/motion/scene/scripting/ACScript;", "", "source", "", "type", "Lcom/alightcreative/app/motion/scene/scripting/ACScriptType;", "<init>", "(Ljava/lang/String;Lcom/alightcreative/app/motion/scene/scripting/ACScriptType;)V", "getSource", "()Ljava/lang/String;", "getType", "()Lcom/alightcreative/app/motion/scene/scripting/ACScriptType;", "component1", "component2", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ACScript {
    public static final int $stable = 0;
    private final String source;
    private final ACScriptType type;

    public static /* synthetic */ ACScript copy$default(ACScript aCScript, String str, ACScriptType aCScriptType, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = aCScript.source;
        }
        if ((i2 & 2) != 0) {
            aCScriptType = aCScript.type;
        }
        return aCScript.copy(str, aCScriptType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ACScriptType getType() {
        return this.type;
    }

    public final ACScript copy(String source, ACScriptType type) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(type, "type");
        return new ACScript(source, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ACScript)) {
            return false;
        }
        ACScript aCScript = (ACScript) other;
        return Intrinsics.areEqual(this.source, aCScript.source) && this.type == aCScript.type;
    }

    public int hashCode() {
        return (this.source.hashCode() * 31) + this.type.hashCode();
    }

    public String toString() {
        return "ACScript(source=" + this.source + ", type=" + this.type + ")";
    }

    public ACScript(String source, ACScriptType type) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(type, "type");
        this.source = source;
        this.type = type;
    }

    public final String getSource() {
        return this.source;
    }

    public final ACScriptType getType() {
        return this.type;
    }
}
