package com.alightcreative.app.motion.scene;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/alightcreative/app/motion/scene/PosPos;", "", "rel", "Lcom/alightcreative/app/motion/scene/Vector3D;", TtmlNode.RUBY_BASE, "Lcom/alightcreative/app/motion/scene/Vector2D;", "<init>", "(Lcom/alightcreative/app/motion/scene/Vector3D;Lcom/alightcreative/app/motion/scene/Vector2D;)V", "getRel", "()Lcom/alightcreative/app/motion/scene/Vector3D;", "getBase", "()Lcom/alightcreative/app/motion/scene/Vector2D;", "component1", "component2", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PosPos {
    public static final int $stable = 0;
    private final Vector2D base;
    private final Vector3D rel;

    public static /* synthetic */ PosPos copy$default(PosPos posPos, Vector3D vector3D, Vector2D vector2D, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            vector3D = posPos.rel;
        }
        if ((i2 & 2) != 0) {
            vector2D = posPos.base;
        }
        return posPos.copy(vector3D, vector2D);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Vector3D getRel() {
        return this.rel;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Vector2D getBase() {
        return this.base;
    }

    public final PosPos copy(Vector3D rel, Vector2D base) {
        Intrinsics.checkNotNullParameter(rel, "rel");
        Intrinsics.checkNotNullParameter(base, "base");
        return new PosPos(rel, base);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PosPos)) {
            return false;
        }
        PosPos posPos = (PosPos) other;
        return Intrinsics.areEqual(this.rel, posPos.rel) && Intrinsics.areEqual(this.base, posPos.base);
    }

    public int hashCode() {
        return (this.rel.hashCode() * 31) + this.base.hashCode();
    }

    public String toString() {
        return "PosPos(rel=" + this.rel + ", base=" + this.base + ")";
    }

    public PosPos(Vector3D rel, Vector2D base) {
        Intrinsics.checkNotNullParameter(rel, "rel");
        Intrinsics.checkNotNullParameter(base, "base");
        this.rel = rel;
        this.base = base;
    }

    public final Vector2D getBase() {
        return this.base;
    }

    public final Vector3D getRel() {
        return this.rel;
    }
}
