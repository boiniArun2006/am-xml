package androidx.compose.ui.platform;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillManager;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a2\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u001f\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"(\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\u0013\"&\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0011\u0012\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001c\u0010\u0013\"\u001f\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u000f8\u0006¢\u0006\f\n\u0004\b \u0010\u0011\u001a\u0004\b!\u0010\u0013\"&\u0010'\u001a\b\u0012\u0004\u0012\u00020#0\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010\u0011\u0012\u0004\b&\u0010\u0019\u001a\u0004\b%\u0010\u0013\"\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020(0\u000f8\u0006¢\u0006\f\n\u0004\b)\u0010\u0011\u001a\u0004\b \u0010\u0013\"\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020+0\u000f8\u0006¢\u0006\f\n\u0004\b,\u0010\u0011\u001a\u0004\b-\u0010\u0013\"\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020/0\u000f8\u0006¢\u0006\f\n\u0004\b0\u0010\u0011\u001a\u0004\b)\u0010\u0013\"\u001d\u00104\u001a\b\u0012\u0004\u0012\u0002020\u000f8\u0006¢\u0006\f\n\u0004\b3\u0010\u0011\u001a\u0004\b,\u0010\u0013\"&\u00107\u001a\b\u0012\u0004\u0012\u0002050\u000f8GX\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010\u0011\u0012\u0004\b6\u0010\u0019\u001a\u0004\b3\u0010\u0013\"\u001d\u0010:\u001a\b\u0012\u0004\u0012\u0002080\u000f8\u0006¢\u0006\f\n\u0004\b9\u0010\u0011\u001a\u0004\b0\u0010\u0013\"\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020;0\u000f8\u0006¢\u0006\f\n\u0004\b<\u0010\u0011\u001a\u0004\b9\u0010\u0013\"\u001d\u0010@\u001a\b\u0012\u0004\u0012\u00020>0\u000f8\u0006¢\u0006\f\n\u0004\b?\u0010\u0011\u001a\u0004\b<\u0010\u0013\"\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00020A0\u000f8\u0006¢\u0006\f\n\u0004\bB\u0010\u0011\u001a\u0004\b?\u0010\u0013\"(\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010D0\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bE\u0010\u0011\u0012\u0004\bG\u0010\u0019\u001a\u0004\bF\u0010\u0013\"\u001f\u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010I0\u000f8\u0006¢\u0006\f\n\u0004\bJ\u0010\u0011\u001a\u0004\bK\u0010\u0013\"\u001d\u0010O\u001a\b\u0012\u0004\u0012\u00020M0\u000f8\u0006¢\u0006\f\n\u0004\bK\u0010\u0011\u001a\u0004\bN\u0010\u0013\"\u001d\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0006¢\u0006\f\n\u0004\bF\u0010\u0011\u001a\u0004\bP\u0010\u0013\"\u001d\u0010T\u001a\b\u0012\u0004\u0012\u00020R0\u000f8\u0006¢\u0006\f\n\u0004\bN\u0010\u0011\u001a\u0004\bS\u0010\u0013\"\u001d\u0010W\u001a\b\u0012\u0004\u0012\u00020U0\u000f8\u0006¢\u0006\f\n\u0004\bP\u0010\u0011\u001a\u0004\bV\u0010\u0013\"\"\u0010Y\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010X0\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bS\u0010\u0011\u001a\u0004\bB\u0010\u0013\" \u0010[\u001a\b\u0012\u0004\u0012\u00020Z0\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bV\u0010\u0011\u001a\u0004\bE\u0010\u0013\"\u001d\u0010\\\u001a\b\u0012\u0004\u0012\u00020Z0\u000f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b$\u0010\u0013\"\u0017\u0010_\u001a\b\u0012\u0004\u0012\u00020Z0]8F¢\u0006\u0006\u001a\u0004\bJ\u0010^¨\u0006`"}, d2 = {"Landroidx/compose/ui/node/Owner;", "owner", "Landroidx/compose/ui/platform/UriHandler;", "uriHandler", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", AppLovinEventTypes.USER_VIEWED_CONTENT, com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroidx/compose/ui/node/Owner;Landroidx/compose/ui/platform/UriHandler;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "WPU", "(Ljava/lang/String;)Ljava/lang/Void;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/platform/AccessibilityManager;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "t", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalAccessibilityManager", "Landroidx/compose/ui/autofill/Autofill;", "rl", "getLocalAutofill", "getLocalAutofill$annotations", "()V", "LocalAutofill", "Landroidx/compose/ui/autofill/AutofillTree;", "getLocalAutofillTree", "getLocalAutofillTree$annotations", "LocalAutofillTree", "Landroidx/compose/ui/autofill/AutofillManager;", "nr", "getLocalAutofillManager", "LocalAutofillManager", "Landroidx/compose/ui/platform/ClipboardManager;", "O", "getLocalClipboardManager", "getLocalClipboardManager$annotations", "LocalClipboardManager", "Landroidx/compose/ui/platform/Clipboard;", "J2", "LocalClipboard", "Landroidx/compose/ui/graphics/GraphicsContext;", "Uo", "mUb", "LocalGraphicsContext", "Landroidx/compose/ui/unit/Density;", "KN", "LocalDensity", "Landroidx/compose/ui/focus/FocusManager;", "xMQ", "LocalFocusManager", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getLocalFontLoader$annotations", "LocalFontLoader", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "gh", "LocalFontFamilyResolver", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "qie", "LocalHapticFeedback", "Landroidx/compose/ui/input/InputModeManager;", "az", "LocalInputModeManager", "Landroidx/compose/ui/unit/LayoutDirection;", "ty", "LocalLayoutDirection", "Landroidx/compose/ui/text/input/TextInputService;", "HI", "r", "getLocalTextInputService$annotations", "LocalTextInputService", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "ck", "Ik", "LocalSoftwareKeyboardController", "Landroidx/compose/ui/platform/TextToolbar;", "o", "LocalTextToolbar", "Z", "LocalUriHandler", "Landroidx/compose/ui/platform/ViewConfiguration;", "XQ", "LocalViewConfiguration", "Landroidx/compose/ui/platform/WindowInfo;", "S", "LocalWindowInfo", "Landroidx/compose/ui/input/pointer/PointerIconService;", "LocalPointerIconService", "", "LocalProvidableScrollCaptureInProgress", "LocalCursorBlinkEnabled", "Landroidx/compose/runtime/CompositionLocal;", "()Landroidx/compose/runtime/CompositionLocal;", "LocalScrollCaptureInProgress", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CompositionLocalsKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ProvidableCompositionLocal f32901n = CompositionLocalKt.Uo(new Function0<AccessibilityManager>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalAccessibilityManager$1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final AccessibilityManager invoke() {
            return null;
        }
    });
    private static final ProvidableCompositionLocal rl = CompositionLocalKt.Uo(new Function0<Autofill>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalAutofill$1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Autofill invoke() {
            return null;
        }
    });

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final ProvidableCompositionLocal f32904t = CompositionLocalKt.Uo(new Function0<AutofillTree>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalAutofillTree$1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final AutofillTree invoke() {
            CompositionLocalsKt.WPU("LocalAutofillTree");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal nr = CompositionLocalKt.Uo(new Function0<AutofillManager>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalAutofillManager$1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final AutofillManager invoke() {
            CompositionLocalsKt.WPU("LocalAutofillManager");
            throw new KotlinNothingValueException();
        }
    });

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final ProvidableCompositionLocal f32898O = CompositionLocalKt.Uo(new Function0<ClipboardManager>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalClipboardManager$1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ClipboardManager invoke() {
            CompositionLocalsKt.WPU("LocalClipboardManager");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal J2 = CompositionLocalKt.Uo(new Function0<Clipboard>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalClipboard$1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Clipboard invoke() {
            CompositionLocalsKt.WPU("LocalClipboard");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal Uo = CompositionLocalKt.Uo(new Function0<GraphicsContext>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalGraphicsContext$1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final GraphicsContext invoke() {
            CompositionLocalsKt.WPU("LocalGraphicsContext");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal KN = CompositionLocalKt.Uo(new Function0<Density>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalDensity$1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Density invoke() {
            CompositionLocalsKt.WPU("LocalDensity");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal xMQ = CompositionLocalKt.Uo(new Function0<FocusManager>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalFocusManager$1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final FocusManager invoke() {
            CompositionLocalsKt.WPU("LocalFocusManager");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal mUb = CompositionLocalKt.Uo(new Function0<Font.ResourceLoader>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalFontLoader$1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Font.ResourceLoader invoke() {
            CompositionLocalsKt.WPU("LocalFontLoader");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal gh = CompositionLocalKt.Uo(new Function0<FontFamily.Resolver>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalFontFamilyResolver$1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final FontFamily.Resolver invoke() {
            CompositionLocalsKt.WPU("LocalFontFamilyResolver");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal qie = CompositionLocalKt.Uo(new Function0<HapticFeedback>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalHapticFeedback$1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final HapticFeedback invoke() {
            CompositionLocalsKt.WPU("LocalHapticFeedback");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal az = CompositionLocalKt.Uo(new Function0<InputModeManager>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalInputModeManager$1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final InputModeManager invoke() {
            CompositionLocalsKt.WPU("LocalInputManager");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal ty = CompositionLocalKt.Uo(new Function0<LayoutDirection>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalLayoutDirection$1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final LayoutDirection invoke() {
            CompositionLocalsKt.WPU("LocalLayoutDirection");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal HI = CompositionLocalKt.Uo(new Function0<TextInputService>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalTextInputService$1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final TextInputService invoke() {
            return null;
        }
    });
    private static final ProvidableCompositionLocal ck = CompositionLocalKt.Uo(new Function0<SoftwareKeyboardController>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalSoftwareKeyboardController$1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final SoftwareKeyboardController invoke() {
            return null;
        }
    });
    private static final ProvidableCompositionLocal Ik = CompositionLocalKt.Uo(new Function0<TextToolbar>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalTextToolbar$1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final TextToolbar invoke() {
            CompositionLocalsKt.WPU("LocalTextToolbar");
            throw new KotlinNothingValueException();
        }
    });

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final ProvidableCompositionLocal f32903r = CompositionLocalKt.Uo(new Function0<UriHandler>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalUriHandler$1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final UriHandler invoke() {
            CompositionLocalsKt.WPU("LocalUriHandler");
            throw new KotlinNothingValueException();
        }
    });

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final ProvidableCompositionLocal f32902o = CompositionLocalKt.Uo(new Function0<ViewConfiguration>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalViewConfiguration$1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewConfiguration invoke() {
            CompositionLocalsKt.WPU("LocalViewConfiguration");
            throw new KotlinNothingValueException();
        }
    });

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final ProvidableCompositionLocal f32900Z = CompositionLocalKt.Uo(new Function0<WindowInfo>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalWindowInfo$1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final WindowInfo invoke() {
            CompositionLocalsKt.WPU("LocalWindowInfo");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal XQ = CompositionLocalKt.Uo(new Function0<PointerIconService>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalPointerIconService$1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final PointerIconService invoke() {
            return null;
        }
    });

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final ProvidableCompositionLocal f32899S = CompositionLocalKt.O(null, new Function0<Boolean>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalProvidableScrollCaptureInProgress$1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }, 1, null);
    private static final ProvidableCompositionLocal WPU = CompositionLocalKt.Uo(new Function0<Boolean>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalCursorBlinkEnabled$1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    });

    public static final ProvidableCompositionLocal HI() {
        return f32899S;
    }

    public static final ProvidableCompositionLocal Ik() {
        return ck;
    }

    public static final ProvidableCompositionLocal J2() {
        return KN;
    }

    public static final ProvidableCompositionLocal KN() {
        return gh;
    }

    public static final ProvidableCompositionLocal O() {
        return WPU;
    }

    public static final ProvidableCompositionLocal S() {
        return f32900Z;
    }

    public static final ProvidableCompositionLocal Uo() {
        return xMQ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void WPU(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final ProvidableCompositionLocal XQ() {
        return f32902o;
    }

    public static final ProvidableCompositionLocal Z() {
        return f32903r;
    }

    public static final ProvidableCompositionLocal az() {
        return ty;
    }

    public static final CompositionLocal ck() {
        return f32899S;
    }

    public static final ProvidableCompositionLocal gh() {
        return qie;
    }

    public static final ProvidableCompositionLocal mUb() {
        return Uo;
    }

    public static final void n(final Owner owner, final UriHandler uriHandler, final Function2 function2, Composer composer, final int i2) {
        int i3;
        Composer composerKN = composer.KN(874662829);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? composerKN.p5(owner) : composerKN.E2(owner) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? composerKN.p5(uriHandler) : composerKN.E2(uriHandler) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(function2) ? 256 : 128;
        }
        if (composerKN.HI((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(874662829, i3, -1, "androidx.compose.ui.platform.ProvideCommonCompositionLocals (CompositionLocals.kt:214)");
            }
            CompositionLocalKt.t(new ProvidedValue[]{f32901n.nr(owner.getAccessibilityManager()), rl.nr(owner.getAutofill()), nr.nr(owner.getAutofillManager()), f32904t.nr(owner.getAutofillTree()), f32898O.nr(owner.getClipboardManager()), J2.nr(owner.getClipboard()), KN.nr(owner.getDensity()), xMQ.nr(owner.getFocusOwner()), mUb.O(owner.getFontLoader()), gh.O(owner.getFontFamilyResolver()), qie.nr(owner.getHapticFeedBack()), az.nr(owner.getInputModeManager()), ty.nr(owner.getLayoutDirection()), HI.nr(owner.getTextInputService()), ck.nr(owner.getSoftwareKeyboardController()), Ik.nr(owner.getTextToolbar()), f32903r.nr(uriHandler), f32902o.nr(owner.getViewConfiguration()), f32900Z.nr(owner.getWindowInfo()), XQ.nr(owner.getPointerIconService()), Uo.nr(owner.getGraphicsContext())}, function2, composerKN, ((i3 >> 3) & 112) | ProvidedValue.xMQ);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$ProvideCommonCompositionLocals$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i5) {
                    CompositionLocalsKt.n(owner, uriHandler, function2, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    public static final ProvidableCompositionLocal nr() {
        return J2;
    }

    public static final ProvidableCompositionLocal o() {
        return Ik;
    }

    public static final ProvidableCompositionLocal qie() {
        return az;
    }

    public static final ProvidableCompositionLocal r() {
        return HI;
    }

    public static final ProvidableCompositionLocal t() {
        return f32901n;
    }

    public static final ProvidableCompositionLocal ty() {
        return XQ;
    }

    public static final ProvidableCompositionLocal xMQ() {
        return mUb;
    }
}
