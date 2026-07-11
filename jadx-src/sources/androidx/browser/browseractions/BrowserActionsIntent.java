package androidx.browser.browseractions;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Deprecated
public class BrowserActionsIntent {

    @RestrictTo
    @VisibleForTesting
    interface BrowserActionsFallDialogListener {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface BrowserActionsItemId {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface BrowserActionsUrlType {
    }

    public static final class Builder {
    }
}
