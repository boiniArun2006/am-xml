package okio;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0001H\u0080\b\u001a\u0011\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0007H\u0080\b\u001a4\u0010\u0010\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u0017\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u0018\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u0019\u001a\u00020\u0016*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u001a\u001a\u00020\u0016*\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u001c\u001a\u00020\u0016*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a%\u0010\u001d\u001a\u00020\u001e*\u00020\u001b2\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0001H\u0007¢\u0006\u0002\b\u001f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006 "}, d2 = {"HIGH_SURROGATE_HEADER", "", "LOG_SURROGATE_HEADER", "MASK_2BYTES", "MASK_3BYTES", "MASK_4BYTES", "REPLACEMENT_BYTE", "", "REPLACEMENT_CHARACTER", "", "REPLACEMENT_CODE_POINT", "isIsoControl", "", "codePoint", "isUtf8Continuation", "byte", "process2Utf8Bytes", "", "beginIndex", "endIndex", "yield", "Lkotlin/Function1;", "", "process3Utf8Bytes", "process4Utf8Bytes", "processUtf16Chars", "processUtf8Bytes", "", "processUtf8CodePoints", "utf8Size", "", "size", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
@JvmName(name = "Utf8")
@SourceDebugExtension({"SMAP\nUtf8.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utf8.kt\nokio/Utf8\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,559:1\n397#1,9:563\n127#1:572\n406#1,20:574\n440#1,4:595\n127#1:599\n446#1,10:601\n127#1:611\n456#1,5:612\n127#1:617\n461#1,24:618\n500#1,4:643\n127#1:647\n506#1,2:649\n127#1:651\n510#1,10:652\n127#1:662\n520#1,5:663\n127#1:668\n525#1,5:669\n127#1:674\n530#1,28:675\n397#1,9:704\n127#1:713\n406#1,20:715\n440#1,4:736\n127#1:740\n446#1,10:742\n127#1:752\n456#1,5:753\n127#1:758\n461#1,24:759\n500#1,4:784\n127#1:788\n506#1,2:790\n127#1:792\n510#1,10:793\n127#1:803\n520#1,5:804\n127#1:809\n525#1,5:810\n127#1:815\n530#1,28:816\n127#1:844\n127#1:846\n127#1:848\n127#1:850\n127#1:852\n127#1:854\n127#1:856\n127#1:858\n127#1:860\n1#2:560\n74#3:561\n68#3:562\n74#3:573\n68#3:594\n74#3:600\n68#3:642\n74#3:648\n68#3:703\n74#3:714\n68#3:735\n74#3:741\n68#3:783\n74#3:789\n74#3:845\n74#3:847\n74#3:849\n74#3:851\n74#3:853\n74#3:855\n74#3:857\n74#3:859\n74#3:861\n*S KotlinDebug\n*F\n+ 1 Utf8.kt\nokio/Utf8\n*L\n228#1:563,9\n228#1:572\n228#1:574,20\n232#1:595,4\n232#1:599\n232#1:601,10\n232#1:611\n232#1:612,5\n232#1:617\n232#1:618,24\n236#1:643,4\n236#1:647\n236#1:649,2\n236#1:651\n236#1:652,10\n236#1:662\n236#1:663,5\n236#1:668\n236#1:669,5\n236#1:674\n236#1:675,28\n277#1:704,9\n277#1:713\n277#1:715,20\n281#1:736,4\n281#1:740\n281#1:742,10\n281#1:752\n281#1:753,5\n281#1:758\n281#1:759,24\n285#1:784,4\n285#1:788\n285#1:790,2\n285#1:792\n285#1:793,10\n285#1:803\n285#1:804,5\n285#1:809\n285#1:810,5\n285#1:815\n285#1:816,28\n405#1:844\n443#1:846\n455#1:848\n460#1:850\n503#1:852\n507#1:854\n519#1:856\n524#1:858\n529#1:860\n127#1:561\n226#1:562\n228#1:573\n230#1:594\n232#1:600\n234#1:642\n236#1:648\n275#1:703\n277#1:714\n279#1:735\n281#1:741\n283#1:783\n285#1:789\n405#1:845\n443#1:847\n455#1:849\n460#1:851\n503#1:853\n507#1:855\n519#1:857\n524#1:859\n529#1:861\n*E\n"})
public final class Utf8 {
    public static final int HIGH_SURROGATE_HEADER = 55232;
    public static final int LOG_SURROGATE_HEADER = 56320;
    public static final int MASK_2BYTES = 3968;
    public static final int MASK_3BYTES = -123008;
    public static final int MASK_4BYTES = 3678080;
    public static final byte REPLACEMENT_BYTE = 63;
    public static final char REPLACEMENT_CHARACTER = 65533;
    public static final int REPLACEMENT_CODE_POINT = 65533;

    public static final boolean isIsoControl(int i2) {
        if (i2 < 0 || i2 >= 32) {
            return 127 <= i2 && i2 < 160;
        }
        return true;
    }

    public static final boolean isUtf8Continuation(byte b2) {
        return (b2 & 192) == 128;
    }

    @JvmOverloads
    @JvmName(name = "size")
    public static final long size(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return size$default(str, 0, 0, 3, null);
    }

    public static final int process2Utf8Bytes(byte[] bArr, int i2, int i3, Function1<? super Integer, Unit> yield) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(yield, "yield");
        int i5 = i2 + 1;
        if (i3 <= i5) {
            yield.invoke(65533);
            return 1;
        }
        byte b2 = bArr[i2];
        byte b4 = bArr[i5];
        if ((b4 & 192) != 128) {
            yield.invoke(65533);
            return 1;
        }
        int i7 = (b4 ^ ByteCompanionObject.MIN_VALUE) ^ (b2 << 6);
        if (i7 < 128) {
            yield.invoke(65533);
            return 2;
        }
        yield.invoke(Integer.valueOf(i7));
        return 2;
    }

    public static final int process3Utf8Bytes(byte[] bArr, int i2, int i3, Function1<? super Integer, Unit> yield) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(yield, "yield");
        int i5 = i2 + 2;
        if (i3 <= i5) {
            yield.invoke(65533);
            int i7 = i2 + 1;
            return (i3 <= i7 || (bArr[i7] & 192) != 128) ? 1 : 2;
        }
        byte b2 = bArr[i2];
        byte b4 = bArr[i2 + 1];
        if ((b4 & 192) != 128) {
            yield.invoke(65533);
            return 1;
        }
        byte b5 = bArr[i5];
        if ((b5 & 192) != 128) {
            yield.invoke(65533);
            return 2;
        }
        int i8 = ((b5 ^ ByteCompanionObject.MIN_VALUE) ^ (b4 << 6)) ^ (b2 << 12);
        if (i8 < 2048) {
            yield.invoke(65533);
            return 3;
        }
        if (55296 > i8 || i8 >= 57344) {
            yield.invoke(Integer.valueOf(i8));
            return 3;
        }
        yield.invoke(65533);
        return 3;
    }

    public static final int process4Utf8Bytes(byte[] bArr, int i2, int i3, Function1<? super Integer, Unit> yield) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(yield, "yield");
        int i5 = i2 + 3;
        if (i3 <= i5) {
            yield.invoke(65533);
            int i7 = i2 + 1;
            if (i3 <= i7 || (bArr[i7] & 192) != 128) {
                return 1;
            }
            int i8 = i2 + 2;
            return (i3 <= i8 || (bArr[i8] & 192) != 128) ? 2 : 3;
        }
        byte b2 = bArr[i2];
        byte b4 = bArr[i2 + 1];
        if ((b4 & 192) != 128) {
            yield.invoke(65533);
            return 1;
        }
        byte b5 = bArr[i2 + 2];
        if ((b5 & 192) != 128) {
            yield.invoke(65533);
            return 2;
        }
        byte b6 = bArr[i5];
        if ((b6 & 192) != 128) {
            yield.invoke(65533);
            return 3;
        }
        int i9 = (((b6 ^ ByteCompanionObject.MIN_VALUE) ^ (b5 << 6)) ^ (b4 << 12)) ^ (b2 << 18);
        if (i9 > 1114111) {
            yield.invoke(65533);
            return 4;
        }
        if (55296 <= i9 && i9 < 57344) {
            yield.invoke(65533);
            return 4;
        }
        if (i9 < 65536) {
            yield.invoke(65533);
            return 4;
        }
        yield.invoke(Integer.valueOf(i9));
        return 4;
    }

    public static final void processUtf16Chars(byte[] bArr, int i2, int i3, Function1<? super Character, Unit> yield) {
        int i5;
        int i7;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(yield, "yield");
        int i8 = i2;
        while (i8 < i3) {
            byte b2 = bArr[i8];
            if (b2 >= 0) {
                yield.invoke(Character.valueOf((char) b2));
                i8++;
                while (i8 < i3) {
                    byte b4 = bArr[i8];
                    if (b4 >= 0) {
                        i8++;
                        yield.invoke(Character.valueOf((char) b4));
                    }
                }
            } else {
                if ((b2 >> 5) == -2) {
                    int i9 = i8 + 1;
                    if (i3 > i9) {
                        byte b5 = bArr[i9];
                        if ((b5 & 192) == 128) {
                            int i10 = (b2 << 6) ^ (b5 ^ ByteCompanionObject.MIN_VALUE);
                            yield.invoke(Character.valueOf(i10 < 128 ? (char) 65533 : (char) i10));
                            Unit unit = Unit.INSTANCE;
                        }
                    }
                    yield.invoke(Character.valueOf((char) 65533));
                    Unit unit2 = Unit.INSTANCE;
                } else if ((b2 >> 4) == -2) {
                    int i11 = i8 + 2;
                    if (i3 <= i11) {
                        yield.invoke(Character.valueOf((char) 65533));
                        Unit unit3 = Unit.INSTANCE;
                        int i12 = i8 + 1;
                        i5 = (i3 <= i12 || (bArr[i12] & 192) != 128) ? 1 : 2;
                    } else {
                        byte b6 = bArr[i8 + 1];
                        if ((b6 & 192) == 128) {
                            byte b7 = bArr[i11];
                            if ((b7 & 192) == 128) {
                                int i13 = (b2 << 12) ^ ((b7 ^ ByteCompanionObject.MIN_VALUE) ^ (b6 << 6));
                                yield.invoke(Character.valueOf((i13 >= 2048 && (55296 > i13 || i13 >= 57344)) ? (char) i13 : (char) 65533));
                                Unit unit4 = Unit.INSTANCE;
                                i5 = 3;
                            } else {
                                yield.invoke(Character.valueOf((char) 65533));
                                Unit unit5 = Unit.INSTANCE;
                            }
                        } else {
                            yield.invoke(Character.valueOf((char) 65533));
                            Unit unit6 = Unit.INSTANCE;
                        }
                    }
                } else if ((b2 >> 3) == -2) {
                    int i14 = i8 + 3;
                    if (i3 <= i14) {
                        yield.invoke((char) 65533);
                        Unit unit7 = Unit.INSTANCE;
                        int i15 = i8 + 1;
                        if (i3 > i15 && (bArr[i15] & 192) == 128) {
                            int i16 = i8 + 2;
                            i7 = (i3 <= i16 || (bArr[i16] & 192) != 128) ? 2 : 3;
                        }
                        i7 = 1;
                    } else {
                        byte b8 = bArr[i8 + 1];
                        if ((b8 & 192) == 128) {
                            byte b9 = bArr[i8 + 2];
                            if ((b9 & 192) == 128) {
                                byte b10 = bArr[i14];
                                if ((b10 & 192) == 128) {
                                    int i17 = (((b10 ^ ByteCompanionObject.MIN_VALUE) ^ (b9 << 6)) ^ (b8 << 12)) ^ (b2 << 18);
                                    if (i17 <= 1114111 && ((55296 > i17 || i17 >= 57344) && i17 >= 65536 && i17 != 65533)) {
                                        yield.invoke(Character.valueOf((char) ((i17 >>> 10) + 55232)));
                                        yield.invoke(Character.valueOf((char) ((i17 & 1023) + 56320)));
                                    } else {
                                        yield.invoke((char) 65533);
                                    }
                                    Unit unit8 = Unit.INSTANCE;
                                    i7 = 4;
                                } else {
                                    yield.invoke((char) 65533);
                                    Unit unit9 = Unit.INSTANCE;
                                }
                            } else {
                                yield.invoke((char) 65533);
                                Unit unit10 = Unit.INSTANCE;
                            }
                        } else {
                            yield.invoke((char) 65533);
                            Unit unit11 = Unit.INSTANCE;
                            i7 = 1;
                        }
                    }
                    i8 += i7;
                } else {
                    yield.invoke((char) 65533);
                    i8++;
                }
                i8 += i5;
            }
        }
    }

    public static final void processUtf8Bytes(String str, int i2, int i3, Function1<? super Byte, Unit> yield) {
        int i5;
        char cCharAt;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(yield, "yield");
        while (i2 < i3) {
            char cCharAt2 = str.charAt(i2);
            if (Intrinsics.compare((int) cCharAt2, 128) < 0) {
                yield.invoke(Byte.valueOf((byte) cCharAt2));
                i2++;
                while (i2 < i3 && Intrinsics.compare((int) str.charAt(i2), 128) < 0) {
                    yield.invoke(Byte.valueOf((byte) str.charAt(i2)));
                    i2++;
                }
            } else {
                if (Intrinsics.compare((int) cCharAt2, 2048) < 0) {
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 >> 6) | 192)));
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 & '?') | 128)));
                } else if (55296 > cCharAt2 || cCharAt2 >= 57344) {
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 >> '\f') | 224)));
                    yield.invoke(Byte.valueOf((byte) (((cCharAt2 >> 6) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 & '?') | 128)));
                } else if (Intrinsics.compare((int) cCharAt2, 56319) > 0 || i3 <= (i5 = i2 + 1) || 56320 > (cCharAt = str.charAt(i5)) || cCharAt >= 57344) {
                    yield.invoke((byte) 63);
                } else {
                    int iCharAt = ((cCharAt2 << '\n') + str.charAt(i5)) - 56613888;
                    yield.invoke(Byte.valueOf((byte) ((iCharAt >> 18) | 240)));
                    yield.invoke(Byte.valueOf((byte) (((iCharAt >> 12) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) (((iCharAt >> 6) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) ((iCharAt & 63) | 128)));
                    i2 += 2;
                }
                i2++;
            }
        }
    }

    public static final void processUtf8CodePoints(byte[] bArr, int i2, int i3, Function1<? super Integer, Unit> yield) {
        int i5;
        int i7;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(yield, "yield");
        int i8 = i2;
        while (i8 < i3) {
            byte b2 = bArr[i8];
            if (b2 >= 0) {
                yield.invoke(Integer.valueOf(b2));
                i8++;
                while (i8 < i3) {
                    byte b4 = bArr[i8];
                    if (b4 >= 0) {
                        i8++;
                        yield.invoke(Integer.valueOf(b4));
                    }
                }
            } else {
                if ((b2 >> 5) == -2) {
                    int i9 = i8 + 1;
                    if (i3 > i9) {
                        byte b5 = bArr[i9];
                        if ((b5 & 192) == 128) {
                            int i10 = (b2 << 6) ^ (b5 ^ ByteCompanionObject.MIN_VALUE);
                            yield.invoke(i10 < 128 ? 65533 : Integer.valueOf(i10));
                            Unit unit = Unit.INSTANCE;
                        }
                    }
                    yield.invoke(65533);
                    Unit unit2 = Unit.INSTANCE;
                } else if ((b2 >> 4) == -2) {
                    int i11 = i8 + 2;
                    if (i3 <= i11) {
                        yield.invoke(65533);
                        Unit unit3 = Unit.INSTANCE;
                        int i12 = i8 + 1;
                        i5 = (i3 <= i12 || (bArr[i12] & 192) != 128) ? 1 : 2;
                    } else {
                        byte b6 = bArr[i8 + 1];
                        if ((b6 & 192) == 128) {
                            byte b7 = bArr[i11];
                            if ((b7 & 192) == 128) {
                                int i13 = (b2 << 12) ^ ((b7 ^ ByteCompanionObject.MIN_VALUE) ^ (b6 << 6));
                                yield.invoke((i13 >= 2048 && (55296 > i13 || i13 >= 57344)) ? Integer.valueOf(i13) : 65533);
                                Unit unit4 = Unit.INSTANCE;
                                i5 = 3;
                            } else {
                                yield.invoke(65533);
                                Unit unit5 = Unit.INSTANCE;
                            }
                        } else {
                            yield.invoke(65533);
                            Unit unit6 = Unit.INSTANCE;
                        }
                    }
                } else if ((b2 >> 3) == -2) {
                    int i14 = i8 + 3;
                    if (i3 <= i14) {
                        yield.invoke(65533);
                        Unit unit7 = Unit.INSTANCE;
                        int i15 = i8 + 1;
                        if (i3 > i15 && (bArr[i15] & 192) == 128) {
                            int i16 = i8 + 2;
                            i7 = (i3 <= i16 || (bArr[i16] & 192) != 128) ? 2 : 3;
                        }
                        i7 = 1;
                    } else {
                        byte b8 = bArr[i8 + 1];
                        if ((b8 & 192) == 128) {
                            byte b9 = bArr[i8 + 2];
                            if ((b9 & 192) == 128) {
                                byte b10 = bArr[i14];
                                if ((b10 & 192) == 128) {
                                    int i17 = (((b10 ^ ByteCompanionObject.MIN_VALUE) ^ (b9 << 6)) ^ (b8 << 12)) ^ (b2 << 18);
                                    yield.invoke((i17 <= 1114111 && (55296 > i17 || i17 >= 57344) && i17 >= 65536) ? Integer.valueOf(i17) : 65533);
                                    Unit unit8 = Unit.INSTANCE;
                                    i7 = 4;
                                } else {
                                    yield.invoke(65533);
                                    Unit unit9 = Unit.INSTANCE;
                                }
                            } else {
                                yield.invoke(65533);
                                Unit unit10 = Unit.INSTANCE;
                            }
                        } else {
                            yield.invoke(65533);
                            Unit unit11 = Unit.INSTANCE;
                            i7 = 1;
                        }
                    }
                    i8 += i7;
                } else {
                    yield.invoke(65533);
                    i8++;
                }
                i8 += i5;
            }
        }
    }

    @JvmOverloads
    @JvmName(name = "size")
    public static final long size(String str, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return size$default(str, i2, 0, 2, null);
    }

    public static /* synthetic */ long size$default(String str, int i2, int i3, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = 0;
        }
        if ((i5 & 2) != 0) {
            i3 = str.length();
        }
        return size(str, i2, i3);
    }

    @JvmOverloads
    @JvmName(name = "size")
    public static final long size(String str, int i2, int i3) {
        int i5;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i2).toString());
        }
        if (i3 >= i2) {
            if (i3 > str.length()) {
                throw new IllegalArgumentException(("endIndex > string.length: " + i3 + " > " + str.length()).toString());
            }
            long j2 = 0;
            while (i2 < i3) {
                char cCharAt = str.charAt(i2);
                if (cCharAt < 128) {
                    j2++;
                } else {
                    if (cCharAt < 2048) {
                        i5 = 2;
                    } else if (cCharAt < 55296 || cCharAt > 57343) {
                        i5 = 3;
                    } else {
                        int i7 = i2 + 1;
                        char cCharAt2 = i7 < i3 ? str.charAt(i7) : (char) 0;
                        if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                            j2++;
                            i2 = i7;
                        } else {
                            j2 += (long) 4;
                            i2 += 2;
                        }
                    }
                    j2 += (long) i5;
                }
                i2++;
            }
            return j2;
        }
        throw new IllegalArgumentException(("endIndex < beginIndex: " + i3 + " < " + i2).toString());
    }
}
