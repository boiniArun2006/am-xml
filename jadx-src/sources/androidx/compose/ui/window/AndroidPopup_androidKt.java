package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aU\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aF\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a*\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00192\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\tH\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u001e\u001a\u00020\u0011*\u00020\u001dH\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001b\u0010!\u001a\u00020\u0016*\u00020\u00072\u0006\u0010 \u001a\u00020\u0011H\u0002¢\u0006\u0004\b!\u0010\"\u001a\u0013\u0010%\u001a\u00020$*\u00020#H\u0002¢\u0006\u0004\b%\u0010&\" \u0010+\u001a\b\u0012\u0004\u0012\u00020\u00190'8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b)\u0010*\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-²\u0006\u0017\u0010,\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\t8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/unit/IntOffset;", "offset", "Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/ui/window/PopupProperties;", "properties", "Landroidx/compose/runtime/Composable;", AppLovinEventTypes.USER_VIEWED_CONTENT, "t", "(Landroidx/compose/ui/Alignment;JLkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/window/PopupPositionProvider;", "popupPositionProvider", c.f62177j, "(Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "", "focusable", "Landroidx/compose/ui/window/SecureFlagPolicy;", "securePolicy", "clippingEnabled", "", "xMQ", "(ZLandroidx/compose/ui/window/SecureFlagPolicy;Z)I", "", "tag", "nr", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroid/view/View;", "gh", "(Landroid/view/View;)Z", "isParentFlagSecureEnabled", "mUb", "(Landroidx/compose/ui/window/PopupProperties;Z)I", "Landroid/graphics/Rect;", "Landroidx/compose/ui/unit/IntRect;", "qie", "(Landroid/graphics/Rect;)Landroidx/compose/ui/unit/IntRect;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalPopupTestTag", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalPopupTestTag", "currentContent", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,957:1\n32#2:958\n80#3:959\n1247#4,6:960\n1247#4,6:970\n1247#4,6:976\n1247#4,6:982\n1247#4,6:988\n1247#4,6:994\n1247#4,6:1000\n1247#4,6:1006\n75#5:966\n75#5:967\n75#5:968\n75#5:969\n79#6,6:1012\n86#6,3:1027\n89#6,2:1036\n93#6:1041\n79#6,6:1042\n86#6,3:1057\n89#6,2:1066\n93#6:1071\n347#7,9:1018\n356#7,3:1038\n347#7,9:1048\n356#7,3:1068\n4206#8,6:1030\n4206#8,6:1060\n85#9:1072\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt\n*L\n123#1:958\n123#1:959\n271#1:960,6\n306#1:970,6\n333#1:976,6\n348#1:982,6\n357#1:988,6\n369#1:994,6\n382#1:1000,6\n390#1:1006,6\n299#1:966\n300#1:967\n301#1:968\n302#1:969\n379#1:1012,6\n379#1:1027,3\n379#1:1036,2\n379#1:1041\n432#1:1042,6\n432#1:1057,3\n432#1:1066,2\n432#1:1071\n379#1:1018,9\n379#1:1038,3\n432#1:1048,9\n432#1:1068,3\n379#1:1030,6\n432#1:1060,6\n304#1:1072\n*E\n"})
public final class AndroidPopup_androidKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ProvidableCompositionLocal f34287n = CompositionLocalKt.O(null, new Function0<String>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$LocalPopupTestTag$1
        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "DEFAULT_TEST_TAG";
        }
    }, 1, null);

    /* JADX WARN: Removed duplicated region for block: B:132:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(PopupPositionProvider popupPositionProvider, Function0 function0, PopupProperties popupProperties, final Function2 function2, Composer composer, final int i2, final int i3) {
        int i5;
        Function0 function02;
        int i7;
        PopupProperties popupProperties2;
        int i8;
        final Function0 function03;
        final PopupProperties popupProperties3;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i9;
        String str;
        final PopupPositionProvider popupPositionProvider2 = popupPositionProvider;
        Composer composerKN = composer.KN(-830247068);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(popupPositionProvider2) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                function02 = function0;
                i5 |= composerKN.E2(function02) ? 32 : 16;
            }
            i7 = i3 & 4;
            if (i7 != 0) {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    popupProperties2 = popupProperties;
                    i5 |= composerKN.p5(popupProperties2) ? 256 : 128;
                }
                if ((i3 & 8) != 0) {
                    i5 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    i5 |= composerKN.E2(function2) ? 2048 : 1024;
                }
                i8 = i5;
                if (composerKN.HI((i8 & 1171) != 1170, i8 & 1)) {
                    final Function0 function04 = i10 != 0 ? null : function02;
                    final PopupProperties popupProperties4 = i7 != 0 ? new PopupProperties(false, false, false, false, 15, (DefaultConstructorMarker) null) : popupProperties2;
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-830247068, i8, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:297)");
                    }
                    View view = (View) composerKN.ty(AndroidCompositionLocals_androidKt.gh());
                    Density density = (Density) composerKN.ty(CompositionLocalsKt.J2());
                    String str2 = (String) composerKN.ty(f34287n);
                    final LayoutDirection layoutDirection = (LayoutDirection) composerKN.ty(CompositionLocalsKt.az());
                    CompositionContext compositionContextNr = ComposablesKt.nr(composerKN, 0);
                    final State stateCk = SnapshotStateKt.ck(function2, composerKN, (i8 >> 9) & 14);
                    UUID uuid = (UUID) RememberSaveableKt.O(new Object[0], null, null, new Function0<UUID>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1
                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                        public final UUID invoke() {
                            return UUID.randomUUID();
                        }
                    }, composerKN, 3072, 6);
                    Object objIF = composerKN.iF();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objIF == companion.n()) {
                        i9 = i8;
                        str = str2;
                        final PopupLayout popupLayout = new PopupLayout(function04, popupProperties4, str, view, density, popupPositionProvider2, uuid, null, 128, null);
                        popupPositionProvider2 = popupPositionProvider2;
                        popupLayout.r(compositionContextNr, ComposableLambdaKt.rl(1302892335, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                n(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer2, int i11) {
                                if (!composer2.HI((i11 & 3) != 2, i11 & 1)) {
                                    composer2.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(1302892335, i11, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:317)");
                                }
                                Modifier modifierNr = SemanticsModifierKt.nr(Modifier.INSTANCE, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        n(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        SemanticsPropertiesKt.U(semanticsPropertyReceiver);
                                    }
                                }, 1, null);
                                boolean zE2 = composer2.E2(popupLayout);
                                final PopupLayout popupLayout2 = popupLayout;
                                Object objIF2 = composer2.iF();
                                if (zE2 || objIF2 == Composer.INSTANCE.n()) {
                                    objIF2 = new Function1<IntSize, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1$2$1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                            n(intSize.getPackedValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(long j2) {
                                            popupLayout2.m9setPopupContentSizefhxjrPA(IntSize.rl(j2));
                                            popupLayout2.ViF();
                                        }
                                    };
                                    composer2.o(objIF2);
                                }
                                Modifier modifierN = AlphaKt.n(OnRemeasuredModifierKt.n(modifierNr, (Function1) objIF2), popupLayout.getCanCalculatePosition() ? 1.0f : 0.0f);
                                Function2 function2Rl = AndroidPopup_androidKt.rl(stateCk);
                                AndroidPopup_androidKt$SimpleStack$1 androidPopup_androidKt$SimpleStack$1 = new MeasurePolicy() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1
                                    @Override // androidx.compose.ui.layout.MeasurePolicy
                                    public final MeasureResult rl(MeasureScope measureScope, List list, long j2) {
                                        int size = list.size();
                                        if (size != 0) {
                                            if (size != 1) {
                                                final ArrayList arrayList = new ArrayList(list.size());
                                                int size2 = list.size();
                                                int iMax = 0;
                                                int iMax2 = 0;
                                                for (int i12 = 0; i12 < size2; i12++) {
                                                    Placeable placeableDR0 = ((Measurable) list.get(i12)).dR0(j2);
                                                    iMax = Math.max(iMax, placeableDR0.getWidth());
                                                    iMax2 = Math.max(iMax2, placeableDR0.getHeight());
                                                    arrayList.add(placeableDR0);
                                                }
                                                return MeasureScope.ER(measureScope, iMax, iMax2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1.3
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                        n(placementScope);
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void n(Placeable.PlacementScope placementScope) {
                                                        int lastIndex = CollectionsKt.getLastIndex(arrayList);
                                                        if (lastIndex < 0) {
                                                            return;
                                                        }
                                                        int i13 = 0;
                                                        while (true) {
                                                            Placeable.PlacementScope placementScope2 = placementScope;
                                                            Placeable.PlacementScope.az(placementScope2, (Placeable) arrayList.get(i13), 0, 0, 0.0f, 4, null);
                                                            if (i13 == lastIndex) {
                                                                return;
                                                            }
                                                            i13++;
                                                            placementScope = placementScope2;
                                                        }
                                                    }
                                                }, 4, null);
                                            }
                                            final Placeable placeableDR02 = ((Measurable) list.get(0)).dR0(j2);
                                            return MeasureScope.ER(measureScope, placeableDR02.getWidth(), placeableDR02.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1.2
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                    n(placementScope);
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(Placeable.PlacementScope placementScope) {
                                                    Placeable.PlacementScope.az(placementScope, placeableDR02, 0, 0, 0.0f, 4, null);
                                                }
                                            }, 4, null);
                                        }
                                        return MeasureScope.ER(measureScope, 0, 0, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1.1
                                            public final void n(Placeable.PlacementScope placementScope) {
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                n(placementScope);
                                                return Unit.INSTANCE;
                                            }
                                        }, 4, null);
                                    }
                                };
                                int iN = ComposablesKt.n(composer2, 0);
                                CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                                Modifier modifierO = ComposedModifierKt.O(composer2, modifierN);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0 function0N = companion2.n();
                                if (composer2.getApplier() == null) {
                                    ComposablesKt.t();
                                }
                                composer2.T();
                                if (composer2.getInserting()) {
                                    composer2.s7N(function0N);
                                } else {
                                    composer2.r();
                                }
                                Composer composerN = Updater.n(composer2);
                                Updater.O(composerN, androidPopup_androidKt$SimpleStack$1, companion2.t());
                                Updater.O(composerN, compositionLocalMapIk, companion2.O());
                                Function2 function2Rl2 = companion2.rl();
                                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                    composerN.o(Integer.valueOf(iN));
                                    composerN.az(Integer.valueOf(iN), function2Rl2);
                                }
                                Updater.O(composerN, modifierO, companion2.nr());
                                function2Rl.invoke(composer2, 0);
                                composer2.XQ();
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }));
                        composerKN = composerKN;
                        composerKN.o(popupLayout);
                        objIF = popupLayout;
                    } else {
                        i9 = i8;
                        str = str2;
                    }
                    final PopupLayout popupLayout2 = (PopupLayout) objIF;
                    int i11 = i9;
                    int i12 = i11 & 112;
                    int i13 = i11 & 896;
                    boolean zE2 = composerKN.E2(popupLayout2) | (i12 == 32) | (i13 == 256) | composerKN.p5(str) | composerKN.p5(layoutDirection);
                    Object objIF2 = composerKN.iF();
                    if (zE2 || objIF2 == companion.n()) {
                        final String str3 = str;
                        objIF2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                popupLayout2.o();
                                popupLayout2.XQ(function04, popupProperties4, str3, layoutDirection);
                                final PopupLayout popupLayout3 = popupLayout2;
                                return new DisposableEffectResult() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void n() {
                                        popupLayout3.J2();
                                        popupLayout3.ty();
                                    }
                                };
                            }
                        };
                        composerKN.o(objIF2);
                    }
                    EffectsKt.rl(popupLayout2, (Function1) objIF2, composerKN, 0);
                    boolean zE22 = composerKN.E2(popupLayout2) | (i12 == 32) | (i13 == 256) | composerKN.p5(str) | composerKN.p5(layoutDirection);
                    Object objIF3 = composerKN.iF();
                    if (zE22 || objIF3 == companion.n()) {
                        final String str4 = str;
                        objIF3 = new Function0<Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                popupLayout2.XQ(function04, popupProperties4, str4, layoutDirection);
                            }
                        };
                        composerKN.o(objIF3);
                    }
                    EffectsKt.KN((Function0) objIF3, composerKN, 0);
                    int i14 = i11 & 14;
                    boolean zE23 = composerKN.E2(popupLayout2) | (i14 == 4);
                    Object objIF4 = composerKN.iF();
                    if (zE23 || objIF4 == companion.n()) {
                        objIF4 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                popupLayout2.setPositionProvider(popupPositionProvider2);
                                popupLayout2.ViF();
                                return new DisposableEffectResult() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1$invoke$$inlined$onDispose$1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void n() {
                                    }
                                };
                            }
                        };
                        composerKN.o(objIF4);
                    }
                    EffectsKt.rl(popupPositionProvider2, (Function1) objIF4, composerKN, i14);
                    boolean zE24 = composerKN.E2(popupLayout2);
                    Object objIF5 = composerKN.iF();
                    if (zE24 || objIF5 == companion.n()) {
                        objIF5 = new AndroidPopup_androidKt$Popup$5$1(popupLayout2, null);
                        composerKN.o(objIF5);
                    }
                    EffectsKt.O(popupLayout2, (Function2) objIF5, composerKN, 0);
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    boolean zE25 = composerKN.E2(popupLayout2);
                    Object objIF6 = composerKN.iF();
                    if (zE25 || objIF6 == companion.n()) {
                        objIF6 = new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                                n(layoutCoordinates);
                                return Unit.INSTANCE;
                            }

                            public final void n(LayoutCoordinates layoutCoordinates) {
                                LayoutCoordinates layoutCoordinatesPiY = layoutCoordinates.piY();
                                Intrinsics.checkNotNull(layoutCoordinatesPiY);
                                popupLayout2.WPU(layoutCoordinatesPiY);
                            }
                        };
                        composerKN.o(objIF6);
                    }
                    Modifier modifierN = OnGloballyPositionedModifierKt.n(companion2, (Function1) objIF6);
                    boolean zE26 = composerKN.E2(popupLayout2) | composerKN.p5(layoutDirection);
                    Object objIF7 = composerKN.iF();
                    if (zE26 || objIF7 == companion.n()) {
                        objIF7 = new MeasurePolicy() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1
                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public final MeasureResult rl(MeasureScope measureScope, List list, long j2) {
                                popupLayout2.setParentLayoutDirection(layoutDirection);
                                return MeasureScope.ER(measureScope, 0, 0, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1.1
                                    public final void n(Placeable.PlacementScope placementScope) {
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                        n(placementScope);
                                        return Unit.INSTANCE;
                                    }
                                }, 4, null);
                            }
                        };
                        composerKN.o(objIF7);
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) objIF7;
                    int iN = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                    Modifier modifierO = ComposedModifierKt.O(composerKN, modifierN);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0 function0N = companion3.n();
                    if (composerKN.getApplier() == null) {
                        ComposablesKt.t();
                    }
                    composerKN.T();
                    if (composerKN.getInserting()) {
                        composerKN.s7N(function0N);
                    } else {
                        composerKN.r();
                    }
                    Composer composerN = Updater.n(composerKN);
                    Updater.O(composerN, measurePolicy, companion3.t());
                    Updater.O(composerN, compositionLocalMapIk, companion3.O());
                    Function2 function2Rl = companion3.rl();
                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                        composerN.o(Integer.valueOf(iN));
                        composerN.az(Integer.valueOf(iN), function2Rl);
                    }
                    Updater.O(composerN, modifierO, companion3.nr());
                    composerKN.XQ();
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    function03 = function04;
                    popupProperties3 = popupProperties4;
                } else {
                    composerKN.wTp();
                    function03 = function02;
                    popupProperties3 = popupProperties2;
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$9
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            n(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer2, int i15) {
                            AndroidPopup_androidKt.n(popupPositionProvider2, function03, popupProperties3, function2, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            popupProperties2 = popupProperties;
            if ((i3 & 8) != 0) {
            }
            i8 = i5;
            if (composerKN.HI((i8 & 1171) != 1170, i8 & 1)) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        function02 = function0;
        i7 = i3 & 4;
        if (i7 != 0) {
        }
        popupProperties2 = popupProperties;
        if ((i3 & 8) != 0) {
        }
        i8 = i5;
        if (composerKN.HI((i8 & 1171) != 1170, i8 & 1)) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntRect qie(Rect rect) {
        return new IntRect(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(Alignment alignment, long j2, Function0 function0, PopupProperties popupProperties, final Function2 function2, Composer composer, final int i2, final int i3) {
        Alignment alignment2;
        int i5;
        long j3;
        int i7;
        Function0 function02;
        int i8;
        PopupProperties popupProperties2;
        Function2 function22;
        final Alignment alignmentHI;
        final long jJ2;
        final Function0 function03;
        final PopupProperties popupProperties3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(295309329);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i5 = i2 | 6;
            alignment2 = alignment;
        } else if ((i2 & 6) == 0) {
            alignment2 = alignment;
            i5 = (composerKN.p5(alignment2) ? 4 : 2) | i2;
        } else {
            alignment2 = alignment;
            i5 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                j3 = j2;
                i5 |= composerKN.nr(j3) ? 32 : 16;
            }
            i7 = i3 & 4;
            if (i7 == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    function02 = function0;
                    i5 |= composerKN.E2(function02) ? 256 : 128;
                }
                i8 = i3 & 8;
                if (i8 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        popupProperties2 = popupProperties;
                        i5 |= composerKN.p5(popupProperties2) ? 2048 : 1024;
                    }
                    if ((i3 & 16) != 0) {
                        if ((i2 & 24576) == 0) {
                            function22 = function2;
                            i5 |= composerKN.E2(function22) ? 16384 : 8192;
                        }
                        if (composerKN.HI((i5 & 9363) != 9362, i5 & 1)) {
                            alignmentHI = i9 != 0 ? Alignment.INSTANCE.HI() : alignment2;
                            if (i10 != 0) {
                                long j4 = 0;
                                jJ2 = IntOffset.J2((j4 & 4294967295L) | (j4 << 32));
                            } else {
                                jJ2 = j3;
                            }
                            DefaultConstructorMarker defaultConstructorMarker = null;
                            Function0 function04 = i7 != 0 ? null : function02;
                            PopupProperties popupProperties4 = i8 != 0 ? new PopupProperties(false, false, false, false, 15, (DefaultConstructorMarker) null) : popupProperties2;
                            if (ComposerKt.v()) {
                                ComposerKt.p5(295309329, i5, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
                            }
                            boolean z2 = ((i5 & 112) == 32) | ((i5 & 14) == 4);
                            Object objIF = composerKN.iF();
                            if (z2 || objIF == Composer.INSTANCE.n()) {
                                objIF = new AlignmentOffsetPositionProvider(alignmentHI, jJ2, defaultConstructorMarker);
                                composerKN.o(objIF);
                            }
                            n((AlignmentOffsetPositionProvider) objIF, function04, popupProperties4, function22, composerKN, (i5 >> 3) & 8176, 0);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            function03 = function04;
                            popupProperties3 = popupProperties4;
                        } else {
                            composerKN.wTp();
                            alignmentHI = alignment2;
                            jJ2 = j3;
                            function03 = function02;
                            popupProperties3 = popupProperties2;
                        }
                        scopeUpdateScopeGh = composerKN.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    n(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer2, int i11) {
                                    AndroidPopup_androidKt.t(alignmentHI, jJ2, function03, popupProperties3, function2, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 24576;
                    function22 = function2;
                    if (composerKN.HI((i5 & 9363) != 9362, i5 & 1)) {
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                popupProperties2 = popupProperties;
                if ((i3 & 16) != 0) {
                }
                function22 = function2;
                if (composerKN.HI((i5 & 9363) != 9362, i5 & 1)) {
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            function02 = function0;
            i8 = i3 & 8;
            if (i8 != 0) {
            }
            popupProperties2 = popupProperties;
            if ((i3 & 16) != 0) {
            }
            function22 = function2;
            if (composerKN.HI((i5 & 9363) != 9362, i5 & 1)) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        j3 = j2;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        function02 = function0;
        i8 = i3 & 8;
        if (i8 != 0) {
        }
        popupProperties2 = popupProperties;
        if ((i3 & 16) != 0) {
        }
        function22 = function2;
        if (composerKN.HI((i5 & 9363) != 9362, i5 & 1)) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int xMQ(boolean z2, SecureFlagPolicy secureFlagPolicy, boolean z3) {
        int i2 = !z2 ? 262152 : 262144;
        if (secureFlagPolicy == SecureFlagPolicy.f34376t) {
            i2 |= 8192;
        }
        return !z3 ? i2 | 512 : i2;
    }

    public static final boolean gh(View view) {
        WindowManager.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = view.getRootView().getLayoutParams();
        if (layoutParams2 instanceof WindowManager.LayoutParams) {
            layoutParams = (WindowManager.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams == null || (layoutParams.flags & 8192) == 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mUb(PopupProperties popupProperties, boolean z2) {
        if (popupProperties.getInheritSecurePolicy() && z2) {
            return popupProperties.getFlags() | 8192;
        }
        if (popupProperties.getInheritSecurePolicy() && !z2) {
            return popupProperties.getFlags() & (-8193);
        }
        return popupProperties.getFlags();
    }

    public static final void nr(final String str, final Function2 function2, Composer composer, final int i2) {
        int i3;
        boolean z2;
        int i5;
        int i7;
        Composer composerKN = composer.KN(-498879600);
        if ((i2 & 6) == 0) {
            if (composerKN.p5(str)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (composerKN.E2(function2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (composerKN.HI(z2, i3 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(-498879600, i3, -1, "androidx.compose.ui.window.PopupTestTag (AndroidPopup.android.kt:422)");
            }
            CompositionLocalKt.rl(f34287n.nr(str), function2, composerKN, (i3 & 112) | ProvidedValue.xMQ);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$PopupTestTag$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i8) {
                    AndroidPopup_androidKt.nr(str, function2, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function2 rl(State state) {
        return (Function2) state.getValue();
    }
}
