package dY;

import com.safedk.android.analytics.brandsafety.creatives.g;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;
import kotlin.UByte;
import okio.Buffer;

/* JADX INFO: renamed from: dY.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class C1956j {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final char[] f63523O = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f63524n;
    private final String nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f63525t;

    /* JADX INFO: renamed from: dY.j$n */
    public static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        String f63526n;
        String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f63527t = -1;

        private static String J2(String str) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.isEmpty()) {
                    return null;
                }
                if (t(lowerCase)) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private static boolean nr(String str, int i2, int i3, byte[] bArr, int i5) {
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
                    if (cCharAt < '0' || cCharAt > '9') {
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

        private static String rl(String str, int i2, int i3) {
            String strNr = C1956j.nr(str, i2, i3, false);
            if (!strNr.startsWith("[") || !strNr.endsWith("]")) {
                return J2(strNr);
            }
            InetAddress inetAddressO = O(strNr, 1, strNr.length() - 1);
            if (inetAddressO == null) {
                return null;
            }
            byte[] address = inetAddressO.getAddress();
            if (address.length == 16) {
                return xMQ(address);
            }
            throw new AssertionError();
        }

        private static boolean t(String str) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (cCharAt <= 31 || cCharAt >= 127 || " #%/:?@[\\]".indexOf(cCharAt) != -1) {
                    return true;
                }
            }
            return false;
        }

        private static String xMQ(byte[] bArr) {
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
                if (i9 > i7) {
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
                    buffer.writeHexadecimalUnsignedLong(((bArr[i3] & UByte.MAX_VALUE) << 8) | (bArr[i3 + 1] & UByte.MAX_VALUE));
                    i3 += 2;
                }
            }
            return buffer.readUtf8();
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x0079, code lost:
        
            if (r4 == 16) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x007b, code lost:
        
            if (r5 != (-1)) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x007d, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x007e, code lost:
        
            r12 = r4 - r5;
            java.lang.System.arraycopy(r1, r5, r1, 16 - r12, r12);
            java.util.Arrays.fill(r1, r5, (16 - r4) + r5, (byte) 0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x008e, code lost:
        
            return java.net.InetAddress.getByAddress(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0094, code lost:
        
            throw new java.lang.AssertionError();
         */
        /* JADX WARN: Removed duplicated region for block: B:31:0x004f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static InetAddress O(String str, int i2, int i3) {
            int i5;
            byte[] bArr = new byte[16];
            int i7 = 0;
            int i8 = -1;
            int i9 = -1;
            while (true) {
                if (i2 < i3) {
                    if (i7 != 16) {
                        int i10 = i2 + 2;
                        if (i10 <= i3 && str.regionMatches(i2, "::", 0, 2)) {
                            if (i8 == -1) {
                                i7 += 2;
                                i8 = i7;
                                if (i10 != i3) {
                                    i9 = i10;
                                    int i11 = 0;
                                    i2 = i9;
                                    while (i2 < i3) {
                                    }
                                    i5 = i2 - i9;
                                    if (i5 == 0) {
                                        break;
                                    }
                                    break;
                                    break;
                                }
                                break;
                            }
                            return null;
                        }
                        if (i7 != 0) {
                            if (str.regionMatches(i2, ":", 0, 1)) {
                                i2++;
                            } else {
                                if (!str.regionMatches(i2, ".", 0, 1) || !nr(str, i9, i3, bArr, i7 - 2)) {
                                    return null;
                                }
                                i7 += 2;
                            }
                        }
                        i9 = i2;
                        int i112 = 0;
                        i2 = i9;
                        while (i2 < i3) {
                            int iN = C1956j.n(str.charAt(i2));
                            if (iN == -1) {
                                break;
                            }
                            i112 = (i112 << 4) + iN;
                            i2++;
                        }
                        i5 = i2 - i9;
                        if (i5 == 0 || i5 > 4) {
                            break;
                        }
                        int i12 = i7 + 1;
                        bArr[i7] = (byte) ((i112 >>> 8) & 255);
                        i7 += 2;
                        bArr[i12] = (byte) (i112 & 255);
                    } else {
                        return null;
                    }
                } else {
                    break;
                }
            }
            return null;
        }

        public n KN(String str) {
            if (str == null) {
                throw new IllegalArgumentException("host == null");
            }
            String strRl = rl(str, 0, str.length());
            if (strRl != null) {
                this.rl = strRl;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        int Uo() {
            int i2 = this.f63527t;
            return i2 != -1 ? i2 : C1956j.rl(this.f63526n);
        }

        public n gh(String str) {
            if (str == null) {
                throw new IllegalArgumentException("scheme == null");
            }
            if (str.equalsIgnoreCase(g.f62375e)) {
                this.f63526n = g.f62375e;
                return this;
            }
            if (str.equalsIgnoreCase("https")) {
                this.f63526n = "https";
                return this;
            }
            throw new IllegalArgumentException("unexpected scheme: " + str);
        }

        public n mUb(int i2) {
            if (i2 > 0 && i2 <= 65535) {
                this.f63527t = i2;
                return this;
            }
            throw new IllegalArgumentException("unexpected port: " + i2);
        }

        public C1956j n() {
            if (this.f63526n == null) {
                throw new IllegalStateException("scheme == null");
            }
            if (this.rl != null) {
                return new C1956j(this);
            }
            throw new IllegalStateException("host == null");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f63526n);
            sb.append("://");
            if (this.rl.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.rl);
                sb.append(']');
            } else {
                sb.append(this.rl);
            }
            int iUo = Uo();
            if (iUo != C1956j.rl(this.f63526n)) {
                sb.append(':');
                sb.append(iUo);
            }
            return sb.toString();
        }
    }

    static String nr(String str, int i2, int i3, boolean z2) {
        for (int i5 = i2; i5 < i3; i5++) {
            char cCharAt = str.charAt(i5);
            if (cCharAt == '%' || (cCharAt == '+' && z2)) {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(str, i2, i5);
                O(buffer, str, i5, i3, z2);
                return buffer.readUtf8();
            }
        }
        return str.substring(i2, i3);
    }

    private C1956j(n nVar) {
        this.f63524n = nVar.f63526n;
        this.rl = nVar.rl;
        this.f63525t = nVar.Uo();
        this.nr = nVar.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void O(Buffer buffer, String str, int i2, int i3, boolean z2) {
        int i5;
        while (i2 < i3) {
            int iCodePointAt = str.codePointAt(i2);
            if (iCodePointAt == 37 && (i5 = i2 + 2) < i3) {
                int iN = n(str.charAt(i2 + 1));
                int iN2 = n(str.charAt(i5));
                if (iN != -1 && iN2 != -1) {
                    buffer.writeByte((iN << 4) + iN2);
                    i2 = i5;
                }
            } else if (iCodePointAt == 43 && z2) {
                buffer.writeByte(32);
            } else {
                buffer.writeUtf8CodePoint(iCodePointAt);
            }
            i2 += Character.charCount(iCodePointAt);
        }
    }

    static int n(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        if (c2 >= 'a' && c2 <= 'f') {
            return c2 - 'W';
        }
        if (c2 < 'A' || c2 > 'F') {
            return -1;
        }
        return c2 - '7';
    }

    public static int rl(String str) {
        if (str.equals(g.f62375e)) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public int J2() {
        return this.f63525t;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1956j) && ((C1956j) obj).nr.equals(this.nr);
    }

    public int hashCode() {
        return this.nr.hashCode();
    }

    public String t() {
        return this.rl;
    }

    public String toString() {
        return this.nr;
    }
}
