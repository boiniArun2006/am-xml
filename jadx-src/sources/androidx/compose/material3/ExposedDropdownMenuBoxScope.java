package androidx.compose.material3;

import android.view.View;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u0098\u0001\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u001c\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000b0\u0019¢\u0006\u0002\b\u001b¢\u0006\u0002\b\u001cH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ¢\u0001\u0010!\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010 \u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u001c\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000b0\u0019¢\u0006\u0002\b\u001b¢\u0006\u0002\b\u001cH\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"JW\u0010#\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u001c\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000b0\u0019¢\u0006\u0002\b\u001b¢\u0006\u0002\b\u001cH\u0007¢\u0006\u0004\b#\u0010$R\u001a\u0010(\u001a\u00020%8 X \u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b&\u0010'\u0082\u0001\u0001)\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Landroidx/compose/material3/ExposedDropdownMenuBoxScope;", "", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "", "matchTextFieldWidth", "nr", "(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;", "expanded", "Lkotlin/Function0;", "", "onDismissRequest", "modifier", "Landroidx/compose/foundation/ScrollState;", "scrollState", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "containerColor", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "shadowElevation", "Landroidx/compose/foundation/BorderStroke;", "border", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", AppLovinEventTypes.USER_VIEWED_CONTENT, "t", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;ZLandroidx/compose/ui/graphics/Shape;JFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "focusable", "rl", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;ZZLandroidx/compose/ui/graphics/Shape;JFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", c.f62177j, "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/material3/MenuAnchorType;", "O", "()Ljava/lang/String;", "anchorType", "Landroidx/compose/material3/ExposedDropdownMenuBoxScopeImpl;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nExposedDropdownMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material3/ExposedDropdownMenuBoxScope\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,1490:1\n1223#2,6:1491\n1223#2,6:1499\n1223#2,6:1505\n1223#2,6:1511\n1223#2,6:1517\n77#3:1497\n77#3:1498\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material3/ExposedDropdownMenuBoxScope\n*L\n348#1:1491,6\n354#1:1499,6\n358#1:1505,6\n362#1:1511,6\n364#1:1517,6\n349#1:1497\n350#1:1498\n*E\n"})
public abstract class ExposedDropdownMenuBoxScope {
    public /* synthetic */ ExposedDropdownMenuBoxScope(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String O();

    public abstract Modifier nr(Modifier modifier, boolean z2);

    private ExposedDropdownMenuBoxScope() {
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void n(final boolean z2, final Function0 function0, Modifier modifier, ScrollState scrollState, final Function3 function3, Composer composer, final int i2, final int i3) {
        boolean z3;
        int i5;
        Function0 function02;
        final Modifier modifier2;
        final ScrollState scrollState2;
        Function3 function32;
        ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope;
        Modifier modifier3;
        ScrollState scrollStateT;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1729549851);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            z3 = z2;
        } else {
            z3 = z2;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.n(z3) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i2 & 48) == 0) {
                i5 |= composerKN.E2(function02) ? 32 : 16;
            }
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    scrollState2 = scrollState;
                    int i8 = composerKN.p5(scrollState2) ? 2048 : 1024;
                    i5 |= i8;
                } else {
                    scrollState2 = scrollState;
                }
                i5 |= i8;
            } else {
                scrollState2 = scrollState;
            }
            if ((i3 & 16) == 0) {
                i5 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    function32 = function3;
                    i5 |= composerKN.E2(function32) ? 16384 : 8192;
                }
                if ((i3 & 32) == 0) {
                    if ((i2 & 196608) == 0) {
                        exposedDropdownMenuBoxScope = this;
                        i5 |= composerKN.p5(exposedDropdownMenuBoxScope) ? 131072 : 65536;
                    }
                    if ((74899 & i5) == 74898 || !composerKN.xMQ()) {
                        composerKN.e();
                        if ((i2 & 1) != 0 || composerKN.rV9()) {
                            Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                            if ((i3 & 8) == 0) {
                                i5 &= -7169;
                                modifier3 = modifier4;
                                scrollStateT = ScrollKt.t(0, composerKN, 0, 1);
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(1729549851, i5, -1, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.android.kt:452)");
                                }
                                MenuDefaults menuDefaults = MenuDefaults.f26185n;
                                composer2 = composerKN;
                                exposedDropdownMenuBoxScope.t(z3, function02, modifier3, scrollStateT, true, menuDefaults.O(composerKN, 6), menuDefaults.n(composerKN, 6), menuDefaults.J2(), menuDefaults.nr(), null, function32, composer2, (i5 & 14) | 918577152 | (i5 & 112) | (i5 & 896) | (i5 & 7168), (i5 >> 12) & 126, 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                modifier2 = modifier3;
                                scrollState2 = scrollStateT;
                            } else {
                                modifier3 = modifier4;
                            }
                        } else {
                            composerKN.wTp();
                            if ((i3 & 8) != 0) {
                                i5 &= -7169;
                            }
                            modifier3 = modifier2;
                        }
                        scrollStateT = scrollState2;
                        composerKN.S();
                        if (ComposerKt.v()) {
                        }
                        MenuDefaults menuDefaults2 = MenuDefaults.f26185n;
                        composer2 = composerKN;
                        exposedDropdownMenuBoxScope.t(z3, function02, modifier3, scrollStateT, true, menuDefaults2.O(composerKN, 6), menuDefaults2.n(composerKN, 6), menuDefaults2.J2(), menuDefaults2.nr(), null, function32, composer2, (i5 & 14) | 918577152 | (i5 & 112) | (i5 & 896) | (i5 & 7168), (i5 >> 12) & 126, 0);
                        if (ComposerKt.v()) {
                        }
                        modifier2 = modifier3;
                        scrollState2 = scrollStateT;
                    } else {
                        composerKN.wTp();
                        composer2 = composerKN;
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                n(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer3, int i9) {
                                this.f25779n.n(z2, function0, modifier2, scrollState2, function3, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 196608;
                exposedDropdownMenuBoxScope = this;
                if ((74899 & i5) == 74898) {
                    composerKN.e();
                    if ((i2 & 1) != 0) {
                        if (i7 == 0) {
                        }
                        if ((i3 & 8) == 0) {
                        }
                    }
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            function32 = function3;
            if ((i3 & 32) == 0) {
            }
            exposedDropdownMenuBoxScope = this;
            if ((74899 & i5) == 74898) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 3072) != 0) {
        }
        if ((i3 & 16) == 0) {
        }
        function32 = function3;
        if ((i3 & 32) == 0) {
        }
        exposedDropdownMenuBoxScope = this;
        if ((74899 & i5) == 74898) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void rl(final boolean z2, final Function0 function0, Modifier modifier, ScrollState scrollState, boolean z3, boolean z4, Shape shape, long j2, float f3, float f4, BorderStroke borderStroke, final Function3 function3, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        Function0 function02;
        int i8;
        Modifier modifier2;
        final ScrollState scrollState2;
        int i9;
        boolean z5;
        Shape shapeO;
        long j3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        ScrollState scrollStateT;
        boolean z6;
        long jN;
        BorderStroke borderStroke2;
        ScrollState scrollState3;
        float f5;
        boolean z7;
        Shape shape2;
        float f6;
        long j4;
        Modifier modifier3;
        int i16;
        Composer composer2;
        final boolean z9;
        final Modifier modifier4;
        final boolean z10;
        final Shape shape3;
        final long j5;
        final float f7;
        final float f8;
        final BorderStroke borderStroke3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(366140493);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i7 = (composerKN.n(z2) ? 4 : 2) | i2;
        } else {
            i7 = i2;
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                function02 = function0;
                i7 |= composerKN.E2(function02) ? 32 : 16;
            }
            i8 = i5 & 4;
            if (i8 == 0) {
                i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    modifier2 = modifier;
                    i7 |= composerKN.p5(modifier2) ? 256 : 128;
                }
                if ((i2 & 3072) == 0) {
                    if ((i5 & 8) == 0) {
                        scrollState2 = scrollState;
                        int i17 = composerKN.p5(scrollState2) ? 2048 : 1024;
                        i7 |= i17;
                    } else {
                        scrollState2 = scrollState;
                    }
                    i7 |= i17;
                } else {
                    scrollState2 = scrollState;
                }
                i9 = i5 & 32;
                if (i9 != 0) {
                    i7 |= 196608;
                    z5 = z4;
                } else {
                    z5 = z4;
                    if ((i2 & 196608) == 0) {
                        i7 |= composerKN.n(z5) ? 131072 : 65536;
                    }
                }
                if ((i2 & 1572864) == 0) {
                    shapeO = shape;
                    i7 |= ((i5 & 64) == 0 && composerKN.p5(shapeO)) ? 1048576 : 524288;
                } else {
                    shapeO = shape;
                }
                if ((i2 & 12582912) == 0) {
                    j3 = j2;
                    i7 |= ((i5 & 128) == 0 && composerKN.nr(j3)) ? 8388608 : 4194304;
                } else {
                    j3 = j2;
                }
                i10 = i5 & 256;
                if (i10 != 0) {
                    i7 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    i7 |= composerKN.rl(f3) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                }
                i11 = i5 & 512;
                if (i11 != 0) {
                    i7 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                } else {
                    if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                        i12 = i11;
                        i7 |= composerKN.rl(f4) ? 536870912 : 268435456;
                    }
                    i13 = i5 & 1024;
                    if (i13 == 0) {
                        i15 = i3 | 6;
                        i14 = i13;
                    } else if ((i3 & 6) == 0) {
                        i14 = i13;
                        i15 = i3 | (composerKN.p5(borderStroke) ? 4 : 2);
                    } else {
                        i14 = i13;
                        i15 = i3;
                    }
                    if ((i5 & 2048) == 0) {
                        i15 |= 48;
                    } else if ((i3 & 48) == 0) {
                        i15 |= composerKN.E2(function3) ? 32 : 16;
                    }
                    int i18 = i15;
                    if ((i5 & 4096) != 0) {
                        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                            i18 |= composerKN.p5(this) ? 256 : 128;
                        }
                        if ((i7 & 306775187) == 306775186 && (i18 & 147) == 146 && composerKN.xMQ()) {
                            composerKN.wTp();
                            f7 = f3;
                            composer2 = composerKN;
                            z10 = z5;
                            shape3 = shapeO;
                            j5 = j3;
                            modifier4 = modifier2;
                            z9 = z3;
                            f8 = f4;
                            borderStroke3 = borderStroke;
                        } else {
                            composerKN.e();
                            if ((i2 & 1) != 0 || composerKN.rV9()) {
                                if (i8 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if ((i5 & 8) == 0) {
                                    scrollStateT = ScrollKt.t(0, composerKN, 0, 1);
                                    i7 &= -7169;
                                } else {
                                    scrollStateT = scrollState2;
                                }
                                z6 = (i5 & 16) == 0 ? true : z3;
                                if (i9 != 0) {
                                    z5 = true;
                                }
                                if ((i5 & 64) != 0) {
                                    shapeO = MenuDefaults.f26185n.O(composerKN, 6);
                                    i7 &= -3670017;
                                }
                                if ((i5 & 128) == 0) {
                                    jN = MenuDefaults.f26185n.n(composerKN, 6);
                                    i7 &= -29360129;
                                } else {
                                    jN = j3;
                                }
                                float fJ2 = i10 == 0 ? MenuDefaults.f26185n.J2() : f3;
                                float fNr = i12 == 0 ? MenuDefaults.f26185n.nr() : f4;
                                if (i14 == 0) {
                                    scrollState3 = scrollStateT;
                                    f5 = fJ2;
                                    z7 = z5;
                                    shape2 = shapeO;
                                    f6 = fNr;
                                    j4 = jN;
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                    scrollState3 = scrollStateT;
                                    f5 = fJ2;
                                    z7 = z5;
                                    shape2 = shapeO;
                                    f6 = fNr;
                                    j4 = jN;
                                }
                                modifier3 = modifier2;
                                i16 = 366140493;
                            } else {
                                composerKN.wTp();
                                if ((i5 & 8) != 0) {
                                    i7 &= -7169;
                                }
                                if ((i5 & 64) != 0) {
                                    i7 &= -3670017;
                                }
                                if ((i5 & 128) != 0) {
                                    i7 &= -29360129;
                                }
                                f5 = f3;
                                f6 = f4;
                                borderStroke2 = borderStroke;
                                scrollState3 = scrollState2;
                                z7 = z5;
                                shape2 = shapeO;
                                j4 = j3;
                                modifier3 = modifier2;
                                i16 = 366140493;
                                z6 = z3;
                            }
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(i16, i7, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.android.kt:424)");
                            }
                            int i19 = i7 >> 3;
                            composer2 = composerKN;
                            t(z2, function02, modifier3, scrollState3, z7, shape2, j4, f5, f6, borderStroke2, function3, composer2, (i7 & 8190) | (57344 & i19) | (458752 & i19) | (3670016 & i19) | (29360128 & i19) | (i19 & 234881024) | ((i18 << 27) & 1879048192), (i18 >> 3) & 126, 0);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            z9 = z6;
                            modifier4 = modifier3;
                            scrollState2 = scrollState3;
                            z10 = z7;
                            shape3 = shape2;
                            j5 = j4;
                            f7 = f5;
                            f8 = f6;
                            borderStroke3 = borderStroke2;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    n(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer3, int i20) {
                                    this.f25771n.rl(z2, function0, modifier4, scrollState2, z9, z10, shape3, j5, f7, f8, borderStroke3, function3, composer3, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i18 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                    if ((i7 & 306775187) == 306775186) {
                        composerKN.e();
                        if ((i2 & 1) != 0) {
                            if (i8 != 0) {
                            }
                            if ((i5 & 8) == 0) {
                            }
                            if ((i5 & 16) == 0) {
                            }
                            if (i9 != 0) {
                            }
                            if ((i5 & 64) != 0) {
                            }
                            if ((i5 & 128) == 0) {
                            }
                            if (i10 == 0) {
                            }
                            if (i12 == 0) {
                            }
                            if (i14 == 0) {
                            }
                            modifier3 = modifier2;
                            i16 = 366140493;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            int i192 = i7 >> 3;
                            composer2 = composerKN;
                            t(z2, function02, modifier3, scrollState3, z7, shape2, j4, f5, f6, borderStroke2, function3, composer2, (i7 & 8190) | (57344 & i192) | (458752 & i192) | (3670016 & i192) | (29360128 & i192) | (i192 & 234881024) | ((i18 << 27) & 1879048192), (i18 >> 3) & 126, 0);
                            if (ComposerKt.v()) {
                            }
                            z9 = z6;
                            modifier4 = modifier3;
                            scrollState2 = scrollState3;
                            z10 = z7;
                            shape3 = shape2;
                            j5 = j4;
                            f7 = f5;
                            f8 = f6;
                            borderStroke3 = borderStroke2;
                        }
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                i12 = i11;
                i13 = i5 & 1024;
                if (i13 == 0) {
                }
                if ((i5 & 2048) == 0) {
                }
                int i182 = i15;
                if ((i5 & 4096) != 0) {
                }
                if ((i7 & 306775187) == 306775186) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            modifier2 = modifier;
            if ((i2 & 3072) == 0) {
            }
            i9 = i5 & 32;
            if (i9 != 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            i10 = i5 & 256;
            if (i10 != 0) {
            }
            i11 = i5 & 512;
            if (i11 != 0) {
            }
            i12 = i11;
            i13 = i5 & 1024;
            if (i13 == 0) {
            }
            if ((i5 & 2048) == 0) {
            }
            int i1822 = i15;
            if ((i5 & 4096) != 0) {
            }
            if ((i7 & 306775187) == 306775186) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        function02 = function0;
        i8 = i5 & 4;
        if (i8 == 0) {
        }
        modifier2 = modifier;
        if ((i2 & 3072) == 0) {
        }
        i9 = i5 & 32;
        if (i9 != 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        i10 = i5 & 256;
        if (i10 != 0) {
        }
        i11 = i5 & 512;
        if (i11 != 0) {
        }
        i12 = i11;
        i13 = i5 & 1024;
        if (i13 == 0) {
        }
        if ((i5 & 2048) == 0) {
        }
        int i18222 = i15;
        if ((i5 & 4096) != 0) {
        }
        if ((i7 & 306775187) == 306775186) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f6  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(final boolean z2, final Function0 function0, Modifier modifier, ScrollState scrollState, boolean z3, Shape shape, long j2, float f3, float f4, BorderStroke borderStroke, final Function3 function3, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        Function0 function02;
        int i8;
        Modifier modifier2;
        ScrollState scrollState2;
        int i9;
        boolean z4;
        Shape shapeO;
        final long jN;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        ScrollState scrollStateT;
        int i16;
        final BorderStroke borderStroke2;
        final Modifier modifier3;
        final Shape shape2;
        final float f5;
        final long j3;
        final ScrollState scrollState3;
        final float f6;
        final boolean z5;
        Object objIF;
        Composer.Companion companion;
        final MutableState mutableState;
        Density density;
        int iN;
        Object objIF2;
        final MutableTransitionState mutableTransitionState;
        Object objIF3;
        final MutableState mutableState2;
        boolean zP5;
        Object objIF4;
        Composer composer2;
        final Modifier modifier4;
        final boolean z6;
        final ScrollState scrollState4;
        final Shape shape3;
        final float f7;
        final float f8;
        final BorderStroke borderStroke3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(720925481);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i7 = (composerKN.n(z2) ? 4 : 2) | i2;
        } else {
            i7 = i2;
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                function02 = function0;
                i7 |= composerKN.E2(function02) ? 32 : 16;
            }
            i8 = i5 & 4;
            if (i8 == 0) {
                i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    modifier2 = modifier;
                    i7 |= composerKN.p5(modifier2) ? 256 : 128;
                }
                if ((i2 & 3072) == 0) {
                    if ((i5 & 8) == 0) {
                        scrollState2 = scrollState;
                        int i17 = composerKN.p5(scrollState2) ? 2048 : 1024;
                        i7 |= i17;
                    } else {
                        scrollState2 = scrollState;
                    }
                    i7 |= i17;
                } else {
                    scrollState2 = scrollState;
                }
                i9 = i5 & 16;
                if (i9 != 0) {
                    i7 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        z4 = z3;
                        i7 |= composerKN.n(z4) ? 16384 : 8192;
                    }
                    if ((i2 & 196608) != 0) {
                        shapeO = shape;
                        i7 |= ((i5 & 32) == 0 && composerKN.p5(shapeO)) ? 131072 : 65536;
                    } else {
                        shapeO = shape;
                    }
                    if ((i2 & 1572864) != 0) {
                        jN = j2;
                        i7 |= ((i5 & 64) == 0 && composerKN.nr(jN)) ? 1048576 : 524288;
                    } else {
                        jN = j2;
                    }
                    i10 = i5 & 128;
                    if (i10 == 0) {
                        i7 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i7 |= composerKN.rl(f3) ? 8388608 : 4194304;
                    }
                    i11 = i5 & 256;
                    if (i11 == 0) {
                        i7 |= 100663296;
                    } else {
                        if ((i2 & 100663296) == 0) {
                            i12 = i11;
                            i7 |= composerKN.rl(f4) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        i13 = i5 & 512;
                        if (i13 != 0) {
                            i7 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                        } else {
                            if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                i14 = i13;
                                i7 |= composerKN.p5(borderStroke) ? 536870912 : 268435456;
                            }
                            if ((i5 & 1024) == 0) {
                                i15 = i3 | 6;
                            } else if ((i3 & 6) == 0) {
                                i15 = i3 | (composerKN.E2(function3) ? 4 : 2);
                            } else {
                                i15 = i3;
                            }
                            if ((i5 & 2048) != 0) {
                                if ((i3 & 48) == 0) {
                                    i15 |= composerKN.p5(this) ? 32 : 16;
                                }
                                int i18 = i15;
                                if ((i7 & 306783379) == 306783378 && (i18 & 19) == 18 && composerKN.xMQ()) {
                                    composerKN.wTp();
                                    f7 = f3;
                                    composer2 = composerKN;
                                    shape3 = shapeO;
                                    modifier4 = modifier2;
                                    scrollState4 = scrollState2;
                                    z6 = z4;
                                    f8 = f4;
                                    borderStroke3 = borderStroke;
                                } else {
                                    composerKN.e();
                                    if ((i2 & 1) != 0 || composerKN.rV9()) {
                                        Modifier modifier5 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                                        if ((i5 & 8) == 0) {
                                            scrollStateT = ScrollKt.t(0, composerKN, 0, 1);
                                            i7 &= -7169;
                                        } else {
                                            scrollStateT = scrollState2;
                                        }
                                        if (i9 != 0) {
                                            z4 = true;
                                        }
                                        if ((i5 & 32) == 0) {
                                            i16 = 6;
                                            shapeO = MenuDefaults.f26185n.O(composerKN, 6);
                                            i7 &= -458753;
                                        } else {
                                            i16 = 6;
                                        }
                                        if ((i5 & 64) != 0) {
                                            jN = MenuDefaults.f26185n.n(composerKN, i16);
                                            i7 &= -3670017;
                                        }
                                        float fJ2 = i10 == 0 ? MenuDefaults.f26185n.J2() : f3;
                                        float fNr = i12 == 0 ? MenuDefaults.f26185n.nr() : f4;
                                        if (i14 == 0) {
                                            modifier3 = modifier5;
                                            shape2 = shapeO;
                                            f5 = fJ2;
                                            j3 = jN;
                                            scrollState3 = scrollStateT;
                                            f6 = fNr;
                                            z5 = z4;
                                            borderStroke2 = null;
                                            composerKN.S();
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(720925481, i7, i18, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.android.kt:344)");
                                            }
                                            objIF = composerKN.iF();
                                            companion = Composer.INSTANCE;
                                            if (objIF == companion.n()) {
                                                objIF = SnapshotStateKt.xMQ(Unit.INSTANCE, SnapshotStateKt.gh());
                                                composerKN.o(objIF);
                                            }
                                            mutableState = (MutableState) objIF;
                                            View view = (View) composerKN.ty(AndroidCompositionLocals_androidKt.gh());
                                            density = (Density) composerKN.ty(CompositionLocalsKt.J2());
                                            iN = WindowInsets_androidKt.t(WindowInsets.INSTANCE, composerKN, 6).n(density);
                                            composerKN.eF(321499814);
                                            if (z2) {
                                                Object objIF5 = composerKN.iF();
                                                if (objIF5 == companion.n()) {
                                                    objIF5 = new Function0<Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1$1
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
                                                            mutableState.setValue(Unit.INSTANCE);
                                                        }
                                                    };
                                                    composerKN.o(objIF5);
                                                }
                                                ExposedDropdownMenu_androidKt.KN(view, density, (Function0) objIF5, composerKN, RendererCapabilities.DECODER_SUPPORT_MASK);
                                            }
                                            composerKN.Xw();
                                            objIF2 = composerKN.iF();
                                            if (objIF2 == companion.n()) {
                                                objIF2 = new MutableTransitionState(Boolean.FALSE);
                                                composerKN.o(objIF2);
                                            }
                                            mutableTransitionState = (MutableTransitionState) objIF2;
                                            mutableTransitionState.KN(Boolean.valueOf(z2));
                                            if (!((Boolean) mutableTransitionState.n()).booleanValue() || ((Boolean) mutableTransitionState.rl()).booleanValue()) {
                                                objIF3 = composerKN.iF();
                                                if (objIF3 == companion.n()) {
                                                    objIF3 = SnapshotStateKt__SnapshotStateKt.O(TransformOrigin.rl(TransformOrigin.INSTANCE.n()), null, 2, null);
                                                    composerKN.o(objIF3);
                                                }
                                                mutableState2 = (MutableState) objIF3;
                                                zP5 = composerKN.p5(density) | composerKN.t(iN);
                                                objIF4 = composerKN.iF();
                                                if (!zP5 || objIF4 == companion.n()) {
                                                    objIF4 = new ExposedDropdownMenuPositionProvider(density, iN, mutableState, 0, new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                                            n(intRect, intRect2);
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void n(IntRect intRect, IntRect intRect2) {
                                                            mutableState2.setValue(TransformOrigin.rl(MenuKt.KN(intRect, intRect2)));
                                                        }
                                                    }, 8, null);
                                                    composerKN.o(objIF4);
                                                }
                                                AndroidPopup_androidKt.n((ExposedDropdownMenuPositionProvider) objIF4, function02, ExposedDropdownMenuDefaults.f25784n.t(O(), composerKN, 48), ComposableLambdaKt.nr(-1082380263, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                        n(composer3, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void n(Composer composer3, int i19) {
                                                        if ((i19 & 3) == 2 && composer3.xMQ()) {
                                                            composer3.wTp();
                                                            return;
                                                        }
                                                        if (ComposerKt.v()) {
                                                            ComposerKt.p5(-1082380263, i19, -1, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu.<anonymous> (ExposedDropdownMenu.android.kt:379)");
                                                        }
                                                        MenuKt.n(this.f25746n.nr(modifier3, z5), mutableTransitionState, mutableState2, scrollState3, shape2, j3, f5, f6, borderStroke2, function3, composer3, (MutableTransitionState.nr << 3) | RendererCapabilities.DECODER_SUPPORT_MASK);
                                                        if (ComposerKt.v()) {
                                                            ComposerKt.M7();
                                                        }
                                                    }
                                                }, composerKN, 54), composerKN, (i7 & 112) | 3072, 0);
                                                composer2 = composerKN;
                                            } else {
                                                composer2 = composerKN;
                                            }
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                            modifier4 = modifier3;
                                            z6 = z5;
                                            scrollState4 = scrollState3;
                                            shape3 = shape2;
                                            jN = j3;
                                            f7 = f5;
                                            f8 = f6;
                                            borderStroke3 = borderStroke2;
                                        } else {
                                            borderStroke2 = borderStroke;
                                            modifier3 = modifier5;
                                            shape2 = shapeO;
                                            f5 = fJ2;
                                            j3 = jN;
                                            scrollState3 = scrollStateT;
                                            f6 = fNr;
                                        }
                                    } else {
                                        composerKN.wTp();
                                        if ((i5 & 8) != 0) {
                                            i7 &= -7169;
                                        }
                                        if ((i5 & 32) != 0) {
                                            i7 &= -458753;
                                        }
                                        if ((i5 & 64) != 0) {
                                            i7 &= -3670017;
                                        }
                                        f5 = f3;
                                        f6 = f4;
                                        borderStroke2 = borderStroke;
                                        shape2 = shapeO;
                                        j3 = jN;
                                        modifier3 = modifier2;
                                        scrollState3 = scrollState2;
                                    }
                                    z5 = z4;
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                    }
                                    objIF = composerKN.iF();
                                    companion = Composer.INSTANCE;
                                    if (objIF == companion.n()) {
                                    }
                                    mutableState = (MutableState) objIF;
                                    View view2 = (View) composerKN.ty(AndroidCompositionLocals_androidKt.gh());
                                    density = (Density) composerKN.ty(CompositionLocalsKt.J2());
                                    iN = WindowInsets_androidKt.t(WindowInsets.INSTANCE, composerKN, 6).n(density);
                                    composerKN.eF(321499814);
                                    if (z2) {
                                    }
                                    composerKN.Xw();
                                    objIF2 = composerKN.iF();
                                    if (objIF2 == companion.n()) {
                                    }
                                    mutableTransitionState = (MutableTransitionState) objIF2;
                                    mutableTransitionState.KN(Boolean.valueOf(z2));
                                    if (((Boolean) mutableTransitionState.n()).booleanValue()) {
                                        objIF3 = composerKN.iF();
                                        if (objIF3 == companion.n()) {
                                        }
                                        mutableState2 = (MutableState) objIF3;
                                        zP5 = composerKN.p5(density) | composerKN.t(iN);
                                        objIF4 = composerKN.iF();
                                        if (!zP5) {
                                            objIF4 = new ExposedDropdownMenuPositionProvider(density, iN, mutableState, 0, new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                                    n(intRect, intRect2);
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(IntRect intRect, IntRect intRect2) {
                                                    mutableState2.setValue(TransformOrigin.rl(MenuKt.KN(intRect, intRect2)));
                                                }
                                            }, 8, null);
                                            composerKN.o(objIF4);
                                            AndroidPopup_androidKt.n((ExposedDropdownMenuPositionProvider) objIF4, function02, ExposedDropdownMenuDefaults.f25784n.t(O(), composerKN, 48), ComposableLambdaKt.nr(-1082380263, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                    n(composer3, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(Composer composer3, int i19) {
                                                    if ((i19 & 3) == 2 && composer3.xMQ()) {
                                                        composer3.wTp();
                                                        return;
                                                    }
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.p5(-1082380263, i19, -1, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu.<anonymous> (ExposedDropdownMenu.android.kt:379)");
                                                    }
                                                    MenuKt.n(this.f25746n.nr(modifier3, z5), mutableTransitionState, mutableState2, scrollState3, shape2, j3, f5, f6, borderStroke2, function3, composer3, (MutableTransitionState.nr << 3) | RendererCapabilities.DECODER_SUPPORT_MASK);
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.M7();
                                                    }
                                                }
                                            }, composerKN, 54), composerKN, (i7 & 112) | 3072, 0);
                                            composer2 = composerKN;
                                            if (ComposerKt.v()) {
                                            }
                                            modifier4 = modifier3;
                                            z6 = z5;
                                            scrollState4 = scrollState3;
                                            shape3 = shape2;
                                            jN = j3;
                                            f7 = f5;
                                            f8 = f6;
                                            borderStroke3 = borderStroke2;
                                        }
                                    }
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh != null) {
                                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            n(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer3, int i19) {
                                            this.f25758n.t(z2, function0, modifier4, scrollState4, z6, shape3, jN, f7, f8, borderStroke3, function3, composer3, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i15 |= 48;
                            int i182 = i15;
                            if ((i7 & 306783379) == 306783378) {
                                composerKN.e();
                                if ((i2 & 1) != 0) {
                                    if (i8 == 0) {
                                    }
                                    if ((i5 & 8) == 0) {
                                    }
                                    if (i9 != 0) {
                                    }
                                    if ((i5 & 32) == 0) {
                                    }
                                    if ((i5 & 64) != 0) {
                                    }
                                    if (i10 == 0) {
                                    }
                                    if (i12 == 0) {
                                    }
                                    if (i14 == 0) {
                                    }
                                }
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh != null) {
                            }
                        }
                        i14 = i13;
                        if ((i5 & 1024) == 0) {
                        }
                        if ((i5 & 2048) != 0) {
                        }
                        int i1822 = i15;
                        if ((i7 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                        }
                    }
                    i12 = i11;
                    i13 = i5 & 512;
                    if (i13 != 0) {
                    }
                    i14 = i13;
                    if ((i5 & 1024) == 0) {
                    }
                    if ((i5 & 2048) != 0) {
                    }
                    int i18222 = i15;
                    if ((i7 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                z4 = z3;
                if ((i2 & 196608) != 0) {
                }
                if ((i2 & 1572864) != 0) {
                }
                i10 = i5 & 128;
                if (i10 == 0) {
                }
                i11 = i5 & 256;
                if (i11 == 0) {
                }
                i12 = i11;
                i13 = i5 & 512;
                if (i13 != 0) {
                }
                i14 = i13;
                if ((i5 & 1024) == 0) {
                }
                if ((i5 & 2048) != 0) {
                }
                int i182222 = i15;
                if ((i7 & 306783379) == 306783378) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            modifier2 = modifier;
            if ((i2 & 3072) == 0) {
            }
            i9 = i5 & 16;
            if (i9 != 0) {
            }
            z4 = z3;
            if ((i2 & 196608) != 0) {
            }
            if ((i2 & 1572864) != 0) {
            }
            i10 = i5 & 128;
            if (i10 == 0) {
            }
            i11 = i5 & 256;
            if (i11 == 0) {
            }
            i12 = i11;
            i13 = i5 & 512;
            if (i13 != 0) {
            }
            i14 = i13;
            if ((i5 & 1024) == 0) {
            }
            if ((i5 & 2048) != 0) {
            }
            int i1822222 = i15;
            if ((i7 & 306783379) == 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        function02 = function0;
        i8 = i5 & 4;
        if (i8 == 0) {
        }
        modifier2 = modifier;
        if ((i2 & 3072) == 0) {
        }
        i9 = i5 & 16;
        if (i9 != 0) {
        }
        z4 = z3;
        if ((i2 & 196608) != 0) {
        }
        if ((i2 & 1572864) != 0) {
        }
        i10 = i5 & 128;
        if (i10 == 0) {
        }
        i11 = i5 & 256;
        if (i11 == 0) {
        }
        i12 = i11;
        i13 = i5 & 512;
        if (i13 != 0) {
        }
        i14 = i13;
        if ((i5 & 1024) == 0) {
        }
        if ((i5 & 2048) != 0) {
        }
        int i18222222 = i15;
        if ((i7 & 306783379) == 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }
}
