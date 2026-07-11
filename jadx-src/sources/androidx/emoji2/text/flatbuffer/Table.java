package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.util.Comparator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class Table {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Utf8 f38383O = Utf8.n();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected int f38384n;
    private int nr;
    protected ByteBuffer rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f38385t;

    /* JADX INFO: renamed from: androidx.emoji2.text.flatbuffer.Table$1, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    class AnonymousClass1 implements Comparator<Integer> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f38386n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Table f38387t;

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public int compare(Integer num, Integer num2) {
            return this.f38387t.J2(num, num2, this.f38386n);
        }
    }

    protected int J2(Integer num, Integer num2, ByteBuffer byteBuffer) {
        return 0;
    }

    protected int O(int i2) {
        int i3 = i2 + this.f38384n;
        return this.rl.getInt(i3 + this.rl.getInt(i3));
    }

    protected int n(int i2) {
        return i2 + this.rl.getInt(i2);
    }

    protected int nr(int i2) {
        int i3 = i2 + this.f38384n;
        return i3 + this.rl.getInt(i3) + 4;
    }

    protected int rl(int i2) {
        if (i2 < this.nr) {
            return this.rl.getShort(this.f38385t + i2);
        }
        return 0;
    }

    protected void t(int i2, ByteBuffer byteBuffer) {
        this.rl = byteBuffer;
        if (byteBuffer == null) {
            this.f38384n = 0;
            this.f38385t = 0;
            this.nr = 0;
        } else {
            this.f38384n = i2;
            int i3 = i2 - byteBuffer.getInt(i2);
            this.f38385t = i3;
            this.nr = this.rl.getShort(i3);
        }
    }
}
