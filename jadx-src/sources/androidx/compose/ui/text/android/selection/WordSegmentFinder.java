package androidx.compose.ui.text.android.selection;

import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/android/selection/WordSegmentFinder;", "Landroidx/compose/ui/text/android/selection/SegmentFinder;", "", "text", "Landroidx/compose/ui/text/android/selection/WordIterator;", "wordIterator", "<init>", "(Ljava/lang/CharSequence;Landroidx/compose/ui/text/android/selection/WordIterator;)V", "", "offset", "rl", "(I)I", "nr", c.f62177j, "t", "Ljava/lang/CharSequence;", "Landroidx/compose/ui/text/android/selection/WordIterator;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class WordSegmentFinder implements SegmentFinder {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final CharSequence text;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final WordIterator wordIterator;

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public int n(int offset) {
        do {
            offset = this.wordIterator.ck(offset);
            if (offset == -1 || offset == this.text.length()) {
                return -1;
            }
        } while (Character.isWhitespace(this.text.charAt(offset)));
        return offset;
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public int nr(int offset) {
        do {
            offset = this.wordIterator.Ik(offset);
            if (offset == -1 || offset == 0) {
                return -1;
            }
        } while (Character.isWhitespace(this.text.charAt(offset - 1)));
        return offset;
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public int rl(int offset) {
        do {
            offset = this.wordIterator.Ik(offset);
            if (offset == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.text.charAt(offset)));
        return offset;
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public int t(int offset) {
        do {
            offset = this.wordIterator.ck(offset);
            if (offset == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.text.charAt(offset - 1)));
        return offset;
    }

    public WordSegmentFinder(CharSequence charSequence, WordIterator wordIterator) {
        this.text = charSequence;
        this.wordIterator = wordIterator;
    }
}
