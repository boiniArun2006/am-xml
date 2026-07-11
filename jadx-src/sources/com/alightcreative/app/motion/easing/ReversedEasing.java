package com.alightcreative.app.motion.easing;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.app.motion.scene.GeometryKt;
import com.alightcreative.app.motion.scene.Vector2D;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u0018\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\t\u0010\u0013\u001a\u00020\u0001HÆ\u0003J\u0013\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001c"}, d2 = {"Lcom/alightcreative/app/motion/easing/ReversedEasing;", "Lcom/alightcreative/app/motion/easing/Easing;", "baseEasing", "<init>", "(Lcom/alightcreative/app/motion/easing/Easing;)V", "getBaseEasing", "()Lcom/alightcreative/app/motion/easing/Easing;", "interpolate", "", "t", "serializeToString", "", "getHandles", "", "Lcom/alightcreative/app/motion/easing/EasingHandle;", "copyWithUpdatedHandle", "id", "position", "Lcom/alightcreative/app/motion/scene/Vector2D;", "component1", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReversedEasing.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReversedEasing.kt\ncom/alightcreative/app/motion/easing/ReversedEasing\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,21:1\n1557#2:22\n1628#2,2:23\n1630#2:26\n1#3:25\n*S KotlinDebug\n*F\n+ 1 ReversedEasing.kt\ncom/alightcreative/app/motion/easing/ReversedEasing\n*L\n11#1:22\n11#1:23,2\n11#1:26\n*E\n"})
public final /* data */ class ReversedEasing implements Easing {
    public static final int $stable = 8;
    private final Easing baseEasing;

    public static /* synthetic */ ReversedEasing copy$default(ReversedEasing reversedEasing, Easing easing, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            easing = reversedEasing.baseEasing;
        }
        return reversedEasing.copy(easing);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Easing getBaseEasing() {
        return this.baseEasing;
    }

    public final ReversedEasing copy(Easing baseEasing) {
        Intrinsics.checkNotNullParameter(baseEasing, "baseEasing");
        return new ReversedEasing(baseEasing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ReversedEasing) && Intrinsics.areEqual(this.baseEasing, ((ReversedEasing) other).baseEasing);
    }

    public int hashCode() {
        return this.baseEasing.hashCode();
    }

    public String toString() {
        return "ReversedEasing(baseEasing=" + this.baseEasing + ")";
    }

    public ReversedEasing(Easing baseEasing) {
        Intrinsics.checkNotNullParameter(baseEasing, "baseEasing");
        this.baseEasing = baseEasing;
    }

    @Override // com.alightcreative.app.motion.easing.Easing
    public Easing copyWithUpdatedHandle(String id, Vector2D position) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(position, "position");
        return new ReversedEasing(this.baseEasing.copyWithUpdatedHandle(id, GeometryKt.minus(Vector2D.INSTANCE.getONE(), position)));
    }

    public final Easing getBaseEasing() {
        return this.baseEasing;
    }

    @Override // com.alightcreative.app.motion.easing.Easing
    public List<EasingHandle> getHandles() {
        List<EasingHandle> handles = this.baseEasing.getHandles();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(handles, 10));
        for (EasingHandle easingHandle : handles) {
            Vector2D.Companion companion = Vector2D.INSTANCE;
            Vector2D vector2DMinus = GeometryKt.minus(companion.getONE(), easingHandle.getPosition());
            Vector2D origin = easingHandle.getOrigin();
            arrayList.add(EasingHandle.copy$default(easingHandle, null, vector2DMinus, origin != null ? GeometryKt.minus(companion.getONE(), origin) : null, false, 0.0f, null, 57, null));
        }
        return arrayList;
    }

    @Override // com.alightcreative.app.motion.easing.Easing
    public float interpolate(float t3) {
        return 1.0f - this.baseEasing.interpolate(1.0f - t3);
    }

    @Override // com.alightcreative.app.motion.easing.Easing
    public String serializeToString() {
        return "reverse " + this.baseEasing.serializeToString();
    }
}
