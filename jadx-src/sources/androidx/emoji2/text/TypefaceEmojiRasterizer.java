package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.annotation.AnyThread;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.flatbuffer.MetadataItem;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@AnyThread
@RequiresApi
public class TypefaceEmojiRasterizer {
    private static final ThreadLocal nr = new ThreadLocal();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f38361n;
    private final MetadataRepo rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile int f38362t = 0;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface HasGlyph {
    }

    private MetadataItem Uo() {
        ThreadLocal threadLocal = nr;
        MetadataItem metadataItem = (MetadataItem) threadLocal.get();
        if (metadataItem == null) {
            metadataItem = new MetadataItem();
            threadLocal.set(metadataItem);
        }
        this.rl.nr().gh(metadataItem, this.f38361n);
        return metadataItem;
    }

    public void az(boolean z2) {
        int i2 = this.f38362t & 4;
        this.f38362t = z2 ? i2 | 2 : i2 | 1;
    }

    public boolean gh() {
        return (this.f38362t & 4) > 0;
    }

    public void n(Canvas canvas, float f3, float f4, Paint paint) {
        Typeface typefaceUo = this.rl.Uo();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(typefaceUo);
        canvas.drawText(this.rl.t(), this.f38361n * 2, 2, f3, f4, paint);
        paint.setTypeface(typeface);
    }

    public int nr() {
        return this.f38362t & 3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(J2()));
        sb.append(", codepoints:");
        int iT = t();
        for (int i2 = 0; i2 < iT; i2++) {
            sb.append(Integer.toHexString(rl(i2)));
            sb.append(" ");
        }
        return sb.toString();
    }

    TypefaceEmojiRasterizer(MetadataRepo metadataRepo, int i2) {
        this.rl = metadataRepo;
        this.f38361n = i2;
    }

    public int J2() {
        return Uo().az();
    }

    public short KN() {
        return Uo().ty();
    }

    public int O() {
        return Uo().qie();
    }

    public boolean mUb() {
        return Uo().gh();
    }

    public void qie(boolean z2) {
        int iNr = nr();
        if (z2) {
            this.f38362t = iNr | 4;
        } else {
            this.f38362t = iNr;
        }
    }

    public int rl(int i2) {
        return Uo().xMQ(i2);
    }

    public int t() {
        return Uo().mUb();
    }

    public int xMQ() {
        return Uo().HI();
    }
}
