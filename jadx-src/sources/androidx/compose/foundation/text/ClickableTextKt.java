package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.media3.exoplayer.RendererCapabilities;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001av\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/text/TextStyle;", "style", "", "softWrap", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "maxLines", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "", "onTextLayout", "onClick", c.f62177j, "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nClickableText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClickableText.kt\nandroidx/compose/foundation/text/ClickableTextKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,104:1\n1247#2,6:105\n1247#2,6:111\n1247#2,6:117\n*S KotlinDebug\n*F\n+ 1 ClickableText.kt\nandroidx/compose/foundation/text/ClickableTextKt\n*L\n81#1:105,6\n83#1:111,6\n98#1:117,6\n*E\n"})
public final class ClickableTextKt {
    /* JADX WARN: Removed duplicated region for block: B:138:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, boolean z2, int i2, int i3, Function1 function1, final Function1 function12, Composer composer, final int i5, final int i7) {
        AnnotatedString annotatedString2;
        int i8;
        Modifier modifier2;
        int i9;
        TextStyle textStyle2;
        int i10;
        int i11;
        int iN;
        int i12;
        int i13;
        Composer composer2;
        final boolean z3;
        final int i14;
        final TextStyle textStyle3;
        final Function1 function13;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i15;
        int i16;
        Composer composerKN = composer.KN(-246609449);
        if ((i7 & 1) != 0) {
            i8 = i5 | 6;
            annotatedString2 = annotatedString;
        } else {
            annotatedString2 = annotatedString;
            if ((i5 & 6) == 0) {
                i8 = (composerKN.p5(annotatedString2) ? 4 : 2) | i5;
            } else {
                i8 = i5;
            }
        }
        int i17 = i7 & 2;
        if (i17 != 0) {
            i8 |= 48;
        } else {
            if ((i5 & 48) == 0) {
                modifier2 = modifier;
                i8 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            i9 = i7 & 4;
            if (i9 == 0) {
                i8 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    textStyle2 = textStyle;
                    i8 |= composerKN.p5(textStyle2) ? 256 : 128;
                }
                i10 = i7 & 8;
                if (i10 != 0) {
                    i8 |= 3072;
                } else {
                    if ((i5 & 3072) == 0) {
                        i8 |= composerKN.n(z2) ? 2048 : 1024;
                    }
                    i11 = i7 & 16;
                    if (i11 != 0) {
                        if ((i5 & 24576) == 0) {
                            iN = i2;
                            i8 |= composerKN.t(iN) ? 16384 : 8192;
                        }
                        i12 = i7 & 32;
                        if (i12 != 0) {
                            i8 |= 196608;
                        } else if ((i5 & 196608) == 0) {
                            i8 |= composerKN.t(i3) ? 131072 : 65536;
                        }
                        i13 = i7 & 64;
                        if (i13 != 0) {
                            i8 |= 1572864;
                        } else if ((i5 & 1572864) == 0) {
                            i8 |= composerKN.E2(function1) ? 1048576 : 524288;
                        }
                        if ((i7 & 128) != 0) {
                            i8 |= 12582912;
                        } else if ((i5 & 12582912) == 0) {
                            i8 |= composerKN.E2(function12) ? 8388608 : 4194304;
                        }
                        if (composerKN.HI((i8 & 4793491) != 4793490, i8 & 1)) {
                            if (i17 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            TextStyle textStyleN = i9 != 0 ? TextStyle.INSTANCE.n() : textStyle2;
                            boolean z4 = i10 != 0 ? true : z2;
                            if (i11 != 0) {
                                iN = TextOverflow.INSTANCE.n();
                            }
                            if (i12 != 0) {
                                i16 = Integer.MAX_VALUE;
                                i15 = i13;
                            } else {
                                i15 = i13;
                                i16 = i3;
                            }
                            final Function1 function14 = i15 != 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                                public final void n(TextLayoutResult textLayoutResult) {
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    n(textLayoutResult);
                                    return Unit.INSTANCE;
                                }
                            } : function1;
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-246609449, i8, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                            }
                            Object objIF = composerKN.iF();
                            Composer.Companion companion = Composer.INSTANCE;
                            if (objIF == companion.n()) {
                                objIF = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);
                                composerKN.o(objIF);
                            }
                            final MutableState mutableState = (MutableState) objIF;
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            boolean z5 = (29360128 & i8) == 8388608;
                            Object objIF2 = composerKN.iF();
                            if (z5 || objIF2 == companion.n()) {
                                objIF2 = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$pressIndicator$1$1
                                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                                    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                                        final MutableState mutableState2 = mutableState;
                                        final Function1 function15 = function12;
                                        Object objAz = TapGestureDetectorKt.az(pointerInputScope, null, null, null, new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$pressIndicator$1$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                                                n(offset.getPackedValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(long j2) {
                                                TextLayoutResult textLayoutResult = (TextLayoutResult) mutableState2.getValue();
                                                if (textLayoutResult != null) {
                                                    function15.invoke(Integer.valueOf(textLayoutResult.aYN(j2)));
                                                }
                                            }
                                        }, continuation, 7, null);
                                        return objAz == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAz : Unit.INSTANCE;
                                    }
                                };
                                composerKN.o(objIF2);
                            }
                            Modifier modifierZmq = modifier2.Zmq(SuspendingPointerInputFilterKt.nr(companion2, function12, (PointerInputEventHandler) objIF2));
                            boolean z6 = (i8 & 3670016) == 1048576;
                            Object objIF3 = composerKN.iF();
                            if (z6 || objIF3 == companion.n()) {
                                objIF3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        n(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(TextLayoutResult textLayoutResult) {
                                        mutableState.setValue(textLayoutResult);
                                        function14.invoke(textLayoutResult);
                                    }
                                };
                                composerKN.o(objIF3);
                            }
                            composer2 = composerKN;
                            BasicTextKt.nr(annotatedString2, modifierZmq, textStyleN, (Function1) objIF3, iN, z4, i16, 0, null, null, null, composer2, (58254 & i8) | (458752 & (i8 << 6)) | ((i8 << 3) & 3670016), 0, 1920);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            function13 = function14;
                            textStyle3 = textStyleN;
                            z3 = z4;
                            i14 = i16;
                        } else {
                            composer2 = composerKN;
                            composer2.wTp();
                            z3 = z2;
                            i14 = i3;
                            textStyle3 = textStyle2;
                            function13 = function1;
                        }
                        final Modifier modifier3 = modifier2;
                        final int i18 = iN;
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
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
                                    ClickableTextKt.n(annotatedString, modifier3, textStyle3, z3, i18, i14, function13, function12, composer3, RecomposeScopeImplKt.n(i5 | 1), i7);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i8 |= 24576;
                    iN = i2;
                    i12 = i7 & 32;
                    if (i12 != 0) {
                    }
                    i13 = i7 & 64;
                    if (i13 != 0) {
                    }
                    if ((i7 & 128) != 0) {
                    }
                    if (composerKN.HI((i8 & 4793491) != 4793490, i8 & 1)) {
                    }
                    final Modifier modifier32 = modifier2;
                    final int i182 = iN;
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                i11 = i7 & 16;
                if (i11 != 0) {
                }
                iN = i2;
                i12 = i7 & 32;
                if (i12 != 0) {
                }
                i13 = i7 & 64;
                if (i13 != 0) {
                }
                if ((i7 & 128) != 0) {
                }
                if (composerKN.HI((i8 & 4793491) != 4793490, i8 & 1)) {
                }
                final Modifier modifier322 = modifier2;
                final int i1822 = iN;
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            textStyle2 = textStyle;
            i10 = i7 & 8;
            if (i10 != 0) {
            }
            i11 = i7 & 16;
            if (i11 != 0) {
            }
            iN = i2;
            i12 = i7 & 32;
            if (i12 != 0) {
            }
            i13 = i7 & 64;
            if (i13 != 0) {
            }
            if ((i7 & 128) != 0) {
            }
            if (composerKN.HI((i8 & 4793491) != 4793490, i8 & 1)) {
            }
            final Modifier modifier3222 = modifier2;
            final int i18222 = iN;
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i9 = i7 & 4;
        if (i9 == 0) {
        }
        textStyle2 = textStyle;
        i10 = i7 & 8;
        if (i10 != 0) {
        }
        i11 = i7 & 16;
        if (i11 != 0) {
        }
        iN = i2;
        i12 = i7 & 32;
        if (i12 != 0) {
        }
        i13 = i7 & 64;
        if (i13 != 0) {
        }
        if ((i7 & 128) != 0) {
        }
        if (composerKN.HI((i8 & 4793491) != 4793490, i8 & 1)) {
        }
        final Modifier modifier32222 = modifier2;
        final int i182222 = iN;
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }
}
