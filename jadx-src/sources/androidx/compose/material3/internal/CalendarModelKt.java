package androidx.compose.material3.internal;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "localeFormat", "Landroidx/compose/material3/internal/DateInputFormat;", c.f62177j, "(Ljava/lang/String;)Landroidx/compose/material3/internal/DateInputFormat;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CalendarModelKt {
    public static final DateInputFormat n(String str) {
        String strRemoveSuffix = StringsKt.removeSuffix(StringsKt.replace$default(new Regex("y{1,4}").replace(new Regex("M{1,2}").replace(new Regex("d{1,2}").replace(new Regex("[^dMy/\\-.]").replace(str, ""), "dd"), "MM"), "yyyy"), "My", "M/y", false, 4, (Object) null), (CharSequence) ".");
        MatchResult matchResultFind$default = Regex.find$default(new Regex("[/\\-.]"), strRemoveSuffix, 0, 2, null);
        Intrinsics.checkNotNull(matchResultFind$default);
        MatchGroup matchGroup = matchResultFind$default.getGroups().get(0);
        Intrinsics.checkNotNull(matchGroup);
        int first = matchGroup.getRange().getFirst();
        String strSubstring = strRemoveSuffix.substring(first, first + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return new DateInputFormat(strRemoveSuffix, strSubstring.charAt(0));
    }
}
