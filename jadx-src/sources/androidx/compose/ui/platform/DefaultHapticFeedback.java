package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Landroidx/compose/ui/platform/DefaultHapticFeedback;", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;", "hapticFeedbackType", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(I)V", "Landroid/view/View;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DefaultHapticFeedback implements HapticFeedback {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final View view;

    @Override // androidx.compose.ui.hapticfeedback.HapticFeedback
    public void n(int hapticFeedbackType) {
        HapticFeedbackType.Companion companion = HapticFeedbackType.INSTANCE;
        if (HapticFeedbackType.t(hapticFeedbackType, companion.n())) {
            this.view.performHapticFeedback(16);
            return;
        }
        if (HapticFeedbackType.t(hapticFeedbackType, companion.rl())) {
            this.view.performHapticFeedback(6);
            return;
        }
        if (HapticFeedbackType.t(hapticFeedbackType, companion.t())) {
            this.view.performHapticFeedback(13);
            return;
        }
        if (HapticFeedbackType.t(hapticFeedbackType, companion.nr())) {
            this.view.performHapticFeedback(23);
            return;
        }
        if (HapticFeedbackType.t(hapticFeedbackType, companion.O())) {
            this.view.performHapticFeedback(0);
            return;
        }
        if (HapticFeedbackType.t(hapticFeedbackType, companion.J2())) {
            this.view.performHapticFeedback(17);
            return;
        }
        if (HapticFeedbackType.t(hapticFeedbackType, companion.Uo())) {
            this.view.performHapticFeedback(27);
            return;
        }
        if (HapticFeedbackType.t(hapticFeedbackType, companion.KN())) {
            this.view.performHapticFeedback(26);
            return;
        }
        if (HapticFeedbackType.t(hapticFeedbackType, companion.xMQ())) {
            this.view.performHapticFeedback(9);
            return;
        }
        if (HapticFeedbackType.t(hapticFeedbackType, companion.mUb())) {
            this.view.performHapticFeedback(22);
        } else if (HapticFeedbackType.t(hapticFeedbackType, companion.gh())) {
            this.view.performHapticFeedback(21);
        } else if (HapticFeedbackType.t(hapticFeedbackType, companion.qie())) {
            this.view.performHapticFeedback(1);
        }
    }

    public DefaultHapticFeedback(View view) {
        this.view = view;
    }
}
