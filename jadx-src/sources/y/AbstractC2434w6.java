package y;

import Dj7.AbstractC1328c;
import Dj7.CM;
import Dj7.QaP;
import Dj7.eO;
import Dj7.l4Z;
import P0j.Dsr;
import XFr.j;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.b;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: y.w6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class AbstractC2434w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f75547n = Dp.KN(12);

    /* JADX INFO: renamed from: y.w6$j */
    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC2429Ml.values().length];
            try {
                iArr[EnumC2429Ml.f75526O.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2429Ml.f75529t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2429Ml.f75527n.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(long j2, long j3, Modifier modifier, int i2, int i3, Composer composer, int i5) {
        O(j2, j3, modifier, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void O(long j2, long j3, Modifier modifier, Composer composer, final int i2, final int i3) {
        final long j4;
        int i5;
        long j5;
        int i7;
        Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1404456568);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            j4 = j2;
        } else if ((i2 & 6) == 0) {
            j4 = j2;
            i5 = (composerKN.nr(j4) ? 4 : 2) | i2;
        } else {
            j4 = j2;
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                j5 = j3;
                i5 |= composerKN.nr(j5) ? 32 : 16;
            }
            i7 = i3 & 4;
            if (i7 != 0) {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    modifier2 = modifier;
                    i5 |= composerKN.p5(modifier2) ? 256 : 128;
                }
                if ((i5 & 147) == 146 && composerKN.xMQ()) {
                    composerKN.wTp();
                } else {
                    if (i7 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-1404456568, i5, -1, "com.alightcreative.backup.ui.components.StorageFractionText (CloudStorageBanner.kt:154)");
                    }
                    CM.xMQ(Uo(j2, j3), modifier2, aD.w6.Ik(), TextAlign.KN(TextAlign.INSTANCE.rl()), H9N.j.f3810n.rl(composerKN, 6).wTp(), CollectionsKt.listOf(new QaP(TtmlNode.BOLD, new Dsr(false, false, false, true, false, null, 0L, null, 247, null))), composerKN, ((i5 >> 3) & 112) | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                    final long j6 = j5;
                    final Modifier modifier3 = modifier2;
                    scopeUpdateScopeGh.n(new Function2() { // from class: y.n
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AbstractC2434w6.J2(j4, j6, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            modifier2 = modifier;
            if ((i5 & 147) == 146) {
                if (i7 != 0) {
                }
                if (ComposerKt.v()) {
                }
                CM.xMQ(Uo(j2, j3), modifier2, aD.w6.Ik(), TextAlign.KN(TextAlign.INSTANCE.rl()), H9N.j.f3810n.rl(composerKN, 6).wTp(), CollectionsKt.listOf(new QaP(TtmlNode.BOLD, new Dsr(false, false, false, true, false, null, 0L, null, 247, null))), composerKN, ((i5 >> 3) & 112) | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                if (ComposerKt.v()) {
                }
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        j5 = j3;
        i7 = i3 & 4;
        if (i7 != 0) {
        }
        modifier2 = modifier;
        if ((i5 & 147) == 146) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    private static final String Uo(long j2, long j3) {
        Triple triple;
        if (j3 == 0) {
            triple = new Triple(Double.valueOf(XFr.j.gh(j2)), Double.valueOf(XFr.j.gh(j3)), "MB");
        } else {
            j.C0428j c0428j = XFr.j.f11812t;
            if (XFr.j.t(j3, c0428j.nr(1.0d)) >= 0) {
                triple = new Triple(Double.valueOf(XFr.j.qie(j2)), Double.valueOf(XFr.j.qie(j3)), "TB");
            } else if (XFr.j.t(j3, c0428j.n(1.0d)) >= 0) {
                triple = new Triple(Double.valueOf(XFr.j.xMQ(j2)), Double.valueOf(XFr.j.xMQ(j3)), "GB");
            } else if (XFr.j.t(j3, c0428j.t(1.0d)) >= 0) {
                triple = new Triple(Double.valueOf(XFr.j.gh(j2)), Double.valueOf(XFr.j.gh(j3)), "MB");
            } else {
                if (XFr.j.t(j3, c0428j.rl(1.0d)) < 0) {
                    return "{bold}" + j2 + "{/bold}/" + j3 + " bytes";
                }
                triple = new Triple(Double.valueOf(XFr.j.mUb(j2)), Double.valueOf(XFr.j.mUb(j3)), "KB");
            }
        }
        String str = String.format("{bold}%.1f{/bold}/%.1f %s", Arrays.copyOf(new Object[]{Double.valueOf(((Number) triple.component1()).doubleValue()), Double.valueOf(((Number) triple.component2()).doubleValue()), (String) triple.component3()}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr(long j2, long j3, EnumC2429Ml enumC2429Ml, Modifier modifier, boolean z2, Function0 function0, int i2, int i3, Composer composer, int i5) {
        t(j2, j3, enumC2429Ml, modifier, z2, function0, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final long j2, final long j3, final EnumC2429Ml fillLevel, Modifier modifier, boolean z2, final Function0 onGetMoreSpaceClicked, Composer composer, final int i2, final int i3) {
        int i5;
        int i7;
        Modifier modifier2;
        int i8;
        final boolean z3;
        boolean z4;
        int i9;
        long jCk;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        int iN2;
        Composer composerN2;
        Function2 function2Rl2;
        int iN3;
        Composer composerN3;
        Function2 function2Rl3;
        Composer composer2;
        long j4;
        int i10;
        Modifier.Companion companion;
        Modifier modifier3;
        final Modifier modifier4;
        String str;
        int i11;
        String str2;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(fillLevel, "fillLevel");
        Intrinsics.checkNotNullParameter(onGetMoreSpaceClicked, "onGetMoreSpaceClicked");
        Composer composerKN = composer.KN(-800465766);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = i2 | (composerKN.nr(j2) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.nr(j3) ? 32 : 16;
        }
        int i12 = i5;
        if ((i3 & 4) != 0) {
            i12 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            i7 = 8;
        } else {
            i7 = 8;
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i12 |= composerKN.p5(fillLevel) ? 256 : 128;
            }
        }
        int i13 = i3 & 8;
        if (i13 != 0) {
            i12 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                modifier2 = modifier;
                i12 |= composerKN.p5(modifier2) ? 2048 : 1024;
            }
            i8 = i3 & 16;
            if (i8 != 0) {
                if ((i2 & 24576) == 0) {
                    z3 = z2;
                    i12 |= composerKN.n(z3) ? 16384 : 8192;
                }
                if ((i3 & 32) != 0) {
                    i12 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    i12 |= composerKN.E2(onGetMoreSpaceClicked) ? 131072 : 65536;
                }
                if ((i12 & 74899) == 74898 && composerKN.xMQ()) {
                    composerKN.wTp();
                    modifier4 = modifier2;
                    composer2 = composerKN;
                } else {
                    Modifier modifier5 = i13 == 0 ? Modifier.INSTANCE : modifier2;
                    z4 = i8 == 0 ? true : z3;
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-800465766, i12, -1, "com.alightcreative.backup.ui.components.CloudStorageBanner (CloudStorageBanner.kt:63)");
                    }
                    float fCoerceAtMost = 1.0f;
                    if (j3 == 0) {
                        fCoerceAtMost = RangesKt.coerceAtMost((j2 * 1.0f) / j3, 1.0f);
                    } else if (j2 <= 0) {
                        fCoerceAtMost = 0.0f;
                    }
                    i9 = j.$EnumSwitchMapping$0[fillLevel.ordinal()];
                    if (i9 != 1) {
                        jCk = aD.w6.ck();
                    } else if (i9 == 2) {
                        jCk = aD.w6.r();
                    } else {
                        if (i9 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        jCk = aD.w6.o();
                    }
                    long j5 = jCk;
                    Modifier modifierKN = SizeKt.KN(modifier5, 0.0f, 1, null);
                    long jQZ6 = aD.w6.QZ6();
                    float fKN = Dp.KN(0);
                    float f3 = f75547n;
                    float f4 = 16;
                    Modifier modifierXMQ = PaddingKt.xMQ(BackgroundKt.nr(ClipKt.n(AbstractC1328c.n(modifierKN, jQZ6, fKN, f3, (b.f61769v & 8) != 0 ? Dp.KN(0) : 0.0f, (b.f61769v & 16) != 0 ? Dp.KN(0) : 0.0f, (b.f61769v & 32) != 0 ? 1.0f : 0.0f, (b.f61769v & 64) != 0 ? 1.0f : 0.0f), RoundedCornerShapeKt.t(f3)), Color.INSTANCE.KN(), null, 2, null), Dp.KN(f4));
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
                    iN = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                    Modifier modifierO = ComposedModifierKt.O(composerKN, modifierXMQ);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0 function0N = companion3.n();
                    if (composerKN.getApplier() == null) {
                        ComposablesKt.t();
                    }
                    composerKN.T();
                    if (composerKN.getInserting()) {
                        composerKN.r();
                    } else {
                        composerKN.s7N(function0N);
                    }
                    composerN = Updater.n(composerKN);
                    Updater.O(composerN, measurePolicyUo, companion3.t());
                    Updater.O(composerN, compositionLocalMapIk, companion3.O());
                    function2Rl = companion3.rl();
                    if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                        composerN.o(Integer.valueOf(iN));
                        composerN.az(Integer.valueOf(iN), function2Rl);
                    }
                    Updater.O(composerN, modifierO, companion3.nr());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    Arrangement arrangement = Arrangement.f17400n;
                    MeasurePolicy measurePolicyN = ColumnKt.n(arrangement.Uo(), companion2.gh(), composerKN, 0);
                    iN2 = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                    Modifier modifierO2 = ComposedModifierKt.O(composerKN, companion4);
                    Function0 function0N2 = companion3.n();
                    if (composerKN.getApplier() == null) {
                        ComposablesKt.t();
                    }
                    composerKN.T();
                    if (composerKN.getInserting()) {
                        composerKN.r();
                    } else {
                        composerKN.s7N(function0N2);
                    }
                    composerN2 = Updater.n(composerKN);
                    Updater.O(composerN2, measurePolicyN, companion3.t());
                    Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
                    function2Rl2 = companion3.rl();
                    if (!composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                        composerN2.o(Integer.valueOf(iN2));
                        composerN2.az(Integer.valueOf(iN2), function2Rl2);
                    }
                    Updater.O(composerN2, modifierO2, companion3.nr());
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                    MeasurePolicy measurePolicyRl = RowKt.rl(arrangement.J2(), companion2.xMQ(), composerKN, 48);
                    iN3 = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
                    Modifier modifierO3 = ComposedModifierKt.O(composerKN, companion4);
                    Function0 function0N3 = companion3.n();
                    if (composerKN.getApplier() == null) {
                        ComposablesKt.t();
                    }
                    composerKN.T();
                    if (composerKN.getInserting()) {
                        composerKN.r();
                    } else {
                        composerKN.s7N(function0N3);
                    }
                    composerN3 = Updater.n(composerKN);
                    Updater.O(composerN3, measurePolicyRl, companion3.t());
                    Updater.O(composerN3, compositionLocalMapIk3, companion3.O());
                    function2Rl3 = companion3.rl();
                    if (!composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                        composerN3.o(Integer.valueOf(iN3));
                        composerN3.az(Integer.valueOf(iN3), function2Rl3);
                    }
                    Updater.O(composerN3, modifierO3, companion3.nr());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
                    composerKN.eF(122717162);
                    if (fillLevel == EnumC2429Ml.f75527n) {
                        j4 = j5;
                        ImageKt.n(PainterResources_androidKt.t(2131232063, composerKN, 6), null, null, null, null, 0.0f, ColorFilter.Companion.rl(ColorFilter.INSTANCE, j5, 0, 2, null), composerKN, 48, 60);
                        composer2 = composerKN;
                        i10 = 6;
                        SpacerKt.n(SizeKt.ViF(companion4, Dp.KN(6)), composer2, 6);
                    } else {
                        composer2 = composerKN;
                        j4 = j5;
                        i10 = 6;
                    }
                    composer2.Xw();
                    String strT = StringResources_androidKt.t(2132020238, composer2, i10);
                    Modifier modifierRl = RowScope.rl(rowScopeInstance, companion4, 2.0f, false, 2, null);
                    H9N.j jVar = H9N.j.f3810n;
                    TextKt.t(strT, modifierRl, aD.w6.F(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.rl(composer2, i10).nY(), composer2, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65528);
                    SpacerKt.n(SizeKt.ViF(companion4, Dp.KN(6)), composer2, 6);
                    Modifier modifierRl2 = RowScope.rl(rowScopeInstance, companion4, 1.0f, false, 2, null);
                    int i14 = i12;
                    O(j2, j3, modifierRl2, composer2, i14 & 126, 0);
                    composer2.XQ();
                    composer2.eF(-1753167263);
                    if (fillLevel != EnumC2429Ml.f75526O) {
                        SpacerKt.n(SizeKt.xMQ(companion4, Dp.KN(i7)), composer2, 6);
                        composer2.eF(-1753163411);
                        if (z4) {
                            str = " " + StringResources_androidKt.t(2132020235, composer2, 6);
                        } else {
                            str = "";
                        }
                        composer2.Xw();
                        if (XFr.j.t(j2, j3) >= 0) {
                            composer2.eF(1486667581);
                            i11 = 6;
                            str2 = StringResources_androidKt.t(2132020234, composer2, 6) + str;
                            composer2.Xw();
                        } else {
                            i11 = 6;
                            composer2.eF(1486777104);
                            str2 = StringResources_androidKt.t(2132019588, composer2, 6) + str;
                            composer2.Xw();
                        }
                        String str3 = str2;
                        companion = companion4;
                        TextKt.t(str3, null, aD.w6.Ik(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.rl(composer2, i11).wTp(), composer2, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65530);
                    } else {
                        companion = companion4;
                    }
                    composer2.Xw();
                    SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(12)), composer2, 6);
                    l4Z.nr(fCoerceAtMost > 0.0f ? 0.0f : RangesKt.coerceAtLeast(fCoerceAtMost, 0.01f), j4, composer2, 0, 0);
                    composer2.eF(-1753138585);
                    if (z4) {
                        modifier3 = modifier5;
                    } else {
                        SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(f4)), composer2, 6);
                        String strT2 = StringResources_androidKt.t(2132020236, composer2, 6);
                        Dj7.CN3 cn3 = Dj7.CN3.f1600t;
                        modifier3 = modifier5;
                        eO.J2(onGetMoreSpaceClicked, strT2, null, null, cn3, TextStyle.t(Dj7.fuX.O(cn3, composer2, 6), aD.w6.F(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), 0, 0, Dp.KN(40), null, null, PaddingKt.rl(Dp.KN(14), Dp.KN(10)), false, composer2, (14 & (i14 >> 15)) | 100687872, 48, 5836);
                    }
                    composer2.Xw();
                    composer2.XQ();
                    composer2.XQ();
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    modifier4 = modifier3;
                    z3 = z4;
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2() { // from class: y.j
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AbstractC2434w6.nr(j2, j3, fillLevel, modifier4, z3, onGetMoreSpaceClicked, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i12 |= 24576;
            z3 = z2;
            if ((i3 & 32) != 0) {
            }
            if ((i12 & 74899) == 74898) {
                if (i13 == 0) {
                }
                if (i8 == 0) {
                }
                if (ComposerKt.v()) {
                }
                float fCoerceAtMost2 = 1.0f;
                if (j3 == 0) {
                }
                i9 = j.$EnumSwitchMapping$0[fillLevel.ordinal()];
                if (i9 != 1) {
                }
                long j52 = jCk;
                Modifier modifierKN2 = SizeKt.KN(modifier5, 0.0f, 1, null);
                long jQZ62 = aD.w6.QZ6();
                float fKN2 = Dp.KN(0);
                float f32 = f75547n;
                float f42 = 16;
                Modifier modifierXMQ2 = PaddingKt.xMQ(BackgroundKt.nr(ClipKt.n(AbstractC1328c.n(modifierKN2, jQZ62, fKN2, f32, (b.f61769v & 8) != 0 ? Dp.KN(0) : 0.0f, (b.f61769v & 16) != 0 ? Dp.KN(0) : 0.0f, (b.f61769v & 32) != 0 ? 1.0f : 0.0f, (b.f61769v & 64) != 0 ? 1.0f : 0.0f), RoundedCornerShapeKt.t(f32)), Color.INSTANCE.KN(), null, 2, null), Dp.KN(f42));
                Alignment.Companion companion22 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion22.HI(), false);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk4 = composerKN.Ik();
                Modifier modifierO4 = ComposedModifierKt.O(composerKN, modifierXMQ2);
                ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                Function0 function0N4 = companion32.n();
                if (composerKN.getApplier() == null) {
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                }
                composerN = Updater.n(composerKN);
                Updater.O(composerN, measurePolicyUo2, companion32.t());
                Updater.O(composerN, compositionLocalMapIk4, companion32.O());
                function2Rl = companion32.rl();
                if (!composerN.getInserting()) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                    Updater.O(composerN, modifierO4, companion32.nr());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                    Modifier.Companion companion42 = Modifier.INSTANCE;
                    Arrangement arrangement2 = Arrangement.f17400n;
                    MeasurePolicy measurePolicyN2 = ColumnKt.n(arrangement2.Uo(), companion22.gh(), composerKN, 0);
                    iN2 = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk22 = composerKN.Ik();
                    Modifier modifierO22 = ComposedModifierKt.O(composerKN, companion42);
                    Function0 function0N22 = companion32.n();
                    if (composerKN.getApplier() == null) {
                    }
                    composerKN.T();
                    if (composerKN.getInserting()) {
                    }
                    composerN2 = Updater.n(composerKN);
                    Updater.O(composerN2, measurePolicyN2, companion32.t());
                    Updater.O(composerN2, compositionLocalMapIk22, companion32.O());
                    function2Rl2 = companion32.rl();
                    if (!composerN2.getInserting()) {
                        composerN2.o(Integer.valueOf(iN2));
                        composerN2.az(Integer.valueOf(iN2), function2Rl2);
                        Updater.O(composerN2, modifierO22, companion32.nr());
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.f17468n;
                        MeasurePolicy measurePolicyRl2 = RowKt.rl(arrangement2.J2(), companion22.xMQ(), composerKN, 48);
                        iN3 = ComposablesKt.n(composerKN, 0);
                        CompositionLocalMap compositionLocalMapIk32 = composerKN.Ik();
                        Modifier modifierO32 = ComposedModifierKt.O(composerKN, companion42);
                        Function0 function0N32 = companion32.n();
                        if (composerKN.getApplier() == null) {
                        }
                        composerKN.T();
                        if (composerKN.getInserting()) {
                        }
                        composerN3 = Updater.n(composerKN);
                        Updater.O(composerN3, measurePolicyRl2, companion32.t());
                        Updater.O(composerN3, compositionLocalMapIk32, companion32.O());
                        function2Rl3 = companion32.rl();
                        if (!composerN3.getInserting()) {
                            composerN3.o(Integer.valueOf(iN3));
                            composerN3.az(Integer.valueOf(iN3), function2Rl3);
                            Updater.O(composerN3, modifierO32, companion32.nr());
                            RowScopeInstance rowScopeInstance2 = RowScopeInstance.f17780n;
                            composerKN.eF(122717162);
                            if (fillLevel == EnumC2429Ml.f75527n) {
                            }
                            composer2.Xw();
                            String strT3 = StringResources_androidKt.t(2132020238, composer2, i10);
                            Modifier modifierRl3 = RowScope.rl(rowScopeInstance2, companion42, 2.0f, false, 2, null);
                            H9N.j jVar2 = H9N.j.f3810n;
                            TextKt.t(strT3, modifierRl3, aD.w6.F(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar2.rl(composer2, i10).nY(), composer2, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65528);
                            SpacerKt.n(SizeKt.ViF(companion42, Dp.KN(6)), composer2, 6);
                            Modifier modifierRl22 = RowScope.rl(rowScopeInstance2, companion42, 1.0f, false, 2, null);
                            int i142 = i12;
                            O(j2, j3, modifierRl22, composer2, i142 & 126, 0);
                            composer2.XQ();
                            composer2.eF(-1753167263);
                            if (fillLevel != EnumC2429Ml.f75526O) {
                            }
                            composer2.Xw();
                            SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(12)), composer2, 6);
                            l4Z.nr(fCoerceAtMost2 > 0.0f ? 0.0f : RangesKt.coerceAtLeast(fCoerceAtMost2, 0.01f), j4, composer2, 0, 0);
                            composer2.eF(-1753138585);
                            if (z4) {
                            }
                            composer2.Xw();
                            composer2.XQ();
                            composer2.XQ();
                            if (ComposerKt.v()) {
                            }
                            modifier4 = modifier3;
                            z3 = z4;
                        }
                    }
                }
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i8 = i3 & 16;
        if (i8 != 0) {
        }
        z3 = z2;
        if ((i3 & 32) != 0) {
        }
        if ((i12 & 74899) == 74898) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }
}
