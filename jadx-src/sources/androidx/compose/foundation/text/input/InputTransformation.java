package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Stable
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bç\u0080\u0001\u0018\u0000 \r2\u00020\u0001:\u0001\u000eJ\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0003*\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/InputTransformation;", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "FX", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "B", "(Landroidx/compose/foundation/text/input/TextFieldBuffer;)V", "Landroidx/compose/foundation/text/KeyboardOptions;", "J", "()Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", c.f62177j, "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface InputTransformation {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.rl;

    void B(TextFieldBuffer textFieldBuffer);

    default void FX(SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }

    default KeyboardOptions J() {
        return null;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/text/input/InputTransformation$Companion;", "Landroidx/compose/foundation/text/input/InputTransformation;", "<init>", "()V", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "", "B", "(Landroidx/compose/foundation/text/input/TextFieldBuffer;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion implements InputTransformation {
        static final /* synthetic */ Companion rl = new Companion();

        @Override // androidx.compose.foundation.text.input.InputTransformation
        public void B(TextFieldBuffer textFieldBuffer) {
        }

        private Companion() {
        }
    }
}
