package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0003\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0002\u001a\u0011\u0010\u0005\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0002\u001a\u0011\u0010\u0006\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0002¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/Modifier;", "O", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", c.f62177j, "nr", "rl", "t", "foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWindowInsetsPadding.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,247:1\n240#1,7:249\n240#1,7:257\n240#1,7:265\n240#1,7:273\n240#1,7:281\n240#1,7:289\n240#1,7:297\n240#1,7:305\n240#1,7:313\n240#1,7:321\n240#1,7:329\n240#1,7:337\n110#2:248\n110#2:256\n110#2:264\n110#2:272\n110#2:280\n110#2:288\n110#2:296\n110#2:304\n110#2:312\n110#2:320\n110#2:328\n110#2:336\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n41#1:249,7\n58#1:257,7\n75#1:265,7\n92#1:273,7\n109#1:281,7\n126#1:289,7\n143#1:297,7\n160#1:305,7\n177#1:313,7\n194#1:321,7\n211#1:329,7\n230#1:337,7\n41#1:248\n58#1:256\n75#1:264\n92#1:272\n109#1:280\n126#1:288\n143#1:296\n160#1:304\n177#1:312\n194#1:320\n211#1:328\n230#1:336\n*E\n"})
public final class WindowInsetsPadding_androidKt {
    public static final Modifier O(Modifier modifier) {
        Function1<InspectorInfo, Unit> function1N;
        if (InspectableValueKt.rl()) {
            function1N = new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$systemBarsPadding$$inlined$debugInspectorInfo$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                    n(inspectorInfo);
                    return Unit.INSTANCE;
                }

                public final void n(InspectorInfo inspectorInfo) {
                    inspectorInfo.rl("systemBarsPadding");
                }
            };
        } else {
            function1N = InspectableValueKt.n();
        }
        return ComposedModifierKt.rl(modifier, function1N, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$systemBarsPadding$$inlined$windowInsetsPadding$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return n(modifier2, composer, num.intValue());
            }

            public final Modifier n(Modifier modifier2, Composer composer, int i2) {
                composer.eF(359872873);
                if (ComposerKt.v()) {
                    ComposerKt.p5(359872873, i2, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:240)");
                }
                WindowInsetsHolder windowInsetsHolderT = WindowInsetsHolder.aYN.t(composer, 6);
                boolean zP5 = composer.p5(windowInsetsHolderT);
                Object objIF = composer.iF();
                if (zP5 || objIF == Composer.INSTANCE.n()) {
                    objIF = new InsetsPaddingModifier(windowInsetsHolderT.az());
                    composer.o(objIF);
                }
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objIF;
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                composer.Xw();
                return insetsPaddingModifier;
            }
        });
    }

    public static final Modifier n(Modifier modifier) {
        Function1<InspectorInfo, Unit> function1N;
        if (InspectableValueKt.rl()) {
            function1N = new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$displayCutoutPadding$$inlined$debugInspectorInfo$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                    n(inspectorInfo);
                    return Unit.INSTANCE;
                }

                public final void n(InspectorInfo inspectorInfo) {
                    inspectorInfo.rl("displayCutoutPadding");
                }
            };
        } else {
            function1N = InspectableValueKt.n();
        }
        return ComposedModifierKt.rl(modifier, function1N, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$displayCutoutPadding$$inlined$windowInsetsPadding$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return n(modifier2, composer, num.intValue());
            }

            public final Modifier n(Modifier modifier2, Composer composer, int i2) {
                composer.eF(359872873);
                if (ComposerKt.v()) {
                    ComposerKt.p5(359872873, i2, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:240)");
                }
                WindowInsetsHolder windowInsetsHolderT = WindowInsetsHolder.aYN.t(composer, 6);
                boolean zP5 = composer.p5(windowInsetsHolderT);
                Object objIF = composer.iF();
                if (zP5 || objIF == Composer.INSTANCE.n()) {
                    objIF = new InsetsPaddingModifier(windowInsetsHolderT.O());
                    composer.o(objIF);
                }
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objIF;
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                composer.Xw();
                return insetsPaddingModifier;
            }
        });
    }

    public static final Modifier nr(Modifier modifier) {
        Function1<InspectorInfo, Unit> function1N;
        if (InspectableValueKt.rl()) {
            function1N = new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$debugInspectorInfo$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                    n(inspectorInfo);
                    return Unit.INSTANCE;
                }

                public final void n(InspectorInfo inspectorInfo) {
                    inspectorInfo.rl("statusBarsPadding");
                }
            };
        } else {
            function1N = InspectableValueKt.n();
        }
        return ComposedModifierKt.rl(modifier, function1N, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return n(modifier2, composer, num.intValue());
            }

            public final Modifier n(Modifier modifier2, Composer composer, int i2) {
                composer.eF(359872873);
                if (ComposerKt.v()) {
                    ComposerKt.p5(359872873, i2, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:240)");
                }
                WindowInsetsHolder windowInsetsHolderT = WindowInsetsHolder.aYN.t(composer, 6);
                boolean zP5 = composer.p5(windowInsetsHolderT);
                Object objIF = composer.iF();
                if (zP5 || objIF == Composer.INSTANCE.n()) {
                    objIF = new InsetsPaddingModifier(windowInsetsHolderT.qie());
                    composer.o(objIF);
                }
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objIF;
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                composer.Xw();
                return insetsPaddingModifier;
            }
        });
    }

    public static final Modifier rl(Modifier modifier) {
        Function1<InspectorInfo, Unit> function1N;
        if (InspectableValueKt.rl()) {
            function1N = new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$imePadding$$inlined$debugInspectorInfo$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                    n(inspectorInfo);
                    return Unit.INSTANCE;
                }

                public final void n(InspectorInfo inspectorInfo) {
                    inspectorInfo.rl("imePadding");
                }
            };
        } else {
            function1N = InspectableValueKt.n();
        }
        return ComposedModifierKt.rl(modifier, function1N, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$imePadding$$inlined$windowInsetsPadding$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return n(modifier2, composer, num.intValue());
            }

            public final Modifier n(Modifier modifier2, Composer composer, int i2) {
                composer.eF(359872873);
                if (ComposerKt.v()) {
                    ComposerKt.p5(359872873, i2, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:240)");
                }
                WindowInsetsHolder windowInsetsHolderT = WindowInsetsHolder.aYN.t(composer, 6);
                boolean zP5 = composer.p5(windowInsetsHolderT);
                Object objIF = composer.iF();
                if (zP5 || objIF == Composer.INSTANCE.n()) {
                    objIF = new InsetsPaddingModifier(windowInsetsHolderT.J2());
                    composer.o(objIF);
                }
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objIF;
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                composer.Xw();
                return insetsPaddingModifier;
            }
        });
    }

    public static final Modifier t(Modifier modifier) {
        Function1<InspectorInfo, Unit> function1N;
        if (InspectableValueKt.rl()) {
            function1N = new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$navigationBarsPadding$$inlined$debugInspectorInfo$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                    n(inspectorInfo);
                    return Unit.INSTANCE;
                }

                public final void n(InspectorInfo inspectorInfo) {
                    inspectorInfo.rl("navigationBarsPadding");
                }
            };
        } else {
            function1N = InspectableValueKt.n();
        }
        return ComposedModifierKt.rl(modifier, function1N, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$navigationBarsPadding$$inlined$windowInsetsPadding$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return n(modifier2, composer, num.intValue());
            }

            public final Modifier n(Modifier modifier2, Composer composer, int i2) {
                composer.eF(359872873);
                if (ComposerKt.v()) {
                    ComposerKt.p5(359872873, i2, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:240)");
                }
                WindowInsetsHolder windowInsetsHolderT = WindowInsetsHolder.aYN.t(composer, 6);
                boolean zP5 = composer.p5(windowInsetsHolderT);
                Object objIF = composer.iF();
                if (zP5 || objIF == Composer.INSTANCE.n()) {
                    objIF = new InsetsPaddingModifier(windowInsetsHolderT.KN());
                    composer.o(objIF);
                }
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objIF;
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                composer.Xw();
                return insetsPaddingModifier;
            }
        });
    }
}
