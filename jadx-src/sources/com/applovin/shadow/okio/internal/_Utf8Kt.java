package com.applovin.shadow.okio.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u001e\u0010\u0003\u001a\u00020\u0002*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"commonAsUtf8ToByteArray", "", "", "commonToUtf8String", "beginIndex", "", "endIndex", "com.applovin.shadow.okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\n-Utf8.kt\nKotlin\n*S Kotlin\n*F\n+ 1 -Utf8.kt\nokio/internal/_Utf8Kt\n+ 2 Utf8.kt\nokio/Utf8\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,60:1\n260#2,16:61\n277#2:78\n397#2,9:79\n127#2:88\n406#2,20:90\n279#2,3:110\n440#2,4:113\n127#2:117\n446#2,10:118\n127#2:128\n456#2,5:129\n127#2:134\n461#2,24:135\n283#2,3:159\n500#2,3:162\n286#2,12:165\n503#2:177\n127#2:178\n506#2,2:179\n127#2:181\n510#2,10:182\n127#2:192\n520#2,5:193\n127#2:198\n525#2,5:199\n127#2:204\n530#2,28:205\n302#2,6:233\n138#2,67:239\n68#3:77\n74#3:89\n*S KotlinDebug\n*F\n+ 1 -Utf8.kt\nokio/internal/_Utf8Kt\n*L\n34#1:61,16\n34#1:78\n34#1:79,9\n34#1:88\n34#1:90,20\n34#1:110,3\n34#1:113,4\n34#1:117\n34#1:118,10\n34#1:128\n34#1:129,5\n34#1:134\n34#1:135,24\n34#1:159,3\n34#1:162,3\n34#1:165,12\n34#1:177\n34#1:178\n34#1:179,2\n34#1:181\n34#1:182,10\n34#1:192\n34#1:193,5\n34#1:198\n34#1:199,5\n34#1:204\n34#1:205,28\n34#1:233,6\n50#1:239,67\n34#1:77\n34#1:89\n*E\n"})
public final class _Utf8Kt {
    public static final byte[] commonAsUtf8ToByteArray(String str) {
        int i2;
        char cCharAt;
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bArr = new byte[str.length() * 4];
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            char cCharAt2 = str.charAt(i3);
            if (Intrinsics.compare((int) cCharAt2, 128) >= 0) {
                int length2 = str.length();
                int i5 = i3;
                while (i3 < length2) {
                    char cCharAt3 = str.charAt(i3);
                    if (Intrinsics.compare((int) cCharAt3, 128) < 0) {
                        int i7 = i5 + 1;
                        bArr[i5] = (byte) cCharAt3;
                        i3++;
                        while (true) {
                            i5 = i7;
                            if (i3 >= length2 || Intrinsics.compare((int) str.charAt(i3), 128) >= 0) {
                                break;
                            }
                            i7 = i5 + 1;
                            bArr[i5] = (byte) str.charAt(i3);
                            i3++;
                        }
                    } else {
                        if (Intrinsics.compare((int) cCharAt3, 2048) < 0) {
                            bArr[i5] = (byte) ((cCharAt3 >> 6) | 192);
                            i5 += 2;
                            bArr[i5 + 1] = (byte) ((cCharAt3 & '?') | 128);
                        } else if (55296 > cCharAt3 || cCharAt3 >= 57344) {
                            bArr[i5] = (byte) ((cCharAt3 >> '\f') | 224);
                            bArr[i5 + 1] = (byte) (((cCharAt3 >> 6) & 63) | 128);
                            i5 += 3;
                            bArr[i5 + 2] = (byte) ((cCharAt3 & '?') | 128);
                        } else if (Intrinsics.compare((int) cCharAt3, 56319) > 0 || length2 <= (i2 = i3 + 1) || 56320 > (cCharAt = str.charAt(i2)) || cCharAt >= 57344) {
                            bArr[i5] = 63;
                            i3++;
                            i5++;
                        } else {
                            int iCharAt = ((cCharAt3 << '\n') + str.charAt(i2)) - 56613888;
                            bArr[i5] = (byte) ((iCharAt >> 18) | 240);
                            bArr[i5 + 1] = (byte) (((iCharAt >> 12) & 63) | 128);
                            bArr[i5 + 2] = (byte) (((iCharAt >> 6) & 63) | 128);
                            i5 += 4;
                            bArr[i5 + 3] = (byte) ((iCharAt & 63) | 128);
                            i3 += 2;
                        }
                        i3++;
                    }
                }
                byte[] bArrCopyOf = Arrays.copyOf(bArr, i5);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, newSize)");
                return bArrCopyOf;
            }
            bArr[i3] = (byte) cCharAt2;
            i3++;
        }
        byte[] bArrCopyOf2 = Arrays.copyOf(bArr, str.length());
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf2, "copyOf(this, newSize)");
        return bArrCopyOf2;
    }

    public static final String commonToUtf8String(byte[] bArr, int i2, int i3) {
        byte b2;
        int i5;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = i2;
        int i13 = 2;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (i12 < 0 || i3 > bArr.length || i12 > i3) {
            throw new ArrayIndexOutOfBoundsException("size=" + bArr.length + " beginIndex=" + i12 + " endIndex=" + i3);
        }
        char[] cArr = new char[i3 - i12];
        int i14 = 0;
        while (i12 < i3) {
            byte b4 = bArr[i12];
            if (b4 >= 0) {
                int i15 = i14 + 1;
                cArr[i14] = (char) b4;
                i12++;
                while (true) {
                    i14 = i15;
                    if (i12 >= i3 || (b2 = bArr[i12]) < 0) {
                        break;
                    }
                    i12++;
                    i15 = i14 + 1;
                    cArr[i14] = (char) b2;
                }
            } else if ((b4 >> 5) == -2) {
                int i16 = i12 + 1;
                if (i3 <= i16) {
                    i5 = i14 + 1;
                    cArr[i14] = (char) 65533;
                } else {
                    byte b5 = bArr[i16];
                    if ((b5 & 192) == 128) {
                        int i17 = (b4 << 6) ^ (b5 ^ ByteCompanionObject.MIN_VALUE);
                        if (i17 < 128) {
                            i5 = i14 + 1;
                            cArr[i14] = (char) 65533;
                        } else {
                            i5 = i14 + 1;
                            cArr[i14] = (char) i17;
                        }
                        Unit unit = Unit.INSTANCE;
                        i7 = i13;
                        i14 = i5;
                        i12 += i7;
                    } else {
                        i5 = i14 + 1;
                        cArr[i14] = (char) 65533;
                    }
                }
                Unit unit2 = Unit.INSTANCE;
                i7 = 1;
                i14 = i5;
                i12 += i7;
            } else if ((b4 >> 4) == -2) {
                int i18 = i12 + 2;
                if (i3 <= i18) {
                    int i19 = i14 + 1;
                    cArr[i14] = (char) 65533;
                    Unit unit3 = Unit.INSTANCE;
                    int i20 = i12 + 1;
                    i10 = (i3 <= i20 || (bArr[i20] & 192) != 128) ? 1 : i13;
                    i14 = i19;
                } else {
                    byte b6 = bArr[i12 + 1];
                    if ((b6 & 192) == 128) {
                        byte b7 = bArr[i18];
                        if ((b7 & 192) == 128) {
                            int i21 = ((b7 ^ ByteCompanionObject.MIN_VALUE) ^ (b6 << 6)) ^ (b4 << 12);
                            if (i21 < 2048) {
                                i11 = i14 + 1;
                                cArr[i14] = (char) 65533;
                            } else if (55296 > i21 || i21 >= 57344) {
                                char c2 = (char) i21;
                                i11 = i14 + 1;
                                cArr[i14] = c2;
                            } else {
                                i11 = i14 + 1;
                                cArr[i14] = (char) 65533;
                            }
                            Unit unit4 = Unit.INSTANCE;
                            i14 = i11;
                            i10 = 3;
                        } else {
                            cArr[i14] = (char) 65533;
                            Unit unit5 = Unit.INSTANCE;
                            i14++;
                            i10 = i13;
                        }
                    } else {
                        cArr[i14] = (char) 65533;
                        Unit unit6 = Unit.INSTANCE;
                        i14++;
                        i10 = 1;
                    }
                }
                i12 += i10;
            } else if ((b4 >> 3) == -2) {
                int i22 = i12 + 3;
                if (i3 <= i22) {
                    int i23 = i14 + 1;
                    cArr[i14] = 65533;
                    Unit unit7 = Unit.INSTANCE;
                    int i24 = i12 + 1;
                    if (i3 <= i24 || (bArr[i24] & 192) != 128) {
                        i14 = i23;
                        i8 = i13;
                        i13 = 1;
                        i12 += i13;
                        i13 = i8;
                    } else {
                        int i25 = i12 + 2;
                        if (i3 <= i25 || (bArr[i25] & 192) != 128) {
                            i14 = i23;
                            i8 = i13;
                            i12 += i13;
                            i13 = i8;
                        } else {
                            i14 = i23;
                            i8 = i13;
                            i13 = 3;
                            i12 += i13;
                            i13 = i8;
                        }
                    }
                } else {
                    byte b8 = bArr[i12 + 1];
                    if ((b8 & 192) == 128) {
                        byte b9 = bArr[i12 + 2];
                        i8 = i13;
                        if ((b9 & 192) == 128) {
                            byte b10 = bArr[i22];
                            if ((b10 & 192) == 128) {
                                int i26 = (((b10 ^ ByteCompanionObject.MIN_VALUE) ^ (b9 << 6)) ^ (b8 << 12)) ^ (b4 << 18);
                                if (i26 > 1114111) {
                                    i9 = i14 + 1;
                                    cArr[i14] = 65533;
                                } else if ((55296 > i26 || i26 >= 57344) && i26 >= 65536 && i26 != 65533) {
                                    cArr[i14] = (char) ((i26 >>> 10) + 55232);
                                    cArr[i14 + 1] = (char) ((i26 & 1023) + 56320);
                                    i9 = i14 + 2;
                                } else {
                                    i9 = i14 + 1;
                                    cArr[i14] = 65533;
                                }
                                Unit unit8 = Unit.INSTANCE;
                                i14 = i9;
                                i13 = 4;
                            } else {
                                cArr[i14] = 65533;
                                Unit unit9 = Unit.INSTANCE;
                                i14++;
                                i13 = 3;
                            }
                        } else {
                            cArr[i14] = 65533;
                            Unit unit10 = Unit.INSTANCE;
                            i14++;
                            i13 = i8;
                        }
                        i12 += i13;
                        i13 = i8;
                    } else {
                        i8 = i13;
                        cArr[i14] = 65533;
                        Unit unit11 = Unit.INSTANCE;
                        i14++;
                        i13 = 1;
                        i12 += i13;
                        i13 = i8;
                    }
                }
            } else {
                cArr[i14] = 65533;
                i12++;
                i14++;
            }
        }
        return StringsKt.concatToString(cArr, 0, i14);
    }

    public static /* synthetic */ String commonToUtf8String$default(byte[] bArr, int i2, int i3, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = 0;
        }
        if ((i5 & 2) != 0) {
            i3 = bArr.length;
        }
        return commonToUtf8String(bArr, i2, i3);
    }
}
