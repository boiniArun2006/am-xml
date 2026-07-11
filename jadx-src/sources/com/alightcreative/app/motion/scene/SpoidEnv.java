package com.alightcreative.app.motion.scene;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001d\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003JK\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR%\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/alightcreative/app/motion/scene/SpoidEnv;", "", "location", "Lcom/alightcreative/app/motion/scene/Vector2D;", "previewWH", "renderPos", "callback", "Lkotlin/Function2;", "Lcom/alightcreative/app/motion/scene/SolidColor;", "", "<init>", "(Lcom/alightcreative/app/motion/scene/Vector2D;Lcom/alightcreative/app/motion/scene/Vector2D;Lcom/alightcreative/app/motion/scene/Vector2D;Lkotlin/jvm/functions/Function2;)V", "getLocation", "()Lcom/alightcreative/app/motion/scene/Vector2D;", "getPreviewWH", "getRenderPos", "getCallback", "()Lkotlin/jvm/functions/Function2;", "component1", "component2", "component3", "component4", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SpoidEnv {
    public static final int $stable = 0;
    private final Function2<Vector2D, SolidColor, Unit> callback;
    private final Vector2D location;
    private final Vector2D previewWH;
    private final Vector2D renderPos;

    public SpoidEnv() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpoidEnv copy$default(SpoidEnv spoidEnv, Vector2D vector2D, Vector2D vector2D2, Vector2D vector2D3, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            vector2D = spoidEnv.location;
        }
        if ((i2 & 2) != 0) {
            vector2D2 = spoidEnv.previewWH;
        }
        if ((i2 & 4) != 0) {
            vector2D3 = spoidEnv.renderPos;
        }
        if ((i2 & 8) != 0) {
            function2 = spoidEnv.callback;
        }
        return spoidEnv.copy(vector2D, vector2D2, vector2D3, function2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Vector2D getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Vector2D getPreviewWH() {
        return this.previewWH;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Vector2D getRenderPos() {
        return this.renderPos;
    }

    public final Function2<Vector2D, SolidColor, Unit> component4() {
        return this.callback;
    }

    public final SpoidEnv copy(Vector2D location, Vector2D previewWH, Vector2D renderPos, Function2<? super Vector2D, ? super SolidColor, Unit> callback) {
        return new SpoidEnv(location, previewWH, renderPos, callback);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpoidEnv)) {
            return false;
        }
        SpoidEnv spoidEnv = (SpoidEnv) other;
        return Intrinsics.areEqual(this.location, spoidEnv.location) && Intrinsics.areEqual(this.previewWH, spoidEnv.previewWH) && Intrinsics.areEqual(this.renderPos, spoidEnv.renderPos) && Intrinsics.areEqual(this.callback, spoidEnv.callback);
    }

    public int hashCode() {
        Vector2D vector2D = this.location;
        int iHashCode = (vector2D == null ? 0 : vector2D.hashCode()) * 31;
        Vector2D vector2D2 = this.previewWH;
        int iHashCode2 = (iHashCode + (vector2D2 == null ? 0 : vector2D2.hashCode())) * 31;
        Vector2D vector2D3 = this.renderPos;
        int iHashCode3 = (iHashCode2 + (vector2D3 == null ? 0 : vector2D3.hashCode())) * 31;
        Function2<Vector2D, SolidColor, Unit> function2 = this.callback;
        return iHashCode3 + (function2 != null ? function2.hashCode() : 0);
    }

    public String toString() {
        return "SpoidEnv(location=" + this.location + ", previewWH=" + this.previewWH + ", renderPos=" + this.renderPos + ", callback=" + this.callback + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SpoidEnv(Vector2D vector2D, Vector2D vector2D2, Vector2D vector2D3, Function2<? super Vector2D, ? super SolidColor, Unit> function2) {
        this.location = vector2D;
        this.previewWH = vector2D2;
        this.renderPos = vector2D3;
        this.callback = function2;
    }

    public final Function2<Vector2D, SolidColor, Unit> getCallback() {
        return this.callback;
    }

    public final Vector2D getLocation() {
        return this.location;
    }

    public final Vector2D getPreviewWH() {
        return this.previewWH;
    }

    public final Vector2D getRenderPos() {
        return this.renderPos;
    }

    public /* synthetic */ SpoidEnv(Vector2D vector2D, Vector2D vector2D2, Vector2D vector2D3, Function2 function2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : vector2D, (i2 & 2) != 0 ? null : vector2D2, (i2 & 4) != 0 ? null : vector2D3, (i2 & 8) != 0 ? null : function2);
    }
}
