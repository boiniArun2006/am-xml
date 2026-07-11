package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0088\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0088\u0001\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000f\u001a\u001c\u0010\u0012\u001a\u00020\u0000*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001a\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0018\u001a\u00020\u0017*\u00020\r2\u0006\u0010\u0016\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0018\u0010\u0019\" \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0015\u0010!\u001a\u00020\u0000*\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Landroidx/compose/ui/graphics/Color;", "primary", "primaryVariant", "secondary", "secondaryVariant", "background", "surface", MRAIDPresenter.ERROR, "onPrimary", "onSecondary", "onBackground", "onSurface", "onError", "Landroidx/compose/material/Colors;", "Uo", "(JJJJJJJJJJJJ)Landroidx/compose/material/Colors;", "t", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, c.f62177j, "(Landroidx/compose/material/Colors;J)J", "rl", "(JLandroidx/compose/runtime/Composer;I)J", InneractiveMediationNameConsts.OTHER, "", "xMQ", "(Landroidx/compose/material/Colors;Landroidx/compose/material/Colors;)V", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "O", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalColors", "J2", "(Landroidx/compose/material/Colors;)J", "primarySurface", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nColors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Colors.kt\nandroidx/compose/material/ColorsKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,352:1\n708#2:353\n696#2:354\n75#3:355\n*S KotlinDebug\n*F\n+ 1 Colors.kt\nandroidx/compose/material/ColorsKt\n*L\n312#1:353\n312#1:354\n312#1:355\n*E\n"})
public final class ColorsKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ProvidableCompositionLocal f21715n = CompositionLocalKt.Uo(new Function0<Colors>() { // from class: androidx.compose.material.ColorsKt$LocalColors$1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Colors invoke() {
            return ColorsKt.KN(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 4095, null);
        }
    });

    public static /* synthetic */ Colors KN(long j2, long j3, long j4, long j5, long j6, long j7, long j9, long j10, long j11, long j12, long j13, long j14, int i2, Object obj) {
        long jNr = (i2 & 1) != 0 ? ColorKt.nr(4284612846L) : j2;
        long jNr2 = (i2 & 2) != 0 ? ColorKt.nr(4281794739L) : j3;
        long jNr3 = (i2 & 4) != 0 ? ColorKt.nr(4278442694L) : j4;
        long jNr4 = (i2 & 8) != 0 ? ColorKt.nr(4278290310L) : j5;
        long jKN = (i2 & 16) != 0 ? Color.INSTANCE.KN() : j6;
        long jKN2 = (i2 & 32) != 0 ? Color.INSTANCE.KN() : j7;
        long jNr5 = (i2 & 64) != 0 ? ColorKt.nr(4289724448L) : j9;
        long jKN3 = (i2 & 128) != 0 ? Color.INSTANCE.KN() : j10;
        long j15 = jNr;
        long jN = (i2 & 256) != 0 ? Color.INSTANCE.n() : j11;
        long jN2 = (i2 & 512) != 0 ? Color.INSTANCE.n() : j12;
        long jN3 = (i2 & 1024) != 0 ? Color.INSTANCE.n() : j13;
        if ((i2 & 2048) != 0) {
            j14 = Color.INSTANCE.KN();
        }
        return Uo(j15, jNr2, jNr3, jNr4, jKN, jKN2, jNr5, jKN3, jN, jN2, jN3, j14);
    }

    public static final ProvidableCompositionLocal O() {
        return f21715n;
    }

    public static final Colors Uo(long j2, long j3, long j4, long j5, long j6, long j7, long j9, long j10, long j11, long j12, long j13, long j14) {
        return new Colors(j2, j3, j4, j5, j6, j7, j9, j10, j11, j12, j13, j14, true, null);
    }

    public static /* synthetic */ Colors nr(long j2, long j3, long j4, long j5, long j6, long j7, long j9, long j10, long j11, long j12, long j13, long j14, int i2, Object obj) {
        long jNr = (i2 & 1) != 0 ? ColorKt.nr(4290479868L) : j2;
        long jNr2 = (i2 & 2) != 0 ? ColorKt.nr(4281794739L) : j3;
        long jNr3 = (i2 & 4) != 0 ? ColorKt.nr(4278442694L) : j4;
        long j15 = (i2 & 8) != 0 ? jNr3 : j5;
        long jNr4 = (i2 & 16) != 0 ? ColorKt.nr(4279374354L) : j6;
        long jNr5 = (i2 & 32) != 0 ? ColorKt.nr(4279374354L) : j7;
        long jNr6 = (i2 & 64) != 0 ? ColorKt.nr(4291782265L) : j9;
        long jN = (i2 & 128) != 0 ? Color.INSTANCE.n() : j10;
        long jN2 = (i2 & 256) != 0 ? Color.INSTANCE.n() : j11;
        long jKN = (i2 & 512) != 0 ? Color.INSTANCE.KN() : j12;
        long jKN2 = (i2 & 1024) != 0 ? Color.INSTANCE.KN() : j13;
        if ((i2 & 2048) != 0) {
            j14 = Color.INSTANCE.n();
        }
        return t(jNr, jNr2, jNr3, j15, jNr4, jNr5, jNr6, jN, jN2, jKN, jKN2, j14);
    }

    public static final Colors t(long j2, long j3, long j4, long j5, long j6, long j7, long j9, long j10, long j11, long j12, long j13, long j14) {
        return new Colors(j2, j3, j4, j5, j6, j7, j9, j10, j11, j12, j13, j14, false, null);
    }

    public static final long J2(Colors colors) {
        if (colors.HI()) {
            return colors.mUb();
        }
        return colors.ty();
    }

    public static final long n(Colors colors, long j2) {
        if (Color.HI(j2, colors.mUb())) {
            return colors.Uo();
        }
        if (Color.HI(j2, colors.gh())) {
            return colors.Uo();
        }
        if (Color.HI(j2, colors.qie())) {
            return colors.KN();
        }
        if (Color.HI(j2, colors.az())) {
            return colors.KN();
        }
        if (Color.HI(j2, colors.t())) {
            return colors.O();
        }
        if (Color.HI(j2, colors.ty())) {
            return colors.xMQ();
        }
        if (Color.HI(j2, colors.nr())) {
            return colors.J2();
        }
        return Color.INSTANCE.Uo();
    }

    public static final long rl(long j2, Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(441849991, i2, -1, "androidx.compose.material.contentColorFor (Colors.kt:311)");
        }
        composer.eF(-702388415);
        long jN = n(MaterialTheme.f22169n.n(composer, 6), j2);
        if (jN == 16) {
            jN = ((Color) composer.ty(ContentColorKt.n())).getValue();
        }
        composer.Xw();
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return jN;
    }

    public static final void xMQ(Colors colors, Colors colors2) {
        colors.aYN(colors2.mUb());
        colors.ViF(colors2.gh());
        colors.nY(colors2.qie());
        colors.g(colors2.az());
        colors.ck(colors2.t());
        colors.te(colors2.ty());
        colors.Ik(colors2.nr());
        colors.XQ(colors2.Uo());
        colors.S(colors2.KN());
        colors.o(colors2.O());
        colors.WPU(colors2.xMQ());
        colors.Z(colors2.J2());
        colors.r(colors2.HI());
    }
}
