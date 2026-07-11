package IRN;

import com.caoccao.javet.values.reference.V8ValueTypedArray;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
class fuX implements Closeable {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final Logger f4218Z = Logger.getLogger(fuX.class.getName());
    private n J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f4219O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final RandomAccessFile f4220n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final byte[] f4221o = new byte[16];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private n f4222r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f4223t;

    public interface Ml {
        void rl(InputStream inputStream, int i2);
    }

    class j implements Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f4224n = true;
        final /* synthetic */ StringBuilder rl;

        j(StringBuilder sb) {
            this.rl = sb;
        }

        @Override // IRN.fuX.Ml
        public void rl(InputStream inputStream, int i2) {
            if (this.f4224n) {
                this.f4224n = false;
            } else {
                this.rl.append(", ");
            }
            this.rl.append(i2);
        }
    }

    static class n {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        static final n f4226t = new n(0, 0);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final int f4227n;
        final int rl;

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f4227n + ", length = " + this.rl + "]";
        }

        n(int i2, int i3) {
            this.f4227n = i2;
            this.rl = i3;
        }
    }

    private final class w6 extends InputStream {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f4229n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f4230t;

        /* synthetic */ w6(fuX fux, n nVar, j jVar) {
            this(nVar);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) throws IOException {
            fuX.M(bArr, V8ValueTypedArray.PROPERTY_BUFFER);
            if ((i2 | i3) < 0 || i3 > bArr.length - i2) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i5 = this.f4230t;
            if (i5 <= 0) {
                return -1;
            }
            if (i3 > i5) {
                i3 = i5;
            }
            fuX.this.qm(this.f4229n, bArr, i2, i3);
            this.f4229n = fuX.this.How(this.f4229n + i3);
            this.f4230t -= i3;
            return i3;
        }

        private w6(n nVar) {
            this.f4229n = fuX.this.How(nVar.f4227n + 4);
            this.f4230t = nVar.rl;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f4230t == 0) {
                return -1;
            }
            fuX.this.f4220n.seek(this.f4229n);
            int i2 = fuX.this.f4220n.read();
            this.f4229n = fuX.this.How(this.f4229n + 1);
            this.f4230t--;
            return i2;
        }
    }

    private static void p0N(byte[] bArr, int... iArr) {
        int i2 = 0;
        for (int i3 : iArr) {
            Bu(bArr, i2, i3);
            i2 += 4;
        }
    }

    public synchronized void M7(Ml ml) {
        int iHow = this.J2.f4227n;
        for (int i2 = 0; i2 < this.f4219O; i2++) {
            n nVarA = a(iHow);
            ml.rl(new w6(this, nVarA, null), nVarA.rl);
            iHow = How(nVarA.f4227n + 4 + nVarA.rl);
        }
    }

    public void T(byte[] bArr) {
        jB(bArr, 0, bArr.length);
    }

    public synchronized void clear() {
        try {
            T3L(4096, 0, 0, 0);
            this.f4219O = 0;
            n nVar = n.f4226t;
            this.J2 = nVar;
            this.f4222r = nVar;
            if (this.f4223t > 4096) {
                GD(4096);
            }
            this.f4223t = 4096;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f4220n.close();
    }

    public synchronized boolean eF() {
        return this.f4219O == 0;
    }

    public synchronized void jB(byte[] bArr, int i2, int i3) {
        int iHow;
        try {
            M(bArr, V8ValueTypedArray.PROPERTY_BUFFER);
            if ((i2 | i3) < 0 || i3 > bArr.length - i2) {
                throw new IndexOutOfBoundsException();
            }
            U(i3);
            boolean zEF = eF();
            if (zEF) {
                iHow = 16;
            } else {
                n nVar = this.f4222r;
                iHow = How(nVar.f4227n + 4 + nVar.rl);
            }
            n nVar2 = new n(iHow, i3);
            Bu(this.f4221o, 0, i3);
            Org(nVar2.f4227n, this.f4221o, 0, 4);
            Org(nVar2.f4227n + 4, bArr, i2, i3);
            T3L(this.f4223t, this.f4219O + 1, zEF ? nVar2.f4227n : this.J2.f4227n, nVar2.f4227n);
            this.f4222r = nVar2;
            this.f4219O++;
            if (zEF) {
                this.J2 = nVar2;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void n1() {
        try {
            if (eF()) {
                throw new NoSuchElementException();
            }
            if (this.f4219O == 1) {
                clear();
            } else {
                n nVar = this.J2;
                int iHow = How(nVar.f4227n + 4 + nVar.rl);
                qm(iHow, this.f4221o, 0, 4);
                int iMx = Mx(this.f4221o, 0);
                T3L(this.f4223t, this.f4219O - 1, iHow, this.f4222r.f4227n);
                this.f4219O--;
                this.J2 = new n(iHow, iMx);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private static void Bu(byte[] bArr, int i2, int i3) {
        bArr[i2] = (byte) (i3 >> 24);
        bArr[i2 + 1] = (byte) (i3 >> 16);
        bArr[i2 + 2] = (byte) (i3 >> 8);
        bArr[i2 + 3] = (byte) i3;
    }

    private static RandomAccessFile FX(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    private void GD(int i2) throws IOException {
        this.f4220n.setLength(i2);
        this.f4220n.getChannel().force(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int How(int i2) {
        int i3 = this.f4223t;
        return i2 < i3 ? i2 : (i2 + 16) - i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object M(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    private static int Mx(byte[] bArr, int i2) {
        return ((bArr[i2] & UByte.MAX_VALUE) << 24) + ((bArr[i2 + 1] & UByte.MAX_VALUE) << 16) + ((bArr[i2 + 2] & UByte.MAX_VALUE) << 8) + (bArr[i2 + 3] & UByte.MAX_VALUE);
    }

    private void T3L(int i2, int i3, int i5, int i7) throws IOException {
        p0N(this.f4221o, i2, i3, i5, i7);
        this.f4220n.seek(0L);
        this.f4220n.write(this.f4221o);
    }

    private void U(int i2) throws IOException {
        int i3 = i2 + 4;
        int iFcU = fcU();
        if (iFcU >= i3) {
            return;
        }
        int i5 = this.f4223t;
        do {
            iFcU += i5;
            i5 <<= 1;
        } while (iFcU < i3);
        GD(i5);
        n nVar = this.f4222r;
        int iHow = How(nVar.f4227n + 4 + nVar.rl);
        if (iHow < this.J2.f4227n) {
            FileChannel channel = this.f4220n.getChannel();
            channel.position(this.f4223t);
            long j2 = iHow - 4;
            if (channel.transferTo(16L, j2, channel) != j2) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i7 = this.f4222r.f4227n;
        int i8 = this.J2.f4227n;
        if (i7 < i8) {
            int i9 = (this.f4223t + i7) - 16;
            T3L(i5, this.f4219O, i8, i9);
            this.f4222r = new n(i9, this.f4222r.rl);
        } else {
            T3L(i5, this.f4219O, i8, i7);
        }
        this.f4223t = i5;
    }

    private n a(int i2) throws IOException {
        if (i2 == 0) {
            return n.f4226t;
        }
        this.f4220n.seek(i2);
        return new n(i2, this.f4220n.readInt());
    }

    private int fcU() {
        return this.f4223t - K();
    }

    private static void p5(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile randomAccessFileFX = FX(file2);
        try {
            randomAccessFileFX.setLength(4096L);
            randomAccessFileFX.seek(0L);
            byte[] bArr = new byte[16];
            p0N(bArr, 4096, 0, 0, 0);
            randomAccessFileFX.write(bArr);
            randomAccessFileFX.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            randomAccessFileFX.close();
            throw th;
        }
    }

    private void z() throws IOException {
        this.f4220n.seek(0L);
        this.f4220n.readFully(this.f4221o);
        int iMx = Mx(this.f4221o, 0);
        this.f4223t = iMx;
        if (iMx <= this.f4220n.length()) {
            this.f4219O = Mx(this.f4221o, 4);
            int iMx2 = Mx(this.f4221o, 8);
            int iMx3 = Mx(this.f4221o, 12);
            this.J2 = a(iMx2);
            this.f4222r = a(iMx3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f4223t + ", Actual length: " + this.f4220n.length());
    }

    public int K() {
        if (this.f4219O == 0) {
            return 16;
        }
        n nVar = this.f4222r;
        int i2 = nVar.f4227n;
        int i3 = this.J2.f4227n;
        return i2 >= i3 ? (i2 - i3) + 4 + nVar.rl + 16 : (((i2 + 4) + nVar.rl) + this.f4223t) - i3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f4223t);
        sb.append(", size=");
        sb.append(this.f4219O);
        sb.append(", first=");
        sb.append(this.J2);
        sb.append(", last=");
        sb.append(this.f4222r);
        sb.append(", element lengths=[");
        try {
            M7(new j(sb));
        } catch (IOException e2) {
            f4218Z.log(Level.WARNING, "read error", (Throwable) e2);
        }
        sb.append("]]");
        return sb.toString();
    }

    public fuX(File file) throws IOException {
        if (!file.exists()) {
            p5(file);
        }
        this.f4220n = FX(file);
        z();
    }

    private void Org(int i2, byte[] bArr, int i3, int i5) throws IOException {
        int iHow = How(i2);
        int i7 = iHow + i5;
        int i8 = this.f4223t;
        if (i7 <= i8) {
            this.f4220n.seek(iHow);
            this.f4220n.write(bArr, i3, i5);
            return;
        }
        int i9 = i8 - iHow;
        this.f4220n.seek(iHow);
        this.f4220n.write(bArr, i3, i9);
        this.f4220n.seek(16L);
        this.f4220n.write(bArr, i3 + i9, i5 - i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qm(int i2, byte[] bArr, int i3, int i5) throws IOException {
        int iHow = How(i2);
        int i7 = iHow + i5;
        int i8 = this.f4223t;
        if (i7 <= i8) {
            this.f4220n.seek(iHow);
            this.f4220n.readFully(bArr, i3, i5);
            return;
        }
        int i9 = i8 - iHow;
        this.f4220n.seek(iHow);
        this.f4220n.readFully(bArr, i3, i9);
        this.f4220n.seek(16L);
        this.f4220n.readFully(bArr, i3 + i9, i5 - i9);
    }
}
