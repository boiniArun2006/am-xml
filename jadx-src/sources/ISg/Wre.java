package ISg;

import ScC.FuwU.pTYaLzzmJSGAPQ;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.safedk.android.analytics.brandsafety.creatives.g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Source;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
abstract class Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ByteString f4269n = ByteString.encodeUtf8(":");
    private static final Ml[] rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Map f4270t;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    static final class j {
        int J2;
        int KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Ml[] f4271O;
        int Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f4272n;
        private int nr;
        private final BufferedSource rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f4273t;

        j(int i2, Source source) {
            this(i2, i2, source);
        }

        private int nr(int i2) {
            int i3;
            int i5 = 0;
            if (i2 > 0) {
                int length = this.f4271O.length;
                while (true) {
                    length--;
                    i3 = this.J2;
                    if (length < i3 || i2 <= 0) {
                        break;
                    }
                    int i7 = this.f4271O[length].f4268t;
                    i2 -= i7;
                    this.KN -= i7;
                    this.Uo--;
                    i5++;
                }
                Ml[] mlArr = this.f4271O;
                System.arraycopy(mlArr, i3 + 1, mlArr, i3 + 1 + i5, this.Uo);
                this.J2 += i5;
            }
            return i5;
        }

        int ty(int i2, int i3) {
            int i5 = i2 & i3;
            if (i5 < i3) {
                return i5;
            }
            int i7 = 0;
            while (true) {
                int iMUb = mUb();
                if ((iMUb & 128) == 0) {
                    return i3 + (iMUb << i7);
                }
                i3 += (iMUb & 127) << i7;
                i7 += 7;
            }
        }

        j(int i2, int i3, Source source) {
            this.f4272n = new ArrayList();
            this.f4271O = new Ml[8];
            this.J2 = r0.length - 1;
            this.Uo = 0;
            this.KN = 0;
            this.f4273t = i2;
            this.nr = i3;
            this.rl = Okio.buffer(source);
        }

        private void KN(int i2, Ml ml) {
            this.f4272n.add(ml);
            int i3 = ml.f4268t;
            if (i2 != -1) {
                i3 -= this.f4271O[t(i2)].f4268t;
            }
            int i5 = this.nr;
            if (i3 > i5) {
                rl();
                return;
            }
            int iNr = nr((this.KN + i3) - i5);
            if (i2 == -1) {
                int i7 = this.Uo + 1;
                Ml[] mlArr = this.f4271O;
                if (i7 > mlArr.length) {
                    Ml[] mlArr2 = new Ml[mlArr.length * 2];
                    System.arraycopy(mlArr, 0, mlArr2, mlArr.length, mlArr.length);
                    this.J2 = this.f4271O.length - 1;
                    this.f4271O = mlArr2;
                }
                int i8 = this.J2;
                this.J2 = i8 - 1;
                this.f4271O[i8] = ml;
                this.Uo++;
            } else {
                this.f4271O[i2 + t(i2) + iNr] = ml;
            }
            this.KN += i3;
        }

        private int mUb() {
            return this.rl.readByte() & UByte.MAX_VALUE;
        }

        private void n() {
            int i2 = this.nr;
            int i3 = this.KN;
            if (i2 < i3) {
                if (i2 == 0) {
                    rl();
                } else {
                    nr(i3 - i2);
                }
            }
        }

        private void rl() {
            Arrays.fill(this.f4271O, (Object) null);
            this.J2 = this.f4271O.length - 1;
            this.Uo = 0;
            this.KN = 0;
        }

        private int t(int i2) {
            return this.J2 + 1 + i2;
        }

        private boolean xMQ(int i2) {
            return i2 >= 0 && i2 <= Wre.rl.length - 1;
        }

        public List O() {
            ArrayList arrayList = new ArrayList(this.f4272n);
            this.f4272n.clear();
            return arrayList;
        }

        void Uo(int i2) {
            this.f4273t = i2;
            this.nr = i2;
            n();
        }

        void qie() throws IOException {
            while (!this.rl.exhausted()) {
                byte b2 = this.rl.readByte();
                int i2 = b2 & UByte.MAX_VALUE;
                if (i2 == 128) {
                    throw new IOException("index == 0");
                }
                if ((b2 & ByteCompanionObject.MIN_VALUE) == 128) {
                    az(ty(i2, 127) - 1);
                } else if (i2 == 64) {
                    ck();
                } else if ((b2 & 64) == 64) {
                    HI(ty(i2, 63) - 1);
                } else if ((b2 & 32) == 32) {
                    int iTy = ty(i2, 31);
                    this.nr = iTy;
                    if (iTy < 0 || iTy > this.f4273t) {
                        throw new IOException("Invalid dynamic table size update " + this.nr);
                    }
                    n();
                } else if (i2 == 16 || i2 == 0) {
                    r();
                } else {
                    Ik(ty(i2, 15) - 1);
                }
            }
        }

        private void HI(int i2) {
            KN(-1, new Ml(J2(i2), gh()));
        }

        private void Ik(int i2) throws IOException {
            this.f4272n.add(new Ml(J2(i2), gh()));
        }

        private ByteString J2(int i2) throws IOException {
            if (xMQ(i2)) {
                return Wre.rl[i2].f4267n;
            }
            int iT = t(i2 - Wre.rl.length);
            if (iT >= 0) {
                Ml[] mlArr = this.f4271O;
                if (iT < mlArr.length) {
                    return mlArr[iT].f4267n;
                }
            }
            throw new IOException("Header index too large " + (i2 + 1));
        }

        private void az(int i2) throws IOException {
            if (xMQ(i2)) {
                this.f4272n.add(Wre.rl[i2]);
                return;
            }
            int iT = t(i2 - Wre.rl.length);
            if (iT >= 0) {
                Ml[] mlArr = this.f4271O;
                if (iT <= mlArr.length - 1) {
                    this.f4272n.add(mlArr[iT]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i2 + 1));
        }

        private void ck() {
            KN(-1, new Ml(Wre.O(gh()), gh()));
        }

        private void r() throws IOException {
            this.f4272n.add(new Ml(Wre.O(gh()), gh()));
        }

        ByteString gh() {
            boolean z2;
            int iMUb = mUb();
            if ((iMUb & 128) == 128) {
                z2 = true;
            } else {
                z2 = false;
            }
            int iTy = ty(iMUb, 127);
            if (z2) {
                return ByteString.of(fuX.J2().t(this.rl.readByteArray(iTy)));
            }
            return this.rl.readByteString(iTy);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    static final class n {
        private int J2;
        int KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private boolean f4274O;
        Ml[] Uo;
        private int mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Buffer f4275n;
        private int nr;
        private boolean rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f4276t;
        private int xMQ;

        n(Buffer buffer) {
            this(4096, false, buffer);
        }

        private int rl(int i2) {
            int i3;
            int i5 = 0;
            if (i2 > 0) {
                int length = this.Uo.length;
                while (true) {
                    length--;
                    i3 = this.xMQ;
                    if (length < i3 || i2 <= 0) {
                        break;
                    }
                    int i7 = this.Uo[length].f4268t;
                    i2 -= i7;
                    this.mUb -= i7;
                    this.KN--;
                    i5++;
                }
                Ml[] mlArr = this.Uo;
                System.arraycopy(mlArr, i3 + 1, mlArr, i3 + 1 + i5, this.KN);
                this.xMQ += i5;
            }
            return i5;
        }

        n(int i2, boolean z2, Buffer buffer) {
            this.nr = Integer.MAX_VALUE;
            this.Uo = new Ml[8];
            this.xMQ = r0.length - 1;
            this.f4276t = i2;
            this.J2 = i2;
            this.rl = z2;
            this.f4275n = buffer;
        }

        private void n() {
            Arrays.fill(this.Uo, (Object) null);
            this.xMQ = this.Uo.length - 1;
            this.KN = 0;
            this.mUb = 0;
        }

        private void t(Ml ml) {
            int i2 = ml.f4268t;
            int i3 = this.J2;
            if (i2 > i3) {
                n();
                return;
            }
            rl((this.mUb + i2) - i3);
            int i5 = this.KN + 1;
            Ml[] mlArr = this.Uo;
            if (i5 > mlArr.length) {
                Ml[] mlArr2 = new Ml[mlArr.length * 2];
                System.arraycopy(mlArr, 0, mlArr2, mlArr.length, mlArr.length);
                this.xMQ = this.Uo.length - 1;
                this.Uo = mlArr2;
            }
            int i7 = this.xMQ;
            this.xMQ = i7 - 1;
            this.Uo[i7] = ml;
            this.KN++;
            this.mUb += i2;
        }

        void J2(int i2, int i3, int i5) {
            if (i2 < i3) {
                this.f4275n.writeByte(i2 | i5);
                return;
            }
            this.f4275n.writeByte(i5 | i3);
            int i7 = i2 - i3;
            while (i7 >= 128) {
                this.f4275n.writeByte(128 | (i7 & 127));
                i7 >>>= 7;
            }
            this.f4275n.writeByte(i7);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        void O(List list) throws IOException {
            int length;
            int length2;
            if (this.f4274O) {
                int i2 = this.nr;
                if (i2 < this.J2) {
                    J2(i2, 31, 32);
                }
                this.f4274O = false;
                this.nr = Integer.MAX_VALUE;
                J2(this.J2, 31, 32);
            }
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Ml ml = (Ml) list.get(i3);
                ByteString asciiLowercase = ml.f4267n.toAsciiLowercase();
                ByteString byteString = ml.rl;
                Integer num = (Integer) Wre.f4270t.get(asciiLowercase);
                if (num != null) {
                    int iIntValue = num.intValue();
                    length2 = iIntValue + 1;
                    if (length2 < 2 || length2 > 7) {
                        length = length2;
                        length2 = -1;
                    } else if (Wre.rl[iIntValue].rl.equals(byteString)) {
                        length = length2;
                    } else if (Wre.rl[length2].rl.equals(byteString)) {
                        length2 = iIntValue + 2;
                        length = length2;
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length2 == -1) {
                    int i5 = this.xMQ;
                    while (true) {
                        i5++;
                        Ml[] mlArr = this.Uo;
                        if (i5 >= mlArr.length) {
                            break;
                        }
                        if (mlArr[i5].f4267n.equals(asciiLowercase)) {
                            if (this.Uo[i5].rl.equals(byteString)) {
                                length2 = Wre.rl.length + (i5 - this.xMQ);
                                break;
                            } else if (length == -1) {
                                length = (i5 - this.xMQ) + Wre.rl.length;
                            }
                        }
                    }
                }
                if (length2 != -1) {
                    J2(length2, 127, 128);
                } else if (length == -1) {
                    this.f4275n.writeByte(64);
                    nr(asciiLowercase);
                    nr(byteString);
                    t(ml);
                } else if (!asciiLowercase.startsWith(Wre.f4269n) || Ml.KN.equals(asciiLowercase)) {
                    J2(length, 63, 64);
                    nr(byteString);
                    t(ml);
                } else {
                    J2(length, 15, 0);
                    nr(byteString);
                }
            }
        }

        void nr(ByteString byteString) throws IOException {
            if (!this.rl || fuX.J2().O(byteString.toByteArray()) >= byteString.size()) {
                J2(byteString.size(), 127, 0);
                this.f4275n.write(byteString);
                return;
            }
            Buffer buffer = new Buffer();
            fuX.J2().nr(byteString.toByteArray(), buffer.outputStream());
            ByteString byteString2 = buffer.readByteString();
            J2(byteString2.size(), 127, 128);
            this.f4275n.write(byteString2);
        }
    }

    static {
        Ml ml = new Ml(Ml.KN, "");
        ByteString byteString = Ml.f4266O;
        Ml ml2 = new Ml(byteString, "GET");
        Ml ml3 = new Ml(byteString, "POST");
        ByteString byteString2 = Ml.J2;
        Ml ml4 = new Ml(byteString2, "/");
        Ml ml5 = new Ml(byteString2, "/index.html");
        ByteString byteString3 = Ml.Uo;
        Ml ml6 = new Ml(byteString3, g.f62375e);
        Ml ml7 = new Ml(byteString3, "https");
        ByteString byteString4 = Ml.nr;
        rl = new Ml[]{ml, ml2, ml3, ml4, ml5, ml6, ml7, new Ml(byteString4, "200"), new Ml(byteString4, "204"), new Ml(byteString4, "206"), new Ml(byteString4, "304"), new Ml(byteString4, "400"), new Ml(byteString4, "404"), new Ml(byteString4, "500"), new Ml("accept-charset", ""), new Ml("accept-encoding", "gzip, deflate"), new Ml("accept-language", ""), new Ml("accept-ranges", ""), new Ml("accept", ""), new Ml("access-control-allow-origin", ""), new Ml(InneractiveMediationDefs.KEY_AGE, ""), new Ml("allow", ""), new Ml("authorization", ""), new Ml("cache-control", ""), new Ml("content-disposition", ""), new Ml("content-encoding", ""), new Ml("content-language", ""), new Ml("content-length", ""), new Ml("content-location", ""), new Ml("content-range", ""), new Ml("content-type", ""), new Ml("cookie", ""), new Ml(pTYaLzzmJSGAPQ.NPknmotrEyK, ""), new Ml("etag", ""), new Ml("expect", ""), new Ml("expires", ""), new Ml("from", ""), new Ml("host", ""), new Ml("if-match", ""), new Ml("if-modified-since", ""), new Ml("if-none-match", ""), new Ml("if-range", ""), new Ml("if-unmodified-since", ""), new Ml("last-modified", ""), new Ml("link", ""), new Ml("location", ""), new Ml("max-forwards", ""), new Ml("proxy-authenticate", ""), new Ml("proxy-authorization", ""), new Ml("range", ""), new Ml("referer", ""), new Ml("refresh", ""), new Ml("retry-after", ""), new Ml("server", ""), new Ml("set-cookie", ""), new Ml("strict-transport-security", ""), new Ml("transfer-encoding", ""), new Ml("user-agent", ""), new Ml("vary", ""), new Ml("via", ""), new Ml("www-authenticate", "")};
        f4270t = J2();
    }

    private static Map J2() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(rl.length);
        int i2 = 0;
        while (true) {
            Ml[] mlArr = rl;
            if (i2 >= mlArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(mlArr[i2].f4267n)) {
                linkedHashMap.put(mlArr[i2].f4267n, Integer.valueOf(i2));
            }
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ByteString O(ByteString byteString) throws IOException {
        int size = byteString.size();
        for (int i2 = 0; i2 < size; i2++) {
            byte b2 = byteString.getByte(i2);
            if (b2 >= 65 && b2 <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + byteString.utf8());
            }
        }
        return byteString;
    }
}
