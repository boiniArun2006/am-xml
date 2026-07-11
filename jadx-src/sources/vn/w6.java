package vn;

import Hh.C;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class w6 {
    public static long n(InputStream inputStream, long j2) throws IOException {
        boolean z2;
        C.Uo(inputStream);
        if (j2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C.rl(Boolean.valueOf(z2));
        long j3 = j2;
        while (j3 > 0) {
            long jSkip = inputStream.skip(j3);
            if (jSkip <= 0) {
                if (inputStream.read() != -1) {
                    jSkip = 1;
                } else {
                    return j2 - j3;
                }
            }
            j3 -= jSkip;
        }
        return j2;
    }
}
