package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Stable;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Stable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerIcon;", "", c.f62177j, "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface PointerIcon {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f32088n;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0005\u0010\b¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerIcon$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/input/pointer/PointerIcon;", "rl", "Landroidx/compose/ui/input/pointer/PointerIcon;", c.f62177j, "()Landroidx/compose/ui/input/pointer/PointerIcon;", "Default", "t", "getCrosshair", "Crosshair", "nr", "getText", "Text", "O", "Hand", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ Companion f32088n = new Companion();

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private static final PointerIcon Default = PointerIcon_androidKt.t();

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private static final PointerIcon Crosshair = PointerIcon_androidKt.rl();

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
        private static final PointerIcon Text = PointerIcon_androidKt.O();

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
        private static final PointerIcon Hand = PointerIcon_androidKt.nr();

        public final PointerIcon n() {
            return Default;
        }

        public final PointerIcon rl() {
            return Hand;
        }

        private Companion() {
        }
    }
}
