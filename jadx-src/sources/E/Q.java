package E;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.media3.exoplayer.RendererCapabilities;
import com.alightcreative.gl.egl.il.inFlMLxL;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class Q {

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    static final class j implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function1 f2134n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f2135t;

        j(Function1 function1, int i2) {
            this.f2134n = function1;
            this.f2135t = i2;
        }

        public final void n() {
            this.f2134n.invoke(Integer.valueOf(this.f2135t));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    public static final class n extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f2136n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(List list) {
            super(1);
            this.f2136n = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return n(((Number) obj).intValue());
        }

        public final Object n(int i2) {
            this.f2136n.get(i2);
            return null;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    public static final class w6 extends Lambda implements Function4 {
        final /* synthetic */ Function1 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Integer f2137O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f2138n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ List f2139o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ float f2140r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ float f2141t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w6(List list, float f3, Integer num, Function1 function1, float f4, List list2) {
            super(4);
            this.f2138n = list;
            this.f2141t = f3;
            this.f2137O = num;
            this.J2 = function1;
            this.f2140r = f4;
            this.f2139o = list2;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            n((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return Unit.INSTANCE;
        }

        public final void n(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
            int i5;
            zd.Ml ml;
            boolean z2;
            if ((i3 & 6) == 0) {
                i5 = i3 | (composer.p5(lazyItemScope) ? 4 : 2);
            } else {
                i5 = i3;
            }
            if ((i3 & 48) == 0) {
                i5 |= composer.t(i2) ? 32 : 16;
            }
            if (!composer.HI((i5 & 147) != 146, i5 & 1)) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1091073711, i5, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            zd.Ml ml2 = (zd.Ml) this.f2138n.get(i2);
            composer.eF(2097485271);
            int i7 = i5;
            float f3 = this.f2141t;
            Integer num = this.f2137O;
            if (num != null && num.intValue() == i2) {
                ml = ml2;
                z2 = true;
            } else {
                ml = ml2;
                z2 = false;
            }
            composer.eF(1037497482);
            boolean zP5 = composer.p5(this.J2) | ((((i7 & 112) ^ 48) > 32 && composer.t(i2)) || (i7 & 48) == 32);
            Object objIF = composer.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                objIF = new j(this.J2, i2);
                composer.o(objIF);
            }
            Function0 function0 = (Function0) objIF;
            composer.Xw();
            AbstractC1344c.xMQ(ml, f3, z2, function0, i2 == 0 ? PaddingKt.az(Modifier.INSTANCE, this.f2140r, 0.0f, 0.0f, 0.0f, 14, null) : i2 == this.f2139o.size() - 1 ? PaddingKt.az(Modifier.INSTANCE, 0.0f, 0.0f, this.f2140r, 0.0f, 11, null) : Modifier.INSTANCE, composer, 0, 0);
            composer.Xw();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(List list, float f3, Integer num, Function1 function1, float f4, float f5, Modifier modifier, int i2, int i3, Composer composer, int i5) {
        t(list, f3, num, function1, f4, f5, modifier, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr(List list, float f3, Integer num, Function1 function1, float f4, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        LazyRow.qie(list.size(), null, new n(list), ComposableLambdaKt.rl(-1091073711, true, new w6(list, f3, num, function1, f4, list)));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final List list, final float f3, final Integer num, final Function1 onMediaClicked, final float f4, final float f5, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i5;
        float f6;
        Integer num2;
        float f7;
        int i7;
        Modifier modifier2;
        boolean zE2;
        Object objIF;
        int i8;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(list, inFlMLxL.wNyMx);
        Intrinsics.checkNotNullParameter(onMediaClicked, "onMediaClicked");
        Composer composerKN = composer.KN(1240927581);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(list) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                f6 = f3;
                i5 |= composerKN.rl(f6) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    num2 = num;
                    i5 |= composerKN.p5(num2) ? 256 : 128;
                }
                if ((i3 & 8) != 0) {
                    i5 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    i5 |= composerKN.E2(onMediaClicked) ? 2048 : 1024;
                }
                if ((i3 & 16) != 0) {
                    i5 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    i5 |= composerKN.rl(f4) ? 16384 : 8192;
                }
                if ((i3 & 32) != 0) {
                    i5 |= 196608;
                } else {
                    if ((i2 & 196608) == 0) {
                        f7 = f5;
                        i5 |= composerKN.rl(f7) ? 131072 : 65536;
                    }
                    i7 = i3 & 64;
                    if (i7 != 0) {
                        if ((1572864 & i2) == 0) {
                            modifier2 = modifier;
                            i5 |= composerKN.p5(modifier2) ? 1048576 : 524288;
                        }
                        if ((i5 & 599187) == 599186 && composerKN.xMQ()) {
                            composerKN.wTp();
                            composer2 = composerKN;
                            modifier3 = modifier2;
                        } else {
                            Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                            if (ComposerKt.v()) {
                                ComposerKt.p5(1240927581, i5, -1, "com.alightcreative.template.importpreview.ui.components.TemplateMediaRow (TemplateMediaRow.kt:30)");
                            }
                            Arrangement.HorizontalOrVertical horizontalOrVerticalTy = Arrangement.f17400n.ty(f4);
                            composerKN.eF(-1940439774);
                            zE2 = composerKN.E2(list) | ((i5 & 112) != 32) | ((i5 & 896) != 256) | ((i5 & 7168) != 2048) | ((458752 & i5) == 131072);
                            objIF = composerKN.iF();
                            if (!zE2 || objIF == Composer.INSTANCE.n()) {
                                final Integer num3 = num2;
                                i8 = i5;
                                final float f8 = f6;
                                final float f9 = f7;
                                Function1 function1 = new Function1() { // from class: E.s4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return Q.nr(list, f8, num3, onMediaClicked, f9, (LazyListScope) obj);
                                    }
                                };
                                composerKN.o(function1);
                                objIF = function1;
                            } else {
                                i8 = i5;
                            }
                            composerKN.Xw();
                            int i9 = (i8 >> 18) & 14;
                            Modifier modifier5 = modifier4;
                            composer2 = composerKN;
                            LazyDslKt.O(modifier5, null, null, false, horizontalOrVerticalTy, null, null, false, null, (Function1) objIF, composer2, i9, 494);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            modifier3 = modifier5;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2() { // from class: E.UGc
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return Q.O(list, f3, num, onMediaClicked, f4, f5, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 1572864;
                    modifier2 = modifier;
                    if ((i5 & 599187) == 599186) {
                        if (i7 == 0) {
                        }
                        if (ComposerKt.v()) {
                        }
                        Arrangement.HorizontalOrVertical horizontalOrVerticalTy2 = Arrangement.f17400n.ty(f4);
                        composerKN.eF(-1940439774);
                        zE2 = composerKN.E2(list) | ((i5 & 112) != 32) | ((i5 & 896) != 256) | ((i5 & 7168) != 2048) | ((458752 & i5) == 131072);
                        objIF = composerKN.iF();
                        if (zE2) {
                            final Integer num32 = num2;
                            i8 = i5;
                            final float f82 = f6;
                            final float f92 = f7;
                            Function1 function12 = new Function1() { // from class: E.s4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return Q.nr(list, f82, num32, onMediaClicked, f92, (LazyListScope) obj);
                                }
                            };
                            composerKN.o(function12);
                            objIF = function12;
                            composerKN.Xw();
                            int i92 = (i8 >> 18) & 14;
                            Modifier modifier52 = modifier4;
                            composer2 = composerKN;
                            LazyDslKt.O(modifier52, null, null, false, horizontalOrVerticalTy2, null, null, false, null, (Function1) objIF, composer2, i92, 494);
                            if (ComposerKt.v()) {
                            }
                            modifier3 = modifier52;
                        }
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                f7 = f5;
                i7 = i3 & 64;
                if (i7 != 0) {
                }
                modifier2 = modifier;
                if ((i5 & 599187) == 599186) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            num2 = num;
            if ((i3 & 8) != 0) {
            }
            if ((i3 & 16) != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            f7 = f5;
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            modifier2 = modifier;
            if ((i5 & 599187) == 599186) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        f6 = f3;
        if ((i3 & 4) == 0) {
        }
        num2 = num;
        if ((i3 & 8) != 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        f7 = f5;
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        modifier2 = modifier;
        if ((i5 & 599187) == 599186) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }
}
