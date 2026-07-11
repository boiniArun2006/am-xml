package androidx.compose.material3.tokens;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\bt\n\u0002\u0018\u0002\n\u0002\b \bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000f\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u0018\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0010\u0010\u0017R\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001d\u0010\u001d\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u0010\f\u001a\u0004\b\u001c\u0010\u000eR\u001a\u0010 \u001a\u00020\u001e8\u0006X\u0086D¢\u0006\f\n\u0004\b\u001f\u0010\f\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010#\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\bR\u001a\u0010&\u001a\u00020\u001e8\u0006X\u0086D¢\u0006\f\n\u0004\b$\u0010\f\u001a\u0004\b%\u0010\u000eR\u0017\u0010(\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b\u0019\u0010\bR\u001a\u0010*\u001a\u00020\u001e8\u0006X\u0086D¢\u0006\f\n\u0004\b)\u0010\f\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010,\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b\u001f\u0010\bR\u001a\u0010.\u001a\u00020\u001e8\u0006X\u0086D¢\u0006\f\n\u0004\b-\u0010\f\u001a\u0004\b!\u0010\u000eR\u0017\u00100\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010\u0006\u001a\u0004\b$\u0010\bR\u001a\u00102\u001a\u00020\u001e8\u0006X\u0086D¢\u0006\f\n\u0004\b1\u0010\f\u001a\u0004\b'\u0010\u000eR\u0017\u00104\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b)\u0010\bR\u001a\u00106\u001a\u00020\u001e8\u0006X\u0086D¢\u0006\f\n\u0004\b5\u0010\f\u001a\u0004\b+\u0010\u000eR\u0017\u00108\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b-\u0010\bR\u001a\u0010:\u001a\u00020\u001e8\u0006X\u0086D¢\u0006\f\n\u0004\b9\u0010\f\u001a\u0004\b/\u0010\u000eR\u0017\u0010<\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b;\u0010\u0006\u001a\u0004\b1\u0010\bR\u0017\u0010?\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b=\u0010\u0006\u001a\u0004\b>\u0010\bR\u0017\u0010A\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b@\u0010\u0006\u001a\u0004\b3\u0010\bR\u0017\u0010D\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bB\u0010\u0006\u001a\u0004\bC\u0010\bR\u0017\u0010G\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bE\u0010\u0006\u001a\u0004\bF\u0010\bR\u0017\u0010J\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bH\u0010\u0006\u001a\u0004\bI\u0010\bR\u0017\u0010M\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bK\u0010\u0006\u001a\u0004\bL\u0010\bR\u0017\u0010P\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bN\u0010\u0006\u001a\u0004\bO\u0010\bR\u0017\u0010S\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bQ\u0010\u0006\u001a\u0004\bR\u0010\bR\u0017\u0010V\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bT\u0010\u0006\u001a\u0004\bU\u0010\bR\u0017\u0010Y\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bW\u0010\u0006\u001a\u0004\bX\u0010\bR\u0017\u0010\\\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bZ\u0010\u0006\u001a\u0004\b[\u0010\bR\u0017\u0010_\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b]\u0010\u0006\u001a\u0004\b^\u0010\bR\u0017\u0010b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b`\u0010\u0006\u001a\u0004\ba\u0010\bR\u0017\u0010d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bc\u0010\u0006\u001a\u0004\b5\u0010\bR\u0017\u0010f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\be\u0010\u0006\u001a\u0004\b7\u0010\bR\u0017\u0010h\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bg\u0010\u0006\u001a\u0004\b9\u0010\bR\u0017\u0010j\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bi\u0010\u0006\u001a\u0004\b;\u0010\bR\u0017\u0010l\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bk\u0010\u0006\u001a\u0004\b=\u0010\bR\u0017\u0010n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bm\u0010\u0006\u001a\u0004\b@\u0010\bR\u001d\u0010q\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bo\u0010\f\u001a\u0004\bp\u0010\u000eR\u0017\u0010s\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\br\u0010\u0006\u001a\u0004\bB\u0010\bR\u0017\u0010u\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bt\u0010\u0006\u001a\u0004\bE\u0010\bR\u0017\u0010w\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bv\u0010\u0006\u001a\u0004\bH\u0010\bR\u0017\u0010y\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bx\u0010\u0006\u001a\u0004\bK\u0010\bR\u0017\u0010{\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bz\u0010\u0006\u001a\u0004\bN\u0010\bR\u0017\u0010~\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b|\u0010\u0006\u001a\u0004\b}\u0010\bR\u001f\u0010\u0081\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0004\b\u007f\u0010\f\u001a\u0005\b\u0080\u0001\u0010\u000eR\u001a\u0010\u0084\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010\u0006\u001a\u0005\b\u0083\u0001\u0010\bR\u001a\u0010\u0087\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010\u0006\u001a\u0005\b\u0086\u0001\u0010\bR\u001a\u0010\u008a\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010\u0006\u001a\u0005\b\u0089\u0001\u0010\bR\u001a\u0010\u008d\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010\u0006\u001a\u0005\b\u008c\u0001\u0010\bR\u001a\u0010\u0090\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010\u0006\u001a\u0005\b\u008f\u0001\u0010\bR\u0019\u0010\u0092\u0001\u001a\u00020\u00048\u0006¢\u0006\r\n\u0005\b\u0091\u0001\u0010\u0006\u001a\u0004\bQ\u0010\bR\u001d\u0010\u0098\u0001\u001a\u00030\u0093\u00018\u0006¢\u0006\u0010\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0019\u0010\u009a\u0001\u001a\u00020\u00048\u0006¢\u0006\r\n\u0005\b\u0099\u0001\u0010\u0006\u001a\u0004\bT\u0010\bR\u0019\u0010\u009c\u0001\u001a\u00020\u00048\u0006¢\u0006\r\n\u0005\b\u009b\u0001\u0010\u0006\u001a\u0004\bW\u0010\bR\u0019\u0010\u009e\u0001\u001a\u00020\u00048\u0006¢\u0006\r\n\u0005\b\u009d\u0001\u0010\u0006\u001a\u0004\bZ\u0010\bR\u0019\u0010 \u0001\u001a\u00020\u00048\u0006¢\u0006\r\n\u0005\b\u009f\u0001\u0010\u0006\u001a\u0004\b]\u0010\bR\u001d\u0010£\u0001\u001a\u00030\u0093\u00018\u0006¢\u0006\u0010\n\u0006\b¡\u0001\u0010\u0095\u0001\u001a\u0006\b¢\u0001\u0010\u0097\u0001R\u0019\u0010¥\u0001\u001a\u00020\u00048\u0006¢\u0006\r\n\u0005\b¤\u0001\u0010\u0006\u001a\u0004\b`\u0010\bR \u0010¨\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b¦\u0001\u0010\f\u001a\u0005\b§\u0001\u0010\u000eR\u0019\u0010ª\u0001\u001a\u00020\u00048\u0006¢\u0006\r\n\u0005\b©\u0001\u0010\u0006\u001a\u0004\bc\u0010\bR\u001d\u0010\u00ad\u0001\u001a\u00030\u0093\u00018\u0006¢\u0006\u0010\n\u0006\b«\u0001\u0010\u0095\u0001\u001a\u0006\b¬\u0001\u0010\u0097\u0001R\u0019\u0010¯\u0001\u001a\u00020\u00048\u0006¢\u0006\r\n\u0005\b®\u0001\u0010\u0006\u001a\u0004\be\u0010\bR \u0010²\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b°\u0001\u0010\f\u001a\u0005\b±\u0001\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006³\u0001"}, d2 = {"Landroidx/compose/material3/tokens/FilledTextFieldTokens;", "", "<init>", "()V", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "rl", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", c.f62177j, "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ActiveIndicatorColor", "Landroidx/compose/ui/unit/Dp;", "t", "F", "getActiveIndicatorHeight-D9Ej5fM", "()F", "ActiveIndicatorHeight", "nr", "CaretColor", "O", "ContainerColor", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "J2", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", "Uo", "DisabledActiveIndicatorColor", "KN", "getDisabledActiveIndicatorHeight-D9Ej5fM", "DisabledActiveIndicatorHeight", "", "xMQ", "DisabledActiveIndicatorOpacity", "mUb", "getDisabledContainerColor", "DisabledContainerColor", "gh", "getDisabledContainerOpacity", "DisabledContainerOpacity", "qie", "DisabledInputColor", "az", "DisabledInputOpacity", "ty", "DisabledLabelColor", "HI", "DisabledLabelOpacity", "ck", "DisabledLeadingIconColor", "Ik", "DisabledLeadingIconOpacity", "r", "DisabledSupportingColor", "o", "DisabledSupportingOpacity", "Z", "DisabledTrailingIconColor", "XQ", "DisabledTrailingIconOpacity", "S", "ErrorActiveIndicatorColor", "WPU", "getErrorFocusActiveIndicatorColor", "ErrorFocusActiveIndicatorColor", "aYN", "ErrorFocusCaretColor", "ViF", "getErrorFocusInputColor", "ErrorFocusInputColor", "nY", "getErrorFocusLabelColor", "ErrorFocusLabelColor", "g", "getErrorFocusLeadingIconColor", "ErrorFocusLeadingIconColor", "te", "getErrorFocusSupportingColor", "ErrorFocusSupportingColor", "iF", "getErrorFocusTrailingIconColor", "ErrorFocusTrailingIconColor", "fD", "getErrorHoverActiveIndicatorColor", "ErrorHoverActiveIndicatorColor", "E2", "getErrorHoverInputColor", "ErrorHoverInputColor", "e", "getErrorHoverLabelColor", "ErrorHoverLabelColor", "X", "getErrorHoverLeadingIconColor", "ErrorHoverLeadingIconColor", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "getErrorHoverSupportingColor", "ErrorHoverSupportingColor", "N", "getErrorHoverTrailingIconColor", "ErrorHoverTrailingIconColor", "nHg", "ErrorInputColor", "s7N", "ErrorLabelColor", "wTp", "ErrorLeadingIconColor", "v", "ErrorSupportingColor", "rV9", "ErrorTrailingIconColor", "bzg", "FocusActiveIndicatorColor", "Xw", "getFocusActiveIndicatorHeight-D9Ej5fM", "FocusActiveIndicatorHeight", "jB", "FocusInputColor", "U", "FocusLabelColor", "P5", "FocusLeadingIconColor", "M7", "FocusSupportingColor", "p5", "FocusTrailingIconColor", "eF", "getHoverActiveIndicatorColor", "HoverActiveIndicatorColor", "E", "getHoverActiveIndicatorHeight-D9Ej5fM", "HoverActiveIndicatorHeight", "M", "getHoverInputColor", "HoverInputColor", "FX", "getHoverLabelColor", "HoverLabelColor", "B", "getHoverLeadingIconColor", "HoverLeadingIconColor", "J", "getHoverSupportingColor", "HoverSupportingColor", "D", "getHoverTrailingIconColor", "HoverTrailingIconColor", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "InputColor", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "I", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getInputFont", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "InputFont", "GR", "InputPlaceholderColor", "Nxk", "InputPrefixColor", "Y", "InputSuffixColor", "k", "LabelColor", "dR0", "getLabelFont", "LabelFont", "z", "LeadingIconColor", "piY", "getLeadingIconSize-D9Ej5fM", "LeadingIconSize", "ijL", "SupportingColor", "m", "getSupportingFont", "SupportingFont", "eTf", "TrailingIconColor", "xg", "getTrailingIconSize-D9Ej5fM", "TrailingIconSize", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFilledTextFieldTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilledTextFieldTokens.kt\nandroidx/compose/material3/tokens/FilledTextFieldTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,91:1\n158#2:92\n158#2:93\n158#2:94\n158#2:95\n158#2:96\n158#2:97\n*S KotlinDebug\n*F\n+ 1 FilledTextFieldTokens.kt\nandroidx/compose/material3/tokens/FilledTextFieldTokens\n*L\n25#1:92\n30#1:93\n64#1:94\n71#1:95\n85#1:96\n89#1:97\n*E\n"})
public final class FilledTextFieldTokens {

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    private static final ColorSchemeKeyTokens HoverLeadingIconColor;

    /* JADX INFO: renamed from: D, reason: collision with root package name and from kotlin metadata */
    private static final ColorSchemeKeyTokens HoverTrailingIconColor;

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private static final float HoverActiveIndicatorHeight;

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens ErrorHoverInputColor;

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    private static final ColorSchemeKeyTokens HoverLabelColor;

    /* JADX INFO: renamed from: GR, reason: collision with root package name and from kotlin metadata */
    private static final ColorSchemeKeyTokens InputPlaceholderColor;

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private static final float DisabledLabelOpacity;

    /* JADX INFO: renamed from: I, reason: collision with root package name and from kotlin metadata */
    private static final TypographyKeyTokens InputFont;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private static final float DisabledLeadingIconOpacity;

    /* JADX INFO: renamed from: J, reason: collision with root package name and from kotlin metadata */
    private static final ColorSchemeKeyTokens HoverSupportingColor;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private static final ShapeKeyTokens ContainerShape;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private static final float DisabledActiveIndicatorHeight;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private static final ColorSchemeKeyTokens HoverInputColor;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens FocusSupportingColor;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private static final ColorSchemeKeyTokens ErrorHoverTrailingIconColor;

    /* JADX INFO: renamed from: Nxk, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens InputPrefixColor;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private static final ColorSchemeKeyTokens ContainerColor;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens FocusLeadingIconColor;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private static final ColorSchemeKeyTokens ErrorActiveIndicatorColor;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private static final ColorSchemeKeyTokens ErrorHoverSupportingColor;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private static final ColorSchemeKeyTokens FocusLabelColor;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens DisabledActiveIndicatorColor;

    /* JADX INFO: renamed from: ViF, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens ErrorFocusInputColor;

    /* JADX INFO: renamed from: WPU, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens ErrorFocusActiveIndicatorColor;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private static final ColorSchemeKeyTokens ErrorHoverLeadingIconColor;

    /* JADX INFO: renamed from: XQ, reason: from kotlin metadata */
    private static final float DisabledTrailingIconOpacity;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private static final float FocusActiveIndicatorHeight;

    /* JADX INFO: renamed from: Y, reason: collision with root package name and from kotlin metadata */
    private static final ColorSchemeKeyTokens InputSuffixColor;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private static final ColorSchemeKeyTokens DisabledTrailingIconColor;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final ColorSchemeKeyTokens InputColor;

    /* JADX INFO: renamed from: aYN, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens ErrorFocusCaretColor;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private static final float DisabledInputOpacity;

    /* JADX INFO: renamed from: bzg, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens FocusActiveIndicatorColor;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens DisabledLeadingIconColor;

    /* JADX INFO: renamed from: dR0, reason: from kotlin metadata */
    private static final TypographyKeyTokens LabelFont;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final ColorSchemeKeyTokens ErrorHoverLabelColor;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens HoverActiveIndicatorColor;

    /* JADX INFO: renamed from: eTf, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens TrailingIconColor;

    /* JADX INFO: renamed from: fD, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens ErrorHoverActiveIndicatorColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final ColorSchemeKeyTokens ErrorFocusLeadingIconColor;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private static final float DisabledContainerOpacity;

    /* JADX INFO: renamed from: iF, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens ErrorFocusTrailingIconColor;

    /* JADX INFO: renamed from: ijL, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens SupportingColor;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens FocusInputColor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final ColorSchemeKeyTokens LabelColor;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final TypographyKeyTokens SupportingFont;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens DisabledContainerColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final FilledTextFieldTokens f29601n = new FilledTextFieldTokens();

    /* JADX INFO: renamed from: nHg, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens ErrorInputColor;

    /* JADX INFO: renamed from: nY, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens ErrorFocusLabelColor;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens CaretColor;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final float DisabledSupportingOpacity;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens FocusTrailingIconColor;

    /* JADX INFO: renamed from: piY, reason: from kotlin metadata */
    private static final float LeadingIconSize;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens DisabledInputColor;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private static final ColorSchemeKeyTokens DisabledSupportingColor;

    /* JADX INFO: renamed from: rV9, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens ErrorTrailingIconColor;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens ActiveIndicatorColor;

    /* JADX INFO: renamed from: s7N, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens ErrorLabelColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final float ActiveIndicatorHeight;

    /* JADX INFO: renamed from: te, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens ErrorFocusSupportingColor;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens DisabledLabelColor;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private static final ColorSchemeKeyTokens ErrorSupportingColor;

    /* JADX INFO: renamed from: wTp, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens ErrorLeadingIconColor;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private static final float DisabledActiveIndicatorOpacity;

    /* JADX INFO: renamed from: xg, reason: from kotlin metadata */
    private static final float TrailingIconSize;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private static final ColorSchemeKeyTokens LeadingIconColor;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurfaceVariant;
        ActiveIndicatorColor = colorSchemeKeyTokens;
        float f3 = (float) 1.0d;
        ActiveIndicatorHeight = Dp.KN(f3);
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.Primary;
        CaretColor = colorSchemeKeyTokens2;
        ContainerColor = ColorSchemeKeyTokens.SurfaceContainerHighest;
        ContainerShape = ShapeKeyTokens.CornerExtraSmallTop;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnSurface;
        DisabledActiveIndicatorColor = colorSchemeKeyTokens3;
        DisabledActiveIndicatorHeight = Dp.KN(f3);
        DisabledActiveIndicatorOpacity = 0.38f;
        DisabledContainerColor = colorSchemeKeyTokens3;
        DisabledContainerOpacity = 0.04f;
        DisabledInputColor = colorSchemeKeyTokens3;
        DisabledInputOpacity = 0.38f;
        DisabledLabelColor = colorSchemeKeyTokens3;
        DisabledLabelOpacity = 0.38f;
        DisabledLeadingIconColor = colorSchemeKeyTokens3;
        DisabledLeadingIconOpacity = 0.38f;
        DisabledSupportingColor = colorSchemeKeyTokens3;
        DisabledSupportingOpacity = 0.38f;
        DisabledTrailingIconColor = colorSchemeKeyTokens3;
        DisabledTrailingIconOpacity = 0.38f;
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = ColorSchemeKeyTokens.Error;
        ErrorActiveIndicatorColor = colorSchemeKeyTokens4;
        ErrorFocusActiveIndicatorColor = colorSchemeKeyTokens4;
        ErrorFocusCaretColor = colorSchemeKeyTokens4;
        ErrorFocusInputColor = colorSchemeKeyTokens3;
        ErrorFocusLabelColor = colorSchemeKeyTokens4;
        ErrorFocusLeadingIconColor = colorSchemeKeyTokens;
        ErrorFocusSupportingColor = colorSchemeKeyTokens4;
        ErrorFocusTrailingIconColor = colorSchemeKeyTokens4;
        ColorSchemeKeyTokens colorSchemeKeyTokens5 = ColorSchemeKeyTokens.OnErrorContainer;
        ErrorHoverActiveIndicatorColor = colorSchemeKeyTokens5;
        ErrorHoverInputColor = colorSchemeKeyTokens3;
        ErrorHoverLabelColor = colorSchemeKeyTokens5;
        ErrorHoverLeadingIconColor = colorSchemeKeyTokens;
        ErrorHoverSupportingColor = colorSchemeKeyTokens4;
        ErrorHoverTrailingIconColor = colorSchemeKeyTokens5;
        ErrorInputColor = colorSchemeKeyTokens3;
        ErrorLabelColor = colorSchemeKeyTokens4;
        ErrorLeadingIconColor = colorSchemeKeyTokens;
        ErrorSupportingColor = colorSchemeKeyTokens4;
        ErrorTrailingIconColor = colorSchemeKeyTokens4;
        FocusActiveIndicatorColor = colorSchemeKeyTokens2;
        FocusActiveIndicatorHeight = Dp.KN((float) 2.0d);
        FocusInputColor = colorSchemeKeyTokens3;
        FocusLabelColor = colorSchemeKeyTokens2;
        FocusLeadingIconColor = colorSchemeKeyTokens;
        FocusSupportingColor = colorSchemeKeyTokens;
        FocusTrailingIconColor = colorSchemeKeyTokens;
        HoverActiveIndicatorColor = colorSchemeKeyTokens3;
        HoverActiveIndicatorHeight = Dp.KN(f3);
        HoverInputColor = colorSchemeKeyTokens3;
        HoverLabelColor = colorSchemeKeyTokens;
        HoverLeadingIconColor = colorSchemeKeyTokens;
        HoverSupportingColor = colorSchemeKeyTokens;
        HoverTrailingIconColor = colorSchemeKeyTokens;
        InputColor = colorSchemeKeyTokens3;
        TypographyKeyTokens typographyKeyTokens = TypographyKeyTokens.BodyLarge;
        InputFont = typographyKeyTokens;
        InputPlaceholderColor = colorSchemeKeyTokens;
        InputPrefixColor = colorSchemeKeyTokens;
        InputSuffixColor = colorSchemeKeyTokens;
        LabelColor = colorSchemeKeyTokens;
        LabelFont = typographyKeyTokens;
        LeadingIconColor = colorSchemeKeyTokens;
        float f4 = (float) 24.0d;
        LeadingIconSize = Dp.KN(f4);
        SupportingColor = colorSchemeKeyTokens;
        SupportingFont = TypographyKeyTokens.BodySmall;
        TrailingIconColor = colorSchemeKeyTokens;
        TrailingIconSize = Dp.KN(f4);
    }

    public final ColorSchemeKeyTokens E2() {
        return InputPlaceholderColor;
    }

    public final ColorSchemeKeyTokens HI() {
        return DisabledTrailingIconColor;
    }

    public final ColorSchemeKeyTokens Ik() {
        return ErrorActiveIndicatorColor;
    }

    public final float J2() {
        return DisabledActiveIndicatorOpacity;
    }

    public final float KN() {
        return DisabledInputOpacity;
    }

    public final ColorSchemeKeyTokens N() {
        return LeadingIconColor;
    }

    public final ColorSchemeKeyTokens O() {
        return DisabledActiveIndicatorColor;
    }

    public final ColorSchemeKeyTokens S() {
        return ErrorSupportingColor;
    }

    public final ColorSchemeKeyTokens T() {
        return LabelColor;
    }

    public final ColorSchemeKeyTokens Uo() {
        return DisabledInputColor;
    }

    public final ColorSchemeKeyTokens ViF() {
        return FocusInputColor;
    }

    public final ColorSchemeKeyTokens WPU() {
        return ErrorTrailingIconColor;
    }

    public final ColorSchemeKeyTokens X() {
        return InputSuffixColor;
    }

    public final ColorSchemeKeyTokens XQ() {
        return ErrorLeadingIconColor;
    }

    public final ColorSchemeKeyTokens Z() {
        return ErrorLabelColor;
    }

    public final ColorSchemeKeyTokens aYN() {
        return FocusActiveIndicatorColor;
    }

    public final ColorSchemeKeyTokens az() {
        return DisabledSupportingColor;
    }

    public final float ck() {
        return DisabledTrailingIconOpacity;
    }

    public final ColorSchemeKeyTokens e() {
        return InputPrefixColor;
    }

    public final ColorSchemeKeyTokens fD() {
        return InputColor;
    }

    public final ColorSchemeKeyTokens g() {
        return FocusLeadingIconColor;
    }

    public final ColorSchemeKeyTokens gh() {
        return DisabledLeadingIconColor;
    }

    public final ColorSchemeKeyTokens iF() {
        return FocusTrailingIconColor;
    }

    public final float mUb() {
        return DisabledLabelOpacity;
    }

    public final ColorSchemeKeyTokens n() {
        return ActiveIndicatorColor;
    }

    public final ColorSchemeKeyTokens nHg() {
        return SupportingColor;
    }

    public final ColorSchemeKeyTokens nY() {
        return FocusLabelColor;
    }

    public final ShapeKeyTokens nr() {
        return ContainerShape;
    }

    public final ColorSchemeKeyTokens o() {
        return ErrorInputColor;
    }

    public final float qie() {
        return DisabledLeadingIconOpacity;
    }

    public final ColorSchemeKeyTokens r() {
        return ErrorFocusCaretColor;
    }

    public final ColorSchemeKeyTokens rl() {
        return CaretColor;
    }

    public final ColorSchemeKeyTokens s7N() {
        return TrailingIconColor;
    }

    public final ColorSchemeKeyTokens t() {
        return ContainerColor;
    }

    public final ColorSchemeKeyTokens te() {
        return FocusSupportingColor;
    }

    public final float ty() {
        return DisabledSupportingOpacity;
    }

    public final ColorSchemeKeyTokens xMQ() {
        return DisabledLabelColor;
    }

    private FilledTextFieldTokens() {
    }
}
