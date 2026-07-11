package androidx.exifinterface.media;

import aT.dE.JLZo;
import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.browser.trusted.sharing.KcI.qUrazMnwDskFs;
import androidx.exifinterface.media.ExifInterfaceUtils;
import com.google.android.exoplayer2.C;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.l;
import com.vungle.ads.internal.protos.Sdk;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class ExifInterface {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final ExifTag[] f38417B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final byte[] f38418C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final ExifTag[] f38419D;

    /* JADX INFO: renamed from: G7, reason: collision with root package name */
    private static final Pattern f38422G7;

    /* JADX INFO: renamed from: GR, reason: collision with root package name */
    private static final ExifTag f38423GR;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final ExifTag[] f38424I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final ExifTag[] f38425J;
    private static final Pattern Mx;
    private static final ExifTag[] Nxk;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private static final ExifTag[] f38432Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ExifTag[] f38433a;
    private static final ExifTag[] dR0;
    private static final SimpleDateFormat eF;
    private static final Set eTf;
    private static final Pattern eWT;
    private static final Pattern fcU;
    private static final HashMap[] ijL;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final ExifTag[] f38436k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final HashMap[] f38437m;
    static final byte[] ofS;
    private static final SimpleDateFormat p5;
    private static final Charset pJg;
    private static final ExifTag[] piY;
    private static final HashMap xg;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static final ExifTag[][] f38439z;
    private int HI;
    private int Ik;
    private final HashMap[] J2;
    private ByteOrder KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f38440O;
    private Set Uo;
    private boolean XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private ExifAttribute f38441Z;
    private int az;
    private int ck;
    private boolean gh;
    private boolean mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f38442n;
    private int nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f38443o;
    private int qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f38444r;
    private FileDescriptor rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private AssetManager.AssetInputStream f38445t;
    private byte[] ty;
    private boolean xMQ;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final boolean f38428S = Log.isLoggable("ExifInterface", 3);
    private static final List WPU = Arrays.asList(1, 6, 3, 8);
    private static final List aYN = Arrays.asList(2, 7, 4, 5);
    public static final int[] ViF = {8, 8, 8};
    public static final int[] nY = {4};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f38435g = {8};
    static final byte[] te = {-1, -40, -1};
    private static final byte[] iF = {102, 116, 121, 112};
    private static final byte[] fD = {109, 105, 102, 49};
    private static final byte[] E2 = {104, 101, 105, 99};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f38434e = {97, 118, 105, 102};

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private static final byte[] f38431X = {97, 118, 105, 115};

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private static final byte[] f38429T = {79, 76, 89, 77, 80, 0};

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final byte[] f38427N = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    private static final byte[] nHg = {-119, 80, 78, 71, 13, 10, 26, 10};
    static final byte[] s7N = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
    private static final byte[] wTp = {82, 73, 70, 70};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final byte[] f38438v = {87, 69, 66, 80};
    private static final byte[] rV9 = {69, 88, 73, 70};
    private static final byte[] bzg = {-99, 1, 42};
    private static final byte[] Xw = "VP8X".getBytes(Charset.defaultCharset());
    private static final byte[] jB = "VP8L".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static final byte[] f38430U = "VP8 ".getBytes(Charset.defaultCharset());
    private static final byte[] P5 = "ANIM".getBytes(Charset.defaultCharset());
    private static final byte[] M7 = "ANMF".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final String[] f38420E = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final int[] f38426M = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    private static final byte[] f38421FX = {65, 83, 67, 73, 73, 0, 0, 0};

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    private static class ByteOrderedDataInputStream extends InputStream implements DataInput {
        private byte[] J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private ByteOrder f38449O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        protected final DataInputStream f38450n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f38451r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        protected int f38452t;

        ByteOrderedDataInputStream(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
            this.f38451r = bArr.length;
        }

        public void jB(int i2) throws IOException {
            int i3 = 0;
            while (i3 < i2) {
                int i5 = i2 - i3;
                int iSkip = (int) this.f38450n.skip(i5);
                if (iSkip <= 0) {
                    if (this.J2 == null) {
                        this.J2 = new byte[8192];
                    }
                    iSkip = this.f38450n.read(this.J2, 0, Math.min(8192, i5));
                    if (iSkip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i2 + " bytes.");
                    }
                }
                i3 += iSkip;
            }
            this.f38452t += i3;
        }

        @Override // java.io.InputStream
        public int read() {
            this.f38452t++;
            return this.f38450n.read();
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i2, int i3) throws IOException {
            this.f38452t += i3;
            this.f38450n.readFully(bArr, i2, i3);
        }

        public void T(ByteOrder byteOrder) {
            this.f38449O = byteOrder;
        }

        public byte[] Uo() throws IOException {
            byte[] bArrCopyOf = new byte[1024];
            int i2 = 0;
            while (true) {
                if (i2 == bArrCopyOf.length) {
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
                }
                int i3 = this.f38450n.read(bArrCopyOf, i2, bArrCopyOf.length - i2);
                if (i3 == -1) {
                    return Arrays.copyOf(bArrCopyOf, i2);
                }
                i2 += i3;
                this.f38452t += i3;
            }
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f38450n.available();
        }

        @Override // java.io.InputStream
        public void mark(int i2) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        public int n() {
            return this.f38451r;
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f38452t++;
            return this.f38450n.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            this.f38452t++;
            int i2 = this.f38450n.read();
            if (i2 >= 0) {
                return (byte) i2;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f38452t += 2;
            return this.f38450n.readChar();
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            this.f38452t += 4;
            int i2 = this.f38450n.read();
            int i3 = this.f38450n.read();
            int i5 = this.f38450n.read();
            int i7 = this.f38450n.read();
            if ((i2 | i3 | i5 | i7) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f38449O;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i7 << 24) + (i5 << 16) + (i3 << 8) + i2;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i2 << 24) + (i3 << 16) + (i5 << 8) + i7;
            }
            throw new IOException("Invalid byte order: " + this.f38449O);
        }

        @Override // java.io.DataInput
        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            this.f38452t += 8;
            int i2 = this.f38450n.read();
            int i3 = this.f38450n.read();
            int i5 = this.f38450n.read();
            int i7 = this.f38450n.read();
            int i8 = this.f38450n.read();
            int i9 = this.f38450n.read();
            int i10 = this.f38450n.read();
            int i11 = this.f38450n.read();
            if ((i2 | i3 | i5 | i7 | i8 | i9 | i10 | i11) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f38449O;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (((long) i11) << 56) + (((long) i10) << 48) + (((long) i9) << 40) + (((long) i8) << 32) + (((long) i7) << 24) + (((long) i5) << 16) + (((long) i3) << 8) + ((long) i2);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (((long) i2) << 56) + (((long) i3) << 48) + (((long) i5) << 40) + (((long) i7) << 32) + (((long) i8) << 24) + (((long) i9) << 16) + (((long) i10) << 8) + ((long) i11);
            }
            throw new IOException("Invalid byte order: " + this.f38449O);
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            this.f38452t += 2;
            int i2 = this.f38450n.read();
            int i3 = this.f38450n.read();
            if ((i2 | i3) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f38449O;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (short) ((i3 << 8) + i2);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (short) ((i2 << 8) + i3);
            }
            throw new IOException("Invalid byte order: " + this.f38449O);
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f38452t += 2;
            return this.f38450n.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f38452t++;
            return this.f38450n.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            this.f38452t += 2;
            int i2 = this.f38450n.read();
            int i3 = this.f38450n.read();
            if ((i2 | i3) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f38449O;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i3 << 8) + i2;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i2 << 8) + i3;
            }
            throw new IOException("Invalid byte order: " + this.f38449O);
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        public int rl() {
            return this.f38452t;
        }

        @Override // java.io.DataInput
        public int skipBytes(int i2) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        ByteOrderedDataInputStream(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        public long Z() {
            return ((long) readInt()) & 4294967295L;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) throws IOException {
            int i5 = this.f38450n.read(bArr, i2, i3);
            this.f38452t += i5;
            return i5;
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            this.f38452t += bArr.length;
            this.f38450n.readFully(bArr);
        }

        ByteOrderedDataInputStream(InputStream inputStream, ByteOrder byteOrder) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f38450n = dataInputStream;
            dataInputStream.mark(0);
            this.f38452t = 0;
            this.f38449O = byteOrder;
            this.f38451r = inputStream instanceof ByteOrderedDataInputStream ? ((ByteOrderedDataInputStream) inputStream).n() : -1;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    private static class ByteOrderedDataOutputStream extends FilterOutputStream {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final DataOutputStream f38453n;

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f38453n.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i2, int i3) throws IOException {
            this.f38453n.write(bArr, i2, i3);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    private static class ExifAttribute {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f38454n;
        public final byte[] nr;
        public final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final long f38455t;

        ExifAttribute(int i2, int i3, byte[] bArr) {
            this(i2, i3, -1L, bArr);
        }

        public static ExifAttribute rl(long j2, ByteOrder byteOrder) {
            return t(new long[]{j2}, byteOrder);
        }

        /* JADX WARN: Not initialized variable reg: 5, insn: 0x0032: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:51), block:B:17:0x0031 */
        /* JADX WARN: Removed duplicated region for block: B:172:0x01a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:193:? A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        Object gh(ByteOrder byteOrder) throws Throwable {
            Throwable th;
            IOException iOException;
            ByteOrderedDataInputStream byteOrderedDataInputStream;
            InputStream inputStream;
            byte b2;
            byte b4;
            int length = 0;
            InputStream inputStream2 = null;
            try {
                try {
                    byteOrderedDataInputStream = new ByteOrderedDataInputStream(this.nr);
                    try {
                        byteOrderedDataInputStream.T(byteOrder);
                        switch (this.f38454n) {
                            case 1:
                            case 6:
                                byte[] bArr = this.nr;
                                if (bArr.length != 1 || (b2 = bArr[0]) < 0 || b2 > 1) {
                                    String str = new String(bArr, ExifInterface.pJg);
                                    try {
                                        byteOrderedDataInputStream.close();
                                        return str;
                                    } catch (IOException e2) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                                        return str;
                                    }
                                }
                                String str2 = new String(new char[]{(char) (b2 + 48)});
                                try {
                                    byteOrderedDataInputStream.close();
                                    return str2;
                                } catch (IOException e3) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                                    return str2;
                                }
                            case 2:
                            case 7:
                                if (this.rl >= ExifInterface.f38421FX.length) {
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 >= ExifInterface.f38421FX.length) {
                                            length = ExifInterface.f38421FX.length;
                                        } else if (this.nr[i2] == ExifInterface.f38421FX[i2]) {
                                            i2++;
                                        }
                                    }
                                }
                                StringBuilder sb = new StringBuilder();
                                while (length < this.rl && (b4 = this.nr[length]) != 0) {
                                    if (b4 >= 32) {
                                        sb.append((char) b4);
                                    } else {
                                        sb.append('?');
                                    }
                                    length++;
                                }
                                String string = sb.toString();
                                try {
                                    byteOrderedDataInputStream.close();
                                    return string;
                                } catch (IOException e4) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                                    return string;
                                }
                            case 3:
                                int[] iArr = new int[this.rl];
                                while (length < this.rl) {
                                    iArr[length] = byteOrderedDataInputStream.readUnsignedShort();
                                    length++;
                                }
                                try {
                                    byteOrderedDataInputStream.close();
                                    return iArr;
                                } catch (IOException e5) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e5);
                                    return iArr;
                                }
                            case 4:
                                long[] jArr = new long[this.rl];
                                while (length < this.rl) {
                                    jArr[length] = byteOrderedDataInputStream.Z();
                                    length++;
                                }
                                try {
                                    byteOrderedDataInputStream.close();
                                    return jArr;
                                } catch (IOException e6) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                                    return jArr;
                                }
                            case 5:
                                Rational[] rationalArr = new Rational[this.rl];
                                while (length < this.rl) {
                                    rationalArr[length] = new Rational(byteOrderedDataInputStream.Z(), byteOrderedDataInputStream.Z());
                                    length++;
                                }
                                try {
                                    byteOrderedDataInputStream.close();
                                    return rationalArr;
                                } catch (IOException e7) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e7);
                                    return rationalArr;
                                }
                            case 8:
                                int[] iArr2 = new int[this.rl];
                                while (length < this.rl) {
                                    iArr2[length] = byteOrderedDataInputStream.readShort();
                                    length++;
                                }
                                try {
                                    byteOrderedDataInputStream.close();
                                    return iArr2;
                                } catch (IOException e8) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e8);
                                    return iArr2;
                                }
                            case 9:
                                int[] iArr3 = new int[this.rl];
                                while (length < this.rl) {
                                    iArr3[length] = byteOrderedDataInputStream.readInt();
                                    length++;
                                }
                                try {
                                    byteOrderedDataInputStream.close();
                                    return iArr3;
                                } catch (IOException e9) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e9);
                                    return iArr3;
                                }
                            case 10:
                                Rational[] rationalArr2 = new Rational[this.rl];
                                while (length < this.rl) {
                                    rationalArr2[length] = new Rational(byteOrderedDataInputStream.readInt(), byteOrderedDataInputStream.readInt());
                                    length++;
                                }
                                try {
                                    byteOrderedDataInputStream.close();
                                    return rationalArr2;
                                } catch (IOException e10) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                                    return rationalArr2;
                                }
                            case 11:
                                double[] dArr = new double[this.rl];
                                while (length < this.rl) {
                                    dArr[length] = byteOrderedDataInputStream.readFloat();
                                    length++;
                                }
                                try {
                                    byteOrderedDataInputStream.close();
                                    return dArr;
                                } catch (IOException e11) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                                    return dArr;
                                }
                            case 12:
                                double[] dArr2 = new double[this.rl];
                                while (length < this.rl) {
                                    dArr2[length] = byteOrderedDataInputStream.readDouble();
                                    length++;
                                }
                                try {
                                    byteOrderedDataInputStream.close();
                                    return dArr2;
                                } catch (IOException e12) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                                    return dArr2;
                                }
                            default:
                                try {
                                    byteOrderedDataInputStream.close();
                                    return null;
                                } catch (IOException e13) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e13);
                                    return null;
                                }
                        }
                    } catch (IOException e14) {
                        iOException = e14;
                        Log.w("ExifInterface", "IOException occurred during reading a value", iOException);
                        if (byteOrderedDataInputStream != null) {
                            try {
                                byteOrderedDataInputStream.close();
                            } catch (IOException e15) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                            }
                        }
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        throw th;
                    }
                    try {
                        inputStream2.close();
                        throw th;
                    } catch (IOException e16) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e16);
                        throw th;
                    }
                }
            } catch (IOException e17) {
                iOException = e17;
                byteOrderedDataInputStream = null;
            } catch (Throwable th3) {
                th = th3;
                if (inputStream2 != null) {
                }
            }
        }

        ExifAttribute(int i2, int i3, long j2, byte[] bArr) {
            this.f38454n = i2;
            this.rl = i3;
            this.f38455t = j2;
            this.nr = bArr;
        }

        public static ExifAttribute n(String str) {
            byte[] bytes = (str + (char) 0).getBytes(ExifInterface.pJg);
            return new ExifAttribute(2, bytes.length, bytes);
        }

        public String toString() {
            return "(" + ExifInterface.f38420E[this.f38454n] + ", data length:" + this.nr.length + ")";
        }

        public static ExifAttribute J2(int i2, ByteOrder byteOrder) {
            return Uo(new int[]{i2}, byteOrder);
        }

        public static ExifAttribute O(Rational[] rationalArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ExifInterface.f38426M[5] * rationalArr.length]);
            byteBufferWrap.order(byteOrder);
            for (Rational rational : rationalArr) {
                byteBufferWrap.putInt((int) rational.f38458n);
                byteBufferWrap.putInt((int) rational.rl);
            }
            return new ExifAttribute(5, rationalArr.length, byteBufferWrap.array());
        }

        public static ExifAttribute Uo(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ExifInterface.f38426M[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i2 : iArr) {
                byteBufferWrap.putShort((short) i2);
            }
            return new ExifAttribute(3, iArr.length, byteBufferWrap.array());
        }

        public static ExifAttribute nr(Rational rational, ByteOrder byteOrder) {
            return O(new Rational[]{rational}, byteOrder);
        }

        public static ExifAttribute t(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ExifInterface.f38426M[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j2 : jArr) {
                byteBufferWrap.putInt((int) j2);
            }
            return new ExifAttribute(4, jArr.length, byteBufferWrap.array());
        }

        public double KN(ByteOrder byteOrder) throws Throwable {
            Object objGh = gh(byteOrder);
            if (objGh != null) {
                if (objGh instanceof String) {
                    return Double.parseDouble((String) objGh);
                }
                if (objGh instanceof long[]) {
                    if (((long[]) objGh).length == 1) {
                        return r5[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (objGh instanceof int[]) {
                    if (((int[]) objGh).length == 1) {
                        return r5[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (objGh instanceof double[]) {
                    double[] dArr = (double[]) objGh;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (objGh instanceof Rational[]) {
                    Rational[] rationalArr = (Rational[]) objGh;
                    if (rationalArr.length == 1) {
                        return rationalArr[0].n();
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                throw new NumberFormatException("Couldn't find a double value");
            }
            throw new NumberFormatException("NULL can't be converted to a double value");
        }

        public String mUb(ByteOrder byteOrder) throws Throwable {
            Object objGh = gh(byteOrder);
            if (objGh == null) {
                return null;
            }
            if (objGh instanceof String) {
                return (String) objGh;
            }
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            if (objGh instanceof long[]) {
                long[] jArr = (long[]) objGh;
                while (i2 < jArr.length) {
                    sb.append(jArr[i2]);
                    i2++;
                    if (i2 != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objGh instanceof int[]) {
                int[] iArr = (int[]) objGh;
                while (i2 < iArr.length) {
                    sb.append(iArr[i2]);
                    i2++;
                    if (i2 != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objGh instanceof double[]) {
                double[] dArr = (double[]) objGh;
                while (i2 < dArr.length) {
                    sb.append(dArr[i2]);
                    i2++;
                    if (i2 != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (!(objGh instanceof Rational[])) {
                return null;
            }
            Rational[] rationalArr = (Rational[]) objGh;
            while (i2 < rationalArr.length) {
                sb.append(rationalArr[i2].f38458n);
                sb.append('/');
                sb.append(rationalArr[i2].rl);
                i2++;
                if (i2 != rationalArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        public int xMQ(ByteOrder byteOrder) throws Throwable {
            Object objGh = gh(byteOrder);
            if (objGh != null) {
                if (objGh instanceof String) {
                    return Integer.parseInt((String) objGh);
                }
                if (objGh instanceof long[]) {
                    long[] jArr = (long[]) objGh;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (objGh instanceof int[]) {
                    int[] iArr = (int[]) objGh;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                throw new NumberFormatException("Couldn't find a integer value");
            }
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ExifStreamType {
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    private static class ExifTag {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f38456n;
        public final int nr;
        public final String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f38457t;

        ExifTag(String str, int i2, int i3) {
            this.rl = str;
            this.f38456n = i2;
            this.f38457t = i3;
            this.nr = -1;
        }

        boolean n(int i2) {
            int i3;
            int i5 = this.f38457t;
            if (i5 == 7 || i2 == 7 || i5 == i2 || (i3 = this.nr) == i2) {
                return true;
            }
            if ((i5 == 4 || i3 == 4) && i2 == 3) {
                return true;
            }
            if ((i5 == 9 || i3 == 9) && i2 == 8) {
                return true;
            }
            return (i5 == 12 || i3 == 12) && i2 == 11;
        }

        ExifTag(String str, int i2, int i3, int i5) {
            this.rl = str;
            this.f38456n = i2;
            this.f38457t = i3;
            this.nr = i5;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface IfdType {
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    @VisibleForTesting
    static class Rational {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final long f38458n;
        public final long rl;

        private Rational(long j2, long j3) {
            if (j3 == 0) {
                this.f38458n = 0L;
                this.rl = 1L;
            } else {
                this.f38458n = j2;
                this.rl = j3;
            }
        }

        public double n() {
            return this.f38458n / this.rl;
        }

        public String toString() {
            return this.f38458n + "/" + this.rl;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    private static class SeekableByteOrderedDataInputStream extends ByteOrderedDataInputStream {
        SeekableByteOrderedDataInputStream(byte[] bArr) {
            super(bArr);
            this.f38450n.mark(Integer.MAX_VALUE);
        }

        public void U(long j2) throws IOException {
            int i2 = this.f38452t;
            if (i2 > j2) {
                this.f38452t = 0;
                this.f38450n.reset();
            } else {
                j2 -= (long) i2;
            }
            jB((int) j2);
        }

        SeekableByteOrderedDataInputStream(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f38450n.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    static {
        ExifTag[] exifTagArr = {new ExifTag("NewSubfileType", 254, 4), new ExifTag("SubfileType", 255, 4), new ExifTag("ImageWidth", 256, 3, 4), new ExifTag("ImageLength", 257, 3, 4), new ExifTag("BitsPerSample", 258, 3), new ExifTag("Compression", 259, 3), new ExifTag("PhotometricInterpretation", 262, 3), new ExifTag("ImageDescription", 270, 2), new ExifTag("Make", 271, 2), new ExifTag("Model", 272, 2), new ExifTag("StripOffsets", 273, 3, 4), new ExifTag("Orientation", 274, 3), new ExifTag("SamplesPerPixel", 277, 3), new ExifTag("RowsPerStrip", 278, 3, 4), new ExifTag("StripByteCounts", 279, 3, 4), new ExifTag("XResolution", 282, 5), new ExifTag("YResolution", 283, 5), new ExifTag("PlanarConfiguration", 284, 3), new ExifTag("ResolutionUnit", l.f62284f, 3), new ExifTag("TransferFunction", Sdk.SDKError.Reason.MRAID_ERROR_VALUE, 3), new ExifTag("Software", Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE, 2), new ExifTag("DateTime", 306, 2), new ExifTag("Artist", Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE, 2), new ExifTag("WhitePoint", Sdk.SDKError.Reason.AD_CLOSED_MISSING_HEARTBEAT_VALUE, 5), new ExifTag("PrimaryChromaticities", Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE, 5), new ExifTag("SubIFDPointer", 330, 4), new ExifTag("JPEGInterchangeFormat", 513, 4), new ExifTag("JPEGInterchangeFormatLength", 514, 4), new ExifTag("YCbCrCoefficients", 529, 5), new ExifTag("YCbCrSubSampling", 530, 3), new ExifTag("YCbCrPositioning", 531, 3), new ExifTag("ReferenceBlackWhite", 532, 5), new ExifTag("Copyright", 33432, 2), new ExifTag("ExifIFDPointer", 34665, 4), new ExifTag("GPSInfoIFDPointer", 34853, 4), new ExifTag("SensorTopBorder", 4, 4), new ExifTag("SensorLeftBorder", 5, 4), new ExifTag("SensorBottomBorder", 6, 4), new ExifTag("SensorRightBorder", 7, 4), new ExifTag("ISO", 23, 3), new ExifTag("JpgFromRaw", 46, 7), new ExifTag("Xmp", 700, 1)};
        f38417B = exifTagArr;
        ExifTag[] exifTagArr2 = {new ExifTag("ExposureTime", 33434, 5), new ExifTag("FNumber", 33437, 5), new ExifTag("ExposureProgram", 34850, 3), new ExifTag("SpectralSensitivity", 34852, 2), new ExifTag("PhotographicSensitivity", 34855, 3), new ExifTag("OECF", 34856, 7), new ExifTag("SensitivityType", 34864, 3), new ExifTag("StandardOutputSensitivity", 34865, 4), new ExifTag("RecommendedExposureIndex", 34866, 4), new ExifTag("ISOSpeed", 34867, 4), new ExifTag("ISOSpeedLatitudeyyy", 34868, 4), new ExifTag("ISOSpeedLatitudezzz", 34869, 4), new ExifTag("ExifVersion", 36864, 2), new ExifTag("DateTimeOriginal", 36867, 2), new ExifTag("DateTimeDigitized", 36868, 2), new ExifTag("OffsetTime", 36880, 2), new ExifTag("OffsetTimeOriginal", 36881, 2), new ExifTag("OffsetTimeDigitized", 36882, 2), new ExifTag("ComponentsConfiguration", 37121, 7), new ExifTag("CompressedBitsPerPixel", 37122, 5), new ExifTag("ShutterSpeedValue", 37377, 10), new ExifTag("ApertureValue", 37378, 5), new ExifTag("BrightnessValue", 37379, 10), new ExifTag("ExposureBiasValue", 37380, 10), new ExifTag("MaxApertureValue", 37381, 5), new ExifTag("SubjectDistance", 37382, 5), new ExifTag("MeteringMode", 37383, 3), new ExifTag("LightSource", 37384, 3), new ExifTag("Flash", 37385, 3), new ExifTag("FocalLength", 37386, 5), new ExifTag("SubjectArea", 37396, 3), new ExifTag("MakerNote", 37500, 7), new ExifTag("UserComment", 37510, 7), new ExifTag("SubSecTime", 37520, 2), new ExifTag("SubSecTimeOriginal", 37521, 2), new ExifTag("SubSecTimeDigitized", 37522, 2), new ExifTag("FlashpixVersion", 40960, 7), new ExifTag("ColorSpace", 40961, 3), new ExifTag("PixelXDimension", 40962, 3, 4), new ExifTag("PixelYDimension", 40963, 3, 4), new ExifTag("RelatedSoundFile", 40964, 2), new ExifTag("InteroperabilityIFDPointer", 40965, 4), new ExifTag("FlashEnergy", 41483, 5), new ExifTag("SpatialFrequencyResponse", 41484, 7), new ExifTag("FocalPlaneXResolution", 41486, 5), new ExifTag("FocalPlaneYResolution", 41487, 5), new ExifTag("FocalPlaneResolutionUnit", 41488, 3), new ExifTag("SubjectLocation", 41492, 3), new ExifTag("ExposureIndex", 41493, 5), new ExifTag("SensingMethod", 41495, 3), new ExifTag("FileSource", 41728, 7), new ExifTag("SceneType", 41729, 7), new ExifTag("CFAPattern", 41730, 7), new ExifTag("CustomRendered", 41985, 3), new ExifTag("ExposureMode", 41986, 3), new ExifTag("WhiteBalance", 41987, 3), new ExifTag("DigitalZoomRatio", 41988, 5), new ExifTag("FocalLengthIn35mmFilm", 41989, 3), new ExifTag("SceneCaptureType", 41990, 3), new ExifTag("GainControl", 41991, 3), new ExifTag("Contrast", 41992, 3), new ExifTag("Saturation", 41993, 3), new ExifTag("Sharpness", 41994, 3), new ExifTag("DeviceSettingDescription", 41995, 7), new ExifTag("SubjectDistanceRange", 41996, 3), new ExifTag("ImageUniqueID", 42016, 2), new ExifTag("CameraOwnerName", 42032, 2), new ExifTag("BodySerialNumber", 42033, 2), new ExifTag("LensSpecification", 42034, 5), new ExifTag("LensMake", 42035, 2), new ExifTag("LensModel", 42036, 2), new ExifTag("Gamma", 42240, 5), new ExifTag("DNGVersion", 50706, 1), new ExifTag("DefaultCropSize", 50720, 3, 4)};
        f38425J = exifTagArr2;
        ExifTag[] exifTagArr3 = {new ExifTag("GPSVersionID", 0, 1), new ExifTag("GPSLatitudeRef", 1, 2), new ExifTag("GPSLatitude", 2, 5, 10), new ExifTag("GPSLongitudeRef", 3, 2), new ExifTag("GPSLongitude", 4, 5, 10), new ExifTag("GPSAltitudeRef", 5, 1), new ExifTag("GPSAltitude", 6, 5), new ExifTag("GPSTimeStamp", 7, 5), new ExifTag("GPSSatellites", 8, 2), new ExifTag("GPSStatus", 9, 2), new ExifTag("GPSMeasureMode", 10, 2), new ExifTag("GPSDOP", 11, 5), new ExifTag("GPSSpeedRef", 12, 2), new ExifTag("GPSSpeed", 13, 5), new ExifTag("GPSTrackRef", 14, 2), new ExifTag("GPSTrack", 15, 5), new ExifTag("GPSImgDirectionRef", 16, 2), new ExifTag("GPSImgDirection", 17, 5), new ExifTag("GPSMapDatum", 18, 2), new ExifTag("GPSDestLatitudeRef", 19, 2), new ExifTag("GPSDestLatitude", 20, 5), new ExifTag("GPSDestLongitudeRef", 21, 2), new ExifTag(JLZo.wjiPoGqTCj, 22, 5), new ExifTag("GPSDestBearingRef", 23, 2), new ExifTag("GPSDestBearing", 24, 5), new ExifTag("GPSDestDistanceRef", 25, 2), new ExifTag("GPSDestDistance", 26, 5), new ExifTag("GPSProcessingMethod", 27, 7), new ExifTag("GPSAreaInformation", 28, 7), new ExifTag("GPSDateStamp", 29, 2), new ExifTag("GPSDifferential", 30, 3), new ExifTag("GPSHPositioningError", 31, 5)};
        f38419D = exifTagArr3;
        ExifTag[] exifTagArr4 = {new ExifTag("InteroperabilityIndex", 1, 2)};
        f38433a = exifTagArr4;
        ExifTag[] exifTagArr5 = {new ExifTag("NewSubfileType", 254, 4), new ExifTag("SubfileType", 255, 4), new ExifTag("ThumbnailImageWidth", 256, 3, 4), new ExifTag("ThumbnailImageLength", 257, 3, 4), new ExifTag("BitsPerSample", 258, 3), new ExifTag("Compression", 259, 3), new ExifTag("PhotometricInterpretation", 262, 3), new ExifTag("ImageDescription", 270, 2), new ExifTag("Make", 271, 2), new ExifTag("Model", 272, 2), new ExifTag("StripOffsets", 273, 3, 4), new ExifTag("ThumbnailOrientation", 274, 3), new ExifTag("SamplesPerPixel", 277, 3), new ExifTag("RowsPerStrip", 278, 3, 4), new ExifTag("StripByteCounts", 279, 3, 4), new ExifTag("XResolution", 282, 5), new ExifTag("YResolution", 283, 5), new ExifTag("PlanarConfiguration", 284, 3), new ExifTag("ResolutionUnit", l.f62284f, 3), new ExifTag("TransferFunction", Sdk.SDKError.Reason.MRAID_ERROR_VALUE, 3), new ExifTag("Software", Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE, 2), new ExifTag("DateTime", 306, 2), new ExifTag("Artist", Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE, 2), new ExifTag("WhitePoint", Sdk.SDKError.Reason.AD_CLOSED_MISSING_HEARTBEAT_VALUE, 5), new ExifTag("PrimaryChromaticities", Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE, 5), new ExifTag("SubIFDPointer", 330, 4), new ExifTag("JPEGInterchangeFormat", 513, 4), new ExifTag("JPEGInterchangeFormatLength", 514, 4), new ExifTag("YCbCrCoefficients", 529, 5), new ExifTag("YCbCrSubSampling", 530, 3), new ExifTag("YCbCrPositioning", 531, 3), new ExifTag("ReferenceBlackWhite", 532, 5), new ExifTag("Copyright", 33432, 2), new ExifTag("ExifIFDPointer", 34665, 4), new ExifTag("GPSInfoIFDPointer", 34853, 4), new ExifTag("DNGVersion", 50706, 1), new ExifTag("DefaultCropSize", 50720, 3, 4)};
        f38424I = exifTagArr5;
        f38423GR = new ExifTag("StripOffsets", 273, 3);
        ExifTag[] exifTagArr6 = {new ExifTag("ThumbnailImage", 256, 7), new ExifTag("CameraSettingsIFDPointer", 8224, 4), new ExifTag("ImageProcessingIFDPointer", 8256, 4)};
        Nxk = exifTagArr6;
        ExifTag[] exifTagArr7 = {new ExifTag("PreviewImageStart", 257, 4), new ExifTag("PreviewImageLength", 258, 4)};
        f38432Y = exifTagArr7;
        ExifTag[] exifTagArr8 = {new ExifTag("AspectFrame", 4371, 3)};
        f38436k = exifTagArr8;
        ExifTag[] exifTagArr9 = {new ExifTag("ColorSpace", 55, 3)};
        dR0 = exifTagArr9;
        ExifTag[][] exifTagArr10 = {exifTagArr, exifTagArr2, exifTagArr3, exifTagArr4, exifTagArr5, exifTagArr, exifTagArr6, exifTagArr7, exifTagArr8, exifTagArr9};
        f38439z = exifTagArr10;
        piY = new ExifTag[]{new ExifTag("SubIFDPointer", 330, 4), new ExifTag("ExifIFDPointer", 34665, 4), new ExifTag("GPSInfoIFDPointer", 34853, 4), new ExifTag("InteroperabilityIFDPointer", 40965, 4), new ExifTag("CameraSettingsIFDPointer", 8224, 1), new ExifTag("ImageProcessingIFDPointer", 8256, 1)};
        ijL = new HashMap[exifTagArr10.length];
        f38437m = new HashMap[exifTagArr10.length];
        eTf = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        xg = new HashMap();
        Charset charsetForName = Charset.forName(C.ASCII_NAME);
        pJg = charsetForName;
        ofS = "Exif\u0000\u0000".getBytes(charsetForName);
        f38418C = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        p5 = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        eF = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i2 = 0;
        while (true) {
            ExifTag[][] exifTagArr11 = f38439z;
            if (i2 >= exifTagArr11.length) {
                HashMap map = xg;
                ExifTag[] exifTagArr12 = piY;
                map.put(Integer.valueOf(exifTagArr12[0].f38456n), 5);
                map.put(Integer.valueOf(exifTagArr12[1].f38456n), 1);
                map.put(Integer.valueOf(exifTagArr12[2].f38456n), 2);
                map.put(Integer.valueOf(exifTagArr12[3].f38456n), 3);
                map.put(Integer.valueOf(exifTagArr12[4].f38456n), 7);
                map.put(Integer.valueOf(exifTagArr12[5].f38456n), 8);
                Mx = Pattern.compile(".*[1-9].*");
                f38422G7 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                fcU = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                eWT = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            ijL[i2] = new HashMap();
            f38437m[i2] = new HashMap();
            for (ExifTag exifTag : exifTagArr11[i2]) {
                ijL[i2].put(Integer.valueOf(exifTag.f38456n), exifTag);
                f38437m[i2].put(exifTag.rl, exifTag);
            }
            i2++;
        }
    }

    public ExifInterface(InputStream inputStream) {
        this(inputStream, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00af A[Catch: all -> 0x0013, TRY_LEAVE, TryCatch #2 {all -> 0x0013, blocks: (B:3:0x0002, B:5:0x0007, B:12:0x001c, B:14:0x0020, B:15:0x002e, B:17:0x0036, B:19:0x003f, B:38:0x0071, B:25:0x0050, B:32:0x005e, B:35:0x0066, B:36:0x006a, B:37:0x006e, B:39:0x007b, B:41:0x0085, B:44:0x008d, B:47:0x0095, B:50:0x009d, B:55:0x00ab, B:57:0x00af), top: B:66:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void T(InputStream inputStream) {
        boolean z2;
        for (int i2 = 0; i2 < f38439z.length; i2++) {
            try {
                try {
                    this.J2[i2] = new HashMap();
                } catch (Throwable th) {
                    O();
                    if (f38428S) {
                        nHg();
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                z2 = f38428S;
                if (z2) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                O();
                if (z2) {
                    return;
                }
                nHg();
                return;
            } catch (UnsupportedOperationException e3) {
                e = e3;
                z2 = f38428S;
                if (z2) {
                }
                O();
                if (z2) {
                }
            }
        }
        if (!this.f38440O) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.nr = gh(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        if (jB(this.nr)) {
            SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream = new SeekableByteOrderedDataInputStream(inputStream);
            if (!this.f38440O) {
                int i3 = this.nr;
                if (i3 == 12 || i3 == 15) {
                    xMQ(seekableByteOrderedDataInputStream, i3);
                } else if (i3 == 7) {
                    qie(seekableByteOrderedDataInputStream);
                } else if (i3 == 10) {
                    Ik(seekableByteOrderedDataInputStream);
                } else {
                    HI(seekableByteOrderedDataInputStream);
                }
            } else if (!r(seekableByteOrderedDataInputStream)) {
                O();
                if (f38428S) {
                    nHg();
                    return;
                }
                return;
            }
            seekableByteOrderedDataInputStream.U(this.ck);
            Xw(seekableByteOrderedDataInputStream);
        } else {
            ByteOrderedDataInputStream byteOrderedDataInputStream = new ByteOrderedDataInputStream(inputStream);
            int i5 = this.nr;
            if (i5 == 4) {
                mUb(byteOrderedDataInputStream, 0, 0);
            } else if (i5 == 13) {
                az(byteOrderedDataInputStream);
            } else if (i5 == 9) {
                ty(byteOrderedDataInputStream);
            } else if (i5 == 14) {
                o(byteOrderedDataInputStream);
            }
        }
        O();
        if (f38428S) {
            nHg();
        }
    }

    private static boolean ViF(byte[] bArr) {
        int i2 = 0;
        while (true) {
            byte[] bArr2 = te;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    private boolean X(byte[] bArr) {
        int i2 = 0;
        while (true) {
            byte[] bArr2 = wTp;
            if (i2 >= bArr2.length) {
                int i3 = 0;
                while (true) {
                    byte[] bArr3 = f38438v;
                    if (i3 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[wTp.length + i3 + 4] != bArr3[i3]) {
                        return false;
                    }
                    i3++;
                }
            } else {
                if (bArr[i2] != bArr2[i2]) {
                    return false;
                }
                i2++;
            }
        }
    }

    private static int Z(int i2) {
        if (i2 != 4) {
            return (i2 == 9 || i2 == 15 || i2 == 12 || i2 == 13) ? 2 : 1;
        }
        return 3;
    }

    private int aYN(byte[] bArr) throws Throwable {
        ByteOrderedDataInputStream byteOrderedDataInputStream;
        long j2;
        ByteOrderedDataInputStream byteOrderedDataInputStream2 = null;
        try {
            try {
                byteOrderedDataInputStream = new ByteOrderedDataInputStream(bArr);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            long length = byteOrderedDataInputStream.readInt();
            byte[] bArr2 = new byte[4];
            byteOrderedDataInputStream.readFully(bArr2);
            if (!Arrays.equals(bArr2, iF)) {
                byteOrderedDataInputStream.close();
                return 0;
            }
            if (length == 1) {
                length = byteOrderedDataInputStream.readLong();
                j2 = 16;
                if (length < 16) {
                    byteOrderedDataInputStream.close();
                    return 0;
                }
            } else {
                j2 = 8;
            }
            if (length > bArr.length) {
                length = bArr.length;
            }
            long j3 = length - j2;
            if (j3 < 8) {
                byteOrderedDataInputStream.close();
                return 0;
            }
            byte[] bArr3 = new byte[4];
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            for (long j4 = 0; j4 < j3 / 4; j4++) {
                try {
                    byteOrderedDataInputStream.readFully(bArr3);
                    if (j4 != 1) {
                        if (Arrays.equals(bArr3, fD)) {
                            z2 = true;
                        } else if (Arrays.equals(bArr3, E2)) {
                            z3 = true;
                        } else if (Arrays.equals(bArr3, f38434e) || Arrays.equals(bArr3, f38431X)) {
                            z4 = true;
                        }
                        if (!z2) {
                            continue;
                        } else {
                            if (z3) {
                                byteOrderedDataInputStream.close();
                                return 12;
                            }
                            if (z4) {
                                byteOrderedDataInputStream.close();
                                return 15;
                            }
                        }
                    }
                } catch (EOFException unused) {
                    byteOrderedDataInputStream.close();
                    return 0;
                }
            }
            byteOrderedDataInputStream.close();
        } catch (Exception e3) {
            e = e3;
            byteOrderedDataInputStream2 = byteOrderedDataInputStream;
            if (f38428S) {
                Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
            }
            if (byteOrderedDataInputStream2 != null) {
                byteOrderedDataInputStream2.close();
            }
        } catch (Throwable th2) {
            th = th2;
            byteOrderedDataInputStream2 = byteOrderedDataInputStream;
            if (byteOrderedDataInputStream2 != null) {
                byteOrderedDataInputStream2.close();
            }
            throw th;
        }
        return 0;
    }

    private boolean g(byte[] bArr) {
        int i2 = 0;
        while (true) {
            byte[] bArr2 = nHg;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    private boolean iF(byte[] bArr) throws Throwable {
        ByteOrderedDataInputStream byteOrderedDataInputStream = null;
        try {
            ByteOrderedDataInputStream byteOrderedDataInputStream2 = new ByteOrderedDataInputStream(bArr);
            try {
                ByteOrder byteOrderS7N = s7N(byteOrderedDataInputStream2);
                this.KN = byteOrderS7N;
                byteOrderedDataInputStream2.T(byteOrderS7N);
                boolean z2 = byteOrderedDataInputStream2.readShort() == 85;
                byteOrderedDataInputStream2.close();
                return z2;
            } catch (Exception unused) {
                byteOrderedDataInputStream = byteOrderedDataInputStream2;
                if (byteOrderedDataInputStream != null) {
                    byteOrderedDataInputStream.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                byteOrderedDataInputStream = byteOrderedDataInputStream2;
                if (byteOrderedDataInputStream != null) {
                    byteOrderedDataInputStream.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static boolean jB(int i2) {
        return (i2 == 4 || i2 == 9 || i2 == 13 || i2 == 14) ? false : true;
    }

    private void nHg() {
        for (int i2 = 0; i2 < this.J2.length; i2++) {
            Log.d("ExifInterface", "The size of tag group[" + i2 + "]: " + this.J2[i2].size());
            for (Map.Entry entry : this.J2[i2].entrySet()) {
                ExifAttribute exifAttribute = (ExifAttribute) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + exifAttribute.toString() + ", tagValue: '" + exifAttribute.mUb(this.KN) + "'");
            }
        }
    }

    private boolean nY(byte[] bArr) throws Throwable {
        ByteOrderedDataInputStream byteOrderedDataInputStream = null;
        try {
            ByteOrderedDataInputStream byteOrderedDataInputStream2 = new ByteOrderedDataInputStream(bArr);
            try {
                ByteOrder byteOrderS7N = s7N(byteOrderedDataInputStream2);
                this.KN = byteOrderS7N;
                byteOrderedDataInputStream2.T(byteOrderS7N);
                short s2 = byteOrderedDataInputStream2.readShort();
                boolean z2 = s2 == 20306 || s2 == 21330;
                byteOrderedDataInputStream2.close();
                return z2;
            } catch (Exception unused) {
                byteOrderedDataInputStream = byteOrderedDataInputStream2;
                if (byteOrderedDataInputStream != null) {
                    byteOrderedDataInputStream.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                byteOrderedDataInputStream = byteOrderedDataInputStream2;
                if (byteOrderedDataInputStream != null) {
                    byteOrderedDataInputStream.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void p5() throws Throwable {
        U(0, 5);
        U(0, 4);
        U(5, 4);
        ExifAttribute exifAttribute = (ExifAttribute) this.J2[1].get("PixelXDimension");
        ExifAttribute exifAttribute2 = (ExifAttribute) this.J2[1].get("PixelYDimension");
        if (exifAttribute != null && exifAttribute2 != null) {
            this.J2[0].put("ImageWidth", exifAttribute);
            this.J2[0].put("ImageLength", exifAttribute2);
        }
        if (this.J2[4].isEmpty() && e(this.J2[5])) {
            HashMap[] mapArr = this.J2;
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!e(this.J2[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        rV9(0, "ThumbnailOrientation", "Orientation");
        rV9(0, "ThumbnailImageLength", "ImageLength");
        rV9(0, "ThumbnailImageWidth", "ImageWidth");
        rV9(5, "ThumbnailOrientation", "Orientation");
        rV9(5, "ThumbnailImageLength", "ImageLength");
        rV9(5, "ThumbnailImageWidth", "ImageWidth");
        rV9(4, "Orientation", "ThumbnailOrientation");
        rV9(4, "ImageLength", "ThumbnailImageLength");
        rV9(4, "ImageWidth", "ThumbnailImageWidth");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ExifInterface(InputStream inputStream, int i2) {
        ExifTag[][] exifTagArr = f38439z;
        this.J2 = new HashMap[exifTagArr.length];
        this.Uo = new HashSet(exifTagArr.length);
        this.KN = ByteOrder.BIG_ENDIAN;
        if (inputStream == null) {
            throw new NullPointerException("inputStream cannot be null");
        }
        this.f38442n = null;
        boolean z2 = i2 == 1;
        this.f38440O = z2;
        if (z2) {
            this.f38445t = null;
            this.rl = null;
        } else if (inputStream instanceof AssetManager.AssetInputStream) {
            this.f38445t = (AssetManager.AssetInputStream) inputStream;
            this.rl = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            if (fD(fileInputStream.getFD())) {
                this.f38445t = null;
                this.rl = fileInputStream.getFD();
            } else {
                this.f38445t = null;
                this.rl = null;
            }
        }
        T(inputStream);
    }

    private boolean E2(HashMap map) {
        ExifAttribute exifAttribute;
        int iXMQ;
        ExifAttribute exifAttribute2 = (ExifAttribute) map.get("BitsPerSample");
        if (exifAttribute2 != null) {
            int[] iArr = (int[]) exifAttribute2.gh(this.KN);
            int[] iArr2 = ViF;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.nr == 3 && (exifAttribute = (ExifAttribute) map.get("PhotometricInterpretation")) != null && (((iXMQ = exifAttribute.xMQ(this.KN)) == 1 && Arrays.equals(iArr, f38435g)) || (iXMQ == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f38428S) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    private void Ik(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) throws Throwable {
        if (f38428S) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + seekableByteOrderedDataInputStream);
        }
        HI(seekableByteOrderedDataInputStream);
        ExifAttribute exifAttribute = (ExifAttribute) this.J2[0].get("JpgFromRaw");
        if (exifAttribute != null) {
            mUb(new ByteOrderedDataInputStream(exifAttribute.nr), (int) exifAttribute.f38455t, 5);
        }
        ExifAttribute exifAttribute2 = (ExifAttribute) this.J2[0].get("ISO");
        ExifAttribute exifAttribute3 = (ExifAttribute) this.J2[1].get("PhotographicSensitivity");
        if (exifAttribute2 == null || exifAttribute3 != null) {
            return;
        }
        this.J2[1].put("PhotographicSensitivity", exifAttribute2);
    }

    private ExifAttribute KN(String str) {
        ExifAttribute exifAttribute;
        ExifAttribute exifAttribute2;
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (f38428S) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && Z(this.nr) == 2 && (exifAttribute2 = this.f38441Z) != null) {
            return exifAttribute2;
        }
        for (int i2 = 0; i2 < f38439z.length; i2++) {
            ExifAttribute exifAttribute3 = (ExifAttribute) this.J2[i2].get(str);
            if (exifAttribute3 != null) {
                return exifAttribute3;
            }
        }
        if (!"Xmp".equals(str) || (exifAttribute = this.f38441Z) == null) {
            return null;
        }
        return exifAttribute;
    }

    private void M7(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream, int i2) throws Throwable {
        ExifAttribute exifAttributeJ2;
        ExifAttribute exifAttributeJ22;
        ExifAttribute exifAttribute = (ExifAttribute) this.J2[i2].get("DefaultCropSize");
        ExifAttribute exifAttribute2 = (ExifAttribute) this.J2[i2].get("SensorTopBorder");
        ExifAttribute exifAttribute3 = (ExifAttribute) this.J2[i2].get("SensorLeftBorder");
        ExifAttribute exifAttribute4 = (ExifAttribute) this.J2[i2].get("SensorBottomBorder");
        ExifAttribute exifAttribute5 = (ExifAttribute) this.J2[i2].get("SensorRightBorder");
        if (exifAttribute == null) {
            if (exifAttribute2 == null || exifAttribute3 == null || exifAttribute4 == null || exifAttribute5 == null) {
                bzg(seekableByteOrderedDataInputStream, i2);
                return;
            }
            int iXMQ = exifAttribute2.xMQ(this.KN);
            int iXMQ2 = exifAttribute4.xMQ(this.KN);
            int iXMQ3 = exifAttribute5.xMQ(this.KN);
            int iXMQ4 = exifAttribute3.xMQ(this.KN);
            if (iXMQ2 <= iXMQ || iXMQ3 <= iXMQ4) {
                return;
            }
            ExifAttribute exifAttributeJ23 = ExifAttribute.J2(iXMQ2 - iXMQ, this.KN);
            ExifAttribute exifAttributeJ24 = ExifAttribute.J2(iXMQ3 - iXMQ4, this.KN);
            this.J2[i2].put("ImageLength", exifAttributeJ23);
            this.J2[i2].put("ImageWidth", exifAttributeJ24);
            return;
        }
        if (exifAttribute.f38454n == 5) {
            Rational[] rationalArr = (Rational[]) exifAttribute.gh(this.KN);
            if (rationalArr == null || rationalArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(rationalArr));
                return;
            }
            exifAttributeJ2 = ExifAttribute.nr(rationalArr[0], this.KN);
            exifAttributeJ22 = ExifAttribute.nr(rationalArr[1], this.KN);
        } else {
            int[] iArr = (int[]) exifAttribute.gh(this.KN);
            if (iArr == null || iArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
            exifAttributeJ2 = ExifAttribute.J2(iArr[0], this.KN);
            exifAttributeJ22 = ExifAttribute.J2(iArr[1], this.KN);
        }
        this.J2[i2].put("ImageWidth", exifAttributeJ2);
        this.J2[i2].put("ImageLength", exifAttributeJ22);
    }

    private void O() {
        String strJ2 = J2("DateTimeOriginal");
        if (strJ2 != null && J2("DateTime") == null) {
            this.J2[0].put("DateTime", ExifAttribute.n(strJ2));
        }
        if (J2("ImageWidth") == null) {
            this.J2[0].put("ImageWidth", ExifAttribute.rl(0L, this.KN));
        }
        if (J2("ImageLength") == null) {
            this.J2[0].put("ImageLength", ExifAttribute.rl(0L, this.KN));
        }
        if (J2("Orientation") == null) {
            this.J2[0].put("Orientation", ExifAttribute.rl(0L, this.KN));
        }
        if (J2("LightSource") == null) {
            this.J2[1].put("LightSource", ExifAttribute.rl(0L, this.KN));
        }
    }

    private static void P5(CRC32 crc32, int i2) {
        crc32.update(i2 >>> 24);
        crc32.update(i2 >>> 16);
        crc32.update(i2 >>> 8);
        crc32.update(i2);
    }

    private void S(ByteOrderedDataInputStream byteOrderedDataInputStream, HashMap map) throws IOException {
        int i2;
        ExifAttribute exifAttribute = (ExifAttribute) map.get("StripOffsets");
        ExifAttribute exifAttribute2 = (ExifAttribute) map.get("StripByteCounts");
        if (exifAttribute == null || exifAttribute2 == null) {
            return;
        }
        long[] jArrN = ExifInterfaceUtils.n(exifAttribute.gh(this.KN));
        long[] jArrN2 = ExifInterfaceUtils.n(exifAttribute2.gh(this.KN));
        if (jArrN == null || jArrN.length == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (jArrN2 == null || jArrN2.length == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (jArrN.length != jArrN2.length) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j2 = 0;
        for (long j3 : jArrN2) {
            j2 += j3;
        }
        int i3 = (int) j2;
        byte[] bArr = new byte[i3];
        int i5 = 1;
        this.gh = true;
        this.mUb = true;
        this.xMQ = true;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < jArrN.length) {
            int i10 = (int) jArrN[i7];
            int i11 = (int) jArrN2[i7];
            if (i7 < jArrN.length - i5) {
                i2 = i7;
                if (i10 + i11 != jArrN[i2 + 1]) {
                    this.gh = false;
                }
            } else {
                i2 = i7;
            }
            int i12 = i10 - i8;
            if (i12 < 0) {
                Log.d("ExifInterface", "Invalid strip offset value");
                return;
            }
            try {
                byteOrderedDataInputStream.jB(i12);
                int i13 = i8 + i12;
                byte[] bArr2 = new byte[i11];
                try {
                    byteOrderedDataInputStream.readFully(bArr2);
                    i8 = i13 + i11;
                    System.arraycopy(bArr2, 0, bArr, i9, i11);
                    i9 += i11;
                    i7 = i2 + 1;
                    i5 = 1;
                } catch (EOFException unused) {
                    Log.d("ExifInterface", "Failed to read " + i11 + " bytes.");
                    return;
                }
            } catch (EOFException unused2) {
                Log.d("ExifInterface", "Failed to skip " + i12 + " bytes.");
                return;
            }
        }
        this.ty = bArr;
        if (this.gh) {
            this.qie = (int) jArrN[0];
            this.az = i3;
        }
    }

    private void U(int i2, int i3) throws Throwable {
        if (this.J2[i2].isEmpty() || this.J2[i3].isEmpty()) {
            if (f38428S) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        ExifAttribute exifAttribute = (ExifAttribute) this.J2[i2].get("ImageLength");
        ExifAttribute exifAttribute2 = (ExifAttribute) this.J2[i2].get("ImageWidth");
        ExifAttribute exifAttribute3 = (ExifAttribute) this.J2[i3].get("ImageLength");
        ExifAttribute exifAttribute4 = (ExifAttribute) this.J2[i3].get("ImageWidth");
        if (exifAttribute == null || exifAttribute2 == null) {
            if (f38428S) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (exifAttribute3 == null || exifAttribute4 == null) {
            if (f38428S) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iXMQ = exifAttribute.xMQ(this.KN);
        int iXMQ2 = exifAttribute2.xMQ(this.KN);
        int iXMQ3 = exifAttribute3.xMQ(this.KN);
        int iXMQ4 = exifAttribute4.xMQ(this.KN);
        if (iXMQ >= iXMQ3 || iXMQ2 >= iXMQ4) {
            return;
        }
        HashMap[] mapArr = this.J2;
        HashMap map = mapArr[i2];
        mapArr[i2] = mapArr[i3];
        mapArr[i3] = map;
    }

    private void XQ(ByteOrderedDataInputStream byteOrderedDataInputStream, HashMap map) throws Throwable {
        ExifAttribute exifAttribute = (ExifAttribute) map.get("JPEGInterchangeFormat");
        ExifAttribute exifAttribute2 = (ExifAttribute) map.get("JPEGInterchangeFormatLength");
        if (exifAttribute == null || exifAttribute2 == null) {
            return;
        }
        int iXMQ = exifAttribute.xMQ(this.KN);
        int iXMQ2 = exifAttribute2.xMQ(this.KN);
        if (this.nr == 7) {
            iXMQ += this.Ik;
        }
        if (iXMQ > 0 && iXMQ2 > 0) {
            this.xMQ = true;
            if (this.f38442n == null && this.f38445t == null && this.rl == null) {
                byte[] bArr = new byte[iXMQ2];
                byteOrderedDataInputStream.jB(iXMQ);
                byteOrderedDataInputStream.readFully(bArr);
                this.ty = bArr;
            }
            this.qie = iXMQ;
            this.az = iXMQ2;
        }
        if (f38428S) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iXMQ + ", length: " + iXMQ2);
        }
    }

    private void Xw(ByteOrderedDataInputStream byteOrderedDataInputStream) throws Throwable {
        HashMap map = this.J2[4];
        ExifAttribute exifAttribute = (ExifAttribute) map.get("Compression");
        if (exifAttribute == null) {
            this.HI = 6;
            XQ(byteOrderedDataInputStream, map);
            return;
        }
        int iXMQ = exifAttribute.xMQ(this.KN);
        this.HI = iXMQ;
        if (iXMQ != 1) {
            if (iXMQ == 6) {
                XQ(byteOrderedDataInputStream, map);
                return;
            } else if (iXMQ != 7) {
                return;
            }
        }
        if (E2(map)) {
            S(byteOrderedDataInputStream, map);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        r17.XQ = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void az(ByteOrderedDataInputStream byteOrderedDataInputStream) throws Throwable {
        if (f38428S) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + byteOrderedDataInputStream);
        }
        byteOrderedDataInputStream.T(ByteOrder.BIG_ENDIAN);
        int iRl = byteOrderedDataInputStream.rl();
        byteOrderedDataInputStream.jB(nHg.length);
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            if (z2 && z3) {
                break;
            }
            try {
                int i2 = byteOrderedDataInputStream.readInt();
                int i3 = byteOrderedDataInputStream.readInt();
                int iRl2 = byteOrderedDataInputStream.rl() + i2 + 4;
                if (byteOrderedDataInputStream.rl() - iRl == 16 && i3 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (i3 == 1229278788) {
                    break;
                }
                if (i3 == 1700284774 && !z2) {
                    this.ck = byteOrderedDataInputStream.rl() - iRl;
                    byte[] bArr = new byte[i2];
                    byteOrderedDataInputStream.readFully(bArr);
                    int i5 = byteOrderedDataInputStream.readInt();
                    CRC32 crc32 = new CRC32();
                    P5(crc32, i3);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != i5) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i5 + ", calculated CRC value: " + crc32.getValue());
                    }
                    wTp(bArr, 0);
                    p5();
                    Xw(new ByteOrderedDataInputStream(bArr));
                    z2 = true;
                } else if (i3 == 1767135348 && !z3) {
                    byte[] bArr2 = s7N;
                    if (i2 >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        byteOrderedDataInputStream.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int iRl3 = byteOrderedDataInputStream.rl() - iRl;
                            int i7 = i2 - length;
                            byte[] bArr4 = new byte[i7];
                            byteOrderedDataInputStream.readFully(bArr4);
                            this.f38441Z = new ExifAttribute(1, i7, iRl3, bArr4);
                            z3 = true;
                        }
                    }
                }
                byteOrderedDataInputStream.jB(iRl2 - byteOrderedDataInputStream.rl());
            } catch (EOFException e2) {
                throw new IOException("Encountered corrupt PNG file.", e2);
            }
        }
    }

    private void bzg(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream, int i2) throws Throwable {
        ExifAttribute exifAttribute = (ExifAttribute) this.J2[i2].get("ImageLength");
        ExifAttribute exifAttribute2 = (ExifAttribute) this.J2[i2].get("ImageWidth");
        if (exifAttribute == null || exifAttribute2 == null) {
            ExifAttribute exifAttribute3 = (ExifAttribute) this.J2[i2].get("JPEGInterchangeFormat");
            ExifAttribute exifAttribute4 = (ExifAttribute) this.J2[i2].get("JPEGInterchangeFormatLength");
            if (exifAttribute3 == null || exifAttribute4 == null) {
                return;
            }
            int iXMQ = exifAttribute3.xMQ(this.KN);
            int iXMQ2 = exifAttribute3.xMQ(this.KN);
            seekableByteOrderedDataInputStream.U(iXMQ);
            byte[] bArr = new byte[iXMQ2];
            seekableByteOrderedDataInputStream.readFully(bArr);
            mUb(new ByteOrderedDataInputStream(bArr), iXMQ, i2);
        }
    }

    private boolean e(HashMap map) {
        ExifAttribute exifAttribute = (ExifAttribute) map.get("ImageLength");
        ExifAttribute exifAttribute2 = (ExifAttribute) map.get("ImageWidth");
        if (exifAttribute == null || exifAttribute2 == null) {
            return false;
        }
        return exifAttribute.xMQ(this.KN) <= 512 && exifAttribute2.xMQ(this.KN) <= 512;
    }

    private static boolean fD(FileDescriptor fileDescriptor) {
        try {
            Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f38428S) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    private int gh(BufferedInputStream bufferedInputStream) throws Throwable {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (ViF(bArr)) {
            return 4;
        }
        if (te(bArr)) {
            return 9;
        }
        int iAYN = aYN(bArr);
        if (iAYN != 0) {
            return iAYN;
        }
        if (nY(bArr)) {
            return 7;
        }
        if (iF(bArr)) {
            return 10;
        }
        if (g(bArr)) {
            return 13;
        }
        return X(bArr) ? 14 : 0;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x00a7. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00aa. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00ad. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0159 A[LOOP:0: B:10:0x0037->B:55:0x0159, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015f A[SYNTHETIC] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1068)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void mUb(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r21, int r22, int r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.mUb(androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream, int, int):void");
    }

    private void o(ByteOrderedDataInputStream byteOrderedDataInputStream) throws Throwable {
        if (f38428S) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + byteOrderedDataInputStream);
        }
        byteOrderedDataInputStream.T(ByteOrder.LITTLE_ENDIAN);
        byteOrderedDataInputStream.jB(wTp.length);
        int i2 = byteOrderedDataInputStream.readInt() + 8;
        byte[] bArr = f38438v;
        byteOrderedDataInputStream.jB(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                byteOrderedDataInputStream.readFully(bArr2);
                int i3 = byteOrderedDataInputStream.readInt();
                int i5 = length + 8;
                if (Arrays.equals(rV9, bArr2)) {
                    byte[] bArrCopyOfRange = new byte[i3];
                    byteOrderedDataInputStream.readFully(bArrCopyOfRange);
                    byte[] bArr3 = ofS;
                    if (ExifInterfaceUtils.rl(bArrCopyOfRange, bArr3)) {
                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, bArr3.length, i3);
                    }
                    this.ck = i5;
                    wTp(bArrCopyOfRange, 0);
                    Xw(new ByteOrderedDataInputStream(bArrCopyOfRange));
                    return;
                }
                if (i3 % 2 == 1) {
                    i3++;
                }
                length = i5 + i3;
                if (length == i2) {
                    return;
                }
                if (length > i2) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                byteOrderedDataInputStream.jB(i3);
            } catch (EOFException e2) {
                throw new IOException("Encountered corrupt WebP file.", e2);
            }
        }
    }

    private boolean r(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) throws IOException {
        byte[] bArr = ofS;
        byte[] bArr2 = new byte[bArr.length];
        seekableByteOrderedDataInputStream.readFully(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            Log.w("ExifInterface", "Given data is not EXIF-only.");
            return false;
        }
        byte[] bArrUo = seekableByteOrderedDataInputStream.Uo();
        this.ck = bArr.length;
        wTp(bArrUo, 0);
        return true;
    }

    private void rV9(int i2, String str, String str2) {
        if (this.J2[i2].isEmpty() || this.J2[i2].get(str) == null) {
            return;
        }
        HashMap map = this.J2[i2];
        map.put(str2, (ExifAttribute) map.get(str));
        this.J2[i2].remove(str);
    }

    private boolean te(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i2 = 0; i2 < bytes.length; i2++) {
            if (bArr[i2] != bytes[i2]) {
                return false;
            }
        }
        return true;
    }

    private void ty(ByteOrderedDataInputStream byteOrderedDataInputStream) throws Throwable {
        boolean z2 = f38428S;
        if (z2) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + byteOrderedDataInputStream);
        }
        byteOrderedDataInputStream.jB(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        byteOrderedDataInputStream.readFully(bArr);
        byteOrderedDataInputStream.readFully(bArr2);
        byteOrderedDataInputStream.readFully(bArr3);
        int i2 = ByteBuffer.wrap(bArr).getInt();
        int i3 = ByteBuffer.wrap(bArr2).getInt();
        int i5 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i3];
        byteOrderedDataInputStream.jB(i2 - byteOrderedDataInputStream.rl());
        byteOrderedDataInputStream.readFully(bArr4);
        mUb(new ByteOrderedDataInputStream(bArr4), i2, 5);
        byteOrderedDataInputStream.jB(i5 - byteOrderedDataInputStream.rl());
        byteOrderedDataInputStream.T(ByteOrder.BIG_ENDIAN);
        int i7 = byteOrderedDataInputStream.readInt();
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i7);
        }
        for (int i8 = 0; i8 < i7; i8++) {
            int unsignedShort = byteOrderedDataInputStream.readUnsignedShort();
            int unsignedShort2 = byteOrderedDataInputStream.readUnsignedShort();
            if (unsignedShort == f38423GR.f38456n) {
                short s2 = byteOrderedDataInputStream.readShort();
                short s3 = byteOrderedDataInputStream.readShort();
                ExifAttribute exifAttributeJ2 = ExifAttribute.J2(s2, this.KN);
                ExifAttribute exifAttributeJ22 = ExifAttribute.J2(s3, this.KN);
                this.J2[0].put("ImageLength", exifAttributeJ2);
                this.J2[0].put("ImageWidth", exifAttributeJ22);
                if (f38428S) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s2) + ", width: " + ((int) s3));
                    return;
                }
                return;
            }
            byteOrderedDataInputStream.jB(unsignedShort2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x028d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void v(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream, int i2) throws IOException {
        short s2;
        short s3;
        long j2;
        int i3;
        ExifTag exifTag;
        long j3;
        boolean z2;
        boolean z3;
        int i5;
        int i7;
        ExifTag exifTag2;
        int unsignedShort;
        long jZ;
        int i8 = i2;
        this.Uo.add(Integer.valueOf(seekableByteOrderedDataInputStream.rl()));
        short s4 = seekableByteOrderedDataInputStream.readShort();
        if (f38428S) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s4));
        }
        if (s4 <= 0) {
            return;
        }
        short s5 = 0;
        while (s5 < s4) {
            int unsignedShort2 = seekableByteOrderedDataInputStream.readUnsignedShort();
            int unsignedShort3 = seekableByteOrderedDataInputStream.readUnsignedShort();
            int i9 = seekableByteOrderedDataInputStream.readInt();
            long jRl = ((long) seekableByteOrderedDataInputStream.rl()) + 4;
            ExifTag exifTag3 = (ExifTag) ijL[i8].get(Integer.valueOf(unsignedShort2));
            boolean z4 = f38428S;
            if (z4) {
                j2 = 4;
                i3 = 4;
                s2 = s4;
                s3 = s5;
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i8), Integer.valueOf(unsignedShort2), exifTag3 != null ? exifTag3.rl : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i9)));
            } else {
                s2 = s4;
                s3 = s5;
                j2 = 4;
                i3 = 4;
            }
            if (exifTag3 != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = f38426M;
                    if (unsignedShort3 < iArr.length) {
                        if (exifTag3.n(unsignedShort3)) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = exifTag3.f38457t;
                            }
                            exifTag = exifTag3;
                            j3 = ((long) i9) * ((long) iArr[unsignedShort3]);
                            if (j3 < 0 || j3 > 2147483647L) {
                                if (z4) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i9);
                                }
                                z2 = false;
                                if (z2) {
                                    seekableByteOrderedDataInputStream.U(jRl);
                                } else {
                                    if (j3 > j2) {
                                        int i10 = seekableByteOrderedDataInputStream.readInt();
                                        if (z4) {
                                            Log.d("ExifInterface", "seek to data offset: " + i10);
                                        }
                                        if (this.nr == 7) {
                                            exifTag2 = exifTag;
                                            z3 = z4;
                                            if ("MakerNote".equals(exifTag2.rl)) {
                                                this.Ik = i10;
                                            } else if (i8 == 6 && "ThumbnailImage".equals(exifTag2.rl)) {
                                                this.f38444r = i10;
                                                this.f38443o = i9;
                                                ExifAttribute exifAttributeJ2 = ExifAttribute.J2(6, this.KN);
                                                i7 = i9;
                                                ExifAttribute exifAttributeRl = ExifAttribute.rl(this.f38444r, this.KN);
                                                i5 = unsignedShort2;
                                                ExifAttribute exifAttributeRl2 = ExifAttribute.rl(this.f38443o, this.KN);
                                                this.J2[i3].put("Compression", exifAttributeJ2);
                                                this.J2[i3].put("JPEGInterchangeFormat", exifAttributeRl);
                                                this.J2[i3].put("JPEGInterchangeFormatLength", exifAttributeRl2);
                                            }
                                            i5 = unsignedShort2;
                                            i7 = i9;
                                        } else {
                                            z3 = z4;
                                            i5 = unsignedShort2;
                                            i7 = i9;
                                            exifTag2 = exifTag;
                                        }
                                        seekableByteOrderedDataInputStream.U(i10);
                                    } else {
                                        z3 = z4;
                                        i5 = unsignedShort2;
                                        i7 = i9;
                                        exifTag2 = exifTag;
                                    }
                                    Integer num = (Integer) xg.get(Integer.valueOf(i5));
                                    if (z3) {
                                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j3);
                                    }
                                    if (num != null) {
                                        if (unsignedShort3 != 3) {
                                            if (unsignedShort3 == i3) {
                                                jZ = seekableByteOrderedDataInputStream.Z();
                                            } else if (unsignedShort3 == 8) {
                                                unsignedShort = seekableByteOrderedDataInputStream.readShort();
                                            } else if (unsignedShort3 == 9 || unsignedShort3 == 13) {
                                                unsignedShort = seekableByteOrderedDataInputStream.readInt();
                                            } else {
                                                jZ = -1;
                                            }
                                            if (z3) {
                                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jZ), exifTag2.rl));
                                            }
                                            if (jZ > 0 || (seekableByteOrderedDataInputStream.n() != -1 && jZ >= seekableByteOrderedDataInputStream.n())) {
                                                if (z3) {
                                                    String str = "Skip jump into the IFD since its offset is invalid: " + jZ;
                                                    if (seekableByteOrderedDataInputStream.n() != -1) {
                                                        str = str + " (total length: " + seekableByteOrderedDataInputStream.n() + ")";
                                                    }
                                                    Log.d("ExifInterface", str);
                                                }
                                            } else if (!this.Uo.contains(Integer.valueOf((int) jZ))) {
                                                seekableByteOrderedDataInputStream.U(jZ);
                                                v(seekableByteOrderedDataInputStream, num.intValue());
                                            } else if (z3) {
                                                Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + jZ + ")");
                                            }
                                            seekableByteOrderedDataInputStream.U(jRl);
                                        } else {
                                            unsignedShort = seekableByteOrderedDataInputStream.readUnsignedShort();
                                        }
                                        jZ = unsignedShort;
                                        if (z3) {
                                        }
                                        if (jZ > 0) {
                                            if (z3) {
                                            }
                                            seekableByteOrderedDataInputStream.U(jRl);
                                        }
                                    } else {
                                        int iRl = seekableByteOrderedDataInputStream.rl() + this.ck;
                                        byte[] bArr = new byte[(int) j3];
                                        seekableByteOrderedDataInputStream.readFully(bArr);
                                        ExifAttribute exifAttribute = new ExifAttribute(unsignedShort3, i7, iRl, bArr);
                                        this.J2[i2].put(exifTag2.rl, exifAttribute);
                                        if ("DNGVersion".equals(exifTag2.rl)) {
                                            this.nr = 3;
                                        }
                                        if ((("Make".equals(exifTag2.rl) || "Model".equals(exifTag2.rl)) && exifAttribute.mUb(this.KN).contains("PENTAX")) || ("Compression".equals(exifTag2.rl) && exifAttribute.xMQ(this.KN) == 65535)) {
                                            this.nr = 8;
                                        }
                                        if (seekableByteOrderedDataInputStream.rl() != jRl) {
                                            seekableByteOrderedDataInputStream.U(jRl);
                                        }
                                    }
                                }
                                s5 = (short) (s3 + 1);
                                i8 = i2;
                                s4 = s2;
                            } else {
                                z2 = true;
                                if (z2) {
                                }
                                s5 = (short) (s3 + 1);
                                i8 = i2;
                                s4 = s2;
                            }
                        } else if (z4) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + f38420E[unsignedShort3] + ") is unexpected for tag: " + exifTag3.rl);
                        }
                    }
                }
                exifTag = exifTag3;
                if (z4) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                j3 = 0;
                z2 = false;
                if (z2) {
                }
                s5 = (short) (s3 + 1);
                i8 = i2;
                s4 = s2;
            } else if (z4) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + unsignedShort2);
            }
            exifTag = exifTag3;
            j3 = 0;
            z2 = false;
            if (z2) {
            }
            s5 = (short) (s3 + 1);
            i8 = i2;
            s4 = s2;
        }
        int i11 = seekableByteOrderedDataInputStream.readInt();
        boolean z5 = f38428S;
        if (z5) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(i11)));
        }
        long j4 = i11;
        if (j4 <= 0) {
            if (z5) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + i11);
                return;
            }
            return;
        }
        if (this.Uo.contains(Integer.valueOf(i11))) {
            if (z5) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + i11);
                return;
            }
            return;
        }
        seekableByteOrderedDataInputStream.U(j4);
        if (this.J2[4].isEmpty()) {
            v(seekableByteOrderedDataInputStream, 4);
        } else if (this.J2[5].isEmpty()) {
            v(seekableByteOrderedDataInputStream, 5);
        }
    }

    private void wTp(byte[] bArr, int i2) throws IOException {
        SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream = new SeekableByteOrderedDataInputStream(bArr);
        N(seekableByteOrderedDataInputStream);
        v(seekableByteOrderedDataInputStream, i2);
    }

    private void xMQ(final SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream, int i2) {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIC files is supported from SDK 28 and above");
        }
        if (i2 == 15 && i3 < 31) {
            throw new UnsupportedOperationException("Reading EXIF from AVIF files is supported from SDK 31 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                ExifInterfaceUtils.Api23Impl.n(mediaMetadataRetriever, new MediaDataSource() { // from class: androidx.exifinterface.media.ExifInterface.1

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    long f38447n;

                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public void close() {
                    }

                    @Override // android.media.MediaDataSource
                    public long getSize() {
                        return -1L;
                    }

                    @Override // android.media.MediaDataSource
                    public int readAt(long j2, byte[] bArr, int i5, int i7) {
                        if (i7 == 0) {
                            return 0;
                        }
                        if (j2 < 0) {
                            return -1;
                        }
                        try {
                            long j3 = this.f38447n;
                            if (j3 != j2) {
                                if (j3 >= 0 && j2 >= j3 + ((long) seekableByteOrderedDataInputStream.available())) {
                                    return -1;
                                }
                                seekableByteOrderedDataInputStream.U(j2);
                                this.f38447n = j2;
                            }
                            if (i7 > seekableByteOrderedDataInputStream.available()) {
                                i7 = seekableByteOrderedDataInputStream.available();
                            }
                            int i8 = seekableByteOrderedDataInputStream.read(bArr, i5, i7);
                            if (i8 >= 0) {
                                this.f38447n += (long) i8;
                                return i8;
                            }
                        } catch (IOException unused) {
                        }
                        this.f38447n = -1L;
                        return -1;
                    }
                });
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                if (strExtractMetadata != null) {
                    this.J2[0].put("ImageWidth", ExifAttribute.J2(Integer.parseInt(strExtractMetadata), this.KN));
                }
                if (strExtractMetadata3 != null) {
                    this.J2[0].put("ImageLength", ExifAttribute.J2(Integer.parseInt(strExtractMetadata3), this.KN));
                }
                if (strExtractMetadata2 != null) {
                    int i5 = Integer.parseInt(strExtractMetadata2);
                    this.J2[0].put("Orientation", ExifAttribute.J2(i5 != 90 ? i5 != 180 ? i5 != 270 ? 1 : 8 : 3 : 6, this.KN));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i7 = Integer.parseInt(strExtractMetadata4);
                    int i8 = Integer.parseInt(strExtractMetadata5);
                    if (i8 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    seekableByteOrderedDataInputStream.U(i7);
                    byte[] bArr = new byte[6];
                    seekableByteOrderedDataInputStream.readFully(bArr);
                    int i9 = i7 + 6;
                    int i10 = i8 - 6;
                    if (!Arrays.equals(bArr, ofS)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i10];
                    seekableByteOrderedDataInputStream.readFully(bArr2);
                    this.ck = i9;
                    wTp(bArr2, 0);
                }
                String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(41);
                String strExtractMetadata9 = mediaMetadataRetriever.extractMetadata(42);
                if (strExtractMetadata8 != null && strExtractMetadata9 != null) {
                    int i11 = Integer.parseInt(strExtractMetadata8);
                    int i12 = Integer.parseInt(strExtractMetadata9);
                    long j2 = i11;
                    seekableByteOrderedDataInputStream.U(j2);
                    byte[] bArr3 = new byte[i12];
                    seekableByteOrderedDataInputStream.readFully(bArr3);
                    this.f38441Z = new ExifAttribute(1, i12, j2, bArr3);
                    this.XQ = true;
                }
                if (f38428S) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata3 + ", rotation " + strExtractMetadata2);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } finally {
            }
        } catch (RuntimeException e2) {
            throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e2);
        }
    }

    public String J2(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        ExifAttribute exifAttributeKN = KN(str);
        if (exifAttributeKN == null) {
            return null;
        }
        if (!str.equals("GPSTimeStamp")) {
            if (!eTf.contains(str)) {
                return exifAttributeKN.mUb(this.KN);
            }
            try {
                return Double.toString(exifAttributeKN.KN(this.KN));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        int i2 = exifAttributeKN.f38454n;
        if (i2 != 5 && i2 != 10) {
            Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + exifAttributeKN.f38454n);
            return null;
        }
        Rational[] rationalArr = (Rational[]) exifAttributeKN.gh(this.KN);
        if (rationalArr == null || rationalArr.length != 3) {
            Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(rationalArr));
            return null;
        }
        Rational rational = rationalArr[0];
        Integer numValueOf = Integer.valueOf((int) (rational.f38458n / rational.rl));
        Rational rational2 = rationalArr[1];
        Integer numValueOf2 = Integer.valueOf((int) (rational2.f38458n / rational2.rl));
        Rational rational3 = rationalArr[2];
        return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (rational3.f38458n / rational3.rl)));
    }

    public int Uo(String str, int i2) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        ExifAttribute exifAttributeKN = KN(str);
        if (exifAttributeKN != null) {
            try {
                return exifAttributeKN.xMQ(this.KN);
            } catch (NumberFormatException unused) {
            }
        }
        return i2;
    }

    public boolean WPU() {
        int iUo = Uo("Orientation", 1);
        return iUo == 2 || iUo == 7 || iUo == 4 || iUo == 5;
    }

    public int ck() {
        switch (Uo("Orientation", 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    private void HI(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) throws Throwable {
        ExifAttribute exifAttribute;
        N(seekableByteOrderedDataInputStream);
        v(seekableByteOrderedDataInputStream, 0);
        M7(seekableByteOrderedDataInputStream, 0);
        M7(seekableByteOrderedDataInputStream, 5);
        M7(seekableByteOrderedDataInputStream, 4);
        p5();
        if (this.nr == 8 && (exifAttribute = (ExifAttribute) this.J2[1].get("MakerNote")) != null) {
            SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream2 = new SeekableByteOrderedDataInputStream(exifAttribute.nr);
            seekableByteOrderedDataInputStream2.T(this.KN);
            seekableByteOrderedDataInputStream2.jB(6);
            v(seekableByteOrderedDataInputStream2, 9);
            ExifAttribute exifAttribute2 = (ExifAttribute) this.J2[9].get("ColorSpace");
            if (exifAttribute2 != null) {
                this.J2[1].put("ColorSpace", exifAttribute2);
            }
        }
    }

    private void N(ByteOrderedDataInputStream byteOrderedDataInputStream) throws IOException {
        ByteOrder byteOrderS7N = s7N(byteOrderedDataInputStream);
        this.KN = byteOrderS7N;
        byteOrderedDataInputStream.T(byteOrderS7N);
        int unsignedShort = byteOrderedDataInputStream.readUnsignedShort();
        int i2 = this.nr;
        if (i2 != 7 && i2 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i3 = byteOrderedDataInputStream.readInt();
        if (i3 >= 8) {
            int i5 = i3 - 8;
            if (i5 > 0) {
                byteOrderedDataInputStream.jB(i5);
                return;
            }
            return;
        }
        throw new IOException("Invalid first Ifd offset: " + i3);
    }

    private void qie(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) throws Throwable {
        int i2;
        int i3;
        HI(seekableByteOrderedDataInputStream);
        ExifAttribute exifAttribute = (ExifAttribute) this.J2[1].get("MakerNote");
        if (exifAttribute != null) {
            SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream2 = new SeekableByteOrderedDataInputStream(exifAttribute.nr);
            seekableByteOrderedDataInputStream2.T(this.KN);
            byte[] bArr = f38429T;
            byte[] bArr2 = new byte[bArr.length];
            seekableByteOrderedDataInputStream2.readFully(bArr2);
            seekableByteOrderedDataInputStream2.U(0L);
            byte[] bArr3 = f38427N;
            byte[] bArr4 = new byte[bArr3.length];
            seekableByteOrderedDataInputStream2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                seekableByteOrderedDataInputStream2.U(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                seekableByteOrderedDataInputStream2.U(12L);
            }
            v(seekableByteOrderedDataInputStream2, 6);
            ExifAttribute exifAttribute2 = (ExifAttribute) this.J2[7].get("PreviewImageStart");
            ExifAttribute exifAttribute3 = (ExifAttribute) this.J2[7].get("PreviewImageLength");
            if (exifAttribute2 != null && exifAttribute3 != null) {
                this.J2[5].put("JPEGInterchangeFormat", exifAttribute2);
                this.J2[5].put(qUrazMnwDskFs.mXNNAiZFs, exifAttribute3);
            }
            ExifAttribute exifAttribute4 = (ExifAttribute) this.J2[8].get("AspectFrame");
            if (exifAttribute4 != null) {
                int[] iArr = (int[]) exifAttribute4.gh(this.KN);
                if (iArr != null && iArr.length == 4) {
                    int i5 = iArr[2];
                    int i7 = iArr[0];
                    if (i5 > i7 && (i2 = iArr[3]) > (i3 = iArr[1])) {
                        int i8 = (i5 - i7) + 1;
                        int i9 = (i2 - i3) + 1;
                        if (i8 < i9) {
                            int i10 = i8 + i9;
                            i9 = i10 - i9;
                            i8 = i10 - i9;
                        }
                        ExifAttribute exifAttributeJ2 = ExifAttribute.J2(i8, this.KN);
                        ExifAttribute exifAttributeJ22 = ExifAttribute.J2(i9, this.KN);
                        this.J2[0].put("ImageWidth", exifAttributeJ2);
                        this.J2[0].put("ImageLength", exifAttributeJ22);
                        return;
                    }
                    return;
                }
                Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
            }
        }
    }

    private ByteOrder s7N(ByteOrderedDataInputStream byteOrderedDataInputStream) throws IOException {
        short s2 = byteOrderedDataInputStream.readShort();
        if (s2 != 18761) {
            if (s2 == 19789) {
                if (f38428S) {
                    Log.d("ExifInterface", "readExifSegment: Byte Align MM");
                }
                return ByteOrder.BIG_ENDIAN;
            }
            throw new IOException("Invalid byte order: " + Integer.toHexString(s2));
        }
        if (f38428S) {
            Log.d("ExifInterface", "readExifSegment: Byte Align II");
        }
        return ByteOrder.LITTLE_ENDIAN;
    }
}
