package Dj7;

import Dj7.AbstractC1328c;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Dj7.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class AbstractC1328c {

    /* JADX INFO: renamed from: Dj7.c$j */
    static final class j implements Function3 {
        final /* synthetic */ float J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ float f1727O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ float f1728Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ long f1729n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ float f1730o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ float f1731r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ float f1732t;

        j(long j2, float f3, float f4, float f5, float f6, float f7, float f8) {
            this.f1729n = j2;
            this.f1732t = f3;
            this.f1727O = f4;
            this.J2 = f5;
            this.f1731r = f6;
            this.f1730o = f7;
            this.f1728Z = f8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(float f3, float f4, float f5, long j2, float f6, float f7, float f8, DrawScope drawBehind) {
            Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
            Canvas canvasKN = drawBehind.getDrawContext().KN();
            Paint paintN = AndroidPaint_androidKt.n();
            android.graphics.Paint internalPaint = paintN.getInternalPaint();
            internalPaint.setColor(ColorKt.mUb(Color.INSTANCE.J2()));
            internalPaint.setShadowLayer(drawBehind.l(f3), drawBehind.l(f4), drawBehind.l(f5), ColorKt.mUb(j2));
            float f9 = 2;
            canvasKN.aYN(drawBehind.l(f4) + ((Float.intBitsToFloat((int) (drawBehind.t() >> 32)) - (Float.intBitsToFloat((int) (drawBehind.t() >> 32)) * f6)) / f9), drawBehind.l(f5) + ((Float.intBitsToFloat((int) (drawBehind.t() & 4294967295L)) - (Float.intBitsToFloat((int) (drawBehind.t() & 4294967295L)) * f7)) / f9), drawBehind.l(f4) + (Float.intBitsToFloat((int) (drawBehind.t() >> 32)) * f6) + ((Float.intBitsToFloat((int) (drawBehind.t() >> 32)) - (Float.intBitsToFloat((int) (drawBehind.t() >> 32)) * f6)) / f9), drawBehind.l(f5) + (Float.intBitsToFloat((int) (drawBehind.t() & 4294967295L)) * f7) + ((Float.intBitsToFloat((int) (drawBehind.t() & 4294967295L)) - (Float.intBitsToFloat((int) (drawBehind.t() & 4294967295L)) * f7)) / f9), drawBehind.l(f8), drawBehind.l(f8), paintN);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return rl((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
        }

        public final Modifier rl(Modifier composed, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            composer.eF(-1955275109);
            if (ComposerKt.v()) {
                ComposerKt.p5(-1955275109, i2, -1, "com.alightcreative.common.compose.components.coloredShadow.<anonymous> (ColoredShadow.kt:34)");
            }
            float fCk = Color.ck(this.f1729n);
            long jAz = this.f1729n;
            if (fCk == 1.0f) {
                jAz = Color.az(jAz, 0.99f, 0.0f, 0.0f, 0.0f, 14, null);
            }
            final long j2 = jAz;
            composer.eF(1825474314);
            boolean zRl = composer.rl(this.f1732t) | composer.rl(this.f1727O) | composer.rl(this.J2) | composer.nr(j2) | composer.rl(this.f1731r) | composer.rl(this.f1730o) | composer.rl(this.f1728Z);
            final float f3 = this.f1732t;
            final float f4 = this.f1727O;
            final float f5 = this.J2;
            final float f6 = this.f1731r;
            final float f7 = this.f1730o;
            final float f8 = this.f1728Z;
            Object objIF = composer.iF();
            if (zRl || objIF == Composer.INSTANCE.n()) {
                Function1 function1 = new Function1() { // from class: Dj7.l3D
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC1328c.j.t(f3, f4, f5, j2, f6, f7, f8, (DrawScope) obj);
                    }
                };
                composer.o(function1);
                objIF = function1;
            }
            composer.Xw();
            Modifier modifierRl = DrawModifierKt.rl(composed, (Function1) objIF);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            composer.Xw();
            return modifierRl;
        }
    }

    public static final Modifier n(Modifier coloredShadow, long j2, float f3, float f4, float f5, float f6, float f7, float f8) {
        Intrinsics.checkNotNullParameter(coloredShadow, "$this$coloredShadow");
        return ComposedModifierKt.t(coloredShadow, null, new j(j2, f4, f5, f6, f7, f8, f3), 1, null);
    }
}
