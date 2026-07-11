package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\fJ\u0019\u0010\u0011\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0016\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0018\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001d\u0010\u001a\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d²\u0006\f\u0010\u001b\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\u001c\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material/TabRowDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/unit/Dp;", "thickness", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_COLOR, "", c.f62177j, "(Landroidx/compose/ui/Modifier;FJLandroidx/compose/runtime/Composer;II)V", "height", "rl", "Landroidx/compose/material/TabPosition;", "currentTabPosition", "O", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/TabPosition;)Landroidx/compose/ui/Modifier;", "F", "getDividerThickness-D9Ej5fM", "()F", "DividerThickness", "t", "IndicatorHeight", "nr", "ScrollableTabRowPadding", "currentTabWidth", "indicatorOffset", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,491:1\n75#2:492\n75#2:493\n135#3:494\n149#4:495\n149#4:496\n149#4:497\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowDefaults\n*L\n357#1:492\n374#1:493\n389#1:494\n414#1:495\n417#1:496\n420#1:497\n*E\n"})
public final class TabRowDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final TabRowDefaults f23397n = new TabRowDefaults();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final float DividerThickness = Dp.KN(1);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final float IndicatorHeight = Dp.KN(2);

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private static final float ScrollableTabRowPadding = Dp.KN(52);

    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(Modifier modifier, float f3, long j2, Composer composer, final int i2, final int i3) {
        final Modifier modifier2;
        int i5;
        float f4;
        long jAz;
        final float f5;
        final long j3;
        ScopeUpdateScope scopeUpdateScopeGh;
        float f6;
        float f7;
        long j4;
        Modifier modifier3;
        Composer composerKN = composer.KN(910934799);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i5 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i5 = (composerKN.p5(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i3 & 2) == 0) {
                f4 = f3;
                int i8 = composerKN.rl(f4) ? 32 : 16;
                i5 |= i8;
            } else {
                f4 = f3;
            }
            i5 |= i8;
        } else {
            f4 = f3;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            jAz = j2;
            i5 |= ((i3 & 4) == 0 && composerKN.nr(jAz)) ? 256 : 128;
        } else {
            jAz = j2;
        }
        if ((i3 & 8) == 0) {
            if ((i2 & 3072) == 0) {
                i5 |= composerKN.p5(this) ? 2048 : 1024;
            }
            if (composerKN.HI((i5 & 1171) == 1170, i5 & 1)) {
                composerKN.wTp();
                f5 = f4;
                j3 = jAz;
            } else {
                composerKN.e();
                if ((i2 & 1) == 0 || composerKN.rV9()) {
                    Modifier modifier4 = i7 != 0 ? Modifier.INSTANCE : modifier2;
                    if ((i3 & 2) != 0) {
                        f6 = DividerThickness;
                        i5 &= -113;
                    } else {
                        f6 = f4;
                    }
                    if ((i3 & 4) != 0) {
                        jAz = Color.az(((Color) composerKN.ty(ContentColorKt.n())).getValue(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                        i5 &= -897;
                    }
                    f7 = f6;
                    j4 = jAz;
                    modifier3 = modifier4;
                } else {
                    composerKN.wTp();
                    if ((i3 & 2) != 0) {
                        i5 &= -113;
                    }
                    if ((i3 & 4) != 0) {
                        i5 &= -897;
                    }
                    f7 = f4;
                    j4 = jAz;
                    modifier3 = modifier2;
                }
                composerKN.S();
                if (ComposerKt.v()) {
                    ComposerKt.p5(910934799, i5, -1, "androidx.compose.material.TabRowDefaults.Divider (TabRow.kt:357)");
                }
                DividerKt.n(modifier3, j4, f7, 0.0f, composerKN, (i5 & 14) | ((i5 >> 3) & 112) | ((i5 << 3) & 896), 8);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier2 = modifier3;
                j3 = j4;
                f5 = f7;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowDefaults$Divider$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        n(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer2, int i9) {
                        this.f23400n.n(modifier2, f5, j3, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                    }
                });
                return;
            }
            return;
        }
        i5 |= 3072;
        if (composerKN.HI((i5 & 1171) == 1170, i5 & 1)) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    public final float nr() {
        return ScrollableTabRowPadding;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void rl(Modifier modifier, float f3, long j2, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        float f4;
        long value;
        TabRowDefaults tabRowDefaults;
        final Modifier modifier3;
        final float f5;
        final long j3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1499002201);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i5 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i5 = (composerKN.p5(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i3 & 2) == 0) {
                f4 = f3;
                int i8 = composerKN.rl(f4) ? 32 : 16;
                i5 |= i8;
            } else {
                f4 = f3;
            }
            i5 |= i8;
        } else {
            f4 = f3;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            if ((i3 & 4) == 0) {
                value = j2;
                int i9 = composerKN.nr(value) ? 256 : 128;
                i5 |= i9;
            } else {
                value = j2;
            }
            i5 |= i9;
        } else {
            value = j2;
        }
        if ((i3 & 8) == 0) {
            if ((i2 & 3072) == 0) {
                tabRowDefaults = this;
                i5 |= composerKN.p5(tabRowDefaults) ? 2048 : 1024;
            }
            if (composerKN.HI((i5 & 1171) == 1170, i5 & 1)) {
                composerKN.wTp();
                modifier3 = modifier2;
                f5 = f4;
                j3 = value;
            } else {
                composerKN.e();
                if ((i2 & 1) == 0 || composerKN.rV9()) {
                    modifier3 = i7 != 0 ? Modifier.INSTANCE : modifier2;
                    if ((i3 & 2) != 0) {
                        f5 = IndicatorHeight;
                        i5 &= -113;
                    } else {
                        f5 = f4;
                    }
                    if ((i3 & 4) != 0) {
                        value = ((Color) composerKN.ty(ContentColorKt.n())).getValue();
                        i5 &= -897;
                    }
                } else {
                    composerKN.wTp();
                    if ((i3 & 2) != 0) {
                        i5 &= -113;
                    }
                    if ((i3 & 4) != 0) {
                        i5 &= -897;
                    }
                    modifier3 = modifier2;
                    f5 = f4;
                }
                long j4 = value;
                composerKN.S();
                if (ComposerKt.v()) {
                    ComposerKt.p5(1499002201, i5, -1, "androidx.compose.material.TabRowDefaults.Indicator (TabRow.kt:374)");
                }
                BoxKt.n(BackgroundKt.nr(SizeKt.xMQ(SizeKt.KN(modifier3, 0.0f, 1, null), f5), j4, null, 2, null), composerKN, 0);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                j3 = j4;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                final TabRowDefaults tabRowDefaults2 = tabRowDefaults;
                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowDefaults$Indicator$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        n(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer2, int i10) {
                        this.f23405n.rl(modifier3, f5, j3, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                    }
                });
                return;
            }
            return;
        }
        i5 |= 3072;
        tabRowDefaults = this;
        if (composerKN.HI((i5 & 1171) == 1170, i5 & 1)) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    public final float t() {
        return IndicatorHeight;
    }

    private TabRowDefaults() {
    }

    public final Modifier O(Modifier modifier, final TabPosition tabPosition) {
        Function1<InspectorInfo, Unit> function1N;
        if (InspectableValueKt.rl()) {
            function1N = new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material.TabRowDefaults$tabIndicatorOffset$$inlined$debugInspectorInfo$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                    n(inspectorInfo);
                    return Unit.INSTANCE;
                }

                public final void n(InspectorInfo inspectorInfo) {
                    inspectorInfo.rl("tabIndicatorOffset");
                    inspectorInfo.t(tabPosition);
                }
            };
        } else {
            function1N = InspectableValueKt.n();
        }
        return ComposedModifierKt.rl(modifier, function1N, new TabRowDefaults$tabIndicatorOffset$2(tabPosition));
    }
}
