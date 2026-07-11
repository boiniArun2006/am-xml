package androidx.emoji2.text.flatbuffer;

import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class ArrayReadWriteBuf implements ReadWriteBuf {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte[] f38367n;
    private int rl;

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public byte get(int i2) {
        return this.f38367n[i2];
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public int getInt(int i2) {
        byte[] bArr = this.f38367n;
        return (bArr[i2] & UByte.MAX_VALUE) | (bArr[i2 + 3] << 24) | ((bArr[i2 + 2] & UByte.MAX_VALUE) << 16) | ((bArr[i2 + 1] & UByte.MAX_VALUE) << 8);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public long getLong(int i2) {
        byte[] bArr = this.f38367n;
        int i3 = i2 + 6;
        return (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i3]) & 255) << 48) | (((long) bArr[i2 + 7]) << 56);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public short getShort(int i2) {
        byte[] bArr = this.f38367n;
        return (short) ((bArr[i2] & UByte.MAX_VALUE) | (bArr[i2 + 1] << 8));
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public String n(int i2, int i3) {
        return Utf8Safe.rl(this.f38367n, i2, i3);
    }

    public ArrayReadWriteBuf(byte[] bArr, int i2) {
        this.f38367n = bArr;
        this.rl = i2;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public double getDouble(int i2) {
        return Double.longBitsToDouble(getLong(i2));
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public float getFloat(int i2) {
        return Float.intBitsToFloat(getInt(i2));
    }
}
