package androidx.browser.trusted;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class TokenContents {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final byte[] f14613n;
    private String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List f14614t;

    /* JADX INFO: Access modifiers changed from: private */
    public static int rl(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return 0;
        }
        if (bArr == null) {
            return -1;
        }
        if (bArr2 == null) {
            return 1;
        }
        for (int i2 = 0; i2 < Math.min(bArr.length, bArr2.length); i2++) {
            byte b2 = bArr[i2];
            byte b4 = bArr2[i2];
            if (b2 != b4) {
                return b2 - b4;
            }
        }
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        return 0;
    }

    private void Uo() throws IOException {
        if (this.rl != null) {
            return;
        }
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(this.f14613n));
        this.rl = dataInputStream.readUTF();
        int i2 = dataInputStream.readInt();
        this.f14614t = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            int i5 = dataInputStream.readInt();
            byte[] bArr = new byte[i5];
            if (dataInputStream.read(bArr) != i5) {
                throw new IllegalStateException("Could not read fingerprint");
            }
            this.f14614t.add(bArr);
        }
    }

    private static byte[] nr(String str, List list) throws IOException {
        Collections.sort(list, new Comparator() { // from class: androidx.browser.trusted.Wre
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return TokenContents.rl((byte[]) obj, (byte[]) obj2);
            }
        });
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeUTF(str);
        dataOutputStream.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            byte[] bArr = (byte[]) it.next();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
        dataOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    static TokenContents t(String str, List list) {
        return new TokenContents(nr(str, list), str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TokenContents.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f14613n, ((TokenContents) obj).f14613n);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f14613n);
    }

    private TokenContents(byte[] bArr, String str, List list) {
        this.f14613n = bArr;
        this.rl = str;
        this.f14614t = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            this.f14614t.add(Arrays.copyOf(bArr2, bArr2.length));
        }
    }

    public String J2() throws IOException {
        Uo();
        String str = this.rl;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException();
    }

    public byte[] O(int i2) throws IOException {
        Uo();
        List list = this.f14614t;
        if (list != null) {
            return Arrays.copyOf((byte[]) list.get(i2), ((byte[]) this.f14614t.get(i2)).length);
        }
        throw new IllegalStateException();
    }
}
