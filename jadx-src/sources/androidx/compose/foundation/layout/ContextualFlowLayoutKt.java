package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0090\u0001\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\f21\u0010\u0016\u001a-\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\u000e¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0090\u0001\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u001c21\u0010\u0016\u001a-\u0012\u0004\u0012\u00020\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\u000e¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a¯\u0001\u0010,\u001a\u0014\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0001\u001a\u00020\u00002\u0017\u0010%\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00130$¢\u0006\u0002\b\u00140#2;\u0010(\u001a7\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110&¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\u00130\u000e¢\u0006\u0002\b\u0014H\u0001¢\u0006\u0004\b,\u0010-\u001a¯\u0001\u0010.\u001a\u0014\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0001\u001a\u00020\u00002\u0017\u0010%\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00130$¢\u0006\u0002\b\u00140#2;\u0010(\u001a7\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110&¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\u00130\u000e¢\u0006\u0002\b\u0014H\u0001¢\u0006\u0004\b.\u0010/¨\u00060"}, d2 = {"", "itemCount", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/ui/Alignment$Vertical;", "itemVerticalAlignment", "maxItemsInEachRow", "maxLines", "Landroidx/compose/foundation/layout/ContextualFlowRowOverflow;", "overflow", "Lkotlin/Function2;", "Landroidx/compose/foundation/layout/ContextualFlowRowScope;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "index", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", AppLovinEventTypes.USER_VIEWED_CONTENT, "rl", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILandroidx/compose/foundation/layout/ContextualFlowRowOverflow;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/Alignment$Horizontal;", "itemHorizontalAlignment", "maxItemsInEachColumn", "Landroidx/compose/foundation/layout/ContextualFlowColumnOverflow;", "Landroidx/compose/foundation/layout/ContextualFlowColumnScope;", c.f62177j, "(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILandroidx/compose/foundation/layout/ContextualFlowColumnOverflow;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "maxItemsInMainAxis", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "overflowState", "", "Lkotlin/Function0;", "overflowComposables", "Landroidx/compose/foundation/layout/FlowLineInfo;", "info", "getComposable", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "nr", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;ILjava/util/List;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "t", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;ILjava/util/List;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nContextualFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextualFlowLayout.kt\nandroidx/compose/foundation/layout/ContextualFlowLayoutKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,594:1\n1247#2,6:595\n1247#2,6:601\n1247#2,6:607\n1247#2,6:613\n1247#2,6:619\n1247#2,6:625\n*S KotlinDebug\n*F\n+ 1 ContextualFlowLayout.kt\nandroidx/compose/foundation/layout/ContextualFlowLayoutKt\n*L\n81#1:595,6\n83#1:601,6\n156#1:607,6\n158#1:613,6\n396#1:619,6\n436#1:625,6\n*E\n"})
public final class ContextualFlowLayoutKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final int i2, Modifier modifier, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, Alignment.Horizontal horizontal2, int i3, int i5, ContextualFlowColumnOverflow contextualFlowColumnOverflow, final Function4 function4, Composer composer, final int i7, final int i8) {
        int i9;
        Modifier modifier2;
        int i10;
        Arrangement.Vertical vertical2;
        int i11;
        int i12;
        Alignment.Horizontal horizontalGh;
        int i13;
        int i14;
        int i15;
        final Arrangement.Horizontal horizontal3;
        final int i16;
        final ContextualFlowColumnOverflow contextualFlowColumnOverflow2;
        final Arrangement.Vertical vertical3;
        final int i17;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i18;
        Arrangement.Horizontal horizontalJ2;
        Composer composerKN = composer.KN(1048542435);
        if ((i8 & 1) != 0) {
            i9 = i7 | 6;
        } else if ((i7 & 6) == 0) {
            i9 = (composerKN.t(i2) ? 4 : 2) | i7;
        } else {
            i9 = i7;
        }
        int i19 = i8 & 2;
        if (i19 != 0) {
            i9 |= 48;
        } else {
            if ((i7 & 48) == 0) {
                modifier2 = modifier;
                i9 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            i10 = i8 & 4;
            if (i10 == 0) {
                i9 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i7 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    vertical2 = vertical;
                    i9 |= composerKN.p5(vertical2) ? 256 : 128;
                }
                i11 = i8 & 8;
                if (i11 != 0) {
                    i9 |= 3072;
                } else {
                    if ((i7 & 3072) == 0) {
                        i9 |= composerKN.p5(horizontal) ? 2048 : 1024;
                    }
                    i12 = i8 & 16;
                    if (i12 != 0) {
                        if ((i7 & 24576) == 0) {
                            horizontalGh = horizontal2;
                            i9 |= composerKN.p5(horizontalGh) ? 16384 : 8192;
                        }
                        i13 = i8 & 32;
                        if (i13 != 0) {
                            i9 |= 196608;
                        } else if ((i7 & 196608) == 0) {
                            i9 |= composerKN.t(i3) ? 131072 : 65536;
                        }
                        i14 = i8 & 64;
                        if (i14 != 0) {
                            i9 |= 1572864;
                        } else if ((i7 & 1572864) == 0) {
                            i9 |= composerKN.t(i5) ? 1048576 : 524288;
                        }
                        i15 = i8 & 128;
                        if (i15 != 0) {
                            i9 |= 12582912;
                        } else if ((i7 & 12582912) == 0) {
                            i9 |= composerKN.p5(contextualFlowColumnOverflow) ? 8388608 : 4194304;
                        }
                        if ((i8 & 256) != 0) {
                            i9 |= 100663296;
                        } else if ((i7 & 100663296) == 0) {
                            i9 |= composerKN.E2(function4) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        if (composerKN.HI((38347923 & i9) != 38347922, i9 & 1)) {
                            if (i19 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            Arrangement.Vertical verticalUo = i10 != 0 ? Arrangement.f17400n.Uo() : vertical2;
                            if (i11 != 0) {
                                horizontalJ2 = Arrangement.f17400n.J2();
                                i18 = i12;
                            } else {
                                i18 = i12;
                                horizontalJ2 = horizontal;
                            }
                            if (i18 != 0) {
                                horizontalGh = Alignment.INSTANCE.gh();
                            }
                            int i20 = i13 != 0 ? Integer.MAX_VALUE : i3;
                            int i21 = i14 != 0 ? Integer.MAX_VALUE : i5;
                            ContextualFlowColumnOverflow contextualFlowColumnOverflowN = i15 != 0 ? ContextualFlowColumnOverflow.INSTANCE.n() : contextualFlowColumnOverflow;
                            if (ComposerKt.v()) {
                                ComposerKt.p5(1048542435, i9, -1, "androidx.compose.foundation.layout.ContextualFlowColumn (ContextualFlowLayout.kt:154)");
                            }
                            int i22 = 29360128 & i9;
                            boolean z2 = i22 == 8388608;
                            Object objIF = composerKN.iF();
                            if (z2 || objIF == Composer.INSTANCE.n()) {
                                objIF = contextualFlowColumnOverflowN.rl();
                                composerKN.o(objIF);
                            }
                            FlowLayoutOverflowState flowLayoutOverflowState = (FlowLayoutOverflowState) objIF;
                            boolean z3 = i22 == 8388608;
                            Object objIF2 = composerKN.iF();
                            if (!z3) {
                                Object obj = objIF2;
                                if (objIF2 == Composer.INSTANCE.n()) {
                                    ArrayList arrayList = new ArrayList();
                                    contextualFlowColumnOverflowN.n(flowLayoutOverflowState, arrayList);
                                    composerKN.o(arrayList);
                                    obj = arrayList;
                                }
                                int i23 = i9 >> 6;
                                SubcomposeLayoutKt.n(modifier2, t(verticalUo, horizontalJ2, horizontalGh, i20, i21, flowLayoutOverflowState, i2, (List) obj, ComposableLambdaKt.nr(1048264111, true, new Function4<Integer, FlowLineInfo, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.ContextualFlowLayoutKt$ContextualFlowColumn$measurePolicy$1
                                    {
                                        super(4);
                                    }

                                    @Override // kotlin.jvm.functions.Function4
                                    public /* bridge */ /* synthetic */ Unit invoke(Integer num, FlowLineInfo flowLineInfo, Composer composer2, Integer num2) {
                                        n(num.intValue(), flowLineInfo, composer2, num2.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(int i24, FlowLineInfo flowLineInfo, Composer composer2, int i25) {
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(1048264111, i25, -1, "androidx.compose.foundation.layout.ContextualFlowColumn.<anonymous> (ContextualFlowLayout.kt:173)");
                                        }
                                        function4.invoke(new ContextualFlowColumnScopeImpl(flowLineInfo.getLineIndex(), flowLineInfo.getPositionInLine(), flowLineInfo.getMaxCrossAxisSize(), flowLineInfo.getMaxMainAxisSize(), null), Integer.valueOf(i24), composer2, Integer.valueOf((i25 << 3) & 112));
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composerKN, 54), composerKN, (i23 & 57344) | (i23 & 14) | 100663296 | (i23 & 112) | (i23 & 896) | (i23 & 7168) | ((i9 << 18) & 3670016)), composerKN, (i9 >> 3) & 14, 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                contextualFlowColumnOverflow2 = contextualFlowColumnOverflowN;
                                vertical3 = verticalUo;
                                horizontal3 = horizontalJ2;
                                i16 = i20;
                                i17 = i21;
                            }
                        } else {
                            composerKN.wTp();
                            horizontal3 = horizontal;
                            i16 = i3;
                            contextualFlowColumnOverflow2 = contextualFlowColumnOverflow;
                            vertical3 = vertical2;
                            i17 = i5;
                        }
                        final Modifier modifier3 = modifier2;
                        final Alignment.Horizontal horizontal4 = horizontalGh;
                        scopeUpdateScopeGh = composerKN.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.ContextualFlowLayoutKt$ContextualFlowColumn$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    n(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer2, int i24) {
                                    ContextualFlowLayoutKt.n(i2, modifier3, vertical3, horizontal3, horizontal4, i16, i17, contextualFlowColumnOverflow2, function4, composer2, RecomposeScopeImplKt.n(i7 | 1), i8);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i9 |= 24576;
                    horizontalGh = horizontal2;
                    i13 = i8 & 32;
                    if (i13 != 0) {
                    }
                    i14 = i8 & 64;
                    if (i14 != 0) {
                    }
                    i15 = i8 & 128;
                    if (i15 != 0) {
                    }
                    if ((i8 & 256) != 0) {
                    }
                    if (composerKN.HI((38347923 & i9) != 38347922, i9 & 1)) {
                    }
                    final Modifier modifier32 = modifier2;
                    final Alignment.Horizontal horizontal42 = horizontalGh;
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                i12 = i8 & 16;
                if (i12 != 0) {
                }
                horizontalGh = horizontal2;
                i13 = i8 & 32;
                if (i13 != 0) {
                }
                i14 = i8 & 64;
                if (i14 != 0) {
                }
                i15 = i8 & 128;
                if (i15 != 0) {
                }
                if ((i8 & 256) != 0) {
                }
                if (composerKN.HI((38347923 & i9) != 38347922, i9 & 1)) {
                }
                final Modifier modifier322 = modifier2;
                final Alignment.Horizontal horizontal422 = horizontalGh;
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            vertical2 = vertical;
            i11 = i8 & 8;
            if (i11 != 0) {
            }
            i12 = i8 & 16;
            if (i12 != 0) {
            }
            horizontalGh = horizontal2;
            i13 = i8 & 32;
            if (i13 != 0) {
            }
            i14 = i8 & 64;
            if (i14 != 0) {
            }
            i15 = i8 & 128;
            if (i15 != 0) {
            }
            if ((i8 & 256) != 0) {
            }
            if (composerKN.HI((38347923 & i9) != 38347922, i9 & 1)) {
            }
            final Modifier modifier3222 = modifier2;
            final Alignment.Horizontal horizontal4222 = horizontalGh;
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i10 = i8 & 4;
        if (i10 == 0) {
        }
        vertical2 = vertical;
        i11 = i8 & 8;
        if (i11 != 0) {
        }
        i12 = i8 & 16;
        if (i12 != 0) {
        }
        horizontalGh = horizontal2;
        i13 = i8 & 32;
        if (i13 != 0) {
        }
        i14 = i8 & 64;
        if (i14 != 0) {
        }
        i15 = i8 & 128;
        if (i15 != 0) {
        }
        if ((i8 & 256) != 0) {
        }
        if (composerKN.HI((38347923 & i9) != 38347922, i9 & 1)) {
        }
        final Modifier modifier32222 = modifier2;
        final Alignment.Horizontal horizontal42222 = horizontalGh;
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0072 A[PHI: r4
      0x0072: PHI (r4v16 int) = (r4v14 int), (r4v17 int) binds: [B:36:0x0070, B:32:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Function2 nr(Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, Alignment.Vertical vertical2, int i2, int i3, FlowLayoutOverflowState flowLayoutOverflowState, int i5, List list, Function4 function4, Composer composer, int i7) {
        int i8;
        boolean z2;
        boolean z3;
        boolean z4;
        Object objIF;
        if (ComposerKt.v()) {
            ComposerKt.p5(785825072, i7, -1, "androidx.compose.foundation.layout.contextualRowMeasurementHelper (ContextualFlowLayout.kt:394)");
        }
        boolean z5 = ((((i7 & 14) ^ 6) > 4 && composer.p5(horizontal)) || (i7 & 6) == 4) | ((((i7 & 112) ^ 48) > 32 && composer.p5(vertical)) || (i7 & 48) == 32) | ((((i7 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && composer.p5(vertical2)) || (i7 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256);
        if (((i7 & 7168) ^ 3072) > 2048) {
            i8 = i2;
            if (composer.t(i8)) {
                z2 = true;
            }
            boolean zP5 = z5 | z2 | ((((57344 & i7) ^ 24576) <= 16384 && composer.t(i3)) || (i7 & 24576) == 16384) | composer.p5(flowLayoutOverflowState) | ((((3670016 & i7) ^ 1572864) <= 1048576 && composer.t(i5)) || (i7 & 1572864) == 1048576);
            if (((234881024 & i7) ^ 100663296) > 67108864 || !composer.p5(function4)) {
                z3 = (i7 & 100663296) == 67108864;
            }
            z4 = zP5 | z3;
            objIF = composer.iF();
            if (!z4 || objIF == Composer.INSTANCE.n()) {
                objIF = new FlowMeasureLazyPolicy(true, horizontal, vertical, horizontal.getSpacing(), CrossAxisAlignment.INSTANCE.t(vertical2), vertical.getSpacing(), i5, i3, i8, flowLayoutOverflowState, list, function4, null).mUb();
                composer.o(objIF);
            }
            Function2 function2 = (Function2) objIF;
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            return function2;
        }
        i8 = i2;
        if ((i7 & 3072) != 2048) {
            z2 = false;
        }
        boolean zP52 = z5 | z2 | ((((57344 & i7) ^ 24576) <= 16384 && composer.t(i3)) || (i7 & 24576) == 16384) | composer.p5(flowLayoutOverflowState) | ((((3670016 & i7) ^ 1572864) <= 1048576 && composer.t(i5)) || (i7 & 1572864) == 1048576);
        if (((234881024 & i7) ^ 100663296) > 67108864) {
        }
        if ((i7 & 100663296) == 67108864) {
        }
        z4 = zP52 | z3;
        objIF = composer.iF();
        if (!z4) {
            objIF = new FlowMeasureLazyPolicy(true, horizontal, vertical, horizontal.getSpacing(), CrossAxisAlignment.INSTANCE.t(vertical2), vertical.getSpacing(), i5, i3, i8, flowLayoutOverflowState, list, function4, null).mUb();
            composer.o(objIF);
        }
        Function2 function22 = (Function2) objIF;
        if (ComposerKt.v()) {
        }
        return function22;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final int i2, Modifier modifier, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, Alignment.Vertical vertical2, int i3, int i5, ContextualFlowRowOverflow contextualFlowRowOverflow, final Function4 function4, Composer composer, final int i7, final int i8) {
        int i9;
        Modifier modifier2;
        int i10;
        Arrangement.Horizontal horizontal2;
        int i11;
        int i12;
        Alignment.Vertical verticalQie;
        int i13;
        int i14;
        int i15;
        final Arrangement.Vertical vertical3;
        final int i16;
        final ContextualFlowRowOverflow contextualFlowRowOverflow2;
        final Arrangement.Horizontal horizontal3;
        final int i17;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i18;
        Arrangement.Vertical verticalUo;
        Composer composerKN = composer.KN(253921631);
        if ((i8 & 1) != 0) {
            i9 = i7 | 6;
        } else if ((i7 & 6) == 0) {
            i9 = (composerKN.t(i2) ? 4 : 2) | i7;
        } else {
            i9 = i7;
        }
        int i19 = i8 & 2;
        if (i19 != 0) {
            i9 |= 48;
        } else {
            if ((i7 & 48) == 0) {
                modifier2 = modifier;
                i9 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            i10 = i8 & 4;
            if (i10 == 0) {
                i9 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i7 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    horizontal2 = horizontal;
                    i9 |= composerKN.p5(horizontal2) ? 256 : 128;
                }
                i11 = i8 & 8;
                if (i11 != 0) {
                    i9 |= 3072;
                } else {
                    if ((i7 & 3072) == 0) {
                        i9 |= composerKN.p5(vertical) ? 2048 : 1024;
                    }
                    i12 = i8 & 16;
                    if (i12 != 0) {
                        if ((i7 & 24576) == 0) {
                            verticalQie = vertical2;
                            i9 |= composerKN.p5(verticalQie) ? 16384 : 8192;
                        }
                        i13 = i8 & 32;
                        if (i13 != 0) {
                            i9 |= 196608;
                        } else if ((i7 & 196608) == 0) {
                            i9 |= composerKN.t(i3) ? 131072 : 65536;
                        }
                        i14 = i8 & 64;
                        if (i14 != 0) {
                            i9 |= 1572864;
                        } else if ((i7 & 1572864) == 0) {
                            i9 |= composerKN.t(i5) ? 1048576 : 524288;
                        }
                        i15 = i8 & 128;
                        if (i15 != 0) {
                            i9 |= 12582912;
                        } else if ((i7 & 12582912) == 0) {
                            i9 |= composerKN.p5(contextualFlowRowOverflow) ? 8388608 : 4194304;
                        }
                        if ((i8 & 256) != 0) {
                            i9 |= 100663296;
                        } else if ((i7 & 100663296) == 0) {
                            i9 |= composerKN.E2(function4) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        if (composerKN.HI((38347923 & i9) != 38347922, i9 & 1)) {
                            if (i19 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            Arrangement.Horizontal horizontalJ2 = i10 != 0 ? Arrangement.f17400n.J2() : horizontal2;
                            if (i11 != 0) {
                                verticalUo = Arrangement.f17400n.Uo();
                                i18 = i12;
                            } else {
                                i18 = i12;
                                verticalUo = vertical;
                            }
                            if (i18 != 0) {
                                verticalQie = Alignment.INSTANCE.qie();
                            }
                            int i20 = i13 != 0 ? Integer.MAX_VALUE : i3;
                            int i21 = i14 != 0 ? Integer.MAX_VALUE : i5;
                            ContextualFlowRowOverflow contextualFlowRowOverflowN = i15 != 0 ? ContextualFlowRowOverflow.INSTANCE.n() : contextualFlowRowOverflow;
                            if (ComposerKt.v()) {
                                ComposerKt.p5(253921631, i9, -1, "androidx.compose.foundation.layout.ContextualFlowRow (ContextualFlowLayout.kt:79)");
                            }
                            int i22 = 29360128 & i9;
                            boolean z2 = i22 == 8388608;
                            Object objIF = composerKN.iF();
                            if (z2 || objIF == Composer.INSTANCE.n()) {
                                objIF = contextualFlowRowOverflowN.rl();
                                composerKN.o(objIF);
                            }
                            FlowLayoutOverflowState flowLayoutOverflowState = (FlowLayoutOverflowState) objIF;
                            boolean z3 = i22 == 8388608;
                            Object objIF2 = composerKN.iF();
                            if (!z3) {
                                Object obj = objIF2;
                                if (objIF2 == Composer.INSTANCE.n()) {
                                    ArrayList arrayList = new ArrayList();
                                    contextualFlowRowOverflowN.n(flowLayoutOverflowState, arrayList);
                                    composerKN.o(arrayList);
                                    obj = arrayList;
                                }
                                int i23 = i9 >> 6;
                                SubcomposeLayoutKt.n(modifier2, nr(horizontalJ2, verticalUo, verticalQie, i20, i21, flowLayoutOverflowState, i2, (List) obj, ComposableLambdaKt.nr(-1599700159, true, new Function4<Integer, FlowLineInfo, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.ContextualFlowLayoutKt$ContextualFlowRow$measurePolicy$1
                                    {
                                        super(4);
                                    }

                                    @Override // kotlin.jvm.functions.Function4
                                    public /* bridge */ /* synthetic */ Unit invoke(Integer num, FlowLineInfo flowLineInfo, Composer composer2, Integer num2) {
                                        n(num.intValue(), flowLineInfo, composer2, num2.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(int i24, FlowLineInfo flowLineInfo, Composer composer2, int i25) {
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(-1599700159, i25, -1, "androidx.compose.foundation.layout.ContextualFlowRow.<anonymous> (ContextualFlowLayout.kt:98)");
                                        }
                                        function4.invoke(new ContextualFlowRowScopeImpl(flowLineInfo.getLineIndex(), flowLineInfo.getPositionInLine(), flowLineInfo.getMaxMainAxisSize(), flowLineInfo.getMaxCrossAxisSize(), null), Integer.valueOf(i24), composer2, Integer.valueOf((i25 << 3) & 112));
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composerKN, 54), composerKN, (i23 & 57344) | (i23 & 14) | 100663296 | (i23 & 112) | (i23 & 896) | (i23 & 7168) | ((i9 << 18) & 3670016)), composerKN, (i9 >> 3) & 14, 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                contextualFlowRowOverflow2 = contextualFlowRowOverflowN;
                                horizontal3 = horizontalJ2;
                                vertical3 = verticalUo;
                                i16 = i20;
                                i17 = i21;
                            }
                        } else {
                            composerKN.wTp();
                            vertical3 = vertical;
                            i16 = i3;
                            contextualFlowRowOverflow2 = contextualFlowRowOverflow;
                            horizontal3 = horizontal2;
                            i17 = i5;
                        }
                        final Modifier modifier3 = modifier2;
                        final Alignment.Vertical vertical4 = verticalQie;
                        scopeUpdateScopeGh = composerKN.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.ContextualFlowLayoutKt$ContextualFlowRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    n(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer2, int i24) {
                                    ContextualFlowLayoutKt.rl(i2, modifier3, horizontal3, vertical3, vertical4, i16, i17, contextualFlowRowOverflow2, function4, composer2, RecomposeScopeImplKt.n(i7 | 1), i8);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i9 |= 24576;
                    verticalQie = vertical2;
                    i13 = i8 & 32;
                    if (i13 != 0) {
                    }
                    i14 = i8 & 64;
                    if (i14 != 0) {
                    }
                    i15 = i8 & 128;
                    if (i15 != 0) {
                    }
                    if ((i8 & 256) != 0) {
                    }
                    if (composerKN.HI((38347923 & i9) != 38347922, i9 & 1)) {
                    }
                    final Modifier modifier32 = modifier2;
                    final Alignment.Vertical vertical42 = verticalQie;
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                i12 = i8 & 16;
                if (i12 != 0) {
                }
                verticalQie = vertical2;
                i13 = i8 & 32;
                if (i13 != 0) {
                }
                i14 = i8 & 64;
                if (i14 != 0) {
                }
                i15 = i8 & 128;
                if (i15 != 0) {
                }
                if ((i8 & 256) != 0) {
                }
                if (composerKN.HI((38347923 & i9) != 38347922, i9 & 1)) {
                }
                final Modifier modifier322 = modifier2;
                final Alignment.Vertical vertical422 = verticalQie;
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            horizontal2 = horizontal;
            i11 = i8 & 8;
            if (i11 != 0) {
            }
            i12 = i8 & 16;
            if (i12 != 0) {
            }
            verticalQie = vertical2;
            i13 = i8 & 32;
            if (i13 != 0) {
            }
            i14 = i8 & 64;
            if (i14 != 0) {
            }
            i15 = i8 & 128;
            if (i15 != 0) {
            }
            if ((i8 & 256) != 0) {
            }
            if (composerKN.HI((38347923 & i9) != 38347922, i9 & 1)) {
            }
            final Modifier modifier3222 = modifier2;
            final Alignment.Vertical vertical4222 = verticalQie;
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i10 = i8 & 4;
        if (i10 == 0) {
        }
        horizontal2 = horizontal;
        i11 = i8 & 8;
        if (i11 != 0) {
        }
        i12 = i8 & 16;
        if (i12 != 0) {
        }
        verticalQie = vertical2;
        i13 = i8 & 32;
        if (i13 != 0) {
        }
        i14 = i8 & 64;
        if (i14 != 0) {
        }
        i15 = i8 & 128;
        if (i15 != 0) {
        }
        if ((i8 & 256) != 0) {
        }
        if (composerKN.HI((38347923 & i9) != 38347922, i9 & 1)) {
        }
        final Modifier modifier32222 = modifier2;
        final Alignment.Vertical vertical42222 = verticalQie;
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0072 A[PHI: r4
      0x0072: PHI (r4v16 int) = (r4v14 int), (r4v17 int) binds: [B:36:0x0070, B:32:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Function2 t(Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, Alignment.Horizontal horizontal2, int i2, int i3, FlowLayoutOverflowState flowLayoutOverflowState, int i5, List list, Function4 function4, Composer composer, int i7) {
        int i8;
        boolean z2;
        boolean z3;
        boolean z4;
        Object objIF;
        if (ComposerKt.v()) {
            ComposerKt.p5(-1985535130, i7, -1, "androidx.compose.foundation.layout.contextualColumnMeasureHelper (ContextualFlowLayout.kt:434)");
        }
        boolean z5 = ((((i7 & 14) ^ 6) > 4 && composer.p5(vertical)) || (i7 & 6) == 4) | ((((i7 & 112) ^ 48) > 32 && composer.p5(horizontal)) || (i7 & 48) == 32) | ((((i7 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && composer.p5(horizontal2)) || (i7 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256);
        if (((i7 & 7168) ^ 3072) > 2048) {
            i8 = i2;
            if (composer.t(i8)) {
                z2 = true;
            }
            boolean zP5 = z5 | z2 | ((((57344 & i7) ^ 24576) <= 16384 && composer.t(i3)) || (i7 & 24576) == 16384) | composer.p5(flowLayoutOverflowState) | ((((3670016 & i7) ^ 1572864) <= 1048576 && composer.t(i5)) || (i7 & 1572864) == 1048576);
            if (((234881024 & i7) ^ 100663296) > 67108864 || !composer.p5(function4)) {
                z3 = (i7 & 100663296) == 67108864;
            }
            z4 = zP5 | z3;
            objIF = composer.iF();
            if (!z4 || objIF == Composer.INSTANCE.n()) {
                objIF = new FlowMeasureLazyPolicy(false, horizontal, vertical, vertical.getSpacing(), CrossAxisAlignment.INSTANCE.rl(horizontal2), horizontal.getSpacing(), i5, i3, i8, flowLayoutOverflowState, list, function4, null).mUb();
                composer.o(objIF);
            }
            Function2 function2 = (Function2) objIF;
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            return function2;
        }
        i8 = i2;
        if ((i7 & 3072) != 2048) {
            z2 = false;
        }
        boolean zP52 = z5 | z2 | ((((57344 & i7) ^ 24576) <= 16384 && composer.t(i3)) || (i7 & 24576) == 16384) | composer.p5(flowLayoutOverflowState) | ((((3670016 & i7) ^ 1572864) <= 1048576 && composer.t(i5)) || (i7 & 1572864) == 1048576);
        if (((234881024 & i7) ^ 100663296) > 67108864) {
        }
        if ((i7 & 100663296) == 67108864) {
        }
        z4 = zP52 | z3;
        objIF = composer.iF();
        if (!z4) {
            objIF = new FlowMeasureLazyPolicy(false, horizontal, vertical, vertical.getSpacing(), CrossAxisAlignment.INSTANCE.rl(horizontal2), horizontal.getSpacing(), i5, i3, i8, flowLayoutOverflowState, list, function4, null).mUb();
            composer.o(objIF);
        }
        Function2 function22 = (Function2) objIF;
        if (ComposerKt.v()) {
        }
        return function22;
    }
}
