package com.alightcreative.app.motion.scene.liveshape;

import com.alightcreative.app.motion.scene.userparam.UserParameterValue;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/alightcreative/app/motion/scene/liveshape/ShapeInstanceDesc;", "", "id", "", "params", "", "Lcom/alightcreative/app/motion/scene/userparam/UserParameterValue;", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getId", "()Ljava/lang/String;", "getParams", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class ShapeInstanceDesc {
    private final String id;
    private final Map<String, UserParameterValue> params;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShapeInstanceDesc copy$default(ShapeInstanceDesc shapeInstanceDesc, String str, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = shapeInstanceDesc.id;
        }
        if ((i2 & 2) != 0) {
            map = shapeInstanceDesc.params;
        }
        return shapeInstanceDesc.copy(str, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final Map<String, UserParameterValue> component2() {
        return this.params;
    }

    public final ShapeInstanceDesc copy(String id, Map<String, UserParameterValue> params) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(params, "params");
        return new ShapeInstanceDesc(id, params);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShapeInstanceDesc)) {
            return false;
        }
        ShapeInstanceDesc shapeInstanceDesc = (ShapeInstanceDesc) other;
        return Intrinsics.areEqual(this.id, shapeInstanceDesc.id) && Intrinsics.areEqual(this.params, shapeInstanceDesc.params);
    }

    public int hashCode() {
        return (this.id.hashCode() * 31) + this.params.hashCode();
    }

    public String toString() {
        return "ShapeInstanceDesc(id=" + this.id + ", params=" + this.params + ")";
    }

    public ShapeInstanceDesc(String id, Map<String, UserParameterValue> params) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(params, "params");
        this.id = id;
        this.params = params;
    }

    public final String getId() {
        return this.id;
    }

    public final Map<String, UserParameterValue> getParams() {
        return this.params;
    }
}
