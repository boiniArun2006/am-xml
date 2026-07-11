package androidx.compose.foundation.layout;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.graphics.Insets;
import androidx.core.view.DisplayCutoutCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 S2\u00020\u0001:\u0001TB\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001b\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u001d\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u0017\u0010 \u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018R\u0017\u0010\"\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b!\u0010\u0018R\u0017\u0010$\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b#\u0010\u0018R\u0017\u0010&\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b%\u0010\u0018R\u0017\u0010(\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b!\u0010\u0016\u001a\u0004\b'\u0010\u0018R\u0017\u0010+\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b)\u0010\u0016\u001a\u0004\b*\u0010\u0018R\u0017\u00101\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u00106\u001a\u0002028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b-\u00105R\u0017\u00107\u001a\u0002028\u0006¢\u0006\f\n\u0004\b#\u00104\u001a\u0004\b3\u00105R\u0017\u00108\u001a\u0002028\u0006¢\u0006\f\n\u0004\b%\u00104\u001a\u0004\b)\u00105R\u0017\u0010:\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b'\u0010.\u001a\u0004\b9\u00100R\u0017\u0010<\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b/\u0010.\u001a\u0004\b;\u00100R\u0017\u0010>\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b=\u00100R\u0017\u0010@\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b?\u00100R\u0017\u0010C\u001a\u00020,8\u0006¢\u0006\f\n\u0004\bA\u0010.\u001a\u0004\bB\u00100R\u0017\u0010E\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b\u0011\u0010.\u001a\u0004\bD\u00100R\u0017\u0010G\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b\u0013\u0010.\u001a\u0004\bF\u00100R\u0017\u0010K\u001a\u00020H8\u0006¢\u0006\f\n\u0004\bI\u0010\u0013\u001a\u0004\b\u001e\u0010JR\u0016\u0010N\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010Q¨\u0006U"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsHolder;", "", "Landroidx/core/view/WindowInsetsCompat;", "insets", "Landroid/view/View;", "view", "<init>", "(Landroidx/core/view/WindowInsetsCompat;Landroid/view/View;)V", "", "ck", "(Landroid/view/View;)V", "rl", "windowInsets", "", "types", "Ik", "(Landroidx/core/view/WindowInsetsCompat;I)V", "o", "(Landroidx/core/view/WindowInsetsCompat;)V", "Z", "Landroidx/compose/foundation/layout/AndroidWindowInsets;", c.f62177j, "Landroidx/compose/foundation/layout/AndroidWindowInsets;", "t", "()Landroidx/compose/foundation/layout/AndroidWindowInsets;", "captionBar", "O", "displayCutout", "J2", "ime", "nr", "Uo", "mandatorySystemGestures", "KN", "navigationBars", "qie", "statusBars", "az", "systemBars", "ty", "systemGestures", "xMQ", "getTappableElement", "tappableElement", "Landroidx/compose/foundation/layout/ValueInsets;", "mUb", "Landroidx/compose/foundation/layout/ValueInsets;", "HI", "()Landroidx/compose/foundation/layout/ValueInsets;", "waterfall", "Landroidx/compose/foundation/layout/WindowInsets;", "gh", "Landroidx/compose/foundation/layout/WindowInsets;", "()Landroidx/compose/foundation/layout/WindowInsets;", "safeDrawing", "safeGestures", "safeContent", "getCaptionBarIgnoringVisibility", "captionBarIgnoringVisibility", "getNavigationBarsIgnoringVisibility", "navigationBarsIgnoringVisibility", "getStatusBarsIgnoringVisibility", "statusBarsIgnoringVisibility", "getSystemBarsIgnoringVisibility", "systemBarsIgnoringVisibility", "r", "getTappableElementIgnoringVisibility", "tappableElementIgnoringVisibility", "getImeAnimationTarget", "imeAnimationTarget", "getImeAnimationSource", "imeAnimationSource", "", "XQ", "()Z", "consumes", "S", "I", "accessCount", "Landroidx/compose/foundation/layout/InsetsListener;", "WPU", "Landroidx/compose/foundation/layout/InsetsListener;", "insetsListener", "aYN", "Companion", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class WindowInsetsHolder {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f17841g;

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private final ValueInsets navigationBarsIgnoringVisibility;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private final ValueInsets systemBarsIgnoringVisibility;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final AndroidWindowInsets statusBars;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final AndroidWindowInsets systemGestures;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final AndroidWindowInsets navigationBars;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private int accessCount;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final AndroidWindowInsets systemBars;

    /* JADX INFO: renamed from: WPU, reason: from kotlin metadata */
    private final InsetsListener insetsListener;

    /* JADX INFO: renamed from: XQ, reason: from kotlin metadata */
    private final boolean consumes;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private final ValueInsets imeAnimationSource;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final WindowInsets safeContent;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private final ValueInsets statusBarsIgnoringVisibility;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final WindowInsets safeDrawing;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final ValueInsets waterfall;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final AndroidWindowInsets captionBar;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final AndroidWindowInsets mandatorySystemGestures;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final ValueInsets imeAnimationTarget;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final WindowInsets safeGestures;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final ValueInsets tappableElementIgnoringVisibility;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final AndroidWindowInsets displayCutout;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final AndroidWindowInsets ime;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private final ValueInsets captionBarIgnoringVisibility;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final AndroidWindowInsets tappableElement;

    /* JADX INFO: renamed from: aYN, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int ViF = 8;
    private static final WeakHashMap nY = new WeakHashMap();

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u0010\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0013\u001a\u00020\u00122\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsHolder$Companion;", "", "<init>", "()V", "Landroid/view/View;", "view", "Landroidx/compose/foundation/layout/WindowInsetsHolder;", "nr", "(Landroid/view/View;)Landroidx/compose/foundation/layout/WindowInsetsHolder;", "Landroidx/core/view/WindowInsetsCompat;", "windowInsets", "", "type", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Landroidx/compose/foundation/layout/AndroidWindowInsets;", "O", "(Landroidx/core/view/WindowInsetsCompat;ILjava/lang/String;)Landroidx/compose/foundation/layout/AndroidWindowInsets;", "Landroidx/compose/foundation/layout/ValueInsets;", "J2", "(Landroidx/core/view/WindowInsetsCompat;ILjava/lang/String;)Landroidx/compose/foundation/layout/ValueInsets;", "t", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsetsHolder;", "", "testInsets", "Z", "Ljava/util/WeakHashMap;", "viewMap", "Ljava/util/WeakHashMap;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nWindowInsets.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,729:1\n75#2:730\n1247#3,6:731\n372#4,7:737\n1#5:744\n*S KotlinDebug\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion\n*L\n580#1:730\n583#1:731,6\n595#1:737,7\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ValueInsets J2(WindowInsetsCompat windowInsets, int type, String name) {
            Insets insetsUo;
            if (windowInsets == null || (insetsUo = windowInsets.Uo(type)) == null) {
                insetsUo = Insets.f36409O;
            }
            return WindowInsets_androidKt.n(insetsUo, name);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final AndroidWindowInsets O(WindowInsetsCompat windowInsets, int type, String name) {
            AndroidWindowInsets androidWindowInsets = new AndroidWindowInsets(type, name);
            if (windowInsets != null) {
                androidWindowInsets.mUb(windowInsets, type);
            }
            return androidWindowInsets;
        }

        private final WindowInsetsHolder nr(View view) {
            WindowInsetsHolder windowInsetsHolder;
            synchronized (WindowInsetsHolder.nY) {
                try {
                    WeakHashMap weakHashMap = WindowInsetsHolder.nY;
                    Object obj = weakHashMap.get(view);
                    Object obj2 = obj;
                    if (obj == null) {
                        WindowInsetsHolder windowInsetsHolder2 = new WindowInsetsHolder(null, view, false ? 1 : 0);
                        weakHashMap.put(view, windowInsetsHolder2);
                        obj2 = windowInsetsHolder2;
                    }
                    windowInsetsHolder = (WindowInsetsHolder) obj2;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return windowInsetsHolder;
        }

        public final WindowInsetsHolder t(Composer composer, int i2) {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1366542614, i2, -1, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:578)");
            }
            final View view = (View) composer.ty(AndroidCompositionLocals_androidKt.gh());
            final WindowInsetsHolder windowInsetsHolderNr = nr(view);
            boolean zE2 = composer.E2(windowInsetsHolderNr) | composer.E2(view);
            Object objIF = composer.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.layout.WindowInsetsHolder$Companion$current$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                        windowInsetsHolderNr.ck(view);
                        final WindowInsetsHolder windowInsetsHolder = windowInsetsHolderNr;
                        final View view2 = view;
                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.layout.WindowInsetsHolder$Companion$current$1$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void n() {
                                windowInsetsHolder.rl(view2);
                            }
                        };
                    }
                };
                composer.o(objIF);
            }
            EffectsKt.rl(windowInsetsHolderNr, (Function1) objIF, composer, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            return windowInsetsHolderNr;
        }
    }

    public /* synthetic */ WindowInsetsHolder(WindowInsetsCompat windowInsetsCompat, View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(windowInsetsCompat, view);
    }

    private WindowInsetsHolder(WindowInsetsCompat windowInsetsCompat, View view) {
        DisplayCutoutCompat displayCutoutCompatO;
        Insets insetsO;
        Companion companion = INSTANCE;
        this.captionBar = companion.O(windowInsetsCompat, WindowInsetsCompat.Type.rl(), "captionBar");
        AndroidWindowInsets androidWindowInsetsO = companion.O(windowInsetsCompat, WindowInsetsCompat.Type.t(), "displayCutout");
        this.displayCutout = androidWindowInsetsO;
        AndroidWindowInsets androidWindowInsetsO2 = companion.O(windowInsetsCompat, WindowInsetsCompat.Type.nr(), "ime");
        this.ime = androidWindowInsetsO2;
        AndroidWindowInsets androidWindowInsetsO3 = companion.O(windowInsetsCompat, WindowInsetsCompat.Type.J2(), "mandatorySystemGestures");
        this.mandatorySystemGestures = androidWindowInsetsO3;
        this.navigationBars = companion.O(windowInsetsCompat, WindowInsetsCompat.Type.Uo(), "navigationBars");
        this.statusBars = companion.O(windowInsetsCompat, WindowInsetsCompat.Type.KN(), "statusBars");
        AndroidWindowInsets androidWindowInsetsO4 = companion.O(windowInsetsCompat, WindowInsetsCompat.Type.xMQ(), "systemBars");
        this.systemBars = androidWindowInsetsO4;
        AndroidWindowInsets androidWindowInsetsO5 = companion.O(windowInsetsCompat, WindowInsetsCompat.Type.mUb(), "systemGestures");
        this.systemGestures = androidWindowInsetsO5;
        AndroidWindowInsets androidWindowInsetsO6 = companion.O(windowInsetsCompat, WindowInsetsCompat.Type.gh(), "tappableElement");
        this.tappableElement = androidWindowInsetsO6;
        ValueInsets valueInsetsN = WindowInsets_androidKt.n((windowInsetsCompat == null || (displayCutoutCompatO = windowInsetsCompat.O()) == null || (insetsO = displayCutoutCompatO.O()) == null) ? Insets.f36409O : insetsO, "waterfall");
        this.waterfall = valueInsetsN;
        WindowInsets windowInsetsXMQ = WindowInsetsKt.xMQ(WindowInsetsKt.xMQ(androidWindowInsetsO4, androidWindowInsetsO2), androidWindowInsetsO);
        this.safeDrawing = windowInsetsXMQ;
        WindowInsets windowInsetsXMQ2 = WindowInsetsKt.xMQ(WindowInsetsKt.xMQ(WindowInsetsKt.xMQ(androidWindowInsetsO6, androidWindowInsetsO3), androidWindowInsetsO5), valueInsetsN);
        this.safeGestures = windowInsetsXMQ2;
        this.safeContent = WindowInsetsKt.xMQ(windowInsetsXMQ, windowInsetsXMQ2);
        this.captionBarIgnoringVisibility = companion.J2(windowInsetsCompat, WindowInsetsCompat.Type.rl(), "captionBarIgnoringVisibility");
        this.navigationBarsIgnoringVisibility = companion.J2(windowInsetsCompat, WindowInsetsCompat.Type.Uo(), "navigationBarsIgnoringVisibility");
        this.statusBarsIgnoringVisibility = companion.J2(windowInsetsCompat, WindowInsetsCompat.Type.KN(), "statusBarsIgnoringVisibility");
        this.systemBarsIgnoringVisibility = companion.J2(windowInsetsCompat, WindowInsetsCompat.Type.xMQ(), "systemBarsIgnoringVisibility");
        this.tappableElementIgnoringVisibility = companion.J2(windowInsetsCompat, WindowInsetsCompat.Type.gh(), "tappableElementIgnoringVisibility");
        this.imeAnimationTarget = companion.J2(windowInsetsCompat, WindowInsetsCompat.Type.nr(), "imeAnimationTarget");
        this.imeAnimationSource = companion.J2(windowInsetsCompat, WindowInsetsCompat.Type.nr(), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(androidx.compose.ui.R.id.f31079N) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.consumes = bool != null ? bool.booleanValue() : true;
        this.insetsListener = new InsetsListener(this);
    }

    public static /* synthetic */ void r(WindowInsetsHolder windowInsetsHolder, WindowInsetsCompat windowInsetsCompat, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        windowInsetsHolder.Ik(windowInsetsCompat, i2);
    }

    /* JADX INFO: renamed from: HI, reason: from getter */
    public final ValueInsets getWaterfall() {
        return this.waterfall;
    }

    public final void Ik(WindowInsetsCompat windowInsets, int types) {
        if (f17841g) {
            android.view.WindowInsets windowInsetsNY = windowInsets.nY();
            Intrinsics.checkNotNull(windowInsetsNY);
            windowInsets = WindowInsetsCompat.g(windowInsetsNY);
        }
        this.captionBar.mUb(windowInsets, types);
        this.ime.mUb(windowInsets, types);
        this.displayCutout.mUb(windowInsets, types);
        this.navigationBars.mUb(windowInsets, types);
        this.statusBars.mUb(windowInsets, types);
        this.systemBars.mUb(windowInsets, types);
        this.systemGestures.mUb(windowInsets, types);
        this.tappableElement.mUb(windowInsets, types);
        this.mandatorySystemGestures.mUb(windowInsets, types);
        if (types == 0) {
            this.captionBarIgnoringVisibility.J2(WindowInsets_androidKt.O(windowInsets.Uo(WindowInsetsCompat.Type.rl())));
            this.navigationBarsIgnoringVisibility.J2(WindowInsets_androidKt.O(windowInsets.Uo(WindowInsetsCompat.Type.Uo())));
            this.statusBarsIgnoringVisibility.J2(WindowInsets_androidKt.O(windowInsets.Uo(WindowInsetsCompat.Type.KN())));
            this.systemBarsIgnoringVisibility.J2(WindowInsets_androidKt.O(windowInsets.Uo(WindowInsetsCompat.Type.xMQ())));
            this.tappableElementIgnoringVisibility.J2(WindowInsets_androidKt.O(windowInsets.Uo(WindowInsetsCompat.Type.gh())));
            DisplayCutoutCompat displayCutoutCompatO = windowInsets.O();
            if (displayCutoutCompatO != null) {
                this.waterfall.J2(WindowInsets_androidKt.O(displayCutoutCompatO.O()));
            }
        }
        Snapshot.INSTANCE.ty();
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final AndroidWindowInsets getIme() {
        return this.ime;
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final AndroidWindowInsets getNavigationBars() {
        return this.navigationBars;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final AndroidWindowInsets getDisplayCutout() {
        return this.displayCutout;
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final AndroidWindowInsets getMandatorySystemGestures() {
        return this.mandatorySystemGestures;
    }

    public final void Z(WindowInsetsCompat windowInsets) {
        this.imeAnimationTarget.J2(WindowInsets_androidKt.O(windowInsets.J2(WindowInsetsCompat.Type.nr())));
    }

    /* JADX INFO: renamed from: az, reason: from getter */
    public final AndroidWindowInsets getSystemBars() {
        return this.systemBars;
    }

    public final void ck(View view) {
        if (this.accessCount == 0) {
            ViewCompat.Org(view, this.insetsListener);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(this.insetsListener);
            ViewCompat.K(view, this.insetsListener);
        }
        this.accessCount++;
    }

    /* JADX INFO: renamed from: gh, reason: from getter */
    public final WindowInsets getSafeGestures() {
        return this.safeGestures;
    }

    /* JADX INFO: renamed from: mUb, reason: from getter */
    public final WindowInsets getSafeDrawing() {
        return this.safeDrawing;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final boolean getConsumes() {
        return this.consumes;
    }

    public final void o(WindowInsetsCompat windowInsets) {
        this.imeAnimationSource.J2(WindowInsets_androidKt.O(windowInsets.J2(WindowInsetsCompat.Type.nr())));
    }

    /* JADX INFO: renamed from: qie, reason: from getter */
    public final AndroidWindowInsets getStatusBars() {
        return this.statusBars;
    }

    public final void rl(View view) {
        int i2 = this.accessCount - 1;
        this.accessCount = i2;
        if (i2 == 0) {
            ViewCompat.Org(view, null);
            ViewCompat.K(view, null);
            view.removeOnAttachStateChangeListener(this.insetsListener);
        }
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final AndroidWindowInsets getCaptionBar() {
        return this.captionBar;
    }

    /* JADX INFO: renamed from: ty, reason: from getter */
    public final AndroidWindowInsets getSystemGestures() {
        return this.systemGestures;
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final WindowInsets getSafeContent() {
        return this.safeContent;
    }
}
