package androidx.constraintlayout.compose;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001b\u0010\u001cR\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u001cR\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#¨\u0006'"}, d2 = {"Landroidx/constraintlayout/compose/CarouselState;", "", "Landroidx/constraintlayout/compose/MotionCarouselDirection;", "direction", "", "index", "targetIndex", "", "snapping", "animating", "<init>", "(Landroidx/constraintlayout/compose/MotionCarouselDirection;IIZZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", c.f62177j, "Landroidx/constraintlayout/compose/MotionCarouselDirection;", "()Landroidx/constraintlayout/compose/MotionCarouselDirection;", "t", "(Landroidx/constraintlayout/compose/MotionCarouselDirection;)V", "rl", "I", "nr", "(I)V", "getTargetIndex", "setTargetIndex", "Z", "getSnapping", "()Z", "setSnapping", "(Z)V", "O", "getAnimating", "setAnimating", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final /* data */ class CarouselState {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean animating;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private MotionCarouselDirection direction;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata and from toString */
    private boolean snapping;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata and from toString */
    private int index;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private int targetIndex;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CarouselState)) {
            return false;
        }
        CarouselState carouselState = (CarouselState) other;
        return this.direction == carouselState.direction && this.index == carouselState.index && this.targetIndex == carouselState.targetIndex && this.snapping == carouselState.snapping && this.animating == carouselState.animating;
    }

    public int hashCode() {
        return (((((((this.direction.hashCode() * 31) + Integer.hashCode(this.index)) * 31) + Integer.hashCode(this.targetIndex)) * 31) + Boolean.hashCode(this.snapping)) * 31) + Boolean.hashCode(this.animating);
    }

    public String toString() {
        return "CarouselState(direction=" + this.direction + ", index=" + this.index + ", targetIndex=" + this.targetIndex + ", snapping=" + this.snapping + ", animating=" + this.animating + ')';
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final MotionCarouselDirection getDirection() {
        return this.direction;
    }

    public final void nr(int i2) {
        this.index = i2;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    public final void t(MotionCarouselDirection motionCarouselDirection) {
        this.direction = motionCarouselDirection;
    }

    public CarouselState(MotionCarouselDirection motionCarouselDirection, int i2, int i3, boolean z2, boolean z3) {
        this.direction = motionCarouselDirection;
        this.index = i2;
        this.targetIndex = i3;
        this.snapping = z2;
        this.animating = z3;
    }
}
