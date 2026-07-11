package k6;

import FQq.AbstractC1347z;
import FQq.Dsr;
import FQq.ci;
import android.content.Context;
import android.util.Pair;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CN3 f69652n;
    private final Wre rl;

    private Dsr n(Context context, String str, String str2) {
        CN3 cn3;
        Pair pairN;
        ci ciVarTe;
        if (str2 == null || (cn3 = this.f69652n) == null || (pairN = cn3.n(str)) == null) {
            return null;
        }
        w6 w6Var = (w6) pairN.first;
        InputStream inputStream = (InputStream) pairN.second;
        int i2 = j.f69653n[w6Var.ordinal()];
        if (i2 == 1) {
            ciVarTe = AbstractC1347z.te(context, new ZipInputStream(inputStream), str2);
        } else if (i2 != 2) {
            ciVarTe = AbstractC1347z.ck(inputStream, str2);
        } else {
            try {
                ciVarTe = AbstractC1347z.ck(new GZIPInputStream(inputStream), str2);
            } catch (IOException e2) {
                ciVarTe = new ci((Throwable) e2);
            }
        }
        if (ciVarTe.rl() != null) {
            return (Dsr) ciVarTe.rl();
        }
        return null;
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f69653n;

        static {
            int[] iArr = new int[w6.values().length];
            f69653n = iArr;
            try {
                iArr[w6.ZIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69653n[w6.GZIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private ci J2(String str, InputStream inputStream, String str2) {
        CN3 cn3;
        return (str2 == null || (cn3 = this.f69652n) == null) ? AbstractC1347z.ck(inputStream, null) : AbstractC1347z.ck(new FileInputStream(cn3.Uo(str, inputStream, w6.JSON).getAbsolutePath()), str);
    }

    private ci O(Context context, String str, InputStream inputStream, String str2, String str3) {
        ci ciVarUo;
        w6 w6Var;
        CN3 cn3;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            x0.CN3.n("Handling zip response.");
            w6 w6Var2 = w6.ZIP;
            ciVarUo = Uo(context, str, inputStream, str3);
            w6Var = w6Var2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            x0.CN3.n("Handling gzip response.");
            w6Var = w6.GZIP;
            ciVarUo = nr(str, inputStream, str3);
        } else {
            x0.CN3.n("Received json response.");
            w6Var = w6.JSON;
            ciVarUo = J2(str, inputStream, str3);
        }
        if (str3 != null && ciVarUo.rl() != null && (cn3 = this.f69652n) != null) {
            cn3.J2(str, w6Var);
        }
        return ciVarUo;
    }

    private ci Uo(Context context, String str, InputStream inputStream, String str2) {
        CN3 cn3;
        return (str2 == null || (cn3 = this.f69652n) == null) ? AbstractC1347z.te(context, new ZipInputStream(inputStream), null) : AbstractC1347z.te(context, new ZipInputStream(new FileInputStream(cn3.Uo(str, inputStream, w6.ZIP))), str);
    }

    private ci nr(String str, InputStream inputStream, String str2) {
        CN3 cn3;
        return (str2 == null || (cn3 = this.f69652n) == null) ? AbstractC1347z.ck(new GZIPInputStream(inputStream), null) : AbstractC1347z.ck(new GZIPInputStream(new FileInputStream(cn3.Uo(str, inputStream, w6.GZIP))), str);
    }

    private ci rl(Context context, String str, String str2) {
        x0.CN3.n("Fetching " + str);
        Closeable closeable = null;
        try {
            try {
                Ml mlN = this.rl.n(str);
                if (!mlN.isSuccessful()) {
                    ci ciVar = new ci((Throwable) new IllegalArgumentException(mlN.ul()));
                    try {
                        mlN.close();
                        return ciVar;
                    } catch (IOException e2) {
                        x0.CN3.nr("LottieFetchResult close failed ", e2);
                        return ciVar;
                    }
                }
                ci ciVarO = O(context, str, mlN.bzg(), mlN.nHg(), str2);
                StringBuilder sb = new StringBuilder();
                sb.append("Completed fetch from network. Success: ");
                sb.append(ciVarO.rl() != null);
                x0.CN3.n(sb.toString());
                try {
                    mlN.close();
                    return ciVarO;
                } catch (IOException e3) {
                    x0.CN3.nr("LottieFetchResult close failed ", e3);
                    return ciVarO;
                }
            } catch (Exception e4) {
                ci ciVar2 = new ci((Throwable) e4);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e5) {
                        x0.CN3.nr("LottieFetchResult close failed ", e5);
                    }
                }
                return ciVar2;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                throw th;
            }
            try {
                closeable.close();
                throw th;
            } catch (IOException e6) {
                x0.CN3.nr("LottieFetchResult close failed ", e6);
                throw th;
            }
        }
    }

    public fuX(CN3 cn3, Wre wre) {
        this.f69652n = cn3;
        this.rl = wre;
    }

    public ci t(Context context, String str, String str2) {
        Dsr dsrN = n(context, str, str2);
        if (dsrN != null) {
            return new ci(dsrN);
        }
        x0.CN3.n("Animation for " + str + " not found in cache. Fetching from network.");
        return rl(context, str, str2);
    }
}
