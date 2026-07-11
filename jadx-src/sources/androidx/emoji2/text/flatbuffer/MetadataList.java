package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class MetadataList extends Table {

    public static final class Vector extends BaseVector {
    }

    public int az() {
        int iRl = rl(4);
        if (iRl != 0) {
            return this.rl.getInt(iRl + this.f38384n);
        }
        return 0;
    }

    public MetadataItem gh(MetadataItem metadataItem, int i2) {
        int iRl = rl(6);
        if (iRl != 0) {
            return metadataItem.Uo(n(nr(iRl) + (i2 * 4)), this.rl);
        }
        return null;
    }

    public int qie() {
        int iRl = rl(6);
        if (iRl != 0) {
            return O(iRl);
        }
        return 0;
    }

    public static MetadataList mUb(ByteBuffer byteBuffer, MetadataList metadataList) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return metadataList.Uo(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static MetadataList xMQ(ByteBuffer byteBuffer) {
        return mUb(byteBuffer, new MetadataList());
    }

    public void KN(int i2, ByteBuffer byteBuffer) {
        t(i2, byteBuffer);
    }

    public MetadataList Uo(int i2, ByteBuffer byteBuffer) {
        KN(i2, byteBuffer);
        return this;
    }
}
