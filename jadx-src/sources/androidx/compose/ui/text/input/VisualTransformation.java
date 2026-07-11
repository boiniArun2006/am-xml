package androidx.compose.ui.text.input;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.VisualTransformation;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Immutable
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bç\u0080\u0001\u0018\u0000 \u00052\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/input/VisualTransformation;", "", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/input/TransformedText;", c.f62177j, "(Landroidx/compose/ui/text/AnnotatedString;)Landroidx/compose/ui/text/input/TransformedText;", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface VisualTransformation {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f33818n;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/text/input/VisualTransformation$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/input/VisualTransformation;", "rl", "Landroidx/compose/ui/text/input/VisualTransformation;", "t", "()Landroidx/compose/ui/text/input/VisualTransformation;", "getNone$annotations", "None", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ Companion f33818n = new Companion();

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private static final VisualTransformation None = new VisualTransformation() { // from class: androidx.compose.ui.text.input.Wre
            @Override // androidx.compose.ui.text.input.VisualTransformation
            public final TransformedText n(AnnotatedString annotatedString) {
                return VisualTransformation.Companion.rl(annotatedString);
            }
        };

        /* JADX INFO: Access modifiers changed from: private */
        public static final TransformedText rl(AnnotatedString annotatedString) {
            return new TransformedText(annotatedString, OffsetMapping.INSTANCE.n());
        }

        public final VisualTransformation t() {
            return None;
        }

        private Companion() {
        }
    }

    TransformedText n(AnnotatedString text);
}
