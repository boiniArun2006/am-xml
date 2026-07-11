package androidx.compose.ui.platform.coreshims;

import android.view.autofill.AutofillId;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RestrictTo
public class AutofillIdCompat {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f33179n;

    public static AutofillIdCompat rl(AutofillId autofillId) {
        return new AutofillIdCompat(autofillId);
    }

    public AutofillId n() {
        return j.n(this.f33179n);
    }

    private AutofillIdCompat(AutofillId autofillId) {
        this.f33179n = autofillId;
    }
}
