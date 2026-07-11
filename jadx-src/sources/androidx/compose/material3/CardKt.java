package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001aa\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0085\u0001\u0010\u0018\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001aU\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001ay\u0010\u001c\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a_\u0010\u001e\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u001e\u0010\u0011\u001a\u0083\u0001\u0010\u001f\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u001f\u0010\u0019¨\u0006 "}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/material3/CardColors;", "colors", "Landroidx/compose/material3/CardElevation;", "elevation", "Landroidx/compose/foundation/BorderStroke;", "border", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/CardColors;Landroidx/compose/material3/CardElevation;Landroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "onClick", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "rl", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/CardColors;Landroidx/compose/material3/CardElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "t", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/CardColors;Landroidx/compose/material3/CardElevation;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "nr", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/CardColors;Landroidx/compose/material3/CardElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "O", "J2", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,851:1\n1223#2,6:852\n*S KotlinDebug\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardKt\n*L\n150#1:852,6\n*E\n"})
public final class CardKt {
    /* JADX WARN: Removed duplicated region for block: B:103:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void J2(final Function0 function0, Modifier modifier, boolean z2, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final Function3 function3, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        boolean z3;
        Shape shapeMUb;
        CardColors cardColorsAz;
        CardElevation cardElevationTy;
        BorderStroke borderStroke2;
        int i8;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        int i9;
        BorderStroke borderStrokeQie;
        MutableInteractionSource mutableInteractionSource3;
        BorderStroke borderStroke3;
        Modifier modifier3;
        boolean z4;
        Shape shape2;
        CardColors cardColors2;
        CardElevation cardElevation2;
        Composer composer3;
        final Modifier modifier4;
        final boolean z5;
        final Shape shape3;
        final CardColors cardColors3;
        final CardElevation cardElevation3;
        final BorderStroke borderStroke4;
        final MutableInteractionSource mutableInteractionSource4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-727137250);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(function0) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            i7 = i3 & 4;
            if (i7 == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    z3 = z2;
                    i5 |= composerKN.n(z3) ? 256 : 128;
                }
                if ((i2 & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        shapeMUb = shape;
                        int i11 = composerKN.p5(shapeMUb) ? 2048 : 1024;
                        i5 |= i11;
                    } else {
                        shapeMUb = shape;
                    }
                    i5 |= i11;
                } else {
                    shapeMUb = shape;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        cardColorsAz = cardColors;
                        int i12 = composerKN.p5(cardColorsAz) ? 16384 : 8192;
                        i5 |= i12;
                    } else {
                        cardColorsAz = cardColors;
                    }
                    i5 |= i12;
                } else {
                    cardColorsAz = cardColors;
                }
                if ((196608 & i2) == 0) {
                    if ((i3 & 32) == 0) {
                        cardElevationTy = cardElevation;
                        int i13 = composerKN.p5(cardElevationTy) ? 131072 : 65536;
                        i5 |= i13;
                    } else {
                        cardElevationTy = cardElevation;
                    }
                    i5 |= i13;
                } else {
                    cardElevationTy = cardElevation;
                }
                if ((1572864 & i2) == 0) {
                    if ((i3 & 64) == 0) {
                        borderStroke2 = borderStroke;
                        int i14 = composerKN.p5(borderStroke2) ? 1048576 : 524288;
                        i5 |= i14;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    i5 |= i14;
                } else {
                    borderStroke2 = borderStroke;
                }
                i8 = i3 & 128;
                if (i8 != 0) {
                    i5 |= 12582912;
                } else {
                    if ((12582912 & i2) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        i5 |= composerKN.p5(mutableInteractionSource2) ? 8388608 : 4194304;
                    }
                    if ((i3 & 256) != 0) {
                        if ((i2 & 100663296) == 0) {
                            i5 |= composerKN.E2(function3) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        if ((i5 & 38347923) == 38347922 && composerKN.xMQ()) {
                            composerKN.wTp();
                            composer3 = composerKN;
                            modifier4 = modifier2;
                            z5 = z3;
                            shape3 = shapeMUb;
                            cardColors3 = cardColorsAz;
                            cardElevation3 = cardElevationTy;
                            borderStroke4 = borderStroke2;
                            mutableInteractionSource4 = mutableInteractionSource2;
                        } else {
                            composerKN.e();
                            if ((i2 & 1) != 0 || composerKN.rV9()) {
                                if (i10 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i7 != 0) {
                                    z3 = true;
                                }
                                if ((i3 & 8) != 0) {
                                    i5 &= -7169;
                                    shapeMUb = CardDefaults.f24661n.mUb(composerKN, 6);
                                }
                                if ((i3 & 16) != 0) {
                                    i5 &= -57345;
                                    cardColorsAz = CardDefaults.f24661n.az(composerKN, 6);
                                }
                                if ((i3 & 32) == 0) {
                                    i9 = i8;
                                    composer2 = composerKN;
                                    i5 &= -458753;
                                    cardElevationTy = CardDefaults.f24661n.ty(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerKN, 1572864, 63);
                                } else {
                                    composer2 = composerKN;
                                    i9 = i8;
                                }
                                if ((i3 & 64) == 0) {
                                    borderStrokeQie = CardDefaults.f24661n.qie(z3, composer2, ((i5 >> 6) & 14) | 48, 0);
                                    i5 = (-3670017) & i5;
                                } else {
                                    borderStrokeQie = borderStroke;
                                }
                                mutableInteractionSource3 = i9 == 0 ? null : mutableInteractionSource;
                                borderStroke3 = borderStrokeQie;
                                modifier3 = modifier2;
                                z4 = z3;
                                shape2 = shapeMUb;
                                cardColors2 = cardColorsAz;
                                cardElevation2 = cardElevationTy;
                            } else {
                                composerKN.wTp();
                                if ((i3 & 8) != 0) {
                                    i5 &= -7169;
                                }
                                if ((i3 & 16) != 0) {
                                    i5 &= -57345;
                                }
                                if ((i3 & 32) != 0) {
                                    i5 &= -458753;
                                }
                                if ((i3 & 64) != 0) {
                                    i5 &= -3670017;
                                }
                                composer2 = composerKN;
                                z4 = z3;
                                cardColors2 = cardColorsAz;
                                cardElevation2 = cardElevationTy;
                                borderStroke3 = borderStroke2;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                modifier3 = modifier2;
                                shape2 = shapeMUb;
                            }
                            composer2.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-727137250, i5, -1, "androidx.compose.material3.OutlinedCard (Card.kt:359)");
                            }
                            rl(function0, modifier3, z4, shape2, cardColors2, cardElevation2, borderStroke3, mutableInteractionSource3, function3, composer2, i5 & 268435454, 0);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            composer3 = composer2;
                            modifier4 = modifier3;
                            z5 = z4;
                            shape3 = shape2;
                            cardColors3 = cardColors2;
                            cardElevation3 = cardElevation2;
                            borderStroke4 = borderStroke3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                        scopeUpdateScopeGh = composer3.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.CardKt$OutlinedCard$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    n(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer4, int i15) {
                                    CardKt.J2(function0, modifier4, z5, shape3, cardColors3, cardElevation3, borderStroke4, mutableInteractionSource4, function3, composer4, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 100663296;
                    if ((i5 & 38347923) == 38347922) {
                        composerKN.e();
                        if ((i2 & 1) != 0) {
                            if (i10 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if ((i3 & 8) != 0) {
                            }
                            if ((i3 & 16) != 0) {
                            }
                            if ((i3 & 32) == 0) {
                            }
                            if ((i3 & 64) == 0) {
                            }
                            if (i9 == 0) {
                            }
                            borderStroke3 = borderStrokeQie;
                            modifier3 = modifier2;
                            z4 = z3;
                            shape2 = shapeMUb;
                            cardColors2 = cardColorsAz;
                            cardElevation2 = cardElevationTy;
                            composer2.S();
                            if (ComposerKt.v()) {
                            }
                            rl(function0, modifier3, z4, shape2, cardColors2, cardElevation2, borderStroke3, mutableInteractionSource3, function3, composer2, i5 & 268435454, 0);
                            if (ComposerKt.v()) {
                            }
                            composer3 = composer2;
                            modifier4 = modifier3;
                            z5 = z4;
                            shape3 = shape2;
                            cardColors3 = cardColors2;
                            cardElevation3 = cardElevation2;
                            borderStroke4 = borderStroke3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                    }
                    scopeUpdateScopeGh = composer3.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i3 & 256) != 0) {
                }
                if ((i5 & 38347923) == 38347922) {
                }
                scopeUpdateScopeGh = composer3.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            z3 = z2;
            if ((i2 & 3072) == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            if ((196608 & i2) == 0) {
            }
            if ((1572864 & i2) == 0) {
            }
            i8 = i3 & 128;
            if (i8 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i3 & 256) != 0) {
            }
            if ((i5 & 38347923) == 38347922) {
            }
            scopeUpdateScopeGh = composer3.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        z3 = z2;
        if ((i2 & 3072) == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if ((196608 & i2) == 0) {
        }
        if ((1572864 & i2) == 0) {
        }
        i8 = i3 & 128;
        if (i8 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i3 & 256) != 0) {
        }
        if ((i5 & 38347923) == 38347922) {
        }
        scopeUpdateScopeGh = composer3.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void O(Modifier modifier, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, final Function3 function3, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        Shape shape2;
        CardColors cardColors2;
        CardElevation cardElevation2;
        BorderStroke borderStroke2;
        Shape shapeMUb;
        CardColors cardColorsAz;
        Composer composer2;
        CardElevation cardElevationTy;
        BorderStroke borderStrokeQie;
        Modifier modifier3;
        Shape shape3;
        CardColors cardColors3;
        CardElevation cardElevation3;
        Composer composer3;
        final Modifier modifier4;
        final Shape shape4;
        final CardColors cardColors4;
        final CardElevation cardElevation4;
        final BorderStroke borderStroke3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(740336179);
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
                shape2 = shape;
                int i8 = composerKN.p5(shape2) ? 32 : 16;
                i5 |= i8;
            } else {
                shape2 = shape;
            }
            i5 |= i8;
        } else {
            shape2 = shape;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            if ((i3 & 4) == 0) {
                cardColors2 = cardColors;
                int i9 = composerKN.p5(cardColors2) ? 256 : 128;
                i5 |= i9;
            } else {
                cardColors2 = cardColors;
            }
            i5 |= i9;
        } else {
            cardColors2 = cardColors;
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                cardElevation2 = cardElevation;
                int i10 = composerKN.p5(cardElevation2) ? 2048 : 1024;
                i5 |= i10;
            } else {
                cardElevation2 = cardElevation;
            }
            i5 |= i10;
        } else {
            cardElevation2 = cardElevation;
        }
        if ((i2 & 24576) == 0) {
            if ((i3 & 16) == 0) {
                borderStroke2 = borderStroke;
                int i11 = composerKN.p5(borderStroke2) ? 16384 : 8192;
                i5 |= i11;
            } else {
                borderStroke2 = borderStroke;
            }
            i5 |= i11;
        } else {
            borderStroke2 = borderStroke;
        }
        if ((i3 & 32) == 0) {
            if ((i2 & 196608) == 0) {
                i5 |= composerKN.E2(function3) ? 131072 : 65536;
            }
            if ((74899 & i5) == 74898 || !composerKN.xMQ()) {
                composerKN.e();
                if ((i2 & 1) != 0 || composerKN.rV9()) {
                    Modifier modifier5 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i3 & 2) == 0) {
                        shapeMUb = CardDefaults.f24661n.mUb(composerKN, 6);
                        i5 &= -113;
                    } else {
                        shapeMUb = shape2;
                    }
                    if ((i3 & 4) == 0) {
                        cardColorsAz = CardDefaults.f24661n.az(composerKN, 6);
                        i5 &= -897;
                    } else {
                        cardColorsAz = cardColors2;
                    }
                    if ((i3 & 8) == 0) {
                        composer2 = composerKN;
                        cardElevationTy = CardDefaults.f24661n.ty(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer2, 1572864, 63);
                        i5 &= -7169;
                    } else {
                        composer2 = composerKN;
                        cardElevationTy = cardElevation2;
                    }
                    if ((i3 & 16) == 0) {
                        i5 &= -57345;
                        modifier3 = modifier5;
                        shape3 = shapeMUb;
                        cardColors3 = cardColorsAz;
                        cardElevation3 = cardElevationTy;
                        borderStrokeQie = CardDefaults.f24661n.qie(false, composer2, 48, 1);
                    } else {
                        borderStrokeQie = borderStroke;
                        modifier3 = modifier5;
                        shape3 = shapeMUb;
                        cardColors3 = cardColorsAz;
                        cardElevation3 = cardElevationTy;
                    }
                } else {
                    composerKN.wTp();
                    if ((i3 & 2) != 0) {
                        i5 &= -113;
                    }
                    if ((i3 & 4) != 0) {
                        i5 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        i5 &= -7169;
                    }
                    if ((i3 & 16) != 0) {
                        i5 &= -57345;
                    }
                    shape3 = shape2;
                    cardColors3 = cardColors2;
                    cardElevation3 = cardElevation2;
                    borderStrokeQie = borderStroke2;
                    composer2 = composerKN;
                    modifier3 = modifier2;
                }
                composer2.S();
                if (ComposerKt.v()) {
                    ComposerKt.p5(740336179, i5, -1, "androidx.compose.material3.OutlinedCard (Card.kt:303)");
                }
                Composer composer4 = composer2;
                n(modifier3, shape3, cardColors3, cardElevation3, borderStrokeQie, function3, composer4, 524286 & i5, 0);
                composer3 = composer4;
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier4 = modifier3;
                shape4 = shape3;
                cardColors4 = cardColors3;
                cardElevation4 = cardElevation3;
                borderStroke3 = borderStrokeQie;
            } else {
                composerKN.wTp();
                modifier4 = modifier2;
                shape4 = shape2;
                cardColors4 = cardColors2;
                cardElevation4 = cardElevation2;
                borderStroke3 = borderStroke2;
                composer3 = composerKN;
            }
            scopeUpdateScopeGh = composer3.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.CardKt$OutlinedCard$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                        n(composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer5, int i12) {
                        CardKt.O(modifier4, shape4, cardColors4, cardElevation4, borderStroke3, function3, composer5, RecomposeScopeImplKt.n(i2 | 1), i3);
                    }
                });
                return;
            }
            return;
        }
        i5 |= 196608;
        if ((74899 & i5) == 74898) {
            composerKN.e();
            if ((i2 & 1) != 0) {
                if (i7 == 0) {
                }
                if ((i3 & 2) == 0) {
                }
                if ((i3 & 4) == 0) {
                }
                if ((i3 & 8) == 0) {
                }
                if ((i3 & 16) == 0) {
                }
                composer2.S();
                if (ComposerKt.v()) {
                }
                Composer composer42 = composer2;
                n(modifier3, shape3, cardColors3, cardElevation3, borderStrokeQie, function3, composer42, 524286 & i5, 0);
                composer3 = composer42;
                if (ComposerKt.v()) {
                }
                modifier4 = modifier3;
                shape4 = shape3;
                cardColors4 = cardColors3;
                cardElevation4 = cardElevation3;
                borderStroke3 = borderStrokeQie;
            }
        }
        scopeUpdateScopeGh = composer3.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(Modifier modifier, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, final Function3 function3, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        Shape shape2;
        CardColors cardColors2;
        CardElevation cardElevationT;
        BorderStroke borderStroke2;
        Shape shapeGh;
        CardColors cardColorsN;
        InteractionSource interactionSource;
        Modifier modifier3;
        CardElevation cardElevation2;
        BorderStroke borderStroke3;
        Shape shape3;
        final CardColors cardColors3;
        final Modifier modifier4;
        final Shape shape4;
        final BorderStroke borderStroke4;
        final CardElevation cardElevation3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1179621553);
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
                shape2 = shape;
                int i8 = composerKN.p5(shape2) ? 32 : 16;
                i5 |= i8;
            } else {
                shape2 = shape;
            }
            i5 |= i8;
        } else {
            shape2 = shape;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            if ((i3 & 4) == 0) {
                cardColors2 = cardColors;
                int i9 = composerKN.p5(cardColors2) ? 256 : 128;
                i5 |= i9;
            } else {
                cardColors2 = cardColors;
            }
            i5 |= i9;
        } else {
            cardColors2 = cardColors;
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                cardElevationT = cardElevation;
                int i10 = composerKN.p5(cardElevationT) ? 2048 : 1024;
                i5 |= i10;
            } else {
                cardElevationT = cardElevation;
            }
            i5 |= i10;
        } else {
            cardElevationT = cardElevation;
        }
        int i11 = i3 & 16;
        if (i11 == 0) {
            if ((i2 & 24576) == 0) {
                borderStroke2 = borderStroke;
                i5 |= composerKN.p5(borderStroke2) ? 16384 : 8192;
            }
            if ((i3 & 32) == 0) {
                i5 |= 196608;
            } else if ((i2 & 196608) == 0) {
                i5 |= composerKN.E2(function3) ? 131072 : 65536;
            }
            if ((74899 & i5) == 74898 || !composerKN.xMQ()) {
                composerKN.e();
                if ((i2 & 1) != 0 || composerKN.rV9()) {
                    Modifier modifier5 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i3 & 2) == 0) {
                        shapeGh = CardDefaults.f24661n.gh(composerKN, 6);
                        i5 &= -113;
                    } else {
                        shapeGh = shape2;
                    }
                    if ((i3 & 4) == 0) {
                        cardColorsN = CardDefaults.f24661n.n(composerKN, 6);
                        i5 &= -897;
                    } else {
                        cardColorsN = cardColors2;
                    }
                    if ((i3 & 8) == 0) {
                        interactionSource = null;
                        cardElevationT = CardDefaults.f24661n.t(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerKN, 1572864, 63);
                        i5 &= -7169;
                    } else {
                        interactionSource = null;
                    }
                    CardElevation cardElevation4 = cardElevationT;
                    modifier3 = modifier5;
                    cardElevation2 = cardElevation4;
                    if (i11 == 0) {
                        shape3 = shapeGh;
                        borderStroke3 = interactionSource;
                    } else {
                        borderStroke3 = borderStroke;
                        shape3 = shapeGh;
                    }
                } else {
                    composerKN.wTp();
                    if ((i3 & 2) != 0) {
                        i5 &= -113;
                    }
                    if ((i3 & 4) != 0) {
                        i5 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        i5 &= -7169;
                    }
                    cardElevation2 = cardElevationT;
                    borderStroke3 = borderStroke2;
                    modifier3 = modifier2;
                    shape3 = shape2;
                    cardColorsN = cardColors2;
                    interactionSource = null;
                }
                composerKN.S();
                if (ComposerKt.v()) {
                    ComposerKt.p5(1179621553, i5, -1, "androidx.compose.material3.Card (Card.kt:87)");
                }
                CardElevation cardElevation5 = cardElevation2;
                SurfaceKt.n(modifier3, shape3, cardColorsN.n(true), cardColorsN.rl(true), 0.0f, ((Dp) cardElevation2.J2(true, interactionSource, composerKN, ((i5 >> 3) & 896) | 54).getValue()).getValue(), borderStroke3, ComposableLambdaKt.nr(664103990, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.CardKt$Card$1
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        n(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer2, int i12) {
                        if ((i12 & 3) == 2 && composer2.xMQ()) {
                            composer2.wTp();
                            return;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.p5(664103990, i12, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:96)");
                        }
                        Function3 function32 = function3;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composer2, 0);
                        int iN = ComposablesKt.n(composer2, 0);
                        CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                        Modifier modifierO = ComposedModifierKt.O(composer2, companion);
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
                        Updater.O(composerN, measurePolicyN, companion2.t());
                        Updater.O(composerN, compositionLocalMapIk, companion2.O());
                        Function2 function2Rl = companion2.rl();
                        if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                            composerN.o(Integer.valueOf(iN));
                            composerN.az(Integer.valueOf(iN), function2Rl);
                        }
                        Updater.O(composerN, modifierO, companion2.nr());
                        function32.invoke(ColumnScopeInstance.f17468n, composer2, 6);
                        composer2.XQ();
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                    }
                }, composerKN, 54), composerKN, (i5 & 14) | 12582912 | (i5 & 112) | (3670016 & (i5 << 6)), 16);
                composerKN = composerKN;
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                cardColors3 = cardColorsN;
                modifier4 = modifier3;
                shape4 = shape3;
                borderStroke4 = borderStroke3;
                cardElevation3 = cardElevation5;
            } else {
                composerKN.wTp();
                modifier4 = modifier2;
                shape4 = shape2;
                cardColors3 = cardColors2;
                cardElevation3 = cardElevationT;
                borderStroke4 = borderStroke2;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.CardKt$Card$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        n(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer2, int i12) {
                        CardKt.n(modifier4, shape4, cardColors3, cardElevation3, borderStroke4, function3, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                    }
                });
                return;
            }
            return;
        }
        i5 |= 24576;
        borderStroke2 = borderStroke;
        if ((i3 & 32) == 0) {
        }
        if ((74899 & i5) == 74898) {
            composerKN.e();
            if ((i2 & 1) != 0) {
                if (i7 == 0) {
                }
                if ((i3 & 2) == 0) {
                }
                if ((i3 & 4) == 0) {
                }
                if ((i3 & 8) == 0) {
                }
                CardElevation cardElevation42 = cardElevationT;
                modifier3 = modifier5;
                cardElevation2 = cardElevation42;
                if (i11 == 0) {
                }
                composerKN.S();
                if (ComposerKt.v()) {
                }
                CardElevation cardElevation52 = cardElevation2;
                SurfaceKt.n(modifier3, shape3, cardColorsN.n(true), cardColorsN.rl(true), 0.0f, ((Dp) cardElevation2.J2(true, interactionSource, composerKN, ((i5 >> 3) & 896) | 54).getValue()).getValue(), borderStroke3, ComposableLambdaKt.nr(664103990, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.CardKt$Card$1
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        n(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer2, int i12) {
                        if ((i12 & 3) == 2 && composer2.xMQ()) {
                            composer2.wTp();
                            return;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.p5(664103990, i12, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:96)");
                        }
                        Function3 function32 = function3;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composer2, 0);
                        int iN = ComposablesKt.n(composer2, 0);
                        CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                        Modifier modifierO = ComposedModifierKt.O(composer2, companion);
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
                        Updater.O(composerN, measurePolicyN, companion2.t());
                        Updater.O(composerN, compositionLocalMapIk, companion2.O());
                        Function2 function2Rl = companion2.rl();
                        if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                            composerN.o(Integer.valueOf(iN));
                            composerN.az(Integer.valueOf(iN), function2Rl);
                        }
                        Updater.O(composerN, modifierO, companion2.nr());
                        function32.invoke(ColumnScopeInstance.f17468n, composer2, 6);
                        composer2.XQ();
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                    }
                }, composerKN, 54), composerKN, (i5 & 14) | 12582912 | (i5 & 112) | (3670016 & (i5 << 6)), 16);
                composerKN = composerKN;
                if (ComposerKt.v()) {
                }
                cardColors3 = cardColorsN;
                modifier4 = modifier3;
                shape4 = shape3;
                borderStroke4 = borderStroke3;
                cardElevation3 = cardElevation52;
            }
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void nr(final Function0 function0, Modifier modifier, boolean z2, Shape shape, CardColors cardColors, CardElevation cardElevation, MutableInteractionSource mutableInteractionSource, final Function3 function3, Composer composer, final int i2, final int i3) {
        Function0 function02;
        int i5;
        Modifier modifier2;
        int i7;
        boolean z3;
        Shape shapeXMQ;
        CardColors cardColors2;
        CardElevation cardElevationO;
        int i8;
        MutableInteractionSource mutableInteractionSource2;
        CardColors cardColorsNr;
        Composer composer2;
        CardColors cardColors3;
        boolean z4;
        Shape shape2;
        CardElevation cardElevation2;
        Composer composer3;
        MutableInteractionSource mutableInteractionSource3;
        Modifier modifier3;
        Composer composer4;
        final MutableInteractionSource mutableInteractionSource4;
        final Modifier modifier4;
        final boolean z5;
        final Shape shape3;
        final CardColors cardColors4;
        final CardElevation cardElevation3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1850977784);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            function02 = function0;
        } else if ((i2 & 6) == 0) {
            function02 = function0;
            i5 = (composerKN.E2(function02) ? 4 : 2) | i2;
        } else {
            function02 = function0;
            i5 = i2;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            i7 = i3 & 4;
            if (i7 == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    z3 = z2;
                    i5 |= composerKN.n(z3) ? 256 : 128;
                }
                if ((i2 & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        shapeXMQ = shape;
                        int i10 = composerKN.p5(shapeXMQ) ? 2048 : 1024;
                        i5 |= i10;
                    } else {
                        shapeXMQ = shape;
                    }
                    i5 |= i10;
                } else {
                    shapeXMQ = shape;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        cardColors2 = cardColors;
                        int i11 = composerKN.p5(cardColors2) ? 16384 : 8192;
                        i5 |= i11;
                    } else {
                        cardColors2 = cardColors;
                    }
                    i5 |= i11;
                } else {
                    cardColors2 = cardColors;
                }
                if ((196608 & i2) == 0) {
                    if ((i3 & 32) == 0) {
                        cardElevationO = cardElevation;
                        int i12 = composerKN.p5(cardElevationO) ? 131072 : 65536;
                        i5 |= i12;
                    } else {
                        cardElevationO = cardElevation;
                    }
                    i5 |= i12;
                } else {
                    cardElevationO = cardElevation;
                }
                i8 = i3 & 64;
                if (i8 != 0) {
                    i5 |= 1572864;
                } else {
                    if ((i2 & 1572864) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        i5 |= composerKN.p5(mutableInteractionSource2) ? 1048576 : 524288;
                    }
                    if ((i3 & 128) != 0) {
                        if ((i2 & 12582912) == 0) {
                            i5 |= composerKN.E2(function3) ? 8388608 : 4194304;
                        }
                        if ((4793491 & i5) == 4793490 && composerKN.xMQ()) {
                            composerKN.wTp();
                            composer4 = composerKN;
                            modifier4 = modifier2;
                            z5 = z3;
                            shape3 = shapeXMQ;
                            cardColors4 = cardColors2;
                            cardElevation3 = cardElevationO;
                            mutableInteractionSource4 = mutableInteractionSource2;
                        } else {
                            composerKN.e();
                            if ((i2 & 1) != 0 || composerKN.rV9()) {
                                if (i9 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i7 != 0) {
                                    z3 = true;
                                }
                                if ((i3 & 8) != 0) {
                                    i5 &= -7169;
                                    shapeXMQ = CardDefaults.f24661n.xMQ(composerKN, 6);
                                }
                                if ((i3 & 16) == 0) {
                                    cardColorsNr = CardDefaults.f24661n.nr(composerKN, 6);
                                    i5 &= -57345;
                                } else {
                                    cardColorsNr = cardColors2;
                                }
                                if ((i3 & 32) == 0) {
                                    composer2 = composerKN;
                                    i5 &= -458753;
                                    cardElevationO = CardDefaults.f24661n.O(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer2, 1572864, 63);
                                } else {
                                    composer2 = composerKN;
                                }
                                if (i8 == 0) {
                                    cardColors3 = cardColorsNr;
                                    z4 = z3;
                                    shape2 = shapeXMQ;
                                    cardElevation2 = cardElevationO;
                                    composer3 = composer2;
                                    mutableInteractionSource3 = null;
                                } else {
                                    cardColors3 = cardColorsNr;
                                    z4 = z3;
                                    shape2 = shapeXMQ;
                                    cardElevation2 = cardElevationO;
                                    composer3 = composer2;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                }
                                modifier3 = modifier2;
                            } else {
                                composerKN.wTp();
                                if ((i3 & 8) != 0) {
                                    i5 &= -7169;
                                }
                                if ((i3 & 16) != 0) {
                                    i5 &= -57345;
                                }
                                if ((i3 & 32) != 0) {
                                    i5 &= -458753;
                                }
                                composer3 = composerKN;
                                shape2 = shapeXMQ;
                                cardColors3 = cardColors2;
                                cardElevation2 = cardElevationO;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                modifier3 = modifier2;
                                z4 = z3;
                            }
                            composer3.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-1850977784, i5, -1, "androidx.compose.material3.ElevatedCard (Card.kt:254)");
                            }
                            int i13 = i5 << 3;
                            rl(function02, modifier3, z4, shape2, cardColors3, cardElevation2, null, mutableInteractionSource3, function3, composer3, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (29360128 & i13) | (i13 & 234881024), 0);
                            MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource3;
                            composer4 = composer3;
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            mutableInteractionSource4 = mutableInteractionSource5;
                            modifier4 = modifier3;
                            z5 = z4;
                            shape3 = shape2;
                            cardColors4 = cardColors3;
                            cardElevation3 = cardElevation2;
                        }
                        scopeUpdateScopeGh = composer4.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.CardKt$ElevatedCard$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                    n(composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer5, int i14) {
                                    CardKt.nr(function0, modifier4, z5, shape3, cardColors4, cardElevation3, mutableInteractionSource4, function3, composer5, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 12582912;
                    if ((4793491 & i5) == 4793490) {
                        composerKN.e();
                        if ((i2 & 1) != 0) {
                            if (i9 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if ((i3 & 8) != 0) {
                            }
                            if ((i3 & 16) == 0) {
                            }
                            if ((i3 & 32) == 0) {
                            }
                            if (i8 == 0) {
                            }
                            modifier3 = modifier2;
                            composer3.S();
                            if (ComposerKt.v()) {
                            }
                            int i132 = i5 << 3;
                            rl(function02, modifier3, z4, shape2, cardColors3, cardElevation2, null, mutableInteractionSource3, function3, composer3, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (29360128 & i132) | (i132 & 234881024), 0);
                            MutableInteractionSource mutableInteractionSource52 = mutableInteractionSource3;
                            composer4 = composer3;
                            if (ComposerKt.v()) {
                            }
                            mutableInteractionSource4 = mutableInteractionSource52;
                            modifier4 = modifier3;
                            z5 = z4;
                            shape3 = shape2;
                            cardColors4 = cardColors3;
                            cardElevation3 = cardElevation2;
                        }
                    }
                    scopeUpdateScopeGh = composer4.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i3 & 128) != 0) {
                }
                if ((4793491 & i5) == 4793490) {
                }
                scopeUpdateScopeGh = composer4.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            z3 = z2;
            if ((i2 & 3072) == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            if ((196608 & i2) == 0) {
            }
            i8 = i3 & 64;
            if (i8 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i3 & 128) != 0) {
            }
            if ((4793491 & i5) == 4793490) {
            }
            scopeUpdateScopeGh = composer4.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        z3 = z2;
        if ((i2 & 3072) == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if ((196608 & i2) == 0) {
        }
        i8 = i3 & 64;
        if (i8 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i3 & 128) != 0) {
        }
        if ((4793491 & i5) == 4793490) {
        }
        scopeUpdateScopeGh = composer4.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final Function0 function0, Modifier modifier, boolean z2, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final Function3 function3, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        boolean z3;
        Shape shapeGh;
        CardColors cardColors2;
        CardElevation cardElevation2;
        int i8;
        BorderStroke borderStroke2;
        int i9;
        CardColors cardColorsN;
        Composer composer2;
        boolean z4;
        int i10;
        CardElevation cardElevationT;
        Modifier modifier3;
        Shape shape2;
        BorderStroke borderStroke3;
        int i11;
        boolean z5;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        Composer composer3;
        final CardColors cardColors3;
        final CardElevation cardElevation3;
        final MutableInteractionSource mutableInteractionSource4;
        final Modifier modifier4;
        final boolean z6;
        final Shape shape3;
        final BorderStroke borderStroke4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-2024281376);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(function0) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i12 = i3 & 2;
        if (i12 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            i7 = i3 & 4;
            if (i7 == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    z3 = z2;
                    i5 |= composerKN.n(z3) ? 256 : 128;
                }
                if ((i2 & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        shapeGh = shape;
                        int i13 = composerKN.p5(shapeGh) ? 2048 : 1024;
                        i5 |= i13;
                    } else {
                        shapeGh = shape;
                    }
                    i5 |= i13;
                } else {
                    shapeGh = shape;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        cardColors2 = cardColors;
                        int i14 = composerKN.p5(cardColors2) ? 16384 : 8192;
                        i5 |= i14;
                    } else {
                        cardColors2 = cardColors;
                    }
                    i5 |= i14;
                } else {
                    cardColors2 = cardColors;
                }
                if ((196608 & i2) == 0) {
                    if ((i3 & 32) == 0) {
                        cardElevation2 = cardElevation;
                        int i15 = composerKN.p5(cardElevation2) ? 131072 : 65536;
                        i5 |= i15;
                    } else {
                        cardElevation2 = cardElevation;
                    }
                    i5 |= i15;
                } else {
                    cardElevation2 = cardElevation;
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                    if ((1572864 & i2) == 0) {
                        borderStroke2 = borderStroke;
                        i5 |= composerKN.p5(borderStroke2) ? 1048576 : 524288;
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i5 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i5 |= composerKN.p5(mutableInteractionSource) ? 8388608 : 4194304;
                    }
                    if ((i3 & 256) == 0) {
                        i5 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i5 |= composerKN.E2(function3) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                    }
                    if ((38347923 & i5) == 38347922 || !composerKN.xMQ()) {
                        composerKN.e();
                        if ((i2 & 1) != 0 || composerKN.rV9()) {
                            if (i12 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 8) != 0) {
                                i5 &= -7169;
                                shapeGh = CardDefaults.f24661n.gh(composerKN, 6);
                            }
                            if ((i3 & 16) == 0) {
                                cardColorsN = CardDefaults.f24661n.n(composerKN, 6);
                                i5 &= -57345;
                            } else {
                                cardColorsN = cardColors2;
                            }
                            if ((i3 & 32) == 0) {
                                z4 = true;
                                i10 = i9;
                                cardElevationT = CardDefaults.f24661n.t(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerKN, 1572864, 63);
                                composer2 = composerKN;
                                i5 &= -458753;
                            } else {
                                composer2 = composerKN;
                                z4 = true;
                                i10 = i9;
                                cardElevationT = cardElevation;
                            }
                            BorderStroke borderStroke5 = i8 == 0 ? null : borderStroke;
                            if (i10 == 0) {
                                Modifier modifier5 = modifier2;
                                i11 = i5;
                                mutableInteractionSource2 = null;
                                modifier3 = modifier5;
                                shape2 = shapeGh;
                                borderStroke3 = borderStroke5;
                                z5 = z3;
                                composer2.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-2024281376, i11, -1, "androidx.compose.material3.Card (Card.kt:147)");
                                }
                                composer2.eF(1976524431);
                                if (mutableInteractionSource2 != null) {
                                    Object objIF = composer2.iF();
                                    if (objIF == Composer.INSTANCE.n()) {
                                        objIF = InteractionSourceKt.n();
                                        composer2.o(objIF);
                                    }
                                    mutableInteractionSource3 = (MutableInteractionSource) objIF;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                }
                                composer2.Xw();
                                composer3 = composer2;
                                SurfaceKt.nr(function0, modifier3, z5, shape2, cardColorsN.n(z5), cardColorsN.rl(z5), 0.0f, ((Dp) cardElevationT.J2(z5, mutableInteractionSource3, composer2, ((i11 >> 6) & 14) | ((i11 >> 9) & 896)).getValue()).getValue(), borderStroke3, mutableInteractionSource3, ComposableLambdaKt.nr(776921067, z4, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.CardKt$Card$3
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        n(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer4, int i16) {
                                        if ((i16 & 3) == 2 && composer4.xMQ()) {
                                            composer4.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(776921067, i16, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:161)");
                                        }
                                        Function3 function32 = function3;
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composer4, 0);
                                        int iN = ComposablesKt.n(composer4, 0);
                                        CompositionLocalMap compositionLocalMapIk = composer4.Ik();
                                        Modifier modifierO = ComposedModifierKt.O(composer4, companion);
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
                                        Updater.O(composerN, measurePolicyN, companion2.t());
                                        Updater.O(composerN, compositionLocalMapIk, companion2.O());
                                        Function2 function2Rl = companion2.rl();
                                        if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                            composerN.o(Integer.valueOf(iN));
                                            composerN.az(Integer.valueOf(iN), function2Rl);
                                        }
                                        Updater.O(composerN, modifierO, companion2.nr());
                                        function32.invoke(ColumnScopeInstance.f17468n, composer4, 6);
                                        composer4.XQ();
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composer2, 54), composer3, (i11 & 8190) | (234881024 & (i11 << 6)), 6, 64);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                cardColors3 = cardColorsN;
                                cardElevation3 = cardElevationT;
                                mutableInteractionSource4 = mutableInteractionSource2;
                                modifier4 = modifier3;
                                z6 = z5;
                                shape3 = shape2;
                                borderStroke4 = borderStroke3;
                            } else {
                                modifier3 = modifier2;
                                shape2 = shapeGh;
                                borderStroke3 = borderStroke5;
                                i11 = i5;
                                z5 = z3;
                            }
                        } else {
                            composerKN.wTp();
                            if ((i3 & 8) != 0) {
                                i5 &= -7169;
                            }
                            if ((i3 & 16) != 0) {
                                i5 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                i5 &= -458753;
                            }
                            shape2 = shapeGh;
                            cardColorsN = cardColors2;
                            z4 = true;
                            borderStroke3 = borderStroke2;
                            composer2 = composerKN;
                            modifier3 = modifier2;
                            z5 = z3;
                            cardElevationT = cardElevation;
                            i11 = i5;
                        }
                        mutableInteractionSource2 = mutableInteractionSource;
                        composer2.S();
                        if (ComposerKt.v()) {
                        }
                        composer2.eF(1976524431);
                        if (mutableInteractionSource2 != null) {
                        }
                        composer2.Xw();
                        composer3 = composer2;
                        SurfaceKt.nr(function0, modifier3, z5, shape2, cardColorsN.n(z5), cardColorsN.rl(z5), 0.0f, ((Dp) cardElevationT.J2(z5, mutableInteractionSource3, composer2, ((i11 >> 6) & 14) | ((i11 >> 9) & 896)).getValue()).getValue(), borderStroke3, mutableInteractionSource3, ComposableLambdaKt.nr(776921067, z4, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.CardKt$Card$3
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                n(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer4, int i16) {
                                if ((i16 & 3) == 2 && composer4.xMQ()) {
                                    composer4.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(776921067, i16, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:161)");
                                }
                                Function3 function32 = function3;
                                Modifier.Companion companion = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composer4, 0);
                                int iN = ComposablesKt.n(composer4, 0);
                                CompositionLocalMap compositionLocalMapIk = composer4.Ik();
                                Modifier modifierO = ComposedModifierKt.O(composer4, companion);
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
                                Updater.O(composerN, measurePolicyN, companion2.t());
                                Updater.O(composerN, compositionLocalMapIk, companion2.O());
                                Function2 function2Rl = companion2.rl();
                                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                    composerN.o(Integer.valueOf(iN));
                                    composerN.az(Integer.valueOf(iN), function2Rl);
                                }
                                Updater.O(composerN, modifierO, companion2.nr());
                                function32.invoke(ColumnScopeInstance.f17468n, composer4, 6);
                                composer4.XQ();
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composer2, 54), composer3, (i11 & 8190) | (234881024 & (i11 << 6)), 6, 64);
                        if (ComposerKt.v()) {
                        }
                        cardColors3 = cardColorsN;
                        cardElevation3 = cardElevationT;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        modifier4 = modifier3;
                        z6 = z5;
                        shape3 = shape2;
                        borderStroke4 = borderStroke3;
                    } else {
                        composerKN.wTp();
                        composer3 = composerKN;
                        modifier4 = modifier2;
                        z6 = z3;
                        shape3 = shapeGh;
                        cardColors3 = cardColors2;
                        cardElevation3 = cardElevation2;
                        borderStroke4 = borderStroke2;
                        mutableInteractionSource4 = mutableInteractionSource;
                    }
                    scopeUpdateScopeGh = composer3.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.CardKt$Card$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                n(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer4, int i16) {
                                CardKt.rl(function0, modifier4, z6, shape3, cardColors3, cardElevation3, borderStroke4, mutableInteractionSource4, function3, composer4, RecomposeScopeImplKt.n(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 1572864;
                borderStroke2 = borderStroke;
                i9 = i3 & 128;
                if (i9 == 0) {
                }
                if ((i3 & 256) == 0) {
                }
                if ((38347923 & i5) == 38347922) {
                    composerKN.e();
                    if ((i2 & 1) != 0) {
                        if (i12 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if ((i3 & 8) != 0) {
                        }
                        if ((i3 & 16) == 0) {
                        }
                        if ((i3 & 32) == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i10 == 0) {
                        }
                    }
                }
                scopeUpdateScopeGh = composer3.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            z3 = z2;
            if ((i2 & 3072) == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            if ((196608 & i2) == 0) {
            }
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            borderStroke2 = borderStroke;
            i9 = i3 & 128;
            if (i9 == 0) {
            }
            if ((i3 & 256) == 0) {
            }
            if ((38347923 & i5) == 38347922) {
            }
            scopeUpdateScopeGh = composer3.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        z3 = z2;
        if ((i2 & 3072) == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if ((196608 & i2) == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        borderStroke2 = borderStroke;
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        if ((i3 & 256) == 0) {
        }
        if ((38347923 & i5) == 38347922) {
        }
        scopeUpdateScopeGh = composer3.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(Modifier modifier, Shape shape, CardColors cardColors, CardElevation cardElevation, final Function3 function3, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        Shape shape2;
        CardColors cardColors2;
        CardElevation cardElevation2;
        Shape shapeXMQ;
        CardColors cardColorsNr;
        Composer composer2;
        Shape shape3;
        CardColors cardColors3;
        CardElevation cardElevationO;
        Modifier modifier3;
        Composer composer3;
        final Modifier modifier4;
        final Shape shape4;
        final CardColors cardColors4;
        final CardElevation cardElevation3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(895940201);
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
                shape2 = shape;
                int i8 = composerKN.p5(shape2) ? 32 : 16;
                i5 |= i8;
            } else {
                shape2 = shape;
            }
            i5 |= i8;
        } else {
            shape2 = shape;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            if ((i3 & 4) == 0) {
                cardColors2 = cardColors;
                int i9 = composerKN.p5(cardColors2) ? 256 : 128;
                i5 |= i9;
            } else {
                cardColors2 = cardColors;
            }
            i5 |= i9;
        } else {
            cardColors2 = cardColors;
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                cardElevation2 = cardElevation;
                int i10 = composerKN.p5(cardElevation2) ? 2048 : 1024;
                i5 |= i10;
            } else {
                cardElevation2 = cardElevation;
            }
            i5 |= i10;
        } else {
            cardElevation2 = cardElevation;
        }
        if ((i3 & 16) == 0) {
            if ((i2 & 24576) == 0) {
                i5 |= composerKN.E2(function3) ? 16384 : 8192;
            }
            if ((i5 & 9363) == 9362 || !composerKN.xMQ()) {
                composerKN.e();
                if ((i2 & 1) != 0 || composerKN.rV9()) {
                    Modifier modifier5 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i3 & 2) == 0) {
                        shapeXMQ = CardDefaults.f24661n.xMQ(composerKN, 6);
                        i5 &= -113;
                    } else {
                        shapeXMQ = shape2;
                    }
                    if ((i3 & 4) == 0) {
                        cardColorsNr = CardDefaults.f24661n.nr(composerKN, 6);
                        i5 &= -897;
                    } else {
                        cardColorsNr = cardColors2;
                    }
                    if ((i3 & 8) == 0) {
                        composer2 = composerKN;
                        i5 &= -7169;
                        modifier3 = modifier5;
                        shape3 = shapeXMQ;
                        cardColors3 = cardColorsNr;
                        cardElevationO = CardDefaults.f24661n.O(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer2, 1572864, 63);
                    } else {
                        composer2 = composerKN;
                        shape3 = shapeXMQ;
                        cardColors3 = cardColorsNr;
                        cardElevationO = cardElevation2;
                        modifier3 = modifier5;
                    }
                } else {
                    composerKN.wTp();
                    if ((i3 & 2) != 0) {
                        i5 &= -113;
                    }
                    if ((i3 & 4) != 0) {
                        i5 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        i5 &= -7169;
                    }
                    shape3 = shape2;
                    cardColors3 = cardColors2;
                    cardElevationO = cardElevation2;
                    composer2 = composerKN;
                    modifier3 = modifier2;
                }
                composer2.S();
                if (ComposerKt.v()) {
                    ComposerKt.p5(895940201, i5, -1, "androidx.compose.material3.ElevatedCard (Card.kt:200)");
                }
                Composer composer4 = composer2;
                n(modifier3, shape3, cardColors3, cardElevationO, null, function3, composer4, (i5 & 14) | 24576 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | ((i5 << 3) & 458752), 0);
                composer3 = composer4;
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier4 = modifier3;
                shape4 = shape3;
                cardColors4 = cardColors3;
                cardElevation3 = cardElevationO;
            } else {
                composerKN.wTp();
                modifier4 = modifier2;
                shape4 = shape2;
                cardColors4 = cardColors2;
                cardElevation3 = cardElevation2;
                composer3 = composerKN;
            }
            scopeUpdateScopeGh = composer3.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.CardKt$ElevatedCard$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                        n(composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer5, int i11) {
                        CardKt.t(modifier4, shape4, cardColors4, cardElevation3, function3, composer5, RecomposeScopeImplKt.n(i2 | 1), i3);
                    }
                });
                return;
            }
            return;
        }
        i5 |= 24576;
        if ((i5 & 9363) == 9362) {
            composerKN.e();
            if ((i2 & 1) != 0) {
                if (i7 == 0) {
                }
                if ((i3 & 2) == 0) {
                }
                if ((i3 & 4) == 0) {
                }
                if ((i3 & 8) == 0) {
                }
                composer2.S();
                if (ComposerKt.v()) {
                }
                Composer composer42 = composer2;
                n(modifier3, shape3, cardColors3, cardElevationO, null, function3, composer42, (i5 & 14) | 24576 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | ((i5 << 3) & 458752), 0);
                composer3 = composer42;
                if (ComposerKt.v()) {
                }
                modifier4 = modifier3;
                shape4 = shape3;
                cardColors4 = cardColors3;
                cardElevation3 = cardElevationO;
            }
        }
        scopeUpdateScopeGh = composer3.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }
}
