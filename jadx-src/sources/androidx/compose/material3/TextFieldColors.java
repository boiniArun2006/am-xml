package androidx.compose.material3;

import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Immutable
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\bO\b\u0007\u0018\u00002\u00020\u0001Bß\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\u0002\u0012\u0006\u0010'\u001a\u00020\u0002\u0012\u0006\u0010(\u001a\u00020\u0002\u0012\u0006\u0010)\u001a\u00020\u0002\u0012\u0006\u0010*\u001a\u00020\u0002\u0012\u0006\u0010+\u001a\u00020\u0002\u0012\u0006\u0010,\u001a\u00020\u0002\u0012\u0006\u0010-\u001a\u00020\u0002\u0012\u0006\u0010.\u001a\u00020\u0002¢\u0006\u0004\b/\u00100JÀ\u0003\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\u00022\b\b\u0002\u0010$\u001a\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u00022\b\b\u0002\u0010&\u001a\u00020\u00022\b\b\u0002\u0010'\u001a\u00020\u00022\b\b\u0002\u0010(\u001a\u00020\u00022\b\b\u0002\u0010)\u001a\u00020\u00022\b\b\u0002\u0010*\u001a\u00020\u00022\b\b\u0002\u0010+\u001a\u00020\u00022\b\b\u0002\u0010,\u001a\u00020\u00022\b\b\u0002\u0010-\u001a\u00020\u00022\b\b\u0002\u0010.\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b1\u00102J#\u00105\u001a\u00020\r*\u0004\u0018\u00010\r2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\r03H\u0000¢\u0006\u0004\b5\u00106J-\u0010;\u001a\u00020\u00022\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u000207H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b;\u0010<J-\u0010=\u001a\u00020\u00022\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u000207H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b=\u0010<J-\u0010>\u001a\u00020\u00022\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u000207H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b>\u0010<J-\u0010?\u001a\u00020\u00022\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u000207H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u0010<J-\u0010@\u001a\u00020\u00022\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u000207H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b@\u0010<J-\u0010A\u001a\u00020\u00022\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u000207H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bA\u0010<J-\u0010B\u001a\u00020\u00022\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u000207H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bB\u0010<J-\u0010C\u001a\u00020\u00022\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u000207H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bC\u0010<J-\u0010D\u001a\u00020\u00022\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u000207H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bD\u0010<J-\u0010E\u001a\u00020\u00022\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u000207H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bE\u0010<J\u001d\u0010F\u001a\u00020\u00022\u0006\u00109\u001a\u000207H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bF\u0010GJ\u001a\u0010I\u001a\u0002072\b\u0010H\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\bI\u0010JJ\u000f\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bL\u0010MR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b?\u0010N\u001a\u0004\bO\u0010PR\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b1\u0010N\u001a\u0004\bQ\u0010PR\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bF\u0010N\u001a\u0004\bR\u0010PR\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bS\u0010N\u001a\u0004\bT\u0010PR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b>\u0010N\u001a\u0004\bU\u0010PR\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bA\u0010N\u001a\u0004\bV\u0010PR\u001d\u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b;\u0010N\u001a\u0004\bW\u0010PR\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b@\u0010N\u001a\u0004\bX\u0010PR\u001d\u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bD\u0010N\u001a\u0004\bY\u0010PR\u001d\u0010\f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bE\u0010N\u001a\u0004\bZ\u0010PR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bC\u0010[\u001a\u0004\bS\u0010\\R\u001d\u0010\u000f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b5\u0010N\u001a\u0004\b]\u0010PR\u001d\u0010\u0010\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bB\u0010N\u001a\u0004\b^\u0010PR\u001d\u0010\u0011\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b=\u0010N\u001a\u0004\b_\u0010PR\u001d\u0010\u0012\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b`\u0010N\u001a\u0004\ba\u0010PR\u001d\u0010\u0013\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bb\u0010N\u001a\u0004\bc\u0010PR\u001d\u0010\u0014\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bd\u0010N\u001a\u0004\be\u0010PR\u001d\u0010\u0015\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bf\u0010N\u001a\u0004\bg\u0010PR\u001d\u0010\u0016\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bh\u0010N\u001a\u0004\bi\u0010PR\u001d\u0010\u0017\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bj\u0010N\u001a\u0004\bk\u0010PR\u001d\u0010\u0018\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bl\u0010N\u001a\u0004\bm\u0010PR\u001d\u0010\u0019\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bn\u0010N\u001a\u0004\bo\u0010PR\u001d\u0010\u001a\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bp\u0010N\u001a\u0004\bq\u0010PR\u001d\u0010\u001b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\br\u0010N\u001a\u0004\bs\u0010PR\u001d\u0010\u001c\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bt\u0010N\u001a\u0004\bu\u0010PR\u001d\u0010\u001d\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bv\u0010N\u001a\u0004\bw\u0010PR\u001d\u0010\u001e\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bx\u0010N\u001a\u0004\by\u0010PR\u001d\u0010\u001f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bz\u0010N\u001a\u0004\b{\u0010PR\u001d\u0010 \u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b|\u0010N\u001a\u0004\b}\u0010PR\u001d\u0010!\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b~\u0010N\u001a\u0004\b\u007f\u0010PR\u001f\u0010\"\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010N\u001a\u0005\b\u0081\u0001\u0010PR\u001f\u0010#\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010N\u001a\u0005\b\u0083\u0001\u0010PR\u001f\u0010$\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010N\u001a\u0005\b\u0085\u0001\u0010PR\u001f\u0010%\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010N\u001a\u0005\b\u0087\u0001\u0010PR\u001f\u0010&\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010N\u001a\u0005\b\u0089\u0001\u0010PR\u001f\u0010'\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010N\u001a\u0005\b\u008b\u0001\u0010PR\u001f\u0010(\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010N\u001a\u0005\b\u008d\u0001\u0010PR\u001f\u0010)\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010N\u001a\u0005\b\u008f\u0001\u0010PR\u001f\u0010*\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0090\u0001\u0010N\u001a\u0005\b\u0091\u0001\u0010PR\u001f\u0010+\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010N\u001a\u0005\b\u0093\u0001\u0010PR\u001f\u0010,\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010N\u001a\u0005\b\u0095\u0001\u0010PR\u001f\u0010-\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0096\u0001\u0010N\u001a\u0005\b\u0097\u0001\u0010PR\u001f\u0010.\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0098\u0001\u0010N\u001a\u0005\b\u0099\u0001\u0010P\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u009a\u0001"}, d2 = {"Landroidx/compose/material3/TextFieldColors;", "", "Landroidx/compose/ui/graphics/Color;", "focusedTextColor", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "textSelectionColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "<init>", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "rl", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/TextFieldColors;", "Lkotlin/Function0;", "block", "qie", "(Landroidx/compose/foundation/text/selection/TextSelectionColors;Lkotlin/jvm/functions/Function0;)Landroidx/compose/foundation/text/selection/TextSelectionColors;", "", "enabled", "isError", "focused", "Uo", "(ZZZ)J", "ty", "O", c.f62177j, "KN", "J2", "az", "gh", "xMQ", "mUb", "t", "(Z)J", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getFocusedTextColor-0d7_KjU", "()J", "getUnfocusedTextColor-0d7_KjU", "getDisabledTextColor-0d7_KjU", "nr", "getErrorTextColor-0d7_KjU", "getFocusedContainerColor-0d7_KjU", "getUnfocusedContainerColor-0d7_KjU", "getDisabledContainerColor-0d7_KjU", "getErrorContainerColor-0d7_KjU", "getCursorColor-0d7_KjU", "getErrorCursorColor-0d7_KjU", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "()Landroidx/compose/foundation/text/selection/TextSelectionColors;", "getFocusedIndicatorColor-0d7_KjU", "getUnfocusedIndicatorColor-0d7_KjU", "getDisabledIndicatorColor-0d7_KjU", "HI", "getErrorIndicatorColor-0d7_KjU", "ck", "getFocusedLeadingIconColor-0d7_KjU", "Ik", "getUnfocusedLeadingIconColor-0d7_KjU", "r", "getDisabledLeadingIconColor-0d7_KjU", "o", "getErrorLeadingIconColor-0d7_KjU", "Z", "getFocusedTrailingIconColor-0d7_KjU", "XQ", "getUnfocusedTrailingIconColor-0d7_KjU", "S", "getDisabledTrailingIconColor-0d7_KjU", "WPU", "getErrorTrailingIconColor-0d7_KjU", "aYN", "getFocusedLabelColor-0d7_KjU", "ViF", "getUnfocusedLabelColor-0d7_KjU", "nY", "getDisabledLabelColor-0d7_KjU", "g", "getErrorLabelColor-0d7_KjU", "te", "getFocusedPlaceholderColor-0d7_KjU", "iF", "getUnfocusedPlaceholderColor-0d7_KjU", "fD", "getDisabledPlaceholderColor-0d7_KjU", "E2", "getErrorPlaceholderColor-0d7_KjU", "e", "getFocusedSupportingTextColor-0d7_KjU", "X", "getUnfocusedSupportingTextColor-0d7_KjU", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "getDisabledSupportingTextColor-0d7_KjU", "N", "getErrorSupportingTextColor-0d7_KjU", "nHg", "getFocusedPrefixColor-0d7_KjU", "s7N", "getUnfocusedPrefixColor-0d7_KjU", "wTp", "getDisabledPrefixColor-0d7_KjU", "v", "getErrorPrefixColor-0d7_KjU", "rV9", "getFocusedSuffixColor-0d7_KjU", "bzg", "getUnfocusedSuffixColor-0d7_KjU", "Xw", "getDisabledSuffixColor-0d7_KjU", "jB", "getErrorSuffixColor-0d7_KjU", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/TextFieldColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,1698:1\n708#2:1699\n696#2:1700\n708#2:1701\n696#2:1702\n708#2:1703\n696#2:1704\n708#2:1705\n696#2:1706\n708#2:1707\n696#2:1708\n708#2:1709\n696#2:1710\n708#2:1711\n696#2:1712\n708#2:1713\n696#2:1714\n708#2:1715\n696#2:1716\n708#2:1717\n696#2:1718\n708#2:1719\n696#2:1720\n708#2:1721\n696#2:1722\n708#2:1723\n696#2:1724\n708#2:1725\n696#2:1726\n708#2:1727\n696#2:1728\n708#2:1729\n696#2:1730\n708#2:1731\n696#2:1732\n708#2:1733\n696#2:1734\n708#2:1735\n696#2:1736\n708#2:1737\n696#2:1738\n708#2:1739\n696#2:1740\n708#2:1741\n696#2:1742\n708#2:1743\n696#2:1744\n708#2:1745\n696#2:1746\n708#2:1747\n696#2:1748\n708#2:1749\n696#2:1750\n708#2:1751\n696#2:1752\n708#2:1753\n696#2:1754\n708#2:1755\n696#2:1756\n708#2:1757\n696#2:1758\n708#2:1759\n696#2:1760\n708#2:1761\n696#2:1762\n708#2:1763\n696#2:1764\n708#2:1765\n696#2:1766\n708#2:1767\n696#2:1768\n708#2:1769\n696#2:1770\n708#2:1771\n696#2:1772\n708#2:1773\n696#2:1774\n708#2:1775\n696#2:1776\n708#2:1777\n696#2:1778\n708#2:1779\n696#2:1780\n708#2:1781\n696#2:1782\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/TextFieldColors\n*L\n1342#1:1699\n1342#1:1700\n1343#1:1701\n1343#1:1702\n1344#1:1703\n1344#1:1704\n1345#1:1705\n1345#1:1706\n1346#1:1707\n1346#1:1708\n1347#1:1709\n1347#1:1710\n1348#1:1711\n1348#1:1712\n1349#1:1713\n1349#1:1714\n1350#1:1715\n1350#1:1716\n1351#1:1717\n1351#1:1718\n1353#1:1719\n1353#1:1720\n1354#1:1721\n1354#1:1722\n1355#1:1723\n1355#1:1724\n1356#1:1725\n1356#1:1726\n1357#1:1727\n1357#1:1728\n1358#1:1729\n1358#1:1730\n1359#1:1731\n1359#1:1732\n1360#1:1733\n1360#1:1734\n1361#1:1735\n1361#1:1736\n1362#1:1737\n1362#1:1738\n1363#1:1739\n1363#1:1740\n1364#1:1741\n1364#1:1742\n1365#1:1743\n1365#1:1744\n1366#1:1745\n1366#1:1746\n1367#1:1747\n1367#1:1748\n1368#1:1749\n1368#1:1750\n1369#1:1751\n1369#1:1752\n1370#1:1753\n1370#1:1754\n1371#1:1755\n1371#1:1756\n1372#1:1757\n1372#1:1758\n1373#1:1759\n1373#1:1760\n1374#1:1761\n1374#1:1762\n1375#1:1763\n1375#1:1764\n1376#1:1765\n1376#1:1766\n1377#1:1767\n1377#1:1768\n1378#1:1769\n1378#1:1770\n1379#1:1771\n1379#1:1772\n1380#1:1773\n1380#1:1774\n1381#1:1775\n1381#1:1776\n1382#1:1777\n1382#1:1778\n1383#1:1779\n1383#1:1780\n1384#1:1781\n1384#1:1782\n*E\n"})
public final class TextFieldColors {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private final long errorPlaceholderColor;

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private final long errorIndicatorColor;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private final long unfocusedLeadingIconColor;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final long unfocusedContainerColor;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final long errorContainerColor;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private final long errorSupportingTextColor;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final long focusedContainerColor;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final long disabledTrailingIconColor;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private final long disabledSupportingTextColor;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final long disabledContainerColor;

    /* JADX INFO: renamed from: ViF, reason: from kotlin metadata */
    private final long unfocusedLabelColor;

    /* JADX INFO: renamed from: WPU, reason: from kotlin metadata */
    private final long errorTrailingIconColor;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private final long unfocusedSupportingTextColor;

    /* JADX INFO: renamed from: XQ, reason: from kotlin metadata */
    private final long unfocusedTrailingIconColor;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private final long disabledSuffixColor;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private final long focusedTrailingIconColor;

    /* JADX INFO: renamed from: aYN, reason: from kotlin metadata */
    private final long focusedLabelColor;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final long unfocusedIndicatorColor;

    /* JADX INFO: renamed from: bzg, reason: from kotlin metadata */
    private final long unfocusedSuffixColor;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private final long focusedLeadingIconColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long focusedSupportingTextColor;

    /* JADX INFO: renamed from: fD, reason: from kotlin metadata */
    private final long disabledPlaceholderColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long errorLabelColor;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final SelectionColors textSelectionColors;

    /* JADX INFO: renamed from: iF, reason: from kotlin metadata */
    private final long unfocusedPlaceholderColor;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private final long errorSuffixColor;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final long errorCursorColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long focusedTextColor;

    /* JADX INFO: renamed from: nHg, reason: from kotlin metadata */
    private final long focusedPrefixColor;

    /* JADX INFO: renamed from: nY, reason: from kotlin metadata */
    private final long disabledLabelColor;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final long errorTextColor;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final long errorLeadingIconColor;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final long focusedIndicatorColor;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final long disabledLeadingIconColor;

    /* JADX INFO: renamed from: rV9, reason: from kotlin metadata */
    private final long focusedSuffixColor;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final long unfocusedTextColor;

    /* JADX INFO: renamed from: s7N, reason: from kotlin metadata */
    private final long unfocusedPrefixColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final long disabledTextColor;

    /* JADX INFO: renamed from: te, reason: from kotlin metadata */
    private final long focusedPlaceholderColor;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private final long disabledIndicatorColor;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final long errorPrefixColor;

    /* JADX INFO: renamed from: wTp, reason: from kotlin metadata */
    private final long disabledPrefixColor;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final long cursorColor;

    public /* synthetic */ TextFieldColors(long j2, long j3, long j4, long j5, long j6, long j7, long j9, long j10, long j11, long j12, SelectionColors selectionColors, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7, j9, j10, j11, j12, selectionColors, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42, j43, j44);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof TextFieldColors)) {
            return false;
        }
        TextFieldColors textFieldColors = (TextFieldColors) other;
        return Color.HI(this.focusedTextColor, textFieldColors.focusedTextColor) && Color.HI(this.unfocusedTextColor, textFieldColors.unfocusedTextColor) && Color.HI(this.disabledTextColor, textFieldColors.disabledTextColor) && Color.HI(this.errorTextColor, textFieldColors.errorTextColor) && Color.HI(this.focusedContainerColor, textFieldColors.focusedContainerColor) && Color.HI(this.unfocusedContainerColor, textFieldColors.unfocusedContainerColor) && Color.HI(this.disabledContainerColor, textFieldColors.disabledContainerColor) && Color.HI(this.errorContainerColor, textFieldColors.errorContainerColor) && Color.HI(this.cursorColor, textFieldColors.cursorColor) && Color.HI(this.errorCursorColor, textFieldColors.errorCursorColor) && Intrinsics.areEqual(this.textSelectionColors, textFieldColors.textSelectionColors) && Color.HI(this.focusedIndicatorColor, textFieldColors.focusedIndicatorColor) && Color.HI(this.unfocusedIndicatorColor, textFieldColors.unfocusedIndicatorColor) && Color.HI(this.disabledIndicatorColor, textFieldColors.disabledIndicatorColor) && Color.HI(this.errorIndicatorColor, textFieldColors.errorIndicatorColor) && Color.HI(this.focusedLeadingIconColor, textFieldColors.focusedLeadingIconColor) && Color.HI(this.unfocusedLeadingIconColor, textFieldColors.unfocusedLeadingIconColor) && Color.HI(this.disabledLeadingIconColor, textFieldColors.disabledLeadingIconColor) && Color.HI(this.errorLeadingIconColor, textFieldColors.errorLeadingIconColor) && Color.HI(this.focusedTrailingIconColor, textFieldColors.focusedTrailingIconColor) && Color.HI(this.unfocusedTrailingIconColor, textFieldColors.unfocusedTrailingIconColor) && Color.HI(this.disabledTrailingIconColor, textFieldColors.disabledTrailingIconColor) && Color.HI(this.errorTrailingIconColor, textFieldColors.errorTrailingIconColor) && Color.HI(this.focusedLabelColor, textFieldColors.focusedLabelColor) && Color.HI(this.unfocusedLabelColor, textFieldColors.unfocusedLabelColor) && Color.HI(this.disabledLabelColor, textFieldColors.disabledLabelColor) && Color.HI(this.errorLabelColor, textFieldColors.errorLabelColor) && Color.HI(this.focusedPlaceholderColor, textFieldColors.focusedPlaceholderColor) && Color.HI(this.unfocusedPlaceholderColor, textFieldColors.unfocusedPlaceholderColor) && Color.HI(this.disabledPlaceholderColor, textFieldColors.disabledPlaceholderColor) && Color.HI(this.errorPlaceholderColor, textFieldColors.errorPlaceholderColor) && Color.HI(this.focusedSupportingTextColor, textFieldColors.focusedSupportingTextColor) && Color.HI(this.unfocusedSupportingTextColor, textFieldColors.unfocusedSupportingTextColor) && Color.HI(this.disabledSupportingTextColor, textFieldColors.disabledSupportingTextColor) && Color.HI(this.errorSupportingTextColor, textFieldColors.errorSupportingTextColor) && Color.HI(this.focusedPrefixColor, textFieldColors.focusedPrefixColor) && Color.HI(this.unfocusedPrefixColor, textFieldColors.unfocusedPrefixColor) && Color.HI(this.disabledPrefixColor, textFieldColors.disabledPrefixColor) && Color.HI(this.errorPrefixColor, textFieldColors.errorPrefixColor) && Color.HI(this.focusedSuffixColor, textFieldColors.focusedSuffixColor) && Color.HI(this.unfocusedSuffixColor, textFieldColors.unfocusedSuffixColor) && Color.HI(this.disabledSuffixColor, textFieldColors.disabledSuffixColor) && Color.HI(this.errorSuffixColor, textFieldColors.errorSuffixColor);
    }

    public final TextFieldColors rl(long focusedTextColor, long unfocusedTextColor, long disabledTextColor, long errorTextColor, long focusedContainerColor, long unfocusedContainerColor, long disabledContainerColor, long errorContainerColor, long cursorColor, long errorCursorColor, SelectionColors textSelectionColors, long focusedIndicatorColor, long unfocusedIndicatorColor, long disabledIndicatorColor, long errorIndicatorColor, long focusedLeadingIconColor, long unfocusedLeadingIconColor, long disabledLeadingIconColor, long errorLeadingIconColor, long focusedTrailingIconColor, long unfocusedTrailingIconColor, long disabledTrailingIconColor, long errorTrailingIconColor, long focusedLabelColor, long unfocusedLabelColor, long disabledLabelColor, long errorLabelColor, long focusedPlaceholderColor, long unfocusedPlaceholderColor, long disabledPlaceholderColor, long errorPlaceholderColor, long focusedSupportingTextColor, long unfocusedSupportingTextColor, long disabledSupportingTextColor, long errorSupportingTextColor, long focusedPrefixColor, long unfocusedPrefixColor, long disabledPrefixColor, long errorPrefixColor, long focusedSuffixColor, long unfocusedSuffixColor, long disabledSuffixColor, long errorSuffixColor) {
        return new TextFieldColors(focusedTextColor != 16 ? focusedTextColor : this.focusedTextColor, unfocusedTextColor != 16 ? unfocusedTextColor : this.unfocusedTextColor, disabledTextColor != 16 ? disabledTextColor : this.disabledTextColor, errorTextColor != 16 ? errorTextColor : this.errorTextColor, focusedContainerColor != 16 ? focusedContainerColor : this.focusedContainerColor, unfocusedContainerColor != 16 ? unfocusedContainerColor : this.unfocusedContainerColor, disabledContainerColor != 16 ? disabledContainerColor : this.disabledContainerColor, errorContainerColor != 16 ? errorContainerColor : this.errorContainerColor, cursorColor != 16 ? cursorColor : this.cursorColor, errorCursorColor != 16 ? errorCursorColor : this.errorCursorColor, qie(textSelectionColors, new Function0<SelectionColors>() { // from class: androidx.compose.material3.TextFieldColors$copy$11
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final SelectionColors invoke() {
                return this.f28297n.getTextSelectionColors();
            }
        }), focusedIndicatorColor != 16 ? focusedIndicatorColor : this.focusedIndicatorColor, unfocusedIndicatorColor != 16 ? unfocusedIndicatorColor : this.unfocusedIndicatorColor, disabledIndicatorColor != 16 ? disabledIndicatorColor : this.disabledIndicatorColor, errorIndicatorColor != 16 ? errorIndicatorColor : this.errorIndicatorColor, focusedLeadingIconColor != 16 ? focusedLeadingIconColor : this.focusedLeadingIconColor, unfocusedLeadingIconColor != 16 ? unfocusedLeadingIconColor : this.unfocusedLeadingIconColor, disabledLeadingIconColor != 16 ? disabledLeadingIconColor : this.disabledLeadingIconColor, errorLeadingIconColor != 16 ? errorLeadingIconColor : this.errorLeadingIconColor, focusedTrailingIconColor != 16 ? focusedTrailingIconColor : this.focusedTrailingIconColor, unfocusedTrailingIconColor != 16 ? unfocusedTrailingIconColor : this.unfocusedTrailingIconColor, disabledTrailingIconColor != 16 ? disabledTrailingIconColor : this.disabledTrailingIconColor, errorTrailingIconColor != 16 ? errorTrailingIconColor : this.errorTrailingIconColor, focusedLabelColor != 16 ? focusedLabelColor : this.focusedLabelColor, unfocusedLabelColor != 16 ? unfocusedLabelColor : this.unfocusedLabelColor, disabledLabelColor != 16 ? disabledLabelColor : this.disabledLabelColor, errorLabelColor != 16 ? errorLabelColor : this.errorLabelColor, focusedPlaceholderColor != 16 ? focusedPlaceholderColor : this.focusedPlaceholderColor, unfocusedPlaceholderColor != 16 ? unfocusedPlaceholderColor : this.unfocusedPlaceholderColor, disabledPlaceholderColor != 16 ? disabledPlaceholderColor : this.disabledPlaceholderColor, errorPlaceholderColor != 16 ? errorPlaceholderColor : this.errorPlaceholderColor, focusedSupportingTextColor != 16 ? focusedSupportingTextColor : this.focusedSupportingTextColor, unfocusedSupportingTextColor != 16 ? unfocusedSupportingTextColor : this.unfocusedSupportingTextColor, disabledSupportingTextColor != 16 ? disabledSupportingTextColor : this.disabledSupportingTextColor, errorSupportingTextColor != 16 ? errorSupportingTextColor : this.errorSupportingTextColor, focusedPrefixColor != 16 ? focusedPrefixColor : this.focusedPrefixColor, unfocusedPrefixColor != 16 ? unfocusedPrefixColor : this.unfocusedPrefixColor, disabledPrefixColor != 16 ? disabledPrefixColor : this.disabledPrefixColor, errorPrefixColor != 16 ? errorPrefixColor : this.errorPrefixColor, focusedSuffixColor != 16 ? focusedSuffixColor : this.focusedSuffixColor, unfocusedSuffixColor != 16 ? unfocusedSuffixColor : this.unfocusedSuffixColor, disabledSuffixColor != 16 ? disabledSuffixColor : this.disabledSuffixColor, errorSuffixColor != 16 ? errorSuffixColor : this.errorSuffixColor, null);
    }

    private TextFieldColors(long j2, long j3, long j4, long j5, long j6, long j7, long j9, long j10, long j11, long j12, SelectionColors selectionColors, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44) {
        this.focusedTextColor = j2;
        this.unfocusedTextColor = j3;
        this.disabledTextColor = j4;
        this.errorTextColor = j5;
        this.focusedContainerColor = j6;
        this.unfocusedContainerColor = j7;
        this.disabledContainerColor = j9;
        this.errorContainerColor = j10;
        this.cursorColor = j11;
        this.errorCursorColor = j12;
        this.textSelectionColors = selectionColors;
        this.focusedIndicatorColor = j13;
        this.unfocusedIndicatorColor = j14;
        this.disabledIndicatorColor = j15;
        this.errorIndicatorColor = j16;
        this.focusedLeadingIconColor = j17;
        this.unfocusedLeadingIconColor = j18;
        this.disabledLeadingIconColor = j19;
        this.errorLeadingIconColor = j20;
        this.focusedTrailingIconColor = j21;
        this.unfocusedTrailingIconColor = j22;
        this.disabledTrailingIconColor = j23;
        this.errorTrailingIconColor = j24;
        this.focusedLabelColor = j25;
        this.unfocusedLabelColor = j26;
        this.disabledLabelColor = j27;
        this.errorLabelColor = j28;
        this.focusedPlaceholderColor = j29;
        this.unfocusedPlaceholderColor = j30;
        this.disabledPlaceholderColor = j31;
        this.errorPlaceholderColor = j32;
        this.focusedSupportingTextColor = j33;
        this.unfocusedSupportingTextColor = j34;
        this.disabledSupportingTextColor = j35;
        this.errorSupportingTextColor = j36;
        this.focusedPrefixColor = j37;
        this.unfocusedPrefixColor = j38;
        this.disabledPrefixColor = j39;
        this.errorPrefixColor = j40;
        this.focusedSuffixColor = j41;
        this.unfocusedSuffixColor = j42;
        this.disabledSuffixColor = j43;
        this.errorSuffixColor = j44;
    }

    public final long J2(boolean enabled, boolean isError, boolean focused) {
        return !enabled ? this.disabledLabelColor : isError ? this.errorLabelColor : focused ? this.focusedLabelColor : this.unfocusedLabelColor;
    }

    public final long KN(boolean enabled, boolean isError, boolean focused) {
        return !enabled ? this.disabledPlaceholderColor : isError ? this.errorPlaceholderColor : focused ? this.focusedPlaceholderColor : this.unfocusedPlaceholderColor;
    }

    public final long O(boolean enabled, boolean isError, boolean focused) {
        return !enabled ? this.disabledIndicatorColor : isError ? this.errorIndicatorColor : focused ? this.focusedIndicatorColor : this.unfocusedIndicatorColor;
    }

    public final long Uo(boolean enabled, boolean isError, boolean focused) {
        return !enabled ? this.disabledLeadingIconColor : isError ? this.errorLeadingIconColor : focused ? this.focusedLeadingIconColor : this.unfocusedLeadingIconColor;
    }

    public final long az(boolean enabled, boolean isError, boolean focused) {
        return !enabled ? this.disabledTextColor : isError ? this.errorTextColor : focused ? this.focusedTextColor : this.unfocusedTextColor;
    }

    public final long gh(boolean enabled, boolean isError, boolean focused) {
        return !enabled ? this.disabledSupportingTextColor : isError ? this.errorSupportingTextColor : focused ? this.focusedSupportingTextColor : this.unfocusedSupportingTextColor;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Color.XQ(this.focusedTextColor) * 31) + Color.XQ(this.unfocusedTextColor)) * 31) + Color.XQ(this.disabledTextColor)) * 31) + Color.XQ(this.errorTextColor)) * 31) + Color.XQ(this.focusedContainerColor)) * 31) + Color.XQ(this.unfocusedContainerColor)) * 31) + Color.XQ(this.disabledContainerColor)) * 31) + Color.XQ(this.errorContainerColor)) * 31) + Color.XQ(this.cursorColor)) * 31) + Color.XQ(this.errorCursorColor)) * 31) + this.textSelectionColors.hashCode()) * 31) + Color.XQ(this.focusedIndicatorColor)) * 31) + Color.XQ(this.unfocusedIndicatorColor)) * 31) + Color.XQ(this.disabledIndicatorColor)) * 31) + Color.XQ(this.errorIndicatorColor)) * 31) + Color.XQ(this.focusedLeadingIconColor)) * 31) + Color.XQ(this.unfocusedLeadingIconColor)) * 31) + Color.XQ(this.disabledLeadingIconColor)) * 31) + Color.XQ(this.errorLeadingIconColor)) * 31) + Color.XQ(this.focusedTrailingIconColor)) * 31) + Color.XQ(this.unfocusedTrailingIconColor)) * 31) + Color.XQ(this.disabledTrailingIconColor)) * 31) + Color.XQ(this.errorTrailingIconColor)) * 31) + Color.XQ(this.focusedLabelColor)) * 31) + Color.XQ(this.unfocusedLabelColor)) * 31) + Color.XQ(this.disabledLabelColor)) * 31) + Color.XQ(this.errorLabelColor)) * 31) + Color.XQ(this.focusedPlaceholderColor)) * 31) + Color.XQ(this.unfocusedPlaceholderColor)) * 31) + Color.XQ(this.disabledPlaceholderColor)) * 31) + Color.XQ(this.errorPlaceholderColor)) * 31) + Color.XQ(this.focusedSupportingTextColor)) * 31) + Color.XQ(this.unfocusedSupportingTextColor)) * 31) + Color.XQ(this.disabledSupportingTextColor)) * 31) + Color.XQ(this.errorSupportingTextColor)) * 31) + Color.XQ(this.focusedPrefixColor)) * 31) + Color.XQ(this.unfocusedPrefixColor)) * 31) + Color.XQ(this.disabledPrefixColor)) * 31) + Color.XQ(this.errorPrefixColor)) * 31) + Color.XQ(this.focusedSuffixColor)) * 31) + Color.XQ(this.unfocusedSuffixColor)) * 31) + Color.XQ(this.disabledSuffixColor)) * 31) + Color.XQ(this.errorSuffixColor);
    }

    public final long mUb(boolean enabled, boolean isError, boolean focused) {
        return !enabled ? this.disabledSuffixColor : isError ? this.errorSuffixColor : focused ? this.focusedSuffixColor : this.unfocusedSuffixColor;
    }

    public final long n(boolean enabled, boolean isError, boolean focused) {
        return !enabled ? this.disabledContainerColor : isError ? this.errorContainerColor : focused ? this.focusedContainerColor : this.unfocusedContainerColor;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final SelectionColors getTextSelectionColors() {
        return this.textSelectionColors;
    }

    public final SelectionColors qie(SelectionColors selectionColors, Function0 function0) {
        return selectionColors == null ? (SelectionColors) function0.invoke() : selectionColors;
    }

    public final long t(boolean isError) {
        return isError ? this.errorCursorColor : this.cursorColor;
    }

    public final long ty(boolean enabled, boolean isError, boolean focused) {
        return !enabled ? this.disabledTrailingIconColor : isError ? this.errorTrailingIconColor : focused ? this.focusedTrailingIconColor : this.unfocusedTrailingIconColor;
    }

    public final long xMQ(boolean enabled, boolean isError, boolean focused) {
        return !enabled ? this.disabledPrefixColor : isError ? this.errorPrefixColor : focused ? this.focusedPrefixColor : this.unfocusedPrefixColor;
    }
}
