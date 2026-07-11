package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class x {
    public static Uri a(String str, String str2) {
        String strA;
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrA = a(str2);
        if (iArrA[0] != -1) {
            sb.append(str2);
            a(sb, iArrA[1], iArrA[2]);
            strA = sb.toString();
        } else {
            int[] iArrA2 = a(str);
            if (iArrA[3] == 0) {
                sb.append((CharSequence) str, 0, iArrA2[3]);
                sb.append(str2);
                strA = sb.toString();
            } else if (iArrA[2] == 0) {
                sb.append((CharSequence) str, 0, iArrA2[2]);
                sb.append(str2);
                strA = sb.toString();
            } else {
                int i2 = iArrA[1];
                if (i2 != 0) {
                    int i3 = iArrA2[0] + 1;
                    sb.append((CharSequence) str, 0, i3);
                    sb.append(str2);
                    strA = a(sb, iArrA[1] + i3, i3 + iArrA[2]);
                } else if (str2.charAt(i2) == '/') {
                    sb.append((CharSequence) str, 0, iArrA2[1]);
                    sb.append(str2);
                    int i5 = iArrA2[1];
                    strA = a(sb, i5, iArrA[2] + i5);
                } else {
                    int i7 = iArrA2[0] + 2;
                    int i8 = iArrA2[1];
                    if (i7 >= i8 || i8 != iArrA2[2]) {
                        int iLastIndexOf = str.lastIndexOf(47, iArrA2[2] - 1);
                        int i9 = iLastIndexOf == -1 ? iArrA2[1] : iLastIndexOf + 1;
                        sb.append((CharSequence) str, 0, i9);
                        sb.append(str2);
                        strA = a(sb, iArrA2[1], i9 + iArrA[2]);
                    } else {
                        sb.append((CharSequence) str, 0, i8);
                        sb.append('/');
                        sb.append(str2);
                        int i10 = iArrA2[1];
                        strA = a(sb, i10, iArrA[2] + i10 + 1);
                    }
                }
            }
        }
        return Uri.parse(strA);
    }

    public static String a(StringBuilder sb, int i2, int i3) {
        int i5;
        int iLastIndexOf;
        if (i2 >= i3) {
            return sb.toString();
        }
        if (sb.charAt(i2) == '/') {
            i2++;
        }
        int i7 = i2;
        int i8 = i7;
        while (i7 <= i3) {
            if (i7 == i3) {
                i5 = i7;
            } else if (sb.charAt(i7) == '/') {
                i5 = i7 + 1;
            } else {
                i7++;
            }
            int i9 = i8 + 1;
            if (i7 == i9 && sb.charAt(i8) == '.') {
                sb.delete(i8, i5);
                i3 -= i5 - i8;
            } else {
                if (i7 == i8 + 2 && sb.charAt(i8) == '.' && sb.charAt(i9) == '.') {
                    iLastIndexOf = sb.lastIndexOf("/", i8 - 2) + 1;
                    int i10 = iLastIndexOf > i2 ? iLastIndexOf : i2;
                    sb.delete(i10, i5);
                    i3 -= i5 - i10;
                } else {
                    iLastIndexOf = i7 + 1;
                }
                i8 = iLastIndexOf;
            }
            i7 = i8;
        }
        return sb.toString();
    }

    public static int[] a(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i2 = iIndexOf5 + 2;
        if (i2 < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i2) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }
}
