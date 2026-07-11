package androidx.compose.ui.platform;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.input.pointer.AndroidPointerIcon;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@RequiresApi
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewVerificationHelperMethodsN;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/compose/ui/input/pointer/PointerIcon;", "icon", "Landroid/view/PointerIcon;", "rl", "(Landroid/content/Context;Landroidx/compose/ui/input/pointer/PointerIcon;)Landroid/view/PointerIcon;", "Landroid/view/View;", "view", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroid/view/View;Landroidx/compose/ui/input/pointer/PointerIcon;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class AndroidComposeViewVerificationHelperMethodsN {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AndroidComposeViewVerificationHelperMethodsN f32785n = new AndroidComposeViewVerificationHelperMethodsN();

    public final PointerIcon rl(Context context, androidx.compose.ui.input.pointer.PointerIcon icon) {
        return icon instanceof AndroidPointerIcon ? ((AndroidPointerIcon) icon).getPointerIcon() : icon instanceof androidx.compose.ui.input.pointer.AndroidPointerIcon ? PointerIcon.getSystemIcon(context, ((androidx.compose.ui.input.pointer.AndroidPointerIcon) icon).n()) : PointerIcon.getSystemIcon(context, 1000);
    }

    private AndroidComposeViewVerificationHelperMethodsN() {
    }

    @DoNotInline
    @RequiresApi
    public final void n(View view, androidx.compose.ui.input.pointer.PointerIcon icon) {
        PointerIcon pointerIconRl = rl(view.getContext(), icon);
        if (!Intrinsics.areEqual(view.getPointerIcon(), pointerIconRl)) {
            view.setPointerIcon(pointerIconRl);
        }
    }
}
