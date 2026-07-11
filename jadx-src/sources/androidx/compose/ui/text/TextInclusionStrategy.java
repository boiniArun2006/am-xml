package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextInclusionStrategy;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\bJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/TextInclusionStrategy;", "", "Landroidx/compose/ui/geometry/Rect;", "textBounds", "rect", "", c.f62177j, "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;)Z", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface TextInclusionStrategy {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f33498n;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/TextInclusionStrategy$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/TextInclusionStrategy;", "rl", "Landroidx/compose/ui/text/TextInclusionStrategy;", "Uo", "()Landroidx/compose/ui/text/TextInclusionStrategy;", "AnyOverlap", "t", "getContainsAll", "ContainsAll", "nr", "KN", "ContainsCenter", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ Companion f33498n = new Companion();

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private static final TextInclusionStrategy AnyOverlap = new TextInclusionStrategy() { // from class: androidx.compose.ui.text.j
            @Override // androidx.compose.ui.text.TextInclusionStrategy
            public final boolean n(Rect rect, Rect rect2) {
                return TextInclusionStrategy.Companion.nr(rect, rect2);
            }
        };

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private static final TextInclusionStrategy ContainsAll = new TextInclusionStrategy() { // from class: androidx.compose.ui.text.n
            @Override // androidx.compose.ui.text.TextInclusionStrategy
            public final boolean n(Rect rect, Rect rect2) {
                return TextInclusionStrategy.Companion.O(rect, rect2);
            }
        };

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
        private static final TextInclusionStrategy ContainsCenter = new TextInclusionStrategy() { // from class: androidx.compose.ui.text.w6
            @Override // androidx.compose.ui.text.TextInclusionStrategy
            public final boolean n(Rect rect, Rect rect2) {
                return TextInclusionStrategy.Companion.J2(rect, rect2);
            }
        };

        public final TextInclusionStrategy KN() {
            return ContainsCenter;
        }

        public final TextInclusionStrategy Uo() {
            return AnyOverlap;
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean J2(Rect rect, Rect rect2) {
            return rect2.J2(rect.az());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean O(Rect rect, Rect rect2) {
            if (!rect2.ViF() && rect.getLeft() >= rect2.getLeft() && rect.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String() <= rect2.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String() && rect.getTop() >= rect2.getTop() && rect.xMQ() <= rect2.xMQ()) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean nr(Rect rect, Rect rect2) {
            return rect.nY(rect2);
        }
    }

    boolean n(Rect textBounds, Rect rect);
}
