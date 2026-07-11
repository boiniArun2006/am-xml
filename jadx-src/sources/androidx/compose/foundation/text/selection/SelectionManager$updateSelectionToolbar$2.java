package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* synthetic */ class SelectionManager$updateSelectionToolbar$2 extends FunctionReferenceImpl implements Function0<Unit> {
    SelectionManager$updateSelectionToolbar$2(Object obj) {
        super(0, obj, SelectionManager.class, "selectAll", "selectAll$foundation_release()V", 0);
    }

    public final void n() {
        ((SelectionManager) this.receiver).U();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        n();
        return Unit.INSTANCE;
    }
}
