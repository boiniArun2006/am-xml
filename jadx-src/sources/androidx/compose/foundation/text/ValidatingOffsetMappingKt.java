package androidx.compose.foundation.text;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\n\u001a\u00020\t*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u000f\"\u001a\u0010\u0018\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/input/VisualTransformation;", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/input/TransformedText;", "t", "(Landroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/ui/text/AnnotatedString;)Landroidx/compose/ui/text/input/TransformedText;", "", "originalLength", "limit", "", "O", "(Landroidx/compose/ui/text/input/TransformedText;II)V", "originalOffset", "offset", "KN", "(III)V", "transformedOffset", "transformedLength", "Uo", "Landroidx/compose/ui/text/input/OffsetMapping;", c.f62177j, "Landroidx/compose/ui/text/input/OffsetMapping;", "nr", "()Landroidx/compose/ui/text/input/OffsetMapping;", "ValidatingEmptyOffsetMappingIdentity", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nValidatingOffsetMapping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValidatingOffsetMapping.kt\nandroidx/compose/foundation/text/ValidatingOffsetMappingKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,135:1\n50#2,5:136\n50#2,5:141\n*S KotlinDebug\n*F\n+ 1 ValidatingOffsetMapping.kt\nandroidx/compose/foundation/text/ValidatingOffsetMappingKt\n*L\n117#1:136,5\n129#1:141,5\n*E\n"})
public final class ValidatingOffsetMappingKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final OffsetMapping f19947n = new ValidatingOffsetMapping(OffsetMapping.INSTANCE.n(), 0, 0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KN(int i2, int i3, int i5) {
        boolean z2 = false;
        if (i2 >= 0 && i2 <= i3) {
            z2 = true;
        }
        if (z2) {
            return;
        }
        InlineClassHelperKt.t("OffsetMapping.transformedToOriginal returned invalid mapping: " + i5 + " -> " + i2 + " is not in range of original text [0, " + i3 + ']');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Uo(int i2, int i3, int i5) {
        boolean z2 = false;
        if (i2 >= 0 && i2 <= i3) {
            z2 = true;
        }
        if (z2) {
            return;
        }
        InlineClassHelperKt.t("OffsetMapping.originalToTransformed returned invalid mapping: " + i5 + " -> " + i2 + " is not in range of transformed text [0, " + i3 + ']');
    }

    public static /* synthetic */ void J2(TransformedText transformedText, int i2, int i3, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i3 = 100;
        }
        O(transformedText, i2, i3);
    }

    public static final OffsetMapping nr() {
        return f19947n;
    }

    public static final void O(TransformedText transformedText, int i2, int i3) {
        int length = transformedText.getText().length();
        int iMin = Math.min(i2, i3);
        for (int i5 = 0; i5 < iMin; i5++) {
            Uo(transformedText.getOffsetMapping().rl(i5), length, i5);
        }
        Uo(transformedText.getOffsetMapping().rl(i2), length, i2);
        int iMin2 = Math.min(length, i3);
        for (int i7 = 0; i7 < iMin2; i7++) {
            KN(transformedText.getOffsetMapping().n(i7), i2, i7);
        }
        KN(transformedText.getOffsetMapping().n(length), i2, length);
    }

    public static final TransformedText t(VisualTransformation visualTransformation, AnnotatedString annotatedString) {
        TransformedText transformedTextN = visualTransformation.n(annotatedString);
        J2(transformedTextN, annotatedString.length(), 0, 2, null);
        return new TransformedText(transformedTextN.getText(), new ValidatingOffsetMapping(transformedTextN.getOffsetMapping(), annotatedString.length(), transformedTextN.getText().length()));
    }
}
