package com.safedk.android.a;

import android.os.Build;
import com.safedk.android.utils.Logger;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f61245a = "MultipartUtility";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f61246c = "\r\n";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f61247b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f61248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f61249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final OutputStream f61250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final PrintWriter f61251g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f61252h = 0;

    public d(String str, String str2, String str3, int i2, Map<String, String> map) throws IOException {
        Logger.d(f61245a, "ctor started, requestURL = ", str2);
        this.f61249e = str3;
        this.f61247b = "BOUNDARY-BOUNDARY" + System.currentTimeMillis() + "BOUNDARY";
        f fVar = new f(new URL(str2).openConnection());
        this.f61248d = fVar;
        fVar.a(str);
        this.f61248d.a(false);
        this.f61248d.b(true);
        this.f61248d.d(true);
        this.f61248d.a("Content-Type", "multipart/form-data; boundary=" + this.f61247b);
        this.f61248d.a("User-Agent", "AppLovinQualityService/5.11.2 (Android " + Build.VERSION.RELEASE + ")");
        this.f61248d.a("Accept-Encoding", "gzip,deflate");
        this.f61248d.a("Connection", MRAIDPresenter.CLOSE);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.f61248d.a(entry.getKey(), entry.getValue());
        }
        this.f61248d.a(i2);
        this.f61248d.b(i2);
        this.f61250f = this.f61248d.a();
        this.f61251g = new PrintWriter((Writer) new OutputStreamWriter(this.f61250f, str3), true);
    }

    public void a(String str, String str2) {
        this.f61251g.append((CharSequence) "--").append((CharSequence) this.f61247b).append((CharSequence) f61246c);
        this.f61251g.append((CharSequence) "Content-Disposition: form-data; name=\"").append((CharSequence) str).append((CharSequence) "\"").append((CharSequence) f61246c);
        this.f61251g.append((CharSequence) "Content-Type: text/plain; charset=").append((CharSequence) this.f61249e).append((CharSequence) f61246c);
        this.f61251g.append((CharSequence) f61246c);
        this.f61251g.append((CharSequence) str2).append((CharSequence) f61246c);
        this.f61251g.flush();
    }

    public void a(String str, File file, boolean z2) throws IOException {
        String name = file.getName();
        if (z2) {
            this.f61251g.append((CharSequence) "--").append((CharSequence) this.f61247b).append((CharSequence) f61246c);
            this.f61251g.append((CharSequence) "Content-Disposition: form-data; name=\"").append((CharSequence) str).append((CharSequence) "\"; filename=\"").append((CharSequence) name).append((CharSequence) "\"").append((CharSequence) f61246c);
            this.f61251g.append((CharSequence) "Content-Type: application/octet-stream").append((CharSequence) f61246c);
            this.f61251g.append((CharSequence) f61246c);
        }
        this.f61251g.flush();
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[4096];
        while (true) {
            int i2 = fileInputStream.read(bArr);
            if (i2 != -1) {
                this.f61250f.write(bArr, 0, i2);
            } else {
                this.f61250f.flush();
                fileInputStream.close();
                this.f61251g.append((CharSequence) f61246c);
                this.f61251g.flush();
                return;
            }
        }
    }

    public void a(File file) throws IOException {
        this.f61251g.flush();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(this.f61250f);
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[4096];
        while (true) {
            int i2 = fileInputStream.read(bArr);
            if (i2 != -1) {
                gZIPOutputStream.write(bArr, 0, i2);
            } else {
                gZIPOutputStream.finish();
                gZIPOutputStream.close();
                fileInputStream.close();
                this.f61251g.append((CharSequence) f61246c);
                this.f61251g.flush();
                return;
            }
        }
    }

    public void b(String str, String str2) {
        this.f61251g.append((CharSequence) str).append((CharSequence) ": ").append((CharSequence) str2).append((CharSequence) f61246c);
        this.f61251g.flush();
    }

    public List<String> a() throws IOException {
        Logger.d(f61245a, "finish started");
        ArrayList arrayList = new ArrayList();
        this.f61251g.append((CharSequence) f61246c).flush();
        this.f61251g.append((CharSequence) "--").append((CharSequence) this.f61247b).append((CharSequence) "--").append((CharSequence) f61246c);
        this.f61251g.close();
        int iB = this.f61248d.b();
        this.f61252h = iB;
        Logger.d(f61245a, "Response code = ", Integer.valueOf(iB));
        int i2 = this.f61252h;
        if (i2 < 200 || i2 >= 300) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f61248d.g()));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb.append(line);
                } else {
                    Logger.e(f61245a, "Error message: ", sb);
                    throw new IOException("Server returned non-OK status: " + this.f61252h);
                }
            }
        } else {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(this.f61248d.e()));
            while (true) {
                String line2 = bufferedReader2.readLine();
                if (line2 != null) {
                    arrayList.add(line2);
                } else {
                    bufferedReader2.close();
                    this.f61248d.d();
                    return arrayList;
                }
            }
        }
    }

    public int b() {
        return this.f61252h;
    }
}
