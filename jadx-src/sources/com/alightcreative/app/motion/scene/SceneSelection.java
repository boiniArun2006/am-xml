package com.alightcreative.app.motion.scene;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.snap.SnapGuide;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u000f¢\u0006\u0004\b \u0010\u001fJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b'\u0010&J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\"J\u0012\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b-\u0010$J\u0010\u0010.\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b.\u0010\u001fJ\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b3\u00104Jª\u0001\u00105\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00108\u001a\u000207HÖ\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b:\u0010;J\u001a\u0010=\u001a\u00020\u000f2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b=\u0010>R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010?\u001a\u0004\b@\u0010\"R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010A\u001a\u0004\bB\u0010$R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010C\u001a\u0004\bD\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010C\u001a\u0004\bE\u0010&R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010?\u001a\u0004\bF\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010G\u001a\u0004\bH\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010I\u001a\u0004\bJ\u0010,R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010A\u001a\u0004\bK\u0010$R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010L\u001a\u0004\bM\u0010\u001fR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010N\u001a\u0004\bO\u00100R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010P\u001a\u0004\bQ\u00102R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010R\u001a\u0004\bS\u00104¨\u0006T"}, d2 = {"Lcom/alightcreative/app/motion/scene/SceneSelection;", "", "", "", "selectedElements", "directSelection", "", "selectedContour", "selectedPoint", "multiSelectPoints", "LWzY/Sis;", "lasso", "Lcom/alightcreative/app/motion/scene/ControlHandle;", "selectedHandle", "selectableHint", "", "overlaySelectableHint", "", "Lcom/alightcreative/snap/SnapGuide;", "snapGuides", "", "curvePos", "Lcom/alightcreative/app/motion/scene/Vector2D;", "pendingAddPoint", "<init>", "(Ljava/util/Set;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Set;LWzY/Sis;Lcom/alightcreative/app/motion/scene/ControlHandle;Ljava/lang/Long;ZLjava/util/List;Ljava/lang/Float;Lcom/alightcreative/app/motion/scene/Vector2D;)V", "elementId", "isElementSelected", "(J)Z", "isElementDirectlySelected", "isEmpty", "()Z", "isMultiSelect", "component1", "()Ljava/util/Set;", "component2", "()Ljava/lang/Long;", "component3", "()Ljava/lang/Integer;", "component4", "component5", "component6", "()LWzY/Sis;", "component7", "()Lcom/alightcreative/app/motion/scene/ControlHandle;", "component8", "component9", "component10", "()Ljava/util/List;", "component11", "()Ljava/lang/Float;", "component12", "()Lcom/alightcreative/app/motion/scene/Vector2D;", "copy", "(Ljava/util/Set;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Set;LWzY/Sis;Lcom/alightcreative/app/motion/scene/ControlHandle;Ljava/lang/Long;ZLjava/util/List;Ljava/lang/Float;Lcom/alightcreative/app/motion/scene/Vector2D;)Lcom/alightcreative/app/motion/scene/SceneSelection;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Set;", "getSelectedElements", "Ljava/lang/Long;", "getDirectSelection", "Ljava/lang/Integer;", "getSelectedContour", "getSelectedPoint", "getMultiSelectPoints", "LWzY/Sis;", "getLasso", "Lcom/alightcreative/app/motion/scene/ControlHandle;", "getSelectedHandle", "getSelectableHint", "Z", "getOverlaySelectableHint", "Ljava/util/List;", "getSnapGuides", "Ljava/lang/Float;", "getCurvePos", "Lcom/alightcreative/app/motion/scene/Vector2D;", "getPendingAddPoint", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SceneSelection {
    public static final int $stable = 8;
    private final Float curvePos;
    private final Long directSelection;
    private final WzY.Sis lasso;
    private final Set<Integer> multiSelectPoints;
    private final boolean overlaySelectableHint;
    private final Vector2D pendingAddPoint;
    private final Long selectableHint;
    private final Integer selectedContour;
    private final Set<Long> selectedElements;
    private final ControlHandle selectedHandle;
    private final Integer selectedPoint;
    private final List<SnapGuide> snapGuides;

    public SceneSelection(Set<Long> selectedElements, Long l2, Integer num, Integer num2, Set<Integer> multiSelectPoints, WzY.Sis sis, ControlHandle controlHandle, Long l5, boolean z2, List<SnapGuide> snapGuides, Float f3, Vector2D vector2D) {
        Intrinsics.checkNotNullParameter(selectedElements, "selectedElements");
        Intrinsics.checkNotNullParameter(multiSelectPoints, "multiSelectPoints");
        Intrinsics.checkNotNullParameter(snapGuides, "snapGuides");
        this.selectedElements = selectedElements;
        this.directSelection = l2;
        this.selectedContour = num;
        this.selectedPoint = num2;
        this.multiSelectPoints = multiSelectPoints;
        this.lasso = sis;
        this.selectedHandle = controlHandle;
        this.selectableHint = l5;
        this.overlaySelectableHint = z2;
        this.snapGuides = snapGuides;
        this.curvePos = f3;
        this.pendingAddPoint = vector2D;
        if (l2 != null) {
            selectedElements.contains(l2);
        }
    }

    public final Set<Long> component1() {
        return this.selectedElements;
    }

    public final List<SnapGuide> component10() {
        return this.snapGuides;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Float getCurvePos() {
        return this.curvePos;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Vector2D getPendingAddPoint() {
        return this.pendingAddPoint;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getDirectSelection() {
        return this.directSelection;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getSelectedContour() {
        return this.selectedContour;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getSelectedPoint() {
        return this.selectedPoint;
    }

    public final Set<Integer> component5() {
        return this.multiSelectPoints;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ControlHandle getSelectedHandle() {
        return this.selectedHandle;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getSelectableHint() {
        return this.selectableHint;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getOverlaySelectableHint() {
        return this.overlaySelectableHint;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SceneSelection)) {
            return false;
        }
        SceneSelection sceneSelection = (SceneSelection) other;
        return Intrinsics.areEqual(this.selectedElements, sceneSelection.selectedElements) && Intrinsics.areEqual(this.directSelection, sceneSelection.directSelection) && Intrinsics.areEqual(this.selectedContour, sceneSelection.selectedContour) && Intrinsics.areEqual(this.selectedPoint, sceneSelection.selectedPoint) && Intrinsics.areEqual(this.multiSelectPoints, sceneSelection.multiSelectPoints) && Intrinsics.areEqual(this.lasso, sceneSelection.lasso) && this.selectedHandle == sceneSelection.selectedHandle && Intrinsics.areEqual(this.selectableHint, sceneSelection.selectableHint) && this.overlaySelectableHint == sceneSelection.overlaySelectableHint && Intrinsics.areEqual(this.snapGuides, sceneSelection.snapGuides) && Intrinsics.areEqual((Object) this.curvePos, (Object) sceneSelection.curvePos) && Intrinsics.areEqual(this.pendingAddPoint, sceneSelection.pendingAddPoint);
    }

    public int hashCode() {
        int iHashCode = this.selectedElements.hashCode() * 31;
        Long l2 = this.directSelection;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.selectedContour;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.selectedPoint;
        int iHashCode4 = (((iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.multiSelectPoints.hashCode()) * 31;
        WzY.Sis sis = this.lasso;
        int iHashCode5 = (iHashCode4 + (sis == null ? 0 : sis.hashCode())) * 31;
        ControlHandle controlHandle = this.selectedHandle;
        int iHashCode6 = (iHashCode5 + (controlHandle == null ? 0 : controlHandle.hashCode())) * 31;
        Long l5 = this.selectableHint;
        int iHashCode7 = (((((iHashCode6 + (l5 == null ? 0 : l5.hashCode())) * 31) + Boolean.hashCode(this.overlaySelectableHint)) * 31) + this.snapGuides.hashCode()) * 31;
        Float f3 = this.curvePos;
        int iHashCode8 = (iHashCode7 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Vector2D vector2D = this.pendingAddPoint;
        return iHashCode8 + (vector2D != null ? vector2D.hashCode() : 0);
    }

    public String toString() {
        return "SceneSelection(selectedElements=" + this.selectedElements + ", directSelection=" + this.directSelection + ", selectedContour=" + this.selectedContour + ", selectedPoint=" + this.selectedPoint + ", multiSelectPoints=" + this.multiSelectPoints + ", lasso=" + this.lasso + ", selectedHandle=" + this.selectedHandle + ", selectableHint=" + this.selectableHint + ", overlaySelectableHint=" + this.overlaySelectableHint + ", snapGuides=" + this.snapGuides + ", curvePos=" + this.curvePos + ", pendingAddPoint=" + this.pendingAddPoint + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SceneSelection copy$default(SceneSelection sceneSelection, Set set, Long l2, Integer num, Integer num2, Set set2, WzY.Sis sis, ControlHandle controlHandle, Long l5, boolean z2, List list, Float f3, Vector2D vector2D, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            set = sceneSelection.selectedElements;
        }
        if ((i2 & 2) != 0) {
            l2 = sceneSelection.directSelection;
        }
        if ((i2 & 4) != 0) {
            num = sceneSelection.selectedContour;
        }
        if ((i2 & 8) != 0) {
            num2 = sceneSelection.selectedPoint;
        }
        if ((i2 & 16) != 0) {
            set2 = sceneSelection.multiSelectPoints;
        }
        if ((i2 & 32) != 0) {
            sis = sceneSelection.lasso;
        }
        if ((i2 & 64) != 0) {
            controlHandle = sceneSelection.selectedHandle;
        }
        if ((i2 & 128) != 0) {
            l5 = sceneSelection.selectableHint;
        }
        if ((i2 & 256) != 0) {
            z2 = sceneSelection.overlaySelectableHint;
        }
        if ((i2 & 512) != 0) {
            list = sceneSelection.snapGuides;
        }
        if ((i2 & 1024) != 0) {
            f3 = sceneSelection.curvePos;
        }
        if ((i2 & 2048) != 0) {
            vector2D = sceneSelection.pendingAddPoint;
        }
        Float f4 = f3;
        Vector2D vector2D2 = vector2D;
        boolean z3 = z2;
        List list2 = list;
        ControlHandle controlHandle2 = controlHandle;
        Long l6 = l5;
        Set set3 = set2;
        WzY.Sis sis2 = sis;
        return sceneSelection.copy(set, l2, num, num2, set3, sis2, controlHandle2, l6, z3, list2, f4, vector2D2);
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final WzY.Sis getLasso() {
        return this.lasso;
    }

    public final SceneSelection copy(Set<Long> selectedElements, Long directSelection, Integer selectedContour, Integer selectedPoint, Set<Integer> multiSelectPoints, WzY.Sis lasso, ControlHandle selectedHandle, Long selectableHint, boolean overlaySelectableHint, List<SnapGuide> snapGuides, Float curvePos, Vector2D pendingAddPoint) {
        Intrinsics.checkNotNullParameter(selectedElements, "selectedElements");
        Intrinsics.checkNotNullParameter(multiSelectPoints, "multiSelectPoints");
        Intrinsics.checkNotNullParameter(snapGuides, "snapGuides");
        return new SceneSelection(selectedElements, directSelection, selectedContour, selectedPoint, multiSelectPoints, lasso, selectedHandle, selectableHint, overlaySelectableHint, snapGuides, curvePos, pendingAddPoint);
    }

    public final Float getCurvePos() {
        return this.curvePos;
    }

    public final Long getDirectSelection() {
        return this.directSelection;
    }

    public final WzY.Sis getLasso() {
        return this.lasso;
    }

    public final Set<Integer> getMultiSelectPoints() {
        return this.multiSelectPoints;
    }

    public final boolean getOverlaySelectableHint() {
        return this.overlaySelectableHint;
    }

    public final Vector2D getPendingAddPoint() {
        return this.pendingAddPoint;
    }

    public final Long getSelectableHint() {
        return this.selectableHint;
    }

    public final Integer getSelectedContour() {
        return this.selectedContour;
    }

    public final Set<Long> getSelectedElements() {
        return this.selectedElements;
    }

    public final ControlHandle getSelectedHandle() {
        return this.selectedHandle;
    }

    public final Integer getSelectedPoint() {
        return this.selectedPoint;
    }

    public final List<SnapGuide> getSnapGuides() {
        return this.snapGuides;
    }

    public final boolean isElementDirectlySelected(long elementId) {
        Long l2 = this.directSelection;
        return l2 != null && elementId == l2.longValue();
    }

    public final boolean isElementSelected(long elementId) {
        if (this.selectedElements.contains(Long.valueOf(elementId))) {
            return true;
        }
        Long l2 = this.directSelection;
        return l2 != null && elementId == l2.longValue();
    }

    public final boolean isEmpty() {
        return this.selectedElements.isEmpty();
    }

    public final boolean isMultiSelect() {
        return !this.selectedElements.isEmpty() && this.directSelection == null;
    }

    public /* synthetic */ SceneSelection(Set set, Long l2, Integer num, Integer num2, Set set2, WzY.Sis sis, ControlHandle controlHandle, Long l5, boolean z2, List list, Float f3, Vector2D vector2D, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, l2, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : num2, (i2 & 16) != 0 ? SetsKt.emptySet() : set2, (i2 & 32) != 0 ? null : sis, (i2 & 64) != 0 ? null : controlHandle, (i2 & 128) != 0 ? null : l5, (i2 & 256) != 0 ? false : z2, (i2 & 512) != 0 ? CollectionsKt.emptyList() : list, (i2 & 1024) != 0 ? null : f3, (i2 & 2048) != 0 ? null : vector2D);
    }
}
