package Y48;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class l3D {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final File f12013n;
    private int rl;

    public l3D(File data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f12013n = data;
        try {
            this.rl = new ZipFile(data).size();
        } catch (Exception e2) {
            this.rl = 0;
            e2.printStackTrace();
        }
    }

    public final Bitmap n(int i2) {
        ZipInputStream zipInputStream;
        ZipEntry nextEntry;
        int i3;
        if (i2 >= this.rl) {
            return null;
        }
        try {
            zipInputStream = new ZipInputStream(new FileInputStream(this.f12013n));
            nextEntry = zipInputStream.getNextEntry();
            i3 = 0;
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
        while (nextEntry != null) {
            if (!nextEntry.isDirectory()) {
                if (i3 == i2) {
                    return BitmapFactory.decodeStream(zipInputStream);
                }
                i3++;
                nextEntry = zipInputStream.getNextEntry();
                return null;
            }
        }
        return null;
    }

    public final int rl() {
        return this.rl;
    }
}
