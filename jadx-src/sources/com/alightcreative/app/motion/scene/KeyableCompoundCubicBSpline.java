package com.alightcreative.app.motion.scene;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/alightcreative/app/motion/scene/KeyableCompoundCubicBSpline;", "", "contours", "", "Lcom/alightcreative/app/motion/scene/KeyableCubicBSpline;", "<init>", "(Ljava/util/List;)V", "getContours", "()Ljava/util/List;", "component1", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "Companion", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class KeyableCompoundCubicBSpline {
    private final List<KeyableCubicBSpline> contours;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final KeyableCompoundCubicBSpline EMPTY = new KeyableCompoundCubicBSpline(CollectionsKt.listOf(KeyableCubicBSpline.INSTANCE.getEMPTY()));

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/alightcreative/app/motion/scene/KeyableCompoundCubicBSpline$Companion;", "", "<init>", "()V", "EMPTY", "Lcom/alightcreative/app/motion/scene/KeyableCompoundCubicBSpline;", "getEMPTY", "()Lcom/alightcreative/app/motion/scene/KeyableCompoundCubicBSpline;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KeyableCompoundCubicBSpline getEMPTY() {
            return KeyableCompoundCubicBSpline.EMPTY;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KeyableCompoundCubicBSpline copy$default(KeyableCompoundCubicBSpline keyableCompoundCubicBSpline, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = keyableCompoundCubicBSpline.contours;
        }
        return keyableCompoundCubicBSpline.copy(list);
    }

    public final List<KeyableCubicBSpline> component1() {
        return this.contours;
    }

    public final KeyableCompoundCubicBSpline copy(List<KeyableCubicBSpline> contours) {
        Intrinsics.checkNotNullParameter(contours, "contours");
        return new KeyableCompoundCubicBSpline(contours);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof KeyableCompoundCubicBSpline) && Intrinsics.areEqual(this.contours, ((KeyableCompoundCubicBSpline) other).contours);
    }

    public int hashCode() {
        return this.contours.hashCode();
    }

    public String toString() {
        return "KeyableCompoundCubicBSpline(contours=" + this.contours + ")";
    }

    public KeyableCompoundCubicBSpline(List<KeyableCubicBSpline> contours) {
        Intrinsics.checkNotNullParameter(contours, "contours");
        this.contours = contours;
    }

    public final List<KeyableCubicBSpline> getContours() {
        return this.contours;
    }
}
