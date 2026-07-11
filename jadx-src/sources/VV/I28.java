package VV;

import FQq.nKK;
import FQq.s4;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ScaleFactor;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class I28 {

    static final class j extends Lambda implements Function2 {
        final /* synthetic */ Alignment E2;
        final /* synthetic */ boolean J2;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        final /* synthetic */ Map f10888N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Modifier f10889O;
        final /* synthetic */ int P5;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ nKK f10890S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        final /* synthetic */ boolean f10891T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        final /* synthetic */ int f10892U;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        final /* synthetic */ boolean f10893X;
        final /* synthetic */ boolean Xw;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ boolean f10894Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ContentScale f10895e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f10896g;
        final /* synthetic */ int jB;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ FQq.Dsr f10897n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f10898o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ boolean f10899r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function0 f10900t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ FQq.j f10901v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(FQq.Dsr dsr, Function0 function0, Modifier modifier, boolean z2, boolean z3, boolean z4, boolean z5, nKK nkk, boolean z6, Pl pl, Alignment alignment, ContentScale contentScale, boolean z7, boolean z9, Map map, FQq.j jVar, boolean z10, int i2, int i3, int i5) {
            super(2);
            this.f10897n = dsr;
            this.f10900t = function0;
            this.f10889O = modifier;
            this.J2 = z2;
            this.f10899r = z3;
            this.f10898o = z4;
            this.f10894Z = z5;
            this.f10890S = nkk;
            this.f10896g = z6;
            this.E2 = alignment;
            this.f10895e = contentScale;
            this.f10893X = z7;
            this.f10891T = z9;
            this.f10888N = map;
            this.f10901v = jVar;
            this.Xw = z10;
            this.jB = i2;
            this.f10892U = i3;
            this.P5 = i5;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void n(Composer composer, int i2) {
            I28.n(this.f10897n, this.f10900t, this.f10889O, this.J2, this.f10899r, this.f10898o, this.f10894Z, this.f10890S, this.f10896g, null, this.E2, this.f10895e, this.f10893X, this.f10891T, this.f10888N, this.f10901v, this.Xw, composer, RecomposeScopeImplKt.n(this.jB | 1), RecomposeScopeImplKt.n(this.f10892U), this.P5);
        }
    }

    static final class n extends Lambda implements Function1 {
        final /* synthetic */ FQq.Dsr E2;
        final /* synthetic */ Matrix J2;
        final /* synthetic */ MutableState M7;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        final /* synthetic */ boolean f10902N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Alignment f10903O;
        final /* synthetic */ Function0 P5;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ nKK f10904S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        final /* synthetic */ boolean f10905T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        final /* synthetic */ Context f10906U;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        final /* synthetic */ boolean f10907X;
        final /* synthetic */ boolean Xw;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ boolean f10908Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Map f10909e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ FQq.j f10910g;
        final /* synthetic */ boolean jB;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Rect f10911n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f10912o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ com.airbnb.lottie.Xo f10913r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ContentScale f10914t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ boolean f10915v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(Rect rect, ContentScale contentScale, Alignment alignment, Matrix matrix, com.airbnb.lottie.Xo xo, boolean z2, boolean z3, nKK nkk, FQq.j jVar, FQq.Dsr dsr, Map map, Pl pl, boolean z4, boolean z5, boolean z6, boolean z7, boolean z9, boolean z10, Context context, Function0 function0, MutableState mutableState) {
            super(1);
            this.f10911n = rect;
            this.f10914t = contentScale;
            this.f10903O = alignment;
            this.J2 = matrix;
            this.f10913r = xo;
            this.f10912o = z2;
            this.f10908Z = z3;
            this.f10904S = nkk;
            this.f10910g = jVar;
            this.E2 = dsr;
            this.f10909e = map;
            this.f10907X = z4;
            this.f10905T = z5;
            this.f10902N = z6;
            this.f10915v = z7;
            this.Xw = z9;
            this.jB = z10;
            this.f10906U = context;
            this.P5 = function0;
            this.M7 = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((DrawScope) obj);
            return Unit.INSTANCE;
        }

        public final void n(DrawScope Canvas) {
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            Rect rect = this.f10911n;
            ContentScale contentScale = this.f10914t;
            Alignment alignment = this.f10903O;
            Matrix matrix = this.J2;
            com.airbnb.lottie.Xo xo = this.f10913r;
            boolean z2 = this.f10912o;
            boolean z3 = this.f10908Z;
            nKK nkk = this.f10904S;
            FQq.j jVar = this.f10910g;
            FQq.Dsr dsr = this.E2;
            Map map = this.f10909e;
            boolean z4 = this.f10907X;
            boolean z5 = this.f10905T;
            boolean z6 = this.f10902N;
            boolean z7 = this.f10915v;
            boolean z9 = this.Xw;
            boolean z10 = this.jB;
            Context context = this.f10906U;
            Function0 function0 = this.P5;
            MutableState mutableState = this.M7;
            Canvas canvasKN = Canvas.getDrawContext().KN();
            long jN = SizeKt.n(rect.width(), rect.height());
            long jN2 = IntSizeKt.n(MathKt.roundToInt(Size.gh(Canvas.t())), MathKt.roundToInt(Size.xMQ(Canvas.t())));
            long jN3 = contentScale.n(jN, Canvas.t());
            long jN4 = alignment.n(I28.O(jN, jN3), jN2, Canvas.getLayoutDirection());
            matrix.reset();
            matrix.preTranslate(IntOffset.gh(jN4), IntOffset.qie(jN4));
            matrix.preScale(ScaleFactor.t(jN3), ScaleFactor.nr(jN3));
            xo.g(s4.MergePathsApi19, z2);
            xo.W(z3);
            xo.ER(nkk);
            xo.ofS(jVar);
            xo.G7(dsr);
            xo.ul(map);
            I28.t(mutableState);
            xo.K(z4);
            xo.xg(z5);
            xo.pJg(z6);
            xo.mYa(z7);
            xo.Mx(z9);
            xo.C(z10);
            ES.fuX fuxU = xo.U();
            if (xo.r(context) || fuxU == null) {
                xo.tUK(((Number) function0.invoke()).floatValue());
            } else {
                xo.tUK(fuxU.rl);
            }
            xo.setBounds(0, 0, rect.width(), rect.height());
            xo.aYN(AndroidCanvas_androidKt.nr(canvasKN), matrix);
        }
    }

    static final class w6 extends Lambda implements Function2 {
        final /* synthetic */ Alignment E2;
        final /* synthetic */ boolean J2;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        final /* synthetic */ Map f10916N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Modifier f10917O;
        final /* synthetic */ int P5;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ nKK f10918S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        final /* synthetic */ boolean f10919T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        final /* synthetic */ int f10920U;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        final /* synthetic */ boolean f10921X;
        final /* synthetic */ boolean Xw;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ boolean f10922Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ContentScale f10923e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f10924g;
        final /* synthetic */ int jB;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ FQq.Dsr f10925n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f10926o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ boolean f10927r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function0 f10928t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ FQq.j f10929v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w6(FQq.Dsr dsr, Function0 function0, Modifier modifier, boolean z2, boolean z3, boolean z4, boolean z5, nKK nkk, boolean z6, Pl pl, Alignment alignment, ContentScale contentScale, boolean z7, boolean z9, Map map, FQq.j jVar, boolean z10, int i2, int i3, int i5) {
            super(2);
            this.f10925n = dsr;
            this.f10928t = function0;
            this.f10917O = modifier;
            this.J2 = z2;
            this.f10927r = z3;
            this.f10926o = z4;
            this.f10922Z = z5;
            this.f10918S = nkk;
            this.f10924g = z6;
            this.E2 = alignment;
            this.f10923e = contentScale;
            this.f10921X = z7;
            this.f10919T = z9;
            this.f10916N = map;
            this.f10929v = jVar;
            this.Xw = z10;
            this.jB = i2;
            this.f10920U = i3;
            this.P5 = i5;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void n(Composer composer, int i2) {
            I28.n(this.f10925n, this.f10928t, this.f10917O, this.J2, this.f10927r, this.f10926o, this.f10922Z, this.f10918S, this.f10924g, null, this.E2, this.f10923e, this.f10921X, this.f10919T, this.f10916N, this.f10929v, this.Xw, composer, RecomposeScopeImplKt.n(this.jB | 1), RecomposeScopeImplKt.n(this.f10920U), this.P5);
        }
    }

    public static final void n(FQq.Dsr dsr, Function0 progress, Modifier modifier, boolean z2, boolean z3, boolean z4, boolean z5, nKK nkk, boolean z6, Pl pl, Alignment alignment, ContentScale contentScale, boolean z7, boolean z9, Map map, FQq.j jVar, boolean z10, Composer composer, int i2, int i3, int i5) {
        Intrinsics.checkNotNullParameter(progress, "progress");
        Composer composerKN = composer.KN(382909894);
        Modifier modifier2 = (i5 & 4) != 0 ? Modifier.INSTANCE : modifier;
        boolean z11 = (i5 & 8) != 0 ? false : z2;
        boolean z12 = (i5 & 16) != 0 ? false : z3;
        boolean z13 = (i5 & 32) != 0 ? true : z4;
        boolean z14 = (i5 & 64) != 0 ? false : z5;
        nKK nkk2 = (i5 & 128) != 0 ? nKK.AUTOMATIC : nkk;
        boolean z15 = (i5 & 256) != 0 ? false : z6;
        Pl pl3 = (i5 & 512) != 0 ? null : pl;
        Alignment alignmentO = (i5 & 1024) != 0 ? Alignment.INSTANCE.O() : alignment;
        ContentScale contentScaleO = (i5 & 2048) != 0 ? ContentScale.INSTANCE.O() : contentScale;
        boolean z16 = (i5 & 4096) != 0 ? true : z7;
        boolean z17 = (i5 & 8192) != 0 ? false : z9;
        Map map2 = (i5 & 16384) != 0 ? null : map;
        FQq.j jVar2 = (i5 & 32768) != 0 ? FQq.j.AUTOMATIC : jVar;
        boolean z18 = (i5 & 65536) != 0 ? false : z10;
        if (ComposerKt.v()) {
            ComposerKt.p5(382909894, i2, i3, "com.airbnb.lottie.compose.LottieAnimation (LottieAnimation.kt:97)");
        }
        composerKN.te(185152185);
        Object objIF = composerKN.iF();
        Composer.Companion companion = Composer.INSTANCE;
        if (objIF == companion.n()) {
            objIF = new com.airbnb.lottie.Xo();
            composerKN.o(objIF);
        }
        com.airbnb.lottie.Xo xo = (com.airbnb.lottie.Xo) objIF;
        composerKN.M7();
        composerKN.te(185152232);
        Object objIF2 = composerKN.iF();
        if (objIF2 == companion.n()) {
            objIF2 = new Matrix();
            composerKN.o(objIF2);
        }
        Matrix matrix = (Matrix) objIF2;
        composerKN.M7();
        composerKN.te(185152312);
        boolean zP5 = composerKN.p5(dsr);
        Object objIF3 = composerKN.iF();
        if (zP5 || objIF3 == companion.n()) {
            objIF3 = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);
            composerKN.o(objIF3);
        }
        MutableState mutableState = (MutableState) objIF3;
        composerKN.M7();
        composerKN.te(185152364);
        if (dsr == null || dsr.nr() == 0.0f) {
            Pl pl4 = pl3;
            Alignment alignment2 = alignmentO;
            nKK nkk3 = nkk2;
            Modifier modifier3 = modifier2;
            boolean z19 = z11;
            boolean z20 = z12;
            boolean z21 = z13;
            boolean z22 = z16;
            boolean z23 = z17;
            boolean z24 = z18;
            Map map3 = map2;
            ContentScale contentScale2 = contentScaleO;
            boolean z25 = z15;
            FQq.j jVar3 = jVar2;
            BoxKt.n(modifier3, composerKN, (i2 >> 6) & 14);
            composerKN.M7();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
                scopeUpdateScopeGh.n(new j(dsr, progress, modifier3, z19, z20, z21, z14, nkk3, z25, pl4, alignment2, contentScale2, z22, z23, map3, jVar3, z24, i2, i3, i5));
                return;
            }
            return;
        }
        composerKN.M7();
        Rect rectRl = dsr.rl();
        Context context = (Context) composerKN.ty(AndroidCompositionLocals_androidKt.Uo());
        Modifier modifierN = CN3.n(modifier2, rectRl.width(), rectRl.height());
        ContentScale contentScale3 = contentScaleO;
        FQq.j jVar4 = jVar2;
        Map map4 = map2;
        Pl pl5 = pl3;
        Modifier modifier4 = modifier2;
        boolean z26 = z14;
        Alignment alignment3 = alignmentO;
        nKK nkk4 = nkk2;
        boolean z27 = z18;
        n nVar = new n(rectRl, contentScale3, alignment3, matrix, xo, z26, z27, nkk4, jVar4, dsr, map4, pl5, z11, z12, z13, z15, z16, z17, context, progress, mutableState);
        boolean z28 = z15;
        boolean z29 = z11;
        boolean z30 = z12;
        boolean z31 = z16;
        boolean z32 = z17;
        boolean z33 = z13;
        CanvasKt.rl(modifierN, nVar, composerKN, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        ScopeUpdateScope scopeUpdateScopeGh2 = composerKN.gh();
        if (scopeUpdateScopeGh2 != null) {
            scopeUpdateScopeGh2.n(new w6(dsr, progress, modifier4, z29, z30, z33, z26, nkk4, z28, pl5, alignment3, contentScale3, z31, z32, map4, jVar4, z27, i2, i3, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long O(long j2, long j3) {
        return IntSizeKt.n((int) (Size.gh(j2) * ScaleFactor.t(j3)), (int) (Size.xMQ(j2) * ScaleFactor.nr(j3)));
    }

    private static final Pl rl(MutableState mutableState) {
        android.support.v4.media.j.n(mutableState.getValue());
        return null;
    }

    public static final /* synthetic */ Pl t(MutableState mutableState) {
        rl(mutableState);
        return null;
    }
}
