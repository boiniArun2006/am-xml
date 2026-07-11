package okhttp3.internal;

import com.safedk.android.internal.SafeDKWebAppInterface;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.Buffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0002\u001a\"\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\f\u0010\r\u001a\u00020\u0001*\u00020\u0003H\u0002\u001a\f\u0010\u000e\u001a\u0004\u0018\u00010\u0003*\u00020\u0003¨\u0006\u000f"}, d2 = {"decodeIpv4Suffix", "", "input", "", "pos", "", "limit", SafeDKWebAppInterface.f62924j, "", "addressOffset", "decodeIpv6", "Ljava/net/InetAddress;", "inet6AddressToAscii", "containsInvalidHostnameAsciiCodes", "toCanonicalHost", "okhttp"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class HostnamesKt {
    private static final boolean decodeIpv4Suffix(String str, int i2, int i3, byte[] bArr, int i5) {
        int i7 = i5;
        while (i2 < i3) {
            if (i7 == bArr.length) {
                return false;
            }
            if (i7 != i5) {
                if (str.charAt(i2) != '.') {
                    return false;
                }
                i2++;
            }
            int i8 = i2;
            int i9 = 0;
            while (i8 < i3) {
                char cCharAt = str.charAt(i8);
                if (Intrinsics.compare((int) cCharAt, 48) < 0 || Intrinsics.compare((int) cCharAt, 57) > 0) {
                    break;
                }
                if ((i9 == 0 && i2 != i8) || (i9 = ((i9 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i8++;
            }
            if (i8 - i2 == 0) {
                return false;
            }
            bArr[i7] = (byte) i9;
            i7++;
            i2 = i8;
        }
        return i7 == i5 + 4;
    }

    private static final String inet6AddressToAscii(byte[] bArr) {
        int i2 = -1;
        int i3 = 0;
        int i5 = 0;
        int i7 = 0;
        while (i5 < bArr.length) {
            int i8 = i5;
            while (i8 < 16 && bArr[i8] == 0 && bArr[i8 + 1] == 0) {
                i8 += 2;
            }
            int i9 = i8 - i5;
            if (i9 > i7 && i9 >= 4) {
                i2 = i5;
                i7 = i9;
            }
            i5 = i8 + 2;
        }
        Buffer buffer = new Buffer();
        while (i3 < bArr.length) {
            if (i3 == i2) {
                buffer.writeByte(58);
                i3 += i7;
                if (i3 == 16) {
                    buffer.writeByte(58);
                }
            } else {
                if (i3 > 0) {
                    buffer.writeByte(58);
                }
                buffer.writeHexadecimalUnsignedLong((Util.and(bArr[i3], 255) << 8) | Util.and(bArr[i3 + 1], 255));
                i3 += 2;
            }
        }
        return buffer.readUtf8();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0091, code lost:
    
        if (r11 == 16) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0093, code lost:
    
        if (r12 != (-1)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0095, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0096, code lost:
    
        r0 = r11 - r12;
        java.lang.System.arraycopy(r8, r12, r8, 16 - r0, r0);
        java.util.Arrays.fill(r8, r12, (16 - r11) + r12, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a6, code lost:
    
        return java.net.InetAddress.getByAddress(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final InetAddress decodeIpv6(String str, int i2, int i3) {
        String str2;
        int i5;
        byte[] bArr = new byte[16];
        int i7 = i2;
        int i8 = 0;
        int i9 = -1;
        int i10 = -1;
        while (true) {
            if (i7 < i3) {
                if (i8 != 16) {
                    int i11 = i7 + 2;
                    if (i11 <= i3 && StringsKt.startsWith$default(str, "::", i7, false, 4, (Object) null)) {
                        if (i9 == -1) {
                            i8 += 2;
                            if (i11 != i3) {
                                str2 = str;
                                i9 = i8;
                                i10 = i11;
                                int i12 = 0;
                                i7 = i10;
                                while (i7 < i3) {
                                }
                                i5 = i7 - i10;
                                if (i5 == 0) {
                                    break;
                                }
                                break;
                                break;
                            }
                            i9 = i8;
                            break;
                        }
                        return null;
                    }
                    if (i8 != 0) {
                        if (StringsKt.startsWith$default(str, ":", i7, false, 4, (Object) null)) {
                            i7++;
                        } else {
                            if (!StringsKt.startsWith$default(str, ".", i7, false, 4, (Object) null) || !decodeIpv4Suffix(str, i10, i3, bArr, i8 - 2)) {
                                return null;
                            }
                            i8 += 2;
                        }
                    }
                    str2 = str;
                    i10 = i7;
                    int i122 = 0;
                    i7 = i10;
                    while (i7 < i3) {
                        int hexDigit = Util.parseHexDigit(str2.charAt(i7));
                        if (hexDigit == -1) {
                            break;
                        }
                        i122 = (i122 << 4) + hexDigit;
                        i7++;
                    }
                    i5 = i7 - i10;
                    if (i5 == 0 || i5 > 4) {
                        break;
                    }
                    int i13 = i8 + 1;
                    bArr[i8] = (byte) ((i122 >>> 8) & 255);
                    i8 += 2;
                    bArr[i13] = (byte) (i122 & 255);
                } else {
                    return null;
                }
            } else {
                break;
            }
        }
        return null;
    }

    public static final String toCanonicalHost(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (!StringsKt.contains$default((CharSequence) str, (CharSequence) ":", false, 2, (Object) null)) {
            try {
                String ascii = IDN.toASCII(str);
                Intrinsics.checkNotNullExpressionValue(ascii, "toASCII(host)");
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase = ascii.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                if (containsInvalidHostnameAsciiCodes(lowerCase)) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressDecodeIpv6 = (StringsKt.startsWith$default(str, "[", false, 2, (Object) null) && StringsKt.endsWith$default(str, "]", false, 2, (Object) null)) ? decodeIpv6(str, 1, str.length() - 1) : decodeIpv6(str, 0, str.length());
        if (inetAddressDecodeIpv6 == null) {
            return null;
        }
        byte[] address = inetAddressDecodeIpv6.getAddress();
        if (address.length == 16) {
            Intrinsics.checkNotNullExpressionValue(address, "address");
            return inet6AddressToAscii(address);
        }
        if (address.length == 4) {
            return inetAddressDecodeIpv6.getHostAddress();
        }
        throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
    }

    private static final boolean containsInvalidHostnameAsciiCodes(String str) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (Intrinsics.compare((int) cCharAt, 31) <= 0 || Intrinsics.compare((int) cCharAt, 127) >= 0 || StringsKt.indexOf$default((CharSequence) " #%/:?@[\\]", cCharAt, 0, false, 6, (Object) null) != -1) {
                return true;
            }
        }
        return false;
    }
}
