package androidx.compose.ui.text.android;

import android.text.Layout;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/text/android/TextAlignmentAdapter;", "", "<init>", "()V", "", "value", "Landroid/text/Layout$Alignment;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(I)Landroid/text/Layout$Alignment;", "rl", "Landroid/text/Layout$Alignment;", "ALIGN_LEFT_FRAMEWORK", "t", "ALIGN_RIGHT_FRAMEWORK", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextAlignmentAdapter {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final TextAlignmentAdapter f33562n = new TextAlignmentAdapter();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final Layout.Alignment ALIGN_LEFT_FRAMEWORK;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final Layout.Alignment ALIGN_RIGHT_FRAMEWORK;

    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (Intrinsics.areEqual(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (Intrinsics.areEqual(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        ALIGN_LEFT_FRAMEWORK = alignment;
        ALIGN_RIGHT_FRAMEWORK = alignment2;
    }

    public final Layout.Alignment n(int value) {
        return value != 0 ? value != 1 ? value != 2 ? value != 3 ? value != 4 ? Layout.Alignment.ALIGN_NORMAL : ALIGN_RIGHT_FRAMEWORK : ALIGN_LEFT_FRAMEWORK : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
    }

    private TextAlignmentAdapter() {
    }
}
