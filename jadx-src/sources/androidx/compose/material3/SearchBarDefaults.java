package androidx.compose.material3;

import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.material3.tokens.FilledTextFieldTokens;
import androidx.compose.material3.tokens.SearchBarTokens;
import androidx.compose.material3.tokens.SearchViewTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.unit.Dp;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u009e\u0001\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJÊ\u0001\u00100\u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001f0\u001e2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010#\u001a\u00020\"2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001f0\u001e2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020\"2\u0015\b\u0002\u0010*\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010(¢\u0006\u0002\b)2\u0015\b\u0002\u0010+\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010(¢\u0006\u0002\b)2\u0015\b\u0002\u0010,\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0018\u00010(¢\u0006\u0002\b)2\b\b\u0002\u0010-\u001a\u00020\u00192\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.H\u0007¢\u0006\u0004\b0\u00101R\u001d\u00106\u001a\u0002028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u00105R\u001d\u00109\u001a\u0002028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b7\u00103\u001a\u0004\b8\u00105R&\u0010=\u001a\u0002028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b:\u00103\u0012\u0004\b<\u0010\u0003\u001a\u0004\b;\u00105R\u001d\u0010?\u001a\u0002028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b>\u00103\u001a\u0004\b>\u00105R\u0011\u0010C\u001a\u00020@8G¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0011\u0010D\u001a\u00020@8G¢\u0006\u0006\u001a\u0004\b:\u0010BR\u0011\u0010E\u001a\u00020@8G¢\u0006\u0006\u001a\u0004\b7\u0010BR\u0011\u0010I\u001a\u00020F8G¢\u0006\u0006\u001a\u0004\bG\u0010H\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006J"}, d2 = {"Landroidx/compose/material3/SearchBarDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", "containerColor", "dividerColor", "Landroidx/compose/material3/SearchBarColors;", "rl", "(JJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SearchBarColors;", "focusedTextColor", "unfocusedTextColor", "disabledTextColor", "cursorColor", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "selectionColors", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "Landroidx/compose/material3/TextFieldColors;", "mUb", "(JJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/TextFieldColors;", "", "query", "Lkotlin/Function1;", "", "onQueryChange", "onSearch", "", "expanded", "onExpandedChange", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "placeholder", "leadingIcon", "trailingIcon", "colors", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", c.f62177j, "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/unit/Dp;", "F", "KN", "()F", "TonalElevation", "t", "Uo", "ShadowElevation", "nr", "getElevation-D9Ej5fM", "getElevation-D9Ej5fM$annotations", "Elevation", "O", "InputFieldHeight", "Landroidx/compose/ui/graphics/Shape;", "J2", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "inputFieldShape", "fullScreenShape", "dockedShape", "Landroidx/compose/foundation/layout/WindowInsets;", "xMQ", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSearchBar.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBarDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 5 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,1243:1\n77#2:1244\n77#2:1257\n77#2:1260\n77#2:1275\n77#2:1288\n1223#3,6:1245\n1223#3,6:1251\n1223#3,6:1263\n1223#3,6:1269\n1223#3,6:1276\n1223#3,6:1282\n78#4:1258\n81#4:1259\n708#5:1261\n696#5:1262\n*S KotlinDebug\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBarDefaults\n*L\n418#1:1244\n501#1:1257\n507#1:1260\n535#1:1275\n606#1:1288\n497#1:1245,6\n500#1:1251,6\n522#1:1263,6\n523#1:1269,6\n538#1:1276,6\n567#1:1282,6\n503#1:1258\n504#1:1259\n507#1:1261\n507#1:1262\n*E\n"})
public final class SearchBarDefaults {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private static final float InputFieldHeight;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final SearchBarDefaults f27243n = new SearchBarDefaults();

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private static final float Elevation;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final float TonalElevation;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final float ShadowElevation;

    public final TextFieldColors mUb(long j2, long j3, long j4, long j5, SelectionColors selectionColors, long j6, long j7, long j9, long j10, long j11, long j12, long j13, long j14, long j15, Composer composer, int i2, int i3, int i5) {
        long jAz;
        long jAz2;
        long jAz3;
        long jAz4;
        long jXMQ = (i5 & 1) != 0 ? ColorSchemeKt.xMQ(SearchBarTokens.f29853n.nr(), composer, 6) : j2;
        long jXMQ2 = (i5 & 2) != 0 ? ColorSchemeKt.xMQ(SearchBarTokens.f29853n.nr(), composer, 6) : j3;
        if ((i5 & 4) != 0) {
            FilledTextFieldTokens filledTextFieldTokens = FilledTextFieldTokens.f29601n;
            jAz = Color.az(ColorSchemeKt.xMQ(filledTextFieldTokens.Uo(), composer, 6), filledTextFieldTokens.KN(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jAz = j4;
        }
        long jXMQ3 = (i5 & 8) != 0 ? ColorSchemeKt.xMQ(FilledTextFieldTokens.f29601n.rl(), composer, 6) : j5;
        SelectionColors selectionColors2 = (i5 & 16) != 0 ? (SelectionColors) composer.ty(TextSelectionColorsKt.rl()) : selectionColors;
        long jXMQ4 = (i5 & 32) != 0 ? ColorSchemeKt.xMQ(SearchBarTokens.f29853n.O(), composer, 6) : j6;
        long jXMQ5 = (i5 & 64) != 0 ? ColorSchemeKt.xMQ(SearchBarTokens.f29853n.O(), composer, 6) : j7;
        if ((i5 & 128) != 0) {
            FilledTextFieldTokens filledTextFieldTokens2 = FilledTextFieldTokens.f29601n;
            jAz2 = Color.az(ColorSchemeKt.xMQ(filledTextFieldTokens2.gh(), composer, 6), filledTextFieldTokens2.qie(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jAz2 = j9;
        }
        long jXMQ6 = (i5 & 256) != 0 ? ColorSchemeKt.xMQ(SearchBarTokens.f29853n.Uo(), composer, 6) : j10;
        long jXMQ7 = (i5 & 512) != 0 ? ColorSchemeKt.xMQ(SearchBarTokens.f29853n.Uo(), composer, 6) : j11;
        if ((i5 & 1024) != 0) {
            FilledTextFieldTokens filledTextFieldTokens3 = FilledTextFieldTokens.f29601n;
            jAz3 = Color.az(ColorSchemeKt.xMQ(filledTextFieldTokens3.HI(), composer, 6), filledTextFieldTokens3.ck(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jAz3 = j12;
        }
        long jXMQ8 = (i5 & 2048) != 0 ? ColorSchemeKt.xMQ(SearchBarTokens.f29853n.J2(), composer, 6) : j13;
        long jXMQ9 = (i5 & 4096) != 0 ? ColorSchemeKt.xMQ(SearchBarTokens.f29853n.J2(), composer, 6) : j14;
        if ((i5 & 8192) != 0) {
            FilledTextFieldTokens filledTextFieldTokens4 = FilledTextFieldTokens.f29601n;
            jAz4 = Color.az(ColorSchemeKt.xMQ(filledTextFieldTokens4.Uo(), composer, 6), filledTextFieldTokens4.KN(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jAz4 = j15;
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(-602148837, i2, i3, "androidx.compose.material3.SearchBarDefaults.inputFieldColors (SearchBar.android.kt:437)");
        }
        int i7 = i3 << 18;
        int i8 = ((i2 >> 27) & 14) | ((i3 << 3) & 112) | (i7 & 29360128) | (i7 & 234881024) | (i7 & 1879048192);
        TextFieldColors textFieldColorsO = TextFieldDefaults.f28299n.O(jXMQ, jXMQ2, jAz, 0L, 0L, 0L, 0L, 0L, jXMQ3, 0L, selectionColors2, 0L, 0L, 0L, 0L, jXMQ4, jXMQ5, jAz2, 0L, jXMQ6, jXMQ7, jAz3, 0L, 0L, 0L, 0L, 0L, jXMQ8, jXMQ9, jAz4, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, (i2 & 1022) | ((i2 << 15) & 234881024), ((i2 >> 12) & 14) | (458752 & i2) | (3670016 & i2) | (i2 & 29360128) | ((i2 << 3) & 1879048192), i8, 0, 3072, 1204058872, 4095);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return textFieldColorsO;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:242:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(final String str, final Function1 function1, final Function1 function12, final boolean z2, final Function1 function13, Modifier modifier, boolean z3, Function2 function2, Function2 function22, Function2 function23, TextFieldColors textFieldColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z4;
        Modifier modifier2;
        boolean z5;
        Function2 function24;
        final Function2 function25;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        SearchBarDefaults searchBarDefaults;
        Function2 function26;
        Composer composer2;
        TextFieldColors textFieldColorsMUb;
        MutableInteractionSource mutableInteractionSource2;
        Function2 function27;
        MutableInteractionSource mutableInteractionSource3;
        Object objIF;
        Composer.Companion companion;
        final FocusRequester focusRequester;
        FocusManager focusManager;
        final String strN;
        final String strN2;
        long jKN;
        boolean z6;
        Object objIF2;
        boolean zP5;
        Object objIF3;
        boolean z7;
        Object objIF4;
        Composer composer3;
        boolean z9;
        boolean zN;
        Object objIF5;
        final boolean z10;
        final MutableInteractionSource mutableInteractionSource4;
        final TextFieldColors textFieldColors2;
        final Function2 function28;
        final Modifier modifier3;
        final Function2 function29;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1451366815);
        int i16 = 2;
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i7 = i2 | (composerKN.p5(str) ? 4 : 2);
        } else {
            i7 = i2;
        }
        if ((i5 & 2) != 0) {
            i9 = i7 | 48;
            i10 = 4;
            i8 = 16;
        } else {
            if ((i2 & 48) == 0) {
                i8 = 16;
                i7 |= composerKN.E2(function1) ? 32 : 16;
            } else {
                i8 = 16;
            }
            i9 = i7;
            i10 = 4;
        }
        if ((i5 & 4) != 0) {
            i9 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            z4 = true;
        } else {
            z4 = true;
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i9 |= composerKN.E2(function12) ? 256 : 128;
            }
        }
        if ((i5 & 8) != 0) {
            i9 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i9 |= composerKN.n(z2) ? 2048 : 1024;
        }
        if ((i5 & 16) != 0) {
            i9 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i9 |= composerKN.E2(function13) ? 16384 : 8192;
        }
        int i17 = i5 & 32;
        if (i17 != 0) {
            i9 |= 196608;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i2 & 196608) == 0) {
                i9 |= composerKN.p5(modifier2) ? 131072 : 65536;
            }
        }
        int i18 = i5 & 64;
        if (i18 != 0) {
            i9 |= 1572864;
            z5 = z3;
        } else {
            z5 = z3;
            if ((i2 & 1572864) == 0) {
                i9 |= composerKN.n(z5) ? 1048576 : 524288;
            }
        }
        int i19 = i5 & 128;
        if (i19 != 0) {
            i9 |= 12582912;
            function24 = function2;
        } else {
            function24 = function2;
            if ((i2 & 12582912) == 0) {
                i9 |= composerKN.E2(function24) ? 8388608 : 4194304;
            }
        }
        int i20 = i5 & 256;
        if (i20 != 0) {
            i9 |= 100663296;
            function25 = function22;
        } else {
            function25 = function22;
            if ((i2 & 100663296) == 0) {
                i9 |= composerKN.E2(function25) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
            }
        }
        int i21 = i5 & 512;
        if (i21 != 0) {
            i9 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
        } else {
            if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                i11 = i21;
                i9 |= composerKN.E2(function23) ? 536870912 : 268435456;
            }
            if ((i3 & 6) != 0) {
                i12 = i17;
                if ((i5 & 1024) == 0 && composerKN.p5(textFieldColors)) {
                    i16 = i10;
                }
                i13 = i3 | i16;
            } else {
                i12 = i17;
                i13 = i3;
            }
            i14 = i5 & 2048;
            if (i14 == 0) {
                i15 = i13 | 48;
            } else {
                if ((i3 & 48) == 0) {
                    i13 |= composerKN.p5(mutableInteractionSource) ? 32 : i8;
                }
                i15 = i13;
            }
            if ((i5 & 4096) != 0) {
                if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    searchBarDefaults = this;
                    i15 |= composerKN.p5(searchBarDefaults) ? 256 : 128;
                }
                if ((i9 & 306783379) == 306783378 && (i15 & 147) == 146 && composerKN.xMQ()) {
                    composerKN.wTp();
                    textFieldColors2 = textFieldColors;
                    mutableInteractionSource4 = mutableInteractionSource;
                    z10 = z5;
                    function28 = function24;
                    modifier3 = modifier2;
                    composer3 = composerKN;
                    function29 = function23;
                } else {
                    composerKN.e();
                    if ((i2 & 1) != 0 || composerKN.rV9()) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i18 != 0) {
                            z5 = z4;
                        }
                        if (i19 != 0) {
                            function24 = null;
                        }
                        if (i20 != 0) {
                            function25 = null;
                        }
                        function26 = i11 == 0 ? null : function23;
                        if ((1024 & i5) == 0) {
                            textFieldColorsMUb = searchBarDefaults.mUb(0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerKN, 0, (i15 << 6) & 57344, 16383);
                            composer2 = composerKN;
                            i15 &= -15;
                        } else {
                            composer2 = composerKN;
                            textFieldColorsMUb = textFieldColors;
                        }
                        mutableInteractionSource2 = i14 == 0 ? null : mutableInteractionSource;
                    } else {
                        composerKN.wTp();
                        if ((1024 & i5) != 0) {
                            i15 &= -15;
                        }
                        function26 = function23;
                        textFieldColorsMUb = textFieldColors;
                        mutableInteractionSource2 = mutableInteractionSource;
                        composer2 = composerKN;
                    }
                    composer2.S();
                    if (ComposerKt.v()) {
                        function27 = function26;
                    } else {
                        function27 = function26;
                        ComposerKt.p5(1451366815, i9, i15, "androidx.compose.material3.SearchBarDefaults.InputField (SearchBar.android.kt:494)");
                    }
                    composer2.eF(-320443616);
                    if (mutableInteractionSource2 != null) {
                        Object objIF6 = composer2.iF();
                        if (objIF6 == Composer.INSTANCE.n()) {
                            objIF6 = InteractionSourceKt.n();
                            composer2.o(objIF6);
                        }
                        mutableInteractionSource3 = (MutableInteractionSource) objIF6;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    composer2.Xw();
                    boolean zBooleanValue = ((Boolean) FocusInteractionKt.n(mutableInteractionSource3, composer2, 0).getValue()).booleanValue();
                    objIF = composer2.iF();
                    companion = Composer.INSTANCE;
                    final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource3;
                    if (objIF == companion.n()) {
                        objIF = new FocusRequester();
                        composer2.o(objIF);
                    }
                    focusRequester = (FocusRequester) objIF;
                    focusManager = (FocusManager) composer2.ty(CompositionLocalsKt.Uo());
                    Strings.Companion companion2 = Strings.INSTANCE;
                    strN = Strings_androidKt.n(Strings.n(R.string.bzg), composer2, 0);
                    final Function2 function210 = function25;
                    strN2 = Strings_androidKt.n(Strings.n(R.string.jB), composer2, 0);
                    jKN = ((TextStyle) composer2.ty(TextKt.J2())).KN();
                    if (jKN == 16) {
                        jKN = textFieldColorsMUb.az(z5, false, zBooleanValue);
                    }
                    long j2 = jKN;
                    Modifier modifier4 = modifier2;
                    Modifier modifierN = FocusRequesterModifierKt.n(SizeKt.aYN(modifier4, SearchBar_androidKt.g(), InputFieldHeight, SearchBar_androidKt.f27276O, 0.0f, 8, null), focusRequester);
                    z6 = (i9 & 57344) != 16384 ? z4 : false;
                    objIF2 = composer2.iF();
                    if (!z6 || objIF2 == companion.n()) {
                        objIF2 = new Function1<FocusState, Unit>() { // from class: androidx.compose.material3.SearchBarDefaults$InputField$1$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
                                n(focusState);
                                return Unit.INSTANCE;
                            }

                            public final void n(FocusState focusState) {
                                if (focusState.n()) {
                                    function13.invoke(Boolean.TRUE);
                                }
                            }
                        };
                        composer2.o(objIF2);
                    }
                    Modifier modifierN2 = FocusChangedModifierKt.n(modifierN, (Function1) objIF2);
                    zP5 = ((i9 & 7168) != 2048 ? z4 : false) | composer2.p5(strN) | composer2.p5(strN2);
                    objIF3 = composer2.iF();
                    if (!zP5 || objIF3 == companion.n()) {
                        objIF3 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SearchBarDefaults$InputField$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                n(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.I(semanticsPropertyReceiver, strN);
                                if (z2) {
                                    SemanticsPropertiesKt.ul(semanticsPropertyReceiver, strN2);
                                }
                                final FocusRequester focusRequester2 = focusRequester;
                                SemanticsPropertiesKt.te(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material3.SearchBarDefaults$InputField$2$1.1
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                    public final Boolean invoke() {
                                        focusRequester2.J2();
                                        return Boolean.TRUE;
                                    }
                                }, 1, null);
                            }
                        };
                        composer2.o(objIF3);
                    }
                    Modifier modifierNr = SemanticsModifierKt.nr(modifierN2, false, (Function1) objIF3, z4 ? 1 : 0, null);
                    TextStyle textStyleNHg = ((TextStyle) composer2.ty(TextKt.J2())).nHg(new TextStyle(j2, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null));
                    SolidColor solidColor = new SolidColor(textFieldColorsMUb.t(false), null);
                    KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.INSTANCE.Uo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, (DefaultConstructorMarker) null);
                    int i22 = i9 & 14;
                    z7 = ((i9 & 896) != 256) | (i22 != i10);
                    objIF4 = composer2.iF();
                    if (!z7 || objIF4 == companion.n()) {
                        objIF4 = new Function1<KeyboardActionScope, Unit>() { // from class: androidx.compose.material3.SearchBarDefaults$InputField$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(KeyboardActionScope keyboardActionScope) {
                                n(keyboardActionScope);
                                return Unit.INSTANCE;
                            }

                            public final void n(KeyboardActionScope keyboardActionScope) {
                                function12.invoke(str);
                            }
                        };
                        composer2.o(objIF4);
                    }
                    final TextFieldColors textFieldColors3 = textFieldColorsMUb;
                    final boolean z11 = z5;
                    final Function2 function211 = function24;
                    final Function2 function212 = function27;
                    int i23 = 102236160 | i22 | (i9 & 112);
                    int i24 = i9 >> 9;
                    Composer composer4 = composer2;
                    BasicTextFieldKt.O(str, function1, modifierNr, z11, false, textStyleNHg, keyboardOptions, new KeyboardActions(null, null, null, null, (Function1) objIF4, null, 47, null), true, 0, 0, null, null, mutableInteractionSource5, solidColor, ComposableLambdaKt.nr(-2029278807, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBarDefaults$InputField$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function213, Composer composer5, Integer num) {
                            n(function213, composer5, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Function2 function213, Composer composer5, int i25) {
                            int i26;
                            if ((i25 & 6) == 0) {
                                i26 = i25 | (composer5.E2(function213) ? 4 : 2);
                            } else {
                                i26 = i25;
                            }
                            if ((i26 & 19) == 18 && composer5.xMQ()) {
                                composer5.wTp();
                                return;
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-2029278807, i26, -1, "androidx.compose.material3.SearchBarDefaults.InputField.<anonymous> (SearchBar.android.kt:541)");
                            }
                            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f28299n;
                            int i27 = i26;
                            String str2 = str;
                            boolean z12 = z11;
                            VisualTransformation visualTransformationT = VisualTransformation.INSTANCE.t();
                            MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource5;
                            Function2 function214 = function211;
                            final Function2 function215 = function210;
                            composer5.eF(-1102017390);
                            ComposableLambda composableLambdaNr = function215 == null ? null : ComposableLambdaKt.nr(-1401341985, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBarDefaults$InputField$4$1$1
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                    n(composer6, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer6, int i28) {
                                    if ((i28 & 3) == 2 && composer6.xMQ()) {
                                        composer6.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-1401341985, i28, -1, "androidx.compose.material3.SearchBarDefaults.InputField.<anonymous>.<anonymous>.<anonymous> (SearchBar.android.kt:551)");
                                    }
                                    Modifier modifierT = OffsetKt.t(Modifier.INSTANCE, SearchBar_androidKt.Uo, 0.0f, 2, null);
                                    Function2 function216 = function215;
                                    MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                                    int iN = ComposablesKt.n(composer6, 0);
                                    CompositionLocalMap compositionLocalMapIk = composer6.Ik();
                                    Modifier modifierO = ComposedModifierKt.O(composer6, modifierT);
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0 function0N = companion3.n();
                                    if (composer6.getApplier() == null) {
                                        ComposablesKt.t();
                                    }
                                    composer6.T();
                                    if (composer6.getInserting()) {
                                        composer6.s7N(function0N);
                                    } else {
                                        composer6.r();
                                    }
                                    Composer composerN = Updater.n(composer6);
                                    Updater.O(composerN, measurePolicyUo, companion3.t());
                                    Updater.O(composerN, compositionLocalMapIk, companion3.O());
                                    Function2 function2Rl = companion3.rl();
                                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                        composerN.o(Integer.valueOf(iN));
                                        composerN.az(Integer.valueOf(iN), function2Rl);
                                    }
                                    Updater.O(composerN, modifierO, companion3.nr());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                    function216.invoke(composer6, 0);
                                    composer6.XQ();
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composer5, 54);
                            composer5.Xw();
                            final Function2 function216 = function212;
                            composer5.eF(-1102010155);
                            ComposableLambda composableLambdaNr2 = function216 != null ? ComposableLambdaKt.nr(907752083, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBarDefaults$InputField$4$2$1
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                    n(composer6, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer6, int i28) {
                                    if ((i28 & 3) == 2 && composer6.xMQ()) {
                                        composer6.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(907752083, i28, -1, "androidx.compose.material3.SearchBarDefaults.InputField.<anonymous>.<anonymous>.<anonymous> (SearchBar.android.kt:555)");
                                    }
                                    Modifier modifierT = OffsetKt.t(Modifier.INSTANCE, Dp.KN(-SearchBar_androidKt.Uo), 0.0f, 2, null);
                                    Function2 function217 = function216;
                                    MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                                    int iN = ComposablesKt.n(composer6, 0);
                                    CompositionLocalMap compositionLocalMapIk = composer6.Ik();
                                    Modifier modifierO = ComposedModifierKt.O(composer6, modifierT);
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0 function0N = companion3.n();
                                    if (composer6.getApplier() == null) {
                                        ComposablesKt.t();
                                    }
                                    composer6.T();
                                    if (composer6.getInserting()) {
                                        composer6.s7N(function0N);
                                    } else {
                                        composer6.r();
                                    }
                                    Composer composerN = Updater.n(composer6);
                                    Updater.O(composerN, measurePolicyUo, companion3.t());
                                    Updater.O(composerN, compositionLocalMapIk, companion3.O());
                                    Function2 function2Rl = companion3.rl();
                                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                        composerN.o(Integer.valueOf(iN));
                                        composerN.az(Integer.valueOf(iN), function2Rl);
                                    }
                                    Updater.O(composerN, modifierO, companion3.nr());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                    function217.invoke(composer6, 0);
                                    composer6.XQ();
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composer5, 54) : null;
                            composer5.Xw();
                            textFieldDefaults.t(str2, function213, z12, true, visualTransformationT, mutableInteractionSource6, false, null, function214, composableLambdaNr, composableLambdaNr2, null, null, null, SearchBarDefaults.f27243n.J2(composer5, 6), textFieldColors3, TextFieldDefaults.xMQ(textFieldDefaults, 0.0f, 0.0f, 0.0f, 0.0f, 15, null), ComposableSingletons$SearchBar_androidKt.f25102n.n(), composer5, ((i27 << 3) & 112) | 27648, 113246208, 14528);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                        }
                    }, composer2, 54), composer4, i23 | (i24 & 7168), 196608, 7696);
                    composer3 = composer4;
                    z9 = z2 && zBooleanValue;
                    Boolean boolValueOf = Boolean.valueOf(z2);
                    zN = composer3.n(z9) | composer3.E2(focusManager);
                    objIF5 = composer3.iF();
                    if (!zN || objIF5 == companion.n()) {
                        objIF5 = new SearchBarDefaults$InputField$5$1(z9, focusManager, null);
                        composer3.o(objIF5);
                    }
                    EffectsKt.O(boolValueOf, (Function2) objIF5, composer3, i24 & 14);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    z10 = z11;
                    mutableInteractionSource4 = mutableInteractionSource2;
                    textFieldColors2 = textFieldColors3;
                    function28 = function211;
                    modifier3 = modifier4;
                    function25 = function210;
                    function29 = function212;
                }
                scopeUpdateScopeGh = composer3.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBarDefaults$InputField$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                            n(composer5, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer5, int i25) {
                            this.f27271n.n(str, function1, function12, z2, function13, modifier3, z10, function28, function25, function29, textFieldColors2, mutableInteractionSource4, composer5, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
                        }
                    });
                    return;
                }
                return;
            }
            i15 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            searchBarDefaults = this;
            if ((i9 & 306783379) == 306783378) {
                composerKN.e();
                if ((i2 & 1) != 0) {
                    if (i12 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i19 != 0) {
                    }
                    if (i20 != 0) {
                    }
                    if (i11 == 0) {
                    }
                    if ((1024 & i5) == 0) {
                    }
                    if (i14 == 0) {
                    }
                    composer2.S();
                    if (ComposerKt.v()) {
                    }
                    composer2.eF(-320443616);
                    if (mutableInteractionSource2 != null) {
                    }
                    composer2.Xw();
                    boolean zBooleanValue2 = ((Boolean) FocusInteractionKt.n(mutableInteractionSource3, composer2, 0).getValue()).booleanValue();
                    objIF = composer2.iF();
                    companion = Composer.INSTANCE;
                    final MutableInteractionSource mutableInteractionSource52 = mutableInteractionSource3;
                    if (objIF == companion.n()) {
                    }
                    focusRequester = (FocusRequester) objIF;
                    focusManager = (FocusManager) composer2.ty(CompositionLocalsKt.Uo());
                    Strings.Companion companion22 = Strings.INSTANCE;
                    strN = Strings_androidKt.n(Strings.n(R.string.bzg), composer2, 0);
                    final Function2 function2102 = function25;
                    strN2 = Strings_androidKt.n(Strings.n(R.string.jB), composer2, 0);
                    jKN = ((TextStyle) composer2.ty(TextKt.J2())).KN();
                    if (jKN == 16) {
                    }
                    long j22 = jKN;
                    Modifier modifier42 = modifier2;
                    Modifier modifierN3 = FocusRequesterModifierKt.n(SizeKt.aYN(modifier42, SearchBar_androidKt.g(), InputFieldHeight, SearchBar_androidKt.f27276O, 0.0f, 8, null), focusRequester);
                    if ((i9 & 57344) != 16384) {
                    }
                    objIF2 = composer2.iF();
                    if (!z6) {
                        objIF2 = new Function1<FocusState, Unit>() { // from class: androidx.compose.material3.SearchBarDefaults$InputField$1$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
                                n(focusState);
                                return Unit.INSTANCE;
                            }

                            public final void n(FocusState focusState) {
                                if (focusState.n()) {
                                    function13.invoke(Boolean.TRUE);
                                }
                            }
                        };
                        composer2.o(objIF2);
                        Modifier modifierN22 = FocusChangedModifierKt.n(modifierN3, (Function1) objIF2);
                        zP5 = ((i9 & 7168) != 2048 ? z4 : false) | composer2.p5(strN) | composer2.p5(strN2);
                        objIF3 = composer2.iF();
                        if (!zP5) {
                            objIF3 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SearchBarDefaults$InputField$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    n(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    SemanticsPropertiesKt.I(semanticsPropertyReceiver, strN);
                                    if (z2) {
                                        SemanticsPropertiesKt.ul(semanticsPropertyReceiver, strN2);
                                    }
                                    final FocusRequester focusRequester2 = focusRequester;
                                    SemanticsPropertiesKt.te(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material3.SearchBarDefaults$InputField$2$1.1
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                        public final Boolean invoke() {
                                            focusRequester2.J2();
                                            return Boolean.TRUE;
                                        }
                                    }, 1, null);
                                }
                            };
                            composer2.o(objIF3);
                            Modifier modifierNr2 = SemanticsModifierKt.nr(modifierN22, false, (Function1) objIF3, z4 ? 1 : 0, null);
                            TextStyle textStyleNHg2 = ((TextStyle) composer2.ty(TextKt.J2())).nHg(new TextStyle(j22, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null));
                            SolidColor solidColor2 = new SolidColor(textFieldColorsMUb.t(false), null);
                            KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.INSTANCE.Uo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, (DefaultConstructorMarker) null);
                            int i222 = i9 & 14;
                            z7 = ((i9 & 896) != 256) | (i222 != i10);
                            objIF4 = composer2.iF();
                            if (!z7) {
                                objIF4 = new Function1<KeyboardActionScope, Unit>() { // from class: androidx.compose.material3.SearchBarDefaults$InputField$3$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(KeyboardActionScope keyboardActionScope) {
                                        n(keyboardActionScope);
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(KeyboardActionScope keyboardActionScope) {
                                        function12.invoke(str);
                                    }
                                };
                                composer2.o(objIF4);
                                final TextFieldColors textFieldColors32 = textFieldColorsMUb;
                                final boolean z112 = z5;
                                final Function2 function2112 = function24;
                                final Function2 function2122 = function27;
                                int i232 = 102236160 | i222 | (i9 & 112);
                                int i242 = i9 >> 9;
                                Composer composer42 = composer2;
                                BasicTextFieldKt.O(str, function1, modifierNr2, z112, false, textStyleNHg2, keyboardOptions2, new KeyboardActions(null, null, null, null, (Function1) objIF4, null, 47, null), true, 0, 0, null, null, mutableInteractionSource52, solidColor2, ComposableLambdaKt.nr(-2029278807, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBarDefaults$InputField$4
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function213, Composer composer5, Integer num) {
                                        n(function213, composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Function2 function213, Composer composer5, int i25) {
                                        int i26;
                                        if ((i25 & 6) == 0) {
                                            i26 = i25 | (composer5.E2(function213) ? 4 : 2);
                                        } else {
                                            i26 = i25;
                                        }
                                        if ((i26 & 19) == 18 && composer5.xMQ()) {
                                            composer5.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(-2029278807, i26, -1, "androidx.compose.material3.SearchBarDefaults.InputField.<anonymous> (SearchBar.android.kt:541)");
                                        }
                                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.f28299n;
                                        int i27 = i26;
                                        String str2 = str;
                                        boolean z12 = z112;
                                        VisualTransformation visualTransformationT = VisualTransformation.INSTANCE.t();
                                        MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource52;
                                        Function2 function214 = function2112;
                                        final Function2 function215 = function2102;
                                        composer5.eF(-1102017390);
                                        ComposableLambda composableLambdaNr = function215 == null ? null : ComposableLambdaKt.nr(-1401341985, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBarDefaults$InputField$4$1$1
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                n(composer6, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(Composer composer6, int i28) {
                                                if ((i28 & 3) == 2 && composer6.xMQ()) {
                                                    composer6.wTp();
                                                    return;
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(-1401341985, i28, -1, "androidx.compose.material3.SearchBarDefaults.InputField.<anonymous>.<anonymous>.<anonymous> (SearchBar.android.kt:551)");
                                                }
                                                Modifier modifierT = OffsetKt.t(Modifier.INSTANCE, SearchBar_androidKt.Uo, 0.0f, 2, null);
                                                Function2 function216 = function215;
                                                MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                                                int iN = ComposablesKt.n(composer6, 0);
                                                CompositionLocalMap compositionLocalMapIk = composer6.Ik();
                                                Modifier modifierO = ComposedModifierKt.O(composer6, modifierT);
                                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                                Function0 function0N = companion3.n();
                                                if (composer6.getApplier() == null) {
                                                    ComposablesKt.t();
                                                }
                                                composer6.T();
                                                if (composer6.getInserting()) {
                                                    composer6.s7N(function0N);
                                                } else {
                                                    composer6.r();
                                                }
                                                Composer composerN = Updater.n(composer6);
                                                Updater.O(composerN, measurePolicyUo, companion3.t());
                                                Updater.O(composerN, compositionLocalMapIk, companion3.O());
                                                Function2 function2Rl = companion3.rl();
                                                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                                    composerN.o(Integer.valueOf(iN));
                                                    composerN.az(Integer.valueOf(iN), function2Rl);
                                                }
                                                Updater.O(composerN, modifierO, companion3.nr());
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                                function216.invoke(composer6, 0);
                                                composer6.XQ();
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composer5, 54);
                                        composer5.Xw();
                                        final Function2 function216 = function2122;
                                        composer5.eF(-1102010155);
                                        ComposableLambda composableLambdaNr2 = function216 != null ? ComposableLambdaKt.nr(907752083, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBarDefaults$InputField$4$2$1
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                n(composer6, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(Composer composer6, int i28) {
                                                if ((i28 & 3) == 2 && composer6.xMQ()) {
                                                    composer6.wTp();
                                                    return;
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(907752083, i28, -1, "androidx.compose.material3.SearchBarDefaults.InputField.<anonymous>.<anonymous>.<anonymous> (SearchBar.android.kt:555)");
                                                }
                                                Modifier modifierT = OffsetKt.t(Modifier.INSTANCE, Dp.KN(-SearchBar_androidKt.Uo), 0.0f, 2, null);
                                                Function2 function217 = function216;
                                                MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                                                int iN = ComposablesKt.n(composer6, 0);
                                                CompositionLocalMap compositionLocalMapIk = composer6.Ik();
                                                Modifier modifierO = ComposedModifierKt.O(composer6, modifierT);
                                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                                Function0 function0N = companion3.n();
                                                if (composer6.getApplier() == null) {
                                                    ComposablesKt.t();
                                                }
                                                composer6.T();
                                                if (composer6.getInserting()) {
                                                    composer6.s7N(function0N);
                                                } else {
                                                    composer6.r();
                                                }
                                                Composer composerN = Updater.n(composer6);
                                                Updater.O(composerN, measurePolicyUo, companion3.t());
                                                Updater.O(composerN, compositionLocalMapIk, companion3.O());
                                                Function2 function2Rl = companion3.rl();
                                                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                                    composerN.o(Integer.valueOf(iN));
                                                    composerN.az(Integer.valueOf(iN), function2Rl);
                                                }
                                                Updater.O(composerN, modifierO, companion3.nr());
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                                function217.invoke(composer6, 0);
                                                composer6.XQ();
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composer5, 54) : null;
                                        composer5.Xw();
                                        textFieldDefaults.t(str2, function213, z12, true, visualTransformationT, mutableInteractionSource6, false, null, function214, composableLambdaNr, composableLambdaNr2, null, null, null, SearchBarDefaults.f27243n.J2(composer5, 6), textFieldColors32, TextFieldDefaults.xMQ(textFieldDefaults, 0.0f, 0.0f, 0.0f, 0.0f, 15, null), ComposableSingletons$SearchBar_androidKt.f25102n.n(), composer5, ((i27 << 3) & 112) | 27648, 113246208, 14528);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composer2, 54), composer42, i232 | (i242 & 7168), 196608, 7696);
                                composer3 = composer42;
                                if (z2) {
                                    Boolean boolValueOf2 = Boolean.valueOf(z2);
                                    zN = composer3.n(z9) | composer3.E2(focusManager);
                                    objIF5 = composer3.iF();
                                    if (!zN) {
                                        objIF5 = new SearchBarDefaults$InputField$5$1(z9, focusManager, null);
                                        composer3.o(objIF5);
                                        EffectsKt.O(boolValueOf2, (Function2) objIF5, composer3, i242 & 14);
                                        if (ComposerKt.v()) {
                                        }
                                        z10 = z112;
                                        mutableInteractionSource4 = mutableInteractionSource2;
                                        textFieldColors2 = textFieldColors32;
                                        function28 = function2112;
                                        modifier3 = modifier42;
                                        function25 = function2102;
                                        function29 = function2122;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            scopeUpdateScopeGh = composer3.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        i11 = i21;
        if ((i3 & 6) != 0) {
        }
        i14 = i5 & 2048;
        if (i14 == 0) {
        }
        if ((i5 & 4096) != 0) {
        }
        searchBarDefaults = this;
        if ((i9 & 306783379) == 306783378) {
        }
        scopeUpdateScopeGh = composer3.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    static {
        ElevationTokens elevationTokens = ElevationTokens.f29511n;
        float fN = elevationTokens.n();
        TonalElevation = fN;
        ShadowElevation = elevationTokens.n();
        Elevation = fN;
        InputFieldHeight = SearchBarTokens.f29853n.rl();
    }

    public final float KN() {
        return TonalElevation;
    }

    public final float O() {
        return InputFieldHeight;
    }

    public final float Uo() {
        return ShadowElevation;
    }

    public final SearchBarColors rl(long j2, long j3, Composer composer, int i2, int i3) {
        long jXMQ = (i3 & 1) != 0 ? ColorSchemeKt.xMQ(SearchBarTokens.f29853n.n(), composer, 6) : j2;
        long jXMQ2 = (i3 & 2) != 0 ? ColorSchemeKt.xMQ(SearchViewTokens.f29856n.n(), composer, 6) : j3;
        if (ComposerKt.v()) {
            ComposerKt.p5(-1507037523, i2, -1, "androidx.compose.material3.SearchBarDefaults.colors (SearchBar.android.kt:378)");
        }
        SearchBarColors searchBarColors = new SearchBarColors(jXMQ, jXMQ2, mUb(0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, 0, (i2 << 6) & 57344, 16383), null);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return searchBarColors;
    }

    private SearchBarDefaults() {
    }

    public final Shape J2(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-971556142, i2, -1, "androidx.compose.material3.SearchBarDefaults.<get-inputFieldShape> (SearchBar.android.kt:349)");
        }
        Shape shapeO = ShapesKt.O(SearchBarTokens.f29853n.t(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return shapeO;
    }

    public final Shape nr(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(1665502056, i2, -1, "androidx.compose.material3.SearchBarDefaults.<get-fullScreenShape> (SearchBar.android.kt:353)");
        }
        Shape shapeO = ShapesKt.O(SearchViewTokens.f29856n.t(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return shapeO;
    }

    public final Shape t(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(1006952150, i2, -1, "androidx.compose.material3.SearchBarDefaults.<get-dockedShape> (SearchBar.android.kt:357)");
        }
        Shape shapeO = ShapesKt.O(SearchViewTokens.f29856n.rl(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return shapeO;
    }

    public final WindowInsets xMQ(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(2112270157, i2, -1, "androidx.compose.material3.SearchBarDefaults.<get-windowInsets> (SearchBar.android.kt:361)");
        }
        WindowInsets windowInsetsT = WindowInsets_androidKt.t(WindowInsets.INSTANCE, composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return windowInsetsT;
    }
}
