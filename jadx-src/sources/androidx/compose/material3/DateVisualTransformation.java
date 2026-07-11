package androidx.compose.material3;

import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000-\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\b\u0005*\u0001\u0015\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/compose/material3/DateVisualTransformation;", "Landroidx/compose/ui/text/input/VisualTransformation;", "Landroidx/compose/material3/internal/DateInputFormat;", "dateInputFormat", "<init>", "(Landroidx/compose/material3/internal/DateInputFormat;)V", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/input/TransformedText;", c.f62177j, "(Landroidx/compose/ui/text/AnnotatedString;)Landroidx/compose/ui/text/input/TransformedText;", "rl", "Landroidx/compose/material3/internal/DateInputFormat;", "", "t", "I", "firstDelimiterOffset", "nr", "secondDelimiterOffset", "O", "dateFormatLength", "androidx/compose/material3/DateVisualTransformation$dateOffsetTranslator$1", "J2", "Landroidx/compose/material3/DateVisualTransformation$dateOffsetTranslator$1;", "dateOffsetTranslator", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDateInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateVisualTransformation\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,386:1\n1183#2,3:387\n*S KotlinDebug\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateVisualTransformation\n*L\n371#1:387,3\n*E\n"})
final class DateVisualTransformation implements VisualTransformation {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final DateVisualTransformation$dateOffsetTranslator$1 dateOffsetTranslator = new OffsetMapping() { // from class: androidx.compose.material3.DateVisualTransformation$dateOffsetTranslator$1
        @Override // androidx.compose.ui.text.input.OffsetMapping
        public int n(int offset) {
            return offset <= this.rl.firstDelimiterOffset + (-1) ? offset : offset <= this.rl.secondDelimiterOffset + (-1) ? offset - 1 : offset <= this.rl.dateFormatLength + 1 ? offset - 2 : this.rl.dateFormatLength;
        }

        @Override // androidx.compose.ui.text.input.OffsetMapping
        public int rl(int offset) {
            return offset < this.rl.firstDelimiterOffset ? offset : offset < this.rl.secondDelimiterOffset ? offset + 1 : offset <= this.rl.dateFormatLength ? offset + 2 : this.rl.dateFormatLength + 2;
        }
    };

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final int dateFormatLength;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final int secondDelimiterOffset;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final DateInputFormat dateInputFormat;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int firstDelimiterOffset;

    /* JADX WARN: Type inference failed for: r8v3, types: [androidx.compose.material3.DateVisualTransformation$dateOffsetTranslator$1] */
    public DateVisualTransformation(DateInputFormat dateInputFormat) {
        this.dateInputFormat = dateInputFormat;
        this.firstDelimiterOffset = StringsKt.indexOf$default((CharSequence) dateInputFormat.getPatternWithDelimiters(), dateInputFormat.getDelimiter(), 0, false, 6, (Object) null);
        this.secondDelimiterOffset = StringsKt.lastIndexOf$default((CharSequence) dateInputFormat.getPatternWithDelimiters(), dateInputFormat.getDelimiter(), 0, false, 6, (Object) null);
        this.dateFormatLength = dateInputFormat.getPatternWithoutDelimiters().length();
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public TransformedText n(AnnotatedString text) {
        String text2;
        int i2 = 0;
        if (text.getText().length() > this.dateFormatLength) {
            text2 = StringsKt.substring(text.getText(), RangesKt.until(0, this.dateFormatLength));
        } else {
            text2 = text.getText();
        }
        String str = "";
        int i3 = 0;
        while (i2 < text2.length()) {
            int i5 = i3 + 1;
            String str2 = str + text2.charAt(i2);
            if (i5 != this.firstDelimiterOffset && i3 + 2 != this.secondDelimiterOffset) {
                str = str2;
            } else {
                str = str2 + this.dateInputFormat.getDelimiter();
            }
            i2++;
            i3 = i5;
        }
        return new TransformedText(new AnnotatedString(str, null, null, 6, null), this.dateOffsetTranslator);
    }
}
