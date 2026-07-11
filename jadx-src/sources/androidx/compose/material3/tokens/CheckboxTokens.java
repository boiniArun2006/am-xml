package androidx.compose.material3.tokens;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\bN\n\u0002\u0018\u0002\n\u0002\b9\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0012\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u001d\u0010\u0015\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001d\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u0005\u0010\u001aR\u001d\u0010 \u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\bR\u0017\u0010#\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\"\u0010\u001aR\u0017\u0010&\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b$\u0010\u0018\u001a\u0004\b%\u0010\u001aR\u0017\u0010)\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b'\u0010\u0018\u001a\u0004\b(\u0010\u001aR\u0017\u0010,\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b*\u0010\u0018\u001a\u0004\b+\u0010\u001aR\u001d\u0010/\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b-\u0010\u0006\u001a\u0004\b.\u0010\bR\u0017\u00102\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b0\u0010\u0018\u001a\u0004\b1\u0010\u001aR\u0017\u00105\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b3\u0010\u0018\u001a\u0004\b4\u0010\u001aR\u001d\u00108\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b6\u0010\u0006\u001a\u0004\b7\u0010\bR\u0017\u0010;\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b9\u0010\u0018\u001a\u0004\b:\u0010\u001aR\u0017\u0010>\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b<\u0010\u0018\u001a\u0004\b=\u0010\u001aR\u0017\u0010A\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b?\u0010\u0018\u001a\u0004\b@\u0010\u001aR\u001d\u0010D\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bB\u0010\u0006\u001a\u0004\bC\u0010\bR\u0017\u0010G\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bE\u0010\u0018\u001a\u0004\bF\u0010\u001aR\u0017\u0010J\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bH\u0010\u0018\u001a\u0004\bI\u0010\u001aR\u001d\u0010M\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bK\u0010\u0006\u001a\u0004\bL\u0010\bR\u0017\u0010P\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bN\u0010\u0018\u001a\u0004\bO\u0010\u001aR\u0017\u0010S\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bQ\u0010\u0018\u001a\u0004\bR\u0010\u001aR\u001d\u0010V\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bT\u0010\u0006\u001a\u0004\bU\u0010\bR\u0017\u0010X\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bW\u0010\u0018\u001a\u0004\b\u000b\u0010\u001aR\u001d\u0010[\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bY\u0010\u0006\u001a\u0004\bZ\u0010\bR\u0017\u0010^\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\\\u0010\u0018\u001a\u0004\b]\u0010\u001aR\u0017\u0010a\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b_\u0010\u0018\u001a\u0004\b`\u0010\u001aR\u001d\u0010d\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bb\u0010\u0006\u001a\u0004\bc\u0010\bR\u0017\u0010j\u001a\u00020e8\u0006¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u001d\u0010l\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bk\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010n\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bm\u0010\u0018\u001a\u0004\b\u0013\u0010\u001aR\u001d\u0010q\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bo\u0010\u0006\u001a\u0004\bp\u0010\bR\u0017\u0010t\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\br\u0010\u0018\u001a\u0004\bs\u0010\u001aR\u001d\u0010w\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bu\u0010\u0006\u001a\u0004\bv\u0010\bR\u0017\u0010z\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bx\u0010\u0018\u001a\u0004\by\u0010\u001aR\u001d\u0010}\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b{\u0010\u0006\u001a\u0004\b|\u0010\bR\u0018\u0010\u0080\u0001\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b~\u0010\u0018\u001a\u0004\b\u007f\u0010\u001aR\u001a\u0010\u0083\u0001\u001a\u00020\u00168\u0006¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010\u0018\u001a\u0005\b\u0082\u0001\u0010\u001aR \u0010\u0086\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010\u0006\u001a\u0005\b\u0085\u0001\u0010\bR\u001a\u0010\u0089\u0001\u001a\u00020\u00168\u0006¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010\u0018\u001a\u0005\b\u0088\u0001\u0010\u001aR \u0010\u008c\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010\u0006\u001a\u0005\b\u008b\u0001\u0010\bR\u001a\u0010\u008f\u0001\u001a\u00020\u00168\u0006¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010\u0018\u001a\u0005\b\u008e\u0001\u0010\u001aR \u0010\u0092\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0090\u0001\u0010\u0006\u001a\u0005\b\u0091\u0001\u0010\bR\u0019\u0010\u0094\u0001\u001a\u00020\u00168\u0006¢\u0006\r\n\u0005\b\u0093\u0001\u0010\u0018\u001a\u0004\b\u0017\u0010\u001aR \u0010\u0097\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0095\u0001\u0010\u0006\u001a\u0005\b\u0096\u0001\u0010\bR\u001a\u0010\u009a\u0001\u001a\u00020\u00168\u0006¢\u0006\u000e\n\u0005\b\u0098\u0001\u0010\u0018\u001a\u0005\b\u0099\u0001\u0010\u001aR \u0010\u009d\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u009b\u0001\u0010\u0006\u001a\u0005\b\u009c\u0001\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u009e\u0001"}, d2 = {"Landroidx/compose/material3/tokens/CheckboxTokens;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Dp;", "rl", "F", "getContainerHeight-D9Ej5fM", "()F", "ContainerHeight", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "t", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "getContainerShape", "()Landroidx/compose/foundation/shape/RoundedCornerShape;", "ContainerShape", "nr", "getContainerWidth-D9Ej5fM", "ContainerWidth", "O", "getIconSize-D9Ej5fM", "IconSize", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "J2", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", c.f62177j, "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "SelectedContainerColor", "Uo", "SelectedDisabledContainerColor", "KN", "getSelectedDisabledContainerOutlineWidth-D9Ej5fM", "SelectedDisabledContainerOutlineWidth", "xMQ", "getSelectedDisabledIconColor", "SelectedDisabledIconColor", "mUb", "getSelectedErrorContainerColor", "SelectedErrorContainerColor", "gh", "getSelectedErrorFocusContainerColor", "SelectedErrorFocusContainerColor", "qie", "getSelectedErrorFocusIconColor", "SelectedErrorFocusIconColor", "az", "getSelectedErrorFocusOutlineWidth-D9Ej5fM", "SelectedErrorFocusOutlineWidth", "ty", "getSelectedErrorHoverContainerColor", "SelectedErrorHoverContainerColor", "HI", "getSelectedErrorHoverIconColor", "SelectedErrorHoverIconColor", "ck", "getSelectedErrorHoverOutlineWidth-D9Ej5fM", "SelectedErrorHoverOutlineWidth", "Ik", "getSelectedErrorIconColor", "SelectedErrorIconColor", "r", "getSelectedErrorPressedContainerColor", "SelectedErrorPressedContainerColor", "o", "getSelectedErrorPressedIconColor", "SelectedErrorPressedIconColor", "Z", "getSelectedErrorPressedOutlineWidth-D9Ej5fM", "SelectedErrorPressedOutlineWidth", "XQ", "getSelectedFocusContainerColor", "SelectedFocusContainerColor", "S", "getSelectedFocusIconColor", "SelectedFocusIconColor", "WPU", "getSelectedFocusOutlineWidth-D9Ej5fM", "SelectedFocusOutlineWidth", "aYN", "getSelectedHoverContainerColor", "SelectedHoverContainerColor", "ViF", "getSelectedHoverIconColor", "SelectedHoverIconColor", "nY", "getSelectedHoverOutlineWidth-D9Ej5fM", "SelectedHoverOutlineWidth", "g", "SelectedIconColor", "te", "getSelectedOutlineWidth-D9Ej5fM", "SelectedOutlineWidth", "iF", "getSelectedPressedContainerColor", "SelectedPressedContainerColor", "fD", "getSelectedPressedIconColor", "SelectedPressedIconColor", "E2", "getSelectedPressedOutlineWidth-D9Ej5fM", "SelectedPressedOutlineWidth", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "e", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getStateLayerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "StateLayerShape", "X", "StateLayerSize", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "UnselectedDisabledOutlineColor", "N", "getUnselectedDisabledOutlineWidth-D9Ej5fM", "UnselectedDisabledOutlineWidth", "nHg", "getUnselectedErrorFocusOutlineColor", "UnselectedErrorFocusOutlineColor", "s7N", "getUnselectedErrorFocusOutlineWidth-D9Ej5fM", "UnselectedErrorFocusOutlineWidth", "wTp", "getUnselectedErrorHoverOutlineColor", "UnselectedErrorHoverOutlineColor", "v", "getUnselectedErrorHoverOutlineWidth-D9Ej5fM", "UnselectedErrorHoverOutlineWidth", "rV9", "getUnselectedErrorOutlineColor", "UnselectedErrorOutlineColor", "bzg", "getUnselectedErrorPressedOutlineColor", "UnselectedErrorPressedOutlineColor", "Xw", "getUnselectedErrorPressedOutlineWidth-D9Ej5fM", "UnselectedErrorPressedOutlineWidth", "jB", "getUnselectedFocusOutlineColor", "UnselectedFocusOutlineColor", "U", "getUnselectedFocusOutlineWidth-D9Ej5fM", "UnselectedFocusOutlineWidth", "P5", "getUnselectedHoverOutlineColor", "UnselectedHoverOutlineColor", "M7", "getUnselectedHoverOutlineWidth-D9Ej5fM", "UnselectedHoverOutlineWidth", "p5", "UnselectedOutlineColor", "eF", "getUnselectedOutlineWidth-D9Ej5fM", "UnselectedOutlineWidth", "E", "getUnselectedPressedOutlineColor", "UnselectedPressedOutlineColor", "M", "getUnselectedPressedOutlineWidth-D9Ej5fM", "UnselectedPressedOutlineWidth", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCheckboxTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckboxTokens.kt\nandroidx/compose/material3/tokens/CheckboxTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,77:1\n158#2:78\n158#2:79\n158#2:80\n158#2:81\n158#2:82\n158#2:83\n158#2:84\n158#2:85\n158#2:86\n158#2:87\n158#2:88\n158#2:89\n158#2:90\n158#2:91\n158#2:92\n158#2:93\n158#2:94\n158#2:95\n158#2:96\n158#2:97\n158#2:98\n*S KotlinDebug\n*F\n+ 1 CheckboxTokens.kt\nandroidx/compose/material3/tokens/CheckboxTokens\n*L\n25#1:78\n26#1:79\n27#1:80\n28#1:81\n32#1:82\n37#1:83\n40#1:84\n44#1:85\n47#1:86\n50#1:87\n52#1:88\n55#1:89\n57#1:90\n60#1:91\n62#1:92\n64#1:93\n67#1:94\n69#1:95\n71#1:96\n73#1:97\n75#1:98\n*E\n"})
public final class CheckboxTokens {

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private static final ColorSchemeKeyTokens UnselectedPressedOutlineColor;

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private static final float SelectedPressedOutlineWidth;

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens SelectedErrorHoverIconColor;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens SelectedErrorIconColor;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens SelectedContainerColor;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private static final float SelectedDisabledContainerOutlineWidth;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private static final float UnselectedPressedOutlineWidth;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private static final float UnselectedHoverOutlineWidth;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private static final float UnselectedDisabledOutlineWidth;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private static final float IconSize;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens UnselectedHoverOutlineColor;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private static final ColorSchemeKeyTokens SelectedFocusIconColor;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private static final ColorSchemeKeyTokens UnselectedDisabledOutlineColor;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private static final float UnselectedFocusOutlineWidth;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens SelectedDisabledContainerColor;

    /* JADX INFO: renamed from: ViF, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens SelectedHoverIconColor;

    /* JADX INFO: renamed from: WPU, reason: from kotlin metadata */
    private static final float SelectedFocusOutlineWidth;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private static final float StateLayerSize;

    /* JADX INFO: renamed from: XQ, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens SelectedFocusContainerColor;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private static final float UnselectedErrorPressedOutlineWidth;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private static final float SelectedErrorPressedOutlineWidth;

    /* JADX INFO: renamed from: aYN, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens SelectedHoverContainerColor;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private static final float SelectedErrorFocusOutlineWidth;

    /* JADX INFO: renamed from: bzg, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens UnselectedErrorPressedOutlineColor;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private static final float SelectedErrorHoverOutlineWidth;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final ShapeKeyTokens StateLayerShape;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private static final float UnselectedOutlineWidth;

    /* JADX INFO: renamed from: fD, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens SelectedPressedIconColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final ColorSchemeKeyTokens SelectedIconColor;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens SelectedErrorFocusContainerColor;

    /* JADX INFO: renamed from: iF, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens SelectedPressedContainerColor;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens UnselectedFocusOutlineColor;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens SelectedErrorContainerColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final CheckboxTokens f29414n = new CheckboxTokens();

    /* JADX INFO: renamed from: nHg, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens UnselectedErrorFocusOutlineColor;

    /* JADX INFO: renamed from: nY, reason: from kotlin metadata */
    private static final float SelectedHoverOutlineWidth;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private static final float ContainerWidth;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final ColorSchemeKeyTokens SelectedErrorPressedIconColor;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens UnselectedOutlineColor;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens SelectedErrorFocusIconColor;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private static final ColorSchemeKeyTokens SelectedErrorPressedContainerColor;

    /* JADX INFO: renamed from: rV9, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens UnselectedErrorOutlineColor;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final float ContainerHeight;

    /* JADX INFO: renamed from: s7N, reason: from kotlin metadata */
    private static final float UnselectedErrorFocusOutlineWidth;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final RoundedCornerShape ContainerShape;

    /* JADX INFO: renamed from: te, reason: from kotlin metadata */
    private static final float SelectedOutlineWidth;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens SelectedErrorHoverContainerColor;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private static final float UnselectedErrorHoverOutlineWidth;

    /* JADX INFO: renamed from: wTp, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens UnselectedErrorHoverOutlineColor;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens SelectedDisabledIconColor;

    static {
        float f3 = (float) 18.0d;
        ContainerHeight = Dp.KN(f3);
        float f4 = (float) 2.0d;
        ContainerShape = RoundedCornerShapeKt.t(Dp.KN(f4));
        ContainerWidth = Dp.KN(f3);
        IconSize = Dp.KN(f3);
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Primary;
        SelectedContainerColor = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurface;
        SelectedDisabledContainerColor = colorSchemeKeyTokens2;
        float f5 = (float) 0.0d;
        SelectedDisabledContainerOutlineWidth = Dp.KN(f5);
        SelectedDisabledIconColor = ColorSchemeKeyTokens.Surface;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.Error;
        SelectedErrorContainerColor = colorSchemeKeyTokens3;
        SelectedErrorFocusContainerColor = colorSchemeKeyTokens3;
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = ColorSchemeKeyTokens.OnError;
        SelectedErrorFocusIconColor = colorSchemeKeyTokens4;
        SelectedErrorFocusOutlineWidth = Dp.KN(f5);
        SelectedErrorHoverContainerColor = colorSchemeKeyTokens3;
        SelectedErrorHoverIconColor = colorSchemeKeyTokens4;
        SelectedErrorHoverOutlineWidth = Dp.KN(f5);
        SelectedErrorIconColor = colorSchemeKeyTokens4;
        SelectedErrorPressedContainerColor = colorSchemeKeyTokens3;
        SelectedErrorPressedIconColor = colorSchemeKeyTokens4;
        SelectedErrorPressedOutlineWidth = Dp.KN(f5);
        SelectedFocusContainerColor = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens5 = ColorSchemeKeyTokens.OnPrimary;
        SelectedFocusIconColor = colorSchemeKeyTokens5;
        SelectedFocusOutlineWidth = Dp.KN(f5);
        SelectedHoverContainerColor = colorSchemeKeyTokens;
        SelectedHoverIconColor = colorSchemeKeyTokens5;
        SelectedHoverOutlineWidth = Dp.KN(f5);
        SelectedIconColor = colorSchemeKeyTokens5;
        SelectedOutlineWidth = Dp.KN(f5);
        SelectedPressedContainerColor = colorSchemeKeyTokens;
        SelectedPressedIconColor = colorSchemeKeyTokens5;
        SelectedPressedOutlineWidth = Dp.KN(f5);
        StateLayerShape = ShapeKeyTokens.CornerFull;
        StateLayerSize = Dp.KN((float) 40.0d);
        UnselectedDisabledOutlineColor = colorSchemeKeyTokens2;
        UnselectedDisabledOutlineWidth = Dp.KN(f4);
        UnselectedErrorFocusOutlineColor = colorSchemeKeyTokens3;
        UnselectedErrorFocusOutlineWidth = Dp.KN(f4);
        UnselectedErrorHoverOutlineColor = colorSchemeKeyTokens3;
        UnselectedErrorHoverOutlineWidth = Dp.KN(f4);
        UnselectedErrorOutlineColor = colorSchemeKeyTokens3;
        UnselectedErrorPressedOutlineColor = colorSchemeKeyTokens3;
        UnselectedErrorPressedOutlineWidth = Dp.KN(f4);
        UnselectedFocusOutlineColor = colorSchemeKeyTokens2;
        UnselectedFocusOutlineWidth = Dp.KN(f4);
        UnselectedHoverOutlineColor = colorSchemeKeyTokens2;
        UnselectedHoverOutlineWidth = Dp.KN(f4);
        UnselectedOutlineColor = ColorSchemeKeyTokens.OnSurfaceVariant;
        UnselectedOutlineWidth = Dp.KN(f4);
        UnselectedPressedOutlineColor = colorSchemeKeyTokens2;
        UnselectedPressedOutlineWidth = Dp.KN(f4);
    }

    public final ColorSchemeKeyTokens J2() {
        return UnselectedOutlineColor;
    }

    public final ColorSchemeKeyTokens O() {
        return UnselectedDisabledOutlineColor;
    }

    public final ColorSchemeKeyTokens n() {
        return SelectedContainerColor;
    }

    public final float nr() {
        return StateLayerSize;
    }

    public final ColorSchemeKeyTokens rl() {
        return SelectedDisabledContainerColor;
    }

    public final ColorSchemeKeyTokens t() {
        return SelectedIconColor;
    }

    private CheckboxTokens() {
    }
}
