package androidx.versionedparcelable;

import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.core.database.sqlite.cL.PtsLKY;
import androidx.versionedparcelable.VersionedParcel;
import com.google.android.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@RestrictTo
class VersionedParcelStream extends VersionedParcel {
    private static final Charset az = Charset.forName(C.UTF16_NAME);
    private DataInputStream J2;
    private FieldBuffer KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final DataOutputStream f42341O;
    private DataOutputStream Uo;
    private int gh;
    int mUb;
    private final DataInputStream nr;
    int qie;
    private boolean xMQ;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    private static class FieldBuffer {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final ByteArrayOutputStream f42343n;
        private final DataOutputStream nr;
        final DataOutputStream rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f42344t;

        void n() throws IOException {
            this.rl.flush();
            int size = this.f42343n.size();
            this.nr.writeInt((this.f42344t << 16) | (size >= 65535 ? 65535 : size));
            if (size >= 65535) {
                this.nr.writeInt(size);
            }
            this.f42343n.writeTo(this.nr);
        }

        FieldBuffer(int i2, DataOutputStream dataOutputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.f42343n = byteArrayOutputStream;
            this.rl = new DataOutputStream(byteArrayOutputStream);
            this.f42344t = i2;
            this.nr = dataOutputStream;
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public Parcelable Ik() {
        return null;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean J2() {
        return true;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean az(int i2) {
        while (true) {
            try {
                int i3 = this.gh;
                if (i3 == i2) {
                    return true;
                }
                if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                    return false;
                }
                if (this.mUb < this.qie) {
                    this.nr.skip(r2 - r1);
                }
                this.qie = -1;
                int i5 = this.nr.readInt();
                this.mUb = 0;
                int i7 = i5 & 65535;
                if (i7 == 65535) {
                    i7 = this.nr.readInt();
                }
                this.gh = (i5 >> 16) & 65535;
                this.qie = i7;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected CharSequence gh() {
        return null;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void E2(int i2) {
        try {
            this.Uo.writeInt(i2);
        } catch (IOException e2) {
            throw new VersionedParcel.ParcelException(e2);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public int HI() {
        try {
            return this.J2.readInt();
        } catch (IOException e2) {
            throw new VersionedParcel.ParcelException(e2);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void N(String str) {
        try {
            if (str == null) {
                this.Uo.writeInt(-1);
                return;
            }
            byte[] bytes = str.getBytes(az);
            this.Uo.writeInt(bytes.length);
            this.Uo.write(bytes);
        } catch (IOException e2) {
            throw new VersionedParcel.ParcelException(e2);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean Uo() {
        try {
            return this.J2.readBoolean();
        } catch (IOException e2) {
            throw new VersionedParcel.ParcelException(e2);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void ViF(boolean z2) {
        try {
            this.Uo.writeBoolean(z2);
        } catch (IOException e2) {
            throw new VersionedParcel.ParcelException(e2);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void X(Parcelable parcelable) {
        if (!this.xMQ) {
            throw new RuntimeException(PtsLKY.zYGCANrXU);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void aYN(boolean z2, boolean z3) {
        if (!z2) {
            throw new RuntimeException("Serialization of this object is not allowed");
        }
        this.xMQ = z3;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void g(byte[] bArr) {
        try {
            if (bArr == null) {
                this.Uo.writeInt(-1);
            } else {
                this.Uo.writeInt(bArr.length);
                this.Uo.write(bArr);
            }
        } catch (IOException e2) {
            throw new VersionedParcel.ParcelException(e2);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected void iF(CharSequence charSequence) {
        if (!this.xMQ) {
            throw new RuntimeException("CharSequence cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void n() {
        FieldBuffer fieldBuffer = this.KN;
        if (fieldBuffer != null) {
            try {
                if (fieldBuffer.f42343n.size() != 0) {
                    this.KN.n();
                }
                this.KN = null;
            } catch (IOException e2) {
                throw new VersionedParcel.ParcelException(e2);
            }
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public String o() {
        try {
            int i2 = this.J2.readInt();
            if (i2 <= 0) {
                return null;
            }
            byte[] bArr = new byte[i2];
            this.J2.readFully(bArr);
            return new String(bArr, az);
        } catch (IOException e2) {
            throw new VersionedParcel.ParcelException(e2);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected VersionedParcel rl() {
        return new VersionedParcelStream(this.J2, this.Uo, this.f42338n, this.rl, this.f42339t);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public byte[] xMQ() {
        try {
            int i2 = this.J2.readInt();
            if (i2 <= 0) {
                return null;
            }
            byte[] bArr = new byte[i2];
            this.J2.readFully(bArr);
            return bArr;
        } catch (IOException e2) {
            throw new VersionedParcel.ParcelException(e2);
        }
    }

    private VersionedParcelStream(InputStream inputStream, OutputStream outputStream, ArrayMap arrayMap, ArrayMap arrayMap2, ArrayMap arrayMap3) {
        DataInputStream dataInputStream;
        super(arrayMap, arrayMap2, arrayMap3);
        this.mUb = 0;
        this.gh = -1;
        this.qie = -1;
        if (inputStream != null) {
            dataInputStream = new DataInputStream(new FilterInputStream(inputStream) { // from class: androidx.versionedparcelable.VersionedParcelStream.1
                @Override // java.io.FilterInputStream, java.io.InputStream
                public int read() throws IOException {
                    VersionedParcelStream versionedParcelStream = VersionedParcelStream.this;
                    int i2 = versionedParcelStream.qie;
                    if (i2 != -1 && versionedParcelStream.mUb >= i2) {
                        throw new IOException();
                    }
                    int i3 = super.read();
                    VersionedParcelStream.this.mUb++;
                    return i3;
                }

                @Override // java.io.FilterInputStream, java.io.InputStream
                public long skip(long j2) throws IOException {
                    VersionedParcelStream versionedParcelStream = VersionedParcelStream.this;
                    int i2 = versionedParcelStream.qie;
                    if (i2 != -1 && versionedParcelStream.mUb >= i2) {
                        throw new IOException();
                    }
                    long jSkip = super.skip(j2);
                    if (jSkip > 0) {
                        VersionedParcelStream.this.mUb += (int) jSkip;
                    }
                    return jSkip;
                }

                @Override // java.io.FilterInputStream, java.io.InputStream
                public int read(byte[] bArr, int i2, int i3) throws IOException {
                    VersionedParcelStream versionedParcelStream = VersionedParcelStream.this;
                    int i5 = versionedParcelStream.qie;
                    if (i5 != -1 && versionedParcelStream.mUb >= i5) {
                        throw new IOException();
                    }
                    int i7 = super.read(bArr, i2, i3);
                    if (i7 > 0) {
                        VersionedParcelStream.this.mUb += i7;
                    }
                    return i7;
                }
            });
        } else {
            dataInputStream = null;
        }
        this.nr = dataInputStream;
        DataOutputStream dataOutputStream = outputStream != null ? new DataOutputStream(outputStream) : null;
        this.f42341O = dataOutputStream;
        this.J2 = dataInputStream;
        this.Uo = dataOutputStream;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void WPU(int i2) {
        n();
        FieldBuffer fieldBuffer = new FieldBuffer(i2, this.f42341O);
        this.KN = fieldBuffer;
        this.Uo = fieldBuffer.rl;
    }
}
