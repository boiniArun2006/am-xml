package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R5\u0010\u000e\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR)\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR)\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\rRS\u0010\u001e\u001a>\u0012:\u00128\u00124\u00122\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\t0\u00160\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u000b\u001a\u0004\b\u001d\u0010\rRH\u0010$\u001a3\u0012/\u0012-\b\u0001\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b( \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0!\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00160\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u000b\u001a\u0004\b#\u0010\rR/\u0010(\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u000b\u001a\u0004\b'\u0010\rR/\u0010,\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b*\u0010\u000b\u001a\u0004\b+\u0010\rR>\u0010/\u001a)\u0012%\u0012#\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b.\u0010\rR;\u00103\u001a&\u0012\"\u0012 \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t000\u00050\u00048\u0006¢\u0006\f\n\u0004\b1\u0010\u000b\u001a\u0004\b2\u0010\rR/\u00105\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\u000b\u001a\u0004\b4\u0010\rR/\u00107\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b6\u0010\rR/\u0010:\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b8\u0010\u000b\u001a\u0004\b9\u0010\rR)\u0010<\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b;\u0010\rR/\u0010>\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b=\u0010\u000b\u001a\u0004\b1\u0010\rR)\u0010@\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b?\u0010\u000b\u001a\u0004\b8\u0010\rR2\u0010D\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bA\u0010\u000b\u0012\u0004\bC\u0010\u0003\u001a\u0004\bB\u0010\rR)\u0010F\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\bE\u0010\u000b\u001a\u0004\b\u0010\u0010\rR)\u0010H\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\bG\u0010\u000b\u001a\u0004\b\u001c\u0010\rR)\u0010J\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\bI\u0010\u000b\u001a\u0004\bG\u0010\rR)\u0010K\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u000b\u001a\u0004\b&\u0010\rR)\u0010L\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u000b\u001a\u0004\b\n\u0010\rR)\u0010M\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\u000b\u001a\u0004\b\"\u0010\rR)\u0010N\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b.\u0010\u000b\u001a\u0004\bI\u0010\rR#\u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020P0O0\u00048\u0006¢\u0006\f\n\u0004\b2\u0010\u000b\u001a\u0004\b\u0013\u0010\rR)\u0010R\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b4\u0010\u000b\u001a\u0004\bE\u0010\rR)\u0010S\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b6\u0010\u000b\u001a\u0004\b?\u0010\rR)\u0010T\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b9\u0010\u000b\u001a\u0004\b=\u0010\rR)\u0010V\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\bU\u0010\u000b\u001a\u0004\bA\u0010\rR5\u0010X\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0007\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\bW\u0010\u000b\u001a\u0004\b*\u0010\r¨\u0006Y"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsActions;", "", "<init>", "()V", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Landroidx/compose/ui/semantics/AccessibilityAction;", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/TextLayoutResult;", "", "rl", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "xMQ", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "GetTextLayoutResult", "Lkotlin/Function0;", "t", "qie", "OnClick", "nr", "ty", "OnLongClick", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "x", "y", "O", "XQ", "ScrollBy", "Landroidx/compose/ui/geometry/Offset;", "offset", "Lkotlin/coroutines/Continuation;", "J2", "S", "ScrollByOffset", "", "Uo", "WPU", "ScrollToIndex", "Landroidx/compose/ui/text/AnnotatedString;", "KN", "gh", "OnAutofillText", "progress", "aYN", "SetProgress", "Lkotlin/Function3;", "mUb", "ViF", "SetSelection", "nY", "SetText", "g", "SetTextSubstitution", "az", "te", "ShowTextSubstitution", c.f62177j, "ClearTextSubstitution", "HI", "InsertTextAtCursor", "ck", "OnImeAction", "Ik", "getPerformImeAction", "getPerformImeAction$annotations", "PerformImeAction", "r", "CopyText", "o", "CutText", "Z", "PasteText", "Expand", "Collapse", "Dismiss", "RequestFocus", "", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "CustomActions", "PageUp", "PageLeft", "PageDown", "iF", "PageRight", "fD", "GetScrollViewportLength", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSemanticsProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsActions\n+ 2 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsPropertiesKt\n*L\n1#1,1523:1\n502#2:1524\n501#2,9:1525\n502#2:1534\n501#2,9:1535\n502#2:1544\n501#2,9:1545\n502#2:1554\n501#2,9:1555\n502#2:1564\n501#2,9:1565\n502#2:1574\n501#2,9:1575\n502#2:1584\n501#2,9:1585\n502#2:1594\n501#2,9:1595\n502#2:1604\n501#2,9:1605\n502#2:1614\n501#2,9:1615\n502#2:1624\n501#2,9:1625\n502#2:1634\n501#2,9:1635\n502#2:1644\n501#2,9:1645\n502#2:1654\n501#2,9:1655\n502#2:1664\n501#2,9:1665\n502#2:1674\n501#2,9:1675\n502#2:1684\n501#2,9:1685\n502#2:1694\n501#2,9:1695\n502#2:1704\n501#2,9:1705\n502#2:1714\n501#2,9:1715\n502#2:1724\n501#2,9:1725\n502#2:1734\n501#2,9:1735\n502#2:1744\n501#2,9:1745\n502#2:1754\n501#2,9:1755\n502#2:1764\n501#2,9:1765\n502#2:1774\n501#2,9:1775\n502#2:1784\n501#2,9:1785\n*S KotlinDebug\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsActions\n*L\n271#1:1524\n271#1:1525,9\n274#1:1534\n274#1:1535,9\n277#1:1544\n277#1:1545,9\n280#1:1554\n280#1:1555,9\n286#1:1564\n286#1:1565,9\n289#1:1574\n289#1:1575,9\n292#1:1584\n292#1:1585,9\n295#1:1594\n295#1:1595,9\n298#1:1604\n298#1:1605,9\n301#1:1614\n301#1:1615,9\n304#1:1624\n304#1:1625,9\n307#1:1634\n307#1:1635,9\n310#1:1644\n310#1:1645,9\n313#1:1654\n313#1:1655,9\n326#1:1664\n326#1:1665,9\n329#1:1674\n329#1:1675,9\n332#1:1684\n332#1:1685,9\n335#1:1694\n335#1:1695,9\n338#1:1704\n338#1:1705,9\n341#1:1714\n341#1:1715,9\n344#1:1724\n344#1:1725,9\n347#1:1734\n347#1:1735,9\n353#1:1744\n353#1:1745,9\n356#1:1754\n356#1:1755,9\n359#1:1764\n359#1:1765,9\n362#1:1774\n362#1:1775,9\n366#1:1784\n366#1:1785,9\n*E\n"})
public final class SemanticsActions {
    public static final int E2;

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private static final SemanticsPropertyKey InsertTextAtCursor;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private static final SemanticsPropertyKey PerformImeAction;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private static final SemanticsPropertyKey ScrollByOffset;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private static final SemanticsPropertyKey OnAutofillText;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey ScrollBy;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey Collapse;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private static final SemanticsPropertyKey ScrollToIndex;

    /* JADX INFO: renamed from: ViF, reason: from kotlin metadata */
    private static final SemanticsPropertyKey CustomActions;

    /* JADX INFO: renamed from: WPU, reason: from kotlin metadata */
    private static final SemanticsPropertyKey Dismiss;

    /* JADX INFO: renamed from: XQ, reason: from kotlin metadata */
    private static final SemanticsPropertyKey Expand;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey PasteText;

    /* JADX INFO: renamed from: aYN, reason: from kotlin metadata */
    private static final SemanticsPropertyKey RequestFocus;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private static final SemanticsPropertyKey ShowTextSubstitution;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private static final SemanticsPropertyKey OnImeAction;

    /* JADX INFO: renamed from: fD, reason: from kotlin metadata */
    private static final SemanticsPropertyKey GetScrollViewportLength;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey PageLeft;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private static final SemanticsPropertyKey SetText;

    /* JADX INFO: renamed from: iF, reason: from kotlin metadata */
    private static final SemanticsPropertyKey PageRight;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private static final SemanticsPropertyKey SetSelection;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final SemanticsActions f33251n = new SemanticsActions();

    /* JADX INFO: renamed from: nY, reason: from kotlin metadata */
    private static final SemanticsPropertyKey PageUp;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private static final SemanticsPropertyKey OnLongClick;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey CutText;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private static final SemanticsPropertyKey SetTextSubstitution;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey CopyText;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final SemanticsPropertyKey GetTextLayoutResult;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey OnClick;

    /* JADX INFO: renamed from: te, reason: from kotlin metadata */
    private static final SemanticsPropertyKey PageDown;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private static final SemanticsPropertyKey ClearTextSubstitution;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private static final SemanticsPropertyKey SetProgress;

    static {
        SemanticsPropertiesKt$ActionPropertyKey$1 semanticsPropertiesKt$ActionPropertyKey$1 = new Function2<AccessibilityAction<Function<? extends Boolean>>, AccessibilityAction<Function<? extends Boolean>>, AccessibilityAction<Function<? extends Boolean>>>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1
            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final AccessibilityAction invoke(AccessibilityAction accessibilityAction, AccessibilityAction accessibilityAction2) {
                String label;
                Function action;
                if (accessibilityAction == null || (label = accessibilityAction.getLabel()) == null) {
                    label = accessibilityAction2.getLabel();
                }
                if (accessibilityAction == null || (action = accessibilityAction.getAction()) == null) {
                    action = accessibilityAction2.getAction();
                }
                return new AccessibilityAction(label, action);
            }
        };
        GetTextLayoutResult = SemanticsPropertiesKt.rl("GetTextLayoutResult", semanticsPropertiesKt$ActionPropertyKey$1);
        OnClick = SemanticsPropertiesKt.rl("OnClick", semanticsPropertiesKt$ActionPropertyKey$1);
        OnLongClick = SemanticsPropertiesKt.rl("OnLongClick", semanticsPropertiesKt$ActionPropertyKey$1);
        ScrollBy = SemanticsPropertiesKt.rl("ScrollBy", semanticsPropertiesKt$ActionPropertyKey$1);
        ScrollByOffset = new SemanticsPropertyKey("ScrollByOffset", null, 2, null);
        ScrollToIndex = SemanticsPropertiesKt.rl("ScrollToIndex", semanticsPropertiesKt$ActionPropertyKey$1);
        OnAutofillText = SemanticsPropertiesKt.rl("OnAutofillText", semanticsPropertiesKt$ActionPropertyKey$1);
        SetProgress = SemanticsPropertiesKt.rl("SetProgress", semanticsPropertiesKt$ActionPropertyKey$1);
        SetSelection = SemanticsPropertiesKt.rl("SetSelection", semanticsPropertiesKt$ActionPropertyKey$1);
        SetText = SemanticsPropertiesKt.rl("SetText", semanticsPropertiesKt$ActionPropertyKey$1);
        SetTextSubstitution = SemanticsPropertiesKt.rl("SetTextSubstitution", semanticsPropertiesKt$ActionPropertyKey$1);
        ShowTextSubstitution = SemanticsPropertiesKt.rl("ShowTextSubstitution", semanticsPropertiesKt$ActionPropertyKey$1);
        ClearTextSubstitution = SemanticsPropertiesKt.rl("ClearTextSubstitution", semanticsPropertiesKt$ActionPropertyKey$1);
        InsertTextAtCursor = SemanticsPropertiesKt.rl("InsertTextAtCursor", semanticsPropertiesKt$ActionPropertyKey$1);
        OnImeAction = SemanticsPropertiesKt.rl("PerformImeAction", semanticsPropertiesKt$ActionPropertyKey$1);
        PerformImeAction = SemanticsPropertiesKt.rl("PerformImeAction", semanticsPropertiesKt$ActionPropertyKey$1);
        CopyText = SemanticsPropertiesKt.rl("CopyText", semanticsPropertiesKt$ActionPropertyKey$1);
        CutText = SemanticsPropertiesKt.rl("CutText", semanticsPropertiesKt$ActionPropertyKey$1);
        PasteText = SemanticsPropertiesKt.rl("PasteText", semanticsPropertiesKt$ActionPropertyKey$1);
        Expand = SemanticsPropertiesKt.rl("Expand", semanticsPropertiesKt$ActionPropertyKey$1);
        Collapse = SemanticsPropertiesKt.rl("Collapse", semanticsPropertiesKt$ActionPropertyKey$1);
        Dismiss = SemanticsPropertiesKt.rl("Dismiss", semanticsPropertiesKt$ActionPropertyKey$1);
        RequestFocus = SemanticsPropertiesKt.rl("RequestFocus", semanticsPropertiesKt$ActionPropertyKey$1);
        CustomActions = SemanticsPropertiesKt.n("CustomActions");
        PageUp = SemanticsPropertiesKt.rl("PageUp", semanticsPropertiesKt$ActionPropertyKey$1);
        PageLeft = SemanticsPropertiesKt.rl("PageLeft", semanticsPropertiesKt$ActionPropertyKey$1);
        PageDown = SemanticsPropertiesKt.rl("PageDown", semanticsPropertiesKt$ActionPropertyKey$1);
        PageRight = SemanticsPropertiesKt.rl("PageRight", semanticsPropertiesKt$ActionPropertyKey$1);
        GetScrollViewportLength = SemanticsPropertiesKt.rl("GetScrollViewportLength", semanticsPropertiesKt$ActionPropertyKey$1);
        E2 = 8;
    }

    public final SemanticsPropertyKey HI() {
        return PageDown;
    }

    public final SemanticsPropertyKey Ik() {
        return PageRight;
    }

    public final SemanticsPropertyKey J2() {
        return Dismiss;
    }

    public final SemanticsPropertyKey KN() {
        return GetScrollViewportLength;
    }

    public final SemanticsPropertyKey O() {
        return CutText;
    }

    public final SemanticsPropertyKey S() {
        return ScrollByOffset;
    }

    public final SemanticsPropertyKey Uo() {
        return Expand;
    }

    public final SemanticsPropertyKey ViF() {
        return SetSelection;
    }

    public final SemanticsPropertyKey WPU() {
        return ScrollToIndex;
    }

    public final SemanticsPropertyKey XQ() {
        return ScrollBy;
    }

    public final SemanticsPropertyKey Z() {
        return RequestFocus;
    }

    public final SemanticsPropertyKey aYN() {
        return SetProgress;
    }

    public final SemanticsPropertyKey az() {
        return OnImeAction;
    }

    public final SemanticsPropertyKey ck() {
        return PageLeft;
    }

    public final SemanticsPropertyKey g() {
        return SetTextSubstitution;
    }

    public final SemanticsPropertyKey gh() {
        return OnAutofillText;
    }

    public final SemanticsPropertyKey mUb() {
        return InsertTextAtCursor;
    }

    public final SemanticsPropertyKey n() {
        return ClearTextSubstitution;
    }

    public final SemanticsPropertyKey nY() {
        return SetText;
    }

    public final SemanticsPropertyKey nr() {
        return CustomActions;
    }

    public final SemanticsPropertyKey o() {
        return PasteText;
    }

    public final SemanticsPropertyKey qie() {
        return OnClick;
    }

    public final SemanticsPropertyKey r() {
        return PageUp;
    }

    public final SemanticsPropertyKey rl() {
        return Collapse;
    }

    public final SemanticsPropertyKey t() {
        return CopyText;
    }

    public final SemanticsPropertyKey te() {
        return ShowTextSubstitution;
    }

    public final SemanticsPropertyKey ty() {
        return OnLongClick;
    }

    public final SemanticsPropertyKey xMQ() {
        return GetTextLayoutResult;
    }

    private SemanticsActions() {
    }
}
