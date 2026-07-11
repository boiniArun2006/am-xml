package androidx.compose.material3;

import GJW.vd;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
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
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.SecureFlagPolicy;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a¹\u0001\u0010\u001a\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u001c\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001aL\u0010 \u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c2\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0010H\u0001¢\u0006\u0004\b \u0010!\u001a\u0013\u0010$\u001a\u00020#*\u00020\"H\u0000¢\u0006\u0004\b$\u0010%\u001a\u001b\u0010(\u001a\u00020#*\u00020&2\u0006\u0010'\u001a\u00020#H\u0002¢\u0006\u0004\b(\u0010)\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006+²\u0006\u0017\u0010*\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00108\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/SheetState;", "sheetState", "Landroidx/compose/ui/unit/Dp;", "sheetMaxWidth", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "tonalElevation", "scrimColor", "Landroidx/compose/runtime/Composable;", "dragHandle", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "Landroidx/compose/material3/ModalBottomSheetProperties;", "properties", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;FLandroidx/compose/ui/graphics/Shape;JJFJLkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/ModalBottomSheetProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "predictiveBackProgress", "rl", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/ModalBottomSheetProperties;Landroidx/compose/animation/core/Animatable;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroid/view/View;", "", "J2", "(Landroid/view/View;)Z", "Landroidx/compose/ui/window/SecureFlagPolicy;", "isSecureFlagSetOnParent", "Uo", "(Landroidx/compose/ui/window/SecureFlagPolicy;Z)Z", "currentContent", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nModalBottomSheet.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,640:1\n148#2:641\n77#3:642\n77#3:643\n77#3:644\n488#4:645\n487#4,4:646\n491#4,2:653\n495#4:659\n1223#5,3:650\n1226#5,3:656\n1223#5,6:660\n1223#5,6:666\n1223#5,6:672\n487#6:655\n81#7:678\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt\n*L\n241#1:641\n274#1:642\n275#1:643\n276#1:644\n280#1:645\n280#1:646,4\n280#1:653,2\n280#1:659\n280#1:650,3\n280#1:656,3\n283#1:660,6\n306#1:666,6\n315#1:672,6\n280#1:655\n278#1:678\n*E\n"})
public final class ModalBottomSheet_androidKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SecureFlagPolicy.values().length];
            try {
                iArr[SecureFlagPolicy.f34373O.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SecureFlagPolicy.f34376t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SecureFlagPolicy.f34374n.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:221:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void n(final Function0 function0, Modifier modifier, SheetState sheetState, float f3, Shape shape, long j2, long j3, float f4, long j4, Function2 function2, WindowInsets windowInsets, ModalBottomSheetProperties modalBottomSheetProperties, final Function3 function3, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        Modifier modifier2;
        SheetState sheetStateQie;
        int i8;
        Shape shapeNr;
        long jRl;
        long jT2;
        int i9;
        long j5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        long jO;
        WindowInsets windowInsetsKN;
        ModalBottomSheetProperties modalBottomSheetPropertiesN;
        SheetState sheetState2;
        float f5;
        long j6;
        int i15;
        final WindowInsets windowInsets2;
        Modifier modifier3;
        long j7;
        long j9;
        Function2 function22;
        int i16;
        Shape shape2;
        float f6;
        Composer composer2;
        final Modifier modifier4;
        final SheetState sheetState3;
        final float f7;
        final Shape shape3;
        final long j10;
        final long j11;
        final float f8;
        final long j12;
        final Function2 function23;
        final ModalBottomSheetProperties modalBottomSheetProperties2;
        final WindowInsets windowInsets3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(944867294);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i7 = (composerKN.E2(function0) ? 4 : 2) | i2;
        } else {
            i7 = i2;
        }
        int i17 = i5 & 2;
        if (i17 != 0) {
            i7 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i7 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if ((i5 & 4) == 0) {
                    sheetStateQie = sheetState;
                    int i18 = composerKN.p5(sheetStateQie) ? 256 : 128;
                    i7 |= i18;
                } else {
                    sheetStateQie = sheetState;
                }
                i7 |= i18;
            } else {
                sheetStateQie = sheetState;
            }
            i8 = i5 & 8;
            if (i8 == 0) {
                i7 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    i7 |= composerKN.rl(f3) ? 2048 : 1024;
                }
                if ((i2 & 24576) == 0) {
                    if ((i5 & 16) == 0) {
                        shapeNr = shape;
                        int i19 = composerKN.p5(shapeNr) ? 16384 : 8192;
                        i7 |= i19;
                    } else {
                        shapeNr = shape;
                    }
                    i7 |= i19;
                } else {
                    shapeNr = shape;
                }
                if ((i2 & 196608) == 0) {
                    jRl = j2;
                    i7 |= ((i5 & 32) == 0 && composerKN.nr(jRl)) ? 131072 : 65536;
                } else {
                    jRl = j2;
                }
                if ((i2 & 1572864) == 0) {
                    jT2 = j3;
                    i7 |= ((i5 & 64) == 0 && composerKN.nr(jT2)) ? 1048576 : 524288;
                } else {
                    jT2 = j3;
                }
                i9 = i5 & 128;
                if (i9 != 0) {
                    i7 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i7 |= composerKN.rl(f4) ? 8388608 : 4194304;
                }
                if ((i2 & 100663296) == 0) {
                    j5 = j4;
                    i7 |= ((i5 & 256) == 0 && composerKN.nr(j5)) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                } else {
                    j5 = j4;
                }
                i10 = i5 & 512;
                if (i10 != 0) {
                    i7 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                } else {
                    if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                        i11 = i10;
                        i7 |= composerKN.E2(function2) ? 536870912 : 268435456;
                    }
                    if ((i3 & 6) != 0) {
                        i12 = i3 | (((i5 & 1024) == 0 && composerKN.p5(windowInsets)) ? 4 : 2);
                    } else {
                        i12 = i3;
                    }
                    i13 = i5 & 2048;
                    if (i13 == 0) {
                        i12 |= 48;
                        i14 = i13;
                    } else if ((i3 & 48) == 0) {
                        i14 = i13;
                        i12 |= composerKN.p5(modalBottomSheetProperties) ? 32 : 16;
                    } else {
                        i14 = i13;
                    }
                    int i20 = i12;
                    if ((i5 & 4096) != 0) {
                        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                            i20 |= composerKN.E2(function3) ? 256 : 128;
                        }
                        if ((i7 & 306783379) == 306783378 && (i20 & 147) == 146 && composerKN.xMQ()) {
                            composerKN.wTp();
                            composer2 = composerKN;
                            modifier4 = modifier2;
                            sheetState3 = sheetStateQie;
                            j11 = jT2;
                            f7 = f3;
                            function23 = function2;
                            windowInsets3 = windowInsets;
                            modalBottomSheetProperties2 = modalBottomSheetProperties;
                            long j13 = jRl;
                            f8 = f4;
                            j12 = j5;
                            shape3 = shapeNr;
                            j10 = j13;
                        } else {
                            composerKN.e();
                            if ((i2 & 1) != 0 || composerKN.rV9()) {
                                if (i17 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if ((i5 & 4) != 0) {
                                    i7 &= -897;
                                    sheetStateQie = ModalBottomSheetKt.qie(false, null, composerKN, 0, 3);
                                }
                                float fJ2 = i8 == 0 ? BottomSheetDefaults.f24481n.J2() : f3;
                                if ((i5 & 16) != 0) {
                                    shapeNr = BottomSheetDefaults.f24481n.nr(composerKN, 6);
                                    i7 &= -57345;
                                }
                                if ((i5 & 32) != 0) {
                                    jRl = BottomSheetDefaults.f24481n.rl(composerKN, 6);
                                    i7 &= -458753;
                                }
                                if ((i5 & 64) != 0) {
                                    jT2 = ColorSchemeKt.t(jRl, composerKN, (i7 >> 15) & 14);
                                    i7 &= -3670017;
                                }
                                float fKN = i9 == 0 ? Dp.KN(0) : f4;
                                if ((i5 & 256) == 0) {
                                    jO = BottomSheetDefaults.f24481n.O(composerKN, 6);
                                    i7 = (-234881025) & i7;
                                } else {
                                    jO = j5;
                                }
                                Function2 function2N = i11 == 0 ? ComposableSingletons$ModalBottomSheet_androidKt.f25091n.n() : function2;
                                if ((i5 & 1024) == 0) {
                                    windowInsetsKN = BottomSheetDefaults.f24481n.KN(composerKN, 6);
                                    i20 &= -15;
                                } else {
                                    windowInsetsKN = windowInsets;
                                }
                                modalBottomSheetPropertiesN = i14 == 0 ? ModalBottomSheetDefaults.f26234n.n() : modalBottomSheetProperties;
                                sheetState2 = sheetStateQie;
                                f5 = fKN;
                                j6 = jRl;
                                float f9 = fJ2;
                                i15 = i20;
                                windowInsets2 = windowInsetsKN;
                                modifier3 = modifier2;
                                j7 = jT2;
                                j9 = jO;
                                function22 = function2N;
                                i16 = i7;
                                shape2 = shapeNr;
                                f6 = f9;
                            } else {
                                composerKN.wTp();
                                if ((i5 & 4) != 0) {
                                    i7 &= -897;
                                }
                                if ((i5 & 16) != 0) {
                                    i7 &= -57345;
                                }
                                if ((i5 & 32) != 0) {
                                    i7 &= -458753;
                                }
                                if ((i5 & 64) != 0) {
                                    i7 &= -3670017;
                                }
                                if ((i5 & 256) != 0) {
                                    i7 &= -234881025;
                                }
                                if ((i5 & 1024) != 0) {
                                    i20 &= -15;
                                }
                                function22 = function2;
                                modalBottomSheetPropertiesN = modalBottomSheetProperties;
                                i15 = i20;
                                i16 = i7;
                                j6 = jRl;
                                windowInsets2 = windowInsets;
                                shape2 = shapeNr;
                                f6 = f3;
                                SheetState sheetState4 = sheetStateQie;
                                f5 = f4;
                                long j14 = j5;
                                modifier3 = modifier2;
                                sheetState2 = sheetState4;
                                j7 = jT2;
                                j9 = j14;
                            }
                            composerKN.S();
                            if (ComposerKt.v()) {
                                composer2 = composerKN;
                            } else {
                                composer2 = composerKN;
                                ComposerKt.p5(944867294, i16, i15, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:247)");
                            }
                            ModalBottomSheetKt.n(function0, modifier3, sheetState2, f6, shape2, j6, j7, f5, j9, function22, new Function2<Composer, Integer, WindowInsets>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$1
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ WindowInsets invoke(Composer composer3, Integer num) {
                                    return n(composer3, num.intValue());
                                }

                                public final WindowInsets n(Composer composer3, int i21) {
                                    composer3.eF(-2061903609);
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-2061903609, i21, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.android.kt:258)");
                                    }
                                    WindowInsets windowInsets4 = windowInsets2;
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    composer3.Xw();
                                    return windowInsets4;
                                }
                            }, modalBottomSheetPropertiesN, function3, composer2, i16 & 2147483646, i15 & 1008, 0);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            modifier4 = modifier3;
                            sheetState3 = sheetState2;
                            f7 = f6;
                            shape3 = shape2;
                            j10 = j6;
                            j11 = j7;
                            f8 = f5;
                            j12 = j9;
                            function23 = function22;
                            modalBottomSheetProperties2 = modalBottomSheetPropertiesN;
                            windowInsets3 = windowInsets2;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    n(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer3, int i21) {
                                    ModalBottomSheet_androidKt.n(function0, modifier4, sheetState3, f7, shape3, j10, j11, f8, j12, function23, windowInsets3, modalBottomSheetProperties2, function3, composer3, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i20 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                    if ((i7 & 306783379) == 306783378) {
                        composerKN.e();
                        if ((i2 & 1) != 0) {
                            if (i17 != 0) {
                            }
                            if ((i5 & 4) != 0) {
                            }
                            if (i8 == 0) {
                            }
                            if ((i5 & 16) != 0) {
                            }
                            if ((i5 & 32) != 0) {
                            }
                            if ((i5 & 64) != 0) {
                            }
                            if (i9 == 0) {
                            }
                            if ((i5 & 256) == 0) {
                            }
                            if (i11 == 0) {
                            }
                            if ((i5 & 1024) == 0) {
                            }
                            if (i14 == 0) {
                            }
                            sheetState2 = sheetStateQie;
                            f5 = fKN;
                            j6 = jRl;
                            float f92 = fJ2;
                            i15 = i20;
                            windowInsets2 = windowInsetsKN;
                            modifier3 = modifier2;
                            j7 = jT2;
                            j9 = jO;
                            function22 = function2N;
                            i16 = i7;
                            shape2 = shapeNr;
                            f6 = f92;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            ModalBottomSheetKt.n(function0, modifier3, sheetState2, f6, shape2, j6, j7, f5, j9, function22, new Function2<Composer, Integer, WindowInsets>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$1
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ WindowInsets invoke(Composer composer3, Integer num) {
                                    return n(composer3, num.intValue());
                                }

                                public final WindowInsets n(Composer composer3, int i21) {
                                    composer3.eF(-2061903609);
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-2061903609, i21, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.android.kt:258)");
                                    }
                                    WindowInsets windowInsets4 = windowInsets2;
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    composer3.Xw();
                                    return windowInsets4;
                                }
                            }, modalBottomSheetPropertiesN, function3, composer2, i16 & 2147483646, i15 & 1008, 0);
                            if (ComposerKt.v()) {
                            }
                            modifier4 = modifier3;
                            sheetState3 = sheetState2;
                            f7 = f6;
                            shape3 = shape2;
                            j10 = j6;
                            j11 = j7;
                            f8 = f5;
                            j12 = j9;
                            function23 = function22;
                            modalBottomSheetProperties2 = modalBottomSheetPropertiesN;
                            windowInsets3 = windowInsets2;
                        }
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                i11 = i10;
                if ((i3 & 6) != 0) {
                }
                i13 = i5 & 2048;
                if (i13 == 0) {
                }
                int i202 = i12;
                if ((i5 & 4096) != 0) {
                }
                if ((i7 & 306783379) == 306783378) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            if ((i2 & 24576) == 0) {
            }
            if ((i2 & 196608) == 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            i9 = i5 & 128;
            if (i9 != 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            i10 = i5 & 512;
            if (i10 != 0) {
            }
            i11 = i10;
            if ((i3 & 6) != 0) {
            }
            i13 = i5 & 2048;
            if (i13 == 0) {
            }
            int i2022 = i12;
            if ((i5 & 4096) != 0) {
            }
            if ((i7 & 306783379) == 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        i8 = i5 & 8;
        if (i8 == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if ((i2 & 196608) == 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        i9 = i5 & 128;
        if (i9 != 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        i10 = i5 & 512;
        if (i10 != 0) {
        }
        i11 = i10;
        if ((i3 & 6) != 0) {
        }
        i13 = i5 & 2048;
        if (i13 == 0) {
        }
        int i20222 = i12;
        if ((i5 & 4096) != 0) {
        }
        if ((i7 & 306783379) == 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Uo(SecureFlagPolicy secureFlagPolicy, boolean z2) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[secureFlagPolicy.ordinal()];
        if (i2 == 1) {
            return false;
        }
        if (i2 == 2) {
            return true;
        }
        if (i2 == 3) {
            return z2;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void rl(final Function0 function0, final ModalBottomSheetProperties modalBottomSheetProperties, final Animatable animatable, final Function2 function2, Composer composer, final int i2) {
        int i3;
        int i5;
        final LayoutDirection layoutDirection;
        int i7;
        int i8;
        Object obj;
        Composer composer2;
        Composer composerKN = composer.KN(1254951810);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(function0) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.p5(modalBottomSheetProperties) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= (i2 & 512) == 0 ? composerKN.p5(animatable) : composerKN.E2(animatable) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.E2(function2) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1254951810, i3, -1, "androidx.compose.material3.ModalBottomSheetDialog (ModalBottomSheet.android.kt:272)");
            }
            View view = (View) composerKN.ty(AndroidCompositionLocals_androidKt.gh());
            Density density = (Density) composerKN.ty(CompositionLocalsKt.J2());
            LayoutDirection layoutDirection2 = (LayoutDirection) composerKN.ty(CompositionLocalsKt.az());
            CompositionContext compositionContextNr = ComposablesKt.nr(composerKN, 0);
            final State stateCk = SnapshotStateKt.ck(function2, composerKN, (i3 >> 9) & 14);
            Composer composer3 = composerKN;
            UUID uuid = (UUID) RememberSaveableKt.O(new Object[0], null, null, new Function0<UUID>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetDialog$dialogId$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final UUID invoke() {
                    return UUID.randomUUID();
                }
            }, composerKN, 3072, 6);
            Object objIF = composer3.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = new CompositionScopedCoroutineScopeCanceller(EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composer3));
                composer3.o(objIF);
            }
            vd coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objIF).getCoroutineScope();
            boolean zN = DarkThemeKt.n(composer3, 0);
            boolean zP5 = composer3.p5(view) | composer3.p5(density);
            Object objIF2 = composer3.iF();
            if (zP5 || objIF2 == companion.n()) {
                i5 = i3;
                layoutDirection = layoutDirection2;
                i7 = 4;
                i8 = 0;
                ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper = new ModalBottomSheetDialogWrapper(function0, modalBottomSheetProperties, view, layoutDirection, density, uuid, animatable, coroutineScope, zN);
                modalBottomSheetDialogWrapper.KN(compositionContextNr, ComposableLambdaKt.rl(-1560960657, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetDialog$dialog$1$1$1
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                        n(composer4, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer4, int i9) {
                        if ((i9 & 3) == 2 && composer4.xMQ()) {
                            composer4.wTp();
                            return;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-1560960657, i9, -1, "androidx.compose.material3.ModalBottomSheetDialog.<anonymous>.<anonymous>.<anonymous> (ModalBottomSheet.android.kt:296)");
                        }
                        Modifier modifierNr = SemanticsModifierKt.nr(Modifier.INSTANCE, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetDialog$dialog$1$1$1.1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                n(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.gh(semanticsPropertyReceiver);
                            }
                        }, 1, null);
                        State state = stateCk;
                        MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                        int iN = ComposablesKt.n(composer4, 0);
                        CompositionLocalMap compositionLocalMapIk = composer4.Ik();
                        Modifier modifierO = ComposedModifierKt.O(composer4, modifierNr);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0 function0N = companion2.n();
                        if (composer4.getApplier() == null) {
                            ComposablesKt.t();
                        }
                        composer4.T();
                        if (composer4.getInserting()) {
                            composer4.s7N(function0N);
                        } else {
                            composer4.r();
                        }
                        Composer composerN = Updater.n(composer4);
                        Updater.O(composerN, measurePolicyUo, companion2.t());
                        Updater.O(composerN, compositionLocalMapIk, companion2.O());
                        Function2 function2Rl = companion2.rl();
                        if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                            composerN.o(Integer.valueOf(iN));
                            composerN.az(Integer.valueOf(iN), function2Rl);
                        }
                        Updater.O(composerN, modifierO, companion2.nr());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                        ModalBottomSheet_androidKt.t(state).invoke(composer4, 0);
                        composer4.XQ();
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                    }
                }));
                composer3.o(modalBottomSheetDialogWrapper);
                obj = modalBottomSheetDialogWrapper;
            } else {
                obj = objIF2;
                i5 = i3;
                layoutDirection = layoutDirection2;
                i7 = 4;
                i8 = 0;
            }
            final ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper2 = (ModalBottomSheetDialogWrapper) obj;
            boolean zE2 = composer3.E2(modalBottomSheetDialogWrapper2);
            Object objIF3 = composer3.iF();
            if (zE2 || objIF3 == companion.n()) {
                objIF3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetDialog$1$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                        modalBottomSheetDialogWrapper2.show();
                        final ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper3 = modalBottomSheetDialogWrapper2;
                        return new DisposableEffectResult() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetDialog$1$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void n() {
                                modalBottomSheetDialogWrapper3.dismiss();
                                modalBottomSheetDialogWrapper3.Uo();
                            }
                        };
                    }
                };
                composer3.o(objIF3);
            }
            EffectsKt.rl(modalBottomSheetDialogWrapper2, (Function1) objIF3, composer3, i8);
            int i9 = (composer3.E2(modalBottomSheetDialogWrapper2) ? 1 : 0) | ((i5 & 14) == i7 ? 1 : i8) | ((i5 & 112) == 32 ? 1 : i8) | (composer3.p5(layoutDirection) ? 1 : 0);
            Object objIF4 = composer3.iF();
            if (i9 != 0 || objIF4 == companion.n()) {
                objIF4 = new Function0<Unit>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetDialog$2$1
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
                        modalBottomSheetDialogWrapper2.gh(function0, modalBottomSheetProperties, layoutDirection);
                    }
                };
                composer3.o(objIF4);
            }
            EffectsKt.KN((Function0) objIF4, composer3, i8);
            composer2 = composer3;
            if (ComposerKt.v()) {
                ComposerKt.M7();
                composer2 = composer3;
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetDialog$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                    n(composer4, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer4, int i10) {
                    ModalBottomSheet_androidKt.rl(function0, modalBottomSheetProperties, animatable, function2, composer4, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    public static final boolean J2(View view) {
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
    public static final Function2 t(State state) {
        return (Function2) state.getValue();
    }
}
