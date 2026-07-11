package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class ByteBufferReadWriteBuf implements ReadWriteBuf {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ByteBuffer f38368n;

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public byte get(int i2) {
        return this.f38368n.get(i2);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public double getDouble(int i2) {
        return this.f38368n.getDouble(i2);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public float getFloat(int i2) {
        return this.f38368n.getFloat(i2);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public int getInt(int i2) {
        return this.f38368n.getInt(i2);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public long getLong(int i2) {
        return this.f38368n.getLong(i2);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public short getShort(int i2) {
        return this.f38368n.getShort(i2);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public String n(int i2, int i3) {
        return Utf8Safe.t(this.f38368n, i2, i3);
    }
}
