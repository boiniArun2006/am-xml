package androidx.compose.ui.input.pointer.util;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.util.VelocityTracker1D;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u000bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0003R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R(\u0010\u001d\u001a\u00020\u00068\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\r\"\u0004\b\u001b\u0010\u001cR\"\u0010 \u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "", "<init>", "()V", "", "timeMillis", "Landroidx/compose/ui/geometry/Offset;", "position", "", c.f62177j, "(JJ)V", "Landroidx/compose/ui/unit/Velocity;", "rl", "()J", "maximumVelocity", "t", "(J)J", "J2", "Landroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;", "Landroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;", "strategy", "Landroidx/compose/ui/input/pointer/util/VelocityTracker1D;", "Landroidx/compose/ui/input/pointer/util/VelocityTracker1D;", "xVelocityTracker", "yVelocityTracker", "nr", "J", "Uo", "(J)V", "currentPointerPositionAccumulator", "O", "KN", "lastMoveEventTimeStamp", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVelocityTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTracker\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,706:1\n65#2:707\n69#2:710\n60#3:708\n70#3:711\n22#4:709\n22#4:712\n56#5,5:713\n*S KotlinDebug\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTracker\n*L\n75#1:707\n76#1:710\n75#1:708\n76#1:711\n75#1:709\n76#1:712\n103#1:713,5\n*E\n"})
public final class VelocityTracker {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private long lastMoveEventTimeStamp;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final VelocityTracker1D.Strategy strategy;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private long currentPointerPositionAccumulator;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final VelocityTracker1D xVelocityTracker;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final VelocityTracker1D yVelocityTracker;

    public final void J2() {
        this.xVelocityTracker.O();
        this.yVelocityTracker.O();
        this.lastMoveEventTimeStamp = 0L;
    }

    public final void KN(long j2) {
        this.lastMoveEventTimeStamp = j2;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final long getLastMoveEventTimeStamp() {
        return this.lastMoveEventTimeStamp;
    }

    public final void Uo(long j2) {
        this.currentPointerPositionAccumulator = j2;
    }

    public final void n(long timeMillis, long position) {
        this.xVelocityTracker.n(timeMillis, Float.intBitsToFloat((int) (position >> 32)));
        this.yVelocityTracker.n(timeMillis, Float.intBitsToFloat((int) (position & 4294967295L)));
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final long getCurrentPointerPositionAccumulator() {
        return this.currentPointerPositionAccumulator;
    }

    public VelocityTracker() {
        VelocityTracker1D.Strategy strategy;
        if (VelocityTrackerKt.KN()) {
            strategy = VelocityTracker1D.Strategy.f32180t;
        } else {
            strategy = VelocityTracker1D.Strategy.f32179n;
        }
        this.strategy = strategy;
        this.xVelocityTracker = new VelocityTracker1D(false, strategy, 1, null);
        this.yVelocityTracker = new VelocityTracker1D(false, strategy, 1, null);
        this.currentPointerPositionAccumulator = Offset.INSTANCE.t();
    }

    public final long rl() {
        return t(VelocityKt.n(Float.MAX_VALUE, Float.MAX_VALUE));
    }

    public final long t(long maximumVelocity) {
        boolean z2;
        if (Velocity.KN(maximumVelocity) > 0.0f && Velocity.xMQ(maximumVelocity) > 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            InlineClassHelperKt.t("maximumVelocity should be a positive value. You specified=" + ((Object) Velocity.ty(maximumVelocity)));
        }
        return VelocityKt.n(this.xVelocityTracker.nr(Velocity.KN(maximumVelocity)), this.yVelocityTracker.nr(Velocity.xMQ(maximumVelocity)));
    }
}
