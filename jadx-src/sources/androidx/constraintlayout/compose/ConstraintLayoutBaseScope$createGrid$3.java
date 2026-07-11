package androidx.constraintlayout.compose;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/constraintlayout/compose/Span;", "it", "", c.f62177j, "(Ljava/lang/String;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
final class ConstraintLayoutBaseScope$createGrid$3 extends Lambda implements Function1<Span, CharSequence> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ConstraintLayoutBaseScope$createGrid$3 f34453n = new ConstraintLayoutBaseScope$createGrid$3();

    ConstraintLayoutBaseScope$createGrid$3() {
        super(1);
    }

    public final CharSequence n(String str) {
        return str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ CharSequence invoke(Span span) {
        return n(span.getDescription());
    }
}
