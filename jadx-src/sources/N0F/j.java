package N0F;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidColorFilter_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class j extends Painter implements RememberObserver {
    private final Lazy E2;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final MutableState f6936S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final Drawable f6937Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final MutableState f6938g;

    static final class n extends Lambda implements Function0 {

        /* JADX INFO: renamed from: N0F.j$n$j, reason: collision with other inner class name */
        public static final class C0233j implements Drawable.Callback {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ j f6940n;

            C0233j(j jVar) {
                this.f6940n = jVar;
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void invalidateDrawable(Drawable d2) {
                Intrinsics.checkNotNullParameter(d2, "d");
                j jVar = this.f6940n;
                jVar.S(jVar.o() + 1);
                j jVar2 = this.f6940n;
                jVar2.WPU(N0F.n.t(jVar2.Z()));
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void scheduleDrawable(Drawable d2, Runnable what, long j2) {
                Intrinsics.checkNotNullParameter(d2, "d");
                Intrinsics.checkNotNullParameter(what, "what");
                N0F.n.nr().postAtTime(what, j2);
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void unscheduleDrawable(Drawable d2, Runnable what) {
                Intrinsics.checkNotNullParameter(d2, "d");
                Intrinsics.checkNotNullParameter(what, "what");
                N0F.n.nr().removeCallbacks(what);
            }
        }

        n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final C0233j invoke() {
            return new C0233j(j.this);
        }
    }

    /* JADX INFO: renamed from: N0F.j$j, reason: collision with other inner class name */
    public /* synthetic */ class C0232j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.f34160n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.f34161t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public j(Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.f6937Z = drawable;
        this.f6936S = SnapshotStateKt__SnapshotStateKt.O(0, null, 2, null);
        this.f6938g = SnapshotStateKt__SnapshotStateKt.O(Size.t(N0F.n.t(drawable)), null, 2, null);
        this.E2 = LazyKt.lazy(new n());
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(int i2) {
        this.f6936S.setValue(Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void WPU(long j2) {
        this.f6938g.setValue(Size.t(j2));
    }

    private final long XQ() {
        return ((Size) this.f6938g.getValue()).getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int o() {
        return ((Number) this.f6936S.getValue()).intValue();
    }

    private final Drawable.Callback r() {
        return (Drawable.Callback) this.E2.getValue();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean J2(LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Drawable drawable = this.f6937Z;
        int i2 = C0232j.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i3 = 1;
        if (i2 == 1) {
            i3 = 0;
        } else if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return drawable.setLayoutDirection(i3);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void O() {
        Object obj = this.f6937Z;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
        this.f6937Z.setVisible(false, false);
        this.f6937Z.setCallback(null);
    }

    public final Drawable Z() {
        return this.f6937Z;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean n(float f3) {
        this.f6937Z.setAlpha(RangesKt.coerceIn(MathKt.roundToInt(f3 * 255), 0, 255));
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean rl(ColorFilter colorFilter) {
        this.f6937Z.setColorFilter(colorFilter != null ? AndroidColorFilter_androidKt.t(colorFilter) : null);
        return true;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void t() {
        this.f6937Z.setCallback(r());
        this.f6937Z.setVisible(true, true);
        Object obj = this.f6937Z;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected void ty(DrawScope drawScope) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        Canvas canvasKN = drawScope.getDrawContext().KN();
        o();
        this.f6937Z.setBounds(0, 0, MathKt.roundToInt(Size.gh(drawScope.t())), MathKt.roundToInt(Size.xMQ(drawScope.t())));
        try {
            canvasKN.O();
            this.f6937Z.draw(AndroidCanvas_androidKt.nr(canvasKN));
        } finally {
            canvasKN.n();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void nr() {
        O();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: qie */
    public long getIntrinsicSize() {
        return XQ();
    }
}
