package androidx.compose.foundation.gestures;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\u000bR$\u0010\u0012\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0016\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\"\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"androidx/compose/foundation/gestures/AnchoredDraggableState$anchoredDragScope$1", "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "", "newOffset", "lastKnownVelocity", "", c.f62177j, "(FF)V", "", "isMovingForward", "nr", "(Z)V", "t", "Ljava/lang/Object;", "getLeftBound", "()Ljava/lang/Object;", "setLeftBound", "(Ljava/lang/Object;)V", "leftBound", "rl", "getRightBound", "setRightBound", "rightBound", "F", "getDistance", "()F", "setDistance", "(F)V", "distance", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AnchoredDraggableState$anchoredDragScope$1 implements AnchoredDragScope {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private Object leftBound;
    final /* synthetic */ AnchoredDraggableState nr;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private Object rightBound;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private float distance = Float.NaN;

    AnchoredDraggableState$anchoredDragScope$1(AnchoredDraggableState anchoredDraggableState) {
        this.nr = anchoredDraggableState;
    }

    @Override // androidx.compose.foundation.gestures.AnchoredDragScope
    public void n(float newOffset, float lastKnownVelocity) {
        float fR = this.nr.r();
        this.nr.e(newOffset);
        this.nr.E2(lastKnownVelocity);
        if (Float.isNaN(fR)) {
            return;
        }
        nr(newOffset >= fR);
    }

    public final void t(boolean isMovingForward) {
        if (this.nr.r() == this.nr.qie().t(this.nr.ty())) {
            Object objN = this.nr.qie().n(this.nr.r() + (isMovingForward ? 1.0f : -1.0f), isMovingForward);
            if (objN == null) {
                objN = this.nr.ty();
            }
            if (isMovingForward) {
                this.leftBound = this.nr.ty();
                this.rightBound = objN;
            } else {
                this.leftBound = objN;
                this.rightBound = this.nr.ty();
            }
        } else {
            Object objN2 = this.nr.qie().n(this.nr.r(), false);
            if (objN2 == null) {
                objN2 = this.nr.ty();
            }
            Object objN3 = this.nr.qie().n(this.nr.r(), true);
            if (objN3 == null) {
                objN3 = this.nr.ty();
            }
            this.leftBound = objN2;
            this.rightBound = objN3;
        }
        DraggableAnchors draggableAnchorsQie = this.nr.qie();
        Object obj = this.leftBound;
        Intrinsics.checkNotNull(obj);
        float fT = draggableAnchorsQie.t(obj);
        DraggableAnchors draggableAnchorsQie2 = this.nr.qie();
        Object obj2 = this.rightBound;
        Intrinsics.checkNotNull(obj2);
        this.distance = Math.abs(fT - draggableAnchorsQie2.t(obj2));
    }

    public final void nr(boolean isMovingForward) {
        Object objTy;
        t(isMovingForward);
        if (Math.abs(this.nr.r() - this.nr.qie().t(this.nr.ty())) >= this.distance / 2.0f) {
            if (isMovingForward) {
                objTy = this.rightBound;
            } else {
                objTy = this.leftBound;
            }
            if (objTy == null) {
                objTy = this.nr.ty();
            }
            if (((Boolean) this.nr.getConfirmValueChange().invoke(objTy)).booleanValue()) {
                this.nr.te(objTy);
            }
        }
    }
}
