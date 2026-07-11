package androidx.compose.ui.autofill;

import android.view.ViewStructure;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@RequiresApi
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/autofill/AutofillApi28Helper;", "", "<init>", "()V", "Landroid/view/ViewStructure;", "structure", "", "length", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroid/view/ViewStructure;I)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AutofillApi28Helper {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AutofillApi28Helper f31123n = new AutofillApi28Helper();

    private AutofillApi28Helper() {
    }

    public final void n(ViewStructure structure, int length) {
        structure.setMaxTextLength(length);
    }
}
