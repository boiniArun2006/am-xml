package f6d;

import android.graphics.Bitmap;
import java.io.InputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface j {

    /* JADX INFO: renamed from: f6d.j$j, reason: collision with other inner class name */
    public interface InterfaceC0917j {
        void J2(int[] iArr);

        void O(byte[] bArr);

        void n(Bitmap bitmap);

        int[] nr(int i2);

        byte[] rl(int i2);

        Bitmap t(int i2, int i3, Bitmap.Config config);
    }

    void J2();

    int O(int i2);

    int Uo();

    void clear();

    int getHeight();

    int getStatus();

    int getWidth();

    int n();

    void nr();

    int rl(InputStream inputStream, int i2);

    Bitmap t();
}
