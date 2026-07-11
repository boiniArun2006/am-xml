package com.alightcreative.app.motion.scene.liveshape;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/alightcreative/app/motion/scene/liveshape/LiveShapeRef;", "", "id", "", "paramValues", "", "Lcom/alightcreative/app/motion/scene/userparam/KeyableUserParameterValue;", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getId", "()Ljava/lang/String;", "getParamValues", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "Companion", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LiveShapeRef {
    private final String id;
    private final Map<String, KeyableUserParameterValue> paramValues;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final LiveShapeRef NONE = new LiveShapeRef(0 == true ? 1 : 0, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/alightcreative/app/motion/scene/liveshape/LiveShapeRef$Companion;", "", "<init>", "()V", "NONE", "Lcom/alightcreative/app/motion/scene/liveshape/LiveShapeRef;", "getNONE", "()Lcom/alightcreative/app/motion/scene/liveshape/LiveShapeRef;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final LiveShapeRef getNONE() {
            return LiveShapeRef.NONE;
        }
    }

    public LiveShapeRef(String str, Map<String, KeyableUserParameterValue> paramValues) {
        Intrinsics.checkNotNullParameter(paramValues, "paramValues");
        this.id = str;
        this.paramValues = paramValues;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiveShapeRef copy$default(LiveShapeRef liveShapeRef, String str, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = liveShapeRef.id;
        }
        if ((i2 & 2) != 0) {
            map = liveShapeRef.paramValues;
        }
        return liveShapeRef.copy(str, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final Map<String, KeyableUserParameterValue> component2() {
        return this.paramValues;
    }

    public final LiveShapeRef copy(String id, Map<String, KeyableUserParameterValue> paramValues) {
        Intrinsics.checkNotNullParameter(paramValues, "paramValues");
        return new LiveShapeRef(id, paramValues);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveShapeRef)) {
            return false;
        }
        LiveShapeRef liveShapeRef = (LiveShapeRef) other;
        return Intrinsics.areEqual(this.id, liveShapeRef.id) && Intrinsics.areEqual(this.paramValues, liveShapeRef.paramValues);
    }

    public int hashCode() {
        String str = this.id;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.paramValues.hashCode();
    }

    public String toString() {
        return "LiveShapeRef(id=" + this.id + ", paramValues=" + this.paramValues + ")";
    }

    public final String getId() {
        return this.id;
    }

    public final Map<String, KeyableUserParameterValue> getParamValues() {
        return this.paramValues;
    }

    public /* synthetic */ LiveShapeRef(String str, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? MapsKt.emptyMap() : map);
    }
}
