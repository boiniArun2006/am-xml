package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class MetadataItem extends Table {

    public static final class Vector extends BaseVector {
    }

    public int az() {
        int iRl = rl(4);
        if (iRl != 0) {
            return this.rl.getInt(iRl + this.f38384n);
        }
        return 0;
    }

    public boolean gh() {
        int iRl = rl(6);
        return (iRl == 0 || this.rl.get(iRl + this.f38384n) == 0) ? false : true;
    }

    public short HI() {
        int iRl = rl(12);
        if (iRl != 0) {
            return this.rl.getShort(iRl + this.f38384n);
        }
        return (short) 0;
    }

    public int mUb() {
        int iRl = rl(16);
        if (iRl != 0) {
            return O(iRl);
        }
        return 0;
    }

    public short qie() {
        int iRl = rl(14);
        if (iRl != 0) {
            return this.rl.getShort(iRl + this.f38384n);
        }
        return (short) 0;
    }

    public short ty() {
        int iRl = rl(8);
        if (iRl != 0) {
            return this.rl.getShort(iRl + this.f38384n);
        }
        return (short) 0;
    }

    public int xMQ(int i2) {
        int iRl = rl(16);
        if (iRl != 0) {
            return this.rl.getInt(nr(iRl) + (i2 * 4));
        }
        return 0;
    }

    public void KN(int i2, ByteBuffer byteBuffer) {
        t(i2, byteBuffer);
    }

    public MetadataItem Uo(int i2, ByteBuffer byteBuffer) {
        KN(i2, byteBuffer);
        return this;
    }
}
