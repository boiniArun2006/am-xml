package androidx.compose.ui.node;

import androidx.media3.exoplayer.upstream.CmcdData;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\r\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001aR\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aZ\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001aZ\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001d\u001a?\u0010%\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u0016H\u0000¢\u0006\u0004\b%\u0010&\u001a#\u0010)\u001a\u00020\n*\u00020\u00162\u0006\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0000H\u0002¢\u0006\u0004\b)\u0010*\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"", "oldSize", "newSize", "Landroidx/compose/ui/node/DiffCallback;", "cb", "Landroidx/compose/ui/node/IntStack;", "nr", "(IILandroidx/compose/ui/node/DiffCallback;)Landroidx/compose/ui/node/IntStack;", "diagonals", "callback", "", "rl", "(Landroidx/compose/ui/node/IntStack;Landroidx/compose/ui/node/DiffCallback;)V", "O", "(IILandroidx/compose/ui/node/DiffCallback;)V", "oldStart", "oldEnd", "newStart", "newEnd", "Landroidx/compose/ui/node/CenteredArray;", "forward", "backward", "", "snake", "", "KN", "(IIIILandroidx/compose/ui/node/DiffCallback;[I[I[I)Z", "d", "Uo", "(IIIILandroidx/compose/ui/node/DiffCallback;[I[II[I)Z", "t", "startX", "startY", "endX", "endY", "reverse", "data", "J2", "(IIIIZ[I)V", CmcdData.OBJECT_TYPE_INIT_SEGMENT, "j", "xMQ", "([III)V", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMyersDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyersDiff.kt\nandroidx/compose/ui/node/MyersDiffKt\n+ 2 MyersDiff.kt\nandroidx/compose/ui/node/Snake\n*L\n1#1,518:1\n375#1:528\n375#1:529\n329#2:519\n318#2:520\n310#2:521\n322#2:522\n314#2:523\n310#2:524\n314#2:525\n318#2:526\n322#2:527\n*S KotlinDebug\n*F\n+ 1 MyersDiff.kt\nandroidx/compose/ui/node/MyersDiffKt\n*L\n203#1:528\n270#1:529\n75#1:519\n75#1:520\n75#1:521\n75#1:522\n75#1:523\n82#1:524\n84#1:525\n89#1:526\n91#1:527\n*E\n"})
public final class MyersDiffKt {
    public static final void J2(int i2, int i3, int i5, int i7, boolean z2, int[] iArr) {
        if (iArr.length < 5) {
            return;
        }
        iArr[0] = i2;
        iArr[1] = i3;
        iArr[2] = i5;
        iArr[3] = i7;
        iArr[4] = z2 ? 1 : 0;
    }

    private static final void rl(IntStack intStack, DiffCallback diffCallback) {
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        while (i2 < intStack.getLastIndex()) {
            int i7 = i2 + 2;
            int iRl = intStack.rl(i2) - intStack.rl(i7);
            int iRl2 = intStack.rl(i2 + 1) - intStack.rl(i7);
            int iRl3 = intStack.rl(i7);
            i2 += 3;
            while (i3 < iRl) {
                diffCallback.n(i5, i3);
                i3++;
            }
            while (i5 < iRl2) {
                diffCallback.t(i5);
                i5++;
            }
            while (true) {
                int i8 = iRl3 - 1;
                if (iRl3 > 0) {
                    diffCallback.nr(i3, i5);
                    i3++;
                    i5++;
                    iRl3 = i8;
                }
            }
        }
    }

    private static final boolean KN(int i2, int i3, int i5, int i7, DiffCallback diffCallback, int[] iArr, int[] iArr2, int[] iArr3) {
        int i8 = i3 - i2;
        int i9 = i7 - i5;
        if (i8 >= 1 && i9 >= 1) {
            int i10 = ((i8 + i9) + 1) / 2;
            int[] iArr4 = iArr;
            CenteredArray.J2(iArr4, 1, i2);
            int[] iArr5 = iArr2;
            CenteredArray.J2(iArr5, 1, i3);
            int i11 = 0;
            while (i11 < i10) {
                if (Uo(i2, i3, i5, i7, diffCallback, iArr4, iArr5, i11, iArr3) || t(i2, i3, i5, i7, diffCallback, iArr, iArr2, i11, iArr3)) {
                    return true;
                }
                i11++;
                iArr4 = iArr;
                iArr5 = iArr2;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean Uo(int i2, int i3, int i5, int i7, DiffCallback diffCallback, int[] iArr, int[] iArr2, int i8, int[] iArr3) {
        int iT;
        int i9;
        boolean z2;
        int i10 = (i3 - i2) - (i7 - i5);
        boolean z3 = true;
        boolean z4 = (Math.abs(i10) & 1) == 1;
        int i11 = -i8;
        int i12 = i11;
        while (i12 <= i8) {
            if (i12 == i11 || (i12 != i8 && CenteredArray.t(iArr, i12 + 1) > CenteredArray.t(iArr, i12 - 1))) {
                iT = CenteredArray.t(iArr, i12 + 1);
                i9 = iT;
            } else {
                iT = CenteredArray.t(iArr, i12 - 1);
                i9 = iT + 1;
            }
            int i13 = (i5 + (i9 - i2)) - i12;
            int i14 = i13 - ((i8 != 0 ? z3 : 0) & (i9 == iT ? z3 : 0));
            while (i9 < i3 && i13 < i7) {
                if (!diffCallback.rl(i9, i13)) {
                    break;
                }
                i9++;
                i13++;
            }
            CenteredArray.J2(iArr, i12, i9);
            if (z4) {
                int i15 = i10 - i12;
                z2 = z3;
                if (i15 >= i11 + 1 && i15 <= i8 - 1) {
                    if (CenteredArray.t(iArr2, i15) <= i9) {
                        J2(iT, i14, i9, i13, false, iArr3);
                        return z2;
                    }
                }
                i12 += 2;
                z3 = z2;
            } else {
                z2 = z3;
            }
            i12 += 2;
            z3 = z2;
        }
        return false;
    }

    private static final IntStack nr(int i2, int i3, DiffCallback diffCallback) {
        char c2 = 1;
        int i5 = ((i2 + i3) + 1) / 2;
        IntStack intStack = new IntStack(i5 * 3);
        IntStack intStack2 = new IntStack(i5 * 4);
        intStack2.KN(0, i2, 0, i3);
        int i7 = (i5 * 2) + 1;
        int[] iArrN = CenteredArray.n(new int[i7]);
        int[] iArrN2 = CenteredArray.n(new int[i7]);
        int[] iArrRl = Snake.rl(new int[5]);
        while (intStack2.nr()) {
            int iJ2 = intStack2.J2();
            int iJ22 = intStack2.J2();
            int iJ23 = intStack2.J2();
            int iJ24 = intStack2.J2();
            int[] iArr = iArrRl;
            if (KN(iJ24, iJ23, iJ22, iJ2, diffCallback, iArrN, iArrN2, iArrRl)) {
                char c4 = c2;
                if (Math.min(iArr[2] - iArr[0], iArr[3] - iArr[c2]) > 0) {
                    Snake.n(iArr, intStack);
                }
                intStack2.KN(iJ24, iArr[0], iJ22, iArr[c4]);
                intStack2.KN(iArr[2], iJ23, iArr[3], iJ2);
                iArrRl = iArr;
                c2 = c4;
            } else {
                iArrRl = iArr;
            }
        }
        intStack.gh();
        intStack.Uo(i2, i3, 0);
        return intStack;
    }

    private static final boolean t(int i2, int i3, int i5, int i7, DiffCallback diffCallback, int[] iArr, int[] iArr2, int i8, int[] iArr3) {
        int iT;
        int i9;
        int i10;
        int i11 = (i3 - i2) - (i7 - i5);
        boolean z2 = (i11 & 1) == 0;
        int i12 = -i8;
        for (int i13 = i12; i13 <= i8; i13 += 2) {
            if (i13 == i12 || (i13 != i8 && CenteredArray.t(iArr2, i13 + 1) < CenteredArray.t(iArr2, i13 - 1))) {
                iT = CenteredArray.t(iArr2, i13 + 1);
                i9 = iT;
            } else {
                iT = CenteredArray.t(iArr2, i13 - 1);
                i9 = iT - 1;
            }
            int i14 = i7 - ((i3 - i9) - i13);
            int i15 = ((i8 != 0 ? 1 : 0) & (i9 == iT ? 1 : 0)) + i14;
            while (i9 > i2 && i14 > i5) {
                if (!diffCallback.rl(i9 - 1, i14 - 1)) {
                    break;
                }
                i9--;
                i14--;
            }
            CenteredArray.J2(iArr2, i13, i9);
            if (z2 && (i10 = i11 - i13) >= i12 && i10 <= i8) {
                if (CenteredArray.t(iArr, i10) >= i9) {
                    J2(i9, i14, iT, i15, true, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void xMQ(int[] iArr, int i2, int i3) {
        int i5 = iArr[i2];
        iArr[i2] = iArr[i3];
        iArr[i3] = i5;
    }

    public static final void O(int i2, int i3, DiffCallback diffCallback) {
        rl(nr(i2, i3, diffCallback), diffCallback);
    }
}
