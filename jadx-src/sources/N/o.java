package N;

import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class o {
    public static final Modifier n(Modifier modifier, boolean z2, Function1 transform) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return z2 ? (Modifier) transform.invoke(modifier) : modifier;
    }
}
