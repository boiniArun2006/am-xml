package androidx.compose.ui.graphics;

import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/graphics/PathEffect;", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Companion", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface PathEffect {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f31508n;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/graphics/PathEffect$Companion;", "", "<init>", "()V", "", "intervals", "", "phase", "Landroidx/compose/ui/graphics/PathEffect;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "([FF)Landroidx/compose/ui/graphics/PathEffect;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ Companion f31508n = new Companion();

        public static /* synthetic */ PathEffect rl(Companion companion, float[] fArr, float f3, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                f3 = 0.0f;
            }
            return companion.n(fArr, f3);
        }

        private Companion() {
        }

        public final PathEffect n(float[] intervals, float phase) {
            return AndroidPathEffect_androidKt.n(intervals, phase);
        }
    }
}
