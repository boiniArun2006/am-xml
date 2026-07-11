package kotlin.text;

import android.graphics.Trmy.yioUaKMByL;
import java.util.Arrays;
import kotlin.ExperimentalStdlibApi;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.HexFormat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Metadata(d1 = {"\u0000r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0019\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0001\n\u0000\u001a\u0016\u0010\r\u001a\u00020\u0001*\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007\u001a*\u0010\r\u001a\u00020\u0001*\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007\u001a,\u0010\u0014\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0004H\u0003\u001a,\u0010\u0018\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0004H\u0003\u001a,\u0010\u0019\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0004H\u0003\u001a,\u0010\u001a\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0004H\u0003\u001a<\u0010\u001b\u001a\u00020\u0012*\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0012H\u0002\u001a,\u0010\u001b\u001a\u00020\u0012*\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0012H\u0002\u001a(\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0012H\u0002\u001a@\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0012H\u0000\u001a\u0010\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020,H\u0002\u001a\u0016\u0010-\u001a\u00020\u000e*\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007\u001a*\u0010-\u001a\u00020\u000e*\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0003\u001a&\u0010.\u001a\u0004\u0018\u00010\u000e*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0003\u001a&\u0010/\u001a\u0004\u0018\u00010\u000e*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0003\u001a&\u00100\u001a\u0004\u0018\u00010\u000e*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0003\u001a$\u00101\u001a\u00020\u000e*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0003\u001a\u0014\u00102\u001a\u000203*\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u0012H\u0002\u001a@\u00104\u001a\u00020\u00122\u0006\u00105\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0012H\u0000\u001a \u00106\u001a\u00020,2\u0006\u00107\u001a\u00020,2\u0006\u00108\u001a\u00020\u00122\u0006\u00109\u001a\u00020\u0012H\u0002\u001a \u0010:\u001a\u00020,2\u0006\u00106\u001a\u00020,2\u0006\u00107\u001a\u00020,2\u0006\u00109\u001a\u00020\u0012H\u0002\u001a\u001c\u0010;\u001a\u00020\u0012*\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002\u001a\u0016\u0010\r\u001a\u00020\u0001*\u0002032\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007\u001a\u0016\u0010<\u001a\u000203*\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007\u001a*\u0010<\u001a\u000203*\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0003\u001a\u0016\u0010\r\u001a\u00020\u0001*\u00020=2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007\u001a\u0016\u0010>\u001a\u00020=*\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007\u001a*\u0010>\u001a\u00020=*\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0003\u001a\u0016\u0010\r\u001a\u00020\u0001*\u00020\u00122\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007\u001a\u0016\u0010?\u001a\u00020\u0012*\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007\u001a*\u0010?\u001a\u00020\u0012*\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0003\u001a\u0016\u0010\r\u001a\u00020\u0001*\u00020,2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007\u001a\u0016\u0010@\u001a\u00020,*\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007\u001a*\u0010@\u001a\u00020,*\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0001\u001a$\u0010A\u001a\u00020\u0001*\u00020,2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u00012\u0006\u0010E\u001a\u00020\u0012H\u0003\u001a\u001c\u0010F\u001a\u00020\u0012*\u00020\u00012\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0012H\u0002\u001a,\u0010G\u001a\u00020\u0012*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010H\u001a\u00020\u0012H\u0003\u001a,\u0010I\u001a\u00020,*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010H\u001a\u00020\u0012H\u0003\u001a<\u0010J\u001a\u00020K*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010L\u001a\u00020\u00012\u0006\u0010M\u001a\u00020\u00012\u0006\u0010N\u001a\u00020O2\u0006\u0010H\u001a\u00020\u0012H\u0002\u001a$\u0010P\u001a\u00020K*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010H\u001a\u00020\u0012H\u0002\u001a\u001c\u0010Q\u001a\u00020K*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002\u001a\u001c\u0010R\u001a\u00020\u0012*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002\u001a\u001c\u0010S\u001a\u00020,*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002\u001a5\u0010T\u001a\u00020\u0012*\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010U\u001a\u00020\u00012\u0006\u0010N\u001a\u00020O2\u0006\u0010V\u001a\u00020\u0001H\u0082\b\u001a\u0015\u0010W\u001a\u00020\u0012*\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u0012H\u0082\b\u001a\u0015\u0010X\u001a\u00020,*\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u0012H\u0082\b\u001a,\u0010Y\u001a\u00020K*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010Z\u001a\u00020\u00012\u0006\u0010[\u001a\u00020\u0012H\u0002\u001a,\u0010\\\u001a\u00020K*\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010U\u001a\u00020\u00012\u0006\u0010V\u001a\u00020\u0001H\u0002\u001a,\u0010]\u001a\u00020K*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010L\u001a\u00020\u00012\u0006\u0010M\u001a\u00020\u0001H\u0002\u001a\u0014\u0010^\u001a\u00020_*\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u0012H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u001c\u0010\u0003\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u000e\u0010\t\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006`"}, d2 = {"LOWER_CASE_HEX_DIGITS", "", "UPPER_CASE_HEX_DIGITS", "BYTE_TO_LOWER_CASE_HEX_DIGITS", "", "getBYTE_TO_LOWER_CASE_HEX_DIGITS$annotations", "()V", "getBYTE_TO_LOWER_CASE_HEX_DIGITS", "()[I", "BYTE_TO_UPPER_CASE_HEX_DIGITS", "HEX_DIGITS_TO_DECIMAL", "HEX_DIGITS_TO_LONG_DECIMAL", "", "toHexString", "", "format", "Lkotlin/text/HexFormat;", "startIndex", "", "endIndex", "toHexStringNoLineAndGroupSeparator", "bytesFormat", "Lkotlin/text/HexFormat$BytesHexFormat;", "byteToDigits", "toHexStringShortByteSeparatorNoPrefixAndSuffix", "toHexStringNoLineAndGroupSeparatorSlowPath", "toHexStringSlowPath", "formatByteAt", "index", "bytePrefix", "byteSuffix", "destination", "", "destinationOffset", "formattedStringLength", "numberOfBytes", "byteSeparatorLength", "bytePrefixLength", "byteSuffixLength", "bytesPerLine", "bytesPerGroup", "groupSeparatorLength", "checkFormatLength", "formatLength", "", "hexToByteArray", "hexToByteArrayNoLineAndGroupSeparator", "hexToByteArrayShortByteSeparatorNoPrefixAndSuffix", "hexToByteArrayNoLineAndGroupSeparatorSlowPath", "hexToByteArraySlowPath", "parseByteAt", "", "parsedByteArrayMaxSize", "stringLength", "charsPerSet", "charsPerElement", "elementsPerSet", "elementSeparatorLength", "wholeElementsPerSet", "checkNewLineAt", "hexToByte", "", "hexToShort", "hexToInt", "hexToLong", "toHexStringImpl", "numberFormat", "Lkotlin/text/HexFormat$NumberHexFormat;", "digits", "bits", "toCharArrayIfNotEmpty", "hexToIntImpl", "typeHexLength", "hexToLongImpl", "checkPrefixSuffixNumberOfDigits", "", "prefix", "suffix", "ignoreCase", "", "checkNumberOfDigits", "checkZeroDigits", "parseInt", "parseLong", "checkContainsAt", "part", "partName", "decimalFromHexDigitAt", "longDecimalFromHexDigitAt", "throwInvalidNumberOfDigits", "specifier", "expected", "throwNotContainedAt", "throwInvalidPrefixSuffix", "throwInvalidDigitAt", "", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHexExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,1249:1\n1198#1,7:1251\n1198#1,7:1258\n1198#1,7:1265\n1198#1,7:1272\n1198#1,7:1279\n1198#1,7:1286\n1198#1,7:1293\n1198#1,7:1300\n1209#1,5:1307\n1209#1,5:1312\n1198#1,7:1317\n1198#1,7:1324\n1209#1,5:1331\n1218#1,5:1336\n1#2:1250\n1188#3,3:1341\n1188#3,3:1344\n1188#3,3:1347\n1188#3,3:1350\n*S KotlinDebug\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n*L\n457#1:1251,7\n490#1:1258,7\n494#1:1265,7\n497#1:1272,7\n538#1:1279,7\n541#1:1286,7\n546#1:1293,7\n551#1:1300,7\n558#1:1307,5\n559#1:1312,5\n1153#1:1317,7\n1155#1:1324,7\n1183#1:1331,5\n1191#1:1336,5\n43#1:1341,3\n44#1:1344,3\n55#1:1347,3\n56#1:1350,3\n*E\n"})
public final class HexExtensionsKt {
    private static final int[] BYTE_TO_LOWER_CASE_HEX_DIGITS;
    private static final int[] BYTE_TO_UPPER_CASE_HEX_DIGITS;
    private static final int[] HEX_DIGITS_TO_DECIMAL;
    private static final long[] HEX_DIGITS_TO_LONG_DECIMAL;
    private static final String LOWER_CASE_HEX_DIGITS = "0123456789abcdef";
    private static final String UPPER_CASE_HEX_DIGITS = "0123456789ABCDEF";

    private static final int formatByteAt(byte[] bArr, int i2, String str, String str2, int[] iArr, char[] cArr, int i3) {
        return toCharArrayIfNotEmpty(str2, cArr, formatByteAt(bArr, i2, iArr, cArr, toCharArrayIfNotEmpty(str, cArr, i3)));
    }

    private static final int formattedStringLength(int i2, int i3, int i5, int i7) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j2 = i3;
        return checkFormatLength((((long) i2) * (((((long) i5) + 2) + ((long) i7)) + j2)) - j2);
    }

    @ExperimentalStdlibApi
    public static /* synthetic */ void getBYTE_TO_LOWER_CASE_HEX_DIGITS$annotations() {
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    public static final byte hexToByte(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToByte(str, 0, str.length(), format);
    }

    public static /* synthetic */ byte hexToByte$default(String str, HexFormat hexFormat, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToByte(str, hexFormat);
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    public static final byte[] hexToByteArray(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToByteArray(str, 0, str.length(), format);
    }

    public static /* synthetic */ byte[] hexToByteArray$default(String str, HexFormat hexFormat, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToByteArray(str, hexFormat);
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    public static final int hexToInt(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToInt(str, 0, str.length(), format);
    }

    public static /* synthetic */ int hexToInt$default(String str, HexFormat hexFormat, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToInt(str, hexFormat);
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    public static final long hexToLong(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToLong(str, 0, str.length(), format);
    }

    public static /* synthetic */ long hexToLong$default(String str, HexFormat hexFormat, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToLong(str, hexFormat);
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    public static final short hexToShort(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToShort(str, 0, str.length(), format);
    }

    public static /* synthetic */ short hexToShort$default(String str, HexFormat hexFormat, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToShort(str, hexFormat);
    }

    private static final int parseInt(String str, int i2, int i3) {
        int i5;
        int i7 = 0;
        while (i2 < i3) {
            int i8 = i7 << 4;
            char cCharAt = str.charAt(i2);
            if ((cCharAt >>> '\b') != 0 || (i5 = HEX_DIGITS_TO_DECIMAL[cCharAt]) < 0) {
                throwInvalidDigitAt(str, i2);
                throw new KotlinNothingValueException();
            }
            i7 = i8 | i5;
            i2++;
        }
        return i7;
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    public static final String toHexString(byte[] bArr, HexFormat format) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return toHexString(bArr, 0, bArr.length, format);
    }

    public static /* synthetic */ String toHexString$default(byte[] bArr, HexFormat hexFormat, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(bArr, hexFormat);
    }

    static {
        int[] iArr = new int[256];
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            iArr[i3] = LOWER_CASE_HEX_DIGITS.charAt(i3 & 15) | (LOWER_CASE_HEX_DIGITS.charAt(i3 >> 4) << '\b');
        }
        BYTE_TO_LOWER_CASE_HEX_DIGITS = iArr;
        int[] iArr2 = new int[256];
        for (int i5 = 0; i5 < 256; i5++) {
            iArr2[i5] = UPPER_CASE_HEX_DIGITS.charAt(i5 & 15) | (UPPER_CASE_HEX_DIGITS.charAt(i5 >> 4) << '\b');
        }
        BYTE_TO_UPPER_CASE_HEX_DIGITS = iArr2;
        int[] iArr3 = new int[256];
        for (int i7 = 0; i7 < 256; i7++) {
            iArr3[i7] = -1;
        }
        int i8 = 0;
        int i9 = 0;
        while (i8 < LOWER_CASE_HEX_DIGITS.length()) {
            iArr3[LOWER_CASE_HEX_DIGITS.charAt(i8)] = i9;
            i8++;
            i9++;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < UPPER_CASE_HEX_DIGITS.length()) {
            iArr3[UPPER_CASE_HEX_DIGITS.charAt(i10)] = i11;
            i10++;
            i11++;
        }
        HEX_DIGITS_TO_DECIMAL = iArr3;
        long[] jArr = new long[256];
        for (int i12 = 0; i12 < 256; i12++) {
            jArr[i12] = -1;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < LOWER_CASE_HEX_DIGITS.length()) {
            jArr[LOWER_CASE_HEX_DIGITS.charAt(i13)] = i14;
            i13++;
            i14++;
        }
        int i15 = 0;
        while (i2 < UPPER_CASE_HEX_DIGITS.length()) {
            jArr[UPPER_CASE_HEX_DIGITS.charAt(i2)] = i15;
            i2++;
            i15++;
        }
        HEX_DIGITS_TO_LONG_DECIMAL = jArr;
    }

    private static final long charsPerSet(long j2, int i2, int i3) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j3 = i2;
        return (j2 * j3) + (((long) i3) * (j3 - 1));
    }

    private static final int checkFormatLength(long j2) {
        if (0 <= j2 && j2 <= 2147483647L) {
            return (int) j2;
        }
        throw new IllegalArgumentException("The resulting string length is too big: " + ((Object) ULong.m533toStringimpl(ULong.m487constructorimpl(j2))));
    }

    private static final void checkNumberOfDigits(String str, int i2, int i3, int i5) {
        int i7 = i3 - i2;
        if (i7 < 1) {
            throwInvalidNumberOfDigits(str, i2, i3, "at least", 1);
        } else if (i7 > i5) {
            checkZeroDigits(str, i2, (i7 + i2) - i5);
        }
    }

    private static final void checkPrefixSuffixNumberOfDigits(String str, int i2, int i3, String str2, String str3, boolean z2, int i5) {
        if ((i3 - i2) - str2.length() <= str3.length()) {
            throwInvalidPrefixSuffix(str, i2, i3, str2, str3);
        }
        if (str2.length() != 0) {
            int length = str2.length();
            for (int i7 = 0; i7 < length; i7++) {
                if (!CharsKt__CharKt.equals(str2.charAt(i7), str.charAt(i2 + i7), z2)) {
                    throwNotContainedAt(str, i2, i3, str2, "prefix");
                }
            }
            i2 += str2.length();
        }
        int length2 = i3 - str3.length();
        if (str3.length() != 0) {
            int length3 = str3.length();
            for (int i8 = 0; i8 < length3; i8++) {
                if (!CharsKt__CharKt.equals(str3.charAt(i8), str.charAt(length2 + i8), z2)) {
                    throwNotContainedAt(str, length2, i3, str3, "suffix");
                }
            }
        }
        checkNumberOfDigits(str, i2, length2, i5);
    }

    private static final void checkZeroDigits(String str, int i2, int i3) {
        while (i2 < i3) {
            if (str.charAt(i2) != '0') {
                throw new NumberFormatException("Expected the hexadecimal digit '0' at index " + i2 + ", but was '" + str.charAt(i2) + "'.\nThe result won't fit the type being parsed.");
            }
            i2++;
        }
    }

    public static final int[] getBYTE_TO_LOWER_CASE_HEX_DIGITS() {
        return BYTE_TO_LOWER_CASE_HEX_DIGITS;
    }

    @ExperimentalStdlibApi
    private static final byte hexToByte(String str, int i2, int i3, HexFormat hexFormat) {
        return (byte) hexToIntImpl(str, i2, i3, hexFormat, 2);
    }

    @ExperimentalStdlibApi
    private static final byte[] hexToByteArray(String str, int i2, int i3, HexFormat hexFormat) {
        byte[] bArrHexToByteArrayNoLineAndGroupSeparator;
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i2, i3, str.length());
        if (i2 == i3) {
            return new byte[0];
        }
        HexFormat.BytesHexFormat bytes = hexFormat.getBytes();
        return (!bytes.getNoLineAndGroupSeparator() || (bArrHexToByteArrayNoLineAndGroupSeparator = hexToByteArrayNoLineAndGroupSeparator(str, i2, i3, bytes)) == null) ? hexToByteArraySlowPath(str, i2, i3, bytes) : bArrHexToByteArrayNoLineAndGroupSeparator;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0110  */
    @ExperimentalStdlibApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final byte[] hexToByteArraySlowPath(String str, int i2, int i3, HexFormat.BytesHexFormat bytesHexFormat) {
        int i5;
        int i7;
        int i8;
        int bytesPerLine = bytesHexFormat.getBytesPerLine();
        int bytesPerGroup = bytesHexFormat.getBytesPerGroup();
        String bytePrefix = bytesHexFormat.getBytePrefix();
        String byteSuffix = bytesHexFormat.getByteSuffix();
        String byteSeparator = bytesHexFormat.getByteSeparator();
        String groupSeparator = bytesHexFormat.getGroupSeparator();
        boolean ignoreCase$kotlin_stdlib = bytesHexFormat.getIgnoreCase();
        int i9 = parsedByteArrayMaxSize(i3 - i2, bytesPerLine, bytesPerGroup, groupSeparator.length(), byteSeparator.length(), bytePrefix.length(), byteSuffix.length());
        byte[] bArr = new byte[i9];
        int length = i2;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (length < i3) {
            if (i11 == bytesPerLine) {
                length = checkNewLineAt(str, length, i3);
                i5 = bytesPerLine;
                i7 = bytesPerGroup;
                i11 = 0;
            } else if (i12 != bytesPerGroup) {
                i5 = bytesPerLine;
                i7 = bytesPerGroup;
                if (i12 != 0 && byteSeparator.length() != 0) {
                    int length2 = byteSeparator.length();
                    int i13 = 0;
                    while (i13 < length2) {
                        int i14 = length2;
                        if (!CharsKt__CharKt.equals(byteSeparator.charAt(i13), str.charAt(length + i13), ignoreCase$kotlin_stdlib)) {
                            throwNotContainedAt(str, length, i3, byteSeparator, "byte separator");
                        }
                        i13++;
                        length2 = i14;
                    }
                    length += byteSeparator.length();
                }
                i11++;
                i12++;
                if (bytePrefix.length() != 0) {
                    int length3 = bytePrefix.length();
                    int i15 = 0;
                    while (i15 < length3) {
                        int i16 = length3;
                        if (!CharsKt__CharKt.equals(bytePrefix.charAt(i15), str.charAt(length + i15), ignoreCase$kotlin_stdlib)) {
                            throwNotContainedAt(str, length, i3, bytePrefix, "byte prefix");
                        }
                        i15++;
                        length3 = i16;
                    }
                    length += bytePrefix.length();
                }
                if (i3 - 2 < length) {
                    throwInvalidNumberOfDigits(str, length, i3, "exactly", 2);
                }
                int i17 = i10 + 1;
                bArr[i10] = parseByteAt(str, length);
                length += 2;
                if (byteSuffix.length() != 0) {
                    i8 = i17;
                } else {
                    int length4 = byteSuffix.length();
                    int i18 = 0;
                    while (i18 < length4) {
                        int i19 = i17;
                        if (!CharsKt__CharKt.equals(byteSuffix.charAt(i18), str.charAt(length + i18), ignoreCase$kotlin_stdlib)) {
                            throwNotContainedAt(str, length, i3, byteSuffix, "byte suffix");
                        }
                        i18++;
                        i17 = i19;
                    }
                    i8 = i17;
                    length += byteSuffix.length();
                }
                i10 = i8;
                bytesPerLine = i5;
                bytesPerGroup = i7;
            } else if (groupSeparator.length() == 0) {
                i5 = bytesPerLine;
                i7 = bytesPerGroup;
            } else {
                int length5 = groupSeparator.length();
                int i20 = 0;
                while (i20 < length5) {
                    int i21 = bytesPerLine;
                    int i22 = bytesPerGroup;
                    if (!CharsKt__CharKt.equals(groupSeparator.charAt(i20), str.charAt(length + i20), ignoreCase$kotlin_stdlib)) {
                        throwNotContainedAt(str, length, i3, groupSeparator, "group separator");
                    }
                    i20++;
                    bytesPerLine = i21;
                    bytesPerGroup = i22;
                }
                i5 = bytesPerLine;
                i7 = bytesPerGroup;
                length += groupSeparator.length();
            }
            i12 = 0;
            i11++;
            i12++;
            if (bytePrefix.length() != 0) {
            }
            if (i3 - 2 < length) {
            }
            int i172 = i10 + 1;
            bArr[i10] = parseByteAt(str, length);
            length += 2;
            if (byteSuffix.length() != 0) {
            }
            i10 = i8;
            bytesPerLine = i5;
            bytesPerGroup = i7;
        }
        if (i10 == i9) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i10);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    @ExperimentalStdlibApi
    private static final int hexToInt(String str, int i2, int i3, HexFormat hexFormat) {
        return hexToIntImpl(str, i2, i3, hexFormat, 8);
    }

    @ExperimentalStdlibApi
    private static final int hexToIntImpl(String str, int i2, int i3, HexFormat hexFormat, int i5) {
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i2, i3, str.length());
        HexFormat.NumberHexFormat number = hexFormat.getNumber();
        if (number.getIsDigitsOnly()) {
            checkNumberOfDigits(str, i2, i3, i5);
            return parseInt(str, i2, i3);
        }
        String prefix = number.getPrefix();
        String suffix = number.getSuffix();
        checkPrefixSuffixNumberOfDigits(str, i2, i3, prefix, suffix, number.getIgnoreCase(), i5);
        return parseInt(str, i2 + prefix.length(), i3 - suffix.length());
    }

    @ExperimentalStdlibApi
    public static final long hexToLong(String str, int i2, int i3, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToLongImpl(str, i2, i3, format, 16);
    }

    @ExperimentalStdlibApi
    private static final long hexToLongImpl(String str, int i2, int i3, HexFormat hexFormat, int i5) {
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i2, i3, str.length());
        HexFormat.NumberHexFormat number = hexFormat.getNumber();
        if (number.getIsDigitsOnly()) {
            checkNumberOfDigits(str, i2, i3, i5);
            return parseLong(str, i2, i3);
        }
        String prefix = number.getPrefix();
        String suffix = number.getSuffix();
        checkPrefixSuffixNumberOfDigits(str, i2, i3, prefix, suffix, number.getIgnoreCase(), i5);
        return parseLong(str, i2 + prefix.length(), i3 - suffix.length());
    }

    @ExperimentalStdlibApi
    private static final short hexToShort(String str, int i2, int i3, HexFormat hexFormat) {
        return (short) hexToIntImpl(str, i2, i3, hexFormat, 4);
    }

    private static final long parseLong(String str, int i2, int i3) {
        long j2 = 0;
        while (i2 < i3) {
            long j3 = j2 << 4;
            char cCharAt = str.charAt(i2);
            if ((cCharAt >>> '\b') == 0) {
                long j4 = HEX_DIGITS_TO_LONG_DECIMAL[cCharAt];
                if (j4 >= 0) {
                    j2 = j3 | j4;
                    i2++;
                }
            }
            throwInvalidDigitAt(str, i2);
            throw new KotlinNothingValueException();
        }
        return j2;
    }

    public static final int parsedByteArrayMaxSize(int i2, int i3, int i5, int i7, int i8, int i9, int i10) {
        long jCharsPerSet;
        if (i2 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j2 = ((long) i9) + 2 + ((long) i10);
        long jCharsPerSet2 = charsPerSet(j2, i5, i8);
        if (i3 <= i5) {
            jCharsPerSet = charsPerSet(j2, i3, i8);
        } else {
            jCharsPerSet = charsPerSet(jCharsPerSet2, i3 / i5, i7);
            int i11 = i3 % i5;
            if (i11 != 0) {
                jCharsPerSet = jCharsPerSet + ((long) i7) + charsPerSet(j2, i11, i8);
            }
        }
        long j3 = i2;
        long jWholeElementsPerSet = wholeElementsPerSet(j3, jCharsPerSet, 1);
        long j4 = j3 - ((jCharsPerSet + 1) * jWholeElementsPerSet);
        long jWholeElementsPerSet2 = wholeElementsPerSet(j4, jCharsPerSet2, i7);
        long j5 = j4 - ((jCharsPerSet2 + ((long) i7)) * jWholeElementsPerSet2);
        long jWholeElementsPerSet3 = wholeElementsPerSet(j5, j2, i8);
        return (int) ((jWholeElementsPerSet * ((long) i3)) + (jWholeElementsPerSet2 * ((long) i5)) + jWholeElementsPerSet3 + ((long) (j5 - ((j2 + ((long) i8)) * jWholeElementsPerSet3) > 0 ? 1 : 0)));
    }

    private static final Void throwInvalidDigitAt(String str, int i2) {
        throw new NumberFormatException("Expected a hexadecimal digit at index " + i2 + ", but was " + str.charAt(i2));
    }

    private static final void throwInvalidNumberOfDigits(String str, int i2, int i3, String str2, int i5) {
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i2, i3);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected " + str2 + ' ' + i5 + yioUaKMByL.kDAKrHLzqCPyfQH + i2 + ", but was \"" + strSubstring + "\" of length " + (i3 - i2));
    }

    private static final void throwInvalidPrefixSuffix(String str, int i2, int i3, String str2, String str3) {
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i2, i3);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected a hexadecimal number with prefix \"" + str2 + "\" and suffix \"" + str3 + "\", but was " + strSubstring);
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    public static final String toHexString(byte[] bArr, int i2, int i3, HexFormat format) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i2, i3, bArr.length);
        if (i2 == i3) {
            return "";
        }
        int[] iArr = format.getUpperCase() ? BYTE_TO_UPPER_CASE_HEX_DIGITS : BYTE_TO_LOWER_CASE_HEX_DIGITS;
        HexFormat.BytesHexFormat bytes = format.getBytes();
        return bytes.getNoLineAndGroupSeparator() ? toHexStringNoLineAndGroupSeparator(bArr, i2, i3, bytes, iArr) : toHexStringSlowPath(bArr, i2, i3, bytes, iArr);
    }

    @ExperimentalStdlibApi
    private static final String toHexStringImpl(long j2, HexFormat.NumberHexFormat numberHexFormat, String str, int i2) {
        if ((i2 & 3) != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i3 = i2 >> 2;
        int minLength = numberHexFormat.getMinLength();
        int iCoerceAtLeast = RangesKt.coerceAtLeast(minLength - i3, 0);
        String prefix = numberHexFormat.getPrefix();
        String suffix = numberHexFormat.getSuffix();
        boolean removeLeadingZeros = numberHexFormat.getRemoveLeadingZeros();
        int iCheckFormatLength = checkFormatLength(((long) prefix.length()) + ((long) iCoerceAtLeast) + ((long) i3) + ((long) suffix.length()));
        char[] cArr = new char[iCheckFormatLength];
        int charArrayIfNotEmpty = toCharArrayIfNotEmpty(prefix, cArr, 0);
        if (iCoerceAtLeast > 0) {
            int i5 = iCoerceAtLeast + charArrayIfNotEmpty;
            ArraysKt.fill(cArr, str.charAt(0), charArrayIfNotEmpty, i5);
            charArrayIfNotEmpty = i5;
        }
        int i7 = i2;
        for (int i8 = 0; i8 < i3; i8++) {
            i7 -= 4;
            int i9 = (int) ((j2 >> i7) & 15);
            removeLeadingZeros = removeLeadingZeros && i9 == 0 && (i7 >> 2) >= minLength;
            if (!removeLeadingZeros) {
                cArr[charArrayIfNotEmpty] = str.charAt(i9);
                charArrayIfNotEmpty++;
            }
        }
        int charArrayIfNotEmpty2 = toCharArrayIfNotEmpty(suffix, cArr, charArrayIfNotEmpty);
        return charArrayIfNotEmpty2 == iCheckFormatLength ? StringsKt__StringsJVMKt.concatToString(cArr) : StringsKt__StringsJVMKt.concatToString$default(cArr, 0, charArrayIfNotEmpty2, 1, null);
    }

    @ExperimentalStdlibApi
    private static final String toHexStringSlowPath(byte[] bArr, int i2, int i3, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        int i5;
        int i7;
        int bytesPerLine = bytesHexFormat.getBytesPerLine();
        int bytesPerGroup = bytesHexFormat.getBytesPerGroup();
        String bytePrefix = bytesHexFormat.getBytePrefix();
        String byteSuffix = bytesHexFormat.getByteSuffix();
        String byteSeparator = bytesHexFormat.getByteSeparator();
        String groupSeparator = bytesHexFormat.getGroupSeparator();
        int i8 = formattedStringLength(i3 - i2, bytesPerLine, bytesPerGroup, groupSeparator.length(), byteSeparator.length(), bytePrefix.length(), byteSuffix.length());
        char[] cArr = new char[i8];
        int i9 = i2;
        int charArrayIfNotEmpty = 0;
        int i10 = 0;
        int i11 = 0;
        while (i9 < i3) {
            if (i10 == bytesPerLine) {
                cArr[charArrayIfNotEmpty] = '\n';
                charArrayIfNotEmpty++;
                i5 = 0;
                i7 = 0;
            } else if (i11 == bytesPerGroup) {
                charArrayIfNotEmpty = toCharArrayIfNotEmpty(groupSeparator, cArr, charArrayIfNotEmpty);
                i5 = i10;
                i7 = 0;
            } else {
                i5 = i10;
                i7 = i11;
            }
            if (i7 != 0) {
                charArrayIfNotEmpty = toCharArrayIfNotEmpty(byteSeparator, cArr, charArrayIfNotEmpty);
            }
            String str = bytePrefix;
            int byteAt = formatByteAt(bArr, i9, str, byteSuffix, iArr, cArr, charArrayIfNotEmpty);
            i9++;
            i11 = i7 + 1;
            charArrayIfNotEmpty = byteAt;
            bytePrefix = str;
            i10 = i5 + 1;
        }
        if (charArrayIfNotEmpty == i8) {
            return StringsKt__StringsJVMKt.concatToString(cArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    private static final long wholeElementsPerSet(long j2, long j3, int i2) {
        if (j2 <= 0 || j3 <= 0) {
            return 0L;
        }
        long j4 = i2;
        return (j2 + j4) / (j3 + j4);
    }

    private static final int checkContainsAt(String str, int i2, int i3, String str2, boolean z2, String str3) {
        if (str2.length() == 0) {
            return i2;
        }
        int length = str2.length();
        for (int i5 = 0; i5 < length; i5++) {
            if (!CharsKt__CharKt.equals(str2.charAt(i5), str.charAt(i2 + i5), z2)) {
                throwNotContainedAt(str, i2, i3, str2, str3);
            }
        }
        return i2 + str2.length();
    }

    private static final int checkNewLineAt(String str, int i2, int i3) {
        if (str.charAt(i2) == '\r') {
            int i5 = i2 + 1;
            if (i5 < i3 && str.charAt(i5) == '\n') {
                return i2 + 2;
            }
            return i5;
        }
        if (str.charAt(i2) == '\n') {
            return i2 + 1;
        }
        throw new NumberFormatException("Expected a new line at index " + i2 + ", but was " + str.charAt(i2));
    }

    private static final int decimalFromHexDigitAt(String str, int i2) {
        int i3;
        char cCharAt = str.charAt(i2);
        if ((cCharAt >>> '\b') == 0 && (i3 = HEX_DIGITS_TO_DECIMAL[cCharAt]) >= 0) {
            return i3;
        }
        throwInvalidDigitAt(str, i2);
        throw new KotlinNothingValueException();
    }

    public static final int formattedStringLength(int i2, int i3, int i5, int i7, int i8, int i9, int i10) {
        if (i2 > 0) {
            int i11 = i2 - 1;
            int i12 = i11 / i3;
            int i13 = (i3 - 1) / i5;
            int i14 = i2 % i3;
            if (i14 != 0) {
                i3 = i14;
            }
            int i15 = (i13 * i12) + ((i3 - 1) / i5);
            return checkFormatLength(((long) i12) + (((long) i15) * ((long) i7)) + (((long) ((i11 - i12) - i15)) * ((long) i8)) + (((long) i2) * (((long) i9) + 2 + ((long) i10))));
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    static /* synthetic */ byte hexToByte$default(String str, int i2, int i3, HexFormat hexFormat, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = 0;
        }
        if ((i5 & 2) != 0) {
            i3 = str.length();
        }
        if ((i5 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToByte(str, i2, i3, hexFormat);
    }

    static /* synthetic */ byte[] hexToByteArray$default(String str, int i2, int i3, HexFormat hexFormat, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = 0;
        }
        if ((i5 & 2) != 0) {
            i3 = str.length();
        }
        if ((i5 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToByteArray(str, i2, i3, hexFormat);
    }

    @ExperimentalStdlibApi
    private static final byte[] hexToByteArrayNoLineAndGroupSeparator(String str, int i2, int i3, HexFormat.BytesHexFormat bytesHexFormat) {
        if (bytesHexFormat.getShortByteSeparatorNoPrefixAndSuffix()) {
            return hexToByteArrayShortByteSeparatorNoPrefixAndSuffix(str, i2, i3, bytesHexFormat);
        }
        return hexToByteArrayNoLineAndGroupSeparatorSlowPath(str, i2, i3, bytesHexFormat);
    }

    @ExperimentalStdlibApi
    private static final byte[] hexToByteArrayNoLineAndGroupSeparatorSlowPath(String str, int i2, int i3, HexFormat.BytesHexFormat bytesHexFormat) {
        String bytePrefix = bytesHexFormat.getBytePrefix();
        String byteSuffix = bytesHexFormat.getByteSuffix();
        String byteSeparator = bytesHexFormat.getByteSeparator();
        long length = byteSeparator.length();
        long length2 = ((long) bytePrefix.length()) + 2 + ((long) byteSuffix.length()) + length;
        long j2 = i3 - i2;
        int i5 = (int) ((j2 + length) / length2);
        if ((((long) i5) * length2) - length != j2) {
            return null;
        }
        boolean ignoreCase$kotlin_stdlib = bytesHexFormat.getIgnoreCase();
        byte[] bArr = new byte[i5];
        if (bytePrefix.length() != 0) {
            int length3 = bytePrefix.length();
            for (int i7 = 0; i7 < length3; i7++) {
                if (!CharsKt__CharKt.equals(bytePrefix.charAt(i7), str.charAt(i2 + i7), ignoreCase$kotlin_stdlib)) {
                    throwNotContainedAt(str, i2, i3, bytePrefix, "byte prefix");
                }
            }
            i2 += bytePrefix.length();
        }
        String str2 = byteSuffix + byteSeparator + bytePrefix;
        int i8 = i5 - 1;
        for (int i9 = 0; i9 < i8; i9++) {
            bArr[i9] = parseByteAt(str, i2);
            i2 += 2;
            if (str2.length() != 0) {
                int length4 = str2.length();
                for (int i10 = 0; i10 < length4; i10++) {
                    if (!CharsKt__CharKt.equals(str2.charAt(i10), str.charAt(i2 + i10), ignoreCase$kotlin_stdlib)) {
                        throwNotContainedAt(str, i2, i3, str2, "byte suffix + byte separator + byte prefix");
                    }
                }
                i2 += str2.length();
            }
        }
        bArr[i8] = parseByteAt(str, i2);
        int i11 = i2 + 2;
        if (byteSuffix.length() == 0) {
            return bArr;
        }
        int length5 = byteSuffix.length();
        for (int i12 = 0; i12 < length5; i12++) {
            if (!CharsKt__CharKt.equals(byteSuffix.charAt(i12), str.charAt(i11 + i12), ignoreCase$kotlin_stdlib)) {
                throwNotContainedAt(str, i11, i3, byteSuffix, "byte suffix");
            }
        }
        return bArr;
    }

    @ExperimentalStdlibApi
    private static final byte[] hexToByteArrayShortByteSeparatorNoPrefixAndSuffix(String str, int i2, int i3, HexFormat.BytesHexFormat bytesHexFormat) {
        int length = bytesHexFormat.getByteSeparator().length();
        if (length <= 1) {
            int i5 = i3 - i2;
            int i7 = 2;
            if (length == 0) {
                if ((i5 & 1) != 0) {
                    return null;
                }
                int i8 = i5 >> 1;
                byte[] bArr = new byte[i8];
                int i9 = 0;
                for (int i10 = 0; i10 < i8; i10++) {
                    bArr[i10] = parseByteAt(str, i9);
                    i9 += 2;
                }
                return bArr;
            }
            if (i5 % 3 != 2) {
                return null;
            }
            int i11 = (i5 / 3) + 1;
            byte[] bArr2 = new byte[i11];
            char cCharAt = bytesHexFormat.getByteSeparator().charAt(0);
            bArr2[0] = parseByteAt(str, 0);
            for (int i12 = 1; i12 < i11; i12++) {
                if (str.charAt(i7) != cCharAt) {
                    String byteSeparator = bytesHexFormat.getByteSeparator();
                    boolean ignoreCase$kotlin_stdlib = bytesHexFormat.getIgnoreCase();
                    if (byteSeparator.length() != 0) {
                        int length2 = byteSeparator.length();
                        for (int i13 = 0; i13 < length2; i13++) {
                            if (!CharsKt__CharKt.equals(byteSeparator.charAt(i13), str.charAt(i7 + i13), ignoreCase$kotlin_stdlib)) {
                                throwNotContainedAt(str, i7, i3, byteSeparator, "byte separator");
                            }
                        }
                        byteSeparator.length();
                    }
                }
                bArr2[i12] = parseByteAt(str, i7 + 1);
                i7 += 3;
            }
            return bArr2;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    static /* synthetic */ int hexToInt$default(String str, int i2, int i3, HexFormat hexFormat, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = 0;
        }
        if ((i5 & 2) != 0) {
            i3 = str.length();
        }
        if ((i5 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToInt(str, i2, i3, hexFormat);
    }

    public static /* synthetic */ long hexToLong$default(String str, int i2, int i3, HexFormat hexFormat, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = 0;
        }
        if ((i5 & 2) != 0) {
            i3 = str.length();
        }
        if ((i5 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToLong(str, i2, i3, hexFormat);
    }

    static /* synthetic */ short hexToShort$default(String str, int i2, int i3, HexFormat hexFormat, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = 0;
        }
        if ((i5 & 2) != 0) {
            i3 = str.length();
        }
        if ((i5 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToShort(str, i2, i3, hexFormat);
    }

    private static final long longDecimalFromHexDigitAt(String str, int i2) {
        char cCharAt = str.charAt(i2);
        if ((cCharAt >>> '\b') == 0) {
            long j2 = HEX_DIGITS_TO_LONG_DECIMAL[cCharAt];
            if (j2 >= 0) {
                return j2;
            }
        }
        throwInvalidDigitAt(str, i2);
        throw new KotlinNothingValueException();
    }

    private static final byte parseByteAt(String str, int i2) {
        int[] iArr;
        int i3;
        int i5;
        char cCharAt = str.charAt(i2);
        if ((cCharAt >>> '\b') == 0 && (i3 = (iArr = HEX_DIGITS_TO_DECIMAL)[cCharAt]) >= 0) {
            int i7 = i2 + 1;
            char cCharAt2 = str.charAt(i7);
            if ((cCharAt2 >>> '\b') == 0 && (i5 = iArr[cCharAt2]) >= 0) {
                return (byte) ((i3 << 4) | i5);
            }
            throwInvalidDigitAt(str, i7);
            throw new KotlinNothingValueException();
        }
        throwInvalidDigitAt(str, i2);
        throw new KotlinNothingValueException();
    }

    private static final void throwNotContainedAt(String str, int i2, int i3, String str2, String str3) {
        int iCoerceAtMost = RangesKt.coerceAtMost(str2.length() + i2, i3);
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i2, iCoerceAtMost);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected " + str3 + " \"" + str2 + "\" at index " + i2 + ", but was " + strSubstring);
    }

    private static final int toCharArrayIfNotEmpty(String str, char[] cArr, int i2) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                int length2 = str.length();
                Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                str.getChars(0, length2, cArr, i2);
            } else {
                cArr[i2] = str.charAt(0);
            }
        }
        return i2 + str.length();
    }

    public static /* synthetic */ String toHexString$default(byte[] bArr, int i2, int i3, HexFormat hexFormat, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = 0;
        }
        if ((i5 & 2) != 0) {
            i3 = bArr.length;
        }
        if ((i5 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(bArr, i2, i3, hexFormat);
    }

    @ExperimentalStdlibApi
    private static final String toHexStringNoLineAndGroupSeparator(byte[] bArr, int i2, int i3, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        if (bytesHexFormat.getShortByteSeparatorNoPrefixAndSuffix()) {
            return toHexStringShortByteSeparatorNoPrefixAndSuffix(bArr, i2, i3, bytesHexFormat, iArr);
        }
        return toHexStringNoLineAndGroupSeparatorSlowPath(bArr, i2, i3, bytesHexFormat, iArr);
    }

    @ExperimentalStdlibApi
    private static final String toHexStringNoLineAndGroupSeparatorSlowPath(byte[] bArr, int i2, int i3, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        String bytePrefix = bytesHexFormat.getBytePrefix();
        String byteSuffix = bytesHexFormat.getByteSuffix();
        String byteSeparator = bytesHexFormat.getByteSeparator();
        char[] cArr = new char[formattedStringLength(i3 - i2, byteSeparator.length(), bytePrefix.length(), byteSuffix.length())];
        int byteAt = formatByteAt(bArr, i2, bytePrefix, byteSuffix, iArr, cArr, 0);
        for (int i5 = i2 + 1; i5 < i3; i5++) {
            byteAt = formatByteAt(bArr, i5, bytePrefix, byteSuffix, iArr, cArr, toCharArrayIfNotEmpty(byteSeparator, cArr, byteAt));
        }
        return StringsKt__StringsJVMKt.concatToString(cArr);
    }

    @ExperimentalStdlibApi
    private static final String toHexStringShortByteSeparatorNoPrefixAndSuffix(byte[] bArr, int i2, int i3, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        int length = bytesHexFormat.getByteSeparator().length();
        if (length <= 1) {
            int i5 = i3 - i2;
            int byteAt = 0;
            if (length == 0) {
                char[] cArr = new char[checkFormatLength(((long) i5) * 2)];
                while (i2 < i3) {
                    byteAt = formatByteAt(bArr, i2, iArr, cArr, byteAt);
                    i2++;
                }
                return StringsKt__StringsJVMKt.concatToString(cArr);
            }
            char[] cArr2 = new char[checkFormatLength((((long) i5) * 3) - 1)];
            char cCharAt = bytesHexFormat.getByteSeparator().charAt(0);
            int byteAt2 = formatByteAt(bArr, i2, iArr, cArr2, 0);
            for (int i7 = i2 + 1; i7 < i3; i7++) {
                cArr2[byteAt2] = cCharAt;
                byteAt2 = formatByteAt(bArr, i7, iArr, cArr2, byteAt2 + 1);
            }
            return StringsKt__StringsJVMKt.concatToString(cArr2);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    private static final int formatByteAt(byte[] bArr, int i2, int[] iArr, char[] cArr, int i3) {
        int i5 = iArr[bArr[i2] & UByte.MAX_VALUE];
        cArr[i3] = (char) (i5 >> 8);
        cArr[i3 + 1] = (char) (i5 & 255);
        return i3 + 2;
    }

    public static /* synthetic */ String toHexString$default(byte b2, HexFormat hexFormat, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(b2, hexFormat);
    }

    public static /* synthetic */ String toHexString$default(short s2, HexFormat hexFormat, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(s2, hexFormat);
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    public static final String toHexString(byte b2, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        String str = format.getUpperCase() ? UPPER_CASE_HEX_DIGITS : LOWER_CASE_HEX_DIGITS;
        HexFormat.NumberHexFormat number = format.getNumber();
        if (number.getIsDigitsOnlyAndNoPadding()) {
            char[] cArr = {str.charAt((b2 >> 4) & 15), str.charAt(b2 & 15)};
            if (number.getRemoveLeadingZeros()) {
                return StringsKt__StringsJVMKt.concatToString$default(cArr, RangesKt.coerceAtMost((Integer.numberOfLeadingZeros(b2 & UByte.MAX_VALUE) - 24) >> 2, 1), 0, 2, null);
            }
            return StringsKt__StringsJVMKt.concatToString(cArr);
        }
        return toHexStringImpl(b2, number, str, 8);
    }

    public static /* synthetic */ String toHexString$default(int i2, HexFormat hexFormat, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(i2, hexFormat);
    }

    public static /* synthetic */ String toHexString$default(long j2, HexFormat hexFormat, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(j2, hexFormat);
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    public static final String toHexString(short s2, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        String str = format.getUpperCase() ? UPPER_CASE_HEX_DIGITS : LOWER_CASE_HEX_DIGITS;
        HexFormat.NumberHexFormat number = format.getNumber();
        if (number.getIsDigitsOnlyAndNoPadding()) {
            char[] cArr = {str.charAt((s2 >> 12) & 15), str.charAt((s2 >> 8) & 15), str.charAt((s2 >> 4) & 15), str.charAt(s2 & 15)};
            if (number.getRemoveLeadingZeros()) {
                return StringsKt__StringsJVMKt.concatToString$default(cArr, RangesKt.coerceAtMost((Integer.numberOfLeadingZeros(s2 & UShort.MAX_VALUE) - 16) >> 2, 3), 0, 2, null);
            }
            return StringsKt__StringsJVMKt.concatToString(cArr);
        }
        return toHexStringImpl(s2, number, str, 16);
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    public static final String toHexString(int i2, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        String str = format.getUpperCase() ? UPPER_CASE_HEX_DIGITS : LOWER_CASE_HEX_DIGITS;
        HexFormat.NumberHexFormat number = format.getNumber();
        if (number.getIsDigitsOnlyAndNoPadding()) {
            char[] cArr = {str.charAt((i2 >> 28) & 15), str.charAt((i2 >> 24) & 15), str.charAt((i2 >> 20) & 15), str.charAt((i2 >> 16) & 15), str.charAt((i2 >> 12) & 15), str.charAt((i2 >> 8) & 15), str.charAt((i2 >> 4) & 15), str.charAt(i2 & 15)};
            if (number.getRemoveLeadingZeros()) {
                return StringsKt__StringsJVMKt.concatToString$default(cArr, RangesKt.coerceAtMost(Integer.numberOfLeadingZeros(i2) >> 2, 7), 0, 2, null);
            }
            return StringsKt__StringsJVMKt.concatToString(cArr);
        }
        return toHexStringImpl(i2, number, str, 32);
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    public static final String toHexString(long j2, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        String str = format.getUpperCase() ? UPPER_CASE_HEX_DIGITS : LOWER_CASE_HEX_DIGITS;
        HexFormat.NumberHexFormat number = format.getNumber();
        if (number.getIsDigitsOnlyAndNoPadding()) {
            char[] cArr = {str.charAt((int) ((j2 >> 60) & 15)), str.charAt((int) ((j2 >> 56) & 15)), str.charAt((int) ((j2 >> 52) & 15)), str.charAt((int) ((j2 >> 48) & 15)), str.charAt((int) ((j2 >> 44) & 15)), str.charAt((int) ((j2 >> 40) & 15)), str.charAt((int) ((j2 >> 36) & 15)), str.charAt((int) ((j2 >> 32) & 15)), str.charAt((int) ((j2 >> 28) & 15)), str.charAt((int) ((j2 >> 24) & 15)), str.charAt((int) ((j2 >> 20) & 15)), str.charAt((int) ((j2 >> 16) & 15)), str.charAt((int) ((j2 >> 12) & 15)), str.charAt((int) ((j2 >> 8) & 15)), str.charAt((int) ((j2 >> 4) & 15)), str.charAt((int) (j2 & 15))};
            if (number.getRemoveLeadingZeros()) {
                return StringsKt__StringsJVMKt.concatToString$default(cArr, RangesKt.coerceAtMost(Long.numberOfLeadingZeros(j2) >> 2, 15), 0, 2, null);
            }
            return StringsKt__StringsJVMKt.concatToString(cArr);
        }
        return toHexStringImpl(j2, number, str, 64);
    }
}
