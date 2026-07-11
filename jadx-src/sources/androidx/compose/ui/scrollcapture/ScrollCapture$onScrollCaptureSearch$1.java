package androidx.compose.ui.scrollcapture;

import androidx.compose.runtime.collection.MutableVector;
import com.safedk.android.analytics.brandsafety.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* synthetic */ class ScrollCapture$onScrollCaptureSearch$1 extends AdaptedFunctionReference implements Function1<ScrollCaptureCandidate, Unit> {
    ScrollCapture$onScrollCaptureSearch$1(Object obj) {
        super(1, obj, MutableVector.class, l.f62657l, "add(Ljava/lang/Object;)Z", 8);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ScrollCaptureCandidate scrollCaptureCandidate) {
        n(scrollCaptureCandidate);
        return Unit.INSTANCE;
    }

    public final void n(ScrollCaptureCandidate scrollCaptureCandidate) {
        ((MutableVector) this.receiver).rl(scrollCaptureCandidate);
    }
}
