package androidx.compose.foundation.text.input.internal;

import android.os.CancellationSignal;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextHighlightType;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextGranularity;
import androidx.compose.ui.text.TextInclusionStrategy;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextCommand;
import androidx.compose.ui.text.input.SetSelectionCommand;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\r\u001a\u00020\f*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u00020\n*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\u00020\f*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u00020\n*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u0017\u001a\u00020\f*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u0019\u001a\u00020\n*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001c\u001a\u00020\f*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u001e\u001a\u00020\n*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010#\u001a\u00020\f*\u00020\u00042\u0006\u0010\u0006\u001a\u00020 2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b#\u0010$J-\u0010&\u001a\u00020\f*\u00020\u00042\u0006\u0010\u0006\u001a\u00020%2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b&\u0010'J-\u0010)\u001a\u00020\f*\u00020\u00042\u0006\u0010\u0006\u001a\u00020(2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b)\u0010*J&\u0010/\u001a\u00020\n*\u00020\u00042\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0002ø\u0001\u0000¢\u0006\u0004\b/\u00100J\u001b\u00102\u001a\u00020\f*\u00020\u00042\u0006\u0010\u0006\u001a\u000201H\u0002¢\u0006\u0004\b2\u00103J&\u00107\u001a\u00020\n*\u00020\u00042\u0006\u00104\u001a\u00020+2\u0006\u00106\u001a\u000205H\u0002ø\u0001\u0000¢\u0006\u0004\b7\u00108J9\u0010?\u001a\u00020\f*\u0002092\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010;\u001a\u0004\u0018\u00010:2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\n0<H\u0002¢\u0006\u0004\b?\u0010@J%\u0010B\u001a\u00020\n*\u0002092\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010A\u001a\u0004\u0018\u00010:H\u0002¢\u0006\u0004\bB\u0010CJ7\u0010F\u001a\u00020\f*\u0002092\u0006\u0010\u0006\u001a\u00020\u00112\u0006\u0010E\u001a\u00020D2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\n0<H\u0002¢\u0006\u0004\bF\u0010GJ%\u0010H\u001a\u00020\n*\u0002092\u0006\u0010\u0006\u001a\u00020\u00112\b\u0010A\u001a\u0004\u0018\u00010:H\u0002¢\u0006\u0004\bH\u0010IJ9\u0010J\u001a\u00020\f*\u0002092\u0006\u0010\u0006\u001a\u00020\u00162\b\u0010;\u001a\u0004\u0018\u00010:2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\n0<H\u0002¢\u0006\u0004\bJ\u0010KJ%\u0010L\u001a\u00020\n*\u0002092\u0006\u0010\u0006\u001a\u00020\u00162\b\u0010A\u001a\u0004\u0018\u00010:H\u0002¢\u0006\u0004\bL\u0010MJ7\u0010N\u001a\u00020\f*\u0002092\u0006\u0010\u0006\u001a\u00020\u001b2\u0006\u0010E\u001a\u00020D2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\n0<H\u0002¢\u0006\u0004\bN\u0010OJ%\u0010P\u001a\u00020\n*\u0002092\u0006\u0010\u0006\u001a\u00020\u001b2\b\u0010A\u001a\u0004\u0018\u00010:H\u0002¢\u0006\u0004\bP\u0010QJA\u0010R\u001a\u00020\f*\u0002092\u0006\u0010\u0006\u001a\u00020 2\u0006\u0010E\u001a\u00020D2\b\u0010\"\u001a\u0004\u0018\u00010!2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\n0<H\u0002¢\u0006\u0004\bR\u0010SJ9\u0010T\u001a\u00020\f*\u0002092\u0006\u0010\u0006\u001a\u00020%2\b\u0010\"\u001a\u0004\u0018\u00010!2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\n0<H\u0002¢\u0006\u0004\bT\u0010UJA\u0010V\u001a\u00020\f*\u0002092\u0006\u0010\u0006\u001a\u00020(2\u0006\u0010E\u001a\u00020D2\b\u0010\"\u001a\u0004\u0018\u00010!2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\n0<H\u0002¢\u0006\u0004\bV\u0010WJ3\u0010Z\u001a\u00020\n2\u0006\u0010X\u001a\u00020\f2\u0006\u0010E\u001a\u00020Y2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\n0<H\u0002¢\u0006\u0004\bZ\u0010[J8\u0010\\\u001a\u00020\n2\u0006\u00104\u001a\u00020+2\b\u0010;\u001a\u0004\u0018\u00010:2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\n0<H\u0002ø\u0001\u0000¢\u0006\u0004\b\\\u0010]J>\u0010^\u001a\u00020\n2\u0006\u00104\u001a\u00020+2\u0006\u0010E\u001a\u00020D2\u0006\u0010.\u001a\u00020-2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\n0<H\u0002ø\u0001\u0000¢\u0006\u0004\b^\u0010_J+\u0010`\u001a\u00020\f2\u0006\u0010\u0006\u001a\u0002012\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\n0<H\u0002¢\u0006\u0004\b`\u0010aJ\u0019\u0010c\u001a\u00020b*\u00020\fH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bc\u0010dJ=\u0010f\u001a\u00020\f*\u00020\u00042\u0006\u0010e\u001a\u0002012\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0000¢\u0006\u0004\bf\u0010gJ-\u0010k\u001a\u00020-*\u00020\u00042\u0006\u0010e\u001a\u00020h2\u0006\u0010\b\u001a\u00020\u00072\b\u0010j\u001a\u0004\u0018\u00010iH\u0000¢\u0006\u0004\bk\u0010lJC\u0010m\u001a\u00020\f*\u0002092\u0006\u0010\u0006\u001a\u0002012\b\u0010A\u001a\u0004\u0018\u00010:2\b\u0010\"\u001a\u0004\u0018\u00010!2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\n0<H\u0000¢\u0006\u0004\bm\u0010nJ/\u0010o\u001a\u00020-*\u0002092\u0006\u0010\u0006\u001a\u00020h2\b\u0010A\u001a\u0004\u0018\u00010:2\b\u0010j\u001a\u0004\u0018\u00010iH\u0000¢\u0006\u0004\bo\u0010p\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006q"}, d2 = {"Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;", "", "<init>", "()V", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "Landroid/view/inputmethod/SelectGesture;", "gesture", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "layoutState", "Lkotlin/Function0;", "", "updateSelectionState", "", "S", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/SelectGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Lkotlin/jvm/functions/Function0;)I", "N", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/SelectGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;)V", "Landroid/view/inputmethod/DeleteGesture;", "Uo", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/DeleteGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;)I", "g", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/DeleteGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;)V", "Landroid/view/inputmethod/SelectRangeGesture;", "aYN", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/SelectRangeGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Lkotlin/jvm/functions/Function0;)I", "s7N", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/SelectRangeGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;)V", "Landroid/view/inputmethod/DeleteRangeGesture;", "xMQ", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/DeleteRangeGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;)I", "iF", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/DeleteRangeGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;)V", "Landroid/view/inputmethod/JoinOrSplitGesture;", "Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "r", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/JoinOrSplitGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/platform/ViewConfiguration;)I", "Landroid/view/inputmethod/InsertGesture;", "HI", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/InsertGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/platform/ViewConfiguration;)I", "Landroid/view/inputmethod/RemoveSpaceGesture;", "Z", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/RemoveSpaceGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/platform/ViewConfiguration;)I", "Landroidx/compose/ui/text/TextRange;", "rangeInTransformedText", "", "adjustRange", "mUb", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;JZ)V", "Landroid/view/inputmethod/HandwritingGesture;", "t", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/HandwritingGesture;)I", "range", "Landroidx/compose/foundation/text/input/TextHighlightType;", "type", "O", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;JI)V", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "textSelectionManager", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/EditCommand;", "editCommandConsumer", "XQ", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/SelectGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function1;)I", "textFieldSelectionManager", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/SelectGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V", "Landroidx/compose/ui/text/AnnotatedString;", "text", "J2", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/DeleteGesture;Landroidx/compose/ui/text/AnnotatedString;Lkotlin/jvm/functions/Function1;)I", "nY", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/DeleteGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V", "WPU", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/SelectRangeGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function1;)I", "nHg", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/SelectRangeGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V", "KN", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/DeleteRangeGesture;Landroidx/compose/ui/text/AnnotatedString;Lkotlin/jvm/functions/Function1;)I", "te", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/DeleteRangeGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V", "Ik", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/JoinOrSplitGesture;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/platform/ViewConfiguration;Lkotlin/jvm/functions/Function1;)I", "ty", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/InsertGesture;Landroidx/compose/ui/platform/ViewConfiguration;Lkotlin/jvm/functions/Function1;)I", "o", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/RemoveSpaceGesture;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/platform/ViewConfiguration;Lkotlin/jvm/functions/Function1;)I", "offset", "", "ck", "(ILjava/lang/String;Lkotlin/jvm/functions/Function1;)V", "ViF", "(JLandroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function1;)V", "gh", "(JLandroidx/compose/ui/text/AnnotatedString;ZLkotlin/jvm/functions/Function1;)V", "nr", "(Landroid/view/inputmethod/HandwritingGesture;Lkotlin/jvm/functions/Function1;)I", "Landroidx/compose/ui/text/TextGranularity;", "wTp", "(I)I", "handwritingGesture", "az", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/HandwritingGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/platform/ViewConfiguration;)I", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "Landroid/os/CancellationSignal;", "cancellationSignal", "E2", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroid/os/CancellationSignal;)Z", "qie", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/HandwritingGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/platform/ViewConfiguration;Lkotlin/jvm/functions/Function1;)I", "fD", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroid/os/CancellationSignal;)Z", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@RequiresApi
@SourceDebugExtension({"SMAP\nHandwritingGesture.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandwritingGesture.android.kt\nandroidx/compose/foundation/text/input/internal/HandwritingGestureApi34\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldState\n+ 4 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n*L\n1#1,1102:1\n1#2:1103\n316#3,6:1104\n324#3,3:1118\n327#3:1127\n316#3,6:1128\n324#3,3:1142\n327#3:1151\n316#3,6:1152\n324#3,3:1166\n327#3:1175\n254#4,8:1110\n263#4,6:1121\n254#4,8:1134\n263#4,6:1145\n254#4,8:1158\n263#4,6:1169\n*S KotlinDebug\n*F\n+ 1 HandwritingGesture.android.kt\nandroidx/compose/foundation/text/input/internal/HandwritingGestureApi34\n*L\n353#1:1104,6\n353#1:1118,3\n353#1:1127\n370#1:1128,6\n370#1:1142,3\n370#1:1151\n92#1:1152,6\n92#1:1166,3\n92#1:1175\n353#1:1110,8\n353#1:1121,6\n370#1:1134,8\n370#1:1145,6\n92#1:1158,8\n92#1:1169,6\n*E\n"})
public final class HandwritingGestureApi34 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final HandwritingGestureApi34 f20119n = new HandwritingGestureApi34();

    private final void gh(long range, AnnotatedString text, boolean adjustRange, Function1 editCommandConsumer) {
        if (adjustRange) {
            range = HandwritingGesture_androidKt.az(range, text);
        }
        editCommandConsumer.invoke(HandwritingGesture_androidKt.ty(new SetSelectionCommand(TextRange.xMQ(range), TextRange.xMQ(range)), new DeleteSurroundingTextCommand(TextRange.mUb(range), 0)));
    }

    private final int o(LegacyTextFieldState legacyTextFieldState, RemoveSpaceGesture removeSpaceGesture, AnnotatedString annotatedString, ViewConfiguration viewConfiguration, Function1 function1) {
        TextLayoutResultProxy textLayoutResultProxyQie = legacyTextFieldState.qie();
        long jZ = HandwritingGesture_androidKt.Z(textLayoutResultProxyQie != null ? textLayoutResultProxyQie.getValue() : null, HandwritingGesture_androidKt.e(removeSpaceGesture.getStartPoint()), HandwritingGesture_androidKt.e(removeSpaceGesture.getEndPoint()), legacyTextFieldState.gh(), viewConfiguration);
        if (TextRange.KN(jZ)) {
            return f20119n.nr(Lu.n(removeSpaceGesture), function1);
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        final Ref.IntRef intRef2 = new Ref.IntRef();
        intRef2.element = -1;
        String strReplace = new Regex("\\s+").replace(TextRangeKt.O(annotatedString, jZ), new Function1<MatchResult, CharSequence>() { // from class: androidx.compose.foundation.text.input.internal.HandwritingGestureApi34$performRemoveSpaceGesture$newText$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(MatchResult matchResult) {
                Ref.IntRef intRef3 = intRef;
                if (intRef3.element == -1) {
                    intRef3.element = matchResult.getRange().getFirst();
                }
                intRef2.element = matchResult.getRange().getLast() + 1;
                return "";
            }
        });
        if (intRef.element == -1 || intRef2.element == -1) {
            return nr(Lu.n(removeSpaceGesture), function1);
        }
        int iTy = TextRange.ty(jZ) + intRef.element;
        int iTy2 = TextRange.ty(jZ) + intRef2.element;
        String strSubstring = strReplace.substring(intRef.element, strReplace.length() - (TextRange.mUb(jZ) - intRef2.element));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        function1.invoke(HandwritingGesture_androidKt.ty(new SetSelectionCommand(iTy, iTy2), new CommitTextCommand(strSubstring, 1)));
        return 1;
    }

    private final int wTp(int i2) {
        return i2 != 1 ? i2 != 2 ? TextGranularity.INSTANCE.n() : TextGranularity.INSTANCE.n() : TextGranularity.INSTANCE.rl();
    }

    private final int Ik(LegacyTextFieldState legacyTextFieldState, JoinOrSplitGesture joinOrSplitGesture, AnnotatedString annotatedString, ViewConfiguration viewConfiguration, Function1 function1) {
        TextLayoutResultProxy textLayoutResultProxyQie;
        TextLayoutResult value;
        if (viewConfiguration == null) {
            return nr(Lu.n(joinOrSplitGesture), function1);
        }
        int iIk = HandwritingGesture_androidKt.Ik(legacyTextFieldState, HandwritingGesture_androidKt.e(joinOrSplitGesture.getJoinOrSplitPoint()), viewConfiguration);
        if (iIk == -1 || !((textLayoutResultProxyQie = legacyTextFieldState.qie()) == null || (value = textLayoutResultProxyQie.getValue()) == null || !HandwritingGesture_androidKt.nY(value, iIk))) {
            return nr(Lu.n(joinOrSplitGesture), function1);
        }
        long jE2 = HandwritingGesture_androidKt.E2(annotatedString, iIk);
        if (TextRange.KN(jE2)) {
            ck(TextRange.ty(jE2), " ", function1);
        } else {
            gh(jE2, annotatedString, false, function1);
        }
        return 1;
    }

    private final void T(LegacyTextFieldState legacyTextFieldState, SelectGesture selectGesture, TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.xg(HandwritingGesture_androidKt.S(legacyTextFieldState, RectHelper_androidKt.J2(selectGesture.getSelectionArea()), wTp(selectGesture.getGranularity()), TextInclusionStrategy.INSTANCE.KN()));
        }
    }

    private final void ViF(long range, TextFieldSelectionManager textSelectionManager, Function1 editCommandConsumer) {
        editCommandConsumer.invoke(new SetSelectionCommand(TextRange.ty(range), TextRange.xMQ(range)));
        if (textSelectionManager != null) {
            textSelectionManager.aYN(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.ck();
        }
    }

    private final void ck(int offset, String text, Function1 editCommandConsumer) {
        editCommandConsumer.invoke(HandwritingGesture_androidKt.ty(new SetSelectionCommand(offset, offset), new CommitTextCommand(text, 1)));
    }

    private final void mUb(TransformedTextFieldState transformedTextFieldState, long j2, boolean z2) {
        if (z2) {
            j2 = HandwritingGesture_androidKt.az(j2, transformedTextFieldState.HI());
        }
        TransformedTextFieldState.nY(transformedTextFieldState, "", j2, null, false, 12, null);
    }

    private final void nHg(LegacyTextFieldState legacyTextFieldState, SelectRangeGesture selectRangeGesture, TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.xg(HandwritingGesture_androidKt.aYN(legacyTextFieldState, RectHelper_androidKt.J2(selectRangeGesture.getSelectionStartArea()), RectHelper_androidKt.J2(selectRangeGesture.getSelectionEndArea()), wTp(selectRangeGesture.getGranularity()), TextInclusionStrategy.INSTANCE.KN()));
        }
    }

    private final void nY(LegacyTextFieldState legacyTextFieldState, DeleteGesture deleteGesture, TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.GR(HandwritingGesture_androidKt.S(legacyTextFieldState, RectHelper_androidKt.J2(deleteGesture.getDeletionArea()), wTp(deleteGesture.getGranularity()), TextInclusionStrategy.INSTANCE.KN()));
        }
    }

    private final void te(LegacyTextFieldState legacyTextFieldState, DeleteRangeGesture deleteRangeGesture, TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.GR(HandwritingGesture_androidKt.aYN(legacyTextFieldState, RectHelper_androidKt.J2(deleteRangeGesture.getDeletionStartArea()), RectHelper_androidKt.J2(deleteRangeGesture.getDeletionEndArea()), wTp(deleteRangeGesture.getGranularity()), TextInclusionStrategy.INSTANCE.KN()));
        }
    }

    private final int ty(LegacyTextFieldState legacyTextFieldState, InsertGesture insertGesture, ViewConfiguration viewConfiguration, Function1 function1) {
        TextLayoutResultProxy textLayoutResultProxyQie;
        TextLayoutResult value;
        if (viewConfiguration == null) {
            return nr(Lu.n(insertGesture), function1);
        }
        int iIk = HandwritingGesture_androidKt.Ik(legacyTextFieldState, HandwritingGesture_androidKt.e(insertGesture.getInsertionPoint()), viewConfiguration);
        if (iIk == -1 || !((textLayoutResultProxyQie = legacyTextFieldState.qie()) == null || (value = textLayoutResultProxyQie.getValue()) == null || !HandwritingGesture_androidKt.nY(value, iIk))) {
            return nr(Lu.n(insertGesture), function1);
        }
        ck(iIk, insertGesture.getTextToInsert(), function1);
        return 1;
    }

    private HandwritingGestureApi34() {
    }

    private final int HI(TransformedTextFieldState transformedTextFieldState, InsertGesture insertGesture, TextLayoutState textLayoutState, ViewConfiguration viewConfiguration) {
        int iR = HandwritingGesture_androidKt.r(textLayoutState, HandwritingGesture_androidKt.e(insertGesture.getInsertionPoint()), viewConfiguration);
        if (iR == -1) {
            return t(transformedTextFieldState, Lu.n(insertGesture));
        }
        TransformedTextFieldState.nY(transformedTextFieldState, insertGesture.getTextToInsert(), TextRangeKt.n(iR), null, false, 12, null);
        return 1;
    }

    private final int J2(LegacyTextFieldState legacyTextFieldState, DeleteGesture deleteGesture, AnnotatedString annotatedString, Function1 function1) {
        int iWTp = wTp(deleteGesture.getGranularity());
        long jS2 = HandwritingGesture_androidKt.S(legacyTextFieldState, RectHelper_androidKt.J2(deleteGesture.getDeletionArea()), iWTp, TextInclusionStrategy.INSTANCE.KN());
        if (TextRange.KN(jS2)) {
            return f20119n.nr(Lu.n(deleteGesture), function1);
        }
        gh(jS2, annotatedString, TextGranularity.O(iWTp, TextGranularity.INSTANCE.rl()), function1);
        return 1;
    }

    private final int KN(LegacyTextFieldState legacyTextFieldState, DeleteRangeGesture deleteRangeGesture, AnnotatedString annotatedString, Function1 function1) {
        int iWTp = wTp(deleteRangeGesture.getGranularity());
        long jAYN = HandwritingGesture_androidKt.aYN(legacyTextFieldState, RectHelper_androidKt.J2(deleteRangeGesture.getDeletionStartArea()), RectHelper_androidKt.J2(deleteRangeGesture.getDeletionEndArea()), iWTp, TextInclusionStrategy.INSTANCE.KN());
        if (TextRange.KN(jAYN)) {
            return f20119n.nr(Lu.n(deleteRangeGesture), function1);
        }
        gh(jAYN, annotatedString, TextGranularity.O(iWTp, TextGranularity.INSTANCE.rl()), function1);
        return 1;
    }

    private final void N(TransformedTextFieldState transformedTextFieldState, SelectGesture selectGesture, TextLayoutState textLayoutState) {
        O(transformedTextFieldState, HandwritingGesture_androidKt.WPU(textLayoutState, RectHelper_androidKt.J2(selectGesture.getSelectionArea()), wTp(selectGesture.getGranularity()), TextInclusionStrategy.INSTANCE.KN()), TextHighlightType.INSTANCE.rl());
    }

    private final void O(TransformedTextFieldState transformedTextFieldState, long j2, int i2) {
        if (TextRange.KN(j2)) {
            TextFieldState textFieldState = transformedTextFieldState.textFieldState;
            InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
            TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.f20586n;
            textFieldState.getMainBuffer().O().O();
            TextFieldBuffer mainBuffer = textFieldState.getMainBuffer();
            mainBuffer.t();
            transformedTextFieldState.X(mainBuffer);
            textFieldState.O(inputTransformation, true, textFieldEditUndoBehavior);
            return;
        }
        transformedTextFieldState.ck(i2, j2);
    }

    private final int S(TransformedTextFieldState transformedTextFieldState, SelectGesture selectGesture, TextLayoutState textLayoutState, Function0 function0) {
        long jWPU = HandwritingGesture_androidKt.WPU(textLayoutState, RectHelper_androidKt.J2(selectGesture.getSelectionArea()), wTp(selectGesture.getGranularity()), TextInclusionStrategy.INSTANCE.KN());
        if (TextRange.KN(jWPU)) {
            return f20119n.t(transformedTextFieldState, Lu.n(selectGesture));
        }
        transformedTextFieldState.te(jWPU);
        if (function0 != null) {
            function0.invoke();
            return 1;
        }
        return 1;
    }

    private final int Uo(TransformedTextFieldState transformedTextFieldState, DeleteGesture deleteGesture, TextLayoutState textLayoutState) {
        int iWTp = wTp(deleteGesture.getGranularity());
        long jWPU = HandwritingGesture_androidKt.WPU(textLayoutState, RectHelper_androidKt.J2(deleteGesture.getDeletionArea()), iWTp, TextInclusionStrategy.INSTANCE.KN());
        if (TextRange.KN(jWPU)) {
            return f20119n.t(transformedTextFieldState, Lu.n(deleteGesture));
        }
        mUb(transformedTextFieldState, jWPU, TextGranularity.O(iWTp, TextGranularity.INSTANCE.rl()));
        return 1;
    }

    private final int WPU(LegacyTextFieldState legacyTextFieldState, SelectRangeGesture selectRangeGesture, TextFieldSelectionManager textFieldSelectionManager, Function1 function1) {
        long jAYN = HandwritingGesture_androidKt.aYN(legacyTextFieldState, RectHelper_androidKt.J2(selectRangeGesture.getSelectionStartArea()), RectHelper_androidKt.J2(selectRangeGesture.getSelectionEndArea()), wTp(selectRangeGesture.getGranularity()), TextInclusionStrategy.INSTANCE.KN());
        if (TextRange.KN(jAYN)) {
            return f20119n.nr(Lu.n(selectRangeGesture), function1);
        }
        ViF(jAYN, textFieldSelectionManager, function1);
        return 1;
    }

    private final int XQ(LegacyTextFieldState legacyTextFieldState, SelectGesture selectGesture, TextFieldSelectionManager textFieldSelectionManager, Function1 function1) {
        long jS2 = HandwritingGesture_androidKt.S(legacyTextFieldState, RectHelper_androidKt.J2(selectGesture.getSelectionArea()), wTp(selectGesture.getGranularity()), TextInclusionStrategy.INSTANCE.KN());
        if (TextRange.KN(jS2)) {
            return f20119n.nr(Lu.n(selectGesture), function1);
        }
        ViF(jS2, textFieldSelectionManager, function1);
        return 1;
    }

    private final int Z(TransformedTextFieldState transformedTextFieldState, RemoveSpaceGesture removeSpaceGesture, TextLayoutState textLayoutState, ViewConfiguration viewConfiguration) {
        long jZ = HandwritingGesture_androidKt.Z(textLayoutState.J2(), HandwritingGesture_androidKt.e(removeSpaceGesture.getStartPoint()), HandwritingGesture_androidKt.e(removeSpaceGesture.getEndPoint()), textLayoutState.mUb(), viewConfiguration);
        if (TextRange.KN(jZ)) {
            return f20119n.t(transformedTextFieldState, Lu.n(removeSpaceGesture));
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        final Ref.IntRef intRef2 = new Ref.IntRef();
        intRef2.element = -1;
        String strReplace = new Regex("\\s+").replace(TextRangeKt.O(transformedTextFieldState.HI(), jZ), new Function1<MatchResult, CharSequence>() { // from class: androidx.compose.foundation.text.input.internal.HandwritingGestureApi34$performRemoveSpaceGesture$newText$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(MatchResult matchResult) {
                Ref.IntRef intRef3 = intRef;
                if (intRef3.element == -1) {
                    intRef3.element = matchResult.getRange().getFirst();
                }
                intRef2.element = matchResult.getRange().getLast() + 1;
                return "";
            }
        });
        if (intRef.element != -1 && intRef2.element != -1) {
            long jRl = TextRangeKt.rl(TextRange.ty(jZ) + intRef.element, TextRange.ty(jZ) + intRef2.element);
            String strSubstring = strReplace.substring(intRef.element, strReplace.length() - (TextRange.mUb(jZ) - intRef2.element));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            TransformedTextFieldState.nY(transformedTextFieldState, strSubstring, jRl, null, false, 12, null);
            return 1;
        }
        return t(transformedTextFieldState, Lu.n(removeSpaceGesture));
    }

    private final int aYN(TransformedTextFieldState transformedTextFieldState, SelectRangeGesture selectRangeGesture, TextLayoutState textLayoutState, Function0 function0) {
        long jViF = HandwritingGesture_androidKt.ViF(textLayoutState, RectHelper_androidKt.J2(selectRangeGesture.getSelectionStartArea()), RectHelper_androidKt.J2(selectRangeGesture.getSelectionEndArea()), wTp(selectRangeGesture.getGranularity()), TextInclusionStrategy.INSTANCE.KN());
        if (TextRange.KN(jViF)) {
            return f20119n.t(transformedTextFieldState, Lu.n(selectRangeGesture));
        }
        transformedTextFieldState.te(jViF);
        if (function0 != null) {
            function0.invoke();
            return 1;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(TransformedTextFieldState transformedTextFieldState) {
        TextFieldState textFieldState = transformedTextFieldState.textFieldState;
        InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.f20586n;
        textFieldState.getMainBuffer().O().O();
        TextFieldBuffer mainBuffer = textFieldState.getMainBuffer();
        mainBuffer.t();
        transformedTextFieldState.X(mainBuffer);
        textFieldState.O(inputTransformation, true, textFieldEditUndoBehavior);
    }

    private final void g(TransformedTextFieldState transformedTextFieldState, DeleteGesture deleteGesture, TextLayoutState textLayoutState) {
        O(transformedTextFieldState, HandwritingGesture_androidKt.WPU(textLayoutState, RectHelper_androidKt.J2(deleteGesture.getDeletionArea()), wTp(deleteGesture.getGranularity()), TextInclusionStrategy.INSTANCE.KN()), TextHighlightType.INSTANCE.n());
    }

    private final void iF(TransformedTextFieldState transformedTextFieldState, DeleteRangeGesture deleteRangeGesture, TextLayoutState textLayoutState) {
        O(transformedTextFieldState, HandwritingGesture_androidKt.ViF(textLayoutState, RectHelper_androidKt.J2(deleteRangeGesture.getDeletionStartArea()), RectHelper_androidKt.J2(deleteRangeGesture.getDeletionEndArea()), wTp(deleteRangeGesture.getGranularity()), TextInclusionStrategy.INSTANCE.KN()), TextHighlightType.INSTANCE.n());
    }

    private final int nr(HandwritingGesture gesture, Function1 editCommandConsumer) {
        String fallbackText = gesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        editCommandConsumer.invoke(new CommitTextCommand(fallbackText, 1));
        return 5;
    }

    private final int r(TransformedTextFieldState transformedTextFieldState, JoinOrSplitGesture joinOrSplitGesture, TextLayoutState textLayoutState, ViewConfiguration viewConfiguration) {
        TextLayoutResult textLayoutResultJ2;
        if (transformedTextFieldState.qie() == transformedTextFieldState.ty()) {
            int iR = HandwritingGesture_androidKt.r(textLayoutState, HandwritingGesture_androidKt.e(joinOrSplitGesture.getJoinOrSplitPoint()), viewConfiguration);
            if (iR != -1 && ((textLayoutResultJ2 = textLayoutState.J2()) == null || !HandwritingGesture_androidKt.nY(textLayoutResultJ2, iR))) {
                long jE2 = HandwritingGesture_androidKt.E2(transformedTextFieldState.HI(), iR);
                if (TextRange.KN(jE2)) {
                    TransformedTextFieldState.nY(transformedTextFieldState, " ", jE2, null, false, 12, null);
                } else {
                    mUb(transformedTextFieldState, jE2, false);
                }
                return 1;
            }
            return t(transformedTextFieldState, Lu.n(joinOrSplitGesture));
        }
        return 3;
    }

    private final void s7N(TransformedTextFieldState transformedTextFieldState, SelectRangeGesture selectRangeGesture, TextLayoutState textLayoutState) {
        O(transformedTextFieldState, HandwritingGesture_androidKt.ViF(textLayoutState, RectHelper_androidKt.J2(selectRangeGesture.getSelectionStartArea()), RectHelper_androidKt.J2(selectRangeGesture.getSelectionEndArea()), wTp(selectRangeGesture.getGranularity()), TextInclusionStrategy.INSTANCE.KN()), TextHighlightType.INSTANCE.rl());
    }

    private final int t(TransformedTextFieldState transformedTextFieldState, HandwritingGesture handwritingGesture) {
        TextFieldState textFieldState = transformedTextFieldState.textFieldState;
        InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.f20586n;
        textFieldState.getMainBuffer().O().O();
        TextFieldBuffer mainBuffer = textFieldState.getMainBuffer();
        mainBuffer.t();
        transformedTextFieldState.X(mainBuffer);
        textFieldState.O(inputTransformation, true, textFieldEditUndoBehavior);
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        TransformedTextFieldState.aYN(transformedTextFieldState, fallbackText, true, null, false, 12, null);
        return 5;
    }

    private final int xMQ(TransformedTextFieldState transformedTextFieldState, DeleteRangeGesture deleteRangeGesture, TextLayoutState textLayoutState) {
        int iWTp = wTp(deleteRangeGesture.getGranularity());
        long jViF = HandwritingGesture_androidKt.ViF(textLayoutState, RectHelper_androidKt.J2(deleteRangeGesture.getDeletionStartArea()), RectHelper_androidKt.J2(deleteRangeGesture.getDeletionEndArea()), iWTp, TextInclusionStrategy.INSTANCE.KN());
        if (TextRange.KN(jViF)) {
            return f20119n.t(transformedTextFieldState, Lu.n(deleteRangeGesture));
        }
        mUb(transformedTextFieldState, jViF, TextGranularity.O(iWTp, TextGranularity.INSTANCE.rl()));
        return 1;
    }

    public final boolean E2(final TransformedTextFieldState transformedTextFieldState, PreviewableHandwritingGesture previewableHandwritingGesture, TextLayoutState textLayoutState, CancellationSignal cancellationSignal) {
        if (SPz.n(previewableHandwritingGesture)) {
            N(transformedTextFieldState, lej.n(previewableHandwritingGesture), textLayoutState);
        } else if (P.n(previewableHandwritingGesture)) {
            g(transformedTextFieldState, iF.n(previewableHandwritingGesture), textLayoutState);
        } else if (yg.n(previewableHandwritingGesture)) {
            s7N(transformedTextFieldState, pO.n(previewableHandwritingGesture), textLayoutState);
        } else if (Sis.n(previewableHandwritingGesture)) {
            iF(transformedTextFieldState, l4Z.n(previewableHandwritingGesture), textLayoutState);
        } else {
            return false;
        }
        if (cancellationSignal != null) {
            cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.compose.foundation.text.input.internal.O
                @Override // android.os.CancellationSignal.OnCancelListener
                public final void onCancel() {
                    HandwritingGestureApi34.e(transformedTextFieldState);
                }
            });
            return true;
        }
        return true;
    }

    public final int az(TransformedTextFieldState transformedTextFieldState, HandwritingGesture handwritingGesture, TextLayoutState textLayoutState, Function0 function0, ViewConfiguration viewConfiguration) {
        if (SPz.n(handwritingGesture)) {
            return S(transformedTextFieldState, lej.n(handwritingGesture), textLayoutState, function0);
        }
        if (P.n(handwritingGesture)) {
            return Uo(transformedTextFieldState, iF.n(handwritingGesture), textLayoutState);
        }
        if (yg.n(handwritingGesture)) {
            return aYN(transformedTextFieldState, pO.n(handwritingGesture), textLayoutState, function0);
        }
        if (Sis.n(handwritingGesture)) {
            return xMQ(transformedTextFieldState, l4Z.n(handwritingGesture), textLayoutState);
        }
        if (rv6.n(handwritingGesture)) {
            return r(transformedTextFieldState, vd.n(handwritingGesture), textLayoutState, viewConfiguration);
        }
        if (qf.n(handwritingGesture)) {
            return HI(transformedTextFieldState, Ln.n(handwritingGesture), textLayoutState, viewConfiguration);
        }
        if (iwV.n(handwritingGesture)) {
            return Z(transformedTextFieldState, M.n(handwritingGesture), textLayoutState, viewConfiguration);
        }
        return 2;
    }

    public final boolean fD(LegacyTextFieldState legacyTextFieldState, PreviewableHandwritingGesture previewableHandwritingGesture, final TextFieldSelectionManager textFieldSelectionManager, CancellationSignal cancellationSignal) {
        AnnotatedString text;
        TextLayoutResult value;
        TextLayoutInput layoutInput;
        AnnotatedString untransformedText = legacyTextFieldState.getUntransformedText();
        if (untransformedText == null) {
            return false;
        }
        TextLayoutResultProxy textLayoutResultProxyQie = legacyTextFieldState.qie();
        if (textLayoutResultProxyQie != null && (value = textLayoutResultProxyQie.getValue()) != null && (layoutInput = value.getLayoutInput()) != null) {
            text = layoutInput.getText();
        } else {
            text = null;
        }
        if (!Intrinsics.areEqual(untransformedText, text)) {
            return false;
        }
        if (SPz.n(previewableHandwritingGesture)) {
            T(legacyTextFieldState, lej.n(previewableHandwritingGesture), textFieldSelectionManager);
        } else if (P.n(previewableHandwritingGesture)) {
            nY(legacyTextFieldState, iF.n(previewableHandwritingGesture), textFieldSelectionManager);
        } else if (yg.n(previewableHandwritingGesture)) {
            nHg(legacyTextFieldState, pO.n(previewableHandwritingGesture), textFieldSelectionManager);
        } else {
            if (!Sis.n(previewableHandwritingGesture)) {
                return false;
            }
            te(legacyTextFieldState, l4Z.n(previewableHandwritingGesture), textFieldSelectionManager);
        }
        if (cancellationSignal != null) {
            cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.compose.foundation.text.input.internal.p
                @Override // android.os.CancellationSignal.OnCancelListener
                public final void onCancel() {
                    HandwritingGestureApi34.X(textFieldSelectionManager);
                }
            });
            return true;
        }
        return true;
    }

    public final int qie(LegacyTextFieldState legacyTextFieldState, HandwritingGesture handwritingGesture, TextFieldSelectionManager textFieldSelectionManager, ViewConfiguration viewConfiguration, Function1 function1) {
        AnnotatedString text;
        TextLayoutResult value;
        TextLayoutInput layoutInput;
        AnnotatedString untransformedText = legacyTextFieldState.getUntransformedText();
        if (untransformedText == null) {
            return 3;
        }
        TextLayoutResultProxy textLayoutResultProxyQie = legacyTextFieldState.qie();
        if (textLayoutResultProxyQie != null && (value = textLayoutResultProxyQie.getValue()) != null && (layoutInput = value.getLayoutInput()) != null) {
            text = layoutInput.getText();
        } else {
            text = null;
        }
        if (!Intrinsics.areEqual(untransformedText, text)) {
            return 3;
        }
        if (SPz.n(handwritingGesture)) {
            return XQ(legacyTextFieldState, lej.n(handwritingGesture), textFieldSelectionManager, function1);
        }
        if (P.n(handwritingGesture)) {
            return J2(legacyTextFieldState, iF.n(handwritingGesture), untransformedText, function1);
        }
        if (yg.n(handwritingGesture)) {
            return WPU(legacyTextFieldState, pO.n(handwritingGesture), textFieldSelectionManager, function1);
        }
        if (Sis.n(handwritingGesture)) {
            return KN(legacyTextFieldState, l4Z.n(handwritingGesture), untransformedText, function1);
        }
        if (rv6.n(handwritingGesture)) {
            return Ik(legacyTextFieldState, vd.n(handwritingGesture), untransformedText, viewConfiguration, function1);
        }
        if (qf.n(handwritingGesture)) {
            return ty(legacyTextFieldState, Ln.n(handwritingGesture), viewConfiguration, function1);
        }
        if (iwV.n(handwritingGesture)) {
            return o(legacyTextFieldState, M.n(handwritingGesture), untransformedText, viewConfiguration, function1);
        }
        return 2;
    }
}
