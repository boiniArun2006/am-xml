package androidx.compose.ui.contentcapture;

import androidx.compose.ui.ExperimentalComposeUiApi;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@ExperimentalComposeUiApi
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003\u0082\u0001\u0001\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/contentcapture/ContentCaptureManager;", "", "ViF", "Companion", "Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ContentCaptureManager {

    /* JADX INFO: renamed from: ViF, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f31207n;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R0\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048G@GX\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/contentcapture/ContentCaptureManager$Companion;", "", "<init>", "()V", "", "<set-?>", "rl", "Z", c.f62177j, "()Z", "setEnabled", "(Z)V", "isEnabled$annotations", "isEnabled", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ Companion f31207n = new Companion();

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private static boolean isEnabled = true;

        public final boolean n() {
            return isEnabled;
        }

        private Companion() {
        }
    }
}
