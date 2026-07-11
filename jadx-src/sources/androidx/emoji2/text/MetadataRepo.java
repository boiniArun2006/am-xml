package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.annotation.AnyThread;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.os.TraceCompat;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.flatbuffer.MetadataList;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@AnyThread
@RequiresApi
public final class MetadataRepo {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final MetadataList f38353n;
    private final Typeface nr;
    private final char[] rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Node f38354t = new Node(1024);

    @RestrictTo
    static class Node {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final SparseArray f38355n;
        private TypefaceEmojiRasterizer rl;

        private Node() {
            this(1);
        }

        Node(int i2) {
            this.f38355n = new SparseArray(i2);
        }

        Node n(int i2) {
            SparseArray sparseArray = this.f38355n;
            if (sparseArray == null) {
                return null;
            }
            return (Node) sparseArray.get(i2);
        }

        final TypefaceEmojiRasterizer rl() {
            return this.rl;
        }

        void t(TypefaceEmojiRasterizer typefaceEmojiRasterizer, int i2, int i3) {
            Node nodeN = n(typefaceEmojiRasterizer.rl(i2));
            if (nodeN == null) {
                nodeN = new Node();
                this.f38355n.put(typefaceEmojiRasterizer.rl(i2), nodeN);
            }
            if (i3 > i2) {
                nodeN.t(typefaceEmojiRasterizer, i2 + 1, i3);
            } else {
                nodeN.rl = typefaceEmojiRasterizer;
            }
        }
    }

    public static MetadataRepo rl(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            TraceCompat.n("EmojiCompat.MetadataRepo.create");
            return new MetadataRepo(typeface, MetadataListReader.rl(byteBuffer));
        } finally {
            TraceCompat.rl();
        }
    }

    Node J2() {
        return this.f38354t;
    }

    void KN(TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        Preconditions.KN(typefaceEmojiRasterizer, "emoji metadata cannot be null");
        Preconditions.rl(typefaceEmojiRasterizer.t() > 0, "invalid metadata codepoint length");
        this.f38354t.t(typefaceEmojiRasterizer, 0, typefaceEmojiRasterizer.t() - 1);
    }

    int O() {
        return this.f38353n.az();
    }

    Typeface Uo() {
        return this.nr;
    }

    public MetadataList nr() {
        return this.f38353n;
    }

    public char[] t() {
        return this.rl;
    }

    private MetadataRepo(Typeface typeface, MetadataList metadataList) {
        this.nr = typeface;
        this.f38353n = metadataList;
        this.rl = new char[metadataList.qie() * 2];
        n(metadataList);
    }

    private void n(MetadataList metadataList) {
        int iQie = metadataList.qie();
        for (int i2 = 0; i2 < iQie; i2++) {
            TypefaceEmojiRasterizer typefaceEmojiRasterizer = new TypefaceEmojiRasterizer(this, i2);
            Character.toChars(typefaceEmojiRasterizer.J2(), this.rl, i2 * 2);
            KN(typefaceEmojiRasterizer);
        }
    }
}
