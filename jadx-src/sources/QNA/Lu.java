package QNA;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
abstract class Lu {
    private static void n(InputStream inputStream, File file) throws Throwable {
        if (inputStream == null) {
            return;
        }
        byte[] bArr = new byte[8192];
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            while (true) {
                try {
                    int i2 = inputStream.read(bArr);
                    if (i2 <= 0) {
                        gZIPOutputStream2.finish();
                        Dsr.Uo(gZIPOutputStream2);
                        return;
                    }
                    gZIPOutputStream2.write(bArr, 0, i2);
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    Dsr.Uo(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    static void rl(File file, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vd vdVar = (vd) it.next();
            InputStream stream = null;
            try {
                stream = vdVar.getStream();
                if (stream != null) {
                    n(stream, new File(file, vdVar.rl()));
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                Dsr.Uo(null);
                throw th;
            }
            Dsr.Uo(stream);
        }
    }
}
