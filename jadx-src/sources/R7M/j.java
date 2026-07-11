package R7M;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class j {
    private final PaddingValues J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final PaddingValues f8681O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Brush f8682n;
    private final Shape nr;
    private final long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final BorderStroke f8683t;

    public /* synthetic */ j(long j2, long j3, BorderStroke borderStroke, Shape shape, PaddingValues paddingValues, PaddingValues paddingValues2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, borderStroke, shape, paddingValues, paddingValues2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f8682n, jVar.f8682n) && Color.HI(this.rl, jVar.rl) && Intrinsics.areEqual(this.f8683t, jVar.f8683t) && Intrinsics.areEqual(this.nr, jVar.nr) && Intrinsics.areEqual(this.f8681O, jVar.f8681O) && Intrinsics.areEqual(this.J2, jVar.J2);
    }

    public /* synthetic */ j(Brush brush, long j2, BorderStroke borderStroke, Shape shape, PaddingValues paddingValues, PaddingValues paddingValues2, DefaultConstructorMarker defaultConstructorMarker) {
        this(brush, j2, borderStroke, shape, paddingValues, paddingValues2);
    }

    public final Shape J2() {
        return this.nr;
    }

    public final PaddingValues O() {
        return this.J2;
    }

    public int hashCode() {
        int iHashCode = ((this.f8682n.hashCode() * 31) + Color.XQ(this.rl)) * 31;
        BorderStroke borderStroke = this.f8683t;
        return ((((((iHashCode + (borderStroke == null ? 0 : borderStroke.hashCode())) * 31) + this.nr.hashCode()) * 31) + this.f8681O.hashCode()) * 31) + this.J2.hashCode();
    }

    public final BorderStroke n() {
        return this.f8683t;
    }

    public final PaddingValues nr() {
        return this.f8681O;
    }

    public final Brush rl() {
        return this.f8682n;
    }

    public final long t() {
        return this.rl;
    }

    public String toString() {
        return "PrivacyButtonStyle(containerBrush=" + this.f8682n + ", contentColor=" + Color.S(this.rl) + ", border=" + this.f8683t + ", shape=" + this.nr + ", contentPadding=" + this.f8681O + ", outerPadding=" + this.J2 + ")";
    }

    private j(Brush containerBrush, long j2, BorderStroke borderStroke, Shape shape, PaddingValues contentPadding, PaddingValues outerPadding) {
        Intrinsics.checkNotNullParameter(containerBrush, "containerBrush");
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
        Intrinsics.checkNotNullParameter(outerPadding, "outerPadding");
        this.f8682n = containerBrush;
        this.rl = j2;
        this.f8683t = borderStroke;
        this.nr = shape;
        this.f8681O = contentPadding;
        this.J2 = outerPadding;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private j(long j2, long j3, BorderStroke borderStroke, Shape shape, PaddingValues contentPadding, PaddingValues outerPadding) {
        this(Brush.Companion.xMQ(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.xMQ(j2), Color.xMQ(j2)}), 0.0f, 0.0f, 0, 14, null), j3, borderStroke, shape, contentPadding, outerPadding, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
        Intrinsics.checkNotNullParameter(outerPadding, "outerPadding");
    }

    public /* synthetic */ j(Brush brush, long j2, BorderStroke borderStroke, Shape shape, PaddingValues paddingValues, PaddingValues paddingValues2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(brush, j2, (i2 & 4) != 0 ? null : borderStroke, shape, (i2 & 16) != 0 ? PaddingKt.rl(Dp.KN(20), Dp.KN(15)) : paddingValues, (i2 & 32) != 0 ? PaddingKt.t(0.0f, 0.0f, 3, null) : paddingValues2, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ j(long j2, long j3, BorderStroke borderStroke, Shape shape, PaddingValues paddingValues, PaddingValues paddingValues2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, (i2 & 4) != 0 ? null : borderStroke, shape, (i2 & 16) != 0 ? PaddingKt.rl(Dp.KN(20), Dp.KN(15)) : paddingValues, (i2 & 32) != 0 ? PaddingKt.t(0.0f, 0.0f, 3, null) : paddingValues2, (DefaultConstructorMarker) null);
    }
}
