package androidx.compose.material;

import androidx.compose.material.internal.Icons;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJî\u0001\u0010#\u001a\u00020\"2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Landroidx/compose/material/ExposedDropdownMenuDefaults;", "", "<init>", "()V", "", "expanded", "Lkotlin/Function0;", "", "onIconClick", c.f62177j, "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/Color;", "textColor", "disabledTextColor", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "cursorColor", "errorCursorColor", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "leadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "trailingIconColor", "focusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "Landroidx/compose/material/TextFieldColors;", "rl", "(JJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material/TextFieldColors;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ExperimentalMaterialApi
@SourceDebugExtension({"SMAP\nExposedDropdownMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material/ExposedDropdownMenuDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,671:1\n75#2:672\n75#2:673\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material/ExposedDropdownMenuDefaults\n*L\n293#1:672\n391#1:673\n*E\n"})
public final class ExposedDropdownMenuDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ExposedDropdownMenuDefaults f22003n = new ExposedDropdownMenuDefaults();
    public static final int rl = 0;

    public final TextFieldColors rl(long j2, long j3, long j4, long j5, long j6, long j7, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, Composer composer, int i2, int i3, int i5, int i7) {
        long j25;
        long jAz;
        long j26;
        long jAz2;
        long j27;
        long jAz3;
        long j28;
        long jAz4;
        long j29;
        long jAz5 = (i7 & 1) != 0 ? Color.az(((Color) composer.ty(ContentColorKt.n())).getValue(), ((Number) composer.ty(ContentAlphaKt.n())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long jAz6 = (i7 & 2) != 0 ? Color.az(jAz5, ContentAlpha.f21745n.rl(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long jAz7 = (i7 & 4) != 0 ? Color.az(MaterialTheme.f22169n.n(composer, 6).xMQ(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j4;
        long jMUb = (i7 & 8) != 0 ? MaterialTheme.f22169n.n(composer, 6).mUb() : j5;
        long jNr = (i7 & 16) != 0 ? MaterialTheme.f22169n.n(composer, 6).nr() : j6;
        long jAz8 = (i7 & 32) != 0 ? Color.az(MaterialTheme.f22169n.n(composer, 6).mUb(), ContentAlpha.f21745n.t(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long jAz9 = (i7 & 64) != 0 ? Color.az(MaterialTheme.f22169n.n(composer, 6).xMQ(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null) : j9;
        if ((i7 & 128) != 0) {
            long j30 = jAz9;
            jAz = Color.az(j30, ContentAlpha.f21745n.rl(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j25 = j30;
        } else {
            j25 = jAz9;
            jAz = j10;
        }
        long jNr2 = (i7 & 256) != 0 ? MaterialTheme.f22169n.n(composer, 6).nr() : j11;
        long jAz10 = (i7 & 512) != 0 ? Color.az(MaterialTheme.f22169n.n(composer, 6).xMQ(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        if ((i7 & 1024) != 0) {
            long j31 = jAz10;
            jAz2 = Color.az(j31, ContentAlpha.f21745n.rl(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j26 = j31;
        } else {
            j26 = jAz10;
            jAz2 = j13;
        }
        long j32 = (i7 & 2048) != 0 ? j26 : j14;
        long jAz11 = (i7 & 4096) != 0 ? Color.az(MaterialTheme.f22169n.n(composer, 6).xMQ(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long jAz12 = (i7 & 8192) != 0 ? Color.az(MaterialTheme.f22169n.n(composer, 6).mUb(), ContentAlpha.f21745n.t(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j16;
        if ((i7 & 16384) != 0) {
            long j33 = jAz11;
            jAz3 = Color.az(j33, ContentAlpha.f21745n.rl(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j27 = j33;
        } else {
            j27 = jAz11;
            jAz3 = j17;
        }
        long jNr3 = (32768 & i7) != 0 ? MaterialTheme.f22169n.n(composer, 6).nr() : j18;
        long jAz13 = (65536 & i7) != 0 ? Color.az(MaterialTheme.f22169n.n(composer, 6).mUb(), ContentAlpha.f21745n.t(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j19;
        long jAz14 = (131072 & i7) != 0 ? Color.az(MaterialTheme.f22169n.n(composer, 6).xMQ(), ContentAlpha.f21745n.nr(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j20;
        if ((262144 & i7) != 0) {
            long j34 = jAz14;
            jAz4 = Color.az(j34, ContentAlpha.f21745n.rl(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j28 = j34;
        } else {
            j28 = jAz14;
            jAz4 = j21;
        }
        long jNr4 = (524288 & i7) != 0 ? MaterialTheme.f22169n.n(composer, 6).nr() : j22;
        long jAz15 = (1048576 & i7) != 0 ? Color.az(MaterialTheme.f22169n.n(composer, 6).xMQ(), ContentAlpha.f21745n.nr(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j23;
        long jAz16 = (i7 & 2097152) != 0 ? Color.az(jAz15, ContentAlpha.f21745n.rl(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j24;
        if (ComposerKt.v()) {
            j29 = jAz16;
            ComposerKt.p5(1208167904, i2, i3, "androidx.compose.material.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.kt:322)");
        } else {
            j29 = jAz16;
        }
        DefaultTextFieldForExposedDropdownMenusColors defaultTextFieldForExposedDropdownMenusColors = new DefaultTextFieldForExposedDropdownMenusColors(jAz5, jAz6, jMUb, jNr, jAz8, j25, jNr2, jAz, j26, jAz2, j32, j27, jAz12, jAz3, jNr3, jAz7, jAz13, j28, jAz4, jNr4, jAz15, j29, null);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return defaultTextFieldForExposedDropdownMenusColors;
    }

    private ExposedDropdownMenuDefaults() {
    }

    public final void n(final boolean z2, Function0 function0, Composer composer, final int i2, final int i3) {
        int i5;
        int i7;
        int i8;
        boolean z3;
        final Function0 function02;
        Composer composerKN = composer.KN(876077373);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (composerKN.n(z2)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i5 = i7 | i2;
        } else {
            i5 = i2;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            if (composerKN.E2(function0)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i5 |= i8;
        }
        if ((i5 & 19) != 18) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (composerKN.HI(z3, i5 & 1)) {
            if (i9 != 0) {
                function02 = new Function0<Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$1
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                };
            } else {
                function02 = function0;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(876077373, i5, -1, "androidx.compose.material.ExposedDropdownMenuDefaults.TrailingIcon (ExposedDropdownMenu.kt:235)");
            }
            IconButtonKt.n(function02, SemanticsModifierKt.n(Modifier.INSTANCE, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$2
                public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    n(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }
            }), false, null, ComposableLambdaKt.nr(726122713, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$3
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
                    if (!composer2.HI((i10 & 3) != 2, i10 & 1)) {
                        composer2.wTp();
                        return;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(726122713, i10, -1, "androidx.compose.material.ExposedDropdownMenuDefaults.TrailingIcon.<anonymous> (ExposedDropdownMenu.kt:241)");
                    }
                    IconKt.rl(Icons.Filled.f23912n.n(), "Trailing icon for exposed dropdown menu", RotateKt.n(Modifier.INSTANCE, z2 ? 180.0f : 360.0f), 0L, composer2, 48, 8);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }, composerKN, 54), composerKN, ((i5 >> 3) & 14) | 24576, 12);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
            function02 = function0;
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$4
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
                    this.f22008n.n(z2, function02, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                }
            });
        }
    }
}
