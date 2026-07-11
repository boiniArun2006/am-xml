package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0005¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/text/TextAnnotatorScope;", "", "Landroidx/compose/ui/text/AnnotatedString;", "initialText", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;)V", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/LinkAnnotation;", "linkRange", "Landroidx/compose/ui/text/SpanStyle;", "newStyle", "", "rl", "(Landroidx/compose/ui/text/AnnotatedString$Range;Landroidx/compose/ui/text/SpanStyle;)V", c.f62177j, "Landroidx/compose/ui/text/AnnotatedString;", "()Landroidx/compose/ui/text/AnnotatedString;", "setStyledText", "styledText", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class TextAnnotatorScope {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final AnnotatedString initialText;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private AnnotatedString styledText;

    /* JADX INFO: renamed from: n, reason: from getter */
    public final AnnotatedString getStyledText() {
        return this.styledText;
    }

    public final void rl(final AnnotatedString.Range linkRange, final SpanStyle newStyle) {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        this.styledText = this.initialText.ck(new Function1<AnnotatedString.Range<? extends AnnotatedString.Annotation>, AnnotatedString.Range<? extends AnnotatedString.Annotation>>() { // from class: androidx.compose.foundation.text.TextAnnotatorScope$replaceStyle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final AnnotatedString.Range invoke(AnnotatedString.Range range) {
                AnnotatedString.Range range2;
                if (booleanRef.element && (range.getItem() instanceof SpanStyle) && range.getStart() == linkRange.getStart() && range.getEnd() == linkRange.getEnd()) {
                    SpanStyle spanStyle = newStyle;
                    if (spanStyle == null) {
                        spanStyle = new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65535, null);
                    }
                    range2 = new AnnotatedString.Range(spanStyle, range.getStart(), range.getEnd());
                } else {
                    range2 = range;
                }
                booleanRef.element = Intrinsics.areEqual(linkRange, range);
                return range2;
            }
        });
    }

    public TextAnnotatorScope(AnnotatedString annotatedString) {
        this.initialText = annotatedString;
        this.styledText = annotatedString;
    }
}
