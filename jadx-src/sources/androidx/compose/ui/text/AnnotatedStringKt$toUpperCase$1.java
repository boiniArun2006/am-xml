package androidx.compose.ui.text;

import androidx.compose.ui.text.intl.LocaleList;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "str", "", TtmlNode.START, TtmlNode.END, c.f62177j, "(Ljava/lang/String;II)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
final class AnnotatedStringKt$toUpperCase$1 extends Lambda implements Function3<String, Integer, Integer, String> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ LocaleList f33357n;

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
        return n(str, num.intValue(), num2.intValue());
    }

    public final String n(String str, int i2, int i3) {
        String strSubstring = str.substring(i2, i3);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return StringKt.KN(strSubstring, this.f33357n);
    }
}
