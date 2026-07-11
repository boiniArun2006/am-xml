package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldBufferKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0005\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\n\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a?\u0010\u0011\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u001a\b\u0002\u0010\u0010\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000f\u0018\u00010\fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a#\u0010\u0015\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0015\u0010\u000b\u001a#\u0010\u0016\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0016\u0010\u000b\u001a\u0013\u0010\u0017\u001a\u00020\u0005*\u00020\u0000H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a#\u0010\u0019\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0019\u0010\u000b\u001a\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a+\u0010\"\u001a\u00020\u0005*\u00020 2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020!H\u0001¢\u0006\u0004\b\"\u0010#\u001a#\u0010$\u001a\u00020\u0005*\u00020 2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0001¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"Landroidx/compose/foundation/text/input/internal/ImeEditCommandScope;", "", "text", "", "newCursorPosition", "", "rl", "(Landroidx/compose/foundation/text/input/internal/ImeEditCommandScope;Ljava/lang/String;I)V", TtmlNode.START, TtmlNode.END, "xMQ", "(Landroidx/compose/foundation/text/input/internal/ImeEditCommandScope;II)V", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "Landroidx/compose/foundation/text/input/PlacedAnnotation;", "annotations", "mUb", "(Landroidx/compose/foundation/text/input/internal/ImeEditCommandScope;Ljava/lang/String;ILjava/util/List;)V", "lengthBeforeCursor", "lengthAfterCursor", "t", "nr", "O", "(Landroidx/compose/foundation/text/input/internal/ImeEditCommandScope;)V", "gh", "", "high", l.aa, "", "KN", "(CC)Z", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "", "Uo", "(Landroidx/compose/foundation/text/input/TextFieldBuffer;IILjava/lang/CharSequence;)V", "J2", "(Landroidx/compose/foundation/text/input/TextFieldBuffer;II)V", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ImeEditCommand_androidKt {
    public static final void O(ImeEditCommandScope imeEditCommandScope) {
        imeEditCommandScope.t(new Function1<TextFieldBuffer, Unit>() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt$finishComposingText$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TextFieldBuffer textFieldBuffer) {
                n(textFieldBuffer);
                return Unit.INSTANCE;
            }

            public final void n(TextFieldBuffer textFieldBuffer) {
                textFieldBuffer.nr();
            }
        });
    }

    public static final void gh(final ImeEditCommandScope imeEditCommandScope, final int i2, final int i3) {
        imeEditCommandScope.t(new Function1<TextFieldBuffer, Unit>() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt$setSelection$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TextFieldBuffer textFieldBuffer) {
                n(textFieldBuffer);
                return Unit.INSTANCE;
            }

            public final void n(TextFieldBuffer textFieldBuffer) {
                long jO = imeEditCommandScope.O(TextRangeKt.rl(0, textFieldBuffer.mUb()));
                int i5 = i2;
                int iQie = TextRange.qie(jO);
                int iGh = TextRange.gh(jO);
                if (i5 < iQie) {
                    i5 = iQie;
                }
                if (i5 <= iGh) {
                    iGh = i5;
                }
                int i7 = i3;
                int iQie2 = TextRange.qie(jO);
                int iGh2 = TextRange.gh(jO);
                if (i7 < iQie2) {
                    i7 = iQie2;
                }
                if (i7 <= iGh2) {
                    iGh2 = i7;
                }
                textFieldBuffer.aYN(imeEditCommandScope.J2(TextRangeKt.rl(iGh, iGh2)));
            }
        });
    }

    public static final void mUb(ImeEditCommandScope imeEditCommandScope, final String str, final int i2, final List list) {
        imeEditCommandScope.t(new Function1<TextFieldBuffer, Unit>() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt$setComposingText$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TextFieldBuffer textFieldBuffer) {
                n(textFieldBuffer);
                return Unit.INSTANCE;
            }

            public final void n(TextFieldBuffer textFieldBuffer) {
                int length;
                TextRange composition = textFieldBuffer.getComposition();
                if (composition != null) {
                    ImeEditCommand_androidKt.Uo(textFieldBuffer, TextRange.ty(composition.getPackedValue()), TextRange.xMQ(composition.getPackedValue()), str);
                    if (str.length() > 0) {
                        textFieldBuffer.Z(TextRange.ty(composition.getPackedValue()), TextRange.ty(composition.getPackedValue()) + str.length(), list);
                    }
                } else {
                    int iTy = TextRange.ty(textFieldBuffer.getSelectionInChars());
                    ImeEditCommand_androidKt.Uo(textFieldBuffer, iTy, TextRange.xMQ(textFieldBuffer.getSelectionInChars()), str);
                    if (str.length() > 0) {
                        textFieldBuffer.Z(iTy, str.length() + iTy, list);
                    }
                }
                int iTy2 = TextRange.ty(textFieldBuffer.getSelectionInChars());
                int i3 = i2;
                if (i3 > 0) {
                    length = (iTy2 + i3) - 1;
                } else {
                    length = (iTy2 + i3) - str.length();
                }
                textFieldBuffer.aYN(TextRangeKt.n(RangesKt.coerceIn(length, 0, textFieldBuffer.mUb())));
            }
        });
    }

    public static final void nr(ImeEditCommandScope imeEditCommandScope, final int i2, final int i3) {
        imeEditCommandScope.t(new Function1<TextFieldBuffer, Unit>() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt$deleteSurroundingTextInCodePoints$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TextFieldBuffer textFieldBuffer) {
                n(textFieldBuffer);
                return Unit.INSTANCE;
            }

            public final void n(TextFieldBuffer textFieldBuffer) {
                int i5 = i2;
                int i7 = 0;
                boolean z2 = i5 >= 0 && i3 >= 0;
                int i8 = i3;
                if (!z2) {
                    InlineClassHelperKt.n("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i5 + " and " + i8 + " respectively.");
                }
                int i9 = 0;
                int iTy = 0;
                while (true) {
                    if (i9 < i2) {
                        int i10 = iTy + 1;
                        if (TextRange.ty(textFieldBuffer.getSelectionInChars()) <= i10) {
                            iTy = TextRange.ty(textFieldBuffer.getSelectionInChars());
                            break;
                        } else {
                            iTy = ImeEditCommand_androidKt.KN(textFieldBuffer.n().charAt((TextRange.ty(textFieldBuffer.getSelectionInChars()) - i10) - 1), textFieldBuffer.n().charAt(TextRange.ty(textFieldBuffer.getSelectionInChars()) - i10)) ? iTy + 2 : i10;
                            i9++;
                        }
                    } else {
                        break;
                    }
                }
                int iMUb = 0;
                while (true) {
                    if (i7 >= i3) {
                        break;
                    }
                    int i11 = iMUb + 1;
                    if (TextRange.xMQ(textFieldBuffer.getSelectionInChars()) + i11 >= textFieldBuffer.mUb()) {
                        iMUb = textFieldBuffer.mUb() - TextRange.xMQ(textFieldBuffer.getSelectionInChars());
                        break;
                    } else {
                        iMUb = ImeEditCommand_androidKt.KN(textFieldBuffer.n().charAt((TextRange.xMQ(textFieldBuffer.getSelectionInChars()) + i11) - 1), textFieldBuffer.n().charAt(TextRange.xMQ(textFieldBuffer.getSelectionInChars()) + i11)) ? iMUb + 2 : i11;
                        i7++;
                    }
                }
                ImeEditCommand_androidKt.J2(textFieldBuffer, TextRange.xMQ(textFieldBuffer.getSelectionInChars()), TextRange.xMQ(textFieldBuffer.getSelectionInChars()) + iMUb);
                ImeEditCommand_androidKt.J2(textFieldBuffer, TextRange.ty(textFieldBuffer.getSelectionInChars()) - iTy, TextRange.ty(textFieldBuffer.getSelectionInChars()));
            }
        });
    }

    public static final void rl(ImeEditCommandScope imeEditCommandScope, final String str, final int i2) {
        imeEditCommandScope.t(new Function1<TextFieldBuffer, Unit>() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt$commitText$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TextFieldBuffer textFieldBuffer) {
                n(textFieldBuffer);
                return Unit.INSTANCE;
            }

            public final void n(TextFieldBuffer textFieldBuffer) {
                int length;
                TextRange composition = textFieldBuffer.getComposition();
                if (composition != null) {
                    ImeEditCommand_androidKt.Uo(textFieldBuffer, TextRange.ty(composition.getPackedValue()), TextRange.xMQ(composition.getPackedValue()), str);
                } else {
                    ImeEditCommand_androidKt.Uo(textFieldBuffer, TextRange.ty(textFieldBuffer.getSelectionInChars()), TextRange.xMQ(textFieldBuffer.getSelectionInChars()), str);
                }
                int iTy = TextRange.ty(textFieldBuffer.getSelectionInChars());
                int i3 = i2;
                if (i3 > 0) {
                    length = (iTy + i3) - 1;
                } else {
                    length = (iTy + i3) - str.length();
                }
                textFieldBuffer.aYN(TextRangeKt.n(RangesKt.coerceIn(length, 0, textFieldBuffer.mUb())));
            }
        });
    }

    public static final void t(ImeEditCommandScope imeEditCommandScope, final int i2, final int i3) {
        imeEditCommandScope.t(new Function1<TextFieldBuffer, Unit>() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt$deleteSurroundingText$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TextFieldBuffer textFieldBuffer) {
                n(textFieldBuffer);
                return Unit.INSTANCE;
            }

            public final void n(TextFieldBuffer textFieldBuffer) {
                int i5 = i2;
                boolean z2 = i5 >= 0 && i3 >= 0;
                int i7 = i3;
                if (!z2) {
                    InlineClassHelperKt.n("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i5 + " and " + i7 + " respectively.");
                }
                int iXMQ = TextRange.xMQ(textFieldBuffer.getSelectionInChars());
                int i8 = i3;
                int iMUb = iXMQ + i8;
                if (((iXMQ ^ iMUb) & (i8 ^ iMUb)) < 0) {
                    iMUb = textFieldBuffer.mUb();
                }
                ImeEditCommand_androidKt.J2(textFieldBuffer, TextRange.xMQ(textFieldBuffer.getSelectionInChars()), Math.min(iMUb, textFieldBuffer.mUb()));
                int iTy = TextRange.ty(textFieldBuffer.getSelectionInChars());
                int i9 = i2;
                int i10 = iTy - i9;
                if (((iTy ^ i10) & (i9 ^ iTy)) < 0) {
                    i10 = 0;
                }
                ImeEditCommand_androidKt.J2(textFieldBuffer, Math.max(0, i10), TextRange.ty(textFieldBuffer.getSelectionInChars()));
            }
        });
    }

    public static final void xMQ(ImeEditCommandScope imeEditCommandScope, final int i2, final int i3) {
        imeEditCommandScope.t(new Function1<TextFieldBuffer, Unit>() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt$setComposingRegion$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TextFieldBuffer textFieldBuffer) {
                n(textFieldBuffer);
                return Unit.INSTANCE;
            }

            public final void n(TextFieldBuffer textFieldBuffer) {
                if (textFieldBuffer.az()) {
                    textFieldBuffer.nr();
                }
                int iCoerceIn = RangesKt.coerceIn(i2, 0, textFieldBuffer.mUb());
                int iCoerceIn2 = RangesKt.coerceIn(i3, 0, textFieldBuffer.mUb());
                if (iCoerceIn != iCoerceIn2) {
                    if (iCoerceIn < iCoerceIn2) {
                        TextFieldBuffer.XQ(textFieldBuffer, iCoerceIn, iCoerceIn2, null, 4, null);
                    } else {
                        TextFieldBuffer.XQ(textFieldBuffer, iCoerceIn2, iCoerceIn, null, 4, null);
                    }
                }
            }
        });
    }

    public static final void J2(TextFieldBuffer textFieldBuffer, int i2, int i3) {
        TextRange composition = textFieldBuffer.getComposition();
        int iMin = Math.min(i2, i3);
        int iMax = Math.max(i2, i3);
        TextFieldBufferKt.rl(textFieldBuffer, iMin, iMax);
        if (composition != null) {
            composition.getPackedValue();
            long jN = TextFieldBufferKt.n(composition.getPackedValue(), iMin, iMax, 0);
            if (TextRange.KN(jN)) {
                textFieldBuffer.nr();
            } else {
                TextFieldBuffer.XQ(textFieldBuffer, TextRange.qie(jN), TextRange.gh(jN), null, 4, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean KN(char c2, char c4) {
        if (Character.isHighSurrogate(c2) && Character.isLowSurrogate(c4)) {
            return true;
        }
        return false;
    }

    public static final void Uo(TextFieldBuffer textFieldBuffer, int i2, int i3, CharSequence charSequence) {
        int iMin = Math.min(i2, i3);
        int iMax = Math.max(i2, i3);
        int i5 = 0;
        int i7 = iMin;
        while (i7 < iMax && i5 < charSequence.length() && charSequence.charAt(i5) == textFieldBuffer.n().charAt(i7)) {
            i5++;
            i7++;
        }
        int length = charSequence.length();
        while (iMax > i7 && length > i5 && charSequence.charAt(length - 1) == textFieldBuffer.n().charAt(iMax - 1)) {
            length--;
            iMax--;
        }
        if (i7 == iMax && i5 == length) {
            textFieldBuffer.nr();
            textFieldBuffer.t();
        } else {
            textFieldBuffer.ck(i7, iMax, charSequence.subSequence(i5, length));
        }
        textFieldBuffer.aYN(TextRangeKt.n(iMin + charSequence.length()));
    }
}
