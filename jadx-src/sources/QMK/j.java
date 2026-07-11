package QMK;

import JP.Ew;
import JP.l3D;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.KH;
import com.google.protobuf.yg;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class j extends InputStream implements l3D, Ew {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private ByteArrayInputStream f8044O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private yg f8045n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final KH f8046t;

    @Override // java.io.InputStream
    public int read() {
        if (this.f8045n != null) {
            this.f8044O = new ByteArrayInputStream(this.f8045n.toByteArray());
            this.f8045n = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f8044O;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    KH Uo() {
        return this.f8046t;
    }

    @Override // java.io.InputStream
    public int available() {
        yg ygVar = this.f8045n;
        if (ygVar != null) {
            return ygVar.getSerializedSize();
        }
        ByteArrayInputStream byteArrayInputStream = this.f8044O;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    @Override // JP.l3D
    public int n(OutputStream outputStream) throws IOException {
        yg ygVar = this.f8045n;
        if (ygVar != null) {
            int serializedSize = ygVar.getSerializedSize();
            this.f8045n.writeTo(outputStream);
            this.f8045n = null;
            return serializedSize;
        }
        ByteArrayInputStream byteArrayInputStream = this.f8044O;
        if (byteArrayInputStream == null) {
            return 0;
        }
        int iN = (int) n.n(byteArrayInputStream, outputStream);
        this.f8044O = null;
        return iN;
    }

    yg rl() {
        yg ygVar = this.f8045n;
        if (ygVar != null) {
            return ygVar;
        }
        throw new IllegalStateException("message not available");
    }

    j(yg ygVar, KH kh) {
        this.f8045n = ygVar;
        this.f8046t = kh;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        yg ygVar = this.f8045n;
        if (ygVar != null) {
            int serializedSize = ygVar.getSerializedSize();
            if (serializedSize == 0) {
                this.f8045n = null;
                this.f8044O = null;
                return -1;
            }
            if (i3 >= serializedSize) {
                CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(bArr, i2, serializedSize);
                this.f8045n.writeTo(codedOutputStreamNewInstance);
                codedOutputStreamNewInstance.flush();
                codedOutputStreamNewInstance.checkNoSpaceLeft();
                this.f8045n = null;
                this.f8044O = null;
                return serializedSize;
            }
            this.f8044O = new ByteArrayInputStream(this.f8045n.toByteArray());
            this.f8045n = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f8044O;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i2, i3);
        }
        return -1;
    }
}
