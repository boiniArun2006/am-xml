package androidx.core.view.accessibility;

import android.os.Bundle;
import android.view.View;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public interface AccessibilityViewCommand {

    public static abstract class CommandArguments {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Bundle f36868n;

        public void n(Bundle bundle) {
            this.f36868n = bundle;
        }
    }

    public static final class MoveAtGranularityArguments extends CommandArguments {
    }

    public static final class MoveHtmlArguments extends CommandArguments {
    }

    public static final class MoveWindowArguments extends CommandArguments {
    }

    public static final class ScrollToPositionArguments extends CommandArguments {
    }

    public static final class SetProgressArguments extends CommandArguments {
    }

    public static final class SetSelectionArguments extends CommandArguments {
    }

    public static final class SetTextArguments extends CommandArguments {
    }

    boolean n(View view, CommandArguments commandArguments);
}
