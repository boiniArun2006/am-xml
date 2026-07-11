package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJl\u0010!\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fø\u0001\u0000¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u00106\u001a\u0002018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R$\u0010>\u001a\u0004\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R+\u0010D\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\b@\u0010\f\"\u0004\bB\u0010CR1\u0010K\u001a\u00020E2\u0006\u0010?\u001a\u00020E8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bF\u0010A\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0018\u0010N\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010MR\u001c\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010P0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010AR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR+\u0010]\u001a\u00020X2\u0006\u0010?\u001a\u00020X8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bY\u0010A\u001a\u0004\b8\u0010Z\"\u0004\b[\u0010\\R+\u0010a\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b^\u0010A\u001a\u0004\b_\u0010\f\"\u0004\b`\u0010CR+\u0010d\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bG\u0010A\u001a\u0004\bb\u0010\f\"\u0004\bc\u0010CR+\u0010h\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\be\u0010A\u001a\u0004\bf\u0010\f\"\u0004\bg\u0010CR+\u0010l\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bi\u0010A\u001a\u0004\bj\u0010\f\"\u0004\bk\u0010CR$\u0010n\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b4\u0010j\u001a\u0004\bm\u0010\fR+\u0010q\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010A\u001a\u0004\bo\u0010\f\"\u0004\bp\u0010CR\u0014\u0010u\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR+\u0010x\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bv\u0010A\u001a\u0004\b-\u0010\f\"\u0004\bw\u0010CR+\u0010z\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bj\u0010A\u001a\u0004\bQ\u0010\f\"\u0004\by\u0010CR\"\u0010|\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010{R#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00178\u0006¢\u0006\f\n\u0004\bf\u0010{\u001a\u0004\bi\u0010}R#\u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020~\u0012\u0004\u0012\u00020\u00190\u00178\u0006¢\u0006\f\n\u0004\bb\u0010{\u001a\u0004\be\u0010}R\u001b\u0010\u0083\u0001\u001a\u00030\u0080\u00018\u0006¢\u0006\u000e\n\u0005\b%\u0010\u0081\u0001\u001a\u0005\bF\u0010\u0082\u0001R,\u0010 \u001a\u00020\u001f8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0016\n\u0005\bT\u0010\u0084\u0001\u001a\u0005\bs\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R7\u0010\u008a\u0001\u001a\u00030\u0088\u00012\u0007\u0010?\u001a\u00030\u0088\u00018F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0015\n\u0004\b\u000b\u0010A\u001a\u0005\bv\u0010\u0085\u0001\"\u0006\b\u0089\u0001\u0010\u0087\u0001R7\u0010\u008c\u0001\u001a\u00030\u0088\u00012\u0007\u0010?\u001a\u00030\u0088\u00018F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0015\n\u0004\bo\u0010A\u001a\u0005\b2\u0010\u0085\u0001\"\u0006\b\u008b\u0001\u0010\u0087\u0001R-\u0010\u0091\u0001\u001a\u0004\u0018\u00010L2\t\u0010\u008d\u0001\u001a\u0004\u0018\u00010L8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\bY\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R-\u0010\u0095\u0001\u001a\u0004\u0018\u00010P2\t\u0010\u008d\u0001\u001a\u0004\u0018\u00010P8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\b^\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0096\u0001"}, d2 = {"Landroidx/compose/foundation/text/LegacyTextFieldState;", "", "Landroidx/compose/foundation/text/TextDelegate;", "textDelegate", "Landroidx/compose/runtime/RecomposeScope;", "recomposeScope", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "keyboardController", "<init>", "(Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/runtime/RecomposeScope;Landroidx/compose/ui/platform/SoftwareKeyboardController;)V", "", "nY", "()Z", "Landroidx/compose/ui/text/AnnotatedString;", "untransformedText", "visualText", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "softWrap", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/TextFieldValue;", "", "onValueChange", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "Landroidx/compose/ui/focus/FocusManager;", "focusManager", "Landroidx/compose/ui/graphics/Color;", "selectionBackgroundColor", "U", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/ui/focus/FocusManager;J)V", c.f62177j, "Landroidx/compose/foundation/text/TextDelegate;", "aYN", "()Landroidx/compose/foundation/text/TextDelegate;", "setTextDelegate", "(Landroidx/compose/foundation/text/TextDelegate;)V", "rl", "Landroidx/compose/runtime/RecomposeScope;", "Ik", "()Landroidx/compose/runtime/RecomposeScope;", "t", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "mUb", "()Landroidx/compose/ui/platform/SoftwareKeyboardController;", "Landroidx/compose/ui/text/input/EditProcessor;", "nr", "Landroidx/compose/ui/text/input/EditProcessor;", "ck", "()Landroidx/compose/ui/text/input/EditProcessor;", "processor", "Landroidx/compose/ui/text/input/TextInputSession;", "O", "Landroidx/compose/ui/text/input/TextInputSession;", "KN", "()Landroidx/compose/ui/text/input/TextInputSession;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "(Landroidx/compose/ui/text/input/TextInputSession;)V", "inputSession", "<set-?>", "J2", "Landroidx/compose/runtime/MutableState;", "e", "(Z)V", "hasFocus", "Landroidx/compose/ui/unit/Dp;", "Uo", "az", "()F", "wTp", "(F)V", "minHeightForSingleLineField", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "_layoutCoordinates", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "xMQ", "layoutResultState", "Landroidx/compose/ui/text/AnnotatedString;", "ViF", "()Landroidx/compose/ui/text/AnnotatedString;", "setUntransformedText", "(Landroidx/compose/ui/text/AnnotatedString;)V", "Landroidx/compose/foundation/text/HandleState;", "gh", "()Landroidx/compose/foundation/text/HandleState;", "E2", "(Landroidx/compose/foundation/text/HandleState;)V", "handleState", "qie", "XQ", "bzg", "showFloatingToolbar", "WPU", "jB", "showSelectionHandleStart", "ty", "S", "Xw", "showSelectionHandleEnd", "HI", "Z", "rV9", "showCursorHandle", "te", "isLayoutResultStale", "g", "X", "isInTouchMode", "Landroidx/compose/foundation/text/KeyboardActionRunner;", "r", "Landroidx/compose/foundation/text/KeyboardActionRunner;", "keyboardActionRunner", "o", "iF", "autofillHighlightOn", "N", "justAutofilled", "Lkotlin/jvm/functions/Function1;", "onValueChangeOriginal", "()Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/text/input/ImeAction;", "onImeActionPerformed", "Landroidx/compose/ui/graphics/Paint;", "Landroidx/compose/ui/graphics/Paint;", "()Landroidx/compose/ui/graphics/Paint;", "highlightPaint", "J", "()J", "setSelectionBackgroundColor-8_81llA", "(J)V", "Landroidx/compose/ui/text/TextRange;", "v", "selectionPreviewHighlightRange", "fD", "deletionPreviewHighlightRange", "value", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "nHg", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "layoutCoordinates", "()Landroidx/compose/foundation/text/TextLayoutResultProxy;", "s7N", "(Landroidx/compose/foundation/text/TextLayoutResultProxy;)V", "layoutResult", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/LegacyTextFieldState\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1129:1\n113#2:1130\n85#3:1131\n113#3,2:1132\n85#3:1134\n113#3,2:1135\n85#3:1138\n113#3,2:1139\n85#3:1141\n113#3,2:1142\n85#3:1144\n113#3,2:1145\n85#3:1147\n113#3,2:1148\n85#3:1150\n113#3,2:1151\n85#3:1153\n113#3,2:1154\n85#3:1156\n113#3,2:1157\n85#3:1159\n113#3,2:1160\n85#3:1162\n113#3,2:1163\n85#3:1165\n113#3,2:1166\n1#4:1137\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/LegacyTextFieldState\n*L\n747#1:1130\n744#1:1131\n744#1:1132,2\n747#1:1134\n747#1:1135,2\n806#1:1138\n806#1:1139,2\n816#1:1141\n816#1:1142,2\n822#1:1144\n822#1:1145,2\n828#1:1147\n828#1:1148,2\n834#1:1150\n834#1:1151,2\n846#1:1153\n846#1:1154,2\n852#1:1156\n852#1:1157,2\n853#1:1159\n853#1:1160,2\n889#1:1162\n889#1:1163,2\n890#1:1165\n890#1:1166,2\n*E\n"})
public final class LegacyTextFieldState {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private final MutableState showCursorHandle;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private final MutableState isInTouchMode;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final MutableState hasFocus;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private LayoutCoordinates _layoutCoordinates;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private TextInputSession inputSession;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final Function1 onValueChange;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final MutableState minHeightForSingleLineField;

    /* JADX INFO: renamed from: ViF, reason: from kotlin metadata */
    private long selectionBackgroundColor;

    /* JADX INFO: renamed from: WPU, reason: from kotlin metadata */
    private final Function1 onImeActionPerformed;

    /* JADX INFO: renamed from: XQ, reason: from kotlin metadata */
    private Function1 onValueChangeOriginal;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private final MutableState justAutofilled;

    /* JADX INFO: renamed from: aYN, reason: from kotlin metadata */
    private final Paint highlightPaint;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final MutableState showSelectionHandleStart;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private boolean isLayoutResultStale;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final MutableState deletionPreviewHighlightRange;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final MutableState handleState;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private AnnotatedString untransformedText;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private TextDelegate textDelegate;

    /* JADX INFO: renamed from: nY, reason: from kotlin metadata */
    private final MutableState selectionPreviewHighlightRange;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final EditProcessor processor = new EditProcessor();

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final MutableState autofillHighlightOn;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final MutableState showFloatingToolbar;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final KeyboardActionRunner keyboardActionRunner;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final RecomposeScope recomposeScope;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final SoftwareKeyboardController keyboardController;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private final MutableState showSelectionHandleEnd;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final MutableState layoutResultState;

    public final void E2(HandleState handleState) {
        this.handleState.setValue(handleState);
    }

    /* JADX INFO: renamed from: HI, reason: from getter */
    public final Function1 getOnValueChange() {
        return this.onValueChange;
    }

    /* JADX INFO: renamed from: Ik, reason: from getter */
    public final RecomposeScope getRecomposeScope() {
        return this.recomposeScope;
    }

    public final boolean J2() {
        return ((Boolean) this.hasFocus.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final TextInputSession getInputSession() {
        return this.inputSession;
    }

    public final void N(boolean z2) {
        this.justAutofilled.setValue(Boolean.valueOf(z2));
    }

    public final HandleState O() {
        return (HandleState) this.handleState.getValue();
    }

    public final boolean S() {
        return ((Boolean) this.showSelectionHandleEnd.getValue()).booleanValue();
    }

    public final void T(TextInputSession textInputSession) {
        this.inputSession = textInputSession;
    }

    public final void U(AnnotatedString untransformedText, AnnotatedString visualText, TextStyle textStyle, boolean softWrap, Density density, FontFamily.Resolver fontFamilyResolver, Function1 onValueChange, KeyboardActions keyboardActions, FocusManager focusManager, long selectionBackgroundColor) {
        this.onValueChangeOriginal = onValueChange;
        this.selectionBackgroundColor = selectionBackgroundColor;
        KeyboardActionRunner keyboardActionRunner = this.keyboardActionRunner;
        keyboardActionRunner.J2(keyboardActions);
        keyboardActionRunner.O(focusManager);
        this.untransformedText = untransformedText;
        TextDelegate textDelegateT = TextDelegateKt.t(this.textDelegate, visualText, textStyle, density, fontFamilyResolver, softWrap, 0, 0, 0, CollectionsKt.emptyList(), 448, null);
        if (this.textDelegate != textDelegateT) {
            this.isLayoutResultStale = true;
        }
        this.textDelegate = textDelegateT;
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final Paint getHighlightPaint() {
        return this.highlightPaint;
    }

    /* JADX INFO: renamed from: ViF, reason: from getter */
    public final AnnotatedString getUntransformedText() {
        return this.untransformedText;
    }

    public final boolean WPU() {
        return ((Boolean) this.showSelectionHandleStart.getValue()).booleanValue();
    }

    public final void X(boolean z2) {
        this.isInTouchMode.setValue(Boolean.valueOf(z2));
    }

    public final boolean XQ() {
        return ((Boolean) this.showFloatingToolbar.getValue()).booleanValue();
    }

    public final void Xw(boolean z2) {
        this.showSelectionHandleEnd.setValue(Boolean.valueOf(z2));
    }

    public final boolean Z() {
        return ((Boolean) this.showCursorHandle.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: aYN, reason: from getter */
    public final TextDelegate getTextDelegate() {
        return this.textDelegate;
    }

    public final float az() {
        return ((Dp) this.minHeightForSingleLineField.getValue()).getValue();
    }

    public final void bzg(boolean z2) {
        this.showFloatingToolbar.setValue(Boolean.valueOf(z2));
    }

    /* JADX INFO: renamed from: ck, reason: from getter */
    public final EditProcessor getProcessor() {
        return this.processor;
    }

    public final void e(boolean z2) {
        this.hasFocus.setValue(Boolean.valueOf(z2));
    }

    public final void fD(long j2) {
        this.deletionPreviewHighlightRange.setValue(TextRange.rl(j2));
    }

    public final boolean g() {
        return ((Boolean) this.isInTouchMode.getValue()).booleanValue();
    }

    public final LayoutCoordinates gh() {
        LayoutCoordinates layoutCoordinates = this._layoutCoordinates;
        if (layoutCoordinates == null || !layoutCoordinates.nr()) {
            return null;
        }
        return layoutCoordinates;
    }

    public final void iF(boolean z2) {
        this.autofillHighlightOn.setValue(Boolean.valueOf(z2));
    }

    public final void jB(boolean z2) {
        this.showSelectionHandleStart.setValue(Boolean.valueOf(z2));
    }

    /* JADX INFO: renamed from: mUb, reason: from getter */
    public final SoftwareKeyboardController getKeyboardController() {
        return this.keyboardController;
    }

    public final void nHg(LayoutCoordinates layoutCoordinates) {
        this._layoutCoordinates = layoutCoordinates;
    }

    public final long nr() {
        return ((TextRange) this.deletionPreviewHighlightRange.getValue()).getPackedValue();
    }

    public final long o() {
        return ((TextRange) this.selectionPreviewHighlightRange.getValue()).getPackedValue();
    }

    public final TextLayoutResultProxy qie() {
        return (TextLayoutResultProxy) this.layoutResultState.getValue();
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final long getSelectionBackgroundColor() {
        return this.selectionBackgroundColor;
    }

    public final void rV9(boolean z2) {
        this.showCursorHandle.setValue(Boolean.valueOf(z2));
    }

    public final void s7N(TextLayoutResultProxy textLayoutResultProxy) {
        this.layoutResultState.setValue(textLayoutResultProxy);
        this.isLayoutResultStale = false;
    }

    public final boolean t() {
        return ((Boolean) this.autofillHighlightOn.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: te, reason: from getter */
    public final boolean getIsLayoutResultStale() {
        return this.isLayoutResultStale;
    }

    /* JADX INFO: renamed from: ty, reason: from getter */
    public final Function1 getOnImeActionPerformed() {
        return this.onImeActionPerformed;
    }

    public final void v(long j2) {
        this.selectionPreviewHighlightRange.setValue(TextRange.rl(j2));
    }

    public final void wTp(float f3) {
        this.minHeightForSingleLineField.setValue(Dp.nr(f3));
    }

    public final boolean xMQ() {
        return ((Boolean) this.justAutofilled.getValue()).booleanValue();
    }

    public LegacyTextFieldState(TextDelegate textDelegate, RecomposeScope recomposeScope, SoftwareKeyboardController softwareKeyboardController) {
        this.textDelegate = textDelegate;
        this.recomposeScope = recomposeScope;
        this.keyboardController = softwareKeyboardController;
        Boolean bool = Boolean.FALSE;
        this.hasFocus = SnapshotStateKt__SnapshotStateKt.O(bool, null, 2, null);
        this.minHeightForSingleLineField = SnapshotStateKt__SnapshotStateKt.O(Dp.nr(Dp.KN(0)), null, 2, null);
        this.layoutResultState = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);
        this.handleState = SnapshotStateKt__SnapshotStateKt.O(HandleState.f19681n, null, 2, null);
        this.showFloatingToolbar = SnapshotStateKt__SnapshotStateKt.O(bool, null, 2, null);
        this.showSelectionHandleStart = SnapshotStateKt__SnapshotStateKt.O(bool, null, 2, null);
        this.showSelectionHandleEnd = SnapshotStateKt__SnapshotStateKt.O(bool, null, 2, null);
        this.showCursorHandle = SnapshotStateKt__SnapshotStateKt.O(bool, null, 2, null);
        this.isLayoutResultStale = true;
        this.isInTouchMode = SnapshotStateKt__SnapshotStateKt.O(Boolean.TRUE, null, 2, null);
        this.keyboardActionRunner = new KeyboardActionRunner(softwareKeyboardController);
        this.autofillHighlightOn = SnapshotStateKt__SnapshotStateKt.O(bool, null, 2, null);
        this.justAutofilled = SnapshotStateKt__SnapshotStateKt.O(bool, null, 2, null);
        this.onValueChangeOriginal = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.LegacyTextFieldState$onValueChangeOriginal$1
            public final void n(TextFieldValue textFieldValue) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                n(textFieldValue);
                return Unit.INSTANCE;
            }
        };
        this.onValueChange = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.LegacyTextFieldState$onValueChange$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                n(textFieldValue);
                return Unit.INSTANCE;
            }

            public final void n(TextFieldValue textFieldValue) {
                String text;
                String strXMQ = textFieldValue.xMQ();
                AnnotatedString untransformedText = this.f19748n.getUntransformedText();
                if (untransformedText != null) {
                    text = untransformedText.getText();
                } else {
                    text = null;
                }
                if (!Intrinsics.areEqual(strXMQ, text)) {
                    this.f19748n.E2(HandleState.f19681n);
                    if (this.f19748n.xMQ()) {
                        this.f19748n.N(false);
                    } else {
                        this.f19748n.iF(false);
                    }
                }
                LegacyTextFieldState legacyTextFieldState = this.f19748n;
                TextRange.Companion companion = TextRange.INSTANCE;
                legacyTextFieldState.v(companion.n());
                this.f19748n.fD(companion.n());
                this.f19748n.onValueChangeOriginal.invoke(textFieldValue);
                this.f19748n.getRecomposeScope().invalidate();
            }
        };
        this.onImeActionPerformed = new Function1<ImeAction, Unit>() { // from class: androidx.compose.foundation.text.LegacyTextFieldState$onImeActionPerformed$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ImeAction imeAction) {
                n(imeAction.getValue());
                return Unit.INSTANCE;
            }

            public final void n(int i2) {
                this.f19747n.keyboardActionRunner.nr(i2);
            }
        };
        this.highlightPaint = AndroidPaint_androidKt.n();
        this.selectionBackgroundColor = Color.INSTANCE.Uo();
        TextRange.Companion companion = TextRange.INSTANCE;
        this.selectionPreviewHighlightRange = SnapshotStateKt__SnapshotStateKt.O(TextRange.rl(companion.n()), null, 2, null);
        this.deletionPreviewHighlightRange = SnapshotStateKt__SnapshotStateKt.O(TextRange.rl(companion.n()), null, 2, null);
    }

    public final boolean nY() {
        if (TextRange.KN(o()) && TextRange.KN(nr())) {
            return false;
        }
        return true;
    }
}
