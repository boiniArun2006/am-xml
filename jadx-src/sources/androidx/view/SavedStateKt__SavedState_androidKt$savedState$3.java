package androidx.view;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
public final class SavedStateKt__SavedState_androidKt$savedState$3 implements Function1<SavedStateWriter, Unit> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final SavedStateKt__SavedState_androidKt$savedState$3 f41876n = new SavedStateKt__SavedState_androidKt$savedState$3();

    public final void n(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SavedStateWriter savedStateWriter) {
        n(savedStateWriter.getSource());
        return Unit.INSTANCE;
    }
}
